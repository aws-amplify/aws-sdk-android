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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Each job converts an input file into an output file or files. For more
 * information, see the User Guide at
 * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
 */
public class Job implements Serializable {
    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content.
     */
    private AccelerationSettings accelerationSettings;

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     */
    private String accelerationStatus;

    /**
     * An identifier for this resource that is unique within all of AWS.
     */
    private String arn;

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     */
    private String billingTagsSource;

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     */
    private java.util.Date createdAt;

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     */
    private String currentPhase;

    /**
     * Error code for the job
     */
    private Integer errorCode;

    /**
     * Error message of Job
     */
    private String errorMessage;

    /**
     * Optional list of hop destinations.
     */
    private java.util.List<HopDestination> hopDestinations;

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert
     * resources
     */
    private String id;

    /**
     * An estimate of how far your job has progressed. This estimate is shown as
     * a percentage of the total time from when your job leaves its queue to
     * when your output files appear in your output Amazon S3 bucket. AWS
     * Elemental MediaConvert provides jobPercentComplete in CloudWatch
     * STATUS_UPDATE events and in the response to GetJob and ListJobs requests.
     * The jobPercentComplete estimate is reliable for the following input
     * containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the
     * service can't provide information about job progress. In those cases,
     * jobPercentComplete returns a null value.
     */
    private Integer jobPercentComplete;

    /**
     * The job template that the job is created from, if it is created from a
     * job template.
     */
    private String jobTemplate;

    /**
     * Provides messages from the service about jobs that you have already
     * successfully submitted.
     */
    private JobMessages messages;

    /**
     * List of output group details
     */
    private java.util.List<OutputGroupDetail> outputGroupDetails;

    /**
     * Relative priority on the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     */
    private Integer priority;

    /**
     * When you create a job, you can specify a queue to send it to. If you
     * don't specify, the job will go to the default queue. For more about
     * queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    private String queue;

    /**
     * The job's queue hopping history.
     */
    private java.util.List<QueueTransition> queueTransitions;

    /**
     * The number of times that the service automatically attempted to process
     * your job after encountering an error.
     */
    private Integer retryCount;

    /**
     * The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    private String role;

    /**
     * JobSettings contains all the transcode settings for a job.
     */
    private JobSettings settings;

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String simulateReservedQueue;

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     */
    private String status;

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     */
    private String statusUpdateInterval;

    /**
     * Information about when jobs are submitted, started, and finished is
     * specified in Unix epoch format in seconds.
     */
    private Timing timing;

