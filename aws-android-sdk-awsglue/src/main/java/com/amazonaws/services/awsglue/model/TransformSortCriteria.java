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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The sorting criteria that are associated with the machine learning transform.
 * </p>
 */
public class TransformSortCriteria implements Serializable {
    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     */
    private String column;

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     */
    private String sortDirection;

    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     *
     * @return <p>
     *         The column to be used in the sorting criteria that are associated
     *         with the machine learning transform.
     *         </p>
     * @see TransformSortColumnType
     */
    public String getColumn() {
        return column;
    }

    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     *
     * @param column <p>
     *            The column to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @see TransformSortColumnType
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     *
     * @param column <p>
     *            The column to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformSortColumnType
     */
    public TransformSortCriteria withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     *
     * @param column <p>
     *            The column to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @see TransformSortColumnType
     */
    public void setColumn(TransformSortColumnType column) {
        this.column = column.toString();
    }

    /**
     * <p>
     * The column to be used in the sorting criteria that are associated with
     * the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TRANSFORM_TYPE, STATUS, CREATED,
     * LAST_MODIFIED
     *
     * @param column <p>
     *            The column to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformSortColumnType
     */
    public TransformSortCriteria withColumn(TransformSortColumnType column) {
        this.column = column.toString();
        return this;
    }

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @return <p>
     *         The sort direction to be used in the sorting criteria that are
     *         associated with the machine learning transform.
     *         </p>
     * @see SortDirectionType
     */
    public String getSortDirection() {
        return sortDirection;
    }

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortDirection <p>
     *            The sort direction to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @see SortDirectionType
     */
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortDirection <p>
     *            The sort direction to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortDirectionType
     */
    public TransformSortCriteria withSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortDirection <p>
     *            The sort direction to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @see SortDirectionType
     */
    public void setSortDirection(SortDirectionType sortDirection) {
        this.sortDirection = sortDirection.toString();
    }

    /**
     * <p>
     * The sort direction to be used in the sorting criteria that are associated
     * with the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESCENDING, ASCENDING
     *
     * @param sortDirection <p>
     *            The sort direction to be used in the sorting criteria that are
     *            associated with the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortDirectionType
     */
    public TransformSortCriteria withSortDirection(SortDirectionType sortDirection) {
        this.sortDirection = sortDirection.toString();
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
        if (getColumn() != null)
            sb.append("Column: " + getColumn() + ",");
        if (getSortDirection() != null)
            sb.append("SortDirection: " + getSortDirection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode
                + ((getSortDirection() == null) ? 0 : getSortDirection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformSortCriteria == false)
            return false;
        TransformSortCriteria other = (TransformSortCriteria) obj;

        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getSortDirection() == null ^ this.getSortDirection() == null)
            return false;
        if (other.getSortDirection() != null
                && other.getSortDirection().equals(this.getSortDirection()) == false)
            return false;
        return true;
    }
}
