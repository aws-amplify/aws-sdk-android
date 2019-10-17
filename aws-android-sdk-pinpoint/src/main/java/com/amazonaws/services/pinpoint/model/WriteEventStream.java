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
 * <p>
 * Specifies the Amazon Resource Name (ARN) of an event stream to publish events
 * to and the AWS Identity and Access Management (IAM) role to use when
 * publishing those events.
 * </p>
 */
public class WriteEventStream implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or
     * Amazon Kinesis Data Firehose delivery stream that you want to publish
     * event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable
     * >region</replaceable>:<replaceable>account-id<
     * /replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose
     * :<replaceable>region</replaceable>:<replaceable>account-id
     * </replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     */
    private String destinationStreamArn;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or
     * Amazon Kinesis Data Firehose delivery stream that you want to publish
     * event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable
     * >region</replaceable>:<replaceable>account-id<
     * /replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose
     * :<replaceable>region</replaceable>:<replaceable>account-id
     * </replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Kinesis data stream
     *         or Amazon Kinesis Data Firehose delivery stream that you want to
     *         publish event data to.
     *         </p>
     *         <p>
     *         For a Kinesis data stream, the ARN format is:
     *         arn:aws:kinesis:<replaceable
     *         >region</replaceable>:<replaceable>account
     *         -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *         </p>
     *         <p>
     *         For a Kinesis Data Firehose delivery stream, the ARN format is:
     *         arn:aws:firehose:<replaceable>region</replaceable>:<replaceable>
     *         account
     *         -id</replaceable>:deliverystream/<replaceable>stream_name</
     *         replaceable>
     *         </p>
     */
    public String getDestinationStreamArn() {
        return destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or
     * Amazon Kinesis Data Firehose delivery stream that you want to publish
     * event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable
     * >region</replaceable>:<replaceable>account-id<
     * /replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose
     * :<replaceable>region</replaceable>:<replaceable>account-id
     * </replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     *
     * @param destinationStreamArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Kinesis data
     *            stream or Amazon Kinesis Data Firehose delivery stream that
     *            you want to publish event data to.
     *            </p>
     *            <p>
     *            For a Kinesis data stream, the ARN format is:
     *            arn:aws:kinesis:<
     *            replaceable>region</replaceable>:<replaceable>
     *            account-id</replaceable
     *            >:stream/<replaceable>stream_name</replaceable>
     *            </p>
     *            <p>
     *            For a Kinesis Data Firehose delivery stream, the ARN format
     *            is: arn:aws:firehose:<replaceable>region</replaceable>:<
     *            replaceable
     *            >account-id</replaceable>:deliverystream/<replaceable
     *            >stream_name</replaceable>
     *            </p>
     */
    public void setDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or
     * Amazon Kinesis Data Firehose delivery stream that you want to publish
     * event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable
     * >region</replaceable>:<replaceable>account-id<
     * /replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose
     * :<replaceable>region</replaceable>:<replaceable>account-id
     * </replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationStreamArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Kinesis data
     *            stream or Amazon Kinesis Data Firehose delivery stream that
     *            you want to publish event data to.
     *            </p>
     *            <p>
     *            For a Kinesis data stream, the ARN format is:
     *            arn:aws:kinesis:<
     *            replaceable>region</replaceable>:<replaceable>
     *            account-id</replaceable
     *            >:stream/<replaceable>stream_name</replaceable>
     *            </p>
     *            <p>
     *            For a Kinesis Data Firehose delivery stream, the ARN format
     *            is: arn:aws:firehose:<replaceable>region</replaceable>:<
     *            replaceable
     *            >account-id</replaceable>:deliverystream/<replaceable
     *            >stream_name</replaceable>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteEventStream withDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account.
     * </p>
     *
     * @return <p>
     *         The AWS Identity and Access Management (IAM) role that authorizes
     *         Amazon Pinpoint to publish event data to the stream in your AWS
     *         account.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account.
     * </p>
     *
     * @param roleArn <p>
     *            The AWS Identity and Access Management (IAM) role that
     *            authorizes Amazon Pinpoint to publish event data to the stream
     *            in your AWS account.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The AWS Identity and Access Management (IAM) role that
     *            authorizes Amazon Pinpoint to publish event data to the stream
     *            in your AWS account.
     *            </p>
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
