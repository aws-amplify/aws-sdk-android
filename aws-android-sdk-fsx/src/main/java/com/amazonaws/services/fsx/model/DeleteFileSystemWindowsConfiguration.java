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
 * The configuration object for the Microsoft Windows file system used in the
 * <code>DeleteFileSystem</code> operation.
 * </p>
 */
public class DeleteFileSystemWindowsConfiguration implements Serializable {
    /**
     * <p>
     * By default, Amazon FSx for Windows takes a final backup on your behalf
     * when the <code>DeleteFileSystem</code> operation is invoked. Doing this
     * helps protect you from data loss, and we highly recommend taking the
     * final backup. If you want to skip this backup, use this flag to do so.
     * </p>
     */
    private Boolean skipFinalBackup;

    /**
     * <p>
     * A set of tags for your final backup.
     * </p>
     */
    private java.util.List<Tag> finalBackupTags;

    /**
     * <p>
     * By default, Amazon FSx for Windows takes a final backup on your behalf
     * when the <code>DeleteFileSystem</code> operation is invoked. Doing this
     * helps protect you from data loss, and we highly recommend taking the
     * final backup. If you want to skip this backup, use this flag to do so.
     * </p>
     *
     * @return <p>
     *         By default, Amazon FSx for Windows takes a final backup on your
     *         behalf when the <code>DeleteFileSystem</code> operation is
     *         invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip
     *         this backup, use this flag to do so.
     *         </p>
     */
    public Boolean isSkipFinalBackup() {
        return skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for Windows takes a final backup on your behalf
     * when the <code>DeleteFileSystem</code> operation is invoked. Doing this
     * helps protect you from data loss, and we highly recommend taking the
     * final backup. If you want to skip this backup, use this flag to do so.
     * </p>
     *
     * @return <p>
     *         By default, Amazon FSx for Windows takes a final backup on your
     *         behalf when the <code>DeleteFileSystem</code> operation is
     *         invoked. Doing this helps protect you from data loss, and we
     *         highly recommend taking the final backup. If you want to skip
     *         this backup, use this flag to do so.
     *         </p>
     */
    public Boolean getSkipFinalBackup() {
        return skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for Windows takes a final backup on your behalf
     * when the <code>DeleteFileSystem</code> operation is invoked. Doing this
     * helps protect you from data loss, and we highly recommend taking the
     * final backup. If you want to skip this backup, use this flag to do so.
     * </p>
     *
     * @param skipFinalBackup <p>
     *            By default, Amazon FSx for Windows takes a final backup on
     *            your behalf when the <code>DeleteFileSystem</code> operation
     *            is invoked. Doing this helps protect you from data loss, and
     *            we highly recommend taking the final backup. If you want to
     *            skip this backup, use this flag to do so.
     *            </p>
     */
    public void setSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
    }

    /**
     * <p>
     * By default, Amazon FSx for Windows takes a final backup on your behalf
     * when the <code>DeleteFileSystem</code> operation is invoked. Doing this
     * helps protect you from data loss, and we highly recommend taking the
     * final backup. If you want to skip this backup, use this flag to do so.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipFinalBackup <p>
     *            By default, Amazon FSx for Windows takes a final backup on
     *            your behalf when the <code>DeleteFileSystem</code> operation
     *            is invoked. Doing this helps protect you from data loss, and
     *            we highly recommend taking the final backup. If you want to
     *            skip this backup, use this flag to do so.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemWindowsConfiguration withSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
        return this;
    }

    /**
     * <p>
     * A set of tags for your final backup.
     * </p>
     *
     * @return <p>
     *         A set of tags for your final backup.
     *         </p>
     */
    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * <p>
     * A set of tags for your final backup.
     * </p>
     *
     * @param finalBackupTags <p>
     *            A set of tags for your final backup.
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
     * A set of tags for your final backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalBackupTags <p>
     *            A set of tags for your final backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemWindowsConfiguration withFinalBackupTags(Tag... finalBackupTags) {
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
     * A set of tags for your final backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalBackupTags <p>
     *            A set of tags for your final backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemWindowsConfiguration withFinalBackupTags(
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
        if (getSkipFinalBackup() != null)
            sb.append("SkipFinalBackup: " + getSkipFinalBackup() + ",");
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
                + ((getSkipFinalBackup() == null) ? 0 : getSkipFinalBackup().hashCode());
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

        if (obj instanceof DeleteFileSystemWindowsConfiguration == false)
            return false;
        DeleteFileSystemWindowsConfiguration other = (DeleteFileSystemWindowsConfiguration) obj;

        if (other.getSkipFinalBackup() == null ^ this.getSkipFinalBackup() == null)
            return false;
        if (other.getSkipFinalBackup() != null
                && other.getSkipFinalBackup().equals(this.getSkipFinalBackup()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null
                && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        return true;
    }
}
