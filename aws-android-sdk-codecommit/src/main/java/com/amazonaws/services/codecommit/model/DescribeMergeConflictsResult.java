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

public class DescribeMergeConflictsResult implements Serializable {
    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     */
    private ConflictMetadata conflictMetadata;

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     */
    private java.util.List<MergeHunk> mergeHunks;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     */
    private String destinationCommitId;

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     */
    private String sourceCommitId;

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     */
    private String baseCommitId;

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     *
     * @return <p>
     *         Contains metadata about the conflicts found in the merge.
     *         </p>
     */
    public ConflictMetadata getConflictMetadata() {
        return conflictMetadata;
    }

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     *
     * @param conflictMetadata <p>
     *            Contains metadata about the conflicts found in the merge.
     *            </p>
     */
    public void setConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
    }

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictMetadata <p>
     *            Contains metadata about the conflicts found in the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
        return this;
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     *
     * @return <p>
     *         A list of merge hunks of the differences between the files or
     *         lines.
     *         </p>
     */
    public java.util.List<MergeHunk> getMergeHunks() {
        return mergeHunks;
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     *
     * @param mergeHunks <p>
     *            A list of merge hunks of the differences between the files or
     *            lines.
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
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeHunks <p>
     *            A list of merge hunks of the differences between the files or
     *            lines.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withMergeHunks(MergeHunk... mergeHunks) {
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
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeHunks <p>
     *            A list of merge hunks of the differences between the files or
     *            lines.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        setMergeHunks(mergeHunks);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that can be used in a request to return the
     *         next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     *
     * @return <p>
     *         The commit ID of the destination commit specifier that was used
     *         in the merge evaluation.
     *         </p>
     */
    public String getDestinationCommitId() {
        return destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     *
     * @param destinationCommitId <p>
     *            The commit ID of the destination commit specifier that was
     *            used in the merge evaluation.
     *            </p>
     */
    public void setDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the
     * merge evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCommitId <p>
     *            The commit ID of the destination commit specifier that was
     *            used in the merge evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
        return this;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     *
     * @return <p>
     *         The commit ID of the source commit specifier that was used in the
     *         merge evaluation.
     *         </p>
     */
    public String getSourceCommitId() {
        return sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     *
     * @param sourceCommitId <p>
     *            The commit ID of the source commit specifier that was used in
     *            the merge evaluation.
     *            </p>
     */
    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge
     * evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommitId <p>
     *            The commit ID of the source commit specifier that was used in
     *            the merge evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
        return this;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     *
     * @return <p>
     *         The commit ID of the merge base.
     *         </p>
     */
    public String getBaseCommitId() {
        return baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     *
     * @param baseCommitId <p>
     *            The commit ID of the merge base.
     *            </p>
     */
    public void setBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseCommitId <p>
     *            The commit ID of the merge base.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsResult withBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
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
            sb.append("mergeHunks: " + getMergeHunks() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getDestinationCommitId() != null)
            sb.append("destinationCommitId: " + getDestinationCommitId() + ",");
        if (getSourceCommitId() != null)
            sb.append("sourceCommitId: " + getSourceCommitId() + ",");
        if (getBaseCommitId() != null)
            sb.append("baseCommitId: " + getBaseCommitId());
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMergeConflictsResult == false)
            return false;
        DescribeMergeConflictsResult other = (DescribeMergeConflictsResult) obj;

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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null
                && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null
                && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getBaseCommitId() == null ^ this.getBaseCommitId() == null)
            return false;
        if (other.getBaseCommitId() != null
                && other.getBaseCommitId().equals(this.getBaseCommitId()) == false)
            return false;
        return true;
    }
}
