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
 * Information about the reaction values provided by users on a comment.
 * </p>
 */
public class ReactionForComment implements Serializable {
    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     */
    private ReactionValueFormats reaction;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to
     * the comment.
     * </p>
     */
    private java.util.List<String> reactionUsers;

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose
     * identities have been subsequently deleted from IAM. While these IAM users
     * or roles no longer exist, the reactions might still appear in total
     * reaction counts.
     * </p>
     */
    private Integer reactionsFromDeletedUsersCount;

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     *
     * @return <p>
     *         The reaction for a specified comment.
     *         </p>
     */
    public ReactionValueFormats getReaction() {
        return reaction;
    }

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     *
     * @param reaction <p>
     *            The reaction for a specified comment.
     *            </p>
     */
    public void setReaction(ReactionValueFormats reaction) {
        this.reaction = reaction;
    }

    /**
     * <p>
     * The reaction for a specified comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reaction <p>
     *            The reaction for a specified comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionForComment withReaction(ReactionValueFormats reaction) {
        this.reaction = reaction;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to
     * the comment.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of users who have provided
     *         reactions to the comment.
     *         </p>
     */
    public java.util.List<String> getReactionUsers() {
        return reactionUsers;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to
     * the comment.
     * </p>
     *
     * @param reactionUsers <p>
     *            The Amazon Resource Names (ARNs) of users who have provided
     *            reactions to the comment.
     *            </p>
     */
    public void setReactionUsers(java.util.Collection<String> reactionUsers) {
        if (reactionUsers == null) {
            this.reactionUsers = null;
            return;
        }

        this.reactionUsers = new java.util.ArrayList<String>(reactionUsers);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to
     * the comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionUsers <p>
     *            The Amazon Resource Names (ARNs) of users who have provided
     *            reactions to the comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionForComment withReactionUsers(String... reactionUsers) {
        if (getReactionUsers() == null) {
            this.reactionUsers = new java.util.ArrayList<String>(reactionUsers.length);
        }
        for (String value : reactionUsers) {
            this.reactionUsers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of users who have provided reactions to
     * the comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionUsers <p>
     *            The Amazon Resource Names (ARNs) of users who have provided
     *            reactions to the comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionForComment withReactionUsers(java.util.Collection<String> reactionUsers) {
        setReactionUsers(reactionUsers);
        return this;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose
     * identities have been subsequently deleted from IAM. While these IAM users
     * or roles no longer exist, the reactions might still appear in total
     * reaction counts.
     * </p>
     *
     * @return <p>
     *         A numerical count of users who reacted with the specified emoji
     *         whose identities have been subsequently deleted from IAM. While
     *         these IAM users or roles no longer exist, the reactions might
     *         still appear in total reaction counts.
     *         </p>
     */
    public Integer getReactionsFromDeletedUsersCount() {
        return reactionsFromDeletedUsersCount;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose
     * identities have been subsequently deleted from IAM. While these IAM users
     * or roles no longer exist, the reactions might still appear in total
     * reaction counts.
     * </p>
     *
     * @param reactionsFromDeletedUsersCount <p>
     *            A numerical count of users who reacted with the specified
     *            emoji whose identities have been subsequently deleted from
     *            IAM. While these IAM users or roles no longer exist, the
     *            reactions might still appear in total reaction counts.
     *            </p>
     */
    public void setReactionsFromDeletedUsersCount(Integer reactionsFromDeletedUsersCount) {
        this.reactionsFromDeletedUsersCount = reactionsFromDeletedUsersCount;
    }

    /**
     * <p>
     * A numerical count of users who reacted with the specified emoji whose
     * identities have been subsequently deleted from IAM. While these IAM users
     * or roles no longer exist, the reactions might still appear in total
     * reaction counts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionsFromDeletedUsersCount <p>
     *            A numerical count of users who reacted with the specified
     *            emoji whose identities have been subsequently deleted from
     *            IAM. While these IAM users or roles no longer exist, the
     *            reactions might still appear in total reaction counts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionForComment withReactionsFromDeletedUsersCount(
            Integer reactionsFromDeletedUsersCount) {
        this.reactionsFromDeletedUsersCount = reactionsFromDeletedUsersCount;
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
        if (getReaction() != null)
            sb.append("reaction: " + getReaction() + ",");
        if (getReactionUsers() != null)
            sb.append("reactionUsers: " + getReactionUsers() + ",");
        if (getReactionsFromDeletedUsersCount() != null)
            sb.append("reactionsFromDeletedUsersCount: " + getReactionsFromDeletedUsersCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReaction() == null) ? 0 : getReaction().hashCode());
        hashCode = prime * hashCode
                + ((getReactionUsers() == null) ? 0 : getReactionUsers().hashCode());
        hashCode = prime
                * hashCode
                + ((getReactionsFromDeletedUsersCount() == null) ? 0
                        : getReactionsFromDeletedUsersCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactionForComment == false)
            return false;
        ReactionForComment other = (ReactionForComment) obj;

        if (other.getReaction() == null ^ this.getReaction() == null)
            return false;
        if (other.getReaction() != null && other.getReaction().equals(this.getReaction()) == false)
            return false;
        if (other.getReactionUsers() == null ^ this.getReactionUsers() == null)
            return false;
        if (other.getReactionUsers() != null
                && other.getReactionUsers().equals(this.getReactionUsers()) == false)
            return false;
        if (other.getReactionsFromDeletedUsersCount() == null
                ^ this.getReactionsFromDeletedUsersCount() == null)
            return false;
        if (other.getReactionsFromDeletedUsersCount() != null
                && other.getReactionsFromDeletedUsersCount().equals(
                        this.getReactionsFromDeletedUsersCount()) == false)
            return false;
        return true;
    }
}
