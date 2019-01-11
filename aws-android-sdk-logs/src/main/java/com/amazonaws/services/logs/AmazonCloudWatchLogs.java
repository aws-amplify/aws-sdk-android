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

package com.amazonaws.services.logs;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.logs.model.*;

/**
 * Interface for accessing Amazon CloudWatch Logs
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log
 * files from Amazon EC2 instances, AWS CloudTrail, or other sources. You can
 * then retrieve the associated log data from CloudWatch Logs using the
 * CloudWatch console, CloudWatch Logs commands in the AWS CLI, CloudWatch Logs
 * API, or CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor logs from EC2 instances in real-time</b>: You can use CloudWatch
 * Logs to monitor applications and systems using log data. For example,
 * CloudWatch Logs can track the number of errors that occur in your application
 * logs and send you a notification whenever the rate of errors exceeds a
 * threshold that you specify. CloudWatch Logs uses your log data for
 * monitoring; so, no code changes are required. For example, you can monitor
 * application logs for specific literal terms (such as
 * "NullReferenceException") or count the number of occurrences of a literal
 * term at a particular position in log data (such as "404" status codes in an
 * Apache access log). When the term you are searching for is found, CloudWatch
 * Logs reports the data to a CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor AWS CloudTrail logged events</b>: You can create alarms in
 * CloudWatch and receive notifications of particular API activity as captured
 * by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive log data</b>: You can use CloudWatch Logs to store your log data
 * in highly durable storage. You can change the log retention setting so that
 * any log events older than this setting are automatically deleted. The
 * CloudWatch Logs agent makes it easy to quickly send both rotated and
 * non-rotated log data off of a host and into the log service. You can then
 * access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 **/
public interface AmazonCloudWatchLogs {

