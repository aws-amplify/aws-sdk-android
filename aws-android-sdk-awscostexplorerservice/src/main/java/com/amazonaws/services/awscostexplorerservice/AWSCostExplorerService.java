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

package com.amazonaws.services.awscostexplorerservice;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awscostexplorerservice.model.*;

/**
 * Interface for accessing AWS Cost Explorer Service
 * <p>
 * The Cost Explorer API enables you to programmatically query your cost and
 * usage data. You can query for aggregated data such as total monthly costs or
 * total daily usage. You can also query for granular data, such as the number
 * of daily write operations for Amazon DynamoDB database tables in your
 * production environment.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Cost Explorer API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>https://ce.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the Cost Explorer API, see <a
 * href="http://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management
 * Pricing</a>.
 * </p>
 **/
public interface AWSCostExplorerService {

    /**
     * Overrides the default endpoint for this client
     * ("https://ce.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ce.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ce.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "ce.us-east-1.amazonaws.com") or a full
     *            URL, including the protocol (ex:
     *            "https://ce.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCostExplorerService#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return createCostCategoryDefinitionResult The response from the
     *         CreateCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ServiceQuotaExceededException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateCostCategoryDefinitionResult createCostCategoryDefinition(
            CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no
     * longer be categorized with this Cost Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @return deleteCostCategoryDefinitionResult The response from the
     *         DeleteCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteCostCategoryDefinitionResult deleteCostCategoryDefinition(
            DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the name, ARN, rules, definition, and effective dates of a Cost
     * Category that's defined in the account.
     * </p>
     * <p>
     * You have the option to use <code>EffectiveOn</code> to return a Cost
     * Category that is active on a specific date. If there is no
     * <code>EffectiveOn</code> specified, you’ll see a Cost Category that is
     * effective on the current date. If Cost Category is still effective,
     * <code>EffectiveEnd</code> is omitted in the response.
     * </p>
     * 
     * @param describeCostCategoryDefinitionRequest
     * @return describeCostCategoryDefinitionResult The response from the
     *         DescribeCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeCostCategoryDefinitionResult describeCostCategoryDefinition(
            DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which
     * cost and usage-related metric, such as <code>BlendedCosts</code> or
     * <code>UsageQuantity</code>, that you want the request to return. You can
     * also filter and group your data by various dimensions, such as
     * <code>SERVICE</code> or <code>AZ</code>, in a specific time range. For a
     * complete list of valid dimensions, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in
     * AWS Organizations have access to all member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @return getCostAndUsageResult The response from the GetCostAndUsage
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest getCostAndUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves cost and usage metrics with resources for your account. You can
     * specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want
     * the request to return. You can also filter and group your data by various
     * dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in
     * AWS Organizations have access to all member accounts. This API is
     * currently available for the Amazon Elastic Compute Cloud – Compute
     * service only.
     * </p>
     * <note>
     * <p>
     * This is an opt-in only feature. You can enable this feature from the Cost
     * Explorer Settings page. For information on how to access the Settings
     * page, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html"
     * >Controlling Access for Cost Explorer</a> in the <i>AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getCostAndUsageWithResourcesRequest
     * @return getCostAndUsageWithResourcesResult The response from the
     *         GetCostAndUsageWithResources service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws DataUnavailableException
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCostAndUsageWithResourcesResult getCostAndUsageWithResources(
            GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you
     * will spend over the forecast time period that you select, based on your
     * past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @return getCostForecastResult The response from the GetCostForecast
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCostForecastResult getCostForecast(GetCostForecastRequest getCostForecastRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all available filter values for a specified filter over a
     * period of time. You can search the dimension values for an arbitrary
     * string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return getDimensionValuesResult The response from the GetDimensionValues
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetDimensionValuesResult getDimensionValues(GetDimensionValuesRequest getDimensionValuesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the reservation coverage for your account. This enables you to
     * see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache,
     * Amazon Relational Database Service, or Amazon Redshift usage is covered
     * by a reservation. An organization's master account can see the coverage
     * of the associated member accounts. This supports dimensions, Cost
     * Categories, and nested expressions. For any time period, you can filter
     * data about reservation usage by the following dimensions:
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
     * 
     * @param getReservationCoverageRequest <p>
     *            You can use the following request parameters to query for how
     *            much of your instance usage a reservation covered.
     *            </p>
     * @return getReservationCoverageResult The response from the
     *         GetReservationCoverage service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetReservationCoverageResult getReservationCoverage(
            GetReservationCoverageRequest getReservationCoverageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets recommendations for which reservations to purchase. These
     * recommendations could help you reduce your costs. Reservations provide a
     * discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * AWS generates your recommendations by identifying your On-Demand usage
     * during a specific time period and collecting your usage into categories
     * that are eligible for a reservation. After AWS has these categories, it
     * simulates every combination of reservations in each category of usage to
     * identify the best number of each type of RI to purchase to maximize your
     * estimated savings.
     * </p>
     * <p>
     * For example, AWS automatically aggregates your Amazon EC2 Linux, shared
     * tenancy, and c4 family usage in the US West (Oregon) Region and
     * recommends that you buy size-flexible regional reservations to apply to
     * the c4 family usage. AWS recommends the smallest size instance in an
     * instance family. This makes it easier to purchase a size-flexible RI. AWS
     * also shows the equal number of normalized units so that you can purchase
     * any instance size that you want. For this example, your RI recommendation
     * would be for <code>c4.large</code> because that is the smallest size
     * instance in the c4 instance family.
     * </p>
     * 
     * @param getReservationPurchaseRecommendationRequest
     * @return getReservationPurchaseRecommendationResult The response from the
     *         GetReservationPurchaseRecommendation service method, as returned
     *         by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetReservationPurchaseRecommendationResult getReservationPurchaseRecommendation(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the reservation utilization for your account. Master accounts
     * in an organization have access to member accounts. You can filter data by
     * dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only
     * by <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @return getReservationUtilizationResult The response from the
     *         GetReservationUtilization service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetReservationUtilizationResult getReservationUtilization(
            GetReservationUtilizationRequest getReservationUtilizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates recommendations that helps you save cost by identifying idle and
     * underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances,
     * along with providing savings detail and metrics. For details on
     * calculation and function, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-what-is.html"
     * >Optimizing Your Cost with Rightsizing Recommendations</a>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @return getRightsizingRecommendationResult The response from the
     *         GetRightsizingRecommendation service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetRightsizingRecommendationResult getRightsizingRecommendation(
            GetRightsizingRecommendationRequest getRightsizingRecommendationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the Savings Plans covered for your account. This enables you to
     * see how much of your cost is covered by a Savings Plan. An organization’s
     * master account can see the coverage of the associated member accounts.
     * This supports dimensions, Cost Categories, and nested expressions. For
     * any time period, you can filter data for Savings Plans usage with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the
     * <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getSavingsPlansCoverageRequest
     * @return getSavingsPlansCoverageResult The response from the
     *         GetSavingsPlansCoverage service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSavingsPlansCoverageResult getSavingsPlansCoverage(
            GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves your request parameters, Savings Plan Recommendations Summary
     * and Details.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @return getSavingsPlansPurchaseRecommendationResult The response from the
     *         GetSavingsPlansPurchaseRecommendation service method, as returned
     *         by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSavingsPlansPurchaseRecommendationResult getSavingsPlansPurchaseRecommendation(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date
     * ranges with daily or monthly granularity. Master accounts in an
     * organization have access to member accounts. You can use
     * <code>GetDimensionValues</code> in <code>SAVINGS_PLANS</code> to
     * determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You cannot group by any dimension values for
     * <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @return getSavingsPlansUtilizationResult The response from the
     *         GetSavingsPlansUtilization service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSavingsPlansUtilizationResult getSavingsPlansUtilization(
            GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves attribute data along with aggregate utilization and savings
     * data for a given time period. This doesn't support granular or grouped
     * data (daily/monthly) in response. You can't retrieve data by dates in a
     * single response similar to <code>GetSavingsPlanUtilization</code>, but
     * you have the option to make multiple calls to
     * <code>GetSavingsPlanUtilizationDetails</code> by providing individual
     * dates. You can use <code>GetDimensionValues</code> in
     * <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * <code>GetSavingsPlanUtilizationDetails</code> internally groups data by
     * <code>SavingsPlansArn</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationDetailsRequest
     * @return getSavingsPlansUtilizationDetailsResult The response from the
     *         GetSavingsPlansUtilizationDetails service method, as returned by
     *         AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSavingsPlansUtilizationDetailsResult getSavingsPlansUtilizationDetails(
            GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Queries for available tag keys and tag values for a specified period. You
     * can search the tag values for an arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you
     * will use over the forecast time period that you select, based on your
     * past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @return getUsageForecastResult The response from the GetUsageForecast
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws UnresolvableUsageUnitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUsageForecastResult getUsageForecast(GetUsageForecastRequest getUsageForecastRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the name, ARN, <code>NumberOfRules</code> and effective dates of
     * all Cost Categories defined in the account. You have the option to use
     * <code>EffectiveOn</code> to return a list of Cost Categories that were
     * active on a specific date. If there is no <code>EffectiveOn</code>
     * specified, you’ll see Cost Categories that are effective on the current
     * date. If Cost Category is still effective, <code>EffectiveEnd</code> is
     * omitted in the response. <code>ListCostCategoryDefinitions</code>
     * supports pagination. The request can have a <code>MaxResults</code> range
     * up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @return listCostCategoryDefinitionsResult The response from the
     *         ListCostCategoryDefinitions service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListCostCategoryDefinitionsResult listCostCategoryDefinitions(
            ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category
     * rules will be used to categorize the current month’s expenses and future
     * expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @return updateCostCategoryDefinitionResult The response from the
     *         UpdateCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateCostCategoryDefinitionResult updateCostCategoryDefinition(
            UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
