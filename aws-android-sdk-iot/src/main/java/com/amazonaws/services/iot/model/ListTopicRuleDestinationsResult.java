/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListTopicRuleDestinationsResult implements Serializable {
    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     */
    private java.util.List<TopicRuleDestinationSummary> destinationSummaries;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     *
     * @return <p>
     *         Information about a topic rule destination.
     *         </p>
     */
    public java.util.List<TopicRuleDestinationSummary> getDestinationSummaries() {
        return destinationSummaries;
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     *
     * @param destinationSummaries <p>
     *            Information about a topic rule destination.
     *            </p>
     */
    public void setDestinationSummaries(
            java.util.Collection<TopicRuleDestinationSummary> destinationSummaries) {
        if (destinationSummaries == null) {
            this.destinationSummaries = null;
            return;
        }

        this.destinationSummaries = new java.util.ArrayList<TopicRuleDestinationSummary>(
                destinationSummaries);
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSummaries <p>
     *            Information about a topic rule destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicRuleDestinationsResult withDestinationSummaries(
            TopicRuleDestinationSummary... destinationSummaries) {
        if (getDestinationSummaries() == null) {
            this.destinationSummaries = new java.util.ArrayList<TopicRuleDestinationSummary>(
                    destinationSummaries.length);
        }
        for (TopicRuleDestinationSummary value : destinationSummaries) {
            this.destinationSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSummaries <p>
     *            Information about a topic rule destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicRuleDestinationsResult withDestinationSummaries(
            java.util.Collection<TopicRuleDestinationSummary> destinationSummaries) {
        setDestinationSummaries(destinationSummaries);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token to use to get the next set of results, or <b>null</b>
     *         if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTopicRuleDestinationsResult withNextToken(String nextToken) {
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
        if (getDestinationSummaries() != null)
            sb.append("destinationSummaries: " + getDestinationSummaries() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationSummaries() == null) ? 0 : getDestinationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTopicRuleDestinationsResult == false)
            return false;
        ListTopicRuleDestinationsResult other = (ListTopicRuleDestinationsResult) obj;

        if (other.getDestinationSummaries() == null ^ this.getDestinationSummaries() == null)
            return false;
        if (other.getDestinationSummaries() != null
                && other.getDestinationSummaries().equals(this.getDestinationSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
