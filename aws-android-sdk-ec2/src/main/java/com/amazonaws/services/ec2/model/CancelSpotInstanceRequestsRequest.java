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
import com.amazonaws.services.ec2.model.transform.CancelSpotInstanceRequestsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest) CancelSpotInstanceRequests operation}.
 * <p>
 * Cancels one or more Spot instance requests. Spot instances are
 * instances that Amazon EC2 starts on your behalf when the bid price
 * that you specify exceeds the current Spot price. Amazon EC2
 * periodically sets the Spot price based on available Spot instance
 * capacity and current Spot instance requests. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"> Spot Instance Requests </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Canceling a Spot instance request does not terminate
 * running Spot instances associated with the request.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest)
 */
public class CancelSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CancelSpotInstanceRequestsRequest> {

    /**
     * One or more Spot instance request IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIds;

    /**
     * Default constructor for a new CancelSpotInstanceRequestsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CancelSpotInstanceRequestsRequest() {}
    
    /**
     * Constructs a new CancelSpotInstanceRequestsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param spotInstanceRequestIds One or more Spot instance request IDs.
     */
    public CancelSpotInstanceRequestsRequest(java.util.List<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
    }

    /**
     * One or more Spot instance request IDs.
     *
     * @return One or more Spot instance request IDs.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
              spotInstanceRequestIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              spotInstanceRequestIds.setAutoConstruct(true);
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * One or more Spot instance request IDs.
     *
     * @param spotInstanceRequestIds One or more Spot instance request IDs.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
        spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
    }
    
    /**
     * One or more Spot instance request IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds One or more Spot instance request IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        if (getSpotInstanceRequestIds() == null) setSpotInstanceRequestIds(new java.util.ArrayList<String>(spotInstanceRequestIds.length));
        for (String value : spotInstanceRequestIds) {
            getSpotInstanceRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Spot instance request IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds One or more Spot instance request IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
            this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CancelSpotInstanceRequestsRequest> getDryRunRequest() {
        Request<CancelSpotInstanceRequestsRequest> request = new CancelSpotInstanceRequestsRequestMarshaller().marshall(this);
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
        if (getSpotInstanceRequestIds() != null) sb.append("SpotInstanceRequestIds: " + getSpotInstanceRequestIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelSpotInstanceRequestsRequest == false) return false;
        CancelSpotInstanceRequestsRequest other = (CancelSpotInstanceRequestsRequest)obj;
        
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null) return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false) return false; 
        return true;
    }
    
}
    