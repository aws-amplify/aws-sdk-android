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
 * Retrieves the reservation coverage for your account. This enables you to see
 * how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon
 * Relational Database Service, or Amazon Redshift usage is covered by a
 * reservation. An organization's master account can see the coverage of the
 * associated member accounts. This supports dimensions, Cost Categories, and
 * nested expressions. For any time period, you can filter data about
 * reservation usage by the following dimensions:
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
 * DATABASE_ENGINE
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
 * TAG
 * </p>
 * </li>
 * <li>
 * <p>
 * TENANCY
 * </p>
 * </li>
 * </ul>
 * <p>
 * To determine valid values for a dimension, use the
 * <code>GetDimensionValues</code> operation.
 * </p>
 */
public class GetReservationCoverageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The start and end dates of the period that you want to retrieve data
     * about reservation coverage for. You can retrieve data for a maximum of 13
     * months: the last 12 months and the current month. The start date is
     * inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * You can group the data by the following attributes:
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
     * DATABASE_ENGINE
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
     * TENANCY
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GroupDefinition> groupBy;

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
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
     * DATABASE_ENGINE
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
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension. You can nest only one level deep. If
     * there are multiple values for a dimension, they are OR'd together.
     * </p>
     * <p>
     * If you don't provide a <code>SERVICE</code> filter, Cost Explorer
     * defaults to EC2.
     * </p>
     * <p>
     * Cost category is also supported.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * The measurement that you want your reservation coverage reported in.
     * </p>
     * <p>
     * Valid values are <code>Hour</code>, <code>Unit</code>, and
     * <code>Cost</code>. You can use multiple values in a request.
     * </p>
     */
    private java.util.List<String> metrics;

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
     * The start and end dates of the period that you want to retrieve data
     * about reservation coverage for. You can retrieve data for a maximum of 13
     * months: the last 12 months and the current month. The start date is
     * inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @return <p>
     *         The start and end dates of the period that you want to retrieve
     *         data about reservation coverage for. You can retrieve data for a
     *         maximum of 13 months: the last 12 months and the current month.
     *         The start date is inclusive, but the end date is exclusive. For
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
     * The start and end dates of the period that you want to retrieve data
     * about reservation coverage for. You can retrieve data for a maximum of 13
     * months: the last 12 months and the current month. The start date is
     * inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @param timePeriod <p>
     *            The start and end dates of the period that you want to
     *            retrieve data about reservation coverage for. You can retrieve
     *            data for a maximum of 13 months: the last 12 months and the
     *            current month. The start date is inclusive, but the end date
     *            is exclusive. For example, if <code>start</code> is
     *            <code>2017-01-01</code> and <code>end</code> is
     *            <code>2017-05-01</code>, then the cost and usage data is
     *            retrieved from <code>2017-01-01</code> up to and including
     *            <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates of the period that you want to retrieve data
     * about reservation coverage for. You can retrieve data for a maximum of 13
     * months: the last 12 months and the current month. The start date is
     * inclusive, but the end date is exclusive. For example, if
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
     *            The start and end dates of the period that you want to
     *            retrieve data about reservation coverage for. You can retrieve
     *            data for a maximum of 13 months: the last 12 months and the
     *            current month. The start date is inclusive, but the end date
     *            is exclusive. For example, if <code>start</code> is
     *            <code>2017-01-01</code> and <code>end</code> is
     *            <code>2017-05-01</code>, then the cost and usage data is
     *            retrieved from <code>2017-01-01</code> up to and including
     *            <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * You can group the data by the following attributes:
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
     * DATABASE_ENGINE
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
     * TENANCY
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         You can group the data by the following attributes:
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
     *         DATABASE_ENGINE
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
     *         TENANCY
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * You can group the data by the following attributes:
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
     * DATABASE_ENGINE
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
     * TENANCY
     * </p>
     * </li>
     * </ul>
     *
     * @param groupBy <p>
     *            You can group the data by the following attributes:
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
     *            DATABASE_ENGINE
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
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
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
     * You can group the data by the following attributes:
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
     * DATABASE_ENGINE
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
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            You can group the data by the following attributes:
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
     *            DATABASE_ENGINE
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
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withGroupBy(GroupDefinition... groupBy) {
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
     * You can group the data by the following attributes:
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
     * DATABASE_ENGINE
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
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            You can group the data by the following attributes:
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
     *            DATABASE_ENGINE
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
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @return <p>
     *         The granularity of the AWS cost data for the reservation. Valid
     *         values are <code>MONTHLY</code> and <code>DAILY</code>.
     *         </p>
     *         <p>
     *         If <code>GroupBy</code> is set, <code>Granularity</code> can't be
     *         set. If <code>Granularity</code> isn't set, the response object
     *         doesn't include <code>Granularity</code>, either
     *         <code>MONTHLY</code> or <code>DAILY</code>.
     *         </p>
     *         <p>
     *         The <code>GetReservationCoverage</code> operation supports only
     *         <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *         </p>
     * @see Granularity
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            The granularity of the AWS cost data for the reservation.
     *            Valid values are <code>MONTHLY</code> and <code>DAILY</code>.
     *            </p>
     *            <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationCoverage</code> operation supports
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
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
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
     *            The granularity of the AWS cost data for the reservation.
     *            Valid values are <code>MONTHLY</code> and <code>DAILY</code>.
     *            </p>
     *            <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationCoverage</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetReservationCoverageRequest withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            The granularity of the AWS cost data for the reservation.
     *            Valid values are <code>MONTHLY</code> and <code>DAILY</code>.
     *            </p>
     *            <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationCoverage</code> operation supports
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
     * The granularity of the AWS cost data for the reservation. Valid values
     * are <code>MONTHLY</code> and <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If
     * <code>Granularity</code> isn't set, the response object doesn't include
     * <code>Granularity</code>, either <code>MONTHLY</code> or
     * <code>DAILY</code>.
     * </p>
     * <p>
     * The <code>GetReservationCoverage</code> operation supports only
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
     *            The granularity of the AWS cost data for the reservation.
     *            Valid values are <code>MONTHLY</code> and <code>DAILY</code>.
     *            </p>
     *            <p>
     *            If <code>GroupBy</code> is set, <code>Granularity</code> can't
     *            be set. If <code>Granularity</code> isn't set, the response
     *            object doesn't include <code>Granularity</code>, either
     *            <code>MONTHLY</code> or <code>DAILY</code>.
     *            </p>
     *            <p>
     *            The <code>GetReservationCoverage</code> operation supports
     *            only <code>DAILY</code> and <code>MONTHLY</code>
     *            granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetReservationCoverageRequest withGranularity(Granularity granularity) {
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
     * DATABASE_ENGINE
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
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension. You can nest only one level deep. If
     * there are multiple values for a dimension, they are OR'd together.
     * </p>
     * <p>
     * If you don't provide a <code>SERVICE</code> filter, Cost Explorer
     * defaults to EC2.
     * </p>
     * <p>
     * Cost category is also supported.
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
     *         DATABASE_ENGINE
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
     *         TAG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetReservationCoverage</code> uses the same <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object as the other operations, but only
     *         <code>AND</code> is supported among each dimension. You can nest
     *         only one level deep. If there are multiple values for a
     *         dimension, they are OR'd together.
     *         </p>
     *         <p>
     *         If you don't provide a <code>SERVICE</code> filter, Cost Explorer
     *         defaults to EC2.
     *         </p>
     *         <p>
     *         Cost category is also supported.
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
     * DATABASE_ENGINE
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
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension. You can nest only one level deep. If
     * there are multiple values for a dimension, they are OR'd together.
     * </p>
     * <p>
     * If you don't provide a <code>SERVICE</code> filter, Cost Explorer
     * defaults to EC2.
     * </p>
     * <p>
     * Cost category is also supported.
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
     *            DATABASE_ENGINE
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
     *            TAG
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetReservationCoverage</code> uses the same <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension. You can
     *            nest only one level deep. If there are multiple values for a
     *            dimension, they are OR'd together.
     *            </p>
     *            <p>
     *            If you don't provide a <code>SERVICE</code> filter, Cost
     *            Explorer defaults to EC2.
     *            </p>
     *            <p>
     *            Cost category is also supported.
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
     * DATABASE_ENGINE
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
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension. You can nest only one level deep. If
     * there are multiple values for a dimension, they are OR'd together.
     * </p>
     * <p>
     * If you don't provide a <code>SERVICE</code> filter, Cost Explorer
     * defaults to EC2.
     * </p>
     * <p>
     * Cost category is also supported.
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
     *            DATABASE_ENGINE
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
     *            TAG
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetReservationCoverage</code> uses the same <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension. You can
     *            nest only one level deep. If there are multiple values for a
     *            dimension, they are OR'd together.
     *            </p>
     *            <p>
     *            If you don't provide a <code>SERVICE</code> filter, Cost
     *            Explorer defaults to EC2.
     *            </p>
     *            <p>
     *            Cost category is also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withFilter(Expression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The measurement that you want your reservation coverage reported in.
     * </p>
     * <p>
     * Valid values are <code>Hour</code>, <code>Unit</code>, and
     * <code>Cost</code>. You can use multiple values in a request.
     * </p>
     *
     * @return <p>
     *         The measurement that you want your reservation coverage reported
     *         in.
     *         </p>
     *         <p>
     *         Valid values are <code>Hour</code>, <code>Unit</code>, and
     *         <code>Cost</code>. You can use multiple values in a request.
     *         </p>
     */
    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The measurement that you want your reservation coverage reported in.
     * </p>
     * <p>
     * Valid values are <code>Hour</code>, <code>Unit</code>, and
     * <code>Cost</code>. You can use multiple values in a request.
     * </p>
     *
     * @param metrics <p>
     *            The measurement that you want your reservation coverage
     *            reported in.
     *            </p>
     *            <p>
     *            Valid values are <code>Hour</code>, <code>Unit</code>, and
     *            <code>Cost</code>. You can use multiple values in a request.
     *            </p>
     */
    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<String>(metrics);
    }

    /**
     * <p>
     * The measurement that you want your reservation coverage reported in.
     * </p>
     * <p>
     * Valid values are <code>Hour</code>, <code>Unit</code>, and
     * <code>Cost</code>. You can use multiple values in a request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The measurement that you want your reservation coverage
     *            reported in.
     *            </p>
     *            <p>
     *            Valid values are <code>Hour</code>, <code>Unit</code>, and
     *            <code>Cost</code>. You can use multiple values in a request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withMetrics(String... metrics) {
        if (getMetrics() == null) {
            this.metrics = new java.util.ArrayList<String>(metrics.length);
        }
        for (String value : metrics) {
            this.metrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The measurement that you want your reservation coverage reported in.
     * </p>
     * <p>
     * Valid values are <code>Hour</code>, <code>Unit</code>, and
     * <code>Cost</code>. You can use multiple values in a request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The measurement that you want your reservation coverage
     *            reported in.
     *            </p>
     *            <p>
     *            Valid values are <code>Hour</code>, <code>Unit</code>, and
     *            <code>Cost</code>. You can use multiple values in a request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
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
    public GetReservationCoverageRequest withNextPageToken(String nextPageToken) {
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
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
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
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
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

        if (obj instanceof GetReservationCoverageRequest == false)
            return false;
        GetReservationCoverageRequest other = (GetReservationCoverageRequest) obj;

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
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
