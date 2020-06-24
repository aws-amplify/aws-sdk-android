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
 * Returns information about a pull request.
 * </p>
 */
public class PullRequest implements Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in
     * the list of pull requests to other repository users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     */
    private String title;

    /**
     * <p>
     * The user-defined description of the pull request. This description can be
     * used to clarify what should be reviewed and other details of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     */
    private String description;

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request,
     * in timestamp format.
     * </p>
     */
    private java.util.Date lastActivityDate;

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp
     * format.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String pullRequestStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     */
    private String authorArn;

    /**
     * <p>
     * The targets of the pull request, including the source branch and
     * destination branch for the pull request.
     * </p>
     */
    private java.util.List<PullRequestTarget> pullRequestTargets;

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
     * The system-generated revision ID for the pull request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The approval rules applied to the pull request.
     * </p>
     */
    private java.util.List<ApprovalRule> approvalRules;

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
    public PullRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in
     * the list of pull requests to other repository users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @return <p>
     *         The user-defined title of the pull request. This title is
     *         displayed in the list of pull requests to other repository users.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in
     * the list of pull requests to other repository users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The user-defined title of the pull request. This title is
     *            displayed in the list of pull requests to other repository
     *            users.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The user-defined title of the pull request. This title is displayed in
     * the list of pull requests to other repository users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The user-defined title of the pull request. This title is
     *            displayed in the list of pull requests to other repository
     *            users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be
     * used to clarify what should be reviewed and other details of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @return <p>
     *         The user-defined description of the pull request. This
     *         description can be used to clarify what should be reviewed and
     *         other details of the request.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be
     * used to clarify what should be reviewed and other details of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param description <p>
     *            The user-defined description of the pull request. This
     *            description can be used to clarify what should be reviewed and
     *            other details of the request.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-defined description of the pull request. This description can be
     * used to clarify what should be reviewed and other details of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param description <p>
     *            The user-defined description of the pull request. This
     *            description can be used to clarify what should be reviewed and
     *            other details of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request,
     * in timestamp format.
     * </p>
     *
     * @return <p>
     *         The day and time of the last user or system activity on the pull
     *         request, in timestamp format.
     *         </p>
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request,
     * in timestamp format.
     * </p>
     *
     * @param lastActivityDate <p>
     *            The day and time of the last user or system activity on the
     *            pull request, in timestamp format.
     *            </p>
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * <p>
     * The day and time of the last user or system activity on the pull request,
     * in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastActivityDate <p>
     *            The day and time of the last user or system activity on the
     *            pull request, in timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp
     * format.
     * </p>
     *
     * @return <p>
     *         The date and time the pull request was originally created, in
     *         timestamp format.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp
     * format.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time the pull request was originally created, in
     *            timestamp format.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the pull request was originally created, in timestamp
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time the pull request was originally created, in
     *            timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return <p>
     *         The status of the pull request. Pull request status can only
     *         change from <code>OPEN</code> to <code>CLOSED</code>.
     *         </p>
     * @see PullRequestStatusEnum
     */
    public String getPullRequestStatus() {
        return pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. Pull request status can only
     *            change from <code>OPEN</code> to <code>CLOSED</code>.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. Pull request status can only
     *            change from <code>OPEN</code> to <code>CLOSED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public PullRequest withPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
        return this;
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. Pull request status can only
     *            change from <code>OPEN</code> to <code>CLOSED</code>.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
    }

    /**
     * <p>
     * The status of the pull request. Pull request status can only change from
     * <code>OPEN</code> to <code>CLOSED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. Pull request status can only
     *            change from <code>OPEN</code> to <code>CLOSED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public PullRequest withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who created the pull
     *         request.
     *         </p>
     */
    public String getAuthorArn() {
        return authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     *
     * @param authorArn <p>
     *            The Amazon Resource Name (ARN) of the user who created the
     *            pull request.
     *            </p>
     */
    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorArn <p>
     *            The Amazon Resource Name (ARN) of the user who created the
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withAuthorArn(String authorArn) {
        this.authorArn = authorArn;
        return this;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and
     * destination branch for the pull request.
     * </p>
     *
     * @return <p>
     *         The targets of the pull request, including the source branch and
     *         destination branch for the pull request.
     *         </p>
     */
    public java.util.List<PullRequestTarget> getPullRequestTargets() {
        return pullRequestTargets;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and
     * destination branch for the pull request.
     * </p>
     *
     * @param pullRequestTargets <p>
     *            The targets of the pull request, including the source branch
     *            and destination branch for the pull request.
     *            </p>
     */
    public void setPullRequestTargets(java.util.Collection<PullRequestTarget> pullRequestTargets) {
        if (pullRequestTargets == null) {
            this.pullRequestTargets = null;
            return;
        }

        this.pullRequestTargets = new java.util.ArrayList<PullRequestTarget>(pullRequestTargets);
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and
     * destination branch for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestTargets <p>
     *            The targets of the pull request, including the source branch
     *            and destination branch for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withPullRequestTargets(PullRequestTarget... pullRequestTargets) {
        if (getPullRequestTargets() == null) {
            this.pullRequestTargets = new java.util.ArrayList<PullRequestTarget>(
                    pullRequestTargets.length);
        }
        for (PullRequestTarget value : pullRequestTargets) {
            this.pullRequestTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The targets of the pull request, including the source branch and
     * destination branch for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestTargets <p>
     *            The targets of the pull request, including the source branch
     *            and destination branch for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withPullRequestTargets(
            java.util.Collection<PullRequestTarget> pullRequestTargets) {
        setPullRequestTargets(pullRequestTargets);
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
    public PullRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The system-generated revision ID for the pull request.
     * </p>
     *
     * @return <p>
     *         The system-generated revision ID for the pull request.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The system-generated revision ID for the pull request.
     * </p>
     *
     * @param revisionId <p>
     *            The system-generated revision ID for the pull request.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated revision ID for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The system-generated revision ID for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The approval rules applied to the pull request.
     * </p>
     *
     * @return <p>
     *         The approval rules applied to the pull request.
     *         </p>
     */
    public java.util.List<ApprovalRule> getApprovalRules() {
        return approvalRules;
    }

    /**
     * <p>
     * The approval rules applied to the pull request.
     * </p>
     *
     * @param approvalRules <p>
     *            The approval rules applied to the pull request.
     *            </p>
     */
    public void setApprovalRules(java.util.Collection<ApprovalRule> approvalRules) {
        if (approvalRules == null) {
            this.approvalRules = null;
            return;
        }

        this.approvalRules = new java.util.ArrayList<ApprovalRule>(approvalRules);
    }

    /**
     * <p>
     * The approval rules applied to the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRules <p>
     *            The approval rules applied to the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withApprovalRules(ApprovalRule... approvalRules) {
        if (getApprovalRules() == null) {
            this.approvalRules = new java.util.ArrayList<ApprovalRule>(approvalRules.length);
        }
        for (ApprovalRule value : approvalRules) {
            this.approvalRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The approval rules applied to the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRules <p>
     *            The approval rules applied to the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequest withApprovalRules(java.util.Collection<ApprovalRule> approvalRules) {
        setApprovalRules(approvalRules);
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getTitle() != null)
            sb.append("title: " + getTitle() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getLastActivityDate() != null)
            sb.append("lastActivityDate: " + getLastActivityDate() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getPullRequestStatus() != null)
            sb.append("pullRequestStatus: " + getPullRequestStatus() + ",");
        if (getAuthorArn() != null)
            sb.append("authorArn: " + getAuthorArn() + ",");
        if (getPullRequestTargets() != null)
            sb.append("pullRequestTargets: " + getPullRequestTargets() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken() + ",");
        if (getRevisionId() != null)
            sb.append("revisionId: " + getRevisionId() + ",");
        if (getApprovalRules() != null)
            sb.append("approvalRules: " + getApprovalRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLastActivityDate() == null) ? 0 : getLastActivityDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestTargets() == null) ? 0 : getPullRequestTargets().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequest == false)
            return false;
        PullRequest other = (PullRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastActivityDate() == null ^ this.getLastActivityDate() == null)
            return false;
        if (other.getLastActivityDate() != null
                && other.getLastActivityDate().equals(this.getLastActivityDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null
                && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null
                && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getPullRequestTargets() == null ^ this.getPullRequestTargets() == null)
            return false;
        if (other.getPullRequestTargets() != null
                && other.getPullRequestTargets().equals(this.getPullRequestTargets()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getApprovalRules() == null ^ this.getApprovalRules() == null)
            return false;
        if (other.getApprovalRules() != null
                && other.getApprovalRules().equals(this.getApprovalRules()) == false)
            return false;
        return true;
    }
}
