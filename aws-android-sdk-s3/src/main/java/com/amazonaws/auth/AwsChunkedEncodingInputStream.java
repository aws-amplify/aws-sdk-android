/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth;

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.util.BinaryUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper class of InputStream that implements chunked-encoding.
 */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    protected static final String DEFAULT_ENCODING = "UTF-8";
    private static final int BIT_MASK = 0xFF;

    private static final int DEFAULT_CHUNK_SIZE = 128 * 1024;
    private static final int DEFAULT_BUFFER_SIZE = 256 * 1024;

    private static final String CLRF = "\r\n";
    private static final String CHUNK_STRING_TO_SIGN_PREFIX = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String CHUNK_SIGNATURE_HEADER = ";chunk-signature=";
    private static final int SIGNATURE_LENGTH = 64;
    private static final byte[] FINAL_CHUNK = new byte[0];

    private InputStream is = null;
    private final int maxBufferSize;
    private final byte[] kSigning;
    private final String dateTime;
    private final String keyPath;
    private final String headerSignature;
    private String priorChunkSignature;
    private final AWS4Signer aws4Signer;

    /** Iterator on the current chunk that has been signed. */
    private ChunkContentIterator currentChunkIterator;

    /**
     * Iterator on the buffer of the decoded stream, Null if the wrapped stream
     * is marksupported, otherwise it will be initialized when this wrapper is
     * marked.
     */
    private DecodedStreamBuffer decodedStreamBuffer;

    private boolean isAtStart = true;
    private boolean isTerminating = false;

    private static final Log log = LogFactory.getLog(AwsChunkedEncodingInputStream.class);

    /**
     * A wrapper of InputStream that implements pseudo-chunked-encoding. Each
     * chunk will be buffered for the calculation of the chunk signature which
     * is added at the head of each chunk.<br>
     * The default chunk size cannot be customized, since we need to calculate
     * the expected encoded stream length before reading the wrapped stream.<br>
     * This class will use the mark() & reset() of the wrapped InputStream if
     * they are supported, otherwise it will create a buffer for bytes read from
     * the wrapped stream.
     *
     * @param in The original InputStream.
     * @param kSigning Signing key.
     * @param datetime Datetime, as used in SigV4.
     * @param keyPath Keypath/Scope, as used in SigV4.
     * @param headerSignature The signature of the signed headers. This will be
     *            used for calculating the signature of the first chunk.
     * @param aws4Signer The AWS4Signer used for hashing and signing.
     */
    public AwsChunkedEncodingInputStream(InputStream in, byte[] kSigning,
            String datetime, String keyPath, String headerSignature,
            AWS4Signer aws4Signer) {
        this(in, DEFAULT_BUFFER_SIZE, kSigning, datetime, keyPath, headerSignature, aws4Signer);
    }

    /**
     * A wrapper of InputStream that implements pseudo-chunked-encoding. Each
     * chunk will be buffered for the calculation of the chunk signature which
     * is added at the head of each chunk.<br>
     * The default chunk size cannot be customized, since we need to calculate
     * the expected encoded stream length before reading the wrapped stream.<br>
     * This class will use the mark() & reset() of the wrapped InputStream if
     * they are supported, otherwise it will create a buffer for bytes read from
     * the wrapped stream.
     *
     * @param in The original InputStream.
     * @param maxBufferSize Maximum number of bytes buffered by this class.
     * @param kSigning Signing key.
     * @param datetime Datetime, as used in SigV4.
     * @param keyPath Keypath/Scope, as used in SigV4.
     * @param headerSignature The signature of the signed headers. This will be
     *            used for calculating the signature of the first chunk.
     * @param aws4Signer The AWS4Signer used for hashing and signing.
     */
    public AwsChunkedEncodingInputStream(InputStream in, int maxBufferSize,
            byte[] kSigning, String datetime, String keyPath,
            String headerSignature, AWS4Signer aws4Signer) {
        if (in instanceof AwsChunkedEncodingInputStream) {
            // This could happen when the request is retried, and we need to
            // re-calculate the signatures.
            final AwsChunkedEncodingInputStream originalChunkedStream = (AwsChunkedEncodingInputStream) in;
            maxBufferSize = Math.max(originalChunkedStream.maxBufferSize, maxBufferSize);
            is = originalChunkedStream.is;
            decodedStreamBuffer = originalChunkedStream.decodedStreamBuffer;
        } else {
            is = in;
            decodedStreamBuffer = null;
        }

        if (maxBufferSize < DEFAULT_CHUNK_SIZE) {
            throw new IllegalArgumentException(
                    "Max buffer size should not be less than chunk size");
        }
        this.maxBufferSize = maxBufferSize;
        this.kSigning = kSigning;
        this.dateTime = datetime;
        this.keyPath = keyPath;
        this.headerSignature = headerSignature;
        this.priorChunkSignature = headerSignature;
        this.aws4Signer = aws4Signer;
    }

    @Override
    public int read() throws IOException {
        final byte[] tmp = new byte[1];
        final int count = read(tmp, 0, 1);
        if (count != -1) {
            if (log.isDebugEnabled()) {
                log.debug("One byte read from the stream.");
            }
            final int unsignedByte = tmp[0] & BIT_MASK;
            return unsignedByte;
        } else {
            return count;
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        abortIfNeeded();
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        if (null == currentChunkIterator
                || !currentChunkIterator.hasNext()) {
            if (isTerminating) {
                return -1;
            } else {
                isTerminating = setUpNextChunk();
            }
        }

        final int count = currentChunkIterator.read(b, off, len);
        if (count > 0) {
            isAtStart = false;
            if (log.isDebugEnabled()) {
                log.debug(count + " byte read from the stream.");
            }
        }
        return count;
    }

    @Override
    public long skip(long n) throws IOException {
        if (n <= 0) {
            return 0;
        }
        long remaining = n;
        final int toskip = (int) Math.min(DEFAULT_BUFFER_SIZE, n);
        final byte[] temp = new byte[toskip];
        while (remaining > 0) {
            final int count = read(temp, 0, toskip);
            if (count < 0) {
                break;
            }
            remaining -= count;
        }
        return n - remaining;
    }

    /**
     * @see java.io.InputStream#markSupported()
     */
    @Override
    public boolean markSupported() {
        return true;
    }

    /**
     * The read limit parameter is ignored if an internal buffer is being used
     * because the underlying input stream does not support mark, or INTEGER_MAX
     * if underlying input stream does support marking.
     */
    @Override
    public synchronized void mark(int readlimit) {
        abortIfNeeded();
        if (!isAtStart) {
            throw new UnsupportedOperationException(
                    "Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (is.markSupported()) {
            if (log.isDebugEnabled()) {
                log.debug("AwsChunkedEncodingInputStream marked at the start of the stream "
                        + "(will directly mark the wrapped stream since it's mark-supported).");
            }
            is.mark(Integer.MAX_VALUE);
        } else {
            if (log.isDebugEnabled()) {
                log.debug("AwsChunkedEncodingInputStream marked at the start of the stream "
                        + "(initializing the buffer since the wrapped stream is not mark-supported).");
            }
            decodedStreamBuffer = new DecodedStreamBuffer(maxBufferSize);
        }
    }

    /**
     * Reset the stream, either by resetting the wrapped stream or using the
     * buffer created by this class.
     */
    @Override
    public synchronized void reset() throws IOException {
        abortIfNeeded();
        // Clear up any encoded data
        currentChunkIterator = null;
        priorChunkSignature = headerSignature;
        // Reset the wrapped stream if it is mark-supported,
        // otherwise use our buffered data.
        if (is.markSupported()) {
            if (log.isDebugEnabled()) {
                log.debug("AwsChunkedEncodingInputStream reset "
                        + "(will reset the wrapped stream because it is mark-supported).");
            }
            is.reset();
        } else {
            if (log.isDebugEnabled()) {
                log.debug("AwsChunkedEncodingInputStream reset "
                        + "(will use the buffer of the decoded stream).");
            }
            if (null == decodedStreamBuffer) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.startReadBuffer();
        }

        currentChunkIterator = null;
        isAtStart = true;
        isTerminating = false;
    }

    /**
     * calculates the content length of the stream.
     *
     * @param originalLength the original content length.
     * @return the stream length.
     */
    public static long calculateStreamContentLength(long originalLength) {
        if (originalLength < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }

        final long maxSizeChunks = originalLength / DEFAULT_CHUNK_SIZE;
        final long remainingBytes = originalLength % DEFAULT_CHUNK_SIZE;
        return maxSizeChunks * calculateSignedChunkLength(DEFAULT_CHUNK_SIZE)
                + (remainingBytes > 0 ? calculateSignedChunkLength(remainingBytes) : 0)
                + calculateSignedChunkLength(0);
    }

    private static long calculateSignedChunkLength(long chunkDataSize) {
        return Long.toHexString(chunkDataSize).length()
                + CHUNK_SIGNATURE_HEADER.length()
                + SIGNATURE_LENGTH
                + CLRF.length()
                + chunkDataSize
                + CLRF.length();
    }

    /**
     * Read in the next chunk of data, and create the necessary chunk
     * extensions.
     *
     * @return Returns true if next chunk is the last empty chunk.
     */
    private boolean setUpNextChunk() throws IOException {
        byte[] chunkData = new byte[DEFAULT_CHUNK_SIZE];
        int chunkSizeInBytes = 0;
        while (chunkSizeInBytes < DEFAULT_CHUNK_SIZE) {
            /** Read from the buffer of the decoded stream */
            if (null != decodedStreamBuffer
                    && decodedStreamBuffer.hasNext()) {
                chunkData[chunkSizeInBytes++] = decodedStreamBuffer.next();
            }
            /** Read from the wrapped stream */
            else {
                final int bytesToRead = DEFAULT_CHUNK_SIZE - chunkSizeInBytes;
                final int count = is.read(chunkData, chunkSizeInBytes, bytesToRead);
                if (count != -1) {
                    if (null != decodedStreamBuffer) {
                        decodedStreamBuffer.buffer(chunkData, chunkSizeInBytes, count);
                    }
                    chunkSizeInBytes += count;
                } else {
                    break;
                }
            }
        }
        if (chunkSizeInBytes == 0) {
            final byte[] signedFinalChunk = createSignedChunk(FINAL_CHUNK);
            currentChunkIterator = new ChunkContentIterator(signedFinalChunk);
            return true;
        } else {
            if (chunkSizeInBytes < chunkData.length) {
                final byte[] temp = new byte[chunkSizeInBytes];
                System.arraycopy(chunkData, 0, temp, 0, chunkSizeInBytes);
                chunkData = temp;
            }
            final byte[] signedChunkContent = createSignedChunk(chunkData);
            currentChunkIterator = new ChunkContentIterator(signedChunkContent);
            return false;
        }
    }

    private byte[] createSignedChunk(byte[] chunkData) {
        final StringBuilder chunkHeader = new StringBuilder();
        // chunk-size
        chunkHeader.append(Integer.toHexString(chunkData.length));
        // nonsig-extension
        final String nonsigExtension = "";
        // sig-extension
        final String chunkStringToSign = CHUNK_STRING_TO_SIGN_PREFIX + "\n" +
                dateTime + "\n" +
                keyPath + "\n" +
                priorChunkSignature + "\n" +
                BinaryUtils.toHex(aws4Signer.hash(nonsigExtension)) + "\n" +
                BinaryUtils.toHex(aws4Signer.hash(chunkData));
        final String chunkSignature = BinaryUtils.toHex(aws4Signer.sign(chunkStringToSign, kSigning,
                SigningAlgorithm.HmacSHA256));
        priorChunkSignature = chunkSignature;
        chunkHeader.append(nonsigExtension + CHUNK_SIGNATURE_HEADER + chunkSignature);
        chunkHeader.append(CLRF);

        try {
            final byte[] header = chunkHeader.toString().getBytes(UTF8);
            final byte[] trailer = CLRF.getBytes(UTF8);
            final byte[] signedChunk = new byte[header.length + chunkData.length + trailer.length];
            System.arraycopy(header, 0, signedChunk, 0, header.length);
            System.arraycopy(chunkData, 0, signedChunk, header.length, chunkData.length);
            System.arraycopy(trailer, 0,
                    signedChunk, header.length + chunkData.length,
                    trailer.length);
            return signedChunk;
        } catch (final Exception e) {
            throw new AmazonClientException("Unable to sign the chunked data. " + e.getMessage(),
                    e);
        }
    }

    @Override
    protected InputStream getWrappedInputStream() {
        return is;
    }
}
