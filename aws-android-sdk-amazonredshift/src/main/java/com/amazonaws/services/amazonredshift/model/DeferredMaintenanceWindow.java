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
 * Describes a deferred maintenance window
 * </p>
 */
public class DeferredMaintenanceWindow implements Serializable {
    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     */
    private String deferMaintenanceIdentifier;

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer
     * maintenance.
     * </p>
     */
    private java.util.Date deferMaintenanceStartTime;

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     */
    private java.util.Date deferMaintenanceEndTime;

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the maintenance window.
     *         </p>
     */
    public String getDeferMaintenanceIdentifier() {
        return deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     *
     * @param deferMaintenanceIdentifier <p>
     *            A unique identifier for the maintenance window.
     *            </p>
     */
    public void setDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceIdentifier <p>
     *            A unique identifier for the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeferredMaintenanceWindow withDeferMaintenanceIdentifier(
            String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer
     * maintenance.
     * </p>
     *
     * @return <p>
     *         A timestamp for the beginning of the time period when we defer
     *         maintenance.
     *         </p>
     */
    public java.util.Date getDeferMaintenanceStartTime() {
        return deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer
     * maintenance.
     * </p>
     *
     * @param deferMaintenanceStartTime <p>
     *            A timestamp for the beginning of the time period when we defer
     *            maintenance.
     *            </p>
     */
    public void setDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer
     * maintenance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceStartTime <p>
     *            A timestamp for the beginning of the time period when we defer
     *            maintenance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeferredMaintenanceWindow withDeferMaintenanceStartTime(
            java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     *
     * @return <p>
     *         A timestamp for the end of the time period when we defer
     *         maintenance.
     *         </p>
     */
    public java.util.Date getDeferMaintenanceEndTime() {
        return deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     *
     * @param deferMaintenanceEndTime <p>
     *            A timestamp for the end of the time period when we defer
     *            maintenance.
     *            </p>
     */
    public void setDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferMaintenanceEndTime <p>
     *            A timestamp for the end of the time period when we defer
     *            maintenance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeferredMaintenanceWindow withDeferMaintenanceEndTime(
            java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
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
        if (getDeferMaintenanceIdentifier() != null)
            sb.append("DeferMaintenanceIdentifier: " + getDeferMaintenanceIdentifier() + ",");
        if (getDeferMaintenanceStartTime() != null)
            sb.append("DeferMaintenanceStartTime: " + getDeferMaintenanceStartTime() + ",");
        if (getDeferMaintenanceEndTime() != null)
            sb.append("DeferMaintenanceEndTime: " + getDeferMaintenanceEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeferredMaintenanceWindow == false)
            return false;
        DeferredMaintenanceWindow other = (DeferredMaintenanceWindow) obj;

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
        return true;
    }
}
