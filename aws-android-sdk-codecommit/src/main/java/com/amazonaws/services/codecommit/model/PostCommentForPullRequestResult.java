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

public class PostCommentForPullRequestResult implements Serializable {
    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the
     * pull request, or in the case of an updated pull request, the full commit
     * ID of the commit used to update the pull request.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull
     * request is merged.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the before
     * blob.
     * </p>
     */
    private String beforeBlobId;

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the after blob.
     * </p>
     */
    private String afterBlobId;

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     */
    private Location location;

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     */
    private Comment comment;

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you posted a comment on a pull
     *         request.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you posted a comment on a
     *            pull request.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
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
     *            The name of the repository where you posted a comment on a
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the
     * pull request, or in the case of an updated pull request, the full commit
     * ID of the commit used to update the pull request.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit in the source branch used to
     *         create the pull request, or in the case of an updated pull
     *         request, the full commit ID of the commit used to update the pull
     *         request.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the
     * pull request, or in the case of an updated pull request, the full commit
     * ID of the commit used to update the pull request.
     * </p>
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit in the source branch used to
     *            create the pull request, or in the case of an updated pull
     *            request, the full commit ID of the commit used to update the
     *            pull request.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the
     * pull request, or in the case of an updated pull request, the full commit
     * ID of the commit used to update the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit in the source branch used to
     *            create the pull request, or in the case of an updated pull
     *            request, the full commit ID of the commit used to update the
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull
     * request is merged.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit in the destination branch where
     *         the pull request is merged.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull
     * request is merged.
     * </p>
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit in the destination branch
     *            where the pull request is merged.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull
     * request is merged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit in the destination branch
     *            where the pull request is merged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
        return this;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the before
     * blob.
     * </p>
     *
     * @return <p>
     *         In the directionality of the pull request, the blob ID of the
     *         before blob.
     *         </p>
     */
    public String getBeforeBlobId() {
        return beforeBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the before
     * blob.
     * </p>
     *
     * @param beforeBlobId <p>
     *            In the directionality of the pull request, the blob ID of the
     *            before blob.
     *            </p>
     */
    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the before
     * blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeBlobId <p>
     *            In the directionality of the pull request, the blob ID of the
     *            before blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
        return this;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the after blob.
     * </p>
     *
     * @return <p>
     *         In the directionality of the pull request, the blob ID of the
     *         after blob.
     *         </p>
     */
    public String getAfterBlobId() {
        return afterBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the after blob.
     * </p>
     *
     * @param afterBlobId <p>
     *            In the directionality of the pull request, the blob ID of the
     *            after blob.
     *            </p>
     */
    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the after blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterBlobId <p>
     *            In the directionality of the pull request, the blob ID of the
     *            after blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
        return this;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     *
     * @return <p>
     *         The location of the change where you posted your comment.
     *         </p>
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     *
     * @param location <p>
     *            The location of the change where you posted your comment.
     *            </p>
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the change where you posted your comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     *
     * @return <p>
     *         The content of the comment you posted.
     *         </p>
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     *
     * @param comment <p>
     *            The content of the comment you posted.
     *            </p>
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            The content of the comment you posted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForPullRequestResult withComment(Comment comment) {
        this.comment = comment;
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getBeforeCommitId() != null)
            sb.append("beforeCommitId: " + getBeforeCommitId() + ",");
        if (getAfterCommitId() != null)
            sb.append("afterCommitId: " + getAfterCommitId() + ",");
        if (getBeforeBlobId() != null)
            sb.append("beforeBlobId: " + getBeforeBlobId() + ",");
        if (getAfterBlobId() != null)
            sb.append("afterBlobId: " + getAfterBlobId() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getComment() != null)
            sb.append("comment: " + getComment());
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
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getBeforeBlobId() == null) ? 0 : getBeforeBlobId().hashCode());
        hashCode = prime * hashCode
                + ((getAfterBlobId() == null) ? 0 : getAfterBlobId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCommentForPullRequestResult == false)
            return false;
        PostCommentForPullRequestResult other = (PostCommentForPullRequestResult) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
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
        if (other.getBeforeBlobId() == null ^ this.getBeforeBlobId() == null)
            return false;
        if (other.getBeforeBlobId() != null
                && other.getBeforeBlobId().equals(this.getBeforeBlobId()) == false)
            return false;
        if (other.getAfterBlobId() == null ^ this.getAfterBlobId() == null)
            return false;
        if (other.getAfterBlobId() != null
                && other.getAfterBlobId().equals(this.getAfterBlobId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
