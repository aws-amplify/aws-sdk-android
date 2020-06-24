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
 * Returns information about comments made on the comparison between two
 * commits.
 * </p>
 * <note>
 * <p>
 * Reaction counts might include numbers from user identities who were deleted
 * after the reaction was made. For a count of reactions from active identities,
 * use GetCommentReactions.
 * </p>
 * </note>
 */
public class GetCommentsForComparedCommitRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit.
     * </p>
     */
    private String beforeCommitId;

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     */
    private String afterCommitId;

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 comments, but you can configure up to 500.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to compare commits.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to compare commits.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to compare commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit.
     * </p>
     *
     * @return <p>
     *         To establish the directionality of the comparison, the full
     *         commit ID of the before commit.
     *         </p>
     */
    public String getBeforeCommitId() {
        return beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit.
     * </p>
     *
     * @param beforeCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the before commit.
     *            </p>
     */
    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the before commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the before commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitRequest withBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     *
     * @return <p>
     *         To establish the directionality of the comparison, the full
     *         commit ID of the after commit.
     *         </p>
     */
    public String getAfterCommitId() {
        return afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     *
     * @param afterCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the after commit.
     *            </p>
     */
    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of
     * the after commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCommitId <p>
     *            To establish the directionality of the comparison, the full
     *            commit ID of the after commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitRequest withAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
        return this;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that when provided in a request, returns the
     *         next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that when provided in a request, returns
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 comments, but you can configure up to 500.
     * </p>
     *
     * @return <p>
     *         A non-zero, non-negative integer used to limit the number of
     *         returned results. The default is 100 comments, but you can
     *         configure up to 500.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 comments, but you can configure up to 500.
     * </p>
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is 100 comments, but you can
     *            configure up to 500.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 comments, but you can configure up to 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is 100 comments, but you can
     *            configure up to 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommentsForComparedCommitRequest withMaxResults(Integer maxResults) {
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getBeforeCommitId() != null)
            sb.append("beforeCommitId: " + getBeforeCommitId() + ",");
        if (getAfterCommitId() != null)
            sb.append("afterCommitId: " + getAfterCommitId() + ",");
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

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
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

        if (obj instanceof GetCommentsForComparedCommitRequest == false)
            return false;
        GetCommentsForComparedCommitRequest other = (GetCommentsForComparedCommitRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null
                && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null
                && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
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
