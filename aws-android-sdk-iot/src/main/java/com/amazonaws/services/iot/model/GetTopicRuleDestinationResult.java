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

public class GetTopicRuleDestinationResult implements Serializable {
    /**
     * <p>
     * The topic rule destination.
     * </p>
     */
    private TopicRuleDestination topicRuleDestination;

    /**
     * <p>
     * The topic rule destination.
     * </p>
     *
     * @return <p>
     *         The topic rule destination.
     *         </p>
     */
    public TopicRuleDestination getTopicRuleDestination() {
        return topicRuleDestination;
    }

    /**
     * <p>
     * The topic rule destination.
     * </p>
     *
     * @param topicRuleDestination <p>
     *            The topic rule destination.
     *            </p>
     */
    public void setTopicRuleDestination(TopicRuleDestination topicRuleDestination) {
        this.topicRuleDestination = topicRuleDestination;
    }

    /**
     * <p>
     * The topic rule destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicRuleDestination <p>
     *            The topic rule destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTopicRuleDestinationResult withTopicRuleDestination(
            TopicRuleDestination topicRuleDestination) {
        this.topicRuleDestination = topicRuleDestination;
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
        if (getTopicRuleDestination() != null)
            sb.append("topicRuleDestination: " + getTopicRuleDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTopicRuleDestination() == null) ? 0 : getTopicRuleDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTopicRuleDestinationResult == false)
            return false;
        GetTopicRuleDestinationResult other = (GetTopicRuleDestinationResult) obj;

        if (other.getTopicRuleDestination() == null ^ this.getTopicRuleDestination() == null)
            return false;
        if (other.getTopicRuleDestination() != null
                && other.getTopicRuleDestination().equals(this.getTopicRuleDestination()) == false)
            return false;
        return true;
    }
}
