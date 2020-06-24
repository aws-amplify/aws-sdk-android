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
 * Information about an update to the source branch of a pull request.
 * </p>
 */
public class PullRequestSourceReferenceUpdatedEventMetadata implements Serializable {
    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the
     * tip of the branch at the time the pull request was updated.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of
     * the branch at the time the pull request was updated.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the
     * destination branch have in common.
     * </p>
     */
    private String mergeBase;

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where the pull request was updated.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where the pull request was updated.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was updated.
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
     *            The name of the repository where the pull request was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestSourceReferenceUpdatedEventMetadata withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the
     * tip of the branch at the time the pull request was updated.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit in the destination branch that
     *         was the tip of the branch at the time the pull request was
     *         updated.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the
     * tip of the branch at the time the pull request was updated.
     * </p>
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit in the destination branch
     *            that was the tip of the branch at the time the pull request
     *            was updated.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the
     * tip of the branch at the time the pull request was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit in the destination branch
     *            that was the tip of the branch at the time the pull request
     *            was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestSourceReferenceUpdatedEventMetadata withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of
     * the branch at the time the pull request was updated.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit in the source branch that was
     *         the tip of the branch at the time the pull request was updated.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of
     * the branch at the time the pull request was updated.
     * </p>
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit in the source branch that was
     *            the tip of the branch at the time the pull request was
     *            updated.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of
     * the branch at the time the pull request was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit in the source branch that was
     *            the tip of the branch at the time the pull request was
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestSourceReferenceUpdatedEventMetadata withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
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
    public PullRequestSourceReferenceUpdatedEventMetadata withMergeBase(String mergeBase) {
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
        if (getBeforeCommitId() != null)
            sb.append("beforeCommitId: " + getBeforeCommitId() + ",");
        if (getAfterCommitId() != null)
            sb.append("afterCommitId: " + getAfterCommitId() + ",");
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
                + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestSourceReferenceUpdatedEventMetadata == false)
            return false;
        PullRequestSourceReferenceUpdatedEventMetadata other = (PullRequestSourceReferenceUpdatedEventMetadata) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null
                && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null
                && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
            return false;
        if (other.getMergeBase() == null ^ this.getMergeBase() == null)
            return false;
        if (other.getMergeBase() != null
                && other.getMergeBase().equals(this.getMergeBase()) == false)
            return false;
        return true;
    }
}
