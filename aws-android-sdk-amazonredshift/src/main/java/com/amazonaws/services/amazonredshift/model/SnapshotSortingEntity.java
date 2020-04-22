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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a sorting entity
 * </p>
 */
public class SnapshotSortingEntity implements Serializable {
    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     */
    private String attribute;

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     */
    private String sortOrder;

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     *
     * @return <p>
     *         The category for sorting the snapshots.
     *         </p>
     * @see SnapshotAttributeToSortBy
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     *
     * @param attribute <p>
     *            The category for sorting the snapshots.
     *            </p>
     * @see SnapshotAttributeToSortBy
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     *
     * @param attribute <p>
     *            The category for sorting the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotAttributeToSortBy
     */
    public SnapshotSortingEntity withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     *
     * @param attribute <p>
     *            The category for sorting the snapshots.
     *            </p>
     * @see SnapshotAttributeToSortBy
     */
    public void setAttribute(SnapshotAttributeToSortBy attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME
     *
     * @param attribute <p>
     *            The category for sorting the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotAttributeToSortBy
     */
    public SnapshotSortingEntity withAttribute(SnapshotAttributeToSortBy attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @return <p>
     *         The order for listing the attributes.
     *         </p>
     * @see SortByOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sortOrder <p>
     *            The order for listing the attributes.
     *            </p>
     * @see SortByOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sortOrder <p>
     *            The order for listing the attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortByOrder
     */
    public SnapshotSortingEntity withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sortOrder <p>
     *            The order for listing the attributes.
     *            </p>
     * @see SortByOrder
     */
    public void setSortOrder(SortByOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sortOrder <p>
     *            The order for listing the attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortByOrder
     */
    public SnapshotSortingEntity withSortOrder(SortByOrder sortOrder) {
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotSortingEntity == false)
            return false;
        SnapshotSortingEntity other = (SnapshotSortingEntity) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }
}
