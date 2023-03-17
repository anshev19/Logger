package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private static int logCount;

    private Logger() {
    }

    public static Logger getLogger() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        logCount++;
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy HH:mm:ss");
        String dateTime = format.format(date.getTime());
        System.out.println("[" + dateTime + " " + logCount + "]" + " " + msg);
    }
}
