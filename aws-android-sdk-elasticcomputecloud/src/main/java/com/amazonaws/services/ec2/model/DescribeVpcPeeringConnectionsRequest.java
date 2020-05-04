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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes one or more of your VPC peering connections.
 * </p>
 */
public class DescribeVpcPeeringConnectionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner
     * of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC
     * peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the
     * owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (
     * <code>pending-acceptance</code> | <code>failed</code> |
     * <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information
     * about the status of the VPC peering connection, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering
     * connection.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     */
    private java.util.List<String> vpcPeeringConnectionIds;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner
     * of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC
     * peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the
     * owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (
     * <code>pending-acceptance</code> | <code>failed</code> |
     * <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information
     * about the status of the VPC peering connection, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering
     * connection.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block
     *         of the accepter VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the accepter VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter
     *         VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expiration-time</code> - The expiration date and time for
     *         the VPC peering connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block
     *         of the requester's VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the requester VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.vpc-id</code> - The ID of the requester
     *         VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-code</code> - The status of the VPC peering
     *         connection (<code>pending-acceptance</code> | <code>failed</code>
     *         | <code>expired</code> | <code>provisioning</code> |
     *         <code>active</code> | <code>deleting</code> |
     *         <code>deleted</code> | <code>rejected</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - A message that provides more
     *         information about the status of the VPC peering connection, if
     *         applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     *         assigned to the resource. Use the tag key in the filter name and
     *         the tag value as the filter value. For example, to find all
     *         resources that have a tag with the key <code>Owner</code> and the
     *         value <code>TeamA</code>, specify <code>tag:Owner</code> for the
     *         filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-peering-connection-id</code> - The ID of the VPC
     *         peering connection.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner
     * of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC
     * peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the
     * owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (
     * <code>pending-acceptance</code> | <code>failed</code> |
     * <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information
     * about the status of the VPC peering connection, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering
     * connection.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter
     *            VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expiration-time</code> - The expiration date and time
     *            for the VPC peering connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the requester's VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.vpc-id</code> - The ID of the
     *            requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-code</code> - The status of the VPC peering
     *            connection (<code>pending-acceptance</code> |
     *            <code>failed</code> | <code>expired</code> |
     *            <code>provisioning</code> | <code>active</code> |
     *            <code>deleting</code> | <code>deleted</code> |
     *            <code>rejected</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-message</code> - A message that provides more
     *            information about the status of the VPC peering connection, if
     *            applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-peering-connection-id</code> - The ID of the VPC
     *            peering connection.
     *            </p>
     *            </li>
     *            </ul>
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner
     * of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC
     * peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the
     * owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (
     * <code>pending-acceptance</code> | <code>failed</code> |
     * <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information
     * about the status of the VPC peering connection, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering
     * connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter
     *            VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expiration-time</code> - The expiration date and time
     *            for the VPC peering connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the requester's VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.vpc-id</code> - The ID of the
     *            requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-code</code> - The status of the VPC peering
     *            connection (<code>pending-acceptance</code> |
     *            <code>failed</code> | <code>expired</code> |
     *            <code>provisioning</code> | <code>active</code> |
     *            <code>deleting</code> | <code>deleted</code> |
     *            <code>rejected</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-message</code> - A message that provides more
     *            information about the status of the VPC peering connection, if
     *            applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-peering-connection-id</code> - The ID of the VPC
     *            peering connection.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner
     * of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC
     * peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the
     * requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the
     * owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (
     * <code>pending-acceptance</code> | <code>failed</code> |
     * <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information
     * about the status of the VPC peering connection, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering
     * connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the accepter VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter
     *            VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>expiration-time</code> - The expiration date and time
     *            for the VPC peering connection.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR
     *            block of the requester's VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.owner-id</code> - The AWS account ID
     *            of the owner of the requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requester-vpc-info.vpc-id</code> - The ID of the
     *            requester VPC.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-code</code> - The status of the VPC peering
     *            connection (<code>pending-acceptance</code> |
     *            <code>failed</code> | <code>expired</code> |
     *            <code>provisioning</code> | <code>active</code> |
     *            <code>deleting</code> | <code>deleted</code> |
     *            <code>rejected</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status-message</code> - A message that provides more
     *            information about the status of the VPC peering connection, if
     *            applicable.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-peering-connection-id</code> - The ID of the VPC
     *            peering connection.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     *
     * @return <p>
     *         One or more VPC peering connection IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your VPC peering connections.
     *         </p>
     */
    public java.util.List<String> getVpcPeeringConnectionIds() {
        return vpcPeeringConnectionIds;
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     *
     * @param vpcPeeringConnectionIds <p>
     *            One or more VPC peering connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your VPC peering connections.
     *            </p>
     */
    public void setVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        if (vpcPeeringConnectionIds == null) {
            this.vpcPeeringConnectionIds = null;
            return;
        }

        this.vpcPeeringConnectionIds = new java.util.ArrayList<String>(vpcPeeringConnectionIds);
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcPeeringConnectionIds <p>
     *            One or more VPC peering connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your VPC peering connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(
            String... vpcPeeringConnectionIds) {
        if (getVpcPeeringConnectionIds() == null) {
            this.vpcPeeringConnectionIds = new java.util.ArrayList<String>(
                    vpcPeeringConnectionIds.length);
        }
        for (String value : vpcPeeringConnectionIds) {
            this.vpcPeeringConnectionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcPeeringConnectionIds <p>
     *            One or more VPC peering connection IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your VPC peering connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(
            java.util.Collection<String> vpcPeeringConnectionIds) {
        setVpcPeeringConnectionIds(vpcPeeringConnectionIds);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcPeeringConnectionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getVpcPeeringConnectionIds() != null)
            sb.append("VpcPeeringConnectionIds: " + getVpcPeeringConnectionIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcPeeringConnectionIds() == null) ? 0 : getVpcPeeringConnectionIds()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcPeeringConnectionsRequest == false)
            return false;
        DescribeVpcPeeringConnectionsRequest other = (DescribeVpcPeeringConnectionsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getVpcPeeringConnectionIds() == null ^ this.getVpcPeeringConnectionIds() == null)
            return false;
        if (other.getVpcPeeringConnectionIds() != null
                && other.getVpcPeeringConnectionIds().equals(this.getVpcPeeringConnectionIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
