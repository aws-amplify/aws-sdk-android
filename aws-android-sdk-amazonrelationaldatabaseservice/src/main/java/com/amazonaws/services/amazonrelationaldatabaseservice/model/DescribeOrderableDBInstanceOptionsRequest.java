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
 * Returns a list of orderable DB instance options for the specified engine.
 * </p>
 */
public class DescribeOrderableDBInstanceOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the
     * available offerings matching the specified engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * the available offerings matching the specified DB instance class.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the
     * available offerings matching the specified license model.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * A value that indicates whether to show only VPC or non-VPC offerings.
     * </p>
     */
    private Boolean vpc;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

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
     * An optional pagination token provided by a previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     *
     * @return <p>
     *         The name of the engine to retrieve DB instance options for.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     *
     * @param engine <p>
     *            The name of the engine to retrieve DB instance options for.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the engine to retrieve DB instance options for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the
     * available offerings matching the specified engine version.
     * </p>
     *
     * @return <p>
     *         The engine version filter value. Specify this parameter to show
     *         only the available offerings matching the specified engine
     *         version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the
     * available offerings matching the specified engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version filter value. Specify this parameter to
     *            show only the available offerings matching the specified
     *            engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the
     * available offerings matching the specified engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version filter value. Specify this parameter to
     *            show only the available offerings matching the specified
     *            engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * the available offerings matching the specified DB instance class.
     * </p>
     *
     * @return <p>
     *         The DB instance class filter value. Specify this parameter to
     *         show only the available offerings matching the specified DB
     *         instance class.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * the available offerings matching the specified DB instance class.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The DB instance class filter value. Specify this parameter to
     *            show only the available offerings matching the specified DB
     *            instance class.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * the available offerings matching the specified DB instance class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The DB instance class filter value. Specify this parameter to
     *            show only the available offerings matching the specified DB
     *            instance class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the
     * available offerings matching the specified license model.
     * </p>
     *
     * @return <p>
     *         The license model filter value. Specify this parameter to show
     *         only the available offerings matching the specified license
     *         model.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the
     * available offerings matching the specified license model.
     * </p>
     *
     * @param licenseModel <p>
     *            The license model filter value. Specify this parameter to show
     *            only the available offerings matching the specified license
     *            model.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the
     * available offerings matching the specified license model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            The license model filter value. Specify this parameter to show
     *            only the available offerings matching the specified license
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to show only VPC or non-VPC offerings.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to show only VPC or non-VPC
     *         offerings.
     *         </p>
     */
    public Boolean isVpc() {
        return vpc;
    }

    /**
     * <p>
     * A value that indicates whether to show only VPC or non-VPC offerings.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to show only VPC or non-VPC
     *         offerings.
     *         </p>
     */
    public Boolean getVpc() {
        return vpc;
    }

    /**
     * <p>
     * A value that indicates whether to show only VPC or non-VPC offerings.
     * </p>
     *
     * @param vpc <p>
     *            A value that indicates whether to show only VPC or non-VPC
     *            offerings.
     *            </p>
     */
    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * A value that indicates whether to show only VPC or non-VPC offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpc <p>
     *            A value that indicates whether to show only VPC or non-VPC
     *            offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withVpc(Boolean vpc) {
        this.vpc = vpc;
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
    public DescribeOrderableDBInstanceOptionsRequest withFilters(Filter... filters) {
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
    public DescribeOrderableDBInstanceOptionsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public DescribeOrderableDBInstanceOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         DescribeOrderableDBInstanceOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code> .
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeOrderableDBInstanceOptions request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeOrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeOrderableDBInstanceOptions request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableDBInstanceOptionsRequest withMarker(String marker) {
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getVpc() != null)
            sb.append("Vpc: " + getVpc() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrderableDBInstanceOptionsRequest == false)
            return false;
        DescribeOrderableDBInstanceOptionsRequest other = (DescribeOrderableDBInstanceOptionsRequest) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null
                && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
