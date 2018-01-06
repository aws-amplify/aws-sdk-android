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
import com.amazonaws.services.ec2.model.transform.RejectVpcPeeringConnectionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest) RejectVpcPeeringConnection operation}.
 * <p>
 * Rejects a VPC peering connection request. The VPC peering connection
 * must be in the <code>pending-acceptance</code> state. Use the
 * DescribeVpcPeeringConnections request to view your outstanding VPC
 * peering connection requests. To delete an active VPC peering
 * connection, or to delete a VPC peering connection request that you
 * initiated, use DeleteVpcPeeringConnection.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest)
 */
public class RejectVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RejectVpcPeeringConnectionRequest> {

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

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
    public RejectVpcPeeringConnectionRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RejectVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<RejectVpcPeeringConnectionRequest> request = new RejectVpcPeeringConnectionRequestMarshaller().marshall(this);
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
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RejectVpcPeeringConnectionRequest == false) return false;
        RejectVpcPeeringConnectionRequest other = (RejectVpcPeeringConnectionRequest)obj;
        
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        return true;
    }
    
}
    