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

import com.amazonaws.logging.LogFactory.Level;

/**
 * This is a wrapper over the Apache Commons
 * Logging framework.
 * @deprecated Use {@link AndroidLog} instead.
 */
@Deprecated
public class ApacheCommonsLogging implements com.amazonaws.logging.Log {

    private Class logClass;
    private String logString;
    private Log log;

    /** If set, only this level and above logs will be output by this logger **/
    private Level level = null;

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
        return this.log.isDebugEnabled() &&
                (getLevel() == null || getLevel().getValue() <= Level.DEBUG.getValue());
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
        return this.log.isErrorEnabled() &&
                (getLevel() == null || getLevel().getValue() <= Level.ERROR.getValue());
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
        return this.log.isInfoEnabled()  &&
                (getLevel() == null || getLevel().getValue() <= Level.INFO.getValue());
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
        return this.log.isTraceEnabled() &&
                (getLevel() == null || getLevel().getValue() <= Level.TRACE.getValue());
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
        return this.log.isWarnEnabled()  &&
                (getLevel() == null || getLevel().getValue() <= Level.WARN.getValue());
    }

    /**
     * <p> Log a message with trace log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void trace(Object message) {
        if (getLevel() == null || getLevel().getValue() <= Level.TRACE.getValue()) {
            this.log.trace(message);
        }
    }

    /**
     * <p> Log an error with trace log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void trace(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= Level.TRACE.getValue()) {
            this.log.trace(message, t);
        }
    }

    /**
     * <p> Log a message with debug log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void debug(Object message) {
        if (getLevel() == null || getLevel().getValue() <= Level.DEBUG.getValue()) {
            this.log.debug(message);
        }
    }

    /**
     * <p> Log an error with debug log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void debug(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= Level.DEBUG.getValue()) {
            this.log.debug(message, t);
        }
    }

    /**
     * <p> Log a message with info log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void info(Object message) {
        if (getLevel() == null || getLevel().getValue() <= Level.INFO.getValue()) {
            this.log.info(message);
        }
    }

    /**
     * <p> Log an error with info log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void info(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= Level.INFO.getValue()) {
            this.log.info(message, t);
        }
    }

    /**
     * <p> Log a message with warn log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void warn(Object message) {
        if (getLevel() == null || getLevel().getValue() <= Level.WARN.getValue()) {
            this.log.warn(message);
        }
    }

    /**
     * <p> Log an error with warn log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void warn(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= Level.WARN.getValue()) {
            this.log.warn(message, t);
        }
    }

    /**
     * <p> Log a message with error log level. </p>
     *
     * @param message log this message
     */
    @Override
    public void error(Object message) {
        if (getLevel() == null || getLevel().getValue() <= Level.ERROR.getValue()) {
            this.log.error(message);
        }
    }

    /**
     * <p> Log an error with error log level. </p>
     *
     * @param message log this message
     * @param t       log this cause
     */
    @Override
    public void error(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= Level.ERROR.getValue()) {
            this.log.error(message, t);
        }
    }

    /**
     * <p> Set the level of logs which will be output for this particular logger. </p>
     *
     * @param level Only logs of this level and above will now be output
     */
    @Override
    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * Checks whether a log level has been set either at the local level or, if not, the global one
     * @return Appropriate log level if one has been set by the user
     */
    private Level getLevel() {
        if (level != null) {
            return level;
        } else {
            return com.amazonaws.logging.LogFactory.getLevel();
        }
    }
}
