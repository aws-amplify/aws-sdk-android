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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves (queries) pre-aggregated data for a standard execution metric that
 * applies to a journey activity.
 * </p>
 */
public class GetJourneyExecutionActivityMetricsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     */
    private String journeyActivityId;

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     */
    private String journeyId;

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     */
    private String pageSize;

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
    public GetJourneyExecutionActivityMetricsRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the journey activity.
     *         </p>
     */
    public String getJourneyActivityId() {
        return journeyActivityId;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     *
     * @param journeyActivityId <p>
     *            The unique identifier for the journey activity.
     *            </p>
     */
    public void setJourneyActivityId(String journeyActivityId) {
        this.journeyActivityId = journeyActivityId;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyActivityId <p>
     *            The unique identifier for the journey activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionActivityMetricsRequest withJourneyActivityId(String journeyActivityId) {
        this.journeyActivityId = journeyActivityId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the journey.
     *         </p>
     */
    public String getJourneyId() {
        return journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     *
     * @param journeyId <p>
     *            The unique identifier for the journey.
     *            </p>
     */
    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyId <p>
     *            The unique identifier for the journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionActivityMetricsRequest withJourneyId(String journeyId) {
        this.journeyId = journeyId;
        return this;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @return <p>
     *         The string that specifies which page of results to return in a
     *         paginated response. This parameter is not supported for
     *         application, campaign, and journey metrics.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @param nextToken <p>
     *            The string that specifies which page of results to return in a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string that specifies which page of results to return in a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionActivityMetricsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response. This parameter is not supported for
     *         application, campaign, and journey metrics.
     *         </p>
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionActivityMetricsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
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
        if (getJourneyActivityId() != null)
            sb.append("JourneyActivityId: " + getJourneyActivityId() + ",");
        if (getJourneyId() != null)
            sb.append("JourneyId: " + getJourneyId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize());
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
                + ((getJourneyActivityId() == null) ? 0 : getJourneyActivityId().hashCode());
        hashCode = prime * hashCode + ((getJourneyId() == null) ? 0 : getJourneyId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyExecutionActivityMetricsRequest == false)
            return false;
        GetJourneyExecutionActivityMetricsRequest other = (GetJourneyExecutionActivityMetricsRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJourneyActivityId() == null ^ this.getJourneyActivityId() == null)
            return false;
        if (other.getJourneyActivityId() != null
                && other.getJourneyActivityId().equals(this.getJourneyActivityId()) == false)
            return false;
        if (other.getJourneyId() == null ^ this.getJourneyId() == null)
            return false;
        if (other.getJourneyId() != null
                && other.getJourneyId().equals(this.getJourneyId()) == false)
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
        return true;
    }
}
