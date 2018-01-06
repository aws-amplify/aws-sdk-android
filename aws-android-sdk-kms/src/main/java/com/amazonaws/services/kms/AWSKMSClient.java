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

package com.amazonaws.services.kms;

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

import com.amazonaws.services.kms.model.*;
import com.amazonaws.services.kms.model.transform.*;

/**
 * Client for accessing AWS Key Management Service. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web
 * service. This guide describes the AWS KMS operations that you can call
 * programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key
 * Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .Net, iOS, Android, etc.).
 * The SDKs provide a convenient way to create programmatic access to AWS KMS
 * and other AWS services. For example, the SDKs take care of tasks such as
 * signing requests (see below), managing errors, and retrying requests
 * automatically. For more information about the AWS SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS
 * KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS
 * 1.2. Clients must also support cipher suites with Perfect Forward Secrecy
 * (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support
 * these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We
 * strongly recommend that you <i>do not</i> use your AWS account (root) access
 * key ID and secret key for everyday work with AWS KMS. Instead, use the access
 * key ID and secret access key for an IAM user, or you can use the AWS Security
 * Token Service to generate temporary security credentials that you can use to
 * sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3 bucket
 * that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to turn it
 * on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS
 * CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a> - This topic provides general information about
 * the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html"
 * >Temporary Security Credentials</a> - This section of the <i>IAM User
 * Guide</i> describes how to create and use temporary security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a> - This set of topics walks you
 * through the process of signing a request using an access key ID and a secret
 * access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful
 * for most applications. You will likely perform actions other than these, such
 * as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * </ul>
 */
