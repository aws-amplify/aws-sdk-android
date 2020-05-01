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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class ListComplianceItemsResult implements Serializable {
    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     */
    private java.util.List<ComplianceItem> complianceItems;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     *
     * @return <p>
     *         A list of compliance information for the specified resource ID.
     *         </p>
     */
    public java.util.List<ComplianceItem> getComplianceItems() {
        return complianceItems;
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     *
     * @param complianceItems <p>
     *            A list of compliance information for the specified resource
     *            ID.
     *            </p>
     */
    public void setComplianceItems(java.util.Collection<ComplianceItem> complianceItems) {
        if (complianceItems == null) {
            this.complianceItems = null;
            return;
        }

        this.complianceItems = new java.util.ArrayList<ComplianceItem>(complianceItems);
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceItems <p>
     *            A list of compliance information for the specified resource
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsResult withComplianceItems(ComplianceItem... complianceItems) {
        if (getComplianceItems() == null) {
            this.complianceItems = new java.util.ArrayList<ComplianceItem>(complianceItems.length);
        }
        for (ComplianceItem value : complianceItems) {
            this.complianceItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of compliance information for the specified resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceItems <p>
     *            A list of compliance information for the specified resource
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsResult withComplianceItems(
            java.util.Collection<ComplianceItem> complianceItems) {
        setComplianceItems(complianceItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. Use this token to
     *         get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsResult withNextToken(String nextToken) {
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
        if (getComplianceItems() != null)
            sb.append("ComplianceItems: " + getComplianceItems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComplianceItems() == null) ? 0 : getComplianceItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComplianceItemsResult == false)
            return false;
        ListComplianceItemsResult other = (ListComplianceItemsResult) obj;

        if (other.getComplianceItems() == null ^ this.getComplianceItems() == null)
            return false;
        if (other.getComplianceItems() != null
                && other.getComplianceItems().equals(this.getComplianceItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
