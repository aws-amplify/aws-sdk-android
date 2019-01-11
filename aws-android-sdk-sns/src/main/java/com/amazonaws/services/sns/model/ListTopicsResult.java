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
 * Response for ListTopics action.
 * </p>
 */
public class ListTopicsResult implements Serializable {
    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     */
    private java.util.List<Topic> topics = new java.util.ArrayList<Topic>();

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This
     * element is returned if there are additional topics to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     *
     * @return <p>
     *         A list of topic ARNs.
     *         </p>
     */
    public java.util.List<Topic> getTopics() {
        return topics;
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     *
     * @param topics <p>
     *            A list of topic ARNs.
     *            </p>
     */
    public void setTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new java.util.ArrayList<Topic>(topics);
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topics <p>
     *            A list of topic ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicsResult withTopics(Topic... topics) {
        if (getTopics() == null) {
            this.topics = new java.util.ArrayList<Topic>(topics.length);
        }
        for (Topic value : topics) {
            this.topics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of topic ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topics <p>
     *            A list of topic ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicsResult withTopics(java.util.Collection<Topic> topics) {
        setTopics(topics);
        return this;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This
     * element is returned if there are additional topics to retrieve.
     * </p>
     *
     * @return <p>
     *         Token to pass along to the next <code>ListTopics</code> request.
     *         This element is returned if there are additional topics to
     *         retrieve.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This
     * element is returned if there are additional topics to retrieve.
     * </p>
     *
     * @param nextToken <p>
     *            Token to pass along to the next <code>ListTopics</code>
     *            request. This element is returned if there are additional
     *            topics to retrieve.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListTopics</code> request. This
     * element is returned if there are additional topics to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Token to pass along to the next <code>ListTopics</code>
     *            request. This element is returned if there are additional
     *            topics to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicsResult withNextToken(String nextToken) {
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
        if (getTopics() != null)
            sb.append("Topics: " + getTopics() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTopicsResult == false)
            return false;
        ListTopicsResult other = (ListTopicsResult) obj;

        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
