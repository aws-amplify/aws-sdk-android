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
 * Returns information about a specific comment.
 * </p>
 */
public class Comment implements Serializable {
    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     */
    private String commentId;

    /**
     * <p>
     * The content of the comment.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     */
    private String inReplyTo;

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp
     * format.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     */
    private String authorArn;

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     */
    private Boolean deleted;

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a
     * request, ensures the request cannot be repeated with a changed parameter.
     * If a request is received with the same parameters and a token is
     * included, the request returns information about the initial request that
     * used that token.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The emoji reactions to a comment, if any, submitted by the user whose
     * credentials are associated with the call to the API.
     * </p>
     */
    private java.util.List<String> callerReactions;

    /**
     * <p>
     * A string to integer map that represents the number of individual users
     * who have responded to a comment with the specified reactions.
     * </p>
     */
    private java.util.Map<String, Integer> reactionCounts;

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     *
     * @return <p>
     *         The system-generated comment ID.
     *         </p>
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     *
     * @param commentId <p>
     *            The system-generated comment ID.
     *            </p>
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentId <p>
     *            The system-generated comment ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     *
     * @return <p>
     *         The content of the comment.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     *
     * @param content <p>
     *            The content of the comment.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The content of the comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     *
     * @return <p>
     *         The ID of the comment for which this comment is a reply, if any.
     *         </p>
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     *
     * @param inReplyTo <p>
     *            The ID of the comment for which this comment is a reply, if
     *            any.
     *            </p>
     */
    public void setInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inReplyTo <p>
     *            The ID of the comment for which this comment is a reply, if
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
        return this;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The date and time the comment was created, in timestamp format.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time the comment was created, in timestamp
     *            format.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time the comment was created, in timestamp
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp
     * format.
     * </p>
     *
     * @return <p>
     *         The date and time the comment was most recently modified, in
     *         timestamp format.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp
     * format.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time the comment was most recently modified, in
     *            timestamp format.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time the comment was most recently modified, in
     *            timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the person who posted the
     *         comment.
     *         </p>
     */
    public String getAuthorArn() {
        return authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     *
     * @param authorArn <p>
     *            The Amazon Resource Name (ARN) of the person who posted the
     *            comment.
     *            </p>
     */
    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorArn <p>
     *            The Amazon Resource Name (ARN) of the person who posted the
     *            comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withAuthorArn(String authorArn) {
        this.authorArn = authorArn;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the comment has been deleted.
     *         </p>
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the comment has been deleted.
     *         </p>
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     *
     * @param deleted <p>
     *            A Boolean value indicating whether the comment has been
     *            deleted.
     *            </p>
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleted <p>
     *            A Boolean value indicating whether the comment has been
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a
     * request, ensures the request cannot be repeated with a changed parameter.
     * If a request is received with the same parameters and a token is
     * included, the request returns information about the initial request that
     * used that token.
     * </p>
     *
     * @return <p>
     *         A unique, client-generated idempotency token that, when provided
     *         in a request, ensures the request cannot be repeated with a
     *         changed parameter. If a request is received with the same
     *         parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a
     * request, ensures the request cannot be repeated with a changed parameter.
     * If a request is received with the same parameters and a token is
     * included, the request returns information about the initial request that
     * used that token.
     * </p>
     *
     * @param clientRequestToken <p>
     *            A unique, client-generated idempotency token that, when
     *            provided in a request, ensures the request cannot be repeated
     *            with a changed parameter. If a request is received with the
     *            same parameters and a token is included, the request returns
     *            information about the initial request that used that token.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a
     * request, ensures the request cannot be repeated with a changed parameter.
     * If a request is received with the same parameters and a token is
     * included, the request returns information about the initial request that
     * used that token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientRequestToken <p>
     *            A unique, client-generated idempotency token that, when
     *            provided in a request, ensures the request cannot be repeated
     *            with a changed parameter. If a request is received with the
     *            same parameters and a token is included, the request returns
     *            information about the initial request that used that token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The emoji reactions to a comment, if any, submitted by the user whose
     * credentials are associated with the call to the API.
     * </p>
     *
     * @return <p>
     *         The emoji reactions to a comment, if any, submitted by the user
     *         whose credentials are associated with the call to the API.
     *         </p>
     */
    public java.util.List<String> getCallerReactions() {
        return callerReactions;
    }

    /**
     * <p>
     * The emoji reactions to a comment, if any, submitted by the user whose
     * credentials are associated with the call to the API.
     * </p>
     *
     * @param callerReactions <p>
     *            The emoji reactions to a comment, if any, submitted by the
     *            user whose credentials are associated with the call to the
     *            API.
     *            </p>
     */
    public void setCallerReactions(java.util.Collection<String> callerReactions) {
        if (callerReactions == null) {
            this.callerReactions = null;
            return;
        }

        this.callerReactions = new java.util.ArrayList<String>(callerReactions);
    }

    /**
     * <p>
     * The emoji reactions to a comment, if any, submitted by the user whose
     * credentials are associated with the call to the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerReactions <p>
     *            The emoji reactions to a comment, if any, submitted by the
     *            user whose credentials are associated with the call to the
     *            API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withCallerReactions(String... callerReactions) {
        if (getCallerReactions() == null) {
            this.callerReactions = new java.util.ArrayList<String>(callerReactions.length);
        }
        for (String value : callerReactions) {
            this.callerReactions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The emoji reactions to a comment, if any, submitted by the user whose
     * credentials are associated with the call to the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerReactions <p>
     *            The emoji reactions to a comment, if any, submitted by the
     *            user whose credentials are associated with the call to the
     *            API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withCallerReactions(java.util.Collection<String> callerReactions) {
        setCallerReactions(callerReactions);
        return this;
    }

    /**
     * <p>
     * A string to integer map that represents the number of individual users
     * who have responded to a comment with the specified reactions.
     * </p>
     *
     * @return <p>
     *         A string to integer map that represents the number of individual
     *         users who have responded to a comment with the specified
     *         reactions.
     *         </p>
     */
    public java.util.Map<String, Integer> getReactionCounts() {
        return reactionCounts;
    }

    /**
     * <p>
     * A string to integer map that represents the number of individual users
     * who have responded to a comment with the specified reactions.
     * </p>
     *
     * @param reactionCounts <p>
     *            A string to integer map that represents the number of
     *            individual users who have responded to a comment with the
     *            specified reactions.
     *            </p>
     */
    public void setReactionCounts(java.util.Map<String, Integer> reactionCounts) {
        this.reactionCounts = reactionCounts;
    }

    /**
     * <p>
     * A string to integer map that represents the number of individual users
     * who have responded to a comment with the specified reactions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionCounts <p>
     *            A string to integer map that represents the number of
     *            individual users who have responded to a comment with the
     *            specified reactions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment withReactionCounts(java.util.Map<String, Integer> reactionCounts) {
        this.reactionCounts = reactionCounts;
        return this;
    }

    /**
     * <p>
     * A string to integer map that represents the number of individual users
     * who have responded to a comment with the specified reactions.
     * </p>
     * <p>
     * The method adds a new key-value pair into reactionCounts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into reactionCounts.
     * @param value The corresponding value of the entry to be added into
     *            reactionCounts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Comment addreactionCountsEntry(String key, Integer value) {
        if (null == this.reactionCounts) {
            this.reactionCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.reactionCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.reactionCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into reactionCounts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Comment clearreactionCountsEntries() {
        this.reactionCounts = null;
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
        if (getContent() != null)
            sb.append("content: " + getContent() + ",");
        if (getInReplyTo() != null)
            sb.append("inReplyTo: " + getInReplyTo() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getAuthorArn() != null)
            sb.append("authorArn: " + getAuthorArn() + ",");
        if (getDeleted() != null)
            sb.append("deleted: " + getDeleted() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken() + ",");
        if (getCallerReactions() != null)
            sb.append("callerReactions: " + getCallerReactions() + ",");
        if (getReactionCounts() != null)
            sb.append("reactionCounts: " + getReactionCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getInReplyTo() == null) ? 0 : getInReplyTo().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReactions() == null) ? 0 : getCallerReactions().hashCode());
        hashCode = prime * hashCode
                + ((getReactionCounts() == null) ? 0 : getReactionCounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Comment == false)
            return false;
        Comment other = (Comment) obj;

        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null
                && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getInReplyTo() == null ^ this.getInReplyTo() == null)
            return false;
        if (other.getInReplyTo() != null
                && other.getInReplyTo().equals(this.getInReplyTo()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null
                && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getCallerReactions() == null ^ this.getCallerReactions() == null)
            return false;
        if (other.getCallerReactions() != null
                && other.getCallerReactions().equals(this.getCallerReactions()) == false)
            return false;
        if (other.getReactionCounts() == null ^ this.getReactionCounts() == null)
            return false;
        if (other.getReactionCounts() != null
                && other.getReactionCounts().equals(this.getReactionCounts()) == false)
            return false;
        return true;
    }
}
