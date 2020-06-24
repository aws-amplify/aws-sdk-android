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
 * Evaluates whether a pull request has met all the conditions specified in its
 * associated approval rules.
 * </p>
 */
public class EvaluatePullRequestApprovalRulesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the
     * most recent revision ID for a pull request, use <a>GetPullRequest</a>.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request you want to evaluate.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request you want to
     *            evaluate.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request you want to
     *            evaluate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluatePullRequestApprovalRulesRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the
     * most recent revision ID for a pull request, use <a>GetPullRequest</a>.
     * </p>
     *
     * @return <p>
     *         The system-generated ID for the pull request revision. To
     *         retrieve the most recent revision ID for a pull request, use
     *         <a>GetPullRequest</a>.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the
     * most recent revision ID for a pull request, use <a>GetPullRequest</a>.
     * </p>
     *
     * @param revisionId <p>
     *            The system-generated ID for the pull request revision. To
     *            retrieve the most recent revision ID for a pull request, use
     *            <a>GetPullRequest</a>.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the
     * most recent revision ID for a pull request, use <a>GetPullRequest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The system-generated ID for the pull request revision. To
     *            retrieve the most recent revision ID for a pull request, use
     *            <a>GetPullRequest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluatePullRequestApprovalRulesRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
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
        if (getRevisionId() != null)
            sb.append("revisionId: " + getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatePullRequestApprovalRulesRequest == false)
            return false;
        EvaluatePullRequestApprovalRulesRequest other = (EvaluatePullRequestApprovalRulesRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }
}
