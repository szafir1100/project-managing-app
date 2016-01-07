package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Tomasz Marzeion on 2015-12-07.
 * Class that contains components and their logic
 * required for screen after logging
 */
public class LoggedScreen {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane;
    private JPanel userPanel;
    private JPanel projectsPanel;
    private JButton logoutButton;
    private JComboBox teamInTaskTabComboBox;
    private JButton addWorktimeButton;
    private JButton worktimeDoneButton;
    private JSpinner worktimeSpinner;
    private JComboBox workTimeTaskInputComboBox;
    private JButton assignDeveloperButton;
    private JComboBox developerManagementDevInputComboBox;
    private JComboBox developerManagementTaskInputComboBox;
    private JButton assignDevToTaskDoneButton;
    private JButton addTaskButton;
    private JButton addTaskDoneButton;
    private JFormattedTextField addTaskInputTextField;
    private JButton deleteTaskButton;
    private JButton deleteTaskDoneButton;
    private JComboBox deleteTaskInputComboBox;
    private JPanel comboBoxAndUserInfoPanel;
    private JComboBox projectInfoProjectInputComboBox;
    private JPanel userInfoPanel;
    private JLabel usernameLabel;
    private JPanel taskStatusPanel;
    private JLabel chosenProjectLabel;
    private JPanel developerManagementPanel;
    private JPanel developerManagementAssignDeveloperButtonPanel;
    private JPanel developerManagementDualComboBoxAndDoneButtonPanel;
    private JPanel worktimePanel;
    private JPanel worktimeInputPanel;
    private JPanel worktimeSpinnerAndDoneButtonPanel;
    private JPanel worktimeTaskInputPanel;
    private JPanel worktimeButtonPanel;
    private JPanel addingAndDeletingTasksPanel;
    private JPanel addTaskTextFieldAndDonePanel;
    private JPanel deleteTaskPanel;
    private JPanel deleteTaskComboBoxAndDoneButton;
    private JPanel deleteTaskButtonPanel;
    private JPanel userAndProjectStatusPanel;
    private JPanel taskManagementInputPanel;
    private JButton addProjectButton;
    private JButton deleteProjectButton;
    private JTextField addProjectTextInput;
    private JButton addProjectDoneButton;
    private JButton deleteProjectDoneButton;
    private JButton setTotalProjectWorktimeButton;
    private JComboBox setTotalProjectWorktimeComboBox;
    private JSpinner setTotalProjectWorktimeSpinner;
    private JButton setTotalProjectWorktimeDoneButton;
    private JTextField addUserLoginTextInput;
    private JComboBox addUserAccesLvlComboBoxInput;
    private JButton addUserDoneButton;
    private JComboBox changeUserSettingsLoginComboBoxInput;
    private JPasswordField changeUserSettingsPasswordInput;
    private JCheckBox changeUserSettingsSetVisibleCheckBox;
    private JComboBox changeUserSettingsAccesLvlComboBoxInput;
    private JPanel setTotalProjectWorkTimePanel;
    private JPanel setTotalProjectWorktimeButtonPanel;
    private JPanel setTotalProjectWorkTimeInputPanel;
    private JPanel setTotalProjectWorktimeComboBoxPanel;
    private JPanel setTotalProjectWorktimeSpinnerAndDoneButtonPanel;
    private JPanel logsPanel;
    private JPanel adminPanelRightPanel;
    private JPanel adminPanelLogWrapper;
    private JPanel adminPanelUserManagementPanel;
    private JPanel projectManagementPanel;
    private JPanel projectManagementInputPanel;
    private JPanel addProjecPanel;
    private JPanel deleteProjectPanel;
    private JPanel addProjectButtonPanel;
    private JPanel addProjectInputPanel;
    private JPanel deleteProjectButtonPanel;
    private JPanel deleteProjectInputPanel;
    private JPanel teamManagementPanel;
    private JLabel teamManagementPanelLabel;
    private JLabel projectManagementLabel;
    private JButton addTeamButton;
    private JPanel teamManagementInputPanel;
    private JPanel addTeamPanel;
    private JPanel assignTeamManagerToTeamPanel;
    private JPanel addUserToTeamPanel;
    private JPanel deleteTeamPanel;
    private JPanel addTeamButtonPanel;
    private JPanel addTeamInputPanel;
    private JTextField addTeamTextInput;
    private JButton addTeamDoneButton;
    private JPanel assignTeamManagerToTeamButtonPanel;
    private JPanel assignTeamManagerToTeamInputPanel;
    private JPanel addUserToTeamButtonPanel;
    private JButton AssignDeveloperToTeamButton;
    private JPanel addUserToTeamInputPanel;
    private JPanel deleteTeamButtonPanel;
    private JButton deleteTeamButton;
    private JPanel deleteTeamInputPanel;
    private JButton deleteTeamDoneButton;
    private JButton removeUserFromTeamDoneButton;
    private JLabel adminPanelLogTitleLabel;
    private JPanel adminPanelLogPanel;
    private JScrollBar adminPanelLogScrollBar;
    private JList adminPanelLog;
    private JPanel addUserPanel;
    private JPanel userManagementLabelWrapper;
    private JLabel userManagementPanelLabel;
    private JPanel addUserButtonPanel;
    private JButton addUserButton;
    private JPanel addUserInputPanel;
    private JPanel addUserLoginInputPanel;
    private JLabel addUserLoginInputLabel;
    private JPanel addUserAccesLvlInputPanel;
    private JLabel addUserAccesLvlLabel;
    private JPanel addUserPasswordInputPanel;
    private JLabel addUserPasswordLabel;
    private JCheckBox addUserSetVisibleCheckBox;
    private JPasswordField addUserPasswordInput;
    private JPanel addUserDoneButtonPanel;
    private JPanel changeUserSettingsPanel;
    private JPanel changeUserSettingsButtonPanel;
    private JButton changeUserSettingsButton;
    private JPanel changeUserSettingsInputPanel;
    private JPanel changeUserSettingsDoneButtonPanel;
    private JPanel changeUserSettingsLoginInputPanel;
    private JLabel changeUserSettingsLoginLabel;
    private JPanel changeUserSettingsPasswordInputPanel;
    private JLabel changeUserSettingsPasswordLabel;
    private JPanel changeUserSettingsAccesLvlInputPanel;
    private JLabel changeUserSettingsAccesLvlLabel;
    private JButton changeUserSettingsDoneButton;
    private JComboBox addUserToTeamComboBoxInput;
    private JButton assignDevToTeamDoneButton;
    private JComboBox deleteProjectComboBoxInput;
    private JComboBox deleteTeamComboBoxInput;
    private JComboBox removeUserFromTeamComboBoxInput;
    private JComboBox assignTeamManagerToTeamUserSelectionComboBoxInput;
    private JComboBox assignTeamManagerToTeamTeamSelectionComboBoxInput;
    private JButton assignTeamManagerToTeamDoneButton;
    private JButton assignTeamManagerToTeamButton;
    private JButton refreshDataButton;
    private JCheckBox deleteUserCheckBox;
    private JButton debugDatabaseButton;
    private JComboBox assignDeveloperToTeamTeamComboBox;
    private JComboBox assignDeveloperToTeamDeveloperComboBox;
    private JButton assignProjectToTeamButton;
    private JComboBox assignProjectToTeamProjectComboBox;
    private JComboBox assignProjectToTeamTeamComboBox;
    private JButton assignProjectToTeamDoneButton;
    private JPanel assignProjectToTeamComboBoxInputPanel;
    private JPanel assignProjectToTeamComboBoxDoneButtonPanel;
    private JPanel assignProjectToTeamInputPanel;
    private JPanel assignProjectToTeamButtonPanel;
    private JPanel assignProjectToTeamPanel;
    private JProgressBar projectProgress;
    private JComboBox projectInfoProjectComboBox;
    private JComboBox projectInfoTaskComboBox;
    private JPanel projectLogPanel;
    private JList userLogList;
    private JScrollBar userLogScrollBar;
    private JLabel projectLogLabel;
    private JPanel taskLogPanel;
    private JList projectLogList;
    private JScrollBar projectLogScrollBar;
    private JLabel taskLogLabel;
    private JList sessionLogList;
    private JLabel sessionLogLabel;
    private JScrollBar sessionLogScrollBar;
    private JPanel sessionLogPanel;

