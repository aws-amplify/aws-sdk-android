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
 * Returns information about reserved DB instances for this account, or about a
 * specified reserved DB instance.
 * </p>
 */
public class DescribeReservedDBInstancesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter
     * to show only the reservation that matches the specified reservation ID.
     * </p>
     */
    private String reservedDBInstanceId;

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     */
    private String reservedDBInstancesOfferingId;

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * those reservations matching the specified DB instances class.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     */
    private String duration;

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * A value that indicates whether to show only those reservations that
     * support Multi-AZ.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The lease identifier filter value. Specify this parameter to show only
     * the reservation that matches the specified lease ID.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     */
    private String leaseId;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
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
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter
     * to show only the reservation that matches the specified reservation ID.
     * </p>
     *
     * @return <p>
     *         The reserved DB instance identifier filter value. Specify this
     *         parameter to show only the reservation that matches the specified
     *         reservation ID.
     *         </p>
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter
     * to show only the reservation that matches the specified reservation ID.
     * </p>
     *
     * @param reservedDBInstanceId <p>
     *            The reserved DB instance identifier filter value. Specify this
     *            parameter to show only the reservation that matches the
     *            specified reservation ID.
     *            </p>
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter
     * to show only the reservation that matches the specified reservation ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstanceId <p>
     *            The reserved DB instance identifier filter value. Specify this
     *            parameter to show only the reservation that matches the
     *            specified reservation ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     *
     * @return <p>
     *         The offering identifier filter value. Specify this parameter to
     *         show only purchased reservations matching the specified offering
     *         identifier.
     *         </p>
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The offering identifier filter value. Specify this parameter
     *            to show only purchased reservations matching the specified
     *            offering identifier.
     *            </p>
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The offering identifier filter value. Specify this parameter
     *            to show only purchased reservations matching the specified
     *            offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withReservedDBInstancesOfferingId(
            String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * those reservations matching the specified DB instances class.
     * </p>
     *
     * @return <p>
     *         The DB instance class filter value. Specify this parameter to
     *         show only those reservations matching the specified DB instances
     *         class.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * those reservations matching the specified DB instances class.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The DB instance class filter value. Specify this parameter to
     *            show only those reservations matching the specified DB
     *            instances class.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only
     * those reservations matching the specified DB instances class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The DB instance class filter value. Specify this parameter to
     *            show only those reservations matching the specified DB
     *            instances class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     *
     * @return <p>
     *         The duration filter value, specified in years or seconds. Specify
     *         this parameter to show only reservations for this duration.
     *         </p>
     *         <p>
     *         Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     *         </p>
     */
    public String getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     *
     * @param duration <p>
     *            The duration filter value, specified in years or seconds.
     *            Specify this parameter to show only reservations for this
     *            duration.
     *            </p>
     *            <p>
     *            Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     *            </p>
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration filter value, specified in years or seconds.
     *            Specify this parameter to show only reservations for this
     *            duration.
     *            </p>
     *            <p>
     *            Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     *
     * @return <p>
     *         The product description filter value. Specify this parameter to
     *         show only those reservations matching the specified product
     *         description.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     *
     * @param productDescription <p>
     *            The product description filter value. Specify this parameter
     *            to show only those reservations matching the specified product
     *            description.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The product description filter value. Specify this parameter
     *            to show only those reservations matching the specified product
     *            description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     *
     * @return <p>
     *         The offering type filter value. Specify this parameter to show
     *         only the available offerings matching the specified offering
     *         type.
     *         </p>
     *         <p>
     *         Valid Values:
     *         <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     *
     * @param offeringType <p>
     *            The offering type filter value. Specify this parameter to show
     *            only the available offerings matching the specified offering
     *            type.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The offering type filter value. Specify this parameter to show
     *            only the available offerings matching the specified offering
     *            type.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to show only those reservations that
     * support Multi-AZ.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to show only those reservations
     *         that support Multi-AZ.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether to show only those reservations that
     * support Multi-AZ.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to show only those reservations
     *         that support Multi-AZ.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether to show only those reservations that
     * support Multi-AZ.
     * </p>
     *
     * @param multiAZ <p>
     *            A value that indicates whether to show only those reservations
     *            that support Multi-AZ.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether to show only those reservations that
     * support Multi-AZ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            A value that indicates whether to show only those reservations
     *            that support Multi-AZ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The lease identifier filter value. Specify this parameter to show only
     * the reservation that matches the specified lease ID.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     *
     * @return <p>
     *         The lease identifier filter value. Specify this parameter to show
     *         only the reservation that matches the specified lease ID.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Support might request the lease ID for an issue related to a
     *         reserved DB instance.
     *         </p>
     *         </note>
     */
    public String getLeaseId() {
        return leaseId;
    }

    /**
     * <p>
     * The lease identifier filter value. Specify this parameter to show only
     * the reservation that matches the specified lease ID.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     *
     * @param leaseId <p>
     *            The lease identifier filter value. Specify this parameter to
     *            show only the reservation that matches the specified lease ID.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Support might request the lease ID for an issue related to
     *            a reserved DB instance.
     *            </p>
     *            </note>
     */
    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    /**
     * <p>
     * The lease identifier filter value. Specify this parameter to show only
     * the reservation that matches the specified lease ID.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param leaseId <p>
     *            The lease identifier filter value. Specify this parameter to
     *            show only the reservation that matches the specified lease ID.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Support might request the lease ID for an issue related to
     *            a reserved DB instance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedDBInstancesRequest withLeaseId(String leaseId) {
        this.leaseId = leaseId;
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
    public DescribeReservedDBInstancesRequest withFilters(Filter... filters) {
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
    public DescribeReservedDBInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
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
     *         than the <code>MaxRecords</code> value is available, a pagination
     *         token called a marker is included in the response so you can
     *         retrieve the remaining results.
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
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
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
     *            more than the <code>MaxRecords</code> value is available, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
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
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
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
     *            more than the <code>MaxRecords</code> value is available, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
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
    public DescribeReservedDBInstancesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
    public DescribeReservedDBInstancesRequest withMarker(String marker) {
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
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: " + getReservedDBInstanceId() + ",");
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getLeaseId() != null)
            sb.append("LeaseId: " + getLeaseId() + ",");
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

        hashCode = prime * hashCode
                + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedDBInstancesOfferingId() == null) ? 0
                        : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getLeaseId() == null) ? 0 : getLeaseId().hashCode());
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

        if (obj instanceof DescribeReservedDBInstancesRequest == false)
            return false;
        DescribeReservedDBInstancesRequest other = (DescribeReservedDBInstancesRequest) obj;

        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null
                && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
        if (other.getReservedDBInstancesOfferingId() == null
                ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(
                        this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getLeaseId() == null ^ this.getLeaseId() == null)
            return false;
        if (other.getLeaseId() != null && other.getLeaseId().equals(this.getLeaseId()) == false)
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
