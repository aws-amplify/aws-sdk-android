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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates the specified budget from the specified resource.
 * </p>
 */
public class DisassociateBudgetFromResourceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String budgetName;

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a
     * portfolio-id or a product-id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the budget you want to disassociate.
     *         </p>
     */
    public String getBudgetName() {
        return budgetName;
    }

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param budgetName <p>
     *            The name of the budget you want to disassociate.
     *            </p>
     */
    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget you want to disassociate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param budgetName <p>
     *            The name of the budget you want to disassociate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateBudgetFromResourceRequest withBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a
     * portfolio-id or a product-id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The resource identifier you want to disassociate from. Either a
     *         portfolio-id or a product-id.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a
     * portfolio-id or a product-id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param resourceId <p>
     *            The resource identifier you want to disassociate from. Either
     *            a portfolio-id or a product-id.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifier you want to disassociate from. Either a
     * portfolio-id or a product-id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param resourceId <p>
     *            The resource identifier you want to disassociate from. Either
     *            a portfolio-id or a product-id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateBudgetFromResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        if (getBudgetName() != null)
            sb.append("BudgetName: " + getBudgetName() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateBudgetFromResourceRequest == false)
            return false;
        DisassociateBudgetFromResourceRequest other = (DisassociateBudgetFromResourceRequest) obj;

        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null
                && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }
}
