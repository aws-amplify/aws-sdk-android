/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Sends information about the detector model instance and the event that
 * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
 * </p>
 */
public class FirehoseAction implements Serializable {
    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream where the data is
     * written.
     * </p>
     */
    private String deliveryStreamName;

    /**
     * <p>
     * A character separator that is used to separate records written to the
     * Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline),
     * '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     */
    private String separator;

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream where the data is
     * written.
     * </p>
     *
     * @return <p>
     *         The name of the Kinesis Data Firehose delivery stream where the
     *         data is written.
     *         </p>
     */
    public String getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream where the data is
     * written.
     * </p>
     *
     * @param deliveryStreamName <p>
     *            The name of the Kinesis Data Firehose delivery stream where
     *            the data is written.
     *            </p>
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream where the data is
     * written.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryStreamName <p>
     *            The name of the Kinesis Data Firehose delivery stream where
     *            the data is written.
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
     * A character separator that is used to separate records written to the
     * Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline),
     * '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @return <p>
     *         A character separator that is used to separate records written to
     *         the Kinesis Data Firehose delivery stream. Valid values are: '\n'
     *         (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *         </p>
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * <p>
     * A character separator that is used to separate records written to the
     * Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline),
     * '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @param separator <p>
     *            A character separator that is used to separate records written
     *            to the Kinesis Data Firehose delivery stream. Valid values
     *            are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ','
     *            (comma).
     *            </p>
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * <p>
     * A character separator that is used to separate records written to the
     * Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline),
     * '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([\n\t])|(\r\n)|(,)<br/>
     *
     * @param separator <p>
     *            A character separator that is used to separate records written
     *            to the Kinesis Data Firehose delivery stream. Valid values
     *            are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ','
     *            (comma).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @return <p>
     *         You can configure the action payload when you send a message to
     *         an Amazon Kinesis Data Firehose delivery stream.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withPayload(Payload payload) {
        this.payload = payload;
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
        if (getDeliveryStreamName() != null)
            sb.append("deliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getSeparator() != null)
            sb.append("separator: " + getSeparator() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
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
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
