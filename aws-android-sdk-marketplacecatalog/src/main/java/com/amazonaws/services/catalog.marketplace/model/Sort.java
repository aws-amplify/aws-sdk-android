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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains two attributes, <code>SortBy</code> and
 * <code>SortOrder</code>.
 * </p>
 */
public class Sort implements Serializable {
    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include
     * <code>LastModifiedDate</code> (default), <code>Visibility</code>,
     * <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include
     * <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String sortBy;

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include
     * <code>LastModifiedDate</code> (default), <code>Visibility</code>,
     * <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include
     * <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         For <code>ListEntities</code>, supported attributes include
     *         <code>LastModifiedDate</code> (default), <code>Visibility</code>,
     *         <code>EntityId</code>, and <code>Name</code>.
     *         </p>
     *         <p>
     *         For <code>ListChangeSets</code>, supported attributes include
     *         <code>StartTime</code> and <code>EndTime</code>.
     *         </p>
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include
     * <code>LastModifiedDate</code> (default), <code>Visibility</code>,
     * <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include
     * <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param sortBy <p>
     *            For <code>ListEntities</code>, supported attributes include
     *            <code>LastModifiedDate</code> (default),
     *            <code>Visibility</code>, <code>EntityId</code>, and
     *            <code>Name</code>.
     *            </p>
     *            <p>
     *            For <code>ListChangeSets</code>, supported attributes include
     *            <code>StartTime</code> and <code>EndTime</code>.
     *            </p>
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include
     * <code>LastModifiedDate</code> (default), <code>Visibility</code>,
     * <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include
     * <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param sortBy <p>
     *            For <code>ListEntities</code>, supported attributes include
     *            <code>LastModifiedDate</code> (default),
     *            <code>Visibility</code>, <code>EntityId</code>, and
     *            <code>Name</code>.
     *            </p>
     *            <p>
     *            For <code>ListChangeSets</code>, supported attributes include
     *            <code>StartTime</code> and <code>EndTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Sort withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The sorting order. Can be <code>ASCENDING</code> or
     *         <code>DESCENDING</code>. The default value is
     *         <code>DESCENDING</code>.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sorting order. Can be <code>ASCENDING</code> or
     *            <code>DESCENDING</code>. The default value is
     *            <code>DESCENDING</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sorting order. Can be <code>ASCENDING</code> or
     *            <code>DESCENDING</code>. The default value is
     *            <code>DESCENDING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public Sort withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sorting order. Can be <code>ASCENDING</code> or
     *            <code>DESCENDING</code>. The default value is
     *            <code>DESCENDING</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or
     * <code>DESCENDING</code>. The default value is <code>DESCENDING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sorting order. Can be <code>ASCENDING</code> or
     *            <code>DESCENDING</code>. The default value is
     *            <code>DESCENDING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public Sort withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sort == false)
            return false;
        Sort other = (Sort) obj;

        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }
}
