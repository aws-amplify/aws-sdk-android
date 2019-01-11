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
 * Represents the continuous backups and point in time recovery settings on the
 * table.
 * </p>
 */
public class ContinuousBackupsDescription implements Serializable {
    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String continuousBackupsStatus;

    /**
     * <p>
     * The description of the point in time recovery settings applied to the
     * table.
     * </p>
     */
    private PointInTimeRecoveryDescription pointInTimeRecoveryDescription;

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         <code>ContinuousBackupsStatus</code> can be one of the following
     *         states: ENABLED, DISABLED
     *         </p>
     * @see ContinuousBackupsStatus
     */
    public String getContinuousBackupsStatus() {
        return continuousBackupsStatus;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param continuousBackupsStatus <p>
     *            <code>ContinuousBackupsStatus</code> can be one of the
     *            following states: ENABLED, DISABLED
     *            </p>
     * @see ContinuousBackupsStatus
     */
    public void setContinuousBackupsStatus(String continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param continuousBackupsStatus <p>
     *            <code>ContinuousBackupsStatus</code> can be one of the
     *            following states: ENABLED, DISABLED
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContinuousBackupsStatus
     */
    public ContinuousBackupsDescription withContinuousBackupsStatus(String continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus;
        return this;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param continuousBackupsStatus <p>
     *            <code>ContinuousBackupsStatus</code> can be one of the
     *            following states: ENABLED, DISABLED
     *            </p>
     * @see ContinuousBackupsStatus
     */
    public void setContinuousBackupsStatus(ContinuousBackupsStatus continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus.toString();
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states:
     * ENABLED, DISABLED
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param continuousBackupsStatus <p>
     *            <code>ContinuousBackupsStatus</code> can be one of the
     *            following states: ENABLED, DISABLED
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContinuousBackupsStatus
     */
    public ContinuousBackupsDescription withContinuousBackupsStatus(
            ContinuousBackupsStatus continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the
     * table.
     * </p>
     *
     * @return <p>
     *         The description of the point in time recovery settings applied to
     *         the table.
     *         </p>
     */
    public PointInTimeRecoveryDescription getPointInTimeRecoveryDescription() {
        return pointInTimeRecoveryDescription;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the
     * table.
     * </p>
     *
     * @param pointInTimeRecoveryDescription <p>
     *            The description of the point in time recovery settings applied
     *            to the table.
     *            </p>
     */
    public void setPointInTimeRecoveryDescription(
            PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        this.pointInTimeRecoveryDescription = pointInTimeRecoveryDescription;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the
     * table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pointInTimeRecoveryDescription <p>
     *            The description of the point in time recovery settings applied
     *            to the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinuousBackupsDescription withPointInTimeRecoveryDescription(
            PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        this.pointInTimeRecoveryDescription = pointInTimeRecoveryDescription;
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
        if (getContinuousBackupsStatus() != null)
            sb.append("ContinuousBackupsStatus: " + getContinuousBackupsStatus() + ",");
        if (getPointInTimeRecoveryDescription() != null)
            sb.append("PointInTimeRecoveryDescription: " + getPointInTimeRecoveryDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContinuousBackupsStatus() == null) ? 0 : getContinuousBackupsStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPointInTimeRecoveryDescription() == null) ? 0
                        : getPointInTimeRecoveryDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousBackupsDescription == false)
            return false;
        ContinuousBackupsDescription other = (ContinuousBackupsDescription) obj;

        if (other.getContinuousBackupsStatus() == null ^ this.getContinuousBackupsStatus() == null)
            return false;
        if (other.getContinuousBackupsStatus() != null
                && other.getContinuousBackupsStatus().equals(this.getContinuousBackupsStatus()) == false)
            return false;
        if (other.getPointInTimeRecoveryDescription() == null
                ^ this.getPointInTimeRecoveryDescription() == null)
            return false;
        if (other.getPointInTimeRecoveryDescription() != null
                && other.getPointInTimeRecoveryDescription().equals(
                        this.getPointInTimeRecoveryDescription()) == false)
            return false;
        return true;
    }
}
