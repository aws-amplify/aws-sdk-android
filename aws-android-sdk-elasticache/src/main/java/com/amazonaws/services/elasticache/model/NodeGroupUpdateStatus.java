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
 * The status of the service update on the node group
 * </p>
 */
public class NodeGroupUpdateStatus implements Serializable {
    /**
     * <p>
     * The ID of the node group
     * </p>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     */
    private java.util.List<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus;

    /**
     * <p>
     * The ID of the node group
     * </p>
     *
     * @return <p>
     *         The ID of the node group
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * The ID of the node group
     * </p>
     *
     * @param nodeGroupId <p>
     *            The ID of the node group
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The ID of the node group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupId <p>
     *            The ID of the node group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupUpdateStatus withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     *
     * @return <p>
     *         The status of the service update on the node group member
     *         </p>
     */
    public java.util.List<NodeGroupMemberUpdateStatus> getNodeGroupMemberUpdateStatus() {
        return nodeGroupMemberUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     *
     * @param nodeGroupMemberUpdateStatus <p>
     *            The status of the service update on the node group member
     *            </p>
     */
    public void setNodeGroupMemberUpdateStatus(
            java.util.Collection<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus) {
        if (nodeGroupMemberUpdateStatus == null) {
            this.nodeGroupMemberUpdateStatus = null;
            return;
        }

        this.nodeGroupMemberUpdateStatus = new java.util.ArrayList<NodeGroupMemberUpdateStatus>(
                nodeGroupMemberUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupMemberUpdateStatus <p>
     *            The status of the service update on the node group member
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupUpdateStatus withNodeGroupMemberUpdateStatus(
            NodeGroupMemberUpdateStatus... nodeGroupMemberUpdateStatus) {
        if (getNodeGroupMemberUpdateStatus() == null) {
            this.nodeGroupMemberUpdateStatus = new java.util.ArrayList<NodeGroupMemberUpdateStatus>(
                    nodeGroupMemberUpdateStatus.length);
        }
        for (NodeGroupMemberUpdateStatus value : nodeGroupMemberUpdateStatus) {
            this.nodeGroupMemberUpdateStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupMemberUpdateStatus <p>
     *            The status of the service update on the node group member
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeGroupUpdateStatus withNodeGroupMemberUpdateStatus(
            java.util.Collection<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus) {
        setNodeGroupMemberUpdateStatus(nodeGroupMemberUpdateStatus);
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
        if (getNodeGroupMemberUpdateStatus() != null)
            sb.append("NodeGroupMemberUpdateStatus: " + getNodeGroupMemberUpdateStatus());
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
                + ((getNodeGroupMemberUpdateStatus() == null) ? 0
                        : getNodeGroupMemberUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupUpdateStatus == false)
            return false;
        NodeGroupUpdateStatus other = (NodeGroupUpdateStatus) obj;

        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getNodeGroupMemberUpdateStatus() == null
                ^ this.getNodeGroupMemberUpdateStatus() == null)
            return false;
        if (other.getNodeGroupMemberUpdateStatus() != null
                && other.getNodeGroupMemberUpdateStatus().equals(
                        this.getNodeGroupMemberUpdateStatus()) == false)
            return false;
        return true;
    }
}
