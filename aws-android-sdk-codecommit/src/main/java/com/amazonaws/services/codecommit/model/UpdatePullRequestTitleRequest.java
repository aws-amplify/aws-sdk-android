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
 * Replaces the title of a pull request.
 * </p>
 */
public class UpdatePullRequestTitleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The updated title of the pull request. This replaces the existing title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     */
    private String title;

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
    public UpdatePullRequestTitleRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The updated title of the pull request. This replaces the existing title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @return <p>
     *         The updated title of the pull request. This replaces the existing
     *         title.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The updated title of the pull request. This replaces the existing title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The updated title of the pull request. This replaces the
     *            existing title.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The updated title of the pull request. This replaces the existing title.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 150<br/>
     *
     * @param title <p>
     *            The updated title of the pull request. This replaces the
     *            existing title.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePullRequestTitleRequest withTitle(String title) {
        this.title = title;
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
            sb.append("title: " + getTitle());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestTitleRequest == false)
            return false;
        UpdatePullRequestTitleRequest other = (UpdatePullRequestTitleRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }
}
