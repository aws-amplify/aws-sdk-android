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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * A wrapper type for the attributes of an Amazon SNS subscription.
 * </p>
 */
public class Subscription implements Serializable {
    /**
     * <p>
     * The subscription's ARN.
     * </p>
     */
    private String subscriptionArn;

    /**
     * <p>
     * The subscription's owner.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The ARN of the subscription's topic.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The subscription's ARN.
     * </p>
     *
     * @return <p>
     *         The subscription's ARN.
     *         </p>
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }

    /**
     * <p>
     * The subscription's ARN.
     * </p>
     *
     * @param subscriptionArn <p>
     *            The subscription's ARN.
     *            </p>
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The subscription's ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionArn <p>
     *            The subscription's ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
        return this;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     *
     * @return <p>
     *         The subscription's owner.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     *
     * @param owner <p>
     *            The subscription's owner.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The subscription's owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     *
     * @return <p>
     *         The subscription's protocol.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     *
     * @param protocol <p>
     *            The subscription's protocol.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The subscription's protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     *
     * @return <p>
     *         The subscription's endpoint (format depends on the protocol).
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     *
     * @param endpoint <p>
     *            The subscription's endpoint (format depends on the protocol).
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The subscription's endpoint (format depends on the protocol).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The ARN of the subscription's topic.
     * </p>
     *
     * @return <p>
     *         The ARN of the subscription's topic.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the subscription's topic.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the subscription's topic.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the subscription's topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the subscription's topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withTopicArn(String topicArn) {
        this.topicArn = topicArn;
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
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: " + getSubscriptionArn() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;

        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null
                && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }
}
