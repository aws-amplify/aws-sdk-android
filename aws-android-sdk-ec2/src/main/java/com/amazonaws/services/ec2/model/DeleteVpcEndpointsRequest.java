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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteVpcEndpointsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpcEndpoints(DeleteVpcEndpointsRequest) DeleteVpcEndpoints operation}.
 * <p>
 * Deletes one or more specified VPC endpoints. Deleting the endpoint
 * also deletes the endpoint routes in the route tables that were
 * associated with the endpoint.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpcEndpoints(DeleteVpcEndpointsRequest)
 */
public class DeleteVpcEndpointsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteVpcEndpointsRequest> {

    /**
     * One or more endpoint IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIds;

    /**
     * One or more endpoint IDs.
     *
     * @return One or more endpoint IDs.
     */
    public java.util.List<String> getVpcEndpointIds() {
        if (vpcEndpointIds == null) {
              vpcEndpointIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcEndpointIds.setAutoConstruct(true);
        }
        return vpcEndpointIds;
    }
    
    /**
     * One or more endpoint IDs.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     */
    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcEndpointIds.size());
        vpcEndpointIdsCopy.addAll(vpcEndpointIds);
        this.vpcEndpointIds = vpcEndpointIdsCopy;
    }
    
    /**
     * One or more endpoint IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpcEndpointsRequest withVpcEndpointIds(String... vpcEndpointIds) {
        if (getVpcEndpointIds() == null) setVpcEndpointIds(new java.util.ArrayList<String>(vpcEndpointIds.length));
        for (String value : vpcEndpointIds) {
            getVpcEndpointIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more endpoint IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpcEndpointsRequest withVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcEndpointIds.size());
            vpcEndpointIdsCopy.addAll(vpcEndpointIds);
            this.vpcEndpointIds = vpcEndpointIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteVpcEndpointsRequest> getDryRunRequest() {
        Request<DeleteVpcEndpointsRequest> request = new DeleteVpcEndpointsRequestMarshaller().marshall(this);
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
        if (getVpcEndpointIds() != null) sb.append("VpcEndpointIds: " + getVpcEndpointIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVpcEndpointsRequest == false) return false;
        DeleteVpcEndpointsRequest other = (DeleteVpcEndpointsRequest)obj;
        
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null) return false;
        if (other.getVpcEndpointIds() != null && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false) return false; 
        return true;
    }
    
}
    