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

package com.amazonaws.services.backup;

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

import com.amazonaws.services.backup.model.*;
import com.amazonaws.services.backup.model.transform.*;

/**
 * Client for accessing AWS Backup. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Backup</fullname>
 * <p>
 * AWS Backup is a unified backup service designed to protect AWS services and
 * their associated data. AWS Backup simplifies the creation, migration,
 * restoration, and deletion of backups, while also providing reporting and
 * auditing.
 * </p>
 */
public class AWSBackupClient extends AmazonWebServiceClient implements AWSBackup {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Backup exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSBackup. A
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
    public AWSBackupClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup. A
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
     *            how this client connects to AWSBackup (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSBackupClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *         AWSBackupClient client = new AWSBackupClient(AWSMobileClient.getInstance());
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
    public AWSBackupClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *         AWSBackupClient client = new AWSBackupClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSBackup (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSBackupClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *         AWSBackupClient client = new AWSBackupClient(AWSMobileClient.getInstance());
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
    public AWSBackupClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *         AWSBackupClient client = new AWSBackupClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSBackup (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSBackupClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *            how this client connects to AWSBackup (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSBackupClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSBackup using the
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
     *         AWSBackupClient client = new AWSBackupClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSBackup (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSBackupClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("backup.us-east-1.amazonaws.com");
        this.endpointPrefix = "backup";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/backup/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/backup/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Backup plans are documents that contain information that AWS Backup uses
     * to schedule tasks that create recovery points of resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already
     * exists, an <code>AlreadyExistsException</code> is returned.
     * </p>
     * 
     * @param createBackupPlanRequest
     * @return createBackupPlanResult The response from the CreateBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBackupPlanResult createBackupPlan(CreateBackupPlanRequest createBackupPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupPlanRequest> request = null;
        Response<CreateBackupPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupPlanRequestMarshaller().marshall(createBackupPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBackupPlanResult, JsonUnmarshallerContext> unmarshaller = new CreateBackupPlanResultJsonUnmarshaller();
            JsonResponseHandler<CreateBackupPlanResult> responseHandler = new JsonResponseHandler<CreateBackupPlanResult>(
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
     * Creates a JSON document that specifies a set of resources to assign to a
     * backup plan. Resources can be included by specifying patterns for a
     * <code>ListOfTags</code> and selected <code>Resources</code>.
     * </p>
     * <p>
     * For example, consider the following patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"department"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"finance"</code>
     * </p>
     * <p>
     * <code>ConditionType:"STRINGEQUALS"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"importance"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"critical"</code>
     * </p>
     * <p>
     * <code>ConditionType:"STRINGEQUALS"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using these patterns would back up all Amazon Elastic Block Store (Amazon
     * EBS) volumes that are tagged as <code>"department=finance"</code>,
     * <code>"importance=critical"</code>, in addition to an EBS volume with the
     * specified volume Id.
     * </p>
     * <p>
     * Resources and conditions are additive in that all resources that match
     * the pattern are selected. This shouldn't be confused with a logical AND,
     * where all conditions must match. The matching patterns are logically 'put
     * together using the OR operator. In other words, all patterns that match
     * are selected for backup.
     * </p>
     * 
     * @param createBackupSelectionRequest
     * @return createBackupSelectionResult The response from the
     *         CreateBackupSelection service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBackupSelectionResult createBackupSelection(
            CreateBackupSelectionRequest createBackupSelectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupSelectionRequest> request = null;
        Response<CreateBackupSelectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupSelectionRequestMarshaller()
                        .marshall(createBackupSelectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBackupSelectionResult, JsonUnmarshallerContext> unmarshaller = new CreateBackupSelectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateBackupSelectionResult> responseHandler = new JsonResponseHandler<CreateBackupSelectionResult>(
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
     * Creates a logical container where backups are stored. A
     * <code>CreateBackupVault</code> request includes a name, optionally one or
     * more resource tags, an encryption key, and a request ID.
     * </p>
     * <note>
     * <p>
     * Sensitive data, such as passport numbers, should not be included the name
     * of a backup vault.
     * </p>
     * </note>
     * 
     * @param createBackupVaultRequest
     * @return createBackupVaultResult The response from the CreateBackupVault
     *         service method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBackupVaultResult createBackupVault(
            CreateBackupVaultRequest createBackupVaultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupVaultRequest> request = null;
        Response<CreateBackupVaultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupVaultRequestMarshaller()
                        .marshall(createBackupVaultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBackupVaultResult, JsonUnmarshallerContext> unmarshaller = new CreateBackupVaultResultJsonUnmarshaller();
            JsonResponseHandler<CreateBackupVaultResult> responseHandler = new JsonResponseHandler<CreateBackupVaultResult>(
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
     * Deletes a backup plan. A backup plan can only be deleted after all
     * associated selections of resources have been deleted. Deleting a backup
     * plan deletes the current version of a backup plan. Previous versions, if
     * any, will still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @return deleteBackupPlanResult The response from the DeleteBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteBackupPlanResult deleteBackupPlan(DeleteBackupPlanRequest deleteBackupPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupPlanRequest> request = null;
        Response<DeleteBackupPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupPlanRequestMarshaller().marshall(deleteBackupPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBackupPlanResult, JsonUnmarshallerContext> unmarshaller = new DeleteBackupPlanResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBackupPlanResult> responseHandler = new JsonResponseHandler<DeleteBackupPlanResult>(
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
     * Deletes the resource selection associated with a backup plan that is
     * specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteBackupSelection(DeleteBackupSelectionRequest deleteBackupSelectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupSelectionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupSelectionRequestMarshaller()
                        .marshall(deleteBackupSelectionRequest);
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
     * Deletes the backup vault identified by its name. A vault can be deleted
     * only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteBackupVault(DeleteBackupVaultRequest deleteBackupVaultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultRequestMarshaller()
                        .marshall(deleteBackupVaultRequest);
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
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteBackupVaultAccessPolicy(
            DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultAccessPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultAccessPolicyRequestMarshaller()
                        .marshall(deleteBackupVaultAccessPolicyRequest);
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
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteBackupVaultNotifications(
            DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupVaultNotificationsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupVaultNotificationsRequestMarshaller()
                        .marshall(deleteBackupVaultNotificationsRequest);
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
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRecoveryPoint(DeleteRecoveryPointRequest deleteRecoveryPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecoveryPointRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecoveryPointRequestMarshaller()
                        .marshall(deleteRecoveryPointRequest);
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
     * Returns metadata associated with creating a backup of a resource.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @return describeBackupJobResult The response from the DescribeBackupJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws DependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeBackupJobResult describeBackupJob(
            DescribeBackupJobRequest describeBackupJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupJobRequest> request = null;
        Response<DescribeBackupJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupJobRequestMarshaller()
                        .marshall(describeBackupJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBackupJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeBackupJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBackupJobResult> responseHandler = new JsonResponseHandler<DescribeBackupJobResult>(
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
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @return describeBackupVaultResult The response from the
     *         DescribeBackupVault service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeBackupVaultResult describeBackupVault(
            DescribeBackupVaultRequest describeBackupVaultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupVaultRequest> request = null;
        Response<DescribeBackupVaultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupVaultRequestMarshaller()
                        .marshall(describeBackupVaultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBackupVaultResult, JsonUnmarshallerContext> unmarshaller = new DescribeBackupVaultResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBackupVaultResult> responseHandler = new JsonResponseHandler<DescribeBackupVaultResult>(
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
     * Returns metadata associated with creating a copy of a resource.
     * </p>
     * 
     * @param describeCopyJobRequest
     * @return describeCopyJobResult The response from the DescribeCopyJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCopyJobResult describeCopyJob(DescribeCopyJobRequest describeCopyJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCopyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCopyJobRequest> request = null;
        Response<DescribeCopyJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCopyJobRequestMarshaller().marshall(describeCopyJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCopyJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeCopyJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCopyJobResult> responseHandler = new JsonResponseHandler<DescribeCopyJobResult>(
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
     * Returns information about a saved resource, including the last time it
     * was backed up, its Amazon Resource Name (ARN), and the AWS service type
     * of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @return describeProtectedResourceResult The response from the
     *         DescribeProtectedResource service method, as returned by AWS
     *         Backup.
     * @throws MissingParameterValueException
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProtectedResourceResult describeProtectedResource(
            DescribeProtectedResourceRequest describeProtectedResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProtectedResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProtectedResourceRequest> request = null;
        Response<DescribeProtectedResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProtectedResourceRequestMarshaller()
                        .marshall(describeProtectedResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProtectedResourceResult, JsonUnmarshallerContext> unmarshaller = new DescribeProtectedResourceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProtectedResourceResult> responseHandler = new JsonResponseHandler<DescribeProtectedResourceResult>(
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
     * Returns metadata associated with a recovery point, including ID, status,
     * encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @return describeRecoveryPointResult The response from the
     *         DescribeRecoveryPoint service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRecoveryPointResult describeRecoveryPoint(
            DescribeRecoveryPointRequest describeRecoveryPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecoveryPointRequest> request = null;
        Response<DescribeRecoveryPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecoveryPointRequestMarshaller()
                        .marshall(describeRecoveryPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRecoveryPointResult, JsonUnmarshallerContext> unmarshaller = new DescribeRecoveryPointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRecoveryPointResult> responseHandler = new JsonResponseHandler<DescribeRecoveryPointResult>(
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
     * Returns the current service opt-in settings for the Region. If the
     * service has a value set to <code>true</code>, AWS Backup attempts to
     * protect that service's resources in this Region, when included in an
     * on-demand backup or scheduled backup plan. If the value is set to
     * <code>false</code> for a service, AWS Backup does not attempt to protect
     * that service's resources in this Region.
     * </p>
     * 
     * @param describeRegionSettingsRequest
     * @return describeRegionSettingsResult The response from the
     *         DescribeRegionSettings service method, as returned by AWS Backup.
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRegionSettingsResult describeRegionSettings(
            DescribeRegionSettingsRequest describeRegionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRegionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegionSettingsRequest> request = null;
        Response<DescribeRegionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegionSettingsRequestMarshaller()
                        .marshall(describeRegionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRegionSettingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeRegionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRegionSettingsResult> responseHandler = new JsonResponseHandler<DescribeRegionSettingsResult>(
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
     * Returns metadata associated with a restore job that is specified by a job
     * ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @return describeRestoreJobResult The response from the DescribeRestoreJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws DependencyFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRestoreJobResult describeRestoreJob(
            DescribeRestoreJobRequest describeRestoreJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRestoreJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRestoreJobRequest> request = null;
        Response<DescribeRestoreJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRestoreJobRequestMarshaller()
                        .marshall(describeRestoreJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRestoreJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeRestoreJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRestoreJobResult> responseHandler = new JsonResponseHandler<DescribeRestoreJobResult>(
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
     * Returns the backup plan that is specified by the plan ID as a backup
     * template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @return exportBackupPlanTemplateResult The response from the
     *         ExportBackupPlanTemplate service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ExportBackupPlanTemplateResult exportBackupPlanTemplate(
            ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportBackupPlanTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportBackupPlanTemplateRequest> request = null;
        Response<ExportBackupPlanTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportBackupPlanTemplateRequestMarshaller()
                        .marshall(exportBackupPlanTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportBackupPlanTemplateResult, JsonUnmarshallerContext> unmarshaller = new ExportBackupPlanTemplateResultJsonUnmarshaller();
            JsonResponseHandler<ExportBackupPlanTemplateResult> responseHandler = new JsonResponseHandler<ExportBackupPlanTemplateResult>(
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
     * Returns the body of a backup plan in JSON format, in addition to plan
     * metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @return getBackupPlanResult The response from the GetBackupPlan service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupPlanResult getBackupPlan(GetBackupPlanRequest getBackupPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanRequest> request = null;
        Response<GetBackupPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanRequestMarshaller().marshall(getBackupPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupPlanResult, JsonUnmarshallerContext> unmarshaller = new GetBackupPlanResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupPlanResult> responseHandler = new JsonResponseHandler<GetBackupPlanResult>(
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
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @return getBackupPlanFromJSONResult The response from the
     *         GetBackupPlanFromJSON service method, as returned by AWS Backup.
     * @throws LimitExceededException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupPlanFromJSONResult getBackupPlanFromJSON(
            GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupPlanFromJSONRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanFromJSONRequest> request = null;
        Response<GetBackupPlanFromJSONResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanFromJSONRequestMarshaller()
                        .marshall(getBackupPlanFromJSONRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupPlanFromJSONResult, JsonUnmarshallerContext> unmarshaller = new GetBackupPlanFromJSONResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupPlanFromJSONResult> responseHandler = new JsonResponseHandler<GetBackupPlanFromJSONResult>(
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
     * Returns the template specified by its <code>templateId</code> as a backup
     * plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @return getBackupPlanFromTemplateResult The response from the
     *         GetBackupPlanFromTemplate service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupPlanFromTemplateResult getBackupPlanFromTemplate(
            GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupPlanFromTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupPlanFromTemplateRequest> request = null;
        Response<GetBackupPlanFromTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupPlanFromTemplateRequestMarshaller()
                        .marshall(getBackupPlanFromTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupPlanFromTemplateResult, JsonUnmarshallerContext> unmarshaller = new GetBackupPlanFromTemplateResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupPlanFromTemplateResult> responseHandler = new JsonResponseHandler<GetBackupPlanFromTemplateResult>(
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
     * Returns selection metadata and a document in JSON format that specifies a
     * list of resources that are associated with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @return getBackupSelectionResult The response from the GetBackupSelection
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupSelectionResult getBackupSelection(
            GetBackupSelectionRequest getBackupSelectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupSelectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupSelectionRequest> request = null;
        Response<GetBackupSelectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupSelectionRequestMarshaller()
                        .marshall(getBackupSelectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupSelectionResult, JsonUnmarshallerContext> unmarshaller = new GetBackupSelectionResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupSelectionResult> responseHandler = new JsonResponseHandler<GetBackupSelectionResult>(
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
     * Returns the access policy document that is associated with the named
     * backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @return getBackupVaultAccessPolicyResult The response from the
     *         GetBackupVaultAccessPolicy service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupVaultAccessPolicyResult getBackupVaultAccessPolicy(
            GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupVaultAccessPolicyRequest> request = null;
        Response<GetBackupVaultAccessPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupVaultAccessPolicyRequestMarshaller()
                        .marshall(getBackupVaultAccessPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupVaultAccessPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetBackupVaultAccessPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupVaultAccessPolicyResult> responseHandler = new JsonResponseHandler<GetBackupVaultAccessPolicyResult>(
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
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @return getBackupVaultNotificationsResult The response from the
     *         GetBackupVaultNotifications service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackupVaultNotificationsResult getBackupVaultNotifications(
            GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackupVaultNotificationsRequest> request = null;
        Response<GetBackupVaultNotificationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackupVaultNotificationsRequestMarshaller()
                        .marshall(getBackupVaultNotificationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackupVaultNotificationsResult, JsonUnmarshallerContext> unmarshaller = new GetBackupVaultNotificationsResultJsonUnmarshaller();
            JsonResponseHandler<GetBackupVaultNotificationsResult> responseHandler = new JsonResponseHandler<GetBackupVaultNotificationsResult>(
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
     * Returns a set of metadata key-value pairs that were used to create the
     * backup.
     * </p>
     * 
     * @param getRecoveryPointRestoreMetadataRequest
     * @return getRecoveryPointRestoreMetadataResult The response from the
     *         GetRecoveryPointRestoreMetadata service method, as returned by
     *         AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRecoveryPointRestoreMetadataResult getRecoveryPointRestoreMetadata(
            GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRecoveryPointRestoreMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecoveryPointRestoreMetadataRequest> request = null;
        Response<GetRecoveryPointRestoreMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecoveryPointRestoreMetadataRequestMarshaller()
                        .marshall(getRecoveryPointRestoreMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRecoveryPointRestoreMetadataResult, JsonUnmarshallerContext> unmarshaller = new GetRecoveryPointRestoreMetadataResultJsonUnmarshaller();
            JsonResponseHandler<GetRecoveryPointRestoreMetadataResult> responseHandler = new JsonResponseHandler<GetRecoveryPointRestoreMetadataResult>(
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
     * Returns the AWS resource types supported by AWS Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @return getSupportedResourceTypesResult The response from the
     *         GetSupportedResourceTypes service method, as returned by AWS
     *         Backup.
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSupportedResourceTypesResult getSupportedResourceTypes(
            GetSupportedResourceTypesRequest getSupportedResourceTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSupportedResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSupportedResourceTypesRequest> request = null;
        Response<GetSupportedResourceTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSupportedResourceTypesRequestMarshaller()
                        .marshall(getSupportedResourceTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSupportedResourceTypesResult, JsonUnmarshallerContext> unmarshaller = new GetSupportedResourceTypesResultJsonUnmarshaller();
            JsonResponseHandler<GetSupportedResourceTypesResult> responseHandler = new JsonResponseHandler<GetSupportedResourceTypesResult>(
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
     * Returns metadata about your backup jobs.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @return listBackupJobsResult The response from the ListBackupJobs service
     *         method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupJobsResult listBackupJobs(ListBackupJobsRequest listBackupJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupJobsRequest> request = null;
        Response<ListBackupJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupJobsRequestMarshaller().marshall(listBackupJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupJobsResult, JsonUnmarshallerContext> unmarshaller = new ListBackupJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupJobsResult> responseHandler = new JsonResponseHandler<ListBackupJobsResult>(
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
     * Returns metadata of your saved backup plan templates, including the
     * template ID, name, and the creation and deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @return listBackupPlanTemplatesResult The response from the
     *         ListBackupPlanTemplates service method, as returned by AWS
     *         Backup.
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupPlanTemplatesResult listBackupPlanTemplates(
            ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupPlanTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlanTemplatesRequest> request = null;
        Response<ListBackupPlanTemplatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlanTemplatesRequestMarshaller()
                        .marshall(listBackupPlanTemplatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupPlanTemplatesResult, JsonUnmarshallerContext> unmarshaller = new ListBackupPlanTemplatesResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupPlanTemplatesResult> responseHandler = new JsonResponseHandler<ListBackupPlanTemplatesResult>(
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
     * Returns version metadata of your backup plans, including Amazon Resource
     * Names (ARNs), backup plan IDs, creation and deletion dates, plan names,
     * and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @return listBackupPlanVersionsResult The response from the
     *         ListBackupPlanVersions service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupPlanVersionsResult listBackupPlanVersions(
            ListBackupPlanVersionsRequest listBackupPlanVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupPlanVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlanVersionsRequest> request = null;
        Response<ListBackupPlanVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlanVersionsRequestMarshaller()
                        .marshall(listBackupPlanVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupPlanVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListBackupPlanVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupPlanVersionsResult> responseHandler = new JsonResponseHandler<ListBackupPlanVersionsResult>(
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
     * Returns metadata of your saved backup plans, including Amazon Resource
     * Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan
     * names, and creator request IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @return listBackupPlansResult The response from the ListBackupPlans
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupPlansResult listBackupPlans(ListBackupPlansRequest listBackupPlansRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupPlansRequest> request = null;
        Response<ListBackupPlansResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupPlansRequestMarshaller().marshall(listBackupPlansRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupPlansResult, JsonUnmarshallerContext> unmarshaller = new ListBackupPlansResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupPlansResult> responseHandler = new JsonResponseHandler<ListBackupPlansResult>(
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
     * Returns an array containing metadata of the resources associated with the
     * target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @return listBackupSelectionsResult The response from the
     *         ListBackupSelections service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupSelectionsResult listBackupSelections(
            ListBackupSelectionsRequest listBackupSelectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupSelectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupSelectionsRequest> request = null;
        Response<ListBackupSelectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupSelectionsRequestMarshaller()
                        .marshall(listBackupSelectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupSelectionsResult, JsonUnmarshallerContext> unmarshaller = new ListBackupSelectionsResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupSelectionsResult> responseHandler = new JsonResponseHandler<ListBackupSelectionsResult>(
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
     * Returns a list of recovery point storage containers along with
     * information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @return listBackupVaultsResult The response from the ListBackupVaults
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackupVaultsResult listBackupVaults(ListBackupVaultsRequest listBackupVaultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackupVaultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupVaultsRequest> request = null;
        Response<ListBackupVaultsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupVaultsRequestMarshaller().marshall(listBackupVaultsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackupVaultsResult, JsonUnmarshallerContext> unmarshaller = new ListBackupVaultsResultJsonUnmarshaller();
            JsonResponseHandler<ListBackupVaultsResult> responseHandler = new JsonResponseHandler<ListBackupVaultsResult>(
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
     * Returns metadata about your copy jobs.
     * </p>
     * 
     * @param listCopyJobsRequest
     * @return listCopyJobsResult The response from the ListCopyJobs service
     *         method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCopyJobsResult listCopyJobs(ListCopyJobsRequest listCopyJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCopyJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCopyJobsRequest> request = null;
        Response<ListCopyJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCopyJobsRequestMarshaller().marshall(listCopyJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCopyJobsResult, JsonUnmarshallerContext> unmarshaller = new ListCopyJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListCopyJobsResult> responseHandler = new JsonResponseHandler<ListCopyJobsResult>(
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
     * Returns an array of resources successfully backed up by AWS Backup,
     * including the time the resource was saved, an Amazon Resource Name (ARN)
     * of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @return listProtectedResourcesResult The response from the
     *         ListProtectedResources service method, as returned by AWS Backup.
     * @throws InvalidParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProtectedResourcesResult listProtectedResources(
            ListProtectedResourcesRequest listProtectedResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProtectedResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtectedResourcesRequest> request = null;
        Response<ListProtectedResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtectedResourcesRequestMarshaller()
                        .marshall(listProtectedResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProtectedResourcesResult, JsonUnmarshallerContext> unmarshaller = new ListProtectedResourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListProtectedResourcesResult> responseHandler = new JsonResponseHandler<ListProtectedResourcesResult>(
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
     * Returns detailed information about the recovery points stored in a backup
     * vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @return listRecoveryPointsByBackupVaultResult The response from the
     *         ListRecoveryPointsByBackupVault service method, as returned by
     *         AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRecoveryPointsByBackupVaultResult listRecoveryPointsByBackupVault(
            ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsByBackupVaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsByBackupVaultRequest> request = null;
        Response<ListRecoveryPointsByBackupVaultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsByBackupVaultRequestMarshaller()
                        .marshall(listRecoveryPointsByBackupVaultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecoveryPointsByBackupVaultResult, JsonUnmarshallerContext> unmarshaller = new ListRecoveryPointsByBackupVaultResultJsonUnmarshaller();
            JsonResponseHandler<ListRecoveryPointsByBackupVaultResult> responseHandler = new JsonResponseHandler<ListRecoveryPointsByBackupVaultResult>(
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
     * Returns detailed information about recovery points of the type specified
     * by a resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @return listRecoveryPointsByResourceResult The response from the
     *         ListRecoveryPointsByResource service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRecoveryPointsByResourceResult listRecoveryPointsByResource(
            ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecoveryPointsByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecoveryPointsByResourceRequest> request = null;
        Response<ListRecoveryPointsByResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecoveryPointsByResourceRequestMarshaller()
                        .marshall(listRecoveryPointsByResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecoveryPointsByResourceResult, JsonUnmarshallerContext> unmarshaller = new ListRecoveryPointsByResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListRecoveryPointsByResourceResult> responseHandler = new JsonResponseHandler<ListRecoveryPointsByResourceResult>(
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
     * Returns a list of jobs that AWS Backup initiated to restore a saved
     * resource, including metadata about the recovery process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @return listRestoreJobsResult The response from the ListRestoreJobs
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRestoreJobsResult listRestoreJobs(ListRestoreJobsRequest listRestoreJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRestoreJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRestoreJobsRequest> request = null;
        Response<ListRestoreJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRestoreJobsRequestMarshaller().marshall(listRestoreJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRestoreJobsResult, JsonUnmarshallerContext> unmarshaller = new ListRestoreJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListRestoreJobsResult> responseHandler = new JsonResponseHandler<ListRestoreJobsResult>(
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
     * Returns a list of key-value pairs assigned to a target recovery point,
     * backup plan, or backup vault.
     * </p>
     * <note>
     * <p>
     * <code>ListTags</code> are currently only supported with Amazon EFS
     * backups.
     * </p>
     * </note>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsResult listTags(ListTagsRequest listTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestMarshaller().marshall(listTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsResult, JsonUnmarshallerContext> unmarshaller = new ListTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsResult> responseHandler = new JsonResponseHandler<ListTagsResult>(
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
     * Sets a resource-based policy that is used to manage access permissions on
     * the target backup vault. Requires a backup vault name and an access
     * policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putBackupVaultAccessPolicy(
            PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putBackupVaultAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBackupVaultAccessPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBackupVaultAccessPolicyRequestMarshaller()
                        .marshall(putBackupVaultAccessPolicyRequest);
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
     * Turns on notifications on a backup vault for the specified topic and
     * events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putBackupVaultNotifications(
            PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putBackupVaultNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBackupVaultNotificationsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBackupVaultNotificationsRequestMarshaller()
                        .marshall(putBackupVaultNotificationsRequest);
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
     * Starts a job to create a one-time backup of the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @return startBackupJobResult The response from the StartBackupJob service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartBackupJobResult startBackupJob(StartBackupJobRequest startBackupJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBackupJobRequest> request = null;
        Response<StartBackupJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBackupJobRequestMarshaller().marshall(startBackupJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartBackupJobResult, JsonUnmarshallerContext> unmarshaller = new StartBackupJobResultJsonUnmarshaller();
            JsonResponseHandler<StartBackupJobResult> responseHandler = new JsonResponseHandler<StartBackupJobResult>(
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
     * Starts a job to create a one-time copy of the specified resource.
     * </p>
     * 
     * @param startCopyJobRequest
     * @return startCopyJobResult The response from the StartCopyJob service
     *         method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCopyJobResult startCopyJob(StartCopyJobRequest startCopyJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCopyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCopyJobRequest> request = null;
        Response<StartCopyJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCopyJobRequestMarshaller().marshall(startCopyJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCopyJobResult, JsonUnmarshallerContext> unmarshaller = new StartCopyJobResultJsonUnmarshaller();
            JsonResponseHandler<StartCopyJobResult> responseHandler = new JsonResponseHandler<StartCopyJobResult>(
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
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * If the resource ARN is included in the request, then the last complete
     * backup of that resource is recovered. If the ARN of a recovery point is
     * supplied, then that recovery point is restored.
     * </p>
     * 
     * @param startRestoreJobRequest
     * @return startRestoreJobResult The response from the StartRestoreJob
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartRestoreJobResult startRestoreJob(StartRestoreJobRequest startRestoreJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startRestoreJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRestoreJobRequest> request = null;
        Response<StartRestoreJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRestoreJobRequestMarshaller().marshall(startRestoreJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartRestoreJobResult, JsonUnmarshallerContext> unmarshaller = new StartRestoreJobResultJsonUnmarshaller();
            JsonResponseHandler<StartRestoreJobResult> responseHandler = new JsonResponseHandler<StartRestoreJobResult>(
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
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @throws MissingParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void stopBackupJob(StopBackupJobRequest stopBackupJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopBackupJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBackupJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBackupJobRequestMarshaller().marshall(stopBackupJobRequest);
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
     * Assigns a set of key-value pairs to a recovery point, backup plan, or
     * backup vault identified by an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
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
     * Removes a set of key-value pairs from a recovery point, backup plan, or
     * backup vault identified by an Amazon Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
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
     * Replaces the body of a saved backup plan identified by its
     * <code>backupPlanId</code> with the input document in JSON format. The new
     * version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @return updateBackupPlanResult The response from the UpdateBackupPlan
     *         service method, as returned by AWS Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateBackupPlanResult updateBackupPlan(UpdateBackupPlanRequest updateBackupPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBackupPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBackupPlanRequest> request = null;
        Response<UpdateBackupPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBackupPlanRequestMarshaller().marshall(updateBackupPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBackupPlanResult, JsonUnmarshallerContext> unmarshaller = new UpdateBackupPlanResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBackupPlanResult> responseHandler = new JsonResponseHandler<UpdateBackupPlanResult>(
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
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @return updateRecoveryPointLifecycleResult The response from the
     *         UpdateRecoveryPointLifecycle service method, as returned by AWS
     *         Backup.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws MissingParameterValueException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRecoveryPointLifecycleResult updateRecoveryPointLifecycle(
            UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRecoveryPointLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecoveryPointLifecycleRequest> request = null;
        Response<UpdateRecoveryPointLifecycleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecoveryPointLifecycleRequestMarshaller()
                        .marshall(updateRecoveryPointLifecycleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRecoveryPointLifecycleResult, JsonUnmarshallerContext> unmarshaller = new UpdateRecoveryPointLifecycleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRecoveryPointLifecycleResult> responseHandler = new JsonResponseHandler<UpdateRecoveryPointLifecycleResult>(
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
     * Updates the current service opt-in settings for the Region. If the
     * service has a value set to <code>true</code>, AWS Backup attempts to
     * protect that service's resources in this Region, when included in an
     * on-demand backup or scheduled backup plan. If the value is set to
     * <code>false</code> for a service, AWS Backup does not attempt to protect
     * that service's resources in this Region.
     * </p>
     * 
     * @param updateRegionSettingsRequest
     * @throws ServiceUnavailableException
     * @throws MissingParameterValueException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Backup indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateRegionSettings(UpdateRegionSettingsRequest updateRegionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRegionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegionSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegionSettingsRequestMarshaller()
                        .marshall(updateRegionSettingsRequest);
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
