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
 * Returns information about one or more pull request events.
 * </p>
 */
public class DescribePullRequestEventsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use
     * <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     */
    private String pullRequestEventType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     */
    private String actorArn;

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
     * results. The default is 100 events, which is also the maximum number of
     * events that can be returned in a result.
     * </p>
     */
    private Integer maxResults;

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
    public DescribePullRequestEventsRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @return <p>
     *         Optional. The pull request event type about which you want to
     *         return information.
     *         </p>
     * @see PullRequestEventType
     */
    public String getPullRequestEventType() {
        return pullRequestEventType;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            Optional. The pull request event type about which you want to
     *            return information.
     *            </p>
     * @see PullRequestEventType
     */
    public void setPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            Optional. The pull request event type about which you want to
     *            return information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestEventType
     */
    public DescribePullRequestEventsRequest withPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
        return this;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            Optional. The pull request event type about which you want to
     *            return information.
     *            </p>
     * @see PullRequestEventType
     */
    public void setPullRequestEventType(PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            Optional. The pull request event type about which you want to
     *            return information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestEventType
     */
    public DescribePullRequestEventsRequest withPullRequestEventType(
            PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user whose actions resulted
     *         in the event. Examples include updating the pull request with
     *         more commits or changing the status of a pull request.
     *         </p>
     */
    public String getActorArn() {
        return actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     *
     * @param actorArn <p>
     *            The Amazon Resource Name (ARN) of the user whose actions
     *            resulted in the event. Examples include updating the pull
     *            request with more commits or changing the status of a pull
     *            request.
     *            </p>
     */
    public void setActorArn(String actorArn) {
        this.actorArn = actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actorArn <p>
     *            The Amazon Resource Name (ARN) of the user whose actions
     *            resulted in the event. Examples include updating the pull
     *            request with more commits or changing the status of a pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePullRequestEventsRequest withActorArn(String actorArn) {
        this.actorArn = actorArn;
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
    public DescribePullRequestEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 events, which is also the maximum number of
     * events that can be returned in a result.
     * </p>
     *
     * @return <p>
     *         A non-zero, non-negative integer used to limit the number of
     *         returned results. The default is 100 events, which is also the
     *         maximum number of events that can be returned in a result.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 events, which is also the maximum number of
     * events that can be returned in a result.
     * </p>
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is 100 events, which is also the
     *            maximum number of events that can be returned in a result.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned
     * results. The default is 100 events, which is also the maximum number of
     * events that can be returned in a result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            A non-zero, non-negative integer used to limit the number of
     *            returned results. The default is 100 events, which is also the
     *            maximum number of events that can be returned in a result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePullRequestEventsRequest withMaxResults(Integer maxResults) {
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getPullRequestEventType() != null)
            sb.append("pullRequestEventType: " + getPullRequestEventType() + ",");
        if (getActorArn() != null)
            sb.append("actorArn: " + getActorArn() + ",");
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
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestEventType() == null) ? 0 : getPullRequestEventType().hashCode());
        hashCode = prime * hashCode + ((getActorArn() == null) ? 0 : getActorArn().hashCode());
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

        if (obj instanceof DescribePullRequestEventsRequest == false)
            return false;
        DescribePullRequestEventsRequest other = (DescribePullRequestEventsRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getPullRequestEventType() == null ^ this.getPullRequestEventType() == null)
            return false;
        if (other.getPullRequestEventType() != null
                && other.getPullRequestEventType().equals(this.getPullRequestEventType()) == false)
            return false;
        if (other.getActorArn() == null ^ this.getActorArn() == null)
            return false;
        if (other.getActorArn() != null && other.getActorArn().equals(this.getActorArn()) == false)
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
