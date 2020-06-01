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

package com.amazonaws.services.athena;

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

import com.amazonaws.services.athena.model.*;
import com.amazonaws.services.athena.model.transform.*;

/**
 * Client for accessing Amazon Athena. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Athena is an interactive query service that lets you use standard SQL
 * to analyze data directly in Amazon S3. You can point Athena at your data in
 * Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
 * serverless, so there is no infrastructure to set up or manage. You pay only
 * for the queries you run. Athena scales automatically—executing queries in
 * parallel—so results are fast, even with large datasets and complex queries.
 * For more information, see <a
 * href="http://docs.aws.amazon.com/athena/latest/ug/what-is.html">What is
 * Amazon Athena</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 * <p>
 * If you connect to Athena using the JDBC driver, use version 1.1.0 of the
 * driver or later with the Amazon Athena API. Earlier version drivers do not
 * support the API. For more information and to download the driver, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/connect-with-jdbc.html">
 * Accessing Amazon Athena with JDBC</a>.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
 * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 */
public class AmazonAthenaClient extends AmazonWebServiceClient implements AmazonAthena {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Athena exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonAthena. A
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
    public AmazonAthenaClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena. A
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
     *            how this client connects to AmazonAthena (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonAthenaClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials.
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
     *         AmazonAthenaClient client = new AmazonAthenaClient(AWSMobileClient.getInstance());
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
    public AmazonAthenaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials and client configuration options.
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
     *         AmazonAthenaClient client = new AmazonAthenaClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAthena (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonAthenaClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials provider.
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
     *         AmazonAthenaClient client = new AmazonAthenaClient(AWSMobileClient.getInstance());
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
    public AmazonAthenaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials provider and client configuration
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
     *         AmazonAthenaClient client = new AmazonAthenaClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAthena (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonAthenaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonAthena (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonAthenaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAthena using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AmazonAthenaClient client = new AmazonAthenaClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAthena (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonAthenaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MetadataExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("athena.us-east-1.amazonaws.com");
        this.endpointPrefix = "athena";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/athena/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/athena/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Returns the details of a single named query or a list of up to 50
     * queries, which you provide as an array of query ID strings. Requires you
     * to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the
     * specified workgroup. If information could not be retrieved for a
     * submitted query ID, information about the query ID submitted is listed
     * under <a>UnprocessedNamedQueryId</a>. Named queries differ from executed
     * queries. Use <a>BatchGetQueryExecutionInput</a> to get details about each
     * unique query execution, and <a>ListQueryExecutionsInput</a> to get a list
     * of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     * @return batchGetNamedQueryResult The response from the BatchGetNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetNamedQueryResult batchGetNamedQuery(
            BatchGetNamedQueryRequest batchGetNamedQueryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetNamedQueryRequest> request = null;
        Response<BatchGetNamedQueryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetNamedQueryRequestMarshaller()
                        .marshall(batchGetNamedQueryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetNamedQueryResult, JsonUnmarshallerContext> unmarshaller = new BatchGetNamedQueryResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetNamedQueryResult> responseHandler = new JsonResponseHandler<BatchGetNamedQueryResult>(
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
     * Returns the details of a single query execution or a list of up to 50
     * query executions, which you provide as an array of query execution ID
     * strings. Requires you to have access to the workgroup in which the
     * queries ran. To get a list of query execution IDs, use
     * <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details
     * about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     * @return batchGetQueryExecutionResult The response from the
     *         BatchGetQueryExecution service method, as returned by Amazon
     *         Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetQueryExecutionResult batchGetQueryExecution(
            BatchGetQueryExecutionRequest batchGetQueryExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetQueryExecutionRequest> request = null;
        Response<BatchGetQueryExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetQueryExecutionRequestMarshaller()
                        .marshall(batchGetQueryExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetQueryExecutionResult, JsonUnmarshallerContext> unmarshaller = new BatchGetQueryExecutionResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetQueryExecutionResult> responseHandler = new JsonResponseHandler<BatchGetQueryExecutionResult>(
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
     * Creates (registers) a data catalog with the specified name and
     * properties. Catalogs created are visible to all users of the same AWS
     * account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return createDataCatalogResult The response from the CreateDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDataCatalogResult createDataCatalog(
            CreateDataCatalogRequest createDataCatalogRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataCatalogRequest> request = null;
        Response<CreateDataCatalogResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataCatalogRequestMarshaller()
                        .marshall(createDataCatalogRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDataCatalogResult, JsonUnmarshallerContext> unmarshaller = new CreateDataCatalogResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataCatalogResult> responseHandler = new JsonResponseHandler<CreateDataCatalogResult>(
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
     * Creates a named query in the specified workgroup. Requires that you have
     * access to the workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @return createNamedQueryResult The response from the CreateNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest createNamedQueryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNamedQueryRequest> request = null;
        Response<CreateNamedQueryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNamedQueryRequestMarshaller().marshall(createNamedQueryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateNamedQueryResult, JsonUnmarshallerContext> unmarshaller = new CreateNamedQueryResultJsonUnmarshaller();
            JsonResponseHandler<CreateNamedQueryResult> responseHandler = new JsonResponseHandler<CreateNamedQueryResult>(
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
     * Creates a workgroup with the specified name.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return createWorkGroupResult The response from the CreateWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest createWorkGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkGroupRequest> request = null;
        Response<CreateWorkGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkGroupRequestMarshaller().marshall(createWorkGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWorkGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateWorkGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateWorkGroupResult> responseHandler = new JsonResponseHandler<CreateWorkGroupResult>(
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
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return deleteDataCatalogResult The response from the DeleteDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDataCatalogResult deleteDataCatalog(
            DeleteDataCatalogRequest deleteDataCatalogRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataCatalogRequest> request = null;
        Response<DeleteDataCatalogResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataCatalogRequestMarshaller()
                        .marshall(deleteDataCatalogRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDataCatalogResult, JsonUnmarshallerContext> unmarshaller = new DeleteDataCatalogResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDataCatalogResult> responseHandler = new JsonResponseHandler<DeleteDataCatalogResult>(
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
     * Deletes the named query if you have access to the workgroup in which the
     * query was saved.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @return deleteNamedQueryResult The response from the DeleteNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest deleteNamedQueryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamedQueryRequest> request = null;
        Response<DeleteNamedQueryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamedQueryRequestMarshaller().marshall(deleteNamedQueryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteNamedQueryResult, JsonUnmarshallerContext> unmarshaller = new DeleteNamedQueryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteNamedQueryResult> responseHandler = new JsonResponseHandler<DeleteNamedQueryResult>(
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
     * Deletes the workgroup with the specified name. The primary workgroup
     * cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return deleteWorkGroupResult The response from the DeleteWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest deleteWorkGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkGroupRequest> request = null;
        Response<DeleteWorkGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkGroupRequestMarshaller().marshall(deleteWorkGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWorkGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteWorkGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWorkGroupResult> responseHandler = new JsonResponseHandler<DeleteWorkGroupResult>(
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
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return getDataCatalogResult The response from the GetDataCatalog service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDataCatalogResult getDataCatalog(GetDataCatalogRequest getDataCatalogRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataCatalogRequest> request = null;
        Response<GetDataCatalogResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataCatalogRequestMarshaller().marshall(getDataCatalogRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDataCatalogResult, JsonUnmarshallerContext> unmarshaller = new GetDataCatalogResultJsonUnmarshaller();
            JsonResponseHandler<GetDataCatalogResult> responseHandler = new JsonResponseHandler<GetDataCatalogResult>(
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
     * Returns a database object for the specfied database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return getDatabaseResult The response from the GetDatabase service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestMarshaller().marshall(getDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDatabaseResult, JsonUnmarshallerContext> unmarshaller = new GetDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<GetDatabaseResult> responseHandler = new JsonResponseHandler<GetDatabaseResult>(
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
     * Returns information about a single query. Requires that you have access
     * to the workgroup in which the query was saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return getNamedQueryResult The response from the GetNamedQuery service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetNamedQueryResult getNamedQuery(GetNamedQueryRequest getNamedQueryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamedQueryRequest> request = null;
        Response<GetNamedQueryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamedQueryRequestMarshaller().marshall(getNamedQueryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetNamedQueryResult, JsonUnmarshallerContext> unmarshaller = new GetNamedQueryResultJsonUnmarshaller();
            JsonResponseHandler<GetNamedQueryResult> responseHandler = new JsonResponseHandler<GetNamedQueryResult>(
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
     * Returns information about a single execution of a query if you have
     * access to the workgroup in which the query ran. Each time a query
     * executes, information about the query execution is saved with a unique
     * ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return getQueryExecutionResult The response from the GetQueryExecution
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetQueryExecutionResult getQueryExecution(
            GetQueryExecutionRequest getQueryExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryExecutionRequest> request = null;
        Response<GetQueryExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryExecutionRequestMarshaller()
                        .marshall(getQueryExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetQueryExecutionResult, JsonUnmarshallerContext> unmarshaller = new GetQueryExecutionResultJsonUnmarshaller();
            JsonResponseHandler<GetQueryExecutionResult> responseHandler = new JsonResponseHandler<GetQueryExecutionResult>(
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
     * Streams the results of a single query execution specified by
     * <code>QueryExecutionId</code> from the Athena query results location in
     * Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> in the <i>Amazon Athena User Guide</i>. This request does not
     * execute the query but returns results. Use <a>StartQueryExecution</a> to
     * run a query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission
     * to call <code>GetQueryResults</code> also must have permissions to the
     * Amazon S3 <code>GetObject</code> action for the Athena query results
     * location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code>
     * action for the query results location are able to retrieve query results
     * from Amazon S3 even if permission to the <code>GetQueryResults</code>
     * action is denied. To restrict user or role access, ensure that Amazon S3
     * permissions to the Athena query location are denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @return getQueryResultsResult The response from the GetQueryResults
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestMarshaller().marshall(getQueryResultsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetQueryResultsResult, JsonUnmarshallerContext> unmarshaller = new GetQueryResultsResultJsonUnmarshaller();
            JsonResponseHandler<GetQueryResultsResult> responseHandler = new JsonResponseHandler<GetQueryResultsResult>(
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
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return getTableMetadataResult The response from the GetTableMetadata
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTableMetadataResult getTableMetadata(GetTableMetadataRequest getTableMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableMetadataRequest> request = null;
        Response<GetTableMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableMetadataRequestMarshaller().marshall(getTableMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTableMetadataResult, JsonUnmarshallerContext> unmarshaller = new GetTableMetadataResultJsonUnmarshaller();
            JsonResponseHandler<GetTableMetadataResult> responseHandler = new JsonResponseHandler<GetTableMetadataResult>(
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
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return getWorkGroupResult The response from the GetWorkGroup service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWorkGroupResult getWorkGroup(GetWorkGroupRequest getWorkGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkGroupRequest> request = null;
        Response<GetWorkGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkGroupRequestMarshaller().marshall(getWorkGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWorkGroupResult, JsonUnmarshallerContext> unmarshaller = new GetWorkGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetWorkGroupResult> responseHandler = new JsonResponseHandler<GetWorkGroupResult>(
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
     * Lists the data catalogs in the current AWS account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return listDataCatalogsResult The response from the ListDataCatalogs
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDataCatalogsResult listDataCatalogs(ListDataCatalogsRequest listDataCatalogsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDataCatalogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataCatalogsRequest> request = null;
        Response<ListDataCatalogsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataCatalogsRequestMarshaller().marshall(listDataCatalogsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDataCatalogsResult, JsonUnmarshallerContext> unmarshaller = new ListDataCatalogsResultJsonUnmarshaller();
            JsonResponseHandler<ListDataCatalogsResult> responseHandler = new JsonResponseHandler<ListDataCatalogsResult>(
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
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return listDatabasesResult The response from the ListDatabases service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatabasesRequest> request = null;
        Response<ListDatabasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatabasesRequestMarshaller().marshall(listDatabasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatabasesResult, JsonUnmarshallerContext> unmarshaller = new ListDatabasesResultJsonUnmarshaller();
            JsonResponseHandler<ListDatabasesResult> responseHandler = new JsonResponseHandler<ListDatabasesResult>(
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
     * Provides a list of available query IDs only for queries saved in the
     * specified workgroup. Requires that you have access to the specified
     * workgroup. If a workgroup is not specified, lists the saved queries for
     * the primary workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @return listNamedQueriesResult The response from the ListNamedQueries
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest listNamedQueriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNamedQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamedQueriesRequest> request = null;
        Response<ListNamedQueriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamedQueriesRequestMarshaller().marshall(listNamedQueriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNamedQueriesResult, JsonUnmarshallerContext> unmarshaller = new ListNamedQueriesResultJsonUnmarshaller();
            JsonResponseHandler<ListNamedQueriesResult> responseHandler = new JsonResponseHandler<ListNamedQueriesResult>(
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
     * Provides a list of available query execution IDs for the queries in the
     * specified workgroup. If a workgroup is not specified, returns a list of
     * query execution IDs for the primary workgroup. Requires you to have
     * access to the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @return listQueryExecutionsResult The response from the
     *         ListQueryExecutions service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListQueryExecutionsResult listQueryExecutions(
            ListQueryExecutionsRequest listQueryExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listQueryExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueryExecutionsRequest> request = null;
        Response<ListQueryExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueryExecutionsRequestMarshaller()
                        .marshall(listQueryExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListQueryExecutionsResult, JsonUnmarshallerContext> unmarshaller = new ListQueryExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<ListQueryExecutionsResult> responseHandler = new JsonResponseHandler<ListQueryExecutionsResult>(
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
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return listTableMetadataResult The response from the ListTableMetadata
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTableMetadataResult listTableMetadata(
            ListTableMetadataRequest listTableMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTableMetadataRequest> request = null;
        Response<ListTableMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTableMetadataRequestMarshaller()
                        .marshall(listTableMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTableMetadataResult, JsonUnmarshallerContext> unmarshaller = new ListTableMetadataResultJsonUnmarshaller();
            JsonResponseHandler<ListTableMetadataResult> responseHandler = new JsonResponseHandler<ListTableMetadataResult>(
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
     * Lists the tags associated with an Athena workgroup or data catalog
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
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
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return listWorkGroupsResult The response from the ListWorkGroups service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest listWorkGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWorkGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkGroupsRequest> request = null;
        Response<ListWorkGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkGroupsRequestMarshaller().marshall(listWorkGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWorkGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListWorkGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListWorkGroupsResult> responseHandler = new JsonResponseHandler<ListWorkGroupsResult>(
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
     * Runs the SQL query statements contained in the <code>Query</code>.
     * Requires you to have access to the workgroup in which the query ran.
     * Running queries against an external catalog requires
     * <a>GetDataCatalog</a> permission to the catalog. For code samples using
     * the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @return startQueryExecutionResult The response from the
     *         StartQueryExecution service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartQueryExecutionResult startQueryExecution(
            StartQueryExecutionRequest startQueryExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryExecutionRequest> request = null;
        Response<StartQueryExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryExecutionRequestMarshaller()
                        .marshall(startQueryExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartQueryExecutionResult, JsonUnmarshallerContext> unmarshaller = new StartQueryExecutionResultJsonUnmarshaller();
            JsonResponseHandler<StartQueryExecutionResult> responseHandler = new JsonResponseHandler<StartQueryExecutionResult>(
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
     * Stops a query execution. Requires you to have access to the workgroup in
     * which the query ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @return stopQueryExecutionResult The response from the StopQueryExecution
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopQueryExecutionResult stopQueryExecution(
            StopQueryExecutionRequest stopQueryExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopQueryExecutionRequest> request = null;
        Response<StopQueryExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopQueryExecutionRequestMarshaller()
                        .marshall(stopQueryExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopQueryExecutionResult, JsonUnmarshallerContext> unmarshaller = new StopQueryExecutionResultJsonUnmarshaller();
            JsonResponseHandler<StopQueryExecutionResult> responseHandler = new JsonResponseHandler<StopQueryExecutionResult>(
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
     * Adds one or more tags to an Athena resource. A tag is a label that you
     * assign to a resource. In Athena, a resource can be a workgroup or data
     * catalog. Each tag consists of a key and an optional value, both of which
     * you define. For example, you can use tags to categorize Athena workgroups
     * or data catalogs by purpose, owner, or environment. Use a consistent set
     * of tag keys to make it easier to search and filter workgroups or data
     * catalogs in your account. For best practices, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >Tagging Best Practices</a>. Tag keys can be from 1 to 128 UTF-8 Unicode
     * characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys and values are
     * case-sensitive. Tag keys must be unique per resource. If you specify more
     * than one tag, separate them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
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
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
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
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return updateDataCatalogResult The response from the UpdateDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDataCatalogResult updateDataCatalog(
            UpdateDataCatalogRequest updateDataCatalogRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataCatalogRequest> request = null;
        Response<UpdateDataCatalogResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataCatalogRequestMarshaller()
                        .marshall(updateDataCatalogRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataCatalogResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataCatalogResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataCatalogResult> responseHandler = new JsonResponseHandler<UpdateDataCatalogResult>(
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
     * Updates the workgroup with the specified name. The workgroup's name
     * cannot be changed.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return updateWorkGroupResult The response from the UpdateWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest updateWorkGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkGroupRequest> request = null;
        Response<UpdateWorkGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkGroupRequestMarshaller().marshall(updateWorkGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWorkGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateWorkGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWorkGroupResult> responseHandler = new JsonResponseHandler<UpdateWorkGroupResult>(
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
