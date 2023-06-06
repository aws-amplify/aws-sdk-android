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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a job.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateJob</a> action.
 * </p>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services
     * account. We recommend using a UUID. Alpha-numeric characters, "-" and "_"
     * are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon
     * S3 object URL and is required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     * >Methods for accessing a bucket</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String documentSource;

    /**
     * <p>
     * The job document. Required if you don't specify a value for
     * <code>documentSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     */
    private String document;

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
     * Configuration information for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     */
    private String targetSelection;

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     */
    private AbortConfig abortConfig;

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. The timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the time expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     */
    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core
     * sends jobs notifications to MQTT topics that contain the value in the
     * following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String namespaceId;

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     */
    private String jobTemplateArn;

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     */
    private JobExecutionsRetryConfig jobExecutionsRetryConfig;

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can
     * specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> documentParameters;

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and
     * time in addition to specifying the end behavior for each job execution.
     * </p>
     */
    private SchedulingConfig schedulingConfig;

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single string.
     * Up to five strings are allowed.
     * </p>
     */
    private java.util.List<String> destinationPackageVersions;

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services
     * account. We recommend using a UUID. Alpha-numeric characters, "-" and "_"
     * are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A job identifier which must be unique for your Amazon Web
     *         Services account. We recommend using a UUID. Alpha-numeric
     *         characters, "-" and "_" are valid for use here.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services
     * account. We recommend using a UUID. Alpha-numeric characters, "-" and "_"
     * are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            A job identifier which must be unique for your Amazon Web
     *            Services account. We recommend using a UUID. Alpha-numeric
     *            characters, "-" and "_" are valid for use here.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your Amazon Web Services
     * account. We recommend using a UUID. Alpha-numeric characters, "-" and "_"
     * are valid for use here.
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
     *            A job identifier which must be unique for your Amazon Web
     *            Services account. We recommend using a UUID. Alpha-numeric
     *            characters, "-" and "_" are valid for use here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     *
     * @return <p>
     *         A list of things and thing groups to which the job should be
     *         sent.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
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
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTargets(String... targets) {
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
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon
     * S3 object URL and is required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     * >Methods for accessing a bucket</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         An S3 link, or S3 object URL, to the job document. The link is an
     *         Amazon S3 object URL and is required if you don't specify a value
     *         for <code>document</code>.
     *         </p>
     *         <p>
     *         For example,
     *         <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     *         >Methods for accessing a bucket</a>.
     *         </p>
     */
    public String getDocumentSource() {
        return documentSource;
    }

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon
     * S3 object URL and is required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     * >Methods for accessing a bucket</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link, or S3 object URL, to the job document. The link is
     *            an Amazon S3 object URL and is required if you don't specify a
     *            value for <code>document</code>.
     *            </p>
     *            <p>
     *            For example,
     *            <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     *            >Methods for accessing a bucket</a>.
     *            </p>
     */
    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link, or S3 object URL, to the job document. The link is an Amazon
     * S3 object URL and is required if you don't specify a value for
     * <code>document</code>.
     * </p>
     * <p>
     * For example,
     * <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     * >Methods for accessing a bucket</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link, or S3 object URL, to the job document. The link is
     *            an Amazon S3 object URL and is required if you don't specify a
     *            value for <code>document</code>.
     *            </p>
     *            <p>
     *            For example,
     *            <code>--document-source https://s3.<i>region-code</i>.amazonaws.com/example-firmware/device-firmware.1.0</code>
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html"
     *            >Methods for accessing a bucket</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocumentSource(String documentSource) {
        this.documentSource = documentSource;
        return this;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for
     * <code>documentSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @return <p>
     *         The job document. Required if you don't specify a value for
     *         <code>documentSource</code>.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for
     * <code>documentSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document. Required if you don't specify a value for
     *            <code>documentSource</code>.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document. Required if you don't specify a value for
     * <code>documentSource</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document. Required if you don't specify a value for
     *            <code>documentSource</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocument(String document) {
        this.document = document;
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
    public CreateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     *
     * @return <p>
     *         Configuration information for pre-signed S3 URLs.
     *         </p>
     */
    public PresignedUrlConfig getPresignedUrlConfig() {
        return presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     *
     * @param presignedUrlConfig <p>
     *            Configuration information for pre-signed S3 URLs.
     *            </p>
     */
    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param presignedUrlConfig <p>
     *            Configuration information for pre-signed S3 URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @return <p>
     *         Specifies whether the job will continue to run (CONTINUOUS), or
     *         will be complete after all those things specified as targets have
     *         completed the job (SNAPSHOT). If continuous, the job may also be
     *         run on a thing when a change is detected in a target. For
     *         example, a job will run on a thing when the thing is added to a
     *         target group, even after the job was completed by all things
     *         originally in the group.
     *         </p>
     *         <note>
     *         <p>
     *         We recommend that you use continuous jobs instead of snapshot
     *         jobs for dynamic thing group targets. By using continuous jobs,
     *         devices that join the group receive the job execution even after
     *         the job has been created.
     *         </p>
     *         </note>
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
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     *            <note>
     *            <p>
     *            We recommend that you use continuous jobs instead of snapshot
     *            jobs for dynamic thing group targets. By using continuous
     *            jobs, devices that join the group receive the job execution
     *            even after the job has been created.
     *            </p>
     *            </note>
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
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
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
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     *            <note>
     *            <p>
     *            We recommend that you use continuous jobs instead of snapshot
     *            jobs for dynamic thing group targets. By using continuous
     *            jobs, devices that join the group receive the job execution
     *            even after the job has been created.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateJobRequest withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     *            <note>
     *            <p>
     *            We recommend that you use continuous jobs instead of snapshot
     *            jobs for dynamic thing group targets. By using continuous
     *            jobs, devices that join the group receive the job execution
     *            even after the job has been created.
     *            </p>
     *            </note>
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
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <note>
     * <p>
     * We recommend that you use continuous jobs instead of snapshot jobs for
     * dynamic thing group targets. By using continuous jobs, devices that join
     * the group receive the job execution even after the job has been created.
     * </p>
     * </note>
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
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     *            <note>
     *            <p>
     *            We recommend that you use continuous jobs instead of snapshot
     *            jobs for dynamic thing group targets. By using continuous
     *            jobs, devices that join the group receive the job execution
     *            even after the job has been created.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateJobRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     *
     * @return <p>
     *         Allows you to create a staged rollout of the job.
     *         </p>
     */
    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of the job.
     *            </p>
     */
    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobExecutionsRolloutConfig(
            JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     *
     * @return <p>
     *         Allows you to create the criteria to abort a job.
     *         </p>
     */
    public AbortConfig getAbortConfig() {
        return abortConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     *
     * @param abortConfig <p>
     *            Allows you to create the criteria to abort a job.
     *            </p>
     */
    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to abort a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortConfig <p>
     *            Allows you to create the criteria to abort a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. The timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the time expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the amount of time each device has to finish its
     *         execution of the job. The timer is started when the job execution
     *         status is set to <code>IN_PROGRESS</code>. If the job execution
     *         status is not set to another terminal state before the time
     *         expires, it will be automatically set to <code>TIMED_OUT</code>.
     *         </p>
     */
    public TimeoutConfig getTimeoutConfig() {
        return timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. The timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the time expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. The timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the time expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     */
    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. The timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the time expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. The timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the time expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     *
     * @return <p>
     *         Metadata which can be used to manage the job.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the job.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core
     * sends jobs notifications to MQTT topics that contain the value in the
     * following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The namespace used to indicate that a job is a customer-managed
     *         job.
     *         </p>
     *         <p>
     *         When you specify a value for this parameter, Amazon Web Services
     *         IoT Core sends jobs notifications to MQTT topics that contain the
     *         value in the following format.
     *         </p>
     *         <p>
     *         <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *         </p>
     *         <note>
     *         <p>
     *         The <code>namespaceId</code> feature is in public preview.
     *         </p>
     *         </note>
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core
     * sends jobs notifications to MQTT topics that contain the value in the
     * following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param namespaceId <p>
     *            The namespace used to indicate that a job is a
     *            customer-managed job.
     *            </p>
     *            <p>
     *            When you specify a value for this parameter, Amazon Web
     *            Services IoT Core sends jobs notifications to MQTT topics that
     *            contain the value in the following format.
     *            </p>
     *            <p>
     *            <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *            </p>
     *            <note>
     *            <p>
     *            The <code>namespaceId</code> feature is in public preview.
     *            </p>
     *            </note>
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, Amazon Web Services IoT Core
     * sends jobs notifications to MQTT topics that contain the value in the
     * following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param namespaceId <p>
     *            The namespace used to indicate that a job is a
     *            customer-managed job.
     *            </p>
     *            <p>
     *            When you specify a value for this parameter, Amazon Web
     *            Services IoT Core sends jobs notifications to MQTT topics that
     *            contain the value in the following format.
     *            </p>
     *            <p>
     *            <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *            </p>
     *            <note>
     *            <p>
     *            The <code>namespaceId</code> feature is in public preview.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @return <p>
     *         The ARN of the job template used to create the job.
     *         </p>
     */
    public String getJobTemplateArn() {
        return jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template used to create the job.
     *            </p>
     */
    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template used to create the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template used to create the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
        return this;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     *
     * @return <p>
     *         Allows you to create the criteria to retry a job.
     *         </p>
     */
    public JobExecutionsRetryConfig getJobExecutionsRetryConfig() {
        return jobExecutionsRetryConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     *
     * @param jobExecutionsRetryConfig <p>
     *            Allows you to create the criteria to retry a job.
     *            </p>
     */
    public void setJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
    }

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionsRetryConfig <p>
     *            Allows you to create the criteria to retry a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobExecutionsRetryConfig(
            JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        return this;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can
     * specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     *
     * @return <p>
     *         Parameters of an Amazon Web Services managed template that you
     *         can specify to create the job document.
     *         </p>
     *         <note>
     *         <p>
     *         <code>documentParameters</code> can only be used when creating
     *         jobs from Amazon Web Services managed templates. This parameter
     *         can't be used with custom job templates or to create jobs from
     *         them.
     *         </p>
     *         </note>
     */
    public java.util.Map<String, String> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can
     * specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     *
     * @param documentParameters <p>
     *            Parameters of an Amazon Web Services managed template that you
     *            can specify to create the job document.
     *            </p>
     *            <note>
     *            <p>
     *            <code>documentParameters</code> can only be used when creating
     *            jobs from Amazon Web Services managed templates. This
     *            parameter can't be used with custom job templates or to create
     *            jobs from them.
     *            </p>
     *            </note>
     */
    public void setDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can
     * specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentParameters <p>
     *            Parameters of an Amazon Web Services managed template that you
     *            can specify to create the job document.
     *            </p>
     *            <note>
     *            <p>
     *            <code>documentParameters</code> can only be used when creating
     *            jobs from Amazon Web Services managed templates. This
     *            parameter can't be used with custom job templates or to create
     *            jobs from them.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
        return this;
    }

    /**
     * <p>
     * Parameters of an Amazon Web Services managed template that you can
     * specify to create the job document.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     * <p>
     * The method adds a new key-value pair into documentParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into documentParameters.
     * @param value The corresponding value of the entry to be added into
     *            documentParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest adddocumentParametersEntry(String key, String value) {
        if (null == this.documentParameters) {
            this.documentParameters = new java.util.HashMap<String, String>();
        }
        if (this.documentParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.documentParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into documentParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest cleardocumentParametersEntries() {
        this.documentParameters = null;
        return this;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and
     * time in addition to specifying the end behavior for each job execution.
     * </p>
     *
     * @return <p>
     *         The configuration that allows you to schedule a job for a future
     *         date and time in addition to specifying the end behavior for each
     *         job execution.
     *         </p>
     */
    public SchedulingConfig getSchedulingConfig() {
        return schedulingConfig;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and
     * time in addition to specifying the end behavior for each job execution.
     * </p>
     *
     * @param schedulingConfig <p>
     *            The configuration that allows you to schedule a job for a
     *            future date and time in addition to specifying the end
     *            behavior for each job execution.
     *            </p>
     */
    public void setSchedulingConfig(SchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
    }

    /**
     * <p>
     * The configuration that allows you to schedule a job for a future date and
     * time in addition to specifying the end behavior for each job execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedulingConfig <p>
     *            The configuration that allows you to schedule a job for a
     *            future date and time in addition to specifying the end
     *            behavior for each job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withSchedulingConfig(SchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
        return this;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single string.
     * Up to five strings are allowed.
     * </p>
     *
     * @return <p>
     *         The package version Amazon Resource Names (ARNs) that are
     *         installed on the device when the job successfully completes.
     *         </p>
     *         <p>
     *         <b>Note:</b>The following Length Constraints relates to a single
     *         string. Up to five strings are allowed.
     *         </p>
     */
    public java.util.List<String> getDestinationPackageVersions() {
        return destinationPackageVersions;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single string.
     * Up to five strings are allowed.
     * </p>
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single string. Up to five strings are allowed.
     *            </p>
     */
    public void setDestinationPackageVersions(
            java.util.Collection<String> destinationPackageVersions) {
        if (destinationPackageVersions == null) {
            this.destinationPackageVersions = null;
            return;
        }

        this.destinationPackageVersions = new java.util.ArrayList<String>(
                destinationPackageVersions);
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single string.
     * Up to five strings are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single string. Up to five strings are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDestinationPackageVersions(String... destinationPackageVersions) {
        if (getDestinationPackageVersions() == null) {
            this.destinationPackageVersions = new java.util.ArrayList<String>(
                    destinationPackageVersions.length);
        }
        for (String value : destinationPackageVersions) {
            this.destinationPackageVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single string.
     * Up to five strings are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single string. Up to five strings are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDestinationPackageVersions(
            java.util.Collection<String> destinationPackageVersions) {
        setDestinationPackageVersions(destinationPackageVersions);
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
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getDocumentSource() != null)
            sb.append("documentSource: " + getDocumentSource() + ",");
        if (getDocument() != null)
            sb.append("document: " + getDocument() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPresignedUrlConfig() != null)
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        if (getTargetSelection() != null)
            sb.append("targetSelection: " + getTargetSelection() + ",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        if (getAbortConfig() != null)
            sb.append("abortConfig: " + getAbortConfig() + ",");
        if (getTimeoutConfig() != null)
            sb.append("timeoutConfig: " + getTimeoutConfig() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getNamespaceId() != null)
            sb.append("namespaceId: " + getNamespaceId() + ",");
        if (getJobTemplateArn() != null)
            sb.append("jobTemplateArn: " + getJobTemplateArn() + ",");
        if (getJobExecutionsRetryConfig() != null)
            sb.append("jobExecutionsRetryConfig: " + getJobExecutionsRetryConfig() + ",");
        if (getDocumentParameters() != null)
            sb.append("documentParameters: " + getDocumentParameters() + ",");
        if (getSchedulingConfig() != null)
            sb.append("schedulingConfig: " + getSchedulingConfig() + ",");
        if (getDestinationPackageVersions() != null)
            sb.append("destinationPackageVersions: " + getDestinationPackageVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode
                + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRetryConfig() == null) ? 0 : getJobExecutionsRetryConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
        hashCode = prime * hashCode
                + ((getSchedulingConfig() == null) ? 0 : getSchedulingConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationPackageVersions() == null) ? 0 : getDestinationPackageVersions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null
                && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
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
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null
                && other.getTargetSelection().equals(this.getTargetSelection()) == false)
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
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null
                && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null
                && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null
                && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobExecutionsRetryConfig() == null
                ^ this.getJobExecutionsRetryConfig() == null)
            return false;
        if (other.getJobExecutionsRetryConfig() != null
                && other.getJobExecutionsRetryConfig().equals(this.getJobExecutionsRetryConfig()) == false)
            return false;
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null
                && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
            return false;
        if (other.getSchedulingConfig() == null ^ this.getSchedulingConfig() == null)
            return false;
        if (other.getSchedulingConfig() != null
                && other.getSchedulingConfig().equals(this.getSchedulingConfig()) == false)
            return false;
        if (other.getDestinationPackageVersions() == null
                ^ this.getDestinationPackageVersions() == null)
            return false;
        if (other.getDestinationPackageVersions() != null
                && other.getDestinationPackageVersions().equals(
                        this.getDestinationPackageVersions()) == false)
            return false;
        return true;
    }
}
