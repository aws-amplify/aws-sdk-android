/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The rule ARN.
     */
    private String ruleArn;

    /**
     * The name of the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     */
    private String ruleName;

    /**
     * The pattern for the topic names that apply.
     */
    private String topicPattern;

    /**
     * The date and time the rule was created.
     */
    private java.util.Date createdAt;

    /**
     * Specifies whether the rule is disabled.
     */
    private Boolean ruleDisabled;

    /**
     * The rule ARN.
     *
     * @return The rule ARN.
     */
    public String getRuleArn() {
        return ruleArn;
    }
    
    /**
     * The rule ARN.
     *
     * @param ruleArn The rule ARN.
     */
    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }
    
    /**
     * The rule ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleArn The rule ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRuleListItem withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
        return this;
    }

    /**
     * The name of the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @return The name of the rule.
     */
    public String getRuleName() {
        return ruleName;
    }
    
    /**
     * The name of the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @param ruleName The name of the rule.
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    
    /**
     * The name of the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     *
     * @param ruleName The name of the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRuleListItem withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * The pattern for the topic names that apply.
     *
     * @return The pattern for the topic names that apply.
     */
    public String getTopicPattern() {
        return topicPattern;
    }
    
    /**
     * The pattern for the topic names that apply.
     *
     * @param topicPattern The pattern for the topic names that apply.
     */
    public void setTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
    }
    
    /**
     * The pattern for the topic names that apply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicPattern The pattern for the topic names that apply.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRuleListItem withTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
        return this;
    }

    /**
     * The date and time the rule was created.
     *
     * @return The date and time the rule was created.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The date and time the rule was created.
     *
     * @param createdAt The date and time the rule was created.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The date and time the rule was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The date and time the rule was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRuleListItem withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Specifies whether the rule is disabled.
     *
     * @return Specifies whether the rule is disabled.
     */
    public Boolean isRuleDisabled() {
        return ruleDisabled;
    }
    
    /**
     * Specifies whether the rule is disabled.
     *
     * @param ruleDisabled Specifies whether the rule is disabled.
     */
    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }
    
    /**
     * Specifies whether the rule is disabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleDisabled Specifies whether the rule is disabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRuleListItem withRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
        return this;
    }

    /**
     * Specifies whether the rule is disabled.
     *
     * @return Specifies whether the rule is disabled.
     */
    public Boolean getRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuleArn() != null) sb.append("RuleArn: " + getRuleArn() + ",");
        if (getRuleName() != null) sb.append("RuleName: " + getRuleName() + ",");
        if (getTopicPattern() != null) sb.append("TopicPattern: " + getTopicPattern() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (isRuleDisabled() != null) sb.append("RuleDisabled: " + isRuleDisabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode()); 
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getTopicPattern() == null) ? 0 : getTopicPattern().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((isRuleDisabled() == null) ? 0 : isRuleDisabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TopicRuleListItem == false) return false;
        TopicRuleListItem other = (TopicRuleListItem)obj;
        
        if (other.getRuleArn() == null ^ this.getRuleArn() == null) return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false) return false; 
        if (other.getRuleName() == null ^ this.getRuleName() == null) return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false) return false; 
        if (other.getTopicPattern() == null ^ this.getTopicPattern() == null) return false;
        if (other.getTopicPattern() != null && other.getTopicPattern().equals(this.getTopicPattern()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.isRuleDisabled() == null ^ this.isRuleDisabled() == null) return false;
        if (other.isRuleDisabled() != null && other.isRuleDisabled().equals(this.isRuleDisabled()) == false) return false; 
        return true;
    }
    
}
    