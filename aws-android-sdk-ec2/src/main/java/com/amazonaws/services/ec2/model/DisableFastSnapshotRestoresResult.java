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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DisableFastSnapshotRestoresResult implements Serializable {
    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully disabled.
     * </p>
     */
    private java.util.List<DisableFastSnapshotRestoreSuccessItem> successful;

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be disabled.
     * </p>
     */
    private java.util.List<DisableFastSnapshotRestoreErrorItem> unsuccessful;

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully disabled.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots for which fast snapshot restores
     *         were successfully disabled.
     *         </p>
     */
    public java.util.List<DisableFastSnapshotRestoreSuccessItem> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully disabled.
     * </p>
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully disabled.
     *            </p>
     */
    public void setSuccessful(java.util.Collection<DisableFastSnapshotRestoreSuccessItem> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<DisableFastSnapshotRestoreSuccessItem>(successful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresResult withSuccessful(
            DisableFastSnapshotRestoreSuccessItem... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<DisableFastSnapshotRestoreSuccessItem>(
                    successful.length);
        }
        for (DisableFastSnapshotRestoreSuccessItem value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresResult withSuccessful(
            java.util.Collection<DisableFastSnapshotRestoreSuccessItem> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be disabled.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots for which fast snapshot restores
     *         could not be disabled.
     *         </p>
     */
    public java.util.List<DisableFastSnapshotRestoreErrorItem> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be disabled.
     * </p>
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be disabled.
     *            </p>
     */
    public void setUnsuccessful(
            java.util.Collection<DisableFastSnapshotRestoreErrorItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<DisableFastSnapshotRestoreErrorItem>(
                unsuccessful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresResult withUnsuccessful(
            DisableFastSnapshotRestoreErrorItem... unsuccessful) {
        if (getUnsuccessful() == null) {
            this.unsuccessful = new java.util.ArrayList<DisableFastSnapshotRestoreErrorItem>(
                    unsuccessful.length);
        }
        for (DisableFastSnapshotRestoreErrorItem value : unsuccessful) {
            this.unsuccessful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresResult withUnsuccessful(
            java.util.Collection<DisableFastSnapshotRestoreErrorItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: " + getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode
                + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoresResult == false)
            return false;
        DisableFastSnapshotRestoresResult other = (DisableFastSnapshotRestoresResult) obj;

        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null
                && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null
                && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }
}
