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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a field to sort by and a sort order.
 * </p>
 */
public class SortCriterion implements Serializable {
    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String fieldName;

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     */
    private String sort;

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the field on which to sort.
     *         </p>
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SortCriterion withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @return <p>
     *         An ascending or descending sort.
     *         </p>
     * @see Sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            An ascending or descending sort.
     *            </p>
     * @see Sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            An ascending or descending sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Sort
     */
    public SortCriterion withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            An ascending or descending sort.
     *            </p>
     * @see Sort
     */
    public void setSort(Sort sort) {
        this.sort = sort.toString();
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            An ascending or descending sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Sort
     */
    public SortCriterion withSort(Sort sort) {
        this.sort = sort.toString();
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
        if (getFieldName() != null)
            sb.append("FieldName: " + getFieldName() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortCriterion == false)
            return false;
        SortCriterion other = (SortCriterion) obj;

        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null
                && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }
}
