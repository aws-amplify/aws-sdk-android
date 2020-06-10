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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class ListFindingsFiltersResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each filter that's associated with the
     * account.
     * </p>
     */
    private java.util.List<FindingsFilterListItem> findingsFilterListItems;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each filter that's associated with the
     * account.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each filter that's associated with
     *         the account.
     *         </p>
     */
    public java.util.List<FindingsFilterListItem> getFindingsFilterListItems() {
        return findingsFilterListItems;
    }

    /**
     * <p>
     * An array of objects, one for each filter that's associated with the
     * account.
     * </p>
     *
     * @param findingsFilterListItems <p>
     *            An array of objects, one for each filter that's associated
     *            with the account.
     *            </p>
     */
    public void setFindingsFilterListItems(
            java.util.Collection<FindingsFilterListItem> findingsFilterListItems) {
        if (findingsFilterListItems == null) {
            this.findingsFilterListItems = null;
            return;
        }

        this.findingsFilterListItems = new java.util.ArrayList<FindingsFilterListItem>(
                findingsFilterListItems);
    }

    /**
     * <p>
     * An array of objects, one for each filter that's associated with the
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingsFilterListItems <p>
     *            An array of objects, one for each filter that's associated
     *            with the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsFiltersResult withFindingsFilterListItems(
            FindingsFilterListItem... findingsFilterListItems) {
        if (getFindingsFilterListItems() == null) {
            this.findingsFilterListItems = new java.util.ArrayList<FindingsFilterListItem>(
                    findingsFilterListItems.length);
        }
        for (FindingsFilterListItem value : findingsFilterListItems) {
            this.findingsFilterListItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each filter that's associated with the
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingsFilterListItems <p>
     *            An array of objects, one for each filter that's associated
     *            with the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsFiltersResult withFindingsFilterListItems(
            java.util.Collection<FindingsFilterListItem> findingsFilterListItems) {
        setFindingsFilterListItems(findingsFilterListItems);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsFiltersResult withNextToken(String nextToken) {
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
        if (getFindingsFilterListItems() != null)
            sb.append("findingsFilterListItems: " + getFindingsFilterListItems() + ",");
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
                + ((getFindingsFilterListItems() == null) ? 0 : getFindingsFilterListItems()
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

        if (obj instanceof ListFindingsFiltersResult == false)
            return false;
        ListFindingsFiltersResult other = (ListFindingsFiltersResult) obj;

        if (other.getFindingsFilterListItems() == null ^ this.getFindingsFilterListItems() == null)
            return false;
        if (other.getFindingsFilterListItems() != null
                && other.getFindingsFilterListItems().equals(this.getFindingsFilterListItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
