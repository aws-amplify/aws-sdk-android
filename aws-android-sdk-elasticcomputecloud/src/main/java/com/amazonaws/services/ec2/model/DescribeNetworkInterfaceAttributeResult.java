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

/**
 * <p>
 * Contains the output of DescribeNetworkInterfaceAttribute.
 * </p>
 */
public class DescribeNetworkInterfaceAttributeResult implements Serializable {
    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     */
    private NetworkInterfaceAttachment attachment;

    /**
     * <p>
     * The description of the network interface.
     * </p>
     */
    private AttributeValue description;

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     */
    private AttributeBooleanValue sourceDestCheck;

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     *
     * @return <p>
     *         The attachment (if any) of the network interface.
     *         </p>
     */
    public NetworkInterfaceAttachment getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     *
     * @param attachment <p>
     *            The attachment (if any) of the network interface.
     *            </p>
     */
    public void setAttachment(NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            The attachment (if any) of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfaceAttributeResult withAttachment(
            NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     *
     * @return <p>
     *         The description of the network interface.
     *         </p>
     */
    public AttributeValue getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     *
     * @param description <p>
     *            The description of the network interface.
     *            </p>
     */
    public void setDescription(AttributeValue description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfaceAttributeResult withDescription(AttributeValue description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     *
     * @return <p>
     *         The security groups associated with the network interface.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     *
     * @param groups <p>
     *            The security groups associated with the network interface.
     *            </p>
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The security groups associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfaceAttributeResult withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<GroupIdentifier>(groups.length);
        }
        for (GroupIdentifier value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The security groups associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfaceAttributeResult withGroups(
            java.util.Collection<GroupIdentifier> groups) {
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
    public DescribeNetworkInterfaceAttributeResult withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether source/destination checking is enabled.
     *         </p>
     */
    public AttributeBooleanValue getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled.
     *            </p>
     */
    public void setSourceDestCheck(AttributeBooleanValue sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether source/destination checking is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfaceAttributeResult withSourceDestCheck(
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

        if (obj instanceof DescribeNetworkInterfaceAttributeResult == false)
            return false;
        DescribeNetworkInterfaceAttributeResult other = (DescribeNetworkInterfaceAttributeResult) obj;

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
