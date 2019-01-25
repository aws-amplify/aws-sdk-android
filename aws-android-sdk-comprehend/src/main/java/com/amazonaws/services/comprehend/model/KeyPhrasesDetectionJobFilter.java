/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information for filtering a list of dominant language detection
 * jobs. For more information, see the operation.
 * </p>
 */
public class KeyPhrasesDetectionJobFilter implements Serializable {
    /**
     * <p>
     * Filters on the name of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted before the specified time. Jobs
     * are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submitTimeBefore;

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted after the specified time. Jobs
     * are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submitTimeAfter;

    /**
     * <p>
     * Filters on the name of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         Filters on the name of the job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * Filters on the name of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            Filters on the name of the job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Filters on the name of the job.
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
     *            Filters on the name of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyPhrasesDetectionJobFilter withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         Filters the list of jobs based on job status. Returns only jobs
     *         with the specified status.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based on job status. Returns only
     *            jobs with the specified status.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based on job status. Returns only
     *            jobs with the specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public KeyPhrasesDetectionJobFilter withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based on job status. Returns only
     *            jobs with the specified status.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * Filters the list of jobs based on job status. Returns only jobs with the
     * specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Filters the list of jobs based on job status. Returns only
     *            jobs with the specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public KeyPhrasesDetectionJobFilter withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted before the specified time. Jobs
     * are returned in ascending order, oldest to newest.
     * </p>
     *
     * @return <p>
     *         Filters the list of jobs based on the time that the job was
     *         submitted for processing. Returns only jobs submitted before the
     *         specified time. Jobs are returned in ascending order, oldest to
     *         newest.
     *         </p>
     */
    public java.util.Date getSubmitTimeBefore() {
        return submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted before the specified time. Jobs
     * are returned in ascending order, oldest to newest.
     * </p>
     *
     * @param submitTimeBefore <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing. Returns only jobs submitted before
     *            the specified time. Jobs are returned in ascending order,
     *            oldest to newest.
     *            </p>
     */
    public void setSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted before the specified time. Jobs
     * are returned in ascending order, oldest to newest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTimeBefore <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing. Returns only jobs submitted before
     *            the specified time. Jobs are returned in ascending order,
     *            oldest to newest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyPhrasesDetectionJobFilter withSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted after the specified time. Jobs
     * are returned in descending order, newest to oldest.
     * </p>
     *
     * @return <p>
     *         Filters the list of jobs based on the time that the job was
     *         submitted for processing. Returns only jobs submitted after the
     *         specified time. Jobs are returned in descending order, newest to
     *         oldest.
     *         </p>
     */
    public java.util.Date getSubmitTimeAfter() {
        return submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted after the specified time. Jobs
     * are returned in descending order, newest to oldest.
     * </p>
     *
     * @param submitTimeAfter <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing. Returns only jobs submitted after
     *            the specified time. Jobs are returned in descending order,
     *            newest to oldest.
     *            </p>
     */
    public void setSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for
     * processing. Returns only jobs submitted after the specified time. Jobs
     * are returned in descending order, newest to oldest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTimeAfter <p>
     *            Filters the list of jobs based on the time that the job was
     *            submitted for processing. Returns only jobs submitted after
     *            the specified time. Jobs are returned in descending order,
     *            newest to oldest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyPhrasesDetectionJobFilter withSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
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
        if (getSubmitTimeBefore() != null)
            sb.append("SubmitTimeBefore: " + getSubmitTimeBefore() + ",");
        if (getSubmitTimeAfter() != null)
            sb.append("SubmitTimeAfter: " + getSubmitTimeAfter());
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
                + ((getSubmitTimeBefore() == null) ? 0 : getSubmitTimeBefore().hashCode());
        hashCode = prime * hashCode
                + ((getSubmitTimeAfter() == null) ? 0 : getSubmitTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPhrasesDetectionJobFilter == false)
            return false;
        KeyPhrasesDetectionJobFilter other = (KeyPhrasesDetectionJobFilter) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSubmitTimeBefore() == null ^ this.getSubmitTimeBefore() == null)
            return false;
        if (other.getSubmitTimeBefore() != null
                && other.getSubmitTimeBefore().equals(this.getSubmitTimeBefore()) == false)
            return false;
        if (other.getSubmitTimeAfter() == null ^ this.getSubmitTimeAfter() == null)
            return false;
        if (other.getSubmitTimeAfter() != null
                && other.getSubmitTimeAfter().equals(this.getSubmitTimeAfter()) == false)
            return false;
        return true;
    }
}
