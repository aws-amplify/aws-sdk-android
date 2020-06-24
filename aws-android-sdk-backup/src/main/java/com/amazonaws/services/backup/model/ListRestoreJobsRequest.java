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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of jobs that AWS Backup initiated to restore a saved resource,
 * including metadata about the recovery process.
 * </p>
 */
public class ListRestoreJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs
     * associated with the specified account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String byAccountId;

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     */
    private java.util.Date byCreatedBefore;

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     */
    private java.util.Date byCreatedAfter;

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     */
    private String byStatus;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return <code>maxResults</code>
     *         number of items, <code>NextToken</code> allows you to return more
     *         items in your list starting at the location pointed to by the
     *         next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of items to be returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to be returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs
     * associated with the specified account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The account ID to list the jobs from. Returns only restore jobs
     *         associated with the specified account ID.
     *         </p>
     */
    public String getByAccountId() {
        return byAccountId;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs
     * associated with the specified account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param byAccountId <p>
     *            The account ID to list the jobs from. Returns only restore
     *            jobs associated with the specified account ID.
     *            </p>
     */
    public void setByAccountId(String byAccountId) {
        this.byAccountId = byAccountId;
    }

    /**
     * <p>
     * The account ID to list the jobs from. Returns only restore jobs
     * associated with the specified account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param byAccountId <p>
     *            The account ID to list the jobs from. Returns only restore
     *            jobs associated with the specified account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsRequest withByAccountId(String byAccountId) {
        this.byAccountId = byAccountId;
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     *
     * @return <p>
     *         Returns only restore jobs that were created before the specified
     *         date.
     *         </p>
     */
    public java.util.Date getByCreatedBefore() {
        return byCreatedBefore;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     *
     * @param byCreatedBefore <p>
     *            Returns only restore jobs that were created before the
     *            specified date.
     *            </p>
     */
    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only restore jobs that were created before the specified date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedBefore <p>
     *            Returns only restore jobs that were created before the
     *            specified date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     *
     * @return <p>
     *         Returns only restore jobs that were created after the specified
     *         date.
     *         </p>
     */
    public java.util.Date getByCreatedAfter() {
        return byCreatedAfter;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     *
     * @param byCreatedAfter <p>
     *            Returns only restore jobs that were created after the
     *            specified date.
     *            </p>
     */
    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only restore jobs that were created after the specified date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedAfter <p>
     *            Returns only restore jobs that were created after the
     *            specified date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @return <p>
     *         Returns only restore jobs associated with the specified job
     *         status.
     *         </p>
     * @see RestoreJobStatus
     */
    public String getByStatus() {
        return byStatus;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param byStatus <p>
     *            Returns only restore jobs associated with the specified job
     *            status.
     *            </p>
     * @see RestoreJobStatus
     */
    public void setByStatus(String byStatus) {
        this.byStatus = byStatus;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param byStatus <p>
     *            Returns only restore jobs associated with the specified job
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreJobStatus
     */
    public ListRestoreJobsRequest withByStatus(String byStatus) {
        this.byStatus = byStatus;
        return this;
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param byStatus <p>
     *            Returns only restore jobs associated with the specified job
     *            status.
     *            </p>
     * @see RestoreJobStatus
     */
    public void setByStatus(RestoreJobStatus byStatus) {
        this.byStatus = byStatus.toString();
    }

    /**
     * <p>
     * Returns only restore jobs associated with the specified job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param byStatus <p>
     *            Returns only restore jobs associated with the specified job
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreJobStatus
     */
    public ListRestoreJobsRequest withByStatus(RestoreJobStatus byStatus) {
        this.byStatus = byStatus.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getByAccountId() != null)
            sb.append("ByAccountId: " + getByAccountId() + ",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: " + getByCreatedBefore() + ",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: " + getByCreatedAfter() + ",");
        if (getByStatus() != null)
            sb.append("ByStatus: " + getByStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getByAccountId() == null) ? 0 : getByAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getByStatus() == null) ? 0 : getByStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRestoreJobsRequest == false)
            return false;
        ListRestoreJobsRequest other = (ListRestoreJobsRequest) obj;

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
        if (other.getByAccountId() == null ^ this.getByAccountId() == null)
            return false;
        if (other.getByAccountId() != null
                && other.getByAccountId().equals(this.getByAccountId()) == false)
            return false;
        if (other.getByCreatedBefore() == null ^ this.getByCreatedBefore() == null)
            return false;
        if (other.getByCreatedBefore() != null
                && other.getByCreatedBefore().equals(this.getByCreatedBefore()) == false)
            return false;
        if (other.getByCreatedAfter() == null ^ this.getByCreatedAfter() == null)
            return false;
        if (other.getByCreatedAfter() != null
                && other.getByCreatedAfter().equals(this.getByCreatedAfter()) == false)
            return false;
        if (other.getByStatus() == null ^ this.getByStatus() == null)
            return false;
        if (other.getByStatus() != null && other.getByStatus().equals(this.getByStatus()) == false)
            return false;
        return true;
    }
}
