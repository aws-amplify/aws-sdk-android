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
 * Lists transform jobs.
 * </p>
 */
public class ListTransformJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A filter that returns only transform jobs created after the specified
     * time.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * A filter that returns only transform jobs created before the specified
     * time.
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * A filter that returns only transform jobs modified after the specified
     * time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;

    /**
     * <p>
     * A filter that returns only transform jobs modified before the specified
     * time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;

    /**
     * <p>
     * A string in the transform job name. This filter returns only transform
     * jobs whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String statusEquals;

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     */
    private String sortBy;

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * If the result of the previous <code>ListTransformJobs</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of transform jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of transform jobs to return in the response. The
     * default value is <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter that returns only transform jobs created after the specified
     * time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only transform jobs created after the
     *         specified time.
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only transform jobs created after the specified
     * time.
     * </p>
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only transform jobs created after the
     *            specified time.
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only transform jobs created after the specified
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only transform jobs created after the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only transform jobs created before the specified
     * time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only transform jobs created before the
     *         specified time.
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only transform jobs created before the specified
     * time.
     * </p>
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only transform jobs created before the
     *            specified time.
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only transform jobs created before the specified
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only transform jobs created before the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified after the specified
     * time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only transform jobs modified after the
     *         specified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTimeAfter() {
        return lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified after the specified
     * time.
     * </p>
     *
     * @param lastModifiedTimeAfter <p>
     *            A filter that returns only transform jobs modified after the
     *            specified time.
     *            </p>
     */
    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified after the specified
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeAfter <p>
     *            A filter that returns only transform jobs modified after the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified before the specified
     * time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only transform jobs modified before the
     *         specified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTimeBefore() {
        return lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified before the specified
     * time.
     * </p>
     *
     * @param lastModifiedTimeBefore <p>
     *            A filter that returns only transform jobs modified before the
     *            specified time.
     *            </p>
     */
    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only transform jobs modified before the specified
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeBefore <p>
     *            A filter that returns only transform jobs modified before the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
        return this;
    }

    /**
     * <p>
     * A string in the transform job name. This filter returns only transform
     * jobs whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         A string in the transform job name. This filter returns only
     *         transform jobs whose name contains the specified string.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * A string in the transform job name. This filter returns only transform
     * jobs whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param nameContains <p>
     *            A string in the transform job name. This filter returns only
     *            transform jobs whose name contains the specified string.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the transform job name. This filter returns only transform
     * jobs whose name contains the specified string.
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
     *            A string in the transform job name. This filter returns only
     *            transform jobs whose name contains the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
        return this;
    }

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         A filter that retrieves only transform jobs with a specific
     *         status.
     *         </p>
     * @see TransformJobStatus
     */
    public String getStatusEquals() {
        return statusEquals;
    }

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that retrieves only transform jobs with a specific
     *            status.
     *            </p>
     * @see TransformJobStatus
     */
    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that retrieves only transform jobs with a specific
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformJobStatus
     */
    public ListTransformJobsRequest withStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
        return this;
    }

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that retrieves only transform jobs with a specific
     *            status.
     *            </p>
     * @see TransformJobStatus
     */
    public void setStatusEquals(TransformJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
    }

    /**
     * <p>
     * A filter that retrieves only transform jobs with a specific status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that retrieves only transform jobs with a specific
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformJobStatus
     */
    public ListTransformJobsRequest withStatusEquals(TransformJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @return <p>
     *         The field to sort results by. The default is
     *         <code>CreationTime</code>.
     *         </p>
     * @see SortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see SortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortBy
     */
    public ListTransformJobsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see SortBy
     */
    public void setSortBy(SortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortBy
     */
    public ListTransformJobsRequest withSortBy(SortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for results. The default is
     *         <code>Descending</code>.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Descending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTransformJobsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Descending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTransformJobsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTransformJobs</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of transform jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the result of the previous <code>ListTransformJobs</code>
     *         request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of transform
     *         jobs, use the token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTransformJobs</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of transform jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous <code>ListTransformJobs</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of transform
     *            jobs, use the token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTransformJobs</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of transform jobs, use the token in the next request.
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
     *            If the result of the previous <code>ListTransformJobs</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of transform
     *            jobs, use the token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of transform jobs to return in the response. The
     * default value is <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of transform jobs to return in the response.
     *         The default value is <code>10</code>.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of transform jobs to return in the response. The
     * default value is <code>10</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of transform jobs to return in the
     *            response. The default value is <code>10</code>.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of transform jobs to return in the response. The
     * default value is <code>10</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of transform jobs to return in the
     *            response. The default value is <code>10</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsRequest withMaxResults(Integer maxResults) {
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
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
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
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
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

        if (obj instanceof ListTransformJobsRequest == false)
            return false;
        ListTransformJobsRequest other = (ListTransformJobsRequest) obj;

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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
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
