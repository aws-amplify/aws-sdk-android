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

package com.amazonaws.kinesisvideo.internal.producer;

/**
 * Kinesis Video client object metrics provided by the native codebase.
 *
 * NOTE: The interesting aspect of this class is that it has a setter method to set all the values instead of individual
 * ones or a constructor. This is done for the performance optimization reasons.
 */
public class KinesisVideoMetrics {
    private long contentStoreSize = 0;
    private long contentStoreAvailableSize = 0;
    private long contentStoreAllocatedSize = 0;
    private long totalContentViewSize = 0;
    private long totalFrameRate = 0;
    private long totalTransferRate = 0;

    /**
     * Sets the metrics - will be called from the native code
     *
     * @param contentStoreSize content store size
     * @param contentStoreAllocatedSize allocated size
     * @param contentStoreAvailableSize available size
     * @param totalContentViewSize total size of the content views for all streams
     * @param totalFrameRate total frame rate for all streams
     * @param totalTransferRate total transfer rate for all streams in bytes per second
     */
    public void setMetrics(final long contentStoreSize,
                           final long contentStoreAllocatedSize,
                           final long contentStoreAvailableSize,
                           final long totalContentViewSize,
                           final long totalFrameRate,
                           final long totalTransferRate) {
        this.contentStoreSize = contentStoreSize;
        this.contentStoreAllocatedSize = contentStoreAllocatedSize;
        this.contentStoreAvailableSize = contentStoreAvailableSize;
        this.totalContentViewSize = totalContentViewSize;
        this.totalFrameRate = totalFrameRate;
        this.totalTransferRate = totalTransferRate;
    }

    /**
     * Returns the overall content store size
     * @return content store size
     */
    public long getContentStoreSize() {
        return contentStoreSize;
    }

    /**
     * Returns the available size
     * @return available size
     */
    public long getContentStoreAvailableSize() {
        return contentStoreAvailableSize;
    }

    /**
     * Returns the allocated size
     * @return allocated size
     */
    public long getContentStoreAllocatedSize() {
        return contentStoreAllocatedSize;
    }

    /**
     * Returns the total allocated memory size for the content view objects for all streams
     * @return total content view size
     */
    public long getTotalContentViewSize() {
        return totalContentViewSize;
    }

    /**
     * Returns the total frame rate for all streams being streamed
     * @return total frame rate
     */
    public long getTotalFrameRate() {
        return totalFrameRate;
    }

    /**
     * Returns the total transfer rate in bytes per second for all the streams
     * @return total bytes per second transfer rate
     */
    public long getTotalTransferRate() {
        return totalTransferRate;
    }
}
