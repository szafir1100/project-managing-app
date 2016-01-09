package com.company;

import java.io.*;

/**
 * Created by tomek on 09.01.16.
 */
public class Logger {

    public Logger (String logType, String logMessage) {

    writeToLogTest(logType, logMessage);

    }

    /**
     * Writes log to .*txt file
     * @param logType type of log i.e. "SESSION", "TASK1", "PROJECT1"
     * @param logMessage
     */
    private void writeToLogTest(String logType, String logMessage) {

        String formattedLog = formatLog(logMessage);


        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(logType + ".txt"), "utf-8"))) {
            writer.write(formattedLog);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String formatLog(String message) {

        //todo kod formatujący

        return message;
    }

}
