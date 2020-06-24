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

public class MergePullRequestBySquashResult implements Serializable {
    /**
     * <p>
     * Returns information about a pull request.
     * </p>
     */
    private PullRequest pullRequest;

    /**
     * <p>
     * Returns information about a pull request.
     * </p>
     *
     * @return <p>
     *         Returns information about a pull request.
     *         </p>
     */
    public PullRequest getPullRequest() {
        return pullRequest;
    }

    /**
     * <p>
     * Returns information about a pull request.
     * </p>
     *
     * @param pullRequest <p>
     *            Returns information about a pull request.
     *            </p>
     */
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    /**
     * <p>
     * Returns information about a pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequest <p>
     *            Returns information about a pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergePullRequestBySquashResult withPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
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
        if (getPullRequest() != null)
            sb.append("pullRequest: " + getPullRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequest() == null) ? 0 : getPullRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergePullRequestBySquashResult == false)
            return false;
        MergePullRequestBySquashResult other = (MergePullRequestBySquashResult) obj;

        if (other.getPullRequest() == null ^ this.getPullRequest() == null)
            return false;
        if (other.getPullRequest() != null
                && other.getPullRequest().equals(this.getPullRequest()) == false)
            return false;
        return true;
    }
}
