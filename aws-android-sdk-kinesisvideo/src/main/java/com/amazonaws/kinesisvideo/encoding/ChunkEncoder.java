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

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public final class ChunkEncoder {

    public static byte[] encode(final byte[] bytes, final int count) {
        try {
            final ByteArrayOutputStream writer = new ByteArrayOutputStream();

            writeChunkSize(writer, count);
            writeCRLF(writer);
            writePayload(writer, bytes, count);
            writeCRLF(writer);

            return writer.toByteArray();
        } catch (final Throwable e) {
            throw new RuntimeException("Exception while encoding chunks ! ", e);
        }
    }

    private static void writeChunkSize(final OutputStream socketWrite, final int count) throws Exception {
        final String hexCount = Integer.toHexString(count);
        socketWrite.write(hexCount.getBytes(StandardCharsets.US_ASCII));
    }

    private static void writeCRLF(final OutputStream socketWrite) throws Exception {
        socketWrite.write('\r');
        socketWrite.write('\n');
    }

    private static void writePayload(
            final OutputStream socketWrite,
            final byte[] payloadBytes,
            final int count) throws Exception {

        socketWrite.write(payloadBytes, 0, count);
    }

    private ChunkEncoder() { }
}
