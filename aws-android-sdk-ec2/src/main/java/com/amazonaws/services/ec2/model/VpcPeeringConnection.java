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

/**
 * <p>
 * Describes a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnection implements Serializable {
    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     */
    private VpcPeeringConnectionVpcInfo accepterVpcInfo;

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     */
    private java.util.Date expirationTime;

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     */
    private VpcPeeringConnectionVpcInfo requesterVpcInfo;

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     */
    private VpcPeeringConnectionStateReason status;

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Information about the accepter VPC. CIDR block information is
     *         only returned when describing an active VPC peering connection.
     *         </p>
     */
    public VpcPeeringConnectionVpcInfo getAccepterVpcInfo() {
        return accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     *
     * @param accepterVpcInfo <p>
     *            Information about the accepter VPC. CIDR block information is
     *            only returned when describing an active VPC peering
     *            connection.
     *            </p>
     */
    public void setAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accepterVpcInfo <p>
     *            Information about the accepter VPC. CIDR block information is
     *            only returned when describing an active VPC peering
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
        return this;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     *
     * @return <p>
     *         The time that an unaccepted VPC peering connection will expire.
     *         </p>
     */
    public java.util.Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     *
     * @param expirationTime <p>
     *            The time that an unaccepted VPC peering connection will
     *            expire.
     *            </p>
     */
    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationTime <p>
     *            The time that an unaccepted VPC peering connection will
     *            expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Information about the requester VPC. CIDR block information is
     *         only returned when describing an active VPC peering connection.
     *         </p>
     */
    public VpcPeeringConnectionVpcInfo getRequesterVpcInfo() {
        return requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     *
     * @param requesterVpcInfo <p>
     *            Information about the requester VPC. CIDR block information is
     *            only returned when describing an active VPC peering
     *            connection.
     *            </p>
     */
    public void setRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only
     * returned when describing an active VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterVpcInfo <p>
     *            Information about the requester VPC. CIDR block information is
     *            only returned when describing an active VPC peering
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
        return this;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         The status of the VPC peering connection.
     *         </p>
     */
    public VpcPeeringConnectionStateReason getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     *
     * @param status <p>
     *            The status of the VPC peering connection.
     *            </p>
     */
    public void setStatus(VpcPeeringConnectionStateReason status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the VPC peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withStatus(VpcPeeringConnectionStateReason status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnection withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public VpcPeeringConnection withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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
        if (getAccepterVpcInfo() != null)
            sb.append("AccepterVpcInfo: " + getAccepterVpcInfo() + ",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: " + getExpirationTime() + ",");
        if (getRequesterVpcInfo() != null)
            sb.append("RequesterVpcInfo: " + getRequesterVpcInfo() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccepterVpcInfo() == null) ? 0 : getAccepterVpcInfo().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterVpcInfo() == null) ? 0 : getRequesterVpcInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof VpcPeeringConnection == false)
            return false;
        VpcPeeringConnection other = (VpcPeeringConnection) obj;

        if (other.getAccepterVpcInfo() == null ^ this.getAccepterVpcInfo() == null)
            return false;
        if (other.getAccepterVpcInfo() != null
                && other.getAccepterVpcInfo().equals(this.getAccepterVpcInfo()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null
                && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getRequesterVpcInfo() == null ^ this.getRequesterVpcInfo() == null)
            return false;
        if (other.getRequesterVpcInfo() != null
                && other.getRequesterVpcInfo().equals(this.getRequesterVpcInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null
                && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }
}
