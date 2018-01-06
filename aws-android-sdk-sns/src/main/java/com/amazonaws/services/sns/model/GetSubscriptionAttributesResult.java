/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Response for GetSubscriptionAttributes action.
 * </p>
 */
public class GetSubscriptionAttributesResult implements Serializable {
    /**
     * <p>
     * A map of the subscription's attributes. Attributes in this map include
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionArn</code> -- the subscription's ARN
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicArn</code> -- the topic ARN that the subscription is
     * associated with
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Owner</code> -- the AWS account ID of the subscription's owner
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmationWasAuthenticated</code> -- true if the subscription
     * confirmation request was authenticated
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> -- the JSON serialization of the
     * subscription's delivery policy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of the
     * effective delivery policy that takes into account the topic delivery
     * policy and account system defaults
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes = new java.util.HashMap<String, String>();

    /**
     * <p>
     * A map of the subscription's attributes. Attributes in this map include
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionArn</code> -- the subscription's ARN
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicArn</code> -- the topic ARN that the subscription is
     * associated with
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Owner</code> -- the AWS account ID of the subscription's owner
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmationWasAuthenticated</code> -- true if the subscription
     * confirmation request was authenticated
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> -- the JSON serialization of the
     * subscription's delivery policy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of the
     * effective delivery policy that takes into account the topic delivery
     * policy and account system defaults
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of the subscription's attributes. Attributes in this map
     *         include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SubscriptionArn</code> -- the subscription's ARN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TopicArn</code> -- the topic ARN that the subscription is
     *         associated with
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Owner</code> -- the AWS account ID of the subscription's
     *         owner
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmationWasAuthenticated</code> -- true if the
     *         subscription confirmation request was authenticated
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> -- the JSON serialization of the
     *         subscription's delivery policy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of
     *         the effective delivery policy that takes into account the topic
     *         delivery policy and account system defaults
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of the subscription's attributes. Attributes in this map include
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionArn</code> -- the subscription's ARN
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicArn</code> -- the topic ARN that the subscription is
     * associated with
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Owner</code> -- the AWS account ID of the subscription's owner
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmationWasAuthenticated</code> -- true if the subscription
     * confirmation request was authenticated
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> -- the JSON serialization of the
     * subscription's delivery policy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of the
     * effective delivery policy that takes into account the topic delivery
     * policy and account system defaults
     * </p>
     * </li>
     * </ul>
     *
     * @param attributes <p>
     *            A map of the subscription's attributes. Attributes in this map
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SubscriptionArn</code> -- the subscription's ARN
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TopicArn</code> -- the topic ARN that the subscription
     *            is associated with
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Owner</code> -- the AWS account ID of the subscription's
     *            owner
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmationWasAuthenticated</code> -- true if the
     *            subscription confirmation request was authenticated
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> -- the JSON serialization of the
     *            subscription's delivery policy
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EffectiveDeliveryPolicy</code> -- the JSON serialization
     *            of the effective delivery policy that takes into account the
     *            topic delivery policy and account system defaults
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of the subscription's attributes. Attributes in this map include
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionArn</code> -- the subscription's ARN
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicArn</code> -- the topic ARN that the subscription is
     * associated with
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Owner</code> -- the AWS account ID of the subscription's owner
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmationWasAuthenticated</code> -- true if the subscription
     * confirmation request was authenticated
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> -- the JSON serialization of the
     * subscription's delivery policy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of the
     * effective delivery policy that takes into account the topic delivery
     * policy and account system defaults
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of the subscription's attributes. Attributes in this map
     *            include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SubscriptionArn</code> -- the subscription's ARN
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TopicArn</code> -- the topic ARN that the subscription
     *            is associated with
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Owner</code> -- the AWS account ID of the subscription's
     *            owner
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmationWasAuthenticated</code> -- true if the
     *            subscription confirmation request was authenticated
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> -- the JSON serialization of the
     *            subscription's delivery policy
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EffectiveDeliveryPolicy</code> -- the JSON serialization
     *            of the effective delivery policy that takes into account the
     *            topic delivery policy and account system defaults
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSubscriptionAttributesResult withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of the subscription's attributes. Attributes in this map include
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionArn</code> -- the subscription's ARN
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopicArn</code> -- the topic ARN that the subscription is
     * associated with
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Owner</code> -- the AWS account ID of the subscription's owner
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmationWasAuthenticated</code> -- true if the subscription
     * confirmation request was authenticated
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> -- the JSON serialization of the
     * subscription's delivery policy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EffectiveDeliveryPolicy</code> -- the JSON serialization of the
     * effective delivery policy that takes into account the topic delivery
     * policy and account system defaults
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSubscriptionAttributesResult addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetSubscriptionAttributesResult clearAttributesEntries() {
        this.attributes = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubscriptionAttributesResult == false)
            return false;
        GetSubscriptionAttributesResult other = (GetSubscriptionAttributesResult) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
