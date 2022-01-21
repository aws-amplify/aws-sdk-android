/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListContactReferencesResult implements Serializable {
    /**
     * <p>
     * Information about the contact flows.
     * </p>
     */
    private java.util.List<ReferenceSummary> referenceSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     *
     * @return <p>
     *         Information about the contact flows.
     *         </p>
     */
    public java.util.List<ReferenceSummary> getReferenceSummaryList() {
        return referenceSummaryList;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     *
     * @param referenceSummaryList <p>
     *            Information about the contact flows.
     *            </p>
     */
    public void setReferenceSummaryList(java.util.Collection<ReferenceSummary> referenceSummaryList) {
        if (referenceSummaryList == null) {
            this.referenceSummaryList = null;
            return;
        }

        this.referenceSummaryList = new java.util.ArrayList<ReferenceSummary>(referenceSummaryList);
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceSummaryList <p>
     *            Information about the contact flows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesResult withReferenceSummaryList(
            ReferenceSummary... referenceSummaryList) {
        if (getReferenceSummaryList() == null) {
            this.referenceSummaryList = new java.util.ArrayList<ReferenceSummary>(
                    referenceSummaryList.length);
        }
        for (ReferenceSummary value : referenceSummaryList) {
            this.referenceSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceSummaryList <p>
     *            Information about the contact flows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesResult withReferenceSummaryList(
            java.util.Collection<ReferenceSummary> referenceSummaryList) {
        setReferenceSummaryList(referenceSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     *         <important>
     *         <p>
     *         This is always returned as null in the response.
     *         </p>
     *         </important>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is always returned as null in the response.
     *            </p>
     *            </important>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is always returned as null in the response.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesResult withNextToken(String nextToken) {
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
        if (getReferenceSummaryList() != null)
            sb.append("ReferenceSummaryList: " + getReferenceSummaryList() + ",");
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
                + ((getReferenceSummaryList() == null) ? 0 : getReferenceSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactReferencesResult == false)
            return false;
        ListContactReferencesResult other = (ListContactReferencesResult) obj;

        if (other.getReferenceSummaryList() == null ^ this.getReferenceSummaryList() == null)
            return false;
        if (other.getReferenceSummaryList() != null
                && other.getReferenceSummaryList().equals(this.getReferenceSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
