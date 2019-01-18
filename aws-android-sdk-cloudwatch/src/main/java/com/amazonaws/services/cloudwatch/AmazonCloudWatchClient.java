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

import org.w3c.dom.*;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
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
 */
public class AmazonCloudWatchClient extends AmazonWebServiceClient implements AmazonCloudWatch {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon CloudWatch exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonCloudWatchClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *            how this client connects to AmazonCloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCloudWatchClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials provider and client
     * configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudWatch
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCloudWatch (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingRequiredParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("monitoring.us-east-1.amazonaws.com");
        this.endpointPrefix = "monitoring";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudwatch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudwatch/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
    public void deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlarmsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteAlarmsRequestMarshaller().marshall(deleteAlarmsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public DescribeAlarmHistoryResult describeAlarmHistory(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAlarmHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmHistoryRequest> request = null;
        Response<DescribeAlarmHistoryResult> response = null;
        try {
            request = new DescribeAlarmHistoryRequestMarshaller()
                    .marshall(describeAlarmHistoryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAlarmHistoryResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsRequest> request = null;
        Response<DescribeAlarmsResult> response = null;
        try {
            request = new DescribeAlarmsRequestMarshaller().marshall(describeAlarmsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAlarmsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAlarmsForMetricRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsForMetricRequest> request = null;
        Response<DescribeAlarmsForMetricResult> response = null;
        try {
            request = new DescribeAlarmsForMetricRequestMarshaller()
                    .marshall(describeAlarmsForMetricRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAlarmsForMetricResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAlarmActionsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DisableAlarmActionsRequestMarshaller()
                    .marshall(disableAlarmActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public void enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAlarmActionsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new EnableAlarmActionsRequestMarshaller().marshall(enableAlarmActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public GetMetricStatisticsResult getMetricStatistics(
            GetMetricStatisticsRequest getMetricStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMetricStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricStatisticsRequest> request = null;
        Response<GetMetricStatisticsResult> response = null;
        try {
            request = new GetMetricStatisticsRequestMarshaller()
                    .marshall(getMetricStatisticsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetMetricStatisticsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMetricsRequest> request = null;
        Response<ListMetricsResult> response = null;
        try {
            request = new ListMetricsRequestMarshaller().marshall(listMetricsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListMetricsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudWatch indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putMetricAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricAlarmRequest> request = null;
        Response<Void> response = null;
        try {
            request = new PutMetricAlarmRequestMarshaller().marshall(putMetricAlarmRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public void putMetricData(PutMetricDataRequest putMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricDataRequest> request = null;
        Response<Void> response = null;
        try {
            request = new PutMetricDataRequestMarshaller().marshall(putMetricDataRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public void setAlarmState(SetAlarmStateRequest setAlarmStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setAlarmStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetAlarmStateRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetAlarmStateRequestMarshaller().marshall(setAlarmStateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public ListMetricsResult listMetrics()
            throws AmazonServiceException, AmazonClientException {
        ListMetricsRequest listMetricsRequest = new ListMetricsRequest();
        return listMetrics(listMetricsRequest);
    }

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
    public DescribeAlarmsResult describeAlarms()
            throws AmazonServiceException, AmazonClientException {
        DescribeAlarmsRequest describeAlarmsRequest = new DescribeAlarmsRequest();
        return describeAlarms(describeAlarmsRequest);
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
    public DescribeAlarmHistoryResult describeAlarmHistory()
            throws AmazonServiceException, AmazonClientException {
        DescribeAlarmHistoryRequest describeAlarmHistoryRequest = new DescribeAlarmHistoryRequest();
        return describeAlarmHistory(describeAlarmHistoryRequest);
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
