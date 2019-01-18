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

package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;

import java.io.IOException;
import java.io.InputStream;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 * @see CipherLite
 * @see GCMCipherLite
 *
 * @deprecated See {@link com.amazonaws.services.s3.AmazonS3EncryptionClient}
 *             for further details.
 */
@Deprecated
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int MAX_RETRY = 1000;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int BYTE_MASK = 0xFF;
    private CipherLite cipherLite;
    /**
     * True if this input stream is currently involved in a multipart uploads;
     * false otherwise. For multipart uploads, the doFinal method if the
     * underlying cipher has to be triggered via the read methods rather than
     * the close method, since we cann't tell if closing the input stream is due
     * to a recoverable error (in which case the cipher's doFinal method should
     * never be called) or normal completion (where the cipher's doFinal method
     * would need to be called if it was not a multipart upload).
     */
    private final boolean multipart;

    /**
     * True if this is the last part of a multipart upload; false otherwise.
     */
    private final boolean lastMultiPart;
    private boolean eof = false;
    private final byte[] bufin;
    private byte[] bufout;
    private int currPos = 0;
    private int maxPos = 0;

    /**
     * Constructor.
     * @param is the input stream.
     * @param cipherLite the CipherLite.
     */
    public CipherLiteInputStream(InputStream is, CipherLite cipherLite) {
        this(is, cipherLite, DEFAULT_IN_BUFFER_SIZE, false, false);
    }

    /**
     * Constructor.
     * @param is the input stream.
     * @param cipherLite the CipherLite.
     * @param buffsize the buffer size.
     */
    public CipherLiteInputStream(InputStream is, CipherLite cipherLite, int buffsize) {
        this(is, cipherLite, buffsize, false, false);
    }

    /**
     * Constructor.
     * @param is the input stream.
     * @param cipherLite the CipherLite.
     * @param buffsize the buffer size.
     * @param multipart indicator for multipart.
     * @param lastMultiPart indicator for last multipart.
     */
    public CipherLiteInputStream(InputStream is, CipherLite cipherLite, int buffsize,
            boolean multipart, boolean lastMultiPart) {
        super(is);
        if (lastMultiPart && !multipart) {
            throw new IllegalArgumentException(
                    "lastMultiPart can only be true if multipart is true");
        }
        this.multipart = multipart;
        this.lastMultiPart = lastMultiPart;
        this.cipherLite = cipherLite;
        if (buffsize <= 0 || (buffsize % DEFAULT_IN_BUFFER_SIZE) != 0) {
            throw new IllegalArgumentException("buffsize (" + buffsize
                    + ") must be a positive multiple of "
                    + DEFAULT_IN_BUFFER_SIZE);
        }
        this.bufin = new byte[buffsize];
    }

    /**
     * Constructor.
     * @param is the input stream.
     */
    protected CipherLiteInputStream(InputStream is) {
        this(is, CipherLite.NULL, DEFAULT_IN_BUFFER_SIZE, false, false);
    }

    @Override
    public int read() throws IOException {
        if (currPos >= maxPos) {
            if (eof) {
                return -1;
            }
            int count = 0;
            int len;
            do {
                if (count > MAX_RETRY) {
                    throw new IOException(
                            "exceeded maximum number of attempts to read next chunk of data");
                }
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1) {
                return -1;
            }
        }
        return (bufout[currPos++] & BYTE_MASK);
    };

    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(byte[] buf, int off, int targetLen) throws IOException {
        if (currPos >= maxPos) {
            // all buffered data has been read, let's get some more
            if (eof) {
                return -1;
            }
            int count = 0;
            int len;
            do {
                if (count > MAX_RETRY) {
                    throw new IOException(
                            "exceeded maximum number of attempts to read next chunk of data");
                }
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1) {
                return -1;
            }
        }
        if (targetLen <= 0) {
            return 0;
        }
        int len = maxPos - currPos;
        if (targetLen < len) {
            len = targetLen;
        }
        // if buf == null, will throw NPE as intended per javadoc
        System.arraycopy(bufout, currPos, buf, off, len);
        currPos += len;
        return len;
    }

    @Override
    public long skip(long n) throws IOException {
        abortIfNeeded();
        final int available = maxPos - currPos;
        if (n > available) {
            n = available;
        }
        if (n < 0) {
            return 0;
        }
        currPos += n;
        return n;
    }

    @Override
    public int available() {
        abortIfNeeded();
        return maxPos - currPos;
    }

    @SuppressWarnings("checkstyle:emptyblock")
    @Override
    public void close() throws IOException {
        in.close();
        // For multipart upload the doFinal has to be triggered via the read
        // methods, since we cann't tell if the close is due to error or normal
        // completion.
        if (!multipart) {
            if (!S3CryptoScheme.isAesGcm(cipherLite.getCipherAlgorithm())) {
                try {
                    // simulate the RI: throw away the unprocessed data
                    cipherLite.doFinal();
                } catch (final BadPaddingException ex) {
                } catch (final IllegalBlockSizeException ex) {
                }
            }
        }
        currPos = 0;
        maxPos = 0;
        abortIfNeeded();
    }

    @Override
    public boolean markSupported() {
        abortIfNeeded();
        return in.markSupported() && cipherLite.markSupported();
    }

    @Override
    public void mark(int readlimit) {
        abortIfNeeded();
        in.mark(readlimit);
        cipherLite.mark();
    }

    @Override
    public void reset() throws IOException {
        abortIfNeeded();
        in.reset();
        cipherLite.reset();
        resetInternal();
    }

    final void resetInternal() {
        if (markSupported()) {
            currPos = 0;
            maxPos = 0;
            eof = false;
        }
    }

    /**
     * Reads and process the next chunk of data into memory.
     *
     * @return the length of the data chunk read and processed, or -1 if end of
     *         stream.
     * @throws IOException if there is an IO exception from the underlying input
     *             stream
     * @throws SecurityException if there is authentication failure
     */
    @SuppressWarnings("checkstyle:emptyblock")
    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (eof) {
            return -1;
        }
        bufout = null;
        final int len = in.read(bufin);
        if (len == -1) {
            eof = true;
            // Skip doFinal if it's a multi-part upload but not the last part
            if (!multipart || lastMultiPart) {
                try {
                    bufout = cipherLite.doFinal();
                    if (bufout == null) {
                        // bufout can be null, for example, when it was the
                        // javax.crypto.NullCipher
                        return -1;
                    }
                    currPos = 0;
                    maxPos = bufout.length;
                    return maxPos;
                } catch (final IllegalBlockSizeException ignore) {
                    // like the RI
                } catch (final BadPaddingException e) {
                    if (S3CryptoScheme.isAesGcm(cipherLite.getCipherAlgorithm())) {
                        throw new SecurityException(e);
                    }
                }
            }
            return -1;
        }
        bufout = cipherLite.update(bufin, 0, len);
        currPos = 0;
        maxPos = (bufout == null ? 0 : bufout.length);
        return maxPos;
    }

    void renewCipherLite() {
        cipherLite = cipherLite.recreate();
    }
}
