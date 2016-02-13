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
 * The output from the GetTopicRule operation.
 * </p>
 */
public class GetTopicRuleResult implements Serializable {

    /**
     * The rule ARN.
     */
    private String ruleArn;

    /**
     * The rule.
     */
    private TopicRule rule;

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
    public GetTopicRuleResult withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
        return this;
    }

    /**
     * The rule.
     *
     * @return The rule.
     */
    public TopicRule getRule() {
        return rule;
    }
    
    /**
     * The rule.
     *
     * @param rule The rule.
     */
    public void setRule(TopicRule rule) {
        this.rule = rule;
    }
    
    /**
     * The rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rule The rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTopicRuleResult withRule(TopicRule rule) {
        this.rule = rule;
        return this;
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
        if (getRule() != null) sb.append("Rule: " + getRule() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode()); 
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTopicRuleResult == false) return false;
        GetTopicRuleResult other = (GetTopicRuleResult)obj;
        
        if (other.getRuleArn() == null ^ this.getRuleArn() == null) return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false) return false; 
        if (other.getRule() == null ^ this.getRule() == null) return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false) return false; 
        return true;
    }
    
}
    