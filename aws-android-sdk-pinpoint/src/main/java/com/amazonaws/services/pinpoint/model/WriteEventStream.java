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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Request to save an EventStream.
 */
public class WriteEventStream implements Serializable {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose
     * delivery stream to which you want to publish events. Firehose ARN:
     * arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     * ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */
    private String destinationStreamArn;

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the
     * stream in your account.
     */
    private String roleArn;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose
     * delivery stream to which you want to publish events. Firehose ARN:
     * arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     * ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream or
     *         Firehose delivery stream to which you want to publish events.
     *         Firehose ARN:
     *         arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
     *         Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */
    public String getDestinationStreamArn() {
        return destinationStreamArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose
     * delivery stream to which you want to publish events. Firehose ARN:
     * arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     * ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     *
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon
     *            Kinesis stream or Firehose delivery stream to which you want
     *            to publish events. Firehose ARN:
     *            arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
     *            Kinesis ARN:
     *            arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */
    public void setDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose
     * delivery stream to which you want to publish events. Firehose ARN:
     * arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     * ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon
     *            Kinesis stream or Firehose delivery stream to which you want
     *            to publish events. Firehose ARN:
     *            arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
     *            Kinesis ARN:
     *            arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteEventStream withDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
        return this;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the
     * stream in your account.
     *
     * @return The IAM role that authorizes Amazon Pinpoint to publish events to
     *         the stream in your account.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the
     * stream in your account.
     *
     * @param roleArn The IAM role that authorizes Amazon Pinpoint to publish
     *            events to the stream in your account.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the
     * stream in your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The IAM role that authorizes Amazon Pinpoint to publish
     *            events to the stream in your account.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteEventStream withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getDestinationStreamArn() != null)
            sb.append("DestinationStreamArn: " + getDestinationStreamArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationStreamArn() == null) ? 0 : getDestinationStreamArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteEventStream == false)
            return false;
        WriteEventStream other = (WriteEventStream) obj;

        if (other.getDestinationStreamArn() == null ^ this.getDestinationStreamArn() == null)
            return false;
        if (other.getDestinationStreamArn() != null
                && other.getDestinationStreamArn().equals(this.getDestinationStreamArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
