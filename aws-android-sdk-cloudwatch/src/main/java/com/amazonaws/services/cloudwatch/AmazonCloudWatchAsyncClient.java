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

package com.amazonaws.services.cloudwatch;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing Amazon CloudWatch asynchronously.
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
public class AmazonCloudWatchAsyncClient extends AmazonCloudWatchClient implements
        AmazonCloudWatchAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCloudWatchAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon CloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCloudWatchAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials. Default client
     * settings will be used, and a fixed size thread pool will be created for
     * executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials, executor service,
     * and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials provider. Default
     * client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials provider and
     * client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     */
    public AmazonCloudWatchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @return A Java Future object containing the response from the
     *         DeleteAlarms service method, as returned by Amazon CloudWatch.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteAlarmsAsync(final DeleteAlarmsRequest deleteAlarmsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAlarms(deleteAlarmsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @return A Java Future object containing the response from the
     *         DeleteAlarms service method, as returned by Amazon CloudWatch.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteAlarmsAsync(final DeleteAlarmsRequest deleteAlarmsRequest,
            final AsyncHandler<DeleteAlarmsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteAlarms(deleteAlarmsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteAlarmsRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            final DescribeAlarmHistoryRequest describeAlarmHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmHistoryResult>() {
            public DescribeAlarmHistoryResult call() throws Exception {
                return describeAlarmHistory(describeAlarmHistoryRequest);
            }
        });
    }

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
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            final DescribeAlarmHistoryRequest describeAlarmHistoryRequest,
            final AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmHistoryResult>() {
            public DescribeAlarmHistoryResult call() throws Exception {
                DescribeAlarmHistoryResult result = null;
                try {
                    result = describeAlarmHistory(describeAlarmHistoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAlarmHistoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAlarms service method, as returned by Amazon CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeAlarmsResult> describeAlarmsAsync(
            final DescribeAlarmsRequest describeAlarmsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsResult>() {
            public DescribeAlarmsResult call() throws Exception {
                return describeAlarms(describeAlarmsRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAlarms service method, as returned by Amazon CloudWatch.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeAlarmsResult> describeAlarmsAsync(
            final DescribeAlarmsRequest describeAlarmsRequest,
            final AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsResult>() {
            public DescribeAlarmsResult call() throws Exception {
                DescribeAlarmsResult result = null;
                try {
                    result = describeAlarms(describeAlarmsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAlarmsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            final DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsForMetricResult>() {
            public DescribeAlarmsForMetricResult call() throws Exception {
                return describeAlarmsForMetric(describeAlarmsForMetricRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return A Java Future object containing the response from the
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
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            final DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest,
            final AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsForMetricResult>() {
            public DescribeAlarmsForMetricResult call() throws Exception {
                DescribeAlarmsForMetricResult result = null;
                try {
                    result = describeAlarmsForMetric(describeAlarmsForMetricRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAlarmsForMetricRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest <p>
     *            </p>
     * @return A Java Future object containing the response from the
     *         DisableAlarmActions service method, as returned by Amazon
     *         CloudWatch.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disableAlarmActionsAsync(
            final DisableAlarmActionsRequest disableAlarmActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableAlarmActions(disableAlarmActionsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest <p>
     *            </p>
     * @return A Java Future object containing the response from the
     *         DisableAlarmActions service method, as returned by Amazon
     *         CloudWatch.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disableAlarmActionsAsync(
            final DisableAlarmActionsRequest disableAlarmActionsRequest,
            final AsyncHandler<DisableAlarmActionsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disableAlarmActions(disableAlarmActionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disableAlarmActionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @return A Java Future object containing the response from the
     *         EnableAlarmActions service method, as returned by Amazon
     *         CloudWatch.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> enableAlarmActionsAsync(
            final EnableAlarmActionsRequest enableAlarmActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableAlarmActions(enableAlarmActionsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @return A Java Future object containing the response from the
     *         EnableAlarmActions service method, as returned by Amazon
     *         CloudWatch.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> enableAlarmActionsAsync(
            final EnableAlarmActionsRequest enableAlarmActionsRequest,
            final AsyncHandler<EnableAlarmActionsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    enableAlarmActions(enableAlarmActionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(enableAlarmActionsRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
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
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            final GetMetricStatisticsRequest getMetricStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricStatisticsResult>() {
            public GetMetricStatisticsResult call() throws Exception {
                return getMetricStatistics(getMetricStatisticsRequest);
            }
        });
    }

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
     * @return A Java Future object containing the response from the
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
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            final GetMetricStatisticsRequest getMetricStatisticsRequest,
            final AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricStatisticsResult>() {
            public GetMetricStatisticsResult call() throws Exception {
                GetMetricStatisticsResult result = null;
                try {
                    result = getMetricStatistics(getMetricStatisticsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMetricStatisticsRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the ListMetrics
     *         service method, as returned by Amazon CloudWatch.
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
    public Future<ListMetricsResult> listMetricsAsync(final ListMetricsRequest listMetricsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMetricsResult>() {
            public ListMetricsResult call() throws Exception {
                return listMetrics(listMetricsRequest);
            }
        });
    }

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
     * @return A Java Future object containing the response from the ListMetrics
     *         service method, as returned by Amazon CloudWatch.
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
    public Future<ListMetricsResult> listMetricsAsync(final ListMetricsRequest listMetricsRequest,
            final AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMetricsResult>() {
            public ListMetricsResult call() throws Exception {
                ListMetricsResult result = null;
                try {
                    result = listMetrics(listMetricsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listMetricsRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         PutMetricAlarm service method, as returned by Amazon CloudWatch.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> putMetricAlarmAsync(final PutMetricAlarmRequest putMetricAlarmRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putMetricAlarm(putMetricAlarmRequest);
                return null;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         PutMetricAlarm service method, as returned by Amazon CloudWatch.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> putMetricAlarmAsync(final PutMetricAlarmRequest putMetricAlarmRequest,
            final AsyncHandler<PutMetricAlarmRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    putMetricAlarm(putMetricAlarmRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putMetricAlarmRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         PutMetricData service method, as returned by Amazon CloudWatch.
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
    public Future<Void> putMetricDataAsync(final PutMetricDataRequest putMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putMetricData(putMetricDataRequest);
                return null;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         PutMetricData service method, as returned by Amazon CloudWatch.
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
    public Future<Void> putMetricDataAsync(final PutMetricDataRequest putMetricDataRequest,
            final AsyncHandler<PutMetricDataRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    putMetricData(putMetricDataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putMetricDataRequest, result);
                return result;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         SetAlarmState service method, as returned by Amazon CloudWatch.
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
    public Future<Void> setAlarmStateAsync(final SetAlarmStateRequest setAlarmStateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setAlarmState(setAlarmStateRequest);
                return null;
            }
        });
    }

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
     * @return A Java Future object containing the response from the
     *         SetAlarmState service method, as returned by Amazon CloudWatch.
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
    public Future<Void> setAlarmStateAsync(final SetAlarmStateRequest setAlarmStateRequest,
            final AsyncHandler<SetAlarmStateRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setAlarmState(setAlarmStateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setAlarmStateRequest, result);
                return result;
            }
        });
    }

}
