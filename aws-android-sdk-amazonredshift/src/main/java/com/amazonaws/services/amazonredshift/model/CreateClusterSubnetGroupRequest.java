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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon Redshift subnet group. You must provide a list of one or
 * more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when
 * creating Amazon Redshift subnet group.
 * </p>
 * <p>
 * For information about subnet groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html"
 * >Amazon Redshift Cluster Subnet Groups</a> in the <i>Amazon Redshift Cluster
 * Management Guide</i>.
 * </p>
 */
public class CreateClusterSubnetGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     */
    private String clusterSubnetGroupName;

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     * single request.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The name for the subnet group. Amazon Redshift stores the value
     *         as a lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain no more than 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not be "Default".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique for all subnet groups that are created by your AWS
     *         account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>examplesubnetgroup</code>
     *         </p>
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     *
     * @param clusterSubnetGroupName <p>
     *            The name for the subnet group. Amazon Redshift stores the
     *            value as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain no more than 255 alphanumeric characters or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not be "Default".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique for all subnet groups that are created by your
     *            AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>examplesubnetgroup</code>
     *            </p>
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default".
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all subnet groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroupName <p>
     *            The name for the subnet group. Amazon Redshift stores the
     *            value as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain no more than 255 alphanumeric characters or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not be "Default".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique for all subnet groups that are created by your
     *            AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>examplesubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     *
     * @return <p>
     *         A description for the subnet group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     *
     * @param description <p>
     *            A description for the subnet group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     * single request.
     * </p>
     *
     * @return <p>
     *         An array of VPC subnet IDs. A maximum of 20 subnets can be
     *         modified in a single request.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     * single request.
     * </p>
     *
     * @param subnetIds <p>
     *            An array of VPC subnet IDs. A maximum of 20 subnets can be
     *            modified in a single request.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     * single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            An array of VPC subnet IDs. A maximum of 20 subnets can be
     *            modified in a single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     * single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            An array of VPC subnet IDs. A maximum of 20 subnets can be
     *            modified in a single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @return <p>
     *         A list of tag instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSubnetGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
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
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterSubnetGroupRequest == false)
            return false;
        CreateClusterSubnetGroupRequest other = (CreateClusterSubnetGroupRequest) obj;

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
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
