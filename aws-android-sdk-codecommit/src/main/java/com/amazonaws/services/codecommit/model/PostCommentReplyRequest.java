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
 * Posts a comment in reply to an existing comment on a comparison between
 * commits or a pull request.
 * </p>
 */
public class PostCommentReplyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The system-generated ID of the comment to which you want to reply. To get
     * this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     */
    private String inReplyTo;

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
     * The contents of your reply to a comment.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The system-generated ID of the comment to which you want to reply. To get
     * this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the comment to which you want to
     *         reply. To get this ID, use <a>GetCommentsForComparedCommit</a> or
     *         <a>GetCommentsForPullRequest</a>.
     *         </p>
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * <p>
     * The system-generated ID of the comment to which you want to reply. To get
     * this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     *
     * @param inReplyTo <p>
     *            The system-generated ID of the comment to which you want to
     *            reply. To get this ID, use <a>GetCommentsForComparedCommit</a>
     *            or <a>GetCommentsForPullRequest</a>.
     *            </p>
     */
    public void setInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    /**
     * <p>
     * The system-generated ID of the comment to which you want to reply. To get
     * this ID, use <a>GetCommentsForComparedCommit</a> or
     * <a>GetCommentsForPullRequest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inReplyTo <p>
     *            The system-generated ID of the comment to which you want to
     *            reply. To get this ID, use <a>GetCommentsForComparedCommit</a>
     *            or <a>GetCommentsForPullRequest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentReplyRequest withInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
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
    public PostCommentReplyRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The contents of your reply to a comment.
     * </p>
     *
     * @return <p>
     *         The contents of your reply to a comment.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The contents of your reply to a comment.
     * </p>
     *
     * @param content <p>
     *            The contents of your reply to a comment.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of your reply to a comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The contents of your reply to a comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentReplyRequest withContent(String content) {
        this.content = content;
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
        if (getInReplyTo() != null)
            sb.append("inReplyTo: " + getInReplyTo() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken() + ",");
        if (getContent() != null)
            sb.append("content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInReplyTo() == null) ? 0 : getInReplyTo().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCommentReplyRequest == false)
            return false;
        PostCommentReplyRequest other = (PostCommentReplyRequest) obj;

        if (other.getInReplyTo() == null ^ this.getInReplyTo() == null)
            return false;
        if (other.getInReplyTo() != null
                && other.getInReplyTo().equals(this.getInReplyTo()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
