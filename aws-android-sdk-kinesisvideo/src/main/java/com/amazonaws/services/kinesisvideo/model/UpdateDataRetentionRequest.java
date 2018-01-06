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

public class UpdateDataRetentionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the streamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The new value for the streamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * The new value for the currentVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String currentVersion;

    /**
     * The new value for the operation property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     */
    private String operation;

    /**
     * The new value for the dataRetentionChangeInHours property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer dataRetentionChangeInHours;

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
    public UpdateDataRetentionRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Returns the value of the streamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return The value of the streamARN property for this object.
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * Sets the value of streamARN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN The new value for the streamARN property for this
     *            object.
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * Sets the value of the streamARN property for this object.
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
     * @param streamARN The new value for the streamARN property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * Returns the value of the currentVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return The value of the currentVersion property for this object.
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * Sets the value of currentVersion
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion The new value for the currentVersion property for
     *            this object.
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * Sets the value of the currentVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion The new value for the currentVersion property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * Returns the value of the operation property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @return The value of the operation property for this object.
     * @see UpdateDataRetentionOperation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of operation
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation The new value for the operation property for this
     *            object.
     * @see UpdateDataRetentionOperation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Sets the value of the operation property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation The new value for the operation property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateDataRetentionOperation
     */
    public UpdateDataRetentionRequest withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Sets the value of operation
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation The new value for the operation property for this
     *            object.
     * @see UpdateDataRetentionOperation
     */
    public void setOperation(UpdateDataRetentionOperation operation) {
        this.operation = operation.toString();
    }

    /**
     * Sets the value of the operation property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation The new value for the operation property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateDataRetentionOperation
     */
    public UpdateDataRetentionRequest withOperation(UpdateDataRetentionOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * Returns the value of the dataRetentionChangeInHours property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the dataRetentionChangeInHours property for this
     *         object.
     */
    public Integer getDataRetentionChangeInHours() {
        return dataRetentionChangeInHours;
    }

    /**
     * Sets the value of dataRetentionChangeInHours
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param dataRetentionChangeInHours The new value for the
     *            dataRetentionChangeInHours property for this object.
     */
    public void setDataRetentionChangeInHours(Integer dataRetentionChangeInHours) {
        this.dataRetentionChangeInHours = dataRetentionChangeInHours;
    }

    /**
     * Sets the value of the dataRetentionChangeInHours property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param dataRetentionChangeInHours The new value for the
     *            dataRetentionChangeInHours property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withDataRetentionChangeInHours(
            Integer dataRetentionChangeInHours) {
        this.dataRetentionChangeInHours = dataRetentionChangeInHours;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getOperation() != null)
            sb.append("Operation: " + getOperation() + ",");
        if (getDataRetentionChangeInHours() != null)
            sb.append("DataRetentionChangeInHours: " + getDataRetentionChangeInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataRetentionChangeInHours() == null) ? 0 : getDataRetentionChangeInHours()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataRetentionRequest == false)
            return false;
        UpdateDataRetentionRequest other = (UpdateDataRetentionRequest) obj;

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
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null
                && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getDataRetentionChangeInHours() == null
                ^ this.getDataRetentionChangeInHours() == null)
            return false;
        if (other.getDataRetentionChangeInHours() != null
                && other.getDataRetentionChangeInHours().equals(
                        this.getDataRetentionChangeInHours()) == false)
            return false;
        return true;
    }
}
