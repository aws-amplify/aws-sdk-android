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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a security group.
 * </p>
 */
public class ClusterSecurityGroup implements Serializable {
    /**
     * <p>
     * The name of the cluster security group to which the operation was
     * applied.
     * </p>
     */
    private String clusterSecurityGroupName;

    /**
     * <p>
     * A description of the security group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     */
    private java.util.List<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     */
    private java.util.List<IPRange> iPRanges;

    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the cluster security group to which the operation was
     * applied.
     * </p>
     *
     * @return <p>
     *         The name of the cluster security group to which the operation was
     *         applied.
     *         </p>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to which the operation was
     * applied.
     * </p>
     *
     * @param clusterSecurityGroupName <p>
     *            The name of the cluster security group to which the operation
     *            was applied.
     *            </p>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to which the operation was
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroupName <p>
     *            The name of the cluster security group to which the operation
     *            was applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     *
     * @return <p>
     *         A description of the security group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     *
     * @param description <p>
     *            A description of the security group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     *
     * @return <p>
     *         A list of EC2 security groups that are permitted to access
     *         clusters associated with this cluster security group.
     *         </p>
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     *
     * @param eC2SecurityGroups <p>
     *            A list of EC2 security groups that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            A list of EC2 security groups that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) {
            this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(
                    eC2SecurityGroups.length);
        }
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            A list of EC2 security groups that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withEC2SecurityGroups(
            java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     *
     * @return <p>
     *         A list of IP ranges (CIDR blocks) that are permitted to access
     *         clusters associated with this cluster security group.
     *         </p>
     */
    public java.util.List<IPRange> getIPRanges() {
        return iPRanges;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     *
     * @param iPRanges <p>
     *            A list of IP ranges (CIDR blocks) that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     */
    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }

        this.iPRanges = new java.util.ArrayList<IPRange>(iPRanges);
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPRanges <p>
     *            A list of IP ranges (CIDR blocks) that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (getIPRanges() == null) {
            this.iPRanges = new java.util.ArrayList<IPRange>(iPRanges.length);
        }
        for (IPRange value : iPRanges) {
            this.iPRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP ranges (CIDR blocks) that are permitted to access clusters
     * associated with this cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPRanges <p>
     *            A list of IP ranges (CIDR blocks) that are permitted to access
     *            clusters associated with this cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        setIPRanges(iPRanges);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     *
     * @return <p>
     *         The list of tags for the cluster security group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster security group.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the cluster security group.
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
     * The list of tags for the cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withTags(Tag... tags) {
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
     * The list of tags for the cluster security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSecurityGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() + ",");
        if (getIPRanges() != null)
            sb.append("IPRanges: " + getIPRanges() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSecurityGroup == false)
            return false;
        ClusterSecurityGroup other = (ClusterSecurityGroup) obj;

        if (other.getClusterSecurityGroupName() == null
                ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null
                && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null
                && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        if (other.getIPRanges() == null ^ this.getIPRanges() == null)
            return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
