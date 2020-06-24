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
 * Updates the status of a pull request.
 * </p>
 */
public class UpdatePullRequestStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String pullRequestStatus;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request. To get this ID, use
     *         <a>ListPullRequests</a>.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request. To get this ID,
     *            use <a>ListPullRequests</a>.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request. To get this ID,
     *            use <a>ListPullRequests</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePullRequestStatusRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return <p>
     *         The status of the pull request. The only valid operations are to
     *         update the status from <code>OPEN</code> to <code>OPEN</code>,
     *         <code>OPEN</code> to <code>CLOSED</code> or from
     *         <code>CLOSED</code> to <code>CLOSED</code>.
     *         </p>
     * @see PullRequestStatusEnum
     */
    public String getPullRequestStatus() {
        return pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. The only valid operations are
     *            to update the status from <code>OPEN</code> to
     *            <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or
     *            from <code>CLOSED</code> to <code>CLOSED</code>.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. The only valid operations are
     *            to update the status from <code>OPEN</code> to
     *            <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or
     *            from <code>CLOSED</code> to <code>CLOSED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public UpdatePullRequestStatusRequest withPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
        return this;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. The only valid operations are
     *            to update the status from <code>OPEN</code> to
     *            <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or
     *            from <code>CLOSED</code> to <code>CLOSED</code>.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update
     * the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code>
     * to <code>CLOSED</code> or from <code>CLOSED</code> to <code>CLOSED</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The status of the pull request. The only valid operations are
     *            to update the status from <code>OPEN</code> to
     *            <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or
     *            from <code>CLOSED</code> to <code>CLOSED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public UpdatePullRequestStatusRequest withPullRequestStatus(
            PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
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
        if (getPullRequestStatus() != null)
            sb.append("pullRequestStatus: " + getPullRequestStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestStatusRequest == false)
            return false;
        UpdatePullRequestStatusRequest other = (UpdatePullRequestStatusRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null
                && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
            return false;
        return true;
    }
}
