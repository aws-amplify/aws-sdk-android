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
 * Describes a target network associated with a Client VPN endpoint.
 * </p>
 */
public class TargetNetwork implements Serializable {
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     */
    private String targetNetworkId;

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is
     * associated.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     */
    private AssociationStatus status;

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC in which the target network (subnet) is
     *         located.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC in which the target network (subnet) is
     *            located.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC in which the target network (subnet) is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet specified as the target network.
     *         </p>
     */
    public String getTargetNetworkId() {
        return targetNetworkId;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     *
     * @param targetNetworkId <p>
     *            The ID of the subnet specified as the target network.
     *            </p>
     */
    public void setTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetNetworkId <p>
     *            The ID of the subnet specified as the target network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is
     * associated.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint with which the target network
     *         is associated.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is
     * associated.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the target
     *            network is associated.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is
     * associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the target
     *            network is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     *
     * @return <p>
     *         The current state of the target network association.
     *         </p>
     */
    public AssociationStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     *
     * @param status <p>
     *            The current state of the target network association.
     *            </p>
     */
    public void setStatus(AssociationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the target network association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withStatus(AssociationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups applied to the target network
     *         association.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     *
     * @param securityGroups <p>
     *            The IDs of the security groups applied to the target network
     *            association.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups applied to the target network
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups applied to the target network
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetNetwork withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getTargetNetworkId() != null)
            sb.append("TargetNetworkId: " + getTargetNetworkId() + ",");
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetNetworkId() == null) ? 0 : getTargetNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetNetwork == false)
            return false;
        TargetNetwork other = (TargetNetwork) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTargetNetworkId() == null ^ this.getTargetNetworkId() == null)
            return false;
        if (other.getTargetNetworkId() != null
                && other.getTargetNetworkId().equals(this.getTargetNetworkId()) == false)
            return false;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }
}
