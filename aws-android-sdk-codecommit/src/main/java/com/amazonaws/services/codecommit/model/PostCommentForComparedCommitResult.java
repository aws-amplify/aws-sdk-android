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

public class PostCommentForComparedCommitResult implements Serializable {
    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison
     * between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * In the directionality you established, the full commit ID of the before
     * commit.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * In the directionality you established, the full commit ID of the after
     * commit.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * In the directionality you established, the blob ID of the before blob.
     * </p>
     */
    private String beforeBlobId;

    /**
     * <p>
     * In the directionality you established, the blob ID of the after blob.
     * </p>
     */
    private String afterBlobId;

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
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
     * The name of the repository where you posted a comment on the comparison
     * between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you posted a comment on the
     *         comparison between commits.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison
     * between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you posted a comment on the
     *            comparison between commits.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison
     * between commits.
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
     *            The name of the repository where you posted a comment on the
     *            comparison between commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the before
     * commit.
     * </p>
     *
     * @return <p>
     *         In the directionality you established, the full commit ID of the
     *         before commit.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the before
     * commit.
     * </p>
     *
     * @param beforeCommitId <p>
     *            In the directionality you established, the full commit ID of
     *            the before commit.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the before
     * commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            In the directionality you established, the full commit ID of
     *            the before commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the after
     * commit.
     * </p>
     *
     * @return <p>
     *         In the directionality you established, the full commit ID of the
     *         after commit.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the after
     * commit.
     * </p>
     *
     * @param afterCommitId <p>
     *            In the directionality you established, the full commit ID of
     *            the after commit.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the after
     * commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            In the directionality you established, the full commit ID of
     *            the after commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the before blob.
     * </p>
     *
     * @return <p>
     *         In the directionality you established, the blob ID of the before
     *         blob.
     *         </p>
     */
    public String getBeforeBlobId() {
        return beforeBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the before blob.
     * </p>
     *
     * @param beforeBlobId <p>
     *            In the directionality you established, the blob ID of the
     *            before blob.
     *            </p>
     */
    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the before blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeBlobId <p>
     *            In the directionality you established, the blob ID of the
     *            before blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the after blob.
     * </p>
     *
     * @return <p>
     *         In the directionality you established, the blob ID of the after
     *         blob.
     *         </p>
     */
    public String getAfterBlobId() {
        return afterBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the after blob.
     * </p>
     *
     * @param afterBlobId <p>
     *            In the directionality you established, the blob ID of the
     *            after blob.
     *            </p>
     */
    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the after blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterBlobId <p>
     *            In the directionality you established, the blob ID of the
     *            after blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
        return this;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     *
     * @return <p>
     *         The location of the comment in the comparison between the two
     *         commits.
     *         </p>
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     *
     * @param location <p>
     *            The location of the comment in the comparison between the two
     *            commits.
     *            </p>
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the comment in the comparison between the two
     *            commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitResult withLocation(Location location) {
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
    public PostCommentForComparedCommitResult withComment(Comment comment) {
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

        if (obj instanceof PostCommentForComparedCommitResult == false)
            return false;
        PostCommentForComparedCommitResult other = (PostCommentForComparedCommitResult) obj;

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
