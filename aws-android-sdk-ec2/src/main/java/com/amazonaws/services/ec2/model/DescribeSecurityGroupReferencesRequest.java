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
import com.amazonaws.services.ec2.model.transform.DescribeSecurityGroupReferencesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest) DescribeSecurityGroupReferences operation}.
 * <p>
 * [EC2-VPC only] Describes the VPCs on the other side of a VPC peering
 * connection that are referencing the security groups you've specified
 * in this request.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest)
 */
public class DescribeSecurityGroupReferencesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSecurityGroupReferencesRequest> {

    /**
     * One or more security group IDs in your account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupId;

    /**
     * One or more security group IDs in your account.
     *
     * @return One or more security group IDs in your account.
     */
    public java.util.List<String> getGroupId() {
        if (groupId == null) {
              groupId = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupId.setAutoConstruct(true);
        }
        return groupId;
    }
    
    /**
     * One or more security group IDs in your account.
     *
     * @param groupId One or more security group IDs in your account.
     */
    public void setGroupId(java.util.Collection<String> groupId) {
        if (groupId == null) {
            this.groupId = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupId.size());
        groupIdCopy.addAll(groupId);
        this.groupId = groupIdCopy;
    }
    
    /**
     * One or more security group IDs in your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId One or more security group IDs in your account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSecurityGroupReferencesRequest withGroupId(String... groupId) {
        if (getGroupId() == null) setGroupId(new java.util.ArrayList<String>(groupId.length));
        for (String value : groupId) {
            getGroupId().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group IDs in your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId One or more security group IDs in your account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSecurityGroupReferencesRequest withGroupId(java.util.Collection<String> groupId) {
        if (groupId == null) {
            this.groupId = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupId.size());
            groupIdCopy.addAll(groupId);
            this.groupId = groupIdCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSecurityGroupReferencesRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupReferencesRequest> request = new DescribeSecurityGroupReferencesRequestMarshaller().marshall(this);
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
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSecurityGroupReferencesRequest == false) return false;
        DescribeSecurityGroupReferencesRequest other = (DescribeSecurityGroupReferencesRequest)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        return true;
    }
    
}
    