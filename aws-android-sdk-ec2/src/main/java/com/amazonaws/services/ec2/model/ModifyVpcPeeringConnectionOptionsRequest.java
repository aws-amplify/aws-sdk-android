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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpcPeeringConnectionOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyVpcPeeringConnectionOptions(ModifyVpcPeeringConnectionOptionsRequest) ModifyVpcPeeringConnectionOptions operation}.
 * <p>
 * Modifies the VPC peering connection options on one side of a VPC
 * peering connection. You can do the following:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Enable/disable communication over the peering connection between an
 * EC2-Classic instance that's linked to your VPC (using ClassicLink) and
 * instances in the peer VPC.
 * </p>
 * </li>
 * <li> <p>
 * Enable/disable communication over the peering connection between
 * instances in your VPC and an EC2-Classic instance that's linked to the
 * peer VPC.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * If the peered VPCs are in different accounts, each owner must initiate
 * a separate request to enable or disable communication in either
 * direction, depending on whether their VPC was the requester or
 * accepter for the VPC peering connection. If the peered VPCs are in the
 * same account, you can modify the requester and accepter options in the
 * same request. To confirm which VPC is the accepter and requester for a
 * VPC peering connection, use the DescribeVpcPeeringConnections command.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyVpcPeeringConnectionOptions(ModifyVpcPeeringConnectionOptionsRequest)
 */
public class ModifyVpcPeeringConnectionOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyVpcPeeringConnectionOptionsRequest> {

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

    /**
     * The VPC peering connection options for the requester VPC.
     */
    private PeeringConnectionOptionsRequest requesterPeeringConnectionOptions;

    /**
     * The VPC peering connection options for the accepter VPC.
     */
    private PeeringConnectionOptionsRequest accepterPeeringConnectionOptions;

    /**
     * The ID of the VPC peering connection.
     *
     * @return The ID of the VPC peering connection.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * The VPC peering connection options for the requester VPC.
     *
     * @return The VPC peering connection options for the requester VPC.
     */
    public PeeringConnectionOptionsRequest getRequesterPeeringConnectionOptions() {
        return requesterPeeringConnectionOptions;
    }
    
    /**
     * The VPC peering connection options for the requester VPC.
     *
     * @param requesterPeeringConnectionOptions The VPC peering connection options for the requester VPC.
     */
    public void setRequesterPeeringConnectionOptions(PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }
    
    /**
     * The VPC peering connection options for the requester VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterPeeringConnectionOptions The VPC peering connection options for the requester VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withRequesterPeeringConnectionOptions(PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
        return this;
    }

    /**
     * The VPC peering connection options for the accepter VPC.
     *
     * @return The VPC peering connection options for the accepter VPC.
     */
    public PeeringConnectionOptionsRequest getAccepterPeeringConnectionOptions() {
        return accepterPeeringConnectionOptions;
    }
    
    /**
     * The VPC peering connection options for the accepter VPC.
     *
     * @param accepterPeeringConnectionOptions The VPC peering connection options for the accepter VPC.
     */
    public void setAccepterPeeringConnectionOptions(PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }
    
    /**
     * The VPC peering connection options for the accepter VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accepterPeeringConnectionOptions The VPC peering connection options for the accepter VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVpcPeeringConnectionOptionsRequest withAccepterPeeringConnectionOptions(PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcPeeringConnectionOptionsRequest> getDryRunRequest() {
        Request<ModifyVpcPeeringConnectionOptionsRequest> request = new ModifyVpcPeeringConnectionOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getRequesterPeeringConnectionOptions() != null) sb.append("RequesterPeeringConnectionOptions: " + getRequesterPeeringConnectionOptions() + ",");
        if (getAccepterPeeringConnectionOptions() != null) sb.append("AccepterPeeringConnectionOptions: " + getAccepterPeeringConnectionOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getRequesterPeeringConnectionOptions() == null) ? 0 : getRequesterPeeringConnectionOptions().hashCode()); 
        hashCode = prime * hashCode + ((getAccepterPeeringConnectionOptions() == null) ? 0 : getAccepterPeeringConnectionOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsRequest == false) return false;
        ModifyVpcPeeringConnectionOptionsRequest other = (ModifyVpcPeeringConnectionOptionsRequest)obj;
        
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        if (other.getRequesterPeeringConnectionOptions() == null ^ this.getRequesterPeeringConnectionOptions() == null) return false;
        if (other.getRequesterPeeringConnectionOptions() != null && other.getRequesterPeeringConnectionOptions().equals(this.getRequesterPeeringConnectionOptions()) == false) return false; 
        if (other.getAccepterPeeringConnectionOptions() == null ^ this.getAccepterPeeringConnectionOptions() == null) return false;
        if (other.getAccepterPeeringConnectionOptions() != null && other.getAccepterPeeringConnectionOptions().equals(this.getAccepterPeeringConnectionOptions()) == false) return false; 
        return true;
    }
    
}
    