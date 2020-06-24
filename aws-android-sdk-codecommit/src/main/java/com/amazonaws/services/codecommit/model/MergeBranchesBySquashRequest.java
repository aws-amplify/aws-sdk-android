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
 * Merges two branches using the squash merge strategy.
 * </p>
 */
public class MergeBranchesBySquashRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository where you want to merge two branches.
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
     * The branch where the merge is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String targetBranch;

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
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     */
    private String authorName;

    /**
     * <p>
     * The email address of the person merging the branches. This information is
     * used in the commit information for the merge.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The commit message for the merge.
     * </p>
     */
    private String commitMessage;

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If this is specified as
     * true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     */
    private Boolean keepEmptyFolders;

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use
     * when resolving conflicts during a merge.
     * </p>
     */
    private ConflictResolution conflictResolution;

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to merge two branches.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to merge two
     *            branches.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
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
     *            The name of the repository where you want to merge two
     *            branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withRepositoryName(String repositoryName) {
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
    public MergeBranchesBySquashRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
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
    public MergeBranchesBySquashRequest withDestinationCommitSpecifier(
            String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
        return this;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The branch where the merge is applied.
     *         </p>
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetBranch <p>
     *            The branch where the merge is applied.
     *            </p>
     */
    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetBranch <p>
     *            The branch where the merge is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
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
    public MergeBranchesBySquashRequest withConflictDetailLevel(String conflictDetailLevel) {
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
    public MergeBranchesBySquashRequest withConflictDetailLevel(
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
    public MergeBranchesBySquashRequest withConflictResolutionStrategy(
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
    public MergeBranchesBySquashRequest withConflictResolutionStrategy(
            ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     *
     * @return <p>
     *         The name of the author who created the commit. This information
     *         is used as both the author and committer for the commit.
     *         </p>
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     *
     * @param authorName <p>
     *            The name of the author who created the commit. This
     *            information is used as both the author and committer for the
     *            commit.
     *            </p>
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorName <p>
     *            The name of the author who created the commit. This
     *            information is used as both the author and committer for the
     *            commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is
     * used in the commit information for the merge.
     * </p>
     *
     * @return <p>
     *         The email address of the person merging the branches. This
     *         information is used in the commit information for the merge.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is
     * used in the commit information for the merge.
     * </p>
     *
     * @param email <p>
     *            The email address of the person merging the branches. This
     *            information is used in the commit information for the merge.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is
     * used in the commit information for the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address of the person merging the branches. This
     *            information is used in the commit information for the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The commit message for the merge.
     * </p>
     *
     * @return <p>
     *         The commit message for the merge.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * The commit message for the merge.
     * </p>
     *
     * @param commitMessage <p>
     *            The commit message for the merge.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message for the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitMessage <p>
     *            The commit message for the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If this is specified as
     * true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     *
     * @return <p>
     *         If the commit contains deletions, whether to keep a folder or
     *         folder structure if the changes leave the folders empty. If this
     *         is specified as true, a .gitkeep file is created for empty
     *         folders. The default is false.
     *         </p>
     */
    public Boolean isKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If this is specified as
     * true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     *
     * @return <p>
     *         If the commit contains deletions, whether to keep a folder or
     *         folder structure if the changes leave the folders empty. If this
     *         is specified as true, a .gitkeep file is created for empty
     *         folders. The default is false.
     *         </p>
     */
    public Boolean getKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If this is specified as
     * true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     *
     * @param keepEmptyFolders <p>
     *            If the commit contains deletions, whether to keep a folder or
     *            folder structure if the changes leave the folders empty. If
     *            this is specified as true, a .gitkeep file is created for
     *            empty folders. The default is false.
     *            </p>
     */
    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If this is specified as
     * true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keepEmptyFolders <p>
     *            If the commit contains deletions, whether to keep a folder or
     *            folder structure if the changes leave the folders empty. If
     *            this is specified as true, a .gitkeep file is created for
     *            empty folders. The default is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
        return this;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use
     * when resolving conflicts during a merge.
     * </p>
     *
     * @return <p>
     *         If AUTOMERGE is the conflict resolution strategy, a list of
     *         inputs to use when resolving conflicts during a merge.
     *         </p>
     */
    public ConflictResolution getConflictResolution() {
        return conflictResolution;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use
     * when resolving conflicts during a merge.
     * </p>
     *
     * @param conflictResolution <p>
     *            If AUTOMERGE is the conflict resolution strategy, a list of
     *            inputs to use when resolving conflicts during a merge.
     *            </p>
     */
    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use
     * when resolving conflicts during a merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictResolution <p>
     *            If AUTOMERGE is the conflict resolution strategy, a list of
     *            inputs to use when resolving conflicts during a merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeBranchesBySquashRequest withConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
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
        if (getTargetBranch() != null)
            sb.append("targetBranch: " + getTargetBranch() + ",");
        if (getConflictDetailLevel() != null)
            sb.append("conflictDetailLevel: " + getConflictDetailLevel() + ",");
        if (getConflictResolutionStrategy() != null)
            sb.append("conflictResolutionStrategy: " + getConflictResolutionStrategy() + ",");
        if (getAuthorName() != null)
            sb.append("authorName: " + getAuthorName() + ",");
        if (getEmail() != null)
            sb.append("email: " + getEmail() + ",");
        if (getCommitMessage() != null)
            sb.append("commitMessage: " + getCommitMessage() + ",");
        if (getKeepEmptyFolders() != null)
            sb.append("keepEmptyFolders: " + getKeepEmptyFolders() + ",");
        if (getConflictResolution() != null)
            sb.append("conflictResolution: " + getConflictResolution());
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
                + ((getTargetBranch() == null) ? 0 : getTargetBranch().hashCode());
        hashCode = prime * hashCode
                + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy()
                        .hashCode());
        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode
                + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode
                + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeBranchesBySquashRequest == false)
            return false;
        MergeBranchesBySquashRequest other = (MergeBranchesBySquashRequest) obj;

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
        if (other.getTargetBranch() == null ^ this.getTargetBranch() == null)
            return false;
        if (other.getTargetBranch() != null
                && other.getTargetBranch().equals(this.getTargetBranch()) == false)
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
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null
                && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null
                && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null
                && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
            return false;
        if (other.getConflictResolution() == null ^ this.getConflictResolution() == null)
            return false;
        if (other.getConflictResolution() != null
                && other.getConflictResolution().equals(this.getConflictResolution()) == false)
            return false;
        return true;
    }
}
