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

public class ListQueueQuickConnectsResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     */
    private java.util.List<QuickConnectSummary> quickConnectSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueueQuickConnectsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     *
     * @return <p>
     *         Information about the quick connects.
     *         </p>
     */
    public java.util.List<QuickConnectSummary> getQuickConnectSummaryList() {
        return quickConnectSummaryList;
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     *
     * @param quickConnectSummaryList <p>
     *            Information about the quick connects.
     *            </p>
     */
    public void setQuickConnectSummaryList(
            java.util.Collection<QuickConnectSummary> quickConnectSummaryList) {
        if (quickConnectSummaryList == null) {
            this.quickConnectSummaryList = null;
            return;
        }

        this.quickConnectSummaryList = new java.util.ArrayList<QuickConnectSummary>(
                quickConnectSummaryList);
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectSummaryList <p>
     *            Information about the quick connects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueueQuickConnectsResult withQuickConnectSummaryList(
            QuickConnectSummary... quickConnectSummaryList) {
        if (getQuickConnectSummaryList() == null) {
            this.quickConnectSummaryList = new java.util.ArrayList<QuickConnectSummary>(
                    quickConnectSummaryList.length);
        }
        for (QuickConnectSummary value : quickConnectSummaryList) {
            this.quickConnectSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectSummaryList <p>
     *            Information about the quick connects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueueQuickConnectsResult withQuickConnectSummaryList(
            java.util.Collection<QuickConnectSummary> quickConnectSummaryList) {
        setQuickConnectSummaryList(quickConnectSummaryList);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getQuickConnectSummaryList() != null)
            sb.append("QuickConnectSummaryList: " + getQuickConnectSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getQuickConnectSummaryList() == null) ? 0 : getQuickConnectSummaryList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueueQuickConnectsResult == false)
            return false;
        ListQueueQuickConnectsResult other = (ListQueueQuickConnectsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQuickConnectSummaryList() == null ^ this.getQuickConnectSummaryList() == null)
            return false;
        if (other.getQuickConnectSummaryList() != null
                && other.getQuickConnectSummaryList().equals(this.getQuickConnectSummaryList()) == false)
            return false;
        return true;
    }
}
