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
 * Provides information about an activity that was performed by a campaign.
 * </p>
 */
public class ActivityResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     */
    private String campaignId;

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked
     * CANCELLED or COMPLETED.
     * </p>
     */
    private String end;

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and
     * FAIL.
     * </p>
     */
    private String result;

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     */
    private String scheduledStart;

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     */
    private String start;

    /**
     * <p>
     * The state of the activity. Possible values are: PENDING, INITIALIZING,
     * RUNNING, PAUSED, CANCELLED, and COMPLETED.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered
     * messages to.
     * </p>
     */
    private Integer successfulEndpointCount;

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     */
    private Integer timezonesCompletedCount;

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the
     * campaign.
     * </p>
     */
    private Integer timezonesTotalCount;

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver
     * messages to.
     * </p>
     */
    private Integer totalEndpointCount;

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity
     * applies to. A treatment is a variation of a campaign that's used for A/B
     * testing of a campaign.
     * </p>
     */
    private String treatmentId;

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the campaign
     *         applies to.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the campaign
     *            applies to.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the campaign
     *            applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the campaign that the activity applies
     *         to.
     *         </p>
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign that the activity
     *            applies to.
     *            </p>
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign that the activity
     *            applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked
     * CANCELLED or COMPLETED.
     * </p>
     *
     * @return <p>
     *         The actual time, in ISO 8601 format, when the activity was marked
     *         CANCELLED or COMPLETED.
     *         </p>
     */
    public String getEnd() {
        return end;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked
     * CANCELLED or COMPLETED.
     * </p>
     *
     * @param end <p>
     *            The actual time, in ISO 8601 format, when the activity was
     *            marked CANCELLED or COMPLETED.
     *            </p>
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked
     * CANCELLED or COMPLETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            The actual time, in ISO 8601 format, when the activity was
     *            marked CANCELLED or COMPLETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the activity.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the activity.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and
     * FAIL.
     * </p>
     *
     * @return <p>
     *         Specifies whether the activity succeeded. Possible values are
     *         SUCCESS and FAIL.
     *         </p>
     */
    public String getResult() {
        return result;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and
     * FAIL.
     * </p>
     *
     * @param result <p>
     *            Specifies whether the activity succeeded. Possible values are
     *            SUCCESS and FAIL.
     *            </p>
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and
     * FAIL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param result <p>
     *            Specifies whether the activity succeeded. Possible values are
     *            SUCCESS and FAIL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     *
     * @return <p>
     *         The scheduled start time, in ISO 8601 format, for the activity.
     *         </p>
     */
    public String getScheduledStart() {
        return scheduledStart;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     *
     * @param scheduledStart <p>
     *            The scheduled start time, in ISO 8601 format, for the
     *            activity.
     *            </p>
     */
    public void setScheduledStart(String scheduledStart) {
        this.scheduledStart = scheduledStart;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledStart <p>
     *            The scheduled start time, in ISO 8601 format, for the
     *            activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withScheduledStart(String scheduledStart) {
        this.scheduledStart = scheduledStart;
        return this;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     *
     * @return <p>
     *         The actual start time, in ISO 8601 format, of the activity.
     *         </p>
     */
    public String getStart() {
        return start;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     *
     * @param start <p>
     *            The actual start time, in ISO 8601 format, of the activity.
     *            </p>
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start <p>
     *            The actual start time, in ISO 8601 format, of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * The state of the activity. Possible values are: PENDING, INITIALIZING,
     * RUNNING, PAUSED, CANCELLED, and COMPLETED.
     * </p>
     *
     * @return <p>
     *         The state of the activity. Possible values are: PENDING,
     *         INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the activity. Possible values are: PENDING, INITIALIZING,
     * RUNNING, PAUSED, CANCELLED, and COMPLETED.
     * </p>
     *
     * @param state <p>
     *            The state of the activity. Possible values are: PENDING,
     *            INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the activity. Possible values are: PENDING, INITIALIZING,
     * RUNNING, PAUSED, CANCELLED, and COMPLETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the activity. Possible values are: PENDING,
     *            INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered
     * messages to.
     * </p>
     *
     * @return <p>
     *         The total number of endpoints that the campaign successfully
     *         delivered messages to.
     *         </p>
     */
    public Integer getSuccessfulEndpointCount() {
        return successfulEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered
     * messages to.
     * </p>
     *
     * @param successfulEndpointCount <p>
     *            The total number of endpoints that the campaign successfully
     *            delivered messages to.
     *            </p>
     */
    public void setSuccessfulEndpointCount(Integer successfulEndpointCount) {
        this.successfulEndpointCount = successfulEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered
     * messages to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulEndpointCount <p>
     *            The total number of endpoints that the campaign successfully
     *            delivered messages to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withSuccessfulEndpointCount(Integer successfulEndpointCount) {
        this.successfulEndpointCount = successfulEndpointCount;
        return this;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     *
     * @return <p>
     *         The total number of time zones that were completed.
     *         </p>
     */
    public Integer getTimezonesCompletedCount() {
        return timezonesCompletedCount;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     *
     * @param timezonesCompletedCount <p>
     *            The total number of time zones that were completed.
     *            </p>
     */
    public void setTimezonesCompletedCount(Integer timezonesCompletedCount) {
        this.timezonesCompletedCount = timezonesCompletedCount;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezonesCompletedCount <p>
     *            The total number of time zones that were completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTimezonesCompletedCount(Integer timezonesCompletedCount) {
        this.timezonesCompletedCount = timezonesCompletedCount;
        return this;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the
     * campaign.
     * </p>
     *
     * @return <p>
     *         The total number of unique time zones that are in the segment for
     *         the campaign.
     *         </p>
     */
    public Integer getTimezonesTotalCount() {
        return timezonesTotalCount;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the
     * campaign.
     * </p>
     *
     * @param timezonesTotalCount <p>
     *            The total number of unique time zones that are in the segment
     *            for the campaign.
     *            </p>
     */
    public void setTimezonesTotalCount(Integer timezonesTotalCount) {
        this.timezonesTotalCount = timezonesTotalCount;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the
     * campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezonesTotalCount <p>
     *            The total number of unique time zones that are in the segment
     *            for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTimezonesTotalCount(Integer timezonesTotalCount) {
        this.timezonesTotalCount = timezonesTotalCount;
        return this;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver
     * messages to.
     * </p>
     *
     * @return <p>
     *         The total number of endpoints that the campaign attempted to
     *         deliver messages to.
     *         </p>
     */
    public Integer getTotalEndpointCount() {
        return totalEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver
     * messages to.
     * </p>
     *
     * @param totalEndpointCount <p>
     *            The total number of endpoints that the campaign attempted to
     *            deliver messages to.
     *            </p>
     */
    public void setTotalEndpointCount(Integer totalEndpointCount) {
        this.totalEndpointCount = totalEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver
     * messages to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalEndpointCount <p>
     *            The total number of endpoints that the campaign attempted to
     *            deliver messages to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivityResponse withTotalEndpointCount(Integer totalEndpointCount) {
        this.totalEndpointCount = totalEndpointCount;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity
     * applies to. A treatment is a variation of a campaign that's used for A/B
     * testing of a campaign.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the campaign treatment that the
     *         activity applies to. A treatment is a variation of a campaign
     *         that's used for A/B testing of a campaign.
     *         </p>
     */
    public String getTreatmentId() {
        return treatmentId;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity
     * applies to. A treatment is a variation of a campaign that's used for A/B
     * testing of a campaign.
     * </p>
     *
     * @param treatmentId <p>
     *            The unique identifier for the campaign treatment that the
     *            activity applies to. A treatment is a variation of a campaign
     *            that's used for A/B testing of a campaign.
     *            </p>
     */
    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity
     * applies to. A treatment is a variation of a campaign that's used for A/B
     * testing of a campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentId <p>
     *            The unique identifier for the campaign treatment that the
     *            activity applies to. A treatment is a variation of a campaign
     *            that's used for A/B testing of a campaign.
     *            </p>
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
