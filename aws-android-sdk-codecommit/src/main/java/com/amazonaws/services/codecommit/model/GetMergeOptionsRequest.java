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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the merge options available for merging two
 * specified branches. For details about why a merge option is not available,
 * use GetMergeConflicts or DescribeMergeConflicts.
 * </p>
 */
public class GetMergeOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the commits about which you want
     * to get merge options.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     */
    private String sourceCommitSpecifier;

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     */
    private String destinationCommitSpecifier;

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     */
    private String conflictDetailLevel;

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     */
    private String conflictResolutionStrategy;

    /**
     * <p>
     * The name of the repository that contains the commits about which you want
     * to get merge options.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the commits about which
     *         you want to get merge options.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits about which you want
     * to get merge options.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the commits about
     *            which you want to get merge options.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits about which you want
     * to get merge options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the commits about
     *            which you want to get merge options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     *
     * @return <p>
     *         The branch, tag, HEAD, or other fully qualified reference used to
     *         identify a commit (for example, a branch name or a full commit
     *         ID).
     *         </p>
     */
    public String getSourceCommitSpecifier() {
        return sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     *
     * @param sourceCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, a branch name or a full
     *            commit ID).
     *            </p>
     */
    public void setSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, a branch name or a full
     *            commit ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     *
     * @return <p>
     *         The branch, tag, HEAD, or other fully qualified reference used to
     *         identify a commit (for example, a branch name or a full commit
     *         ID).
     *         </p>
     */
    public String getDestinationCommitSpecifier() {
        return destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     *
     * @param destinationCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, a branch name or a full
     *            commit ID).
     *            </p>
     */
    public void setDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCommitSpecifier <p>
     *            The branch, tag, HEAD, or other fully qualified reference used
     *            to identify a commit (for example, a branch name or a full
     *            commit ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMergeOptionsRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     *
     * @return <p>
     *         The level of conflict detail to use. If unspecified, the default
     *         FILE_LEVEL is used, which returns a not-mergeable result if the
     *         same file has differences in both branches. If LINE_LEVEL is
     *         specified, a conflict is considered not mergeable if the same
     *         file in both branches has differences on the same line.
     *         </p>
     * @see ConflictDetailLevelTypeEnum
     */
    public String getConflictDetailLevel() {
        return conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     *
     * @param conflictDetailLevel <p>
     *            The level of conflict detail to use. If unspecified, the
     *            default FILE_LEVEL is used, which returns a not-mergeable
     *            result if the same file has differences in both branches. If
     *            LINE_LEVEL is specified, a conflict is considered not
     *            mergeable if the same file in both branches has differences on
     *            the same line.
     *            </p>
     * @see ConflictDetailLevelTypeEnum
     */
    public void setConflictDetailLevel(String conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     *
     * @param conflictDetailLevel <p>
     *            The level of conflict detail to use. If unspecified, the
     *            default FILE_LEVEL is used, which returns a not-mergeable
     *            result if the same file has differences in both branches. If
     *            LINE_LEVEL is specified, a conflict is considered not
     *            mergeable if the same file in both branches has differences on
     *            the same line.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConflictDetailLevelTypeEnum
     */
    public GetMergeOptionsRequest withConflictDetailLevel(String conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel;
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     *
     * @param conflictDetailLevel <p>
     *            The level of conflict detail to use. If unspecified, the
     *            default FILE_LEVEL is used, which returns a not-mergeable
     *            result if the same file has differences in both branches. If
     *            LINE_LEVEL is specified, a conflict is considered not
     *            mergeable if the same file in both branches has differences on
     *            the same line.
     *            </p>
     * @see ConflictDetailLevelTypeEnum
     */
    public void setConflictDetailLevel(ConflictDetailLevelTypeEnum conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel.toString();
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default
     * FILE_LEVEL is used, which returns a not-mergeable result if the same file
     * has differences in both branches. If LINE_LEVEL is specified, a conflict
     * is considered not mergeable if the same file in both branches has
     * differences on the same line.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_LEVEL, LINE_LEVEL
     *
     * @param conflictDetailLevel <p>
     *            The level of conflict detail to use. If unspecified, the
     *            default FILE_LEVEL is used, which returns a not-mergeable
     *            result if the same file has differences in both branches. If
     *            LINE_LEVEL is specified, a conflict is considered not
     *            mergeable if the same file in both branches has differences on
     *            the same line.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConflictDetailLevelTypeEnum
     */
    public GetMergeOptionsRequest withConflictDetailLevel(
            ConflictDetailLevelTypeEnum conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     *
     * @return <p>
     *         Specifies which branch to use when resolving conflicts, or
     *         whether to attempt automatically merging two versions of a file.
     *         The default is NONE, which requires any conflicts to be resolved
     *         manually before the merge operation is successful.
     *         </p>
     * @see ConflictResolutionStrategyTypeEnum
     */
    public String getConflictResolutionStrategy() {
        return conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     *
     * @param conflictResolutionStrategy <p>
     *            Specifies which branch to use when resolving conflicts, or
     *            whether to attempt automatically merging two versions of a
     *            file. The default is NONE, which requires any conflicts to be
     *            resolved manually before the merge operation is successful.
     *            </p>
     * @see ConflictResolutionStrategyTypeEnum
     */
    public void setConflictResolutionStrategy(String conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     *
     * @param conflictResolutionStrategy <p>
     *            Specifies which branch to use when resolving conflicts, or
     *            whether to attempt automatically merging two versions of a
     *            file. The default is NONE, which requires any conflicts to be
     *            resolved manually before the merge operation is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */
    public GetMergeOptionsRequest withConflictResolutionStrategy(String conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     *
     * @param conflictResolutionStrategy <p>
     *            Specifies which branch to use when resolving conflicts, or
     *            whether to attempt automatically merging two versions of a
     *            file. The default is NONE, which requires any conflicts to be
     *            resolved manually before the merge operation is successful.
     *            </p>
     * @see ConflictResolutionStrategyTypeEnum
     */
    public void setConflictResolutionStrategy(
            ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to
     * attempt automatically merging two versions of a file. The default is
     * NONE, which requires any conflicts to be resolved manually before the
     * merge operation is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE
     *
     * @param conflictResolutionStrategy <p>
     *            Specifies which branch to use when resolving conflicts, or
     *            whether to attempt automatically merging two versions of a
     *            file. The default is NONE, which requires any conflicts to be
     *            resolved manually before the merge operation is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */
    public GetMergeOptionsRequest withConflictResolutionStrategy(
            ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getSourceCommitSpecifier() != null)
            sb.append("sourceCommitSpecifier: " + getSourceCommitSpecifier() + ",");
        if (getDestinationCommitSpecifier() != null)
            sb.append("destinationCommitSpecifier: " + getDestinationCommitSpecifier() + ",");
        if (getConflictDetailLevel() != null)
            sb.append("conflictDetailLevel: " + getConflictDetailLevel() + ",");
        if (getConflictResolutionStrategy() != null)
            sb.append("conflictResolutionStrategy: " + getConflictResolutionStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeOptionsRequest == false)
            return false;
        GetMergeOptionsRequest other = (GetMergeOptionsRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null
                && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null
                ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null
                && other.getDestinationCommitSpecifier().equals(
                        this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getConflictDetailLevel() == null ^ this.getConflictDetailLevel() == null)
            return false;
        if (other.getConflictDetailLevel() != null
                && other.getConflictDetailLevel().equals(this.getConflictDetailLevel()) == false)
            return false;
        if (other.getConflictResolutionStrategy() == null
                ^ this.getConflictResolutionStrategy() == null)
            return false;
        if (other.getConflictResolutionStrategy() != null
                && other.getConflictResolutionStrategy().equals(
                        this.getConflictResolutionStrategy()) == false)
            return false;
        return true;
    }
}
