/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides a list of medical transcription jobs that match the specified
 * criteria. If no criteria are specified, all medical transcription jobs are
 * returned.
 * </p>
 * <p>
 * To get detailed information about a specific medical transcription job, use
 * the operation.
 * </p>
 */
public class ListMedicalTranscriptionJobsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String status;

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified
     * string. The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String jobNameContains;

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more
     * results than can be displayed, <code>NextToken</code> is displayed in the
     * response with an associated string. To get the next page of results, copy
     * this string and repeat your request, including <code>NextToken</code>
     * with the value of the copied string. Repeat as needed to view all your
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page
     * of results. If there are fewer results than the value that you specify,
     * only the actual results are returned. If you don't specify a value, a
     * default of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Returns only medical transcription jobs with the specified
     *         status. Jobs are ordered by creation date, with the newest job
     *         first. If you don't include <code>Status</code>, all medical
     *         transcription jobs are returned.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Returns only medical transcription jobs with the specified
     *            status. Jobs are ordered by creation date, with the newest job
     *            first. If you don't include <code>Status</code>, all medical
     *            transcription jobs are returned.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Returns only medical transcription jobs with the specified
     *            status. Jobs are ordered by creation date, with the newest job
     *            first. If you don't include <code>Status</code>, all medical
     *            transcription jobs are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public ListMedicalTranscriptionJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Returns only medical transcription jobs with the specified
     *            status. Jobs are ordered by creation date, with the newest job
     *            first. If you don't include <code>Status</code>, all medical
     *            transcription jobs are returned.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Returns only medical transcription jobs with the specified status. Jobs
     * are ordered by creation date, with the newest job first. If you don't
     * include <code>Status</code>, all medical transcription jobs are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Returns only medical transcription jobs with the specified
     *            status. Jobs are ordered by creation date, with the newest job
     *            first. If you don't include <code>Status</code>, all medical
     *            transcription jobs are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public ListMedicalTranscriptionJobsRequest withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified
     * string. The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         Returns only the medical transcription jobs that contain the
     *         specified string. The search is not case sensitive.
     *         </p>
     */
    public String getJobNameContains() {
        return jobNameContains;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified
     * string. The search is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param jobNameContains <p>
     *            Returns only the medical transcription jobs that contain the
     *            specified string. The search is not case sensitive.
     *            </p>
     */
    public void setJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
    }

    /**
     * <p>
     * Returns only the medical transcription jobs that contain the specified
     * string. The search is not case sensitive.
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
     *            Returns only the medical transcription jobs that contain the
     *            specified string. The search is not case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalTranscriptionJobsRequest withJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
        return this;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more
     * results than can be displayed, <code>NextToken</code> is displayed in the
     * response with an associated string. To get the next page of results, copy
     * this string and repeat your request, including <code>NextToken</code>
     * with the value of the copied string. Repeat as needed to view all your
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         If your <code>ListMedicalTranscriptionJobs</code> request returns
     *         more results than can be displayed, <code>NextToken</code> is
     *         displayed in the response with an associated string. To get the
     *         next page of results, copy this string and repeat your request,
     *         including <code>NextToken</code> with the value of the copied
     *         string. Repeat as needed to view all your results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more
     * results than can be displayed, <code>NextToken</code> is displayed in the
     * response with an associated string. To get the next page of results, copy
     * this string and repeat your request, including <code>NextToken</code>
     * with the value of the copied string. Repeat as needed to view all your
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If your <code>ListMedicalTranscriptionJobs</code> request
     *            returns more results than can be displayed,
     *            <code>NextToken</code> is displayed in the response with an
     *            associated string. To get the next page of results, copy this
     *            string and repeat your request, including
     *            <code>NextToken</code> with the value of the copied string.
     *            Repeat as needed to view all your results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your <code>ListMedicalTranscriptionJobs</code> request returns more
     * results than can be displayed, <code>NextToken</code> is displayed in the
     * response with an associated string. To get the next page of results, copy
     * this string and repeat your request, including <code>NextToken</code>
     * with the value of the copied string. Repeat as needed to view all your
     * results.
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
     *            If your <code>ListMedicalTranscriptionJobs</code> request
     *            returns more results than can be displayed,
     *            <code>NextToken</code> is displayed in the response with an
     *            associated string. To get the next page of results, copy this
     *            string and repeat your request, including
     *            <code>NextToken</code> with the value of the copied string.
     *            Repeat as needed to view all your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalTranscriptionJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page
     * of results. If there are fewer results than the value that you specify,
     * only the actual results are returned. If you don't specify a value, a
     * default of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of medical transcription jobs to return in
     *         each page of results. If there are fewer results than the value
     *         that you specify, only the actual results are returned. If you
     *         don't specify a value, a default of 5 is used.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page
     * of results. If there are fewer results than the value that you specify,
     * only the actual results are returned. If you don't specify a value, a
     * default of 5 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of medical transcription jobs to return in
     *            each page of results. If there are fewer results than the
     *            value that you specify, only the actual results are returned.
     *            If you don't specify a value, a default of 5 is used.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of medical transcription jobs to return in each page
     * of results. If there are fewer results than the value that you specify,
     * only the actual results are returned. If you don't specify a value, a
     * default of 5 is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of medical transcription jobs to return in
     *            each page of results. If there are fewer results than the
     *            value that you specify, only the actual results are returned.
     *            If you don't specify a value, a default of 5 is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalTranscriptionJobsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListMedicalTranscriptionJobsRequest == false)
            return false;
        ListMedicalTranscriptionJobsRequest other = (ListMedicalTranscriptionJobsRequest) obj;

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
