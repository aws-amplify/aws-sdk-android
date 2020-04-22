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
 * Describes an orderable cluster option.
 * </p>
 */
public class OrderableClusterOption implements Serializable {
    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     */
    private String clusterType;

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     *
     * @return <p>
     *         The version of the orderable cluster.
     *         </p>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     *
     * @param clusterVersion <p>
     *            The version of the orderable cluster.
     *            </p>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version of the orderable cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterVersion <p>
     *            The version of the orderable cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableClusterOption withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     *
     * @return <p>
     *         The cluster type, for example <code>multi-node</code>.
     *         </p>
     */
    public String getClusterType() {
        return clusterType;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     *
     * @param clusterType <p>
     *            The cluster type, for example <code>multi-node</code>.
     *            </p>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The cluster type, for example <code>multi-node</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterType <p>
     *            The cluster type, for example <code>multi-node</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableClusterOption withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     *
     * @return <p>
     *         The node type for the orderable cluster.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     *
     * @param nodeType <p>
     *            The node type for the orderable cluster.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the orderable cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type for the orderable cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableClusterOption withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     *
     * @return <p>
     *         A list of availability zones for the orderable cluster.
     *         </p>
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     *
     * @param availabilityZones <p>
     *            A list of availability zones for the orderable cluster.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of availability zones for the orderable cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableClusterOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    availabilityZones.length);
        }
        for (AvailabilityZone value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of availability zones for the orderable cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of availability zones for the orderable cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableClusterOption withAvailabilityZones(
            java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getClusterType() != null)
            sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableClusterOption == false)
            return false;
        OrderableClusterOption other = (OrderableClusterOption) obj;

        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null
                && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null
                && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }
}
