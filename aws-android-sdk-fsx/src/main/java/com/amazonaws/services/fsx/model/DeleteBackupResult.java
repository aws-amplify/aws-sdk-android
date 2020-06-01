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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The response object for <code>DeleteBackup</code> operation.
 * </p>
 */
public class DeleteBackupResult implements Serializable {
    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     */
    private String backupId;

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     */
    private String lifecycle;

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the backup deleted.
     *         </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup deleted.
     *            </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBackupResult withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @return <p>
     *         The lifecycle of the backup. Should be <code>DELETED</code>.
     *         </p>
     * @see BackupLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle of the backup. Should be <code>DELETED</code>.
     *            </p>
     * @see BackupLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle of the backup. Should be <code>DELETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupLifecycle
     */
    public DeleteBackupResult withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle of the backup. Should be <code>DELETED</code>.
     *            </p>
     * @see BackupLifecycle
     */
    public void setLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle of the backup. Should be <code>DELETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupLifecycle
     */
    public DeleteBackupResult withLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
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
        if (getBackupId() != null)
            sb.append("BackupId: " + getBackupId() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBackupResult == false)
            return false;
        DeleteBackupResult other = (DeleteBackupResult) obj;

        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }
}
