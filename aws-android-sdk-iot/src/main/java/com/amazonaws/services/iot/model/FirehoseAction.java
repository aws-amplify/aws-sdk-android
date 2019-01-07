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
 * Describes an action that writes data to an Amazon Kinesis Firehose stream.
 * </p>
 */
public class FirehoseAction implements Serializable {
    /**
     * <p>
     * The IAM role that grants access to the Amazon Kinesis Firehose stream.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The delivery stream name.
     * </p>
     */
    private String deliveryStreamName;

    /**
     * <p>
     * A character separator that will be used to separate records written to
     * the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n'
     * (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     */
    private String separator;

    /**
     * <p>
     * The IAM role that grants access to the Amazon Kinesis Firehose stream.
     * </p>
     *
     * @return <p>
     *         The IAM role that grants access to the Amazon Kinesis Firehose
     *         stream.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role that grants access to the Amazon Kinesis Firehose stream.
     * </p>
     *
     * @param roleArn <p>
     *            The IAM role that grants access to the Amazon Kinesis Firehose
     *            stream.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that grants access to the Amazon Kinesis Firehose stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The IAM role that grants access to the Amazon Kinesis Firehose
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The delivery stream name.
     * </p>
     *
     * @return <p>
     *         The delivery stream name.
     *         </p>
     */
    public String getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * <p>
     * The delivery stream name.
     * </p>
     *
     * @param deliveryStreamName <p>
     *            The delivery stream name.
     *            </p>
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The delivery stream name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryStreamName <p>
     *            The delivery stream name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * <p>
     * A character separator that will be used to separate records written to
     * the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n'
     * (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @return <p>
     *         A character separator that will be used to separate records
     *         written to the Firehose stream. Valid values are: '\n' (newline),
     *         '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *         </p>
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * <p>
     * A character separator that will be used to separate records written to
     * the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n'
     * (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @param separator <p>
     *            A character separator that will be used to separate records
     *            written to the Firehose stream. Valid values are: '\n'
     *            (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *            </p>
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * <p>
     * A character separator that will be used to separate records written to
     * the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n'
     * (Windows newline), ',' (comma).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @param separator <p>
     *            A character separator that will be used to separate records
     *            written to the Firehose stream. Valid values are: '\n'
     *            (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withSeparator(String separator) {
        this.separator = separator;
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
        if (getDeliveryStreamName() != null)
            sb.append("deliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getSeparator() != null)
            sb.append("separator: " + getSeparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirehoseAction == false)
            return false;
        FirehoseAction other = (FirehoseAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null
                && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getSeparator() == null ^ this.getSeparator() == null)
            return false;
        if (other.getSeparator() != null
                && other.getSeparator().equals(this.getSeparator()) == false)
            return false;
        return true;
    }
}
