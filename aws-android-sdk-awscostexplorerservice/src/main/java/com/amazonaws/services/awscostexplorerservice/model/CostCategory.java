/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The structure of Cost Categories. This includes detailed metadata and the set
 * of rules for the <code>CostCategory</code> object.
 * </p>
 */
public class CostCategory implements Serializable {
    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     */
    private String costCategoryArn;

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     */
    private String effectiveStart;

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     */
    private String effectiveEnd;

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     */
    private String name;

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     */
    private String ruleVersion;

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the
     * line item, then the first rule to match is used to determine that Cost
     * Category value.
     * </p>
     */
    private java.util.List<CostCategoryRule> rules;

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @return <p>
     *         The unique identifier for your Cost Category.
     *         </p>
     */
    public String getCostCategoryArn() {
        return costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @param costCategoryArn <p>
     *            The unique identifier for your Cost Category.
     *            </p>
     */
    public void setCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @param costCategoryArn <p>
     *            The unique identifier for your Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @return <p>
     *         The Cost Category's effective start date.
     *         </p>
     */
    public String getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveStart <p>
     *            The Cost Category's effective start date.
     *            </p>
     */
    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    /**
     * <p>
     * The Cost Category's effective start date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveStart <p>
     *            The Cost Category's effective start date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
        return this;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @return <p>
     *         The Cost Category's effective end date.
     *         </p>
     */
    public String getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveEnd <p>
     *            The Cost Category's effective end date.
     *            </p>
     */
    public void setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }

    /**
     * <p>
     * The Cost Category's effective end date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveEnd <p>
     *            The Cost Category's effective end date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
        return this;
    }

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @return <p>
     *         The unique name of the Cost Category.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param name <p>
     *            The unique name of the Cost Category.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param name <p>
     *            The unique name of the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     *
     * @return <p>
     *         The rule schema version in this particular Cost Category.
     *         </p>
     * @see CostCategoryRuleVersion
     */
    public String getRuleVersion() {
        return ruleVersion;
    }

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     *
     * @param ruleVersion <p>
     *            The rule schema version in this particular Cost Category.
     *            </p>
     * @see CostCategoryRuleVersion
     */
    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     *
     * @param ruleVersion <p>
     *            The rule schema version in this particular Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CostCategoryRuleVersion
     */
    public CostCategory withRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     *
     * @param ruleVersion <p>
     *            The rule schema version in this particular Cost Category.
     *            </p>
     * @see CostCategoryRuleVersion
     */
    public void setRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
    }

    /**
     * <p>
     * The rule schema version in this particular Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CostCategoryExpression.v1
     *
     * @param ruleVersion <p>
     *            The rule schema version in this particular Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CostCategoryRuleVersion
     */
    public CostCategory withRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
        return this;
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the
     * line item, then the first rule to match is used to determine that Cost
     * Category value.
     * </p>
     *
     * @return <p>
     *         Rules are processed in order. If there are multiple rules that
     *         match the line item, then the first rule to match is used to
     *         determine that Cost Category value.
     *         </p>
     */
    public java.util.List<CostCategoryRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the
     * line item, then the first rule to match is used to determine that Cost
     * Category value.
     * </p>
     *
     * @param rules <p>
     *            Rules are processed in order. If there are multiple rules that
     *            match the line item, then the first rule to match is used to
     *            determine that Cost Category value.
     *            </p>
     */
    public void setRules(java.util.Collection<CostCategoryRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<CostCategoryRule>(rules);
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the
     * line item, then the first rule to match is used to determine that Cost
     * Category value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules are processed in order. If there are multiple rules that
     *            match the line item, then the first rule to match is used to
     *            determine that Cost Category value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withRules(CostCategoryRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<CostCategoryRule>(rules.length);
        }
        for (CostCategoryRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Rules are processed in order. If there are multiple rules that match the
     * line item, then the first rule to match is used to determine that Cost
     * Category value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules are processed in order. If there are multiple rules that
     *            match the line item, then the first rule to match is used to
     *            determine that Cost Category value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategory withRules(java.util.Collection<CostCategoryRule> rules) {
        setRules(rules);
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
        if (getCostCategoryArn() != null)
            sb.append("CostCategoryArn: " + getCostCategoryArn() + ",");
        if (getEffectiveStart() != null)
            sb.append("EffectiveStart: " + getEffectiveStart() + ",");
        if (getEffectiveEnd() != null)
            sb.append("EffectiveEnd: " + getEffectiveEnd() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: " + getRuleVersion() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveStart() == null) ? 0 : getEffectiveStart().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveEnd() == null) ? 0 : getEffectiveEnd().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategory == false)
            return false;
        CostCategory other = (CostCategory) obj;

        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null
                && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getEffectiveStart() == null ^ this.getEffectiveStart() == null)
            return false;
        if (other.getEffectiveStart() != null
                && other.getEffectiveStart().equals(this.getEffectiveStart()) == false)
            return false;
        if (other.getEffectiveEnd() == null ^ this.getEffectiveEnd() == null)
            return false;
        if (other.getEffectiveEnd() != null
                && other.getEffectiveEnd().equals(this.getEffectiveEnd()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null
                && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
