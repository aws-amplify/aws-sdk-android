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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * A list of the replication groups
 * </p>
 */
public class RegionalConfiguration implements Serializable {
    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     */
    private String replicationGroupRegion;

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies
     * the configuration of a node group in the resharded cluster.
     * </p>
     */
    private java.util.List<ReshardingConfiguration> reshardingConfiguration;

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     *
     * @return <p>
     *         The name of the secondary cluster
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     *
     * @param replicationGroupId <p>
     *            The name of the secondary cluster
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The name of the secondary cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegionalConfiguration withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     *
     * @return <p>
     *         The AWS region where the cluster is stored
     *         </p>
     */
    public String getReplicationGroupRegion() {
        return replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     *
     * @param replicationGroupRegion <p>
     *            The AWS region where the cluster is stored
     *            </p>
     */
    public void setReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region where the cluster is stored
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupRegion <p>
     *            The AWS region where the cluster is stored
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegionalConfiguration withReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies
     * the configuration of a node group in the resharded cluster.
     * </p>
     *
     * @return <p>
     *         A list of <code>PreferredAvailabilityZones</code> objects that
     *         specifies the configuration of a node group in the resharded
     *         cluster.
     *         </p>
     */
    public java.util.List<ReshardingConfiguration> getReshardingConfiguration() {
        return reshardingConfiguration;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies
     * the configuration of a node group in the resharded cluster.
     * </p>
     *
     * @param reshardingConfiguration <p>
     *            A list of <code>PreferredAvailabilityZones</code> objects that
     *            specifies the configuration of a node group in the resharded
     *            cluster.
     *            </p>
     */
    public void setReshardingConfiguration(
            java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        if (reshardingConfiguration == null) {
            this.reshardingConfiguration = null;
            return;
        }

        this.reshardingConfiguration = new java.util.ArrayList<ReshardingConfiguration>(
                reshardingConfiguration);
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies
     * the configuration of a node group in the resharded cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reshardingConfiguration <p>
     *            A list of <code>PreferredAvailabilityZones</code> objects that
     *            specifies the configuration of a node group in the resharded
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegionalConfiguration withReshardingConfiguration(
            ReshardingConfiguration... reshardingConfiguration) {
        if (getReshardingConfiguration() == null) {
            this.reshardingConfiguration = new java.util.ArrayList<ReshardingConfiguration>(
                    reshardingConfiguration.length);
        }
        for (ReshardingConfiguration value : reshardingConfiguration) {
            this.reshardingConfiguration.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZones</code> objects that specifies
     * the configuration of a node group in the resharded cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reshardingConfiguration <p>
     *            A list of <code>PreferredAvailabilityZones</code> objects that
     *            specifies the configuration of a node group in the resharded
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegionalConfiguration withReshardingConfiguration(
            java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        setReshardingConfiguration(reshardingConfiguration);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupRegion() != null)
            sb.append("ReplicationGroupRegion: " + getReplicationGroupRegion() + ",");
        if (getReshardingConfiguration() != null)
            sb.append("ReshardingConfiguration: " + getReshardingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationGroupRegion() == null) ? 0 : getReplicationGroupRegion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReshardingConfiguration() == null) ? 0 : getReshardingConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionalConfiguration == false)
            return false;
        RegionalConfiguration other = (RegionalConfiguration) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupRegion() == null ^ this.getReplicationGroupRegion() == null)
            return false;
        if (other.getReplicationGroupRegion() != null
                && other.getReplicationGroupRegion().equals(this.getReplicationGroupRegion()) == false)
            return false;
        if (other.getReshardingConfiguration() == null ^ this.getReshardingConfiguration() == null)
            return false;
        if (other.getReshardingConfiguration() != null
                && other.getReshardingConfiguration().equals(this.getReshardingConfiguration()) == false)
            return false;
        return true;
    }
}
