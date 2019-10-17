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
 * Application settings.
 */
public class ApplicationSettingsResource implements Serializable {
    /**
     * The unique ID for the application.
     */
    private String applicationId;

    /**
     * Default campaign hook.
     */
    private CampaignHook campaignHook;

    /**
     * The date that the settings were last updated in ISO 8601 format.
     */
    private String lastModifiedDate;

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
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
     * The unique ID for the application.
     *
     * @return The unique ID for the application.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID for the application.
     *
     * @param applicationId The unique ID for the application.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationSettingsResource withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Default campaign hook.
     *
     * @return Default campaign hook.
     */
    public CampaignHook getCampaignHook() {
        return campaignHook;
    }

    /**
     * Default campaign hook.
     *
     * @param campaignHook Default campaign hook.
     */
    public void setCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
    }

    /**
     * Default campaign hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignHook Default campaign hook.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationSettingsResource withCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
        return this;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     *
     * @return The date that the settings were last updated in ISO 8601 format.
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     *
     * @param lastModifiedDate The date that the settings were last updated in
     *            ISO 8601 format.
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate The date that the settings were last updated in
     *            ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationSettingsResource withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     *
     * @return The default campaign limits for the app. These limits apply to
     *         each campaign for the app, unless the campaign overrides the
     *         default with limits of its own.
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     *
     * @param limits The default campaign limits for the app. These limits apply
     *            to each campaign for the app, unless the campaign overrides
     *            the default with limits of its own.
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits The default campaign limits for the app. These limits apply
     *            to each campaign for the app, unless the campaign overrides
     *            the default with limits of its own.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationSettingsResource withLimits(CampaignLimits limits) {
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
    public ApplicationSettingsResource withQuietTime(QuietTime quietTime) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getCampaignHook() != null)
            sb.append("CampaignHook: " + getCampaignHook() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
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
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getCampaignHook() == null) ? 0 : getCampaignHook().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
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

        if (obj instanceof ApplicationSettingsResource == false)
            return false;
        ApplicationSettingsResource other = (ApplicationSettingsResource) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignHook() == null ^ this.getCampaignHook() == null)
            return false;
        if (other.getCampaignHook() != null
                && other.getCampaignHook().equals(this.getCampaignHook()) == false)
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
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null
                && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        return true;
    }
}
