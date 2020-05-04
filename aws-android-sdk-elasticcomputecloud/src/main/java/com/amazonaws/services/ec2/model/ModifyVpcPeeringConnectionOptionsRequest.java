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
 * Modifies the VPC peering connection options on one side of a VPC peering
 * connection. You can do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enable/disable communication over the peering connection between an
 * EC2-Classic instance that's linked to your VPC (using ClassicLink) and
 * instances in the peer VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Enable/disable communication over the peering connection between instances in
 * your VPC and an EC2-Classic instance that's linked to the peer VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Enable/disable the ability to resolve public DNS hostnames to private IP
 * addresses when queried from instances in the peer VPC.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the peered VPCs are in the same AWS account, you can enable DNS resolution
 * for queries from the local VPC. This ensures that queries from the local VPC
 * resolve to private IP addresses in the peer VPC. This option is not available
 * if the peered VPCs are in different AWS accounts or different Regions. For
 * peered VPCs in different AWS accounts, each AWS account owner must initiate a
 * separate request to modify the peering connection options. For inter-region
 * peering connections, you must use the Region for the requester VPC to modify
 * the requester VPC peering options and the Region for the accepter VPC to
 * modify the accepter VPC peering options. To verify which VPCs are the
 * accepter and the requester for a VPC peering connection, use the
 * <a>DescribeVpcPeeringConnections</a> command.
 * </p>
 */
public class ModifyVpcPeeringConnectionOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     */
    private PeeringConnectionOptionsRequest accepterPeeringConnectionOptions;

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
     * The VPC peering connection options for the requester VPC.
     * </p>
     */
    private PeeringConnectionOptionsRequest requesterPeeringConnectionOptions;

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     *
     * @return <p>
     *         The VPC peering connection options for the accepter VPC.
     *         </p>
     */
    public PeeringConnectionOptionsRequest getAccepterPeeringConnectionOptions() {
        return accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     *
     * @param accepterPeeringConnectionOptions <p>
     *            The VPC peering connection options for the accepter VPC.
     *            </p>
     */
    public void setAccepterPeeringConnectionOptions(
            PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accepterPeeringConnectionOptions <p>
     *            The VPC peering connection options for the accepter VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withAccepterPeeringConnectionOptions(
            PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
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
    public ModifyVpcPeeringConnectionOptionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     *
     * @return <p>
     *         The VPC peering connection options for the requester VPC.
     *         </p>
     */
    public PeeringConnectionOptionsRequest getRequesterPeeringConnectionOptions() {
        return requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     *
     * @param requesterPeeringConnectionOptions <p>
     *            The VPC peering connection options for the requester VPC.
     *            </p>
     */
    public void setRequesterPeeringConnectionOptions(
            PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterPeeringConnectionOptions <p>
     *            The VPC peering connection options for the requester VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withRequesterPeeringConnectionOptions(
            PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC peering connection.
     *         </p>
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of the VPC peering connection.
     *            </p>
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of the VPC peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withVpcPeeringConnectionId(
            String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
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
        if (getAccepterPeeringConnectionOptions() != null)
            sb.append("AccepterPeeringConnectionOptions: " + getAccepterPeeringConnectionOptions()
                    + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getRequesterPeeringConnectionOptions() != null)
            sb.append("RequesterPeeringConnectionOptions: "
                    + getRequesterPeeringConnectionOptions() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccepterPeeringConnectionOptions() == null) ? 0
                        : getAccepterPeeringConnectionOptions().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequesterPeeringConnectionOptions() == null) ? 0
                        : getRequesterPeeringConnectionOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsRequest == false)
            return false;
        ModifyVpcPeeringConnectionOptionsRequest other = (ModifyVpcPeeringConnectionOptionsRequest) obj;

        if (other.getAccepterPeeringConnectionOptions() == null
                ^ this.getAccepterPeeringConnectionOptions() == null)
            return false;
        if (other.getAccepterPeeringConnectionOptions() != null
                && other.getAccepterPeeringConnectionOptions().equals(
                        this.getAccepterPeeringConnectionOptions()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getRequesterPeeringConnectionOptions() == null
                ^ this.getRequesterPeeringConnectionOptions() == null)
            return false;
        if (other.getRequesterPeeringConnectionOptions() != null
                && other.getRequesterPeeringConnectionOptions().equals(
                        this.getRequesterPeeringConnectionOptions()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null
                && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }
}
