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

public class ListCustomDataIdentifiersResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each custom data identifier.
     * </p>
     */
    private java.util.List<CustomDataIdentifierSummary> items;

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
     * An array of objects, one for each custom data identifier.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each custom data identifier.
     *         </p>
     */
    public java.util.List<CustomDataIdentifierSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier.
     * </p>
     *
     * @param items <p>
     *            An array of objects, one for each custom data identifier.
     *            </p>
     */
    public void setItems(java.util.Collection<CustomDataIdentifierSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<CustomDataIdentifierSummary>(items);
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of objects, one for each custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomDataIdentifiersResult withItems(CustomDataIdentifierSummary... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<CustomDataIdentifierSummary>(items.length);
        }
        for (CustomDataIdentifierSummary value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of objects, one for each custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomDataIdentifiersResult withItems(
            java.util.Collection<CustomDataIdentifierSummary> items) {
        setItems(items);
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
    public ListCustomDataIdentifiersResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("items: " + getItems() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomDataIdentifiersResult == false)
            return false;
        ListCustomDataIdentifiersResult other = (ListCustomDataIdentifiersResult) obj;

        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
