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
package com.amazonaws.services.compute-optimizer;

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

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.services.compute-optimizer.model.transform.*;

/**
 * Client for accessing AWS Compute Optimizer.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS resources, such as EC2 instances and Auto Scaling groups. It reports whether your resources are optimal, and generates optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also provides recent utilization metric data, as well as projected utilization metric data for the recommendations, which you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of your usage patterns can help you decide when to move or resize your running resources, and still meet your performance and capacity requirements. For more information about Compute Optimizer, including the required permissions to use the service, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.</p>
 */
public class AWSComputeOptimizerClient extends AmazonWebServiceClient implements AWSComputeOptimizer { 
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Compute Optimizer exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSComputeOptimizerClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSComputeOptimizer
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSComputeOptimizerClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSComputeOptimizerClient client = new AWSComputeOptimizerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSComputeOptimizerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials
     * and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSComputeOptimizerClient client = new AWSComputeOptimizerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSComputeOptimizer
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSComputeOptimizerClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSComputeOptimizerClient client = new AWSComputeOptimizerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSComputeOptimizerClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSComputeOptimizerClient client = new AWSComputeOptimizerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSComputeOptimizer
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSComputeOptimizerClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSComputeOptimizer
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSComputeOptimizerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComputeOptimizer using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSComputeOptimizerClient client = new AWSComputeOptimizerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSComputeOptimizer
     *                       (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSComputeOptimizerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingAuthenticationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OptInRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("compute-optimizer.us-east-1.amazonaws.com");
        this.endpointPrefix = "compute-optimizer";
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/compute-optimizer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/compute-optimizer/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>Describes recommendation export jobs created in the last seven days.</p> <p>Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code> action to view your export jobs.</p>
     * @param describeRecommendationExportJobsRequest 
     * @return describeRecommendationExportJobsResult The response from the DescribeRecommendationExportJobs service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRecommendationExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecommendationExportJobsRequest> request = null;
        Response<DescribeRecommendationExportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecommendationExportJobsRequestMarshaller().marshall(describeRecommendationExportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRecommendationExportJobsResult, JsonUnmarshallerContext> unmarshaller = new DescribeRecommendationExportJobsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRecommendationExportJobsResult> responseHandler = new JsonResponseHandler<DescribeRecommendationExportJobsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Exports optimization recommendations for Auto Scaling groups.</p> <p>Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting Recommendations</a> in the <i>Compute Optimizer User Guide</i>.</p> <p>You can have only one Auto Scaling group export job in progress per AWS Region.</p>
     * @param exportAutoScalingGroupRecommendationsRequest 
     * @return exportAutoScalingGroupRecommendationsResult The response from the ExportAutoScalingGroupRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportAutoScalingGroupRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportAutoScalingGroupRecommendationsRequest> request = null;
        Response<ExportAutoScalingGroupRecommendationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportAutoScalingGroupRecommendationsRequestMarshaller().marshall(exportAutoScalingGroupRecommendationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportAutoScalingGroupRecommendationsResult, JsonUnmarshallerContext> unmarshaller = new ExportAutoScalingGroupRecommendationsResultJsonUnmarshaller();
            JsonResponseHandler<ExportAutoScalingGroupRecommendationsResult> responseHandler = new JsonResponseHandler<ExportAutoScalingGroupRecommendationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Exports optimization recommendations for Amazon EC2 instances.</p> <p>Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting Recommendations</a> in the <i>Compute Optimizer User Guide</i>.</p> <p>You can have only one Amazon EC2 instance export job in progress per AWS Region.</p>
     * @param exportEC2InstanceRecommendationsRequest 
     * @return exportEC2InstanceRecommendationsResult The response from the ExportEC2InstanceRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportEC2InstanceRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportEC2InstanceRecommendationsRequest> request = null;
        Response<ExportEC2InstanceRecommendationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportEC2InstanceRecommendationsRequestMarshaller().marshall(exportEC2InstanceRecommendationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportEC2InstanceRecommendationsResult, JsonUnmarshallerContext> unmarshaller = new ExportEC2InstanceRecommendationsResultJsonUnmarshaller();
            JsonResponseHandler<ExportEC2InstanceRecommendationsResult> responseHandler = new JsonResponseHandler<ExportEC2InstanceRecommendationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns Auto Scaling group recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired, minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be of a fixed size. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
     * @param getAutoScalingGroupRecommendationsRequest 
     * @return getAutoScalingGroupRecommendationsResult The response from the GetAutoScalingGroupRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAutoScalingGroupRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutoScalingGroupRecommendationsRequest> request = null;
        Response<GetAutoScalingGroupRecommendationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutoScalingGroupRecommendationsRequestMarshaller().marshall(getAutoScalingGroupRecommendationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAutoScalingGroupRecommendationsResult, JsonUnmarshallerContext> unmarshaller = new GetAutoScalingGroupRecommendationsResultJsonUnmarshaller();
            JsonResponseHandler<GetAutoScalingGroupRecommendationsResult> responseHandler = new JsonResponseHandler<GetAutoScalingGroupRecommendationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns Amazon EC2 instance recommendations.</p> <p>AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.</p>
     * @param getEC2InstanceRecommendationsRequest 
     * @return getEC2InstanceRecommendationsResult The response from the GetEC2InstanceRecommendations service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEC2InstanceRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEC2InstanceRecommendationsRequest> request = null;
        Response<GetEC2InstanceRecommendationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEC2InstanceRecommendationsRequestMarshaller().marshall(getEC2InstanceRecommendationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEC2InstanceRecommendationsResult, JsonUnmarshallerContext> unmarshaller = new GetEC2InstanceRecommendationsResultJsonUnmarshaller();
            JsonResponseHandler<GetEC2InstanceRecommendationsResult> responseHandler = new JsonResponseHandler<GetEC2InstanceRecommendationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns the projected utilization metrics of Amazon EC2 instance recommendations.</p>
     * @param getEC2RecommendationProjectedMetricsRequest 
     * @return getEC2RecommendationProjectedMetricsResult The response from the GetEC2RecommendationProjectedMetrics service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws ResourceNotFoundException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEC2RecommendationProjectedMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEC2RecommendationProjectedMetricsRequest> request = null;
        Response<GetEC2RecommendationProjectedMetricsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEC2RecommendationProjectedMetricsRequestMarshaller().marshall(getEC2RecommendationProjectedMetricsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEC2RecommendationProjectedMetricsResult, JsonUnmarshallerContext> unmarshaller = new GetEC2RecommendationProjectedMetricsResultJsonUnmarshaller();
            JsonResponseHandler<GetEC2RecommendationProjectedMetricsResult> responseHandler = new JsonResponseHandler<GetEC2RecommendationProjectedMetricsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.</p> <p>If the account is the master account of an organization, this action also confirms the enrollment status of member accounts within the organization.</p>
     * @param getEnrollmentStatusRequest 
     * @return getEnrollmentStatusResult The response from the GetEnrollmentStatus service method, as returned by AWS Compute Optimizer.
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest getEnrollmentStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEnrollmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnrollmentStatusRequest> request = null;
        Response<GetEnrollmentStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnrollmentStatusRequestMarshaller().marshall(getEnrollmentStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEnrollmentStatusResult, JsonUnmarshallerContext> unmarshaller = new GetEnrollmentStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetEnrollmentStatusResult> responseHandler = new JsonResponseHandler<GetEnrollmentStatusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns the optimization findings for an account.</p> <p>For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned, over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not optimized, or optimized.</p>
     * @param getRecommendationSummariesRequest 
     * @return getRecommendationSummariesResult The response from the GetRecommendationSummaries service method, as returned by AWS Compute Optimizer.
     * @throws OptInRequiredException 
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest getRecommendationSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRecommendationSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommendationSummariesRequest> request = null;
        Response<GetRecommendationSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommendationSummariesRequestMarshaller().marshall(getRecommendationSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRecommendationSummariesResult, JsonUnmarshallerContext> unmarshaller = new GetRecommendationSummariesResultJsonUnmarshaller();
            JsonResponseHandler<GetRecommendationSummariesResult> responseHandler = new JsonResponseHandler<GetRecommendationSummariesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service.</p> <p>If the account is a master account of an organization, this action can also be used to enroll member accounts within the organization.</p>
     * @param updateEnrollmentStatusRequest 
     * @return updateEnrollmentStatusResult The response from the UpdateEnrollmentStatus service method, as returned by AWS Compute Optimizer.
     * @throws InternalServerException 
     * @throws ServiceUnavailableException 
     * @throws AccessDeniedException 
     * @throws InvalidParameterValueException 
     * @throws MissingAuthenticationTokenException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Compute Optimizer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEnrollmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnrollmentStatusRequest> request = null;
        Response<UpdateEnrollmentStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnrollmentStatusRequestMarshaller().marshall(updateEnrollmentStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEnrollmentStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdateEnrollmentStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEnrollmentStatusResult> responseHandler = new JsonResponseHandler<UpdateEnrollmentStatusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     *
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
