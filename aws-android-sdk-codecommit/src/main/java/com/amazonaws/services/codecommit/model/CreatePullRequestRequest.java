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
 * Creates a pull request in the specified repository.
 * </p>
 */
public class CreatePullRequestRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The title of the pull request. This title is used to identify the pull
     * request to other users in the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     */
    private String title;

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     */
    private String description;

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be
     * reviewed (the source branch) and the destination where the creator of the
     * pull request intends the code to be merged after the pull request is
     * closed (the destination branch).
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a
     * request, ensures the request cannot be repeated with a changed parameter.
     * If a request is received with the same parameters and a token is
     * included, the request returns information about the initial request that
     * used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS
     * SDK, an idempotency token is created for you.
     * </p>
     * </note>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The title of the pull request. This title is used to identify the pull
     * request to other users in the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @return <p>
     *         The title of the pull request. This title is used to identify the
     *         pull request to other users in the repository.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the pull request. This title is used to identify the pull
     * request to other users in the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The title of the pull request. This title is used to identify
     *            the pull request to other users in the repository.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the pull request. This title is used to identify the pull
     * request to other users in the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The title of the pull request. This title is used to identify
     *            the pull request to other users in the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @return <p>
     *         A description of the pull request.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param description <p>
     *            A description of the pull request.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param description <p>
     *            A description of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be
     * reviewed (the source branch) and the destination where the creator of the
     * pull request intends the code to be merged after the pull request is
     * closed (the destination branch).
     * </p>
     *
     * @return <p>
     *         The targets for the pull request, including the source of the
     *         code to be reviewed (the source branch) and the destination where
     *         the creator of the pull request intends the code to be merged
     *         after the pull request is closed (the destination branch).
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be
     * reviewed (the source branch) and the destination where the creator of the
     * pull request intends the code to be merged after the pull request is
     * closed (the destination branch).
     * </p>
     *
     * @param targets <p>
     *            The targets for the pull request, including the source of the
     *            code to be reviewed (the source branch) and the destination
     *            where the creator of the pull request intends the code to be
     *            merged after the pull request is closed (the destination
     *            branch).
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be
     * reviewed (the source branch) and the destination where the creator of the
     * pull request intends the code to be merged after the pull request is
     * closed (the destination branch).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets for the pull request, including the source of the
     *            code to be reviewed (the source branch) and the destination
     *            where the creator of the pull request intends the code to be
     *            merged after the pull request is closed (the destination
     *            branch).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestRequest withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be
     * reviewed (the source branch) and the destination where the creator of the
     * pull request intends the code to be merged after the pull request is
     * closed (the destination branch).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets for the pull request, including the source of the
     *            code to be reviewed (the source branch) and the destination
     *            where the creator of the pull request intends the code to be
     *            merged after the pull request is closed (the destination
     *            branch).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
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
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS
     * SDK, an idempotency token is created for you.
     * </p>
     * </note>
     *
     * @return <p>
     *         A unique, client-generated idempotency token that, when provided
     *         in a request, ensures the request cannot be repeated with a
     *         changed parameter. If a request is received with the same
     *         parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     *         </p>
     *         <note>
     *         <p>
     *         The AWS SDKs prepopulate client request tokens. If you are using
     *         an AWS SDK, an idempotency token is created for you.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS
     * SDK, an idempotency token is created for you.
     * </p>
     * </note>
     *
     * @param clientRequestToken <p>
     *            A unique, client-generated idempotency token that, when
     *            provided in a request, ensures the request cannot be repeated
     *            with a changed parameter. If a request is received with the
     *            same parameters and a token is included, the request returns
     *            information about the initial request that used that token.
     *            </p>
     *            <note>
     *            <p>
     *            The AWS SDKs prepopulate client request tokens. If you are
     *            using an AWS SDK, an idempotency token is created for you.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS
     * SDK, an idempotency token is created for you.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            The AWS SDKs prepopulate client request tokens. If you are
     *            using an AWS SDK, an idempotency token is created for you.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestRequest withClientRequestToken(String clientRequestToken) {
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
        if (getTitle() != null)
            sb.append("title: " + getTitle() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
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

        if (obj instanceof CreatePullRequestRequest == false)
            return false;
        CreatePullRequestRequest other = (CreatePullRequestRequest) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
