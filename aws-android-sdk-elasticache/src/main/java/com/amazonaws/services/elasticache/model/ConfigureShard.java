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
 * Node group (shard) configuration options when adding or removing replicas.
 * Each node group (shard) configuration has the following members: NodeGroupId,
 * NewReplicaCount, and PreferredAvailabilityZones.
 * </p>
 */
public class ConfigureShard implements Serializable {
    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster
     * mode disabled) replication groups, the node group id is always 0001. To
     * find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     * >Finding a Shard's Id</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this
     * operation. The maximum value for <code>NewReplicaCount</code> is 5. The
     * minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     */
    private Integer newReplicaCount;

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify
     * which availability zones the replication group's nodes are to be in. The
     * nummber of <code>PreferredAvailabilityZone</code> values must equal the
     * value of <code>NewReplicaCount</code> plus 1 to account for the primary
     * node. If this member of <code>ReplicaConfiguration</code> is omitted,
     * ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     */
    private java.util.List<String> preferredAvailabilityZones;

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster
     * mode disabled) replication groups, the node group id is always 0001. To
     * find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     * >Finding a Shard's Id</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The 4-digit id for the node group you are configuring. For Redis
     *         (cluster mode disabled) replication groups, the node group id is
     *         always 0001. To find a Redis (cluster mode enabled)'s node
     *         group's (shard's) id, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     *         >Finding a Shard's Id</a>.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster
     * mode disabled) replication groups, the node group id is always 0001. To
     * find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     * >Finding a Shard's Id</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            The 4-digit id for the node group you are configuring. For
     *            Redis (cluster mode disabled) replication groups, the node
     *            group id is always 0001. To find a Redis (cluster mode
     *            enabled)'s node group's (shard's) id, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     *            >Finding a Shard's Id</a>.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster
     * mode disabled) replication groups, the node group id is always 0001. To
     * find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     * >Finding a Shard's Id</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            The 4-digit id for the node group you are configuring. For
     *            Redis (cluster mode disabled) replication groups, the node
     *            group id is always 0001. To find a Redis (cluster mode
     *            enabled)'s node group's (shard's) id, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html"
     *            >Finding a Shard's Id</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureShard withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this
     * operation. The maximum value for <code>NewReplicaCount</code> is 5. The
     * minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of replicas you want in this node group at the end of
     *         this operation. The maximum value for
     *         <code>NewReplicaCount</code> is 5. The minimum value depends upon
     *         the type of Redis replication group you are working with.
     *         </p>
     *         <p>
     *         The minimum number of replicas in a shard or replication group
     *         is:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is enabled: 1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is not enable: 0
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): 0 (though you will not be able to
     *         failover to a replica if your primary node fails)
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getNewReplicaCount() {
        return newReplicaCount;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this
     * operation. The maximum value for <code>NewReplicaCount</code> is 5. The
     * minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     *
     * @param newReplicaCount <p>
     *            The number of replicas you want in this node group at the end
     *            of this operation. The maximum value for
     *            <code>NewReplicaCount</code> is 5. The minimum value depends
     *            upon the type of Redis replication group you are working with.
     *            </p>
     *            <p>
     *            The minimum number of replicas in a shard or replication group
     *            is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is enabled: 1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is not enable: 0
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): 0 (though you will not be able
     *            to failover to a replica if your primary node fails)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNewReplicaCount(Integer newReplicaCount) {
        this.newReplicaCount = newReplicaCount;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this
     * operation. The maximum value for <code>NewReplicaCount</code> is 5. The
     * minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newReplicaCount <p>
     *            The number of replicas you want in this node group at the end
     *            of this operation. The maximum value for
     *            <code>NewReplicaCount</code> is 5. The minimum value depends
     *            upon the type of Redis replication group you are working with.
     *            </p>
     *            <p>
     *            The minimum number of replicas in a shard or replication group
     *            is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is enabled: 1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is not enable: 0
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): 0 (though you will not be able
     *            to failover to a replica if your primary node fails)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureShard withNewReplicaCount(Integer newReplicaCount) {
        this.newReplicaCount = newReplicaCount;
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify
     * which availability zones the replication group's nodes are to be in. The
     * nummber of <code>PreferredAvailabilityZone</code> values must equal the
     * value of <code>NewReplicaCount</code> plus 1 to account for the primary
     * node. If this member of <code>ReplicaConfiguration</code> is omitted,
     * ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     *
     * @return <p>
     *         A list of <code>PreferredAvailabilityZone</code> strings that
     *         specify which availability zones the replication group's nodes
     *         are to be in. The nummber of
     *         <code>PreferredAvailabilityZone</code> values must equal the
     *         value of <code>NewReplicaCount</code> plus 1 to account for the
     *         primary node. If this member of <code>ReplicaConfiguration</code>
     *         is omitted, ElastiCache for Redis selects the availability zone
     *         for each of the replicas.
     *         </p>
     */
    public java.util.List<String> getPreferredAvailabilityZones() {
        return preferredAvailabilityZones;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify
     * which availability zones the replication group's nodes are to be in. The
     * nummber of <code>PreferredAvailabilityZone</code> values must equal the
     * value of <code>NewReplicaCount</code> plus 1 to account for the primary
     * node. If this member of <code>ReplicaConfiguration</code> is omitted,
     * ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     *
     * @param preferredAvailabilityZones <p>
     *            A list of <code>PreferredAvailabilityZone</code> strings that
     *            specify which availability zones the replication group's nodes
     *            are to be in. The nummber of
     *            <code>PreferredAvailabilityZone</code> values must equal the
     *            value of <code>NewReplicaCount</code> plus 1 to account for
     *            the primary node. If this member of
     *            <code>ReplicaConfiguration</code> is omitted, ElastiCache for
     *            Redis selects the availability zone for each of the replicas.
     *            </p>
     */
    public void setPreferredAvailabilityZones(
            java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
            return;
        }

        this.preferredAvailabilityZones = new java.util.ArrayList<String>(
                preferredAvailabilityZones);
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify
     * which availability zones the replication group's nodes are to be in. The
     * nummber of <code>PreferredAvailabilityZone</code> values must equal the
     * value of <code>NewReplicaCount</code> plus 1 to account for the primary
     * node. If this member of <code>ReplicaConfiguration</code> is omitted,
     * ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZones <p>
     *            A list of <code>PreferredAvailabilityZone</code> strings that
     *            specify which availability zones the replication group's nodes
     *            are to be in. The nummber of
     *            <code>PreferredAvailabilityZone</code> values must equal the
     *            value of <code>NewReplicaCount</code> plus 1 to account for
     *            the primary node. If this member of
     *            <code>ReplicaConfiguration</code> is omitted, ElastiCache for
     *            Redis selects the availability zone for each of the replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureShard withPreferredAvailabilityZones(String... preferredAvailabilityZones) {
        if (getPreferredAvailabilityZones() == null) {
            this.preferredAvailabilityZones = new java.util.ArrayList<String>(
                    preferredAvailabilityZones.length);
        }
        for (String value : preferredAvailabilityZones) {
            this.preferredAvailabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify
     * which availability zones the replication group's nodes are to be in. The
     * nummber of <code>PreferredAvailabilityZone</code> values must equal the
     * value of <code>NewReplicaCount</code> plus 1 to account for the primary
     * node. If this member of <code>ReplicaConfiguration</code> is omitted,
     * ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZones <p>
     *            A list of <code>PreferredAvailabilityZone</code> strings that
     *            specify which availability zones the replication group's nodes
     *            are to be in. The nummber of
     *            <code>PreferredAvailabilityZone</code> values must equal the
     *            value of <code>NewReplicaCount</code> plus 1 to account for
     *            the primary node. If this member of
     *            <code>ReplicaConfiguration</code> is omitted, ElastiCache for
     *            Redis selects the availability zone for each of the replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureShard withPreferredAvailabilityZones(
            java.util.Collection<String> preferredAvailabilityZones) {
        setPreferredAvailabilityZones(preferredAvailabilityZones);
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: " + getNodeGroupId() + ",");
        if (getNewReplicaCount() != null)
            sb.append("NewReplicaCount: " + getNewReplicaCount() + ",");
        if (getPreferredAvailabilityZones() != null)
            sb.append("PreferredAvailabilityZones: " + getPreferredAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getNewReplicaCount() == null) ? 0 : getNewReplicaCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredAvailabilityZones() == null) ? 0 : getPreferredAvailabilityZones()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureShard == false)
            return false;
        ConfigureShard other = (ConfigureShard) obj;

        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getNewReplicaCount() == null ^ this.getNewReplicaCount() == null)
            return false;
        if (other.getNewReplicaCount() != null
                && other.getNewReplicaCount().equals(this.getNewReplicaCount()) == false)
            return false;
        if (other.getPreferredAvailabilityZones() == null
                ^ this.getPreferredAvailabilityZones() == null)
            return false;
        if (other.getPreferredAvailabilityZones() != null
                && other.getPreferredAvailabilityZones().equals(
                        this.getPreferredAvailabilityZones()) == false)
            return false;
        return true;
    }
}
