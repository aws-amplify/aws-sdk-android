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
 * Activity definition
 */
public class ActivityResponse implements Serializable {
    /**
     * The ID of the application to which the campaign applies.
     */
    private String applicationId;

    /**
     * The ID of the campaign to which the activity applies.
     */
    private String campaignId;

    /**
     * The actual time the activity was marked CANCELLED or COMPLETED. Provided
     * in ISO 8601 format.
     */
    private String end;

    /**
     * The unique activity ID.
     */
    private String id;

    /**
     * Indicates whether the activity succeeded. Valid values: SUCCESS, FAIL
     */
    private String result;

    /**
     * The scheduled start time for the activity in ISO 8601 format.
     */
    private String scheduledStart;

    /**
     * The actual start time of the activity in ISO 8601 format.
     */
    private String start;

    /**
     * The state of the activity. Valid values: PENDING, INITIALIZING, RUNNING,
     * PAUSED, CANCELLED, COMPLETED
     */
    private String state;

    /**
     * The total number of endpoints to which the campaign successfully
     * delivered messages.
     */
    private Integer successfulEndpointCount;

    /**
     * The total number of timezones completed.
     */
    private Integer timezonesCompletedCount;

    /**
     * The total number of unique timezones present in the segment.
     */
    private Integer timezonesTotalCount;

    /**
     * The total number of endpoints to which the campaign attempts to deliver
     * messages.
     */
    private Integer totalEndpointCount;

    /**
     * The ID of a variation of the campaign used for A/B testing.
     */
    private String treatmentId;

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
    public ActivityResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The ID of the campaign to which the activity applies.
     *
     * @return The ID of the campaign to which the activity applies.
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * The ID of the campaign to which the activity applies.
     *
     * @param campaignId The ID of the campaign to which the activity applies.
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * The ID of the campaign to which the activity applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId The ID of the campaign to which the activity applies.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * The actual time the activity was marked CANCELLED or COMPLETED. Provided
     * in ISO 8601 format.
     *
     * @return The actual time the activity was marked CANCELLED or COMPLETED.
     *         Provided in ISO 8601 format.
     */
    public String getEnd() {
        return end;
    }

    /**
     * The actual time the activity was marked CANCELLED or COMPLETED. Provided
     * in ISO 8601 format.
     *
     * @param end The actual time the activity was marked CANCELLED or
     *            COMPLETED. Provided in ISO 8601 format.
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * The actual time the activity was marked CANCELLED or COMPLETED. Provided
     * in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end The actual time the activity was marked CANCELLED or
     *            COMPLETED. Provided in ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * The unique activity ID.
     *
     * @return The unique activity ID.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique activity ID.
     *
     * @param id The unique activity ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique activity ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique activity ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Indicates whether the activity succeeded. Valid values: SUCCESS, FAIL
     *
     * @return Indicates whether the activity succeeded. Valid values: SUCCESS,
     *         FAIL
     */
    public String getResult() {
        return result;
    }

    /**
     * Indicates whether the activity succeeded. Valid values: SUCCESS, FAIL
     *
     * @param result Indicates whether the activity succeeded. Valid values:
     *            SUCCESS, FAIL
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Indicates whether the activity succeeded. Valid values: SUCCESS, FAIL
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result Indicates whether the activity succeeded. Valid values:
     *            SUCCESS, FAIL
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * The scheduled start time for the activity in ISO 8601 format.
     *
     * @return The scheduled start time for the activity in ISO 8601 format.
     */
    public String getScheduledStart() {
        return scheduledStart;
    }

    /**
     * The scheduled start time for the activity in ISO 8601 format.
     *
     * @param scheduledStart The scheduled start time for the activity in ISO
     *            8601 format.
     */
    public void setScheduledStart(String scheduledStart) {
        this.scheduledStart = scheduledStart;
    }

