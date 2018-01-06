/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot;

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

import com.amazonaws.services.iot.model.*;
import com.amazonaws.services.iot.model.transform.*;

/**
 * Client for accessing AWS IoT. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * thing (Thing Registry), configure logging, and create and manage policies and
 * credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 */
public class AWSIotClient extends AmazonWebServiceClient implements AWSIot {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS IoT exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSIot. A
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
    public AWSIotClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot. A
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
     *            how this client connects to AWSIot (ex: proxy settings, retry
     *            counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSIotClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
     * specified AWS account credentials.
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
    public AWSIotClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
     * specified AWS account credentials and client configuration options.
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
     *            how this client connects to AWSIot (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSIotClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
     * specified AWS account credentials provider.
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
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
     * specified AWS account credentials provider and client configuration
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
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSIot (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
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
     *            how this client connects to AWSIot (ex: proxy settings, retry
     *            counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSIot using the
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
     *            how this client connects to AWSIot (ex: proxy settings, retry
     *            counts, etc.).
     * @param httpClient A http client
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new CertificateConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CertificateStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CertificateValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RegistrationCodeValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SqlParseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TransferAlreadyCompletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TransferConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VersionConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VersionsLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iot.us-east-1.amazonaws.com");
        this.endpointPrefix = "iot";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/iot/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/iot/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest <p>
     *            The input for the AcceptCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void acceptCertificateTransfer(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptCertificateTransferRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptCertificateTransferRequestMarshaller()
                        .marshall(acceptCertificateTransferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest <p>
     *            The input for the AttachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws LimitExceededException <p>
     *             The number of attached entities exceeds the limit.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPrincipalPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPrincipalPolicyRequestMarshaller()
                        .marshall(attachPrincipalPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest <p>
     *            The input for the AttachThingPrincipal operation.
     *            </p>
     * @return attachThingPrincipalResult The response from the
     *         AttachThingPrincipal service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public AttachThingPrincipalResult attachThingPrincipal(
            AttachThingPrincipalRequest attachThingPrincipalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachThingPrincipalRequest> request = null;
        Response<AttachThingPrincipalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachThingPrincipalRequestMarshaller()
                        .marshall(attachThingPrincipalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachThingPrincipalResult, JsonUnmarshallerContext> unmarshaller = new AttachThingPrincipalResultJsonUnmarshaller();
            JsonResponseHandler<AttachThingPrincipalResult> responseHandler = new JsonResponseHandler<AttachThingPrincipalResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to
     * cancel a transfer. (Transfer destinations can use
     * <a>RejectCertificateTransfer</a> instead.) After transfer, AWS IoT
     * returns the certificate to the source account in the INACTIVE state.
     * After the destination account has accepted the transfer, the transfer
     * cannot be cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest <p>
     *            The input for the CancelCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void cancelCertificateTransfer(
            CancelCertificateTransferRequest cancelCertificateTransferRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCertificateTransferRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCertificateTransferRequestMarshaller()
                        .marshall(cancelCertificateTransferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in
     * a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory,
     * copying multiple .csr files into that directory, and then specifying that
     * directory on the command line. The following commands show how to create
     * a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR
     * file name to the aws iot create-certificate-from-csr AWS CLI command to
     * create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be
     * run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in
     * my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest <p>
     *            The input for the CreateCertificateFromCsr operation.
     *            </p>
     * @return createCertificateFromCsrResult The response from the
     *         CreateCertificateFromCsr service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateCertificateFromCsrResult createCertificateFromCsr(
            CreateCertificateFromCsrRequest createCertificateFromCsrRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCertificateFromCsrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateFromCsrRequest> request = null;
        Response<CreateCertificateFromCsrResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateFromCsrRequestMarshaller()
                        .marshall(createCertificateFromCsrRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCertificateFromCsrResult, JsonUnmarshallerContext> unmarshaller = new CreateCertificateFromCsrResultJsonUnmarshaller();
            JsonResponseHandler<CreateCertificateFromCsrResult> responseHandler = new JsonResponseHandler<CreateCertificateFromCsrResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the
     * issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this
     * certificate, so it is important to keep it in a secure location.
     * </p>
     * 
     * @param createKeysAndCertificateRequest <p>
     *            The input for the CreateKeysAndCertificate operation.
     *            </p>
     * @return createKeysAndCertificateResult The response from the
     *         CreateKeysAndCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateKeysAndCertificateResult createKeysAndCertificate(
            CreateKeysAndCertificateRequest createKeysAndCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createKeysAndCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeysAndCertificateRequest> request = null;
        Response<CreateKeysAndCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeysAndCertificateRequestMarshaller()
                        .marshall(createKeysAndCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateKeysAndCertificateResult, JsonUnmarshallerContext> unmarshaller = new CreateKeysAndCertificateResultJsonUnmarshaller();
            JsonResponseHandler<CreateKeysAndCertificateResult> responseHandler = new JsonResponseHandler<CreateKeysAndCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest <p>
     *            The input for the CreatePolicy operation.
     *            </p>
     * @return createPolicyResult The response from the CreatePolicy service
     *         method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws MalformedPolicyException <p>
     *             The policy documentation is not valid.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestMarshaller().marshall(createPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePolicyResult, JsonUnmarshallerContext> unmarshaller = new CreatePolicyResultJsonUnmarshaller();
            JsonResponseHandler<CreatePolicyResult> responseHandler = new JsonResponseHandler<CreatePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must use
     * <a>DeletePolicyVersion</a> to delete an existing version before you
     * create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version (that is, the version that
     * is in effect for the certificates to which the policy is attached).
     * </p>
     * 
     * @param createPolicyVersionRequest <p>
     *            The input for the CreatePolicyVersion operation.
     *            </p>
     * @return createPolicyVersionResult The response from the
     *         CreatePolicyVersion service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws MalformedPolicyException <p>
     *             The policy documentation is not valid.
     *             </p>
     * @throws VersionsLimitExceededException <p>
     *             The number of policy versions exceeds the limit.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest createPolicyVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestMarshaller()
                        .marshall(createPolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePolicyVersionResult, JsonUnmarshallerContext> unmarshaller = new CreatePolicyVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreatePolicyVersionResult> responseHandler = new JsonResponseHandler<CreatePolicyVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a thing record in the thing registry.
     * </p>
     * 
     * @param createThingRequest <p>
     *            The input for the CreateThing operation.
     *            </p>
     * @return createThingResult The response from the CreateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateThingResult createThing(CreateThingRequest createThingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingRequest> request = null;
        Response<CreateThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingRequestMarshaller().marshall(createThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateThingResult, JsonUnmarshallerContext> unmarshaller = new CreateThingResultJsonUnmarshaller();
            JsonResponseHandler<CreateThingResult> responseHandler = new JsonResponseHandler<CreateThingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * 
     * @param createThingTypeRequest <p>
     *            The input for the CreateThingType operation.
     *            </p>
     * @return createThingTypeResult The response from the CreateThingType
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public CreateThingTypeResult createThingType(CreateThingTypeRequest createThingTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingTypeRequest> request = null;
        Response<CreateThingTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingTypeRequestMarshaller().marshall(createThingTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateThingTypeResult, JsonUnmarshallerContext> unmarshaller = new CreateThingTypeResultJsonUnmarshaller();
            JsonResponseHandler<CreateThingTypeResult> responseHandler = new JsonResponseHandler<CreateThingTypeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user
     * who has permission to create rules will be able to access data processed
     * by the rule.
     * </p>
     * 
     * @param createTopicRuleRequest <p>
     *            The input for the CreateTopicRule operation.
     *            </p>
     * @throws SqlParseException <p>
     *             The Rule-SQL expression can't be parsed correctly.
     *             </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void createTopicRule(CreateTopicRuleRequest createTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTopicRuleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTopicRuleRequestMarshaller().marshall(createTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * 
     * @param deleteCACertificateRequest <p>
     *            Input for the DeleteCACertificate operation.
     *            </p>
     * @return deleteCACertificateResult The response from the
     *         DeleteCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteCACertificateResult deleteCACertificate(
            DeleteCACertificateRequest deleteCACertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCACertificateRequest> request = null;
        Response<DeleteCACertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCACertificateRequestMarshaller()
                        .marshall(deleteCACertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCACertificateResult, JsonUnmarshallerContext> unmarshaller = new DeleteCACertificateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCACertificateResult> responseHandler = new JsonResponseHandler<DeleteCACertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if
     * its status is set to ACTIVE. To delete a certificate, first use the
     * <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE
     * status.
     * </p>
     * 
     * @param deleteCertificateRequest <p>
     *            The input for the DeleteCertificate operation.
     *            </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deleteCertificate(DeleteCertificateRequest deleteCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestMarshaller()
                        .marshall(deleteCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the DeletePolicyVersion API to delete all
     * non-default versions of the policy; use the DetachPrincipalPolicy API to
     * detach the policy from any certificate; and then use the DeletePolicy API
     * to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest <p>
     *            The input for the DeletePolicy operation.
     *            </p>
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestMarshaller().marshall(deletePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete
     * the default version of a policy using this API. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest <p>
     *            The input for the DeletePolicyVersion operation.
     *            </p>
     * @throws DeleteConflictException <p>
     *             You can't delete the resource because it is attached to one
     *             or more resources.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyVersionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyVersionRequestMarshaller()
                        .marshall(deletePolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest <p>
     *            The input for the DeleteRegistrationCode operation.
     *            </p>
     * @return deleteRegistrationCodeResult The response from the
     *         DeleteRegistrationCode service method, as returned by AWS IoT.
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteRegistrationCodeResult deleteRegistrationCode(
            DeleteRegistrationCodeRequest deleteRegistrationCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRegistrationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegistrationCodeRequest> request = null;
        Response<DeleteRegistrationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegistrationCodeRequestMarshaller()
                        .marshall(deleteRegistrationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRegistrationCodeResult, JsonUnmarshallerContext> unmarshaller = new DeleteRegistrationCodeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRegistrationCodeResult> responseHandler = new JsonResponseHandler<DeleteRegistrationCodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified thing.
     * </p>
     * 
     * @param deleteThingRequest <p>
     *            The input for the DeleteThing operation.
     *            </p>
     * @return deleteThingResult The response from the DeleteThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws VersionConflictException <p>
     *             An exception thrown when the version of a thing passed to a
     *             command is different than the version specified with the
     *             --version parameter.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingRequest> request = null;
        Response<DeleteThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingRequestMarshaller().marshall(deleteThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteThingResult, JsonUnmarshallerContext> unmarshaller = new DeleteThingResultJsonUnmarshaller();
            JsonResponseHandler<DeleteThingResult> responseHandler = new JsonResponseHandler<DeleteThingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified thing type . You cannot delete a thing type if it
     * has things associated with it. To delete a thing type, first mark it as
     * deprecated by calling <a>DeprecateThingType</a>, then remove any
     * associated things by calling <a>UpdateThing</a> to change the thing type
     * on any associated thing, and finally use <a>DeleteThingType</a> to delete
     * the thing type.
     * </p>
     * 
     * @param deleteThingTypeRequest <p>
     *            The input for the DeleteThingType operation.
     *            </p>
     * @return deleteThingTypeResult The response from the DeleteThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeleteThingTypeResult deleteThingType(DeleteThingTypeRequest deleteThingTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingTypeRequest> request = null;
        Response<DeleteThingTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingTypeRequestMarshaller().marshall(deleteThingTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteThingTypeResult, JsonUnmarshallerContext> unmarshaller = new DeleteThingTypeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteThingTypeResult> responseHandler = new JsonResponseHandler<DeleteThingTypeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest <p>
     *            The input for the DeleteTopicRule operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTopicRuleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTopicRuleRequestMarshaller().marshall(deleteTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated
     * thing type.
     * </p>
     * 
     * @param deprecateThingTypeRequest <p>
     *            The input for the DeprecateThingType operation.
     *            </p>
     * @return deprecateThingTypeResult The response from the DeprecateThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DeprecateThingTypeResult deprecateThingType(
            DeprecateThingTypeRequest deprecateThingTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deprecateThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateThingTypeRequest> request = null;
        Response<DeprecateThingTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateThingTypeRequestMarshaller()
                        .marshall(deprecateThingTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeprecateThingTypeResult, JsonUnmarshallerContext> unmarshaller = new DeprecateThingTypeResultJsonUnmarshaller();
            JsonResponseHandler<DeprecateThingTypeResult> responseHandler = new JsonResponseHandler<DeprecateThingTypeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * 
     * @param describeCACertificateRequest <p>
     *            The input for the DescribeCACertificate operation.
     *            </p>
     * @return describeCACertificateResult The response from the
     *         DescribeCACertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeCACertificateResult describeCACertificate(
            DescribeCACertificateRequest describeCACertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCACertificateRequest> request = null;
        Response<DescribeCACertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCACertificateRequestMarshaller()
                        .marshall(describeCACertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCACertificateResult, JsonUnmarshallerContext> unmarshaller = new DescribeCACertificateResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCACertificateResult> responseHandler = new JsonResponseHandler<DescribeCACertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest <p>
     *            The input for the DescribeCertificate operation.
     *            </p>
     * @return describeCertificateResult The response from the
     *         DescribeCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeCertificateResult describeCertificate(
            DescribeCertificateRequest describeCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestMarshaller()
                        .marshall(describeCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCertificateResult, JsonUnmarshallerContext> unmarshaller = new DescribeCertificateResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCertificateResult> responseHandler = new JsonResponseHandler<DescribeCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest <p>
     *            The input for the DescribeEndpoint operation.
     *            </p>
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by AWS IoT.
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestMarshaller().marshall(describeEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointResult> responseHandler = new JsonResponseHandler<DescribeEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest <p>
     *            The input for the DescribeThing operation.
     *            </p>
     * @return describeThingResult The response from the DescribeThing service
     *         method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeThingResult describeThing(DescribeThingRequest describeThingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingRequest> request = null;
        Response<DescribeThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingRequestMarshaller().marshall(describeThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeThingResult, JsonUnmarshallerContext> unmarshaller = new DescribeThingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeThingResult> responseHandler = new JsonResponseHandler<DescribeThingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * 
     * @param describeThingTypeRequest <p>
     *            The input for the DescribeThingType operation.
     *            </p>
     * @return describeThingTypeResult The response from the DescribeThingType
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DescribeThingTypeResult describeThingType(
            DescribeThingTypeRequest describeThingTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingTypeRequest> request = null;
        Response<DescribeThingTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingTypeRequestMarshaller()
                        .marshall(describeThingTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeThingTypeResult, JsonUnmarshallerContext> unmarshaller = new DescribeThingTypeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeThingTypeResult> responseHandler = new JsonResponseHandler<DescribeThingTypeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest <p>
     *            The input for the DetachPrincipalPolicy operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPrincipalPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPrincipalPolicyRequestMarshaller()
                        .marshall(detachPrincipalPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest <p>
     *            The input for the DetachThingPrincipal operation.
     *            </p>
     * @return detachThingPrincipalResult The response from the
     *         DetachThingPrincipal service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public DetachThingPrincipalResult detachThingPrincipal(
            DetachThingPrincipalRequest detachThingPrincipalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachThingPrincipalRequest> request = null;
        Response<DetachThingPrincipalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachThingPrincipalRequestMarshaller()
                        .marshall(detachThingPrincipalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachThingPrincipalResult, JsonUnmarshallerContext> unmarshaller = new DetachThingPrincipalResultJsonUnmarshaller();
            JsonResponseHandler<DetachThingPrincipalResult> responseHandler = new JsonResponseHandler<DetachThingPrincipalResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables the specified rule.
     * </p>
     * 
     * @param disableTopicRuleRequest <p>
     *            The input for the DisableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableTopicRuleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableTopicRuleRequestMarshaller().marshall(disableTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables the specified rule.
     * </p>
     * 
     * @param enableTopicRuleRequest <p>
     *            The input for the EnableTopicRuleRequest operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableTopicRuleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableTopicRuleRequestMarshaller().marshall(enableTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest <p>
     *            The input for the GetLoggingOptions operation.
     *            </p>
     * @return getLoggingOptionsResult The response from the GetLoggingOptions
     *         service method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetLoggingOptionsResult getLoggingOptions(
            GetLoggingOptionsRequest getLoggingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingOptionsRequest> request = null;
        Response<GetLoggingOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingOptionsRequestMarshaller()
                        .marshall(getLoggingOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoggingOptionsResult, JsonUnmarshallerContext> unmarshaller = new GetLoggingOptionsResultJsonUnmarshaller();
            JsonResponseHandler<GetLoggingOptionsResult> responseHandler = new JsonResponseHandler<GetLoggingOptionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * 
     * @param getPolicyRequest <p>
     *            The input for the GetPolicy operation.
     *            </p>
     * @return getPolicyResult The response from the GetPolicy service method,
     *         as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(getPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetPolicyResult> responseHandler = new JsonResponseHandler<GetPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest <p>
     *            The input for the GetPolicyVersion operation.
     *            </p>
     * @return getPolicyVersionResult The response from the GetPolicyVersion
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestMarshaller().marshall(getPolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPolicyVersionResult, JsonUnmarshallerContext> unmarshaller = new GetPolicyVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetPolicyVersionResult> responseHandler = new JsonResponseHandler<GetPolicyVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with AWS IoT.
     * </p>
     * 
     * @param getRegistrationCodeRequest <p>
     *            The input to the GetRegistrationCode operation.
     *            </p>
     * @return getRegistrationCodeResult The response from the
     *         GetRegistrationCode service method, as returned by AWS IoT.
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetRegistrationCodeResult getRegistrationCode(
            GetRegistrationCodeRequest getRegistrationCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRegistrationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegistrationCodeRequest> request = null;
        Response<GetRegistrationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegistrationCodeRequestMarshaller()
                        .marshall(getRegistrationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRegistrationCodeResult, JsonUnmarshallerContext> unmarshaller = new GetRegistrationCodeResultJsonUnmarshaller();
            JsonResponseHandler<GetRegistrationCodeResult> responseHandler = new JsonResponseHandler<GetRegistrationCodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest <p>
     *            The input for the GetTopicRule operation.
     *            </p>
     * @return getTopicRuleResult The response from the GetTopicRule service
     *         method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetTopicRuleResult getTopicRule(GetTopicRuleRequest getTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicRuleRequest> request = null;
        Response<GetTopicRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTopicRuleRequestMarshaller().marshall(getTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTopicRuleResult, JsonUnmarshallerContext> unmarshaller = new GetTopicRuleResultJsonUnmarshaller();
            JsonResponseHandler<GetTopicRuleResult> responseHandler = new JsonResponseHandler<GetTopicRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
     * </p>
     * 
     * @param listCACertificatesRequest <p>
     *            Input for the ListCACertificates operation.
     *            </p>
     * @return listCACertificatesResult The response from the ListCACertificates
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListCACertificatesResult listCACertificates(
            ListCACertificatesRequest listCACertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCACertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCACertificatesRequest> request = null;
        Response<ListCACertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCACertificatesRequestMarshaller()
                        .marshall(listCACertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCACertificatesResult, JsonUnmarshallerContext> unmarshaller = new ListCACertificatesResultJsonUnmarshaller();
            JsonResponseHandler<ListCACertificatesResult> responseHandler = new JsonResponseHandler<ListCACertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the
     * returned marker to retrieve additional results.
     * </p>
     * 
     * @param listCertificatesRequest <p>
     *            The input for the ListCertificates operation.
     *            </p>
     * @return listCertificatesResult The response from the ListCertificates
     *         service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestMarshaller().marshall(listCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCertificatesResult, JsonUnmarshallerContext> unmarshaller = new ListCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<ListCertificatesResult> responseHandler = new JsonResponseHandler<ListCertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * 
     * @param listCertificatesByCARequest <p>
     *            The input to the ListCertificatesByCA operation.
     *            </p>
     * @return listCertificatesByCAResult The response from the
     *         ListCertificatesByCA service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListCertificatesByCAResult listCertificatesByCA(
            ListCertificatesByCARequest listCertificatesByCARequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCertificatesByCARequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesByCARequest> request = null;
        Response<ListCertificatesByCAResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesByCARequestMarshaller()
                        .marshall(listCertificatesByCARequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCertificatesByCAResult, JsonUnmarshallerContext> unmarshaller = new ListCertificatesByCAResultJsonUnmarshaller();
            JsonResponseHandler<ListCertificatesByCAResult> responseHandler = new JsonResponseHandler<ListCertificatesByCAResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists certificates that are being transfered but not yet accepted.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest <p>
     *            The input to the ListOutgoingCertificates operation.
     *            </p>
     * @return listOutgoingCertificatesResult The response from the
     *         ListOutgoingCertificates service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListOutgoingCertificatesResult listOutgoingCertificates(
            ListOutgoingCertificatesRequest listOutgoingCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOutgoingCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOutgoingCertificatesRequest> request = null;
        Response<ListOutgoingCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOutgoingCertificatesRequestMarshaller()
                        .marshall(listOutgoingCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOutgoingCertificatesResult, JsonUnmarshallerContext> unmarshaller = new ListOutgoingCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<ListOutgoingCertificatesResult> responseHandler = new JsonResponseHandler<ListOutgoingCertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest <p>
     *            The input for the ListPolicies operation.
     *            </p>
     * @return listPoliciesResult The response from the ListPolicies service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestMarshaller().marshall(listPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListPoliciesResult> responseHandler = new JsonResponseHandler<ListPoliciesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest <p>
     *            The input for the ListPolicyPrincipals operation.
     *            </p>
     * @return listPolicyPrincipalsResult The response from the
     *         ListPolicyPrincipals service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListPolicyPrincipalsResult listPolicyPrincipals(
            ListPolicyPrincipalsRequest listPolicyPrincipalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPolicyPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyPrincipalsRequest> request = null;
        Response<ListPolicyPrincipalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyPrincipalsRequestMarshaller()
                        .marshall(listPolicyPrincipalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPolicyPrincipalsResult, JsonUnmarshallerContext> unmarshaller = new ListPolicyPrincipalsResultJsonUnmarshaller();
            JsonResponseHandler<ListPolicyPrincipalsResult> responseHandler = new JsonResponseHandler<ListPolicyPrincipalsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default
     * version.
     * </p>
     * 
     * @param listPolicyVersionsRequest <p>
     *            The input for the ListPolicyVersions operation.
     *            </p>
     * @return listPolicyVersionsResult The response from the ListPolicyVersions
     *         service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListPolicyVersionsResult listPolicyVersions(
            ListPolicyVersionsRequest listPolicyVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestMarshaller()
                        .marshall(listPolicyVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPolicyVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListPolicyVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListPolicyVersionsResult> responseHandler = new JsonResponseHandler<ListPolicyVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Cognito identity, the ID must be in <a href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest <p>
     *            The input for the ListPrincipalPolicies operation.
     *            </p>
     * @return listPrincipalPoliciesResult The response from the
     *         ListPrincipalPolicies service method, as returned by AWS IoT.
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListPrincipalPoliciesResult listPrincipalPolicies(
            ListPrincipalPoliciesRequest listPrincipalPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPrincipalPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalPoliciesRequest> request = null;
        Response<ListPrincipalPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalPoliciesRequestMarshaller()
                        .marshall(listPrincipalPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalPoliciesResult> responseHandler = new JsonResponseHandler<ListPrincipalPoliciesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest <p>
     *            The input for the ListPrincipalThings operation.
     *            </p>
     * @return listPrincipalThingsResult The response from the
     *         ListPrincipalThings service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListPrincipalThingsResult listPrincipalThings(
            ListPrincipalThingsRequest listPrincipalThingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPrincipalThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalThingsRequest> request = null;
        Response<ListPrincipalThingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalThingsRequestMarshaller()
                        .marshall(listPrincipalThingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalThingsResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalThingsResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalThingsResult> responseHandler = new JsonResponseHandler<ListPrincipalThingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest <p>
     *            The input for the ListThingPrincipal operation.
     *            </p>
     * @return listThingPrincipalsResult The response from the
     *         ListThingPrincipals service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListThingPrincipalsResult listThingPrincipals(
            ListThingPrincipalsRequest listThingPrincipalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listThingPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingPrincipalsRequest> request = null;
        Response<ListThingPrincipalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingPrincipalsRequestMarshaller()
                        .marshall(listThingPrincipalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListThingPrincipalsResult, JsonUnmarshallerContext> unmarshaller = new ListThingPrincipalsResultJsonUnmarshaller();
            JsonResponseHandler<ListThingPrincipalsResult> responseHandler = new JsonResponseHandler<ListThingPrincipalsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * 
     * @param listThingTypesRequest <p>
     *            The input for the ListThingTypes operation.
     *            </p>
     * @return listThingTypesResult The response from the ListThingTypes service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListThingTypesResult listThingTypes(ListThingTypesRequest listThingTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listThingTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingTypesRequest> request = null;
        Response<ListThingTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingTypesRequestMarshaller().marshall(listThingTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListThingTypesResult, JsonUnmarshallerContext> unmarshaller = new ListThingTypesResultJsonUnmarshaller();
            JsonResponseHandler<ListThingTypesResult> responseHandler = new JsonResponseHandler<ListThingTypesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b>
     * parameters to filter your things. For example, calling
     * <code>ListThings</code> with attributeName=Color and attributeValue=Red
     * retrieves all things in the registry that contain an attribute
     * <b>Color</b> with the value <b>Red</b>.
     * </p>
     * 
     * @param listThingsRequest <p>
     *            The input for the ListThings operation.
     *            </p>
     * @return listThingsResult The response from the ListThings service method,
     *         as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListThingsResult listThings(ListThingsRequest listThingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsRequest> request = null;
        Response<ListThingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsRequestMarshaller().marshall(listThingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListThingsResult, JsonUnmarshallerContext> unmarshaller = new ListThingsResultJsonUnmarshaller();
            JsonResponseHandler<ListThingsResult> responseHandler = new JsonResponseHandler<ListThingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest <p>
     *            The input for the ListTopicRules operation.
     *            </p>
     * @return listTopicRulesResult The response from the ListTopicRules service
     *         method, as returned by AWS IoT.
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListTopicRulesResult listTopicRules(ListTopicRulesRequest listTopicRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTopicRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicRulesRequest> request = null;
        Response<ListTopicRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicRulesRequestMarshaller().marshall(listTopicRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTopicRulesResult, JsonUnmarshallerContext> unmarshaller = new ListTopicRulesResultJsonUnmarshaller();
            JsonResponseHandler<ListTopicRulesResult> responseHandler = new JsonResponseHandler<ListTopicRulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers a CA certificate with AWS IoT. This CA certificate can then be
     * used to sign device certificates, which can be then registered with AWS
     * IoT. You can register up to 10 CA certificates per AWS account that have
     * the same subject field and public key. This enables you to have up to 10
     * certificate authorities sign your device certificates. If you have more
     * than one CA certificate registered, make sure you pass the CA certificate
     * when you register your device certificates with the RegisterCertificate
     * API.
     * </p>
     * 
     * @param registerCACertificateRequest <p>
     *            The input to the RegisterCACertificate operation.
     *            </p>
     * @return registerCACertificateResult The response from the
     *         RegisterCACertificate service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws RegistrationCodeValidationException <p>
     *             The registration code is invalid.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateValidationException <p>
     *             The certificate is invalid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws LimitExceededException <p>
     *             The number of attached entities exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public RegisterCACertificateResult registerCACertificate(
            RegisterCACertificateRequest registerCACertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCACertificateRequest> request = null;
        Response<RegisterCACertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCACertificateRequestMarshaller()
                        .marshall(registerCACertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterCACertificateResult, JsonUnmarshallerContext> unmarshaller = new RegisterCACertificateResultJsonUnmarshaller();
            JsonResponseHandler<RegisterCACertificateResult> responseHandler = new JsonResponseHandler<RegisterCACertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers a device certificate with AWS IoT. If you have more than one CA
     * certificate that has the same subject field, you must specify the CA
     * certificate that was used to sign the device certificate being
     * registered.
     * </p>
     * 
     * @param registerCertificateRequest <p>
     *            The input to the RegisterCertificate operation.
     *            </p>
     * @return registerCertificateResult The response from the
     *         RegisterCertificate service method, as returned by AWS IoT.
     * @throws ResourceAlreadyExistsException <p>
     *             The resource already exists.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws CertificateValidationException <p>
     *             The certificate is invalid.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws CertificateConflictException <p>
     *             Unable to verify the CA certificate used to sign the device
     *             certificate you are attempting to register. This is happens
     *             when you have registered more than one CA certificate that
     *             has the same subject field and public key.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public RegisterCertificateResult registerCertificate(
            RegisterCertificateRequest registerCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCertificateRequest> request = null;
        Response<RegisterCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCertificateRequestMarshaller()
                        .marshall(registerCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterCertificateResult, JsonUnmarshallerContext> unmarshaller = new RegisterCertificateResultJsonUnmarshaller();
            JsonResponseHandler<RegisterCertificateResult> responseHandler = new JsonResponseHandler<RegisterCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it
     * is called, the certificate will be returned to the source's account in
     * the INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest <p>
     *            The input for the RejectCertificateTransfer operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws TransferAlreadyCompletedException <p>
     *             You can't revert the certificate transfer because the
     *             transfer is already complete.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void rejectCertificateTransfer(
            RejectCertificateTransferRequest rejectCertificateTransferRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rejectCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectCertificateTransferRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectCertificateTransferRequestMarshaller()
                        .marshall(rejectCertificateTransferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the new
     * rule. Creating rules is an administrator-level action. Any user who has
     * permission to create rules will be able to access data processed by the
     * rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest <p>
     *            The input for the ReplaceTopicRule operation.
     *            </p>
     * @throws SqlParseException <p>
     *             The Rule-SQL expression can't be parsed correctly.
     *             </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(replaceTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplaceTopicRuleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplaceTopicRuleRequestMarshaller().marshall(replaceTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates to
     * which the policy is attached. To list the principals the policy is
     * attached to, use the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest <p>
     *            The input for the SetDefaultPolicyVersion operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void setDefaultPolicyVersion(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultPolicyVersionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPolicyVersionRequestMarshaller()
                        .marshall(setDefaultPolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest <p>
     *            The input for the SetLoggingOptions operation.
     *            </p>
     * @throws InternalException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void setLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoggingOptionsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoggingOptionsRequestMarshaller()
                        .marshall(setLoggingOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up
     * to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You
     * can use the UpdateCertificate API to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use
     * the DetachPrincipalPolicy API to detach them.
     * </p>
     * 
     * @param transferCertificateRequest <p>
     *            The input for the TransferCertificate operation.
     *            </p>
     * @return transferCertificateResult The response from the
     *         TransferCertificate service method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws TransferConflictException <p>
     *             You can't transfer the certificate because authorization
     *             policies are still attached.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public TransferCertificateResult transferCertificate(
            TransferCertificateRequest transferCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(transferCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferCertificateRequest> request = null;
        Response<TransferCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferCertificateRequestMarshaller()
                        .marshall(transferCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TransferCertificateResult, JsonUnmarshallerContext> unmarshaller = new TransferCertificateResultJsonUnmarshaller();
            JsonResponseHandler<TransferCertificateResult> responseHandler = new JsonResponseHandler<TransferCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * 
     * @param updateCACertificateRequest <p>
     *            The input to the UpdateCACertificate operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void updateCACertificate(UpdateCACertificateRequest updateCACertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCACertificateRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCACertificateRequestMarshaller()
                        .marshall(updateCACertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will not
     * disconnect currently connected devices, but these devices will be unable
     * to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS
     * IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest <p>
     *            The input for the UpdateCertificate operation.
     *            </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws CertificateStateException <p>
     *             The certificate operation is not allowed.
     *             </p>
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void updateCertificate(UpdateCertificateRequest updateCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateRequestMarshaller()
                        .marshall(updateCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest <p>
     *            The input for the UpdateThing operation.
     *            </p>
     * @return updateThingResult The response from the UpdateThing service
     *         method, as returned by AWS IoT.
     * @throws InvalidRequestException <p>
     *             The request is not valid.
     *             </p>
     * @throws VersionConflictException <p>
     *             An exception thrown when the version of a thing passed to a
     *             command is different than the version specified with the
     *             --version parameter.
     *             </p>
     * @throws ThrottlingException <p>
     *             The rate exceeds the limit.
     *             </p>
     * @throws UnauthorizedException <p>
     *             You are not authorized to perform this operation.
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             The service is temporarily unavailable.
     *             </p>
     * @throws InternalFailureException <p>
     *             An unexpected error has occurred.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The specified resource does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public UpdateThingResult updateThing(UpdateThingRequest updateThingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingRequest> request = null;
        Response<UpdateThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingRequestMarshaller().marshall(updateThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateThingResult, JsonUnmarshallerContext> unmarshaller = new UpdateThingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateThingResult> responseHandler = new JsonResponseHandler<UpdateThingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
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
