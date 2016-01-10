package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
    private JList sessionLogList;
    private JButton writeToLogButton;
    private JTextField writeToLogLogMessageTextField;
    private JTextField writeToLogLogTypeTextField;
    private JPanel sessionLogPanel;
    private JLabel sessionLogLabel;
    private JScrollPane sessionLogScrollPane;
    private JPanel projectLogPanel;
    private JLabel projectLogLabel;
    private JList projectLogList;
    private JPanel taskLogPanel;
    private JLabel taskLogLabel;
    private JList taskLogList;
    private JScrollPane projectLogScrollPane;
    private JScrollPane taskLogScrollPane;
    private JList overallLog;
    private JButton sortByTypeButton;
    private JButton sortByDateButton;
    private JComboBox sortByDateMonthComboBox;
    private JButton applyDateSortButton;
    private JButton applyTaskSortButton;
    private JButton applyProjectSortButton;
    private JComboBox sortByDateDayComboBox;
    private JComboBox sortByTaskComboBox;
    private JComboBox sortByProjectComboBox;

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
                refreshData();
            }
        });
        changeUserSettingsDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (changeUserSettingsLoginComboBoxInput.getSelectedItem() == null) {
                    Logger.getInstance().logApplicationAction("ERROR: No user selected. Failed to change user data. USER: " + mLoggedUsername);
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
                refreshData();
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
                    Logger.getInstance().logApplicationAction("ERROR: Task name field is empty. Failed to add task. USER: " + mLoggedUsername);
                }
                refreshData();
            }
        });
        addTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addTeamTextInput.getText().length()!=0) {
                    onDatabaseActionListener.addTeam(addTeamTextInput.getText());
                }
                else {
                    Logger.getInstance().logApplicationAction("ERROR: Team name field is empty. Failed to add team. USER: " + mLoggedUsername);
                }
                refreshData();
            }
        });
        addProjectDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addProjectTextInput.getText().length()!=0) {
                    onDatabaseActionListener.addProject(addProjectTextInput.getText());
                }
                else {
                    Logger.getInstance().logApplicationAction("ERROR: Project name field is empty. Failed to add project. USER: " + mLoggedUsername);
                }
                refreshData();
            }
        });

        deleteTaskDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (deleteTaskInputComboBox.getSelectedItem() != null) {
                    onDatabaseActionListener.deleteTask(deleteTaskInputComboBox.getSelectedItem().toString());
                }
                else {
                    Logger.getInstance().logApplicationAction("ERROR: No task selected. Failed to delete task. USER: " + mLoggedUsername);
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
                    Logger.getInstance().logApplicationAction("ERROR: No team selected. Failed to delete team. USER: " + mLoggedUsername);
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
                    Logger.getInstance().logApplicationAction("ERROR: No project selected. Failed to delete project. USER: " + mLoggedUsername);
                }
                refreshData();
            }
        });

        assignDevToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignDeveloperToTeam();
                refreshData();
            }
        });

        assignProjectToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignProjectToTeam();
                refreshData();
            }
        });

        assignTeamManagerToTeamDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignTeamManagerToTeam();
                refreshData();
            }
        });

        assignDevToTaskDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                assignDeveloperToTask();
                refreshData();
            }
        });

        setTotalProjectWorktimeDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int spinnerValue = ((Integer) setTotalProjectWorktimeSpinner.getValue());
                setTotalProjectWorktime(spinnerValue, setTotalProjectWorktimeComboBox.getSelectedItem().toString());
                refreshData();
            }
        });


        worktimeDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String selectedTaskName = workTimeTaskInputComboBox.getSelectedItem().toString();

                int selectedTaskTime = getSelectedTaskWorktime(selectedTaskName);
                int timeToAdd = ((Integer) worktimeSpinner.getValue());

                if (selectedTaskTime != -1) {
                    if (onDatabaseActionListener.insertAssignData("tasktable", "tasktimecommited", String.valueOf(selectedTaskTime+timeToAdd), "taskname", selectedTaskName)) {
                        Logger.getInstance().logTaskAction(selectedTaskName,"User " + mLoggedUsername + " commited " + timeToAdd + " hours to task "
                                + selectedTaskName + ". Total task time commited is now " + selectedTaskTime + timeToAdd);
                    }
                  }
                refreshData();
            }
        });

        projectInfoProjectComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                projectLogUpdate();
                refreshProjectInfo();
            }
        });

        projectInfoTaskComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taskLogUpdate();
            }
        });
        sortByTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                overallLogUpdatebyType();
            }
        });

        sortByDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                overallLogUpdate();
            }
        });
        applyDateSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sortOverallLogBySpecificDate();
            }
        });
        applyTaskSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sortOverallLogByTask();
            }
        });
        applyProjectSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sortOverallLogByProject();
            }
        });
    }

    private void sortOverallLogBySpecificDate() {
        ListModel<String> wholeLog = Logger.getInstance().getLogListModel("ALL");
        String month = sortByDateMonthComboBox.getSelectedItem().toString();
        String day = sortByDateDayComboBox.getSelectedItem().toString();
        DefaultListModel<String> result = new DefaultListModel();

        for (int x = 0; x < wholeLog.getSize(); x++) {
            String line = wholeLog.getElementAt(x);
            if (line.substring(0,2).equals(month) && line.substring(3,5).equals(day)) {
                result.addElement(line);
            }
        }
        overallLog.setModel(result);
    }

    private void sortOverallLogByTask() {

        ListModel<String> wholeLog = Logger.getInstance().getLogListModel("ALL");
        String task = sortByTaskComboBox.getSelectedItem().toString();
        DefaultListModel<String> result = new DefaultListModel();

        if (task != null) {
            for (int x = 0; x < wholeLog.getSize(); x++) {
                String line = wholeLog.getElementAt(x);
                if (line.substring(line.indexOf(";")+3,line.indexOf(";")+3+task.length()).equals(task)) {
                    result.addElement(line);
                }
            }
        }
        overallLog.setModel(result);
    }

    private void sortOverallLogByProject() {

        ListModel<String> wholeLog = Logger.getInstance().getLogListModel("ALL");
        String project = sortByProjectComboBox.getSelectedItem().toString();
        DefaultListModel<String> result = new DefaultListModel();

        if (project != null) {
            for (int x = 0; x < wholeLog.getSize(); x++) {
                String line = wholeLog.getElementAt(x);
                if (line.substring(line.indexOf(";")+3,line.indexOf(";")+3+project.length()).equals(project)) {
                    result.addElement(line);
                }
            }
        }
        overallLog.setModel(result);
    }

    private void refreshData() {
        refreshUserPanelButtonState();
        refreshAdminPanelButtonState();

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

        comboBoxesWithConditionColumnListInit(projectInfoProjectComboBox, "projecttable", "projectname", "projectteam", getUserTeam());
        comboBoxesWithConditionColumnListInit(projectInfoTaskComboBox, "tasktable", "taskname", "taskdeveloper", mLoggedUsername);

        logTabComboBoxesInit();

        refreshProjectInfo();

        projectLogUpdate();
        taskLogUpdate();
        appLogUpdate();
        adminLogUpdate();

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




        //TODO Refresh logów

    }
    private void overallLogUpdate() {
        overallLog.setModel(Logger.getInstance().getLogListModel("ALL"));
    }

    private void overallLogUpdatebyType() {
        ListModel<String> projectListP = Logger.getInstance().getLogListModel("P");
        ListModel<String> projectListT = Logger.getInstance().getLogListModel("T");
        ListModel<String> projectListA = Logger.getInstance().getLogListModel("A");
        ListModel<String> projectListX = Logger.getInstance().getLogListModel("X");

        DefaultListModel<String> mergeList = new DefaultListModel<String>();

        for (int x = 0; x < projectListP.getSize(); x++) {
            mergeList.addElement(projectListP.getElementAt(x));
        }
        for (int x = 0; x < projectListT.getSize(); x++) {
            mergeList.addElement(projectListT.getElementAt(x));
        }
        for (int x = 0; x < projectListA.getSize(); x++) {
            mergeList.addElement(projectListA.getElementAt(x));
        }
        for (int x = 0; x < projectListX.getSize(); x++) {
            mergeList.addElement(projectListX.getElementAt(x));
        }

        overallLog.setModel(mergeList);
    }

    private void projectLogUpdate() {

        if (projectInfoProjectComboBox.getSelectedItem()!=null) {
            ListModel<String> projectList = Logger.getInstance().getLogListModel("P");
            DefaultListModel<String> specifiedProjectList = new DefaultListModel<>();
            String selectedProject = projectInfoProjectComboBox.getSelectedItem().toString();

            for (int x = 0;x < projectList.getSize(); x++) {

                String line = projectList.getElementAt(x);

                if (line.substring(line.indexOf(";")+3, line.indexOf(";")+selectedProject.length()+3).contains(selectedProject)) {
                    specifiedProjectList.addElement(line);
                }
            }
            projectLogList.setModel(specifiedProjectList);
        }
        else {
            projectLogList.setModel(new DefaultListModel());
        }
    }

    private void taskLogUpdate() {

        if (projectInfoTaskComboBox.getSelectedItem()!=null) {
            ListModel<String> taskList = Logger.getInstance().getLogListModel("T");
            DefaultListModel<String> specifiedTaskList = new DefaultListModel<>();
            String selectedTask = projectInfoTaskComboBox.getSelectedItem().toString();

            for (int x = 0;x < taskList.getSize(); x++) {

                String line = taskList.getElementAt(x);

                if (line.substring(line.indexOf(";")+3, line.indexOf(";")+selectedTask.length()+3).contains(selectedTask)) {
                    specifiedTaskList.addElement(line);
                }
            }
            taskLogList.setModel(specifiedTaskList);
        }
        else {
            taskLogList.setModel(new DefaultListModel());
        }
    }

    private void logTabComboBoxesInit() {

        sortByDateDayComboBox.removeAllItems();
        sortByDateMonthComboBox.removeAllItems();
        sortByTaskComboBox.removeAllItems();
        sortByProjectComboBox.removeAllItems();


        for (int x = 1; x <= 12; x++) {
            if (x < 10) {
                sortByDateMonthComboBox.addItem("0" + String.valueOf(x));
            }
            else {
                sortByDateMonthComboBox.addItem(String.valueOf(x));
            }
        }

        for (int x = 1; x <= 31; x++) {
            if (x < 10) {
                sortByDateDayComboBox.addItem("0" + String.valueOf(x));
            }
            else {
                sortByDateDayComboBox.addItem(String.valueOf(x));
            }
        }

        DateFormat monthFormat = new SimpleDateFormat("MM");
        Date monthDate = Calendar.getInstance().getTime();
        String reportMonth = monthFormat.format(monthDate);

        DateFormat dayFormat = new SimpleDateFormat("dd");
        Date dayDate = Calendar.getInstance().getTime();
        String reportDay = dayFormat.format(dayDate);

        String month = reportMonth;
        String day = reportDay;

        sortByDateDayComboBox.setSelectedIndex(Integer.parseInt(day)-1);
        sortByDateMonthComboBox.setSelectedIndex(Integer.parseInt(month)-1);

        comboBoxesWithNoConditionColumnListInit(sortByTaskComboBox, "tasktable", "taskname");
        comboBoxesWithNoConditionColumnListInit(sortByProjectComboBox, "projecttable", "projectname");
    }

    private void mainInitialize() {
        logTabComboBoxesInit();

        setAccesToPanelsDependingByAccesLvl();

        usernameLabel.setText("LOGGED AS: " + mLoggedUsername);

        refreshData();
        userPrivilegesComboBoxInit();

        overallLogUpdate();


    }

    private void setAccesToPanelsDependingByAccesLvl() {

        if (getUserPrivLvl().equals("TMANAGER")) {
            tabbedPane.setEnabledAt(1, false);
            tabbedPane.setEnabledAt(2, false);
        }
        else if (getUserPrivLvl().equals("DEVELOPER")) {

            projectInfoProjectComboBox.setEnabled(false);
            assignDeveloperButton.setEnabled(false);
            setTotalProjectWorktimeButton.setEnabled(false);
            addTaskButton.setEnabled(false);
            deleteTaskButton.setEnabled(false);
            projectLogList.setEnabled(false);
            projectLogList.setVisible(false);

            tabbedPane.setEnabledAt(1, false);
            tabbedPane.setEnabledAt(2, false);
        }
        else if (!getUserPrivLvl().equals("ADMIN") || !mLoggedUsername.equals("debug")) {
            projectInfoProjectComboBox.setEnabled(false);
            assignDeveloperButton.setEnabled(false);
            setTotalProjectWorktimeButton.setEnabled(false);
            addTaskButton.setEnabled(false);
            deleteTaskButton.setEnabled(false);
            projectLogList.setEnabled(false);
            projectLogList.setVisible(false);
            projectInfoTaskComboBox.setEnabled(false);
            addWorktimeButton.setEnabled(false);

            tabbedPane.setEnabledAt(1, false);
            tabbedPane.setEnabledAt(2, false);
        }
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

    private void appLogUpdate() {
        sessionLogList.setModel(Logger.getInstance().getLogListModel("A"));
    }
    private void adminLogUpdate() {
        adminPanelLog.setModel(Logger.getInstance().getLogListModel("X"));
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
            Logger.getInstance().logAdminAction("ERROR: Cannot username can't be 'test'");
        }
        else if (newUsername.length() > 15) {
            Logger.getInstance().logAdminAction("ERROR: Username is too long");
        }
        else {
            char[] pass = addUserPasswordInput.getPassword();
            Object privLevel = addUserAccesLvlComboBoxInput.getSelectedItem();

            boolean isUsernameWrong = false;
            boolean isPasswordWrong = false;
            boolean isAccesLvlWrong = false;


            if (newUsername.length() == 0) {
                isUsernameWrong = true;
                Logger.getInstance().logAdminAction("ERROR: Password is too short. Failed to add user");
            }

            if (pass.length == 0 || pass.length >=25) {
                isPasswordWrong = true;
                Logger.getInstance().logAdminAction("ERROR: Incorrect password. Failed to add user");
            }

            if (newUsername.contains(" ")) {
                isUsernameWrong = true;
                Logger.getInstance().logAdminAction("ERROR: Username can't have spaces. Failed to add user");
            }
            for (int x = 0; x < pass.length; x++) {
                if (pass[x] == ' ') {
                    isPasswordWrong = true;
                    Logger.getInstance().logAdminAction("ERROR: Password can't have spaces. Failed to add user");
                }
            }

            if (privLevel == null) {
                isAccesLvlWrong = true;
                Logger.getInstance().logAdminAction("ERROR: No Privilege level chosen. Failed to add user");
            }

            if (!isUsernameWrong && !isPasswordWrong && !isAccesLvlWrong) {
                Logger.getInstance().logAdminAction("ADDING USER: User info is correct");

                if (listener.addUserActionPerformed(newUsername, pass, privLevel.toString())) {
                    Logger.getInstance().logAdminAction("ADDING USER: User: " + newUsername + " has been added to database");
                }
                else {
                    Logger.getInstance().logAdminAction("ERROR: Failed to add user to database");
                }
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
                Logger.getInstance().logAdminAction("ERROR: No spaces allowed in password. Failed to change user data");
                isPasswordOK = false;
            }
        }
        if (pass.length >= 25) {
            Logger.getInstance().logAdminAction("ERROR: Password is too long. Failed to change user data");
            isPasswordOK = false;
        }

        if (isPasswordOK) {
            if (onDatabaseActionListener.changeUserData(username, pass, privLvl)) {
                Logger.getInstance().logAdminAction("CHANGE USER DATA: Changes are successfully applied");
            } else {
                Logger.getInstance().logAdminAction("ERROR: User changes aren't applied");
            }
        }
    }
    private void deleteUser(OnDatabaseActionListener listener) {

        String usernameToDelete = changeUserSettingsLoginComboBoxInput.getSelectedItem().toString();

        Logger.getInstance().logAdminAction("Trying to delete user...");

        if (listener.deleteUserActionPerformed(usernameToDelete)) {
            Logger.getInstance().logAdminAction("User " + usernameToDelete + " deleted!");
        }
        else {
            Logger.getInstance().logAdminAction("ERROR: Failed to delete user");
        }
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

            Logger.getInstance().logAdminAction("Developer " + assignDeveloperToTeamDeveloperComboBox.getSelectedItem().toString()
                    + " is assigned to team " + assignDeveloperToTeamDeveloperComboBox.getSelectedItem().toString());
        }
        else {
            Logger.getInstance().logAdminAction("ERROR: Failed to assign developer to team");
        }
    }
    private void assignProjectToTeam() {

        if (onDatabaseActionListener.insertAssignData("projecttable", "projectteam",
                assignProjectToTeamTeamComboBox.getSelectedItem().toString(), "projectname",
                assignProjectToTeamProjectComboBox.getSelectedItem().toString())) {

            Logger.getInstance().logProjectAction(assignProjectToTeamProjectComboBox.getSelectedItem().toString(),
                    "Project " + assignProjectToTeamProjectComboBox.getSelectedItem().toString()
                    + " is assigned to team " + assignProjectToTeamTeamComboBox.getSelectedItem().toString());
        }
        else {
            Logger.getInstance().logAdminAction("ERROR: Failed to assign project to team");
        }

    }

    private void assignTeamManagerToTeam() {
        if(onDatabaseActionListener.insertAssignData("usertable", "teammember",
                assignTeamManagerToTeamTeamSelectionComboBoxInput.getSelectedItem().toString(),"username",
                assignTeamManagerToTeamUserSelectionComboBoxInput.getSelectedItem().toString())) {

            Logger.getInstance().logAdminAction("Team manager " + assignTeamManagerToTeamUserSelectionComboBoxInput.getSelectedItem().toString()
                    + " is assigned to team " + assignTeamManagerToTeamTeamSelectionComboBoxInput.getSelectedItem().toString());
        }
        else {
            Logger.getInstance().logAdminAction("ERROR: Failed to assign team manager to team");
        }
    }

    private void assignDeveloperToTask() {
        if(onDatabaseActionListener.insertAssignData("tasktable", "taskdeveloper",
                developerManagementDevInputComboBox.getSelectedItem().toString(),"taskname",
                developerManagementTaskInputComboBox.getSelectedItem().toString())) {

            Logger.getInstance().logTaskAction(developerManagementTaskInputComboBox.getSelectedItem().toString()
                    ,"Task " + developerManagementTaskInputComboBox.getSelectedItem().toString()
                    + " is assigned to developer " + developerManagementDevInputComboBox.getSelectedItem().toString());
        }
        else {
            Logger.getInstance().logApplicationAction("ERROR: Failed to assign developer to task");
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
            Logger.getInstance().logTaskAction(taskname,"ERROR: Failed to select task worktime");
            return -1;
        }
    }

    private void setTotalProjectWorktime(int spinnerValue, String projectname) {

        if (spinnerValue >= 0 & onDatabaseActionListener.insertAssignData("projecttable", "projecttotaleta", String.valueOf(spinnerValue), "projectname", projectname)) {
            Logger.getInstance().logProjectAction(projectname, "Project " + projectname + " total time is set to " + spinnerValue);
        }
        else {
            Logger.getInstance().logProjectAction(projectname, "ERROR: Failed to set project total time");
            if (spinnerValue < 0) {
                Logger.getInstance().logProjectAction(projectname, "ERROR: Project time cant be less than 0");
            }
        }
    }
}
