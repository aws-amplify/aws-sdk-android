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
 * Creates a new Amazon Redshift security group. You use security groups to
 * control access to non-VPC clusters.
 * </p>
 * <p>
 * For information about managing security groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
 * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
 * Cluster Management Guide</i>.
 * </p>
 */
public class CreateClusterSecurityGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a
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
     * Must be unique for all security groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     */
    private String clusterSecurityGroupName;

    /**
     * <p>
     * A description for the security group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a
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
     * Must be unique for all security groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     *
     * @return <p>
     *         The name for the security group. Amazon Redshift stores the value
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
     *         Must be unique for all security groups that are created by your
     *         AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>examplesecuritygroup</code>
     *         </p>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a
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
     * Must be unique for all security groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     *
     * @param clusterSecurityGroupName <p>
     *            The name for the security group. Amazon Redshift stores the
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
     *            Must be unique for all security groups that are created by
     *            your AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>examplesecuritygroup</code>
     *            </p>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name for the security group. Amazon Redshift stores the value as a
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
     * Must be unique for all security groups that are created by your AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>examplesecuritygroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroupName <p>
     *            The name for the security group. Amazon Redshift stores the
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
     *            Must be unique for all security groups that are created by
     *            your AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>examplesecuritygroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSecurityGroupRequest withClusterSecurityGroupName(
            String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     *
     * @return <p>
     *         A description for the security group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     *
     * @param description <p>
     *            A description for the security group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterSecurityGroupRequest withDescription(String description) {
        this.description = description;
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
    public CreateClusterSecurityGroupRequest withTags(Tag... tags) {
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
    public CreateClusterSecurityGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterSecurityGroupRequest == false)
            return false;
        CreateClusterSecurityGroupRequest other = (CreateClusterSecurityGroupRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
