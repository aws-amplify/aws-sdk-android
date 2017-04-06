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
import com.amazonaws.services.ec2.model.transform.ModifyNetworkInterfaceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest) ModifyNetworkInterfaceAttribute operation}.
 * <p>
 * Modifies the specified network interface attribute. You can specify
 * only one attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest)
 */
public class ModifyNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyNetworkInterfaceAttributeRequest> {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * A description for the network interface.
     */
    private String description;

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    private Boolean sourceDestCheck;

    /**
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC.
     * You must specify the ID of the security group, not the name.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * Information about the interface attachment. If modifying the 'delete
     * on termination' attribute, you must specify the ID of the interface
     * attachment.
     */
    private NetworkInterfaceAttachmentChanges attachment;

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
    public ModifyNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * A description for the network interface.
     *
     * @return A description for the network interface.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the network interface.
     *
     * @param description A description for the network interface.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyNetworkInterfaceAttributeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyNetworkInterfaceAttributeRequest withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC.
     * You must specify the ID of the security group, not the name.
     *
     * @return Changes the security groups for the network interface. The new set of
     *         groups you specify replaces the current set. You must specify at least
     *         one group, even if it's just the default security group in the VPC.
     *         You must specify the ID of the security group, not the name.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC.
     * You must specify the ID of the security group, not the name.
     *
     * @param groups Changes the security groups for the network interface. The new set of
     *         groups you specify replaces the current set. You must specify at least
     *         one group, even if it's just the default security group in the VPC.
     *         You must specify the ID of the security group, not the name.
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC.
     * You must specify the ID of the security group, not the name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups Changes the security groups for the network interface. The new set of
     *         groups you specify replaces the current set. You must specify at least
     *         one group, even if it's just the default security group in the VPC.
     *         You must specify the ID of the security group, not the name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyNetworkInterfaceAttributeRequest withGroups(String... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>(groups.length));
        for (String value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC.
     * You must specify the ID of the security group, not the name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups Changes the security groups for the network interface. The new set of
     *         groups you specify replaces the current set. You must specify at least
     *         one group, even if it's just the default security group in the VPC.
     *         You must specify the ID of the security group, not the name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyNetworkInterfaceAttributeRequest withGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * Information about the interface attachment. If modifying the 'delete
     * on termination' attribute, you must specify the ID of the interface
     * attachment.
     *
     * @return Information about the interface attachment. If modifying the 'delete
     *         on termination' attribute, you must specify the ID of the interface
     *         attachment.
     */
    public NetworkInterfaceAttachmentChanges getAttachment() {
        return attachment;
    }
    
    /**
     * Information about the interface attachment. If modifying the 'delete
     * on termination' attribute, you must specify the ID of the interface
     * attachment.
     *
     * @param attachment Information about the interface attachment. If modifying the 'delete
     *         on termination' attribute, you must specify the ID of the interface
     *         attachment.
     */
    public void setAttachment(NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
    }
    
    /**
     * Information about the interface attachment. If modifying the 'delete
     * on termination' attribute, you must specify the ID of the interface
     * attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment Information about the interface attachment. If modifying the 'delete
     *         on termination' attribute, you must specify the ID of the interface
     *         attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyNetworkInterfaceAttributeRequest withAttachment(NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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

        if (obj instanceof ModifyNetworkInterfaceAttributeRequest == false) return false;
        ModifyNetworkInterfaceAttributeRequest other = (ModifyNetworkInterfaceAttributeRequest)obj;
        
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
    