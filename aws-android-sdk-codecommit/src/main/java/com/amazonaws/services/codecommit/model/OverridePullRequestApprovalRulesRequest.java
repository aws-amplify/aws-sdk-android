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
 * Sets aside (overrides) all approval rule requirements for a specified pull
 * request.
 * </p>
 */
public class OverridePullRequestApprovalRulesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request for which you want to
     * override all approval rule requirements. To get this information, use
     * <a>GetPullRequest</a>.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request.
     * You cannot override approval rules for anything but the most recent
     * revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     */
    private String overrideStatus;

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to
     * override all approval rule requirements. To get this information, use
     * <a>GetPullRequest</a>.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request for which you want to
     *         override all approval rule requirements. To get this information,
     *         use <a>GetPullRequest</a>.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to
     * override all approval rule requirements. To get this information, use
     * <a>GetPullRequest</a>.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request for which you want
     *            to override all approval rule requirements. To get this
     *            information, use <a>GetPullRequest</a>.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to
     * override all approval rule requirements. To get this information, use
     * <a>GetPullRequest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request for which you want
     *            to override all approval rule requirements. To get this
     *            information, use <a>GetPullRequest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OverridePullRequestApprovalRulesRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request.
     * You cannot override approval rules for anything but the most recent
     * revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the most recent revision of the pull
     *         request. You cannot override approval rules for anything but the
     *         most recent revision of a pull request. To get the revision ID,
     *         use GetPullRequest.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request.
     * You cannot override approval rules for anything but the most recent
     * revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     *
     * @param revisionId <p>
     *            The system-generated ID of the most recent revision of the
     *            pull request. You cannot override approval rules for anything
     *            but the most recent revision of a pull request. To get the
     *            revision ID, use GetPullRequest.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the most recent revision of the pull request.
     * You cannot override approval rules for anything but the most recent
     * revision of a pull request. To get the revision ID, use GetPullRequest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The system-generated ID of the most recent revision of the
     *            pull request. You cannot override approval rules for anything
     *            but the most recent revision of a pull request. To get the
     *            revision ID, use GetPullRequest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OverridePullRequestApprovalRulesRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @return <p>
     *         Whether you want to set aside approval rule requirements for the
     *         pull request (OVERRIDE) or revoke a previous override and apply
     *         approval rule requirements (REVOKE). REVOKE status is not stored.
     *         </p>
     * @see OverrideStatus
     */
    public String getOverrideStatus() {
        return overrideStatus;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            Whether you want to set aside approval rule requirements for
     *            the pull request (OVERRIDE) or revoke a previous override and
     *            apply approval rule requirements (REVOKE). REVOKE status is
     *            not stored.
     *            </p>
     * @see OverrideStatus
     */
    public void setOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            Whether you want to set aside approval rule requirements for
     *            the pull request (OVERRIDE) or revoke a previous override and
     *            apply approval rule requirements (REVOKE). REVOKE status is
     *            not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OverrideStatus
     */
    public OverridePullRequestApprovalRulesRequest withOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
        return this;
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            Whether you want to set aside approval rule requirements for
     *            the pull request (OVERRIDE) or revoke a previous override and
     *            apply approval rule requirements (REVOKE). REVOKE status is
     *            not stored.
     *            </p>
     * @see OverrideStatus
     */
    public void setOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
    }

    /**
     * <p>
     * Whether you want to set aside approval rule requirements for the pull
     * request (OVERRIDE) or revoke a previous override and apply approval rule
     * requirements (REVOKE). REVOKE status is not stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            Whether you want to set aside approval rule requirements for
     *            the pull request (OVERRIDE) or revoke a previous override and
     *            apply approval rule requirements (REVOKE). REVOKE status is
     *            not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OverrideStatus
     */
    public OverridePullRequestApprovalRulesRequest withOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
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
            sb.append("revisionId: " + getRevisionId() + ",");
        if (getOverrideStatus() != null)
            sb.append("overrideStatus: " + getOverrideStatus());
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
        hashCode = prime * hashCode
                + ((getOverrideStatus() == null) ? 0 : getOverrideStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverridePullRequestApprovalRulesRequest == false)
            return false;
        OverridePullRequestApprovalRulesRequest other = (OverridePullRequestApprovalRulesRequest) obj;

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
        if (other.getOverrideStatus() == null ^ this.getOverrideStatus() == null)
            return false;
        if (other.getOverrideStatus() != null
                && other.getOverrideStatus().equals(this.getOverrideStatus()) == false)
            return false;
        return true;
    }
}
