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
 * Returns a list of pull requests for a specified repository. The return list
 * can be refined by pull request status or pull request author ARN.
 * </p>
 */
public class ListPullRequestsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull
     * request. If used, this filters the results to pull requests created by
     * that user.
     * </p>
     */
    private String authorArn;

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String pullRequestStatus;

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
     * results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository for which you want to list pull
     *         requests.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository for which you want to list pull
     *            requests.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
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
     *            The name of the repository for which you want to list pull
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull
     * request. If used, this filters the results to pull requests created by
     * that user.
     * </p>
     *
     * @return <p>
     *         Optional. The Amazon Resource Name (ARN) of the user who created
     *         the pull request. If used, this filters the results to pull
     *         requests created by that user.
     *         </p>
     */
    public String getAuthorArn() {
        return authorArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull
     * request. If used, this filters the results to pull requests created by
     * that user.
     * </p>
     *
     * @param authorArn <p>
     *            Optional. The Amazon Resource Name (ARN) of the user who
     *            created the pull request. If used, this filters the results to
     *            pull requests created by that user.
     *            </p>
     */
    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull
     * request. If used, this filters the results to pull requests created by
     * that user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorArn <p>
     *            Optional. The Amazon Resource Name (ARN) of the user who
     *            created the pull request. If used, this filters the results to
     *            pull requests created by that user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsRequest withAuthorArn(String authorArn) {
        this.authorArn = authorArn;
        return this;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return <p>
     *         Optional. The status of the pull request. If used, this refines
     *         the results to the pull requests that match the specified status.
     *         </p>
     * @see PullRequestStatusEnum
     */
    public String getPullRequestStatus() {
        return pullRequestStatus;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            Optional. The status of the pull request. If used, this
     *            refines the results to the pull requests that match the
     *            specified status.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            Optional. The status of the pull request. If used, this
     *            refines the results to the pull requests that match the
     *            specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public ListPullRequestsRequest withPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
        return this;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            Optional. The status of the pull request. If used, this
     *            refines the results to the pull requests that match the
     *            specified status.
     *            </p>
     * @see PullRequestStatusEnum
     */
    public void setPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the
     * results to the pull requests that match the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param pullRequestStatus <p>
     *            Optional. The status of the pull request. If used, this
     *            refines the results to the pull requests that match the
     *            specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestStatusEnum
     */
    public ListPullRequestsRequest withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
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
    public ListPullRequestsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     *
     * @return <p>
     *         A non-zero, non-negative integer used to limit the number of
     *         returned results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPullRequestsRequest withMaxResults(Integer maxResults) {
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
        if (getAuthorArn() != null)
            sb.append("authorArn: " + getAuthorArn() + ",");
        if (getPullRequestStatus() != null)
            sb.append("pullRequestStatus: " + getPullRequestStatus() + ",");
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
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
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

        if (obj instanceof ListPullRequestsRequest == false)
            return false;
        ListPullRequestsRequest other = (ListPullRequestsRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null
                && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null
                && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
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
