/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.logging;

import java.util.Map;
import java.util.HashMap;

/**
 * LogFactory mimics the {@code org.apache.commons.logging.LogFactory}
 * for backwards compatibility.
 */
public class LogFactory {

    /**
     * NOTE : Any changes to rename this class should ensure that this log tag is no longer than 23.
     * Log tag longer than 23 will cause it to break on Android API level <= 23.
     */
    private static final String TAG = LogFactory.class.getSimpleName();
    private static final String APACHE_COMMONS_LOGGING_LOGFACTORY = "org.apache.commons.logging.LogFactory";
    private static final Map<String, Log> logMap = new HashMap<>();

    private static Level globalLogLevel = null;

    /**
     * Get the logger for the clazz
     * @param clazz the class object
     *
     * @return logger
     */
    public static synchronized Log getLog(Class clazz) {
        return getLog(getTruncatedLogTag(clazz.getSimpleName()));
    }

    /**
     * Get the logger for the string tag
     * @param logTag the string tag
     *
     * @return logger
     */
    public static synchronized Log getLog(String logTag) {
        logTag = getTruncatedLogTag(logTag);

        Log log = logMap.get(logTag);
        if (log != null) {
            return log;
        }

        if (checkApacheCommonsLoggingExists()) {
            log = new ApacheCommonsLogging(logTag);
        } else if (checkAndroidLoggingMocked()) {
            log = new AndroidLog(logTag);
        } else {
            log = new ConsoleLog(logTag);
        }
        logMap.put(logTag, log);
        return log;
    }

    public static void setLevel(Level level) {
        globalLogLevel = level;
    }

    public static Level getLevel() {
        return globalLogLevel;
    }

    private static boolean checkApacheCommonsLoggingExists() {
        try {
            Class.forName(APACHE_COMMONS_LOGGING_LOGFACTORY);
            return true;
        } catch (ClassNotFoundException cnfe) {
            return false;
        } catch (RuntimeException exception) {
            return false;
        }
    }

    private static boolean checkAndroidLoggingMocked() {
        try {
            android.util.Log.isLoggable(TAG, android.util.Log.VERBOSE);
            return true;
        } catch (RuntimeException exception) {
            return false;
        }
    }

    /**
     * Truncate log tag to be within 23 characters in length as required by Android on certain API levels.
     *
     * @param logTag Log tag to be truncated
     * @return truncated log tag
     */
    private static String getTruncatedLogTag(String logTag) {
        if (logTag.length() > 23) {
            getLog(TAG).warn("Truncating log tag length as it exceed 23, " +
                    "the limit imposed by Android on certain API Levels");
            logTag = logTag.substring(0, 23);
        }
        return logTag;
    }

    public enum Level
    {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);

        private final int value;

        public int getValue()
        {
            return this.value;
        }

        Level(int value)
        {
            this.value = value;
        }
    }
}
