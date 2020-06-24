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
 * Posts a comment on the comparison between two commits.
 * </p>
 */
public class PostCommentForComparedCommitRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the repository where you want to post a comment on the
     * comparison between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit. Required for commenting on any commit unless that
     * commit is the initial commit.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     */
    private Location location;

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     */
    private String content;

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
     * The name of the repository where you want to post a comment on the
     * comparison between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to post a comment on
     *         the comparison between commits.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on the
     * comparison between commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to post a comment on
     *            the comparison between commits.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on the
     * comparison between commits.
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
     *            The name of the repository where you want to post a comment on
     *            the comparison between commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit. Required for commenting on any commit unless that
     * commit is the initial commit.
     * </p>
     *
     * @return <p>
     *         To establish the directionality of the comparison, the full
     *         commit ID of the before commit. Required for commenting on any
     *         commit unless that commit is the initial commit.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit. Required for commenting on any commit unless that
     * commit is the initial commit.
     * </p>
     *
     * @param beforeCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the before commit. Required for commenting on any
     *            commit unless that commit is the initial commit.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit. Required for commenting on any commit unless that
     * commit is the initial commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the before commit. Required for commenting on any
     *            commit unless that commit is the initial commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitRequest withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     *
     * @return <p>
     *         To establish the directionality of the comparison, the full
     *         commit ID of the after commit.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     *
     * @param afterCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the after commit.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the after commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitRequest withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
        return this;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     *
     * @return <p>
     *         The location of the comparison where you want to comment.
     *         </p>
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     *
     * @param location <p>
     *            The location of the comparison where you want to comment.
     *            </p>
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location of the comparison where you want to comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitRequest withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     *
     * @return <p>
     *         The content of the comment you want to make.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     *
     * @param content <p>
     *            The content of the comment you want to make.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The content of the comment you want to make.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostCommentForComparedCommitRequest withContent(String content) {
        this.content = content;
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
    public PostCommentForComparedCommitRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getContent() != null)
            sb.append("content: " + getContent() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
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
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCommentForComparedCommitRequest == false)
            return false;
        PostCommentForComparedCommitRequest other = (PostCommentForComparedCommitRequest) obj;

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
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
