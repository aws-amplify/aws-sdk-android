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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A wrapper type for the topic's Amazon Resource Name (ARN).
 * </p>
 */
public class AwsSnsTopicDetails implements Serializable {
    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String kmsMasterKeyId;

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription
     * endpoints of an Amazon SNS topic.
     * </p>
     */
    private java.util.List<AwsSnsTopicSubscription> subscription;

    /**
     * <p>
     * The name of the topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String topicName;

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String owner;

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of an AWS-managed customer master key (CMK) for Amazon SNS
     *         or a custom CMK.
     *         </p>
     */
    public String getKmsMasterKeyId() {
        return kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsMasterKeyId <p>
     *            The ID of an AWS-managed customer master key (CMK) for Amazon
     *            SNS or a custom CMK.
     *            </p>
     */
    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsMasterKeyId <p>
     *            The ID of an AWS-managed customer master key (CMK) for Amazon
     *            SNS or a custom CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSnsTopicDetails withKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        return this;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription
     * endpoints of an Amazon SNS topic.
     * </p>
     *
     * @return <p>
     *         Subscription is an embedded property that describes the
     *         subscription endpoints of an Amazon SNS topic.
     *         </p>
     */
    public java.util.List<AwsSnsTopicSubscription> getSubscription() {
        return subscription;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription
     * endpoints of an Amazon SNS topic.
     * </p>
     *
     * @param subscription <p>
     *            Subscription is an embedded property that describes the
     *            subscription endpoints of an Amazon SNS topic.
     *            </p>
     */
    public void setSubscription(java.util.Collection<AwsSnsTopicSubscription> subscription) {
        if (subscription == null) {
            this.subscription = null;
            return;
        }

        this.subscription = new java.util.ArrayList<AwsSnsTopicSubscription>(subscription);
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription
     * endpoints of an Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscription <p>
     *            Subscription is an embedded property that describes the
     *            subscription endpoints of an Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSnsTopicDetails withSubscription(AwsSnsTopicSubscription... subscription) {
        if (getSubscription() == null) {
            this.subscription = new java.util.ArrayList<AwsSnsTopicSubscription>(
                    subscription.length);
        }
        for (AwsSnsTopicSubscription value : subscription) {
            this.subscription.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription
     * endpoints of an Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscription <p>
     *            Subscription is an embedded property that describes the
     *            subscription endpoints of an Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSnsTopicDetails withSubscription(
            java.util.Collection<AwsSnsTopicSubscription> subscription) {
        setSubscription(subscription);
        return this;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the topic.
     *         </p>
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param topicName <p>
     *            The name of the topic.
     *            </p>
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param topicName <p>
     *            The name of the topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSnsTopicDetails withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param owner <p>
     *            The subscription's owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSnsTopicDetails withOwner(String owner) {
        this.owner = owner;
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
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: " + getKmsMasterKeyId() + ",");
        if (getSubscription() != null)
            sb.append("Subscription: " + getSubscription() + ",");
        if (getTopicName() != null)
            sb.append("TopicName: " + getTopicName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getSubscription() == null) ? 0 : getSubscription().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSnsTopicDetails == false)
            return false;
        AwsSnsTopicDetails other = (AwsSnsTopicDetails) obj;

        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null
                && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getSubscription() == null ^ this.getSubscription() == null)
            return false;
        if (other.getSubscription() != null
                && other.getSubscription().equals(this.getSubscription()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null
                && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }
}
