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
 * Modifies the settings for a snapshot.
 * </p>
 * <p>
 * This exanmple modifies the manual retention period setting for a cluster
 * snapshot.
 * </p>
 */
public class ModifyClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can
     * specify the force option to immediately delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has
     * already passed.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot whose setting you want to modify.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot whose setting you want to
     *            modify.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot whose setting you want to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can
     * specify the force option to immediately delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @return <p>
     *         The number of days that a manual snapshot is retained. If the
     *         value is -1, the manual snapshot is retained indefinitely.
     *         </p>
     *         <p>
     *         If the manual snapshot falls outside of the new retention period,
     *         you can specify the force option to immediately delete the
     *         snapshot.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     */
    public Integer getManualSnapshotRetentionPeriod() {
        return manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can
     * specify the force option to immediately delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            If the manual snapshot falls outside of the new retention
     *            period, you can specify the force option to immediately delete
     *            the snapshot.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     */
    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can
     * specify the force option to immediately delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            If the manual snapshot falls outside of the new retention
     *            period, you can specify the force option to immediately delete
     *            the snapshot.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotRequest withManualSnapshotRetentionPeriod(
            Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has
     * already passed.
     * </p>
     *
     * @return <p>
     *         A Boolean option to override an exception if the retention period
     *         has already passed.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has
     * already passed.
     * </p>
     *
     * @return <p>
     *         A Boolean option to override an exception if the retention period
     *         has already passed.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has
     * already passed.
     * </p>
     *
     * @param force <p>
     *            A Boolean option to override an exception if the retention
     *            period has already passed.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has
     * already passed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            A Boolean option to override an exception if the retention
     *            period has already passed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSnapshotRequest withForce(Boolean force) {
        this.force = force;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRetentionPeriod() == null) ? 0
                        : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterSnapshotRequest == false)
            return false;
        ModifyClusterSnapshotRequest other = (ModifyClusterSnapshotRequest) obj;

        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null
                ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(
                        this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
