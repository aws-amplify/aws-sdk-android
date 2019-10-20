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
 * Provides the results of a query that retrieved the data for a standard metric
 * that applies to a campaign, and provides information about that query.
 * </p>
 */
public class CampaignDateRangeKpiResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the campaign that the metric applies to.
     * </p>
     */
    private String campaignId;

    /**
     * <p>
     * The last date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, that the data was retrieved for. This value
     * describes the associated metric and consists of two or more terms, which
     * are comprised of lowercase alphanumeric characters, separated by a
     * hyphen. For a list of valid values, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     */
    private String kpiName;

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the value for the metric and metadata about that value.
     * </p>
     */
    private BaseKpiResult kpiResult;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null for the Campaign Metrics
     * resource. The Campaign Metrics resource returns all results in a single
     * page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The first date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the metric applies
     *         to.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the metric
     *            applies to.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the metric
     *            applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the metric applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the campaign that the metric applies
     *         to.
     *         </p>
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the metric applies to.
     * </p>
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign that the metric applies
     *            to.
     *            </p>
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the metric applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign that the metric applies
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     *
     * @return <p>
     *         The last date and time of the date range that was used to filter
     *         the query results, in extended ISO 8601 format. The date range is
     *         inclusive.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     *
     * @param endTime <p>
     *            The last date and time of the date range that was used to
     *            filter the query results, in extended ISO 8601 format. The
     *            date range is inclusive.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The last date and time of the date range that was used to
     *            filter the query results, in extended ISO 8601 format. The
     *            date range is inclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, that the data was retrieved for. This value
     * describes the associated metric and consists of two or more terms, which
     * are comprised of lowercase alphanumeric characters, separated by a
     * hyphen. For a list of valid values, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The name of the metric, also referred to as a <i>key performance
     *         indicator (KPI)</i>, that the data was retrieved for. This value
     *         describes the associated metric and consists of two or more
     *         terms, which are comprised of lowercase alphanumeric characters,
     *         separated by a hyphen. For a list of valid values, see the <a
     *         href=
     *         "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     *         >Amazon Pinpoint Developer Guide</a>.
     *         </p>
     */
    public String getKpiName() {
        return kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, that the data was retrieved for. This value
     * describes the associated metric and consists of two or more terms, which
     * are comprised of lowercase alphanumeric characters, separated by a
     * hyphen. For a list of valid values, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     *
     * @param kpiName <p>
     *            The name of the metric, also referred to as a <i>key
     *            performance indicator (KPI)</i>, that the data was retrieved
     *            for. This value describes the associated metric and consists
     *            of two or more terms, which are comprised of lowercase
     *            alphanumeric characters, separated by a hyphen. For a list of
     *            valid values, see the <a href=
     *            "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     *            >Amazon Pinpoint Developer Guide</a>.
     *            </p>
     */
    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance
     * indicator (KPI)</i>, that the data was retrieved for. This value
     * describes the associated metric and consists of two or more terms, which
     * are comprised of lowercase alphanumeric characters, separated by a
     * hyphen. For a list of valid values, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kpiName <p>
     *            The name of the metric, also referred to as a <i>key
     *            performance indicator (KPI)</i>, that the data was retrieved
     *            for. This value describes the associated metric and consists
     *            of two or more terms, which are comprised of lowercase
     *            alphanumeric characters, separated by a hyphen. For a list of
     *            valid values, see the <a href=
     *            "https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"
     *            >Amazon Pinpoint Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withKpiName(String kpiName) {
        this.kpiName = kpiName;
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the value for the metric and metadata about that value.
     * </p>
     *
     * @return <p>
     *         An array of objects that contains the results of the query. Each
     *         object contains the value for the metric and metadata about that
     *         value.
     *         </p>
     */
    public BaseKpiResult getKpiResult() {
        return kpiResult;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the value for the metric and metadata about that value.
     * </p>
     *
     * @param kpiResult <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the value for the metric and metadata
     *            about that value.
     *            </p>
     */
    public void setKpiResult(BaseKpiResult kpiResult) {
        this.kpiResult = kpiResult;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the value for the metric and metadata about that value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kpiResult <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the value for the metric and metadata
     *            about that value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withKpiResult(BaseKpiResult kpiResult) {
        this.kpiResult = kpiResult;
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null for the Campaign Metrics
     * resource. The Campaign Metrics resource returns all results in a single
     * page.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null for the
     *         Campaign Metrics resource. The Campaign Metrics resource returns
     *         all results in a single page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null for the Campaign Metrics
     * resource. The Campaign Metrics resource returns all results in a single
     * page.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null for the
     *            Campaign Metrics resource. The Campaign Metrics resource
     *            returns all results in a single page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null for the Campaign Metrics
     * resource. The Campaign Metrics resource returns all results in a single
     * page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null for the
     *            Campaign Metrics resource. The Campaign Metrics resource
     *            returns all results in a single page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     *
     * @return <p>
     *         The first date and time of the date range that was used to filter
     *         the query results, in extended ISO 8601 format. The date range is
     *         inclusive.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     *
     * @param startTime <p>
     *            The first date and time of the date range that was used to
     *            filter the query results, in extended ISO 8601 format. The
     *            date range is inclusive.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the
     * query results, in extended ISO 8601 format. The date range is inclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The first date and time of the date range that was used to
     *            filter the query results, in extended ISO 8601 format. The
     *            date range is inclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignDateRangeKpiResponse withStartTime(java.util.Date startTime) {
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
        if (getKpiResult() != null)
            sb.append("KpiResult: " + getKpiResult() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
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
        hashCode = prime * hashCode + ((getKpiResult() == null) ? 0 : getKpiResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignDateRangeKpiResponse == false)
            return false;
        CampaignDateRangeKpiResponse other = (CampaignDateRangeKpiResponse) obj;

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
        if (other.getKpiResult() == null ^ this.getKpiResult() == null)
            return false;
        if (other.getKpiResult() != null
                && other.getKpiResult().equals(this.getKpiResult()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
