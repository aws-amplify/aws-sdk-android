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

public class ListCostCategoryDefinitionsResult implements Serializable {
    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify
     * the Cost Category.
     * </p>
     */
    private java.util.List<CostCategoryReference> costCategoryReferences;

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify
     * the Cost Category.
     * </p>
     *
     * @return <p>
     *         A reference to a Cost Category containing enough information to
     *         identify the Cost Category.
     *         </p>
     */
    public java.util.List<CostCategoryReference> getCostCategoryReferences() {
        return costCategoryReferences;
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify
     * the Cost Category.
     * </p>
     *
     * @param costCategoryReferences <p>
     *            A reference to a Cost Category containing enough information
     *            to identify the Cost Category.
     *            </p>
     */
    public void setCostCategoryReferences(
            java.util.Collection<CostCategoryReference> costCategoryReferences) {
        if (costCategoryReferences == null) {
            this.costCategoryReferences = null;
            return;
        }

        this.costCategoryReferences = new java.util.ArrayList<CostCategoryReference>(
                costCategoryReferences);
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify
     * the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param costCategoryReferences <p>
     *            A reference to a Cost Category containing enough information
     *            to identify the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCostCategoryDefinitionsResult withCostCategoryReferences(
            CostCategoryReference... costCategoryReferences) {
        if (getCostCategoryReferences() == null) {
            this.costCategoryReferences = new java.util.ArrayList<CostCategoryReference>(
                    costCategoryReferences.length);
        }
        for (CostCategoryReference value : costCategoryReferences) {
            this.costCategoryReferences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify
     * the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param costCategoryReferences <p>
     *            A reference to a Cost Category containing enough information
     *            to identify the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCostCategoryDefinitionsResult withCostCategoryReferences(
            java.util.Collection<CostCategoryReference> costCategoryReferences) {
        setCostCategoryReferences(costCategoryReferences);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. Amazon Web
     *         Services provides the token when the response from a previous
     *         call has more results than the maximum page size.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCostCategoryDefinitionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCostCategoryReferences() != null)
            sb.append("CostCategoryReferences: " + getCostCategoryReferences() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCostCategoryReferences() == null) ? 0 : getCostCategoryReferences()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCostCategoryDefinitionsResult == false)
            return false;
        ListCostCategoryDefinitionsResult other = (ListCostCategoryDefinitionsResult) obj;

        if (other.getCostCategoryReferences() == null ^ this.getCostCategoryReferences() == null)
            return false;
        if (other.getCostCategoryReferences() != null
                && other.getCostCategoryReferences().equals(this.getCostCategoryReferences()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
