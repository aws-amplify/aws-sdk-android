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
 * Creating application setting request
 */
public class WriteApplicationSettingsRequest implements Serializable {
    /**
     * Default campaign hook information.
     */
    private CampaignHook campaignHook;

    /**
     * The CloudWatchMetrics settings for the app.
     */
    private Boolean cloudWatchMetricsEnabled;

    /**
     * The limits that apply to each campaign in the project by default.
     * Campaigns can also have their own limits, which override the settings at
     * the project level.
     */
    private CampaignLimits limits;

    /**
     * The default quiet time for the app. Campaigns in the app don't send
     * messages to endpoints during the quiet time. Note: Make sure that your
     * endpoints include the Demographics.Timezone attribute if you plan to
     * enable a quiet time for your app. If your endpoints don't include this
     * attribute, they'll receive the messages that you send them, even if quiet
     * time is enabled. When you set up an app to use quiet time, campaigns in
     * that app don't send messages during the time range you specified, as long
     * as all of the following are true: - The endpoint includes a valid
     * Demographic.Timezone attribute. - The current time in the endpoint's time
     * zone is later than or equal to the time specified in the QuietTime.Start
     * attribute for the app (or campaign, if applicable). - The current time in
     * the endpoint's time zone is earlier than or equal to the time specified
     * in the QuietTime.End attribute for the app (or campaign, if applicable).
     * Individual campaigns within the app can have their own quiet time
     * settings, which override the quiet time settings at the app level.
     */
    private QuietTime quietTime;

    /**
     * Default campaign hook information.
     *
     * @return Default campaign hook information.
     */
    public CampaignHook getCampaignHook() {
        return campaignHook;
    }