    /**
     * The scheduled start time for the activity in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledStart The scheduled start time for the activity in ISO
     *            8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withScheduledStart(String scheduledStart) {
        this.scheduledStart = scheduledStart;
        return this;
    }

    /**
     * The actual start time of the activity in ISO 8601 format.
     *
     * @return The actual start time of the activity in ISO 8601 format.
     */
    public String getStart() {
        return start;
    }

    /**
     * The actual start time of the activity in ISO 8601 format.
     *
     * @param start The actual start time of the activity in ISO 8601 format.
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * The actual start time of the activity in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start The actual start time of the activity in ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * The state of the activity. Valid values: PENDING, INITIALIZING, RUNNING,
     * PAUSED, CANCELLED, COMPLETED
     *
     * @return The state of the activity. Valid values: PENDING, INITIALIZING,
     *         RUNNING, PAUSED, CANCELLED, COMPLETED
     */
    public String getState() {
        return state;
    }

    /**
     * The state of the activity. Valid values: PENDING, INITIALIZING, RUNNING,
     * PAUSED, CANCELLED, COMPLETED
     *
     * @param state The state of the activity. Valid values: PENDING,
     *            INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * The state of the activity. Valid values: PENDING, INITIALIZING, RUNNING,
     * PAUSED, CANCELLED, COMPLETED
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state The state of the activity. Valid values: PENDING,
     *            INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The total number of endpoints to which the campaign successfully
     * delivered messages.
     *
     * @return The total number of endpoints to which the campaign successfully
     *         delivered messages.
     */
    public Integer getSuccessfulEndpointCount() {
        return successfulEndpointCount;
    }

    /**
     * The total number of endpoints to which the campaign successfully
     * delivered messages.
     *
     * @param successfulEndpointCount The total number of endpoints to which the
     *            campaign successfully delivered messages.
     */
    public void setSuccessfulEndpointCount(Integer successfulEndpointCount) {
        this.successfulEndpointCount = successfulEndpointCount;
    }

    /**
     * The total number of endpoints to which the campaign successfully
     * delivered messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulEndpointCount The total number of endpoints to which the
     *            campaign successfully delivered messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withSuccessfulEndpointCount(Integer successfulEndpointCount) {
        this.successfulEndpointCount = successfulEndpointCount;
        return this;
    }

    /**
     * The total number of timezones completed.
     *
     * @return The total number of timezones completed.
     */
    public Integer getTimezonesCompletedCount() {
        return timezonesCompletedCount;
    }

    /**
     * The total number of timezones completed.
     *
     * @param timezonesCompletedCount The total number of timezones completed.
     */
    public void setTimezonesCompletedCount(Integer timezonesCompletedCount) {
        this.timezonesCompletedCount = timezonesCompletedCount;
    }

    /**
     * The total number of timezones completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezonesCompletedCount The total number of timezones completed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTimezonesCompletedCount(Integer timezonesCompletedCount) {
        this.timezonesCompletedCount = timezonesCompletedCount;
        return this;
    }

    /**
     * The total number of unique timezones present in the segment.
     *
     * @return The total number of unique timezones present in the segment.
     */
    public Integer getTimezonesTotalCount() {
        return timezonesTotalCount;
    }

    /**
     * The total number of unique timezones present in the segment.
     *
     * @param timezonesTotalCount The total number of unique timezones present
     *            in the segment.
     */
    public void setTimezonesTotalCount(Integer timezonesTotalCount) {
        this.timezonesTotalCount = timezonesTotalCount;
    }

    /**
     * The total number of unique timezones present in the segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezonesTotalCount The total number of unique timezones present
     *            in the segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTimezonesTotalCount(Integer timezonesTotalCount) {
        this.timezonesTotalCount = timezonesTotalCount;
        return this;
    }

    /**
     * The total number of endpoints to which the campaign attempts to deliver
     * messages.
     *
     * @return The total number of endpoints to which the campaign attempts to
     *         deliver messages.
     */
    public Integer getTotalEndpointCount() {
        return totalEndpointCount;
    }

