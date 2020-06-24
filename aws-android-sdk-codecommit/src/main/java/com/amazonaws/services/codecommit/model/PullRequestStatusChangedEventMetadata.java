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
 * Information about a change to the status of a pull request.
 * </p>
 */
public class PullRequestStatusChangedEventMetadata implements Serializable {
    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String pullRequestStatus;

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return <p>
     *         The changed status of the pull request.
     *         </p>
     * @see PullRequestStatusEnum
     */
    public String getPullRequestStatus() {
        return pullRequestStatus;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The changed status of the pull request.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The changed status of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public PullRequestStatusChangedEventMetadata withPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
        return this;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The changed status of the pull request.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            The changed status of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public PullRequestStatusChangedEventMetadata withPullRequestStatus(
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
                + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestStatusChangedEventMetadata == false)
            return false;
        PullRequestStatusChangedEventMetadata other = (PullRequestStatusChangedEventMetadata) obj;

        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null
                && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
            return false;
        return true;
    }
}
