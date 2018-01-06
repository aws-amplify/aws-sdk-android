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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of the subscriptions to a specific topic. Each call returns a
 * limited list of subscriptions, up to 100. If there are more subscriptions, a
 * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
 * parameter in a new <code>ListSubscriptionsByTopic</code> call to get further
 * results.
 * </p>
 */
public class ListSubscriptionsByTopicRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code>
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * Default constructor for ListSubscriptionsByTopicRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public ListSubscriptionsByTopicRequest() {
    }

    /**
     * Constructs a new ListSubscriptionsByTopicRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     */
    public ListSubscriptionsByTopicRequest(String topicArn) {
        setTopicArn(topicArn);
    }

    /**
     * Constructs a new ListSubscriptionsByTopicRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     * @param nextToken <p>
     *            Token returned by the previous
     *            <code>ListSubscriptionsByTopic</code> request.
     *            </p>
     */
    public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) {
        setTopicArn(topicArn);
        setNextToken(nextToken);
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic for which you wish to find subscriptions.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSubscriptionsByTopicRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code>
     * request.
     * </p>
     *
     * @return <p>
     *         Token returned by the previous
     *         <code>ListSubscriptionsByTopic</code> request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code>
     * request.
     * </p>
     *
     * @param nextToken <p>
     *            Token returned by the previous
     *            <code>ListSubscriptionsByTopic</code> request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code>
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Token returned by the previous
     *            <code>ListSubscriptionsByTopic</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSubscriptionsByTopicRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionsByTopicRequest == false)
            return false;
        ListSubscriptionsByTopicRequest other = (ListSubscriptionsByTopicRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
