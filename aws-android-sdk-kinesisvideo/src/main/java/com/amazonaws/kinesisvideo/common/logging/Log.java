/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.common.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.annotation.NonNull;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

/**
 *
 * Kinesis Video Streams common codebase.
 *
 * Logging class for Kinesis Video Streams codebase. The underlying logger can be different for
 * different platforms - i.e. LogCat for Android.
 *
 */
public class Log {
    /**
     * Default tag for the logs
     */
    private static final String BASE_TAG = "KinesisVideoStreams";

    /**
     * Used to delimit the tag from the message
     */
    private static final String TAG_DELIMITER = ".";

    /**
     * Used to delimit the message pieces
     */
    private static final String MESSAGE_DELIMITER = ": ";

    /**
     * Default string builder size
     */
    private static final int DEFAULT_MESSAGE_BUFFER = 1024;

    /**
     * OutputChannel implementation based on System.out. This can be useful in JUnit tests, since they run in an
     * environment that lacks a working implementation of actual logging mechanism.
     */
    public static final OutputChannel SYSTEM_OUT = new OutputChannel() {
        @Override
        public void print(final int level, final String tag, final String message) {
            System.out.println(
                    String.format("%s%s%s\t%s", LogLevel.fromInt(level).toString(), MESSAGE_DELIMITER, tag, message));
        }

        @Override
        public String toString() {
            return "standard output console";
        }
    };

    /**
     * Output channel to use.
     */
    private final OutputChannel mOutputChannel;

    /**
     * Used to build the log message
     */
    private final StringBuilder mStringBuilder;

    /**
     * Current tag value
     */
    private String mTag;

    /**
     * Specifies the current log level
     */
    private LogLevel mCurrentLogLevel;

    /**
     * Creates a new instance of the class using defaults
     *
     * @param outputChannel
     *         An interface to {@link OutputChannel} to uze for messages.
     */
    public Log(final @NonNull OutputChannel outputChannel) {
        this(outputChannel, LogLevel.INFO, BASE_TAG);
    }

    /**
     * Creates a new instance of the class
     *
     * @param outputChannel
     *         An interface to {@link OutputChannel} to uze for messages.
     * @param currentLogLevel
     *         Current log level for logging
     * @param tag
     *         Base tag to use for messages
     */
    public Log(final @NonNull OutputChannel outputChannel, final LogLevel currentLogLevel, final @NonNull String tag) {
        mOutputChannel = Preconditions.checkNotNull(outputChannel);
        mTag = Preconditions.checkNotNull(tag);
        mCurrentLogLevel = currentLogLevel;
        mStringBuilder = new StringBuilder(DEFAULT_MESSAGE_BUFFER);
    }

    /**
     * Sets the current logging level
     *
     * @param logLevel
     *         Log level to filter
     */
    public void setCurrentLogLevel(final LogLevel logLevel) {
        mCurrentLogLevel = logLevel;
    }

    /**
     * Sets the tag with the package name prefix
     */
    public void setPackagePrefix() {
        final StackTraceElement[] stack = new Throwable().getStackTrace();
        final String[] parts = stack[1].getClassName().split("\\.", 0);
        final String packageName = parts[parts.length - 1];
        mTag = String.format("%s%s%s", BASE_TAG, TAG_DELIMITER, packageName);
    }

    /**
     * Basic logging function with a single string message
     *
     * @param logLevel
     *         Log level
     * @param message
     *         Message to log
     */
    public void log(final LogLevel logLevel, final String message) {
        if (logLevel.getLogLevel() >= mCurrentLogLevel.getLogLevel()) {
            mOutputChannel.print(logLevel.getLogLevel(), mTag, message);
        }
    }

    /**
     * Parameterized versions of the logging functions
     *
     * @param logLevel
     *         Log level
     * @param template
     *         String template
     * @param args
     *         Arguments
     */
    public void log(final LogLevel logLevel, final String template, final Object... args) {
        log(logLevel, String.format(template, args));
    }

