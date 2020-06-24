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

public class GetMergeConflictsResult implements Serializable {
    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the
     * specified merge option.
     * </p>
     */
    private Boolean mergeable;

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
     * A list of metadata for any conflicting files. If the specified merge
     * strategy is FAST_FORWARD_MERGE, this list is always empty.
     * </p>
     */
    private java.util.List<ConflictMetadata> conflictMetadataList;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the
     * specified merge option.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the code is mergeable by
     *         the specified merge option.
     *         </p>
     */
    public Boolean isMergeable() {
        return mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the
     * specified merge option.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the code is mergeable by
     *         the specified merge option.
     *         </p>
     */
    public Boolean getMergeable() {
        return mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the
     * specified merge option.
     * </p>
     *
     * @param mergeable <p>
     *            A Boolean value that indicates whether the code is mergeable
     *            by the specified merge option.
     *            </p>
     */
    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the
     * specified merge option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeable <p>
     *            A Boolean value that indicates whether the code is mergeable
     *            by the specified merge option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeConflictsResult withMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
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
    public GetMergeConflictsResult withDestinationCommitId(String destinationCommitId) {
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
    public GetMergeConflictsResult withSourceCommitId(String sourceCommitId) {
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
    public GetMergeConflictsResult withBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
        return this;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge
     * strategy is FAST_FORWARD_MERGE, this list is always empty.
     * </p>
     *
     * @return <p>
     *         A list of metadata for any conflicting files. If the specified
     *         merge strategy is FAST_FORWARD_MERGE, this list is always empty.
     *         </p>
     */
    public java.util.List<ConflictMetadata> getConflictMetadataList() {
        return conflictMetadataList;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge
     * strategy is FAST_FORWARD_MERGE, this list is always empty.
     * </p>
     *
     * @param conflictMetadataList <p>
     *            A list of metadata for any conflicting files. If the specified
     *            merge strategy is FAST_FORWARD_MERGE, this list is always
     *            empty.
     *            </p>
     */
    public void setConflictMetadataList(java.util.Collection<ConflictMetadata> conflictMetadataList) {
        if (conflictMetadataList == null) {
            this.conflictMetadataList = null;
            return;
        }

        this.conflictMetadataList = new java.util.ArrayList<ConflictMetadata>(conflictMetadataList);
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge
     * strategy is FAST_FORWARD_MERGE, this list is always empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictMetadataList <p>
     *            A list of metadata for any conflicting files. If the specified
     *            merge strategy is FAST_FORWARD_MERGE, this list is always
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeConflictsResult withConflictMetadataList(
            ConflictMetadata... conflictMetadataList) {
        if (getConflictMetadataList() == null) {
            this.conflictMetadataList = new java.util.ArrayList<ConflictMetadata>(
                    conflictMetadataList.length);
        }
        for (ConflictMetadata value : conflictMetadataList) {
            this.conflictMetadataList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge
     * strategy is FAST_FORWARD_MERGE, this list is always empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictMetadataList <p>
     *            A list of metadata for any conflicting files. If the specified
     *            merge strategy is FAST_FORWARD_MERGE, this list is always
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeConflictsResult withConflictMetadataList(
            java.util.Collection<ConflictMetadata> conflictMetadataList) {
        setConflictMetadataList(conflictMetadataList);
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
    public GetMergeConflictsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMergeable() != null)
            sb.append("mergeable: " + getMergeable() + ",");
        if (getDestinationCommitId() != null)
            sb.append("destinationCommitId: " + getDestinationCommitId() + ",");
        if (getSourceCommitId() != null)
            sb.append("sourceCommitId: " + getSourceCommitId() + ",");
        if (getBaseCommitId() != null)
            sb.append("baseCommitId: " + getBaseCommitId() + ",");
        if (getConflictMetadataList() != null)
            sb.append("conflictMetadataList: " + getConflictMetadataList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMergeable() == null) ? 0 : getMergeable().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getConflictMetadataList() == null) ? 0 : getConflictMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeConflictsResult == false)
            return false;
        GetMergeConflictsResult other = (GetMergeConflictsResult) obj;

        if (other.getMergeable() == null ^ this.getMergeable() == null)
            return false;
        if (other.getMergeable() != null
                && other.getMergeable().equals(this.getMergeable()) == false)
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
        if (other.getConflictMetadataList() == null ^ this.getConflictMetadataList() == null)
            return false;
        if (other.getConflictMetadataList() != null
                && other.getConflictMetadataList().equals(this.getConflictMetadataList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
