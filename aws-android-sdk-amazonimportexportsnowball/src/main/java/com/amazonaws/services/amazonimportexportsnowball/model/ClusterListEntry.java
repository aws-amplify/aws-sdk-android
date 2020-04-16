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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a cluster's state, a cluster's ID, and other important information.
 * </p>
 */
public class ClusterListEntry implements Serializable {
    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String clusterId;

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     */
    private String clusterState;

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Defines an optional description of the cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The 39-character ID for the cluster that you want to list, for
     *         example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster that you want to list, for
     *            example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster that you want to list, for
     *            example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterListEntry withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @return <p>
     *         The current state of this cluster. For information about the
     *         state of a specific node, see <a>JobListEntry$JobState</a>.
     *         </p>
     * @see ClusterState
     */
    public String getClusterState() {
        return clusterState;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current state of this cluster. For information about the
     *            state of a specific node, see <a>JobListEntry$JobState</a>.
     *            </p>
     * @see ClusterState
     */
    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current state of this cluster. For information about the
     *            state of a specific node, see <a>JobListEntry$JobState</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterListEntry withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current state of this cluster. For information about the
     *            state of a specific node, see <a>JobListEntry$JobState</a>.
     *            </p>
     * @see ClusterState
     */
    public void setClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
    }

    /**
     * <p>
     * The current state of this cluster. For information about the state of a
     * specific node, see <a>JobListEntry$JobState</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current state of this cluster. For information about the
     *            state of a specific node, see <a>JobListEntry$JobState</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterListEntry withClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     *
     * @return <p>
     *         The creation date for this cluster.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date for this cluster.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterListEntry withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Defines an optional description of the cluster, for example
     *         <code>Environmental Data Cluster-01</code>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            Defines an optional description of the cluster, for example
     *            <code>Environmental Data Cluster-01</code>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Defines an optional description of the cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            Defines an optional description of the cluster, for example
     *            <code>Environmental Data Cluster-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterListEntry withDescription(String description) {
        this.description = description;
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getClusterState() != null)
            sb.append("ClusterState: " + getClusterState() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getClusterState() == null) ? 0 : getClusterState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterListEntry == false)
            return false;
        ClusterListEntry other = (ClusterListEntry) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getClusterState() == null ^ this.getClusterState() == null)
            return false;
        if (other.getClusterState() != null
                && other.getClusterState().equals(this.getClusterState()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