    OnFrameStateChangeListener onFrameStateChangeListener;
    OnDatabaseActionListener onDatabaseActionListener;
    String mLoggedUsername;
    private String loggedUsernamePrivLvl;
    private String loggedUsernameTeam;

    public LoggedScreen(OnFrameStateChangeListener listener, OnDatabaseActionListener listener2, String loggedUsername) {

        onFrameStateChangeListener = listener;
        onDatabaseActionListener = listener2;

        mLoggedUsername = loggedUsername;

        mainInitialize();

        /**
         * Logout button listener
         * Changes Window FrameState.frameState
         * Uses OnFrameStateChangeListener to change frameState
         * OnFrameStateChangeListener listener is provided by Window class
        **/
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout(onFrameStateChangeListener);
            }
        });

        /**
         * Listeners for all manage buttons.
         * Sets all management input components in user tab to
         * disabled through refreshUserPanelButtonState() method
         * then enables chosen panel's input components through method
         **/
        // Listeners for  right-sided manage buttons on USER tab
        assignDeveloperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setDevAssignInputAccess(true);
            }
        });
        addWorktimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setAddWorktimeInputAccess(true);

                ArrayList<String> tasklist = onDatabaseActionListener.getArrayListOfTableColumnSet("tasktable", "taskname");

                for (int i = 0; i < tasklist.size(); i++) {

                    if (getSelectedTaskDeveloper(tasklist.get(i)).equals(mLoggedUsername)) {
                        workTimeTaskInputComboBox.addItem(tasklist.get(i));
                    }
                }
            }
        });
        setTotalProjectWorktimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setSetTotalProjectWorktimeInputAccess(true);

                ArrayList<String> projectList = onDatabaseActionListener.getArrayListOfTableColumnSet("projecttable", "projectname");

                for (int i = 0; i < projectList.size(); i++) {

                    if (getSelectedProjectTeam(projectList.get(i)).equals(getUserTeam())) {
                        setTotalProjectWorktimeComboBox.addItem(projectList.get(i));
                    }
                }
            }
        });
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setAddTaskInputAccess(true);
            }
        });
        deleteTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setDeleteTaskInputAccess(true);
            }
        });

        //Listeners for  right-sided manage buttons on ADMIN tab
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setAddUserInputAccess(true);
            }
        });
        changeUserSettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setChangeUserSettings(true);
            }
        });
        addProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setAddProjectInputAccess(true);
            }
        });
        deleteProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setDeleteProjectInputAccess(true);

            }
        });
        addTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setAddTeamInputAccess(true);
            }
        });
        deleteTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setDeleteTeamInputAccess(true);
            }
        });
        AssignDeveloperToTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setAssignUserToTeamInputAccess(true);
            }
        });
        assignTeamManagerToTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshAdminPanelButtonState();
                setAssignTeamManagerToTeamInputAccess(true);
            }
        });
        assignProjectToTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshData();
                refreshAdminPanelButtonState();
                setAssignProjectToTeamInputAccess(true);
            }
        });

        /**
         * Password checkboxes
         */
        addUserSetVisibleCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (addUserSetVisibleCheckBox.isSelected()) {
                    addUserPasswordInput.setEchoChar((char) 0);
                }
                else {
                    addUserPasswordInput.setEchoChar('*');
                }

            }
        });
        changeUserSettingsSetVisibleCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (changeUserSettingsSetVisibleCheckBox.isSelected()) {
                    changeUserSettingsPasswordInput.setEchoChar((char) 0);
                }
                else {
                    changeUserSettingsPasswordInput.setEchoChar('*');
                }
            }
        });

        /**
         * Choosing between changing user info or deleting it checkbox
         */
        deleteUserCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (deleteUserCheckBox.isSelected()) {
                    changeUserSettingsSetVisibleCheckBox.setEnabled(false);
                    changeUserSettingsPasswordInput.setEnabled(false);
                    changeUserSettingsAccesLvlComboBoxInput.setEnabled(false);
                }
                else {
                    changeUserSettingsSetVisibleCheckBox.setEnabled(true);
                    changeUserSettingsPasswordInput.setEnabled(true);
                    changeUserSettingsAccesLvlComboBoxInput.setEnabled(true);
                }
            }
        });

        /**
         * Button used for refreshing data visible on frame
         */
        refreshDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshData();
                refreshAdminPanelButtonState();
                refreshUserPanelButtonState();
            }
        });

        /**
         * Adding user and changing user information buttons on Admin Panel listeners
         */
        addUserDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addUser(onDatabaseActionListener);
            }
        });
        changeUserSettingsDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (changeUserSettingsLoginComboBoxInput.getSelectedItem() == null) {
                    System.out.println("NO USER CHOSEN");
                }
                else {
                    if (deleteUserCheckBox.isSelected()) {
                        deleteUser(onDatabaseActionListener);
                        comboBoxesWithNoConditionColumnListInit(changeUserSettingsLoginComboBoxInput, "usertable", "username");
                    }
                    else {
                        changeUserData(onDatabaseActionListener);
                        comboBoxesWithNoConditionColumnListInit(changeUserSettingsLoginComboBoxInput, "usertable", "username");
                    }
                }
            }
        });
        debugDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                onDatabaseActionListener.debugDatabaseWithAllItsComponents();
            }
        });
        addTaskDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addTaskInputTextField.getText().length()!=0) {
                    onDatabaseActionListener.addTask(addTaskInputTextField.getText());
                }
                else {
                    System.out.println("Error: Task name field is empty");
                }
            }
        });
        addTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addTeamTextInput.getText().length()!=0) {
                    onDatabaseActionListener.addTeam(addTeamTextInput.getText());
                }
                else {
                    System.out.println("Error: Team name field is empty");
                }
            }
        });
        addProjectDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addProjectTextInput.getText().length()!=0) {
                    onDatabaseActionListener.addProject(addProjectTextInput.getText());
                }
                else {
                    System.out.println("Error: Team name field is empty");
                }
            }
        });

        deleteTaskDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (deleteTaskInputComboBox.getSelectedItem() != null) {
                    onDatabaseActionListener.deleteTask(deleteTaskInputComboBox.getSelectedItem().toString());
                }
                else {
                    System.out.println("Error: You need to select task");
                }
                refreshData();
            }
        });

        deleteTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (deleteTeamComboBoxInput.getSelectedItem() != null) {
                    onDatabaseActionListener.deleteTeam(deleteTeamComboBoxInput.getSelectedItem().toString());
                }
                else {
                    System.out.println("Error: You need to select team");
                }
                refreshData();
            }
        });

        deleteProjectDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (deleteProjectComboBoxInput.getSelectedItem() != null) {
                    onDatabaseActionListener.deleteProject(deleteProjectComboBoxInput.getSelectedItem().toString());
                }
                else {
                    System.out.println("Error: You need to select project");
                }
                refreshData();
            }
        });

        assignDevToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignDeveloperToTeam();
            }
        });

        assignProjectToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignProjectToTeam();
            }
        });

        assignTeamManagerToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignTeamManagerToTeam();
            }
        });

        assignDevToTaskDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignDeveloperToTask();
            }
        });

        setTotalProjectWorktimeDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int spinnerValue = ((Integer) setTotalProjectWorktimeSpinner.getValue());
                setTotalProjectWorktime(spinnerValue, setTotalProjectWorktimeComboBox.getSelectedItem().toString());
            }
        });


        worktimeDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String selectedTaskName = workTimeTaskInputComboBox.getSelectedItem().toString();

                int selectedTaskTime = getSelectedTaskWorktime(selectedTaskName);
                int timeToAdd = ((Integer) worktimeSpinner.getValue());

                if (selectedTaskTime != -1) {
                    System.out.println("Time before update: " + selectedTaskTime);

                    onDatabaseActionListener.insertAssignData("tasktable", "tasktimecommited", String.valueOf(selectedTaskTime+timeToAdd), "taskname", selectedTaskName);

                    System.out.println("Added " + timeToAdd + " hours to " + selectedTaskName);
                    System.out.println(selectedTaskName + " time commited is now " + (selectedTaskTime+timeToAdd));
                  }
            }
        });

        projectInfoProjectComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshProjectInfo();
            }
        });

        projectInfoTaskComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshTaskInfo();
            }
        });

    }

    private void refreshData() {
        comboBoxesWithNoConditionColumnListInit(changeUserSettingsLoginComboBoxInput, "usertable", "username");
        comboBoxesWithNoConditionColumnListInit(deleteProjectComboBoxInput, "projecttable", "projectname");
        comboBoxesWithNoConditionColumnListInit(deleteTeamComboBoxInput, "teamtable", "teamname");
        comboBoxesWithNoConditionColumnListInit(deleteTaskInputComboBox, "tasktable", "taskname");

        comboBoxesWithConditionColumnListInit(developerManagementDevInputComboBox, "usertable", "username", "privilegelvl", "DEVELOPER");
        comboBoxesWithNoConditionColumnListInit(developerManagementTaskInputComboBox, "tasktable", "taskname");

        comboBoxesWithConditionColumnListInit(assignDeveloperToTeamDeveloperComboBox, "usertable", "username", "privilegelvl", "DEVELOPER");
        comboBoxesWithNoConditionColumnListInit(assignDeveloperToTeamTeamComboBox, "teamtable", "teamname");

        comboBoxesWithNoConditionColumnListInit(assignProjectToTeamProjectComboBox, "projecttable", "projectname");
        comboBoxesWithNoConditionColumnListInit(assignProjectToTeamTeamComboBox, "teamtable", "teamname");
        comboBoxesWithConditionColumnListInit(assignTeamManagerToTeamUserSelectionComboBoxInput, "usertable", "username", "privilegelvl", "TMANAGER");
        comboBoxesWithNoConditionColumnListInit(assignTeamManagerToTeamTeamSelectionComboBoxInput, "teamtable", "teamname");

        refreshProjectInfo();
        refreshTaskInfo();

        setTotalProjectWorktimeComboBox.removeAllItems();
        workTimeTaskInputComboBox.removeAllItems();
    }
    private void refreshProjectInfo() {

        if (projectInfoProjectComboBox.getSelectedItem() != null) {
            chosenProjectLabel.setText("SELECTED PROJECT: " + projectInfoProjectComboBox.getSelectedItem().toString());
        }
        else {
            chosenProjectLabel.setText("ACTUAL PROJECT: THERE IS NO PROJECT TO DISPLAY");
        }

        comboBoxesWithConditionColumnListInit(projectInfoProjectComboBox, "projecttable", "projectname", "projectteam", getUserTeam());
        comboBoxesWithConditionColumnListInit(projectInfoTaskComboBox, "tasktable", "taskname", "taskdeveloper", mLoggedUsername);


        //TODO Refresh logów

    }

    private void refreshTaskInfo() {

        //TODO Refresh logów

    }

    private void mainInitialize() {

        getUserPrivLvl();
        getUserTeam();

        usernameLabel.setText("LOGGED AS: " + mLoggedUsername);

        refreshData();
        userPrivilegesComboBoxInit();
    }
    private void userPrivilegesComboBoxInit() {
        String admin = "ADMIN";
        String tmanager = "TMANAGER";
        String dev = "DEVELOPER";


        addUserAccesLvlComboBoxInput.addItem(dev);
        addUserAccesLvlComboBoxInput.addItem(tmanager);
        addUserAccesLvlComboBoxInput.addItem(admin);

        changeUserSettingsAccesLvlComboBoxInput.addItem(dev);
        changeUserSettingsAccesLvlComboBoxInput.addItem(tmanager);
        changeUserSettingsAccesLvlComboBoxInput.addItem(admin);
    }

    private void comboBoxesWithConditionColumnListInit(JComboBox comboBox, String table, String selectingColumn, String conditionColumn, String conditionValue) {
        comboBox.removeAllItems();

        ArrayList<String> arrayList = onDatabaseActionListener.getArrayListOfTableColumnSetWithCondition
                (table, selectingColumn, conditionColumn, conditionValue);

        for (int i = 0; i < arrayList.size(); i++) {
            comboBox.addItem(arrayList.get(i));
        }
    }


    /**
     * used to fill comboBoxes with one specified table's column data
     * @param comboBox comboBox to fill
     * @param table name of table
     * @param column name of column
     */
    private void comboBoxesWithNoConditionColumnListInit(JComboBox comboBox, String table, String column) {

        comboBox.removeAllItems();

        ArrayList<String> userList = onDatabaseActionListener.getArrayListOfTableColumnSet(table, column);

        for (int i = 0; i < userList.size(); i++) {
            comboBox.addItem(userList.get(i));
        }
    }

    /**
     * Adding user method
     */
    private void addUser(OnDatabaseActionListener listener) {

        String newUsername = addUserLoginTextInput.getText();

        if (newUsername.equals("test")) {
            System.out.println("'test' is used for connection testing, pick another username");
        }
        else if (newUsername.length() > 15) {
            System.out.println("Username is too long");
        }
        else {
            char[] pass = addUserPasswordInput.getPassword();
            Object privLevel = addUserAccesLvlComboBoxInput.getSelectedItem();

            boolean isUsernameWrong = false;
            boolean isPasswordWrong = false;
            boolean isAccesLvlWrong = false;


            if (newUsername.length() == 0) {
                isUsernameWrong = true;
            }

            if (pass.length == 0 || pass.length >=25) {
                isPasswordWrong = true;
            }

            if (newUsername.contains(" ")) {
                isUsernameWrong = true;
            }
            for (int x = 0; x < pass.length; x++) {
                if (pass[x] == ' ') {
                    isPasswordWrong = true;
                }
            }

            if (privLevel == null) {
                isAccesLvlWrong = true;
            }

            if (!isUsernameWrong && !isPasswordWrong && !isAccesLvlWrong) {
                System.out.println("##############");
                System.out.println("New user info is correct");
                System.out.println("Attempting to add new user to database...");

                if (listener.addUserActionPerformed(newUsername, pass, privLevel.toString())) {
                    System.out.println("User " + newUsername + " had been added to database");
                }
                else {
                    System.out.println("Failed to add user to database");
                }
                System.out.println("##############");
            }
            else {
                System.out.println("##############");
                System.out.println("ERROR! Incorrect username or password:");
                System.out.println("USERNAME: " + newUsername);
                System.out.println("PASS: " + new String(pass));
                System.out.println("ACCESS LEVEL: " + String.valueOf(privLevel));
                System.out.println("##############");
            }
        }
    }

    /**
     * Changing user data and deleting user methods  //TODO ##################################################
     */
    private void changeUserData(OnDatabaseActionListener listener) {
        boolean isPasswordOK = true;

        String username = changeUserSettingsLoginComboBoxInput.getSelectedItem().toString();
        char[] pass = changeUserSettingsPasswordInput.getPassword();
        String privLvl = changeUserSettingsAccesLvlComboBoxInput.getSelectedItem().toString();

        for (int x = 0; x < pass.length; x++) {
            if (pass[x] == ' ') {
                isPasswordOK = false;
            }
        }
        if (pass.length >= 25) {
            System.out.println("Password is too long!");
            isPasswordOK = false;
        }

        if (isPasswordOK) {
            if (onDatabaseActionListener.changeUserData(username, pass, privLvl)) {
                System.out.println("Changes has been successfully applied");
            }
            else {
                System.out.println("ERROR: Changes aren't applied");
            }
        }
        else {
            System.out.println("You can't use spaces in password!");
        }



    }
    private void deleteUser(OnDatabaseActionListener listener) {

        String usernameToDelete = changeUserSettingsLoginComboBoxInput.getSelectedItem().toString();
        System.out.println("################");

        System.out.println("DELETING USER...");

        if (listener.deleteUserActionPerformed(usernameToDelete)) {
            System.out.println("USER " + usernameToDelete + " DELETED!");
        }
        else {
            System.out.println("FAILED TO DELETE USER");
        }
        System.out.println("################");
    }

    /**
     * Method used to change Window.FrameState
     * sets FrameState to FrameState.LOGIN through listener
     * @param listener provided by Window class that implements OnFrameStateChangeListener interface
     */
    private void logout(OnFrameStateChangeListener listener) {
        listener.frameStateChanged(Window.FrameState.LOGIN, "NO_USER", "NO_PASS");
    }

    /**
     * method used by Window class' JFrame object to setContentPane()
     * @return JPanel that contains all of this class' components
     */
    public JPanel getContent() {
        return rootPanel;
    }

    /**
     * Method that sets all input panels components disabled
     */
    private void refreshUserPanelButtonState() {
        setDevAssignInputAccess(false);
        setAddWorktimeInputAccess(false);
        setAddTaskInputAccess(false);
        setDeleteTaskInputAccess(false);
        setSetTotalProjectWorktimeInputAccess(false);
    }
    private void refreshAdminPanelButtonState() {
        setAddUserInputAccess(false);
        setChangeUserSettings(false);
        setAddProjectInputAccess(false);
        setDeleteProjectInputAccess(false);
        setAddTeamInputAccess(false);
        setDeleteTeamInputAccess(false);
        setAssignUserToTeamInputAccess(false);
        setAssignTeamManagerToTeamInputAccess(false);
        setAssignProjectToTeamInputAccess(false);
    }

    /**
     * Methods that are used to set accessibility of specified panel input components
     * @param isAccessible the state of accessibility of specified panel input components
     */
    // for User Panel
    private void setDevAssignInputAccess(boolean isAccessible) {
        developerManagementDevInputComboBox.setEnabled(isAccessible);
        developerManagementTaskInputComboBox.setEnabled(isAccessible);
        assignDevToTaskDoneButton.setEnabled(isAccessible);
    }
    private void setAddWorktimeInputAccess(boolean isAccessible) {
        workTimeTaskInputComboBox.setEnabled(isAccessible);
        worktimeSpinner.setEnabled(isAccessible);
        worktimeDoneButton.setEnabled(isAccessible);

    }
    private void setAddTaskInputAccess(boolean isAccessible) {
        addTaskInputTextField.setEnabled(isAccessible);
        addTaskDoneButton.setEnabled(isAccessible);
    }
    private void setDeleteTaskInputAccess(boolean isAccessible) {
        deleteTaskInputComboBox.setEnabled(isAccessible);
        deleteTaskDoneButton.setEnabled(isAccessible);
    }
    private void setSetTotalProjectWorktimeInputAccess(boolean isAccessible) {
        setTotalProjectWorktimeComboBox.setEnabled(isAccessible);
        setTotalProjectWorktimeSpinner.setEnabled(isAccessible);
        setTotalProjectWorktimeDoneButton.setEnabled(isAccessible);
    }

    // for Admin Panel
    private void setAddUserInputAccess(boolean isAccessible) {
        addUserLoginTextInput.setEnabled(isAccessible);
        addUserPasswordInput.setEnabled(isAccessible);
        addUserSetVisibleCheckBox.setEnabled(isAccessible);
        addUserAccesLvlComboBoxInput.setEnabled(isAccessible);
        addUserDoneButton.setEnabled(isAccessible);
    }
    private void setChangeUserSettings(boolean isAccessible) {
        changeUserSettingsLoginComboBoxInput.setEnabled(isAccessible);
        changeUserSettingsDoneButton.setEnabled(isAccessible);
        deleteUserCheckBox.setEnabled(isAccessible);

        if (deleteUserCheckBox.isSelected()) {
            changeUserSettingsSetVisibleCheckBox.setEnabled(false);
            changeUserSettingsPasswordInput.setEnabled(false);
            changeUserSettingsAccesLvlComboBoxInput.setEnabled(false);
        }
        else {
            changeUserSettingsSetVisibleCheckBox.setEnabled(isAccessible);
            changeUserSettingsPasswordInput.setEnabled(isAccessible);
            changeUserSettingsAccesLvlComboBoxInput.setEnabled(isAccessible);
        }
    }
    private void setAddProjectInputAccess(boolean isAccessible) {
        addProjectTextInput.setEnabled(isAccessible);
        addProjectDoneButton.setEnabled(isAccessible);
    }
    private void setDeleteProjectInputAccess(boolean isAccesible) {
        deleteProjectComboBoxInput.setEnabled(isAccesible);
        deleteProjectDoneButton.setEnabled(isAccesible);
    }
    private void setAssignProjectToTeamInputAccess(boolean isAccesible) {
        assignProjectToTeamProjectComboBox.setEnabled(isAccesible);
        assignProjectToTeamTeamComboBox.setEnabled(isAccesible);
        assignProjectToTeamDoneButton.setEnabled(isAccesible);
    }
    private void setAddTeamInputAccess(boolean isAccessible) {
        addTeamTextInput.setEnabled(isAccessible);
        addTeamDoneButton.setEnabled(isAccessible);
    }
    private void setDeleteTeamInputAccess(boolean isAccessible) {
        deleteTeamComboBoxInput.setEnabled(isAccessible);
        deleteTeamDoneButton.setEnabled(isAccessible);
    }
    private void setAssignUserToTeamInputAccess(boolean isAccessible) {
        assignDeveloperToTeamDeveloperComboBox.setEnabled(isAccessible);
        assignDeveloperToTeamTeamComboBox.setEnabled(isAccessible);
        assignDevToTeamDoneButton.setEnabled(isAccessible);
    }
    private void setAssignTeamManagerToTeamInputAccess(boolean isAccessible) {
        assignTeamManagerToTeamTeamSelectionComboBoxInput.setEnabled(isAccessible);
        assignTeamManagerToTeamUserSelectionComboBoxInput.setEnabled(isAccessible);
        assignTeamManagerToTeamDoneButton.setEnabled(isAccessible);
    }


    private void assignDeveloperToTeam() {

        if(onDatabaseActionListener.insertAssignData("usertable", "teammember",
                assignDeveloperToTeamTeamComboBox.getSelectedItem().toString(),"username",
                assignDeveloperToTeamDeveloperComboBox.getSelectedItem().toString())) {

            System.out.println("DEV ASSIGNED TO TEAM");
        }
        else {
            System.out.println("FAIL TO ASSIGN DEV TO TEAM");
        }
    }
    private void assignProjectToTeam() {

        if (onDatabaseActionListener.insertAssignData("projecttable", "projectteam",
                assignProjectToTeamTeamComboBox.getSelectedItem().toString(), "projectname",
                assignProjectToTeamProjectComboBox.getSelectedItem().toString())) {

            System.out.println("PROJECT ASSIGNED TO TEAM");
        }
        else {
            System.out.println("FAIL TO ASSIGN PROJECT TO TEAM");
        }

    }

    private void assignTeamManagerToTeam() {
        if(onDatabaseActionListener.insertAssignData("usertable", "teammember",
                assignTeamManagerToTeamTeamSelectionComboBoxInput.getSelectedItem().toString(),"username",
                assignTeamManagerToTeamUserSelectionComboBoxInput.getSelectedItem().toString())) {

            System.out.println("TMANAGER ASSIGNED TO TEAM");
        }
        else {
            System.out.println("FAIL TO ASSIGN TMANAGER TO TEAM");
        }
    }

    private void assignDeveloperToTask() {
        if(onDatabaseActionListener.insertAssignData("tasktable", "taskdeveloper",
                developerManagementDevInputComboBox.getSelectedItem().toString(),"taskname",
                developerManagementTaskInputComboBox.getSelectedItem().toString())) {

            System.out.println("TASK ASSIGNED TO DEV");
        }
        else {
            System.out.println("FAIL TO ASSIGN TASK TO DEV");
        }
    }

    private String getUserPrivLvl() {
        String result = onDatabaseActionListener.getSingleDataWithCondition("usertable","privilegelvl","username",mLoggedUsername);

        if (result != null) {
            return result;
        }
        else {
            return "ERROR!!!";
        }
    }

    private String getUserTeam() {
        String result = onDatabaseActionListener.getSingleDataWithCondition("usertable","teammember","username",mLoggedUsername);

        if (result != null) {
            return result;
        }
        else {
            return "ERROR!!!";
        }
    }

    private String getSelectedProjectTeam(String projectname) {
        String result = onDatabaseActionListener.getSingleDataWithCondition("projecttable", "projectteam", "projectname", projectname);
        if (result != null) {
            return result;
        }
        else {
            return "ERROR!!!";
        }
    }

    private String getSelectedTaskDeveloper(String taskname) {
        String result = onDatabaseActionListener.getSingleDataWithCondition("tasktable", "taskdeveloper", "taskname", taskname);
        if (result != null) {
            return result;
        }
        else {
            return "ERROR!!!";
        }
    }

    private int getSelectedTaskWorktime(String taskname) {
        String result = onDatabaseActionListener.getSingleDataWithCondition("tasktable", "tasktimecommited", "taskname", taskname);
        if (result != null) {
            return Integer.parseInt(result);
        }
        else {
            System.out.println("ERROR");
            return -1;
        }
    }

    private void setTotalProjectWorktime(int spinnerValue, String projectname) {

        if (spinnerValue >= 0 & onDatabaseActionListener.insertAssignData("projecttable", "projecttotaleta", String.valueOf(spinnerValue), "projectname", projectname)) {
            System.out.println("Project " + projectname + " worktime is set to " +spinnerValue);
        }
        else {
            System.out.println("failed to set data");
            if (spinnerValue < 0) {
                System.out.println("Project time cant be less than 0");
            }
        }
    }


}
