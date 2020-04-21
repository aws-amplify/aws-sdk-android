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

package com.amazonaws.services.amazonelasticmapreduce;

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

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.services.amazonelasticmapreduce.model.transform.*;

/**
 * Client for accessing Amazon Elastic MapReduce. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon EMR is a web service that makes it easy to process large amounts of
 * data efficiently. Amazon EMR uses Hadoop processing combined with several AWS
 * products to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehousing.
 * </p>
 */
public class AmazonElasticMapReduceClient extends AmazonWebServiceClient implements
        AmazonElasticMapReduce {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Elastic MapReduce
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AmazonElasticMapReduceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to AmazonElasticMapReduce (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElasticMapReduceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonElasticMapReduceClient client = new AmazonElasticMapReduceClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials and
     * client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonElasticMapReduceClient client = new AmazonElasticMapReduceClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticMapReduce (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
     * provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonElasticMapReduceClient client = new AmazonElasticMapReduceClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonElasticMapReduceClient client = new AmazonElasticMapReduceClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticMapReduce (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticMapReduce (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonElasticMapReduceClient client = new AmazonElasticMapReduceClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticMapReduce (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticmapreduce.us-east-1.amazonaws.com");
        this.endpointPrefix = "elasticmapreduce";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonelasticmapreduce/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonelasticmapreduce/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds an instance fleet to a running cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x.
     * </p>
     * </note>
     * 
     * @param addInstanceFleetRequest
     * @return addInstanceFleetResult The response from the AddInstanceFleet
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AddInstanceFleetResult addInstanceFleet(AddInstanceFleetRequest addInstanceFleetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addInstanceFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddInstanceFleetRequest> request = null;
        Response<AddInstanceFleetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddInstanceFleetRequestMarshaller().marshall(addInstanceFleetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddInstanceFleetResult, JsonUnmarshallerContext> unmarshaller = new AddInstanceFleetResultJsonUnmarshaller();
            JsonResponseHandler<AddInstanceFleetResult> responseHandler = new JsonResponseHandler<AddInstanceFleetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest <p>
     *            Input to an AddInstanceGroups call.
     *            </p>
     * @return addInstanceGroupsResult The response from the AddInstanceGroups
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AddInstanceGroupsResult addInstanceGroups(
            AddInstanceGroupsRequest addInstanceGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddInstanceGroupsRequest> request = null;
        Response<AddInstanceGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddInstanceGroupsRequestMarshaller()
                        .marshall(addInstanceGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddInstanceGroupsResult, JsonUnmarshallerContext> unmarshaller = new AddInstanceGroupsResultJsonUnmarshaller();
            JsonResponseHandler<AddInstanceGroupsResult> responseHandler = new JsonResponseHandler<AddInstanceGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256
     * steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using SSH
     * to connect to the master node and submitting queries directly to the
     * software running on the master node, such as Hive and Hadoop. For more
     * information on how to do this, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master
     * node of the cluster or in Amazon S3. Each step is performed by the main
     * function of the main class of the JAR file. The main class can be
     * specified either in the manifest of the JAR or by using the MainFunction
     * parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be
     * considered complete, the main function must exit with a zero exit code
     * and all Hadoop jobs started while the step was running must have
     * completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a cluster that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest <p>
     *            The input argument to the <a>AddJobFlowSteps</a> operation.
     *            </p>
     * @return addJobFlowStepsResult The response from the AddJobFlowSteps
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addJobFlowStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddJobFlowStepsRequest> request = null;
        Response<AddJobFlowStepsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddJobFlowStepsRequestMarshaller().marshall(addJobFlowStepsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddJobFlowStepsResult, JsonUnmarshallerContext> unmarshaller = new AddJobFlowStepsResultJsonUnmarshaller();
            JsonResponseHandler<AddJobFlowStepsResult> responseHandler = new JsonResponseHandler<AddJobFlowStepsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate
     * clusters in various ways, such as grouping clusters to track your Amazon
     * EMR resource allocation costs. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     * 
     * @param addTagsRequest <p>
     *            This input identifies a cluster and a list of tags to attach.
     *            </p>
     * @return addTagsResult The response from the AddTags service method, as
     *         returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AddTagsResult addTags(AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(addTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddTagsResult, JsonUnmarshallerContext> unmarshaller = new AddTagsResultJsonUnmarshaller();
            JsonResponseHandler<AddTagsResult> responseHandler = new JsonResponseHandler<AddTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Cancels a pending step or steps in a running cluster. Available only in
     * Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum
     * of 256 steps are allowed in each CancelSteps request. CancelSteps is
     * idempotent but asynchronous; it does not guarantee a step will be
     * canceled, even if the request is successfully submitted. You can only
     * cancel steps that are in a <code>PENDING</code> state.
     * </p>
     * 
     * @param cancelStepsRequest <p>
     *            The input argument to the <a>CancelSteps</a> operation.
     *            </p>
     * @return cancelStepsResult The response from the CancelSteps service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CancelStepsResult cancelSteps(CancelStepsRequest cancelStepsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelStepsRequest> request = null;
        Response<CancelStepsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelStepsRequestMarshaller().marshall(cancelStepsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelStepsResult, JsonUnmarshallerContext> unmarshaller = new CancelStepsResultJsonUnmarshaller();
            JsonResponseHandler<CancelStepsResult> responseHandler = new JsonResponseHandler<CancelStepsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can
     * be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return createSecurityConfigurationResult The response from the
     *         CreateSecurityConfiguration service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateSecurityConfigurationResult createSecurityConfiguration(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityConfigurationRequest> request = null;
        Response<CreateSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityConfigurationRequestMarshaller()
                        .marshall(createSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new CreateSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<CreateSecurityConfigurationResult> responseHandler = new JsonResponseHandler<CreateSecurityConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return deleteSecurityConfigurationResult The response from the
     *         DeleteSecurityConfiguration service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteSecurityConfigurationResult deleteSecurityConfiguration(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityConfigurationRequest> request = null;
        Response<DeleteSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityConfigurationRequestMarshaller()
                        .marshall(deleteSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DeleteSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSecurityConfigurationResult> responseHandler = new JsonResponseHandler<DeleteSecurityConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on.
     * </p>
     * 
     * @param describeClusterRequest <p>
     *            This input determines which cluster to describe.
     *            </p>
     * @return describeClusterResult The response from the DescribeCluster
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestMarshaller().marshall(describeClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClusterResult, JsonUnmarshallerContext> unmarshaller = new DescribeClusterResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClusterResult> responseHandler = new JsonResponseHandler<DescribeClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This API is deprecated and will eventually be removed. We recommend you
     * use <a>ListClusters</a>, <a>DescribeCluster</a>, <a>ListSteps</a>,
     * <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow IDs,
     * job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last
     * two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Job flows created and completed in the last two weeks
     * </p>
     * </li>
     * <li>
     * <p>
     * Job flows created within the last two months that are in one of the
     * following states: <code>RUNNING</code>, <code>WAITING</code>,
     * <code>SHUTTING_DOWN</code>, <code>STARTING</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon EMR can return a maximum of 512 job flow descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest <p>
     *            The input for the <a>DescribeJobFlows</a> operation.
     *            </p>
     * @return describeJobFlowsResult The response from the DescribeJobFlows
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobFlowsRequest> request = null;
        Response<DescribeJobFlowsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobFlowsRequestMarshaller().marshall(describeJobFlowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeJobFlowsResult, JsonUnmarshallerContext> unmarshaller = new DescribeJobFlowsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeJobFlowsResult> responseHandler = new JsonResponseHandler<DescribeJobFlowsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides the details of a security configuration by returning the
     * configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @return describeSecurityConfigurationResult The response from the
     *         DescribeSecurityConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeSecurityConfigurationResult describeSecurityConfiguration(
            DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityConfigurationRequest> request = null;
        Response<DescribeSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityConfigurationRequestMarshaller()
                        .marshall(describeSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSecurityConfigurationResult> responseHandler = new JsonResponseHandler<DescribeSecurityConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest <p>
     *            This input determines which step to describe.
     *            </p>
     * @return describeStepResult The response from the DescribeStep service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeStepResult describeStep(DescribeStepRequest describeStepRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStepRequest> request = null;
        Response<DescribeStepResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStepRequestMarshaller().marshall(describeStepRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStepResult, JsonUnmarshallerContext> unmarshaller = new DescribeStepResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStepResult> responseHandler = new JsonResponseHandler<DescribeStepResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the Amazon EMR block public access configuration for your AWS
     * account in the current Region. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
     * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
     * Management Guide</i>.
     * </p>
     * 
     * @param getBlockPublicAccessConfigurationRequest
     * @return getBlockPublicAccessConfigurationResult The response from the
     *         GetBlockPublicAccessConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetBlockPublicAccessConfigurationResult getBlockPublicAccessConfiguration(
            GetBlockPublicAccessConfigurationRequest getBlockPublicAccessConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBlockPublicAccessConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlockPublicAccessConfigurationRequest> request = null;
        Response<GetBlockPublicAccessConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlockPublicAccessConfigurationRequestMarshaller()
                        .marshall(getBlockPublicAccessConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBlockPublicAccessConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetBlockPublicAccessConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetBlockPublicAccessConfigurationResult> responseHandler = new JsonResponseHandler<GetBlockPublicAccessConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Fetches the attached managed scaling policy for an Amazon EMR cluster.
     * </p>
     * 
     * @param getManagedScalingPolicyRequest
     * @return getManagedScalingPolicyResult The response from the
     *         GetManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetManagedScalingPolicyResult getManagedScalingPolicy(
            GetManagedScalingPolicyRequest getManagedScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getManagedScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetManagedScalingPolicyRequest> request = null;
        Response<GetManagedScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetManagedScalingPolicyRequestMarshaller()
                        .marshall(getManagedScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetManagedScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetManagedScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetManagedScalingPolicyResult> responseHandler = new JsonResponseHandler<GetManagedScalingPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest <p>
     *            This input determines which bootstrap actions to retrieve.
     *            </p>
     * @return listBootstrapActionsResult The response from the
     *         ListBootstrapActions service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListBootstrapActionsResult listBootstrapActions(
            ListBootstrapActionsRequest listBootstrapActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBootstrapActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBootstrapActionsRequest> request = null;
        Response<ListBootstrapActionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBootstrapActionsRequestMarshaller()
                        .marshall(listBootstrapActionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBootstrapActionsResult, JsonUnmarshallerContext> unmarshaller = new ListBootstrapActionsResultJsonUnmarshaller();
            JsonResponseHandler<ListBootstrapActionsResult> responseHandler = new JsonResponseHandler<ListBootstrapActionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows
     * you to filter the list of clusters based on certain criteria; for
     * example, filtering by cluster creation date and time or by status. This
     * call returns a maximum of 50 clusters per call, but returns a marker to
     * track the paging of the cluster list across multiple ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest <p>
     *            This input determines how the ListClusters action filters the
     *            list of clusters that it returns.
     *            </p>
     * @return listClustersResult The response from the ListClusters service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller().marshall(listClustersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClustersResult, JsonUnmarshallerContext> unmarshaller = new ListClustersResultJsonUnmarshaller();
            JsonResponseHandler<ListClustersResult> responseHandler = new JsonResponseHandler<ListClustersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all available details about the instance fleets in a cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * 
     * @param listInstanceFleetsRequest
     * @return listInstanceFleetsResult The response from the ListInstanceFleets
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListInstanceFleetsResult listInstanceFleets(
            ListInstanceFleetsRequest listInstanceFleetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInstanceFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceFleetsRequest> request = null;
        Response<ListInstanceFleetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceFleetsRequestMarshaller()
                        .marshall(listInstanceFleetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInstanceFleetsResult, JsonUnmarshallerContext> unmarshaller = new ListInstanceFleetsResultJsonUnmarshaller();
            JsonResponseHandler<ListInstanceFleetsResult> responseHandler = new JsonResponseHandler<ListInstanceFleetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest <p>
     *            This input determines which instance groups to retrieve.
     *            </p>
     * @return listInstanceGroupsResult The response from the ListInstanceGroups
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListInstanceGroupsResult listInstanceGroups(
            ListInstanceGroupsRequest listInstanceGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceGroupsRequest> request = null;
        Response<ListInstanceGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceGroupsRequestMarshaller()
                        .marshall(listInstanceGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInstanceGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListInstanceGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListInstanceGroupsResult> responseHandler = new JsonResponseHandler<ListInstanceGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information for all active EC2 instances and EC2 instances
     * terminated in the last 30 days, up to a maximum of 2,000. EC2 instances
     * in any of the following states are considered active:
     * AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
     * </p>
     * 
     * @param listInstancesRequest <p>
     *            This input determines which instances to list.
     *            </p>
     * @return listInstancesResult The response from the ListInstances service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestMarshaller().marshall(listInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListInstancesResult> responseHandler = new JsonResponseHandler<ListInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing
     * their creation dates and times, and their names. This call returns a
     * maximum of 50 clusters per call, but returns a marker to track the paging
     * of the cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @return listSecurityConfigurationsResult The response from the
     *         ListSecurityConfigurations service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListSecurityConfigurationsResult listSecurityConfigurations(
            ListSecurityConfigurationsRequest listSecurityConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSecurityConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityConfigurationsRequest> request = null;
        Response<ListSecurityConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityConfigurationsRequestMarshaller()
                        .marshall(listSecurityConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSecurityConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new ListSecurityConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<ListSecurityConfigurationsResult> responseHandler = new JsonResponseHandler<ListSecurityConfigurationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you
     * specify <code>stepIds</code> with the request of filter by
     * <code>StepStates</code>. You can specify a maximum of ten
     * <code>stepIDs</code>.
     * </p>
     * 
     * @param listStepsRequest <p>
     *            This input determines which steps to list.
     *            </p>
     * @return listStepsResult The response from the ListSteps service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListStepsResult listSteps(ListStepsRequest listStepsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepsRequest> request = null;
        Response<ListStepsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepsRequestMarshaller().marshall(listStepsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStepsResult, JsonUnmarshallerContext> unmarshaller = new ListStepsResultJsonUnmarshaller();
            JsonResponseHandler<ListStepsResult> responseHandler = new JsonResponseHandler<ListStepsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the number of steps that can be executed concurrently for the
     * cluster specified using ClusterID.
     * </p>
     * 
     * @param modifyClusterRequest
     * @return modifyClusterResult The response from the ModifyCluster service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ModifyClusterResult modifyCluster(ModifyClusterRequest modifyClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterRequest> request = null;
        Response<ModifyClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterRequestMarshaller().marshall(modifyClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyClusterResult, JsonUnmarshallerContext> unmarshaller = new ModifyClusterResultJsonUnmarshaller();
            JsonResponseHandler<ModifyClusterResult> responseHandler = new JsonResponseHandler<ModifyClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Modifies the target On-Demand and target Spot capacities for the instance
     * fleet with the specified InstanceFleetID within the cluster specified
     * using ClusterID. The call either succeeds or fails atomically.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * 
     * @param modifyInstanceFleetRequest
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void modifyInstanceFleet(ModifyInstanceFleetRequest modifyInstanceFleetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyInstanceFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceFleetRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceFleetRequestMarshaller()
                        .marshall(modifyInstanceFleetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The call
     * will either succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest <p>
     *            Change the size of some instance groups.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void modifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceGroupsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceGroupsRequestMarshaller()
                        .marshall(modifyInstanceGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group
     * or task instance group in an Amazon EMR cluster. The automatic scaling
     * policy defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @return putAutoScalingPolicyResult The response from the
     *         PutAutoScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutAutoScalingPolicyResult putAutoScalingPolicy(
            PutAutoScalingPolicyRequest putAutoScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAutoScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAutoScalingPolicyRequest> request = null;
        Response<PutAutoScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAutoScalingPolicyRequestMarshaller()
                        .marshall(putAutoScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAutoScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutAutoScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutAutoScalingPolicyResult> responseHandler = new JsonResponseHandler<PutAutoScalingPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an Amazon EMR block public access configuration for
     * your AWS account in the current Region. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
     * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
     * Management Guide</i>.
     * </p>
     * 
     * @param putBlockPublicAccessConfigurationRequest
     * @return putBlockPublicAccessConfigurationResult The response from the
     *         PutBlockPublicAccessConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutBlockPublicAccessConfigurationResult putBlockPublicAccessConfiguration(
            PutBlockPublicAccessConfigurationRequest putBlockPublicAccessConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putBlockPublicAccessConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBlockPublicAccessConfigurationRequest> request = null;
        Response<PutBlockPublicAccessConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBlockPublicAccessConfigurationRequestMarshaller()
                        .marshall(putBlockPublicAccessConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutBlockPublicAccessConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutBlockPublicAccessConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutBlockPublicAccessConfigurationResult> responseHandler = new JsonResponseHandler<PutBlockPublicAccessConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     * The managed scaling policy defines the limits for resources, such as EC2
     * instances that can be added or terminated from a cluster. The policy only
     * applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     * 
     * @param putManagedScalingPolicyRequest
     * @return putManagedScalingPolicyResult The response from the
     *         PutManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutManagedScalingPolicyResult putManagedScalingPolicy(
            PutManagedScalingPolicyRequest putManagedScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putManagedScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutManagedScalingPolicyRequest> request = null;
        Response<PutManagedScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutManagedScalingPolicyRequestMarshaller()
                        .marshall(putManagedScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutManagedScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutManagedScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutManagedScalingPolicyResult> responseHandler = new JsonResponseHandler<PutManagedScalingPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group
     * within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @return removeAutoScalingPolicyResult The response from the
     *         RemoveAutoScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RemoveAutoScalingPolicyResult removeAutoScalingPolicy(
            RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeAutoScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAutoScalingPolicyRequest> request = null;
        Response<RemoveAutoScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAutoScalingPolicyRequestMarshaller()
                        .marshall(removeAutoScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveAutoScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new RemoveAutoScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<RemoveAutoScalingPolicyResult> responseHandler = new JsonResponseHandler<RemoveAutoScalingPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a managed scaling policy from a specified EMR cluster.
     * </p>
     * 
     * @param removeManagedScalingPolicyRequest
     * @return removeManagedScalingPolicyResult The response from the
     *         RemoveManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RemoveManagedScalingPolicyResult removeManagedScalingPolicy(
            RemoveManagedScalingPolicyRequest removeManagedScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeManagedScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveManagedScalingPolicyRequest> request = null;
        Response<RemoveManagedScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveManagedScalingPolicyRequestMarshaller()
                        .marshall(removeManagedScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveManagedScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new RemoveManagedScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<RemoveManagedScalingPolicyResult> responseHandler = new JsonResponseHandler<RemoveManagedScalingPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to
     * associate clusters in various ways, such as grouping clusters to track
     * your Amazon EMR resource allocation costs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a
     * cluster:
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            This input identifies a cluster and a list of tags to remove.
     *            </p>
     * @return removeTagsResult The response from the RemoveTags service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(removeTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveTagsResult, JsonUnmarshallerContext> unmarshaller = new RemoveTagsResultJsonUnmarshaller();
            JsonResponseHandler<RemoveTagsResult> responseHandler = new JsonResponseHandler<RemoveTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * RunJobFlow creates and starts running a new cluster (job flow). The
     * cluster runs the steps specified. After the steps complete, the cluster
     * stops and the HDFS partition is lost. To prevent loss of data, configure
     * the last step of the job flow to store results in Amazon S3. If the
     * <a>JobFlowInstancesConfig</a> <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code>, the cluster transitions to the
     * WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a>
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to lock
     * the cluster and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using the
     * SSH shell to connect to the master node and submitting queries directly
     * to the software running on the master node, such as Hive and Hadoop. For
     * more information on how to do this, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * <p>
     * For long running clusters, we recommend that you periodically store your
     * results.
     * </p>
     * <note>
     * <p>
     * The instance fleets configuration is available only in Amazon EMR
     * versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow
     * request can contain InstanceFleets parameters or InstanceGroups
     * parameters, but not both.
     * </p>
     * </note>
     * 
     * @param runJobFlowRequest <p>
     *            Input to the <a>RunJobFlow</a> operation.
     *            </p>
     * @return runJobFlowResult The response from the RunJobFlow service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(runJobFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunJobFlowRequest> request = null;
        Response<RunJobFlowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunJobFlowRequestMarshaller().marshall(runJobFlowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RunJobFlowResult, JsonUnmarshallerContext> unmarshaller = new RunJobFlowResultJsonUnmarshaller();
            JsonResponseHandler<RunJobFlowResult> responseHandler = new JsonResponseHandler<RunJobFlowResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * SetTerminationProtection locks a cluster (job flow) so the EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call, or
     * in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * <code>SetTerminationProtection</code> on a cluster is similar to calling
     * the Amazon EC2 <code>DisableAPITermination</code> API on all EC2
     * instances in a cluster.
     * </p>
     * <p>
     * <code>SetTerminationProtection</code> is used to prevent accidental
     * termination of a cluster and to ensure that in the event of an error, the
     * instances persist so that you can recover any data stored in their
     * ephemeral instance storage.
     * </p>
     * <p>
     * To terminate a cluster that has been locked by setting
     * <code>SetTerminationProtection</code> to <code>true</code>, you must
     * first unlock the job flow by a subsequent call to
     * <code>SetTerminationProtection</code> in which you set the value to
     * <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html"
     * >Managing Cluster Termination</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * 
     * @param setTerminationProtectionRequest <p>
     *            The input argument to the <a>TerminationProtection</a>
     *            operation.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void setTerminationProtection(
            SetTerminationProtectionRequest setTerminationProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setTerminationProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTerminationProtectionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTerminationProtectionRequestMarshaller()
                        .marshall(setTerminationProtectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the <a>Cluster$VisibleToAllUsers</a> value, which determines whether
     * the cluster is visible to all IAM users of the AWS account associated
     * with the cluster. Only the IAM user who created the cluster or the AWS
     * account root user can call this action. The default value,
     * <code>true</code>, indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions.
     * If set to <code>false</code>, only the IAM user that created the cluster
     * can perform actions. This action works on running clusters. You can
     * override the default <code>true</code> setting when you create a cluster
     * by using the <code>VisibleToAllUsers</code> parameter with
     * <code>RunJobFlow</code>.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest <p>
     *            The input to the SetVisibleToAllUsers action.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void setVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setVisibleToAllUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVisibleToAllUsersRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVisibleToAllUsersRequestMarshaller()
                        .marshall(setVisibleToAllUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * TerminateJobFlows shuts a list of clusters (job flows) down. When a job
     * flow is shut down, any step not yet completed is canceled and the EC2
     * instances on which the cluster is running are stopped. Any log files not
     * already saved are uploaded to Amazon S3 if a LogUri was specified when
     * the cluster was created.
     * </p>
     * <p>
     * The maximum number of clusters allowed is 10. The call to
     * <code>TerminateJobFlows</code> is asynchronous. Depending on the
     * configuration of the cluster, it may take up to 1-5 minutes for the
     * cluster to completely terminate and release allocated resources, such as
     * Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest <p>
     *            Input to the <a>TerminateJobFlows</a> operation.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(terminateJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateJobFlowsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateJobFlowsRequestMarshaller()
                        .marshall(terminateJobFlowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
