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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the shard count of the specified stream to the specified number of
 * shards.
 * </p>
 * <p>
 * Updating the shard count is an asynchronous operation. Upon receiving the
 * request, Kinesis Data Streams returns immediately and sets the status of the
 * stream to <code>UPDATING</code>. After the update is complete, Kinesis Data
 * Streams sets the status of the stream back to <code>ACTIVE</code>. Depending
 * on the size of the stream, the scaling action could take a few minutes to
 * complete. You can continue to read and write data to your stream while its
 * status is <code>UPDATING</code>.
 * </p>
 * <p>
 * To update the shard count, Kinesis Data Streams performs splits or merges on
 * individual shards. This can cause short-lived shards to be created, in
 * addition to the final shards. We recommend that you double or halve the shard
 * count, as this results in the fewest number of splits or merges.
 * </p>
 * <p>
 * This operation has the following limits. You cannot do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Scale more than twice per rolling 24-hour period per stream
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale up to more than double your current shard count for a stream
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale down below half your current shard count for a stream
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale up to more than 500 shards in a stream
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale a stream with more than 500 shards down unless the result is less than
 * 500 shards
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale up to more than the shard limit for your account
 * </p>
 * </li>
 * </ul>
 * <p>
 * For the default limits for an AWS account, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
 * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
 * Guide</i>. To request an increase in the call rate limit, the shard limit for
 * this API, or your overall shard limit, use the <a href=
 * "https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase&amp;limitType=service-code-kinesis"
 * >limits form</a>.
 * </p>
 */
public class UpdateShardCountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The new number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer targetShardCount;

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     */
    private String scalingType;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
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
     * <b>Length: </b>1 - 128<br/>
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
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateShardCountRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The new number of shards.
     *         </p>
     */
    public Integer getTargetShardCount() {
        return targetShardCount;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param targetShardCount <p>
     *            The new number of shards.
     *            </p>
     */
    public void setTargetShardCount(Integer targetShardCount) {
        this.targetShardCount = targetShardCount;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param targetShardCount <p>
     *            The new number of shards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateShardCountRequest withTargetShardCount(Integer targetShardCount) {
        this.targetShardCount = targetShardCount;
        return this;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     *
     * @return <p>
     *         The scaling type. Uniform scaling creates shards of equal size.
     *         </p>
     * @see ScalingType
     */
    public String getScalingType() {
        return scalingType;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     *
     * @param scalingType <p>
     *            The scaling type. Uniform scaling creates shards of equal
     *            size.
     *            </p>
     * @see ScalingType
     */
    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     *
     * @param scalingType <p>
     *            The scaling type. Uniform scaling creates shards of equal
     *            size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingType
     */
    public UpdateShardCountRequest withScalingType(String scalingType) {
        this.scalingType = scalingType;
        return this;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     *
     * @param scalingType <p>
     *            The scaling type. Uniform scaling creates shards of equal
     *            size.
     *            </p>
     * @see ScalingType
     */
    public void setScalingType(ScalingType scalingType) {
        this.scalingType = scalingType.toString();
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNIFORM_SCALING
     *
     * @param scalingType <p>
     *            The scaling type. Uniform scaling creates shards of equal
     *            size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingType
     */
    public UpdateShardCountRequest withScalingType(ScalingType scalingType) {
        this.scalingType = scalingType.toString();
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
        if (getTargetShardCount() != null)
            sb.append("TargetShardCount: " + getTargetShardCount() + ",");
        if (getScalingType() != null)
            sb.append("ScalingType: " + getScalingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetShardCount() == null) ? 0 : getTargetShardCount().hashCode());
        hashCode = prime * hashCode
                + ((getScalingType() == null) ? 0 : getScalingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateShardCountRequest == false)
            return false;
        UpdateShardCountRequest other = (UpdateShardCountRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getTargetShardCount() == null ^ this.getTargetShardCount() == null)
            return false;
        if (other.getTargetShardCount() != null
                && other.getTargetShardCount().equals(this.getTargetShardCount()) == false)
            return false;
        if (other.getScalingType() == null ^ this.getScalingType() == null)
            return false;
        if (other.getScalingType() != null
                && other.getScalingType().equals(this.getScalingType()) == false)
            return false;
        return true;
    }
}
