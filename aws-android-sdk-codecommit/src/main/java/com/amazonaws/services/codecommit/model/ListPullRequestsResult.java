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

public class ListPullRequestsResult implements Serializable {
    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     */
    private java.util.List<String> pullRequestIds;

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     *
     * @return <p>
     *         The system-generated IDs of the pull requests.
     *         </p>
     */
    public java.util.List<String> getPullRequestIds() {
        return pullRequestIds;
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     *
     * @param pullRequestIds <p>
     *            The system-generated IDs of the pull requests.
     *            </p>
     */
    public void setPullRequestIds(java.util.Collection<String> pullRequestIds) {
        if (pullRequestIds == null) {
            this.pullRequestIds = null;
            return;
        }

        this.pullRequestIds = new java.util.ArrayList<String>(pullRequestIds);
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestIds <p>
     *            The system-generated IDs of the pull requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsResult withPullRequestIds(String... pullRequestIds) {
        if (getPullRequestIds() == null) {
            this.pullRequestIds = new java.util.ArrayList<String>(pullRequestIds.length);
        }
        for (String value : pullRequestIds) {
            this.pullRequestIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestIds <p>
     *            The system-generated IDs of the pull requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsResult withPullRequestIds(java.util.Collection<String> pullRequestIds) {
        setPullRequestIds(pullRequestIds);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @return <p>
     *         An enumeration token that allows the operation to batch the next
     *         results of the operation.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getPullRequestIds() != null)
            sb.append("pullRequestIds: " + getPullRequestIds() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestIds() == null) ? 0 : getPullRequestIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPullRequestsResult == false)
            return false;
        ListPullRequestsResult other = (ListPullRequestsResult) obj;

        if (other.getPullRequestIds() == null ^ this.getPullRequestIds() == null)
            return false;
        if (other.getPullRequestIds() != null
                && other.getPullRequestIds().equals(this.getPullRequestIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
