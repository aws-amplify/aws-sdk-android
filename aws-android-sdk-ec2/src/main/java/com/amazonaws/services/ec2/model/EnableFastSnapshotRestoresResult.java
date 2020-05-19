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

public class EnableFastSnapshotRestoresResult implements Serializable {
    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully enabled.
     * </p>
     */
    private java.util.List<EnableFastSnapshotRestoreSuccessItem> successful;

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be enabled.
     * </p>
     */
    private java.util.List<EnableFastSnapshotRestoreErrorItem> unsuccessful;

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully enabled.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots for which fast snapshot restores
     *         were successfully enabled.
     *         </p>
     */
    public java.util.List<EnableFastSnapshotRestoreSuccessItem> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully enabled.
     * </p>
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully enabled.
     *            </p>
     */
    public void setSuccessful(java.util.Collection<EnableFastSnapshotRestoreSuccessItem> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<EnableFastSnapshotRestoreSuccessItem>(successful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoresResult withSuccessful(
            EnableFastSnapshotRestoreSuccessItem... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<EnableFastSnapshotRestoreSuccessItem>(
                    successful.length);
        }
        for (EnableFastSnapshotRestoreSuccessItem value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were
     * successfully enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores were successfully enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoresResult withSuccessful(
            java.util.Collection<EnableFastSnapshotRestoreSuccessItem> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be enabled.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots for which fast snapshot restores
     *         could not be enabled.
     *         </p>
     */
    public java.util.List<EnableFastSnapshotRestoreErrorItem> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be enabled.
     * </p>
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be enabled.
     *            </p>
     */
    public void setUnsuccessful(
            java.util.Collection<EnableFastSnapshotRestoreErrorItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<EnableFastSnapshotRestoreErrorItem>(
                unsuccessful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoresResult withUnsuccessful(
            EnableFastSnapshotRestoreErrorItem... unsuccessful) {
        if (getUnsuccessful() == null) {
            this.unsuccessful = new java.util.ArrayList<EnableFastSnapshotRestoreErrorItem>(
                    unsuccessful.length);
        }
        for (EnableFastSnapshotRestoreErrorItem value : unsuccessful) {
            this.unsuccessful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could
     * not be enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the snapshots for which fast snapshot
     *            restores could not be enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoresResult withUnsuccessful(
            java.util.Collection<EnableFastSnapshotRestoreErrorItem> unsuccessful) {
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

        if (obj instanceof EnableFastSnapshotRestoresResult == false)
            return false;
        EnableFastSnapshotRestoresResult other = (EnableFastSnapshotRestoresResult) obj;

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
