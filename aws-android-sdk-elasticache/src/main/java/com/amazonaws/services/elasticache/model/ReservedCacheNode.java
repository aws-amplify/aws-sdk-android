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

/**
 * <p>
 * Represents the output of a <code>PurchaseReservedCacheNodesOffering</code>
 * operation.
 * </p>
 */
public class ReservedCacheNode implements Serializable {
    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedCacheNodeId;

    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedCacheNodesOfferingId;

    /**
     * <p>
     * The cache node type for the reserved cache nodes.
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
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     */
    private Integer cacheNodeCount;

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved cache node.
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     * </p>
     */
    private String reservationARN;

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the reservation.
     *         </p>
     */
    public String getReservedCacheNodeId() {
        return reservedCacheNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     *
     * @param reservedCacheNodeId <p>
     *            The unique identifier for the reservation.
     *            </p>
     */
    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodeId <p>
     *            The unique identifier for the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
        return this;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @return <p>
     *         The offering identifier.
     *         </p>
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The offering identifier.
     *            </p>
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedCacheNodesOfferingId <p>
     *            The offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * <p>
     * The cache node type for the reserved cache nodes.
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
     *         The cache node type for the reserved cache nodes.
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
     * The cache node type for the reserved cache nodes.
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
     *            The cache node type for the reserved cache nodes.
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
     * The cache node type for the reserved cache nodes.
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
     *            The cache node type for the reserved cache nodes.
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
    public ReservedCacheNode withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     *
     * @return <p>
     *         The time the reservation started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     *
     * @param startTime <p>
     *            The time the reservation started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the reservation started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the reservation in seconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the reservation in seconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the reservation in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     *
     * @return <p>
     *         The fixed price charged for this reserved cache node.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this reserved cache node.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     *
     * @return <p>
     *         The hourly price charged for this reserved cache node.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     *
     * @param usagePrice <p>
     *            The hourly price charged for this reserved cache node.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The hourly price charged for this reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     *
     * @return <p>
     *         The number of cache nodes that have been reserved.
     *         </p>
     */
    public Integer getCacheNodeCount() {
        return cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     *
     * @param cacheNodeCount <p>
     *            The number of cache nodes that have been reserved.
     *            </p>
     */
    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeCount <p>
     *            The number of cache nodes that have been reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
        return this;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     *
     * @return <p>
     *         The description of the reserved cache node.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     *
     * @param productDescription <p>
     *            The description of the reserved cache node.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The description of the reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     *
     * @return <p>
     *         The offering type of this reserved cache node.
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     *
     * @param offeringType <p>
     *            The offering type of this reserved cache node.
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The offering type of this reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     *
     * @return <p>
     *         The state of the reserved cache node.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     *
     * @param state <p>
     *            The state of the reserved cache node.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     *
     * @return <p>
     *         The recurring price charged to run this reserved cache node.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved cache node.
     *            </p>
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) {
            this.recurringCharges = new java.util.ArrayList<RecurringCharge>(
                    recurringCharges.length);
        }
        for (RecurringCharge value : recurringCharges) {
            this.recurringCharges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved cache node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved cache node.
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the reserved cache node.
     *         </p>
     *         <p>
     *         Example:
     *         <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     *         </p>
     */
    public String getReservationARN() {
        return reservationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved cache node.
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     * </p>
     *
     * @param reservationARN <p>
     *            The Amazon Resource Name (ARN) of the reserved cache node.
     *            </p>
     *            <p>
     *            Example:
     *            <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     *            </p>
     */
    public void setReservationARN(String reservationARN) {
        this.reservationARN = reservationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved cache node.
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationARN <p>
     *            The Amazon Resource Name (ARN) of the reserved cache node.
     *            </p>
     *            <p>
     *            Example:
     *            <code>arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedCacheNode withReservationARN(String reservationARN) {
        this.reservationARN = reservationARN;
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
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCacheNodeCount() != null)
            sb.append("CacheNodeCount: " + getCacheNodeCount() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges() + ",");
        if (getReservationARN() != null)
            sb.append("ReservationARN: " + getReservationARN());
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
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeCount() == null) ? 0 : getCacheNodeCount().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode
                + ((getReservationARN() == null) ? 0 : getReservationARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedCacheNode == false)
            return false;
        ReservedCacheNode other = (ReservedCacheNode) obj;

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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCacheNodeCount() == null ^ this.getCacheNodeCount() == null)
            return false;
        if (other.getCacheNodeCount() != null
                && other.getCacheNodeCount().equals(this.getCacheNodeCount()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservationARN() == null ^ this.getReservationARN() == null)
            return false;
        if (other.getReservationARN() != null
                && other.getReservationARN().equals(this.getReservationARN()) == false)
            return false;
        return true;
    }
}
