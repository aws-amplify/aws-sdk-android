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
 * Rules are processed in order. If there are multiple rules that match the line
 * item, then the first rule to match is used to determine that Cost Category
 * value.
 * </p>
 */
public class CostCategoryRule implements Serializable {
    /**
     * <p>
     * The value a line item will be categorized as, if it matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     */
    private String value;

    /**
     * <p>
     * An <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object used to categorize costs. This supports
     * dimensions, Tags, and nested expressions. Currently the only dimensions
     * supported are <code>LINKED_ACCOUNT</code>, <code>SERVICE_CODE</code>,
     * <code>RECORD_TYPE</code>, and <code>LINKED_ACCOUNT_NAME</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend that you create
     * a separate rule instead.
     * </p>
     * <p>
     * <code>RECORD_TYPE</code> is a dimension used for Cost Explorer APIs, and
     * is also supported for Cost Category expressions. This dimension uses
     * different terms, depending on whether you're using the console or
     * API/JSON editor. For a detailed comparison, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     * >Term Comparisons</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     */
    private Expression rule;

    /**
     * <p>
     * The value a line item will be categorized as, if it matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @return <p>
     *         The value a line item will be categorized as, if it matches the
     *         rule.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value a line item will be categorized as, if it matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param value <p>
     *            The value a line item will be categorized as, if it matches
     *            the rule.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value a line item will be categorized as, if it matches the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param value <p>
     *            The value a line item will be categorized as, if it matches
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * An <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object used to categorize costs. This supports
     * dimensions, Tags, and nested expressions. Currently the only dimensions
     * supported are <code>LINKED_ACCOUNT</code>, <code>SERVICE_CODE</code>,
     * <code>RECORD_TYPE</code>, and <code>LINKED_ACCOUNT_NAME</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend that you create
     * a separate rule instead.
     * </p>
     * <p>
     * <code>RECORD_TYPE</code> is a dimension used for Cost Explorer APIs, and
     * is also supported for Cost Category expressions. This dimension uses
     * different terms, depending on whether you're using the console or
     * API/JSON editor. For a detailed comparison, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     * >Term Comparisons</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         An <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object used to categorize costs. This supports
     *         dimensions, Tags, and nested expressions. Currently the only
     *         dimensions supported are <code>LINKED_ACCOUNT</code>,
     *         <code>SERVICE_CODE</code>, <code>RECORD_TYPE</code>, and
     *         <code>LINKED_ACCOUNT_NAME</code>.
     *         </p>
     *         <p>
     *         Root level <code>OR</code> is not supported. We recommend that
     *         you create a separate rule instead.
     *         </p>
     *         <p>
     *         <code>RECORD_TYPE</code> is a dimension used for Cost Explorer
     *         APIs, and is also supported for Cost Category expressions. This
     *         dimension uses different terms, depending on whether you're using
     *         the console or API/JSON editor. For a detailed comparison, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     *         >Term Comparisons</a> in the <i>AWS Billing and Cost Management
     *         User Guide</i>.
     *         </p>
     */
    public Expression getRule() {
        return rule;
    }

    /**
     * <p>
     * An <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object used to categorize costs. This supports
     * dimensions, Tags, and nested expressions. Currently the only dimensions
     * supported are <code>LINKED_ACCOUNT</code>, <code>SERVICE_CODE</code>,
     * <code>RECORD_TYPE</code>, and <code>LINKED_ACCOUNT_NAME</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend that you create
     * a separate rule instead.
     * </p>
     * <p>
     * <code>RECORD_TYPE</code> is a dimension used for Cost Explorer APIs, and
     * is also supported for Cost Category expressions. This dimension uses
     * different terms, depending on whether you're using the console or
     * API/JSON editor. For a detailed comparison, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     * >Term Comparisons</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     *
     * @param rule <p>
     *            An <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object used to categorize costs. This supports
     *            dimensions, Tags, and nested expressions. Currently the only
     *            dimensions supported are <code>LINKED_ACCOUNT</code>,
     *            <code>SERVICE_CODE</code>, <code>RECORD_TYPE</code>, and
     *            <code>LINKED_ACCOUNT_NAME</code>.
     *            </p>
     *            <p>
     *            Root level <code>OR</code> is not supported. We recommend that
     *            you create a separate rule instead.
     *            </p>
     *            <p>
     *            <code>RECORD_TYPE</code> is a dimension used for Cost Explorer
     *            APIs, and is also supported for Cost Category expressions.
     *            This dimension uses different terms, depending on whether
     *            you're using the console or API/JSON editor. For a detailed
     *            comparison, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     *            >Term Comparisons</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     */
    public void setRule(Expression rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * An <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object used to categorize costs. This supports
     * dimensions, Tags, and nested expressions. Currently the only dimensions
     * supported are <code>LINKED_ACCOUNT</code>, <code>SERVICE_CODE</code>,
     * <code>RECORD_TYPE</code>, and <code>LINKED_ACCOUNT_NAME</code>.
     * </p>
     * <p>
     * Root level <code>OR</code> is not supported. We recommend that you create
     * a separate rule instead.
     * </p>
     * <p>
     * <code>RECORD_TYPE</code> is a dimension used for Cost Explorer APIs, and
     * is also supported for Cost Category expressions. This dimension uses
     * different terms, depending on whether you're using the console or
     * API/JSON editor. For a detailed comparison, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     * >Term Comparisons</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rule <p>
     *            An <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object used to categorize costs. This supports
     *            dimensions, Tags, and nested expressions. Currently the only
     *            dimensions supported are <code>LINKED_ACCOUNT</code>,
     *            <code>SERVICE_CODE</code>, <code>RECORD_TYPE</code>, and
     *            <code>LINKED_ACCOUNT_NAME</code>.
     *            </p>
     *            <p>
     *            Root level <code>OR</code> is not supported. We recommend that
     *            you create a separate rule instead.
     *            </p>
     *            <p>
     *            <code>RECORD_TYPE</code> is a dimension used for Cost Explorer
     *            APIs, and is also supported for Cost Category expressions.
     *            This dimension uses different terms, depending on whether
     *            you're using the console or API/JSON editor. For a detailed
     *            comparison, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html#cost-categories-terms"
     *            >Term Comparisons</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryRule withRule(Expression rule) {
        this.rule = rule;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryRule == false)
            return false;
        CostCategoryRule other = (CostCategoryRule) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }
}
