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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a snapshot schedule for a cluster.
 * </p>
 */
public class ModifyClusterSnapshotScheduleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to
     * modify.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to
     * associate with the cluster.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the
     * cluster and the schedule.
     * </p>
     */
    private Boolean disassociateSchedule;

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to
     * modify.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the cluster whose snapshot schedule you
     *         want to modify.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to
     * modify.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for the cluster whose snapshot schedule
     *            you want to modify.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to
     * modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for the cluster whose snapshot schedule
     *            you want to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotScheduleRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to
     * associate with the cluster.
     * </p>
     *
     * @return <p>
     *         A unique alphanumeric identifier for the schedule that you want
     *         to associate with the cluster.
     *         </p>
     */
    public String getScheduleIdentifier() {
        return scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to
     * associate with the cluster.
     * </p>
     *
     * @param scheduleIdentifier <p>
     *            A unique alphanumeric identifier for the schedule that you
     *            want to associate with the cluster.
     *            </p>
     */
    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to
     * associate with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleIdentifier <p>
     *            A unique alphanumeric identifier for the schedule that you
     *            want to associate with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the
     * cluster and the schedule.
     * </p>
     *
     * @return <p>
     *         A boolean to indicate whether to remove the assoiciation between
     *         the cluster and the schedule.
     *         </p>
     */
    public Boolean isDisassociateSchedule() {
        return disassociateSchedule;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the
     * cluster and the schedule.
     * </p>
     *
     * @return <p>
     *         A boolean to indicate whether to remove the assoiciation between
     *         the cluster and the schedule.
     *         </p>
     */
    public Boolean getDisassociateSchedule() {
        return disassociateSchedule;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the
     * cluster and the schedule.
     * </p>
     *
     * @param disassociateSchedule <p>
     *            A boolean to indicate whether to remove the assoiciation
     *            between the cluster and the schedule.
     *            </p>
     */
    public void setDisassociateSchedule(Boolean disassociateSchedule) {
        this.disassociateSchedule = disassociateSchedule;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the
     * cluster and the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociateSchedule <p>
     *            A boolean to indicate whether to remove the assoiciation
     *            between the cluster and the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotScheduleRequest withDisassociateSchedule(
            Boolean disassociateSchedule) {
        this.disassociateSchedule = disassociateSchedule;
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
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: " + getScheduleIdentifier() + ",");
        if (getDisassociateSchedule() != null)
            sb.append("DisassociateSchedule: " + getDisassociateSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDisassociateSchedule() == null) ? 0 : getDisassociateSchedule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterSnapshotScheduleRequest == false)
            return false;
        ModifyClusterSnapshotScheduleRequest other = (ModifyClusterSnapshotScheduleRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null
                && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getDisassociateSchedule() == null ^ this.getDisassociateSchedule() == null)
            return false;
        if (other.getDisassociateSchedule() != null
                && other.getDisassociateSchedule().equals(this.getDisassociateSchedule()) == false)
            return false;
        return true;
    }
}
