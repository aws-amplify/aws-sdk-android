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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#replaceTopicRule(ReplaceTopicRuleRequest) ReplaceTopicRule operation}.
 * <p>
 * Replaces the specified rule. You must specify all parameters for the
 * new rule.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#replaceTopicRule(ReplaceTopicRuleRequest)
 */
public class ReplaceTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     */
    private String ruleName;

    /**
     * The rule payload.
     */
    private TopicRulePayload topicRulePayload;

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
    public ReplaceTopicRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * The rule payload.
     *
     * @return The rule payload.
     */
    public TopicRulePayload getTopicRulePayload() {
        return topicRulePayload;
    }
    
    /**
     * The rule payload.
     *
     * @param topicRulePayload The rule payload.
     */
    public void setTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
    }
    
    /**
     * The rule payload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicRulePayload The rule payload.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuleName() != null) sb.append("RuleName: " + getRuleName() + ",");
        if (getTopicRulePayload() != null) sb.append("TopicRulePayload: " + getTopicRulePayload() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getTopicRulePayload() == null) ? 0 : getTopicRulePayload().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplaceTopicRuleRequest == false) return false;
        ReplaceTopicRuleRequest other = (ReplaceTopicRuleRequest)obj;
        
        if (other.getRuleName() == null ^ this.getRuleName() == null) return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false) return false; 
        if (other.getTopicRulePayload() == null ^ this.getTopicRulePayload() == null) return false;
        if (other.getTopicRulePayload() != null && other.getTopicRulePayload().equals(this.getTopicRulePayload()) == false) return false; 
        return true;
    }
    
}
    