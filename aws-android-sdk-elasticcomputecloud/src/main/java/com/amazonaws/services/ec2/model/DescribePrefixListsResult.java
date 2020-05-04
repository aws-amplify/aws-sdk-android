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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribePrefixListsResult implements Serializable {
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * All available prefix lists.
     * </p>
     */
    private java.util.List<PrefixList> prefixLists;

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
    public DescribePrefixListsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     *
     * @return <p>
     *         All available prefix lists.
     *         </p>
     */
    public java.util.List<PrefixList> getPrefixLists() {
        return prefixLists;
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     *
     * @param prefixLists <p>
     *            All available prefix lists.
     *            </p>
     */
    public void setPrefixLists(java.util.Collection<PrefixList> prefixLists) {
        if (prefixLists == null) {
            this.prefixLists = null;
            return;
        }

        this.prefixLists = new java.util.ArrayList<PrefixList>(prefixLists);
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixLists <p>
     *            All available prefix lists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsResult withPrefixLists(PrefixList... prefixLists) {
        if (getPrefixLists() == null) {
            this.prefixLists = new java.util.ArrayList<PrefixList>(prefixLists.length);
        }
        for (PrefixList value : prefixLists) {
            this.prefixLists.add(value);
        }
        return this;
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixLists <p>
     *            All available prefix lists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrefixListsResult withPrefixLists(java.util.Collection<PrefixList> prefixLists) {
        setPrefixLists(prefixLists);
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
        if (getPrefixLists() != null)
            sb.append("PrefixLists: " + getPrefixLists());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getPrefixLists() == null) ? 0 : getPrefixLists().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrefixListsResult == false)
            return false;
        DescribePrefixListsResult other = (DescribePrefixListsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrefixLists() == null ^ this.getPrefixLists() == null)
            return false;
        if (other.getPrefixLists() != null
                && other.getPrefixLists().equals(this.getPrefixLists()) == false)
            return false;
        return true;
    }
}
