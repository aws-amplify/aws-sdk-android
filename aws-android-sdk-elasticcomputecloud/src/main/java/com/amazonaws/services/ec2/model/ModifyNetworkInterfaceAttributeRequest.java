/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Modifies the specified network interface attribute. You can specify only one
 * attribute at a time. You can use this action to attach and detach security
 * groups from an existing EC2 instance.
 * </p>
 */
public class ModifyNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on
     * termination' attribute, you must specify the ID of the interface
     * attachment.
     * </p>
     */
    private NetworkInterfaceAttachmentChanges attachment;

    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private AttributeValue description;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC. You
     * must specify the ID of the security group, not the name.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private AttributeBooleanValue sourceDestCheck;

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on
     * termination' attribute, you must specify the ID of the interface
     * attachment.
     * </p>
     *
     * @return <p>
     *         Information about the interface attachment. If modifying the
     *         'delete on termination' attribute, you must specify the ID of the
     *         interface attachment.
     *         </p>
     */
    public NetworkInterfaceAttachmentChanges getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on
     * termination' attribute, you must specify the ID of the interface
     * attachment.
     * </p>
     *
     * @param attachment <p>
     *            Information about the interface attachment. If modifying the
     *            'delete on termination' attribute, you must specify the ID of
     *            the interface attachment.
     *            </p>
     */
    public void setAttachment(NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on
     * termination' attribute, you must specify the ID of the interface
     * attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            Information about the interface attachment. If modifying the
     *            'delete on termination' attribute, you must specify the ID of
     *            the interface attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withAttachment(
            NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     *
     * @return <p>
     *         A description for the network interface.
     *         </p>
     */
    public AttributeValue getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     *
     * @param description <p>
     *            A description for the network interface.
     *            </p>
     */
    public void setDescription(AttributeValue description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withDescription(AttributeValue description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC. You
     * must specify the ID of the security group, not the name.
     * </p>
     *
     * @return <p>
     *         Changes the security groups for the network interface. The new
     *         set of groups you specify replaces the current set. You must
     *         specify at least one group, even if it's just the default
     *         security group in the VPC. You must specify the ID of the
     *         security group, not the name.
     *         </p>
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC. You
     * must specify the ID of the security group, not the name.
     * </p>
     *
     * @param groups <p>
     *            Changes the security groups for the network interface. The new
     *            set of groups you specify replaces the current set. You must
     *            specify at least one group, even if it's just the default
     *            security group in the VPC. You must specify the ID of the
     *            security group, not the name.
     *            </p>
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC. You
     * must specify the ID of the security group, not the name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            Changes the security groups for the network interface. The new
     *            set of groups you specify replaces the current set. You must
     *            specify at least one group, even if it's just the default
     *            security group in the VPC. You must specify the ID of the
     *            security group, not the name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withGroups(String... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<String>(groups.length);
        }
        for (String value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of
     * groups you specify replaces the current set. You must specify at least
     * one group, even if it's just the default security group in the VPC. You
     * must specify the ID of the security group, not the name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            Changes the security groups for the network interface. The new
     *            set of groups you specify replaces the current set. You must
     *            specify at least one group, even if it's just the default
     *            security group in the VPC. You must specify the ID of the
     *            security group, not the name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether source/destination checking is enabled. A value
     *         of <code>true</code> means checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *         >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     *         </p>
     */
    public AttributeBooleanValue getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled. A
     *            value of <code>true</code> means checking is enabled, and
     *            <code>false</code> means checking is disabled. This value must
     *            be <code>false</code> for a NAT instance to perform NAT. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *            >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *            Guide</i>.
     *            </p>
     */
    public void setSourceDestCheck(AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled. A
     *            value of <code>true</code> means checking is enabled, and
     *            <code>false</code> means checking is disabled. This value must
     *            be <code>false</code> for a NAT instance to perform NAT. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *            >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyNetworkInterfaceAttributeRequest withSourceDestCheck(
            AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttachment() != null)
            sb.append("Attachment: " + getAttachment() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyNetworkInterfaceAttributeRequest == false)
            return false;
        ModifyNetworkInterfaceAttributeRequest other = (ModifyNetworkInterfaceAttributeRequest) obj;

        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null
                && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        return true;
    }
}
