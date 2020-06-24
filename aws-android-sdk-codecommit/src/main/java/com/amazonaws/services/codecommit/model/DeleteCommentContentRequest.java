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
 * Deletes the content of a comment made on a change, file, or commit in a
 * repository.
 * </p>
 */
public class DeleteCommentContentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     */
    private String commentId;

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     *
     * @return <p>
     *         The unique, system-generated ID of the comment. To get this ID,
     *         use <a>GetCommentsForComparedCommit</a> or
     *         <a>GetCommentsForPullRequest</a>.
     *         </p>
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     *
     * @param commentId <p>
     *            The unique, system-generated ID of the comment. To get this
     *            ID, use <a>GetCommentsForComparedCommit</a> or
     *            <a>GetCommentsForPullRequest</a>.
     *            </p>
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The unique, system-generated ID of the comment. To get this ID, use
     * <a>GetCommentsForComparedCommit</a> or <a>GetCommentsForPullRequest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentId <p>
     *            The unique, system-generated ID of the comment. To get this
     *            ID, use <a>GetCommentsForComparedCommit</a> or
     *            <a>GetCommentsForPullRequest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCommentContentRequest withCommentId(String commentId) {
        this.commentId = commentId;
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
        if (getCommentId() != null)
            sb.append("commentId: " + getCommentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCommentContentRequest == false)
            return false;
        DeleteCommentContentRequest other = (DeleteCommentContentRequest) obj;

        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null
                && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        return true;
    }
}
