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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of labeling jobs assigned to a specified work team.
 * </p>
 */
public class ListLabelingJobsForWorkteamRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team for which you want to see
     * labeling jobs for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     */
    private String workteamArn;

    /**
     * <p>
     * The maximum number of labeling jobs to return in each page of the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the result of the previous <code>ListLabelingJobsForWorkteam</code>
     * request was truncated, the response includes a <code>NextToken</code>. To
     * retrieve the next set of labeling jobs, use the token in the next
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A filter that returns only labeling jobs created after the specified time
     * (timestamp).
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * A filter that returns only labeling jobs created before the specified
     * time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * A filter the limits jobs to only the ones whose job reference code
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String jobReferenceCodeContains;

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime
     */
    private String sortBy;

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team for which you want to see
     * labeling jobs for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the work team for which you
     *         want to see labeling jobs for.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team for which you want to see
     * labeling jobs for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the work team for which you
     *            want to see labeling jobs for.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team for which you want to see
     * labeling jobs for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the work team for which you
     *            want to see labeling jobs for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * The maximum number of labeling jobs to return in each page of the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of labeling jobs to return in each page of the
     *         response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of labeling jobs to return in each page of the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of labeling jobs to return in each page of
     *            the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of labeling jobs to return in each page of the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of labeling jobs to return in each page of
     *            the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListLabelingJobsForWorkteam</code>
     * request was truncated, the response includes a <code>NextToken</code>. To
     * retrieve the next set of labeling jobs, use the token in the next
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the result of the previous
     *         <code>ListLabelingJobsForWorkteam</code> request was truncated,
     *         the response includes a <code>NextToken</code>. To retrieve the
     *         next set of labeling jobs, use the token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListLabelingJobsForWorkteam</code>
     * request was truncated, the response includes a <code>NextToken</code>. To
     * retrieve the next set of labeling jobs, use the token in the next
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous
     *            <code>ListLabelingJobsForWorkteam</code> request was
     *            truncated, the response includes a <code>NextToken</code>. To
     *            retrieve the next set of labeling jobs, use the token in the
     *            next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListLabelingJobsForWorkteam</code>
     * request was truncated, the response includes a <code>NextToken</code>. To
     * retrieve the next set of labeling jobs, use the token in the next
     * request.
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
     *            If the result of the previous
     *            <code>ListLabelingJobsForWorkteam</code> request was
     *            truncated, the response includes a <code>NextToken</code>. To
     *            retrieve the next set of labeling jobs, use the token in the
     *            next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created after the specified time
     * (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only labeling jobs created after the
     *         specified time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created after the specified time
     * (timestamp).
     * </p>
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only labeling jobs created after the
     *            specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created after the specified time
     * (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only labeling jobs created after the
     *            specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created before the specified
     * time (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only labeling jobs created before the
     *         specified time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created before the specified
     * time (timestamp).
     * </p>
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only labeling jobs created before the
     *            specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only labeling jobs created before the specified
     * time (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only labeling jobs created before the
     *            specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withCreationTimeBefore(
            java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * A filter the limits jobs to only the ones whose job reference code
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A filter the limits jobs to only the ones whose job reference
     *         code contains the specified string.
     *         </p>
     */
    public String getJobReferenceCodeContains() {
        return jobReferenceCodeContains;
    }

    /**
     * <p>
     * A filter the limits jobs to only the ones whose job reference code
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCodeContains <p>
     *            A filter the limits jobs to only the ones whose job reference
     *            code contains the specified string.
     *            </p>
     */
    public void setJobReferenceCodeContains(String jobReferenceCodeContains) {
        this.jobReferenceCodeContains = jobReferenceCodeContains;
    }

    /**
     * <p>
     * A filter the limits jobs to only the ones whose job reference code
     * contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCodeContains <p>
     *            A filter the limits jobs to only the ones whose job reference
     *            code contains the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamRequest withJobReferenceCodeContains(
            String jobReferenceCodeContains) {
        this.jobReferenceCodeContains = jobReferenceCodeContains;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime
     *
     * @return <p>
     *         The field to sort results by. The default is
     *         <code>CreationTime</code>.
     *         </p>
     * @see ListLabelingJobsForWorkteamSortByOptions
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
     * <b>Allowed Values: </b>CreationTime
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see ListLabelingJobsForWorkteamSortByOptions
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
     * <b>Allowed Values: </b>CreationTime
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListLabelingJobsForWorkteamSortByOptions
     */
    public ListLabelingJobsForWorkteamRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see ListLabelingJobsForWorkteamSortByOptions
     */
    public void setSortBy(ListLabelingJobsForWorkteamSortByOptions sortBy) {
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
     * <b>Allowed Values: </b>CreationTime
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListLabelingJobsForWorkteamSortByOptions
     */
    public ListLabelingJobsForWorkteamRequest withSortBy(
            ListLabelingJobsForWorkteamSortByOptions sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for results. The default is <code>Ascending</code>
     *         .
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
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
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListLabelingJobsForWorkteamRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
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
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListLabelingJobsForWorkteamRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore() + ",");
        if (getJobReferenceCodeContains() != null)
            sb.append("JobReferenceCodeContains: " + getJobReferenceCodeContains() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobReferenceCodeContains() == null) ? 0 : getJobReferenceCodeContains()
                        .hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLabelingJobsForWorkteamRequest == false)
            return false;
        ListLabelingJobsForWorkteamRequest other = (ListLabelingJobsForWorkteamRequest) obj;

        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
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
        if (other.getJobReferenceCodeContains() == null
                ^ this.getJobReferenceCodeContains() == null)
            return false;
        if (other.getJobReferenceCodeContains() != null
                && other.getJobReferenceCodeContains().equals(this.getJobReferenceCodeContains()) == false)
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
        return true;
    }
}
