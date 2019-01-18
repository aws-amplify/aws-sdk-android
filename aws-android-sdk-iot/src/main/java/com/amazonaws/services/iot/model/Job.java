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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Job</code> object contains details about a job.
 * </p>
 */
public class Job implements Serializable {
    /**
     * <p>
     * An ARN identifying the job with format
     * "arn:aws:iot:region:account:job/jobId".
     * </p>
     */
    private String jobArn;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     */
    private String targetSelection;

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional
     * <code>force</code> parameter set to <code>true</code>.
     * </p>
     */
    private Boolean forceCanceled;

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     */
    private String reasonCode;

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String comment;

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     */
    private AbortConfig abortConfig;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     */
    private java.util.Date completedAt;

    /**
     * <p>
     * Details about the job process.
     * </p>
     */
    private JobProcessDetails jobProcessDetails;

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     */
    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * An ARN identifying the job with format
     * "arn:aws:iot:region:account:job/jobId".
     * </p>
     *
     * @return <p>
     *         An ARN identifying the job with format
     *         "arn:aws:iot:region:account:job/jobId".
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * An ARN identifying the job with format
     * "arn:aws:iot:region:account:job/jobId".
     * </p>
     *
     * @param jobArn <p>
     *            An ARN identifying the job with format
     *            "arn:aws:iot:region:account:job/jobId".
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * An ARN identifying the job with format
     * "arn:aws:iot:region:account:job/jobId".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobArn <p>
     *            An ARN identifying the job with format
     *            "arn:aws:iot:region:account:job/jobId".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier you assigned to this job when it was
     *         created.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @return <p>
     *         Specifies whether the job will continue to run (CONTINUOUS), or
     *         will be complete after all those things specified as targets have
     *         completed the job (SNAPSHOT). If continuous, the job may also be
     *         run on a thing when a change is detected in a target. For
     *         example, a job will run on a device when the thing representing
     *         the device is added to a target group, even after the job was
     *         completed by all things originally in the group.
     *         </p>
     * @see TargetSelection
     */
    public String getTargetSelection() {
        return targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a device when the thing
     *            representing the device is added to a target group, even after
     *            the job was completed by all things originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a device when the thing
     *            representing the device is added to a target group, even after
     *            the job was completed by all things originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public Job withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a device when the thing
     *            representing the device is added to a target group, even after
     *            the job was completed by all things originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a device
     * when the thing representing the device is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a device when the thing
     *            representing the device is added to a target group, even after
     *            the job was completed by all things originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public Job withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     *
     * @return <p>
     *         The status of the job, one of <code>IN_PROGRESS</code>,
     *         <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     *         <code>COMPLETED</code>.
     *         </p>
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the job, one of <code>IN_PROGRESS</code>,
     *            <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     *            <code>COMPLETED</code>.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the job, one of <code>IN_PROGRESS</code>,
     *            <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     *            <code>COMPLETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Job withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the job, one of <code>IN_PROGRESS</code>,
     *            <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     *            <code>COMPLETED</code>.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>,
     * <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CANCELED, COMPLETED,
     * DELETION_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the job, one of <code>IN_PROGRESS</code>,
     *            <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code> or
     *            <code>COMPLETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional
     * <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Will be <code>true</code> if the job was canceled with the
     *         optional <code>force</code> parameter set to <code>true</code>.
     *         </p>
     */
    public Boolean isForceCanceled() {
        return forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional
     * <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Will be <code>true</code> if the job was canceled with the
     *         optional <code>force</code> parameter set to <code>true</code>.
     *         </p>
     */
    public Boolean getForceCanceled() {
        return forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional
     * <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @param forceCanceled <p>
     *            Will be <code>true</code> if the job was canceled with the
     *            optional <code>force</code> parameter set to <code>true</code>
     *            .
     *            </p>
     */
    public void setForceCanceled(Boolean forceCanceled) {
        this.forceCanceled = forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional
     * <code>force</code> parameter set to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceCanceled <p>
     *            Will be <code>true</code> if the job was canceled with the
     *            optional <code>force</code> parameter set to <code>true</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withForceCanceled(Boolean forceCanceled) {
        this.forceCanceled = forceCanceled;
        return this;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @return <p>
     *         If the job was updated, provides the reason code for the update.
     *         </p>
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @param reasonCode <p>
     *            If the job was updated, provides the reason code for the
     *            update.
     *            </p>
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @param reasonCode <p>
     *            If the job was updated, provides the reason code for the
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         If the job was updated, describes the reason for the update.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            If the job was updated, describes the reason for the update.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            If the job was updated, describes the reason for the update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     *
     * @return <p>
     *         A list of IoT things and thing groups to which the job should be
     *         sent.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     *
     * @param targets <p>
     *            A list of IoT things and thing groups to which the job should
     *            be sent.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of IoT things and thing groups to which the job should
     *            be sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of IoT things and thing groups to which the job should
     *            be sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A short text description of the job.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A short text description of the job.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A short text description of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     *
     * @return <p>
     *         Configuration for pre-signed S3 URLs.
     *         </p>
     */
    public PresignedUrlConfig getPresignedUrlConfig() {
        return presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     *
     * @param presignedUrlConfig <p>
     *            Configuration for pre-signed S3 URLs.
     *            </p>
     */
    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param presignedUrlConfig <p>
     *            Configuration for pre-signed S3 URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     *
     * @return <p>
     *         Allows you to create a staged rollout of a job.
     *         </p>
     */
    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of a job.
     *            </p>
     */
    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     *
     * @return <p>
     *         Configuration for criteria to abort the job.
     *         </p>
     */
    public AbortConfig getAbortConfig() {
        return abortConfig;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     *
     * @param abortConfig <p>
     *            Configuration for criteria to abort the job.
     *            </p>
     */
    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortConfig <p>
     *            Configuration for criteria to abort the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            last updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job was
     *         completed.
     *         </p>
     */
    public java.util.Date getCompletedAt() {
        return completedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     *
     * @param completedAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            completed.
     *            </p>
     */
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedAt <p>
     *            The time, in milliseconds since the epoch, when the job was
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     *
     * @return <p>
     *         Details about the job process.
     *         </p>
     */
    public JobProcessDetails getJobProcessDetails() {
        return jobProcessDetails;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     *
     * @param jobProcessDetails <p>
     *            Details about the job process.
     *            </p>
     */
    public void setJobProcessDetails(JobProcessDetails jobProcessDetails) {
        this.jobProcessDetails = jobProcessDetails;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobProcessDetails <p>
     *            Details about the job process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withJobProcessDetails(JobProcessDetails jobProcessDetails) {
        this.jobProcessDetails = jobProcessDetails;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the amount of time each device has to finish its
     *         execution of the job. A timer is started when the job execution
     *         status is set to <code>IN_PROGRESS</code>. If the job execution
     *         status is not set to another terminal state before the timer
     *         expires, it will be automatically set to <code>TIMED_OUT</code>.
     *         </p>
     */
    public TimeoutConfig getTimeoutConfig() {
        return timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     */
    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
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
        if (getJobArn() != null)
            sb.append("jobArn: " + getJobArn() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getTargetSelection() != null)
            sb.append("targetSelection: " + getTargetSelection() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getForceCanceled() != null)
            sb.append("forceCanceled: " + getForceCanceled() + ",");
        if (getReasonCode() != null)
            sb.append("reasonCode: " + getReasonCode() + ",");
        if (getComment() != null)
            sb.append("comment: " + getComment() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPresignedUrlConfig() != null)
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        if (getAbortConfig() != null)
            sb.append("abortConfig: " + getAbortConfig() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getCompletedAt() != null)
            sb.append("completedAt: " + getCompletedAt() + ",");
        if (getJobProcessDetails() != null)
            sb.append("jobProcessDetails: " + getJobProcessDetails() + ",");
        if (getTimeoutConfig() != null)
            sb.append("timeoutConfig: " + getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getForceCanceled() == null) ? 0 : getForceCanceled().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode
                + ((getJobProcessDetails() == null) ? 0 : getJobProcessDetails().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
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

        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null
                && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getForceCanceled() == null ^ this.getForceCanceled() == null)
            return false;
        if (other.getForceCanceled() != null
                && other.getForceCanceled().equals(this.getForceCanceled()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null
                && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null
                && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null
                ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null
                && other.getJobExecutionsRolloutConfig().equals(
                        this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null
                && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null
                && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getJobProcessDetails() == null ^ this.getJobProcessDetails() == null)
            return false;
        if (other.getJobProcessDetails() != null
                && other.getJobProcessDetails().equals(this.getJobProcessDetails()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null
                && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }
}
