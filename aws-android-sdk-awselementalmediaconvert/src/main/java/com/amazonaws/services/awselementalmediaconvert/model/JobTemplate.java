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
 * A job template is a pre-made set of encoding instructions that you can use to
 * quickly create a job.
 */
public class JobTemplate implements Serializable {
    /**
     * Accelerated transcoding can significantly speed up jobs with long,
     * visually complex content.
     */
    private AccelerationSettings accelerationSettings;

    /**
     * An identifier for this resource that is unique within all of AWS.
     */
    private String arn;

    /**
     * An optional category you create to organize your job templates.
     */
    private String category;

    /**
     * The timestamp in epoch seconds for Job template creation.
     */
    private java.util.Date createdAt;

    /**
     * An optional description you create for each job template.
     */
    private String description;

    /**
     * Optional list of hop destinations.
     */
    private java.util.List<HopDestination> hopDestinations;

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     */
    private java.util.Date lastUpdated;

    /**
     * A name you create for each job template. Each name must be unique within
     * your account.
     */
    private String name;

    /**
     * Relative priority on the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     */
    private Integer priority;

    /**
     * Optional. The queue that jobs created from this template are assigned to.
     * If you don't specify this, jobs will go to the default queue.
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
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     */
    private String type;

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
    public JobTemplate withAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
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
    public JobTemplate withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * An optional category you create to organize your job templates.
     *
     * @return An optional category you create to organize your job templates.
     */
    public String getCategory() {
        return category;
    }

    /**
     * An optional category you create to organize your job templates.
     *
     * @param category An optional category you create to organize your job
     *            templates.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * An optional category you create to organize your job templates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category An optional category you create to organize your job
     *            templates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     *
     * @return The timestamp in epoch seconds for Job template creation.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     *
     * @param createdAt The timestamp in epoch seconds for Job template
     *            creation.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt The timestamp in epoch seconds for Job template
     *            creation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * An optional description you create for each job template.
     *
     * @return An optional description you create for each job template.
     */
    public String getDescription() {
        return description;
    }

    /**
     * An optional description you create for each job template.
     *
     * @param description An optional description you create for each job
     *            template.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An optional description you create for each job template.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description An optional description you create for each job
     *            template.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withDescription(String description) {
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
    public JobTemplate withHopDestinations(HopDestination... hopDestinations) {
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
    public JobTemplate withHopDestinations(java.util.Collection<HopDestination> hopDestinations) {
        setHopDestinations(hopDestinations);
        return this;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     *
     * @return The timestamp in epoch seconds when the Job template was last
     *         updated.
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     *
     * @param lastUpdated The timestamp in epoch seconds when the Job template
     *            was last updated.
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated The timestamp in epoch seconds when the Job template
     *            was last updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * A name you create for each job template. Each name must be unique within
     * your account.
     *
     * @return A name you create for each job template. Each name must be unique
     *         within your account.
     */
    public String getName() {
        return name;
    }

    /**
     * A name you create for each job template. Each name must be unique within
     * your account.
     *
     * @param name A name you create for each job template. Each name must be
     *            unique within your account.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name you create for each job template. Each name must be unique within
     * your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name A name you create for each job template. Each name must be
     *            unique within your account.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withName(String name) {
        this.name = name;
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
    public JobTemplate withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to.
     * If you don't specify this, jobs will go to the default queue.
     *
     * @return Optional. The queue that jobs created from this template are
     *         assigned to. If you don't specify this, jobs will go to the
     *         default queue.
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to.
     * If you don't specify this, jobs will go to the default queue.
     *
     * @param queue Optional. The queue that jobs created from this template are
     *            assigned to. If you don't specify this, jobs will go to the
     *            default queue.
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to.
     * If you don't specify this, jobs will go to the default queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue Optional. The queue that jobs created from this template are
     *            assigned to. If you don't specify this, jobs will go to the
     *            default queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplate withQueue(String queue) {
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
    public JobTemplate withSettings(JobTemplateSettings settings) {
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
    public JobTemplate withStatusUpdateInterval(String statusUpdateInterval) {
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
    public JobTemplate withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
        return this;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @return A job template can be of two types: system or custom. System or
     *         built-in job templates can't be modified or deleted by the user.
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A job template can be of two types: system or custom. System
     *            or built-in job templates can't be modified or deleted by the
     *            user.
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A job template can be of two types: system or custom. System
     *            or built-in job templates can't be modified or deleted by the
     *            user.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public JobTemplate withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A job template can be of two types: system or custom. System
     *            or built-in job templates can't be modified or deleted by the
     *            user.
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * A job template can be of two types: system or custom. System or built-in
     * job templates can't be modified or deleted by the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, CUSTOM
     *
     * @param type A job template can be of two types: system or custom. System
     *            or built-in job templates can't be modified or deleted by the
     *            user.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public JobTemplate withType(Type type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getHopDestinations() != null)
            sb.append("HopDestinations: " + getHopDestinations() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: " + getStatusUpdateInterval() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getHopDestinations() == null) ? 0 : getHopDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplate == false)
            return false;
        JobTemplate other = (JobTemplate) obj;

        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null
                && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
