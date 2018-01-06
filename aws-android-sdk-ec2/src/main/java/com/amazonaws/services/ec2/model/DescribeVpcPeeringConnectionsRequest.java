/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpcPeeringConnectionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest) DescribeVpcPeeringConnections operation}.
 * <p>
 * Describes one or more of your VPC peering connections.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest)
 */
public class DescribeVpcPeeringConnectionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpcPeeringConnectionsRequest> {

    /**
     * One or more VPC peering connection IDs. <p>Default: Describes all your
     * VPC peering connections.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcPeeringConnectionIds;

    /**
     * One or more filters. <ul> <li>
     * <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     * peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     * AWS account ID of the owner of the peer VPC. </li> <li>
     * <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </li> <li> <p><code>expiration-time</code> - The expiration date and
     * time for the VPC peering connection. </li> <li>
     * <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     * requester's VPC. </li> <li>
     * <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     * the owner of the requester VPC. </li> <li>
     * <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     * VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     * peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     * | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     * </li> <li> <p><code>status-message</code> - A message that provides
     * more information about the status of the VPC peering connection, if
     * applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     * of the VPC peering connection. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more VPC peering connection IDs. <p>Default: Describes all your
     * VPC peering connections.
     *
     * @return One or more VPC peering connection IDs. <p>Default: Describes all your
     *         VPC peering connections.
     */
    public java.util.List<String> getVpcPeeringConnectionIds() {
        if (vpcPeeringConnectionIds == null) {
              vpcPeeringConnectionIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcPeeringConnectionIds.setAutoConstruct(true);
        }
        return vpcPeeringConnectionIds;
    }
    
