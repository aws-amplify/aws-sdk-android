/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Updates the outbound caller ID name, number, and outbound whisper flow for a
 * specified queue.
 * </p>
 * <important>
 * <ul>
 * <li>
 * <p>
 * If the phone number is claimed to a traffic distribution group that was
 * created in the same Region as the Amazon Connect instance where you are
 * calling this API, then you can use a full phone number ARN or a UUID for
 * <code>OutboundCallerIdNumberId</code>. However, if the phone number is
 * claimed to a traffic distribution group that is in one Region, and you are
 * calling this API from an instance in another Amazon Web Services Region that
 * is associated with the traffic distribution group, you must provide a full
 * phone number ARN. If a UUID is provided in this scenario, you will receive a
 * <code>ResourceNotFoundException</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Only use the phone number ARN format that doesn't contain
 * <code>instance</code> in the path, for example,
 * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This is
 * the same ARN format that is returned when you call the <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
 * >ListPhoneNumbersV2</a> API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you plan to use IAM policies to allow/deny access to this API for phone
 * number resources claimed to a traffic distribution group, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
 * >Allow or Deny queue API actions for phone numbers in a replica Region</a>.
 * </p>
 * </li>
 * </ul>
 * </important>
 */
public class UpdateQueueOutboundCallerConfigRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     */
    private OutboundCallerConfig outboundCallerConfig;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueOutboundCallerConfigRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The identifier for the queue.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueOutboundCallerConfigRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     *
     * @return <p>
     *         The outbound caller ID name, number, and outbound whisper flow.
     *         </p>
     */
    public OutboundCallerConfig getOutboundCallerConfig() {
        return outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     *
     * @param outboundCallerConfig <p>
     *            The outbound caller ID name, number, and outbound whisper
     *            flow.
     *            </p>
     */
    public void setOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
        this.outboundCallerConfig = outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCallerConfig <p>
     *            The outbound caller ID name, number, and outbound whisper
     *            flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueOutboundCallerConfigRequest withOutboundCallerConfig(
            OutboundCallerConfig outboundCallerConfig) {
        this.outboundCallerConfig = outboundCallerConfig;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getOutboundCallerConfig() != null)
            sb.append("OutboundCallerConfig: " + getOutboundCallerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCallerConfig() == null) ? 0 : getOutboundCallerConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQueueOutboundCallerConfigRequest == false)
            return false;
        UpdateQueueOutboundCallerConfigRequest other = (UpdateQueueOutboundCallerConfigRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getOutboundCallerConfig() == null ^ this.getOutboundCallerConfig() == null)
            return false;
        if (other.getOutboundCallerConfig() != null
                && other.getOutboundCallerConfig().equals(this.getOutboundCallerConfig()) == false)
            return false;
        return true;
    }
}
