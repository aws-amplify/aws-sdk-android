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

public class ListComplianceSummariesResult implements Serializable {
    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance
     * types. For example, this call returns State Manager associations,
     * patches, or custom compliance types according to the filter criteria that
     * you specified.
     * </p>
     */
    private java.util.List<ComplianceSummaryItem> complianceSummaryItems;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance
     * types. For example, this call returns State Manager associations,
     * patches, or custom compliance types according to the filter criteria that
     * you specified.
     * </p>
     *
     * @return <p>
     *         A list of compliant and non-compliant summary counts based on
     *         compliance types. For example, this call returns State Manager
     *         associations, patches, or custom compliance types according to
     *         the filter criteria that you specified.
     *         </p>
     */
    public java.util.List<ComplianceSummaryItem> getComplianceSummaryItems() {
        return complianceSummaryItems;
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance
     * types. For example, this call returns State Manager associations,
     * patches, or custom compliance types according to the filter criteria that
     * you specified.
     * </p>
     *
     * @param complianceSummaryItems <p>
     *            A list of compliant and non-compliant summary counts based on
     *            compliance types. For example, this call returns State Manager
     *            associations, patches, or custom compliance types according to
     *            the filter criteria that you specified.
     *            </p>
     */
    public void setComplianceSummaryItems(
            java.util.Collection<ComplianceSummaryItem> complianceSummaryItems) {
        if (complianceSummaryItems == null) {
            this.complianceSummaryItems = null;
            return;
        }

        this.complianceSummaryItems = new java.util.ArrayList<ComplianceSummaryItem>(
                complianceSummaryItems);
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance
     * types. For example, this call returns State Manager associations,
     * patches, or custom compliance types according to the filter criteria that
     * you specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceSummaryItems <p>
     *            A list of compliant and non-compliant summary counts based on
     *            compliance types. For example, this call returns State Manager
     *            associations, patches, or custom compliance types according to
     *            the filter criteria that you specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceSummariesResult withComplianceSummaryItems(
            ComplianceSummaryItem... complianceSummaryItems) {
        if (getComplianceSummaryItems() == null) {
            this.complianceSummaryItems = new java.util.ArrayList<ComplianceSummaryItem>(
                    complianceSummaryItems.length);
        }
        for (ComplianceSummaryItem value : complianceSummaryItems) {
            this.complianceSummaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance
     * types. For example, this call returns State Manager associations,
     * patches, or custom compliance types according to the filter criteria that
     * you specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceSummaryItems <p>
     *            A list of compliant and non-compliant summary counts based on
     *            compliance types. For example, this call returns State Manager
     *            associations, patches, or custom compliance types according to
     *            the filter criteria that you specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceSummariesResult withComplianceSummaryItems(
            java.util.Collection<ComplianceSummaryItem> complianceSummaryItems) {
        setComplianceSummaryItems(complianceSummaryItems);
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
    public ListComplianceSummariesResult withNextToken(String nextToken) {
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
        if (getComplianceSummaryItems() != null)
            sb.append("ComplianceSummaryItems: " + getComplianceSummaryItems() + ",");
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
                + ((getComplianceSummaryItems() == null) ? 0 : getComplianceSummaryItems()
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

        if (obj instanceof ListComplianceSummariesResult == false)
            return false;
        ListComplianceSummariesResult other = (ListComplianceSummariesResult) obj;

        if (other.getComplianceSummaryItems() == null ^ this.getComplianceSummaryItems() == null)
            return false;
        if (other.getComplianceSummaryItems() != null
                && other.getComplianceSummaryItems().equals(this.getComplianceSummaryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
