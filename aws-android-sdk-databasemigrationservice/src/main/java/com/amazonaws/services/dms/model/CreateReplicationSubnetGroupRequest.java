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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a replication subnet group given a list of the subnet IDs in a VPC.
 * </p>
 */
public class CreateReplicationSubnetGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, spaces, underscores, or hyphens. Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     */
    private String replicationSubnetGroupDescription;

    /**
     * <p>
     * One or more subnet IDs to be assigned to the subnet group.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * One or more tags to be assigned to the subnet group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, spaces, underscores, or hyphens. Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The name for the replication subnet group. This value is stored
     *         as a lowercase string.
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters, periods, spaces, underscores, or hyphens. Must not be
     *         "default".
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     *         </p>
     */
    public String getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, spaces, underscores, or hyphens. Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The name for the replication subnet group. This value is
     *            stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters, periods, spaces, underscores, or hyphens. Must not
     *            be "default".
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     */
    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name for the replication subnet group. This value is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, spaces, underscores, or hyphens. Must not be "default".
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The name for the replication subnet group. This value is
     *            stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters, periods, spaces, underscores, or hyphens. Must not
     *            be "default".
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     *
     * @return <p>
     *         The description for the subnet group.
     *         </p>
     */
    public String getReplicationSubnetGroupDescription() {
        return replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     *
     * @param replicationSubnetGroupDescription <p>
     *            The description for the subnet group.
     *            </p>
     */
    public void setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupDescription <p>
     *            The description for the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withReplicationSubnetGroupDescription(
            String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs to be assigned to the subnet group.
     * </p>
     *
     * @return <p>
     *         One or more subnet IDs to be assigned to the subnet group.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * One or more subnet IDs to be assigned to the subnet group.
     * </p>
     *
     * @param subnetIds <p>
     *            One or more subnet IDs to be assigned to the subnet group.
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
     * One or more subnet IDs to be assigned to the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            One or more subnet IDs to be assigned to the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withSubnetIds(String... subnetIds) {
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
     * One or more subnet IDs to be assigned to the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            One or more subnet IDs to be assigned to the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the subnet group.
     * </p>
     *
     * @return <p>
     *         One or more tags to be assigned to the subnet group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the subnet group.
     * </p>
     *
     * @param tags <p>
     *            One or more tags to be assigned to the subnet group.
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
     * One or more tags to be assigned to the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withTags(Tag... tags) {
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
     * One or more tags to be assigned to the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationSubnetGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: " + getReplicationSubnetGroupIdentifier()
                    + ",");
        if (getReplicationSubnetGroupDescription() != null)
            sb.append("ReplicationSubnetGroupDescription: "
                    + getReplicationSubnetGroupDescription() + ",");
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
                + ((getReplicationSubnetGroupIdentifier() == null) ? 0
                        : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroupDescription() == null) ? 0
                        : getReplicationSubnetGroupDescription().hashCode());
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

        if (obj instanceof CreateReplicationSubnetGroupRequest == false)
            return false;
        CreateReplicationSubnetGroupRequest other = (CreateReplicationSubnetGroupRequest) obj;

        if (other.getReplicationSubnetGroupIdentifier() == null
                ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(
                        this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        if (other.getReplicationSubnetGroupDescription() == null
                ^ this.getReplicationSubnetGroupDescription() == null)
            return false;
        if (other.getReplicationSubnetGroupDescription() != null
                && other.getReplicationSubnetGroupDescription().equals(
                        this.getReplicationSubnetGroupDescription()) == false)
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
