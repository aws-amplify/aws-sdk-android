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
 * Contains the output of DescribeVpcEndpoints.
 * </p>
 */
public class DescribeVpcEndpointsResult implements Serializable {

    /**
     * Information about the endpoints.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint> vpcEndpoints;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * Information about the endpoints.
     *
     * @return Information about the endpoints.
     */
    public java.util.List<VpcEndpoint> getVpcEndpoints() {
        if (vpcEndpoints == null) {
              vpcEndpoints = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint>();
              vpcEndpoints.setAutoConstruct(true);
        }
        return vpcEndpoints;
    }
    
    /**
     * Information about the endpoints.
     *
     * @param vpcEndpoints Information about the endpoints.
     */
    public void setVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        if (vpcEndpoints == null) {
            this.vpcEndpoints = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint> vpcEndpointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint>(vpcEndpoints.size());
        vpcEndpointsCopy.addAll(vpcEndpoints);
        this.vpcEndpoints = vpcEndpointsCopy;
    }
    
    /**
     * Information about the endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpoints Information about the endpoints.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsResult withVpcEndpoints(VpcEndpoint... vpcEndpoints) {
        if (getVpcEndpoints() == null) setVpcEndpoints(new java.util.ArrayList<VpcEndpoint>(vpcEndpoints.length));
        for (VpcEndpoint value : vpcEndpoints) {
            getVpcEndpoints().add(value);
        }
        return this;
    }
    
    /**
     * Information about the endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpoints Information about the endpoints.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsResult withVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        if (vpcEndpoints == null) {
            this.vpcEndpoints = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint> vpcEndpointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcEndpoint>(vpcEndpoints.size());
            vpcEndpointsCopy.addAll(vpcEndpoints);
            this.vpcEndpoints = vpcEndpointsCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getVpcEndpoints() != null) sb.append("VpcEndpoints: " + getVpcEndpoints() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcEndpoints() == null) ? 0 : getVpcEndpoints().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcEndpointsResult == false) return false;
        DescribeVpcEndpointsResult other = (DescribeVpcEndpointsResult)obj;
        
        if (other.getVpcEndpoints() == null ^ this.getVpcEndpoints() == null) return false;
        if (other.getVpcEndpoints() != null && other.getVpcEndpoints().equals(this.getVpcEndpoints()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    