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

public class BatchDescribeMergeConflictsResult implements Serializable {
    /**
     * <p>
     * A list of conflicts for each file, including the conflict metadata and
     * the hunks of the differences between the files.
     * </p>
     */
    private java.util.List<Conflict> conflicts;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of any errors returned while describing the merge conflicts for
     * each file.
     * </p>
     */
    private java.util.List<BatchDescribeMergeConflictsError> errors;

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
     * A list of conflicts for each file, including the conflict metadata and
     * the hunks of the differences between the files.
     * </p>
     *
     * @return <p>
     *         A list of conflicts for each file, including the conflict
     *         metadata and the hunks of the differences between the files.
     *         </p>
     */
    public java.util.List<Conflict> getConflicts() {
        return conflicts;
    }

    /**
     * <p>
     * A list of conflicts for each file, including the conflict metadata and
     * the hunks of the differences between the files.
     * </p>
     *
     * @param conflicts <p>
     *            A list of conflicts for each file, including the conflict
     *            metadata and the hunks of the differences between the files.
     *            </p>
     */
    public void setConflicts(java.util.Collection<Conflict> conflicts) {
        if (conflicts == null) {
            this.conflicts = null;
            return;
        }

        this.conflicts = new java.util.ArrayList<Conflict>(conflicts);
    }

    /**
     * <p>
     * A list of conflicts for each file, including the conflict metadata and
     * the hunks of the differences between the files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflicts <p>
     *            A list of conflicts for each file, including the conflict
     *            metadata and the hunks of the differences between the files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsResult withConflicts(Conflict... conflicts) {
        if (getConflicts() == null) {
            this.conflicts = new java.util.ArrayList<Conflict>(conflicts.length);
        }
        for (Conflict value : conflicts) {
            this.conflicts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conflicts for each file, including the conflict metadata and
     * the hunks of the differences between the files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflicts <p>
     *            A list of conflicts for each file, including the conflict
     *            metadata and the hunks of the differences between the files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsResult withConflicts(java.util.Collection<Conflict> conflicts) {
        setConflicts(conflicts);
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
    public BatchDescribeMergeConflictsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of any errors returned while describing the merge conflicts for
     * each file.
     * </p>
     *
     * @return <p>
     *         A list of any errors returned while describing the merge
     *         conflicts for each file.
     *         </p>
     */
    public java.util.List<BatchDescribeMergeConflictsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of any errors returned while describing the merge conflicts for
     * each file.
     * </p>
     *
     * @param errors <p>
     *            A list of any errors returned while describing the merge
     *            conflicts for each file.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchDescribeMergeConflictsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDescribeMergeConflictsError>(errors);
    }

    /**
     * <p>
     * A list of any errors returned while describing the merge conflicts for
     * each file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors returned while describing the merge
     *            conflicts for each file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsResult withErrors(BatchDescribeMergeConflictsError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchDescribeMergeConflictsError>(errors.length);
        }
        for (BatchDescribeMergeConflictsError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors returned while describing the merge conflicts for
     * each file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors returned while describing the merge
     *            conflicts for each file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsResult withErrors(
            java.util.Collection<BatchDescribeMergeConflictsError> errors) {
        setErrors(errors);
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
    public BatchDescribeMergeConflictsResult withDestinationCommitId(String destinationCommitId) {
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
    public BatchDescribeMergeConflictsResult withSourceCommitId(String sourceCommitId) {
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
    public BatchDescribeMergeConflictsResult withBaseCommitId(String baseCommitId) {
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
        if (getConflicts() != null)
            sb.append("conflicts: " + getConflicts() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getErrors() != null)
            sb.append("errors: " + getErrors() + ",");
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

        hashCode = prime * hashCode + ((getConflicts() == null) ? 0 : getConflicts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
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

        if (obj instanceof BatchDescribeMergeConflictsResult == false)
            return false;
        BatchDescribeMergeConflictsResult other = (BatchDescribeMergeConflictsResult) obj;

        if (other.getConflicts() == null ^ this.getConflicts() == null)
            return false;
        if (other.getConflicts() != null
                && other.getConflicts().equals(this.getConflicts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
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
