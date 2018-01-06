/*
 * Copyright 2014-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Used to perform length check to ensure the number of bytes read from the
 * underlying input stream is the same as the expected total.
 */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /** Include skipped bytes. */
    public static final boolean INCLUDE_SKIPPED_BYTES = true;

    /** Exclude skipped bytes. */
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    /**
     * Total number of bytes expected to be read from the underlying input
     * stream.
     */
    private final long expectedLength;
    /**
     * True if skipped bytes are to be included as part of the data length;
     * false otherwise.
     */
    private final boolean includeSkipped;
    /**
     * The length of the data read from the underlying input stream so far.
     */
    private long dataLength;
    private long marked; // used for mark-and-reset purposes

    /**
     * Constructs an input stream that performs length check to ensure the
     * number of bytes read from the underlying input stream is the same as the
     * expected total.
     *
     * @param in the underlying input stream
     * @param expectedLength the total length of the data in bytes expected to
     *            be read from the underlying input stream; must be
     *            non-negative.
     * @param includeSkipped true if bytes skipped are to be considered as part
     *            of the data length; false otherwise. Typically, this parameter
     *            should be set to false for uploading data to AWS, but set to
     *            true for receiving data from AWS.
     */
    public LengthCheckInputStream(InputStream in, long expectedLength,
            boolean includeSkipped) {
        super(in);
        if (expectedLength < 0)
            throw new IllegalArgumentException();
        this.expectedLength = expectedLength;
        this.includeSkipped = includeSkipped;
    }

    /**
     * {@inheritDoc}
     *
     * @throws AmazonClientException if the data length read has exceeded the
     *             expected total, or if the total data length is not the same
     *             as the expected total.
     */
    @Override
    public int read() throws IOException {
        final int c = super.read();
        if (c >= 0)
            dataLength++;
        checkLength(c == -1);
        return c;
    }

    /**
     * {@inheritDoc}
     *
     * @throws AmazonClientException if the data length read has exceeded the
     *             expected total, or if the total data length is not the same
     *             as the expected total.
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int readLen = super.read(b, off, len);
        dataLength += readLen >= 0 ? readLen : 0;
        checkLength(readLen == -1);
        return readLen;
    }

    @Override
    public void mark(int readlimit) {
        super.mark(readlimit);
        marked = dataLength;
    }

    @Override
    public void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            dataLength = marked;
        }
    }

    /**
     * Checks the data length read so far against the expected total.
     *
     * @param eof true if end of stream has been encountered; false otherwise
     * @throws AmazonClientException if the data length read has exceeded the
     *             expected total, or if the total data length is not the same
     *             as the expected total.
     */
    private void checkLength(boolean eof) {
        if (eof) {
            if (dataLength != expectedLength) {
                throw new AmazonClientException("Data read (" + dataLength
                        + ") has a different length than the expected ("
                        + expectedLength + ")");
            }
        } else if (dataLength > expectedLength) {
            throw new AmazonClientException("More data read (" + dataLength
                    + ") than expected (" + expectedLength + ")");
        }
    }

    /**
     * {@inheritDoc}
     *
     * @throws AmazonClientException if {@link #includeSkipped} is true and the
     *             data length skipped has exceeded the expected total.
     */
    @Override
    public long skip(long n) throws IOException {
        final long skipped = super.skip(n);
        if (includeSkipped && skipped > 0) {
            dataLength += skipped;
            checkLength(false);
        }
        return skipped;
    }
}
