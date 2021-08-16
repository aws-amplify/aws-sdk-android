package com.amazonaws.kinesisvideo.producer;

/**
 * Class to represent the stream description object coming from a successful call to the DescribeStream service API.
 *
 * @author dduc
 */
public class StreamDescription {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int STREAM_DESCRIPTION_CURRENT_VERSION = 1;

    private final int mVersion;
    private final String mDeviceName;
    private final String mStreamName;
    private final String mContentType;
    private final String mUpdateVersion;
    private final String mStreamArn;
    private final StreamStatus mStreamStatus;
    private final long mCreationTime;
    private final long mRetention;
    private final String mKmsKeyId;

    public StreamDescription(int version, String deviceName, String streamName, String contentType, String updateVersion, String streamArn, StreamStatus streamStatus, long creationTime) {
        this(version, deviceName, streamName, contentType, updateVersion, streamArn, streamStatus, creationTime, 0,"");
    }

    public StreamDescription(int version, String deviceName, String streamName, String contentType,
                             String updateVersion, String streamArn, StreamStatus streamStatus, long creationTime,
                             long retention, String kmsKeyId) {
        this.mVersion = version;
        this.mDeviceName = deviceName;
        this.mStreamName = streamName;
        this.mContentType = contentType;
        this.mUpdateVersion = updateVersion;
        this.mStreamArn = streamArn;
        this.mStreamStatus = streamStatus;
        this.mCreationTime = creationTime;
        this.mRetention = retention;
        this.mKmsKeyId = kmsKeyId;
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

    public long getRetention() {
        return mRetention;
    }

    public String getKmsKeyId() {
        return mKmsKeyId;
    }
}
