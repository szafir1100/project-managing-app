package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements OnFrameStateChangeListener {






    private DatabaseManager networkManager;
    public enum FrameState {LOGIN, LOGGED}
    private FrameState mFrameState;
    private String mLoggedUsername;
    private String mLoggedPassword;

    public Window () {
        super("Project Managing Application");
        mFrameState = FrameState.LOGIN;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(1000,600);
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);

        networkManager = new DatabaseManager();
    }

    public void framework() {
        switch (mFrameState) {
            case LOGIN:
                newFrameInit();
                break;
            case LOGGED:
                newFrameInit();
                break;
        }
    }
    private void newFrameInit() {
        JPanel rootPanelToAdd;

        if (mFrameState == FrameState.LOGGED) {
            LoggedScreen adminScreen = new LoggedScreen(this, this.networkManager, mLoggedUsername);
            rootPanelToAdd = adminScreen.getContent();
        }
        else {
            LoginScreen loginScreen = new LoginScreen(this, this.networkManager); //todo rzutowanie na listenera
            rootPanelToAdd = loginScreen.getContent();
        }
        this.getContentPane().removeAll();
        this.setContentPane(rootPanelToAdd);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }
    @Override
    public void frameStateChanged(FrameState frameState, String loggedUsername, String loggedPassword) {
        mFrameState = frameState;
        mLoggedUsername = loggedUsername;
        mLoggedPassword = loggedPassword;
        framework();
    }





    public static void main(String[] args) {
        Window window = new Window();
        window.framework();
    }
}