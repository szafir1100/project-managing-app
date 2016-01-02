package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Tomek on 2015-12-07.
 */
public class LoginScreen{

    private JPanel rootPanel;
    private JPanel logoPanel;
    private JPanel loginDataPanel;
    private JFormattedTextField usernameInputField;
    private JPasswordField passwordInputField;
    private JPanel usernameDataInputPanel;
    private JPanel passwordDataInputPanel;
    private JButton loginButton;
    private JLabel usernameTextLabel;
    private JLabel passwordTextLabel;
    private JPanel loginWrapper;
    private JLabel loginTitleLabel;
    private JLabel serverStatusLabel;
    private JLabel wrongDataLabel;
    private JButton refreshStatusButton;
    private JLabel userStatusLabel;
    private JLabel teamStatusLabel;
    private JLabel projectStatusLabel;
    private JLabel taskStatusLabel;
    private JLabel userTableStatusLabel;
    private JLabel teamTableStatusLabel;
    private JLabel projectTableStatusLabel;
    private JLabel taskTableStatusLabel;
    private JPanel refButtonPanel;
    private JPanel projectstatuspanel;
    private JPanel teamStatusPanel;
    private JPanel userStatusPanel;
    private JPanel taskStatusPanel;
    private JPanel databaseStatusWrapper;
    private JPanel loginButtonPanel;
    private JPanel loginAndServerStatusWrapper;
    private JLabel databaseStatusLabel;
    private JLabel serverStatusTitle;
    private JLabel databaseStatusTitle;
    private OnFrameStateChangeListener onFrameStateChangeListener;
    private OnDatabaseActionListener onDatabaseActionListener;

    private boolean isServerStatusOK;
    private boolean isTableStatusOK;
    private boolean isDatabaseStatusOK;


    public LoginScreen(OnFrameStateChangeListener listener1, OnDatabaseActionListener listener2) {
        onFrameStateChangeListener = listener1;
        onDatabaseActionListener = listener2;

        fullStatusRefresh();

        /**
         * KeyListener for password field
         * calls login() method when enter is pressed
         */
        passwordInputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login(usernameInputField.getText(), passwordInputField.getPassword());
                }

            }
        });

        /**
         * ActionListener for login button
         * calls login() method when pressed
         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullStatusRefresh();
                login(usernameInputField.getText(), passwordInputField.getPassword());
            }
        });

        /**
         * ActionListener for status check
         */
        refreshStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fullStatusRefresh();
            }
        });
    }


    private void fullStatusRefresh() {
        checkServerStatus();
        checkDatabaseStatus();
        checkAllTableStatus(onDatabaseActionListener);
        setLoginButtonAvailability();
    }

    private void checkServerStatus() {
        char[] test = {'t', 'e', 's', 't'};

        if (onDatabaseActionListener.loginAttemptPerformed("test", test)) {
            serverStatusLabel.setForeground(Color.green);
            serverStatusLabel.setText("Connection Succes");
            isServerStatusOK = true;
        }
        else {
            serverStatusLabel.setForeground(Color.red);
            serverStatusLabel.setText("Connection Failed");
            isServerStatusOK = false;
        }
    }
    private void checkDatabaseStatus() {
        String databaseName = "projectmanagingdatabase";
        if (onDatabaseActionListener.isThereDatabase(databaseName)) {
            databaseStatusLabel.setForeground(Color.green);
            databaseStatusLabel.setText("OK");
            isDatabaseStatusOK = true;
        }
        else {
            databaseStatusLabel.setForeground(Color.red);
            databaseStatusLabel.setText("ERROR");
            isDatabaseStatusOK = false;
        }
    }
    private void checkAllTableStatus(OnDatabaseActionListener listener) {

        boolean isOk = true;

        if (!manageTableStatusDisplay(listener.isThereTable("usertable"), userTableStatusLabel)) {
            isOk = false;
        }
        if (!manageTableStatusDisplay(listener.isThereTable("teamtable"), teamTableStatusLabel)) {
            isOk = false;
        }
        if (!manageTableStatusDisplay(listener.isThereTable("projecttable"), projectTableStatusLabel)) {
            isOk = false;
        }
        if (!manageTableStatusDisplay(listener.isThereTable("tasktable"), taskTableStatusLabel)) {
            isOk = false;
        }

        if (isOk) {
            isTableStatusOK = true;
        }
        else {
            isTableStatusOK = false;
        }

    }
    private boolean manageTableStatusDisplay(boolean status, JLabel labelToChange) {

        if (status) {
            labelToChange.setText("OK");
            labelToChange.setForeground(Color.green);
            return true;
        }
        else {
            labelToChange.setText("ERROR");
            labelToChange.setForeground(Color.red);
            return false;
        }
    }


    /**
     * Method used to check if user is ready for login attempt
     * @return boolean value of login preparing status (true - done)
     */
    private boolean checkLoginPreparingStatus() {
        return (isServerStatusOK && isDatabaseStatusOK && isTableStatusOK);
    }

    /**
     * Check if login button can be available
     * if server is down, login button will be disabled
     */
    private void setLoginButtonAvailability() {
        if (checkLoginPreparingStatus()) {
            loginButton.setEnabled(true);
        }
        else {
            loginButton.setEnabled(false);
        }
    }

    /**
     * method used by Window class' JFrame object to setContentPane()
     * @return JPanel that contains all of this class' components
     */
    public JPanel getContent() {
        return rootPanel;
    }

    /**
     * Method that connect user to MySQL database
     * @param username
     * @param password
     */
    private void login(String username, char[] password) {


        //If server connection is OK, its possible to log to "root" account to make "debug database" process
        if (checkLoginPreparingStatus() || username.equals("root")) {
            if (onDatabaseActionListener.loginAttemptPerformed(username, password)) {
                String stringPass = new String(password);
                onFrameStateChangeListener.frameStateChanged(Window.FrameState.LOGGED, username, stringPass);
            }
            else {
                wrongDataLabel.setText("WRONG USERNAME OR PASSWORD");
            }
        }
        else {
            System.out.println("SERVER OR DATABASE ISN'T CONNECTED");
        }
    }
}
