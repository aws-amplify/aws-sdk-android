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
import java.io.InputStream;

/**
 * Calls Throttler class each read operation
 * so that Throttler measures and enforces the bandwidth it was configured to enforce
 */
public class ThrottledInputStream extends InputStream {
    private static final int MS_IN_SEC = 1000;

    private final InputStream mUnthrottledInputStream;
    private final Throttler mThrottler;

    public ThrottledInputStream(final InputStream unthrottledInputStream,
                                final Throttler throttler) {
        mUnthrottledInputStream = unthrottledInputStream;
        mThrottler = throttler;
    }

    @Override
    public int read() throws IOException {
        mThrottler.throttle();
        return mUnthrottledInputStream.read();
    }
}
