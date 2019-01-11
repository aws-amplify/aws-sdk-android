/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * A list of IP address filters that exist under your AWS account.
 * </p>
 */
public class ListReceiptFiltersResult implements Serializable {
    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a
     * name, an IP address range, and whether to allow or block mail from it.
     * </p>
     */
    private java.util.List<ReceiptFilter> filters = new java.util.ArrayList<ReceiptFilter>();

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a
     * name, an IP address range, and whether to allow or block mail from it.
     * </p>
     *
     * @return <p>
     *         A list of IP address filter data structures, which each consist
     *         of a name, an IP address range, and whether to allow or block
     *         mail from it.
     *         </p>
     */
    public java.util.List<ReceiptFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a
     * name, an IP address range, and whether to allow or block mail from it.
     * </p>
     *
     * @param filters <p>
     *            A list of IP address filter data structures, which each
     *            consist of a name, an IP address range, and whether to allow
     *            or block mail from it.
     *            </p>
     */
    public void setFilters(java.util.Collection<ReceiptFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ReceiptFilter>(filters);
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a
     * name, an IP address range, and whether to allow or block mail from it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of IP address filter data structures, which each
     *            consist of a name, an IP address range, and whether to allow
     *            or block mail from it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptFiltersResult withFilters(ReceiptFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<ReceiptFilter>(filters.length);
        }
        for (ReceiptFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a
     * name, an IP address range, and whether to allow or block mail from it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of IP address filter data structures, which each
     *            consist of a name, an IP address range, and whether to allow
     *            or block mail from it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptFiltersResult withFilters(java.util.Collection<ReceiptFilter> filters) {
        setFilters(filters);
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReceiptFiltersResult == false)
            return false;
        ListReceiptFiltersResult other = (ListReceiptFiltersResult) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