    /**
     * User-defined metadata that you want to associate with an MediaConvert
     * job. You specify metadata in key/value pairs.
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content.
     *
     * @return Accelerated transcoding can significantly speed up jobs with
     *         long, visually complex content.
     */
    public AccelerationSettings getAccelerationSettings() {
        return accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content.
     *
     * @param accelerationSettings Accelerated transcoding can significantly
     *            speed up jobs with long, visually complex content.
     */
    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerationSettings Accelerated transcoding can significantly
     *            speed up jobs with long, visually complex content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
        return this;
    }

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     *
     * @return Describes whether the current job is running with accelerated
     *         transcoding. For jobs that have Acceleration (AccelerationMode)
     *         set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For
     *         jobs that have Acceleration (AccelerationMode) set to ENABLED or
     *         PREFERRED, AccelerationStatus is one of the other states.
     *         AccelerationStatus is IN_PROGRESS initially, while the service
     *         determines whether the input files and job settings are
     *         compatible with accelerated transcoding. If they are,
     *         AcclerationStatus is ACCELERATED. If your input files and job
     *         settings aren't compatible with accelerated transcoding, the
     *         service either fails your job or runs it without accelerated
     *         transcoding, depending on how you set Acceleration
     *         (AccelerationMode). When the service runs your job without
     *         accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
     * @see AccelerationStatus
     */
    public String getAccelerationStatus() {
        return accelerationStatus;
    }

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     *
     * @param accelerationStatus Describes whether the current job is running
     *            with accelerated transcoding. For jobs that have Acceleration
     *            (AccelerationMode) set to DISABLED, AccelerationStatus is
     *            always NOT_APPLICABLE. For jobs that have Acceleration
     *            (AccelerationMode) set to ENABLED or PREFERRED,
     *            AccelerationStatus is one of the other states.
     *            AccelerationStatus is IN_PROGRESS initially, while the service
     *            determines whether the input files and job settings are
     *            compatible with accelerated transcoding. If they are,
     *            AcclerationStatus is ACCELERATED. If your input files and job
     *            settings aren't compatible with accelerated transcoding, the
     *            service either fails your job or runs it without accelerated
     *            transcoding, depending on how you set Acceleration
     *            (AccelerationMode). When the service runs your job without
     *            accelerated transcoding, AccelerationStatus is
     *            NOT_ACCELERATED.
     * @see AccelerationStatus
     */
    public void setAccelerationStatus(String accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
    }

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     *
     * @param accelerationStatus Describes whether the current job is running
     *            with accelerated transcoding. For jobs that have Acceleration
     *            (AccelerationMode) set to DISABLED, AccelerationStatus is
     *            always NOT_APPLICABLE. For jobs that have Acceleration
     *            (AccelerationMode) set to ENABLED or PREFERRED,
     *            AccelerationStatus is one of the other states.
     *            AccelerationStatus is IN_PROGRESS initially, while the service
     *            determines whether the input files and job settings are
     *            compatible with accelerated transcoding. If they are,
     *            AcclerationStatus is ACCELERATED. If your input files and job
     *            settings aren't compatible with accelerated transcoding, the
     *            service either fails your job or runs it without accelerated
     *            transcoding, depending on how you set Acceleration
     *            (AccelerationMode). When the service runs your job without
     *            accelerated transcoding, AccelerationStatus is
     *            NOT_ACCELERATED.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccelerationStatus
     */
    public Job withAccelerationStatus(String accelerationStatus) {
        this.accelerationStatus = accelerationStatus;
        return this;
    }

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     *
     * @param accelerationStatus Describes whether the current job is running
     *            with accelerated transcoding. For jobs that have Acceleration
     *            (AccelerationMode) set to DISABLED, AccelerationStatus is
     *            always NOT_APPLICABLE. For jobs that have Acceleration
     *            (AccelerationMode) set to ENABLED or PREFERRED,
     *            AccelerationStatus is one of the other states.
     *            AccelerationStatus is IN_PROGRESS initially, while the service
     *            determines whether the input files and job settings are
     *            compatible with accelerated transcoding. If they are,
     *            AcclerationStatus is ACCELERATED. If your input files and job
     *            settings aren't compatible with accelerated transcoding, the
     *            service either fails your job or runs it without accelerated
     *            transcoding, depending on how you set Acceleration
     *            (AccelerationMode). When the service runs your job without
     *            accelerated transcoding, AccelerationStatus is
     *            NOT_ACCELERATED.
     * @see AccelerationStatus
     */
    public void setAccelerationStatus(AccelerationStatus accelerationStatus) {
        this.accelerationStatus = accelerationStatus.toString();
    }

