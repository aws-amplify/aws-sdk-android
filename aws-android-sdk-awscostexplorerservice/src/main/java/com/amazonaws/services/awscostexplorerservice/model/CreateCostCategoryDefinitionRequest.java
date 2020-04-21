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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Cost Category with the requested name and rules.
 * </p>
 */
public class CreateCostCategoryDefinitionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The Cost Category rules used to categorize costs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule</a>.
     * </p>
     */
    private java.util.List<CostCategoryRule> rules;

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
    public CreateCostCategoryDefinitionRequest withName(String name) {
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
    public CreateCostCategoryDefinitionRequest withRuleVersion(String ruleVersion) {
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
    public CreateCostCategoryDefinitionRequest withRuleVersion(CostCategoryRuleVersion ruleVersion) {
        this.ruleVersion = ruleVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Cost Category rules used to categorize costs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule</a>.
     * </p>
     *
     * @return <p>
     *         The Cost Category rules used to categorize costs. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *         >CostCategoryRule</a>.
     *         </p>
     */
    public java.util.List<CostCategoryRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The Cost Category rules used to categorize costs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule</a>.
     * </p>
     *
     * @param rules <p>
     *            The Cost Category rules used to categorize costs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *            >CostCategoryRule</a>.
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
     * The Cost Category rules used to categorize costs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The Cost Category rules used to categorize costs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *            >CostCategoryRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCostCategoryDefinitionRequest withRules(CostCategoryRule... rules) {
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
     * The Cost Category rules used to categorize costs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     * >CostCategoryRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The Cost Category rules used to categorize costs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategoryRule.html"
     *            >CostCategoryRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCostCategoryDefinitionRequest withRules(
            java.util.Collection<CostCategoryRule> rules) {
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

        if (obj instanceof CreateCostCategoryDefinitionRequest == false)
            return false;
        CreateCostCategoryDefinitionRequest other = (CreateCostCategoryDefinitionRequest) obj;

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
