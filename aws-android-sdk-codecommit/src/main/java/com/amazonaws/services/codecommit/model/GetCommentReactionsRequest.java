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
 * Returns information about reactions to a specified comment ID. Reactions from
 * users who have been deleted will not be included in the count.
 * </p>
 */
public class GetCommentReactionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     */
    private String commentId;

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for
     * which you want to get reaction information.
     * </p>
     */
    private String reactionUserArn;

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is the same as the allowed maximum, 1,000.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     *
     * @return <p>
     *         The ID of the comment for which you want to get reactions
     *         information.
     *         </p>
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     *
     * @param commentId <p>
     *            The ID of the comment for which you want to get reactions
     *            information.
     *            </p>
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The ID of the comment for which you want to get reactions information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commentId <p>
     *            The ID of the comment for which you want to get reactions
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsRequest withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for
     * which you want to get reaction information.
     * </p>
     *
     * @return <p>
     *         Optional. The Amazon Resource Name (ARN) of the user or identity
     *         for which you want to get reaction information.
     *         </p>
     */
    public String getReactionUserArn() {
        return reactionUserArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for
     * which you want to get reaction information.
     * </p>
     *
     * @param reactionUserArn <p>
     *            Optional. The Amazon Resource Name (ARN) of the user or
     *            identity for which you want to get reaction information.
     *            </p>
     */
    public void setReactionUserArn(String reactionUserArn) {
        this.reactionUserArn = reactionUserArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user or identity for
     * which you want to get reaction information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reactionUserArn <p>
     *            Optional. The Amazon Resource Name (ARN) of the user or
     *            identity for which you want to get reaction information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsRequest withReactionUserArn(String reactionUserArn) {
        this.reactionUserArn = reactionUserArn;
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that, when provided in a request, returns
     *         the next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that, when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is the same as the allowed maximum, 1,000.
     * </p>
     *
     * @return <p>
     *         A non-zero, non-negative integer used to limit the number of
     *         returned results. The default is the same as the allowed maximum,
     *         1,000.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is the same as the allowed maximum, 1,000.
     * </p>
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is the same as the allowed
     *            maximum, 1,000.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is the same as the allowed maximum, 1,000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is the same as the allowed
     *            maximum, 1,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentReactionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getCommentId() != null)
            sb.append("commentId: " + getCommentId() + ",");
        if (getReactionUserArn() != null)
            sb.append("reactionUserArn: " + getReactionUserArn() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode
                + ((getReactionUserArn() == null) ? 0 : getReactionUserArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommentReactionsRequest == false)
            return false;
        GetCommentReactionsRequest other = (GetCommentReactionsRequest) obj;

        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null
                && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getReactionUserArn() == null ^ this.getReactionUserArn() == null)
            return false;
        if (other.getReactionUserArn() != null
                && other.getReactionUserArn().equals(this.getReactionUserArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
