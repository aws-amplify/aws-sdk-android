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
 * Returns information about comments on the comparison between two commits.
 * </p>
 */
public class CommentsForComparedCommit implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The full commit ID of the commit used to establish the before of the
     * comparison.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * The full commit ID of the commit used to establish the after of the
     * comparison.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * The full blob ID of the commit used to establish the before of the
     * comparison.
     * </p>
     */
    private String beforeBlobId;

    /**
     * <p>
     * The full blob ID of the commit used to establish the after of the
     * comparison.
     * </p>
     */
    private String afterBlobId;

    /**
     * <p>
     * Location information about the comment on the comparison, including the
     * file name, line number, and whether the version of the file where the
     * comment was made is BEFORE or AFTER.
     * </p>
     */
    private Location location;

    /**
     * <p>
     * An array of comment objects. Each comment object contains information
     * about a comment on the comparison between commits.
     * </p>
     */
    private java.util.List<Comment> comments;

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the compared commits.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the compared commits.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the compared commits.
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
     *            The name of the repository that contains the compared commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the before of the
     * comparison.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit used to establish the before of
     *         the comparison.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the before of the
     * comparison.
     * </p>
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit used to establish the before
     *            of the comparison.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the before of the
     * comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            The full commit ID of the commit used to establish the before
     *            of the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the after of the
     * comparison.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit used to establish the after of
     *         the comparison.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the after of the
     * comparison.
     * </p>
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit used to establish the after
     *            of the comparison.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the after of the
     * comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            The full commit ID of the commit used to establish the after
     *            of the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
        return this;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the before of the
     * comparison.
     * </p>
     *
     * @return <p>
     *         The full blob ID of the commit used to establish the before of
     *         the comparison.
     *         </p>
     */
    public String getBeforeBlobId() {
        return beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the before of the
     * comparison.
     * </p>
     *
     * @param beforeBlobId <p>
     *            The full blob ID of the commit used to establish the before of
     *            the comparison.
     *            </p>
     */
    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the before of the
     * comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeBlobId <p>
     *            The full blob ID of the commit used to establish the before of
     *            the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
        return this;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the after of the
     * comparison.
     * </p>
     *
     * @return <p>
     *         The full blob ID of the commit used to establish the after of the
     *         comparison.
     *         </p>
     */
    public String getAfterBlobId() {
        return afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the after of the
     * comparison.
     * </p>
     *
     * @param afterBlobId <p>
     *            The full blob ID of the commit used to establish the after of
     *            the comparison.
     *            </p>
     */
    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the after of the
     * comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterBlobId <p>
     *            The full blob ID of the commit used to establish the after of
     *            the comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
        return this;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the
     * file name, line number, and whether the version of the file where the
     * comment was made is BEFORE or AFTER.
     * </p>
     *
     * @return <p>
     *         Location information about the comment on the comparison,
     *         including the file name, line number, and whether the version of
     *         the file where the comment was made is BEFORE or AFTER.
     *         </p>
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the
     * file name, line number, and whether the version of the file where the
     * comment was made is BEFORE or AFTER.
     * </p>
     *
     * @param location <p>
     *            Location information about the comment on the comparison,
     *            including the file name, line number, and whether the version
     *            of the file where the comment was made is BEFORE or AFTER.
     *            </p>
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the
     * file name, line number, and whether the version of the file where the
     * comment was made is BEFORE or AFTER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Location information about the comment on the comparison,
     *            including the file name, line number, and whether the version
     *            of the file where the comment was made is BEFORE or AFTER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information
     * about a comment on the comparison between commits.
     * </p>
     *
     * @return <p>
     *         An array of comment objects. Each comment object contains
     *         information about a comment on the comparison between commits.
     *         </p>
     */
    public java.util.List<Comment> getComments() {
        return comments;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information
     * about a comment on the comparison between commits.
     * </p>
     *
     * @param comments <p>
     *            An array of comment objects. Each comment object contains
     *            information about a comment on the comparison between commits.
     *            </p>
     */
    public void setComments(java.util.Collection<Comment> comments) {
        if (comments == null) {
            this.comments = null;
            return;
        }

        this.comments = new java.util.ArrayList<Comment>(comments);
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information
     * about a comment on the comparison between commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comments <p>
     *            An array of comment objects. Each comment object contains
     *            information about a comment on the comparison between commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withComments(Comment... comments) {
        if (getComments() == null) {
            this.comments = new java.util.ArrayList<Comment>(comments.length);
        }
        for (Comment value : comments) {
            this.comments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information
     * about a comment on the comparison between commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comments <p>
     *            An array of comment objects. Each comment object contains
     *            information about a comment on the comparison between commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommentsForComparedCommit withComments(java.util.Collection<Comment> comments) {
        setComments(comments);
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
        if (getComments() != null)
            sb.append("comments: " + getComments());
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
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommentsForComparedCommit == false)
            return false;
        CommentsForComparedCommit other = (CommentsForComparedCommit) obj;

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
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        return true;
    }
}
