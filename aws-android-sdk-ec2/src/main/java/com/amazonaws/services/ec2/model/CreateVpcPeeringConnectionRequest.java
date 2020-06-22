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
 * Requests a VPC peering connection between two VPCs: a requester VPC that you
 * own and an accepter VPC with which to create the connection. The accepter VPC
 * can belong to another AWS account and can be in a different Region to the
 * requester VPC. The requester VPC and accepter VPC cannot have overlapping
 * CIDR blocks.
 * </p>
 * <note>
 * <p>
 * Limitations and rules apply to a VPC peering connection. For more
 * information, see the <a href=
 * "https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-basics.html#vpc-peering-limitations"
 * >limitations</a> section in the <i>VPC Peering Guide</i>.
 * </p>
 * </note>
 * <p>
 * The owner of the accepter VPC must accept the peering request to activate the
 * peering connection. The VPC peering connection request expires after 7 days,
 * after which it cannot be accepted or rejected.
 * </p>
 * <p>
 * If you create a VPC peering connection request between VPCs with overlapping
 * CIDR blocks, the VPC peering connection has a status of <code>failed</code>.
 * </p>
 */
public class CreateVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     */
    private String peerOwnerId;

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * You must specify this parameter in the request.
     * </p>
     */
    private String peerVpcId;

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the
     * request.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * </p>
     * <p>
     * Default: The Region in which you make the request.
     * </p>
     */
    private String peerRegion;

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
    public CreateVpcPeeringConnectionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the accepter VPC.
     *         </p>
     *         <p>
     *         Default: Your AWS account ID
     *         </p>
     */
    public String getPeerOwnerId() {
        return peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     *
     * @param peerOwnerId <p>
     *            The AWS account ID of the owner of the accepter VPC.
     *            </p>
     *            <p>
     *            Default: Your AWS account ID
     *            </p>
     */
    public void setPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerOwnerId <p>
     *            The AWS account ID of the owner of the accepter VPC.
     *            </p>
     *            <p>
     *            Default: Your AWS account ID
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcPeeringConnectionRequest withPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * You must specify this parameter in the request.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC with which you are creating the VPC peering
     *         connection. You must specify this parameter in the request.
     *         </p>
     */
    public String getPeerVpcId() {
        return peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * You must specify this parameter in the request.
     * </p>
     *
     * @param peerVpcId <p>
     *            The ID of the VPC with which you are creating the VPC peering
     *            connection. You must specify this parameter in the request.
     *            </p>
     */
    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * You must specify this parameter in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerVpcId <p>
     *            The ID of the VPC with which you are creating the VPC peering
     *            connection. You must specify this parameter in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcPeeringConnectionRequest withPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the
     * request.
     * </p>
     *
     * @return <p>
     *         The ID of the requester VPC. You must specify this parameter in
     *         the request.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the
     * request.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the requester VPC. You must specify this parameter
     *            in the request.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the requester VPC. You must specify this parameter
     *            in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcPeeringConnectionRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * </p>
     * <p>
     * Default: The Region in which you make the request.
     * </p>
     *
     * @return <p>
     *         The Region code for the accepter VPC, if the accepter VPC is
     *         located in a Region other than the Region in which you make the
     *         request.
     *         </p>
     *         <p>
     *         Default: The Region in which you make the request.
     *         </p>
     */
    public String getPeerRegion() {
        return peerRegion;
    }

    /**
     * <p>
     * The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * </p>
     * <p>
     * Default: The Region in which you make the request.
     * </p>
     *
     * @param peerRegion <p>
     *            The Region code for the accepter VPC, if the accepter VPC is
     *            located in a Region other than the Region in which you make
     *            the request.
     *            </p>
     *            <p>
     *            Default: The Region in which you make the request.
     *            </p>
     */
    public void setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
    }

    /**
     * <p>
     * The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * </p>
     * <p>
     * Default: The Region in which you make the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerRegion <p>
     *            The Region code for the accepter VPC, if the accepter VPC is
     *            located in a Region other than the Region in which you make
     *            the request.
     *            </p>
     *            <p>
     *            Default: The Region in which you make the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcPeeringConnectionRequest withPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getPeerOwnerId() != null)
            sb.append("PeerOwnerId: " + getPeerOwnerId() + ",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: " + getPeerVpcId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getPeerRegion() != null)
            sb.append("PeerRegion: " + getPeerRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getPeerOwnerId() == null) ? 0 : getPeerOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPeerRegion() == null) ? 0 : getPeerRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcPeeringConnectionRequest == false)
            return false;
        CreateVpcPeeringConnectionRequest other = (CreateVpcPeeringConnectionRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getPeerOwnerId() == null ^ this.getPeerOwnerId() == null)
            return false;
        if (other.getPeerOwnerId() != null
                && other.getPeerOwnerId().equals(this.getPeerOwnerId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null
                && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPeerRegion() == null ^ this.getPeerRegion() == null)
            return false;
        if (other.getPeerRegion() != null
                && other.getPeerRegion().equals(this.getPeerRegion()) == false)
            return false;
        return true;
    }
}
