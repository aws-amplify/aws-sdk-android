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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration and other settings for a campaign.
 * </p>
 */
public class WriteCampaignRequest implements Serializable {
    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign,
     * in addition to the default treatment for the campaign.
     * </p>
     */
    private java.util.List<WriteTreatmentResource> additionalTreatments;

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive
     * messages from the campaign.
     * </p>
     */
    private Integer holdoutPercent;

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the
     * campaign.
     * </p>
     */
    private CampaignHook hook;

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run
     * unless you resume it by setting this value to false.
     * </p>
     */
    private Boolean isPaused;

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     */
    private CampaignLimits limits;

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     */
    private MessageConfiguration messageConfiguration;

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     */
    private Schedule schedule;

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     */
    private String segmentId;

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     */
    private Integer segmentVersion;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the campaign. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B
     * testing.
     * </p>
     */
    private String treatmentDescription;

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     */
    private String treatmentName;

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign,
     * in addition to the default treatment for the campaign.
     * </p>
     *
     * @return <p>
     *         An array of requests that defines additional treatments for the
     *         campaign, in addition to the default treatment for the campaign.
     *         </p>
     */
    public java.util.List<WriteTreatmentResource> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign,
     * in addition to the default treatment for the campaign.
     * </p>
     *
     * @param additionalTreatments <p>
     *            An array of requests that defines additional treatments for
     *            the campaign, in addition to the default treatment for the
     *            campaign.
     *            </p>
     */
    public void setAdditionalTreatments(
            java.util.Collection<WriteTreatmentResource> additionalTreatments) {
        if (additionalTreatments == null) {
            this.additionalTreatments = null;
            return;
        }

        this.additionalTreatments = new java.util.ArrayList<WriteTreatmentResource>(
                additionalTreatments);
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign,
     * in addition to the default treatment for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalTreatments <p>
     *            An array of requests that defines additional treatments for
     *            the campaign, in addition to the default treatment for the
     *            campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withAdditionalTreatments(
            WriteTreatmentResource... additionalTreatments) {
        if (getAdditionalTreatments() == null) {
            this.additionalTreatments = new java.util.ArrayList<WriteTreatmentResource>(
                    additionalTreatments.length);
        }
        for (WriteTreatmentResource value : additionalTreatments) {
            this.additionalTreatments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign,
     * in addition to the default treatment for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalTreatments <p>
     *            An array of requests that defines additional treatments for
     *            the campaign, in addition to the default treatment for the
     *            campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withAdditionalTreatments(
            java.util.Collection<WriteTreatmentResource> additionalTreatments) {
        setAdditionalTreatments(additionalTreatments);
        return this;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     *
     * @return <p>
     *         The custom description of the campaign.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     *
     * @param description <p>
     *            The custom description of the campaign.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive
     * messages from the campaign.
     * </p>
     *
     * @return <p>
     *         The allocated percentage of users (segment members) who shouldn't
     *         receive messages from the campaign.
     *         </p>
     */
    public Integer getHoldoutPercent() {
        return holdoutPercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive
     * messages from the campaign.
     * </p>
     *
     * @param holdoutPercent <p>
     *            The allocated percentage of users (segment members) who
     *            shouldn't receive messages from the campaign.
     *            </p>
     */
    public void setHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive
     * messages from the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param holdoutPercent <p>
     *            The allocated percentage of users (segment members) who
     *            shouldn't receive messages from the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the
     * campaign.
     * </p>
     *
     * @return <p>
     *         The settings for the AWS Lambda function to use as a code hook
     *         for the campaign.
     *         </p>
     */
    public CampaignHook getHook() {
        return hook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the
     * campaign.
     * </p>
     *
     * @param hook <p>
     *            The settings for the AWS Lambda function to use as a code hook
     *            for the campaign.
     *            </p>
     */
    public void setHook(CampaignHook hook) {
        this.hook = hook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the
     * campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hook <p>
     *            The settings for the AWS Lambda function to use as a code hook
     *            for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withHook(CampaignHook hook) {
        this.hook = hook;
        return this;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run
     * unless you resume it by setting this value to false.
     * </p>
     *
     * @return <p>
     *         Specifies whether to pause the campaign. A paused campaign
     *         doesn't run unless you resume it by setting this value to false.
     *         </p>
     */
    public Boolean isIsPaused() {
        return isPaused;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run
     * unless you resume it by setting this value to false.
     * </p>
     *
     * @return <p>
     *         Specifies whether to pause the campaign. A paused campaign
     *         doesn't run unless you resume it by setting this value to false.
     *         </p>
     */
    public Boolean getIsPaused() {
        return isPaused;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run
     * unless you resume it by setting this value to false.
     * </p>
     *
     * @param isPaused <p>
     *            Specifies whether to pause the campaign. A paused campaign
     *            doesn't run unless you resume it by setting this value to
     *            false.
     *            </p>
     */
    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run
     * unless you resume it by setting this value to false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPaused <p>
     *            Specifies whether to pause the campaign. A paused campaign
     *            doesn't run unless you resume it by setting this value to
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
        return this;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     *
     * @return <p>
     *         The messaging limits for the campaign.
     *         </p>
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     *
     * @param limits <p>
     *            The messaging limits for the campaign.
     *            </p>
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            The messaging limits for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withLimits(CampaignLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     *
     * @return <p>
     *         The message configuration settings for the campaign.
     *         </p>
     */
    public MessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     *
     * @param messageConfiguration <p>
     *            The message configuration settings for the campaign.
     *            </p>
     */
    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration <p>
     *            The message configuration settings for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     *
     * @return <p>
     *         The custom name of the campaign.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     *
     * @param name <p>
     *            The custom name of the campaign.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     *
     * @return <p>
     *         The schedule settings for the campaign.
     *         </p>
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     *
     * @param schedule <p>
     *            The schedule settings for the campaign.
     *            </p>
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule settings for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the segment to associate with the
     *         campaign.
     *         </p>
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     *
     * @param segmentId <p>
     *            The unique identifier for the segment to associate with the
     *            campaign.
     *            </p>
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId <p>
     *            The unique identifier for the segment to associate with the
     *            campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     *
     * @return <p>
     *         The version of the segment to associate with the campaign.
     *         </p>
     */
    public Integer getSegmentVersion() {
        return segmentVersion;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     *
     * @param segmentVersion <p>
     *            The version of the segment to associate with the campaign.
     *            </p>
     */
    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentVersion <p>
     *            The version of the segment to associate with the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the campaign. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that defines the tags
     *         to associate with the campaign. Each tag consists of a required
     *         tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the campaign. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the campaign. Each tag consists of a
     *            required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the campaign. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the campaign. Each tag consists of a
     *            required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the campaign. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public WriteCampaignRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     *
     * @return <p>
     *         Specifies the message template to use for the message, for each
     *         type of channel.
     *         </p>
     */
    public TemplateConfiguration getTemplateConfiguration() {
        return templateConfiguration;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     *
     * @param templateConfiguration <p>
     *            Specifies the message template to use for the message, for
     *            each type of channel.
     *            </p>
     */
    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateConfiguration <p>
     *            Specifies the message template to use for the message, for
     *            each type of channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withTemplateConfiguration(
            TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B
     * testing.
     * </p>
     *
     * @return <p>
     *         The custom description of a variation of the campaign to use for
     *         A/B testing.
     *         </p>
     */
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B
     * testing.
     * </p>
     *
     * @param treatmentDescription <p>
     *            The custom description of a variation of the campaign to use
     *            for A/B testing.
     *            </p>
     */
    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B
     * testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentDescription <p>
     *            The custom description of a variation of the campaign to use
     *            for A/B testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
        return this;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     *
     * @return <p>
     *         The custom name of a variation of the campaign to use for A/B
     *         testing.
     *         </p>
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     *
     * @param treatmentName <p>
     *            The custom name of a variation of the campaign to use for A/B
     *            testing.
     *            </p>
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentName <p>
     *            The custom name of a variation of the campaign to use for A/B
     *            testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteCampaignRequest withTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
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
        if (getAdditionalTreatments() != null)
            sb.append("AdditionalTreatments: " + getAdditionalTreatments() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getHoldoutPercent() != null)
            sb.append("HoldoutPercent: " + getHoldoutPercent() + ",");
        if (getHook() != null)
            sb.append("Hook: " + getHook() + ",");
        if (getIsPaused() != null)
            sb.append("IsPaused: " + getIsPaused() + ",");
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getSegmentVersion() != null)
            sb.append("SegmentVersion: " + getSegmentVersion() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: " + getTemplateConfiguration() + ",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: " + getTreatmentDescription() + ",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: " + getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdditionalTreatments() == null) ? 0 : getAdditionalTreatments().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getHoldoutPercent() == null) ? 0 : getHoldoutPercent().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        hashCode = prime * hashCode + ((getIsPaused() == null) ? 0 : getIsPaused().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteCampaignRequest == false)
            return false;
        WriteCampaignRequest other = (WriteCampaignRequest) obj;

        if (other.getAdditionalTreatments() == null ^ this.getAdditionalTreatments() == null)
            return false;
        if (other.getAdditionalTreatments() != null
                && other.getAdditionalTreatments().equals(this.getAdditionalTreatments()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHoldoutPercent() == null ^ this.getHoldoutPercent() == null)
            return false;
        if (other.getHoldoutPercent() != null
                && other.getHoldoutPercent().equals(this.getHoldoutPercent()) == false)
            return false;
        if (other.getHook() == null ^ this.getHook() == null)
            return false;
        if (other.getHook() != null && other.getHook().equals(this.getHook()) == false)
            return false;
        if (other.getIsPaused() == null ^ this.getIsPaused() == null)
            return false;
        if (other.getIsPaused() != null && other.getIsPaused().equals(this.getIsPaused()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null
                && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentVersion() == null ^ this.getSegmentVersion() == null)
            return false;
        if (other.getSegmentVersion() != null
                && other.getSegmentVersion().equals(this.getSegmentVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null
                && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTreatmentDescription() == null ^ this.getTreatmentDescription() == null)
            return false;
        if (other.getTreatmentDescription() != null
                && other.getTreatmentDescription().equals(this.getTreatmentDescription()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null
                && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        return true;
    }
}
