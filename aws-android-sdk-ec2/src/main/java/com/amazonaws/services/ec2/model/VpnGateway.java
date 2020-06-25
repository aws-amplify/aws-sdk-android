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
 * Describes a virtual private gateway.
 * </p>
 */
public class VpnGateway implements Serializable {
    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if
     * applicable. This field may be empty or not returned.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     */
    private java.util.List<VpcAttachment> vpcAttachments;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String vpnGatewayId;

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if
     * applicable. This field may be empty or not returned.
     * </p>
     *
     * @return <p>
     *         The Availability Zone where the virtual private gateway was
     *         created, if applicable. This field may be empty or not returned.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if
     * applicable. This field may be empty or not returned.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the virtual private gateway was
     *            created, if applicable. This field may be empty or not
     *            returned.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the virtual private gateway was created, if
     * applicable. This field may be empty or not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the virtual private gateway was
     *            created, if applicable. This field may be empty or not
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The current state of the virtual private gateway.
     *         </p>
     * @see VpnState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the virtual private gateway.
     *            </p>
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the virtual private gateway.
     *            </p>
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnGateway withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return <p>
     *         The type of VPN connection the virtual private gateway supports.
     *         </p>
     * @see GatewayType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection the virtual private gateway
     *            supports.
     *            </p>
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection the virtual private gateway
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public VpnGateway withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection the virtual private gateway
     *            supports.
     *            </p>
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of VPN connection the virtual private gateway supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection the virtual private gateway
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public VpnGateway withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         Any VPCs attached to the virtual private gateway.
     *         </p>
     */
    public java.util.List<VpcAttachment> getVpcAttachments() {
        return vpcAttachments;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     *
     * @param vpcAttachments <p>
     *            Any VPCs attached to the virtual private gateway.
     *            </p>
     */
    public void setVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
            return;
        }

        this.vpcAttachments = new java.util.ArrayList<VpcAttachment>(vpcAttachments);
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcAttachments <p>
     *            Any VPCs attached to the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withVpcAttachments(VpcAttachment... vpcAttachments) {
        if (getVpcAttachments() == null) {
            this.vpcAttachments = new java.util.ArrayList<VpcAttachment>(vpcAttachments.length);
        }
        for (VpcAttachment value : vpcAttachments) {
            this.vpcAttachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcAttachments <p>
     *            Any VPCs attached to the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        setVpcAttachments(vpcAttachments);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway.
     *         </p>
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * </p>
     *
     * @return <p>
     *         The private Autonomous System Number (ASN) for the Amazon side of
     *         a BGP session.
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * </p>
     *
     * @param amazonSideAsn <p>
     *            The private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session.
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            The private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the virtual private gateway.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the virtual private gateway.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the virtual private gateway.
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
     * Any tags assigned to the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withTags(Tag... tags) {
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
     * Any tags assigned to the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpcAttachments() != null)
            sb.append("VpcAttachments: " + getVpcAttachments() + ",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: " + getAmazonSideAsn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getVpcAttachments() == null) ? 0 : getVpcAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnGateway == false)
            return false;
        VpnGateway other = (VpnGateway) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcAttachments() == null ^ this.getVpcAttachments() == null)
            return false;
        if (other.getVpcAttachments() != null
                && other.getVpcAttachments().equals(this.getVpcAttachments()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null
                && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null
                && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
