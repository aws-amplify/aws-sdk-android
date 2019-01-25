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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to write data to an Amazon Kinesis stream.
 * </p>
 */
public class KinesisAction implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The partition key.
     * </p>
     */
    private String partitionKey;

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that grants access to the Amazon Kinesis
     *         stream.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access to the Amazon
     *            Kinesis stream.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access to the Amazon
     *            Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Kinesis stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     *
     * @param streamName <p>
     *            The name of the Amazon Kinesis stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName <p>
     *            The name of the Amazon Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisAction withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     *
     * @return <p>
     *         The partition key.
     *         </p>
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     *
     * @param partitionKey <p>
     *            The partition key.
     *            </p>
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * The partition key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionKey <p>
     *            The partition key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisAction withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getStreamName() != null)
            sb.append("streamName: " + getStreamName() + ",");
        if (getPartitionKey() != null)
            sb.append("partitionKey: " + getPartitionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisAction == false)
            return false;
        KinesisAction other = (KinesisAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null)
            return false;
        if (other.getPartitionKey() != null
                && other.getPartitionKey().equals(this.getPartitionKey()) == false)
            return false;
        return true;
    }
}