    /**
     * Default campaign hook information.
     *
     * @param campaignHook Default campaign hook information.
     */
    public void setCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
    }

    /**
     * Default campaign hook information.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignHook Default campaign hook information.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
        return this;
    }

    /**
     * The CloudWatchMetrics settings for the app.
     *
     * @return The CloudWatchMetrics settings for the app.
     */
    public Boolean isCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * The CloudWatchMetrics settings for the app.
     *
     * @return The CloudWatchMetrics settings for the app.
     */
    public Boolean getCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * The CloudWatchMetrics settings for the app.
     *
     * @param cloudWatchMetricsEnabled The CloudWatchMetrics settings for the
     *            app.
     */
    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * The CloudWatchMetrics settings for the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchMetricsEnabled The CloudWatchMetrics settings for the
     *            app.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withCloudWatchMetricsEnabled(
            Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        return this;
    }

    /**
     * The limits that apply to each campaign in the project by default.
     * Campaigns can also have their own limits, which override the settings at
     * the project level.
     *
     * @return The limits that apply to each campaign in the project by default.
     *         Campaigns can also have their own limits, which override the
     *         settings at the project level.
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * The limits that apply to each campaign in the project by default.
     * Campaigns can also have their own limits, which override the settings at
     * the project level.
     *
     * @param limits The limits that apply to each campaign in the project by
     *            default. Campaigns can also have their own limits, which
     *            override the settings at the project level.
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The limits that apply to each campaign in the project by default.
     * Campaigns can also have their own limits, which override the settings at
     * the project level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits The limits that apply to each campaign in the project by
     *            default. Campaigns can also have their own limits, which
     *            override the settings at the project level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withLimits(CampaignLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * The default quiet time for the app. Campaigns in the app don't send
     * messages to endpoints during the quiet time. Note: Make sure that your
     * endpoints include the Demographics.Timezone attribute if you plan to
     * enable a quiet time for your app. If your endpoints don't include this
     * attribute, they'll receive the messages that you send them, even if quiet
     * time is enabled. When you set up an app to use quiet time, campaigns in
     * that app don't send messages during the time range you specified, as long
     * as all of the following are true: - The endpoint includes a valid
     * Demographic.Timezone attribute. - The current time in the endpoint's time
     * zone is later than or equal to the time specified in the QuietTime.Start
     * attribute for the app (or campaign, if applicable). - The current time in
     * the endpoint's time zone is earlier than or equal to the time specified
     * in the QuietTime.End attribute for the app (or campaign, if applicable).
     * Individual campaigns within the app can have their own quiet time
     * settings, which override the quiet time settings at the app level.
     *
     * @return The default quiet time for the app. Campaigns in the app don't
     *         send messages to endpoints during the quiet time. Note: Make sure
     *         that your endpoints include the Demographics.Timezone attribute
     *         if you plan to enable a quiet time for your app. If your
     *         endpoints don't include this attribute, they'll receive the
     *         messages that you send them, even if quiet time is enabled. When
     *         you set up an app to use quiet time, campaigns in that app don't
     *         send messages during the time range you specified, as long as all
     *         of the following are true: - The endpoint includes a valid
     *         Demographic.Timezone attribute. - The current time in the
     *         endpoint's time zone is later than or equal to the time specified
     *         in the QuietTime.Start attribute for the app (or campaign, if
     *         applicable). - The current time in the endpoint's time zone is
     *         earlier than or equal to the time specified in the QuietTime.End
     *         attribute for the app (or campaign, if applicable). Individual
     *         campaigns within the app can have their own quiet time settings,
     *         which override the quiet time settings at the app level.
     */
    public QuietTime getQuietTime() {
        return quietTime;
    }

    /**
     * The default quiet time for the app. Campaigns in the app don't send
     * messages to endpoints during the quiet time. Note: Make sure that your
     * endpoints include the Demographics.Timezone attribute if you plan to
     * enable a quiet time for your app. If your endpoints don't include this
     * attribute, they'll receive the messages that you send them, even if quiet
     * time is enabled. When you set up an app to use quiet time, campaigns in
     * that app don't send messages during the time range you specified, as long
     * as all of the following are true: - The endpoint includes a valid
     * Demographic.Timezone attribute. - The current time in the endpoint's time
     * zone is later than or equal to the time specified in the QuietTime.Start
     * attribute for the app (or campaign, if applicable). - The current time in
     * the endpoint's time zone is earlier than or equal to the time specified
     * in the QuietTime.End attribute for the app (or campaign, if applicable).
     * Individual campaigns within the app can have their own quiet time
     * settings, which override the quiet time settings at the app level.
     *
     * @param quietTime The default quiet time for the app. Campaigns in the app
     *            don't send messages to endpoints during the quiet time. Note:
     *            Make sure that your endpoints include the
     *            Demographics.Timezone attribute if you plan to enable a quiet
     *            time for your app. If your endpoints don't include this
     *            attribute, they'll receive the messages that you send them,
     *            even if quiet time is enabled. When you set up an app to use
     *            quiet time, campaigns in that app don't send messages during
     *            the time range you specified, as long as all of the following
     *            are true: - The endpoint includes a valid Demographic.Timezone
     *            attribute. - The current time in the endpoint's time zone is
     *            later than or equal to the time specified in the
     *            QuietTime.Start attribute for the app (or campaign, if
     *            applicable). - The current time in the endpoint's time zone is
     *            earlier than or equal to the time specified in the
     *            QuietTime.End attribute for the app (or campaign, if
     *            applicable). Individual campaigns within the app can have
     *            their own quiet time settings, which override the quiet time
     *            settings at the app level.
     */
    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * The default quiet time for the app. Campaigns in the app don't send
     * messages to endpoints during the quiet time. Note: Make sure that your
     * endpoints include the Demographics.Timezone attribute if you plan to
     * enable a quiet time for your app. If your endpoints don't include this
     * attribute, they'll receive the messages that you send them, even if quiet
     * time is enabled. When you set up an app to use quiet time, campaigns in
     * that app don't send messages during the time range you specified, as long
     * as all of the following are true: - The endpoint includes a valid
     * Demographic.Timezone attribute. - The current time in the endpoint's time
     * zone is later than or equal to the time specified in the QuietTime.Start
     * attribute for the app (or campaign, if applicable). - The current time in
     * the endpoint's time zone is earlier than or equal to the time specified
     * in the QuietTime.End attribute for the app (or campaign, if applicable).
     * Individual campaigns within the app can have their own quiet time
     * settings, which override the quiet time settings at the app level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quietTime The default quiet time for the app. Campaigns in the app
     *            don't send messages to endpoints during the quiet time. Note:
     *            Make sure that your endpoints include the
     *            Demographics.Timezone attribute if you plan to enable a quiet
     *            time for your app. If your endpoints don't include this
     *            attribute, they'll receive the messages that you send them,
     *            even if quiet time is enabled. When you set up an app to use
     *            quiet time, campaigns in that app don't send messages during
     *            the time range you specified, as long as all of the following
     *            are true: - The endpoint includes a valid Demographic.Timezone
     *            attribute. - The current time in the endpoint's time zone is
     *            later than or equal to the time specified in the
     *            QuietTime.Start attribute for the app (or campaign, if
     *            applicable). - The current time in the endpoint's time zone is
     *            earlier than or equal to the time specified in the
     *            QuietTime.End attribute for the app (or campaign, if
     *            applicable). Individual campaigns within the app can have
     *            their own quiet time settings, which override the quiet time
     *            settings at the app level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
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
        if (getCampaignHook() != null)
            sb.append("CampaignHook: " + getCampaignHook() + ",");
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: " + getCloudWatchMetricsEnabled() + ",");
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getQuietTime() != null)
            sb.append("QuietTime: " + getQuietTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCampaignHook() == null) ? 0 : getCampaignHook().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled()
                        .hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteApplicationSettingsRequest == false)
            return false;
        WriteApplicationSettingsRequest other = (WriteApplicationSettingsRequest) obj;

        if (other.getCampaignHook() == null ^ this.getCampaignHook() == null)
            return false;
        if (other.getCampaignHook() != null
                && other.getCampaignHook().equals(this.getCampaignHook()) == false)
            return false;
        if (other.getCloudWatchMetricsEnabled() == null
                ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null
                && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null
                && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        return true;
    }
}
