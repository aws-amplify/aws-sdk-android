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
 * A list of <code>PreferredAvailabilityZones</code> objects that specifies the
 * configuration of a node group in the resharded cluster.
 * </p>
 */
public class ReshardingConfiguration implements Serializable {
    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String nodeGroupId;

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     */
    private java.util.List<String> preferredAvailabilityZones;

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         Either the ElastiCache for Redis supplied 4-digit id or a user
     *         supplied id for the node group these configuration values apply
     *         to.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            Either the ElastiCache for Redis supplied 4-digit id or a user
     *            supplied id for the node group these configuration values
     *            apply to.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied
     * id for the node group these configuration values apply to.
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
     *            Either the ElastiCache for Redis supplied 4-digit id or a user
     *            supplied id for the node group these configuration values
     *            apply to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReshardingConfiguration withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     *
     * @return <p>
     *         A list of preferred availability zones for the nodes in this
     *         cluster.
     *         </p>
     */
    public java.util.List<String> getPreferredAvailabilityZones() {
        return preferredAvailabilityZones;
    }

    /**
     * <p>
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     *
     * @param preferredAvailabilityZones <p>
     *            A list of preferred availability zones for the nodes in this
     *            cluster.
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
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZones <p>
     *            A list of preferred availability zones for the nodes in this
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReshardingConfiguration withPreferredAvailabilityZones(
            String... preferredAvailabilityZones) {
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
     * A list of preferred availability zones for the nodes in this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAvailabilityZones <p>
     *            A list of preferred availability zones for the nodes in this
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReshardingConfiguration withPreferredAvailabilityZones(
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

        if (obj instanceof ReshardingConfiguration == false)
            return false;
        ReshardingConfiguration other = (ReshardingConfiguration) obj;

        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
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
