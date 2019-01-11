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
 * Campaign definition
 */
public class CampaignResponse implements Serializable {
    /**
     * Treatments that are defined in addition to the default treatment.
     */
    private java.util.List<TreatmentResource> additionalTreatments;

    /**
     * The ID of the application to which the campaign applies.
     */
    private String applicationId;

    /**
     * The date the campaign was created in ISO 8601 format.
     */
    private String creationDate;

    /**
     * The status of the campaign's default treatment. Only present for A/B test
     * campaigns.
     */
    private CampaignState defaultState;

    /**
     * A description of the campaign.
     */
    private String description;

    /**
     * The allocated percentage of end users who will not receive messages from
     * this campaign.
     */
    private Integer holdoutPercent;

    /**
     * Campaign hook information.
     */
    private CampaignHook hook;

    /**
     * The unique campaign ID.
     */
    private String id;

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send
     * messages unless you resume it by setting IsPaused to false.
     */
    private Boolean isPaused;

    /**
     * The date the campaign was last updated in ISO 8601 format.
     */
    private String lastModifiedDate;

    /**
     * The campaign limits settings.
     */
    private CampaignLimits limits;

    /**
     * The message configuration settings.
     */
    private MessageConfiguration messageConfiguration;

    /**
     * The custom name of the campaign.
     */
    private String name;

    /**
     * The campaign schedule.
     */
    private Schedule schedule;

    /**
     * The ID of the segment to which the campaign sends messages.
     */
    private String segmentId;

    /**
     * The version of the segment to which the campaign sends messages.
     */
    private Integer segmentVersion;

    /**
     * The campaign status. An A/B test campaign will have a status of COMPLETED
     * only when all treatments have a status of COMPLETED.
     */
    private CampaignState state;

    /**
     * A custom description for the treatment.
     */
    private String treatmentDescription;

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     */
    private String treatmentName;

    /**
     * The campaign version number.
     */
    private Integer version;

