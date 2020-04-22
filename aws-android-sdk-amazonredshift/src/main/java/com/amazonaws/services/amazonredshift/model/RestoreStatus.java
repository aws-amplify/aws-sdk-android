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
 * Describes the status of a cluster restore action. Returns null if the cluster
 * was not created by restoring a snapshot.
 * </p>
 */
public class RestoreStatus implements Serializable {
    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed,
     * or failed.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup. This field is
     * only updated when you restore to DC2 and DS2 node types.
     * </p>
     */
    private Double currentRestoreRateInMegaBytesPerSecond;

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster. This
     * field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     */
    private Long snapshotSizeInMegaBytes;

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * This field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     */
    private Long progressInMegaBytes;

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount
     * of time it took a completed restore to finish. This field is only updated
     * when you restore to DC2 and DS2 node types.
     * </p>
     */
    private Long elapsedTimeInSeconds;

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore. This field is only updated when you
     * restore to DC2 and DS2 node types.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed,
     * or failed.
     * </p>
     *
     * @return <p>
     *         The status of the restore action. Returns starting, restoring,
     *         completed, or failed.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed,
     * or failed.
     * </p>
     *
     * @param status <p>
     *            The status of the restore action. Returns starting, restoring,
     *            completed, or failed.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed,
     * or failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the restore action. Returns starting, restoring,
     *            completed, or failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup. This field is
     * only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @return <p>
     *         The number of megabytes per second being transferred from the
     *         backup storage. Returns the average rate for a completed backup.
     *         This field is only updated when you restore to DC2 and DS2 node
     *         types.
     *         </p>
     */
    public Double getCurrentRestoreRateInMegaBytesPerSecond() {
        return currentRestoreRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup. This field is
     * only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @param currentRestoreRateInMegaBytesPerSecond <p>
     *            The number of megabytes per second being transferred from the
     *            backup storage. Returns the average rate for a completed
     *            backup. This field is only updated when you restore to DC2 and
     *            DS2 node types.
     *            </p>
     */
    public void setCurrentRestoreRateInMegaBytesPerSecond(
            Double currentRestoreRateInMegaBytesPerSecond) {
        this.currentRestoreRateInMegaBytesPerSecond = currentRestoreRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup. This field is
     * only updated when you restore to DC2 and DS2 node types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentRestoreRateInMegaBytesPerSecond <p>
     *            The number of megabytes per second being transferred from the
     *            backup storage. Returns the average rate for a completed
     *            backup. This field is only updated when you restore to DC2 and
     *            DS2 node types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withCurrentRestoreRateInMegaBytesPerSecond(
            Double currentRestoreRateInMegaBytesPerSecond) {
        this.currentRestoreRateInMegaBytesPerSecond = currentRestoreRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster. This
     * field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @return <p>
     *         The size of the set of snapshot data used to restore the cluster.
     *         This field is only updated when you restore to DC2 and DS2 node
     *         types.
     *         </p>
     */
    public Long getSnapshotSizeInMegaBytes() {
        return snapshotSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster. This
     * field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @param snapshotSizeInMegaBytes <p>
     *            The size of the set of snapshot data used to restore the
     *            cluster. This field is only updated when you restore to DC2
     *            and DS2 node types.
     *            </p>
     */
    public void setSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        this.snapshotSizeInMegaBytes = snapshotSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster. This
     * field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotSizeInMegaBytes <p>
     *            The size of the set of snapshot data used to restore the
     *            cluster. This field is only updated when you restore to DC2
     *            and DS2 node types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        this.snapshotSizeInMegaBytes = snapshotSizeInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * This field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @return <p>
     *         The number of megabytes that have been transferred from snapshot
     *         storage. This field is only updated when you restore to DC2 and
     *         DS2 node types.
     *         </p>
     */
    public Long getProgressInMegaBytes() {
        return progressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * This field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @param progressInMegaBytes <p>
     *            The number of megabytes that have been transferred from
     *            snapshot storage. This field is only updated when you restore
     *            to DC2 and DS2 node types.
     *            </p>
     */
    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * This field is only updated when you restore to DC2 and DS2 node types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressInMegaBytes <p>
     *            The number of megabytes that have been transferred from
     *            snapshot storage. This field is only updated when you restore
     *            to DC2 and DS2 node types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount
     * of time it took a completed restore to finish. This field is only updated
     * when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @return <p>
     *         The amount of time an in-progress restore has been running, or
     *         the amount of time it took a completed restore to finish. This
     *         field is only updated when you restore to DC2 and DS2 node types.
     *         </p>
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount
     * of time it took a completed restore to finish. This field is only updated
     * when you restore to DC2 and DS2 node types.
     * </p>
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of time an in-progress restore has been running, or
     *            the amount of time it took a completed restore to finish. This
     *            field is only updated when you restore to DC2 and DS2 node
     *            types.
     *            </p>
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount
     * of time it took a completed restore to finish. This field is only updated
     * when you restore to DC2 and DS2 node types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of time an in-progress restore has been running, or
     *            the amount of time it took a completed restore to finish. This
     *            field is only updated when you restore to DC2 and DS2 node
     *            types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore. This field is only updated when you
     * restore to DC2 and DS2 node types.
     * </p>
     *
     * @return <p>
     *         The estimate of the time remaining before the restore will
     *         complete. Returns 0 for a completed restore. This field is only
     *         updated when you restore to DC2 and DS2 node types.
     *         </p>
     */
    public Long getEstimatedTimeToCompletionInSeconds() {
        return estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore. This field is only updated when you
     * restore to DC2 and DS2 node types.
     * </p>
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            The estimate of the time remaining before the restore will
     *            complete. Returns 0 for a completed restore. This field is
     *            only updated when you restore to DC2 and DS2 node types.
     *            </p>
     */
    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore. This field is only updated when you
     * restore to DC2 and DS2 node types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            The estimate of the time remaining before the restore will
     *            complete. Returns 0 for a completed restore. This field is
     *            only updated when you restore to DC2 and DS2 node types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreStatus withEstimatedTimeToCompletionInSeconds(
            Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCurrentRestoreRateInMegaBytesPerSecond() != null)
            sb.append("CurrentRestoreRateInMegaBytesPerSecond: "
                    + getCurrentRestoreRateInMegaBytesPerSecond() + ",");
        if (getSnapshotSizeInMegaBytes() != null)
            sb.append("SnapshotSizeInMegaBytes: " + getSnapshotSizeInMegaBytes() + ",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds() + ",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: "
                    + getEstimatedTimeToCompletionInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentRestoreRateInMegaBytesPerSecond() == null) ? 0
                        : getCurrentRestoreRateInMegaBytesPerSecond().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotSizeInMegaBytes() == null) ? 0 : getSnapshotSizeInMegaBytes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode
                + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0
                        : getEstimatedTimeToCompletionInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreStatus == false)
            return false;
        RestoreStatus other = (RestoreStatus) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() == null
                ^ this.getCurrentRestoreRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() != null
                && other.getCurrentRestoreRateInMegaBytesPerSecond().equals(
                        this.getCurrentRestoreRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getSnapshotSizeInMegaBytes() == null ^ this.getSnapshotSizeInMegaBytes() == null)
            return false;
        if (other.getSnapshotSizeInMegaBytes() != null
                && other.getSnapshotSizeInMegaBytes().equals(this.getSnapshotSizeInMegaBytes()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null
                && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null
                && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null
                ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(
                        this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        return true;
    }
}
