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

/**
 * <p>
 * Specifies criteria for sorting the results of a request for information about
 * classification jobs.
 * </p>
 */
public class ListJobsSortCriteria implements Serializable {
    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     */
    private String attributeName;

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     */
    private String orderBy;

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     *
     * @return <p>
     *         The property to sort the results by.
     *         </p>
     * @see ListJobsSortAttributeName
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     *
     * @param attributeName <p>
     *            The property to sort the results by.
     *            </p>
     * @see ListJobsSortAttributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     *
     * @param attributeName <p>
     *            The property to sort the results by.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListJobsSortAttributeName
     */
    public ListJobsSortCriteria withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     *
     * @param attributeName <p>
     *            The property to sort the results by.
     *            </p>
     * @see ListJobsSortAttributeName
     */
    public void setAttributeName(ListJobsSortAttributeName attributeName) {
        this.attributeName = attributeName.toString();
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>createdAt, jobStatus, name, jobType
     *
     * @param attributeName <p>
     *            The property to sort the results by.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListJobsSortAttributeName
     */
    public ListJobsSortCriteria withAttributeName(ListJobsSortAttributeName attributeName) {
        this.attributeName = attributeName.toString();
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @return <p>
     *         The sort order to apply to the results, based on the value for
     *         the property specified by the attributeName property. Valid
     *         values are: ASC, sort the results in ascending order; and, DESC,
     *         sort the results in descending order.
     *         </p>
     * @see OrderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param orderBy <p>
     *            The sort order to apply to the results, based on the value for
     *            the property specified by the attributeName property. Valid
     *            values are: ASC, sort the results in ascending order; and,
     *            DESC, sort the results in descending order.
     *            </p>
     * @see OrderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param orderBy <p>
     *            The sort order to apply to the results, based on the value for
     *            the property specified by the attributeName property. Valid
     *            values are: ASC, sort the results in ascending order; and,
     *            DESC, sort the results in descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderBy
     */
    public ListJobsSortCriteria withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param orderBy <p>
     *            The sort order to apply to the results, based on the value for
     *            the property specified by the attributeName property. Valid
     *            values are: ASC, sort the results in ascending order; and,
     *            DESC, sort the results in descending order.
     *            </p>
     * @see OrderBy
     */
    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the
     * property specified by the attributeName property. Valid values are: ASC,
     * sort the results in ascending order; and, DESC, sort the results in
     * descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param orderBy <p>
     *            The sort order to apply to the results, based on the value for
     *            the property specified by the attributeName property. Valid
     *            values are: ASC, sort the results in ascending order; and,
     *            DESC, sort the results in descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderBy
     */
    public ListJobsSortCriteria withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
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
        if (getAttributeName() != null)
            sb.append("attributeName: " + getAttributeName() + ",");
        if (getOrderBy() != null)
            sb.append("orderBy: " + getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsSortCriteria == false)
            return false;
        ListJobsSortCriteria other = (ListJobsSortCriteria) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }
}
