/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a job template.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateJobTemplate</a> action.
 * </p>
 */
public class CreateJobTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID.
     * Alpha-numeric characters, "-", and "_" are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobTemplateId;

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     */
    private String jobArn;

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
     * A description of the job document.
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
     * The criteria that determine when and how a job abort takes place.
     * </p>
     */
    private AbortConfig abortConfig;

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
     * Metadata that can be used to manage the job template.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Allows you to create the criteria to retry a job.
     * </p>
     */
    private JobExecutionsRetryConfig jobExecutionsRetryConfig;

    /**
     * <p>
     * Allows you to configure an optional maintenance window for the rollout of
     * a job document to all devices in the target group for a job.
     * </p>
     */
    private java.util.List<MaintenanceWindow> maintenanceWindows;

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes. The package version must
     * be in either the Published or Deprecated state when the job deploys. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up
     * to 25 package version ARNs are allowed.
     * </p>
     */
    private java.util.List<String> destinationPackageVersions;

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID.
     * Alpha-numeric characters, "-", and "_" are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the job template. We recommend using a
     *         UUID. Alpha-numeric characters, "-", and "_" are valid for use
     *         here.
     *         </p>
     */
    public String getJobTemplateId() {
        return jobTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID.
     * Alpha-numeric characters, "-", and "_" are valid for use here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            A unique identifier for the job template. We recommend using a
     *            UUID. Alpha-numeric characters, "-", and "_" are valid for use
     *            here.
     *            </p>
     */
    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the job template. We recommend using a UUID.
     * Alpha-numeric characters, "-", and "_" are valid for use here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            A unique identifier for the job template. We recommend using a
     *            UUID. Alpha-numeric characters, "-", and "_" are valid for use
     *            here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     *
     * @return <p>
     *         The ARN of the job to use as the basis for the job template.
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     *
     * @param jobArn <p>
     *            The ARN of the job to use as the basis for the job template.
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the job to use as the basis for the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobArn <p>
     *            The ARN of the job to use as the basis for the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withJobArn(String jobArn) {
        this.jobArn = jobArn;
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
    public CreateJobTemplateRequest withDocumentSource(String documentSource) {
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
    public CreateJobTemplateRequest withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * A description of the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A description of the job document.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the job document.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job document.
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
     *            A description of the job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withDescription(String description) {
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
    public CreateJobTemplateRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
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
    public CreateJobTemplateRequest withJobExecutionsRolloutConfig(
            JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @return <p>
     *         The criteria that determine when and how a job abort takes place.
     *         </p>
     */
    public AbortConfig getAbortConfig() {
        return abortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @param abortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     */
    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
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
    public CreateJobTemplateRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the job template.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the job template.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the job template.
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
     * Metadata that can be used to manage the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public CreateJobTemplateRequest withJobExecutionsRetryConfig(
            JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        return this;
    }

    /**
     * <p>
     * Allows you to configure an optional maintenance window for the rollout of
     * a job document to all devices in the target group for a job.
     * </p>
     *
     * @return <p>
     *         Allows you to configure an optional maintenance window for the
     *         rollout of a job document to all devices in the target group for
     *         a job.
     *         </p>
     */
    public java.util.List<MaintenanceWindow> getMaintenanceWindows() {
        return maintenanceWindows;
    }

    /**
     * <p>
     * Allows you to configure an optional maintenance window for the rollout of
     * a job document to all devices in the target group for a job.
     * </p>
     *
     * @param maintenanceWindows <p>
     *            Allows you to configure an optional maintenance window for the
     *            rollout of a job document to all devices in the target group
     *            for a job.
     *            </p>
     */
    public void setMaintenanceWindows(java.util.Collection<MaintenanceWindow> maintenanceWindows) {
        if (maintenanceWindows == null) {
            this.maintenanceWindows = null;
            return;
        }

        this.maintenanceWindows = new java.util.ArrayList<MaintenanceWindow>(maintenanceWindows);
    }

    /**
     * <p>
     * Allows you to configure an optional maintenance window for the rollout of
     * a job document to all devices in the target group for a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceWindows <p>
     *            Allows you to configure an optional maintenance window for the
     *            rollout of a job document to all devices in the target group
     *            for a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withMaintenanceWindows(MaintenanceWindow... maintenanceWindows) {
        if (getMaintenanceWindows() == null) {
            this.maintenanceWindows = new java.util.ArrayList<MaintenanceWindow>(
                    maintenanceWindows.length);
        }
        for (MaintenanceWindow value : maintenanceWindows) {
            this.maintenanceWindows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Allows you to configure an optional maintenance window for the rollout of
     * a job document to all devices in the target group for a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceWindows <p>
     *            Allows you to configure an optional maintenance window for the
     *            rollout of a job document to all devices in the target group
     *            for a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withMaintenanceWindows(
            java.util.Collection<MaintenanceWindow> maintenanceWindows) {
        setMaintenanceWindows(maintenanceWindows);
        return this;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes. The package version must
     * be in either the Published or Deprecated state when the job deploys. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up
     * to 25 package version ARNs are allowed.
     * </p>
     *
     * @return <p>
     *         The package version Amazon Resource Names (ARNs) that are
     *         installed on the device when the job successfully completes. The
     *         package version must be in either the Published or Deprecated
     *         state when the job deploys. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *         >Package version lifecycle</a>.
     *         </p>
     *         <p>
     *         <b>Note:</b>The following Length Constraints relates to a single
     *         ARN. Up to 25 package version ARNs are allowed.
     *         </p>
     */
    public java.util.List<String> getDestinationPackageVersions() {
        return destinationPackageVersions;
    }

    /**
     * <p>
     * The package version Amazon Resource Names (ARNs) that are installed on
     * the device when the job successfully completes. The package version must
     * be in either the Published or Deprecated state when the job deploys. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up
     * to 25 package version ARNs are allowed.
     * </p>
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            The package version must be in either the Published or
     *            Deprecated state when the job deploys. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single ARN. Up to 25 package version ARNs are allowed.
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
     * the device when the job successfully completes. The package version must
     * be in either the Published or Deprecated state when the job deploys. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up
     * to 25 package version ARNs are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            The package version must be in either the Published or
     *            Deprecated state when the job deploys. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single ARN. Up to 25 package version ARNs are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withDestinationPackageVersions(
            String... destinationPackageVersions) {
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
     * the device when the job successfully completes. The package version must
     * be in either the Published or Deprecated state when the job deploys. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Note:</b>The following Length Constraints relates to a single ARN. Up
     * to 25 package version ARNs are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPackageVersions <p>
     *            The package version Amazon Resource Names (ARNs) that are
     *            installed on the device when the job successfully completes.
     *            The package version must be in either the Published or
     *            Deprecated state when the job deploys. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     *            <p>
     *            <b>Note:</b>The following Length Constraints relates to a
     *            single ARN. Up to 25 package version ARNs are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobTemplateRequest withDestinationPackageVersions(
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
        if (getJobTemplateId() != null)
            sb.append("jobTemplateId: " + getJobTemplateId() + ",");
        if (getJobArn() != null)
            sb.append("jobArn: " + getJobArn() + ",");
        if (getDocumentSource() != null)
            sb.append("documentSource: " + getDocumentSource() + ",");
        if (getDocument() != null)
            sb.append("document: " + getDocument() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPresignedUrlConfig() != null)
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        if (getAbortConfig() != null)
            sb.append("abortConfig: " + getAbortConfig() + ",");
        if (getTimeoutConfig() != null)
            sb.append("timeoutConfig: " + getTimeoutConfig() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getJobExecutionsRetryConfig() != null)
            sb.append("jobExecutionsRetryConfig: " + getJobExecutionsRetryConfig() + ",");
        if (getMaintenanceWindows() != null)
            sb.append("maintenanceWindows: " + getMaintenanceWindows() + ",");
        if (getDestinationPackageVersions() != null)
            sb.append("destinationPackageVersions: " + getDestinationPackageVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
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
        hashCode = prime * hashCode
                + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRetryConfig() == null) ? 0 : getJobExecutionsRetryConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceWindows() == null) ? 0 : getMaintenanceWindows().hashCode());
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

        if (obj instanceof CreateJobTemplateRequest == false)
            return false;
        CreateJobTemplateRequest other = (CreateJobTemplateRequest) obj;

        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null
                && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
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
        if (other.getJobExecutionsRetryConfig() == null
                ^ this.getJobExecutionsRetryConfig() == null)
            return false;
        if (other.getJobExecutionsRetryConfig() != null
                && other.getJobExecutionsRetryConfig().equals(this.getJobExecutionsRetryConfig()) == false)
            return false;
        if (other.getMaintenanceWindows() == null ^ this.getMaintenanceWindows() == null)
            return false;
        if (other.getMaintenanceWindows() != null
                && other.getMaintenanceWindows().equals(this.getMaintenanceWindows()) == false)
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
