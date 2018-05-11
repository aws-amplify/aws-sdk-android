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

package com.amazonaws.kinesisvideo.producer;

/**
 * Class to represent the stream description object coming from a successful call to the DescribeStream service API.
 */
public class StreamDescription {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int STREAM_DESCRIPTION_CURRENT_VERSION = 0;

    private final int mVersion;
    private final String mDeviceName;
    private final String mStreamName;
    private final String mContentType;
    private final String mUpdateVersion;
    private final String mStreamArn;
    private final StreamStatus mStreamStatus;
    private final long mCreationTime;

    public StreamDescription(int version, String deviceName, String streamName, String contentType, String updateVersion, String streamArn, StreamStatus streamStatus, long creationTime) {
        this.mVersion = version;
        this.mDeviceName = deviceName;
        this.mStreamName = streamName;
        this.mContentType = contentType;
        this.mUpdateVersion = updateVersion;
        this.mStreamArn = streamArn;
        this.mStreamStatus = streamStatus;
        this.mCreationTime = creationTime;
    }

    public int getVersion() {
        return mVersion;
    }

    public String getDeviceName() {
        return mDeviceName;
    }

    public String getStreamName() {
        return mStreamName;
    }

    public String getContentType() {
        return mContentType;
    }

    public String getUpdateVersion() {
        return mUpdateVersion;
    }

    public String getStreamArn() {
        return mStreamArn;
    }

    public int getStreamStatus() {
        return mStreamStatus.intValue();
    }

    public long getCreationTime() {
        return mCreationTime;
    }
}
