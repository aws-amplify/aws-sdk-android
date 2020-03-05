/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
