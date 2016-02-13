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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#listTopicRules(ListTopicRulesRequest) ListTopicRules operation}.
 * <p>
 * Lists the rules for the specific topic.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#listTopicRules(ListTopicRulesRequest)
 */
public class ListTopicRulesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The topic.
     */
    private String topic;

    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxResults;

    /**
     * A token used to retrieve the next value.
     */
    private String nextToken;

    /**
     * Specifies whether the rule is disabled.
     */
    private Boolean ruleDisabled;

    /**
     * The topic.
     *
     * @return The topic.
     */
    public String getTopic() {
        return topic;
    }
    
    /**
     * The topic.
     *
     * @param topic The topic.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    /**
     * The topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topic The topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTopicRulesRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of results to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults The maximum number of results to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults The maximum number of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTopicRulesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public ListTopicRulesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public ListTopicRulesRequest withRuleDisabled(Boolean ruleDisabled) {
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
        if (getTopic() != null) sb.append("Topic: " + getTopic() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (isRuleDisabled() != null) sb.append("RuleDisabled: " + isRuleDisabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((isRuleDisabled() == null) ? 0 : isRuleDisabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTopicRulesRequest == false) return false;
        ListTopicRulesRequest other = (ListTopicRulesRequest)obj;
        
        if (other.getTopic() == null ^ this.getTopic() == null) return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.isRuleDisabled() == null ^ this.isRuleDisabled() == null) return false;
        if (other.isRuleDisabled() != null && other.isRuleDisabled().equals(this.isRuleDisabled()) == false) return false; 
        return true;
    }
    
}
    