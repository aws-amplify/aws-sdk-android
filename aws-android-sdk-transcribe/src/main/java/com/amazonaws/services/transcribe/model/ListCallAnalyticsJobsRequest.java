/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List call analytics jobs with a specified status or substring that matches
 * their names.
 * </p>
 */
public class ListCallAnalyticsJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String status;

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String jobNameContains;

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of call analytics jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         When specified, returns only call analytics jobs with the
     *         specified status. Jobs are ordered by creation date, with the
     *         most recent jobs returned first. If you don't specify a status,
     *         Amazon Transcribe returns all analytics jobs ordered by creation
     *         date.
     *         </p>
     * @see CallAnalyticsJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            When specified, returns only call analytics jobs with the
     *            specified status. Jobs are ordered by creation date, with the
     *            most recent jobs returned first. If you don't specify a
     *            status, Amazon Transcribe returns all analytics jobs ordered
     *            by creation date.
     *            </p>
     * @see CallAnalyticsJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            When specified, returns only call analytics jobs with the
     *            specified status. Jobs are ordered by creation date, with the
     *            most recent jobs returned first. If you don't specify a
     *            status, Amazon Transcribe returns all analytics jobs ordered
     *            by creation date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CallAnalyticsJobStatus
     */
    public ListCallAnalyticsJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            When specified, returns only call analytics jobs with the
     *            specified status. Jobs are ordered by creation date, with the
     *            most recent jobs returned first. If you don't specify a
     *            status, Amazon Transcribe returns all analytics jobs ordered
     *            by creation date.
     *            </p>
     * @see CallAnalyticsJobStatus
     */
    public void setStatus(CallAnalyticsJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified
     * status. Jobs are ordered by creation date, with the most recent jobs
     * returned first. If you don't specify a status, Amazon Transcribe returns
     * all analytics jobs ordered by creation date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            When specified, returns only call analytics jobs with the
     *            specified status. Jobs are ordered by creation date, with the
     *            most recent jobs returned first. If you don't specify a
     *            status, Amazon Transcribe returns all analytics jobs ordered
     *            by creation date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CallAnalyticsJobStatus
     */
    public ListCallAnalyticsJobsRequest withStatus(CallAnalyticsJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         When specified, the jobs returned in the list are limited to jobs
     *         whose name contains the specified string.
     *         </p>
     */
    public String getJobNameContains() {
        return jobNameContains;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param jobNameContains <p>
     *            When specified, the jobs returned in the list are limited to
     *            jobs whose name contains the specified string.
     *            </p>
     */
    public void setJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose
     * name contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param jobNameContains <p>
     *            When specified, the jobs returned in the list are limited to
     *            jobs whose name contains the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsJobsRequest withJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
        return this;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         If you receive a truncated result in the previous request of ,
     *         include <code>NextToken</code> to fetch the next set of jobs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If you receive a truncated result in the previous request of ,
     *            include <code>NextToken</code> to fetch the next set of jobs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include
     * <code>NextToken</code> to fetch the next set of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If you receive a truncated result in the previous request of ,
     *            include <code>NextToken</code> to fetch the next set of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of call analytics jobs to return in the
     *         response. If there are fewer results in the list, this response
     *         contains only the actual results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of call analytics jobs to return in the
     *            response. If there are fewer results in the list, this
     *            response contains only the actual results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in the response. If
     * there are fewer results in the list, this response contains only the
     * actual results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of call analytics jobs to return in the
     *            response. If there are fewer results in the list, this
     *            response contains only the actual results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsJobsRequest withMaxResults(Integer maxResults) {
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getJobNameContains() != null)
            sb.append("JobNameContains: " + getJobNameContains() + ",");
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getJobNameContains() == null) ? 0 : getJobNameContains().hashCode());
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

        if (obj instanceof ListCallAnalyticsJobsRequest == false)
            return false;
        ListCallAnalyticsJobsRequest other = (ListCallAnalyticsJobsRequest) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobNameContains() == null ^ this.getJobNameContains() == null)
            return false;
        if (other.getJobNameContains() != null
                && other.getJobNameContains().equals(this.getJobNameContains()) == false)
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
