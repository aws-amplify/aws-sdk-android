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
 * Attempts to merge the source commit of a pull request into the specified
 * destination branch for that pull request at the specified commit using the
 * fast-forward merge strategy. If the merge is successful, it closes the pull
 * request.
 * </p>
 */
public class MergePullRequestByFastForwardRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;

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
     * The full commit ID of the original or updated commit in the pull request
     * source branch. Pass this value if you want an exception thrown if the
     * current commit ID of the tip of the source branch does not match this
     * commit ID.
     * </p>
     */
    private String sourceCommitId;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request. To get this ID, use
     *         <a>ListPullRequests</a>.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request. To get this ID,
     *            use <a>ListPullRequests</a>.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request. To get this ID,
     *            use <a>ListPullRequests</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergePullRequestByFastForwardRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
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
    public MergePullRequestByFastForwardRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request
     * source branch. Pass this value if you want an exception thrown if the
     * current commit ID of the tip of the source branch does not match this
     * commit ID.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the original or updated commit in the pull
     *         request source branch. Pass this value if you want an exception
     *         thrown if the current commit ID of the tip of the source branch
     *         does not match this commit ID.
     *         </p>
     */
    public String getSourceCommitId() {
        return sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request
     * source branch. Pass this value if you want an exception thrown if the
     * current commit ID of the tip of the source branch does not match this
     * commit ID.
     * </p>
     *
     * @param sourceCommitId <p>
     *            The full commit ID of the original or updated commit in the
     *            pull request source branch. Pass this value if you want an
     *            exception thrown if the current commit ID of the tip of the
     *            source branch does not match this commit ID.
     *            </p>
     */
    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request
     * source branch. Pass this value if you want an exception thrown if the
     * current commit ID of the tip of the source branch does not match this
     * commit ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCommitId <p>
     *            The full commit ID of the original or updated commit in the
     *            pull request source branch. Pass this value if you want an
     *            exception thrown if the current commit ID of the tip of the
     *            source branch does not match this commit ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergePullRequestByFastForwardRequest withSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getSourceCommitId() != null)
            sb.append("sourceCommitId: " + getSourceCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergePullRequestByFastForwardRequest == false)
            return false;
        MergePullRequestByFastForwardRequest other = (MergePullRequestByFastForwardRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
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
        return true;
    }
}
