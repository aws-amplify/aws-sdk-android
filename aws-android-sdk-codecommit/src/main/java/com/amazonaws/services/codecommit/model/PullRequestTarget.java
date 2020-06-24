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
 * Returns information about a pull request target.
 * </p>
 */
public class PullRequestTarget implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the pull request source and
     * destination branches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     */
    private String sourceReference;

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     */
    private String destinationReference;

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the
     * commit where the pull request was or will be merged.
     * </p>
     */
    private String destinationCommit;

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the
     * pull request. If the pull request branch is updated by a push while the
     * pull request is open, the commit ID changes to reflect the new tip of the
     * branch.
     * </p>
     */
    private String sourceCommit;

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     */
    private String mergeBase;

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the
     * merge has been made.
     * </p>
     */
    private MergeMetadata mergeMetadata;

    /**
     * <p>
     * The name of the repository that contains the pull request source and
     * destination branches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the pull request source
     *         and destination branches.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request source and
     * destination branches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the pull request
     *            source and destination branches.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request source and
     * destination branches.
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
     *            The name of the repository that contains the pull request
     *            source and destination branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     *
     * @return <p>
     *         The branch of the repository that contains the changes for the
     *         pull request. Also known as the source branch.
     *         </p>
     */
    public String getSourceReference() {
        return sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     *
     * @param sourceReference <p>
     *            The branch of the repository that contains the changes for the
     *            pull request. Also known as the source branch.
     *            </p>
     */
    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceReference <p>
     *            The branch of the repository that contains the changes for the
     *            pull request. Also known as the source branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
        return this;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     *
     * @return <p>
     *         The branch of the repository where the pull request changes are
     *         merged. Also known as the destination branch.
     *         </p>
     */
    public String getDestinationReference() {
        return destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     *
     * @param destinationReference <p>
     *            The branch of the repository where the pull request changes
     *            are merged. Also known as the destination branch.
     *            </p>
     */
    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationReference <p>
     *            The branch of the repository where the pull request changes
     *            are merged. Also known as the destination branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
        return this;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the
     * commit where the pull request was or will be merged.
     * </p>
     *
     * @return <p>
     *         The full commit ID that is the tip of the destination branch.
     *         This is the commit where the pull request was or will be merged.
     *         </p>
     */
    public String getDestinationCommit() {
        return destinationCommit;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the
     * commit where the pull request was or will be merged.
     * </p>
     *
     * @param destinationCommit <p>
     *            The full commit ID that is the tip of the destination branch.
     *            This is the commit where the pull request was or will be
     *            merged.
     *            </p>
     */
    public void setDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the
     * commit where the pull request was or will be merged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCommit <p>
     *            The full commit ID that is the tip of the destination branch.
     *            This is the commit where the pull request was or will be
     *            merged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the
     * pull request. If the pull request branch is updated by a push while the
     * pull request is open, the commit ID changes to reflect the new tip of the
     * branch.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the tip of the source branch used to create
     *         the pull request. If the pull request branch is updated by a push
     *         while the pull request is open, the commit ID changes to reflect
     *         the new tip of the branch.
     *         </p>
     */
    public String getSourceCommit() {
        return sourceCommit;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the
     * pull request. If the pull request branch is updated by a push while the
     * pull request is open, the commit ID changes to reflect the new tip of the
     * branch.
     * </p>
     *
     * @param sourceCommit <p>
     *            The full commit ID of the tip of the source branch used to
     *            create the pull request. If the pull request branch is updated
     *            by a push while the pull request is open, the commit ID
     *            changes to reflect the new tip of the branch.
     *            </p>
     */
    public void setSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the
     * pull request. If the pull request branch is updated by a push while the
     * pull request is open, the commit ID changes to reflect the new tip of the
     * branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommit <p>
     *            The full commit ID of the tip of the source branch used to
     *            create the pull request. If the pull request branch is updated
     *            by a push while the pull request is open, the commit ID
     *            changes to reflect the new tip of the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
        return this;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     *
     * @return <p>
     *         The commit ID of the most recent commit that the source branch
     *         and the destination branch have in common.
     *         </p>
     */
    public String getMergeBase() {
        return mergeBase;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     *
     * @param mergeBase <p>
     *            The commit ID of the most recent commit that the source branch
     *            and the destination branch have in common.
     *            </p>
     */
    public void setMergeBase(String mergeBase) {
        this.mergeBase = mergeBase;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeBase <p>
     *            The commit ID of the most recent commit that the source branch
     *            and the destination branch have in common.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withMergeBase(String mergeBase) {
        this.mergeBase = mergeBase;
        return this;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the
     * merge has been made.
     * </p>
     *
     * @return <p>
     *         Returns metadata about the state of the merge, including whether
     *         the merge has been made.
     *         </p>
     */
    public MergeMetadata getMergeMetadata() {
        return mergeMetadata;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the
     * merge has been made.
     * </p>
     *
     * @param mergeMetadata <p>
     *            Returns metadata about the state of the merge, including
     *            whether the merge has been made.
     *            </p>
     */
    public void setMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the
     * merge has been made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeMetadata <p>
     *            Returns metadata about the state of the merge, including
     *            whether the merge has been made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestTarget withMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
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
        if (getSourceReference() != null)
            sb.append("sourceReference: " + getSourceReference() + ",");
        if (getDestinationReference() != null)
            sb.append("destinationReference: " + getDestinationReference() + ",");
        if (getDestinationCommit() != null)
            sb.append("destinationCommit: " + getDestinationCommit() + ",");
        if (getSourceCommit() != null)
            sb.append("sourceCommit: " + getSourceCommit() + ",");
        if (getMergeBase() != null)
            sb.append("mergeBase: " + getMergeBase() + ",");
        if (getMergeMetadata() != null)
            sb.append("mergeMetadata: " + getMergeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceReference() == null) ? 0 : getSourceReference().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommit() == null) ? 0 : getDestinationCommit().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCommit() == null) ? 0 : getSourceCommit().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        hashCode = prime * hashCode
                + ((getMergeMetadata() == null) ? 0 : getMergeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestTarget == false)
            return false;
        PullRequestTarget other = (PullRequestTarget) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceReference() == null ^ this.getSourceReference() == null)
            return false;
        if (other.getSourceReference() != null
                && other.getSourceReference().equals(this.getSourceReference()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null
                && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        if (other.getDestinationCommit() == null ^ this.getDestinationCommit() == null)
            return false;
        if (other.getDestinationCommit() != null
                && other.getDestinationCommit().equals(this.getDestinationCommit()) == false)
            return false;
        if (other.getSourceCommit() == null ^ this.getSourceCommit() == null)
            return false;
        if (other.getSourceCommit() != null
                && other.getSourceCommit().equals(this.getSourceCommit()) == false)
            return false;
        if (other.getMergeBase() == null ^ this.getMergeBase() == null)
            return false;
        if (other.getMergeBase() != null
                && other.getMergeBase().equals(this.getMergeBase()) == false)
            return false;
        if (other.getMergeMetadata() == null ^ this.getMergeMetadata() == null)
            return false;
        if (other.getMergeMetadata() != null
                && other.getMergeMetadata().equals(this.getMergeMetadata()) == false)
            return false;
        return true;
    }
}
