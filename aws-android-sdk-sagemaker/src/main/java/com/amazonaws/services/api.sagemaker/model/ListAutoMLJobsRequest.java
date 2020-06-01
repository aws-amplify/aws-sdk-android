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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request a list of jobs.
 * </p>
 */
public class ListAutoMLJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String statusEquals;

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     */
    private String sortBy;

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @return <p>
     *         Request a list of jobs, using a filter for time.
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @param creationTimeAfter <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @return <p>
     *         Request a list of jobs, using a filter for time.
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @param creationTimeBefore <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @return <p>
     *         Request a list of jobs, using a filter for time.
     *         </p>
     */
    public java.util.Date getLastModifiedTimeAfter() {
        return lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @param lastModifiedTimeAfter <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     */
    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeAfter <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @return <p>
     *         Request a list of jobs, using a filter for time.
     *         </p>
     */
    public java.util.Date getLastModifiedTimeBefore() {
        return lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     *
     * @param lastModifiedTimeBefore <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     */
    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeBefore <p>
     *            Request a list of jobs, using a filter for time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         Request a list of jobs, using a search filter for name.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param nameContains <p>
     *            Request a list of jobs, using a search filter for name.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param nameContains <p>
     *            Request a list of jobs, using a search filter for name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         Request a list of jobs, using a filter for status.
     *         </p>
     * @see AutoMLJobStatus
     */
    public String getStatusEquals() {
        return statusEquals;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param statusEquals <p>
     *            Request a list of jobs, using a filter for status.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param statusEquals <p>
     *            Request a list of jobs, using a filter for status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public ListAutoMLJobsRequest withStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param statusEquals <p>
     *            Request a list of jobs, using a filter for status.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setStatusEquals(AutoMLJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param statusEquals <p>
     *            Request a list of jobs, using a filter for status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public ListAutoMLJobsRequest withStatusEquals(AutoMLJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for the results. The default is Descending.
     *         </p>
     * @see AutoMLSortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Descending.
     *            </p>
     * @see AutoMLSortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Descending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLSortOrder
     */
    public ListAutoMLJobsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Descending.
     *            </p>
     * @see AutoMLSortOrder
     */
    public void setSortOrder(AutoMLSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Descending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLSortOrder
     */
    public ListAutoMLJobsRequest withSortOrder(AutoMLSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @return <p>
     *         The parameter by which to sort the results. The default is
     *         AutoMLJobName.
     *         </p>
     * @see AutoMLSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            AutoMLJobName.
     *            </p>
     * @see AutoMLSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            AutoMLJobName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLSortBy
     */
    public ListAutoMLJobsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            AutoMLJobName.
     *            </p>
     * @see AutoMLSortBy
     */
    public void setSortBy(AutoMLSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            AutoMLJobName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLSortBy
     */
    public ListAutoMLJobsRequest withSortBy(AutoMLSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Request a list of jobs up to a specified limit.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Request a list of jobs up to a specified limit.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Request a list of jobs up to a specified limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsRequest withNextToken(String nextToken) {
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore() + ",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: " + getLastModifiedTimeAfter() + ",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: " + getLastModifiedTimeBefore() + ",");
        if (getNameContains() != null)
            sb.append("NameContains: " + getNameContains() + ",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: " + getStatusEquals() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode
                + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutoMLJobsRequest == false)
            return false;
        ListAutoMLJobsRequest other = (ListAutoMLJobsRequest) obj;

        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null
                && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null
                && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null
                && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null
                && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null
                && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
