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
 * Specifies the default settings for an application.
 * </p>
 */
public class WriteApplicationSettingsRequest implements Serializable {
    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook
     * for campaigns in the application. To override these settings for a
     * specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom Lambda function settings for the campaign.
     * </p>
     */
    private CampaignHook campaignHook;

    /**
     * <p>
     * Specifies whether to enable application-related alarms in Amazon
     * CloudWatch.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;

    /**
     * <p>
     * The default sending limits for campaigns in the application. To override
     * these limits for a specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom limits for the campaign.
     * </p>
     */
    private CampaignLimits limits;

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a
     * specific time range when campaigns don't send messages to endpoints, if
     * all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the application
     * (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the application (or
     * a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from a campaign, even if quiet time is enabled.
     * </p>
     * <p>
     * To override the default quiet time settings for a specific campaign, use
     * the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define a custom quiet time for the campaign.
     * </p>
     */
    private QuietTime quietTime;

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook
     * for campaigns in the application. To override these settings for a
     * specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom Lambda function settings for the campaign.
     * </p>
     *
     * @return <p>
     *         The settings for the AWS Lambda function to use by default as a
     *         code hook for campaigns in the application. To override these
     *         settings for a specific campaign, use the <link
     *         linkend="apps-application-id-campaigns-campaign-id"
     *         >Campaign</link> resource to define custom Lambda function
     *         settings for the campaign.
     *         </p>
     */
    public CampaignHook getCampaignHook() {
        return campaignHook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook
     * for campaigns in the application. To override these settings for a
     * specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom Lambda function settings for the campaign.
     * </p>
     *
     * @param campaignHook <p>
     *            The settings for the AWS Lambda function to use by default as
     *            a code hook for campaigns in the application. To override
     *            these settings for a specific campaign, use the <link
     *            linkend="apps-application-id-campaigns-campaign-id"
     *            >Campaign</link> resource to define custom Lambda function
     *            settings for the campaign.
     *            </p>
     */
    public void setCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook
     * for campaigns in the application. To override these settings for a
     * specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom Lambda function settings for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignHook <p>
     *            The settings for the AWS Lambda function to use by default as
     *            a code hook for campaigns in the application. To override
     *            these settings for a specific campaign, use the <link
     *            linkend="apps-application-id-campaigns-campaign-id"
     *            >Campaign</link> resource to define custom Lambda function
     *            settings for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable application-related alarms in Amazon
     * CloudWatch.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable application-related alarms in Amazon
     *         CloudWatch.
     *         </p>
     */
    public Boolean isCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable application-related alarms in Amazon
     * CloudWatch.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable application-related alarms in Amazon
     *         CloudWatch.
     *         </p>
     */
    public Boolean getCloudWatchMetricsEnabled() {
        return cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable application-related alarms in Amazon
     * CloudWatch.
     * </p>
     *
     * @param cloudWatchMetricsEnabled <p>
     *            Specifies whether to enable application-related alarms in
     *            Amazon CloudWatch.
     *            </p>
     */
    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable application-related alarms in Amazon
     * CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchMetricsEnabled <p>
     *            Specifies whether to enable application-related alarms in
     *            Amazon CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withCloudWatchMetricsEnabled(
            Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        return this;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application. To override
     * these limits for a specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom limits for the campaign.
     * </p>
     *
     * @return <p>
     *         The default sending limits for campaigns in the application. To
     *         override these limits for a specific campaign, use the <link
     *         linkend
     *         ="apps-application-id-campaigns-campaign-id">Campaign</link>
     *         resource to define custom limits for the campaign.
     *         </p>
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application. To override
     * these limits for a specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom limits for the campaign.
     * </p>
     *
     * @param limits <p>
     *            The default sending limits for campaigns in the application.
     *            To override these limits for a specific campaign, use the
     *            <link
     *            linkend="apps-application-id-campaigns-campaign-id">Campaign
     *            </link> resource to define custom limits for the campaign.
     *            </p>
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application. To override
     * these limits for a specific campaign, use the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define custom limits for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            The default sending limits for campaigns in the application.
     *            To override these limits for a specific campaign, use the
     *            <link
     *            linkend="apps-application-id-campaigns-campaign-id">Campaign
     *            </link> resource to define custom limits for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withLimits(CampaignLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a
     * specific time range when campaigns don't send messages to endpoints, if
     * all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the application
     * (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the application (or
     * a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from a campaign, even if quiet time is enabled.
     * </p>
     * <p>
     * To override the default quiet time settings for a specific campaign, use
     * the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define a custom quiet time for the campaign.
     * </p>
     *
     * @return <p>
     *         The default quiet time for campaigns in the application. Quiet
     *         time is a specific time range when campaigns don't send messages
     *         to endpoints, if all the following conditions are met:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint is set
     *         to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is later than or
     *         equal to the time specified by the QuietTime.Start property for
     *         the application (or a campaign that has custom quiet time
     *         settings).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is earlier than or
     *         equal to the time specified by the QuietTime.End property for the
     *         application (or a campaign that has custom quiet time settings).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the endpoint will
     *         receive messages from a campaign, even if quiet time is enabled.
     *         </p>
     *         <p>
     *         To override the default quiet time settings for a specific
     *         campaign, use the <link
     *         linkend="apps-application-id-campaigns-campaign-id"
     *         >Campaign</link> resource to define a custom quiet time for the
     *         campaign.
     *         </p>
     */
    public QuietTime getQuietTime() {
        return quietTime;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a
     * specific time range when campaigns don't send messages to endpoints, if
     * all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the application
     * (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the application (or
     * a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from a campaign, even if quiet time is enabled.
     * </p>
     * <p>
     * To override the default quiet time settings for a specific campaign, use
     * the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define a custom quiet time for the campaign.
     * </p>
     *
     * @param quietTime <p>
     *            The default quiet time for campaigns in the application. Quiet
     *            time is a specific time range when campaigns don't send
     *            messages to endpoints, if all the following conditions are
     *            met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint is
     *            set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is later than or
     *            equal to the time specified by the QuietTime.Start property
     *            for the application (or a campaign that has custom quiet time
     *            settings).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is earlier than
     *            or equal to the time specified by the QuietTime.End property
     *            for the application (or a campaign that has custom quiet time
     *            settings).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the endpoint
     *            will receive messages from a campaign, even if quiet time is
     *            enabled.
     *            </p>
     *            <p>
     *            To override the default quiet time settings for a specific
     *            campaign, use the <link
     *            linkend="apps-application-id-campaigns-campaign-id"
     *            >Campaign</link> resource to define a custom quiet time for
     *            the campaign.
     *            </p>
     */
    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a
     * specific time range when campaigns don't send messages to endpoints, if
     * all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a
     * valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to
     * the time specified by the QuietTime.Start property for the application
     * (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to
     * the time specified by the QuietTime.End property for the application (or
     * a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive
     * messages from a campaign, even if quiet time is enabled.
     * </p>
     * <p>
     * To override the default quiet time settings for a specific campaign, use
     * the <link
     * linkend="apps-application-id-campaigns-campaign-id">Campaign</link>
     * resource to define a custom quiet time for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quietTime <p>
     *            The default quiet time for campaigns in the application. Quiet
     *            time is a specific time range when campaigns don't send
     *            messages to endpoints, if all the following conditions are
     *            met:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The EndpointDemographic.Timezone property of the endpoint is
     *            set to a valid value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is later than or
     *            equal to the time specified by the QuietTime.Start property
     *            for the application (or a campaign that has custom quiet time
     *            settings).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The current time in the endpoint's time zone is earlier than
     *            or equal to the time specified by the QuietTime.End property
     *            for the application (or a campaign that has custom quiet time
     *            settings).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of the preceding conditions isn't met, the endpoint
     *            will receive messages from a campaign, even if quiet time is
     *            enabled.
     *            </p>
     *            <p>
     *            To override the default quiet time settings for a specific
     *            campaign, use the <link
     *            linkend="apps-application-id-campaigns-campaign-id"
     *            >Campaign</link> resource to define a custom quiet time for
     *            the campaign.
     *            </p>
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
