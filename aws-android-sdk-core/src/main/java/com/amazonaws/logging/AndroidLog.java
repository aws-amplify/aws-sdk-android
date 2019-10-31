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

import android.util.Log;

/**
 * AndroidLog represents the {@code android.util.Log} and it
 * confirms to the {@code com.amazonaws.logging.Log} interface.
 */
public class AndroidLog implements com.amazonaws.logging.Log {

    /** Tag for the log message */
    private final String tag;

    /** If set, only this level and above logs will be output by this logger **/
    private LogFactory.Level level = null;

    /**
     *
     * @param tag The tag that is present in
     *            android.util.Log.d(TAG, "Hello world");
     */
    public AndroidLog(final String tag) {
        this.tag = tag;
    }

    @Override
    public boolean isDebugEnabled() {
        return Log.isLoggable(tag, Log.DEBUG) &&
                (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue());
    }

    @Override
    public boolean isErrorEnabled() {
        return Log.isLoggable(tag, Log.ERROR) &&
                (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue());
    }

    @Override
    public boolean isInfoEnabled() {
        return Log.isLoggable(tag, Log.INFO) &&
                (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue());
    }

    @Override
    public boolean isTraceEnabled() {
        return Log.isLoggable(tag, Log.VERBOSE) &&
                (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue());
    }

    @Override
    public boolean isWarnEnabled() {
        return Log.isLoggable(tag, Log.WARN) &&
                (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue());
    }

    @Override
    public void trace(Object message) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            Log.v(tag, message.toString());
        }
    }

    @Override
    public void trace(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue()) {
            Log.v(tag, message.toString(), t);
        }
    }

    @Override
    public void debug(Object message) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            Log.d(tag, message.toString());
        }
    }

    @Override
    public void debug(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            Log.d(tag, message.toString(), t);
        }
    }

    @Override
    public void info(Object message) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            Log.i(tag, message.toString());
        }
    }

    @Override
    public void info(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue()) {
            Log.i(tag, message.toString(), t);
        }
    }

    @Override
    public void warn(Object message) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            Log.w(tag, message.toString());
        }
    }

    @Override
    public void warn(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue()) {
            Log.w(tag, message.toString(), t);
        }
    }

    @Override
    public void error(Object message) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            Log.e(tag, message.toString());
        }
    }

    @Override
    public void error(Object message, Throwable t) {
        if (getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue()) {
            Log.e(tag, message.toString(), t);
        }
    }

    @Override
    public void setLevel(LogFactory.Level level) {
        this.level = level;
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