public class AWSKMSClient extends AmazonWebServiceClient implements AWSKMS {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Key Management Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSKMS. A
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
    public AWSKMSClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS. A
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
     *            how this client connects to AWSKMS (ex: proxy settings, retry
     *            counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSKMSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
    public AWSKMSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
     *            how this client connects to AWSKMS (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSKMSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
     *            how this client connects to AWSKMS (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
     *            how this client connects to AWSKMS (ex: proxy settings, retry
     *            counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSKMS using the
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
     *            how this client connects to AWSKMS (ex: proxy settings, retry
     *            counts, etc.).
     * @param httpClient A http client
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredImportTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncorrectKeyMaterialExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAliasNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCiphertextExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGrantIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGrantTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidImportTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidKeyUsageExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMarkerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KeyUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("kms.us-east-1.amazonaws.com");
        this.endpointPrefix = "kms";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/kms/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/kms/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation
     * is successful, the CMK is set to the <code>Disabled</code> state. To
     * enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK,
     * see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return cancelKeyDeletionResult The response from the CancelKeyDeletion
     *         service method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CancelKeyDeletionResult cancelKeyDeletion(
            CancelKeyDeletionRequest cancelKeyDeletionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelKeyDeletionRequest> request = null;
        Response<CancelKeyDeletionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelKeyDeletionRequestMarshaller()
                        .marshall(cancelKeyDeletionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelKeyDeletionResult, JsonUnmarshallerContext> unmarshaller = new CancelKeyDeletionResultJsonUnmarshaller();
            JsonResponseHandler<CancelKeyDeletionResult> responseHandler = new JsonResponseHandler<CancelKeyDeletionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to
     * identify a key and should be unique. The console enforces a one-to-one
     * mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes
     * (-). An alias must start with the word "alias" followed by a forward
     * slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @throws DependencyTimeoutException
     * @throws AlreadyExistsException
     * @throws NotFoundException
     * @throws InvalidAliasNameException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void createAlias(CreateAliasRequest createAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(createAliasRequest);
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
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
     * >Grants</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @return createGrantResult The response from the CreateGrant service
     *         method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws KMSInternalException
     * @throws InvalidGrantTokenException
     * @throws LimitExceededException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateGrantResult createGrant(CreateGrantRequest createGrantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantRequest> request = null;
        Response<CreateGrantResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantRequestMarshaller().marshall(createGrantRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGrantResult, JsonUnmarshallerContext> unmarshaller = new CreateGrantResultJsonUnmarshaller();
            JsonResponseHandler<CreateGrantResult> responseHandler = new JsonResponseHandler<CreateGrantResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a customer master key (CMK).
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (4 KiB or less)
     * directly, but CMKs are more commonly used to encrypt data encryption keys
     * (DEKs), which are used to encrypt raw data. For more information about
     * DEKs and the difference between CMKs and DEKs, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <a>GenerateDataKey</a> operation
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * Key Management Service Concepts</a> in the <i>AWS Key Management Service
     * Developer Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @return createKeyResult The response from the CreateKey service method,
     *         as returned by AWS Key Management Service.
     * @throws MalformedPolicyDocumentException
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateKeyResult createKey(CreateKeyRequest createKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyRequest> request = null;
        Response<CreateKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyRequestMarshaller().marshall(createKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateKeyResult, JsonUnmarshallerContext> unmarshaller = new CreateKeyResultJsonUnmarshaller();
            JsonResponseHandler<CreateKeyResult> responseHandler = new JsonResponseHandler<CreateKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateDataKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant <code>Decrypt</code>
     * permission on all resources), then ciphertext encrypted by using keys in
     * other accounts where the key grants access to the caller can be
     * decrypted. To remedy this, we recommend that you do not grant
     * <code>Decrypt</code> access in an IAM user policy. Instead grant
     * <code>Decrypt</code> access only in key policies. If you must grant
     * <code>Decrypt</code> access in an IAM user policy, you should scope the
     * resource to specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @return decryptResult The response from the Decrypt service method, as
     *         returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws KeyUnavailableException
     * @throws DependencyTimeoutException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DecryptResult decrypt(DecryptRequest decryptRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(decryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecryptRequest> request = null;
        Response<DecryptResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecryptRequestMarshaller().marshall(decryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DecryptResult, JsonUnmarshallerContext> unmarshaller = new DecryptResultJsonUnmarshaller();
            JsonResponseHandler<DecryptResult> responseHandler = new JsonResponseHandler<DecryptResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(deleteAliasRequest);
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
     * Deletes key material that you previously imported and makes the specified
     * customer master key (CMK) unusable. For more information about importing
     * key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the specified CMK is in the <code>PendingDeletion</code> state, this
     * operation does not change the CMK's state. Otherwise, it changes the
     * CMK's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to
     * reimport the same key material into the CMK.
     * </p>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteImportedKeyMaterial(
            DeleteImportedKeyMaterialRequest deleteImportedKeyMaterialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteImportedKeyMaterialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImportedKeyMaterialRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImportedKeyMaterialRequestMarshaller()
                        .marshall(deleteImportedKeyMaterialRequest);
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
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @return describeKeyResult The response from the DescribeKey service
     *         method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeKeyResult describeKey(DescribeKeyRequest describeKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyRequest> request = null;
        Response<DescribeKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyRequestMarshaller().marshall(describeKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeKeyResult, JsonUnmarshallerContext> unmarshaller = new DescribeKeyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeKeyResult> responseHandler = new JsonResponseHandler<DescribeKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to disabled, thereby
     * preventing its use for cryptographic operations. For more information
     * about how key state affects the use of a CMK, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void disableKey(DisableKeyRequest disableKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRequestMarshaller().marshall(disableKeyRequest);
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
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void disableKeyRotation(DisableKeyRotationRequest disableKeyRotationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRotationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRotationRequestMarshaller()
                        .marshall(disableKeyRotationRequest);
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
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void enableKey(EnableKeyRequest enableKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRequestMarshaller().marshall(enableKeyRequest);
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
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void enableKeyRotation(EnableKeyRotationRequest enableKeyRotationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRotationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRotationRequestMarshaller()
                        .marshall(enableKeyRotationRequest);
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
     * Encrypts plaintext into ciphertext by using a customer master key. The
     * <code>Encrypt</code> function has two primary use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can encrypt up to 4 KB of arbitrary data such as an RSA key, a
     * database password, or other sensitive customer information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are moving encrypted data from one region to another, you can use
     * this API to encrypt in the new region the plaintext data key that was
     * used to encrypt the data in the original region. This provides you with
     * an encrypted copy of the data key that can be decrypted in the new region
     * and used there to decrypt the encrypted data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a region.
     * You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a>
     * function. Data keys don't need to be encrypted again by calling
     * <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the
     * <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer master
     * key (CMK) of your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @return encryptResult The response from the Encrypt service method, as
     *         returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws KeyUnavailableException
     * @throws DependencyTimeoutException
     * @throws InvalidKeyUsageException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public EncryptResult encrypt(EncryptRequest encryptRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(encryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EncryptRequest> request = null;
        Response<EncryptResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EncryptRequestMarshaller().marshall(encryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EncryptResult, JsonUnmarshallerContext> unmarshaller = new EncryptResultJsonUnmarshaller();
            JsonResponseHandler<EncryptResult> responseHandler = new JsonResponseHandler<EncryptResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a data encryption key that you can use in your application to
     * encrypt data locally.
     * </p>
     * <p>
     * You must specify the customer master key (CMK) under which to generate
     * the data key. You must also specify the length of the data key using
     * either the <code>KeySpec</code> or <code>NumberOfBytes</code> field. You
     * must specify one field or the other, but not both. For common key lengths
     * (128-bit and 256-bit symmetric keys), we recommend that you use
     * <code>KeySpec</code>.
     * </p>
     * <p>
     * This operation returns a plaintext copy of the data key in the
     * <code>Plaintext</code> field of the response, and an encrypted copy of
     * the data key in the <code>CiphertextBlob</code> field. The data key is
     * encrypted under the CMK specified in the <code>KeyId</code> field of the
     * request.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally
     * in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use this operation (<code>GenerateDataKey</code>) to retrieve a data
     * encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data encryption key (returned in the
     * <code>Plaintext</code> field of the response) to encrypt data locally,
     * then erase the plaintext data key from memory.
     * </p>
     * </li>
     * <li>
     * <p>
     * Store the encrypted data key (returned in the <code>CiphertextBlob</code>
     * field of the response) alongside the locally encrypted data.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To decrypt data locally:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key into a
     * plaintext copy of the data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key to decrypt data locally, then erase the
     * plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To return only an encrypted copy of the data key, use
     * <a>GenerateDataKeyWithoutPlaintext</a>. To return an arbitrary
     * unpredictable byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * If you use the optional <code>EncryptionContext</code> field, you must
     * store at least enough information to be able to reconstruct the full
     * encryption context when you later send the ciphertext to the
     * <a>Decrypt</a> operation. It is a good practice to choose an encryption
     * context that you can reconstruct on the fly to better secure the
     * ciphertext. For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @return generateDataKeyResult The response from the GenerateDataKey
     *         service method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws KeyUnavailableException
     * @throws DependencyTimeoutException
     * @throws InvalidKeyUsageException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest generateDataKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyRequest> request = null;
        Response<GenerateDataKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyRequestMarshaller().marshall(generateDataKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateDataKeyResult, JsonUnmarshallerContext> unmarshaller = new GenerateDataKeyResultJsonUnmarshaller();
            JsonResponseHandler<GenerateDataKeyResult> responseHandler = new JsonResponseHandler<GenerateDataKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a data encryption key encrypted under a customer master key
     * (CMK). This operation is identical to <a>GenerateDataKey</a> but returns
     * only the encrypted copy of the data key.
     * </p>
     * <p>
     * This operation is useful in a system that has multiple components with
     * different degrees of trust. For example, consider a system that stores
     * encrypted data in containers. Each container stores the encrypted data
     * and an encrypted copy of the data key. One component of the system,
     * called the <i>control plane</i>, creates new containers. When it creates
     * a new container, it uses this operation (
     * <code>GenerateDataKeyWithoutPlaintext</code>) to get an encrypted data
     * key and then stores it in the container. Later, a different component of
     * the system, called the <i>data plane</i>, puts encrypted data into the
     * containers. To do this, it passes the encrypted data key to the
     * <a>Decrypt</a> operation, then uses the returned plaintext data key to
     * encrypt data, and finally stores the encrypted data in the container. In
     * this system, the control plane never sees the plaintext data key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return generateDataKeyWithoutPlaintextResult The response from the
     *         GenerateDataKeyWithoutPlaintext service method, as returned by
     *         AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws KeyUnavailableException
     * @throws DependencyTimeoutException
     * @throws InvalidKeyUsageException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyWithoutPlaintextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyWithoutPlaintextRequest> request = null;
        Response<GenerateDataKeyWithoutPlaintextResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyWithoutPlaintextRequestMarshaller()
                        .marshall(generateDataKeyWithoutPlaintextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateDataKeyWithoutPlaintextResult, JsonUnmarshallerContext> unmarshaller = new GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller();
            JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult> responseHandler = new JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @return generateRandomResult The response from the GenerateRandom service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom(GenerateRandomRequest generateRandomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(generateRandomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateRandomRequest> request = null;
        Response<GenerateRandomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateRandomRequestMarshaller().marshall(generateRandomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateRandomResult, JsonUnmarshallerContext> unmarshaller = new GenerateRandomResultJsonUnmarshaller();
            JsonResponseHandler<GenerateRandomResult> responseHandler = new JsonResponseHandler<GenerateRandomResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return getKeyPolicyResult The response from the GetKeyPolicy service
     *         method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest getKeyPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPolicyRequest> request = null;
        Response<GetKeyPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPolicyRequestMarshaller().marshall(getKeyPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetKeyPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyPolicyResult> responseHandler = new JsonResponseHandler<GetKeyPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled
     * for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return getKeyRotationStatusResult The response from the
     *         GetKeyRotationStatus service method, as returned by AWS Key
     *         Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetKeyRotationStatusResult getKeyRotationStatus(
            GetKeyRotationStatusRequest getKeyRotationStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getKeyRotationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyRotationStatusRequest> request = null;
        Response<GetKeyRotationStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyRotationStatusRequestMarshaller()
                        .marshall(getKeyRotationStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetKeyRotationStatusResult, JsonUnmarshallerContext> unmarshaller = new GetKeyRotationStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetKeyRotationStatusResult> responseHandler = new JsonResponseHandler<GetKeyRotationStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the items you need in order to import key material into AWS KMS
     * from your existing key management infrastructure. For more information
     * about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the customer master key (CMK) into which
     * you will import key material. This CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>. You must also specify the wrapping algorithm and
     * type of wrapping key (public key) that you will use to encrypt the key
     * material.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public
     * key to encrypt the key material. Store the import token to send with a
     * subsequent <a>ImportKeyMaterial</a> request. The public key and import
     * token from the same response must be used together. These items are valid
     * for 24 hours, after which they cannot be used for a subsequent
     * <a>ImportKeyMaterial</a> request. To retrieve new ones, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param getParametersForImportRequest
     * @return getParametersForImportResult The response from the
     *         GetParametersForImport service method, as returned by AWS Key
     *         Management Service.
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetParametersForImportResult getParametersForImport(
            GetParametersForImportRequest getParametersForImportRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getParametersForImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersForImportRequest> request = null;
        Response<GetParametersForImportResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersForImportRequestMarshaller()
                        .marshall(getParametersForImportRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetParametersForImportResult, JsonUnmarshallerContext> unmarshaller = new GetParametersForImportResultJsonUnmarshaller();
            JsonResponseHandler<GetParametersForImportResult> responseHandler = new JsonResponseHandler<GetParametersForImportResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Imports key material into an AWS KMS customer master key (CMK) from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the CMK to import the key material into.
     * This CMK's <code>Origin</code> must be <code>EXTERNAL</code>. You must
     * also send an import token and the encrypted key material. Send the import
     * token that you received in the same <a>GetParametersForImport</a>
     * response that contained the public key that you used to encrypt the key
     * material. You must also specify whether the key material expires and if
     * so, when. When the key material expires, AWS KMS deletes the key material
     * and the CMK becomes unusable. To use the CMK again, you can reimport the
     * same key material. If you set an expiration date, you can change it only
     * by reimporting the same key material and specifying a new expiration
     * date.
     * </p>
     * <p>
     * When this operation is successful, the specified CMK's key state changes
     * to <code>Enabled</code>, and you can use the CMK.
     * </p>
     * <p>
     * After you successfully import key material into a CMK, you can reimport
     * the same key material into that CMK, but you cannot import different key
     * material.
     * </p>
     * 
     * @param importKeyMaterialRequest
     * @return importKeyMaterialResult The response from the ImportKeyMaterial
     *         service method, as returned by AWS Key Management Service.
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws InvalidCiphertextException
     * @throws IncorrectKeyMaterialException
     * @throws ExpiredImportTokenException
     * @throws InvalidImportTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ImportKeyMaterialResult importKeyMaterial(
            ImportKeyMaterialRequest importKeyMaterialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importKeyMaterialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyMaterialRequest> request = null;
        Response<ImportKeyMaterialResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyMaterialRequestMarshaller()
                        .marshall(importKeyMaterialRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportKeyMaterialResult, JsonUnmarshallerContext> unmarshaller = new ImportKeyMaterialResultJsonUnmarshaller();
            JsonResponseHandler<ImportKeyMaterialResult> responseHandler = new JsonResponseHandler<ImportKeyMaterialResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(listAliasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> unmarshaller = new ListAliasesResultJsonUnmarshaller();
            JsonResponseHandler<ListAliasesResult> responseHandler = new JsonResponseHandler<ListAliasesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @return listGrantsResult The response from the ListGrants service method,
     *         as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws InvalidArnException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListGrantsResult listGrants(ListGrantsRequest listGrantsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGrantsRequest> request = null;
        Response<ListGrantsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGrantsRequestMarshaller().marshall(listGrantsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGrantsResult, JsonUnmarshallerContext> unmarshaller = new ListGrantsResultJsonUnmarshaller();
            JsonResponseHandler<ListGrantsResult> responseHandler = new JsonResponseHandler<ListGrantsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return listKeyPoliciesResult The response from the ListKeyPolicies
     *         service method, as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest listKeyPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listKeyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPoliciesRequest> request = null;
        Response<ListKeyPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPoliciesRequestMarshaller().marshall(listKeyPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKeyPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListKeyPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListKeyPoliciesResult> responseHandler = new JsonResponseHandler<ListKeyPoliciesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @return listKeysResult The response from the ListKeys service method, as
     *         returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws InvalidMarkerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListKeysResult listKeys(ListKeysRequest listKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeysRequest> request = null;
        Response<ListKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeysRequestMarshaller().marshall(listKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKeysResult, JsonUnmarshallerContext> unmarshaller = new ListKeysResultJsonUnmarshaller();
            JsonResponseHandler<ListKeysResult> responseHandler = new JsonResponseHandler<ListKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @return listRetirableGrantsResult The response from the
     *         ListRetirableGrants service method, as returned by AWS Key
     *         Management Service.
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws InvalidArnException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListRetirableGrantsResult listRetirableGrants(
            ListRetirableGrantsRequest listRetirableGrantsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRetirableGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetirableGrantsRequest> request = null;
        Response<ListRetirableGrantsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetirableGrantsRequestMarshaller()
                        .marshall(listRetirableGrantsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRetirableGrantsResult, JsonUnmarshallerContext> unmarshaller = new ListRetirableGrantsResultJsonUnmarshaller();
            JsonResponseHandler<ListRetirableGrantsResult> responseHandler = new JsonResponseHandler<ListRetirableGrantsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches a key policy to the specified customer master key (CMK).
     * </p>
     * <p>
     * For more information about key policies, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key Policies</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws MalformedPolicyDocumentException
     * @throws DependencyTimeoutException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void putKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeyPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeyPolicyRequestMarshaller().marshall(putKeyPolicyRequest);
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
     * Encrypts data on the server side with a new customer master key (CMK)
     * without exposing the plaintext of the data on the client side. The data
     * is first decrypted and then reencrypted. You can also use this operation
     * to change the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other operations, <code>ReEncrypt</code> is authorized twice, once
     * as <code>ReEncryptFrom</code> on the source CMK and once as
     * <code>ReEncryptTo</code> on the destination CMK. We recommend that you
     * include the <code>"kms:ReEncrypt*"</code> permission in your <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >key policies</a> to permit reencryption from or to the CMK. This
     * permission is automatically included in the key policy when you create a
     * CMK through the console, but you must include it manually when you create
     * a CMK programmatically or when you set a key policy with the
     * <a>PutKeyPolicy</a> operation.
     * </p>
     * 
     * @param reEncryptRequest
     * @return reEncryptResult The response from the ReEncrypt service method,
     *         as returned by AWS Key Management Service.
     * @throws NotFoundException
     * @throws DisabledException
     * @throws InvalidCiphertextException
     * @throws KeyUnavailableException
     * @throws DependencyTimeoutException
     * @throws InvalidKeyUsageException
     * @throws InvalidGrantTokenException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ReEncryptResult reEncrypt(ReEncryptRequest reEncryptRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(reEncryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReEncryptRequest> request = null;
        Response<ReEncryptResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReEncryptRequestMarshaller().marshall(reEncryptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ReEncryptResult, JsonUnmarshallerContext> unmarshaller = new ReEncryptResultJsonUnmarshaller();
            JsonResponseHandler<ReEncryptResult> responseHandler = new JsonResponseHandler<ReEncryptResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retires a grant. To clean up, you can retire a grant when you're done
     * using it. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account (root user) under which the grant was created
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RetiringPrincipal</code>, if present in the grant
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is an
     * operation specified in the grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must identify the grant to retire by its grant token or by a
     * combination of the grant ID and the Amazon Resource Name (ARN) of the
     * customer master key (CMK). A grant token is a unique variable-length
     * base64-encoded string. A grant ID is a 64 character unique identifier of
     * a grant. The <a>CreateGrant</a> operation returns both.
     * </p>
     * 
     * @param retireGrantRequest
     * @throws InvalidGrantTokenException
     * @throws InvalidGrantIdException
     * @throws NotFoundException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void retireGrant(RetireGrantRequest retireGrantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(retireGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetireGrantRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetireGrantRequestMarshaller().marshall(retireGrantRequest);
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
     * Revokes a grant. You can revoke a grant to actively deny operations that
     * depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @throws NotFoundException
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws InvalidGrantIdException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void revokeGrant(RevokeGrantRequest revokeGrantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeGrantRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeGrantRequestMarshaller().marshall(revokeGrantRequest);
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
     * Schedules the deletion of a customer master key (CMK). You may provide a
     * waiting period, specified in days, before deletion occurs. If you do not
     * provide a waiting period, the default period of 30 days is used. When
     * this operation is successful, the state of the CMK changes to
     * <code>PendingDeletion</code>. Before the waiting period ends, you can use
     * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the
     * waiting period ends, AWS KMS deletes the CMK and all AWS KMS data
     * associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When
     * a CMK is deleted, all data that was encrypted under the CMK is rendered
     * unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return scheduleKeyDeletionResult The response from the
     *         ScheduleKeyDeletion service method, as returned by AWS Key
     *         Management Service.
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ScheduleKeyDeletionResult scheduleKeyDeletion(
            ScheduleKeyDeletionRequest scheduleKeyDeletionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(scheduleKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScheduleKeyDeletionRequest> request = null;
        Response<ScheduleKeyDeletionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScheduleKeyDeletionRequestMarshaller()
                        .marshall(scheduleKeyDeletionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ScheduleKeyDeletionResult, JsonUnmarshallerContext> unmarshaller = new ScheduleKeyDeletionResultJsonUnmarshaller();
            JsonResponseHandler<ScheduleKeyDeletionResult> responseHandler = new JsonResponseHandler<ScheduleKeyDeletionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to
     * and unmapped from an existing key without changing the properties of the
     * key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes
     * (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with
     * "aws" after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @throws DependencyTimeoutException
     * @throws NotFoundException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void updateAlias(UpdateAliasRequest updateAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestMarshaller().marshall(updateAliasRequest);
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
     * Updates the description of a customer master key (CMK).
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void updateKeyDescription(UpdateKeyDescriptionRequest updateKeyDescriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateKeyDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeyDescriptionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeyDescriptionRequestMarshaller()
                        .marshall(updateKeyDescriptionRequest);
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
     * Creates a customer master key (CMK).
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (4 KiB or less)
     * directly, but CMKs are more commonly used to encrypt data encryption keys
     * (DEKs), which are used to encrypt raw data. For more information about
     * DEKs and the difference between CMKs and DEKs, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <a>GenerateDataKey</a> operation
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS
     * Key Management Service Concepts</a> in the <i>AWS Key Management Service
     * Developer Guide</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return createKeyResult The response from the CreateKey service method,
     *         as returned by AWS Key Management Service.
     * @throws MalformedPolicyDocumentException
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateKeyResult createKey()
            throws AmazonServiceException, AmazonClientException {
        CreateKeyRequest createKeyRequest = new CreateKeyRequest();
        return createKey(createKeyRequest);
    }

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @return listKeysResult The response from the ListKeys service method, as
     *         returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws InvalidMarkerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListKeysResult listKeys()
            throws AmazonServiceException, AmazonClientException {
        ListKeysRequest listKeysRequest = new ListKeysRequest();
        return listKeys(listKeysRequest);
    }

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases()
            throws AmazonServiceException, AmazonClientException {
        ListAliasesRequest listAliasesRequest = new ListAliasesRequest();
        return listAliases(listAliasesRequest);
    }

    /**
     * <p>
     * Retires a grant. To clean up, you can retire a grant when you're done
     * using it. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account (root user) under which the grant was created
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RetiringPrincipal</code>, if present in the grant
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is an
     * operation specified in the grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must identify the grant to retire by its grant token or by a
     * combination of the grant ID and the Amazon Resource Name (ARN) of the
     * customer master key (CMK). A grant token is a unique variable-length
     * base64-encoded string. A grant ID is a 64 character unique identifier of
     * a grant. The <a>CreateGrant</a> operation returns both.
     * </p>
     * 
     * @throws InvalidGrantTokenException
     * @throws InvalidGrantIdException
     * @throws NotFoundException
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws KMSInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void retireGrant()
            throws AmazonServiceException, AmazonClientException {
        RetireGrantRequest retireGrantRequest = new RetireGrantRequest();
        retireGrant(retireGrantRequest);
    }

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @return generateRandomResult The response from the GenerateRandom service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GenerateRandomResult generateRandom()
            throws AmazonServiceException, AmazonClientException {
        GenerateRandomRequest generateRandomRequest = new GenerateRandomRequest();
        return generateRandom(generateRandomRequest);
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
