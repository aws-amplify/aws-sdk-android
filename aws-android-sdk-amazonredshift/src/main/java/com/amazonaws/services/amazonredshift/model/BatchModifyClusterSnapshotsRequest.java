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
 * Modifies the settings for a set of cluster snapshots.
 * </p>
 */
public class BatchModifyClusterSnapshotsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     */
    private java.util.List<String> snapshotIdentifierList;

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the
     * value -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current
     * value, existing manual snapshots that fall outside of the new retention
     * period will return an error. If you want to suppress the errors and
     * delete the snapshots, use the force option.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the
     * retention period has passed.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     *
     * @return <p>
     *         A list of snapshot identifiers you want to modify.
     *         </p>
     */
    public java.util.List<String> getSnapshotIdentifierList() {
        return snapshotIdentifierList;
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     *
     * @param snapshotIdentifierList <p>
     *            A list of snapshot identifiers you want to modify.
     *            </p>
     */
    public void setSnapshotIdentifierList(java.util.Collection<String> snapshotIdentifierList) {
        if (snapshotIdentifierList == null) {
            this.snapshotIdentifierList = null;
            return;
        }

        this.snapshotIdentifierList = new java.util.ArrayList<String>(snapshotIdentifierList);
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifierList <p>
     *            A list of snapshot identifiers you want to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsRequest withSnapshotIdentifierList(
            String... snapshotIdentifierList) {
        if (getSnapshotIdentifierList() == null) {
            this.snapshotIdentifierList = new java.util.ArrayList<String>(
                    snapshotIdentifierList.length);
        }
        for (String value : snapshotIdentifierList) {
            this.snapshotIdentifierList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifierList <p>
     *            A list of snapshot identifiers you want to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsRequest withSnapshotIdentifierList(
            java.util.Collection<String> snapshotIdentifierList) {
        setSnapshotIdentifierList(snapshotIdentifierList);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the
     * value -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current
     * value, existing manual snapshots that fall outside of the new retention
     * period will return an error. If you want to suppress the errors and
     * delete the snapshots, use the force option.
     * </p>
     *
     * @return <p>
     *         The number of days that a manual snapshot is retained. If you
     *         specify the value -1, the manual snapshot is retained
     *         indefinitely.
     *         </p>
     *         <p>
     *         The number must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         If you decrease the manual snapshot retention period from its
     *         current value, existing manual snapshots that fall outside of the
     *         new retention period will return an error. If you want to
     *         suppress the errors and delete the snapshots, use the force
     *         option.
     *         </p>
     */
    public Integer getManualSnapshotRetentionPeriod() {
        return manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the
     * value -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current
     * value, existing manual snapshots that fall outside of the new retention
     * period will return an error. If you want to suppress the errors and
     * delete the snapshots, use the force option.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If you
     *            specify the value -1, the manual snapshot is retained
     *            indefinitely.
     *            </p>
     *            <p>
     *            The number must be either -1 or an integer between 1 and
     *            3,653.
     *            </p>
     *            <p>
     *            If you decrease the manual snapshot retention period from its
     *            current value, existing manual snapshots that fall outside of
     *            the new retention period will return an error. If you want to
     *            suppress the errors and delete the snapshots, use the force
     *            option.
     *            </p>
     */
    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the
     * value -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current
     * value, existing manual snapshots that fall outside of the new retention
     * period will return an error. If you want to suppress the errors and
     * delete the snapshots, use the force option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If you
     *            specify the value -1, the manual snapshot is retained
     *            indefinitely.
     *            </p>
     *            <p>
     *            The number must be either -1 or an integer between 1 and
     *            3,653.
     *            </p>
     *            <p>
     *            If you decrease the manual snapshot retention period from its
     *            current value, existing manual snapshots that fall outside of
     *            the new retention period will return an error. If you want to
     *            suppress the errors and delete the snapshots, use the force
     *            option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsRequest withManualSnapshotRetentionPeriod(
            Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the
     * retention period has passed.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether to override an exception if
     *         the retention period has passed.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the
     * retention period has passed.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether to override an exception if
     *         the retention period has passed.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the
     * retention period has passed.
     * </p>
     *
     * @param force <p>
     *            A boolean value indicating whether to override an exception if
     *            the retention period has passed.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the
     * retention period has passed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            A boolean value indicating whether to override an exception if
     *            the retention period has passed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchModifyClusterSnapshotsRequest withForce(Boolean force) {
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
        if (getSnapshotIdentifierList() != null)
            sb.append("SnapshotIdentifierList: " + getSnapshotIdentifierList() + ",");
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

        hashCode = prime
                * hashCode
                + ((getSnapshotIdentifierList() == null) ? 0 : getSnapshotIdentifierList()
                        .hashCode());
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

        if (obj instanceof BatchModifyClusterSnapshotsRequest == false)
            return false;
        BatchModifyClusterSnapshotsRequest other = (BatchModifyClusterSnapshotsRequest) obj;

        if (other.getSnapshotIdentifierList() == null ^ this.getSnapshotIdentifierList() == null)
            return false;
        if (other.getSnapshotIdentifierList() != null
                && other.getSnapshotIdentifierList().equals(this.getSnapshotIdentifierList()) == false)
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
