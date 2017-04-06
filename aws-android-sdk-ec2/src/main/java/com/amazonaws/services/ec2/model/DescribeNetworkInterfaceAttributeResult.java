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
 * Contains the output of DescribeNetworkInterfaceAttribute.
 * </p>
 */
public class DescribeNetworkInterfaceAttributeResult implements Serializable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The description of the network interface.
     */
    private String description;

    /**
     * Indicates whether source/destination checking is enabled.
     */
    private Boolean sourceDestCheck;

    /**
     * The security groups associated with the network interface.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groups;

    /**
     * The attachment (if any) of the network interface.
     */
    private NetworkInterfaceAttachment attachment;

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
    public DescribeNetworkInterfaceAttributeResult withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The description of the network interface.
     *
     * @return The description of the network interface.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the network interface.
     *
     * @param description The description of the network interface.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled.
     *
     * @return Indicates whether source/destination checking is enabled.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeResult withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled.
     *
     * @return Indicates whether source/destination checking is enabled.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * The security groups associated with the network interface.
     *
     * @return The security groups associated with the network interface.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * The security groups associated with the network interface.
     *
     * @param groups The security groups associated with the network interface.
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * The security groups associated with the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The security groups associated with the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeResult withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<GroupIdentifier>(groups.length));
        for (GroupIdentifier value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The security groups associated with the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The security groups associated with the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeResult withGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * The attachment (if any) of the network interface.
     *
     * @return The attachment (if any) of the network interface.
     */
    public NetworkInterfaceAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * The attachment (if any) of the network interface.
     *
     * @param attachment The attachment (if any) of the network interface.
     */
    public void setAttachment(NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * The attachment (if any) of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The attachment (if any) of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkInterfaceAttributeResult withAttachment(NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (isSourceDestCheck() != null) sb.append("SourceDestCheck: " + isSourceDestCheck() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (getAttachment() != null) sb.append("Attachment: " + getAttachment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkInterfaceAttributeResult == false) return false;
        DescribeNetworkInterfaceAttributeResult other = (DescribeNetworkInterfaceAttributeResult)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.isSourceDestCheck() == null ^ this.isSourceDestCheck() == null) return false;
        if (other.isSourceDestCheck() != null && other.isSourceDestCheck().equals(this.isSourceDestCheck()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.getAttachment() == null ^ this.getAttachment() == null) return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false) return false; 
        return true;
    }
    
}
    