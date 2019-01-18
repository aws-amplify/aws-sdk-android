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
    private static final String TAG = LogFactory.class.getSimpleName();
    private static final String APACHE_COMMONS_LOGGING_LOGFACTORY = "org.apache.commons.logging.LogFactory";

    private static Map<String, Log> logMap = new HashMap<String, Log>();

    /**
     * Get the logger for the clazz
     * @param clazz the class object
     *
     * @return logger
     */
    public static synchronized Log getLog(Class clazz) {
        return getLog(clazz.getSimpleName());
    }

    /**
     * Get the logger for the string tag
     * @param string the string tag
     *
     * @return logger
     */
    public static synchronized Log getLog(final String string) {
        Log log = logMap.get(string);
        if (log == null) {
            if (checkApacheCommonsLoggingExists()) {
                try {
                    log = new ApacheCommonsLogging(string);
                    logMap.put(string, log);
                } catch (Exception e) {
                    android.util.Log.w(TAG, "Could not create log from " + APACHE_COMMONS_LOGGING_LOGFACTORY, e);
                }
            }
            if (log == null) {
                log = new AndroidLog(string);
                logMap.put(string, log);
            }
        }
        return log;
    }

    private static boolean checkApacheCommonsLoggingExists() {
        try {
            Class<?> classObject = Class.forName(APACHE_COMMONS_LOGGING_LOGFACTORY);
            return true;
        } catch (ClassNotFoundException cnfe) {
            return false;
        } catch (Exception ex) {
            android.util.Log.e(TAG, ex.getMessage());
            return false;
        }
    }
}
