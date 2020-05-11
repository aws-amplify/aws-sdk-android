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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets statistics about synchronizing Amazon Kendra with a data source.
 * </p>
 */
public class ListDataSourceSyncJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * If the result of the previous request to
     * <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited
     * to jobs between the specified dates.
     * </p>
     */
    private TimeRange startTimeFilter;

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     */
    private String statusFilter;

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The identifier of the data source.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The identifier of the data source.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The identifier of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that contains the data source.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the data source.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to
     * <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @return <p>
     *         If the result of the previous request to
     *         <code>GetDataSourceSyncJobHistory</code> was truncated, include
     *         the <code>NextToken</code> to fetch the next set of jobs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to
     * <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous request to
     *            <code>GetDataSourceSyncJobHistory</code> was truncated,
     *            include the <code>NextToken</code> to fetch the next set of
     *            jobs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request to
     * <code>GetDataSourceSyncJobHistory</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous request to
     *            <code>GetDataSourceSyncJobHistory</code> was truncated,
     *            include the <code>NextToken</code> to fetch the next set of
     *            jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The maximum number of synchronization jobs to return in the
     *         response. If there are fewer results in the list, this response
     *         contains only the actual results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of synchronization jobs to return in the
     *            response. If there are fewer results in the list, this
     *            response contains only the actual results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of synchronization jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of synchronization jobs to return in the
     *            response. If there are fewer results in the list, this
     *            response contains only the actual results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited
     * to jobs between the specified dates.
     * </p>
     *
     * @return <p>
     *         When specified, the synchronization jobs returned in the list are
     *         limited to jobs between the specified dates.
     *         </p>
     */
    public TimeRange getStartTimeFilter() {
        return startTimeFilter;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited
     * to jobs between the specified dates.
     * </p>
     *
     * @param startTimeFilter <p>
     *            When specified, the synchronization jobs returned in the list
     *            are limited to jobs between the specified dates.
     *            </p>
     */
    public void setStartTimeFilter(TimeRange startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }

    /**
     * <p>
     * When specified, the synchronization jobs returned in the list are limited
     * to jobs between the specified dates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimeFilter <p>
     *            When specified, the synchronization jobs returned in the list
     *            are limited to jobs between the specified dates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsRequest withStartTimeFilter(TimeRange startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
        return this;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @return <p>
     *         When specified, only returns synchronization jobs with the
     *         <code>Status</code> field equal to the specified status.
     *         </p>
     * @see DataSourceSyncJobStatus
     */
    public String getStatusFilter() {
        return statusFilter;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param statusFilter <p>
     *            When specified, only returns synchronization jobs with the
     *            <code>Status</code> field equal to the specified status.
     *            </p>
     * @see DataSourceSyncJobStatus
     */
    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param statusFilter <p>
     *            When specified, only returns synchronization jobs with the
     *            <code>Status</code> field equal to the specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceSyncJobStatus
     */
    public ListDataSourceSyncJobsRequest withStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
        return this;
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param statusFilter <p>
     *            When specified, only returns synchronization jobs with the
     *            <code>Status</code> field equal to the specified status.
     *            </p>
     * @see DataSourceSyncJobStatus
     */
    public void setStatusFilter(DataSourceSyncJobStatus statusFilter) {
        this.statusFilter = statusFilter.toString();
    }

    /**
     * <p>
     * When specified, only returns synchronization jobs with the
     * <code>Status</code> field equal to the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param statusFilter <p>
     *            When specified, only returns synchronization jobs with the
     *            <code>Status</code> field equal to the specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceSyncJobStatus
     */
    public ListDataSourceSyncJobsRequest withStatusFilter(DataSourceSyncJobStatus statusFilter) {
        this.statusFilter = statusFilter.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStartTimeFilter() != null)
            sb.append("StartTimeFilter: " + getStartTimeFilter() + ",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: " + getStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimeFilter() == null) ? 0 : getStartTimeFilter().hashCode());
        hashCode = prime * hashCode
                + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourceSyncJobsRequest == false)
            return false;
        ListDataSourceSyncJobsRequest other = (ListDataSourceSyncJobsRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null)
            return false;
        if (other.getStartTimeFilter() != null
                && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null
                && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        return true;
    }
}
