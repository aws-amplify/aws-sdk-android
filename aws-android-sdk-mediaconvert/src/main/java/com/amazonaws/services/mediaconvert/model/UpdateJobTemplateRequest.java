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
 * Modify one of your existing job templates.
 */
public class UpdateJobTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content. Outputs that use this feature incur pro-tier
     * pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     */
    private AccelerationSettings accelerationSettings;

    /**
     * The new category for the job template, if you are changing it.
     */
    private String category;

    /**
     * The new description for the job template, if you are changing it.
     */
    private String description;

    /**
     * Optional list of hop destinations.
     */
    private java.util.List<HopDestination> hopDestinations;

    /**
     * The name of the job template you are modifying
     */
    private String name;

    /**
     * Specify the relative priority for this job. In any given queue, the
     * service begins processing the job with the highest value first. When more
     * than one job has the same priority, the service begins processing the job
     * that you submitted first. If you don't specify a priority, the service
     * uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     */
    private Integer priority;

    /**
     * The new queue for the job template, if you are changing it.
     */
    private String queue;

    /**
     * JobTemplateSettings contains all the transcode settings saved in the
     * template that will be applied to jobs created from it.
     */
    private JobTemplateSettings settings;

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
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content. Outputs that use this feature incur pro-tier
     * pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     *
     * @return Accelerated transcoding can significantly speed up jobs with
     *         long, visually complex content. Outputs that use this feature
     *         incur pro-tier pricing. For information about feature
     *         limitations, see the AWS Elemental MediaConvert User Guide.
     */
    public AccelerationSettings getAccelerationSettings() {
        return accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content. Outputs that use this feature incur pro-tier
     * pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     *
     * @param accelerationSettings Accelerated transcoding can significantly
     *            speed up jobs with long, visually complex content. Outputs
     *            that use this feature incur pro-tier pricing. For information
     *            about feature limitations, see the AWS Elemental MediaConvert
     *            User Guide.
     */
    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content. Outputs that use this feature incur pro-tier
     * pricing. For information about feature limitations, see the AWS Elemental
     * MediaConvert User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerationSettings Accelerated transcoding can significantly
     *            speed up jobs with long, visually complex content. Outputs
     *            that use this feature incur pro-tier pricing. For information
     *            about feature limitations, see the AWS Elemental MediaConvert
     *            User Guide.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withAccelerationSettings(
            AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
        return this;
    }

    /**
     * The new category for the job template, if you are changing it.
     *
     * @return The new category for the job template, if you are changing it.
     */
    public String getCategory() {
        return category;
    }

    /**
     * The new category for the job template, if you are changing it.
     *
     * @param category The new category for the job template, if you are
     *            changing it.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * The new category for the job template, if you are changing it.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category The new category for the job template, if you are
     *            changing it.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * The new description for the job template, if you are changing it.
     *
     * @return The new description for the job template, if you are changing it.
     */
    public String getDescription() {
        return description;
    }

    /**
     * The new description for the job template, if you are changing it.
     *
     * @param description The new description for the job template, if you are
     *            changing it.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The new description for the job template, if you are changing it.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description The new description for the job template, if you are
     *            changing it.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withDescription(String description) {
        this.description = description;
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
    public UpdateJobTemplateRequest withHopDestinations(HopDestination... hopDestinations) {
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
    public UpdateJobTemplateRequest withHopDestinations(
            java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * The name of the job template you are modifying
     *
     * @return The name of the job template you are modifying
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the job template you are modifying
     *
     * @param name The name of the job template you are modifying
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the job template you are modifying
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the job template you are modifying
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the
     * service begins processing the job with the highest value first. When more
     * than one job has the same priority, the service begins processing the job
     * that you submitted first. If you don't specify a priority, the service
     * uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @return Specify the relative priority for this job. In any given queue,
     *         the service begins processing the job with the highest value
     *         first. When more than one job has the same priority, the service
     *         begins processing the job that you submitted first. If you don't
     *         specify a priority, the service uses the default value 0.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the
     * service begins processing the job with the highest value first. When more
     * than one job has the same priority, the service begins processing the job
     * that you submitted first. If you don't specify a priority, the service
     * uses the default value 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Specify the relative priority for this job. In any given
     *            queue, the service begins processing the job with the highest
     *            value first. When more than one job has the same priority, the
     *            service begins processing the job that you submitted first. If
     *            you don't specify a priority, the service uses the default
     *            value 0.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Specify the relative priority for this job. In any given queue, the
     * service begins processing the job with the highest value first. When more
     * than one job has the same priority, the service begins processing the job
     * that you submitted first. If you don't specify a priority, the service
     * uses the default value 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Specify the relative priority for this job. In any given
     *            queue, the service begins processing the job with the highest
     *            value first. When more than one job has the same priority, the
     *            service begins processing the job that you submitted first. If
     *            you don't specify a priority, the service uses the default
     *            value 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The new queue for the job template, if you are changing it.
     *
     * @return The new queue for the job template, if you are changing it.
     */
    public String getQueue() {
        return queue;
    }

    /**
     * The new queue for the job template, if you are changing it.
     *
     * @param queue The new queue for the job template, if you are changing it.
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * The new queue for the job template, if you are changing it.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue The new queue for the job template, if you are changing it.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the
     * template that will be applied to jobs created from it.
     *
     * @return JobTemplateSettings contains all the transcode settings saved in
     *         the template that will be applied to jobs created from it.
     */
    public JobTemplateSettings getSettings() {
        return settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the
     * template that will be applied to jobs created from it.
     *
     * @param settings JobTemplateSettings contains all the transcode settings
     *            saved in the template that will be applied to jobs created
     *            from it.
     */
    public void setSettings(JobTemplateSettings settings) {
        this.settings = settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the
     * template that will be applied to jobs created from it.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings JobTemplateSettings contains all the transcode settings
     *            saved in the template that will be applied to jobs created
     *            from it.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobTemplateRequest withSettings(JobTemplateSettings settings) {
        this.settings = settings;
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
    public UpdateJobTemplateRequest withStatusUpdateInterval(String statusUpdateInterval) {
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
    public UpdateJobTemplateRequest withStatusUpdateInterval(
            StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: " + getHopDestinations() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: " + getStatusUpdateInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobTemplateRequest == false)
            return false;
        UpdateJobTemplateRequest other = (UpdateJobTemplateRequest) obj;

        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null
                && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHopDestinations() == null ^ this.getHopDestinations() == null)
            return false;
        if (other.getHopDestinations() != null
                && other.getHopDestinations().equals(this.getHopDestinations()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null
                && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
            return false;
        return true;
    }
}
