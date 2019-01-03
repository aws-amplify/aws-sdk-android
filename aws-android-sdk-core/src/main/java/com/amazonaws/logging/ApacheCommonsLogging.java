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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is a wrapper over the Apache Commons
 * Logging framework.
 */
public class ApacheCommonsLogging implements com.amazonaws.logging.Log {

    private Class logClass;
    private String logString;
    private Log log;

    /**
     * @param logClass the class object
     */
    public ApacheCommonsLogging(Class logClass) {
        this.logClass = logClass;
        this.log = LogFactory.getLog(logClass);
    }

    /**
     * @param logString the string tag
     */
    public ApacheCommonsLogging(String logString) {
        this.logString = logString;
        this.log = LogFactory.getLog(logString);
    }

    /**
     * <p> Is debug logging currently enabled? </p>
     * <p>
     * <p> Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than debug. </p>
     *
     * @return true if debug is enabled in the underlying logger.
     */
    @Override
    public boolean isDebugEnabled() {
        return this.log.isDebugEnabled();
    }

    /**
     * <p> Is error logging currently enabled? </p>
     * <p>
     * <p> Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than error. </p>
     *
     * @return true if error is enabled in the underlying logger.
     */
    @Override
    public boolean isErrorEnabled() {
        return this.log.isErrorEnabled();
    }


    /**
     * <p> Is info logging currently enabled? </p>
     * <p>
     * <p> Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than info. </p>
     *
     * @return true if info is enabled in the underlying logger.
     */
    @Override
    public boolean isInfoEnabled() {
        return this.log.isInfoEnabled();
    }

    /**
     * <p> Is trace logging currently enabled? </p>
     * <p>
     * <p> Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than trace. </p>
     *
     * @return true if trace is enabled in the underlying logger.
     */
    @Override
    public boolean isTraceEnabled() {
        return this.log.isTraceEnabled();
    }

    /**
     * <p> Is warn logging currently enabled? </p>
     * <p>
     * <p> Call this method to prevent having to perform expensive operations
     * (for example, <code>String</code> concatenation)
     * when the log level is more than warn. </p>
     *
     * @return true if warn is enabled in the underlying logger.
     */
    @Override
    public boolean isWarnEnabled() {
        return this.log.isWarnEnabled();
    }

    /**
     * <p> Log a message with trace log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void trace(Object message) {
        this.log.trace(message);
    }

    /**
     * <p> Log an error with trace log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void trace(Object message, Throwable t) {
        this.log.trace(message, t);
    }

    /**
     * <p> Log a message with debug log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void debug(Object message) {
        this.log.debug(message);
    }

    /**
     * <p> Log an error with debug log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void debug(Object message, Throwable t) {
        this.log.debug(message, t);
    }

    /**
     * <p> Log a message with info log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void info(Object message) {
        this.log.info(message);
    }

    /**
     * <p> Log an error with info log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void info(Object message, Throwable t) {
        this.log.info(message, t);
    }

    /**
     * <p> Log a message with warn log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void warn(Object message) {
        this.log.warn(message);
    }

    /**
     * <p> Log an error with warn log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void warn(Object message, Throwable t) {
        this.log.warn(message, t);
    }

    /**
     * <p> Log a message with error log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void error(Object message) {
        this.log.error(message);
    }

    /**
     * <p> Log an error with error log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void error(Object message, Throwable t) {
        this.log.error(message, t);
    }
}
