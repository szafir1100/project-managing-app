package com.company;

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
            System.out.println(login + " Connected");
            actualConnection = conn;
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            System.out.println("Wrong username or password");
           // e.printStackTrace();
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

    /**
     * Methods used to add or delete user from MySQL server
     * @param username username
     * @param pass password described as char[] array
     * @return success of adding user
     */
    private boolean addUserToMySQLServer(String username, char[] pass) {

        String password = new String(pass);

        String statementDatabase = "CREATE USER '"+ username +"'@'localhost' IDENTIFIED BY '" + password + "'";
        String statementPrivileges = "GRANT ALL PRIVILEGES ON * . * TO '"+ username +"'@'localhost';";

        try {
            System.out.println("Trying to add user to MySQL server...");

            PreparedStatement addUserToMySQLServerStatement = actualConnection.prepareStatement(statementDatabase);
            addUserToMySQLServerStatement.executeUpdate();
            System.out.println("User added to MySQL server...");

            System.out.println("Granting privileges...");
            PreparedStatement privilegesStatement = actualConnection.prepareStatement(statementPrivileges);
            privilegesStatement.executeUpdate();
            PreparedStatement flush = actualConnection.prepareStatement("FLUSH PRIVILEGES");
            flush.executeUpdate();
            System.out.println("Privileges granted...");
            return true;
        } catch (SQLException e) {
            System.out.println("USER " + username + " PROBABLY EXISTS IN MYSQL SERVER");
            return false;
        }
    }
    private boolean deleteUserFromMySQLServer(String username) {

        try {
            PreparedStatement statement = actualConnection.prepareStatement("DROP USER '" + username +"'@'localhost'");
            statement.executeUpdate();
            System.out.println("USER " + username + " DELETED FROM MYSQL SERVER");
            return true;
        } catch (SQLException e) {
            System.out.println("FAILED TO DELETE USER FROM MYSQL SERVER");
            e.printStackTrace();
            return false;
        }
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
            System.out.println("ERROR: FAILED TO SELECT DATA");
        }
        return result;
    }

    @Override
    public boolean loginAttemptPerformed(String username, char[] pass) {
        String passString = new String(pass);
        return (getConnection(username,passString) != null);
    }

    @Override
    public boolean addUserActionPerformed(String username, char[] pass, String accesLvl) {

        String table = "usertable";
        String column = "username";
        ArrayList<String> columnData = getArrayListOfTableColumnSet(table, column);


        if (columnData.size() == 0 || isThatDataUnique(columnData, username)) {
            String password = new String(pass);

            useDatabase();
            System.out.println("Selected Database to modify...");


            String statementTable = "INSERT INTO usertable (username, password, privilegelvl) " +
                    "VALUES ('" + username + "', '" + password +"', '" + accesLvl + "')";

            if(!addUserToMySQLServer(username, pass)) {
                System.out.println("Adding user to " + table + "aborted");
                return false;
            }

            try {
                PreparedStatement addUserToTableStatement = actualConnection.prepareStatement(statementTable);
                addUserToTableStatement.executeUpdate();
                System.out.println("User added to Table...");
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        else {
            System.out.println("User named " + username + " exists on table!");
            return false;
        }
    }

    @Override
    public boolean deleteUserActionPerformed(String username) {

        String table = "usertable";
        String column = "username";

        if (deleteUserFromMySQLServer(username)) {
            try {
                System.out.println("DELETING USER FROM TABLE...");
                PreparedStatement statement = actualConnection.prepareStatement("DELETE from " + table + " where "+ column + "='" + username + "'");
                statement.executeUpdate();
                System.out.println("USER " + username + " IS DELETED FROM TABLE " + table);
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("FAILED TO DELETE USER");
                return false;
            }
        }
        else {
            System.out.println("DELETING USER ABORTED");
            return false;
        }
    }



    @Override
    public void addProject(String projectname) {

        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO projecttable (projectname) " +
                    "VALUES ('" + projectname + "')");
            statement.executeUpdate();
            System.out.println("Project added");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to add project");
        }
    }
    @Override
    public void addTask(String taskname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO tasktable (taskname) " +
                    "VALUES ('" + taskname + "')");
            statement.executeUpdate();
            System.out.println("Task added");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to add task");
        }
    }
    @Override
    public void addTeam(String teamname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("INSERT INTO teamtable (teamname) " +
                    "VALUES ('" + teamname + "')");
            statement.executeUpdate();
            System.out.println("Team added");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to add team");
        }
    }

    @Override
    public void deleteProject(String projectname) {

        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from projecttable where projectname='" + projectname + "'");
            statement.executeUpdate();
            System.out.println("Project "+ projectname +" deleted");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete project");
        }
    }
    @Override
    public void deleteTask(String taskname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from tasktable where taskname='" + taskname + "'");
            statement.executeUpdate();
            System.out.println("Task "+ taskname +" deleted");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete task");
        }
    }
    @Override
    public void deleteTeam(String teamname) {
        try {
            PreparedStatement statement = actualConnection.prepareStatement("DELETE from teamtable where teamname='" + teamname + "'");
            statement.executeUpdate();
            System.out.println("Team "+ teamname +" deleted");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete team");
        }
    }

    @Override
    public boolean changeUserData(String username, char[] password, String privlvl) {

        try {
            String pass = new String(password);

            useDatabase();

            if (password.length != 0) {
                PreparedStatement passmysqlStatement = actualConnection.prepareStatement("SET PASSWORD FOR '"+ username +"'@'localhost' = PASSWORD('"+ pass +"')");
                passmysqlStatement.executeUpdate();
                System.out.println("MySQL Password changed");

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
            System.out.println(username + "'s privilege level is " + privlvl);
            System.out.println(username + "'s password is changed");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Failed to change user data");
            return false;
        }
    }

    @Override
    public boolean isThereTable(String tableName) {

        try {
            useDatabase();

            PreparedStatement statement2 = actualConnection.prepareStatement("DESCRIBE " + tableName);
            statement2.executeUpdate();
            System.out.println("Table named " + tableName + " OK");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Table named " + tableName + " doesn't exist");
            return false;
        }
    }

    @Override
    public boolean isThereDatabase(String databaseName) {
        if (useDatabase()) {
            System.out.println("Database OK");
            return true;
        }
        else {
            System.out.println("No database present");
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
        return null;
    }

    private boolean useDatabase() {

        try {
            PreparedStatement statement1 = actualConnection.prepareStatement("USE projectmanagingdatabase");
            statement1.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            System.out.println("Failed to use database");
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

            System.out.println("Database debugged");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Database debugging error");
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

            System.out.println("Usertable debugged");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Usertable debugging error");
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

            System.out.println("Projecttable debugged");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Projecttable debugging error");
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

            System.out.println("Teamtable debugged");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Teamtable debugging error");
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
                            "tasktimecommited INT(255))");
            statement.executeUpdate();

            System.out.println("Tasktable debugged");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Tasktable debugging error");
            return false;
        }
    }
}
