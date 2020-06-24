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

package com.amazonaws.services.fsx;

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

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.services.fsx.model.transform.*;

/**
 * Client for accessing Amazon FSx. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and
 * application administrators to launch and use shared file storage.
 * </p>
 */
public class AmazonFSxClient extends AmazonWebServiceClient implements AmazonFSx {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon FSx exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonFSx. A
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
    public AmazonFSxClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx. A
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
     *            how this client connects to AmazonFSx (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonFSxClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *         AmazonFSxClient client = new AmazonFSxClient(AWSMobileClient.getInstance());
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
    public AmazonFSxClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *         AmazonFSxClient client = new AmazonFSxClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonFSx (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonFSxClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *         AmazonFSxClient client = new AmazonFSxClient(AWSMobileClient.getInstance());
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
    public AmazonFSxClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *         AmazonFSxClient client = new AmazonFSxClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonFSx (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonFSxClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *            how this client connects to AmazonFSx (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonFSxClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFSx using the
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
     *         AmazonFSxClient client = new AmazonFSxClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonFSx (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonFSxClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ActiveDirectoryErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BackupInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BackupNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BackupRestoringExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DataRepositoryTaskEndedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DataRepositoryTaskExecutingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DataRepositoryTaskNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileSystemNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncompatibleParameterErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidExportPathExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidImportPathExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNetworkSettingsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPerUnitStorageThroughputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingFileSystemConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotServiceResourceErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDoesNotSupportTaggingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("fsx.us-east-1.amazonaws.com");
        this.endpointPrefix = "fsx";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/fsx/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/fsx/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that
     * task is in either the <code>PENDING</code> or <code>EXECUTING</code>
     * state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel
     * operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest <p>
     *            Cancels a data repository task.
     *            </p>
     * @return cancelDataRepositoryTaskResult The response from the
     *         CancelDataRepositoryTask service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws DataRepositoryTaskNotFoundException
     * @throws DataRepositoryTaskEndedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CancelDataRepositoryTaskResult cancelDataRepositoryTask(
            CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDataRepositoryTaskRequest> request = null;
        Response<CancelDataRepositoryTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDataRepositoryTaskRequestMarshaller()
                        .marshall(cancelDataRepositoryTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelDataRepositoryTaskResult, JsonUnmarshallerContext> unmarshaller = new CancelDataRepositoryTaskResultJsonUnmarshaller();
            JsonResponseHandler<CancelDataRepositoryTaskResult> responseHandler = new JsonResponseHandler<CancelDataRepositoryTaskResult>(
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
     * Creates a backup of an existing Amazon FSx file system. Creating regular
     * backups for your file system is a best practice, enabling you to restore
     * a file system from a backup if an issue arises with the original file
     * system.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for
     * file systems with the following configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * is <i>not</i> linked to an Amazon S3 data respository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-backups.html"
     * >https
     * ://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-backups.html</a>.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the
     * parameters match, this operation returns the description of the existing
     * backup. If a backup specified client request token exists, and the
     * parameters don't match, this operation returns
     * <code>IncompatibleParameterError</code>. If a backup with the specified
     * client request token doesn't exist, <code>CreateBackup</code> does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial
     * lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a
     * <code>CreateBackup</code> operation without the risk of creating an extra
     * backup. This approach can be useful when an initial call fails in a way
     * that makes it unclear whether a backup was created. If you use the same
     * client request token and the initial call created a backup, the operation
     * returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateBackup</code> operation returns while the backup's
     * lifecycle state is still <code>CREATING</code>. You can check the backup
     * creation status by calling the <a>DescribeBackups</a> operation, which
     * returns the backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest <p>
     *            The request object for the <code>CreateBackup</code>
     *            operation.
     *            </p>
     * @return createBackupResult The response from the CreateBackup service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws FileSystemNotFoundException
     * @throws BackupInProgressException
     * @throws IncompatibleParameterErrorException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateBackupResult createBackup(CreateBackupRequest createBackupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupRequest> request = null;
        Response<CreateBackupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupRequestMarshaller().marshall(createBackupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBackupResult, JsonUnmarshallerContext> unmarshaller = new CreateBackupResultJsonUnmarshaller();
            JsonResponseHandler<CreateBackupResult> responseHandler = new JsonResponseHandler<CreateBackupResult>(
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
     * Creates an Amazon FSx for Lustre data repository task. You use data
     * repository tasks to perform bulk operations between your Amazon FSx file
     * system and its linked data repository. An example of a data repository
     * task is exporting any data and metadata changes, including POSIX
     * metadata, to files, directories, and symbolic links (symlinks) from your
     * FSx file system to its linked data repository. A
     * <code>CreateDataRepositoryTask</code> operation will fail if a data
     * repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html"
     * >Using Data Repository Tasks</a>. To learn more about linking a data
     * repository to your file system, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/export-data-repository.html#export-prefix"
     * >Setting the Export Prefix</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return createDataRepositoryTaskResult The response from the
     *         CreateDataRepositoryTask service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws FileSystemNotFoundException
     * @throws IncompatibleParameterErrorException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws DataRepositoryTaskExecutingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateDataRepositoryTaskResult createDataRepositoryTask(
            CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataRepositoryTaskRequest> request = null;
        Response<CreateDataRepositoryTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataRepositoryTaskRequestMarshaller()
                        .marshall(createDataRepositoryTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDataRepositoryTaskResult, JsonUnmarshallerContext> unmarshaller = new CreateDataRepositoryTaskResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataRepositoryTaskResult> responseHandler = new JsonResponseHandler<CreateDataRepositoryTaskResult>(
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
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the
     * parameters match, <code>CreateFileSystem</code> returns the description
     * of the existing file system. If a file system specified client request
     * token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an
     * initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon
     * FSx uses to ensure idempotent creation. This means that calling the
     * operation multiple times with the same client request token has no
     * effect. By using the idempotent operation, you can retry a
     * <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails
     * in a way that makes it unclear whether a file system was created.
     * Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call
     * created a file system, the client receives success as long as the
     * parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's
     * lifecycle state is still <code>CREATING</code>. You can check the
     * file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other
     * information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest <p>
     *            The request object used to create a new Amazon FSx file
     *            system.
     *            </p>
     * @return createFileSystemResult The response from the CreateFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws ActiveDirectoryErrorException
     * @throws IncompatibleParameterErrorException
     * @throws InvalidImportPathException
     * @throws InvalidExportPathException
     * @throws InvalidNetworkSettingsException
     * @throws InvalidPerUnitStorageThroughputException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws MissingFileSystemConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemRequest> request = null;
        Response<CreateFileSystemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemRequestMarshaller().marshall(createFileSystemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFileSystemResult, JsonUnmarshallerContext> unmarshaller = new CreateFileSystemResultJsonUnmarshaller();
            JsonResponseHandler<CreateFileSystemResult> responseHandler = new JsonResponseHandler<CreateFileSystemResult>(
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
     * Creates a new Amazon FSx file system from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the
     * parameters match, this operation returns the description of the file
     * system. If a client request token specified by the file system exists and
     * the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and
     * an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup,
     * and backup settings default to the parameters of the file system that was
     * backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a
     * <code>CreateFileSystemFromBackup</code> call without the risk of creating
     * an extra file system. This approach can be useful when an initial call
     * fails in a way that makes it unclear whether a file system was created.
     * Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call
     * created a file system, the client receives success as long as the
     * parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file
     * system's lifecycle state is still <code>CREATING</code>. You can check
     * the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other
     * information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest <p>
     *            The request object for the
     *            <code>CreateFileSystemFromBackup</code> operation.
     *            </p>
     * @return createFileSystemFromBackupResult The response from the
     *         CreateFileSystemFromBackup service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws ActiveDirectoryErrorException
     * @throws IncompatibleParameterErrorException
     * @throws InvalidNetworkSettingsException
     * @throws InvalidPerUnitStorageThroughputException
     * @throws ServiceLimitExceededException
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws MissingFileSystemConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateFileSystemFromBackupResult createFileSystemFromBackup(
            CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFileSystemFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemFromBackupRequest> request = null;
        Response<CreateFileSystemFromBackupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemFromBackupRequestMarshaller()
                        .marshall(createFileSystemFromBackupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFileSystemFromBackupResult, JsonUnmarshallerContext> unmarshaller = new CreateFileSystemFromBackupResultJsonUnmarshaller();
            JsonResponseHandler<CreateFileSystemFromBackupResult> responseHandler = new JsonResponseHandler<CreateFileSystemFromBackupResult>(
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
     * Deletes an Amazon FSx backup, deleting its contents. After deletion, the
     * backup no longer exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not
     * show up in later <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by
     * any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest <p>
     *            The request object for <code>DeleteBackup</code> operation.
     *            </p>
     * @return deleteBackupResult The response from the DeleteBackup service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws BackupInProgressException
     * @throws BackupNotFoundException
     * @throws BackupRestoringException
     * @throws IncompatibleParameterErrorException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestMarshaller().marshall(deleteBackupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBackupResult, JsonUnmarshallerContext> unmarshaller = new DeleteBackupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBackupResult> responseHandler = new JsonResponseHandler<DeleteBackupResult>(
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
     * Deletes a file system, deleting its contents. After deletion, the file
     * system no longer exists, and its data is gone. Any existing automatic
     * backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file
     * system, a final backup is created upon deletion. This final backup is not
     * subject to the file system's retention policy, and must be manually
     * deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system
     * has the <code>DELETING</code> status. You can check the file system
     * deletion status by calling the <a>DescribeFileSystems</a> action, which
     * returns a list of file systems in your account. If you pass the file
     * system ID for a deleted file system, the <a>DescribeFileSystems</a>
     * returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * Deleting an Amazon FSx for Lustre file system will fail with a 400
     * BadRequest if a data repository task is in a <code>PENDING</code> or
     * <code>EXECUTING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered
     * by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest <p>
     *            The request object for <code>DeleteFileSystem</code>
     *            operation.
     *            </p>
     * @return deleteFileSystemResult The response from the DeleteFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws IncompatibleParameterErrorException
     * @throws FileSystemNotFoundException
     * @throws ServiceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemRequest> request = null;
        Response<DeleteFileSystemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemRequestMarshaller().marshall(deleteFileSystemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFileSystemResult, JsonUnmarshallerContext> unmarshaller = new DeleteFileSystemResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFileSystemResult> responseHandler = new JsonResponseHandler<DeleteFileSystemResult>(
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
     * Returns the description of specific Amazon FSx backups, if a
     * <code>BackupIds</code> value is provided for that backup. Otherwise, it
     * returns all backups owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the
     * <code>MaxResults</code> parameter to limit the number of backups in a
     * response. If more backups remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * backups. <code>DescribeBackups</code> is called first without a
     * <code>NextToken</code>value. Then the action continues to be called with
     * the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one
     * <code>DescribeBackups</code> call and the order of backups returned
     * across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest <p>
     *            The request object for <code>DescribeBackups</code> operation.
     *            </p>
     * @return describeBackupsResult The response from the DescribeBackups
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupsRequest> request = null;
        Response<DescribeBackupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupsRequestMarshaller().marshall(describeBackupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBackupsResult, JsonUnmarshallerContext> unmarshaller = new DescribeBackupsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBackupsResult> responseHandler = new JsonResponseHandler<DescribeBackupsResult>(
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
     * Returns the description of specific Amazon FSx for Lustre data repository
     * tasks, if one or more <code>TaskIds</code> values are provided in the
     * request, or if filters are used in the request. You can use filters to
     * narrow the response to include just tasks for specific file systems, or
     * tasks in a specific lifecycle state. Otherwise, it returns all data
     * repository tasks owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the
     * optional <code>MaxResults</code> parameter to limit the number of tasks
     * returned in a response. If more tasks remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return describeDataRepositoryTasksResult The response from the
     *         DescribeDataRepositoryTasks service method, as returned by Amazon
     *         FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws DataRepositoryTaskNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeDataRepositoryTasksResult describeDataRepositoryTasks(
            DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDataRepositoryTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataRepositoryTasksRequest> request = null;
        Response<DescribeDataRepositoryTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataRepositoryTasksRequestMarshaller()
                        .marshall(describeDataRepositoryTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDataRepositoryTasksResult, JsonUnmarshallerContext> unmarshaller = new DescribeDataRepositoryTasksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataRepositoryTasksResult> responseHandler = new JsonResponseHandler<DescribeDataRepositoryTasksResult>(
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
     * Returns the description of specific Amazon FSx file systems, if a
     * <code>FileSystemIds</code> value is provided for that file system.
     * Otherwise, it returns descriptions of all file systems owned by your AWS
     * account in the AWS Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxResults</code> parameter to limit the number of descriptions
     * in a response. If more file system descriptions remain, Amazon FSx
     * returns a <code>NextToken</code> value in the response. In this case,
     * send a later request with the <code>NextToken</code> request parameter
     * set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * file system descriptions. <code>DescribeFileSystems</code> is called
     * first without a <code>NextToken</code>value. Then the action continues to
     * be called with the <code>NextToken</code> parameter set to the value of
     * the last <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call and the order of file systems
     * returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest <p>
     *            The request object for <code>DescribeFileSystems</code>
     *            operation.
     *            </p>
     * @return describeFileSystemsResult The response from the
     *         DescribeFileSystems service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeFileSystemsResult describeFileSystems(
            DescribeFileSystemsRequest describeFileSystemsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFileSystemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemsRequest> request = null;
        Response<DescribeFileSystemsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemsRequestMarshaller()
                        .marshall(describeFileSystemsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFileSystemsResult, JsonUnmarshallerContext> unmarshaller = new DescribeFileSystemsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFileSystemsResult> responseHandler = new JsonResponseHandler<DescribeFileSystemsResult>(
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
     * Lists tags for an Amazon FSx file systems and backups in the case of
     * Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the
     * <code>MaxResults</code> parameter to limit the number of tags in a
     * response. If more tags remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later
     * request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your
     * tags. <code>ListTagsForResource</code> is called first without a
     * <code>NextToken</code>value. Then the action continues to be called with
     * the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no
     * <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file
     * system descriptions while still including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one
     * <code>ListTagsForResource</code> call and the order of tags returned
     * across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest <p>
     *            The request object for <code>ListTagsForResource</code>
     *            operation.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
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
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request object for the <code>TagResource</code> operation.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
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
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            The request object for <code>UntagResource</code> action.
     *            </p>
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     * @throws NotServiceResourceErrorException
     * @throws ResourceDoesNotSupportTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
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
     * Use this operation to update the configuration of an existing Amazon FSx
     * file system. For an Amazon FSx for Lustre file system, you can update
     * only the WeeklyMaintenanceStartTime. For an Amazon for Windows File
     * Server file system, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutomaticBackupRetentionDays
     * </p>
     * </li>
     * <li>
     * <p>
     * DailyAutomaticBackupStartTime
     * </p>
     * </li>
     * <li>
     * <p>
     * SelfManagedActiveDirectoryConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * StorageCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * ThroughputCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * WeeklyMaintenanceStartTime
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can update multiple properties in a single request.
     * </p>
     * 
     * @param updateFileSystemRequest <p>
     *            The request object for the <code>UpdateFileSystem</code>
     *            operation.
     *            </p>
     * @return updateFileSystemResult The response from the UpdateFileSystem
     *         service method, as returned by Amazon FSx.
     * @throws BadRequestException
     * @throws UnsupportedOperationException
     * @throws IncompatibleParameterErrorException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws MissingFileSystemConfigurationException
     * @throws ServiceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             FSx indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest updateFileSystemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFileSystemRequest> request = null;
        Response<UpdateFileSystemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFileSystemRequestMarshaller().marshall(updateFileSystemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateFileSystemResult, JsonUnmarshallerContext> unmarshaller = new UpdateFileSystemResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFileSystemResult> responseHandler = new JsonResponseHandler<UpdateFileSystemResult>(
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
