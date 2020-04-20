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

public class CreateCostCategoryDefinitionResult implements Serializable {
    /**
     * <p>
     * The unique identifier for your newly created Cost Category.
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
     * The unique identifier for your newly created Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @return <p>
     *         The unique identifier for your newly created Cost Category.
     *         </p>
     */
    public String getCostCategoryArn() {
        return costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your newly created Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @param costCategoryArn <p>
     *            The unique identifier for your newly created Cost Category.
     *            </p>
     */
    public void setCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your newly created Cost Category.
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
     *            The unique identifier for your newly created Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCostCategoryDefinitionResult withCostCategoryArn(String costCategoryArn) {
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
    public CreateCostCategoryDefinitionResult withEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
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
            sb.append("EffectiveStart: " + getEffectiveStart());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCostCategoryDefinitionResult == false)
            return false;
        CreateCostCategoryDefinitionResult other = (CreateCostCategoryDefinitionResult) obj;

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
        return true;
    }
}
