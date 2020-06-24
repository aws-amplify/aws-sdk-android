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

public class GetCommentReactionsResult implements Serializable {
    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     */
    private java.util.List<ReactionForComment> reactionsForComment;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     *
     * @return <p>
     *         An array of reactions to the specified comment.
     *         </p>
     */
    public java.util.List<ReactionForComment> getReactionsForComment() {
        return reactionsForComment;
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     *
     * @param reactionsForComment <p>
     *            An array of reactions to the specified comment.
     *            </p>
     */
    public void setReactionsForComment(java.util.Collection<ReactionForComment> reactionsForComment) {
        if (reactionsForComment == null) {
            this.reactionsForComment = null;
            return;
        }

        this.reactionsForComment = new java.util.ArrayList<ReactionForComment>(reactionsForComment);
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionsForComment <p>
     *            An array of reactions to the specified comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsResult withReactionsForComment(
            ReactionForComment... reactionsForComment) {
        if (getReactionsForComment() == null) {
            this.reactionsForComment = new java.util.ArrayList<ReactionForComment>(
                    reactionsForComment.length);
        }
        for (ReactionForComment value : reactionsForComment) {
            this.reactionsForComment.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of reactions to the specified comment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionsForComment <p>
     *            An array of reactions to the specified comment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsResult withReactionsForComment(
            java.util.Collection<ReactionForComment> reactionsForComment) {
        setReactionsForComment(reactionsForComment);
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
    public GetCommentReactionsResult withNextToken(String nextToken) {
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
        if (getReactionsForComment() != null)
            sb.append("reactionsForComment: " + getReactionsForComment() + ",");
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
                + ((getReactionsForComment() == null) ? 0 : getReactionsForComment().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentReactionsResult == false)
            return false;
        GetCommentReactionsResult other = (GetCommentReactionsResult) obj;

        if (other.getReactionsForComment() == null ^ this.getReactionsForComment() == null)
            return false;
        if (other.getReactionsForComment() != null
                && other.getReactionsForComment().equals(this.getReactionsForComment()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
