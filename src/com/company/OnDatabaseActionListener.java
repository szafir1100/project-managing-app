package com.company;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

/**
 * Created by tomek on 13.12.15.
 */
public interface OnDatabaseActionListener {

    /**
     * Interface for logging from LoginScreen class
     * @param username
     * @param pass
     * @return connection success
     */
    boolean loginAttemptPerformed(String username, char[] pass);

    /**
     * Method used to get ArrayList of single column data;
     * @param table which table is used to data selecting, in example: usertable, projecttable
     * @param column To specify kind of data to check, for example: USER, PROJECT, TASK.
     * @return ArrayList of all specified column's data (Starting from smallest ID)
     */
    ArrayList<String> getArrayListOfTableColumnSet(String table, String column);


    //TODO Uniwersalne???
    /**
     * Method used to get ArrayList of users with specified privilege level
     * @param table name of table for example "usertable"
     * @param selectingColumn name of column to select data from for example "users"
     * @param conditionColumn name of column to select condition data from, for example "privilegelvl"
     * @param conditionValue value of condition, for example "DEVELOPER";
     * @return ArrayList of objects that met criteria of condition, for example for arguments: usertable, username, privilegelvl, DEVELOPER -> Return ArrayList of all developer names
     */
    ArrayList<String> getArrayListOfTableColumnSetWithCondition(String table, String selectingColumn, String conditionColumn, String conditionValue);

    /**
     * Method used to acces single data with condition i.e. accesing logged user's privilege lvl etc.
     * Similar to getArrayListOfTableColumnSetWithCondition method, but returns String instead of ArrayList of Strings
     * @param table name of table to get data from i.e. "usertable"
     * @param selectingColumn name of column to select data from i.e. "privlegelvl"
     * @param conditionValue single data of selecting column to get his conditionColumn data from i.e. "TMANAGER1"
     * @param conditionColumn name of column to get data from i.e. "username"
     * @return String representation of data, returns null if there is no such data.
     */
    String getSingleDataWithCondition(String table, String selectingColumn, String conditionColumn, String conditionValue);
    /**
     * Adds user to MySQL server and table
     * @param username username of User
     * @param pass password of User defined in char[] array
     * @param accesLvl String representation of acces level: "DEVELOPER", "TEAM MANAGER", "ADMIN"
     * @return boolean describing success of adding data
     */
    boolean addUserActionPerformed(String username, char[] pass, String accesLvl);

    /**
     * Deletes user from MySQL server and table
     * @param username username of User to delete
     * @return boolean description of success of deleting user
     */
    boolean deleteUserActionPerformed(String username);

    /**
     * Methods used to add tasks, projects and teams
     */
    void addProject(String projectname);
    void addTask(String taskname);
    void addTeam(String teamname);

    /**
     * Methods used to delete tasks, projects and teams
     */
    void deleteProject(String projectname);
    void deleteTask(String taskname);
    void deleteTeam(String teamname);


    /**
     * Method used to change user password and privilege level
     * @param username username to modify
     * @param password new password
     * @param privilegeLvl
     * @return success of changing data
     */
    boolean changeUserData(String username, char[] password, String privilegeLvl);

    /**
     * Method used for copying specific data to table with condition
     * usable at assign users to tasks etc.
     * params' examples points for Assigning developer to team functions
     * @param pasteTable name of table to paste data to i.e. usertable
     * @param pasteColumn name of column to paste data to i.e teammember
     * @param pasteData String representation of data to paste i.e TEAM1
     * @param conditionColumn name of condition column i.e. username
     * @param conditionData String representation of condition data i.e DEV1
     */
    boolean insertAssignData(String pasteTable, String pasteColumn, String pasteData, String conditionColumn,
                                           String conditionData);

    /**
     * Methods used to check database's tables' status on login screen
     * @param tableName name of table to check for
     * @return is it or isn't, LOL
     */
    boolean isThereTable(String tableName);


    /**
     * Method used to check for existence of specified database
     * @param databaseName name of database to check for
     * @return ... srsly
     */
    boolean isThereDatabase(String databaseName);

    /**
     * Method used for debugging database and its tables
     * @return success of debugging
     */
    void debugDatabaseWithAllItsComponents();

    /**
     * Method used to get specified user's privilege level
     * @param username
     * @return String representation of privilege level
     */
}