    /**
     * The total number of endpoints to which the campaign attempts to deliver
     * messages.
     *
     * @param totalEndpointCount The total number of endpoints to which the
     *            campaign attempts to deliver messages.
     */
    public void setTotalEndpointCount(Integer totalEndpointCount) {
        this.totalEndpointCount = totalEndpointCount;
    }

    /**
     * The total number of endpoints to which the campaign attempts to deliver
     * messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalEndpointCount The total number of endpoints to which the
     *            campaign attempts to deliver messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTotalEndpointCount(Integer totalEndpointCount) {
        this.totalEndpointCount = totalEndpointCount;
        return this;
    }

    /**
     * The ID of a variation of the campaign used for A/B testing.
     *
     * @return The ID of a variation of the campaign used for A/B testing.
     */
    public String getTreatmentId() {
        return treatmentId;
    }

    /**
     * The ID of a variation of the campaign used for A/B testing.
     *
     * @param treatmentId The ID of a variation of the campaign used for A/B
     *            testing.
     */
    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    /**
     * The ID of a variation of the campaign used for A/B testing.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentId The ID of a variation of the campaign used for A/B
     *            testing.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getCampaignId() != null)
            sb.append("CampaignId: " + getCampaignId() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getResult() != null)
            sb.append("Result: " + getResult() + ",");
        if (getScheduledStart() != null)
            sb.append("ScheduledStart: " + getScheduledStart() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getSuccessfulEndpointCount() != null)
            sb.append("SuccessfulEndpointCount: " + getSuccessfulEndpointCount() + ",");
        if (getTimezonesCompletedCount() != null)
            sb.append("TimezonesCompletedCount: " + getTimezonesCompletedCount() + ",");
        if (getTimezonesTotalCount() != null)
            sb.append("TimezonesTotalCount: " + getTimezonesTotalCount() + ",");
        if (getTotalEndpointCount() != null)
            sb.append("TotalEndpointCount: " + getTotalEndpointCount() + ",");
        if (getTreatmentId() != null)
            sb.append("TreatmentId: " + getTreatmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledStart() == null) ? 0 : getScheduledStart().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getSuccessfulEndpointCount() == null) ? 0 : getSuccessfulEndpointCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTimezonesCompletedCount() == null) ? 0 : getTimezonesCompletedCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTimezonesTotalCount() == null) ? 0 : getTimezonesTotalCount().hashCode());
        hashCode = prime * hashCode
                + ((getTotalEndpointCount() == null) ? 0 : getTotalEndpointCount().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentId() == null) ? 0 : getTreatmentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityResponse == false)
            return false;
        ActivityResponse other = (ActivityResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null
                && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getScheduledStart() == null ^ this.getScheduledStart() == null)
            return false;
        if (other.getScheduledStart() != null
                && other.getScheduledStart().equals(this.getScheduledStart()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSuccessfulEndpointCount() == null ^ this.getSuccessfulEndpointCount() == null)
            return false;
        if (other.getSuccessfulEndpointCount() != null
                && other.getSuccessfulEndpointCount().equals(this.getSuccessfulEndpointCount()) == false)
            return false;
        if (other.getTimezonesCompletedCount() == null ^ this.getTimezonesCompletedCount() == null)
            return false;
        if (other.getTimezonesCompletedCount() != null
                && other.getTimezonesCompletedCount().equals(this.getTimezonesCompletedCount()) == false)
            return false;
        if (other.getTimezonesTotalCount() == null ^ this.getTimezonesTotalCount() == null)
            return false;
        if (other.getTimezonesTotalCount() != null
                && other.getTimezonesTotalCount().equals(this.getTimezonesTotalCount()) == false)
            return false;
        if (other.getTotalEndpointCount() == null ^ this.getTotalEndpointCount() == null)
            return false;
        if (other.getTotalEndpointCount() != null
                && other.getTotalEndpointCount().equals(this.getTotalEndpointCount()) == false)
            return false;
        if (other.getTreatmentId() == null ^ this.getTreatmentId() == null)
            return false;
        if (other.getTreatmentId() != null
                && other.getTreatmentId().equals(this.getTreatmentId()) == false)
            return false;
        return true;
    }
}
