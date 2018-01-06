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

/**
 * 
 */
public class ModifyVpcPeeringConnectionOptionsResult implements Serializable {

    /**
     * Information about the VPC peering connection options for the requester
     * VPC.
     */
    private PeeringConnectionOptions requesterPeeringConnectionOptions;

    /**
     * Information about the VPC peering connection options for the accepter
     * VPC.
     */
    private PeeringConnectionOptions accepterPeeringConnectionOptions;

    /**
     * Information about the VPC peering connection options for the requester
     * VPC.
     *
     * @return Information about the VPC peering connection options for the requester
     *         VPC.
     */
    public PeeringConnectionOptions getRequesterPeeringConnectionOptions() {
        return requesterPeeringConnectionOptions;
    }
    
    /**
     * Information about the VPC peering connection options for the requester
     * VPC.
     *
     * @param requesterPeeringConnectionOptions Information about the VPC peering connection options for the requester
     *         VPC.
     */
    public void setRequesterPeeringConnectionOptions(PeeringConnectionOptions requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }
    
    /**
     * Information about the VPC peering connection options for the requester
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterPeeringConnectionOptions Information about the VPC peering connection options for the requester
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcPeeringConnectionOptionsResult withRequesterPeeringConnectionOptions(PeeringConnectionOptions requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
        return this;
    }

    /**
     * Information about the VPC peering connection options for the accepter
     * VPC.
     *
     * @return Information about the VPC peering connection options for the accepter
     *         VPC.
     */
    public PeeringConnectionOptions getAccepterPeeringConnectionOptions() {
        return accepterPeeringConnectionOptions;
    }
    
    /**
     * Information about the VPC peering connection options for the accepter
     * VPC.
     *
     * @param accepterPeeringConnectionOptions Information about the VPC peering connection options for the accepter
     *         VPC.
     */
    public void setAccepterPeeringConnectionOptions(PeeringConnectionOptions accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }
    
    /**
     * Information about the VPC peering connection options for the accepter
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accepterPeeringConnectionOptions Information about the VPC peering connection options for the accepter
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcPeeringConnectionOptionsResult withAccepterPeeringConnectionOptions(PeeringConnectionOptions accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
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
        if (getRequesterPeeringConnectionOptions() != null) sb.append("RequesterPeeringConnectionOptions: " + getRequesterPeeringConnectionOptions() + ",");
        if (getAccepterPeeringConnectionOptions() != null) sb.append("AccepterPeeringConnectionOptions: " + getAccepterPeeringConnectionOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRequesterPeeringConnectionOptions() == null) ? 0 : getRequesterPeeringConnectionOptions().hashCode()); 
        hashCode = prime * hashCode + ((getAccepterPeeringConnectionOptions() == null) ? 0 : getAccepterPeeringConnectionOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsResult == false) return false;
        ModifyVpcPeeringConnectionOptionsResult other = (ModifyVpcPeeringConnectionOptionsResult)obj;
        
        if (other.getRequesterPeeringConnectionOptions() == null ^ this.getRequesterPeeringConnectionOptions() == null) return false;
        if (other.getRequesterPeeringConnectionOptions() != null && other.getRequesterPeeringConnectionOptions().equals(this.getRequesterPeeringConnectionOptions()) == false) return false; 
        if (other.getAccepterPeeringConnectionOptions() == null ^ this.getAccepterPeeringConnectionOptions() == null) return false;
        if (other.getAccepterPeeringConnectionOptions() != null && other.getAccepterPeeringConnectionOptions().equals(this.getAccepterPeeringConnectionOptions()) == false) return false; 
        return true;
    }
    
}
    