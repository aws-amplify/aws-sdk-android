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
 * The output from the ListTopicRules operation.
 * </p>
 */
public class ListTopicRulesResult implements Serializable {

    /**
     * The rules.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem> rules;

    /**
     * A token used to retrieve the next value.
     */
    private String nextToken;

    /**
     * The rules.
     *
     * @return The rules.
     */
    public java.util.List<TopicRuleListItem> getRules() {
        if (rules == null) {
              rules = new com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem>();
              rules.setAutoConstruct(true);
        }
        return rules;
    }
    
    /**
     * The rules.
     *
     * @param rules The rules.
     */
    public void setRules(java.util.Collection<TopicRuleListItem> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem>(rules.size());
        rulesCopy.addAll(rules);
        this.rules = rulesCopy;
    }
    
    /**
     * The rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules The rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTopicRulesResult withRules(TopicRuleListItem... rules) {
        if (getRules() == null) setRules(new java.util.ArrayList<TopicRuleListItem>(rules.length));
        for (TopicRuleListItem value : rules) {
            getRules().add(value);
        }
        return this;
    }
    
    /**
     * The rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules The rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTopicRulesResult withRules(java.util.Collection<TopicRuleListItem> rules) {
        if (rules == null) {
            this.rules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TopicRuleListItem>(rules.size());
            rulesCopy.addAll(rules);
            this.rules = rulesCopy;
        }

        return this;
    }

    /**
     * A token used to retrieve the next value.
     *
     * @return A token used to retrieve the next value.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A token used to retrieve the next value.
     *
     * @param nextToken A token used to retrieve the next value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A token used to retrieve the next value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token used to retrieve the next value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTopicRulesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getRules() != null) sb.append("Rules: " + getRules() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTopicRulesResult == false) return false;
        ListTopicRulesResult other = (ListTopicRulesResult)obj;
        
        if (other.getRules() == null ^ this.getRules() == null) return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    