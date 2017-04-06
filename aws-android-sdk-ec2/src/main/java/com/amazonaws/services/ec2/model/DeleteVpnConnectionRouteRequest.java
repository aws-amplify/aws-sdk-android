/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest) DeleteVpnConnectionRoute operation}.
 * <p>
 * Deletes the specified static route associated with a VPN connection
 * between an existing virtual private gateway and a VPN customer
 * gateway. The static route allows traffic to be routed from the virtual
 * private gateway to the VPN customer gateway.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest)
 */
public class DeleteVpnConnectionRouteRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the VPN connection.
     */
    private String vpnConnectionId;

    /**
     * The CIDR block associated with the local subnet of the customer
     * network.
     */
    private String destinationCidrBlock;

    /**
     * The ID of the VPN connection.
     *
     * @return The ID of the VPN connection.
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection.
     *
     * @param vpnConnectionId The ID of the VPN connection.
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId The ID of the VPN connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpnConnectionRouteRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * The CIDR block associated with the local subnet of the customer
     * network.
     *
     * @return The CIDR block associated with the local subnet of the customer
     *         network.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR block associated with the local subnet of the customer
     * network.
     *
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     *         network.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR block associated with the local subnet of the customer
     * network.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     *         network.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpnConnectionRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
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
        if (getVpnConnectionId() != null) sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVpnConnectionRouteRequest == false) return false;
        DeleteVpnConnectionRouteRequest other = (DeleteVpnConnectionRouteRequest)obj;
        
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null) return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false) return false; 
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        return true;
    }
    
}
    