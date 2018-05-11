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

/**
 * Interface for throttler based on bandwidth.
 */
public interface BandwidthThrottler {
    /**
     * Set upload max bandwidth in kilobits per seconds.
     *
     * @param kbps max bandwidth in kbps
     */
    void setUpstreamKbps(long kbps);

    /**
     * Get the allowed number of bytes to read from or write to socket.
     *
     * @param len maximum number of bytes.
     * @return allowed bytes
     */
    int getAllowedBytes(int len);
}
