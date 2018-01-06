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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfaceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest) DescribeNetworkInterfaceAttribute operation}.
 * <p>
 * Describes a network interface attribute. You can specify only one
 * attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest)
 */
public class DescribeNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeNetworkInterfaceAttributeRequest> {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The attribute of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     */
    private String attribute;

    /**
     * The ID of the network interface.
     *
     * @return The ID of the network interface.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The ID of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The attribute of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     *
     * @return The attribute of the network interface.
     *
     * @see NetworkInterfaceAttribute
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The attribute of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     *
     * @param attribute The attribute of the network interface.
     *
     * @see NetworkInterfaceAttribute
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The attribute of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     *
     * @param attribute The attribute of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see NetworkInterfaceAttribute
     */
    public DescribeNetworkInterfaceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The attribute of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     *
     * @param attribute The attribute of the network interface.
     *
     * @see NetworkInterfaceAttribute
     */
    public void setAttribute(NetworkInterfaceAttribute attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The attribute of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, groupSet, sourceDestCheck, attachment
     *
     * @param attribute The attribute of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see NetworkInterfaceAttribute
     */
    public DescribeNetworkInterfaceAttributeRequest withAttribute(NetworkInterfaceAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfaceAttributeRequest> request = new DescribeNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkInterfaceAttributeRequest == false) return false;
        DescribeNetworkInterfaceAttributeRequest other = (DescribeNetworkInterfaceAttributeRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    