    /**
     * Verbose logging
     *
     * @param message
     *         Message to log
     */
    public void verbose(final String message) {
        log(LogLevel.VERBOSE, message);
    }

    /**
     * Verbose level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void verbose(final String template, final Object... args) {
        log(LogLevel.VERBOSE, template, args);
    }

    /**
     * Debug logging
     *
     * @param message
     *         Message to log
     */
    public void debug(final String message) {
        log(LogLevel.DEBUG, message);
    }

    /**
     * Debug level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void debug(final String template, final Object... args) {
        log(LogLevel.DEBUG, template, args);
    }

    /**
     * Information level logging
     *
     * @param message
     *         Message to log
     */
    public void info(final String message) {
        log(LogLevel.INFO, message);
    }

    /**
     * Information level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void info(final String template, final Object... args) {
        log(LogLevel.INFO, template, args);
    }

    /**
     * Warning level logging
     *
     * @param message
     *         Message to log
     */
    public void warn(final String message) {
        log(LogLevel.WARN, message);
    }

    /**
     * Warning level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void warn(final String template, final Object... args) {
        log(LogLevel.WARN, template, args);
    }

    /**
     * Error level logging
     *
     * @param message
     *         Message to log
     */
    public void error(final String message) {
        log(LogLevel.ERROR, message);
    }

    /**
     * Error level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void error(final String template, final Object... args) {
        log(LogLevel.ERROR, template, args);
    }

    /**
     * Assert level logging
     *
     * @param message
     *         Message to log
     */
    public void assrt(final String message) {
        log(LogLevel.ASSERT, message);
    }

    /**
     * Assert level logging in a parameterized string
     *
     * @param template
     *         Parameterized string
     * @param args
     *         Arguments
     */
    public void assrt(final String template, final Object... args) {
        log(LogLevel.ASSERT, template, args);
    }

    /**
     * Logs an exception
     *
     * @param e
     *         Exception to log
     */
    public void exception(final Throwable e) {
        log(LogLevel.ERROR,
                createMessage("EXCEPTION: ", e.getClass().getSimpleName(), MESSAGE_DELIMITER, e.getMessage()));
    }

    public void exception(final Throwable e, final String template, final Object... args) {
        log(LogLevel.ERROR, createMessage("EXCEPTION: ", e.getClass().getSimpleName(), MESSAGE_DELIMITER,
                String.format(template, args), MESSAGE_DELIMITER, e.getMessage()));
    }

    /**
     * Creates the message for logging.
     *
     * @param args
     *         Object array to log
     * @return Formatted string
     */
    private String createMessage(final Object... args) {
        // Fast path with single object
        if (args.length == 1 && args[0] instanceof String) {
            //return String.valueOf(args[0]);
            return (String) args[0];
        }

        // Clear the buffer
        mStringBuilder.setLength(0);

        // Add the date
        mStringBuilder.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z' ").format(new Date()));

        // Add the thread
        mStringBuilder.append("T").append(Thread.currentThread().getId()).append(MESSAGE_DELIMITER);

        // Append the rest
        addFlattenedArray(args);

        return mStringBuilder.toString();
    }

    /**
     * Converts an Object array to a flat string representation, recursively expanding subarrays,
     * and appends the result to the StringBuilder.
     */
    private void addFlattenedArray(final Object[] args) {
        for (final Object item : args) {
            if (null == item) {
                mStringBuilder.append("null");
            } else if (item instanceof byte[]) {
                addHexString((byte[]) item);
            } else if (item instanceof Object[]) {
                addFlattenedArray((Object[]) item);
            } else {
                mStringBuilder.append(item.toString());
            }
        }
    }

    /**
     * Converts a byte array to hex string representation and appends it to the StringBuilder.
     *
     * @param bytes
     *         Array of types to represent
     */
    private void addHexString(final byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            final int unsignedByte = bytes[i] & 0xff; // Need to cast up to int to preserve unsignedness of each byte
            if (unsignedByte < 16) {
                mStringBuilder.append('0'); // so we have two characters per digit
            }

            mStringBuilder.append(Integer.toHexString(unsignedByte));
        }
    }
}
