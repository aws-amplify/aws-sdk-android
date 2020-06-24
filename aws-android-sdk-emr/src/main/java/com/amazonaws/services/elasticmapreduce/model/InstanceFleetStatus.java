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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The status of the instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceFleetStatus implements Serializable {
    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     */
    private String state;

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     */
    private InstanceFleetStateChangeReason stateChangeReason;

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time
     * of creation, the time it became ready to run jobs, and the time of
     * termination.
     * </p>
     */
    private InstanceFleetTimeline timeline;

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     *
     * @return <p>
     *         A code representing the instance fleet status.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     *         resources and is not yet ready to run jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOOTSTRAPPING</code>—EC2 instances and other resources have
     *         been provisioned and the bootstrap actions specified for the
     *         instances are underway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>—EC2 instances and other resources are
     *         running. They are either executing jobs or waiting to execute
     *         jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESIZING</code>—A resize operation is underway. EC2
     *         instances are either being added or removed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPENDED</code>—A resize operation could not complete.
     *         Existing EC2 instances are running, but instances can't be added
     *         or removed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATING</code>—The instance fleet is terminating EC2
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATED</code>—The instance fleet is no longer active,
     *         and all EC2 instances have been terminated.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceFleetState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     *
     * @param state <p>
     *            A code representing the instance fleet status.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>—The instance fleet is provisioning
     *            EC2 resources and is not yet ready to run jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BOOTSTRAPPING</code>—EC2 instances and other resources
     *            have been provisioned and the bootstrap actions specified for
     *            the instances are underway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>—EC2 instances and other resources are
     *            running. They are either executing jobs or waiting to execute
     *            jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESIZING</code>—A resize operation is underway. EC2
     *            instances are either being added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUSPENDED</code>—A resize operation could not complete.
     *            Existing EC2 instances are running, but instances can't be
     *            added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATING</code>—The instance fleet is terminating EC2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATED</code>—The instance fleet is no longer
     *            active, and all EC2 instances have been terminated.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceFleetState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     *
     * @param state <p>
     *            A code representing the instance fleet status.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>—The instance fleet is provisioning
     *            EC2 resources and is not yet ready to run jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BOOTSTRAPPING</code>—EC2 instances and other resources
     *            have been provisioned and the bootstrap actions specified for
     *            the instances are underway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>—EC2 instances and other resources are
     *            running. They are either executing jobs or waiting to execute
     *            jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESIZING</code>—A resize operation is underway. EC2
     *            instances are either being added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUSPENDED</code>—A resize operation could not complete.
     *            Existing EC2 instances are running, but instances can't be
     *            added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATING</code>—The instance fleet is terminating EC2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATED</code>—The instance fleet is no longer
     *            active, and all EC2 instances have been terminated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetState
     */
    public InstanceFleetStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     *
     * @param state <p>
     *            A code representing the instance fleet status.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>—The instance fleet is provisioning
     *            EC2 resources and is not yet ready to run jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BOOTSTRAPPING</code>—EC2 instances and other resources
     *            have been provisioned and the bootstrap actions specified for
     *            the instances are underway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>—EC2 instances and other resources are
     *            running. They are either executing jobs or waiting to execute
     *            jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESIZING</code>—A resize operation is underway. EC2
     *            instances are either being added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUSPENDED</code>—A resize operation could not complete.
     *            Existing EC2 instances are running, but instances can't be
     *            added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATING</code>—The instance fleet is terminating EC2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATED</code>—The instance fleet is no longer
     *            active, and all EC2 instances have been terminated.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceFleetState
     */
    public void setState(InstanceFleetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2
     * resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been
     * provisioned and the bootstrap actions specified for the instances are
     * underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They
     * are either executing jobs or waiting to execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are
     * either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing
     * EC2 instances are running, but instances can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all
     * EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING,
     * SUSPENDED, TERMINATING, TERMINATED
     *
     * @param state <p>
     *            A code representing the instance fleet status.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>—The instance fleet is provisioning
     *            EC2 resources and is not yet ready to run jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BOOTSTRAPPING</code>—EC2 instances and other resources
     *            have been provisioned and the bootstrap actions specified for
     *            the instances are underway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>—EC2 instances and other resources are
     *            running. They are either executing jobs or waiting to execute
     *            jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESIZING</code>—A resize operation is underway. EC2
     *            instances are either being added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUSPENDED</code>—A resize operation could not complete.
     *            Existing EC2 instances are running, but instances can't be
     *            added or removed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATING</code>—The instance fleet is terminating EC2
     *            instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATED</code>—The instance fleet is no longer
     *            active, and all EC2 instances have been terminated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetState
     */
    public InstanceFleetStatus withState(InstanceFleetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     *
     * @return <p>
     *         Provides status change reason details for the instance fleet.
     *         </p>
     */
    public InstanceFleetStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     *
     * @param stateChangeReason <p>
     *            Provides status change reason details for the instance fleet.
     *            </p>
     */
    public void setStateChangeReason(InstanceFleetStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeReason <p>
     *            Provides status change reason details for the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetStatus withStateChangeReason(
            InstanceFleetStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time
     * of creation, the time it became ready to run jobs, and the time of
     * termination.
     * </p>
     *
     * @return <p>
     *         Provides historical timestamps for the instance fleet, including
     *         the time of creation, the time it became ready to run jobs, and
     *         the time of termination.
     *         </p>
     */
    public InstanceFleetTimeline getTimeline() {
        return timeline;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time
     * of creation, the time it became ready to run jobs, and the time of
     * termination.
     * </p>
     *
     * @param timeline <p>
     *            Provides historical timestamps for the instance fleet,
     *            including the time of creation, the time it became ready to
     *            run jobs, and the time of termination.
     *            </p>
     */
    public void setTimeline(InstanceFleetTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time
     * of creation, the time it became ready to run jobs, and the time of
     * termination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeline <p>
     *            Provides historical timestamps for the instance fleet,
     *            including the time of creation, the time it became ready to
     *            run jobs, and the time of termination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetStatus withTimeline(InstanceFleetTimeline timeline) {
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

        if (obj instanceof InstanceFleetStatus == false)
            return false;
        InstanceFleetStatus other = (InstanceFleetStatus) obj;

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
