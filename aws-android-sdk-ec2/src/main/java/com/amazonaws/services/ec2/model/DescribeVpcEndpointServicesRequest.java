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
import com.amazonaws.services.ec2.model.transform.DescribeVpcEndpointServicesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcEndpointServices(DescribeVpcEndpointServicesRequest) DescribeVpcEndpointServices operation}.
 * <p>
 * Describes all supported AWS services that can be specified when
 * creating a VPC endpoint.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcEndpointServices(DescribeVpcEndpointServicesRequest)
 */
public class DescribeVpcEndpointServicesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpcEndpointServicesRequest> {

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     */
    private Integer maxResults;

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     */
    private String nextToken;

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     *
     * @return The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointServicesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointServicesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcEndpointServicesRequest> getDryRunRequest() {
        Request<DescribeVpcEndpointServicesRequest> request = new DescribeVpcEndpointServicesRequestMarshaller().marshall(this);
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
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcEndpointServicesRequest == false) return false;
        DescribeVpcEndpointServicesRequest other = (DescribeVpcEndpointServicesRequest)obj;
        
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    