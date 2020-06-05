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

package com.amazonaws.services.servicecatalog;

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

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.services.servicecatalog.model.transform.*;

/**
 * Client for accessing AWS Service Catalog. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Service Catalog</fullname>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a>
 * enables organizations to create and manage catalogs of IT services that are
 * approved for use on AWS. To get the most out of this documentation, you
 * should be familiar with the terminology discussed in <a href=
 * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html"
 * >AWS Service Catalog Concepts</a>.
 * </p>
 */
public class AWSServiceCatalogClient extends AmazonWebServiceClient implements AWSServiceCatalog {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Service Catalog exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog. A
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
    public AWSServiceCatalogClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog. A
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
     *            how this client connects to AWSServiceCatalog (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSServiceCatalogClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
     * using the specified AWS account credentials.
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
     *         AWSServiceCatalogClient client = new AWSServiceCatalogClient(AWSMobileClient.getInstance());
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
    public AWSServiceCatalogClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
     * using the specified AWS account credentials and client configuration
     * options.
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
     *         AWSServiceCatalogClient client = new AWSServiceCatalogClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSServiceCatalog (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSServiceCatalogClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
     * using the specified AWS account credentials provider.
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
     *         AWSServiceCatalogClient client = new AWSServiceCatalogClient(AWSMobileClient.getInstance());
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
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AWSServiceCatalogClient client = new AWSServiceCatalogClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSServiceCatalog (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
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
     *            how this client connects to AWSServiceCatalog (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSServiceCatalog
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AWSServiceCatalogClient client = new AWSServiceCatalogClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSServiceCatalog (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DuplicateResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParametersExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagOptionNotMigratedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("servicecatalog.us-east-1.amazonaws.com");
        this.endpointPrefix = "servicecatalog";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/servicecatalog/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/servicecatalog/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return acceptPortfolioShareResult The response from the
     *         AcceptPortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AcceptPortfolioShareResult acceptPortfolioShare(
            AcceptPortfolioShareRequest acceptPortfolioShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptPortfolioShareRequest> request = null;
        Response<AcceptPortfolioShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptPortfolioShareRequestMarshaller()
                        .marshall(acceptPortfolioShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptPortfolioShareResult, JsonUnmarshallerContext> unmarshaller = new AcceptPortfolioShareResultJsonUnmarshaller();
            JsonResponseHandler<AcceptPortfolioShareResult> responseHandler = new JsonResponseHandler<AcceptPortfolioShareResult>(
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
     * Associates the specified budget with the specified resource.
     * </p>
     * 
     * @param associateBudgetWithResourceRequest
     * @return associateBudgetWithResourceResult The response from the
     *         AssociateBudgetWithResource service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateBudgetWithResourceResult associateBudgetWithResource(
            AssociateBudgetWithResourceRequest associateBudgetWithResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateBudgetWithResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateBudgetWithResourceRequest> request = null;
        Response<AssociateBudgetWithResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateBudgetWithResourceRequestMarshaller()
                        .marshall(associateBudgetWithResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateBudgetWithResourceResult, JsonUnmarshallerContext> unmarshaller = new AssociateBudgetWithResourceResultJsonUnmarshaller();
            JsonResponseHandler<AssociateBudgetWithResourceResult> responseHandler = new JsonResponseHandler<AssociateBudgetWithResourceResult>(
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
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @return associatePrincipalWithPortfolioResult The response from the
     *         AssociatePrincipalWithPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociatePrincipalWithPortfolioResult associatePrincipalWithPortfolio(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associatePrincipalWithPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePrincipalWithPortfolioRequest> request = null;
        Response<AssociatePrincipalWithPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePrincipalWithPortfolioRequestMarshaller()
                        .marshall(associatePrincipalWithPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociatePrincipalWithPortfolioResult, JsonUnmarshallerContext> unmarshaller = new AssociatePrincipalWithPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<AssociatePrincipalWithPortfolioResult> responseHandler = new JsonResponseHandler<AssociatePrincipalWithPortfolioResult>(
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
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return associateProductWithPortfolioResult The response from the
     *         AssociateProductWithPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateProductWithPortfolioResult associateProductWithPortfolio(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateProductWithPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateProductWithPortfolioRequest> request = null;
        Response<AssociateProductWithPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateProductWithPortfolioRequestMarshaller()
                        .marshall(associateProductWithPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateProductWithPortfolioResult, JsonUnmarshallerContext> unmarshaller = new AssociateProductWithPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<AssociateProductWithPortfolioResult> responseHandler = new JsonResponseHandler<AssociateProductWithPortfolioResult>(
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
     * Associates a self-service action with a provisioning artifact.
     * </p>
     * 
     * @param associateServiceActionWithProvisioningArtifactRequest
     * @return associateServiceActionWithProvisioningArtifactResult The response
     *         from the AssociateServiceActionWithProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateServiceActionWithProvisioningArtifactResult associateServiceActionWithProvisioningArtifact(
            AssociateServiceActionWithProvisioningArtifactRequest associateServiceActionWithProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateServiceActionWithProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateServiceActionWithProvisioningArtifactRequest> request = null;
        Response<AssociateServiceActionWithProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateServiceActionWithProvisioningArtifactRequestMarshaller()
                        .marshall(associateServiceActionWithProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateServiceActionWithProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new AssociateServiceActionWithProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<AssociateServiceActionWithProvisioningArtifactResult> responseHandler = new JsonResponseHandler<AssociateServiceActionWithProvisioningArtifactResult>(
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
     * Associate the specified TagOption with the specified portfolio or
     * product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @return associateTagOptionWithResourceResult The response from the
     *         AssociateTagOptionWithResource service method, as returned by AWS
     *         Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateTagOptionWithResourceResult associateTagOptionWithResource(
            AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateTagOptionWithResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTagOptionWithResourceRequest> request = null;
        Response<AssociateTagOptionWithResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTagOptionWithResourceRequestMarshaller()
                        .marshall(associateTagOptionWithResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateTagOptionWithResourceResult, JsonUnmarshallerContext> unmarshaller = new AssociateTagOptionWithResourceResultJsonUnmarshaller();
            JsonResponseHandler<AssociateTagOptionWithResourceResult> responseHandler = new JsonResponseHandler<AssociateTagOptionWithResourceResult>(
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
     * Associates multiple self-service actions with provisioning artifacts.
     * </p>
     * 
     * @param batchAssociateServiceActionWithProvisioningArtifactRequest
     * @return batchAssociateServiceActionWithProvisioningArtifactResult The
     *         response from the
     *         BatchAssociateServiceActionWithProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchAssociateServiceActionWithProvisioningArtifactResult batchAssociateServiceActionWithProvisioningArtifact(
            BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchAssociateServiceActionWithProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateServiceActionWithProvisioningArtifactRequest> request = null;
        Response<BatchAssociateServiceActionWithProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller()
                        .marshall(batchAssociateServiceActionWithProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchAssociateServiceActionWithProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new BatchAssociateServiceActionWithProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<BatchAssociateServiceActionWithProvisioningArtifactResult> responseHandler = new JsonResponseHandler<BatchAssociateServiceActionWithProvisioningArtifactResult>(
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
     * Disassociates a batch of self-service actions from the specified
     * provisioning artifact.
     * </p>
     * 
     * @param batchDisassociateServiceActionFromProvisioningArtifactRequest
     * @return batchDisassociateServiceActionFromProvisioningArtifactResult The
     *         response from the
     *         BatchDisassociateServiceActionFromProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactResult batchDisassociateServiceActionFromProvisioningArtifact(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest batchDisassociateServiceActionFromProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDisassociateServiceActionFromProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateServiceActionFromProvisioningArtifactRequest> request = null;
        Response<BatchDisassociateServiceActionFromProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateServiceActionFromProvisioningArtifactRequestMarshaller()
                        .marshall(batchDisassociateServiceActionFromProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDisassociateServiceActionFromProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new BatchDisassociateServiceActionFromProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<BatchDisassociateServiceActionFromProvisioningArtifactResult> responseHandler = new JsonResponseHandler<BatchDisassociateServiceActionFromProvisioningArtifactResult>(
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
     * Copies the specified source product to the specified target product or a
     * new product.
     * </p>
     * <p>
     * You can copy a product to the same account or another account. You can
     * copy a product to the same region or another region.
     * </p>
     * <p>
     * This operation is performed asynchronously. To track the progress of the
     * operation, use <a>DescribeCopyProductStatus</a>.
     * </p>
     * 
     * @param copyProductRequest
     * @return copyProductResult The response from the CopyProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CopyProductResult copyProduct(CopyProductRequest copyProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyProductRequest> request = null;
        Response<CopyProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyProductRequestMarshaller().marshall(copyProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CopyProductResult, JsonUnmarshallerContext> unmarshaller = new CopyProductResultJsonUnmarshaller();
            JsonResponseHandler<CopyProductResult> responseHandler = new JsonResponseHandler<CopyProductResult>(
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
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return createConstraintResult The response from the CreateConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateConstraintResult createConstraint(CreateConstraintRequest createConstraintRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConstraintRequest> request = null;
        Response<CreateConstraintResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConstraintRequestMarshaller().marshall(createConstraintRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateConstraintResult, JsonUnmarshallerContext> unmarshaller = new CreateConstraintResultJsonUnmarshaller();
            JsonResponseHandler<CreateConstraintResult> responseHandler = new JsonResponseHandler<CreateConstraintResult>(
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
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return createPortfolioResult The response from the CreatePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreatePortfolioResult createPortfolio(CreatePortfolioRequest createPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortfolioRequest> request = null;
        Response<CreatePortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortfolioRequestMarshaller().marshall(createPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePortfolioResult, JsonUnmarshallerContext> unmarshaller = new CreatePortfolioResultJsonUnmarshaller();
            JsonResponseHandler<CreatePortfolioResult> responseHandler = new JsonResponseHandler<CreatePortfolioResult>(
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
     * Shares the specified portfolio with the specified account or organization
     * node. Shares to an organization node can only be created by the master
     * account of an Organization. AWSOrganizationsAccess must be enabled in
     * order to create a portfolio share to an organization node.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return createPortfolioShareResult The response from the
     *         CreatePortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreatePortfolioShareResult createPortfolioShare(
            CreatePortfolioShareRequest createPortfolioShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortfolioShareRequest> request = null;
        Response<CreatePortfolioShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortfolioShareRequestMarshaller()
                        .marshall(createPortfolioShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePortfolioShareResult, JsonUnmarshallerContext> unmarshaller = new CreatePortfolioShareResultJsonUnmarshaller();
            JsonResponseHandler<CreatePortfolioShareResult> responseHandler = new JsonResponseHandler<CreatePortfolioShareResult>(
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
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @return createProductResult The response from the CreateProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateProductResult createProduct(CreateProductRequest createProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProductRequest> request = null;
        Response<CreateProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProductRequestMarshaller().marshall(createProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProductResult, JsonUnmarshallerContext> unmarshaller = new CreateProductResultJsonUnmarshaller();
            JsonResponseHandler<CreateProductResult> responseHandler = new JsonResponseHandler<CreateProductResult>(
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
     * Creates a plan. A plan includes the list of resources to be created (when
     * provisioning a new product) or modified (when updating a provisioned
     * product) when the plan is executed.
     * </p>
     * <p>
     * You can create one plan per provisioned product. To create a plan for an
     * existing provisioned product, the product status must be AVAILBLE or
     * TAINTED.
     * </p>
     * <p>
     * To view the resource changes in the change set, use
     * <a>DescribeProvisionedProductPlan</a>. To create or modify the
     * provisioned product, use <a>ExecuteProvisionedProductPlan</a>.
     * </p>
     * 
     * @param createProvisionedProductPlanRequest
     * @return createProvisionedProductPlanResult The response from the
     *         CreateProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateProvisionedProductPlanResult createProvisionedProductPlan(
            CreateProvisionedProductPlanRequest createProvisionedProductPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProvisionedProductPlanRequest> request = null;
        Response<CreateProvisionedProductPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProvisionedProductPlanRequestMarshaller()
                        .marshall(createProvisionedProductPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProvisionedProductPlanResult, JsonUnmarshallerContext> unmarshaller = new CreateProvisionedProductPlanResultJsonUnmarshaller();
            JsonResponseHandler<CreateProvisionedProductPlanResult> responseHandler = new JsonResponseHandler<CreateProvisionedProductPlanResult>(
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
     * Creates a provisioning artifact (also known as a version) for the
     * specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared
     * with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return createProvisioningArtifactResult The response from the
     *         CreateProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateProvisioningArtifactResult createProvisioningArtifact(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProvisioningArtifactRequest> request = null;
        Response<CreateProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProvisioningArtifactRequestMarshaller()
                        .marshall(createProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new CreateProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<CreateProvisioningArtifactResult> responseHandler = new JsonResponseHandler<CreateProvisioningArtifactResult>(
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
     * Creates a self-service action.
     * </p>
     * 
     * @param createServiceActionRequest
     * @return createServiceActionResult The response from the
     *         CreateServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateServiceActionResult createServiceAction(
            CreateServiceActionRequest createServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceActionRequest> request = null;
        Response<CreateServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceActionRequestMarshaller()
                        .marshall(createServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateServiceActionResult, JsonUnmarshallerContext> unmarshaller = new CreateServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<CreateServiceActionResult> responseHandler = new JsonResponseHandler<CreateServiceActionResult>(
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
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @return createTagOptionResult The response from the CreateTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateTagOptionResult createTagOption(CreateTagOptionRequest createTagOptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagOptionRequest> request = null;
        Response<CreateTagOptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagOptionRequestMarshaller().marshall(createTagOptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTagOptionResult, JsonUnmarshallerContext> unmarshaller = new CreateTagOptionResultJsonUnmarshaller();
            JsonResponseHandler<CreateTagOptionResult> responseHandler = new JsonResponseHandler<CreateTagOptionResult>(
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
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return deleteConstraintResult The response from the DeleteConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteConstraintResult deleteConstraint(DeleteConstraintRequest deleteConstraintRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConstraintRequest> request = null;
        Response<DeleteConstraintResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConstraintRequestMarshaller().marshall(deleteConstraintRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteConstraintResult, JsonUnmarshallerContext> unmarshaller = new DeleteConstraintResultJsonUnmarshaller();
            JsonResponseHandler<DeleteConstraintResult> responseHandler = new JsonResponseHandler<DeleteConstraintResult>(
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
     * Deletes the specified portfolio.
     * </p>
     * <p>
     * You cannot delete a portfolio if it was shared with you or if it has
     * associated products, users, constraints, or shared accounts.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return deletePortfolioResult The response from the DeletePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws ResourceInUseException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeletePortfolioResult deletePortfolio(DeletePortfolioRequest deletePortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortfolioRequest> request = null;
        Response<DeletePortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortfolioRequestMarshaller().marshall(deletePortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePortfolioResult, JsonUnmarshallerContext> unmarshaller = new DeletePortfolioResultJsonUnmarshaller();
            JsonResponseHandler<DeletePortfolioResult> responseHandler = new JsonResponseHandler<DeletePortfolioResult>(
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
     * Stops sharing the specified portfolio with the specified account or
     * organization node. Shares to an organization node can only be deleted by
     * the master account of an Organization.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return deletePortfolioShareResult The response from the
     *         DeletePortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeletePortfolioShareResult deletePortfolioShare(
            DeletePortfolioShareRequest deletePortfolioShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortfolioShareRequest> request = null;
        Response<DeletePortfolioShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortfolioShareRequestMarshaller()
                        .marshall(deletePortfolioShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePortfolioShareResult, JsonUnmarshallerContext> unmarshaller = new DeletePortfolioShareResultJsonUnmarshaller();
            JsonResponseHandler<DeletePortfolioShareResult> responseHandler = new JsonResponseHandler<DeletePortfolioShareResult>(
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
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated
     * with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return deleteProductResult The response from the DeleteProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProductRequest> request = null;
        Response<DeleteProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProductRequestMarshaller().marshall(deleteProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProductResult, JsonUnmarshallerContext> unmarshaller = new DeleteProductResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProductResult> responseHandler = new JsonResponseHandler<DeleteProductResult>(
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
     * Deletes the specified plan.
     * </p>
     * 
     * @param deleteProvisionedProductPlanRequest
     * @return deleteProvisionedProductPlanResult The response from the
     *         DeleteProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteProvisionedProductPlanResult deleteProvisionedProductPlan(
            DeleteProvisionedProductPlanRequest deleteProvisionedProductPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisionedProductPlanRequest> request = null;
        Response<DeleteProvisionedProductPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisionedProductPlanRequestMarshaller()
                        .marshall(deleteProvisionedProductPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProvisionedProductPlanResult, JsonUnmarshallerContext> unmarshaller = new DeleteProvisionedProductPlanResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProvisionedProductPlanResult> responseHandler = new JsonResponseHandler<DeleteProvisionedProductPlanResult>(
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
     * Deletes the specified provisioning artifact (also known as a version) for
     * the specified product.
     * </p>
     * <p>
     * You cannot delete a provisioning artifact associated with a product that
     * was shared with you. You cannot delete the last provisioning artifact for
     * a product, because a product must have at least one provisioning
     * artifact.
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return deleteProvisioningArtifactResult The response from the
     *         DeleteProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteProvisioningArtifactResult deleteProvisioningArtifact(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisioningArtifactRequest> request = null;
        Response<DeleteProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisioningArtifactRequestMarshaller()
                        .marshall(deleteProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new DeleteProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProvisioningArtifactResult> responseHandler = new JsonResponseHandler<DeleteProvisioningArtifactResult>(
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
     * Deletes a self-service action.
     * </p>
     * 
     * @param deleteServiceActionRequest
     * @return deleteServiceActionResult The response from the
     *         DeleteServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteServiceActionResult deleteServiceAction(
            DeleteServiceActionRequest deleteServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceActionRequest> request = null;
        Response<DeleteServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceActionRequestMarshaller()
                        .marshall(deleteServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteServiceActionResult, JsonUnmarshallerContext> unmarshaller = new DeleteServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteServiceActionResult> responseHandler = new JsonResponseHandler<DeleteServiceActionResult>(
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
     * Deletes the specified TagOption.
     * </p>
     * <p>
     * You cannot delete a TagOption if it is associated with a product or
     * portfolio.
     * </p>
     * 
     * @param deleteTagOptionRequest
     * @return deleteTagOptionResult The response from the DeleteTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteTagOptionResult deleteTagOption(DeleteTagOptionRequest deleteTagOptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagOptionRequest> request = null;
        Response<DeleteTagOptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagOptionRequestMarshaller().marshall(deleteTagOptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTagOptionResult, JsonUnmarshallerContext> unmarshaller = new DeleteTagOptionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTagOptionResult> responseHandler = new JsonResponseHandler<DeleteTagOptionResult>(
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
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return describeConstraintResult The response from the DescribeConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeConstraintResult describeConstraint(
            DescribeConstraintRequest describeConstraintRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConstraintRequest> request = null;
        Response<DescribeConstraintResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConstraintRequestMarshaller()
                        .marshall(describeConstraintRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConstraintResult, JsonUnmarshallerContext> unmarshaller = new DescribeConstraintResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConstraintResult> responseHandler = new JsonResponseHandler<DescribeConstraintResult>(
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
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @return describeCopyProductStatusResult The response from the
     *         DescribeCopyProductStatus service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeCopyProductStatusResult describeCopyProductStatus(
            DescribeCopyProductStatusRequest describeCopyProductStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCopyProductStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCopyProductStatusRequest> request = null;
        Response<DescribeCopyProductStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCopyProductStatusRequestMarshaller()
                        .marshall(describeCopyProductStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCopyProductStatusResult, JsonUnmarshallerContext> unmarshaller = new DescribeCopyProductStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCopyProductStatusResult> responseHandler = new JsonResponseHandler<DescribeCopyProductStatusResult>(
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
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return describePortfolioResult The response from the DescribePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribePortfolioResult describePortfolio(
            DescribePortfolioRequest describePortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortfolioRequest> request = null;
        Response<DescribePortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortfolioRequestMarshaller()
                        .marshall(describePortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePortfolioResult, JsonUnmarshallerContext> unmarshaller = new DescribePortfolioResultJsonUnmarshaller();
            JsonResponseHandler<DescribePortfolioResult> responseHandler = new JsonResponseHandler<DescribePortfolioResult>(
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
     * Gets the status of the specified portfolio share operation. This API can
     * only be called by the master account in the organization.
     * </p>
     * 
     * @param describePortfolioShareStatusRequest
     * @return describePortfolioShareStatusResult The response from the
     *         DescribePortfolioShareStatus service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribePortfolioShareStatusResult describePortfolioShareStatus(
            DescribePortfolioShareStatusRequest describePortfolioShareStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePortfolioShareStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortfolioShareStatusRequest> request = null;
        Response<DescribePortfolioShareStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortfolioShareStatusRequestMarshaller()
                        .marshall(describePortfolioShareStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePortfolioShareStatusResult, JsonUnmarshallerContext> unmarshaller = new DescribePortfolioShareStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribePortfolioShareStatusResult> responseHandler = new JsonResponseHandler<DescribePortfolioShareStatusResult>(
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
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @return describeProductResult The response from the DescribeProduct
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProductResult describeProduct(DescribeProductRequest describeProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductRequest> request = null;
        Response<DescribeProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductRequestMarshaller().marshall(describeProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProductResult, JsonUnmarshallerContext> unmarshaller = new DescribeProductResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProductResult> responseHandler = new JsonResponseHandler<DescribeProductResult>(
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
     * Gets information about the specified product. This operation is run with
     * administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return describeProductAsAdminResult The response from the
     *         DescribeProductAsAdmin service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProductAsAdminResult describeProductAsAdmin(
            DescribeProductAsAdminRequest describeProductAsAdminRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProductAsAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductAsAdminRequest> request = null;
        Response<DescribeProductAsAdminResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductAsAdminRequestMarshaller()
                        .marshall(describeProductAsAdminRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProductAsAdminResult, JsonUnmarshallerContext> unmarshaller = new DescribeProductAsAdminResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProductAsAdminResult> responseHandler = new JsonResponseHandler<DescribeProductAsAdminResult>(
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
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return describeProductViewResult The response from the
     *         DescribeProductView service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProductViewResult describeProductView(
            DescribeProductViewRequest describeProductViewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProductViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductViewRequest> request = null;
        Response<DescribeProductViewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductViewRequestMarshaller()
                        .marshall(describeProductViewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProductViewResult, JsonUnmarshallerContext> unmarshaller = new DescribeProductViewResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProductViewResult> responseHandler = new JsonResponseHandler<DescribeProductViewResult>(
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
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @return describeProvisionedProductResult The response from the
     *         DescribeProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProvisionedProductResult describeProvisionedProduct(
            DescribeProvisionedProductRequest describeProvisionedProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisionedProductRequest> request = null;
        Response<DescribeProvisionedProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisionedProductRequestMarshaller()
                        .marshall(describeProvisionedProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProvisionedProductResult, JsonUnmarshallerContext> unmarshaller = new DescribeProvisionedProductResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProvisionedProductResult> responseHandler = new JsonResponseHandler<DescribeProvisionedProductResult>(
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
     * Gets information about the resource changes for the specified plan.
     * </p>
     * 
     * @param describeProvisionedProductPlanRequest
     * @return describeProvisionedProductPlanResult The response from the
     *         DescribeProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProvisionedProductPlanResult describeProvisionedProductPlan(
            DescribeProvisionedProductPlanRequest describeProvisionedProductPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisionedProductPlanRequest> request = null;
        Response<DescribeProvisionedProductPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisionedProductPlanRequestMarshaller()
                        .marshall(describeProvisionedProductPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProvisionedProductPlanResult, JsonUnmarshallerContext> unmarshaller = new DescribeProvisionedProductPlanResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProvisionedProductPlanResult> responseHandler = new JsonResponseHandler<DescribeProvisionedProductPlanResult>(
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
     * Gets information about the specified provisioning artifact (also known as
     * a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return describeProvisioningArtifactResult The response from the
     *         DescribeProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProvisioningArtifactResult describeProvisioningArtifact(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisioningArtifactRequest> request = null;
        Response<DescribeProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisioningArtifactRequestMarshaller()
                        .marshall(describeProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new DescribeProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProvisioningArtifactResult> responseHandler = new JsonResponseHandler<DescribeProvisioningArtifactResult>(
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
     * Gets information about the configuration required to provision the
     * specified product using the specified provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values,
     * there is a TagOption conflict for that key. The end user cannot take
     * action to fix the conflict, and launch is not blocked. In subsequent
     * calls to <a>ProvisionProduct</a>, do not include conflicted TagOption
     * keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>"
     * . Tag the provisioned product with the value
     * <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return describeProvisioningParametersResult The response from the
     *         DescribeProvisioningParameters service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeProvisioningParametersResult describeProvisioningParameters(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProvisioningParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisioningParametersRequest> request = null;
        Response<DescribeProvisioningParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisioningParametersRequestMarshaller()
                        .marshall(describeProvisioningParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProvisioningParametersResult, JsonUnmarshallerContext> unmarshaller = new DescribeProvisioningParametersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProvisioningParametersResult> responseHandler = new JsonResponseHandler<DescribeProvisioningParametersResult>(
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
     * Gets information about the specified request operation.
     * </p>
     * <p>
     * Use this operation after calling a request operation (for example,
     * <a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or
     * <a>UpdateProvisionedProduct</a>).
     * </p>
     * <note>
     * <p>
     * If a provisioned product was transferred to a new owner using
     * <a>UpdateProvisionedProductProperties</a>, the new owner will be able to
     * describe all past records for that product. The previous owner will no
     * longer be able to describe the records, but will be able to use
     * <a>ListRecordHistory</a> to see the product's history from when he was
     * the owner.
     * </p>
     * </note>
     * 
     * @param describeRecordRequest
     * @return describeRecordResult The response from the DescribeRecord service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeRecordResult describeRecord(DescribeRecordRequest describeRecordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecordRequest> request = null;
        Response<DescribeRecordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecordRequestMarshaller().marshall(describeRecordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRecordResult, JsonUnmarshallerContext> unmarshaller = new DescribeRecordResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRecordResult> responseHandler = new JsonResponseHandler<DescribeRecordResult>(
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
     * Describes a self-service action.
     * </p>
     * 
     * @param describeServiceActionRequest
     * @return describeServiceActionResult The response from the
     *         DescribeServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeServiceActionResult describeServiceAction(
            DescribeServiceActionRequest describeServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceActionRequest> request = null;
        Response<DescribeServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceActionRequestMarshaller()
                        .marshall(describeServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServiceActionResult, JsonUnmarshallerContext> unmarshaller = new DescribeServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServiceActionResult> responseHandler = new JsonResponseHandler<DescribeServiceActionResult>(
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
     * Finds the default parameters for a specific self-service action on a
     * specific provisioned product and returns a map of the results to the
     * user.
     * </p>
     * 
     * @param describeServiceActionExecutionParametersRequest
     * @return describeServiceActionExecutionParametersResult The response from
     *         the DescribeServiceActionExecutionParameters service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeServiceActionExecutionParametersResult describeServiceActionExecutionParameters(
            DescribeServiceActionExecutionParametersRequest describeServiceActionExecutionParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeServiceActionExecutionParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceActionExecutionParametersRequest> request = null;
        Response<DescribeServiceActionExecutionParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceActionExecutionParametersRequestMarshaller()
                        .marshall(describeServiceActionExecutionParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServiceActionExecutionParametersResult, JsonUnmarshallerContext> unmarshaller = new DescribeServiceActionExecutionParametersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServiceActionExecutionParametersResult> responseHandler = new JsonResponseHandler<DescribeServiceActionExecutionParametersResult>(
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
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @return describeTagOptionResult The response from the DescribeTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTagOptionResult describeTagOption(
            DescribeTagOptionRequest describeTagOptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagOptionRequest> request = null;
        Response<DescribeTagOptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagOptionRequestMarshaller()
                        .marshall(describeTagOptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTagOptionResult, JsonUnmarshallerContext> unmarshaller = new DescribeTagOptionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTagOptionResult> responseHandler = new JsonResponseHandler<DescribeTagOptionResult>(
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
     * Disable portfolio sharing through AWS Organizations feature. This feature
     * will not delete your current shares but it will prevent you from creating
     * new shares throughout your organization. Current shares will not be in
     * sync with your organization structure if it changes after calling this
     * API. This API can only be called by the master account in the
     * organization.
     * </p>
     * 
     * @param disableAWSOrganizationsAccessRequest
     * @return disableAWSOrganizationsAccessResult The response from the
     *         DisableAWSOrganizationsAccess service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisableAWSOrganizationsAccessResult disableAWSOrganizationsAccess(
            DisableAWSOrganizationsAccessRequest disableAWSOrganizationsAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableAWSOrganizationsAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAWSOrganizationsAccessRequest> request = null;
        Response<DisableAWSOrganizationsAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAWSOrganizationsAccessRequestMarshaller()
                        .marshall(disableAWSOrganizationsAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableAWSOrganizationsAccessResult, JsonUnmarshallerContext> unmarshaller = new DisableAWSOrganizationsAccessResultJsonUnmarshaller();
            JsonResponseHandler<DisableAWSOrganizationsAccessResult> responseHandler = new JsonResponseHandler<DisableAWSOrganizationsAccessResult>(
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
     * Disassociates the specified budget from the specified resource.
     * </p>
     * 
     * @param disassociateBudgetFromResourceRequest
     * @return disassociateBudgetFromResourceResult The response from the
     *         DisassociateBudgetFromResource service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateBudgetFromResourceResult disassociateBudgetFromResource(
            DisassociateBudgetFromResourceRequest disassociateBudgetFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateBudgetFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateBudgetFromResourceRequest> request = null;
        Response<DisassociateBudgetFromResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateBudgetFromResourceRequestMarshaller()
                        .marshall(disassociateBudgetFromResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateBudgetFromResourceResult, JsonUnmarshallerContext> unmarshaller = new DisassociateBudgetFromResourceResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateBudgetFromResourceResult> responseHandler = new JsonResponseHandler<DisassociateBudgetFromResourceResult>(
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
     * Disassociates a previously associated principal ARN from a specified
     * portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return disassociatePrincipalFromPortfolioResult The response from the
     *         DisassociatePrincipalFromPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociatePrincipalFromPortfolioResult disassociatePrincipalFromPortfolio(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociatePrincipalFromPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePrincipalFromPortfolioRequest> request = null;
        Response<DisassociatePrincipalFromPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePrincipalFromPortfolioRequestMarshaller()
                        .marshall(disassociatePrincipalFromPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociatePrincipalFromPortfolioResult, JsonUnmarshallerContext> unmarshaller = new DisassociatePrincipalFromPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<DisassociatePrincipalFromPortfolioResult> responseHandler = new JsonResponseHandler<DisassociatePrincipalFromPortfolioResult>(
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
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @return disassociateProductFromPortfolioResult The response from the
     *         DisassociateProductFromPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateProductFromPortfolioResult disassociateProductFromPortfolio(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateProductFromPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateProductFromPortfolioRequest> request = null;
        Response<DisassociateProductFromPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateProductFromPortfolioRequestMarshaller()
                        .marshall(disassociateProductFromPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateProductFromPortfolioResult, JsonUnmarshallerContext> unmarshaller = new DisassociateProductFromPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateProductFromPortfolioResult> responseHandler = new JsonResponseHandler<DisassociateProductFromPortfolioResult>(
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
     * Disassociates the specified self-service action association from the
     * specified provisioning artifact.
     * </p>
     * 
     * @param disassociateServiceActionFromProvisioningArtifactRequest
     * @return disassociateServiceActionFromProvisioningArtifactResult The
     *         response from the
     *         DisassociateServiceActionFromProvisioningArtifact service method,
     *         as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateServiceActionFromProvisioningArtifactResult disassociateServiceActionFromProvisioningArtifact(
            DisassociateServiceActionFromProvisioningArtifactRequest disassociateServiceActionFromProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateServiceActionFromProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateServiceActionFromProvisioningArtifactRequest> request = null;
        Response<DisassociateServiceActionFromProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateServiceActionFromProvisioningArtifactRequestMarshaller()
                        .marshall(disassociateServiceActionFromProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateServiceActionFromProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new DisassociateServiceActionFromProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateServiceActionFromProvisioningArtifactResult> responseHandler = new JsonResponseHandler<DisassociateServiceActionFromProvisioningArtifactResult>(
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
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @return disassociateTagOptionFromResourceResult The response from the
     *         DisassociateTagOptionFromResource service method, as returned by
     *         AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateTagOptionFromResourceResult disassociateTagOptionFromResource(
            DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateTagOptionFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTagOptionFromResourceRequest> request = null;
        Response<DisassociateTagOptionFromResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTagOptionFromResourceRequestMarshaller()
                        .marshall(disassociateTagOptionFromResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateTagOptionFromResourceResult, JsonUnmarshallerContext> unmarshaller = new DisassociateTagOptionFromResourceResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateTagOptionFromResourceResult> responseHandler = new JsonResponseHandler<DisassociateTagOptionFromResourceResult>(
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
     * Enable portfolio sharing feature through AWS Organizations. This API will
     * allow Service Catalog to receive updates on your organization in order to
     * sync your shares with the current structure. This API can only be called
     * by the master account in the organization.
     * </p>
     * <p>
     * By calling this API Service Catalog will make a call to
     * organizations:EnableAWSServiceAccess on your behalf so that your shares
     * can be in sync with any changes in your AWS Organizations structure.
     * </p>
     * 
     * @param enableAWSOrganizationsAccessRequest
     * @return enableAWSOrganizationsAccessResult The response from the
     *         EnableAWSOrganizationsAccess service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnableAWSOrganizationsAccessResult enableAWSOrganizationsAccess(
            EnableAWSOrganizationsAccessRequest enableAWSOrganizationsAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAWSOrganizationsAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAWSOrganizationsAccessRequest> request = null;
        Response<EnableAWSOrganizationsAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAWSOrganizationsAccessRequestMarshaller()
                        .marshall(enableAWSOrganizationsAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableAWSOrganizationsAccessResult, JsonUnmarshallerContext> unmarshaller = new EnableAWSOrganizationsAccessResultJsonUnmarshaller();
            JsonResponseHandler<EnableAWSOrganizationsAccessResult> responseHandler = new JsonResponseHandler<EnableAWSOrganizationsAccessResult>(
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
     * Provisions or modifies a product based on the resource changes for the
     * specified plan.
     * </p>
     * 
     * @param executeProvisionedProductPlanRequest
     * @return executeProvisionedProductPlanResult The response from the
     *         ExecuteProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ExecuteProvisionedProductPlanResult executeProvisionedProductPlan(
            ExecuteProvisionedProductPlanRequest executeProvisionedProductPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(executeProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteProvisionedProductPlanRequest> request = null;
        Response<ExecuteProvisionedProductPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteProvisionedProductPlanRequestMarshaller()
                        .marshall(executeProvisionedProductPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExecuteProvisionedProductPlanResult, JsonUnmarshallerContext> unmarshaller = new ExecuteProvisionedProductPlanResultJsonUnmarshaller();
            JsonResponseHandler<ExecuteProvisionedProductPlanResult> responseHandler = new JsonResponseHandler<ExecuteProvisionedProductPlanResult>(
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
     * Executes a self-service action against a provisioned product.
     * </p>
     * 
     * @param executeProvisionedProductServiceActionRequest
     * @return executeProvisionedProductServiceActionResult The response from
     *         the ExecuteProvisionedProductServiceAction service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ExecuteProvisionedProductServiceActionResult executeProvisionedProductServiceAction(
            ExecuteProvisionedProductServiceActionRequest executeProvisionedProductServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(executeProvisionedProductServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteProvisionedProductServiceActionRequest> request = null;
        Response<ExecuteProvisionedProductServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteProvisionedProductServiceActionRequestMarshaller()
                        .marshall(executeProvisionedProductServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExecuteProvisionedProductServiceActionResult, JsonUnmarshallerContext> unmarshaller = new ExecuteProvisionedProductServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<ExecuteProvisionedProductServiceActionResult> responseHandler = new JsonResponseHandler<ExecuteProvisionedProductServiceActionResult>(
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
     * Get the Access Status for AWS Organization portfolio share feature. This
     * API can only be called by the master account in the organization.
     * </p>
     * 
     * @param getAWSOrganizationsAccessStatusRequest
     * @return getAWSOrganizationsAccessStatusResult The response from the
     *         GetAWSOrganizationsAccessStatus service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetAWSOrganizationsAccessStatusResult getAWSOrganizationsAccessStatus(
            GetAWSOrganizationsAccessStatusRequest getAWSOrganizationsAccessStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAWSOrganizationsAccessStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAWSOrganizationsAccessStatusRequest> request = null;
        Response<GetAWSOrganizationsAccessStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAWSOrganizationsAccessStatusRequestMarshaller()
                        .marshall(getAWSOrganizationsAccessStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAWSOrganizationsAccessStatusResult, JsonUnmarshallerContext> unmarshaller = new GetAWSOrganizationsAccessStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetAWSOrganizationsAccessStatusResult> responseHandler = new JsonResponseHandler<GetAWSOrganizationsAccessStatusResult>(
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
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return listAcceptedPortfolioSharesResult The response from the
     *         ListAcceptedPortfolioShares service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListAcceptedPortfolioSharesResult listAcceptedPortfolioShares(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAcceptedPortfolioSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAcceptedPortfolioSharesRequest> request = null;
        Response<ListAcceptedPortfolioSharesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAcceptedPortfolioSharesRequestMarshaller()
                        .marshall(listAcceptedPortfolioSharesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAcceptedPortfolioSharesResult, JsonUnmarshallerContext> unmarshaller = new ListAcceptedPortfolioSharesResultJsonUnmarshaller();
            JsonResponseHandler<ListAcceptedPortfolioSharesResult> responseHandler = new JsonResponseHandler<ListAcceptedPortfolioSharesResult>(
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
     * Lists all the budgets associated to the specified resource.
     * </p>
     * 
     * @param listBudgetsForResourceRequest
     * @return listBudgetsForResourceResult The response from the
     *         ListBudgetsForResource service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListBudgetsForResourceResult listBudgetsForResource(
            ListBudgetsForResourceRequest listBudgetsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBudgetsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBudgetsForResourceRequest> request = null;
        Response<ListBudgetsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBudgetsForResourceRequestMarshaller()
                        .marshall(listBudgetsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBudgetsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListBudgetsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListBudgetsForResourceResult> responseHandler = new JsonResponseHandler<ListBudgetsForResourceResult>(
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
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return listConstraintsForPortfolioResult The response from the
     *         ListConstraintsForPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListConstraintsForPortfolioResult listConstraintsForPortfolio(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listConstraintsForPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConstraintsForPortfolioRequest> request = null;
        Response<ListConstraintsForPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConstraintsForPortfolioRequestMarshaller()
                        .marshall(listConstraintsForPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListConstraintsForPortfolioResult, JsonUnmarshallerContext> unmarshaller = new ListConstraintsForPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<ListConstraintsForPortfolioResult> responseHandler = new JsonResponseHandler<ListConstraintsForPortfolioResult>(
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
     * Lists the paths to the specified product. A path is how the user has
     * access to a specified product, and is necessary when provisioning a
     * product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return listLaunchPathsResult The response from the ListLaunchPaths
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest listLaunchPathsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLaunchPathsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLaunchPathsRequest> request = null;
        Response<ListLaunchPathsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLaunchPathsRequestMarshaller().marshall(listLaunchPathsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLaunchPathsResult, JsonUnmarshallerContext> unmarshaller = new ListLaunchPathsResultJsonUnmarshaller();
            JsonResponseHandler<ListLaunchPathsResult> responseHandler = new JsonResponseHandler<ListLaunchPathsResult>(
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
     * Lists the organization nodes that have access to the specified portfolio.
     * This API can only be called by the master account in the organization.
     * </p>
     * 
     * @param listOrganizationPortfolioAccessRequest
     * @return listOrganizationPortfolioAccessResult The response from the
     *         ListOrganizationPortfolioAccess service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListOrganizationPortfolioAccessResult listOrganizationPortfolioAccess(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOrganizationPortfolioAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationPortfolioAccessRequest> request = null;
        Response<ListOrganizationPortfolioAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationPortfolioAccessRequestMarshaller()
                        .marshall(listOrganizationPortfolioAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOrganizationPortfolioAccessResult, JsonUnmarshallerContext> unmarshaller = new ListOrganizationPortfolioAccessResultJsonUnmarshaller();
            JsonResponseHandler<ListOrganizationPortfolioAccessResult> responseHandler = new JsonResponseHandler<ListOrganizationPortfolioAccessResult>(
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
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return listPortfolioAccessResult The response from the
     *         ListPortfolioAccess service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPortfolioAccessResult listPortfolioAccess(
            ListPortfolioAccessRequest listPortfolioAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPortfolioAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfolioAccessRequest> request = null;
        Response<ListPortfolioAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfolioAccessRequestMarshaller()
                        .marshall(listPortfolioAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPortfolioAccessResult, JsonUnmarshallerContext> unmarshaller = new ListPortfolioAccessResultJsonUnmarshaller();
            JsonResponseHandler<ListPortfolioAccessResult> responseHandler = new JsonResponseHandler<ListPortfolioAccessResult>(
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
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @return listPortfoliosResult The response from the ListPortfolios service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPortfoliosResult listPortfolios(ListPortfoliosRequest listPortfoliosRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPortfoliosRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfoliosRequest> request = null;
        Response<ListPortfoliosResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfoliosRequestMarshaller().marshall(listPortfoliosRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPortfoliosResult, JsonUnmarshallerContext> unmarshaller = new ListPortfoliosResultJsonUnmarshaller();
            JsonResponseHandler<ListPortfoliosResult> responseHandler = new JsonResponseHandler<ListPortfoliosResult>(
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
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @return listPortfoliosForProductResult The response from the
     *         ListPortfoliosForProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPortfoliosForProductResult listPortfoliosForProduct(
            ListPortfoliosForProductRequest listPortfoliosForProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPortfoliosForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfoliosForProductRequest> request = null;
        Response<ListPortfoliosForProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfoliosForProductRequestMarshaller()
                        .marshall(listPortfoliosForProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPortfoliosForProductResult, JsonUnmarshallerContext> unmarshaller = new ListPortfoliosForProductResultJsonUnmarshaller();
            JsonResponseHandler<ListPortfoliosForProductResult> responseHandler = new JsonResponseHandler<ListPortfoliosForProductResult>(
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
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @return listPrincipalsForPortfolioResult The response from the
     *         ListPrincipalsForPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPrincipalsForPortfolioResult listPrincipalsForPortfolio(
            ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPrincipalsForPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalsForPortfolioRequest> request = null;
        Response<ListPrincipalsForPortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalsForPortfolioRequestMarshaller()
                        .marshall(listPrincipalsForPortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalsForPortfolioResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalsForPortfolioResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalsForPortfolioResult> responseHandler = new JsonResponseHandler<ListPrincipalsForPortfolioResult>(
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
     * Lists the plans for the specified provisioned product or all plans to
     * which the user has access.
     * </p>
     * 
     * @param listProvisionedProductPlansRequest
     * @return listProvisionedProductPlansResult The response from the
     *         ListProvisionedProductPlans service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListProvisionedProductPlansResult listProvisionedProductPlans(
            ListProvisionedProductPlansRequest listProvisionedProductPlansRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProvisionedProductPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisionedProductPlansRequest> request = null;
        Response<ListProvisionedProductPlansResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisionedProductPlansRequestMarshaller()
                        .marshall(listProvisionedProductPlansRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProvisionedProductPlansResult, JsonUnmarshallerContext> unmarshaller = new ListProvisionedProductPlansResultJsonUnmarshaller();
            JsonResponseHandler<ListProvisionedProductPlansResult> responseHandler = new JsonResponseHandler<ListProvisionedProductPlansResult>(
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
     * Lists all provisioning artifacts (also known as versions) for the
     * specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return listProvisioningArtifactsResult The response from the
     *         ListProvisioningArtifacts service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListProvisioningArtifactsResult listProvisioningArtifacts(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProvisioningArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisioningArtifactsRequest> request = null;
        Response<ListProvisioningArtifactsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisioningArtifactsRequestMarshaller()
                        .marshall(listProvisioningArtifactsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProvisioningArtifactsResult, JsonUnmarshallerContext> unmarshaller = new ListProvisioningArtifactsResultJsonUnmarshaller();
            JsonResponseHandler<ListProvisioningArtifactsResult> responseHandler = new JsonResponseHandler<ListProvisioningArtifactsResult>(
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
     * Lists all provisioning artifacts (also known as versions) for the
     * specified self-service action.
     * </p>
     * 
     * @param listProvisioningArtifactsForServiceActionRequest
     * @return listProvisioningArtifactsForServiceActionResult The response from
     *         the ListProvisioningArtifactsForServiceAction service method, as
     *         returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListProvisioningArtifactsForServiceActionResult listProvisioningArtifactsForServiceAction(
            ListProvisioningArtifactsForServiceActionRequest listProvisioningArtifactsForServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProvisioningArtifactsForServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisioningArtifactsForServiceActionRequest> request = null;
        Response<ListProvisioningArtifactsForServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisioningArtifactsForServiceActionRequestMarshaller()
                        .marshall(listProvisioningArtifactsForServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProvisioningArtifactsForServiceActionResult, JsonUnmarshallerContext> unmarshaller = new ListProvisioningArtifactsForServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<ListProvisioningArtifactsForServiceActionResult> responseHandler = new JsonResponseHandler<ListProvisioningArtifactsForServiceActionResult>(
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
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return listRecordHistoryResult The response from the ListRecordHistory
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListRecordHistoryResult listRecordHistory(
            ListRecordHistoryRequest listRecordHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecordHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecordHistoryRequest> request = null;
        Response<ListRecordHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecordHistoryRequestMarshaller()
                        .marshall(listRecordHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecordHistoryResult, JsonUnmarshallerContext> unmarshaller = new ListRecordHistoryResultJsonUnmarshaller();
            JsonResponseHandler<ListRecordHistoryResult> responseHandler = new JsonResponseHandler<ListRecordHistoryResult>(
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
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @return listResourcesForTagOptionResult The response from the
     *         ListResourcesForTagOption service method, as returned by AWS
     *         Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListResourcesForTagOptionResult listResourcesForTagOption(
            ListResourcesForTagOptionRequest listResourcesForTagOptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourcesForTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesForTagOptionRequest> request = null;
        Response<ListResourcesForTagOptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesForTagOptionRequestMarshaller()
                        .marshall(listResourcesForTagOptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourcesForTagOptionResult, JsonUnmarshallerContext> unmarshaller = new ListResourcesForTagOptionResultJsonUnmarshaller();
            JsonResponseHandler<ListResourcesForTagOptionResult> responseHandler = new JsonResponseHandler<ListResourcesForTagOptionResult>(
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
     * Lists all self-service actions.
     * </p>
     * 
     * @param listServiceActionsRequest
     * @return listServiceActionsResult The response from the ListServiceActions
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListServiceActionsResult listServiceActions(
            ListServiceActionsRequest listServiceActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listServiceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceActionsRequest> request = null;
        Response<ListServiceActionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceActionsRequestMarshaller()
                        .marshall(listServiceActionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListServiceActionsResult, JsonUnmarshallerContext> unmarshaller = new ListServiceActionsResultJsonUnmarshaller();
            JsonResponseHandler<ListServiceActionsResult> responseHandler = new JsonResponseHandler<ListServiceActionsResult>(
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
     * Returns a paginated list of self-service actions associated with the
     * specified Product ID and Provisioning Artifact ID.
     * </p>
     * 
     * @param listServiceActionsForProvisioningArtifactRequest
     * @return listServiceActionsForProvisioningArtifactResult The response from
     *         the ListServiceActionsForProvisioningArtifact service method, as
     *         returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListServiceActionsForProvisioningArtifactResult listServiceActionsForProvisioningArtifact(
            ListServiceActionsForProvisioningArtifactRequest listServiceActionsForProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listServiceActionsForProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceActionsForProvisioningArtifactRequest> request = null;
        Response<ListServiceActionsForProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceActionsForProvisioningArtifactRequestMarshaller()
                        .marshall(listServiceActionsForProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListServiceActionsForProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new ListServiceActionsForProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<ListServiceActionsForProvisioningArtifactResult> responseHandler = new JsonResponseHandler<ListServiceActionsForProvisioningArtifactResult>(
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
     * Returns summary information about stack instances that are associated
     * with the specified <code>CFN_STACKSET</code> type provisioned product.
     * You can filter for stack instances that are associated with a specific
     * AWS account name or region.
     * </p>
     * 
     * @param listStackInstancesForProvisionedProductRequest
     * @return listStackInstancesForProvisionedProductResult The response from
     *         the ListStackInstancesForProvisionedProduct service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStackInstancesForProvisionedProductResult listStackInstancesForProvisionedProduct(
            ListStackInstancesForProvisionedProductRequest listStackInstancesForProvisionedProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStackInstancesForProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackInstancesForProvisionedProductRequest> request = null;
        Response<ListStackInstancesForProvisionedProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackInstancesForProvisionedProductRequestMarshaller()
                        .marshall(listStackInstancesForProvisionedProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStackInstancesForProvisionedProductResult, JsonUnmarshallerContext> unmarshaller = new ListStackInstancesForProvisionedProductResultJsonUnmarshaller();
            JsonResponseHandler<ListStackInstancesForProvisionedProductResult> responseHandler = new JsonResponseHandler<ListStackInstancesForProvisionedProductResult>(
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
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @return listTagOptionsResult The response from the ListTagOptions service
     *         method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTagOptionsResult listTagOptions(ListTagOptionsRequest listTagOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagOptionsRequest> request = null;
        Response<ListTagOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagOptionsRequestMarshaller().marshall(listTagOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagOptionsResult, JsonUnmarshallerContext> unmarshaller = new ListTagOptionsResultJsonUnmarshaller();
            JsonResponseHandler<ListTagOptionsResult> responseHandler = new JsonResponseHandler<ListTagOptionsResult>(
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
     * Provisions the specified product.
     * </p>
     * <p>
     * A provisioned product is a resourced instance of a product. For example,
     * provisioning a product based on a CloudFormation template launches a
     * CloudFormation stack and its underlying resources. You can check the
     * status of this request using <a>DescribeRecord</a>.
     * </p>
     * <p>
     * If the request contains a tag key with an empty list of values, there is
     * a tag conflict for that key. Do not include conflicted keys as tags, or
     * this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>"
     * .
     * </p>
     * 
     * @param provisionProductRequest
     * @return provisionProductResult The response from the ProvisionProduct
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ProvisionProductResult provisionProduct(ProvisionProductRequest provisionProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(provisionProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvisionProductRequest> request = null;
        Response<ProvisionProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvisionProductRequestMarshaller().marshall(provisionProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ProvisionProductResult, JsonUnmarshallerContext> unmarshaller = new ProvisionProductResultJsonUnmarshaller();
            JsonResponseHandler<ProvisionProductResult> responseHandler = new JsonResponseHandler<ProvisionProductResult>(
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
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return rejectPortfolioShareResult The response from the
     *         RejectPortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RejectPortfolioShareResult rejectPortfolioShare(
            RejectPortfolioShareRequest rejectPortfolioShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rejectPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectPortfolioShareRequest> request = null;
        Response<RejectPortfolioShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectPortfolioShareRequestMarshaller()
                        .marshall(rejectPortfolioShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RejectPortfolioShareResult, JsonUnmarshallerContext> unmarshaller = new RejectPortfolioShareResultJsonUnmarshaller();
            JsonResponseHandler<RejectPortfolioShareResult> responseHandler = new JsonResponseHandler<RejectPortfolioShareResult>(
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
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * <p>
     * To use additional filtering, see <a>SearchProvisionedProducts</a>.
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return scanProvisionedProductsResult The response from the
     *         ScanProvisionedProducts service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ScanProvisionedProductsResult scanProvisionedProducts(
            ScanProvisionedProductsRequest scanProvisionedProductsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(scanProvisionedProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScanProvisionedProductsRequest> request = null;
        Response<ScanProvisionedProductsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScanProvisionedProductsRequestMarshaller()
                        .marshall(scanProvisionedProductsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ScanProvisionedProductsResult, JsonUnmarshallerContext> unmarshaller = new ScanProvisionedProductsResultJsonUnmarshaller();
            JsonResponseHandler<ScanProvisionedProductsResult> responseHandler = new JsonResponseHandler<ScanProvisionedProductsResult>(
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
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @return searchProductsResult The response from the SearchProducts service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SearchProductsResult searchProducts(SearchProductsRequest searchProductsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProductsRequest> request = null;
        Response<SearchProductsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProductsRequestMarshaller().marshall(searchProductsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchProductsResult, JsonUnmarshallerContext> unmarshaller = new SearchProductsResultJsonUnmarshaller();
            JsonResponseHandler<SearchProductsResult> responseHandler = new JsonResponseHandler<SearchProductsResult>(
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
     * Gets information about the products for the specified portfolio or all
     * products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return searchProductsAsAdminResult The response from the
     *         SearchProductsAsAdmin service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SearchProductsAsAdminResult searchProductsAsAdmin(
            SearchProductsAsAdminRequest searchProductsAsAdminRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchProductsAsAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProductsAsAdminRequest> request = null;
        Response<SearchProductsAsAdminResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProductsAsAdminRequestMarshaller()
                        .marshall(searchProductsAsAdminRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchProductsAsAdminResult, JsonUnmarshallerContext> unmarshaller = new SearchProductsAsAdminResultJsonUnmarshaller();
            JsonResponseHandler<SearchProductsAsAdminResult> responseHandler = new JsonResponseHandler<SearchProductsAsAdminResult>(
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
     * Gets information about the provisioned products that meet the specified
     * criteria.
     * </p>
     * 
     * @param searchProvisionedProductsRequest
     * @return searchProvisionedProductsResult The response from the
     *         SearchProvisionedProducts service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SearchProvisionedProductsResult searchProvisionedProducts(
            SearchProvisionedProductsRequest searchProvisionedProductsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchProvisionedProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProvisionedProductsRequest> request = null;
        Response<SearchProvisionedProductsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProvisionedProductsRequestMarshaller()
                        .marshall(searchProvisionedProductsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchProvisionedProductsResult, JsonUnmarshallerContext> unmarshaller = new SearchProvisionedProductsResultJsonUnmarshaller();
            JsonResponseHandler<SearchProvisionedProductsResult> responseHandler = new JsonResponseHandler<SearchProvisionedProductsResult>(
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
     * Terminates the specified provisioned product.
     * </p>
     * <p>
     * This operation does not delete any records associated with the
     * provisioned product.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @return terminateProvisionedProductResult The response from the
     *         TerminateProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public TerminateProvisionedProductResult terminateProvisionedProduct(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(terminateProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateProvisionedProductRequest> request = null;
        Response<TerminateProvisionedProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateProvisionedProductRequestMarshaller()
                        .marshall(terminateProvisionedProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TerminateProvisionedProductResult, JsonUnmarshallerContext> unmarshaller = new TerminateProvisionedProductResultJsonUnmarshaller();
            JsonResponseHandler<TerminateProvisionedProductResult> responseHandler = new JsonResponseHandler<TerminateProvisionedProductResult>(
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
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return updateConstraintResult The response from the UpdateConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateConstraintResult updateConstraint(UpdateConstraintRequest updateConstraintRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConstraintRequest> request = null;
        Response<UpdateConstraintResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConstraintRequestMarshaller().marshall(updateConstraintRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateConstraintResult, JsonUnmarshallerContext> unmarshaller = new UpdateConstraintResultJsonUnmarshaller();
            JsonResponseHandler<UpdateConstraintResult> responseHandler = new JsonResponseHandler<UpdateConstraintResult>(
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
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return updatePortfolioResult The response from the UpdatePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdatePortfolioResult updatePortfolio(UpdatePortfolioRequest updatePortfolioRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePortfolioRequest> request = null;
        Response<UpdatePortfolioResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePortfolioRequestMarshaller().marshall(updatePortfolioRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePortfolioResult, JsonUnmarshallerContext> unmarshaller = new UpdatePortfolioResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePortfolioResult> responseHandler = new JsonResponseHandler<UpdatePortfolioResult>(
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
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @return updateProductResult The response from the UpdateProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateProductResult updateProduct(UpdateProductRequest updateProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProductRequest> request = null;
        Response<UpdateProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProductRequestMarshaller().marshall(updateProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProductResult, JsonUnmarshallerContext> unmarshaller = new UpdateProductResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProductResult> responseHandler = new JsonResponseHandler<UpdateProductResult>(
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
     * Requests updates to the configuration of the specified provisioned
     * product.
     * </p>
     * <p>
     * If there are tags associated with the object, they cannot be updated or
     * added. Depending on the specific updates requested, this operation can
     * update with no interruption, with some interruption, or replace the
     * provisioned product entirely.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return updateProvisionedProductResult The response from the
     *         UpdateProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateProvisionedProductResult updateProvisionedProduct(
            UpdateProvisionedProductRequest updateProvisionedProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisionedProductRequest> request = null;
        Response<UpdateProvisionedProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisionedProductRequestMarshaller()
                        .marshall(updateProvisionedProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProvisionedProductResult, JsonUnmarshallerContext> unmarshaller = new UpdateProvisionedProductResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProvisionedProductResult> responseHandler = new JsonResponseHandler<UpdateProvisionedProductResult>(
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
     * Requests updates to the properties of the specified provisioned product.
     * </p>
     * 
     * @param updateProvisionedProductPropertiesRequest
     * @return updateProvisionedProductPropertiesResult The response from the
     *         UpdateProvisionedProductProperties service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateProvisionedProductPropertiesResult updateProvisionedProductProperties(
            UpdateProvisionedProductPropertiesRequest updateProvisionedProductPropertiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProvisionedProductPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisionedProductPropertiesRequest> request = null;
        Response<UpdateProvisionedProductPropertiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisionedProductPropertiesRequestMarshaller()
                        .marshall(updateProvisionedProductPropertiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProvisionedProductPropertiesResult, JsonUnmarshallerContext> unmarshaller = new UpdateProvisionedProductPropertiesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProvisionedProductPropertiesResult> responseHandler = new JsonResponseHandler<UpdateProvisionedProductPropertiesResult>(
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
     * Updates the specified provisioning artifact (also known as a version) for
     * the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared
     * with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return updateProvisioningArtifactResult The response from the
     *         UpdateProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateProvisioningArtifactResult updateProvisioningArtifact(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisioningArtifactRequest> request = null;
        Response<UpdateProvisioningArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisioningArtifactRequestMarshaller()
                        .marshall(updateProvisioningArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProvisioningArtifactResult, JsonUnmarshallerContext> unmarshaller = new UpdateProvisioningArtifactResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProvisioningArtifactResult> responseHandler = new JsonResponseHandler<UpdateProvisioningArtifactResult>(
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
     * Updates a self-service action.
     * </p>
     * 
     * @param updateServiceActionRequest
     * @return updateServiceActionResult The response from the
     *         UpdateServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateServiceActionResult updateServiceAction(
            UpdateServiceActionRequest updateServiceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceActionRequest> request = null;
        Response<UpdateServiceActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceActionRequestMarshaller()
                        .marshall(updateServiceActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateServiceActionResult, JsonUnmarshallerContext> unmarshaller = new UpdateServiceActionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateServiceActionResult> responseHandler = new JsonResponseHandler<UpdateServiceActionResult>(
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
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @return updateTagOptionResult The response from the UpdateTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateTagOptionResult updateTagOption(UpdateTagOptionRequest updateTagOptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagOptionRequest> request = null;
        Response<UpdateTagOptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagOptionRequestMarshaller().marshall(updateTagOptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTagOptionResult, JsonUnmarshallerContext> unmarshaller = new UpdateTagOptionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTagOptionResult> responseHandler = new JsonResponseHandler<UpdateTagOptionResult>(
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
