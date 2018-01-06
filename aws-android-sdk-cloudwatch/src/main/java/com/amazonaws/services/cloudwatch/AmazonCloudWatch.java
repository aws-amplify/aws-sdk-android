/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing Amazon CloudWatch
 * <p>
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the
 * applications you run on AWS in real-time. You can use CloudWatch to collect
 * and track metrics, which are the variables you want to measure for your
 * resources and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically make changes to the
 * resources you are monitoring based on rules that you define. For example, you
 * can monitor the CPU usage and disk reads and writes of your Amazon Elastic
 * Compute Cloud (Amazon EC2) instances and then use this data to determine
 * whether you should launch additional instances to handle increased load. You
 * can also use this data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can
 * monitor your own custom metrics. With CloudWatch, you gain system-wide
 * visibility into resource utilization, application performance, and
 * operational health.
 * </p>
 **/
public interface AmazonCloudWatch {

    /**
     * Overrides the default endpoint for this client
     * ("https://monitoring.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "monitoring.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://monitoring.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     * @param endpoint The endpoint (ex: "monitoring.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://monitoring.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCloudWatch#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
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
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date range or
     * item type. If an alarm name is not specified, Amazon CloudWatch returns
     * histories for all of the owner's alarms.
     * </p>
     * <note> Amazon CloudWatch retains the history of an alarm for two weeks,
     * whether or not you delete the alarm. </note>
     * 
     * @param describeAlarmHistoryRequest
     * @return describeAlarmHistoryResult The response from the
     *         DescribeAlarmHistory service method, as returned by Amazon
     *         CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlarmHistoryResult describeAlarmHistory(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return describeAlarmsResult The response from the DescribeAlarms service
     *         method, as returned by Amazon CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return describeAlarmsForMetricResult The response from the
     *         DescribeAlarmsForMetric service method, as returned by Amazon
     *         CloudWatch.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlarmsForMetricResult describeAlarmsForMetric(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest <p>
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * The maximum number of data points that can be queried is 50,850, whereas
     * the maximum number of data points returned from a single
     * <code>GetMetricStatistics</code> request is 1,440. If you make a request
     * that generates more than 1,440 data points, Amazon CloudWatch returns an
     * error. In such a case, you can alter the request by narrowing the
     * specified time range or increasing the specified period. Alternatively,
     * you can make multiple requests across adjacent time ranges.
     * <code>GetMetricStatistics</code> does not return the data in
     * chronological order.
     * </p>
     * <p>
     * Amazon CloudWatch aggregates data points based on the length of the
     * <code>period</code> that you specify. For example, if you request
     * statistics with a one-minute granularity, Amazon CloudWatch aggregates
     * data points with time stamps that fall within the same one-minute period.
     * In such a case, the data points queried can greatly outnumber the data
     * points returned.
     * </p>
     * <p>
     * The following examples show various statistics allowed by the data point
     * query maximum of 50,850 when you call <code>GetMetricStatistics</code> on
     * Amazon EC2 instances with detailed (one-minute) monitoring enabled:
     * </p>
     * <ul>
     * <li>Statistics for up to 400 instances for a span of one hour</li>
     * <li>Statistics for up to 35 instances over a span of 24 hours</li>
     * <li>Statistics for up to 2 instances over a span of 2 weeks</li>
     * </ul>
     * <p>
     * For information about the namespace, metric names, and dimensions that
     * other Amazon Web Services products use to send metrics to CloudWatch, go
     * to <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Metrics, Namespaces, and Dimensions Reference</a> in
     * the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @param getMetricStatisticsRequest
     * @return getMetricStatisticsResult The response from the
     *         GetMetricStatistics service method, as returned by Amazon
     *         CloudWatch.
     * @throws InvalidParameterValueException
     * @throws MissingRequiredParameterException
     * @throws InvalidParameterCombinationException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMetricStatisticsResult getMetricStatistics(
            GetMetricStatisticsRequest getMetricStatisticsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <a>GetMetricStatistics</a> to obtain
     * statistical data for a given metric.
     * </p>
     * <note> Up to 500 results are returned for any one call. To retrieve
     * further results, use returned <code>NextToken</code> values with
     * subsequent <code>ListMetrics</code> operations. </note> <note> If you
     * create a metric with the <a>PutMetricData</a> action, allow up to fifteen
     * minutes for the metric to appear in calls to the <code>ListMetrics</code>
     * action. Statistics about the metric, however, are available sooner using
     * <a>GetMetricStatistics</a>. </note>
     * 
     * @param listMetricsRequest
     * @return listMetricsResult The response from the ListMetrics service
     *         method, as returned by Amazon CloudWatch.
     * @throws InternalServiceException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified Amazon
     * CloudWatch metric. Optionally, this operation can associate one or more
     * Amazon Simple Notification Service resources with the alarm.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set
     * to <code>INSUFFICIENT_DATA</code>. The alarm is evaluated and its
     * <code>StateValue</code> is set appropriately. Any actions associated with
     * the <code>StateValue</code> is then executed.
     * </p>
     * <note> When updating an existing alarm, its <code>StateValue</code> is
     * left unchanged. </note> <note> If you are using an AWS Identity and
     * Access Management (IAM) account to create or modify an alarm, you must
     * have the following Amazon EC2 permissions:
     * <ul>
     * <li><code>ec2:DescribeInstanceStatus</code> and
     * <code>ec2:DescribeInstances</code> for all alarms on Amazon EC2 instance
     * status metrics.</li>
     * <li><code>ec2:StopInstances</code> for alarms with stop actions.</li>
     * <li><code>ec2:TerminateInstances</code> for alarms with terminate
     * actions.</li>
     * <li><code>ec2:DescribeInstanceRecoveryAttribute</code>, and
     * <code>ec2:RecoverInstances</code> for alarms with recover actions.</li>
     * </ul>
     * <p>
     * If you have read/write permissions for Amazon CloudWatch but not for
     * Amazon EC2, you can still create an alarm but the stop or terminate
     * actions won't be performed on the Amazon EC2 instance. However, if you
     * are later granted permission to use the associated Amazon EC2 APIs, the
     * alarm actions you created earlier will be performed. For more information
     * about IAM permissions, see <a href=
     * "http://docs.aws.amazon.com//IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * >Permissions and Policies</a> in <i>Using IAM</i>.
     * </p>
     * <p>
     * If you are using an IAM role (e.g., an Amazon EC2 instance profile), you
     * cannot stop or terminate the instance using alarm actions. However, you
     * can still see the alarm state and perform any other actions such as
     * Amazon SNS notifications or Auto Scaling policies.
     * </p>
     * <p>
     * If you are using temporary security credentials granted using the AWS
     * Security Token Service (AWS STS), you cannot stop or terminate an Amazon
     * EC2 instance using alarm actions.
     * </p>
     * </note>
     * 
     * @param putMetricAlarmRequest
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch
     * associates the data points with the specified metric. If the specified
     * metric does not exist, Amazon CloudWatch creates the metric. When Amazon
     * CloudWatch creates a metric, it can take up to fifteen minutes for the
     * metric to appear in calls to the <a>ListMetrics</a> action.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 8 KB in size for
     * HTTP GET requests and is limited to 40 KB in size for HTTP POST requests.
     * </p>
     * <important>Although the <code>Value</code> parameter accepts numbers of
     * type <code>Double</code>, Amazon CloudWatch rejects values that are
     * either too small or too large. Values must be in the range of
     * 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (e.g., NaN, +Infinity, -Infinity) are not
     * supported. </important>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * 
     * @param putMetricDataRequest
     * @throws InvalidParameterValueException
     * @throws MissingRequiredParameterException
     * @throws InvalidParameterCombinationException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putMetricData(PutMetricDataRequest putMetricDataRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Temporarily sets the state of an alarm. When the updated
     * <code>StateValue</code> differs from the previous value, the action
     * configured for the appropriate state is invoked. For example, if your
     * alarm is configured to send an Amazon SNS message when an alarm is
     * triggered, temporarily changing the alarm's state to <b>ALARM</b> will
     * send an Amazon SNS message. This is not a permanent change. The next
     * periodic alarm check (in about a minute) will set the alarm to its actual
     * state. Because the alarm state change happens very quickly, it is
     * typically only visibile in the alarm's <b>History</b> tab in the Amazon
     * CloudWatch console or through <code>DescribeAlarmHistory</code>.
     * </p>
     * 
     * @param setAlarmStateRequest
     * @throws ResourceNotFoundException
     * @throws InvalidFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void setAlarmState(SetAlarmStateRequest setAlarmStateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <a>GetMetricStatistics</a> to obtain
     * statistical data for a given metric.
     * </p>
     * <note> Up to 500 results are returned for any one call. To retrieve
     * further results, use returned <code>NextToken</code> values with
     * subsequent <code>ListMetrics</code> operations. </note> <note> If you
     * create a metric with the <a>PutMetricData</a> action, allow up to fifteen
     * minutes for the metric to appear in calls to the <code>ListMetrics</code>
     * action. Statistics about the metric, however, are available sooner using
     * <a>GetMetricStatistics</a>. </note>
     * 
     * @return listMetricsResult The response from the ListMetrics service
     *         method, as returned by Amazon CloudWatch.
     * @throws InternalServiceException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMetricsResult listMetrics() throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @return describeAlarmsResult The response from the DescribeAlarms service
     *         method, as returned by Amazon CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlarmsResult describeAlarms() throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date range or
     * item type. If an alarm name is not specified, Amazon CloudWatch returns
     * histories for all of the owner's alarms.
     * </p>
     * <note> Amazon CloudWatch retains the history of an alarm for two weeks,
     * whether or not you delete the alarm. </note>
     * 
     * @return describeAlarmHistoryResult The response from the
     *         DescribeAlarmHistory service method, as returned by Amazon
     *         CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlarmHistoryResult describeAlarmHistory() throws AmazonClientException,
            AmazonServiceException;

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
