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
 * Describes a network ACL.
 * </p>
 */
public class NetworkAcl implements Serializable {
    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     */
    private java.util.List<NetworkAclAssociation> associations;

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     */
    private java.util.List<NetworkAclEntry> entries;

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     *
     * @return <p>
     *         Any associations between the network ACL and one or more subnets
     *         </p>
     */
    public java.util.List<NetworkAclAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     *
     * @param associations <p>
     *            Any associations between the network ACL and one or more
     *            subnets
     *            </p>
     */
    public void setAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<NetworkAclAssociation>(associations);
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            Any associations between the network ACL and one or more
     *            subnets
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withAssociations(NetworkAclAssociation... associations) {
        if (getAssociations() == null) {
            this.associations = new java.util.ArrayList<NetworkAclAssociation>(associations.length);
        }
        for (NetworkAclAssociation value : associations) {
            this.associations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            Any associations between the network ACL and one or more
     *            subnets
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     *
     * @return <p>
     *         One or more entries (rules) in the network ACL.
     *         </p>
     */
    public java.util.List<NetworkAclEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     *
     * @param entries <p>
     *            One or more entries (rules) in the network ACL.
     *            </p>
     */
    public void setEntries(java.util.Collection<NetworkAclEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<NetworkAclEntry>(entries);
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            One or more entries (rules) in the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withEntries(NetworkAclEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<NetworkAclEntry>(entries.length);
        }
        for (NetworkAclEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            One or more entries (rules) in the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withEntries(java.util.Collection<NetworkAclEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default network ACL for the VPC.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default network ACL for the VPC.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     *
     * @param isDefault <p>
     *            Indicates whether this is the default network ACL for the VPC.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Indicates whether this is the default network ACL for the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the network ACL.
     *         </p>
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the network ACL.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the network ACL.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC for the network ACL.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the network ACL.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC for the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the network ACL.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the network ACL.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAcl withOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (getAssociations() != null)
            sb.append("Associations: " + getAssociations() + ",");
        if (getEntries() != null)
            sb.append("Entries: " + getEntries() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault() + ",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAcl == false)
            return false;
        NetworkAcl other = (NetworkAcl) obj;

        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null
                && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null
                && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }
}
