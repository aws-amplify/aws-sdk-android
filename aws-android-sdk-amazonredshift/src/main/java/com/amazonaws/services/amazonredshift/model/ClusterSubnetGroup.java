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
 * Describes a subnet group.
 * </p>
 */
public class ClusterSubnetGroup implements Serializable {
    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     */
    private String clusterSubnetGroupName;

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and <code>Invalid</code>.
     * </p>
     */
    private String subnetGroupStatus;

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     */
    private java.util.List<Subnet> subnets;

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     *
     * @return <p>
     *         The name of the cluster subnet group.
     *         </p>
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the cluster subnet group.
     *            </p>
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cluster subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the cluster subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     *
     * @return <p>
     *         The description of the cluster subnet group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     *
     * @param description <p>
     *            The description of the cluster subnet group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the cluster subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     *
     * @return <p>
     *         The VPC ID of the cluster subnet group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     *
     * @param vpcId <p>
     *            The VPC ID of the cluster subnet group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the cluster subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The VPC ID of the cluster subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and <code>Invalid</code>.
     * </p>
     *
     * @return <p>
     *         The status of the cluster subnet group. Possible values are
     *         <code>Complete</code>, <code>Incomplete</code> and
     *         <code>Invalid</code>.
     *         </p>
     */
    public String getSubnetGroupStatus() {
        return subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and <code>Invalid</code>.
     * </p>
     *
     * @param subnetGroupStatus <p>
     *            The status of the cluster subnet group. Possible values are
     *            <code>Complete</code>, <code>Incomplete</code> and
     *            <code>Invalid</code>.
     *            </p>
     */
    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and <code>Invalid</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetGroupStatus <p>
     *            The status of the cluster subnet group. Possible values are
     *            <code>Complete</code>, <code>Incomplete</code> and
     *            <code>Invalid</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
        return this;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     *
     * @return <p>
     *         A list of the VPC <a>Subnet</a> elements.
     *         </p>
     */
    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     *
     * @param subnets <p>
     *            A list of the VPC <a>Subnet</a> elements.
     *            </p>
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            A list of the VPC <a>Subnet</a> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<Subnet>(subnets.length);
        }
        for (Subnet value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the VPC <a>Subnet</a> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            A list of the VPC <a>Subnet</a> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     *
     * @return <p>
     *         The list of tags for the cluster subnet group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster subnet group.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the cluster subnet group.
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
     * The list of tags for the cluster subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withTags(Tag... tags) {
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
     * The list of tags for the cluster subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSubnetGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: " + getSubnetGroupStatus() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets() + ",");
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
                + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSubnetGroup == false)
            return false;
        ClusterSubnetGroup other = (ClusterSubnetGroup) obj;

        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null
                && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null
                && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
