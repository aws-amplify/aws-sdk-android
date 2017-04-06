/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Decreases the Amazon Kinesis stream's retention period, which is the length
 * of time data records are accessible after they are added to the stream. The
 * minimum value of a stream's retention period is 24 hours.
 * </p>
 * <p>
 * This operation may result in lost data. For example, if the stream's
 * retention period is 48 hours and is decreased to 24 hours, any data already
 * in the stream that is older than 24 hours is inaccessible.
 * </p>
 */
public class DecreaseStreamRetentionPeriodRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be less than the
     * current retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream to modify.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream to modify.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseStreamRetentionPeriodRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be less than the
     * current retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @return <p>
     *         The new retention period of the stream, in hours. Must be less
     *         than the current retention period.
     *         </p>
     */
    public Integer getRetentionPeriodHours() {
        return retentionPeriodHours;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be less than the
     * current retention period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @param retentionPeriodHours <p>
     *            The new retention period of the stream, in hours. Must be less
     *            than the current retention period.
     *            </p>
     */
    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be less than the
     * current retention period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @param retentionPeriodHours <p>
     *            The new retention period of the stream, in hours. Must be less
     *            than the current retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseStreamRetentionPeriodRequest withRetentionPeriodHours(
            Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
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
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecreaseStreamRetentionPeriodRequest == false)
            return false;
        DecreaseStreamRetentionPeriodRequest other = (DecreaseStreamRetentionPeriodRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null
                && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        return true;
    }
}
