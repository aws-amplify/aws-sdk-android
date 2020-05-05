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
 * Describes one or more of your route tables.
 * </p>
 * <p>
 * Each subnet in your VPC must be associated with a route table. If a subnet is
 * not explicitly associated with any route table, it is implicitly associated
 * with the main route table. This command does not return the subnet ID for
 * implicit associations.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
 * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class DescribeRouteTablesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the
     * main route table for the VPC (<code>true</code> | <code>false</code>).
     * Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified
     * in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range
     * specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the
     * AWS service specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an
     * egress-only Internet gateway specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route
     * in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a
     * route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created.
     * <code>CreateRouteTable</code> indicates that the route was automatically
     * created when the route table was created; <code>CreateRoute</code>
     * indicates that the route was manually added to the route table;
     * <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (
     * <code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT instance
     * has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering
     * connection specified in a route in the table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     */
    private java.util.List<String> routeTableIds;

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
     * <b>Range: </b>5 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the
     * main route table for the VPC (<code>true</code> | <code>false</code>).
     * Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified
     * in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range
     * specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the
     * AWS service specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an
     * egress-only Internet gateway specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route
     * in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a
     * route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created.
     * <code>CreateRouteTable</code> indicates that the route was automatically
     * created when the route table was created; <code>CreateRoute</code>
     * indicates that the route was manually added to the route table;
     * <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (
     * <code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT instance
     * has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering
     * connection specified in a route in the table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     *         <code>association.route-table-association-id</code> - The ID of
     *         an association ID for the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.route-table-id</code> - The ID of the route
     *         table involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.subnet-id</code> - The ID of the subnet
     *         involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.main</code> - Indicates whether the route table
     *         is the main route table for the VPC (<code>true</code> |
     *         <code>false</code>). Route tables that do not have an association
     *         ID are not returned in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the
     *         route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-table-id</code> - The ID of the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-cidr-block</code> - The IPv4 CIDR range
     *         specified in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR
     *         range specified in a route in the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-prefix-list-id</code> - The ID (prefix)
     *         of the AWS service specified in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.egress-only-internet-gateway-id</code> - The ID of an
     *         egress-only Internet gateway specified in a route in the route
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.gateway-id</code> - The ID of a gateway specified in
     *         a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.instance-id</code> - The ID of an instance specified
     *         in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.transit-gateway-id</code> - The ID of a transit
     *         gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.origin</code> - Describes how the route was created.
     *         <code>CreateRouteTable</code> indicates that the route was
     *         automatically created when the route table was created;
     *         <code>CreateRoute</code> indicates that the route was manually
     *         added to the route table; <code>EnableVgwRoutePropagation</code>
     *         indicates that the route was propagated by route propagation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.state</code> - The state of a route in the route
     *         table (<code>active</code> | <code>blackhole</code>). The
     *         blackhole state indicates that the route's target isn't available
     *         (for example, the specified gateway isn't attached to the VPC,
     *         the specified NAT instance has been terminated, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *         peering connection specified in a route in the table.
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
     *         <code>transit-gateway-id</code> - The ID of a transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC for the route table.
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
     * <code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the
     * main route table for the VPC (<code>true</code> | <code>false</code>).
     * Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified
     * in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range
     * specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the
     * AWS service specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an
     * egress-only Internet gateway specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route
     * in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a
     * route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created.
     * <code>CreateRouteTable</code> indicates that the route was automatically
     * created when the route table was created; <code>CreateRoute</code>
     * indicates that the route was manually added to the route table;
     * <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (
     * <code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT instance
     * has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering
     * connection specified in a route in the table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     *            <code>association.route-table-association-id</code> - The ID
     *            of an association ID for the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.route-table-id</code> - The ID of the route
     *            table involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.main</code> - Indicates whether the route
     *            table is the main route table for the VPC (<code>true</code> |
     *            <code>false</code>). Route tables that do not have an
     *            association ID are not returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-table-id</code> - The ID of the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The IPv4 CIDR
     *            range specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR
     *            range specified in a route in the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-prefix-list-id</code> - The ID
     *            (prefix) of the AWS service specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.egress-only-internet-gateway-id</code> - The ID of
     *            an egress-only Internet gateway specified in a route in the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.gateway-id</code> - The ID of a gateway specified
     *            in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.instance-id</code> - The ID of an instance
     *            specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.transit-gateway-id</code> - The ID of a transit
     *            gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.origin</code> - Describes how the route was
     *            created. <code>CreateRouteTable</code> indicates that the
     *            route was automatically created when the route table was
     *            created; <code>CreateRoute</code> indicates that the route was
     *            manually added to the route table;
     *            <code>EnableVgwRoutePropagation</code> indicates that the
     *            route was propagated by route propagation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.state</code> - The state of a route in the route
     *            table (<code>active</code> | <code>blackhole</code>). The
     *            blackhole state indicates that the route's target isn't
     *            available (for example, the specified gateway isn't attached
     *            to the VPC, the specified NAT instance has been terminated,
     *            and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *            peering connection specified in a route in the table.
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
     *            <code>transit-gateway-id</code> - The ID of a transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC for the route table.
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
     * <code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the
     * main route table for the VPC (<code>true</code> | <code>false</code>).
     * Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified
     * in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range
     * specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the
     * AWS service specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an
     * egress-only Internet gateway specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route
     * in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a
     * route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created.
     * <code>CreateRouteTable</code> indicates that the route was automatically
     * created when the route table was created; <code>CreateRoute</code>
     * indicates that the route was manually added to the route table;
     * <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (
     * <code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT instance
     * has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering
     * connection specified in a route in the table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     *            <code>association.route-table-association-id</code> - The ID
     *            of an association ID for the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.route-table-id</code> - The ID of the route
     *            table involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.main</code> - Indicates whether the route
     *            table is the main route table for the VPC (<code>true</code> |
     *            <code>false</code>). Route tables that do not have an
     *            association ID are not returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-table-id</code> - The ID of the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The IPv4 CIDR
     *            range specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR
     *            range specified in a route in the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-prefix-list-id</code> - The ID
     *            (prefix) of the AWS service specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.egress-only-internet-gateway-id</code> - The ID of
     *            an egress-only Internet gateway specified in a route in the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.gateway-id</code> - The ID of a gateway specified
     *            in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.instance-id</code> - The ID of an instance
     *            specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.transit-gateway-id</code> - The ID of a transit
     *            gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.origin</code> - Describes how the route was
     *            created. <code>CreateRouteTable</code> indicates that the
     *            route was automatically created when the route table was
     *            created; <code>CreateRoute</code> indicates that the route was
     *            manually added to the route table;
     *            <code>EnableVgwRoutePropagation</code> indicates that the
     *            route was propagated by route propagation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.state</code> - The state of a route in the route
     *            table (<code>active</code> | <code>blackhole</code>). The
     *            blackhole state indicates that the route's target isn't
     *            available (for example, the specified gateway isn't attached
     *            to the VPC, the specified NAT instance has been terminated,
     *            and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *            peering connection specified in a route in the table.
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
     *            <code>transit-gateway-id</code> - The ID of a transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC for the route table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesRequest withFilters(Filter... filters) {
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
     * <code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table
     * involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the
     * association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the
     * main route table for the VPC (<code>true</code> | <code>false</code>).
     * Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified
     * in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range
     * specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the
     * AWS service specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an
     * egress-only Internet gateway specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route
     * in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a
     * route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created.
     * <code>CreateRouteTable</code> indicates that the route was automatically
     * created when the route table was created; <code>CreateRoute</code>
     * indicates that the route was manually added to the route table;
     * <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (
     * <code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT instance
     * has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering
     * connection specified in a route in the table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     *            <code>association.route-table-association-id</code> - The ID
     *            of an association ID for the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.route-table-id</code> - The ID of the route
     *            table involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.subnet-id</code> - The ID of the subnet
     *            involved in the association.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>association.main</code> - Indicates whether the route
     *            table is the main route table for the VPC (<code>true</code> |
     *            <code>false</code>). Route tables that do not have an
     *            association ID are not returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The ID of the AWS account that owns
     *            the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route-table-id</code> - The ID of the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-cidr-block</code> - The IPv4 CIDR
     *            range specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR
     *            range specified in a route in the route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.destination-prefix-list-id</code> - The ID
     *            (prefix) of the AWS service specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.egress-only-internet-gateway-id</code> - The ID of
     *            an egress-only Internet gateway specified in a route in the
     *            route table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.gateway-id</code> - The ID of a gateway specified
     *            in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.instance-id</code> - The ID of an instance
     *            specified in a route in the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.transit-gateway-id</code> - The ID of a transit
     *            gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.origin</code> - Describes how the route was
     *            created. <code>CreateRouteTable</code> indicates that the
     *            route was automatically created when the route table was
     *            created; <code>CreateRoute</code> indicates that the route was
     *            manually added to the route table;
     *            <code>EnableVgwRoutePropagation</code> indicates that the
     *            route was propagated by route propagation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.state</code> - The state of a route in the route
     *            table (<code>active</code> | <code>blackhole</code>). The
     *            blackhole state indicates that the route's target isn't
     *            available (for example, the specified gateway isn't attached
     *            to the VPC, the specified NAT instance has been terminated,
     *            and so on).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *            peering connection specified in a route in the table.
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
     *            <code>transit-gateway-id</code> - The ID of a transit gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-id</code> - The ID of the VPC for the route table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public DescribeRouteTablesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     *
     * @return <p>
     *         One or more route table IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your route tables.
     *         </p>
     */
    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     *
     * @param routeTableIds <p>
     *            One or more route table IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your route tables.
     *            </p>
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new java.util.ArrayList<String>(routeTableIds);
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            One or more route table IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesRequest withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) {
            this.routeTableIds = new java.util.ArrayList<String>(routeTableIds.length);
        }
        for (String value : routeTableIds) {
            this.routeTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            One or more route table IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
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
    public DescribeRouteTablesRequest withNextToken(String nextToken) {
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
     * <b>Range: </b>5 - 100<br/>
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
     * <b>Range: </b>5 - 100<br/>
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
     * <b>Range: </b>5 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesRequest withMaxResults(Integer maxResults) {
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
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: " + getRouteTableIds() + ",");
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
        hashCode = prime * hashCode
                + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
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

        if (obj instanceof DescribeRouteTablesRequest == false)
            return false;
        DescribeRouteTablesRequest other = (DescribeRouteTablesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null
                && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
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
