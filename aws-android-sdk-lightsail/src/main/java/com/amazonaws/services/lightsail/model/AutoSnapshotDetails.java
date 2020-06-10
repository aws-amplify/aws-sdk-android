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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an automatic snapshot.
 * </p>
 */
public class AutoSnapshotDetails implements Serializable {
    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     */
    private String dateValue;

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     */
    private String status;

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the
     * instance when the automatic snapshot was created.
     * </p>
     */
    private java.util.List<AttachedDisk> fromAttachedDisks;

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     *
     * @return <p>
     *         The date of the automatic snapshot in <code>YYYY-MM-DD</code>
     *         format.
     *         </p>
     */
    public String getDate() {
        return dateValue;
    }

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     *
     * @param dateValue <p>
     *            The date of the automatic snapshot in <code>YYYY-MM-DD</code>
     *            format.
     *            </p>
     */
    public void setDate(String dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            The date of the automatic snapshot in <code>YYYY-MM-DD</code>
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoSnapshotDetails withDate(String dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the automatic snapshot was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the automatic snapshot was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the automatic snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoSnapshotDetails withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     *
     * @return <p>
     *         The status of the automatic snapshot.
     *         </p>
     * @see AutoSnapshotStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     *
     * @param status <p>
     *            The status of the automatic snapshot.
     *            </p>
     * @see AutoSnapshotStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     *
     * @param status <p>
     *            The status of the automatic snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoSnapshotStatus
     */
    public AutoSnapshotDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     *
     * @param status <p>
     *            The status of the automatic snapshot.
     *            </p>
     * @see AutoSnapshotStatus
     */
    public void setStatus(AutoSnapshotStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failed, InProgress, NotFound
     *
     * @param status <p>
     *            The status of the automatic snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoSnapshotStatus
     */
    public AutoSnapshotDetails withStatus(AutoSnapshotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the
     * instance when the automatic snapshot was created.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the block storage disks
     *         attached to the instance when the automatic snapshot was created.
     *         </p>
     */
    public java.util.List<AttachedDisk> getFromAttachedDisks() {
        return fromAttachedDisks;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the
     * instance when the automatic snapshot was created.
     * </p>
     *
     * @param fromAttachedDisks <p>
     *            An array of objects that describe the block storage disks
     *            attached to the instance when the automatic snapshot was
     *            created.
     *            </p>
     */
    public void setFromAttachedDisks(java.util.Collection<AttachedDisk> fromAttachedDisks) {
        if (fromAttachedDisks == null) {
            this.fromAttachedDisks = null;
            return;
        }

        this.fromAttachedDisks = new java.util.ArrayList<AttachedDisk>(fromAttachedDisks);
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the
     * instance when the automatic snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAttachedDisks <p>
     *            An array of objects that describe the block storage disks
     *            attached to the instance when the automatic snapshot was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoSnapshotDetails withFromAttachedDisks(AttachedDisk... fromAttachedDisks) {
        if (getFromAttachedDisks() == null) {
            this.fromAttachedDisks = new java.util.ArrayList<AttachedDisk>(fromAttachedDisks.length);
        }
        for (AttachedDisk value : fromAttachedDisks) {
            this.fromAttachedDisks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the
     * instance when the automatic snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAttachedDisks <p>
     *            An array of objects that describe the block storage disks
     *            attached to the instance when the automatic snapshot was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoSnapshotDetails withFromAttachedDisks(
            java.util.Collection<AttachedDisk> fromAttachedDisks) {
        setFromAttachedDisks(fromAttachedDisks);
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
        if (getDate() != null)
            sb.append("date: " + getDate() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getFromAttachedDisks() != null)
            sb.append("fromAttachedDisks: " + getFromAttachedDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFromAttachedDisks() == null) ? 0 : getFromAttachedDisks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoSnapshotDetails == false)
            return false;
        AutoSnapshotDetails other = (AutoSnapshotDetails) obj;

        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFromAttachedDisks() == null ^ this.getFromAttachedDisks() == null)
            return false;
        if (other.getFromAttachedDisks() != null
                && other.getFromAttachedDisks().equals(this.getFromAttachedDisks()) == false)
            return false;
        return true;
    }
}
