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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeOptionGroupOptionsResult implements Serializable {
    /**
     * <p>
     * List of available option group options.
     * </p>
     */
    private java.util.List<OptionGroupOption> optionGroupOptions;

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
     * List of available option group options.
     * </p>
     *
     * @return <p>
     *         List of available option group options.
     *         </p>
     */
    public java.util.List<OptionGroupOption> getOptionGroupOptions() {
        return optionGroupOptions;
    }

    /**
     * <p>
     * List of available option group options.
     * </p>
     *
     * @param optionGroupOptions <p>
     *            List of available option group options.
     *            </p>
     */
    public void setOptionGroupOptions(java.util.Collection<OptionGroupOption> optionGroupOptions) {
        if (optionGroupOptions == null) {
            this.optionGroupOptions = null;
            return;
        }

        this.optionGroupOptions = new java.util.ArrayList<OptionGroupOption>(optionGroupOptions);
    }

    /**
     * <p>
     * List of available option group options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptions <p>
     *            List of available option group options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupOptionsResult withOptionGroupOptions(
            OptionGroupOption... optionGroupOptions) {
        if (getOptionGroupOptions() == null) {
            this.optionGroupOptions = new java.util.ArrayList<OptionGroupOption>(
                    optionGroupOptions.length);
        }
        for (OptionGroupOption value : optionGroupOptions) {
            this.optionGroupOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of available option group options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptions <p>
     *            List of available option group options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupOptionsResult withOptionGroupOptions(
            java.util.Collection<OptionGroupOption> optionGroupOptions) {
        setOptionGroupOptions(optionGroupOptions);
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
    public DescribeOptionGroupOptionsResult withMarker(String marker) {
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
        if (getOptionGroupOptions() != null)
            sb.append("OptionGroupOptions: " + getOptionGroupOptions() + ",");
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
                + ((getOptionGroupOptions() == null) ? 0 : getOptionGroupOptions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOptionGroupOptionsResult == false)
            return false;
        DescribeOptionGroupOptionsResult other = (DescribeOptionGroupOptionsResult) obj;

        if (other.getOptionGroupOptions() == null ^ this.getOptionGroupOptions() == null)
            return false;
        if (other.getOptionGroupOptions() != null
                && other.getOptionGroupOptions().equals(this.getOptionGroupOptions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
