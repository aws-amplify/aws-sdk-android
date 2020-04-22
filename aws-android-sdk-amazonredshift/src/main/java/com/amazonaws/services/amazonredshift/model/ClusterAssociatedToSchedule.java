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
 * <p/>
 */
public class ClusterAssociatedToSchedule implements Serializable {
    /**
     * <p/>
     */
    private String clusterIdentifier;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     */
    private String scheduleAssociationState;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p/>
     *
     * @param clusterIdentifier <p/>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterAssociatedToSchedule withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @return <p/>
     * @see ScheduleState
     */
    public String getScheduleAssociationState() {
        return scheduleAssociationState;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param scheduleAssociationState <p/>
     * @see ScheduleState
     */
    public void setScheduleAssociationState(String scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param scheduleAssociationState <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public ClusterAssociatedToSchedule withScheduleAssociationState(String scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param scheduleAssociationState <p/>
     * @see ScheduleState
     */
    public void setScheduleAssociationState(ScheduleState scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param scheduleAssociationState <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public ClusterAssociatedToSchedule withScheduleAssociationState(
            ScheduleState scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState.toString();
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getScheduleAssociationState() != null)
            sb.append("ScheduleAssociationState: " + getScheduleAssociationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduleAssociationState() == null) ? 0 : getScheduleAssociationState()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterAssociatedToSchedule == false)
            return false;
        ClusterAssociatedToSchedule other = (ClusterAssociatedToSchedule) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getScheduleAssociationState() == null
                ^ this.getScheduleAssociationState() == null)
            return false;
        if (other.getScheduleAssociationState() != null
                && other.getScheduleAssociationState().equals(this.getScheduleAssociationState()) == false)
            return false;
        return true;
    }
}
