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
public class TopicRule implements Serializable {

    /**
     * The name of the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_]+$<br/>
     */
    private String ruleName;

    /**
     * The SQL statement used to query the topic. When using a SQL query with
     * multiple lines, be sure to escape the newline characters properly.
     */
    private String sql;

    /**
     * The description of the rule.
     */
    private String description;

    /**
     * The date and time the rule was created.
     */
    private java.util.Date createdAt;

    /**
     * The actions associated with the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Action> actions;

    /**
     * Specifies whether the rule is disabled.
     */
    private Boolean ruleDisabled;

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
    public TopicRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * The SQL statement used to query the topic. When using a SQL query with
     * multiple lines, be sure to escape the newline characters properly.
     *
     * @return The SQL statement used to query the topic. When using a SQL query with
     *         multiple lines, be sure to escape the newline characters properly.
     */
    public String getSql() {
        return sql;
    }
    
    /**
     * The SQL statement used to query the topic. When using a SQL query with
     * multiple lines, be sure to escape the newline characters properly.
     *
     * @param sql The SQL statement used to query the topic. When using a SQL query with
     *         multiple lines, be sure to escape the newline characters properly.
     */
    public void setSql(String sql) {
        this.sql = sql;
    }
    
    /**
     * The SQL statement used to query the topic. When using a SQL query with
     * multiple lines, be sure to escape the newline characters properly.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sql The SQL statement used to query the topic. When using a SQL query with
     *         multiple lines, be sure to escape the newline characters properly.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRule withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * The description of the rule.
     *
     * @return The description of the rule.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the rule.
     *
     * @param description The description of the rule.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRule withDescription(String description) {
        this.description = description;
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
    public TopicRule withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The actions associated with the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The actions associated with the rule.
     */
    public java.util.List<Action> getActions() {
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<Action>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * The actions associated with the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param actions The actions associated with the rule.
     */
    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Action> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Action>(actions.size());
        actionsCopy.addAll(actions);
        this.actions = actionsCopy;
    }
    
    /**
     * The actions associated with the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param actions The actions associated with the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRule withActions(Action... actions) {
        if (getActions() == null) setActions(new java.util.ArrayList<Action>(actions.length));
        for (Action value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * The actions associated with the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param actions The actions associated with the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TopicRule withActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Action> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Action>(actions.size());
            actionsCopy.addAll(actions);
            this.actions = actionsCopy;
        }

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
    public TopicRule withRuleDisabled(Boolean ruleDisabled) {
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
        if (getRuleName() != null) sb.append("RuleName: " + getRuleName() + ",");
        if (getSql() != null) sb.append("Sql: " + getSql() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getActions() != null) sb.append("Actions: " + getActions() + ",");
        if (isRuleDisabled() != null) sb.append("RuleDisabled: " + isRuleDisabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode()); 
        hashCode = prime * hashCode + ((isRuleDisabled() == null) ? 0 : isRuleDisabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TopicRule == false) return false;
        TopicRule other = (TopicRule)obj;
        
        if (other.getRuleName() == null ^ this.getRuleName() == null) return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false) return false; 
        if (other.getSql() == null ^ this.getSql() == null) return false;
        if (other.getSql() != null && other.getSql().equals(this.getSql()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getActions() == null ^ this.getActions() == null) return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false) return false; 
        if (other.isRuleDisabled() == null ^ this.isRuleDisabled() == null) return false;
        if (other.isRuleDisabled() != null && other.isRuleDisabled().equals(this.isRuleDisabled()) == false) return false; 
        return true;
    }
    
}
    