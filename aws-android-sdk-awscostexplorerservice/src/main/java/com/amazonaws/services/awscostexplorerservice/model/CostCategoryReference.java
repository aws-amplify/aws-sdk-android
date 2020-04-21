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
 * A reference to a Cost Category containing only enough information to identify
 * the Cost Category.
 * </p>
 * <p>
 * You can use this information to retrieve the full Cost Category information
 * using <code>DescribeCostCategory</code>.
 * </p>
 */
public class CostCategoryReference implements Serializable {
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
     * The number of rules associated with a specific Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numberOfRules;

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
    public CostCategoryReference withCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
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
    public CostCategoryReference withName(String name) {
        this.name = name;
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
    public CostCategoryReference withEffectiveStart(String effectiveStart) {
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
    public CostCategoryReference withEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
        return this;
    }

    /**
     * <p>
     * The number of rules associated with a specific Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of rules associated with a specific Cost Category.
     *         </p>
     */
    public Integer getNumberOfRules() {
        return numberOfRules;
    }

    /**
     * <p>
     * The number of rules associated with a specific Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfRules <p>
     *            The number of rules associated with a specific Cost Category.
     *            </p>
     */
    public void setNumberOfRules(Integer numberOfRules) {
        this.numberOfRules = numberOfRules;
    }

    /**
     * <p>
     * The number of rules associated with a specific Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfRules <p>
     *            The number of rules associated with a specific Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryReference withNumberOfRules(Integer numberOfRules) {
        this.numberOfRules = numberOfRules;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEffectiveStart() != null)
            sb.append("EffectiveStart: " + getEffectiveStart() + ",");
        if (getEffectiveEnd() != null)
            sb.append("EffectiveEnd: " + getEffectiveEnd() + ",");
        if (getNumberOfRules() != null)
            sb.append("NumberOfRules: " + getNumberOfRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveStart() == null) ? 0 : getEffectiveStart().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveEnd() == null) ? 0 : getEffectiveEnd().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfRules() == null) ? 0 : getNumberOfRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryReference == false)
            return false;
        CostCategoryReference other = (CostCategoryReference) obj;

        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null
                && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getNumberOfRules() == null ^ this.getNumberOfRules() == null)
            return false;
        if (other.getNumberOfRules() != null
                && other.getNumberOfRules().equals(this.getNumberOfRules()) == false)
            return false;
        return true;
    }
}
