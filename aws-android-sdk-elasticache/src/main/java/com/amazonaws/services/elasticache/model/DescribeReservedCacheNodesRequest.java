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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about reserved cache nodes for this account, or about a
 * specified reserved cache node.
 * </p>
 */
public class DescribeReservedCacheNodesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     * </p>
     */
    private String reservedCacheNodeId;

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     */
    private String reservedCacheNodesOfferingId;

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only those
     * reservations matching the specified cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     */
    private String duration;

    /**
     * <p>
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     * </p>
     *
     * @return <p>
     *         The reserved cache node identifier filter value. Use this
     *         parameter to show only the reservation that matches the specified
     *         reservation ID.
     *         </p>
     */
    public String getReservedCacheNodeId() {
        return reservedCacheNodeId;
    }

    /**
     * <p>
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     * </p>
     *
     * @param reservedCacheNodeId <p>
     *            The reserved cache node identifier filter value. Use this
     *            parameter to show only the reservation that matches the
     *            specified reservation ID.
     *            </p>
     */
    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }

    /**
     * <p>
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodeId <p>
     *            The reserved cache node identifier filter value. Use this
     *            parameter to show only the reservation that matches the
     *            specified reservation ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
        return this;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     *
     * @return <p>
     *         The offering identifier filter value. Use this parameter to show
     *         only purchased reservations matching the specified offering
     *         identifier.
     *         </p>
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The offering identifier filter value. Use this parameter to
     *            show only purchased reservations matching the specified
     *            offering identifier.
     *            </p>
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The offering identifier filter value. Use this parameter to
     *            show only purchased reservations matching the specified
     *            offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withReservedCacheNodesOfferingId(
            String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only those
     * reservations matching the specified cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The cache node type filter value. Use this parameter to show only
     *         those reservations matching the specified cache node type.
     *         </p>
     *         <p>
     *         The following node types are supported by ElastiCache. Generally
     *         speaking, the current generation types provide more memory and
     *         computational power at lower cost when compared to their
     *         equivalent previous generation counterparts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>M5 node types:</b> <code>cache.m5.large</code>,
     *         <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *         <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *         <code>cache.m5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>M4 node types:</b> <code>cache.m4.large</code>,
     *         <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *         <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *         </p>
     *         <p>
     *         <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *         <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *         </p>
     *         <p>
     *         <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>T1 node types:</b> <code>cache.t1.micro</code>
     *         </p>
     *         <p>
     *         <b>M1 node types:</b> <code>cache.m1.small</code>,
     *         <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *         <code>cache.m1.xlarge</code>
     *         </p>
     *         <p>
     *         <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *         <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *         <code>cache.m3.2xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>R5 node types:</b> <code>cache.r5.large</code>,
     *         <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *         <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *         <code>cache.r5.24xlarge</code>
     *         </p>
     *         <p>
     *         <b>R4 node types:</b> <code>cache.r4.large</code>,
     *         <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *         <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *         <code>cache.r4.16xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *         <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *         </p>
     *         <p>
     *         <b>R3 node types:</b> <code>cache.r3.large</code>,
     *         <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *         <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Additional node type info</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All current generation instance types are created in Amazon VPC
     *         by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis append-only files (AOF) are not supported for T1 or T2
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Multi-AZ with automatic failover is not supported on T1
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis configuration variables <code>appendonly</code> and
     *         <code>appendfsync</code> are not supported on Redis version
     *         2.8.22 and later.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only those
     * reservations matching the specified cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     *
     * @param cacheNodeType <p>
     *            The cache node type filter value. Use this parameter to show
     *            only those reservations matching the specified cache node
     *            type.
     *            </p>
     *            <p>
     *            The following node types are supported by ElastiCache.
     *            Generally speaking, the current generation types provide more
     *            memory and computational power at lower cost when compared to
     *            their equivalent previous generation counterparts.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General purpose:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>M5 node types:</b> <code>cache.m5.large</code>,
     *            <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *            <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *            <code>cache.m5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>M4 node types:</b> <code>cache.m4.large</code>,
     *            <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *            <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *            </p>
     *            <p>
     *            <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *            <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *            </p>
     *            <p>
     *            <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *            <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>T1 node types:</b> <code>cache.t1.micro</code>
     *            </p>
     *            <p>
     *            <b>M1 node types:</b> <code>cache.m1.small</code>,
     *            <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *            <code>cache.m1.xlarge</code>
     *            </p>
     *            <p>
     *            <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *            <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *            <code>cache.m3.2xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Compute optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Memory optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>R5 node types:</b> <code>cache.r5.large</code>,
     *            <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *            <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *            <code>cache.r5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>R4 node types:</b> <code>cache.r4.large</code>,
     *            <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *            <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *            <code>cache.r4.16xlarge</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *            <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *            </p>
     *            <p>
     *            <b>R3 node types:</b> <code>cache.r3.large</code>,
     *            <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *            <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Additional node type info</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            All current generation instance types are created in Amazon
     *            VPC by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis append-only files (AOF) are not supported for T1 or T2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis Multi-AZ with automatic failover is not supported on T1
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis configuration variables <code>appendonly</code> and
     *            <code>appendfsync</code> are not supported on Redis version
     *            2.8.22 and later.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only those
     * reservations matching the specified cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally
     * speaking, the current generation types provide more memory and
     * computational power at lower cost when compared to their equivalent
     * previous generation counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>M5 node types:</b> <code>cache.m5.large</code>,
     * <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     * <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     * <code>cache.m5.24xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>,
     * <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * <p>
     * <b>T3 node types:</b> <code>cache.t3.micro</code>,
     * <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>,
     * <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>,
     * <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R5 node types:</b> <code>cache.r5.large</code>,
     * <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     * <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     * <code>cache.r5.24xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types:</b> <code>cache.r4.large</code>,
     * <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     * <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Additional node type info</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All current generation instance types are created in Amazon VPC by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis configuration variables <code>appendonly</code> and
     * <code>appendfsync</code> are not supported on Redis version 2.8.22 and
     * later.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            The cache node type filter value. Use this parameter to show
     *            only those reservations matching the specified cache node
     *            type.
     *            </p>
     *            <p>
     *            The following node types are supported by ElastiCache.
     *            Generally speaking, the current generation types provide more
     *            memory and computational power at lower cost when compared to
     *            their equivalent previous generation counterparts.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General purpose:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>M5 node types:</b> <code>cache.m5.large</code>,
     *            <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>,
     *            <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>,
     *            <code>cache.m5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>M4 node types:</b> <code>cache.m4.large</code>,
     *            <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     *            <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *            </p>
     *            <p>
     *            <b>T3 node types:</b> <code>cache.t3.micro</code>,
     *            <code>cache.t3.small</code>, <code>cache.t3.medium</code>
     *            </p>
     *            <p>
     *            <b>T2 node types:</b> <code>cache.t2.micro</code>,
     *            <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>T1 node types:</b> <code>cache.t1.micro</code>
     *            </p>
     *            <p>
     *            <b>M1 node types:</b> <code>cache.m1.small</code>,
     *            <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     *            <code>cache.m1.xlarge</code>
     *            </p>
     *            <p>
     *            <b>M3 node types:</b> <code>cache.m3.medium</code>,
     *            <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *            <code>cache.m3.2xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Compute optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Memory optimized:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Current generation:
     *            </p>
     *            <p>
     *            <b>R5 node types:</b> <code>cache.r5.large</code>,
     *            <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>,
     *            <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>,
     *            <code>cache.r5.24xlarge</code>
     *            </p>
     *            <p>
     *            <b>R4 node types:</b> <code>cache.r4.large</code>,
     *            <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     *            <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *            <code>cache.r4.16xlarge</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Previous generation: (not recommended)
     *            </p>
     *            <p>
     *            <b>M2 node types:</b> <code>cache.m2.xlarge</code>,
     *            <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *            </p>
     *            <p>
     *            <b>R3 node types:</b> <code>cache.r3.large</code>,
     *            <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *            <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Additional node type info</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            All current generation instance types are created in Amazon
     *            VPC by default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis append-only files (AOF) are not supported for T1 or T2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis Multi-AZ with automatic failover is not supported on T1
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis configuration variables <code>appendonly</code> and
     *            <code>appendfsync</code> are not supported on Redis version
     *            2.8.22 and later.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     *
     * @return <p>
     *         The duration filter value, specified in years or seconds. Use
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
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     *
     * @param duration <p>
     *            The duration filter value, specified in years or seconds. Use
     *            this parameter to show only reservations for this duration.
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
     * The duration filter value, specified in years or seconds. Use this
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
     *            The duration filter value, specified in years or seconds. Use
     *            this parameter to show only reservations for this duration.
     *            </p>
     *            <p>
     *            Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     *
     * @return <p>
     *         The product description filter value. Use this parameter to show
     *         only those reservations matching the specified product
     *         description.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     *
     * @param productDescription <p>
     *            The product description filter value. Use this parameter to
     *            show only those reservations matching the specified product
     *            description.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The product description filter value. Use this parameter to
     *            show only those reservations matching the specified product
     *            description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     *
     * @return <p>
     *         The offering type filter value. Use this parameter to show only
     *         the available offerings matching the specified offering type.
     *         </p>
     *         <p>
     *         Valid values:
     *         <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     *
     * @param offeringType <p>
     *            The offering type filter value. Use this parameter to show
     *            only the available offerings matching the specified offering
     *            type.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The offering type filter value. Use this parameter to show
     *            only the available offerings matching the specified offering
     *            type.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results
     *         can be retrieved.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a marker is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a marker is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20; maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this operation. If this parameter
     *         is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedCacheNodesRequest withMarker(String marker) {
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
        if (getReservedCacheNodeId() != null)
            sb.append("ReservedCacheNodeId: " + getReservedCacheNodeId() + ",");
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
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
                + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedCacheNodesOfferingId() == null) ? 0
                        : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
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

        if (obj instanceof DescribeReservedCacheNodesRequest == false)
            return false;
        DescribeReservedCacheNodesRequest other = (DescribeReservedCacheNodesRequest) obj;

        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null)
            return false;
        if (other.getReservedCacheNodeId() != null
                && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false)
            return false;
        if (other.getReservedCacheNodesOfferingId() == null
                ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null
                && other.getReservedCacheNodesOfferingId().equals(
                        this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
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
