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

/**
 * <p>
 * Contains information about the errors that occurred when enabling fast
 * snapshot restores.
 * </p>
 */
public class EnableFastSnapshotRestoreErrorItem implements Serializable {
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The errors.
     * </p>
     */
    private java.util.List<EnableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoreErrorItem withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The errors.
     * </p>
     *
     * @return <p>
     *         The errors.
     *         </p>
     */
    public java.util.List<EnableFastSnapshotRestoreStateErrorItem> getFastSnapshotRestoreStateErrors() {
        return fastSnapshotRestoreStateErrors;
    }

    /**
     * <p>
     * The errors.
     * </p>
     *
     * @param fastSnapshotRestoreStateErrors <p>
     *            The errors.
     *            </p>
     */
    public void setFastSnapshotRestoreStateErrors(
            java.util.Collection<EnableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors) {
        if (fastSnapshotRestoreStateErrors == null) {
            this.fastSnapshotRestoreStateErrors = null;
            return;
        }

        this.fastSnapshotRestoreStateErrors = new java.util.ArrayList<EnableFastSnapshotRestoreStateErrorItem>(
                fastSnapshotRestoreStateErrors);
    }

    /**
     * <p>
     * The errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fastSnapshotRestoreStateErrors <p>
     *            The errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoreErrorItem withFastSnapshotRestoreStateErrors(
            EnableFastSnapshotRestoreStateErrorItem... fastSnapshotRestoreStateErrors) {
        if (getFastSnapshotRestoreStateErrors() == null) {
            this.fastSnapshotRestoreStateErrors = new java.util.ArrayList<EnableFastSnapshotRestoreStateErrorItem>(
                    fastSnapshotRestoreStateErrors.length);
        }
        for (EnableFastSnapshotRestoreStateErrorItem value : fastSnapshotRestoreStateErrors) {
            this.fastSnapshotRestoreStateErrors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fastSnapshotRestoreStateErrors <p>
     *            The errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableFastSnapshotRestoreErrorItem withFastSnapshotRestoreStateErrors(
            java.util.Collection<EnableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors) {
        setFastSnapshotRestoreStateErrors(fastSnapshotRestoreStateErrors);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getFastSnapshotRestoreStateErrors() != null)
            sb.append("FastSnapshotRestoreStateErrors: " + getFastSnapshotRestoreStateErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime
                * hashCode
                + ((getFastSnapshotRestoreStateErrors() == null) ? 0
                        : getFastSnapshotRestoreStateErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableFastSnapshotRestoreErrorItem == false)
            return false;
        EnableFastSnapshotRestoreErrorItem other = (EnableFastSnapshotRestoreErrorItem) obj;

        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getFastSnapshotRestoreStateErrors() == null
                ^ this.getFastSnapshotRestoreStateErrors() == null)
            return false;
        if (other.getFastSnapshotRestoreStateErrors() != null
                && other.getFastSnapshotRestoreStateErrors().equals(
                        this.getFastSnapshotRestoreStateErrors()) == false)
            return false;
        return true;
    }
}
