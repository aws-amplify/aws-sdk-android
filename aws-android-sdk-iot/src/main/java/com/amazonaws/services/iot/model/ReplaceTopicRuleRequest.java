/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Replaces the specified rule. You must specify all parameters for the new
 * rule. Creating rules is an administrator-level action. Any user who has
 * permission to create rules will be able to access data processed by the rule.
 * </p>
 */
public class ReplaceTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     */
    private String ruleName;

    /**
     * <p>
     * The rule payload.
     * </p>
     */
    private TopicRulePayload topicRulePayload;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @return <p>
     *         The name of the rule.
     *         </p>
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @param ruleName <p>
     *            The name of the rule.
     *            </p>
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @param ruleName <p>
     *            The name of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceTopicRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     *
     * @return <p>
     *         The rule payload.
     *         </p>
     */
    public TopicRulePayload getTopicRulePayload() {
        return topicRulePayload;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     *
     * @param topicRulePayload <p>
     *            The rule payload.
     *            </p>
     */
    public void setTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicRulePayload <p>
     *            The rule payload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceTopicRuleRequest withTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
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
        if (getRuleName() != null)
            sb.append("ruleName: " + getRuleName() + ",");
        if (getTopicRulePayload() != null)
            sb.append("topicRulePayload: " + getTopicRulePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getTopicRulePayload() == null) ? 0 : getTopicRulePayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceTopicRuleRequest == false)
            return false;
        ReplaceTopicRuleRequest other = (ReplaceTopicRuleRequest) obj;

        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTopicRulePayload() == null ^ this.getTopicRulePayload() == null)
            return false;
        if (other.getTopicRulePayload() != null
                && other.getTopicRulePayload().equals(this.getTopicRulePayload()) == false)
            return false;
        return true;
    }
}
