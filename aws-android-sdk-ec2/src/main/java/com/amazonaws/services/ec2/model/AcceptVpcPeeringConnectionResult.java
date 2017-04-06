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

/**
 * <p>
 * Contains the output of AcceptVpcPeeringConnection.
 * </p>
 */
public class AcceptVpcPeeringConnectionResult implements Serializable {

    /**
     * Information about the VPC peering connection.
     */
    private VpcPeeringConnection vpcPeeringConnection;

    /**
     * Information about the VPC peering connection.
     *
     * @return Information about the VPC peering connection.
     */
    public VpcPeeringConnection getVpcPeeringConnection() {
        return vpcPeeringConnection;
    }
    
    /**
     * Information about the VPC peering connection.
     *
     * @param vpcPeeringConnection Information about the VPC peering connection.
     */
    public void setVpcPeeringConnection(VpcPeeringConnection vpcPeeringConnection) {
        this.vpcPeeringConnection = vpcPeeringConnection;
    }
    
    /**
     * Information about the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnection Information about the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AcceptVpcPeeringConnectionResult withVpcPeeringConnection(VpcPeeringConnection vpcPeeringConnection) {
        this.vpcPeeringConnection = vpcPeeringConnection;
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
        if (getVpcPeeringConnection() != null) sb.append("VpcPeeringConnection: " + getVpcPeeringConnection() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnection() == null) ? 0 : getVpcPeeringConnection().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AcceptVpcPeeringConnectionResult == false) return false;
        AcceptVpcPeeringConnectionResult other = (AcceptVpcPeeringConnectionResult)obj;
        
        if (other.getVpcPeeringConnection() == null ^ this.getVpcPeeringConnection() == null) return false;
        if (other.getVpcPeeringConnection() != null && other.getVpcPeeringConnection().equals(this.getVpcPeeringConnection()) == false) return false; 
        return true;
    }
    
}
    