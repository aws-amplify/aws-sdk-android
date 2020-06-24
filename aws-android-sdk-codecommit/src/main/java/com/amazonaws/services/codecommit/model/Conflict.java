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
 * Information about conflicts in a merge operation.
 * </p>
 */
public class Conflict implements Serializable {
    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     */
    private ConflictMetadata conflictMetadata;

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines
     * causing the conflict.
     * </p>
     */
    private java.util.List<MergeHunk> mergeHunks;

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     *
     * @return <p>
     *         Metadata about a conflict in a merge operation.
     *         </p>
     */
    public ConflictMetadata getConflictMetadata() {
        return conflictMetadata;
    }

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     *
     * @param conflictMetadata <p>
     *            Metadata about a conflict in a merge operation.
     *            </p>
     */
    public void setConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
    }

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictMetadata <p>
     *            Metadata about a conflict in a merge operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Conflict withConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
        return this;
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines
     * causing the conflict.
     * </p>
     *
     * @return <p>
     *         A list of hunks that contain the differences between files or
     *         lines causing the conflict.
     *         </p>
     */
    public java.util.List<MergeHunk> getMergeHunks() {
        return mergeHunks;
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines
     * causing the conflict.
     * </p>
     *
     * @param mergeHunks <p>
     *            A list of hunks that contain the differences between files or
     *            lines causing the conflict.
     *            </p>
     */
    public void setMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        if (mergeHunks == null) {
            this.mergeHunks = null;
            return;
        }

        this.mergeHunks = new java.util.ArrayList<MergeHunk>(mergeHunks);
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines
     * causing the conflict.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeHunks <p>
     *            A list of hunks that contain the differences between files or
     *            lines causing the conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Conflict withMergeHunks(MergeHunk... mergeHunks) {
        if (getMergeHunks() == null) {
            this.mergeHunks = new java.util.ArrayList<MergeHunk>(mergeHunks.length);
        }
        for (MergeHunk value : mergeHunks) {
            this.mergeHunks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines
     * causing the conflict.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeHunks <p>
     *            A list of hunks that contain the differences between files or
     *            lines causing the conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Conflict withMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        setMergeHunks(mergeHunks);
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
        if (getConflictMetadata() != null)
            sb.append("conflictMetadata: " + getConflictMetadata() + ",");
        if (getMergeHunks() != null)
            sb.append("mergeHunks: " + getMergeHunks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConflictMetadata() == null) ? 0 : getConflictMetadata().hashCode());
        hashCode = prime * hashCode + ((getMergeHunks() == null) ? 0 : getMergeHunks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Conflict == false)
            return false;
        Conflict other = (Conflict) obj;

        if (other.getConflictMetadata() == null ^ this.getConflictMetadata() == null)
            return false;
        if (other.getConflictMetadata() != null
                && other.getConflictMetadata().equals(this.getConflictMetadata()) == false)
            return false;
        if (other.getMergeHunks() == null ^ this.getMergeHunks() == null)
            return false;
        if (other.getMergeHunks() != null
                && other.getMergeHunks().equals(this.getMergeHunks()) == false)
            return false;
        return true;
    }
}
