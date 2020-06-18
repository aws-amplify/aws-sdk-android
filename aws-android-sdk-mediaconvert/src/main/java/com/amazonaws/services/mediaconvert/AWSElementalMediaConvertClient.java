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

package com.amazonaws.services.mediaconvert;

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

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.services.mediaconvert.model.transform.*;

/**
 * Client for accessing AWS Elemental MediaConvert. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Elemental MediaConvert
 */
public class AWSElementalMediaConvertClient extends AmazonWebServiceClient implements
        AWSElementalMediaConvert {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Elemental MediaConvert
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert. A credentials provider chain will be used that
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
    public AWSElementalMediaConvertClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert. A credentials provider chain will be used that
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
     *            how this client connects to AWSElementalMediaConvert (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSElementalMediaConvertClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials.
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
     *         AWSElementalMediaConvertClient client = new AWSElementalMediaConvertClient(AWSMobileClient
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
    public AWSElementalMediaConvertClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials and
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
     *         AWSElementalMediaConvertClient client = new AWSElementalMediaConvertClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaConvert (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSElementalMediaConvertClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials
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
     *         AWSElementalMediaConvertClient client = new AWSElementalMediaConvertClient(AWSMobileClient
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
    public AWSElementalMediaConvertClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials
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
     *         AWSElementalMediaConvertClient client = new AWSElementalMediaConvertClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaConvert (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSElementalMediaConvertClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSElementalMediaConvert (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSElementalMediaConvertClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaConvert using the specified AWS account credentials
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
     *         AWSElementalMediaConvertClient client = new AWSElementalMediaConvertClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaConvert (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSElementalMediaConvertClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("mediaconvert.us-east-1.amazonaws.com");
        this.endpointPrefix = "mediaconvert";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/mediaconvert/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/mediaconvert/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN)
     * with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @return associateCertificateResult The response from the
     *         AssociateCertificate service method, as returned by AWS Elemental
     *         MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested does not exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service could not complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AssociateCertificateResult associateCertificate(
            AssociateCertificateRequest associateCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCertificateRequest> request = null;
        Response<AssociateCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCertificateRequestMarshaller()
                        .marshall(associateCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateCertificateResult, JsonUnmarshallerContext> unmarshaller = new AssociateCertificateResultJsonUnmarshaller();
            JsonResponseHandler<AssociateCertificateResult> responseHandler = new JsonResponseHandler<AssociateCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start
     * it again.
     * 
     * @param cancelJobRequest
     * @return cancelJobResult The response from the CancelJob service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelJobResult, JsonUnmarshallerContext> unmarshaller = new CancelJobResultJsonUnmarshaller();
            JsonResponseHandler<CancelJobResult> responseHandler = new JsonResponseHandler<CancelJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new transcoding job. For information about jobs and job
     * settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller().marshall(createJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateJobResult, JsonUnmarshallerContext> unmarshaller = new CreateJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateJobResult> responseHandler = new JsonResponseHandler<CreateJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new job template. For information about job templates see the
     * User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @return createJobTemplateResult The response from the CreateJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateJobTemplateResult createJobTemplate(
            CreateJobTemplateRequest createJobTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobTemplateRequest> request = null;
        Response<CreateJobTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobTemplateRequestMarshaller()
                        .marshall(createJobTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateJobTemplateResult, JsonUnmarshallerContext> unmarshaller = new CreateJobTemplateResultJsonUnmarshaller();
            JsonResponseHandler<CreateJobTemplateResult> responseHandler = new JsonResponseHandler<CreateJobTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new preset. For information about job templates see the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @return createPresetResult The response from the CreatePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreatePresetResult createPreset(CreatePresetRequest createPresetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresetRequest> request = null;
        Response<CreatePresetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresetRequestMarshaller().marshall(createPresetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePresetResult, JsonUnmarshallerContext> unmarshaller = new CreatePresetResultJsonUnmarshaller();
            JsonResponseHandler<CreatePresetResult> responseHandler = new JsonResponseHandler<CreatePresetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new transcoding queue. For information about queues, see Working
     * With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @return createQueueResult The response from the CreateQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestMarshaller().marshall(createQueueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateQueueResult, JsonUnmarshallerContext> unmarshaller = new CreateQueueResultJsonUnmarshaller();
            JsonResponseHandler<CreateQueueResult> responseHandler = new JsonResponseHandler<CreateQueueResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @return deleteJobTemplateResult The response from the DeleteJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteJobTemplateResult deleteJobTemplate(
            DeleteJobTemplateRequest deleteJobTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobTemplateRequest> request = null;
        Response<DeleteJobTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobTemplateRequestMarshaller()
                        .marshall(deleteJobTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteJobTemplateResult, JsonUnmarshallerContext> unmarshaller = new DeleteJobTemplateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteJobTemplateResult> responseHandler = new JsonResponseHandler<DeleteJobTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @return deletePresetResult The response from the DeletePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePresetRequest> request = null;
        Response<DeletePresetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePresetRequestMarshaller().marshall(deletePresetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePresetResult, JsonUnmarshallerContext> unmarshaller = new DeletePresetResultJsonUnmarshaller();
            JsonResponseHandler<DeletePresetResult> responseHandler = new JsonResponseHandler<DeletePresetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @return deleteQueueResult The response from the DeleteQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestMarshaller().marshall(deleteQueueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteQueueResult, JsonUnmarshallerContext> unmarshaller = new DeleteQueueResultJsonUnmarshaller();
            JsonResponseHandler<DeleteQueueResult> responseHandler = new JsonResponseHandler<DeleteQueueResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Send an request with an empty body to the regional API endpoint to get
     * your account API endpoint.
     * 
     * @param describeEndpointsRequest DescribeEndpointsRequest
     * @return describeEndpointsResult The response from the DescribeEndpoints
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException BadRequestException
     * @throws InternalServerErrorException InternalServiceException
     * @throws ForbiddenException AccessDeniedException
     * @throws NotFoundException ResourceNotFoundException
     * @throws TooManyRequestsException LimitExceededException
     * @throws ConflictException ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeEndpointsResult describeEndpoints(
            DescribeEndpointsRequest describeEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestMarshaller()
                        .marshall(describeEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointsResult> responseHandler = new JsonResponseHandler<DescribeEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS
     * Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert
     * resource.
     * 
     * @param disassociateCertificateRequest
     * @return disassociateCertificateResult The response from the
     *         DisassociateCertificate service method, as returned by AWS
     *         Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested does not exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service could not complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DisassociateCertificateResult disassociateCertificate(
            DisassociateCertificateRequest disassociateCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCertificateRequest> request = null;
        Response<DisassociateCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCertificateRequestMarshaller()
                        .marshall(disassociateCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateCertificateResult, JsonUnmarshallerContext> unmarshaller = new DisassociateCertificateResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateCertificateResult> responseHandler = new JsonResponseHandler<DisassociateCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetJobResult getJob(GetJobRequest getJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestMarshaller().marshall(getJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobResult, JsonUnmarshallerContext> unmarshaller = new GetJobResultJsonUnmarshaller();
            JsonResponseHandler<GetJobResult> responseHandler = new JsonResponseHandler<GetJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @return getJobTemplateResult The response from the GetJobTemplate service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetJobTemplateResult getJobTemplate(GetJobTemplateRequest getJobTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobTemplateRequest> request = null;
        Response<GetJobTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobTemplateRequestMarshaller().marshall(getJobTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobTemplateResult, JsonUnmarshallerContext> unmarshaller = new GetJobTemplateResultJsonUnmarshaller();
            JsonResponseHandler<GetJobTemplateResult> responseHandler = new JsonResponseHandler<GetJobTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @return getPresetResult The response from the GetPreset service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetPresetResult getPreset(GetPresetRequest getPresetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPresetRequest> request = null;
        Response<GetPresetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPresetRequestMarshaller().marshall(getPresetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPresetResult, JsonUnmarshallerContext> unmarshaller = new GetPresetResultJsonUnmarshaller();
            JsonResponseHandler<GetPresetResult> responseHandler = new JsonResponseHandler<GetPresetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @return getQueueResult The response from the GetQueue service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetQueueResult getQueue(GetQueueRequest getQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueRequest> request = null;
        Response<GetQueueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueRequestMarshaller().marshall(getQueueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetQueueResult, JsonUnmarshallerContext> unmarshaller = new GetQueueResultJsonUnmarshaller();
            JsonResponseHandler<GetQueueResult> responseHandler = new JsonResponseHandler<GetQueueResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will
     * return the templates themselves, not just a list of them. To retrieve the
     * next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @return listJobTemplatesResult The response from the ListJobTemplates
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJobTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobTemplatesRequest> request = null;
        Response<ListJobTemplatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobTemplatesRequestMarshaller().marshall(listJobTemplatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJobTemplatesResult, JsonUnmarshallerContext> unmarshaller = new ListJobTemplatesResultJsonUnmarshaller();
            JsonResponseHandler<ListJobTemplatesResult> responseHandler = new JsonResponseHandler<ListJobTemplatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs.
     * This array includes in-process, completed, and errored jobs. This will
     * return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the
     * array.
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller().marshall(listJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJobsResult, JsonUnmarshallerContext> unmarshaller = new ListJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListJobsResult> responseHandler = new JsonResponseHandler<ListJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your presets. This will return
     * the presets themselves, not just a list of them. To retrieve the next
     * twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @return listPresetsResult The response from the ListPresets service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPresetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPresetsRequest> request = null;
        Response<ListPresetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPresetsRequestMarshaller().marshall(listPresetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPresetsResult, JsonUnmarshallerContext> unmarshaller = new ListPresetsResultJsonUnmarshaller();
            JsonResponseHandler<ListPresetsResult> responseHandler = new JsonResponseHandler<ListPresetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return
     * the queues themselves, not just a list of them. To retrieve the next
     * twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestMarshaller().marshall(listQueuesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListQueuesResult, JsonUnmarshallerContext> unmarshaller = new ListQueuesResultJsonUnmarshaller();
            JsonResponseHandler<ListQueuesResult> responseHandler = new JsonResponseHandler<ListQueuesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elemental
     *         MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Add tags to a MediaConvert queue, preset, or job template. For
     * information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Remove tags from a MediaConvert queue, preset, or job template. For
     * information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @return updateJobTemplateResult The response from the UpdateJobTemplate
     *         service method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateJobTemplateResult updateJobTemplate(
            UpdateJobTemplateRequest updateJobTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobTemplateRequest> request = null;
        Response<UpdateJobTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobTemplateRequestMarshaller()
                        .marshall(updateJobTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateJobTemplateResult, JsonUnmarshallerContext> unmarshaller = new UpdateJobTemplateResultJsonUnmarshaller();
            JsonResponseHandler<UpdateJobTemplateResult> responseHandler = new JsonResponseHandler<UpdateJobTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @return updatePresetResult The response from the UpdatePreset service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdatePresetResult updatePreset(UpdatePresetRequest updatePresetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePresetRequest> request = null;
        Response<UpdatePresetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePresetRequestMarshaller().marshall(updatePresetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePresetResult, JsonUnmarshallerContext> unmarshaller = new UpdatePresetResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePresetResult> responseHandler = new JsonResponseHandler<UpdatePresetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @return updateQueueResult The response from the UpdateQueue service
     *         method, as returned by AWS Elemental MediaConvert.
     * @throws BadRequestException The service can't process your request
     *             because of a problem in the request. Please check your
     *             request form and syntax.
     * @throws InternalServerErrorException The service encountered an
     *             unexpected condition and can't fulfill your request.
     * @throws ForbiddenException You don't have permissions for this action
     *             with the credentials you sent.
     * @throws NotFoundException The resource you requested doesn't exist.
     * @throws TooManyRequestsException Too many requests have been sent in too
     *             short of a time. The service limits the rate at which it will
     *             accept requests.
     * @throws ConflictException The service couldn't complete your request
     *             because there is a conflict with the current state of the
     *             resource.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaConvert indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateQueueResult updateQueue(UpdateQueueRequest updateQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueRequest> request = null;
        Response<UpdateQueueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueRequestMarshaller().marshall(updateQueueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateQueueResult, JsonUnmarshallerContext> unmarshaller = new UpdateQueueResultJsonUnmarshaller();
            JsonResponseHandler<UpdateQueueResult> responseHandler = new JsonResponseHandler<UpdateQueueResult>(
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
