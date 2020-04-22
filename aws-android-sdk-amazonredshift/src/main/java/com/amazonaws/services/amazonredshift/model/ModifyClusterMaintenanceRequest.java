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
 * Modifies the maintenance settings of a cluster.
 * </p>
 */
public class ModifyClusterMaintenanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     */
    private Boolean deferMaintenance;

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     */
    private String deferMaintenanceIdentifier;

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance
     * window.
     * </p>
     */
    private java.util.Date deferMaintenanceStartTime;

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If
     * you specify an end time, you can't specify a duration.
     * </p>
     */
    private java.util.Date deferMaintenanceEndTime;

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If
     * you specify a duration, you can't specify an end time. The duration must
     * be 45 days or less.
     * </p>
     */
    private Integer deferMaintenanceDuration;

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the cluster.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for the cluster.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     *
     * @return <p>
     *         A boolean indicating whether to enable the deferred maintenance
     *         window.
     *         </p>
     */
    public Boolean isDeferMaintenance() {
        return deferMaintenance;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     *
     * @return <p>
     *         A boolean indicating whether to enable the deferred maintenance
     *         window.
     *         </p>
     */
    public Boolean getDeferMaintenance() {
        return deferMaintenance;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     *
     * @param deferMaintenance <p>
     *            A boolean indicating whether to enable the deferred
     *            maintenance window.
     *            </p>
     */
    public void setDeferMaintenance(Boolean deferMaintenance) {
        this.deferMaintenance = deferMaintenance;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenance <p>
     *            A boolean indicating whether to enable the deferred
     *            maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withDeferMaintenance(Boolean deferMaintenance) {
        this.deferMaintenance = deferMaintenance;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the deferred maintenance window.
     *         </p>
     */
    public String getDeferMaintenanceIdentifier() {
        return deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     *
     * @param deferMaintenanceIdentifier <p>
     *            A unique identifier for the deferred maintenance window.
     *            </p>
     */
    public void setDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceIdentifier <p>
     *            A unique identifier for the deferred maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withDeferMaintenanceIdentifier(
            String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance
     * window.
     * </p>
     *
     * @return <p>
     *         A timestamp indicating the start time for the deferred
     *         maintenance window.
     *         </p>
     */
    public java.util.Date getDeferMaintenanceStartTime() {
        return deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance
     * window.
     * </p>
     *
     * @param deferMaintenanceStartTime <p>
     *            A timestamp indicating the start time for the deferred
     *            maintenance window.
     *            </p>
     */
    public void setDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance
     * window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceStartTime <p>
     *            A timestamp indicating the start time for the deferred
     *            maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withDeferMaintenanceStartTime(
            java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If
     * you specify an end time, you can't specify a duration.
     * </p>
     *
     * @return <p>
     *         A timestamp indicating end time for the deferred maintenance
     *         window. If you specify an end time, you can't specify a duration.
     *         </p>
     */
    public java.util.Date getDeferMaintenanceEndTime() {
        return deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If
     * you specify an end time, you can't specify a duration.
     * </p>
     *
     * @param deferMaintenanceEndTime <p>
     *            A timestamp indicating end time for the deferred maintenance
     *            window. If you specify an end time, you can't specify a
     *            duration.
     *            </p>
     */
    public void setDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If
     * you specify an end time, you can't specify a duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceEndTime <p>
     *            A timestamp indicating end time for the deferred maintenance
     *            window. If you specify an end time, you can't specify a
     *            duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withDeferMaintenanceEndTime(
            java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
        return this;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If
     * you specify a duration, you can't specify an end time. The duration must
     * be 45 days or less.
     * </p>
     *
     * @return <p>
     *         An integer indicating the duration of the maintenance window in
     *         days. If you specify a duration, you can't specify an end time.
     *         The duration must be 45 days or less.
     *         </p>
     */
    public Integer getDeferMaintenanceDuration() {
        return deferMaintenanceDuration;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If
     * you specify a duration, you can't specify an end time. The duration must
     * be 45 days or less.
     * </p>
     *
     * @param deferMaintenanceDuration <p>
     *            An integer indicating the duration of the maintenance window
     *            in days. If you specify a duration, you can't specify an end
     *            time. The duration must be 45 days or less.
     *            </p>
     */
    public void setDeferMaintenanceDuration(Integer deferMaintenanceDuration) {
        this.deferMaintenanceDuration = deferMaintenanceDuration;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If
     * you specify a duration, you can't specify an end time. The duration must
     * be 45 days or less.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceDuration <p>
     *            An integer indicating the duration of the maintenance window
     *            in days. If you specify a duration, you can't specify an end
     *            time. The duration must be 45 days or less.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterMaintenanceRequest withDeferMaintenanceDuration(
            Integer deferMaintenanceDuration) {
        this.deferMaintenanceDuration = deferMaintenanceDuration;
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
        if (getDeferMaintenance() != null)
            sb.append("DeferMaintenance: " + getDeferMaintenance() + ",");
        if (getDeferMaintenanceIdentifier() != null)
            sb.append("DeferMaintenanceIdentifier: " + getDeferMaintenanceIdentifier() + ",");
        if (getDeferMaintenanceStartTime() != null)
            sb.append("DeferMaintenanceStartTime: " + getDeferMaintenanceStartTime() + ",");
        if (getDeferMaintenanceEndTime() != null)
            sb.append("DeferMaintenanceEndTime: " + getDeferMaintenanceEndTime() + ",");
        if (getDeferMaintenanceDuration() != null)
            sb.append("DeferMaintenanceDuration: " + getDeferMaintenanceDuration());
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
                + ((getDeferMaintenance() == null) ? 0 : getDeferMaintenance().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeferMaintenanceIdentifier() == null) ? 0 : getDeferMaintenanceIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeferMaintenanceStartTime() == null) ? 0 : getDeferMaintenanceStartTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeferMaintenanceEndTime() == null) ? 0 : getDeferMaintenanceEndTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeferMaintenanceDuration() == null) ? 0 : getDeferMaintenanceDuration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterMaintenanceRequest == false)
            return false;
        ModifyClusterMaintenanceRequest other = (ModifyClusterMaintenanceRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDeferMaintenance() == null ^ this.getDeferMaintenance() == null)
            return false;
        if (other.getDeferMaintenance() != null
                && other.getDeferMaintenance().equals(this.getDeferMaintenance()) == false)
            return false;
        if (other.getDeferMaintenanceIdentifier() == null
                ^ this.getDeferMaintenanceIdentifier() == null)
            return false;
        if (other.getDeferMaintenanceIdentifier() != null
                && other.getDeferMaintenanceIdentifier().equals(
                        this.getDeferMaintenanceIdentifier()) == false)
            return false;
        if (other.getDeferMaintenanceStartTime() == null
                ^ this.getDeferMaintenanceStartTime() == null)
            return false;
        if (other.getDeferMaintenanceStartTime() != null
                && other.getDeferMaintenanceStartTime().equals(this.getDeferMaintenanceStartTime()) == false)
            return false;
        if (other.getDeferMaintenanceEndTime() == null ^ this.getDeferMaintenanceEndTime() == null)
            return false;
        if (other.getDeferMaintenanceEndTime() != null
                && other.getDeferMaintenanceEndTime().equals(this.getDeferMaintenanceEndTime()) == false)
            return false;
        if (other.getDeferMaintenanceDuration() == null
                ^ this.getDeferMaintenanceDuration() == null)
            return false;
        if (other.getDeferMaintenanceDuration() != null
                && other.getDeferMaintenanceDuration().equals(this.getDeferMaintenanceDuration()) == false)
            return false;
        return true;
    }
}
