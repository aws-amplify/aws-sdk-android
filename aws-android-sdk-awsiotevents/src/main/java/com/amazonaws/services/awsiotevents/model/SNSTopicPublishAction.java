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
 * Information required to publish the Amazon SNS message.
 * </p>
 */
public class SNSTopicPublishAction implements Serializable {
    /**
     * <p>
     * The ARN of the Amazon SNS target where the message is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetArn;

    /**
     * <p>
     * You can configure the action payload when you send a message as an Amazon
     * SNS push notification.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The ARN of the Amazon SNS target where the message is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the Amazon SNS target where the message is sent.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS target where the message is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetArn <p>
     *            The ARN of the Amazon SNS target where the message is sent.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS target where the message is sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetArn <p>
     *            The ARN of the Amazon SNS target where the message is sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SNSTopicPublishAction withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message as an Amazon
     * SNS push notification.
     * </p>
     *
     * @return <p>
     *         You can configure the action payload when you send a message as
     *         an Amazon SNS push notification.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message as an Amazon
     * SNS push notification.
     * </p>
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            as an Amazon SNS push notification.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message as an Amazon
     * SNS push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            as an Amazon SNS push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SNSTopicPublishAction withPayload(Payload payload) {
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
        if (getTargetArn() != null)
            sb.append("targetArn: " + getTargetArn() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNSTopicPublishAction == false)
            return false;
        SNSTopicPublishAction other = (SNSTopicPublishAction) obj;

        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
