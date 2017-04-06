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

/**
 * <p>
 * Describes a rule.
 * </p>
 */
public class TopicRuleListItem implements Serializable {
    /**
     * <p>
     * The rule ARN.
     * </p>
     */
    private String ruleArn;

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
     * The pattern for the topic names that apply.
     * </p>
     */
    private String topicPattern;

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;

    /**
     * <p>
     * The rule ARN.
     * </p>
     *
     * @return <p>
     *         The rule ARN.
     *         </p>
     */
    public String getRuleArn() {
        return ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     *
     * @param ruleArn <p>
     *            The rule ARN.
     *            </p>
     */
    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleArn <p>
     *            The rule ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleListItem withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
        return this;
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
    public TopicRuleListItem withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     *
     * @return <p>
     *         The pattern for the topic names that apply.
     *         </p>
     */
    public String getTopicPattern() {
        return topicPattern;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     *
     * @param topicPattern <p>
     *            The pattern for the topic names that apply.
     *            </p>
     */
    public void setTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicPattern <p>
     *            The pattern for the topic names that apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleListItem withTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
        return this;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     *
     * @return <p>
     *         The date and time the rule was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time the rule was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time the rule was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleListItem withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the rule is disabled.
     *         </p>
     */
    public Boolean isRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the rule is disabled.
     *         </p>
     */
    public Boolean getRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @param ruleDisabled <p>
     *            Specifies whether the rule is disabled.
     *            </p>
     */
    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleDisabled <p>
     *            Specifies whether the rule is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleListItem withRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
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
        if (getRuleArn() != null)
            sb.append("ruleArn: " + getRuleArn() + ",");
        if (getRuleName() != null)
            sb.append("ruleName: " + getRuleName() + ",");
        if (getTopicPattern() != null)
            sb.append("topicPattern: " + getTopicPattern() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getRuleDisabled() != null)
            sb.append("ruleDisabled: " + getRuleDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getTopicPattern() == null) ? 0 : getTopicPattern().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getRuleDisabled() == null) ? 0 : getRuleDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleListItem == false)
            return false;
        TopicRuleListItem other = (TopicRuleListItem) obj;

        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTopicPattern() == null ^ this.getTopicPattern() == null)
            return false;
        if (other.getTopicPattern() != null
                && other.getTopicPattern().equals(this.getTopicPattern()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null
                && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        return true;
    }
}
