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

public class GetCommentsForPullRequestResult implements Serializable {
    /**
     * <p>
     * An array of comment objects on the pull request.
     * </p>
     */
    private java.util.List<CommentsForPullRequest> commentsForPullRequestData;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of comment objects on the pull request.
     * </p>
     *
     * @return <p>
     *         An array of comment objects on the pull request.
     *         </p>
     */
    public java.util.List<CommentsForPullRequest> getCommentsForPullRequestData() {
        return commentsForPullRequestData;
    }

    /**
     * <p>
     * An array of comment objects on the pull request.
     * </p>
     *
     * @param commentsForPullRequestData <p>
     *            An array of comment objects on the pull request.
     *            </p>
     */
    public void setCommentsForPullRequestData(
            java.util.Collection<CommentsForPullRequest> commentsForPullRequestData) {
        if (commentsForPullRequestData == null) {
            this.commentsForPullRequestData = null;
            return;
        }

        this.commentsForPullRequestData = new java.util.ArrayList<CommentsForPullRequest>(
                commentsForPullRequestData);
    }

    /**
     * <p>
     * An array of comment objects on the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentsForPullRequestData <p>
     *            An array of comment objects on the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForPullRequestResult withCommentsForPullRequestData(
            CommentsForPullRequest... commentsForPullRequestData) {
        if (getCommentsForPullRequestData() == null) {
            this.commentsForPullRequestData = new java.util.ArrayList<CommentsForPullRequest>(
                    commentsForPullRequestData.length);
        }
        for (CommentsForPullRequest value : commentsForPullRequestData) {
            this.commentsForPullRequestData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of comment objects on the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentsForPullRequestData <p>
     *            An array of comment objects on the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForPullRequestResult withCommentsForPullRequestData(
            java.util.Collection<CommentsForPullRequest> commentsForPullRequestData) {
        setCommentsForPullRequestData(commentsForPullRequestData);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that can be used in a request to return the
     *         next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForPullRequestResult withNextToken(String nextToken) {
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
        if (getCommentsForPullRequestData() != null)
            sb.append("commentsForPullRequestData: " + getCommentsForPullRequestData() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCommentsForPullRequestData() == null) ? 0 : getCommentsForPullRequestData()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentsForPullRequestResult == false)
            return false;
        GetCommentsForPullRequestResult other = (GetCommentsForPullRequestResult) obj;

        if (other.getCommentsForPullRequestData() == null
                ^ this.getCommentsForPullRequestData() == null)
            return false;
        if (other.getCommentsForPullRequestData() != null
                && other.getCommentsForPullRequestData().equals(
                        this.getCommentsForPullRequestData()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
