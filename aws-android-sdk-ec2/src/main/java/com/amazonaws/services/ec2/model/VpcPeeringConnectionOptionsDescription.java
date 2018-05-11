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
 * <p>
 * Describes the VPC peering connection options.
 * </p>
 */
public class VpcPeeringConnectionOptionsDescription implements Serializable {

    /**
     * Indicates whether a local ClassicLink connection can communicate with
     * the peer VPC over the VPC peering connection.
     */
    private Boolean allowEgressFromLocalClassicLinkToRemoteVpc;

    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     */
    private Boolean allowEgressFromLocalVpcToRemoteClassicLink;

    /**
     * Indicates whether a local ClassicLink connection can communicate with
     * the peer VPC over the VPC peering connection.
     *
     * @return Indicates whether a local ClassicLink connection can communicate with
     *         the peer VPC over the VPC peering connection.
     */
    public Boolean isAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return allowEgressFromLocalClassicLinkToRemoteVpc;
    }
    
    /**
     * Indicates whether a local ClassicLink connection can communicate with
     * the peer VPC over the VPC peering connection.
     *
     * @param allowEgressFromLocalClassicLinkToRemoteVpc Indicates whether a local ClassicLink connection can communicate with
     *         the peer VPC over the VPC peering connection.
     */
    public void setAllowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
    }
    
    /**
     * Indicates whether a local ClassicLink connection can communicate with
     * the peer VPC over the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowEgressFromLocalClassicLinkToRemoteVpc Indicates whether a local ClassicLink connection can communicate with
     *         the peer VPC over the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
        return this;
    }

    /**
     * Indicates whether a local ClassicLink connection can communicate with
     * the peer VPC over the VPC peering connection.
     *
     * @return Indicates whether a local ClassicLink connection can communicate with
     *         the peer VPC over the VPC peering connection.
     */
    public Boolean getAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     *
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     */
    public Boolean isAllowEgressFromLocalVpcToRemoteClassicLink() {
        return allowEgressFromLocalVpcToRemoteClassicLink;
    }
    
    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     *
     * @param allowEgressFromLocalVpcToRemoteClassicLink Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     */
    public void setAllowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
    }
    
    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowEgressFromLocalVpcToRemoteClassicLink Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
        return this;
    }

    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     *
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     */
    public Boolean getAllowEgressFromLocalVpcToRemoteClassicLink() {
        return allowEgressFromLocalVpcToRemoteClassicLink;
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
        if (isAllowEgressFromLocalClassicLinkToRemoteVpc() != null) sb.append("AllowEgressFromLocalClassicLinkToRemoteVpc: " + isAllowEgressFromLocalClassicLinkToRemoteVpc() + ",");
        if (isAllowEgressFromLocalVpcToRemoteClassicLink() != null) sb.append("AllowEgressFromLocalVpcToRemoteClassicLink: " + isAllowEgressFromLocalVpcToRemoteClassicLink() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isAllowEgressFromLocalClassicLinkToRemoteVpc() == null) ? 0 : isAllowEgressFromLocalClassicLinkToRemoteVpc().hashCode()); 
        hashCode = prime * hashCode + ((isAllowEgressFromLocalVpcToRemoteClassicLink() == null) ? 0 : isAllowEgressFromLocalVpcToRemoteClassicLink().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcPeeringConnectionOptionsDescription == false) return false;
        VpcPeeringConnectionOptionsDescription other = (VpcPeeringConnectionOptionsDescription)obj;
        
        if (other.isAllowEgressFromLocalClassicLinkToRemoteVpc() == null ^ this.isAllowEgressFromLocalClassicLinkToRemoteVpc() == null) return false;
        if (other.isAllowEgressFromLocalClassicLinkToRemoteVpc() != null && other.isAllowEgressFromLocalClassicLinkToRemoteVpc().equals(this.isAllowEgressFromLocalClassicLinkToRemoteVpc()) == false) return false; 
        if (other.isAllowEgressFromLocalVpcToRemoteClassicLink() == null ^ this.isAllowEgressFromLocalVpcToRemoteClassicLink() == null) return false;
        if (other.isAllowEgressFromLocalVpcToRemoteClassicLink() != null && other.isAllowEgressFromLocalVpcToRemoteClassicLink().equals(this.isAllowEgressFromLocalVpcToRemoteClassicLink()) == false) return false; 
        return true;
    }
    
}
    