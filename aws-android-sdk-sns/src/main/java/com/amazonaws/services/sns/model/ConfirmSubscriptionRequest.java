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
 * Verifies an endpoint owner's intent to receive messages by validating the
 * token sent to the endpoint by an earlier <code>Subscribe</code> action. If
 * the token is valid, the action creates a new subscription and returns its
 * Amazon Resource Name (ARN). This call requires an AWS signature only when the
 * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
 * </p>
 */
public class ConfirmSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic for which you wish to confirm a subscription.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * Short-lived token sent to an endpoint during the <code>Subscribe</code>
     * action.
     * </p>
     */
    private String token;

    /**
     * <p>
     * Disallows unauthenticated unsubscribes of the subscription. If the value
     * of this parameter is <code>true</code> and the request has an AWS
     * signature, then only the topic owner and the subscription owner can
     * unsubscribe the endpoint. The unsubscribe action requires AWS
     * authentication.
     * </p>
     */
    private String authenticateOnUnsubscribe;

    /**
     * Default constructor for ConfirmSubscriptionRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public ConfirmSubscriptionRequest() {
    }

    /**
     * Constructs a new ConfirmSubscriptionRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     */
    public ConfirmSubscriptionRequest(String topicArn, String token) {
        setTopicArn(topicArn);
        setToken(token);
    }

    /**
     * Constructs a new ConfirmSubscriptionRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     * @param authenticateOnUnsubscribe <p>
     *            Disallows unauthenticated unsubscribes of the subscription. If
     *            the value of this parameter is <code>true</code> and the
     *            request has an AWS signature, then only the topic owner and
     *            the subscription owner can unsubscribe the endpoint. The
     *            unsubscribe action requires AWS authentication.
     *            </p>
     */
    public ConfirmSubscriptionRequest(String topicArn, String token,
            String authenticateOnUnsubscribe) {
        setTopicArn(topicArn);
        setToken(token);
        setAuthenticateOnUnsubscribe(authenticateOnUnsubscribe);
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to confirm a subscription.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic for which you wish to confirm a
     *         subscription.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to confirm a subscription.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to confirm a subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmSubscriptionRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * Short-lived token sent to an endpoint during the <code>Subscribe</code>
     * action.
     * </p>
     *
     * @return <p>
     *         Short-lived token sent to an endpoint during the
     *         <code>Subscribe</code> action.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * Short-lived token sent to an endpoint during the <code>Subscribe</code>
     * action.
     * </p>
     *
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Short-lived token sent to an endpoint during the <code>Subscribe</code>
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmSubscriptionRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * <p>
     * Disallows unauthenticated unsubscribes of the subscription. If the value
     * of this parameter is <code>true</code> and the request has an AWS
     * signature, then only the topic owner and the subscription owner can
     * unsubscribe the endpoint. The unsubscribe action requires AWS
     * authentication.
     * </p>
     *
     * @return <p>
     *         Disallows unauthenticated unsubscribes of the subscription. If
     *         the value of this parameter is <code>true</code> and the request
     *         has an AWS signature, then only the topic owner and the
     *         subscription owner can unsubscribe the endpoint. The unsubscribe
     *         action requires AWS authentication.
     *         </p>
     */
    public String getAuthenticateOnUnsubscribe() {
        return authenticateOnUnsubscribe;
    }

    /**
     * <p>
     * Disallows unauthenticated unsubscribes of the subscription. If the value
     * of this parameter is <code>true</code> and the request has an AWS
     * signature, then only the topic owner and the subscription owner can
     * unsubscribe the endpoint. The unsubscribe action requires AWS
     * authentication.
     * </p>
     *
     * @param authenticateOnUnsubscribe <p>
     *            Disallows unauthenticated unsubscribes of the subscription. If
     *            the value of this parameter is <code>true</code> and the
     *            request has an AWS signature, then only the topic owner and
     *            the subscription owner can unsubscribe the endpoint. The
     *            unsubscribe action requires AWS authentication.
     *            </p>
     */
    public void setAuthenticateOnUnsubscribe(String authenticateOnUnsubscribe) {
        this.authenticateOnUnsubscribe = authenticateOnUnsubscribe;
    }

    /**
     * <p>
     * Disallows unauthenticated unsubscribes of the subscription. If the value
     * of this parameter is <code>true</code> and the request has an AWS
     * signature, then only the topic owner and the subscription owner can
     * unsubscribe the endpoint. The unsubscribe action requires AWS
     * authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticateOnUnsubscribe <p>
     *            Disallows unauthenticated unsubscribes of the subscription. If
     *            the value of this parameter is <code>true</code> and the
     *            request has an AWS signature, then only the topic owner and
     *            the subscription owner can unsubscribe the endpoint. The
     *            unsubscribe action requires AWS authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmSubscriptionRequest withAuthenticateOnUnsubscribe(String authenticateOnUnsubscribe) {
        this.authenticateOnUnsubscribe = authenticateOnUnsubscribe;
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
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken() + ",");
        if (getAuthenticateOnUnsubscribe() != null)
            sb.append("AuthenticateOnUnsubscribe: " + getAuthenticateOnUnsubscribe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthenticateOnUnsubscribe() == null) ? 0 : getAuthenticateOnUnsubscribe()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmSubscriptionRequest == false)
            return false;
        ConfirmSubscriptionRequest other = (ConfirmSubscriptionRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getAuthenticateOnUnsubscribe() == null
                ^ this.getAuthenticateOnUnsubscribe() == null)
            return false;
        if (other.getAuthenticateOnUnsubscribe() != null
                && other.getAuthenticateOnUnsubscribe().equals(this.getAuthenticateOnUnsubscribe()) == false)
            return false;
        return true;
    }
}
