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
 * Use <code>Expression</code> to filter by cost or by usage. There are two
 * patterns:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Simple dimension values - You can set the dimension name and values for the
 * filters that you plan to use. For example, you can filter for
 * <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
 * <code>Expression</code> for that looks like this:
 * </p>
 * <p>
 * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
 * </p>
 * <p>
 * The list of dimension values are OR'd together to retrieve cost or usage
 * data. You can create <code>Expression</code> and <code>DimensionValues</code>
 * objects using either <code>with*</code> methods or <code>set*</code> methods
 * in multiple lines.
 * </p>
 * </li>
 * <li>
 * <p>
 * Compound dimension values with logical operations - You can use multiple
 * <code>Expression</code> types and the logical operators
 * <code>AND/OR/NOT</code> to create a list of one or more
 * <code>Expression</code> objects. This allows you to filter on more advanced
 * options. For example, you can filter on
 * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
 * . The <code>Expression</code> for that looks like this:
 * </p>
 * <p>
 * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
 * </p>
 * <note>
 * <p>
 * Because each <code>Expression</code> can have only one operator, the service
 * returns an error if more than one is specified. The following example shows
 * an <code>Expression</code> object that creates an error.
 * </p>
 * </note>
 * <p>
 * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * For <code>GetRightsizingRecommendation</code> action, a combination of OR and
 * NOT is not supported. OR is not supported between different dimensions, or
 * dimensions and tags. NOT operators aren't supported. Dimensions are also
 * limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or
 * <code>RIGHTSIZING_TYPE</code>.
 * </p>
 * </note>
 */
public class Expression implements Serializable {
    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     */
    private java.util.List<Expression> or;

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     */
    private java.util.List<Expression> and;

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     */
    private Expression not;

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     */
    private DimensionValues dimensions;

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     */
    private TagValues tags;

    /**
     * <p>
     * The filter based on <code>CostCategory</code> values.
     * </p>
     */
    private CostCategoryValues costCategories;

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     *
     * @return <p>
     *         Return results that match either <code>Dimension</code> object.
     *         </p>
     */
    public java.util.List<Expression> getOr() {
        return or;
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     *
     * @param or <p>
     *            Return results that match either <code>Dimension</code>
     *            object.
     *            </p>
     */
    public void setOr(java.util.Collection<Expression> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<Expression>(or);
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param or <p>
     *            Return results that match either <code>Dimension</code>
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withOr(Expression... or) {
        if (getOr() == null) {
            this.or = new java.util.ArrayList<Expression>(or.length);
        }
        for (Expression value : or) {
            this.or.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param or <p>
     *            Return results that match either <code>Dimension</code>
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withOr(java.util.Collection<Expression> or) {
        setOr(or);
        return this;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     *
     * @return <p>
     *         Return results that match both <code>Dimension</code> objects.
     *         </p>
     */
    public java.util.List<Expression> getAnd() {
        return and;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     *
     * @param and <p>
     *            Return results that match both <code>Dimension</code> objects.
     *            </p>
     */
    public void setAnd(java.util.Collection<Expression> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<Expression>(and);
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            Return results that match both <code>Dimension</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withAnd(Expression... and) {
        if (getAnd() == null) {
            this.and = new java.util.ArrayList<Expression>(and.length);
        }
        for (Expression value : and) {
            this.and.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            Return results that match both <code>Dimension</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withAnd(java.util.Collection<Expression> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     *
     * @return <p>
     *         Return results that don't match a <code>Dimension</code> object.
     *         </p>
     */
    public Expression getNot() {
        return not;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     *
     * @param not <p>
     *            Return results that don't match a <code>Dimension</code>
     *            object.
     *            </p>
     */
    public void setNot(Expression not) {
        this.not = not;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param not <p>
     *            Return results that don't match a <code>Dimension</code>
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withNot(Expression not) {
        this.not = not;
        return this;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     *
     * @return <p>
     *         The specific <code>Dimension</code> to use for
     *         <code>Expression</code>.
     *         </p>
     */
    public DimensionValues getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     *
     * @param dimensions <p>
     *            The specific <code>Dimension</code> to use for
     *            <code>Expression</code>.
     *            </p>
     */
    public void setDimensions(DimensionValues dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The specific <code>Dimension</code> to use for
     *            <code>Expression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withDimensions(DimensionValues dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     *
     * @return <p>
     *         The specific <code>Tag</code> to use for <code>Expression</code>.
     *         </p>
     */
    public TagValues getTags() {
        return tags;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     *
     * @param tags <p>
     *            The specific <code>Tag</code> to use for
     *            <code>Expression</code>.
     *            </p>
     */
    public void setTags(TagValues tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The specific <code>Tag</code> to use for
     *            <code>Expression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withTags(TagValues tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The filter based on <code>CostCategory</code> values.
     * </p>
     *
     * @return <p>
     *         The filter based on <code>CostCategory</code> values.
     *         </p>
     */
    public CostCategoryValues getCostCategories() {
        return costCategories;
    }

    /**
     * <p>
     * The filter based on <code>CostCategory</code> values.
     * </p>
     *
     * @param costCategories <p>
     *            The filter based on <code>CostCategory</code> values.
     *            </p>
     */
    public void setCostCategories(CostCategoryValues costCategories) {
        this.costCategories = costCategories;
    }

    /**
     * <p>
     * The filter based on <code>CostCategory</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param costCategories <p>
     *            The filter based on <code>CostCategory</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withCostCategories(CostCategoryValues costCategories) {
        this.costCategories = costCategories;
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
        if (getOr() != null)
            sb.append("Or: " + getOr() + ",");
        if (getAnd() != null)
            sb.append("And: " + getAnd() + ",");
        if (getNot() != null)
            sb.append("Not: " + getNot() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCostCategories() != null)
            sb.append("CostCategories: " + getCostCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getNot() == null) ? 0 : getNot().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getCostCategories() == null) ? 0 : getCostCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expression == false)
            return false;
        Expression other = (Expression) obj;

        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getNot() == null ^ this.getNot() == null)
            return false;
        if (other.getNot() != null && other.getNot().equals(this.getNot()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCostCategories() == null ^ this.getCostCategories() == null)
            return false;
        if (other.getCostCategories() != null
                && other.getCostCategories().equals(this.getCostCategories()) == false)
            return false;
        return true;
    }
}
