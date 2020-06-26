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
 * Modifies the settings for the specified replication subnet group.
 * </p>
 */
public class ModifyReplicationSubnetGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the replication instance subnet group.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * A description for the replication instance subnet group.
     * </p>
     */
    private String replicationSubnetGroupDescription;

    /**
     * <p>
     * A list of subnet IDs.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The name of the replication instance subnet group.
     * </p>
     *
     * @return <p>
     *         The name of the replication instance subnet group.
     *         </p>
     */
    public String getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name of the replication instance subnet group.
     * </p>
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The name of the replication instance subnet group.
     *            </p>
     */
    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The name of the replication instance subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The name of the replication instance subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationSubnetGroupRequest withReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * A description for the replication instance subnet group.
     * </p>
     *
     * @return <p>
     *         A description for the replication instance subnet group.
     *         </p>
     */
    public String getReplicationSubnetGroupDescription() {
        return replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the replication instance subnet group.
     * </p>
     *
     * @param replicationSubnetGroupDescription <p>
     *            A description for the replication instance subnet group.
     *            </p>
     */
    public void setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the replication instance subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupDescription <p>
     *            A description for the replication instance subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationSubnetGroupRequest withReplicationSubnetGroupDescription(
            String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs.
     * </p>
     *
     * @return <p>
     *         A list of subnet IDs.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs.
     * </p>
     *
     * @param subnetIds <p>
     *            A list of subnet IDs.
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
     * A list of subnet IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationSubnetGroupRequest withSubnetIds(String... subnetIds) {
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
     * A list of subnet IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
            sb.append("SubnetIds: " + getSubnetIds());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationSubnetGroupRequest == false)
            return false;
        ModifyReplicationSubnetGroupRequest other = (ModifyReplicationSubnetGroupRequest) obj;

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
        return true;
    }
}
