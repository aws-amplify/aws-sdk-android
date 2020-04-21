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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class ListFiltersResult implements Serializable {
    /**
     * <p>
     * A list of filter names.
     * </p>
     */
    private java.util.List<String> filterNames;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of filter names.
     * </p>
     *
     * @return <p>
     *         A list of filter names.
     *         </p>
     */
    public java.util.List<String> getFilterNames() {
        return filterNames;
    }

    /**
     * <p>
     * A list of filter names.
     * </p>
     *
     * @param filterNames <p>
     *            A list of filter names.
     *            </p>
     */
    public void setFilterNames(java.util.Collection<String> filterNames) {
        if (filterNames == null) {
            this.filterNames = null;
            return;
        }

        this.filterNames = new java.util.ArrayList<String>(filterNames);
    }

    /**
     * <p>
     * A list of filter names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterNames <p>
     *            A list of filter names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFiltersResult withFilterNames(String... filterNames) {
        if (getFilterNames() == null) {
            this.filterNames = new java.util.ArrayList<String>(filterNames.length);
        }
        for (String value : filterNames) {
            this.filterNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterNames <p>
     *            A list of filter names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFiltersResult withFilterNames(java.util.Collection<String> filterNames) {
        setFilterNames(filterNames);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @return <p>
     *         The pagination parameter to be used on the next list operation to
     *         retrieve more items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFiltersResult withNextToken(String nextToken) {
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
        if (getFilterNames() != null)
            sb.append("FilterNames: " + getFilterNames() + ",");
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
                + ((getFilterNames() == null) ? 0 : getFilterNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFiltersResult == false)
            return false;
        ListFiltersResult other = (ListFiltersResult) obj;

        if (other.getFilterNames() == null ^ this.getFilterNames() == null)
            return false;
        if (other.getFilterNames() != null
                && other.getFilterNames().equals(this.getFilterNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
