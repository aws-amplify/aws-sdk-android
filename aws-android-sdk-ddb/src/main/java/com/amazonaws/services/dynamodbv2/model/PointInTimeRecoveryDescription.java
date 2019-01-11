/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * The description of the point in time settings applied to the table.
 * </p>
 */
public class PointInTimeRecoveryDescription implements Serializable {
    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String pointInTimeRecoveryStatus;

    /**
     * <p>
     * Specifies the earliest point in time you can restore your table to. It
     * You can restore your table to any point in time during the last 35 days.
     * </p>
     */
    private java.util.Date earliestRestorableDateTime;

    /**
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     */
    private java.util.Date latestRestorableDateTime;

    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The current state of point in time recovery:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLING</code> - Point in time recovery is being enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Point in time recovery is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - Point in time recovery is disabled.
     *         </p>
     *         </li>
     *         </ul>
     * @see PointInTimeRecoveryStatus
     */
    public String getPointInTimeRecoveryStatus() {
        return pointInTimeRecoveryStatus;
    }

    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param pointInTimeRecoveryStatus <p>
     *            The current state of point in time recovery:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Point in time recovery is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Point in time recovery is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Point in time recovery is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see PointInTimeRecoveryStatus
     */
    public void setPointInTimeRecoveryStatus(String pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus;
    }

    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param pointInTimeRecoveryStatus <p>
     *            The current state of point in time recovery:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Point in time recovery is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Point in time recovery is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Point in time recovery is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PointInTimeRecoveryStatus
     */
    public PointInTimeRecoveryDescription withPointInTimeRecoveryStatus(
            String pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus;
        return this;
    }

    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param pointInTimeRecoveryStatus <p>
     *            The current state of point in time recovery:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Point in time recovery is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Point in time recovery is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Point in time recovery is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see PointInTimeRecoveryStatus
     */
    public void setPointInTimeRecoveryStatus(PointInTimeRecoveryStatus pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus.toString();
    }

    /**
     * <p>
     * The current state of point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Point in time recovery is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Point in time recovery is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Point in time recovery is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param pointInTimeRecoveryStatus <p>
     *            The current state of point in time recovery:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Point in time recovery is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Point in time recovery is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Point in time recovery is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PointInTimeRecoveryStatus
     */
    public PointInTimeRecoveryDescription withPointInTimeRecoveryStatus(
            PointInTimeRecoveryStatus pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the earliest point in time you can restore your table to. It
     * You can restore your table to any point in time during the last 35 days.
     * </p>
     *
     * @return <p>
     *         Specifies the earliest point in time you can restore your table
     *         to. It You can restore your table to any point in time during the
     *         last 35 days.
     *         </p>
     */
    public java.util.Date getEarliestRestorableDateTime() {
        return earliestRestorableDateTime;
    }

    /**
     * <p>
     * Specifies the earliest point in time you can restore your table to. It
     * You can restore your table to any point in time during the last 35 days.
     * </p>
     *
     * @param earliestRestorableDateTime <p>
     *            Specifies the earliest point in time you can restore your
     *            table to. It You can restore your table to any point in time
     *            during the last 35 days.
     *            </p>
     */
    public void setEarliestRestorableDateTime(java.util.Date earliestRestorableDateTime) {
        this.earliestRestorableDateTime = earliestRestorableDateTime;
    }

    /**
     * <p>
     * Specifies the earliest point in time you can restore your table to. It
     * You can restore your table to any point in time during the last 35 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param earliestRestorableDateTime <p>
     *            Specifies the earliest point in time you can restore your
     *            table to. It You can restore your table to any point in time
     *            during the last 35 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PointInTimeRecoveryDescription withEarliestRestorableDateTime(
            java.util.Date earliestRestorableDateTime) {
        this.earliestRestorableDateTime = earliestRestorableDateTime;
        return this;
    }

    /**
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @return <p>
     *         <code>LatestRestorableDateTime</code> is typically 5 minutes
     *         before the current time.
     *         </p>
     */
    public java.util.Date getLatestRestorableDateTime() {
        return latestRestorableDateTime;
    }

    /**
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @param latestRestorableDateTime <p>
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     */
    public void setLatestRestorableDateTime(java.util.Date latestRestorableDateTime) {
        this.latestRestorableDateTime = latestRestorableDateTime;
    }

    /**
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestRestorableDateTime <p>
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PointInTimeRecoveryDescription withLatestRestorableDateTime(
            java.util.Date latestRestorableDateTime) {
        this.latestRestorableDateTime = latestRestorableDateTime;
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
        if (getPointInTimeRecoveryStatus() != null)
            sb.append("PointInTimeRecoveryStatus: " + getPointInTimeRecoveryStatus() + ",");
        if (getEarliestRestorableDateTime() != null)
            sb.append("EarliestRestorableDateTime: " + getEarliestRestorableDateTime() + ",");
        if (getLatestRestorableDateTime() != null)
            sb.append("LatestRestorableDateTime: " + getLatestRestorableDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPointInTimeRecoveryStatus() == null) ? 0 : getPointInTimeRecoveryStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEarliestRestorableDateTime() == null) ? 0 : getEarliestRestorableDateTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestRestorableDateTime() == null) ? 0 : getLatestRestorableDateTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PointInTimeRecoveryDescription == false)
            return false;
        PointInTimeRecoveryDescription other = (PointInTimeRecoveryDescription) obj;

        if (other.getPointInTimeRecoveryStatus() == null
                ^ this.getPointInTimeRecoveryStatus() == null)
            return false;
        if (other.getPointInTimeRecoveryStatus() != null
                && other.getPointInTimeRecoveryStatus().equals(this.getPointInTimeRecoveryStatus()) == false)
            return false;
        if (other.getEarliestRestorableDateTime() == null
                ^ this.getEarliestRestorableDateTime() == null)
            return false;
        if (other.getEarliestRestorableDateTime() != null
                && other.getEarliestRestorableDateTime().equals(
                        this.getEarliestRestorableDateTime()) == false)
            return false;
        if (other.getLatestRestorableDateTime() == null
                ^ this.getLatestRestorableDateTime() == null)
            return false;
        if (other.getLatestRestorableDateTime() != null
                && other.getLatestRestorableDateTime().equals(this.getLatestRestorableDateTime()) == false)
            return false;
        return true;
    }
}
