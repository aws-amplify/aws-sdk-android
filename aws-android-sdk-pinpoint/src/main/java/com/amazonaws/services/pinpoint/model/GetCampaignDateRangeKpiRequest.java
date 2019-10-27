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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves (queries) pre-aggregated data for a standard metric that applies to
 * a campaign.
 * </p>
 */
public class GetCampaignDateRangeKpiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     */
    private String campaignId;

    /**
     * <p>
     * The last date and time to retrieve data for, as part of an inclusive date
     * range that filters the query results. This value should be in extended
     * ISO 8601 format, for example: 2019-07-19T00:00:00Z for July 19, 2019 and
     * 2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, to retrieve data for. This value describes the
     * associated metric and consists of two or more terms, which are comprised
     * of lowercase alphanumeric characters, separated by a hyphen. Examples are
     * email-open-rate and successful-delivery-rate. For a list of valid values,
     * see the <a href="developerguide.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     */
    private String kpiName;

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     */
    private String pageSize;

    /**
     * <p>
     * The first date and time to retrieve data for, as part of an inclusive
     * date range that filters the query results. This value should be in
     * extended ISO 8601 format, for example: 2019-07-15T00:00:00Z for July 15,
     * 2019 and 2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the campaign.
     *         </p>
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign.
     *            </p>
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * <p>
     * The last date and time to retrieve data for, as part of an inclusive date
     * range that filters the query results. This value should be in extended
     * ISO 8601 format, for example: 2019-07-19T00:00:00Z for July 19, 2019 and
     * 2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     * </p>
     *
     * @return <p>
     *         The last date and time to retrieve data for, as part of an
     *         inclusive date range that filters the query results. This value
     *         should be in extended ISO 8601 format, for example:
     *         2019-07-19T00:00:00Z for July 19, 2019 and 2019-07-19T20:00:00Z
     *         for 8:00 PM July 19, 2019.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The last date and time to retrieve data for, as part of an inclusive date
     * range that filters the query results. This value should be in extended
     * ISO 8601 format, for example: 2019-07-19T00:00:00Z for July 19, 2019 and
     * 2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     * </p>
     *
     * @param endTime <p>
     *            The last date and time to retrieve data for, as part of an
     *            inclusive date range that filters the query results. This
     *            value should be in extended ISO 8601 format, for example:
     *            2019-07-19T00:00:00Z for July 19, 2019 and
     *            2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The last date and time to retrieve data for, as part of an inclusive date
     * range that filters the query results. This value should be in extended
     * ISO 8601 format, for example: 2019-07-19T00:00:00Z for July 19, 2019 and
     * 2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The last date and time to retrieve data for, as part of an
     *            inclusive date range that filters the query results. This
     *            value should be in extended ISO 8601 format, for example:
     *            2019-07-19T00:00:00Z for July 19, 2019 and
     *            2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, to retrieve data for. This value describes the
     * associated metric and consists of two or more terms, which are comprised
     * of lowercase alphanumeric characters, separated by a hyphen. Examples are
     * email-open-rate and successful-delivery-rate. For a list of valid values,
     * see the <a href="developerguide.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     *
     * @return <p>
     *         The name of the metric, also referred to as a <i>key performance
     *         indicator (KPI)</i>, to retrieve data for. This value describes
     *         the associated metric and consists of two or more terms, which
     *         are comprised of lowercase alphanumeric characters, separated by
     *         a hyphen. Examples are email-open-rate and
     *         successful-delivery-rate. For a list of valid values, see the <a
     *         href="developerguide.html">Amazon Pinpoint Developer Guide</a>.
     *         </p>
     */
    public String getKpiName() {
        return kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, to retrieve data for. This value describes the
     * associated metric and consists of two or more terms, which are comprised
     * of lowercase alphanumeric characters, separated by a hyphen. Examples are
     * email-open-rate and successful-delivery-rate. For a list of valid values,
     * see the <a href="developerguide.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     *
     * @param kpiName <p>
     *            The name of the metric, also referred to as a <i>key
     *            performance indicator (KPI)</i>, to retrieve data for. This
     *            value describes the associated metric and consists of two or
     *            more terms, which are comprised of lowercase alphanumeric
     *            characters, separated by a hyphen. Examples are
     *            email-open-rate and successful-delivery-rate. For a list of
     *            valid values, see the <a href="developerguide.html">Amazon
     *            Pinpoint Developer Guide</a>.
     *            </p>
     */
    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, to retrieve data for. This value describes the
     * associated metric and consists of two or more terms, which are comprised
     * of lowercase alphanumeric characters, separated by a hyphen. Examples are
     * email-open-rate and successful-delivery-rate. For a list of valid values,
     * see the <a href="developerguide.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kpiName <p>
     *            The name of the metric, also referred to as a <i>key
     *            performance indicator (KPI)</i>, to retrieve data for. This
     *            value describes the associated metric and consists of two or
     *            more terms, which are comprised of lowercase alphanumeric
     *            characters, separated by a hyphen. Examples are
     *            email-open-rate and successful-delivery-rate. For a list of
     *            valid values, see the <a href="developerguide.html">Amazon
     *            Pinpoint Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withKpiName(String kpiName) {
        this.kpiName = kpiName;
        return this;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     *
     * @return <p>
     *         The NextToken string that specifies which page of results to
     *         return in a paginated response. This parameter is currently not
     *         supported by the Application Metrics and Campaign Metrics
     *         resources.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     *
     * @param nextToken <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response. This parameter is currently
     *            not supported by the Application Metrics and Campaign Metrics
     *            resources.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response. This parameter is currently
     *            not supported by the Application Metrics and Campaign Metrics
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response. This parameter is currently not supported by
     *         the Application Metrics and Campaign Metrics resources.
     *         </p>
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is currently not supported
     *            by the Application Metrics and Campaign Metrics resources.
     *            </p>
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is currently not supported
     *            by the Application Metrics and Campaign Metrics resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The first date and time to retrieve data for, as part of an inclusive
     * date range that filters the query results. This value should be in
     * extended ISO 8601 format, for example: 2019-07-15T00:00:00Z for July 15,
     * 2019 and 2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     * </p>
     *
     * @return <p>
     *         The first date and time to retrieve data for, as part of an
     *         inclusive date range that filters the query results. This value
     *         should be in extended ISO 8601 format, for example:
     *         2019-07-15T00:00:00Z for July 15, 2019 and 2019-07-15T16:00:00Z
     *         for 4:00 PM July 15, 2019.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The first date and time to retrieve data for, as part of an inclusive
     * date range that filters the query results. This value should be in
     * extended ISO 8601 format, for example: 2019-07-15T00:00:00Z for July 15,
     * 2019 and 2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     * </p>
     *
     * @param startTime <p>
     *            The first date and time to retrieve data for, as part of an
     *            inclusive date range that filters the query results. This
     *            value should be in extended ISO 8601 format, for example:
     *            2019-07-15T00:00:00Z for July 15, 2019 and
     *            2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The first date and time to retrieve data for, as part of an inclusive
     * date range that filters the query results. This value should be in
     * extended ISO 8601 format, for example: 2019-07-15T00:00:00Z for July 15,
     * 2019 and 2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The first date and time to retrieve data for, as part of an
     *            inclusive date range that filters the query results. This
     *            value should be in extended ISO 8601 format, for example:
     *            2019-07-15T00:00:00Z for July 15, 2019 and
     *            2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignDateRangeKpiRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getKpiName() != null)
            sb.append("KpiName: " + getKpiName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
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
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getKpiName() == null) ? 0 : getKpiName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignDateRangeKpiRequest == false)
            return false;
        GetCampaignDateRangeKpiRequest other = (GetCampaignDateRangeKpiRequest) obj;

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
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getKpiName() == null ^ this.getKpiName() == null)
            return false;
        if (other.getKpiName() != null && other.getKpiName().equals(this.getKpiName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
