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
 * Returns information about one or more merge conflicts in the attempted merge
 * of two commit specifiers using the squash or three-way merge strategy. If the
 * merge option for the attempted merge is specified as FAST_FORWARD_MERGE, an
 * exception is thrown.
 * </p>
 */
public class DescribeMergeConflictsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository where you want to get information about a
     * merge conflict.
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
    private String destinationCommitSpecifier;

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to
     * identify a commit (for example, a branch name or a full commit ID).
     * </p>
     */
    private String sourceCommitSpecifier;

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     */
    private String mergeOption;

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     */
    private Integer maxMergeHunks;

    /**
     * <p>
     * The path of the target files used to describe the conflicts.
     * </p>
     */
    private String filePath;

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
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the repository where you want to get information about a
     * merge conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to get information
     *         about a merge conflict.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get information about a
     * merge conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to get information
     *            about a merge conflict.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get information about a
     * merge conflict.
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
     *            The name of the repository where you want to get information
     *            about a merge conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsRequest withRepositoryName(String repositoryName) {
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
    public DescribeMergeConflictsRequest withDestinationCommitSpecifier(
            String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
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
    public DescribeMergeConflictsRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @return <p>
     *         The merge option or strategy you want to use to merge the code.
     *         </p>
     * @see MergeOptionTypeEnum
     */
    public String getMergeOption() {
        return mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge option or strategy you want to use to merge the
     *            code.
     *            </p>
     * @see MergeOptionTypeEnum
     */
    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge option or strategy you want to use to merge the
     *            code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeOptionTypeEnum
     */
    public DescribeMergeConflictsRequest withMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge option or strategy you want to use to merge the
     *            code.
     *            </p>
     * @see MergeOptionTypeEnum
     */
    public void setMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge option or strategy you want to use to merge the
     *            code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeOptionTypeEnum
     */
    public DescribeMergeConflictsRequest withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     *
     * @return <p>
     *         The maximum number of merge hunks to include in the output.
     *         </p>
     */
    public Integer getMaxMergeHunks() {
        return maxMergeHunks;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     *
     * @param maxMergeHunks <p>
     *            The maximum number of merge hunks to include in the output.
     *            </p>
     */
    public void setMaxMergeHunks(Integer maxMergeHunks) {
        this.maxMergeHunks = maxMergeHunks;
    }

    /**
     * <p>
     * The maximum number of merge hunks to include in the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxMergeHunks <p>
     *            The maximum number of merge hunks to include in the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsRequest withMaxMergeHunks(Integer maxMergeHunks) {
        this.maxMergeHunks = maxMergeHunks;
        return this;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts.
     * </p>
     *
     * @return <p>
     *         The path of the target files used to describe the conflicts.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts.
     * </p>
     *
     * @param filePath <p>
     *            The path of the target files used to describe the conflicts.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the target files used to describe the conflicts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The path of the target files used to describe the conflicts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsRequest withFilePath(String filePath) {
        this.filePath = filePath;
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
    public DescribeMergeConflictsRequest withConflictDetailLevel(String conflictDetailLevel) {
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
    public DescribeMergeConflictsRequest withConflictDetailLevel(
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
    public DescribeMergeConflictsRequest withConflictResolutionStrategy(
            String conflictResolutionStrategy) {
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
    public DescribeMergeConflictsRequest withConflictResolutionStrategy(
            ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that, when provided in a request, returns
     *         the next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMergeConflictsRequest withNextToken(String nextToken) {
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getDestinationCommitSpecifier() != null)
            sb.append("destinationCommitSpecifier: " + getDestinationCommitSpecifier() + ",");
        if (getSourceCommitSpecifier() != null)
            sb.append("sourceCommitSpecifier: " + getSourceCommitSpecifier() + ",");
        if (getMergeOption() != null)
            sb.append("mergeOption: " + getMergeOption() + ",");
        if (getMaxMergeHunks() != null)
            sb.append("maxMergeHunks: " + getMaxMergeHunks() + ",");
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getConflictDetailLevel() != null)
            sb.append("conflictDetailLevel: " + getConflictDetailLevel() + ",");
        if (getConflictResolutionStrategy() != null)
            sb.append("conflictResolutionStrategy: " + getConflictResolutionStrategy() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
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
                + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime * hashCode
                + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
        hashCode = prime * hashCode
                + ((getMaxMergeHunks() == null) ? 0 : getMaxMergeHunks().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode
                + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMergeConflictsRequest == false)
            return false;
        DescribeMergeConflictsRequest other = (DescribeMergeConflictsRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null
                ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null
                && other.getDestinationCommitSpecifier().equals(
                        this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null
                && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null
                && other.getMergeOption().equals(this.getMergeOption()) == false)
            return false;
        if (other.getMaxMergeHunks() == null ^ this.getMaxMergeHunks() == null)
            return false;
        if (other.getMaxMergeHunks() != null
                && other.getMaxMergeHunks().equals(this.getMaxMergeHunks()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
