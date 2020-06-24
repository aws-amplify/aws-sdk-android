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
 * Metadata about the pull request that is used when comparing the pull request
 * source with its destination.
 * </p>
 */
public class PullRequestCreatedEventMetadata implements Serializable {
    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was
     * created.
     * </p>
     */
    private String sourceCommitId;

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination
     * branch when the pull request was created.
     * </p>
     */
    private String destinationCommitId;

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     */
    private String mergeBase;

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where the pull request was created.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where the pull request was created.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
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
     *            The name of the repository where the pull request was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestCreatedEventMetadata withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was
     * created.
     * </p>
     *
     * @return <p>
     *         The commit ID on the source branch used when the pull request was
     *         created.
     *         </p>
     */
    public String getSourceCommitId() {
        return sourceCommitId;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was
     * created.
     * </p>
     *
     * @param sourceCommitId <p>
     *            The commit ID on the source branch used when the pull request
     *            was created.
     *            </p>
     */
    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommitId <p>
     *            The commit ID on the source branch used when the pull request
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestCreatedEventMetadata withSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
        return this;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination
     * branch when the pull request was created.
     * </p>
     *
     * @return <p>
     *         The commit ID of the tip of the branch specified as the
     *         destination branch when the pull request was created.
     *         </p>
     */
    public String getDestinationCommitId() {
        return destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination
     * branch when the pull request was created.
     * </p>
     *
     * @param destinationCommitId <p>
     *            The commit ID of the tip of the branch specified as the
     *            destination branch when the pull request was created.
     *            </p>
     */
    public void setDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination
     * branch when the pull request was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCommitId <p>
     *            The commit ID of the tip of the branch specified as the
     *            destination branch when the pull request was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestCreatedEventMetadata withDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
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
    public PullRequestCreatedEventMetadata withMergeBase(String mergeBase) {
        this.mergeBase = mergeBase;
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
        if (getSourceCommitId() != null)
            sb.append("sourceCommitId: " + getSourceCommitId() + ",");
        if (getDestinationCommitId() != null)
            sb.append("destinationCommitId: " + getDestinationCommitId() + ",");
        if (getMergeBase() != null)
            sb.append("mergeBase: " + getMergeBase());
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
                + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestCreatedEventMetadata == false)
            return false;
        PullRequestCreatedEventMetadata other = (PullRequestCreatedEventMetadata) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null
                && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null
                && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
            return false;
        if (other.getMergeBase() == null ^ this.getMergeBase() == null)
            return false;
        if (other.getMergeBase() != null
                && other.getMergeBase().equals(this.getMergeBase()) == false)
            return false;
        return true;
    }
}
