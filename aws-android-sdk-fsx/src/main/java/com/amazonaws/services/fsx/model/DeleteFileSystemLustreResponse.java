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
 * The response object for the Amazon FSx for Lustre file system being deleted
 * in the <code>DeleteFileSystem</code> operation.
 * </p>
 */
public class DeleteFileSystemLustreResponse implements Serializable {
    /**
     * <p>
     * The ID of the final backup for this file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     */
    private String finalBackupId;

    /**
     * <p>
     * The set of tags applied to the final backup.
     * </p>
     */
    private java.util.List<Tag> finalBackupTags;

    /**
     * <p>
     * The ID of the final backup for this file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the final backup for this file system.
     *         </p>
     */
    public String getFinalBackupId() {
        return finalBackupId;
    }

    /**
     * <p>
     * The ID of the final backup for this file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param finalBackupId <p>
     *            The ID of the final backup for this file system.
     *            </p>
     */
    public void setFinalBackupId(String finalBackupId) {
        this.finalBackupId = finalBackupId;
    }

    /**
     * <p>
     * The ID of the final backup for this file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param finalBackupId <p>
     *            The ID of the final backup for this file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemLustreResponse withFinalBackupId(String finalBackupId) {
        this.finalBackupId = finalBackupId;
        return this;
    }

    /**
     * <p>
     * The set of tags applied to the final backup.
     * </p>
     *
     * @return <p>
     *         The set of tags applied to the final backup.
     *         </p>
     */
    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * <p>
     * The set of tags applied to the final backup.
     * </p>
     *
     * @param finalBackupTags <p>
     *            The set of tags applied to the final backup.
     *            </p>
     */
    public void setFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        if (finalBackupTags == null) {
            this.finalBackupTags = null;
            return;
        }

        this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags);
    }

    /**
     * <p>
     * The set of tags applied to the final backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalBackupTags <p>
     *            The set of tags applied to the final backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemLustreResponse withFinalBackupTags(Tag... finalBackupTags) {
        if (getFinalBackupTags() == null) {
            this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags.length);
        }
        for (Tag value : finalBackupTags) {
            this.finalBackupTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The set of tags applied to the final backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalBackupTags <p>
     *            The set of tags applied to the final backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemLustreResponse withFinalBackupTags(
            java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
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
        if (getFinalBackupId() != null)
            sb.append("FinalBackupId: " + getFinalBackupId() + ",");
        if (getFinalBackupTags() != null)
            sb.append("FinalBackupTags: " + getFinalBackupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFinalBackupId() == null) ? 0 : getFinalBackupId().hashCode());
        hashCode = prime * hashCode
                + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemLustreResponse == false)
            return false;
        DeleteFileSystemLustreResponse other = (DeleteFileSystemLustreResponse) obj;

        if (other.getFinalBackupId() == null ^ this.getFinalBackupId() == null)
            return false;
        if (other.getFinalBackupId() != null
                && other.getFinalBackupId().equals(this.getFinalBackupId()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null
                && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        return true;
    }
}
