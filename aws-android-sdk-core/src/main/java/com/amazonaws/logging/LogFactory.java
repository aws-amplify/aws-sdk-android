package com.amazonaws.logging;

public class LogFactory {
    private static Log log;

    public static synchronized Log getLog(Class clazz) {
        if (log == null) {
            log = new AndroidLog(clazz.getSimpleName());
        }
        return log;
    }

    public static synchronized Log getLog(final String string) {
        if (log == null) {
            log = new AndroidLog(string);
        }
        return log;
    }
}
