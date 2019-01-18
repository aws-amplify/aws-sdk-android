/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * An object describing a Kinesis video stream.
 * </p>
 */
public class StreamInfo implements Serializable {
    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String deviceName;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     */
    private String mediaType;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     */
    private String status;

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer dataRetentionInHours;

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the device that is associated with the stream.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName <p>
     *            The name of the device that is associated with the stream.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device that is associated with the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName <p>
     *            The name of the device that is associated with the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @return <p>
     *         The <code>MediaType</code> of the stream.
     *         </p>
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType <p>
     *            The <code>MediaType</code> of the stream.
     *            </p>
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The <code>MediaType</code> of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType <p>
     *            The <code>MediaType</code> of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ID of the AWS Key Management Service (AWS KMS) key that
     *         Kinesis Video Streams uses to encrypt data on the stream.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key that
     *            Kinesis Video Streams uses to encrypt data on the stream.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video
     * Streams uses to encrypt data on the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key that
     *            Kinesis Video Streams uses to encrypt data on the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The version of the stream.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param version <p>
     *            The version of the stream.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param version <p>
     *            The version of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @return <p>
     *         The status of the stream.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param status <p>
     *            The status of the stream.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param status <p>
     *            The status of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public StreamInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param status <p>
     *            The status of the stream.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param status <p>
     *            The status of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public StreamInfo withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     *
     * @return <p>
     *         A time stamp that indicates when the stream was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     *
     * @param creationTime <p>
     *            A time stamp that indicates when the stream was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp that indicates when the stream was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A time stamp that indicates when the stream was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         How long the stream retains data, in hours.
     *         </p>
     */
    public Integer getDataRetentionInHours() {
        return dataRetentionInHours;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            How long the stream retains data, in hours.
     *            </p>
     */
    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * How long the stream retains data, in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            How long the stream retains data, in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamInfo withDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getMediaType() != null)
            sb.append("MediaType: " + getMediaType() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: " + getDataRetentionInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamInfo == false)
            return false;
        StreamInfo other = (StreamInfo) obj;

        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null
                && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }
}
