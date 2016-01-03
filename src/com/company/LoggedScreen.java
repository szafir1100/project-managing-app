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
    private JComboBox developerManagementTaskInputComboBox;
    private JComboBox developerManagementDeveloperInputComboBox;
    private JButton developerManagementDoneButton;
    private JButton addTaskButton;
    private JButton addTaskDoneButton;
    private JFormattedTextField addTaskInputTextField;
    private JButton deleteTaskButton;
    private JButton deleteTaskDoneButton;
    private JComboBox deleteTaskInputComboBox;
    private JPanel comboBoxAndUserInfoPanel;
    private JPanel projectInfoTeamInputPanel;
    private JLabel projectInfoTeamLabel;
    private JComboBox projectInfoTeamInputComboBox;
    private JPanel projectInfoProjectInputPanel;
    private JLabel projectInfoTaskLabel;
    private JComboBox projectInfoProjectInputComboBox;
    private JPanel projectInfoTaskInputPanel;
    private JLabel projectInfoProjectLabel;
    private JComboBox projectInfoTaskInputComboBox;
    private JPanel userInfoPanel;
    private JLabel usernameLabel;
    private JPanel taskStatusPanel;
    private JLabel chosenProjectLabel;
    private JPanel projectStatusDualLogWithScrollsPanel;
    private JList userLogList;
    private JList projectLogList;
    private JScrollBar userLogScrollBar;
    private JScrollBar projectLogScrollBar;
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
    private JButton addUserToTeamDoneButton;
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

    OnFrameStateChangeListener onFrameStateChangeListener;
    OnDatabaseActionListener onDatabaseActionListener;
    String mLoggedUsername;

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
            }
        });
        setTotalProjectWorktimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
                refreshUserPanelButtonState();
                setSetTotalProjectWorktimeInputAccess(true);
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
    }

    private void refreshData() {
        comboBoxesWithNoConditionColumnListInit(changeUserSettingsLoginComboBoxInput, "usertable", "username");
        comboBoxesWithNoConditionColumnListInit(deleteProjectComboBoxInput, "projecttable", "projectname");
        comboBoxesWithNoConditionColumnListInit(deleteTeamComboBoxInput, "teamtable", "teamname");
        comboBoxesWithNoConditionColumnListInit(deleteTaskInputComboBox, "tasktable", "taskname");


    }

    private void mainInitialize() {

        usernameLabel.setText("LOGGED AS: " + mLoggedUsername);

        if (projectInfoProjectInputComboBox.getSelectedItem() == null) {
            chosenProjectLabel.setText("NO PROJECT CHOSEN");
        }

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
        developerManagementTaskInputComboBox.setEnabled(isAccessible);
        developerManagementDeveloperInputComboBox.setEnabled(isAccessible);
        developerManagementDoneButton.setEnabled(isAccessible);
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
        addUserToTeamDoneButton.setEnabled(isAccessible);
    }
    private void setAssignTeamManagerToTeamInputAccess(boolean isAccessible) {
        assignTeamManagerToTeamTeamSelectionComboBoxInput.setEnabled(isAccessible);
        assignTeamManagerToTeamUserSelectionComboBoxInput.setEnabled(isAccessible);
        assignProjectToTeamDoneButton.setEnabled(isAccessible);
    }
}
