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

package com.amazonaws.services.synthetics;

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

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.services.synthetics.model.transform.*;

/**
 * Client for accessing Synthetics. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon CloudWatch Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your
 * services. You can create and manage <i>canaries</i>, which are modular,
 * lightweight scripts that monitor your endpoints and APIs from the outside-in.
 * You can set up your canaries to run 24 hours a day, once per minute. The
 * canaries help you check the availability and latency of your web services and
 * troubleshoot anomalies by investigating load time data, screenshots of the
 * UI, logs, and metrics. The canaries seamlessly integrate with CloudWatch
 * ServiceLens to help you trace the causes of impacted nodes in your
 * applications. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html"
 * >Using ServiceLens to Monitor the Health of Your Applications</a> in the
 * <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security
 * considerations. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
 * >Security Considerations for Synthetics Canaries</a>.
 * </p>
 */
public class SyntheticsClient extends AmazonWebServiceClient implements Synthetics {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Synthetics exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on Synthetics. A
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
    public SyntheticsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics. A
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
     *            how this client connects to Synthetics (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public SyntheticsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials.
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
     *         SyntheticsClient client = new SyntheticsClient(AWSMobileClient.getInstance());
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
    public SyntheticsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials and client configuration options.
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
     *         SyntheticsClient client = new SyntheticsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Synthetics (ex: proxy settings,
     *            retry counts, etc.).
     */
    public SyntheticsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials provider.
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
     *         SyntheticsClient client = new SyntheticsClient(AWSMobileClient.getInstance());
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
    public SyntheticsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials provider and client configuration
     * options.
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
     *         SyntheticsClient client = new SyntheticsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Synthetics (ex: proxy settings,
     *            retry counts, etc.).
     */
    public SyntheticsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Synthetics (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public SyntheticsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
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
     *         SyntheticsClient client = new SyntheticsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Synthetics (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public SyntheticsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("synthetics.us-east-1.amazonaws.com");
        this.endpointPrefix = "synthetics";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/synthetics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/synthetics/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a canary. Canaries are scripts that monitor your endpoints and
     * APIs from the outside-in. Canaries help you check the availability and
     * latency of your web services and troubleshoot anomalies by investigating
     * load time data, screenshots of the UI, logs, and metrics. You can set up
     * a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use
     * <a>UpdateCanary</a> instead.
     * </p>
     * <p>
     * To create canaries, you must have the
     * <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the the
     * <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the Amazon Resource Name (ARN) for the
     * canary, and the ARN is included in outbound calls over the internet. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @return createCanaryResult The response from the CreateCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCanaryResult createCanary(CreateCanaryRequest createCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCanaryRequest> request = null;
        Response<CreateCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCanaryRequestMarshaller().marshall(createCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCanaryResult, JsonUnmarshallerContext> unmarshaller = new CreateCanaryResultJsonUnmarshaller();
            JsonResponseHandler<CreateCanaryResult> responseHandler = new JsonResponseHandler<CreateCanaryResult>(
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
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * When you delete a canary, resources used and created by the canary are
     * not automatically deleted. After you delete a canary that you do not
     * intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Lambda functions and layers used by this canary. These have the
     * prefix <code>cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name
     * of <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console,
     * these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have
     * the name <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code>
     * to display the information about this canary. Make note of the
     * information returned by this operation so that you can delete these
     * resources after you delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @return deleteCanaryResult The response from the DeleteCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCanaryResult deleteCanary(DeleteCanaryRequest deleteCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCanaryRequest> request = null;
        Response<DeleteCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCanaryRequestMarshaller().marshall(deleteCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCanaryResult, JsonUnmarshallerContext> unmarshaller = new DeleteCanaryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCanaryResult> responseHandler = new JsonResponseHandler<DeleteCanaryResult>(
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
     * This operation returns a list of the canaries in your account, along with
     * full details about each canary.
     * </p>
     * <p>
     * This operation does not have resource-level authorization, so if a user
     * is able to use <code>DescribeCanaries</code>, the user can see all of the
     * canaries in the account. A deny policy can only be used to restrict
     * access to all canaries. It cannot be used on specific resources.
     * </p>
     * 
     * @param describeCanariesRequest
     * @return describeCanariesResult The response from the DescribeCanaries
     *         service method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCanariesResult describeCanaries(DescribeCanariesRequest describeCanariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCanariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCanariesRequest> request = null;
        Response<DescribeCanariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCanariesRequestMarshaller().marshall(describeCanariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCanariesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCanariesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCanariesResult> responseHandler = new JsonResponseHandler<DescribeCanariesResult>(
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
     * Use this operation to see information from the most recent run of each
     * canary that you have created.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @return describeCanariesLastRunResult The response from the
     *         DescribeCanariesLastRun service method, as returned by
     *         Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCanariesLastRunResult describeCanariesLastRun(
            DescribeCanariesLastRunRequest describeCanariesLastRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCanariesLastRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCanariesLastRunRequest> request = null;
        Response<DescribeCanariesLastRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCanariesLastRunRequestMarshaller()
                        .marshall(describeCanariesLastRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCanariesLastRunResult, JsonUnmarshallerContext> unmarshaller = new DescribeCanariesLastRunResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCanariesLastRunResult> responseHandler = new JsonResponseHandler<DescribeCanariesLastRunResult>(
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
     * Returns a list of Synthetics canary runtime versions. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @return describeRuntimeVersionsResult The response from the
     *         DescribeRuntimeVersions service method, as returned by
     *         Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRuntimeVersionsResult describeRuntimeVersions(
            DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRuntimeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuntimeVersionsRequest> request = null;
        Response<DescribeRuntimeVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuntimeVersionsRequestMarshaller()
                        .marshall(describeRuntimeVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRuntimeVersionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeRuntimeVersionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRuntimeVersionsResult> responseHandler = new JsonResponseHandler<DescribeRuntimeVersionsResult>(
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
     * Retrieves complete information about one canary. You must specify the
     * name of the canary that you want. To get a list of canaries and their
     * names, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @return getCanaryResult The response from the GetCanary service method,
     *         as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCanaryResult getCanary(GetCanaryRequest getCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCanaryRequest> request = null;
        Response<GetCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCanaryRequestMarshaller().marshall(getCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCanaryResult, JsonUnmarshallerContext> unmarshaller = new GetCanaryResultJsonUnmarshaller();
            JsonResponseHandler<GetCanaryResult> responseHandler = new JsonResponseHandler<GetCanaryResult>(
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
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @return getCanaryRunsResult The response from the GetCanaryRuns service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCanaryRunsResult getCanaryRuns(GetCanaryRunsRequest getCanaryRunsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCanaryRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCanaryRunsRequest> request = null;
        Response<GetCanaryRunsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCanaryRunsRequestMarshaller().marshall(getCanaryRunsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCanaryRunsResult, JsonUnmarshallerContext> unmarshaller = new GetCanaryRunsResultJsonUnmarshaller();
            JsonResponseHandler<GetCanaryRunsResult> responseHandler = new JsonResponseHandler<GetCanaryRunsResult>(
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
     * Displays the tags associated with a canary.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
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
     * Use this operation to run a canary that has already been created. The
     * frequency of the canary runs is determined by the value of the canary's
     * <code>Schedule</code>. To see a canary's schedule, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html"
     * >GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @return startCanaryResult The response from the StartCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCanaryResult startCanary(StartCanaryRequest startCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCanaryRequest> request = null;
        Response<StartCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCanaryRequestMarshaller().marshall(startCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCanaryResult, JsonUnmarshallerContext> unmarshaller = new StartCanaryResultJsonUnmarshaller();
            JsonResponseHandler<StartCanaryResult> responseHandler = new JsonResponseHandler<StartCanaryResult>(
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
     * Stops the canary to prevent all future runs. If the canary is currently
     * running, Synthetics stops waiting for the current run of the specified
     * canary to complete. The run that is in progress completes on its own,
     * publishes metrics, and uploads artifacts, but it is not recorded in
     * Synthetics as a completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the
     * canary’s current schedule at any point in the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @return stopCanaryResult The response from the StopCanary service method,
     *         as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopCanaryResult stopCanary(StopCanaryRequest stopCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCanaryRequest> request = null;
        Response<StopCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCanaryRequestMarshaller().marshall(stopCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopCanaryResult, JsonUnmarshallerContext> unmarshaller = new StopCanaryResultJsonUnmarshaller();
            JsonResponseHandler<StopCanaryResult> responseHandler = new JsonResponseHandler<StopCanaryResult>(
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
     * Assigns one or more tags (key-value pairs) to the specified canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly
     * as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a canary that
     * already has tags. If you specify a new tag key for the alarm, this tag is
     * appended to the list of tags associated with the alarm. If you specify a
     * tag key that is already associated with the alarm, the new tag value that
     * you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
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
     * Removes one or more tags from the specified canary.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
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
     * Use this operation to change the settings of a canary that has already
     * been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To
     * change the tags of an existing canary, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html"
     * >TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @return updateCanaryResult The response from the UpdateCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCanaryResult updateCanary(UpdateCanaryRequest updateCanaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCanaryRequest> request = null;
        Response<UpdateCanaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCanaryRequestMarshaller().marshall(updateCanaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCanaryResult, JsonUnmarshallerContext> unmarshaller = new UpdateCanaryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCanaryResult> responseHandler = new JsonResponseHandler<UpdateCanaryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
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
