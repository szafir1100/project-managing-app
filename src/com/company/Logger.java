package com.company;

import com.sun.istack.internal.Interned;
import com.sun.istack.internal.Nullable;

import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by tomek on 09.01.16.
 */
public class Logger {

    private static final String LOG_FILE_PATH = "logs.txt";
    private static final String TASK_LOG_TAG = "T";
    private static final String PROJECT_LOG_TAG = "P";
    private static final String APP_LOG_TAG = "A";
    private static final String ADMIN_LOG_TAG = "X";

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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, isThereLogFile(LOG_FILE_PATH)))) {
            writer.write(formattedLog);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logProjectAction(String projectName, String logMessage) {
        String formattedLog = formatLog(PROJECT_LOG_TAG, projectName, logMessage);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, isThereLogFile(LOG_FILE_PATH)))) {
            writer.write(formattedLog);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logApplicationAction(String logMessage) {
        String formattedLog = formatLog(APP_LOG_TAG, null, logMessage);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, isThereLogFile(LOG_FILE_PATH)))) {
            writer.write(formattedLog);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logAdminAction(String logMessage) {
        String formattedLog = formatLog(ADMIN_LOG_TAG, null, logMessage);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, isThereLogFile(LOG_FILE_PATH)))) {
            writer.write(formattedLog);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isThereLogFile(String filePath) {
        File f = new File(filePath);
        return f.exists() && !f.isDirectory();
    }

    private String formatLog(String symbol, @Nullable String name, String message) {

        String result = "";

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
        Date date = Calendar.getInstance().getTime();
        String reportDate = df.format(date);

        result += reportDate + ";" + symbol + ";" + name + "; -> " + message;
        System.out.println(message);
        return result;
    }

    /**
     * @param logTag A,X,P,T
     * @return ListModel for logs content setting
     */
    public ListModel<String> getLogListModel(String logTag) {
        File file = new File(LOG_FILE_PATH);
        DefaultListModel<String> listModel = new DefaultListModel();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.substring(line.indexOf(";") + 1,line.indexOf(";") + 2).equals(logTag)) {
                    listModel.addElement(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listModel;
    }

}