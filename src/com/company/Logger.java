package com.company;

import com.sun.istack.internal.Nullable;

import java.io.*;

/**
 * Created by tomek on 09.01.16.
 */
public class Logger {

    private static final String LOG_FILE_PATH = "logs.txt";
    private static final String TASK_LOG_TAG = "T";
    private static final String PROJECT_LOG_TAG = "P";
    private static final String APP_LOG_TAG = "A";

    private static Logger singleton;

    public Logger() {
    }

    public static Logger getInstance() {
        if (singleton == null) {
            singleton = new Logger();
        }
        return singleton;
    }

    public void logTaskAction(String taskName, String logMessage) {
        String formattedLog = formatLog(TASK_LOG_TAG, taskName, logMessage);
        System.out.println(formattedLog);
        writeToLogTest(formattedLog);
    }

    public void logProjectAction(String projectName, String logMessage) {
        String formattedLog = formatLog(PROJECT_LOG_TAG, projectName, logMessage);
        System.out.println(formattedLog);
        writeToLogTest(formattedLog);
    }

    public void logApplicationAction(String logMessage) {
        String formattedLog = formatLog(APP_LOG_TAG, null, logMessage);
        System.out.println(formattedLog);
        writeToLogTest(formattedLog);
    }

    /**
     * Writes log to .*txt file
     * @param logMessage
     */
    private void writeToLogTest(String logMessage) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, isThereLogFile(LOG_FILE_PATH)))) {
            writer.write(logMessage);
            writer.newLine();
            writer.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isThereLogFile(String filePath) {
        File f = new File(filePath);
        return f.exists() && !f.isDirectory();
    }

    private String formatLog(String symbol, @Nullable String name, String message) {

        //todo kod formatujący

        return message;
    }

}