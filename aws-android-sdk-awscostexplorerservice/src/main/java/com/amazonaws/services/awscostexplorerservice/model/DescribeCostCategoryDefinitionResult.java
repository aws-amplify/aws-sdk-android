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

public class DescribeCostCategoryDefinitionResult implements Serializable {
    /**
     * <p>
     * The structure of Cost Categories. This includes detailed metadata and the
     * set of rules for the <code>CostCategory</code> object.
     * </p>
     */
    private CostCategory costCategory;

    /**
     * <p>
     * The structure of Cost Categories. This includes detailed metadata and the
     * set of rules for the <code>CostCategory</code> object.
     * </p>
     *
     * @return <p>
     *         The structure of Cost Categories. This includes detailed metadata
     *         and the set of rules for the <code>CostCategory</code> object.
     *         </p>
     */
    public CostCategory getCostCategory() {
        return costCategory;
    }

    /**
     * <p>
     * The structure of Cost Categories. This includes detailed metadata and the
     * set of rules for the <code>CostCategory</code> object.
     * </p>
     *
     * @param costCategory <p>
     *            The structure of Cost Categories. This includes detailed
     *            metadata and the set of rules for the
     *            <code>CostCategory</code> object.
     *            </p>
     */
    public void setCostCategory(CostCategory costCategory) {
        this.costCategory = costCategory;
    }

    /**
     * <p>
     * The structure of Cost Categories. This includes detailed metadata and the
     * set of rules for the <code>CostCategory</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param costCategory <p>
     *            The structure of Cost Categories. This includes detailed
     *            metadata and the set of rules for the
     *            <code>CostCategory</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCostCategoryDefinitionResult withCostCategory(CostCategory costCategory) {
        this.costCategory = costCategory;
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
        if (getCostCategory() != null)
            sb.append("CostCategory: " + getCostCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCostCategory() == null) ? 0 : getCostCategory().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCostCategoryDefinitionResult == false)
            return false;
        DescribeCostCategoryDefinitionResult other = (DescribeCostCategoryDefinitionResult) obj;

        if (other.getCostCategory() == null ^ this.getCostCategory() == null)
            return false;
        if (other.getCostCategory() != null
                && other.getCostCategory().equals(this.getCostCategory()) == false)
            return false;
        return true;
    }
}
