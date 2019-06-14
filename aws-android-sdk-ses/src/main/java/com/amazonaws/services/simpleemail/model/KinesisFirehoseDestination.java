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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the delivery stream ARN and the IAM role ARN associated with an
 * Amazon Kinesis Firehose event destination.
 * </p>
 * <p>
 * Event destinations, such as Amazon Kinesis Firehose, are associated with
 * configuration sets, which enable you to publish email sending events. For
 * information about using configuration sets, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class KinesisFirehoseDestination implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending
     * events to the Amazon Kinesis Firehose stream.
     * </p>
     */
    private String iAMRoleARN;

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events
     * should be published to.
     * </p>
     */
    private String deliveryStreamARN;

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending
     * events to the Amazon Kinesis Firehose stream.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role under which Amazon SES publishes email
     *         sending events to the Amazon Kinesis Firehose stream.
     *         </p>
     */
    public String getIAMRoleARN() {
        return iAMRoleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending
     * events to the Amazon Kinesis Firehose stream.
     * </p>
     *
     * @param iAMRoleARN <p>
     *            The ARN of the IAM role under which Amazon SES publishes email
     *            sending events to the Amazon Kinesis Firehose stream.
     *            </p>
     */
    public void setIAMRoleARN(String iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending
     * events to the Amazon Kinesis Firehose stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMRoleARN <p>
     *            The ARN of the IAM role under which Amazon SES publishes email
     *            sending events to the Amazon Kinesis Firehose stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisFirehoseDestination withIAMRoleARN(String iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events
     * should be published to.
     * </p>
     *
     * @return <p>
     *         The ARN of the Amazon Kinesis Firehose stream that email sending
     *         events should be published to.
     *         </p>
     */
    public String getDeliveryStreamARN() {
        return deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events
     * should be published to.
     * </p>
     *
     * @param deliveryStreamARN <p>
     *            The ARN of the Amazon Kinesis Firehose stream that email
     *            sending events should be published to.
     *            </p>
     */
    public void setDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events
     * should be published to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryStreamARN <p>
     *            The ARN of the Amazon Kinesis Firehose stream that email
     *            sending events should be published to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisFirehoseDestination withDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
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
        if (getIAMRoleARN() != null)
            sb.append("IAMRoleARN: " + getIAMRoleARN() + ",");
        if (getDeliveryStreamARN() != null)
            sb.append("DeliveryStreamARN: " + getDeliveryStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIAMRoleARN() == null) ? 0 : getIAMRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryStreamARN() == null) ? 0 : getDeliveryStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseDestination == false)
            return false;
        KinesisFirehoseDestination other = (KinesisFirehoseDestination) obj;

        if (other.getIAMRoleARN() == null ^ this.getIAMRoleARN() == null)
            return false;
        if (other.getIAMRoleARN() != null
                && other.getIAMRoleARN().equals(this.getIAMRoleARN()) == false)
            return false;
        if (other.getDeliveryStreamARN() == null ^ this.getDeliveryStreamARN() == null)
            return false;
        if (other.getDeliveryStreamARN() != null
                && other.getDeliveryStreamARN().equals(this.getDeliveryStreamARN()) == false)
            return false;
        return true;
    }
}
