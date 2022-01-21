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

public class ListQuickConnectsResult implements Serializable {
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
     */
    private String nextToken;

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
    public ListQuickConnectsResult withQuickConnectSummaryList(
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
    public ListQuickConnectsResult withQuickConnectSummaryList(
            java.util.Collection<QuickConnectSummary> quickConnectSummaryList) {
        setQuickConnectSummaryList(quickConnectSummaryList);
        return this;
    }

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
    public ListQuickConnectsResult withNextToken(String nextToken) {
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
        if (getQuickConnectSummaryList() != null)
            sb.append("QuickConnectSummaryList: " + getQuickConnectSummaryList() + ",");
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
                + ((getQuickConnectSummaryList() == null) ? 0 : getQuickConnectSummaryList()
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

        if (obj instanceof ListQuickConnectsResult == false)
            return false;
        ListQuickConnectsResult other = (ListQuickConnectsResult) obj;

        if (other.getQuickConnectSummaryList() == null ^ this.getQuickConnectSummaryList() == null)
            return false;
        if (other.getQuickConnectSummaryList() != null
                && other.getQuickConnectSummaryList().equals(this.getQuickConnectSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
