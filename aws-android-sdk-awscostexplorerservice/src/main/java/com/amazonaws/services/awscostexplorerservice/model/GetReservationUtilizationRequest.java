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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the reservation utilization for your account. Master accounts in an
 * organization have access to member accounts. You can filter data by
 * dimensions in a time period. You can use <code>GetDimensionValues</code> to
 * determine the possible dimension values. Currently, you can group only by
 * <code>SUBSCRIPTION_ID</code>.
 * </p>
 */
public class GetReservationUtilizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Sets the start and end dates for retrieving RI utilization. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is included.
     * </p>
     */
    private java.util.List<GroupDefinition> groupBy;

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     */
    private String granularity;

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationUtilization</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension, and nesting is supported up to only
     * one level deep. If there are multiple values for a dimension, they are
     * OR'd together.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Sets the start and end dates for retrieving RI utilization. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @return <p>
     *         Sets the start and end dates for retrieving RI utilization. The
     *         start date is inclusive, but the end date is exclusive. For
     *         example, if <code>start</code> is <code>2017-01-01</code> and
     *         <code>end</code> is <code>2017-05-01</code>, then the cost and
     *         usage data is retrieved from <code>2017-01-01</code> up to and
     *         including <code>2017-04-30</code> but not including
     *         <code>2017-05-01</code>.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving RI utilization. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @param timePeriod <p>
     *            Sets the start and end dates for retrieving RI utilization.
     *            The start date is inclusive, but the end date is exclusive.
     *            For example, if <code>start</code> is <code>2017-01-01</code>
     *            and <code>end</code> is <code>2017-05-01</code>, then the cost
     *            and usage data is retrieved from <code>2017-01-01</code> up to
     *            and including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving RI utilization. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            Sets the start and end dates for retrieving RI utilization.
     *            The start date is inclusive, but the end date is exclusive.
     *            For example, if <code>start</code> is <code>2017-01-01</code>
     *            and <code>end</code> is <code>2017-05-01</code>, then the cost
     *            and usage data is retrieved from <code>2017-01-01</code> up to
     *            and including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationUtilizationRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is included.
     * </p>
     *
     * @return <p>
     *         Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is
     *         included.
     *         </p>
     */
    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is included.
     * </p>
     *
     * @param groupBy <p>
     *            Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is
     *            included.
     *            </p>
     */
    public void setGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<GroupDefinition>(groupBy);
    }

    /**
     * <p>
     * Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is
     *            included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationUtilizationRequest withGroupBy(GroupDefinition... groupBy) {
        if (getGroupBy() == null) {
            this.groupBy = new java.util.ArrayList<GroupDefinition>(groupBy.length);
        }
        for (GroupDefinition value : groupBy) {
            this.groupBy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            Groups only by <code>SUBSCRIPTION_ID</code>. Metadata is
     *            included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationUtilizationRequest withGroupBy(
            java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @return <p>
     *         If <code>GroupBy</code> is set, <code>Granularity</code> can't be
     *         set. If <code>Granularity</code> isn't set, the response object
     *         doesn't include <code>Granularity</code>, either
     *         <code>MONTHLY</code> or <code>DAILY</code>. If both
     *         <code>GroupBy</code> and <code>Granularity</code> aren't set,
     *         <code>GetReservationUtilization</code> defaults to
     *         <code>DAILY</code>.
     *         </p>
     *         <p>
     *         The <code>GetReservationUtilization</code> operation supports
     *         only <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *         </p>
     * @see Granularity
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>. If both
     *            <code>GroupBy</code> and <code>Granularity</code> aren't set,
     *            <code>GetReservationUtilization</code> defaults to
     *            <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationUtilization</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>. If both
     *            <code>GroupBy</code> and <code>Granularity</code> aren't set,
     *            <code>GetReservationUtilization</code> defaults to
     *            <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationUtilization</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetReservationUtilizationRequest withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>. If both
     *            <code>GroupBy</code> and <code>Granularity</code> aren't set,
     *            <code>GetReservationUtilization</code> defaults to
     *            <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationUtilization</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
    }

    /**
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>. If both <code>GroupBy</code> and
     * <code>Granularity</code> aren't set,
     * <code>GetReservationUtilization</code> defaults to <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationUtilization</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>. If both
     *            <code>GroupBy</code> and <code>Granularity</code> aren't set,
     *            <code>GetReservationUtilization</code> defaults to
     *            <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationUtilization</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetReservationUtilizationRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationUtilization</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension, and nesting is supported up to only
     * one level deep. If there are multiple values for a dimension, they are
     * OR'd together.
     * </p>
     *
     * @return <p>
     *         Filters utilization data by dimensions. You can filter by the
     *         following dimensions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CACHE_ENGINE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEPLOYMENT_OPTION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPERATING_SYSTEM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SERVICE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCOPE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetReservationUtilization</code> uses the same <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object as the other operations, but only
     *         <code>AND</code> is supported among each dimension, and nesting
     *         is supported up to only one level deep. If there are multiple
     *         values for a dimension, they are OR'd together.
     *         </p>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationUtilization</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension, and nesting is supported up to only
     * one level deep. If there are multiple values for a dimension, they are
     * OR'd together.
     * </p>
     *
     * @param filter <p>
     *            Filters utilization data by dimensions. You can filter by the
     *            following dimensions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetReservationUtilization</code> uses the same <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension, and
     *            nesting is supported up to only one level deep. If there are
     *            multiple values for a dimension, they are OR'd together.
     *            </p>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following
     * dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationUtilization</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension, and nesting is supported up to only
     * one level deep. If there are multiple values for a dimension, they are
     * OR'd together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Filters utilization data by dimensions. You can filter by the
     *            following dimensions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetReservationUtilization</code> uses the same <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension, and
     *            nesting is supported up to only one level deep. If there are
     *            multiple values for a dimension, they are OR'd together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationUtilizationRequest withFilter(Expression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. AWS provides the
     *         token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results. AWS provides
     *            the token when the response from a previous call has more
     *            results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results. AWS provides
     *            the token when the response from a previous call has more
     *            results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationUtilizationRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getGroupBy() != null)
            sb.append("GroupBy: " + getGroupBy() + ",");
        if (getGranularity() != null)
            sb.append("Granularity: " + getGranularity() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode
                + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationUtilizationRequest == false)
            return false;
        GetReservationUtilizationRequest other = (GetReservationUtilizationRequest) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null
                && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