    /**
     * Treatments that are defined in addition to the default treatment.
     *
     * @return Treatments that are defined in addition to the default treatment.
     */
    public java.util.List<TreatmentResource> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     *
     * @param additionalTreatments Treatments that are defined in addition to
     *            the default treatment.
     */
    public void setAdditionalTreatments(java.util.Collection<TreatmentResource> additionalTreatments) {
        if (additionalTreatments == null) {
            this.additionalTreatments = null;
            return;
        }

        this.additionalTreatments = new java.util.ArrayList<TreatmentResource>(additionalTreatments);
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalTreatments Treatments that are defined in addition to
     *            the default treatment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withAdditionalTreatments(TreatmentResource... additionalTreatments) {
        if (getAdditionalTreatments() == null) {
            this.additionalTreatments = new java.util.ArrayList<TreatmentResource>(
                    additionalTreatments.length);
        }
        for (TreatmentResource value : additionalTreatments) {
            this.additionalTreatments.add(value);
        }
        return this;
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalTreatments Treatments that are defined in addition to
     *            the default treatment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withAdditionalTreatments(
            java.util.Collection<TreatmentResource> additionalTreatments) {
        setAdditionalTreatments(additionalTreatments);
        return this;
    }

    /**
     * The ID of the application to which the campaign applies.
     *
     * @return The ID of the application to which the campaign applies.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The ID of the application to which the campaign applies.
     *
     * @param applicationId The ID of the application to which the campaign
     *            applies.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application to which the campaign applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The ID of the application to which the campaign
     *            applies.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     *
     * @return The date the campaign was created in ISO 8601 format.
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     *
     * @param creationDate The date the campaign was created in ISO 8601 format.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate The date the campaign was created in ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test
     * campaigns.
     *
     * @return The status of the campaign's default treatment. Only present for
     *         A/B test campaigns.
     */
    public CampaignState getDefaultState() {
        return defaultState;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test
     * campaigns.
     *
     * @param defaultState The status of the campaign's default treatment. Only
     *            present for A/B test campaigns.
     */
    public void setDefaultState(CampaignState defaultState) {
        this.defaultState = defaultState;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test
     * campaigns.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultState The status of the campaign's default treatment. Only
     *            present for A/B test campaigns.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withDefaultState(CampaignState defaultState) {
        this.defaultState = defaultState;
        return this;
    }

    /**
     * A description of the campaign.
     *
     * @return A description of the campaign.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description of the campaign.
     *
     * @param description A description of the campaign.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description A description of the campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The allocated percentage of end users who will not receive messages from
     * this campaign.
     *
     * @return The allocated percentage of end users who will not receive
     *         messages from this campaign.
     */
    public Integer getHoldoutPercent() {
        return holdoutPercent;
    }

    /**
     * The allocated percentage of end users who will not receive messages from
     * this campaign.
     *
     * @param holdoutPercent The allocated percentage of end users who will not
     *            receive messages from this campaign.
     */
    public void setHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
    }

    /**
     * The allocated percentage of end users who will not receive messages from
     * this campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param holdoutPercent The allocated percentage of end users who will not
     *            receive messages from this campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    /**
     * Campaign hook information.
     *
     * @return Campaign hook information.
     */
    public CampaignHook getHook() {
        return hook;
    }

    /**
     * Campaign hook information.
     *
     * @param hook Campaign hook information.
     */
    public void setHook(CampaignHook hook) {
        this.hook = hook;
    }

    /**
     * Campaign hook information.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hook Campaign hook information.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withHook(CampaignHook hook) {
        this.hook = hook;
        return this;
    }

    /**
     * The unique campaign ID.
     *
     * @return The unique campaign ID.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique campaign ID.
     *
     * @param id The unique campaign ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique campaign ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique campaign ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send
     * messages unless you resume it by setting IsPaused to false.
     *
     * @return Indicates whether the campaign is paused. A paused campaign does
     *         not send messages unless you resume it by setting IsPaused to
     *         false.
     */
    public Boolean isIsPaused() {
        return isPaused;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send
     * messages unless you resume it by setting IsPaused to false.
     *
     * @return Indicates whether the campaign is paused. A paused campaign does
     *         not send messages unless you resume it by setting IsPaused to
     *         false.
     */
    public Boolean getIsPaused() {
        return isPaused;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send
     * messages unless you resume it by setting IsPaused to false.
     *
     * @param isPaused Indicates whether the campaign is paused. A paused
     *            campaign does not send messages unless you resume it by
     *            setting IsPaused to false.
     */
    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send
     * messages unless you resume it by setting IsPaused to false.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPaused Indicates whether the campaign is paused. A paused
     *            campaign does not send messages unless you resume it by
     *            setting IsPaused to false.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
        return this;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     *
     * @return The date the campaign was last updated in ISO 8601 format.
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     *
     * @param lastModifiedDate The date the campaign was last updated in ISO
     *            8601 format.
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate The date the campaign was last updated in ISO
     *            8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The campaign limits settings.
     *
     * @return The campaign limits settings.
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * The campaign limits settings.
     *
     * @param limits The campaign limits settings.
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The campaign limits settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits The campaign limits settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withLimits(CampaignLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * The message configuration settings.
     *
     * @return The message configuration settings.
     */
    public MessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * The message configuration settings.
     *
     * @param messageConfiguration The message configuration settings.
     */
    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * The message configuration settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration The message configuration settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * The custom name of the campaign.
     *
     * @return The custom name of the campaign.
     */
    public String getName() {
        return name;
    }

    /**
     * The custom name of the campaign.
     *
     * @param name The custom name of the campaign.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The custom name of the campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The custom name of the campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The campaign schedule.
     *
     * @return The campaign schedule.
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * The campaign schedule.
     *
     * @param schedule The campaign schedule.
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The campaign schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule The campaign schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     *
     * @return The ID of the segment to which the campaign sends messages.
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     *
     * @param segmentId The ID of the segment to which the campaign sends
     *            messages.
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId The ID of the segment to which the campaign sends
     *            messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     *
     * @return The version of the segment to which the campaign sends messages.
     */
    public Integer getSegmentVersion() {
        return segmentVersion;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     *
     * @param segmentVersion The version of the segment to which the campaign
     *            sends messages.
     */
    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentVersion The version of the segment to which the campaign
     *            sends messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
        return this;
    }

    /**
     * The campaign status. An A/B test campaign will have a status of COMPLETED
     * only when all treatments have a status of COMPLETED.
     *
     * @return The campaign status. An A/B test campaign will have a status of
     *         COMPLETED only when all treatments have a status of COMPLETED.
     */
    public CampaignState getState() {
        return state;
    }

    /**
     * The campaign status. An A/B test campaign will have a status of COMPLETED
     * only when all treatments have a status of COMPLETED.
     *
     * @param state The campaign status. An A/B test campaign will have a status
     *            of COMPLETED only when all treatments have a status of
     *            COMPLETED.
     */
    public void setState(CampaignState state) {
        this.state = state;
    }

    /**
     * The campaign status. An A/B test campaign will have a status of COMPLETED
     * only when all treatments have a status of COMPLETED.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state The campaign status. An A/B test campaign will have a status
     *            of COMPLETED only when all treatments have a status of
     *            COMPLETED.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withState(CampaignState state) {
        this.state = state;
        return this;
    }

    /**
     * A custom description for the treatment.
     *
     * @return A custom description for the treatment.
     */
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     *
     * @param treatmentDescription A custom description for the treatment.
     */
    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentDescription A custom description for the treatment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
        return this;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     *
     * @return The custom name of a variation of the campaign used for A/B
     *         testing.
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     *
     * @param treatmentName The custom name of a variation of the campaign used
     *            for A/B testing.
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentName The custom name of a variation of the campaign used
     *            for A/B testing.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
        return this;
    }

    /**
     * The campaign version number.
     *
     * @return The campaign version number.
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * The campaign version number.
     *
     * @param version The campaign version number.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The campaign version number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version The campaign version number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignResponse withVersion(Integer version) {
        this.version = version;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefaultState() != null)
            sb.append("DefaultState: " + getDefaultState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getHoldoutPercent() != null)
            sb.append("HoldoutPercent: " + getHoldoutPercent() + ",");
        if (getHook() != null)
            sb.append("Hook: " + getHook() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIsPaused() != null)
            sb.append("IsPaused: " + getIsPaused() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: " + getTreatmentDescription() + ",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: " + getTreatmentName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
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
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultState() == null) ? 0 : getDefaultState().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getHoldoutPercent() == null) ? 0 : getHoldoutPercent().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsPaused() == null) ? 0 : getIsPaused().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignResponse == false)
            return false;
        CampaignResponse other = (CampaignResponse) obj;

        if (other.getAdditionalTreatments() == null ^ this.getAdditionalTreatments() == null)
            return false;
        if (other.getAdditionalTreatments() != null
                && other.getAdditionalTreatments().equals(this.getAdditionalTreatments()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultState() == null ^ this.getDefaultState() == null)
            return false;
        if (other.getDefaultState() != null
                && other.getDefaultState().equals(this.getDefaultState()) == false)
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsPaused() == null ^ this.getIsPaused() == null)
            return false;
        if (other.getIsPaused() != null && other.getIsPaused().equals(this.getIsPaused()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
