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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The detailed status of the cluster.
 * </p>
 */
public class ClusterStatus implements Serializable {
    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     */
    private String state;

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     */
    private ClusterStateChangeReason stateChangeReason;

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of
     * the cluster.
     * </p>
     */
    private ClusterTimeline timeline;

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     *
     * @return <p>
     *         The current state of the cluster.
     *         </p>
     * @see ClusterState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     *
     * @param state <p>
     *            The current state of the cluster.
     *            </p>
     * @see ClusterState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     *
     * @param state <p>
     *            The current state of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     *
     * @param state <p>
     *            The current state of the cluster.
     *            </p>
     * @see ClusterState
     */
    public void setState(ClusterState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS
     *
     * @param state <p>
     *            The current state of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterStatus withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     *
     * @return <p>
     *         The reason for the cluster status change.
     *         </p>
     */
    public ClusterStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     *
     * @param stateChangeReason <p>
     *            The reason for the cluster status change.
     *            </p>
     */
    public void setStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeReason <p>
     *            The reason for the cluster status change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterStatus withStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of
     * the cluster.
     * </p>
     *
     * @return <p>
     *         A timeline that represents the status of a cluster over the
     *         lifetime of the cluster.
     *         </p>
     */
    public ClusterTimeline getTimeline() {
        return timeline;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of
     * the cluster.
     * </p>
     *
     * @param timeline <p>
     *            A timeline that represents the status of a cluster over the
     *            lifetime of the cluster.
     *            </p>
     */
    public void setTimeline(ClusterTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of
     * the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeline <p>
     *            A timeline that represents the status of a cluster over the
     *            lifetime of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterStatus withTimeline(ClusterTimeline timeline) {
        this.timeline = timeline;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: " + getStateChangeReason() + ",");
        if (getTimeline() != null)
            sb.append("Timeline: " + getTimeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterStatus == false)
            return false;
        ClusterStatus other = (ClusterStatus) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null
                && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        return true;
    }
}
