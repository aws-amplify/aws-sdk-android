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
        return Log.isLoggable(tag, Log.DEBUG);
    }

    @Override
    public boolean isErrorEnabled() {
        return Log.isLoggable(tag, Log.ERROR);
    }

    @Override
    public boolean isInfoEnabled() {
        return Log.isLoggable(tag, Log.INFO);
    }

    @Override
    public boolean isTraceEnabled() {
        return Log.isLoggable(tag, Log.VERBOSE);
    }

    @Override
    public boolean isWarnEnabled() {
        return Log.isLoggable(tag, Log.WARN);
    }

    @Override
    public void trace(Object message) {
        Log.v(tag, message.toString());
    }

    @Override
    public void trace(Object message, Throwable t) {
        Log.v(tag, message.toString(), t);
    }

    @Override
    public void debug(Object message) {
        Log.d(tag, message.toString());
    }

    @Override
    public void debug(Object message, Throwable t) {
        Log.d(tag, message.toString(), t);
    }

    @Override
    public void info(Object message) {
        Log.i(tag, message.toString());
    }

    @Override
    public void info(Object message, Throwable t) {
        Log.i(tag, message.toString(), t);
    }

    @Override
    public void warn(Object message) {
        Log.w(tag, message.toString());
    }

    @Override
    public void warn(Object message, Throwable t) {
        Log.w(tag, message.toString(), t);
    }

    @Override
    public void error(Object message) {
        Log.e(tag, message.toString());
    }

    @Override
    public void error(Object message, Throwable t) {
        Log.e(tag, message.toString(), t);
    }
}
