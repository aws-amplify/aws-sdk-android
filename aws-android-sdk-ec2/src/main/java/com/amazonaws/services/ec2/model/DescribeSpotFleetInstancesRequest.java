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
import com.amazonaws.services.ec2.model.transform.DescribeSpotFleetInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetInstances(DescribeSpotFleetInstancesRequest) DescribeSpotFleetInstances operation}.
 * <p>
 * Describes the running instances for the specified Spot fleet.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetInstances(DescribeSpotFleetInstancesRequest)
 */
public class DescribeSpotFleetInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotFleetInstancesRequest> {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The token for the next set of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesRequest withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The token for the next set of results.
     *
     * @return The token for the next set of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of results.
     *
     * @param nextToken The token for the next set of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotFleetInstancesRequest> getDryRunRequest() {
        Request<DescribeSpotFleetInstancesRequest> request = new DescribeSpotFleetInstancesRequestMarshaller().marshall(this);
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
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotFleetInstancesRequest == false) return false;
        DescribeSpotFleetInstancesRequest other = (DescribeSpotFleetInstancesRequest)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    