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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class DeleteClusterResult implements Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     */
    private String state;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterResult withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @return <p>
     *         The state of the cluster. The possible states are CREATING,
     *         ACTIVE, and FAILED.
     *         </p> @see ClusterState
     */
    public String getState() {
        return state;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @see ClusterState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public DeleteClusterResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @see ClusterState
     */
    public void setState(ClusterState state) {
        this.state = state.toString();
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public DeleteClusterResult withState(ClusterState state) {
        this.state = state.toString();
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterResult == false)
            return false;
        DeleteClusterResult other = (DeleteClusterResult) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
