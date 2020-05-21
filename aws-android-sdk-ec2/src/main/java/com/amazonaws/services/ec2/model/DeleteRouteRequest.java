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
 * Deletes the specified route from the specified route table.
 * </p>
 */
public class DeleteRouteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The IPv6 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     */
    private String destinationIpv6CidrBlock;

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
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;

    /**
     * <p>
     * The IPv4 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR range for the route. The value you specify must
     *         match the CIDR for the route exactly.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR range for the route. The value you specify must
     *            match the CIDR for the route exactly.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The IPv4 CIDR range for the route. The value you specify must
     *            match the CIDR for the route exactly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR range for the route. The value you specify must
     *         match the CIDR for the route exactly.
     *         </p>
     */
    public String getDestinationIpv6CidrBlock() {
        return destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR range for the route. The value you specify must
     *            match the CIDR for the route exactly.
     *            </p>
     */
    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR range for the route. The value you specify must match the
     * CIDR for the route exactly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationIpv6CidrBlock <p>
     *            The IPv6 CIDR range for the route. The value you specify must
     *            match the CIDR for the route exactly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRouteRequest withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
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
    public DeleteRouteRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     *
     * @return <p>
     *         The ID of the route table.
     *         </p>
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     *
     * @param routeTableId <p>
     *            The ID of the route table.
     *            </p>
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableId <p>
     *            The ID of the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: " + getDestinationIpv6CidrBlock() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock()
                        .hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteRequest == false)
            return false;
        DeleteRouteRequest other = (DeleteRouteRequest) obj;

        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null
                ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null
                && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null
                && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        return true;
    }
}
