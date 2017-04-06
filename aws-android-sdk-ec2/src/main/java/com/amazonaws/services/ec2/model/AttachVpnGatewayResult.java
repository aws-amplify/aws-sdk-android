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
 * Contains the output of AttachVpnGateway.
 * </p>
 */
public class AttachVpnGatewayResult implements Serializable {

    /**
     * Information about the attachment.
     */
    private VpcAttachment vpcAttachment;

    /**
     * Information about the attachment.
     *
     * @return Information about the attachment.
     */
    public VpcAttachment getVpcAttachment() {
        return vpcAttachment;
    }
    
    /**
     * Information about the attachment.
     *
     * @param vpcAttachment Information about the attachment.
     */
    public void setVpcAttachment(VpcAttachment vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
    }
    
    /**
     * Information about the attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachment Information about the attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachVpnGatewayResult withVpcAttachment(VpcAttachment vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
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
        if (getVpcAttachment() != null) sb.append("VpcAttachment: " + getVpcAttachment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcAttachment() == null) ? 0 : getVpcAttachment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachVpnGatewayResult == false) return false;
        AttachVpnGatewayResult other = (AttachVpnGatewayResult)obj;
        
        if (other.getVpcAttachment() == null ^ this.getVpcAttachment() == null) return false;
        if (other.getVpcAttachment() != null && other.getVpcAttachment().equals(this.getVpcAttachment()) == false) return false; 
        return true;
    }
    
}
    