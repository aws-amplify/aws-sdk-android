/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Simple log to print to console. It conforms to the
 * {@code com.amazonaws.logging.Log} interface.
 */
public final class ConsoleLog implements com.amazonaws.logging.Log {

    /** Tag for the log message */
    private final String tag;

    /** If set, only this level and above logs will be output by this logger **/
    private LogFactory.Level level = null;

    /**
     * Constructs a basic logger that outputs to console.
     * @param tag The tag to label logs
     */
    public ConsoleLog(final String tag) {
        this.tag = tag;
    }

    @Override
    public boolean isDebugEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue();
    }

    @Override
    public boolean isErrorEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue();
    }

    @Override
    public boolean isInfoEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue();
    }

    @Override
    public boolean isTraceEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue();
    }

    @Override
    public boolean isWarnEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue();
    }

    @Override
    public void trace(Object message) {
        if (isTraceEnabled()) {
            log(LogFactory.Level.TRACE, message, null);
        }
    }

    @Override
    public void trace(Object message, Throwable t) {
        if (isTraceEnabled()) {
            log(LogFactory.Level.TRACE, message, t);
        }
    }

    @Override
    public void debug(Object message) {
        if (isDebugEnabled()) {
            log(LogFactory.Level.DEBUG, message, null);
        }
    }

    @Override
    public void debug(Object message, Throwable t) {
        if (isDebugEnabled()) {
            log(LogFactory.Level.DEBUG, message, t);
        }
    }

    @Override
    public void info(Object message) {
        if (isInfoEnabled()) {
            log(LogFactory.Level.INFO, message, null);
        }
    }

    @Override
    public void info(Object message, Throwable t) {
        if (isInfoEnabled()) {
            log(LogFactory.Level.INFO, message, t);
        }
    }

    @Override
    public void warn(Object message) {
        if (isWarnEnabled()) {
            log(LogFactory.Level.WARN, message, null);
        }
    }

    @Override
    public void warn(Object message, Throwable t) {
        if (isWarnEnabled()) {
            log(LogFactory.Level.WARN, message, t);
        }
    }

    @Override
    public void error(Object message) {
        if (isErrorEnabled()) {
            log(LogFactory.Level.ERROR, message, null);
        }
    }

    @Override
    public void error(Object message, Throwable t) {
        if (isErrorEnabled()) {
            log(LogFactory.Level.ERROR, message, t);
        }
    }

    @Override
    public void setLevel(LogFactory.Level level) {
        this.level = level;
    }

    private void log(LogFactory.Level level, Object message, Throwable throwable) {
        System.out.printf("%s/%s: %s\n", tag, level.name(), message);
        if (throwable != null) {
            System.out.println(throwable.toString());
        }
    }

    /**
     * Checks whether a log level has been set either at the local level or, if not, the global one
     * @return Appropriate log level if one has been set by the user
     */
    private LogFactory.Level getLevel() {
        if (level != null) {
            return level;
        } else {
            return LogFactory.getLevel();
        }
    }
}
