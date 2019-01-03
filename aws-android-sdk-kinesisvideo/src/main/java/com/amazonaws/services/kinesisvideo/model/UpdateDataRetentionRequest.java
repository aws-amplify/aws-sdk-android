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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Increases or decreases the stream's data retention period by the value that
 * you specify. To indicate whether you want to increase or decrease the data
 * retention period, specify the <code>Operation</code> parameter in the request
 * body. In the request, you must specify either the <code>StreamName</code> or
 * the <code>StreamARN</code>.
 * </p>
 * <note>
 * <p>
 * The retention period that you specify replaces the current value.
 * </p>
 * </note>
 * <p>
 * This operation requires permission for the
 * <code>KinesisVideo:UpdateDataRetention</code> action.
 * </p>
 * <p>
 * Changing the data retention period affects the data in the stream as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the data retention period is increased, existing data is retained for the
 * new retention period. For example, if the data retention period is increased
 * from one hour to seven hours, all existing data is retained for seven hours.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the data retention period is decreased, existing data is retained for the
 * new retention period. For example, if the data retention period is decreased
 * from seven hours to one hour, all existing data is retained for one hour, and
 * any data older than one hour is deleted immediately.
 * </p>
 * </li>
 * </ul>
 */
public class UpdateDataRetentionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you
     * want to change.
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
     * The version of the stream whose retention period you want to change. To
     * get the version, call either the <code>DescribeStream</code> or the
     * <code>ListStreams</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String currentVersion;

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     */
    private String operation;

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the
     * current value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer dataRetentionChangeInHours;

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream whose retention period you want to change.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream whose retention period you want to
     *            change.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
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
     *            The name of the stream whose retention period you want to
     *            change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you
     * want to change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream whose retention
     *         period you want to change.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you
     * want to change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream whose retention
     *            period you want to change.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you
     * want to change.
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
     *            The Amazon Resource Name (ARN) of the stream whose retention
     *            period you want to change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To
     * get the version, call either the <code>DescribeStream</code> or the
     * <code>ListStreams</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The version of the stream whose retention period you want to
     *         change. To get the version, call either the
     *         <code>DescribeStream</code> or the <code>ListStreams</code> API.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To
     * get the version, call either the <code>DescribeStream</code> or the
     * <code>ListStreams</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The version of the stream whose retention period you want to
     *            change. To get the version, call either the
     *            <code>DescribeStream</code> or the <code>ListStreams</code>
     *            API.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To
     * get the version, call either the <code>DescribeStream</code> or the
     * <code>ListStreams</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The version of the stream whose retention period you want to
     *            change. To get the version, call either the
     *            <code>DescribeStream</code> or the <code>ListStreams</code>
     *            API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataRetentionRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @return <p>
     *         Indicates whether you want to increase or decrease the retention
     *         period.
     *         </p>
     * @see UpdateDataRetentionOperation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation <p>
     *            Indicates whether you want to increase or decrease the
     *            retention period.
     *            </p>
     * @see UpdateDataRetentionOperation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation <p>
     *            Indicates whether you want to increase or decrease the
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateDataRetentionOperation
     */
    public UpdateDataRetentionRequest withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation <p>
     *            Indicates whether you want to increase or decrease the
     *            retention period.
     *            </p>
     * @see UpdateDataRetentionOperation
     */
    public void setOperation(UpdateDataRetentionOperation operation) {
        this.operation = operation.toString();
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION
     *
     * @param operation <p>
     *            Indicates whether you want to increase or decrease the
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateDataRetentionOperation
     */
    public UpdateDataRetentionRequest withOperation(UpdateDataRetentionOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the
     * current value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The retention period, in hours. The value you specify replaces
     *         the current value.
     *         </p>
     */
    public Integer getDataRetentionChangeInHours() {
        return dataRetentionChangeInHours;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the
     * current value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param dataRetentionChangeInHours <p>
     *            The retention period, in hours. The value you specify replaces
     *            the current value.
     *            </p>
     */
    public void setDataRetentionChangeInHours(Integer dataRetentionChangeInHours) {
        this.dataRetentionChangeInHours = dataRetentionChangeInHours;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the
     * current value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param dataRetentionChangeInHours <p>
     *            The retention period, in hours. The value you specify replaces
     *            the current value.
     *            </p>
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