    /**
     * Overrides the default endpoint for this client
     * ("https://https://logs.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "https://logs.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://https://logs.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "https://logs.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://https://logs.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCloudWatchLogs#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Associates the specified AWS Key Management Service (AWS KMS) customer
     * master key (CMK) with the specified log group.
     * </p>
     * <p>
     * Associating an AWS KMS CMK with a log group overrides any existing
     * associations between the log group and a CMK. After a CMK is associated
     * with a log group, all newly ingested data for the log group is encrypted
     * using the CMK. This association is stored as long as the data encrypted
     * with the CMK is still within Amazon CloudWatch Logs. This enables Amazon
     * CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * <p>
     * If you attempt to associate a CMK with a log group but the CMK does not
     * exist or the CMK is disabled, you will receive an
     * <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param associateKmsKeyRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void associateKmsKey(AssociateKmsKeyRequest associateKmsKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels the specified export task.
     * </p>
     * <p>
     * The task must be in the <code>PENDING</code> or <code>RUNNING</code>
     * state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidOperationException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an export task, which allows you to efficiently export data from
     * a log group to an Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is
     * provided, this operation initiates an export task and responds with the
     * ID of the task. After the task has started, you can use
     * <a>DescribeExportTasks</a> to get the status of the export task. Each
     * account can only have one active (<code>RUNNING</code> or
     * <code>PENDING</code>) export task at a time. To cancel an export task,
     * use <a>CancelExportTask</a>.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to
     * the same S3 bucket. To separate out log data for each export task, you
     * can specify a prefix to be used as the Amazon S3 key prefix for all
     * exported objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return createExportTaskResult The response from the CreateExportTask
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateExportTaskResult createExportTask(CreateExportTaskRequest createExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a log group with the specified name.
     * </p>
     * <p>
     * You can create up to 5000 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names must be unique within a region for an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names consist of the following characters: a-z, A-Z, 0-9, '_'
     * (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you associate a AWS Key Management Service (AWS KMS) customer master
     * key (CMK) with the log group, ingested data is encrypted using the CMK.
     * This association is stored as long as the data encrypted with the CMK is
     * still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs
     * to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * If you attempt to associate a CMK with the log group but the CMK does not
     * exist or the CMK is disabled, you will receive an
     * <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param createLogGroupRequest
     * @throws InvalidParameterException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void createLogGroup(CreateLogGroupRequest createLogGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a log stream for the specified log group.
     * </p>
     * <p>
     * There is no limit on the number of log streams that you can create for a
     * log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names must be unique within the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ':' (colon) and '*' (asterisk) characters are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @throws InvalidParameterException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void createLogStream(CreateLogStreamRequest createLogStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified destination, and eventually disables all the
     * subscription filters that publish to it. This operation does not delete
     * the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteDestination(DeleteDestinationRequest deleteDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified log group and permanently deletes all the archived
     * log events associated with the log group.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified log stream and permanently deletes all the archived
     * log events associated with the log stream.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified metric filter.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a resource policy from this account. This revokes the access of
     * the identities in that policy to put log events to this account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified retention policy.
     * </p>
     * <p>
     * Log events do not expire if they belong to log groups without a retention
     * policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified subscription filter.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all your destinations. The results are ASCII-sorted by destination
     * name.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return describeDestinationsResult The response from the
     *         DescribeDestinations service method, as returned by Amazon
     *         CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDestinationsResult describeDestinations(
            DescribeDestinationsRequest describeDestinationsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the specified export tasks. You can list all your export tasks or
     * filter the results based on task ID or task status.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return describeExportTasksResult The response from the
     *         DescribeExportTasks service method, as returned by Amazon
     *         CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeExportTasksResult describeExportTasks(
            DescribeExportTasksRequest describeExportTasksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the specified log groups. You can list all your log groups or
     * filter the results by prefix. The results are ASCII-sorted by log group
     * name.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return describeLogGroupsResult The response from the DescribeLogGroups
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the log streams for the specified log group. You can list all the
     * log streams or filter the results by prefix. You can also control how the
     * results are ordered.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second, after which
     * transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @return describeLogStreamsResult The response from the DescribeLogStreams
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the specified metric filters. You can list all the metric filters
     * or filter the results by log name, prefix, metric name, or metric
     * namespace. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return describeMetricFiltersResult The response from the
     *         DescribeMetricFilters service method, as returned by Amazon
     *         CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeMetricFiltersResult describeMetricFilters(
            DescribeMetricFiltersRequest describeMetricFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resource policies in this account.
     * </p>
     * 
     * @param describeResourcePoliciesRequest
     * @return describeResourcePoliciesResult The response from the
     *         DescribeResourcePolicies service method, as returned by Amazon
     *         CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeResourcePoliciesResult describeResourcePolicies(
            DescribeResourcePoliciesRequest describeResourcePoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list
     * all the subscription filters or filter the results by prefix. The results
     * are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return describeSubscriptionFiltersResult The response from the
     *         DescribeSubscriptionFilters service method, as returned by Amazon
     *         CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeSubscriptionFiltersResult describeSubscriptionFilters(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the associated AWS Key Management Service (AWS KMS)
     * customer master key (CMK) from the specified log group.
     * </p>
     * <p>
     * After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch
     * Logs stops encrypting newly ingested data for the log group. All
     * previously ingested data remains encrypted, and AWS CloudWatch Logs
     * requires permissions for the CMK whenever the encrypted data is
     * requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * 
     * @param disassociateKmsKeyRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void disassociateKmsKey(DisassociateKmsKeyRequest disassociateKmsKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log
     * events or filter the results using a filter pattern, a time range, and
     * the name of the log stream.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1 MB
     * (up to 10,000 log events), or all the events found within the time range
     * that you specify. If the results include a token, then there are more log
     * events available, and you can get additional results by specifying the
     * token in a subsequent call.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return filterLogEventsResult The response from the FilterLogEvents
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all the log
     * events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a
     * response size of 1MB (up to 10,000 log events). You can get additional
     * log events by specifying one of the tokens in a subsequent call.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return getLogEventsResult The response from the GetLogEvents service
     *         method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags for the specified log group.
     * </p>
     * 
     * @param listTagsLogGroupRequest
     * @return listTagsLogGroupResult The response from the ListTagsLogGroup
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsLogGroupResult listTagsLogGroup(ListTagsLogGroupRequest listTagsLogGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a destination. A destination encapsulates a physical
     * resource (such as an Amazon Kinesis stream) and enables you to subscribe
     * to a real-time stream of log events for a different account, ingested
     * using <a>PutLogEvents</a>. Currently, the only supported physical
     * resource is a Kinesis stream belonging to the same account as the
     * destination.
     * </p>
     * <p>
     * Through an access policy, a destination controls what is written to its
     * Kinesis stream. By default, <code>PutDestination</code> does not set any
     * access policy with the destination, which means a cross-account user
     * cannot call <a>PutSubscriptionFilter</a> against this destination. To
     * enable this, the destination owner must call <a>PutDestinationPolicy</a>
     * after <code>PutDestination</code>.
     * </p>
     * 
     * @param putDestinationRequest
     * @return putDestinationResult The response from the PutDestination service
     *         method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates an access policy associated with an existing
     * destination. An access policy is an <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html"
     * >IAM policy document</a> that is used to authorize claims to register a
     * subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * You must include the sequence token obtained from the response of the
     * previous call. An upload in a newly created log stream does not require a
     * sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice
     * within a narrow time period using the same value for
     * <code>sequenceToken</code>, both calls may be successful, or one may be
     * rejected.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum batch size is 1,048,576 bytes, and this size is calculated as
     * the sum of all event messages in UTF-8, plus 26 bytes for each log event.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be more than 2 hours in the
     * future.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be older than 14 days or the
     * retention period of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The log events in the batch must be in chronological ordered by their
     * time stamp. The time stamp is the time the event occurred, expressed as
     * the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools
     * for PowerShell and the AWS SDK for .NET, the timestamp is specified in
     * .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single request cannot span more than 24 hours.
     * Otherwise, the operation fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a call to PutLogEvents returns "UnrecognizedClientException" the most
     * likely cause is an invalid AWS access key ID or secret key.
     * </p>
     * 
     * @param putLogEventsRequest
     * @return putLogEventsResult The response from the PutLogEvents service
     *         method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws InvalidSequenceTokenException
     * @throws DataAlreadyAcceptedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws UnrecognizedClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified
     * log group. Metric filters allow you to configure rules to extract metric
     * data from log events ingested through <a>PutLogEvents</a>.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log
     * group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws LimitExceededException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void putMetricFilter(PutMetricFilterRequest putMetricFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a resource policy allowing other AWS services to put
     * log events to this account, such as Amazon Route 53. An account can have
     * up to 10 resource policies per region.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows
     * you to configure the number of days for which to retain log events in the
     * specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the
     * specified log group. Subscription filters allow you to subscribe to a
     * real-time stream of log events ingested through <a>PutLogEvents</a> and
     * have them delivered to a specific destination. Currently, the supported
     * destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination that belongs to a different account, for
     * cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream that belongs to the same
     * account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group. If
     * you are updating an existing filter, you must specify the correct name in
     * <code>filterName</code>. Otherwise, the call fails because you cannot
     * associate a second filter with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OperationAbortedException
     * @throws LimitExceededException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void putSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates the specified tags for the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To remove
     * tags, use <a>UntagLogGroup</a>.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/log-group-tagging.html"
     * >Tag Log Groups in Amazon CloudWatch Logs</a> in the <i>Amazon CloudWatch
     * Logs User Guide</i>.
     * </p>
     * 
     * @param tagLogGroupRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void tagLogGroup(TagLogGroupRequest tagLogGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event
     * messages. You can use this operation to validate the correctness of a
     * metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return testMetricFilterResult The response from the TestMetricFilter
     *         service method, as returned by Amazon CloudWatch Logs.
     * @throws InvalidParameterException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To add
     * tags, use <a>UntagLogGroup</a>.
     * </p>
     * 
     * @param untagLogGroupRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch Logs indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void untagLogGroup(UntagLogGroupRequest untagLogGroupRequest) throws AmazonClientException,
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
