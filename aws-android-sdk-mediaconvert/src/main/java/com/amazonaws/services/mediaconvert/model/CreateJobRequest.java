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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Create a new transcoding job. For information about jobs and job settings,
 * see the User Guide at
 * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Optional. Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. Outputs that use this feature incur
     * pro-tier pricing. For information about feature limitations, see the AWS
     * Elemental MediaConvert User Guide.
     */
    private AccelerationSettings accelerationSettings;

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     */
    private String billingTagsSource;

    /**
     * Optional. Idempotency token for CreateJob operation.
     */
    private String clientRequestToken;

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of
     * the queue that you submit your job to. Specify an alternate queue and the
     * maximum time that your job will wait in the initial queue before hopping.
     * For more information about this feature, see the AWS Elemental
     * MediaConvert User Guide.
     */
    private java.util.List<HopDestination> hopDestinations;

    /**
     * Optional. When you create a job, you can either specify a job template or
     * specify the transcoding settings individually.
     */
    private String jobTemplate;

    /**
     * Optional. Specify the relative priority for this job. In any given queue,
     * the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing
     * the job that you submitted first. If you don't specify a priority, the
     * service uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     */
    private Integer priority;

    /**
     * Optional. When you create a job, you can specify a queue to send it to.
     * If you don't specify, the job will go to the default queue. For more
     * about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     */
    private String queue;

    /**
     * Required. The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     */
    private String role;

    /**
     * JobSettings contains all the transcode settings for a job.
     */
    private JobSettings settings;

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String simulateReservedQueue;

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     */
    private String statusUpdateInterval;

    /**
     * Optional. The tags that you want to add to the resource. You can tag
     * resources with a key-value pair or with only a key.
     */
    private java.util.Map<String, String> tags;

    /**
     * Optional. User-defined metadata that you want to associate with an
     * MediaConvert job. You specify metadata in key/value pairs.
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * Optional. Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. Outputs that use this feature incur
     * pro-tier pricing. For information about feature limitations, see the AWS
     * Elemental MediaConvert User Guide.
     *
     * @return Optional. Accelerated transcoding can significantly speed up jobs
     *         with long, visually complex content. Outputs that use this
     *         feature incur pro-tier pricing. For information about feature
     *         limitations, see the AWS Elemental MediaConvert User Guide.
     */
    public AccelerationSettings getAccelerationSettings() {
        return accelerationSettings;
    }

    /**
     * Optional. Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. Outputs that use this feature incur
     * pro-tier pricing. For information about feature limitations, see the AWS
     * Elemental MediaConvert User Guide.
     *
     * @param accelerationSettings Optional. Accelerated transcoding can
     *            significantly speed up jobs with long, visually complex
     *            content. Outputs that use this feature incur pro-tier pricing.
     *            For information about feature limitations, see the AWS
     *            Elemental MediaConvert User Guide.
     */
    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Optional. Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. Outputs that use this feature incur
     * pro-tier pricing. For information about feature limitations, see the AWS
     * Elemental MediaConvert User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerationSettings Optional. Accelerated transcoding can
     *            significantly speed up jobs with long, visually complex
     *            content. Outputs that use this feature incur pro-tier pricing.
     *            For information about feature limitations, see the AWS
     *            Elemental MediaConvert User Guide.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
        return this;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @return Optional. Choose a tag type that AWS Billing and Cost Management
     *         will use to sort your AWS Elemental MediaConvert costs on any
     *         billing report that you set up. Any transcoding outputs that
     *         don't have an associated tag will appear in your billing report
     *         unsorted. If you don't choose a valid value for this field, your
     *         job outputs will appear on the billing report unsorted.
     * @see BillingTagsSource
     */
    public String getBillingTagsSource() {
        return billingTagsSource;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource Optional. Choose a tag type that AWS Billing and
     *            Cost Management will use to sort your AWS Elemental
     *            MediaConvert costs on any billing report that you set up. Any
     *            transcoding outputs that don't have an associated tag will
     *            appear in your billing report unsorted. If you don't choose a
     *            valid value for this field, your job outputs will appear on
     *            the billing report unsorted.
     * @see BillingTagsSource
     */
    public void setBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource Optional. Choose a tag type that AWS Billing and
     *            Cost Management will use to sort your AWS Elemental
     *            MediaConvert costs on any billing report that you set up. Any
     *            transcoding outputs that don't have an associated tag will
     *            appear in your billing report unsorted. If you don't choose a
     *            valid value for this field, your job outputs will appear on
     *            the billing report unsorted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingTagsSource
     */
    public CreateJobRequest withBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
        return this;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource Optional. Choose a tag type that AWS Billing and
     *            Cost Management will use to sort your AWS Elemental
     *            MediaConvert costs on any billing report that you set up. Any
     *            transcoding outputs that don't have an associated tag will
     *            appear in your billing report unsorted. If you don't choose a
     *            valid value for this field, your job outputs will appear on
     *            the billing report unsorted.
     * @see BillingTagsSource
     */
    public void setBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use
     * to sort your AWS Elemental MediaConvert costs on any billing report that
     * you set up. Any transcoding outputs that don't have an associated tag
     * will appear in your billing report unsorted. If you don't choose a valid
     * value for this field, your job outputs will appear on the billing report
     * unsorted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUE, PRESET, JOB_TEMPLATE, JOB
     *
     * @param billingTagsSource Optional. Choose a tag type that AWS Billing and
     *            Cost Management will use to sort your AWS Elemental
     *            MediaConvert costs on any billing report that you set up. Any
     *            transcoding outputs that don't have an associated tag will
     *            appear in your billing report unsorted. If you don't choose a
     *            valid value for this field, your job outputs will appear on
     *            the billing report unsorted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingTagsSource
     */
    public CreateJobRequest withBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
        return this;
    }

    /**
     * Optional. Idempotency token for CreateJob operation.
     *
     * @return Optional. Idempotency token for CreateJob operation.
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * Optional. Idempotency token for CreateJob operation.
     *
     * @param clientRequestToken Optional. Idempotency token for CreateJob
     *            operation.
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * Optional. Idempotency token for CreateJob operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientRequestToken Optional. Idempotency token for CreateJob
     *            operation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of
     * the queue that you submit your job to. Specify an alternate queue and the
     * maximum time that your job will wait in the initial queue before hopping.
     * For more information about this feature, see the AWS Elemental
     * MediaConvert User Guide.
     *
     * @return Optional. Use queue hopping to avoid overly long waits in the
     *         backlog of the queue that you submit your job to. Specify an
     *         alternate queue and the maximum time that your job will wait in
     *         the initial queue before hopping. For more information about this
     *         feature, see the AWS Elemental MediaConvert User Guide.
     */
    public java.util.List<HopDestination> getHopDestinations() {
        return hopDestinations;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of
     * the queue that you submit your job to. Specify an alternate queue and the
     * maximum time that your job will wait in the initial queue before hopping.
     * For more information about this feature, see the AWS Elemental
     * MediaConvert User Guide.
     *
     * @param hopDestinations Optional. Use queue hopping to avoid overly long
     *            waits in the backlog of the queue that you submit your job to.
     *            Specify an alternate queue and the maximum time that your job
     *            will wait in the initial queue before hopping. For more
     *            information about this feature, see the AWS Elemental
     *            MediaConvert User Guide.
     */
    public void setHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        if (hopDestinations == null) {
            this.hopDestinations = null;
            return;
        }

        this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations);
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of
     * the queue that you submit your job to. Specify an alternate queue and the
     * maximum time that your job will wait in the initial queue before hopping.
     * For more information about this feature, see the AWS Elemental
     * MediaConvert User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hopDestinations Optional. Use queue hopping to avoid overly long
     *            waits in the backlog of the queue that you submit your job to.
     *            Specify an alternate queue and the maximum time that your job
     *            will wait in the initial queue before hopping. For more
     *            information about this feature, see the AWS Elemental
     *            MediaConvert User Guide.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withHopDestinations(HopDestination... hopDestinations) {
        if (getHopDestinations() == null) {
            this.hopDestinations = new java.util.ArrayList<HopDestination>(hopDestinations.length);
        }
        for (HopDestination value : hopDestinations) {
            this.hopDestinations.add(value);
        }
        return this;
    }

    /**
     * Optional. Use queue hopping to avoid overly long waits in the backlog of
     * the queue that you submit your job to. Specify an alternate queue and the
     * maximum time that your job will wait in the initial queue before hopping.
     * For more information about this feature, see the AWS Elemental
     * MediaConvert User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hopDestinations Optional. Use queue hopping to avoid overly long
     *            waits in the backlog of the queue that you submit your job to.
     *            Specify an alternate queue and the maximum time that your job
     *            will wait in the initial queue before hopping. For more
     *            information about this feature, see the AWS Elemental
     *            MediaConvert User Guide.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * Optional. When you create a job, you can either specify a job template or
     * specify the transcoding settings individually.
     *
     * @return Optional. When you create a job, you can either specify a job
     *         template or specify the transcoding settings individually.
     */
    public String getJobTemplate() {
        return jobTemplate;
    }

    /**
     * Optional. When you create a job, you can either specify a job template or
     * specify the transcoding settings individually.
     *
     * @param jobTemplate Optional. When you create a job, you can either
     *            specify a job template or specify the transcoding settings
     *            individually.
     */
    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * Optional. When you create a job, you can either specify a job template or
     * specify the transcoding settings individually.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobTemplate Optional. When you create a job, you can either
     *            specify a job template or specify the transcoding settings
     *            individually.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
        return this;
    }

    /**
     * Optional. Specify the relative priority for this job. In any given queue,
     * the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing
     * the job that you submitted first. If you don't specify a priority, the
     * service uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @return Optional. Specify the relative priority for this job. In any
     *         given queue, the service begins processing the job with the
     *         highest value first. When more than one job has the same
     *         priority, the service begins processing the job that you
     *         submitted first. If you don't specify a priority, the service
     *         uses the default value 0.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Optional. Specify the relative priority for this job. In any given queue,
     * the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing
     * the job that you submitted first. If you don't specify a priority, the
     * service uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Optional. Specify the relative priority for this job. In
     *            any given queue, the service begins processing the job with
     *            the highest value first. When more than one job has the same
     *            priority, the service begins processing the job that you
     *            submitted first. If you don't specify a priority, the service
     *            uses the default value 0.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Optional. Specify the relative priority for this job. In any given queue,
     * the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing
     * the job that you submitted first. If you don't specify a priority, the
     * service uses the default value 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Optional. Specify the relative priority for this job. In
     *            any given queue, the service begins processing the job with
     *            the highest value first. When more than one job has the same
     *            priority, the service begins processing the job that you
     *            submitted first. If you don't specify a priority, the service
     *            uses the default value 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to.
     * If you don't specify, the job will go to the default queue. For more
     * about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     *
     * @return Optional. When you create a job, you can specify a queue to send
     *         it to. If you don't specify, the job will go to the default
     *         queue. For more about queues, see the User Guide topic at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to.
     * If you don't specify, the job will go to the default queue. For more
     * about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     *
     * @param queue Optional. When you create a job, you can specify a queue to
     *            send it to. If you don't specify, the job will go to the
     *            default queue. For more about queues, see the User Guide topic
     *            at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.
     *            html.
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to.
     * If you don't specify, the job will go to the default queue. For more
     * about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue Optional. When you create a job, you can specify a queue to
     *            send it to. If you don't specify, the job will go to the
     *            default queue. For more about queues, see the User Guide topic
     *            at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.
     *            html.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     *
     * @return Required. The IAM role you use for creating this job. For details
     *         about permissions, see the User Guide topic at the User Guide at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     */
    public String getRole() {
        return role;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     *
     * @param role Required. The IAM role you use for creating this job. For
     *            details about permissions, see the User Guide topic at the
     *            User Guide at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug
     *            /iam-role.html.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about
     * permissions, see the User Guide topic at the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role Required. The IAM role you use for creating this job. For
     *            details about permissions, see the User Guide topic at the
     *            User Guide at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug
     *            /iam-role.html.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withRole(String role) {
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
    public CreateJobRequest withSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Optional. Enable this setting when you run a test job to estimate
     *         how many reserved transcoding slots (RTS) you need. When this is
     *         enabled, MediaConvert runs your job from an on-demand queue with
     *         similar performance to what you will see with one RTS in a
     *         reserved queue. This setting is disabled by default.
     * @see SimulateReservedQueue
     */
    public String getSimulateReservedQueue() {
        return simulateReservedQueue;
    }

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Optional. Enable this setting when you run a
     *            test job to estimate how many reserved transcoding slots (RTS)
     *            you need. When this is enabled, MediaConvert runs your job
     *            from an on-demand queue with similar performance to what you
     *            will see with one RTS in a reserved queue. This setting is
     *            disabled by default.
     * @see SimulateReservedQueue
     */
    public void setSimulateReservedQueue(String simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue;
    }

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Optional. Enable this setting when you run a
     *            test job to estimate how many reserved transcoding slots (RTS)
     *            you need. When this is enabled, MediaConvert runs your job
     *            from an on-demand queue with similar performance to what you
     *            will see with one RTS in a reserved queue. This setting is
     *            disabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SimulateReservedQueue
     */
    public CreateJobRequest withSimulateReservedQueue(String simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue;
        return this;
    }

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Optional. Enable this setting when you run a
     *            test job to estimate how many reserved transcoding slots (RTS)
     *            you need. When this is enabled, MediaConvert runs your job
     *            from an on-demand queue with similar performance to what you
     *            will see with one RTS in a reserved queue. This setting is
     *            disabled by default.
     * @see SimulateReservedQueue
     */
    public void setSimulateReservedQueue(SimulateReservedQueue simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue.toString();
    }

    /**
     * Optional. Enable this setting when you run a test job to estimate how
     * many reserved transcoding slots (RTS) you need. When this is enabled,
     * MediaConvert runs your job from an on-demand queue with similar
     * performance to what you will see with one RTS in a reserved queue. This
     * setting is disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param simulateReservedQueue Optional. Enable this setting when you run a
     *            test job to estimate how many reserved transcoding slots (RTS)
     *            you need. When this is enabled, MediaConvert runs your job
     *            from an on-demand queue with similar performance to what you
     *            will see with one RTS in a reserved queue. This setting is
     *            disabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SimulateReservedQueue
     */
    public CreateJobRequest withSimulateReservedQueue(SimulateReservedQueue simulateReservedQueue) {
        this.simulateReservedQueue = simulateReservedQueue.toString();
        return this;
    }

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @return Optional. Specify how often MediaConvert sends STATUS_UPDATE
     *         events to Amazon CloudWatch Events. Set the interval, in seconds,
     *         between status updates. MediaConvert sends an update at this
     *         interval from the time the service begins processing your job to
     *         the time it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public String getStatusUpdateInterval() {
        return statusUpdateInterval;
    }

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Optional. Specify how often MediaConvert
     *            sends STATUS_UPDATE events to Amazon CloudWatch Events. Set
     *            the interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public void setStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
    }

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
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
     * @param statusUpdateInterval Optional. Specify how often MediaConvert
     *            sends STATUS_UPDATE events to Amazon CloudWatch Events. Set
     *            the interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusUpdateInterval
     */
    public CreateJobRequest withStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
        return this;
    }

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS_10, SECONDS_12, SECONDS_15, SECONDS_20,
     * SECONDS_30, SECONDS_60, SECONDS_120, SECONDS_180, SECONDS_240,
     * SECONDS_300, SECONDS_360, SECONDS_420, SECONDS_480, SECONDS_540,
     * SECONDS_600
     *
     * @param statusUpdateInterval Optional. Specify how often MediaConvert
     *            sends STATUS_UPDATE events to Amazon CloudWatch Events. Set
     *            the interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @see StatusUpdateInterval
     */
    public void setStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
    }

    /**
     * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. Set the interval, in seconds, between status
     * updates. MediaConvert sends an update at this interval from the time the
     * service begins processing your job to the time it completes the transcode
     * or encounters an error.
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
     * @param statusUpdateInterval Optional. Specify how often MediaConvert
     *            sends STATUS_UPDATE events to Amazon CloudWatch Events. Set
     *            the interval, in seconds, between status updates. MediaConvert
     *            sends an update at this interval from the time the service
     *            begins processing your job to the time it completes the
     *            transcode or encounters an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusUpdateInterval
     */
    public CreateJobRequest withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
        return this;
    }

    /**
     * Optional. The tags that you want to add to the resource. You can tag
     * resources with a key-value pair or with only a key.
     *
     * @return Optional. The tags that you want to add to the resource. You can
     *         tag resources with a key-value pair or with only a key.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * Optional. The tags that you want to add to the resource. You can tag
     * resources with a key-value pair or with only a key.
     *
     * @param tags Optional. The tags that you want to add to the resource. You
     *            can tag resources with a key-value pair or with only a key.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Optional. The tags that you want to add to the resource. You can tag
     * resources with a key-value pair or with only a key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags Optional. The tags that you want to add to the resource. You
     *            can tag resources with a key-value pair or with only a key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Optional. The tags that you want to add to the resource. You can tag
     * resources with a key-value pair or with only a key.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Optional. User-defined metadata that you want to associate with an
     * MediaConvert job. You specify metadata in key/value pairs.
     *
     * @return Optional. User-defined metadata that you want to associate with
     *         an MediaConvert job. You specify metadata in key/value pairs.
     */
    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * Optional. User-defined metadata that you want to associate with an
     * MediaConvert job. You specify metadata in key/value pairs.
     *
     * @param userMetadata Optional. User-defined metadata that you want to
     *            associate with an MediaConvert job. You specify metadata in
     *            key/value pairs.
     */
    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * Optional. User-defined metadata that you want to associate with an
     * MediaConvert job. You specify metadata in key/value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMetadata Optional. User-defined metadata that you want to
     *            associate with an MediaConvert job. You specify metadata in
     *            key/value pairs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Optional. User-defined metadata that you want to associate with an
     * MediaConvert job. You specify metadata in key/value pairs.
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
    public CreateJobRequest addUserMetadataEntry(String key, String value) {
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
    public CreateJobRequest clearUserMetadataEntries() {
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
        if (getBillingTagsSource() != null)
            sb.append("BillingTagsSource: " + getBillingTagsSource() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: " + getHopDestinations() + ",");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: " + getJobTemplate() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getSimulateReservedQueue() != null)
            sb.append("SimulateReservedQueue: " + getSimulateReservedQueue() + ",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: " + getStatusUpdateInterval() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
                + ((getBillingTagsSource() == null) ? 0 : getBillingTagsSource().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getSimulateReservedQueue() == null) ? 0 : getSimulateReservedQueue().hashCode());
        hashCode = prime * hashCode
                + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null
                && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getBillingTagsSource() == null ^ this.getBillingTagsSource() == null)
            return false;
        if (other.getBillingTagsSource() != null
                && other.getBillingTagsSource().equals(this.getBillingTagsSource()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getHopDestinations() == null ^ this.getHopDestinations() == null)
            return false;
        if (other.getHopDestinations() != null
                && other.getHopDestinations().equals(this.getHopDestinations()) == false)
            return false;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null
                && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
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
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null
                && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null
                && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        return true;
    }
}
