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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the available option groups.
 * </p>
 */
public class DescribeOptionGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the option group to describe. Can't be supplied together with
     * EngineName or MajorEngineVersion.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOptionGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine.
     * </p>
     */
    private String engineName;

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine version. If specified, then EngineName must
     * also be specified.
     * </p>
     */
    private String majorEngineVersion;

    /**
     * <p>
     * The name of the option group to describe. Can't be supplied together with
     * EngineName or MajorEngineVersion.
     * </p>
     *
     * @return <p>
     *         The name of the option group to describe. Can't be supplied
     *         together with EngineName or MajorEngineVersion.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to describe. Can't be supplied together with
     * EngineName or MajorEngineVersion.
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group to describe. Can't be supplied
     *            together with EngineName or MajorEngineVersion.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to describe. Can't be supplied together with
     * EngineName or MajorEngineVersion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group to describe. Can't be supplied
     *            together with EngineName or MajorEngineVersion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @return <p>
     *         This parameter isn't currently supported.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOptionGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         DescribeOptionGroups request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOptionGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeOptionGroups request. If this parameter is specified,
     *            the response includes only records beyond the marker, up to
     *            the value specified by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOptionGroups
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeOptionGroups request. If this parameter is specified,
     *            the response includes only records beyond the marker, up to
     *            the value specified by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that you can retrieve the remaining results.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine.
     * </p>
     *
     * @return <p>
     *         Filters the list of option groups to only include groups
     *         associated with a specific database engine.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine.
     * </p>
     *
     * @param engineName <p>
     *            Filters the list of option groups to only include groups
     *            associated with a specific database engine.
     *            </p>
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineName <p>
     *            Filters the list of option groups to only include groups
     *            associated with a specific database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine version. If specified, then EngineName must
     * also be specified.
     * </p>
     *
     * @return <p>
     *         Filters the list of option groups to only include groups
     *         associated with a specific database engine version. If specified,
     *         then EngineName must also be specified.
     *         </p>
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine version. If specified, then EngineName must
     * also be specified.
     * </p>
     *
     * @param majorEngineVersion <p>
     *            Filters the list of option groups to only include groups
     *            associated with a specific database engine version. If
     *            specified, then EngineName must also be specified.
     *            </p>
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Filters the list of option groups to only include groups associated with
     * a specific database engine version. If specified, then EngineName must
     * also be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param majorEngineVersion <p>
     *            Filters the list of option groups to only include groups
     *            associated with a specific database engine version. If
     *            specified, then EngineName must also be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOptionGroupsRequest withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: " + getMajorEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOptionGroupsRequest == false)
            return false;
        DescribeOptionGroupsRequest other = (DescribeOptionGroupsRequest) obj;

        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null
                && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        return true;
    }
}
