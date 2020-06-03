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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class ListVirtualInterfaceTestHistoryResult implements Serializable {
    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     */
    private java.util.List<VirtualInterfaceTestHistory> virtualInterfaceTestHistory;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the tested virtual interface.
     *         </p>
     */
    public java.util.List<VirtualInterfaceTestHistory> getVirtualInterfaceTestHistory() {
        return virtualInterfaceTestHistory;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     *
     * @param virtualInterfaceTestHistory <p>
     *            The ID of the tested virtual interface.
     *            </p>
     */
    public void setVirtualInterfaceTestHistory(
            java.util.Collection<VirtualInterfaceTestHistory> virtualInterfaceTestHistory) {
        if (virtualInterfaceTestHistory == null) {
            this.virtualInterfaceTestHistory = null;
            return;
        }

        this.virtualInterfaceTestHistory = new java.util.ArrayList<VirtualInterfaceTestHistory>(
                virtualInterfaceTestHistory);
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceTestHistory <p>
     *            The ID of the tested virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryResult withVirtualInterfaceTestHistory(
            VirtualInterfaceTestHistory... virtualInterfaceTestHistory) {
        if (getVirtualInterfaceTestHistory() == null) {
            this.virtualInterfaceTestHistory = new java.util.ArrayList<VirtualInterfaceTestHistory>(
                    virtualInterfaceTestHistory.length);
        }
        for (VirtualInterfaceTestHistory value : virtualInterfaceTestHistory) {
            this.virtualInterfaceTestHistory.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceTestHistory <p>
     *            The ID of the tested virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryResult withVirtualInterfaceTestHistory(
            java.util.Collection<VirtualInterfaceTestHistory> virtualInterfaceTestHistory) {
        setVirtualInterfaceTestHistory(virtualInterfaceTestHistory);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryResult withNextToken(String nextToken) {
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
        if (getVirtualInterfaceTestHistory() != null)
            sb.append("virtualInterfaceTestHistory: " + getVirtualInterfaceTestHistory() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVirtualInterfaceTestHistory() == null) ? 0
                        : getVirtualInterfaceTestHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualInterfaceTestHistoryResult == false)
            return false;
        ListVirtualInterfaceTestHistoryResult other = (ListVirtualInterfaceTestHistoryResult) obj;

        if (other.getVirtualInterfaceTestHistory() == null
                ^ this.getVirtualInterfaceTestHistory() == null)
            return false;
        if (other.getVirtualInterfaceTestHistory() != null
                && other.getVirtualInterfaceTestHistory().equals(
                        this.getVirtualInterfaceTestHistory()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
