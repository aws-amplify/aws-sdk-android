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
 * Retrieves cost and usage metrics with resources for your account. You can
 * specify which cost and usage-related metric, such as
 * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the
 * request to return. You can also filter and group your data by various
 * dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific
 * time range. For a complete list of valid dimensions, see the <a href=
 * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
 * >GetDimensionValues</a> operation. Master accounts in an organization in AWS
 * Organizations have access to all member accounts. This API is currently
 * available for the Amazon Elastic Compute Cloud – Compute service only.
 * </p>
 * <note>
 * <p>
 * This is an opt-in only feature. You can enable this feature from the Cost
 * Explorer Settings page. For information on how to access the Settings page,
 * see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html"
 * >Controlling Access for Cost Explorer</a> in the <i>AWS Billing and Cost
 * Management User Guide</i>.
 * </p>
 * </note>
 */
public class GetCostAndUsageWithResourcesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Sets the start and end dates for retrieving Amazon Web Services costs.
     * The range must be within the last 14 days (the start date cannot be
     * earlier than 14 days ago). The start date is inclusive, but the end date
     * is exclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code> and <code>end</code> is <code>2017-05-01</code>,
     * then the cost and usage data is retrieved from <code>2017-01-01</code> up
     * to and including <code>2017-04-30</code> but not including
     * <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     */
    private String granularity;

    /**
     * <p>
     * Filters Amazon Web Services costs by different dimensions. For example,
     * you can specify <code>SERVICE</code> and <code>LINKED_ACCOUNT</code> and
     * get the costs that are associated with that account's usage of that
     * service. You can nest <code>Expression</code> objects to define any
     * combination of dimension filters. For more information, see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageWithResources</code> operation requires that you
     * either group by or filter by a <code>ResourceId</code>.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * Which metrics are returned in the query. For more information about
     * blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>,
     * <code>NetAmortizedCost</code>, <code>NetUnblendedCost</code>,
     * <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service
     * aggregates all usage numbers without taking the units into account. For
     * example, if you aggregate <code>usageQuantity</code> across all of Amazon
     * EC2, the results aren't meaningful because Amazon EC2 compute hours and
     * data transfer are measured in different units (for example, hours vs.
     * GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for
     * <code>GetCostAndUsageWithResources</code> requests.
     * </p>
     */
    private java.util.List<String> metrics;

    /**
     * <p>
     * You can group Amazon Web Services costs using up to two different groups:
     * either dimensions, tag keys, or both.
     * </p>
     */
    private java.util.List<GroupDefinition> groupBy;

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
     * Sets the start and end dates for retrieving Amazon Web Services costs.
     * The range must be within the last 14 days (the start date cannot be
     * earlier than 14 days ago). The start date is inclusive, but the end date
     * is exclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code> and <code>end</code> is <code>2017-05-01</code>,
     * then the cost and usage data is retrieved from <code>2017-01-01</code> up
     * to and including <code>2017-04-30</code> but not including
     * <code>2017-05-01</code>.
     * </p>
     *
     * @return <p>
     *         Sets the start and end dates for retrieving Amazon Web Services
     *         costs. The range must be within the last 14 days (the start date
     *         cannot be earlier than 14 days ago). The start date is inclusive,
     *         but the end date is exclusive. For example, if <code>start</code>
     *         is <code>2017-01-01</code> and <code>end</code> is
     *         <code>2017-05-01</code>, then the cost and usage data is
     *         retrieved from <code>2017-01-01</code> up to and including
     *         <code>2017-04-30</code> but not including <code>2017-05-01</code>
     *         .
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving Amazon Web Services costs.
     * The range must be within the last 14 days (the start date cannot be
     * earlier than 14 days ago). The start date is inclusive, but the end date
     * is exclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code> and <code>end</code> is <code>2017-05-01</code>,
     * then the cost and usage data is retrieved from <code>2017-01-01</code> up
     * to and including <code>2017-04-30</code> but not including
     * <code>2017-05-01</code>.
     * </p>
     *
     * @param timePeriod <p>
     *            Sets the start and end dates for retrieving Amazon Web
     *            Services costs. The range must be within the last 14 days (the
     *            start date cannot be earlier than 14 days ago). The start date
     *            is inclusive, but the end date is exclusive. For example, if
     *            <code>start</code> is <code>2017-01-01</code> and
     *            <code>end</code> is <code>2017-05-01</code>, then the cost and
     *            usage data is retrieved from <code>2017-01-01</code> up to and
     *            including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * Sets the start and end dates for retrieving Amazon Web Services costs.
     * The range must be within the last 14 days (the start date cannot be
     * earlier than 14 days ago). The start date is inclusive, but the end date
     * is exclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code> and <code>end</code> is <code>2017-05-01</code>,
     * then the cost and usage data is retrieved from <code>2017-01-01</code> up
     * to and including <code>2017-04-30</code> but not including
     * <code>2017-05-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            Sets the start and end dates for retrieving Amazon Web
     *            Services costs. The range must be within the last 14 days (the
     *            start date cannot be earlier than 14 days ago). The start date
     *            is inclusive, but the end date is exclusive. For example, if
     *            <code>start</code> is <code>2017-01-01</code> and
     *            <code>end</code> is <code>2017-05-01</code>, then the cost and
     *            usage data is retrieved from <code>2017-01-01</code> up to and
     *            including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @return <p>
     *         Sets the AWS cost granularity to <code>MONTHLY</code>,
     *         <code>DAILY</code>, or <code>HOURLY</code>. If
     *         <code>Granularity</code> isn't set, the response object doesn't
     *         include the <code>Granularity</code>, <code>MONTHLY</code>,
     *         <code>DAILY</code>, or <code>HOURLY</code>.
     *         </p>
     * @see Granularity
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            Sets the AWS cost granularity to <code>MONTHLY</code>,
     *            <code>DAILY</code>, or <code>HOURLY</code>. If
     *            <code>Granularity</code> isn't set, the response object
     *            doesn't include the <code>Granularity</code>,
     *            <code>MONTHLY</code>, <code>DAILY</code>, or
     *            <code>HOURLY</code>.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            Sets the AWS cost granularity to <code>MONTHLY</code>,
     *            <code>DAILY</code>, or <code>HOURLY</code>. If
     *            <code>Granularity</code> isn't set, the response object
     *            doesn't include the <code>Granularity</code>,
     *            <code>MONTHLY</code>, <code>DAILY</code>, or
     *            <code>HOURLY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetCostAndUsageWithResourcesRequest withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            Sets the AWS cost granularity to <code>MONTHLY</code>,
     *            <code>DAILY</code>, or <code>HOURLY</code>. If
     *            <code>Granularity</code> isn't set, the response object
     *            doesn't include the <code>Granularity</code>,
     *            <code>MONTHLY</code>, <code>DAILY</code>, or
     *            <code>HOURLY</code>.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
    }

    /**
     * <p>
     * Sets the AWS cost granularity to <code>MONTHLY</code>, <code>DAILY</code>
     * , or <code>HOURLY</code>. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>,
     * <code>MONTHLY</code>, <code>DAILY</code>, or <code>HOURLY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            Sets the AWS cost granularity to <code>MONTHLY</code>,
     *            <code>DAILY</code>, or <code>HOURLY</code>. If
     *            <code>Granularity</code> isn't set, the response object
     *            doesn't include the <code>Granularity</code>,
     *            <code>MONTHLY</code>, <code>DAILY</code>, or
     *            <code>HOURLY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetCostAndUsageWithResourcesRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * Filters Amazon Web Services costs by different dimensions. For example,
     * you can specify <code>SERVICE</code> and <code>LINKED_ACCOUNT</code> and
     * get the costs that are associated with that account's usage of that
     * service. You can nest <code>Expression</code> objects to define any
     * combination of dimension filters. For more information, see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageWithResources</code> operation requires that you
     * either group by or filter by a <code>ResourceId</code>.
     * </p>
     *
     * @return <p>
     *         Filters Amazon Web Services costs by different dimensions. For
     *         example, you can specify <code>SERVICE</code> and
     *         <code>LINKED_ACCOUNT</code> and get the costs that are associated
     *         with that account's usage of that service. You can nest
     *         <code>Expression</code> objects to define any combination of
     *         dimension filters. For more information, see <a href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a>.
     *         </p>
     *         <p>
     *         The <code>GetCostAndUsageWithResources</code> operation requires
     *         that you either group by or filter by a <code>ResourceId</code>.
     *         </p>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters Amazon Web Services costs by different dimensions. For example,
     * you can specify <code>SERVICE</code> and <code>LINKED_ACCOUNT</code> and
     * get the costs that are associated with that account's usage of that
     * service. You can nest <code>Expression</code> objects to define any
     * combination of dimension filters. For more information, see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageWithResources</code> operation requires that you
     * either group by or filter by a <code>ResourceId</code>.
     * </p>
     *
     * @param filter <p>
     *            Filters Amazon Web Services costs by different dimensions. For
     *            example, you can specify <code>SERVICE</code> and
     *            <code>LINKED_ACCOUNT</code> and get the costs that are
     *            associated with that account's usage of that service. You can
     *            nest <code>Expression</code> objects to define any combination
     *            of dimension filters. For more information, see <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a>.
     *            </p>
     *            <p>
     *            The <code>GetCostAndUsageWithResources</code> operation
     *            requires that you either group by or filter by a
     *            <code>ResourceId</code>.
     *            </p>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters Amazon Web Services costs by different dimensions. For example,
     * you can specify <code>SERVICE</code> and <code>LINKED_ACCOUNT</code> and
     * get the costs that are associated with that account's usage of that
     * service. You can nest <code>Expression</code> objects to define any
     * combination of dimension filters. For more information, see <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a>.
     * </p>
     * <p>
     * The <code>GetCostAndUsageWithResources</code> operation requires that you
     * either group by or filter by a <code>ResourceId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Filters Amazon Web Services costs by different dimensions. For
     *            example, you can specify <code>SERVICE</code> and
     *            <code>LINKED_ACCOUNT</code> and get the costs that are
     *            associated with that account's usage of that service. You can
     *            nest <code>Expression</code> objects to define any combination
     *            of dimension filters. For more information, see <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a>.
     *            </p>
     *            <p>
     *            The <code>GetCostAndUsageWithResources</code> operation
     *            requires that you either group by or filter by a
     *            <code>ResourceId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withFilter(Expression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Which metrics are returned in the query. For more information about
     * blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>,
     * <code>NetAmortizedCost</code>, <code>NetUnblendedCost</code>,
     * <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service
     * aggregates all usage numbers without taking the units into account. For
     * example, if you aggregate <code>usageQuantity</code> across all of Amazon
     * EC2, the results aren't meaningful because Amazon EC2 compute hours and
     * data transfer are measured in different units (for example, hours vs.
     * GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for
     * <code>GetCostAndUsageWithResources</code> requests.
     * </p>
     *
     * @return <p>
     *         Which metrics are returned in the query. For more information
     *         about blended and unblended rates, see <a href=
     *         "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *         >Why does the "blended" annotation appear on some line items in
     *         my bill?</a>.
     *         </p>
     *         <p>
     *         Valid values are <code>AmortizedCost</code>,
     *         <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *         <code>NetUnblendedCost</code>, <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and <code>UsageQuantity</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you return the <code>UsageQuantity</code> metric, the service
     *         aggregates all usage numbers without taking the units into
     *         account. For example, if you aggregate <code>usageQuantity</code>
     *         across all of Amazon EC2, the results aren't meaningful because
     *         Amazon EC2 compute hours and data transfer are measured in
     *         different units (for example, hours vs. GB). To get more
     *         meaningful <code>UsageQuantity</code> metrics, filter by
     *         <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *         </p>
     *         </note>
     *         <p>
     *         <code>Metrics</code> is required for
     *         <code>GetCostAndUsageWithResources</code> requests.
     *         </p>
     */
    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * Which metrics are returned in the query. For more information about
     * blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>,
     * <code>NetAmortizedCost</code>, <code>NetUnblendedCost</code>,
     * <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service
     * aggregates all usage numbers without taking the units into account. For
     * example, if you aggregate <code>usageQuantity</code> across all of Amazon
     * EC2, the results aren't meaningful because Amazon EC2 compute hours and
     * data transfer are measured in different units (for example, hours vs.
     * GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for
     * <code>GetCostAndUsageWithResources</code> requests.
     * </p>
     *
     * @param metrics <p>
     *            Which metrics are returned in the query. For more information
     *            about blended and unblended rates, see <a href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values are <code>AmortizedCost</code>,
     *            <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *            <code>NetUnblendedCost</code>,
     *            <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>
     *            , and <code>UsageQuantity</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you return the <code>UsageQuantity</code> metric, the
     *            service aggregates all usage numbers without taking the units
     *            into account. For example, if you aggregate
     *            <code>usageQuantity</code> across all of Amazon EC2, the
     *            results aren't meaningful because Amazon EC2 compute hours and
     *            data transfer are measured in different units (for example,
     *            hours vs. GB). To get more meaningful
     *            <code>UsageQuantity</code> metrics, filter by
     *            <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *            </p>
     *            </note>
     *            <p>
     *            <code>Metrics</code> is required for
     *            <code>GetCostAndUsageWithResources</code> requests.
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
     * Which metrics are returned in the query. For more information about
     * blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>,
     * <code>NetAmortizedCost</code>, <code>NetUnblendedCost</code>,
     * <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service
     * aggregates all usage numbers without taking the units into account. For
     * example, if you aggregate <code>usageQuantity</code> across all of Amazon
     * EC2, the results aren't meaningful because Amazon EC2 compute hours and
     * data transfer are measured in different units (for example, hours vs.
     * GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for
     * <code>GetCostAndUsageWithResources</code> requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            Which metrics are returned in the query. For more information
     *            about blended and unblended rates, see <a href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values are <code>AmortizedCost</code>,
     *            <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *            <code>NetUnblendedCost</code>,
     *            <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>
     *            , and <code>UsageQuantity</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you return the <code>UsageQuantity</code> metric, the
     *            service aggregates all usage numbers without taking the units
     *            into account. For example, if you aggregate
     *            <code>usageQuantity</code> across all of Amazon EC2, the
     *            results aren't meaningful because Amazon EC2 compute hours and
     *            data transfer are measured in different units (for example,
     *            hours vs. GB). To get more meaningful
     *            <code>UsageQuantity</code> metrics, filter by
     *            <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *            </p>
     *            </note>
     *            <p>
     *            <code>Metrics</code> is required for
     *            <code>GetCostAndUsageWithResources</code> requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withMetrics(String... metrics) {
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
     * Which metrics are returned in the query. For more information about
     * blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values are <code>AmortizedCost</code>, <code>BlendedCost</code>,
     * <code>NetAmortizedCost</code>, <code>NetUnblendedCost</code>,
     * <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>, and
     * <code>UsageQuantity</code>.
     * </p>
     * <note>
     * <p>
     * If you return the <code>UsageQuantity</code> metric, the service
     * aggregates all usage numbers without taking the units into account. For
     * example, if you aggregate <code>usageQuantity</code> across all of Amazon
     * EC2, the results aren't meaningful because Amazon EC2 compute hours and
     * data transfer are measured in different units (for example, hours vs.
     * GB). To get more meaningful <code>UsageQuantity</code> metrics, filter by
     * <code>UsageType</code> or <code>UsageTypeGroups</code>.
     * </p>
     * </note>
     * <p>
     * <code>Metrics</code> is required for
     * <code>GetCostAndUsageWithResources</code> requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            Which metrics are returned in the query. For more information
     *            about blended and unblended rates, see <a href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values are <code>AmortizedCost</code>,
     *            <code>BlendedCost</code>, <code>NetAmortizedCost</code>,
     *            <code>NetUnblendedCost</code>,
     *            <code>NormalizedUsageAmount</code>, <code>UnblendedCost</code>
     *            , and <code>UsageQuantity</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you return the <code>UsageQuantity</code> metric, the
     *            service aggregates all usage numbers without taking the units
     *            into account. For example, if you aggregate
     *            <code>usageQuantity</code> across all of Amazon EC2, the
     *            results aren't meaningful because Amazon EC2 compute hours and
     *            data transfer are measured in different units (for example,
     *            hours vs. GB). To get more meaningful
     *            <code>UsageQuantity</code> metrics, filter by
     *            <code>UsageType</code> or <code>UsageTypeGroups</code>.
     *            </p>
     *            </note>
     *            <p>
     *            <code>Metrics</code> is required for
     *            <code>GetCostAndUsageWithResources</code> requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * You can group Amazon Web Services costs using up to two different groups:
     * either dimensions, tag keys, or both.
     * </p>
     *
     * @return <p>
     *         You can group Amazon Web Services costs using up to two different
     *         groups: either dimensions, tag keys, or both.
     *         </p>
     */
    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * You can group Amazon Web Services costs using up to two different groups:
     * either dimensions, tag keys, or both.
     * </p>
     *
     * @param groupBy <p>
     *            You can group Amazon Web Services costs using up to two
     *            different groups: either dimensions, tag keys, or both.
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
     * You can group Amazon Web Services costs using up to two different groups:
     * either dimensions, tag keys, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            You can group Amazon Web Services costs using up to two
     *            different groups: either dimensions, tag keys, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withGroupBy(GroupDefinition... groupBy) {
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
     * You can group Amazon Web Services costs using up to two different groups:
     * either dimensions, tag keys, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            You can group Amazon Web Services costs using up to two
     *            different groups: either dimensions, tag keys, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageWithResourcesRequest withGroupBy(
            java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
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
    public GetCostAndUsageWithResourcesRequest withNextPageToken(String nextPageToken) {
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
        if (getGranularity() != null)
            sb.append("Granularity: " + getGranularity() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getGroupBy() != null)
            sb.append("GroupBy: " + getGroupBy() + ",");
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
        hashCode = prime * hashCode
                + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
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

        if (obj instanceof GetCostAndUsageWithResourcesRequest == false)
            return false;
        GetCostAndUsageWithResourcesRequest other = (GetCostAndUsageWithResourcesRequest) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
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
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