    /**
     * Describes whether the current job is running with accelerated
     * transcoding. For jobs that have Acceleration (AccelerationMode) set to
     * DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have
     * Acceleration (AccelerationMode) set to ENABLED or PREFERRED,
     * AccelerationStatus is one of the other states. AccelerationStatus is
     * IN_PROGRESS initially, while the service determines whether the input
     * files and job settings are compatible with accelerated transcoding. If
     * they are, AcclerationStatus is ACCELERATED. If your input files and job
     * settings aren't compatible with accelerated transcoding, the service
     * either fails your job or runs it without accelerated transcoding,
     * depending on how you set Acceleration (AccelerationMode). When the
     * service runs your job without accelerated transcoding, AccelerationStatus
     * is NOT_ACCELERATED.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_APPLICABLE, IN_PROGRESS, ACCELERATED,
     * NOT_ACCELERATED
     *
     * @param accelerationStatus Describes whether the current job is running
     *            with accelerated transcoding. For jobs that have Acceleration
     *            (AccelerationMode) set to DISABLED, AccelerationStatus is
     *            always NOT_APPLICABLE. For jobs that have Acceleration
     *            (AccelerationMode) set to ENABLED or PREFERRED,
     *            AccelerationStatus is one of the other states.
     *            AccelerationStatus is IN_PROGRESS initially, while the service
     *            determines whether the input files and job settings are
     *            compatible with accelerated transcoding. If they are,
     *            AcclerationStatus is ACCELERATED. If your input files and job
     *            settings aren't compatible with accelerated transcoding, the
     *            service either fails your job or runs it without accelerated
     *            transcoding, depending on how you set Acceleration
     *            (AccelerationMode). When the service runs your job without
     *            accelerated transcoding, AccelerationStatus is
     *            NOT_ACCELERATED.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccelerationStatus
     */
    public Job withAccelerationStatus(AccelerationStatus accelerationStatus) {
        this.accelerationStatus = accelerationStatus.toString();
        return this;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     *
     * @return An identifier for this resource that is unique within all of AWS.
     */
    public String getArn() {
        return arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     *
     * @param arn An identifier for this resource that is unique within all of
     *            AWS.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn An identifier for this resource that is unique within all of
     *            AWS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @return The tag type that AWS Billing and Cost Management will use to
     *         sort your AWS Elemental MediaConvert costs on any billing report
     *         that you set up.
     * @see BillingTagsSource
     */
    public String getBillingTagsSource() {
        return billingTagsSource;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource The tag type that AWS Billing and Cost
     *            Management will use to sort your AWS Elemental MediaConvert
     *            costs on any billing report that you set up.
     * @see BillingTagsSource
     */
    public void setBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource The tag type that AWS Billing and Cost
     *            Management will use to sort your AWS Elemental MediaConvert
     *            costs on any billing report that you set up.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingTagsSource
     */
    public Job withBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
        return this;
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource The tag type that AWS Billing and Cost
     *            Management will use to sort your AWS Elemental MediaConvert
     *            costs on any billing report that you set up.
     * @see BillingTagsSource
     */
    public void setBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
    }

    /**
     * The tag type that AWS Billing and Cost Management will use to sort your
     * AWS Elemental MediaConvert costs on any billing report that you set up.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource The tag type that AWS Billing and Cost
     *            Management will use to sort your AWS Elemental MediaConvert
     *            costs on any billing report that you set up.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingTagsSource
     */
    public Job withBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
        return this;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     *
     * @return The time, in Unix epoch format in seconds, when the job got
     *         created.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     *
     * @param createdAt The time, in Unix epoch format in seconds, when the job
     *            got created.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt The time, in Unix epoch format in seconds, when the job
     *            got created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     *
     * @return A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * @see JobPhase
     */
    public String getCurrentPhase() {
        return currentPhase;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     *
     * @param currentPhase A job's phase can be PROBING, TRANSCODING OR
     *            UPLOADING
     * @see JobPhase
     */
    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     *
     * @param currentPhase A job's phase can be PROBING, TRANSCODING OR
     *            UPLOADING
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobPhase
     */
    public Job withCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
        return this;
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     *
     * @param currentPhase A job's phase can be PROBING, TRANSCODING OR
     *            UPLOADING
     * @see JobPhase
     */
    public void setCurrentPhase(JobPhase currentPhase) {
        this.currentPhase = currentPhase.toString();
    }

    /**
     * A job's phase can be PROBING, TRANSCODING OR UPLOADING
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROBING, TRANSCODING, UPLOADING
     *
     * @param currentPhase A job's phase can be PROBING, TRANSCODING OR
     *            UPLOADING
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobPhase
     */
    public Job withCurrentPhase(JobPhase currentPhase) {
        this.currentPhase = currentPhase.toString();
        return this;
    }

    /**
     * Error code for the job
     *
     * @return Error code for the job
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Error code for the job
     *
     * @param errorCode Error code for the job
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Error code for the job
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode Error code for the job
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error message of Job
     *
     * @return Error message of Job
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Error message of Job
     *
     * @param errorMessage Error message of Job
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message of Job
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage Error message of Job
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Optional list of hop destinations.
     *
     * @return Optional list of hop destinations.
     */
    public java.util.List<HopDestination> getHopDestinations() {
        return hopDestinations;
    }

    /**
     * Optional list of hop destinations.
     *
     * @param hopDestinations Optional list of hop destinations.
     */
    public void setHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        if (hopDestinations == null) {
            this.hopDestinations = null;
            return;
        }

        this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations);
    }

    /**
     * Optional list of hop destinations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hopDestinations Optional list of hop destinations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withHopDestinations(HopDestination... hopDestinations) {
        if (getHopDestinations() == null) {
            this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations.length);
        }
        for (HopDestination value : hopDestinations) {
            this.hopDestinations.add(value);
        }
        return this;
    }

    /**
     * Optional list of hop destinations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hopDestinations Optional list of hop destinations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert
     * resources
     *
     * @return A portion of the job's ARN, unique within your AWS Elemental
     *         MediaConvert resources
     */
    public String getId() {
        return id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert
     * resources
     *
     * @param id A portion of the job's ARN, unique within your AWS Elemental
     *            MediaConvert resources
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert
     * resources
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id A portion of the job's ARN, unique within your AWS Elemental
     *            MediaConvert resources
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as
     * a percentage of the total time from when your job leaves its queue to
     * when your output files appear in your output Amazon S3 bucket. AWS
     * Elemental MediaConvert provides jobPercentComplete in CloudWatch
     * STATUS_UPDATE events and in the response to GetJob and ListJobs requests.
     * The jobPercentComplete estimate is reliable for the following input
     * containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the
     * service can't provide information about job progress. In those cases,
     * jobPercentComplete returns a null value.
     *
     * @return An estimate of how far your job has progressed. This estimate is
     *         shown as a percentage of the total time from when your job leaves
     *         its queue to when your output files appear in your output Amazon
     *         S3 bucket. AWS Elemental MediaConvert provides jobPercentComplete
     *         in CloudWatch STATUS_UPDATE events and in the response to GetJob
     *         and ListJobs requests. The jobPercentComplete estimate is
     *         reliable for the following input containers: Quicktime, Transport
     *         Stream, MP4, and MXF. For some jobs, the service can't provide
     *         information about job progress. In those cases,
     *         jobPercentComplete returns a null value.
     */
    public Integer getJobPercentComplete() {
        return jobPercentComplete;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as
     * a percentage of the total time from when your job leaves its queue to
     * when your output files appear in your output Amazon S3 bucket. AWS
     * Elemental MediaConvert provides jobPercentComplete in CloudWatch
     * STATUS_UPDATE events and in the response to GetJob and ListJobs requests.
     * The jobPercentComplete estimate is reliable for the following input
     * containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the
     * service can't provide information about job progress. In those cases,
     * jobPercentComplete returns a null value.
     *
     * @param jobPercentComplete An estimate of how far your job has progressed.
     *            This estimate is shown as a percentage of the total time from
     *            when your job leaves its queue to when your output files
     *            appear in your output Amazon S3 bucket. AWS Elemental
     *            MediaConvert provides jobPercentComplete in CloudWatch
     *            STATUS_UPDATE events and in the response to GetJob and
     *            ListJobs requests. The jobPercentComplete estimate is reliable
     *            for the following input containers: Quicktime, Transport
     *            Stream, MP4, and MXF. For some jobs, the service can't provide
     *            information about job progress. In those cases,
     *            jobPercentComplete returns a null value.
     */
    public void setJobPercentComplete(Integer jobPercentComplete) {
        this.jobPercentComplete = jobPercentComplete;
    }

    /**
     * An estimate of how far your job has progressed. This estimate is shown as
     * a percentage of the total time from when your job leaves its queue to
     * when your output files appear in your output Amazon S3 bucket. AWS
     * Elemental MediaConvert provides jobPercentComplete in CloudWatch
     * STATUS_UPDATE events and in the response to GetJob and ListJobs requests.
     * The jobPercentComplete estimate is reliable for the following input
     * containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the
     * service can't provide information about job progress. In those cases,
     * jobPercentComplete returns a null value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobPercentComplete An estimate of how far your job has progressed.
     *            This estimate is shown as a percentage of the total time from
     *            when your job leaves its queue to when your output files
     *            appear in your output Amazon S3 bucket. AWS Elemental
     *            MediaConvert provides jobPercentComplete in CloudWatch
     *            STATUS_UPDATE events and in the response to GetJob and
     *            ListJobs requests. The jobPercentComplete estimate is reliable
     *            for the following input containers: Quicktime, Transport
     *            Stream, MP4, and MXF. For some jobs, the service can't provide
     *            information about job progress. In those cases,
     *            jobPercentComplete returns a null value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobPercentComplete(Integer jobPercentComplete) {
        this.jobPercentComplete = jobPercentComplete;
        return this;
    }

    /**
     * The job template that the job is created from, if it is created from a
     * job template.
     *
     * @return The job template that the job is created from, if it is created
     *         from a job template.
     */
    public String getJobTemplate() {
        return jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a
     * job template.
     *
     * @param jobTemplate The job template that the job is created from, if it
     *            is created from a job template.
     */
    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a
     * job template.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobTemplate The job template that the job is created from, if it
     *            is created from a job template.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
        return this;
    }

    /**
     * Provides messages from the service about jobs that you have already
     * successfully submitted.
     *
     * @return Provides messages from the service about jobs that you have
     *         already successfully submitted.
     */
    public JobMessages getMessages() {
        return messages;
    }

    /**
     * Provides messages from the service about jobs that you have already
     * successfully submitted.
     *
     * @param messages Provides messages from the service about jobs that you
     *            have already successfully submitted.
     */
    public void setMessages(JobMessages messages) {
        this.messages = messages;
    }

    /**
     * Provides messages from the service about jobs that you have already
     * successfully submitted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages Provides messages from the service about jobs that you
     *            have already successfully submitted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withMessages(JobMessages messages) {
        this.messages = messages;
        return this;
    }

    /**
     * List of output group details
     *
     * @return List of output group details
     */
    public java.util.List<OutputGroupDetail> getOutputGroupDetails() {
        return outputGroupDetails;
    }

    /**
     * List of output group details
     *
     * @param outputGroupDetails List of output group details
     */
    public void setOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        if (outputGroupDetails == null) {
            this.outputGroupDetails = null;
            return;
        }

        this.outputGroupDetails = new java.util.ArrayList<OutputGroupDetail>(outputGroupDetails);
    }

    /**
     * List of output group details
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroupDetails List of output group details
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withOutputGroupDetails(OutputGroupDetail... outputGroupDetails) {
        if (getOutputGroupDetails() == null) {
            this.outputGroupDetails = new java.util.ArrayList<OutputGroupDetail>(
                    outputGroupDetails.length);
        }
        for (OutputGroupDetail value : outputGroupDetails) {
            this.outputGroupDetails.add(value);
        }
        return this;
    }

    /**
     * List of output group details
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroupDetails List of output group details
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        setOutputGroupDetails(outputGroupDetails);
        return this;
    }

    /**
     * Relative priority on the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @return Relative priority on the job.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Relative priority on the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Relative priority on the job.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Relative priority on the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Relative priority on the job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you
     * don't specify, the job will go to the default queue. For more about
     * queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     *
     * @return When you create a job, you can specify a queue to send it to. If
     *         you don't specify, the job will go to the default queue. For more
     *         about queues, see the User Guide topic at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    public String getQueue() {
        return queue;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you
     * don't specify, the job will go to the default queue. For more about
     * queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     *
     * @param queue When you create a job, you can specify a queue to send it
     *            to. If you don't specify, the job will go to the default
     *            queue. For more about queues, see the User Guide topic at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * When you create a job, you can specify a queue to send it to. If you
     * don't specify, the job will go to the default queue. For more about
     * queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue When you create a job, you can specify a queue to send it
     *            to. If you don't specify, the job will go to the default
     *            queue. For more about queues, see the User Guide topic at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * The job's queue hopping history.
     *
     * @return The job's queue hopping history.
     */
    public java.util.List<QueueTransition> getQueueTransitions() {
        return queueTransitions;
    }

    /**
     * The job's queue hopping history.
     *
     * @param queueTransitions The job's queue hopping history.
     */
    public void setQueueTransitions(java.util.Collection<QueueTransition> queueTransitions) {
        if (queueTransitions == null) {
            this.queueTransitions = null;
            return;
        }

        this.queueTransitions = new java.util.ArrayList<QueueTransition>(queueTransitions);
    }

    /**
     * The job's queue hopping history.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueTransitions The job's queue hopping history.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withQueueTransitions(QueueTransition... queueTransitions) {
        if (getQueueTransitions() == null) {
            this.queueTransitions = new java.util.ArrayList<QueueTransition>(
                    queueTransitions.length);
        }
        for (QueueTransition value : queueTransitions) {
            this.queueTransitions.add(value);
        }
        return this;
    }

    /**
     * The job's queue hopping history.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueTransitions The job's queue hopping history.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withQueueTransitions(java.util.Collection<QueueTransition> queueTransitions) {
        setQueueTransitions(queueTransitions);
        return this;
    }

    /**
     * The number of times that the service automatically attempted to process
     * your job after encountering an error.
     *
     * @return The number of times that the service automatically attempted to
     *         process your job after encountering an error.
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * The number of times that the service automatically attempted to process
     * your job after encountering an error.
     *
     * @param retryCount The number of times that the service automatically
     *            attempted to process your job after encountering an error.
     */
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * The number of times that the service automatically attempted to process
     * your job after encountering an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retryCount The number of times that the service automatically
     *            attempted to process your job after encountering an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     *
     * @return The IAM role you use for creating this job. For details about
     *         permissions, see the User Guide topic at the User Guide at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    public String getRole() {
        return role;
    }

    /**
     * The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     *
     * @param role The IAM role you use for creating this job. For details about
     *            permissions, see the User Guide topic at the User Guide at
     *            http
     *            ://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role The IAM role you use for creating this job. For details about
     *            permissions, see the User Guide topic at the User Guide at
     *            http
     *            ://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     *
     * @return JobSettings contains all the transcode settings for a job.
     */
    public JobSettings getSettings() {
        return settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     *
     * @param settings JobSettings contains all the transcode settings for a
     *            job.
     */
    public void setSettings(JobSettings settings) {
        this.settings = settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings JobSettings contains all the transcode settings for a
     *            job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Enable this setting when you run a test job to estimate how many
     *         reserved transcoding slots (RTS) you need. When this is enabled,
     *         MediaConvert runs your job from an on-demand queue with similar
     *         performance to what you will see with one RTS in a reserved
     *         queue. This setting is disabled by default.
     * @see SimulateReservedQueue
     */
    public String getSimulateReservedQueue() {
        return simulateReservedQueue;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Enable this setting when you run a test job
     *            to estimate how many reserved transcoding slots (RTS) you
     *            need. When this is enabled, MediaConvert runs your job from an
     *            on-demand queue with similar performance to what you will see
     *            with one RTS in a reserved queue. This setting is disabled by
     *            default.
     * @see SimulateReservedQueue
     */
    public void setSimulateReservedQueue(String simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Enable this setting when you run a test job
     *            to estimate how many reserved transcoding slots (RTS) you
     *            need. When this is enabled, MediaConvert runs your job from an
     *            on-demand queue with similar performance to what you will see
     *            with one RTS in a reserved queue. This setting is disabled by
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SimulateReservedQueue
     */
    public Job withSimulateReservedQueue(String simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue;
        return this;
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Enable this setting when you run a test job
     *            to estimate how many reserved transcoding slots (RTS) you
     *            need. When this is enabled, MediaConvert runs your job from an
     *            on-demand queue with similar performance to what you will see
     *            with one RTS in a reserved queue. This setting is disabled by
     *            default.
     * @see SimulateReservedQueue
     */
    public void setSimulateReservedQueue(SimulateReservedQueue simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue.toString();
    }

    /**
     * Enable this setting when you run a test job to estimate how many reserved
     * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
     * your job from an on-demand queue with similar performance to what you
     * will see with one RTS in a reserved queue. This setting is disabled by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Enable this setting when you run a test job
     *            to estimate how many reserved transcoding slots (RTS) you
     *            need. When this is enabled, MediaConvert runs your job from an
     *            on-demand queue with similar performance to what you will see
     *            with one RTS in a reserved queue. This setting is disabled by
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SimulateReservedQueue
     */
    public Job withSimulateReservedQueue(SimulateReservedQueue simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue.toString();
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @return A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED,
     *         or ERROR.
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     *            CANCELED, or ERROR.
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     *            CANCELED, or ERROR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Job withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     *            CANCELED, or ERROR.
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or
     * ERROR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     *            CANCELED, or ERROR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @return Specify how often MediaConvert sends STATUS_UPDATE events to
     *         Amazon CloudWatch Events. Set the interval, in seconds, between
     *         status updates. MediaConvert sends an update at this interval
     *         from the time the service begins processing your job to the time
     *         it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public String getStatusUpdateInterval() {
        return statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Specify how often MediaConvert sends
     *            STATUS_UPDATE events to Amazon CloudWatch Events. Set the
     *            interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public void setStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Specify how often MediaConvert sends
     *            STATUS_UPDATE events to Amazon CloudWatch Events. Set the
     *            interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusUpdateInterval
     */
    public Job withStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Specify how often MediaConvert sends
     *            STATUS_UPDATE events to Amazon CloudWatch Events. Set the
     *            interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public void setStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
     * CloudWatch Events. Set the interval, in seconds, between status updates.
     * MediaConvert sends an update at this interval from the time the service
     * begins processing your job to the time it completes the transcode or
     * encounters an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Specify how often MediaConvert sends
     *            STATUS_UPDATE events to Amazon CloudWatch Events. Set the
     *            interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusUpdateInterval
     */
    public Job withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
        return this;
    }

    /**
     * Information about when jobs are submitted, started, and finished is
     * specified in Unix epoch format in seconds.
     *
     * @return Information about when jobs are submitted, started, and finished
     *         is specified in Unix epoch format in seconds.
     */
    public Timing getTiming() {
        return timing;
    }

    /**
     * Information about when jobs are submitted, started, and finished is
     * specified in Unix epoch format in seconds.
     *
     * @param timing Information about when jobs are submitted, started, and
     *            finished is specified in Unix epoch format in seconds.
     */
    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    /**
     * Information about when jobs are submitted, started, and finished is
     * specified in Unix epoch format in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timing Information about when jobs are submitted, started, and
     *            finished is specified in Unix epoch format in seconds.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withTiming(Timing timing) {
        this.timing = timing;
        return this;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert
     * job. You specify metadata in key/value pairs.
     *
     * @return User-defined metadata that you want to associate with an
     *         MediaConvert job. You specify metadata in key/value pairs.
     */
    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert
     * job. You specify metadata in key/value pairs.
     *
     * @param userMetadata User-defined metadata that you want to associate with
     *            an MediaConvert job. You specify metadata in key/value pairs.
     */
    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert
     * job. You specify metadata in key/value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMetadata User-defined metadata that you want to associate with
     *            an MediaConvert job. You specify metadata in key/value pairs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert
     * job. You specify metadata in key/value pairs.
     * <p>
     * The method adds a new key-value pair into UserMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into UserMetadata.
     * @param value The corresponding value of the entry to be added into
     *            UserMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Job clearUserMetadataEntries() {
        this.userMetadata = null;
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
        if (getAccelerationSettings() != null)
            sb.append("AccelerationSettings: " + getAccelerationSettings() + ",");
        if (getAccelerationStatus() != null)
            sb.append("AccelerationStatus: " + getAccelerationStatus() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getBillingTagsSource() != null)
            sb.append("BillingTagsSource: " + getBillingTagsSource() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getCurrentPhase() != null)
            sb.append("CurrentPhase: " + getCurrentPhase() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: " + getHopDestinations() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getJobPercentComplete() != null)
            sb.append("JobPercentComplete: " + getJobPercentComplete() + ",");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: " + getJobTemplate() + ",");
        if (getMessages() != null)
            sb.append("Messages: " + getMessages() + ",");
        if (getOutputGroupDetails() != null)
            sb.append("OutputGroupDetails: " + getOutputGroupDetails() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getQueueTransitions() != null)
            sb.append("QueueTransitions: " + getQueueTransitions() + ",");
        if (getRetryCount() != null)
            sb.append("RetryCount: " + getRetryCount() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getSimulateReservedQueue() != null)
            sb.append("SimulateReservedQueue: " + getSimulateReservedQueue() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: " + getStatusUpdateInterval() + ",");
        if (getTiming() != null)
            sb.append("Timing: " + getTiming() + ",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: " + getUserMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode
                + ((getAccelerationStatus() == null) ? 0 : getAccelerationStatus().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getBillingTagsSource() == null) ? 0 : getBillingTagsSource().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentPhase() == null) ? 0 : getCurrentPhase().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode
                + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getJobPercentComplete() == null) ? 0 : getJobPercentComplete().hashCode());
        hashCode = prime * hashCode
                + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode
                + ((getOutputGroupDetails() == null) ? 0 : getOutputGroupDetails().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode
                + ((getQueueTransitions() == null) ? 0 : getQueueTransitions().hashCode());
        hashCode = prime * hashCode + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getSimulateReservedQueue() == null) ? 0 : getSimulateReservedQueue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getTiming() == null) ? 0 : getTiming().hashCode());
        hashCode = prime * hashCode
                + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;

        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null
                && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getAccelerationStatus() == null ^ this.getAccelerationStatus() == null)
            return false;
        if (other.getAccelerationStatus() != null
                && other.getAccelerationStatus().equals(this.getAccelerationStatus()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBillingTagsSource() == null ^ this.getBillingTagsSource() == null)
            return false;
        if (other.getBillingTagsSource() != null
                && other.getBillingTagsSource().equals(this.getBillingTagsSource()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCurrentPhase() == null ^ this.getCurrentPhase() == null)
            return false;
        if (other.getCurrentPhase() != null
                && other.getCurrentPhase().equals(this.getCurrentPhase()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getHopDestinations() == null ^ this.getHopDestinations() == null)
            return false;
        if (other.getHopDestinations() != null
                && other.getHopDestinations().equals(this.getHopDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getJobPercentComplete() == null ^ this.getJobPercentComplete() == null)
            return false;
        if (other.getJobPercentComplete() != null
                && other.getJobPercentComplete().equals(this.getJobPercentComplete()) == false)
            return false;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null
                && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getOutputGroupDetails() == null ^ this.getOutputGroupDetails() == null)
            return false;
        if (other.getOutputGroupDetails() != null
                && other.getOutputGroupDetails().equals(this.getOutputGroupDetails()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getQueueTransitions() == null ^ this.getQueueTransitions() == null)
            return false;
        if (other.getQueueTransitions() != null
                && other.getQueueTransitions().equals(this.getQueueTransitions()) == false)
            return false;
        if (other.getRetryCount() == null ^ this.getRetryCount() == null)
            return false;
        if (other.getRetryCount() != null
                && other.getRetryCount().equals(this.getRetryCount()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getSimulateReservedQueue() == null ^ this.getSimulateReservedQueue() == null)
            return false;
        if (other.getSimulateReservedQueue() != null
                && other.getSimulateReservedQueue().equals(this.getSimulateReservedQueue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null
                && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
            return false;
        if (other.getTiming() == null ^ this.getTiming() == null)
            return false;
        if (other.getTiming() != null && other.getTiming().equals(this.getTiming()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null
                && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        return true;
    }
}
