/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the deviceName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String deviceName;

    /**
     * The new value for the streamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The new value for the mediaType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     */
    private String mediaType;

    /**
     * The new value for the kmsKeyId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * The new value for the dataRetentionInHours property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer dataRetentionInHours;

    /**
     * Returns the value of the deviceName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the deviceName property for this object.
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of deviceName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName The new value for the deviceName property for this
     *            object.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * Sets the value of the deviceName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName The new value for the deviceName property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Returns the value of the streamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the streamName property for this object.
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Sets the value of streamName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The new value for the streamName property for this
     *            object.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Sets the value of the streamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The new value for the streamName property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Returns the value of the mediaType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @return The value of the mediaType property for this object.
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of mediaType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType The new value for the mediaType property for this
     *            object.
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Sets the value of the mediaType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType The new value for the mediaType property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Returns the value of the kmsKeyId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return The value of the kmsKeyId property for this object.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Sets the value of kmsKeyId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId The new value for the kmsKeyId property for this object.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Sets the value of the kmsKeyId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId The new value for the kmsKeyId property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * Returns the value of the dataRetentionInHours property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the dataRetentionInHours property for this object.
     */
    public Integer getDataRetentionInHours() {
        return dataRetentionInHours;
    }

    /**
     * Sets the value of dataRetentionInHours
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours The new value for the dataRetentionInHours
     *            property for this object.
     */
    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * Sets the value of the dataRetentionInHours property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours The new value for the dataRetentionInHours
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withDataRetentionInHours(Integer dataRetentionInHours) {
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
        if (getMediaType() != null)
            sb.append("MediaType: " + getMediaType() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
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
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
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

        if (obj instanceof CreateStreamRequest == false)
            return false;
        CreateStreamRequest other = (CreateStreamRequest) obj;

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
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null
                && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }
}
