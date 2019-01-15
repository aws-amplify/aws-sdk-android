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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a subscription. If the subscription requires authentication for
 * deletion, only the owner of the subscription or the topic's owner can
 * unsubscribe, and an AWS signature is required. If the
 * <code>Unsubscribe</code> call does not require authentication and the
 * requester is not the subscription owner, a final cancellation message is
 * delivered to the endpoint, so that the endpoint owner can easily resubscribe
 * to the topic if the <code>Unsubscribe</code> request was unintended.
 * </p>
 */
public class UnsubscribeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the subscription to be deleted.
     * </p>
     */
    private String subscriptionArn;

    /**
     * Default constructor for UnsubscribeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public UnsubscribeRequest() {
    }

    /**
     * Constructs a new UnsubscribeRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param subscriptionArn <p>
     *            The ARN of the subscription to be deleted.
     *            </p>
     */
    public UnsubscribeRequest(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
    }

    /**
     * <p>
     * The ARN of the subscription to be deleted.
     * </p>
     *
     * @return <p>
     *         The ARN of the subscription to be deleted.
     *         </p>
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription to be deleted.
     * </p>
     *
     * @param subscriptionArn <p>
     *            The ARN of the subscription to be deleted.
     *            </p>
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription to be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionArn <p>
     *            The ARN of the subscription to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsubscribeRequest withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
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
            sb.append("SubscriptionArn: " + getSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsubscribeRequest == false)
            return false;
        UnsubscribeRequest other = (UnsubscribeRequest) obj;

        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null
                && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        return true;
    }
}
