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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * List of option groups.
 * </p>
 */
public class DescribeOptionGroupsResult implements Serializable {
    /**
     * <p>
     * List of option groups.
     * </p>
     */
    private java.util.List<OptionGroup> optionGroupsList;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * List of option groups.
     * </p>
     *
     * @return <p>
     *         List of option groups.
     *         </p>
     */
    public java.util.List<OptionGroup> getOptionGroupsList() {
        return optionGroupsList;
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     *
     * @param optionGroupsList <p>
     *            List of option groups.
     *            </p>
     */
    public void setOptionGroupsList(java.util.Collection<OptionGroup> optionGroupsList) {
        if (optionGroupsList == null) {
            this.optionGroupsList = null;
            return;
        }

        this.optionGroupsList = new java.util.ArrayList<OptionGroup>(optionGroupsList);
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupsList <p>
     *            List of option groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsResult withOptionGroupsList(OptionGroup... optionGroupsList) {
        if (getOptionGroupsList() == null) {
            this.optionGroupsList = new java.util.ArrayList<OptionGroup>(optionGroupsList.length);
        }
        for (OptionGroup value : optionGroupsList) {
            this.optionGroupsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of option groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupsList <p>
     *            List of option groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsResult withOptionGroupsList(
            java.util.Collection<OptionGroup> optionGroupsList) {
        setOptionGroupsList(optionGroupsList);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getOptionGroupsList() != null)
            sb.append("OptionGroupsList: " + getOptionGroupsList() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOptionGroupsList() == null) ? 0 : getOptionGroupsList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOptionGroupsResult == false)
            return false;
        DescribeOptionGroupsResult other = (DescribeOptionGroupsResult) obj;

        if (other.getOptionGroupsList() == null ^ this.getOptionGroupsList() == null)
            return false;
        if (other.getOptionGroupsList() != null
                && other.getOptionGroupsList().equals(this.getOptionGroupsList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
