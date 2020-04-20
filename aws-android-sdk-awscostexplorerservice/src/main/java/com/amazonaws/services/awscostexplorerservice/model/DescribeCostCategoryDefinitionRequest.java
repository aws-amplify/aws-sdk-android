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
 * Returns the name, ARN, rules, definition, and effective dates of a Cost
 * Category that's defined in the account.
 * </p>
 * <p>
 * You have the option to use <code>EffectiveOn</code> to return a Cost Category
 * that is active on a specific date. If there is no <code>EffectiveOn</code>
 * specified, you’ll see a Cost Category that is effective on the current date.
 * If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in
 * the response.
 * </p>
 */
public class DescribeCostCategoryDefinitionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The date when the Cost Category was effective.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     */
    private String effectiveOn;

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
    public DescribeCostCategoryDefinitionRequest withCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
        return this;
    }

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @return <p>
     *         The date when the Cost Category was effective.
     *         </p>
     */
    public String getEffectiveOn() {
        return effectiveOn;
    }

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveOn <p>
     *            The date when the Cost Category was effective.
     *            </p>
     */
    public void setEffectiveOn(String effectiveOn) {
        this.effectiveOn = effectiveOn;
    }

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 25<br/>
     * <b>Pattern: </b>^\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d(([+-]\d\d:\d\d)|Z)$<br/>
     *
     * @param effectiveOn <p>
     *            The date when the Cost Category was effective.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCostCategoryDefinitionRequest withEffectiveOn(String effectiveOn) {
        this.effectiveOn = effectiveOn;
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
        if (getEffectiveOn() != null)
            sb.append("EffectiveOn: " + getEffectiveOn());
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
                + ((getEffectiveOn() == null) ? 0 : getEffectiveOn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCostCategoryDefinitionRequest == false)
            return false;
        DescribeCostCategoryDefinitionRequest other = (DescribeCostCategoryDefinitionRequest) obj;

        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null
                && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        if (other.getEffectiveOn() == null ^ this.getEffectiveOn() == null)
            return false;
        if (other.getEffectiveOn() != null
                && other.getEffectiveOn().equals(this.getEffectiveOn()) == false)
            return false;
        return true;
    }
}
