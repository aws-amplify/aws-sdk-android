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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use
 * when resolving conflicts during a merge.
 * </p>
 */
public class ConflictResolution implements Serializable {
    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<ReplaceContentEntry> replaceContents;

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<DeleteFileEntry> deleteFiles;

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     */
    private java.util.List<SetFileModeEntry> setFileModes;

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     *
     * @return <p>
     *         Files to have content replaced as part of the merge conflict
     *         resolution.
     *         </p>
     */
    public java.util.List<ReplaceContentEntry> getReplaceContents() {
        return replaceContents;
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     *
     * @param replaceContents <p>
     *            Files to have content replaced as part of the merge conflict
     *            resolution.
     *            </p>
     */
    public void setReplaceContents(java.util.Collection<ReplaceContentEntry> replaceContents) {
        if (replaceContents == null) {
            this.replaceContents = null;
            return;
        }

        this.replaceContents = new java.util.ArrayList<ReplaceContentEntry>(replaceContents);
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceContents <p>
     *            Files to have content replaced as part of the merge conflict
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withReplaceContents(ReplaceContentEntry... replaceContents) {
        if (getReplaceContents() == null) {
            this.replaceContents = new java.util.ArrayList<ReplaceContentEntry>(
                    replaceContents.length);
        }
        for (ReplaceContentEntry value : replaceContents) {
            this.replaceContents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Files to have content replaced as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceContents <p>
     *            Files to have content replaced as part of the merge conflict
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withReplaceContents(
            java.util.Collection<ReplaceContentEntry> replaceContents) {
        setReplaceContents(replaceContents);
        return this;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     *
     * @return <p>
     *         Files to be deleted as part of the merge conflict resolution.
     *         </p>
     */
    public java.util.List<DeleteFileEntry> getDeleteFiles() {
        return deleteFiles;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     *
     * @param deleteFiles <p>
     *            Files to be deleted as part of the merge conflict resolution.
     *            </p>
     */
    public void setDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        if (deleteFiles == null) {
            this.deleteFiles = null;
            return;
        }

        this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles);
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteFiles <p>
     *            Files to be deleted as part of the merge conflict resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withDeleteFiles(DeleteFileEntry... deleteFiles) {
        if (getDeleteFiles() == null) {
            this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles.length);
        }
        for (DeleteFileEntry value : deleteFiles) {
            this.deleteFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Files to be deleted as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteFiles <p>
     *            Files to be deleted as part of the merge conflict resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        setDeleteFiles(deleteFiles);
        return this;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     *
     * @return <p>
     *         File modes that are set as part of the merge conflict resolution.
     *         </p>
     */
    public java.util.List<SetFileModeEntry> getSetFileModes() {
        return setFileModes;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     *
     * @param setFileModes <p>
     *            File modes that are set as part of the merge conflict
     *            resolution.
     *            </p>
     */
    public void setSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        if (setFileModes == null) {
            this.setFileModes = null;
            return;
        }

        this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes);
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setFileModes <p>
     *            File modes that are set as part of the merge conflict
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withSetFileModes(SetFileModeEntry... setFileModes) {
        if (getSetFileModes() == null) {
            this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes.length);
        }
        for (SetFileModeEntry value : setFileModes) {
            this.setFileModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * File modes that are set as part of the merge conflict resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setFileModes <p>
     *            File modes that are set as part of the merge conflict
     *            resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictResolution withSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        setSetFileModes(setFileModes);
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
        if (getReplaceContents() != null)
            sb.append("replaceContents: " + getReplaceContents() + ",");
        if (getDeleteFiles() != null)
            sb.append("deleteFiles: " + getDeleteFiles() + ",");
        if (getSetFileModes() != null)
            sb.append("setFileModes: " + getSetFileModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplaceContents() == null) ? 0 : getReplaceContents().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteFiles() == null) ? 0 : getDeleteFiles().hashCode());
        hashCode = prime * hashCode
                + ((getSetFileModes() == null) ? 0 : getSetFileModes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictResolution == false)
            return false;
        ConflictResolution other = (ConflictResolution) obj;

        if (other.getReplaceContents() == null ^ this.getReplaceContents() == null)
            return false;
        if (other.getReplaceContents() != null
                && other.getReplaceContents().equals(this.getReplaceContents()) == false)
            return false;
        if (other.getDeleteFiles() == null ^ this.getDeleteFiles() == null)
            return false;
        if (other.getDeleteFiles() != null
                && other.getDeleteFiles().equals(this.getDeleteFiles()) == false)
            return false;
        if (other.getSetFileModes() == null ^ this.getSetFileModes() == null)
            return false;
        if (other.getSetFileModes() != null
                && other.getSetFileModes().equals(this.getSetFileModes()) == false)
            return false;
        return true;
    }
}
