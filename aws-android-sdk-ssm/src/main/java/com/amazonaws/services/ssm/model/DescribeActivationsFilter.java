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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Filter for the DescribeActivation API.
 * </p>
 */
public class DescribeActivationsFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     */
    private String filterKey;

    /**
     * <p>
     * The filter values.
     * </p>
     */
    private java.util.List<String> filterValues;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     * @see DescribeActivationsFilterKeys
     */
    public String getFilterKey() {
        return filterKey;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     *
     * @param filterKey <p>
     *            The name of the filter.
     *            </p>
     * @see DescribeActivationsFilterKeys
     */
    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     *
     * @param filterKey <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DescribeActivationsFilterKeys
     */
    public DescribeActivationsFilter withFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     *
     * @param filterKey <p>
     *            The name of the filter.
     *            </p>
     * @see DescribeActivationsFilterKeys
     */
    public void setFilterKey(DescribeActivationsFilterKeys filterKey) {
        this.filterKey = filterKey.toString();
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationIds, DefaultInstanceName, IamRole
     *
     * @param filterKey <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DescribeActivationsFilterKeys
     */
    public DescribeActivationsFilter withFilterKey(DescribeActivationsFilterKeys filterKey) {
        this.filterKey = filterKey.toString();
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     *
     * @return <p>
     *         The filter values.
     *         </p>
     */
    public java.util.List<String> getFilterValues() {
        return filterValues;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     *
     * @param filterValues <p>
     *            The filter values.
     *            </p>
     */
    public void setFilterValues(java.util.Collection<String> filterValues) {
        if (filterValues == null) {
            this.filterValues = null;
            return;
        }

        this.filterValues = new java.util.ArrayList<String>(filterValues);
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterValues <p>
     *            The filter values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActivationsFilter withFilterValues(String... filterValues) {
        if (getFilterValues() == null) {
            this.filterValues = new java.util.ArrayList<String>(filterValues.length);
        }
        for (String value : filterValues) {
            this.filterValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterValues <p>
     *            The filter values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActivationsFilter withFilterValues(java.util.Collection<String> filterValues) {
        setFilterValues(filterValues);
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
        if (getFilterKey() != null)
            sb.append("FilterKey: " + getFilterKey() + ",");
        if (getFilterValues() != null)
            sb.append("FilterValues: " + getFilterValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterKey() == null) ? 0 : getFilterKey().hashCode());
        hashCode = prime * hashCode
                + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActivationsFilter == false)
            return false;
        DescribeActivationsFilter other = (DescribeActivationsFilter) obj;

        if (other.getFilterKey() == null ^ this.getFilterKey() == null)
            return false;
        if (other.getFilterKey() != null
                && other.getFilterKey().equals(this.getFilterKey()) == false)
            return false;
        if (other.getFilterValues() == null ^ this.getFilterValues() == null)
            return false;
        if (other.getFilterValues() != null
                && other.getFilterValues().equals(this.getFilterValues()) == false)
            return false;
        return true;
    }
}
