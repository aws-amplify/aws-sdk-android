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

package com.amazonaws.kinesisvideo.encoding;

import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.model.Response;
import com.amazonaws.kinesisvideo.model.ResponseStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public final class ChunkDecoder {
    private static final int HEX_RADIX = 16;
    private static final int MAX_BUFFER_BYTES = 128 * 128;
    private static final int BUFFER_SIZE = 4 * 1024;
    private static final String LINE_DELIMITER = "\r\n";
    private static final String PAYLOAD_DELIMITER = "\r\n\r\n";
    // TODO: Set to correct output channel
    private static final Log LOG = new Log(Log.SYSTEM_OUT);

    private ChunkDecoder() {
    }

    public static Map<String, String> decodeHeaders(final InputStream inputStream) {
        return parseHeaders(inputStream);
    }

    private static Map<String, String> parseHeaders(final InputStream inputStream) {

        String[] headerParts;
        final Map<String, String> headers = new HashMap<String, String>();

        try {
            final String headersAsString =
                    readInputStream(inputStream, PAYLOAD_DELIMITER.getBytes(Charset.forName("UTF-8")));
            for (final String line : headersAsString.split(LINE_DELIMITER)) {
                headerParts = line.split(":", 2);
                if (headerParts.length == 2) {
                    headers.put(headerParts[0].trim(), headerParts[1].trim());
                }
            }
        } catch (final Throwable e) {
            throw new RuntimeException("Exception while decoding headers ! ", e);
        }

        return headers;
    }

    public static ResponseStatus readStatusLine(final InputStream inputStream) {
        return parseStatusLine(inputStream);
    }

    private static ResponseStatus parseStatusLine(final InputStream inputStream) {
        try {
            final String statusLine = readInputStream(inputStream, LINE_DELIMITER.getBytes(Charset.forName("UTF-8")));
            final String[] statusLineArray = statusLine.split("\\s");

            return ResponseStatus
                    .builder()
                    .protocol(statusLineArray[0])
                    .statusCode(Integer.parseInt(statusLineArray[1]))
                    .reason(joinSubArray(statusLineArray, 2))
                    .build();

        } catch (final Throwable e) {
            throw new RuntimeException("Exception while reading status line ! ", e);
        }
    }

    private static String joinSubArray(final String[] array, final int startIndex) {
        final StringBuilder builder = new StringBuilder();

        for (int i = startIndex; i < array.length; i++) {
            builder.append(array[i]);

            if (i < array.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    private static String readInputStream(final InputStream inputStream, final byte[] delimiter)
            throws IOException {

        final byte[] buffer = new byte[BUFFER_SIZE];
        int result = 0, offset = 0;
        do {
            result = inputStream.read(buffer, offset++, 1);
        } while (result > -1 && arrayIndexOf(buffer, 0, offset, delimiter) == -1);
        return new String(buffer, 0 , offset, Charset.forName("UTF-8"));
    }

    public static int arrayIndexOf(final byte[] haystack, final int tail, final int head, final byte[] needle) {
        int index = tail;
        while (index != head) {
            boolean match = false;

            for (int j = 0; j < needle.length; j++) {
                match = haystack[(index + j) % haystack.length] == needle[j];
                if (!match) {
                    break;
                }
            }

            if (match) {
                return index;
            }
            index = (index == haystack.length - 1) ? 0 : index + 1;
        }
        return -1;
    }

    public static int parseChunkSize(final byte[] buffer, final int tail, final int head) {
        byte[] tmp;
        if (tail < head) {
            tmp = new byte[head - tail];
            System.arraycopy(buffer, tail, tmp, 0, head - tail);
        } else {
            final int len = head + buffer.length - tail;
            tmp = new byte[len];
            System.arraycopy(buffer, tail, tmp, 0, buffer.length - tail);
            System.arraycopy(buffer, 0, tmp, buffer.length - tail, head);
        }
        return Integer.parseInt(new String(tmp, 0, tmp.length, Charset.forName("UTF-8")).trim(), HEX_RADIX);
    }

    public static Response parseStatusLineAndHeaders(final InputStream inputStream) {
        return Response.builder()
                .responseStatus(parseStatusLine(inputStream))
                .responseHeaders(parseHeaders(inputStream))
                .responsePayload(inputStream)
                .build();
    }

    public static Response parseEntireTextResponse(final InputStream inputStream) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("US-ASCII")));
        return Response.builder()
                .responseStatus(parseStatusLine(inputStream))
                .responseHeaders(parseHeaders(inputStream))
                .responseBody(parseTextBody(reader))
                .responsePayload(inputStream)
                .build();
    }

    private static String parseTextBody(final BufferedReader reader) {
        final StringBuilder builder = new StringBuilder();
        String line = null;
        do {
            try {
                line = reader.readLine();
                builder.append(line);
            } catch (final IOException e) {
                e.printStackTrace();
            }
        } while (line != null);
        return builder.toString();
    }

    public static Integer decodeAckInResponseBody(final InputStream inputStream,
                                                  final Consumer<String> ackTimestampConsumer) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("US-ASCII")));
        String line;
        int chunkSize;
        int numBytesRead, offset, ackCount = 0;

        try {
            skipResponseHeaders(reader);
            line = skipEmptyLines(reader);

            // Parse chunk data
            LOG.debug("Chunk size: " + line);
            do {
                chunkSize = Integer.parseInt(line.trim(), HEX_RADIX);
                if (chunkSize == 0) {
                    break;
                }

                final char[] buff = new char[MAX_BUFFER_BYTES];
                offset = 0;
                do {
                    numBytesRead = reader.read(buff, offset, chunkSize + 2 - offset);
                    if (numBytesRead < 0) {
                        throw new RuntimeException("Unexpected end of stream while reading chunked data");
                    }

                    offset += numBytesRead;
                } while (offset < chunkSize + 2);

                // send the ack string to ack consumer with the exact number of bytes
                final String chunk = new String(buff, 0, chunkSize);
                LOG.debug("Chunk: " + chunk);
                ackTimestampConsumer.accept(chunk);

                line = reader.readLine();
                LOG.debug("Chunk size: " + line);
            } while (line != null);
        } catch (final Throwable e) {
            throw new RuntimeException("Exception while decoding Ack in response ! ", e);
        }

        return ackCount;
    }

    private static String skipEmptyLines(final BufferedReader reader) throws Throwable {
        String line;

        do {
            line = reader.readLine();
        }
        while (line != null && line.isEmpty());

        return line;
    }

    /**
     * Read and throw aways all raw bytes for the response headers.
     * <p>
     * FIXME we could have a function to read and parse response instead
     * The caller could just not throw away the return value. This will be
     * useful for ChunkDecoder::decodeHeaders
     *
     * @param reader
     * @return
     * @throws Throwable
     */
    private static String skipResponseHeaders(final BufferedReader reader) throws Throwable {
        String line;

        line = skipEmptyLines(reader);
        LOG.debug("Skip header: " + line);
        if (isStatusLine(line)) {
            do {
                line = reader.readLine();
                LOG.debug("Skip header: " + line);
            }
            while (isNotBlank(line));
        }

        return line;
    }

    private static boolean isNotBlank(final CharSequence cs) {
        final int strLen = cs == null ? 0 : cs.length();
        if (cs == null || strLen == 0) {
            return false;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStatusLine(final String line) {
        // FIXME
        return true;
    }

}
