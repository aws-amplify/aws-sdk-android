package com.amazonaws.logging;

import android.util.Log;

public class AndroidLog implements com.amazonaws.logging.Log {

    private final String tag;
    /**
     *
     * @param tag The tag that is present in android.util.Log.d(TAG, "Hello world");
     */
    public AndroidLog(final String tag) {
        this.tag = tag;
    }

    @Override
    public boolean isDebugEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public boolean isErrorEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public boolean isFatalEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public boolean isInfoEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public boolean isWarnEnabled() {
        // TODO setters of default to true
        return true;
    }

    @Override
    public void trace(Object message) {
        // TODO Get mapping for this method
    }

    @Override
    public void trace(Object message, Throwable t) {
        // TODO Get mapping for this method
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

    @Override
    public void fatal(Object message) {
        Log.wtf(tag, message.toString());
    }

    @Override
    public void fatal(Object message, Throwable t) {
        Log.wtf(tag, message.toString(), t);
    }
}
