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

public class GetCommentsForComparedCommitResult implements Serializable {
    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     */
    private java.util.List<CommentsForComparedCommit> commentsForComparedCommitData;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     *
     * @return <p>
     *         A list of comment objects on the compared commit.
     *         </p>
     */
    public java.util.List<CommentsForComparedCommit> getCommentsForComparedCommitData() {
        return commentsForComparedCommitData;
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     *
     * @param commentsForComparedCommitData <p>
     *            A list of comment objects on the compared commit.
     *            </p>
     */
    public void setCommentsForComparedCommitData(
            java.util.Collection<CommentsForComparedCommit> commentsForComparedCommitData) {
        if (commentsForComparedCommitData == null) {
            this.commentsForComparedCommitData = null;
            return;
        }

        this.commentsForComparedCommitData = new java.util.ArrayList<CommentsForComparedCommit>(
                commentsForComparedCommitData);
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentsForComparedCommitData <p>
     *            A list of comment objects on the compared commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitResult withCommentsForComparedCommitData(
            CommentsForComparedCommit... commentsForComparedCommitData) {
        if (getCommentsForComparedCommitData() == null) {
            this.commentsForComparedCommitData = new java.util.ArrayList<CommentsForComparedCommit>(
                    commentsForComparedCommitData.length);
        }
        for (CommentsForComparedCommit value : commentsForComparedCommitData) {
            this.commentsForComparedCommitData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentsForComparedCommitData <p>
     *            A list of comment objects on the compared commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitResult withCommentsForComparedCommitData(
            java.util.Collection<CommentsForComparedCommit> commentsForComparedCommitData) {
        setCommentsForComparedCommitData(commentsForComparedCommitData);
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
    public GetCommentsForComparedCommitResult withNextToken(String nextToken) {
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
        if (getCommentsForComparedCommitData() != null)
            sb.append("commentsForComparedCommitData: " + getCommentsForComparedCommitData() + ",");
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
                + ((getCommentsForComparedCommitData() == null) ? 0
                        : getCommentsForComparedCommitData().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentsForComparedCommitResult == false)
            return false;
        GetCommentsForComparedCommitResult other = (GetCommentsForComparedCommitResult) obj;

        if (other.getCommentsForComparedCommitData() == null
                ^ this.getCommentsForComparedCommitData() == null)
            return false;
        if (other.getCommentsForComparedCommitData() != null
                && other.getCommentsForComparedCommitData().equals(
                        this.getCommentsForComparedCommitData()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