    /**
     * One or more VPC peering connection IDs. <p>Default: Describes all your
     * VPC peering connections.
     *
     * @param vpcPeeringConnectionIds One or more VPC peering connection IDs. <p>Default: Describes all your
     *         VPC peering connections.
     */
    public void setVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        if (vpcPeeringConnectionIds == null) {
            this.vpcPeeringConnectionIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcPeeringConnectionIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcPeeringConnectionIds.size());
        vpcPeeringConnectionIdsCopy.addAll(vpcPeeringConnectionIds);
        this.vpcPeeringConnectionIds = vpcPeeringConnectionIdsCopy;
    }
    
    /**
     * One or more VPC peering connection IDs. <p>Default: Describes all your
     * VPC peering connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionIds One or more VPC peering connection IDs. <p>Default: Describes all your
     *         VPC peering connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(String... vpcPeeringConnectionIds) {
        if (getVpcPeeringConnectionIds() == null) setVpcPeeringConnectionIds(new java.util.ArrayList<String>(vpcPeeringConnectionIds.length));
        for (String value : vpcPeeringConnectionIds) {
            getVpcPeeringConnectionIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more VPC peering connection IDs. <p>Default: Describes all your
     * VPC peering connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionIds One or more VPC peering connection IDs. <p>Default: Describes all your
     *         VPC peering connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        if (vpcPeeringConnectionIds == null) {
            this.vpcPeeringConnectionIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcPeeringConnectionIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcPeeringConnectionIds.size());
            vpcPeeringConnectionIdsCopy.addAll(vpcPeeringConnectionIds);
            this.vpcPeeringConnectionIds = vpcPeeringConnectionIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li>
     * <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     * peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     * AWS account ID of the owner of the peer VPC. </li> <li>
     * <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </li> <li> <p><code>expiration-time</code> - The expiration date and
     * time for the VPC peering connection. </li> <li>
     * <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     * requester's VPC. </li> <li>
     * <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     * the owner of the requester VPC. </li> <li>
     * <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     * VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     * peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     * | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     * </li> <li> <p><code>status-message</code> - A message that provides
     * more information about the status of the VPC peering connection, if
     * applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     * of the VPC peering connection. </li> </ul>
     *
     * @return One or more filters. <ul> <li>
     *         <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     *         peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     *         AWS account ID of the owner of the peer VPC. </li> <li>
     *         <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *         </li> <li> <p><code>expiration-time</code> - The expiration date and
     *         time for the VPC peering connection. </li> <li>
     *         <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     *         requester's VPC. </li> <li>
     *         <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the requester VPC. </li> <li>
     *         <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     *         VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     *         peering connection (<code>pending-acceptance</code> |
     *         <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     *         | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     *         </li> <li> <p><code>status-message</code> - A message that provides
     *         more information about the status of the VPC peering connection, if
     *         applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     *         of the VPC peering connection. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     * peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     * AWS account ID of the owner of the peer VPC. </li> <li>
     * <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </li> <li> <p><code>expiration-time</code> - The expiration date and
     * time for the VPC peering connection. </li> <li>
     * <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     * requester's VPC. </li> <li>
     * <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     * the owner of the requester VPC. </li> <li>
     * <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     * VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     * peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     * | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     * </li> <li> <p><code>status-message</code> - A message that provides
     * more information about the status of the VPC peering connection, if
     * applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     * of the VPC peering connection. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     *         peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     *         AWS account ID of the owner of the peer VPC. </li> <li>
     *         <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *         </li> <li> <p><code>expiration-time</code> - The expiration date and
     *         time for the VPC peering connection. </li> <li>
     *         <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     *         requester's VPC. </li> <li>
     *         <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the requester VPC. </li> <li>
     *         <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     *         VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     *         peering connection (<code>pending-acceptance</code> |
     *         <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     *         | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     *         </li> <li> <p><code>status-message</code> - A message that provides
     *         more information about the status of the VPC peering connection, if
     *         applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     *         of the VPC peering connection. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     * peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     * AWS account ID of the owner of the peer VPC. </li> <li>
     * <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </li> <li> <p><code>expiration-time</code> - The expiration date and
     * time for the VPC peering connection. </li> <li>
     * <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     * requester's VPC. </li> <li>
     * <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     * the owner of the requester VPC. </li> <li>
     * <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     * VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     * peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     * | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     * </li> <li> <p><code>status-message</code> - A message that provides
     * more information about the status of the VPC peering connection, if
     * applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     * of the VPC peering connection. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     *         peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     *         AWS account ID of the owner of the peer VPC. </li> <li>
     *         <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *         </li> <li> <p><code>expiration-time</code> - The expiration date and
     *         time for the VPC peering connection. </li> <li>
     *         <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     *         requester's VPC. </li> <li>
     *         <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the requester VPC. </li> <li>
     *         <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     *         VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     *         peering connection (<code>pending-acceptance</code> |
     *         <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     *         | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     *         </li> <li> <p><code>status-message</code> - A message that provides
     *         more information about the status of the VPC peering connection, if
     *         applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     *         of the VPC peering connection. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     * peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     * AWS account ID of the owner of the peer VPC. </li> <li>
     * <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </li> <li> <p><code>expiration-time</code> - The expiration date and
     * time for the VPC peering connection. </li> <li>
     * <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     * requester's VPC. </li> <li>
     * <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     * the owner of the requester VPC. </li> <li>
     * <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     * VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     * peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     * | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     * </li> <li> <p><code>status-message</code> - A message that provides
     * more information about the status of the VPC peering connection, if
     * applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     * The key/value combination of a tag assigned to the resource. </li>
     * <li> <p><code>tag-key</code> - The key of a tag assigned to the
     * resource. This filter is independent of the <code>tag-value</code>
     * filter. For example, if you use both the filter "tag-key=Purpose" and
     * the filter "tag-value=X", you get any resources assigned both the tag
     * key Purpose (regardless of what the tag's value is), and the tag value
     * X (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     * of the VPC peering connection. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>accepter-vpc-info.cidr-block</code> - The CIDR block of the
     *         peer VPC. </li> <li> <p><code>accepter-vpc-info.owner-id</code> - The
     *         AWS account ID of the owner of the peer VPC. </li> <li>
     *         <p><code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *         </li> <li> <p><code>expiration-time</code> - The expiration date and
     *         time for the VPC peering connection. </li> <li>
     *         <p><code>requester-vpc-info.cidr-block</code> - The CIDR block of the
     *         requester's VPC. </li> <li>
     *         <p><code>requester-vpc-info.owner-id</code> - The AWS account ID of
     *         the owner of the requester VPC. </li> <li>
     *         <p><code>requester-vpc-info.vpc-id</code> - The ID of the requester
     *         VPC. </li> <li> <p><code>status-code</code> - The status of the VPC
     *         peering connection (<code>pending-acceptance</code> |
     *         <code>failed</code> | <code>expired</code> | <code>provisioning</code>
     *         | <code>active</code> | <code>deleted</code> | <code>rejected</code>).
     *         </li> <li> <p><code>status-message</code> - A message that provides
     *         more information about the status of the VPC peering connection, if
     *         applicable. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> -
     *         The key/value combination of a tag assigned to the resource. </li>
     *         <li> <p><code>tag-key</code> - The key of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-value</code>
     *         filter. For example, if you use both the filter "tag-key=Purpose" and
     *         the filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag value
     *         X (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-peering-connection-id</code> - The ID
     *         of the VPC peering connection. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcPeeringConnectionsRequest> getDryRunRequest() {
        Request<DescribeVpcPeeringConnectionsRequest> request = new DescribeVpcPeeringConnectionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcPeeringConnectionIds() != null) sb.append("VpcPeeringConnectionIds: " + getVpcPeeringConnectionIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnectionIds() == null) ? 0 : getVpcPeeringConnectionIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcPeeringConnectionsRequest == false) return false;
        DescribeVpcPeeringConnectionsRequest other = (DescribeVpcPeeringConnectionsRequest)obj;
        
        if (other.getVpcPeeringConnectionIds() == null ^ this.getVpcPeeringConnectionIds() == null) return false;
        if (other.getVpcPeeringConnectionIds() != null && other.getVpcPeeringConnectionIds().equals(this.getVpcPeeringConnectionIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    