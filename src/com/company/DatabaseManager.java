package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.rmi.runtime.Log;

import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by tomek on 13.12.15.
 */
public class DatabaseManager implements OnDatabaseActionListener {


    private static Connection actualConnection;
    /**
     * Connection method
     * @param login
     * @param pass
     * @return Connection object
     */
    public static Connection getConnection(String login, String pass) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = login;
            String password = pass;
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            Logger.getInstance().logApplicationAction(login + " Connected");
            actualConnection = conn;
            return conn;
        } catch (ClassNotFoundException e) {
            Logger.getInstance().logApplicationAction("Connection Failed");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            Logger.getInstance().logApplicationAction("Connection Failed");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Checks if there is specific data is contained in table
     * for example checking for "USER" named "User1"
     * @param dataSetArray To specify data set to check. That array is return value of getArrayListDataColumnSet.
     * @param valueToCheck To specify value of specifed data kind, for example: user1, project3, project2 etc.
     * @return boolean value of existing of specified data and value.
     */
    public boolean isThatDataUnique(ArrayList dataSetArray, String valueToCheck) {

        for (int x = 0; x < dataSetArray.size(); x++) {
            if (dataSetArray.get(x).toString().equals(valueToCheck)) {
                return false;
            }
        }
        return true;
    }



    @Override
    public ArrayList<String> getArrayListOfTableColumnSet(String table, String column) {

        ArrayList result = new ArrayList();

        try {
            useDatabase();

            PreparedStatement statement = actualConnection.prepareStatement("SELECT "+ column +" FROM " + table);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                result.add(resultSet.getString(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logApplicationAction("ERROR: Failed  to select " + column + " data from " + table);
        }
        return result;
    }

    private boolean isLoginInfoCorrect(String username, char[] pass) {

        ArrayList result = new ArrayList();

        try {
            useDatabase();

            PreparedStatement statement = actualConnection.prepareStatement("SELECT ID FROM usertable" +
                    " WHERE username = '" + username + "' AND password = '" + new String(pass) + "'");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                result.add(resultSet.getString("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logApplicationAction("ERROR: Failed to select data from database");
        }

        if (result.size()==0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean loginAttemptPerformed(String username, char[] pass) {

        if (username.equals("test") && new String(pass).equals("test")) {
            return ((getConnection("test","test")!=null));
        }

        boolean isLoginInfoCorrect = isLoginInfoCorrect(username, pass);

        if (isLoginInfoCorrect) {
            getConnection("user","user");
        }

        return isLoginInfoCorrect;
    }

    @Override
    public boolean addUserActionPerformed(String username, char[] pass, String accesLvl) {

        String table = "usertable";
        String column = "username";
        ArrayList<String> columnData = getArrayListOfTableColumnSet(table, column);


        if (columnData.size() == 0 || isThatDataUnique(columnData, username)) {
            String password = new String(pass);

            useDatabase();

            String statementTable = "INSERT INTO usertable (username, password, privilegelvl) " +
                    "VALUES ('" + username + "', '" + password +"', '" + accesLvl + "')";


            try {
                PreparedStatement addUserToTableStatement = actualConnection.prepareStatement(statementTable);
                addUserToTableStatement.executeUpdate();
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        else {
            Logger.getInstance().logAdminAction("ERROR: User " + username + " exists on table. Failed to add user to table " + table);
            return false;
        }
    }

    @Override
    public boolean deleteUserActionPerformed(String username) {

        String table = "usertable";
        String column = "username";

        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from " + table + " where "+ column + "='" + username + "'");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("User " + username + " has been deleted from table " + table);
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logApplicationAction("ERROR: Failed  to delete user " + username);
            return false;
        }
    }



    @Override
    public void addProject(String projectname) {

        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO projecttable (projectname) " +
                    "VALUES ('" + projectname + "')");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Project " + projectname + " is added to database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to add project");
        }
    }
    @Override
    public void addTask(String taskname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO tasktable (taskname) " +
                    "VALUES ('" + taskname + "')");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Task " + taskname + " is added to database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to add task");
        }
    }
    @Override
    public void addTeam(String teamname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO teamtable (teamname) " +
                    "VALUES ('" + teamname + "')");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Team " + teamname + " is added to database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to add team");
        }
    }

    @Override
    public void deleteProject(String projectname) {

        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from projecttable where projectname='" + projectname + "'");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Project " + projectname + " is deleted from database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to delete project");
        }
    }
    @Override
    public void deleteTask(String taskname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from tasktable where taskname='" + taskname + "'");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Task " + taskname + " is deleted from database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to delete task");
        }
    }
    @Override
    public void deleteTeam(String teamname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from teamtable where teamname='" + teamname + "'");
            statement.executeUpdate();
            Logger.getInstance().logAdminAction("Team " + teamname + " is deleted from database");
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getInstance().logAdminAction("ERROR: Failed to delete team");
        }
    }

    @Override
    public boolean changeUserData(String username, char[] password, String privlvl) {

        try {
            String pass = new String(password);

            useDatabase();

            if (password.length != 0) {

                PreparedStatement statement2 = actualConnection.prepareStatement("UPDATE usertable SET " +
                        "privilegelvl = '"+ privlvl +"',\n" +
                        "password = '" + pass + "'" +
                        "WHERE USERNAME = '"+ username +"'");
                statement2.executeUpdate();
            }
            else {
                PreparedStatement statement2 = actualConnection.prepareStatement("UPDATE usertable SET " +
                        "privilegelvl = '" + privlvl + "'" +
                        "WHERE USERNAME = '"+ username +"'");
                statement2.executeUpdate();
            }
            Logger.getInstance().logAdminAction("Updated user " + username + "privilege and password");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("ERROR: Failed to change user data");
            return false;
        }
    }

    @Override
    public boolean insertAssignData(String pasteTable, String pasteColumn, String pasteData, String conditionColumn,
                             String conditionData) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("UPDATE " + pasteTable + " SET " +
                    pasteColumn + " = '" + pasteData+ "'" +
                    "WHERE " + conditionColumn + " = '" + conditionData + "'");
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean isThereTable(String tableName) {

        try {
            useDatabase();

            PreparedStatement statement2 = actualConnection.prepareStatement("DESCRIBE " + tableName);
            statement2.executeUpdate();
            Logger.getInstance().logApplicationAction("Table named " + tableName + " OK");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logApplicationAction("ERROR: Table named " + tableName + " doesn't exist");
            return false;
        }
    }

    @Override
    public boolean isThereDatabase(String databaseName) {
        if (useDatabase()) {
            Logger.getInstance().logApplicationAction("Database OK");
            return true;
        }
        else {
            Logger.getInstance().logApplicationAction("No database present");
            return false;
        }
    }

    @Override
    public void debugDatabaseWithAllItsComponents() {
        repairDatabase();
        repairTeamTable();
        repairUserTable();
        repairTaskTable();
        repairProjectTable();
    }

    @Override
    public ArrayList<String> getArrayListOfTableColumnSetWithCondition(String table, String selectingColumn, String conditionColumn, String conditionValue) {

        useDatabase();

        ArrayList<String> result = new ArrayList<>();

        try {
            PreparedStatement statement = actualConnection.prepareStatement("SELECT "+ selectingColumn +
                    " FROM " + table + " WHERE "+ conditionColumn +"='" + conditionValue + "'");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                result.add(resultSet.getString(selectingColumn));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String getSingleDataWithCondition(String table, String selectingColumn, String conditionColumn, String conditionValue) {

        useDatabase();

        String result = null;

        try {
            PreparedStatement statement = actualConnection.prepareStatement("SELECT "+ selectingColumn +
                    " FROM " + table + " WHERE "+ conditionColumn +"='" + conditionValue + "'");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                result = resultSet.getString(selectingColumn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    private boolean useDatabase() {

        try {
            PreparedStatement statement1 = actualConnection.prepareStatement("USE projectmanagingdatabase");
            statement1.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logApplicationAction("Error:Failed to use database");
            return false;
        }
    }

    /**
     * Methods that are used in debugDatabaseWithAllItsComponents method
     * @return success of repairing specified element of database
     */
    private boolean repairDatabase() {

        try {
            PreparedStatement statement1 = actualConnection.prepareStatement("CREATE DATABASE projectmanagingdatabase");
            statement1.executeUpdate();

            PreparedStatement statement2 = actualConnection.prepareStatement("USE projectmanagingdatabase");
            statement2.executeUpdate();

            Logger.getInstance().logAdminAction("Database debugged");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("WARNING: Database debugging error or database is already present");
            return false;
        }
    }
    private boolean repairUserTable() {

        try {
            PreparedStatement statement = actualConnection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS usertable " +
                    "(id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, \n" +
                    "username VARCHAR(255),\n" +
                    "password VARCHAR(255),\n" +
                    "privilegelvl VARCHAR(255),\n" +
                    "teammember VARCHAR(255))");
            statement.executeUpdate();

            Logger.getInstance().logAdminAction("Usertable debugged");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("ERROR: Usertable debugging error");
            return false;
        }

    }
    private boolean repairProjectTable() {
        try {
            PreparedStatement statement = actualConnection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS projecttable " +
                            "(id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, \n" +
                            "projectname VARCHAR(255),\n" +
                            "projectteam VARCHAR(255),\n" +
                            "projecttotaleta INT(255))"); // JAVA NIE PIERDOL
            statement.executeUpdate();

            Logger.getInstance().logAdminAction("Projecttable debugged");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("ERROR: Projecttable debugging error");
            return false;
        }
    }
    private boolean repairTeamTable() {

        try {
            PreparedStatement statement = actualConnection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS teamtable " +
                            "(id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
                            "teamname VARCHAR(255),\n" +
                            "teammanager VARCHAR(255))");
            statement.executeUpdate();

            Logger.getInstance().logAdminAction("Teamtable debugged");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("ERROR: Teamtable debugging error");
            return false;
        }

    }
    private boolean repairTaskTable() {
        try {
            PreparedStatement statement = actualConnection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS tasktable (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, \n" +
                            "taskname VARCHAR(255),\n" +
                            "taskdeveloper VARCHAR(255),\n" +
                            "taskproject VARCHAR(255),\n" +
                            "tasktimecommited INT(255) DEFAULT '0')");
            statement.executeUpdate();

            Logger.getInstance().logAdminAction("Tasktable debugged");
            return true;
        }
        catch (SQLException e) {
            Logger.getInstance().logAdminAction("ERROR: Tasktable debugging error");
            return false;
        }
    }
}
