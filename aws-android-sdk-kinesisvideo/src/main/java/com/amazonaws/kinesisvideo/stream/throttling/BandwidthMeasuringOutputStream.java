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
 * Measures bytes per second, notifies the consumer callback about each measurement
 */
public class BandwidthMeasuringOutputStream extends OutputStream {

    private final OutputStream mOutputStream;
    private final OpsPerSecondMeasurer mOpsPerSecondMeasurer;
    
    public BandwidthMeasuringOutputStream(OutputStream outputStream, OpsPerSecondMeasurer opsPerSecondMeasurer) {
        this.mOutputStream = outputStream;
        this.mOpsPerSecondMeasurer = opsPerSecondMeasurer;
    }

    @Override
    public void write(final int b) throws IOException {
        mOpsPerSecondMeasurer.recordOperation();
        mOutputStream.write(b);
    }

}
