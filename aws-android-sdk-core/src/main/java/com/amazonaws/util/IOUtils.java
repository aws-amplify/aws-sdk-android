/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Utilities for IO operations.
 */
@SuppressWarnings("checkstyle:nowhitespacebefore")
public enum IOUtils {
    ;

    private static final Log logger = LogFactory.getLog(IOUtils.class);
    private static final int BUFFER_SIZE = 1024 * 4;

    /**
     * Reads and returns the rest of the given input stream as a byte array,
     * closing the input stream afterwards.
     * @param is the input stream.
     * @return the rest of the given input stream.
     */
    public static byte[] toByteArray(InputStream is) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            final byte[] b = new byte[BUFFER_SIZE];
            int n = 0;
            while ((n = is.read(b)) != -1) {
                output.write(b, 0, n);
            }
            return output.toByteArray();
        } finally {
            output.close();
        }
    }

    /**
     * Reads and returns the rest of the given input stream as a string, closing
     * the input stream afterwards.
     * @param is the input stream.
     * @return the rest of the given input stream.
     */
    public static String toString(InputStream is) throws IOException {
        return new String(toByteArray(is), StringUtils.UTF8);
    }

    /**
     * Closes the given Closeable quietly.
     *
     * @param is the given closeable
     * @param log logger used to log any failure should the close fail
     */
    public static void closeQuietly(Closeable is, Log log) {
        if (is != null) {
            try {
                is.close();
            } catch (final IOException ex) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Ignore failure in closing the Closeable", ex);
                }
            }
        }
    }

    /**
     * Releases the given {@link Closeable} especially if it was an instance of
     * {@link Releasable}.
     * <p>
     * For example, the creation of a <code>ResettableInputStream</code> would
     * entail physically opening a file. If the opened file is meant to be
     * closed only (in a finally block) by the very same code block that created
     * it, then it is necessary that the release method must not be called while
     * the execution is made in other stack frames. In such case, as other stack
     * frames may inadvertently or indirectly call the close method of the
     * stream, the creator of the stream would need to explicitly disable the
     * accidental closing via <code>ResettableInputStream#disableClose()</code>,
     * so that the release method becomes the only way to truly close the opened
     * file.
     * @param is the closeable.
     * @param log the log.
     */
    public static void release(Closeable is, Log log) {
        closeQuietly(is, log);
    }

    /**
     * Copies all bytes from the given input stream to the given output stream.
     * Caller is responsible for closing the streams.
     * @param in the input stream.
     * @param out the output stream.
     *
     * @return the count of bytes copied.
     * @throws IOException if there is any IO exception during read or write.
     */
    public static long copy(InputStream in, OutputStream out)
            throws IOException {
        final byte[] buf = new byte[BUFFER_SIZE];
        long count = 0;
        int n = 0;
        while ((n = in.read(buf)) > -1) {
            out.write(buf, 0, n);
            count += n;
        }
        return count;
    }
}
