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

package com.amazonaws.kinesisvideo.stream.throttling;

import java.io.IOException;
import java.io.OutputStream;

/**
 * An output stream that is bandwidth-throttled by a {@link BandwidthThrottler}. It redirects all write calls to the
 * throttler.
 */
public class BandwidthThrottledOutputStream extends OutputStream {
    private final OutputStream outputStream;
    private final BandwidthThrottler throttler;

    // This is so that we don't have to allocate it all the time. Just one byte!
    private final byte[] oneByteBuffer = new byte[1];

    public BandwidthThrottledOutputStream(final OutputStream outputStream,
                                          final BandwidthThrottler throttler) {
        this.outputStream = outputStream;
        this.throttler = throttler;
    }

    @Override
    public void write(final int b) throws IOException {
        oneByteBuffer[0] = (byte) b;
        write(oneByteBuffer, 0, 1);
    }

    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override
    public void write(final byte[] b, int off, int len) throws IOException {
        int bytesWritten = 0;
        while (bytesWritten < len) {
            final int allowedBytesToWrite = throttler.getAllowedBytes(len - bytesWritten);
            outputStream.write(b, off + bytesWritten, allowedBytesToWrite);
            bytesWritten += allowedBytesToWrite; // TODO: actually use the returned value of write()
        }
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }
}
