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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information for filtering a list of translation jobs. For more
 * information, see <a>ListTextTranslationJobs</a>.
 * </p>
 */
public class TextTranslationJobFilter implements Serializable {
    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted before the specified time.
     * Jobs are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submittedBeforeTime;

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted after the specified time.
     * Jobs are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submittedAfterTime;

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         Filters the list of jobs by name.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            Filters the list of jobs by name.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            Filters the list of jobs by name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobFilter withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         Filters the list of jobs based by job status.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based by job status.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based by job status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public TextTranslationJobFilter withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based by job status.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based by job status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public TextTranslationJobFilter withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted before the specified time.
     * Jobs are returned in ascending order, oldest to newest.
     * </p>
     *
     * @return <p>
     *         Filters the list of jobs based on the time that the job was
     *         submitted for processing and returns only the jobs submitted
     *         before the specified time. Jobs are returned in ascending order,
     *         oldest to newest.
     *         </p>
     */
    public java.util.Date getSubmittedBeforeTime() {
        return submittedBeforeTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted before the specified time.
     * Jobs are returned in ascending order, oldest to newest.
     * </p>
     *
     * @param submittedBeforeTime <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing and returns only the jobs submitted
     *            before the specified time. Jobs are returned in ascending
     *            order, oldest to newest.
     *            </p>
     */
    public void setSubmittedBeforeTime(java.util.Date submittedBeforeTime) {
        this.submittedBeforeTime = submittedBeforeTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted before the specified time.
     * Jobs are returned in ascending order, oldest to newest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedBeforeTime <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing and returns only the jobs submitted
     *            before the specified time. Jobs are returned in ascending
     *            order, oldest to newest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobFilter withSubmittedBeforeTime(java.util.Date submittedBeforeTime) {
        this.submittedBeforeTime = submittedBeforeTime;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted after the specified time.
     * Jobs are returned in descending order, newest to oldest.
     * </p>
     *
     * @return <p>
     *         Filters the list of jobs based on the time that the job was
     *         submitted for processing and returns only the jobs submitted
     *         after the specified time. Jobs are returned in descending order,
     *         newest to oldest.
     *         </p>
     */
    public java.util.Date getSubmittedAfterTime() {
        return submittedAfterTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted after the specified time.
     * Jobs are returned in descending order, newest to oldest.
     * </p>
     *
     * @param submittedAfterTime <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing and returns only the jobs submitted
     *            after the specified time. Jobs are returned in descending
     *            order, newest to oldest.
     *            </p>
     */
    public void setSubmittedAfterTime(java.util.Date submittedAfterTime) {
        this.submittedAfterTime = submittedAfterTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing and returns only the jobs submitted after the specified time.
     * Jobs are returned in descending order, newest to oldest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedAfterTime <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing and returns only the jobs submitted
     *            after the specified time. Jobs are returned in descending
     *            order, newest to oldest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobFilter withSubmittedAfterTime(java.util.Date submittedAfterTime) {
        this.submittedAfterTime = submittedAfterTime;
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
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getSubmittedBeforeTime() != null)
            sb.append("SubmittedBeforeTime: " + getSubmittedBeforeTime() + ",");
        if (getSubmittedAfterTime() != null)
            sb.append("SubmittedAfterTime: " + getSubmittedAfterTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedBeforeTime() == null) ? 0 : getSubmittedBeforeTime().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedAfterTime() == null) ? 0 : getSubmittedAfterTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextTranslationJobFilter == false)
            return false;
        TextTranslationJobFilter other = (TextTranslationJobFilter) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSubmittedBeforeTime() == null ^ this.getSubmittedBeforeTime() == null)
            return false;
        if (other.getSubmittedBeforeTime() != null
                && other.getSubmittedBeforeTime().equals(this.getSubmittedBeforeTime()) == false)
            return false;
        if (other.getSubmittedAfterTime() == null ^ this.getSubmittedAfterTime() == null)
            return false;
        if (other.getSubmittedAfterTime() != null
                && other.getSubmittedAfterTime().equals(this.getSubmittedAfterTime()) == false)
            return false;
        return true;
    }
}
