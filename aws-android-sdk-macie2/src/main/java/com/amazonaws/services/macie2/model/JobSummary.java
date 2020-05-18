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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a classification job, including the current status
 * of the job.
 * </p>
 */
public class JobSummary implements Serializable {
    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     */
    private java.util.List<S3BucketDefinitionForJob> bucketDefinitions;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was
     * created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     */
    private String jobStatus;

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     */
    private String jobType;

    /**
     * <p>
     * The custom name of the job.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     *
     * @return <p>
     *         The S3 buckets that the job is configured to analyze.
     *         </p>
     */
    public java.util.List<S3BucketDefinitionForJob> getBucketDefinitions() {
        return bucketDefinitions;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     *
     * @param bucketDefinitions <p>
     *            The S3 buckets that the job is configured to analyze.
     *            </p>
     */
    public void setBucketDefinitions(
            java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        if (bucketDefinitions == null) {
            this.bucketDefinitions = null;
            return;
        }

        this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(
                bucketDefinitions);
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketDefinitions <p>
     *            The S3 buckets that the job is configured to analyze.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withBucketDefinitions(S3BucketDefinitionForJob... bucketDefinitions) {
        if (getBucketDefinitions() == null) {
            this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(
                    bucketDefinitions.length);
        }
        for (S3BucketDefinitionForJob value : bucketDefinitions) {
            this.bucketDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketDefinitions <p>
     *            The S3 buckets that the job is configured to analyze.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withBucketDefinitions(
            java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        setBucketDefinitions(bucketDefinitions);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was
     * created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         job was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was
     * created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the job was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     *
     * @param jobId <p>
     *            The unique identifier for the job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobId <p>
     *            The unique identifier for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     *
     * @return <p>
     *         The current status of the job. Possible value are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CANCELLED - The job was cancelled by you or a user of the master
     *         account for your organization. A job might also be cancelled if
     *         ownership of an S3 bucket changed while the job was running, and
     *         that change affected the job's access to the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETE - Amazon Macie finished processing all the data
     *         specified for the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IDLE - For a recurring job, the previous scheduled run is
     *         complete and the next scheduled run is pending. This value
     *         doesn't apply to jobs that occur only once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAUSED - Amazon Macie started the job, but completion of the job
     *         would exceed one or more quotas for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING - The job is in progress.
     *         </p>
     *         </li>
     *         </ul>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     *
     * @param jobStatus <p>
     *            The current status of the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CANCELLED - The job was cancelled by you or a user of the
     *            master account for your organization. A job might also be
     *            cancelled if ownership of an S3 bucket changed while the job
     *            was running, and that change affected the job's access to the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETE - Amazon Macie finished processing all the data
     *            specified for the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDLE - For a recurring job, the previous scheduled run is
     *            complete and the next scheduled run is pending. This value
     *            doesn't apply to jobs that occur only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAUSED - Amazon Macie started the job, but completion of the
     *            job would exceed one or more quotas for your account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RUNNING - The job is in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     *
     * @param jobStatus <p>
     *            The current status of the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CANCELLED - The job was cancelled by you or a user of the
     *            master account for your organization. A job might also be
     *            cancelled if ownership of an S3 bucket changed while the job
     *            was running, and that change affected the job's access to the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETE - Amazon Macie finished processing all the data
     *            specified for the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDLE - For a recurring job, the previous scheduled run is
     *            complete and the next scheduled run is pending. This value
     *            doesn't apply to jobs that occur only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAUSED - Amazon Macie started the job, but completion of the
     *            job would exceed one or more quotas for your account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RUNNING - The job is in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public JobSummary withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     *
     * @param jobStatus <p>
     *            The current status of the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CANCELLED - The job was cancelled by you or a user of the
     *            master account for your organization. A job might also be
     *            cancelled if ownership of an S3 bucket changed while the job
     *            was running, and that change affected the job's access to the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETE - Amazon Macie finished processing all the data
     *            specified for the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDLE - For a recurring job, the previous scheduled run is
     *            complete and the next scheduled run is pending. This value
     *            doesn't apply to jobs that occur only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAUSED - Amazon Macie started the job, but completion of the
     *            job would exceed one or more quotas for your account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RUNNING - The job is in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account
     * for your organization. A job might also be cancelled if ownership of an
     * S3 bucket changed while the job was running, and that change affected the
     * job's access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for
     * the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and
     * the next scheduled run is pending. This value doesn't apply to jobs that
     * occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would
     * exceed one or more quotas for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE
     *
     * @param jobStatus <p>
     *            The current status of the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CANCELLED - The job was cancelled by you or a user of the
     *            master account for your organization. A job might also be
     *            cancelled if ownership of an S3 bucket changed while the job
     *            was running, and that change affected the job's access to the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETE - Amazon Macie finished processing all the data
     *            specified for the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDLE - For a recurring job, the previous scheduled run is
     *            complete and the next scheduled run is pending. This value
     *            doesn't apply to jobs that occur only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAUSED - Amazon Macie started the job, but completion of the
     *            job would exceed one or more quotas for your account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RUNNING - The job is in progress.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public JobSummary withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @return <p>
     *         The schedule for running the job. Possible value are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - The job ran or will run only once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *         </p>
     *         </li>
     *         </ul>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - The job ran or will run only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - The job ran or will run only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobSummary withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - The job ran or will run only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Possible value are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - The job ran or will run only once.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobSummary withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     *
     * @return <p>
     *         The custom name of the job.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     *
     * @param name <p>
     *            The custom name of the job.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withName(String name) {
        this.name = name;
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
        if (getBucketDefinitions() != null)
            sb.append("bucketDefinitions: " + getBucketDefinitions() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getJobStatus() != null)
            sb.append("jobStatus: " + getJobStatus() + ",");
        if (getJobType() != null)
            sb.append("jobType: " + getJobType() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBucketDefinitions() == null) ? 0 : getBucketDefinitions().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;

        if (other.getBucketDefinitions() == null ^ this.getBucketDefinitions() == null)
            return false;
        if (other.getBucketDefinitions() != null
                && other.getBucketDefinitions().equals(this.getBucketDefinitions()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
