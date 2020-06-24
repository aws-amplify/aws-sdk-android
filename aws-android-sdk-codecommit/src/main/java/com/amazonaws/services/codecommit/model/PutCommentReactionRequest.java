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
 * Adds or updates a reaction to a specified comment for the user whose identity
 * is used to make the request. You can only add or update a reaction for
 * yourself. You cannot add, modify, or delete a reaction for another user.
 * </p>
 */
public class PutCommentReactionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the comment to which you want to add or update a reaction.
     * </p>
     */
    private String commentId;

    /**
     * <p>
     * The emoji reaction you want to add or update. To remove a reaction,
     * provide a value of blank or null. You can also provide the value of none.
     * For information about emoji reaction values supported in AWS CodeCommit,
     * see the <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     * >AWS CodeCommit User Guide</a>.
     * </p>
     */
    private String reactionValue;

    /**
     * <p>
     * The ID of the comment to which you want to add or update a reaction.
     * </p>
     *
     * @return <p>
     *         The ID of the comment to which you want to add or update a
     *         reaction.
     *         </p>
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * <p>
     * The ID of the comment to which you want to add or update a reaction.
     * </p>
     *
     * @param commentId <p>
     *            The ID of the comment to which you want to add or update a
     *            reaction.
     *            </p>
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The ID of the comment to which you want to add or update a reaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentId <p>
     *            The ID of the comment to which you want to add or update a
     *            reaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutCommentReactionRequest withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * <p>
     * The emoji reaction you want to add or update. To remove a reaction,
     * provide a value of blank or null. You can also provide the value of none.
     * For information about emoji reaction values supported in AWS CodeCommit,
     * see the <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     * >AWS CodeCommit User Guide</a>.
     * </p>
     *
     * @return <p>
     *         The emoji reaction you want to add or update. To remove a
     *         reaction, provide a value of blank or null. You can also provide
     *         the value of none. For information about emoji reaction values
     *         supported in AWS CodeCommit, see the <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     *         >AWS CodeCommit User Guide</a>.
     *         </p>
     */
    public String getReactionValue() {
        return reactionValue;
    }

    /**
     * <p>
     * The emoji reaction you want to add or update. To remove a reaction,
     * provide a value of blank or null. You can also provide the value of none.
     * For information about emoji reaction values supported in AWS CodeCommit,
     * see the <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     * >AWS CodeCommit User Guide</a>.
     * </p>
     *
     * @param reactionValue <p>
     *            The emoji reaction you want to add or update. To remove a
     *            reaction, provide a value of blank or null. You can also
     *            provide the value of none. For information about emoji
     *            reaction values supported in AWS CodeCommit, see the <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     *            >AWS CodeCommit User Guide</a>.
     *            </p>
     */
    public void setReactionValue(String reactionValue) {
        this.reactionValue = reactionValue;
    }

    /**
     * <p>
     * The emoji reaction you want to add or update. To remove a reaction,
     * provide a value of blank or null. You can also provide the value of none.
     * For information about emoji reaction values supported in AWS CodeCommit,
     * see the <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     * >AWS CodeCommit User Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionValue <p>
     *            The emoji reaction you want to add or update. To remove a
     *            reaction, provide a value of blank or null. You can also
     *            provide the value of none. For information about emoji
     *            reaction values supported in AWS CodeCommit, see the <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-commit-comment.html#emoji-reaction-table"
     *            >AWS CodeCommit User Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutCommentReactionRequest withReactionValue(String reactionValue) {
        this.reactionValue = reactionValue;
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
            sb.append("commentId: " + getCommentId() + ",");
        if (getReactionValue() != null)
            sb.append("reactionValue: " + getReactionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode
                + ((getReactionValue() == null) ? 0 : getReactionValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutCommentReactionRequest == false)
            return false;
        PutCommentReactionRequest other = (PutCommentReactionRequest) obj;

        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null
                && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getReactionValue() == null ^ this.getReactionValue() == null)
            return false;
        if (other.getReactionValue() != null
                && other.getReactionValue().equals(this.getReactionValue()) == false)
            return false;
        return true;
    }
}
