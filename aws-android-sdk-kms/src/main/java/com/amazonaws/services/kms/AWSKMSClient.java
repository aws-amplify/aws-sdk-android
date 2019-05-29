/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/"> <i>AWS Key
 * Management Service Developer Guide</i> </a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .Net, macOS, Android, etc.).
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
 * key ID and secret access key for an IAM user. You can also use the AWS
 * Security Token Service to generate temporary security credentials that you
 * can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
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
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS
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
 * "https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a> - This topic provides general information about
 * the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html"
 * >Temporary Security Credentials</a> - This section of the <i>IAM User
 * Guide</i> describes how to create and use temporary security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a> - This set of topics walks you
 * through the process of signing a request using an access key ID and a secret
 * access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used API Operations</b>
 * </p>
 * <p>
 * Of the API operations discussed in this guide, the following will prove the
 * most useful for most applications. You will likely perform operations other
 * than these, such as creating keys and assigning policies, by using the
 * console.
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
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * {@code
     * AWSMobileClient.getInstance.initialize(getApplicationContext(), new Callback<UserStateDetails>() {
     *     @Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSKMSClient client = new AWSKMSClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     @Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * }
     * </pre>
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
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * {@code
     * AWSMobileClient.getInstance.initialize(getApplicationContext(), new Callback<UserStateDetails>() {
     *     @Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSKMSClient client = new AWSKMSClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     @Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * }
     * </pre>
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
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * {@code
     * AWSMobileClient.getInstance.initialize(getApplicationContext(), new Callback<UserStateDetails>() {
     *     @Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSKMSClient client = new AWSKMSClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     @Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * }
     * </pre>
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
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * {@code
     * AWSMobileClient.getInstance.initialize(getApplicationContext(), new Callback<UserStateDetails>() {
     *     @Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSKMSClient client = new AWSKMSClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     @Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * }
     * </pre>
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
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * {@code
     * AWSMobileClient.getInstance.initialize(getApplicationContext(), new Callback<UserStateDetails>() {
     *     @Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSKMSClient client = new AWSKMSClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     @Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * }
     * </pre>
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
        jsonErrorUnmarshallers.add(new CloudHsmClusterInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmClusterInvalidConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmClusterNotActiveExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmClusterNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmClusterNotRelatedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CustomKeyStoreHasCMKsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CustomKeyStoreInvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CustomKeyStoreNameInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CustomKeyStoreNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredImportTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncorrectKeyMaterialExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncorrectTrustAnchorExceptionUnmarshaller());
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
        jsonErrorUnmarshallers.add(new TagExceptionUnmarshaller());
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
     * enable a CMK, use <a>EnableKey</a>. You cannot perform this operation on
     * a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Connects or reconnects a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> to its associated AWS CloudHSM cluster.
     * </p>
     * <p>
     * The custom key store must be connected before you can create customer
     * master keys (CMKs) in the key store or use the CMKs it contains. You can
     * disconnect and reconnect a custom key store at any time.
     * </p>
     * <p>
     * To connect a custom key store, its associated AWS CloudHSM cluster must
     * have at least one active HSM. To get the number of active HSMs in a
     * cluster, use the <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation. To add HSMs to the cluster, use the <a
     * href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html"
     * >CreateHsm</a> operation.
     * </p>
     * <p>
     * The connection process can take an extended amount of time to complete;
     * up to 20 minutes. This operation starts the connection process, but it
     * does not wait for it to complete. When it succeeds, this operation
     * quickly returns an HTTP 200 response and a JSON object with no
     * properties. However, this response does not indicate that the custom key
     * store is connected. To get the connection state of the custom key store,
     * use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * During the connection process, AWS KMS finds the AWS CloudHSM cluster
     * that is associated with the custom key store, creates the connection
     * infrastructure, connects to the cluster, logs into the AWS CloudHSM
     * client as the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user</a> (CU), and rotates its password.
     * </p>
     * <p>
     * The <code>ConnectCustomKeyStore</code> operation might fail for various
     * reasons. To find the reason, use the <a>DescribeCustomKeyStores</a>
     * operation and see the <code>ConnectionErrorCode</code> in the response.
     * For help interpreting the <code>ConnectionErrorCode</code>, see
     * <a>CustomKeyStoresListEntry</a>.
     * </p>
     * <p>
     * To fix the failure, use the <a>DisconnectCustomKeyStore</a> operation to
     * disconnect the custom key store, correct the error, use the
     * <a>UpdateCustomKeyStore</a> operation if necessary, and then use
     * <code>ConnectCustomKeyStore</code> again.
     * </p>
     * <p>
     * If you are having trouble connecting or disconnecting a custom key store,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
     * >Troubleshooting a Custom Key Store</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param connectCustomKeyStoreRequest
     * @return connectCustomKeyStoreResult The response from the
     *         ConnectCustomKeyStore service method, as returned by AWS Key
     *         Management Service.
     * @throws CloudHsmClusterNotActiveException
     * @throws CustomKeyStoreInvalidStateException
     * @throws CustomKeyStoreNotFoundException
     * @throws KMSInternalException
     * @throws CloudHsmClusterInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ConnectCustomKeyStoreResult connectCustomKeyStore(
            ConnectCustomKeyStoreRequest connectCustomKeyStoreRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(connectCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectCustomKeyStoreRequest> request = null;
        Response<ConnectCustomKeyStoreResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectCustomKeyStoreRequestMarshaller()
                        .marshall(connectCustomKeyStoreRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConnectCustomKeyStoreResult, JsonUnmarshallerContext> unmarshaller = new ConnectCustomKeyStoreResultJsonUnmarshaller();
            JsonResponseHandler<ConnectCustomKeyStoreResult> responseHandler = new JsonResponseHandler<ConnectCustomKeyStoreResult>(
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
     * Creates a display name for a customer managed customer master key (CMK).
     * You can use an alias to identify a CMK in selected operations, such as
     * <a>Encrypt</a> and <a>GenerateDataKey</a>.
     * </p>
     * <p>
     * Each CMK can have multiple aliases, but each alias points to only one
     * CMK. The alias name must be unique in the AWS account and region. To
     * simplify code that runs in multiple regions, use the same alias name, but
     * point it to a different CMK in each region.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can delete and change
     * the aliases of a CMK without affecting the CMK. Also, aliases do not
     * appear in the response from the <a>DescribeKey</a> operation. To get the
     * aliases of all CMKs, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * The alias name must begin with <code>alias/</code> followed by a name,
     * such as <code>alias/ExampleAlias</code>. It can contain only alphanumeric
     * characters, forward slashes (/), underscores (_), and dashes (-). The
     * alias name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >AWS managed CMKs</a>.
     * </p>
     * <p>
     * The alias and the CMK it is mapped to must be in the same AWS account and
     * the same region. You cannot perform this operation on an alias in a
     * different AWS account.
     * </p>
     * <p>
     * To map an existing alias to a different CMK, call <a>UpdateAlias</a>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> that is associated with an <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/clusters.html">AWS
     * CloudHSM cluster</a> that you own and manage.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * Before you create the custom key store, you must assemble the required
     * elements, including an AWS CloudHSM cluster that fulfills the
     * requirements for a custom key store. For details about the required
     * elements, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     * >Assemble the Prerequisites</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the operation completes successfully, it returns the ID of the new
     * custom key store. Before you can use your new custom key store, you need
     * to use the <a>ConnectCustomKeyStore</a> operation to connect the new key
     * store to its AWS CloudHSM cluster. Even if you are not going to use your
     * custom key store immediately, you might want to connect it to verify that
     * all settings are correct and then disconnect it until you are ready to
     * use it.
     * </p>
     * <p>
     * For help with failures, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
     * >Troubleshooting a Custom Key Store</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param createCustomKeyStoreRequest
     * @return createCustomKeyStoreResult The response from the
     *         CreateCustomKeyStore service method, as returned by AWS Key
     *         Management Service.
     * @throws CloudHsmClusterInUseException
     * @throws CustomKeyStoreNameInUseException
     * @throws CloudHsmClusterNotFoundException
     * @throws KMSInternalException
     * @throws CloudHsmClusterNotActiveException
     * @throws IncorrectTrustAnchorException
     * @throws CloudHsmClusterInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateCustomKeyStoreResult createCustomKeyStore(
            CreateCustomKeyStoreRequest createCustomKeyStoreRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomKeyStoreRequest> request = null;
        Response<CreateCustomKeyStoreResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomKeyStoreRequestMarshaller()
                        .marshall(createCustomKeyStoreRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCustomKeyStoreResult, JsonUnmarshallerContext> unmarshaller = new CreateCustomKeyStoreResultJsonUnmarshaller();
            JsonResponseHandler<CreateCustomKeyStoreResult> responseHandler = new JsonResponseHandler<CreateCustomKeyStoreResult>(
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
     * Adds a grant to a customer master key (CMK). The grant allows the grantee
     * principal to use the CMK when the conditions specified in the grant are
     * met. When setting permissions, grants are an alternative to key policies.
     * </p>
     * <p>
     * To create a grant that allows a cryptographic operation only when the
     * encryption context in the operation request matches or includes a
     * specified encryption context, use the <code>Constraints</code> parameter.
     * For details, see <a>GrantConstraints</a>.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN in the value of the <code>KeyId</code> parameter. For more
     * information about grants, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
     * >Grants</a> in the <i> <i>AWS Key Management Service Developer Guide</i>
     * </i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a customer managed <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys"
     * >customer master key</a> (CMK) in your AWS account.
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (up to 4096 bytes)
     * directly. But CMKs are more commonly used to encrypt the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data keys</a> that are used to encrypt data.
     * </p>
     * <p>
     * To create a CMK for imported key material, use the <code>Origin</code>
     * parameter with a value of <code>EXTERNAL</code>.
     * </p>
     * <p>
     * To create a CMK in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, use the <code>CustomKeyStoreId</code> parameter to
     * specify the custom key store. You must also use the <code>Origin</code>
     * parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM
     * cluster that is associated with the custom key store must have at least
     * two active HSMs in different Availability Zones in the AWS Region.
     * </p>
     * <p>
     * You cannot use this operation to create a CMK in a different AWS account.
     * </p>
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
     * @throws TagException
     * @throws CustomKeyStoreNotFoundException
     * @throws CustomKeyStoreInvalidStateException
     * @throws CloudHsmClusterInvalidConfigurationException
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following operations:
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
     * Whenever possible, use key policies to give users permission to call the
     * Decrypt operation on the CMK, instead of IAM policies. Otherwise, you
     * might create an IAM user policy that gives the user Decrypt permission on
     * all CMKs. This user could decrypt ciphertext that was encrypted by CMKs
     * in other accounts if the key policy for the cross-account CMK permits it.
     * If you must use an IAM policy for <code>Decrypt</code> permissions, limit
     * the user to particular CMKs or particular trusted accounts.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified alias. You cannot perform this operation on an
     * alias in a different AWS account.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can delete and change
     * the aliases of a CMK without affecting the CMK. Also, aliases do not
     * appear in the response from the <a>DescribeKey</a> operation. To get the
     * aliases of all CMKs, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * Each CMK can have multiple aliases. To change the alias of a CMK, use
     * <a>DeleteAlias</a> to delete the current alias and <a>CreateAlias</a> to
     * create a new alias. To associate an existing alias with a different
     * customer master key (CMK), call <a>UpdateAlias</a>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>. This operation does not delete the AWS CloudHSM
     * cluster that is associated with the custom key store, or affect any users
     * or keys in the cluster.
     * </p>
     * <p>
     * The custom key store that you delete cannot contain any AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys"
     * >customer master keys (CMKs)</a>. Before deleting the key store, verify
     * that you will never need to use any of the CMKs in the key store for any
     * cryptographic operations. Then, use <a>ScheduleKeyDeletion</a> to delete
     * the AWS KMS customer master keys (CMKs) from the key store. When the
     * scheduled waiting period expires, the <code>ScheduleKeyDeletion</code>
     * operation deletes the CMKs. Then it makes a best effort to delete the key
     * material from the associated cluster. However, you might need to manually
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key"
     * >delete the orphaned key material</a> from the cluster and its backups.
     * </p>
     * <p>
     * After all CMKs are deleted from AWS KMS, use
     * <a>DisconnectCustomKeyStore</a> to disconnect the key store from AWS KMS.
     * Then, you can delete the custom key store.
     * </p>
     * <p>
     * Instead of deleting the custom key store, consider using
     * <a>DisconnectCustomKeyStore</a> to disconnect it from AWS KMS. While the
     * key store is disconnected, you cannot create or use the CMKs in the key
     * store. But, you do not need to delete CMKs and you can reconnect a
     * disconnected custom key store at any time.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * 
     * @param deleteCustomKeyStoreRequest
     * @return deleteCustomKeyStoreResult The response from the
     *         DeleteCustomKeyStore service method, as returned by AWS Key
     *         Management Service.
     * @throws CustomKeyStoreHasCMKsException
     * @throws CustomKeyStoreInvalidStateException
     * @throws CustomKeyStoreNotFoundException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteCustomKeyStoreResult deleteCustomKeyStore(
            DeleteCustomKeyStoreRequest deleteCustomKeyStoreRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomKeyStoreRequest> request = null;
        Response<DeleteCustomKeyStoreResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomKeyStoreRequestMarshaller()
                        .marshall(deleteCustomKeyStoreRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCustomKeyStoreResult, JsonUnmarshallerContext> unmarshaller = new DeleteCustomKeyStoreResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCustomKeyStoreResult> responseHandler = new JsonResponseHandler<DeleteCustomKeyStoreResult>(
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
     * Deletes key material that you previously imported. This operation makes
     * the specified customer master key (CMK) unusable. For more information
     * about importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. You cannot perform this operation on a CMK in a
     * different AWS account.
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
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key stores</a> in the account and region.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * By default, this operation returns information about all custom key
     * stores in the account and region. To get only information about a
     * particular custom key store, use either the
     * <code>CustomKeyStoreName</code> or <code>CustomKeyStoreId</code>
     * parameter (but not both).
     * </p>
     * <p>
     * To determine whether the custom key store is connected to its AWS
     * CloudHSM cluster, use the <code>ConnectionState</code> element in the
     * response. If an attempt to connect the custom key store failed, the
     * <code>ConnectionState</code> value is <code>FAILED</code> and the
     * <code>ConnectionErrorCode</code> element in the response indicates the
     * cause of the failure. For help interpreting the
     * <code>ConnectionErrorCode</code>, see <a>CustomKeyStoresListEntry</a>.
     * </p>
     * <p>
     * Custom key stores have a <code>DISCONNECTED</code> connection state if
     * the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If your
     * custom key store state is <code>CONNECTED</code> but you are having
     * trouble using it, make sure that its associated AWS CloudHSM cluster is
     * active and contains the minimum number of HSMs required for the
     * operation, if any.
     * </p>
     * <p>
     * For help repairing your custom key store, see the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
     * >Troubleshooting Custom Key Stores</a> topic in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param describeCustomKeyStoresRequest
     * @return describeCustomKeyStoresResult The response from the
     *         DescribeCustomKeyStores service method, as returned by AWS Key
     *         Management Service.
     * @throws CustomKeyStoreNotFoundException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeCustomKeyStoresResult describeCustomKeyStores(
            DescribeCustomKeyStoresRequest describeCustomKeyStoresRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCustomKeyStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomKeyStoresRequest> request = null;
        Response<DescribeCustomKeyStoresResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomKeyStoresRequestMarshaller()
                        .marshall(describeCustomKeyStoresRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCustomKeyStoresResult, JsonUnmarshallerContext> unmarshaller = new DescribeCustomKeyStoresResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCustomKeyStoresResult> responseHandler = new JsonResponseHandler<DescribeCustomKeyStoresResult>(
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
     * Provides detailed information about the specified customer master key
     * (CMK).
     * </p>
     * <p>
     * You can use <code>DescribeKey</code> on a predefined AWS alias, that is,
     * an AWS alias with no key ID. When you do, AWS KMS associates the alias
     * with an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys"
     * >AWS managed CMK</a> and returns its <code>KeyId</code> and
     * <code>Arn</code> in the response.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN or alias ARN in the value of the KeyId parameter.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to disabled, thereby
     * preventing its use for cryptographic operations. You cannot perform this
     * operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href
     * ="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects the Use of a Customer Master Key</a> in the <i>
     * <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
     * >automatic rotation of the key material</a> for the specified customer
     * master key (CMK). You cannot perform this operation on a CMK in a
     * different AWS account.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disconnects the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> from its associated AWS CloudHSM cluster. While a
     * custom key store is disconnected, you can manage the custom key store and
     * its customer master keys (CMKs), but you cannot create or use CMKs in the
     * custom key store. You can reconnect the custom key store at any time.
     * </p>
     * <note>
     * <p>
     * While a custom key store is disconnected, all attempts to create customer
     * master keys (CMKs) in the custom key store or to use existing CMKs in
     * cryptographic operations will fail. This action can prevent users from
     * storing and accessing sensitive data.
     * </p>
     * </note>
     * <p/>
     * <p>
     * To find the connection state of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation. To reconnect a custom key
     * store, use the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * 
     * @param disconnectCustomKeyStoreRequest
     * @return disconnectCustomKeyStoreResult The response from the
     *         DisconnectCustomKeyStore service method, as returned by AWS Key
     *         Management Service.
     * @throws CustomKeyStoreInvalidStateException
     * @throws CustomKeyStoreNotFoundException
     * @throws KMSInternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DisconnectCustomKeyStoreResult disconnectCustomKeyStore(
            DisconnectCustomKeyStoreRequest disconnectCustomKeyStoreRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disconnectCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectCustomKeyStoreRequest> request = null;
        Response<DisconnectCustomKeyStoreResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectCustomKeyStoreRequestMarshaller()
                        .marshall(disconnectCustomKeyStoreRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisconnectCustomKeyStoreResult, JsonUnmarshallerContext> unmarshaller = new DisconnectCustomKeyStoreResultJsonUnmarshaller();
            JsonResponseHandler<DisconnectCustomKeyStoreResult> responseHandler = new JsonResponseHandler<DisconnectCustomKeyStoreResult>(
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
     * Sets the key state of a customer master key (CMK) to enabled. This allows
     * you to use the CMK for cryptographic operations. You cannot perform this
     * operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
     * >automatic rotation of the key material</a> for the specified customer
     * master key (CMK). You cannot perform this operation on a CMK in a
     * different AWS account.
     * </p>
     * <p>
     * You cannot enable automatic rotation of CMKs with imported key material
     * or CMKs in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key (CMK).
     * The <code>Encrypt</code> operation has two primary use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as
     * an RSA key, a database password, or other sensitive information.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use the <code>Encrypt</code> operation to move encrypted data
     * from one AWS region to another. In the first region, generate a data key
     * and use the plaintext key to encrypt the data. Then, in the new region,
     * call the <code>Encrypt</code> method on same plaintext data key. Now, you
     * can safely move the encrypted data and encrypted data key to the new
     * region, and decrypt in the new region when necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You don't need use this operation to encrypt a data key within a region.
     * The <a>GenerateDataKey</a> and <a>GenerateDataKeyWithoutPlaintext</a>
     * operations return an encrypted data key.
     * </p>
     * <p>
     * Also, you don't need to use this operation to encrypt data in your
     * application. You can use the plaintext and encrypted data keys that the
     * <code>GenerateDataKey</code> operation returns.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN or alias ARN in the value of the KeyId parameter.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a unique data key. This operation returns a plaintext copy of
     * the data key and a copy that is encrypted under a customer master key
     * (CMK) that you specify. You can use the plaintext key to encrypt your
     * data outside of KMS and store the encrypted data key with the encrypted
     * data.
     * </p>
     * <p>
     * <code>GenerateDataKey</code> returns a unique data key for each request.
     * The bytes in the key are not related to the caller or CMK that is used to
     * encrypt the data key.
     * </p>
     * <p>
     * To generate a data key, you need to specify the customer master key (CMK)
     * that will be used to encrypt the data key. You must also specify the
     * length of the data key using either the <code>KeySpec</code> or
     * <code>NumberOfBytes</code> field (but not both). For common key lengths
     * (128-bit and 256-bit symmetric keys), we recommend that you use
     * <code>KeySpec</code>. To perform this operation on a CMK in a different
     * AWS account, specify the key ARN or alias ARN in the value of the KeyId
     * parameter.
     * </p>
     * <p>
     * You will find the plaintext copy of the data key in the
     * <code>Plaintext</code> field of the response, and the encrypted copy of
     * the data key in the <code>CiphertextBlob</code> field.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally
     * in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <code>GenerateDataKey</code> operation to get a data encryption
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key (returned in the <code>Plaintext</code> field
     * of the response) to encrypt data locally, then erase the plaintext data
     * key from memory.
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
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key. The
     * operation returns a plaintext copy of the data key.
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
     * To get only an encrypted copy of the data key, use
     * <a>GenerateDataKeyWithoutPlaintext</a>. To get a cryptographically secure
     * random byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * You can use the optional encryption context to add additional security to
     * your encryption operation. When you specify an
     * <code>EncryptionContext</code> in the <code>GenerateDataKey</code>
     * operation, you must specify the same encryption context (a case-sensitive
     * exact match) in your request to <a>Decrypt</a> the data key. Otherwise,
     * the request to decrypt fails with an
     * <code>InvalidCiphertextException</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a unique data key. This operation returns a data key that is
     * encrypted under a customer master key (CMK) that you specify.
     * <code>GenerateDataKeyWithoutPlaintext</code> is identical to
     * <a>GenerateDataKey</a> except that returns only the encrypted copy of the
     * data key.
     * </p>
     * <p>
     * Like <code>GenerateDataKey</code>,
     * <code>GenerateDataKeyWithoutPlaintext</code> returns a unique data key
     * for each request. The bytes in the key are not related to the caller or
     * CMK that is used to encrypt the data key.
     * </p>
     * <p>
     * This operation is useful for systems that need to encrypt data at some
     * point, but not immediately. When you need to encrypt the data, you call
     * the <a>Decrypt</a> operation on the encrypted copy of the key.
     * </p>
     * <p>
     * It's also useful in distributed systems with different levels of trust.
     * For example, you might store encrypted data in containers. One component
     * of your system creates new containers and stores an encrypted data key
     * with each container. Then, a different component puts the data into the
     * containers. That component first decrypts the data key, uses the
     * plaintext data key to encrypt data, puts the encrypted data into the
     * container, and then destroys the plaintext data key. In this system, the
     * component that creates the containers never sees the plaintext data key.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a random byte string that is cryptographically secure.
     * </p>
     * <p>
     * By default, the random byte string is generated in AWS KMS. To generate
     * the byte string in the AWS CloudHSM cluster that is associated with a <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, specify the custom key store ID.
     * </p>
     * <p>
     * For more information about entropy and random number generation, see the
     * <a href=
     * "https://d0.awsstatic.com/whitepapers/KMS-Cryptographic-Details.pdf">AWS
     * Key Management Service Cryptographic Details</a> whitepaper.
     * </p>
     * 
     * @param generateRandomRequest
     * @return generateRandomResult The response from the GenerateRandom service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws CustomKeyStoreNotFoundException
     * @throws CustomKeyStoreInvalidStateException
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a key policy attached to the specified customer master key (CMK).
     * You cannot perform this operation on a CMK in a different AWS account.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a Boolean value that indicates whether <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
     * >automatic rotation of the key material</a> is enabled for the specified
     * customer master key (CMK).
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disabled: The key rotation status does not change when you disable a CMK.
     * However, while the CMK is disabled, AWS KMS does not rotate the backing
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending deletion: While a CMK is pending deletion, its key rotation
     * status is <code>false</code> and AWS KMS does not rotate the backing key.
     * If you cancel the deletion, the original key rotation status is restored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN in the value of the <code>KeyId</code> parameter.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the items you need in order to import key material into AWS KMS
     * from your existing key management infrastructure. For more information
     * about importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the customer master key (CMK) into which
     * you will import key material. This CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>. You must also specify the wrapping algorithm and
     * type of wrapping key (public key) that you will use to encrypt the key
     * material. You cannot perform this operation on a CMK in a different AWS
     * account.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public
     * key to encrypt the key material. Store the import token to send with a
     * subsequent <a>ImportKeyMaterial</a> request. The public key and import
     * token from the same response must be used together. These items are valid
     * for 24 hours. When they expire, they cannot be used for a subsequent
     * <a>ImportKeyMaterial</a> request. To get new ones, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Imports key material into an existing AWS KMS customer master key (CMK)
     * that was created without key material. You cannot perform this operation
     * on a CMK in a different AWS account. For more information about creating
     * CMKs with no key material and then importing key material, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Before using this operation, call <a>GetParametersForImport</a>. Its
     * response includes a public key and an import token. Use the public key to
     * encrypt the key material. Then, submit the import token from the same
     * <code>GetParametersForImport</code> response.
     * </p>
     * <p>
     * When calling this operation, you must specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key ID or key ARN of a CMK with no key material. Its
     * <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * To create a CMK with no key material, call <a>CreateKey</a> and set the
     * value of its <code>Origin</code> parameter to <code>EXTERNAL</code>. To
     * get the <code>Origin</code> of a CMK, call <a>DescribeKey</a>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The encrypted key material. To get the public key to encrypt the key
     * material, call <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The import token that <a>GetParametersForImport</a> returned. This token
     * and the public key used to encrypt the key material must have come from
     * the same response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the key material expires and if so, when. If you set an
     * expiration date, you can change it only by reimporting the same key
     * material and specifying a new expiration date. If the key material
     * expires, AWS KMS deletes the key material and the CMK becomes unusable.
     * To use the CMK again, you must reimport the same key material.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, the key state of the CMK changes from
     * <code>PendingImport</code> to <code>Enabled</code>, and you can use the
     * CMK. After you successfully import key material into a CMK, you can
     * reimport the same key material into that CMK, but you cannot import
     * different key material.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of aliases in the caller's AWS account and region. You cannot
     * list aliases in other accounts. For more information about aliases, see
     * <a>CreateAlias</a>.
     * </p>
     * <p>
     * By default, the ListAliases command returns all aliases in the account
     * and region. To get only the aliases that point to a particular customer
     * master key (CMK), use the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * The <code>ListAliases</code> response can include aliases that you
     * created and associated with your customer managed CMKs, and aliases that
     * AWS created and associated with AWS managed CMKs in your account. You can
     * recognize AWS aliases because their names have the format
     * <code>aws/&lt;service-name&gt;</code>, such as <code>aws/dynamodb</code>.
     * </p>
     * <p>
     * The response might also include aliases that have no
     * <code>TargetKeyId</code> field. These are predefined aliases that AWS has
     * created but has not yet associated with a CMK. Aliases that AWS creates
     * in your account, including predefined aliases, do not count against your
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit"
     * >AWS KMS aliases limit</a>.
     * </p>
     * 
     * @param listAliasesRequest
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     * @throws InvalidArnException
     * @throws NotFoundException
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of all grants for the specified customer master key (CMK).
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN in the value of the <code>KeyId</code> parameter.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the names of the key policies that are attached to a customer master
     * key (CMK). This operation is designed to get policy names that you can
     * use in a <a>GetKeyPolicy</a> operation. However, the only valid policy
     * name is <code>default</code>. You cannot perform this operation on a CMK
     * in a different AWS account.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of all customer master keys (CMKs) in the caller's AWS
     * account and region.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of all tags for the specified customer master key (CMK).
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param listResourceTagsRequest
     * @return listResourceTagsResult The response from the ListResourceTags
     *         service method, as returned by AWS Key Management Service.
     * @throws KMSInternalException
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws InvalidMarkerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListResourceTagsResult listResourceTags(ListResourceTagsRequest listResourceTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceTagsRequest> request = null;
        Response<ListResourceTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceTagsRequestMarshaller().marshall(listResourceTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceTagsResult, JsonUnmarshallerContext> unmarshaller = new ListResourceTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceTagsResult> responseHandler = new JsonResponseHandler<ListResourceTagsResult>(
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches a key policy to the specified customer master key (CMK). You
     * cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
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
     * You can reencrypt data using CMKs in different AWS accounts.
     * </p>
     * <p>
     * Unlike other operations, <code>ReEncrypt</code> is authorized twice, once
     * as <code>ReEncryptFrom</code> on the source CMK and once as
     * <code>ReEncryptTo</code> on the destination CMK. We recommend that you
     * include the <code>"kms:ReEncrypt*"</code> permission in your <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >key policies</a> to permit reencryption from or to the CMK. This
     * permission is automatically included in the key policy when you create a
     * CMK through the console. But you must include it manually when you create
     * a CMK programmatically or when you set a key policy with the
     * <a>PutKeyPolicy</a> operation.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
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
     * @throws InvalidArnException
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Revokes the specified grant for the specified customer master key (CMK).
     * You can revoke a grant to actively deny operations that depend on it.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify
     * the key ARN in the value of the <code>KeyId</code> parameter.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a
     * waiting period, specified in days, before deletion occurs. If you do not
     * provide a waiting period, the default period of 30 days is used. When
     * this operation is successful, the key state of the CMK changes to
     * <code>PendingDeletion</code>. Before the waiting period ends, you can use
     * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the
     * waiting period ends, AWS KMS deletes the CMK and all AWS KMS data
     * associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When
     * a CMK is deleted, all data that was encrypted under the CMK is
     * unrecoverable. To prevent the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * If you schedule deletion of a CMK from a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, when the waiting period expires,
     * <code>ScheduleKeyDeletion</code> deletes the CMK from AWS KMS. Then AWS
     * KMS makes a best effort to delete the key material from the associated
     * AWS CloudHSM cluster. However, you might need to manually <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key"
     * >delete the orphaned key material</a> from the cluster and its backups.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or edits tags for a customer master key (CMK). You cannot perform
     * this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values
     * are both required, but tag values can be empty (null) strings.
     * </p>
     * <p>
     * You can only use a tag key once for each CMK. If you use the tag key
     * again, AWS KMS replaces the current tag value with the specified value.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values,
     * see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
     * >User-Defined Tag Restrictions</a> in the <i>AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws KMSInternalException
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws KMSInvalidStateException
     * @throws LimitExceededException
     * @throws TagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Removes the specified tags from the specified customer master key (CMK).
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an
     * existing tag key, use <a>TagResource</a>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws KMSInternalException
     * @throws NotFoundException
     * @throws InvalidArnException
     * @throws KMSInvalidStateException
     * @throws TagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Associates an existing alias with a different customer master key (CMK).
     * Each CMK can have multiple aliases, but the aliases must be unique within
     * the account and region. You cannot perform this operation on an alias in
     * a different AWS account.
     * </p>
     * <p>
     * This operation works only on existing aliases. To change the alias of a
     * CMK to a new value, use <a>CreateAlias</a> to create a new alias and
     * <a>DeleteAlias</a> to delete the old alias.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can create, update, and
     * delete the aliases of a CMK without affecting the CMK. Also, aliases do
     * not appear in the response from the <a>DescribeKey</a> operation. To get
     * the aliases of all CMKs in the account, use the <a>ListAliases</a>
     * operation.
     * </p>
     * <p>
     * The alias name must begin with <code>alias/</code> followed by a name,
     * such as <code>alias/ExampleAlias</code>. It can contain only alphanumeric
     * characters, forward slashes (/), underscores (_), and dashes (-). The
     * alias name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >AWS managed CMKs</a>.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes the properties of a custom key store. Use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store
     * you want to edit. Use the remaining parameters to change the properties
     * of the custom key store.
     * </p>
     * <p>
     * You can only update a custom key store that is disconnected. To
     * disconnect the custom key store, use <a>DisconnectCustomKeyStore</a>. To
     * reconnect the custom key store after the update completes, use
     * <a>ConnectCustomKeyStore</a>. To find the connection state of a custom
     * key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * Use the parameters of <code>UpdateCustomKeyStore</code> to edit your
     * keystore settings.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <b>NewCustomKeyStoreName</b> parameter to change the friendly
     * name of the custom key store to the value that you specify.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * Use the <b>KeyStorePassword</b> parameter tell AWS KMS the current
     * password of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU)</a> in the associated AWS
     * CloudHSM cluster. You can use this parameter to <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-password"
     * >fix connection failures</a> that occur when AWS KMS cannot log into the
     * associated cluster because the <code>kmsuser</code> password has changed.
     * This value does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * Use the <b>CloudHsmClusterId</b> parameter to associate the custom key
     * store with a different, but related, AWS CloudHSM cluster. You can use
     * this parameter to repair a custom key store if its AWS CloudHSM cluster
     * becomes corrupted or is deleted, or when you need to create or restore a
     * cluster from a backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * 
     * @param updateCustomKeyStoreRequest
     * @return updateCustomKeyStoreResult The response from the
     *         UpdateCustomKeyStore service method, as returned by AWS Key
     *         Management Service.
     * @throws CustomKeyStoreNotFoundException
     * @throws CloudHsmClusterNotFoundException
     * @throws CloudHsmClusterNotRelatedException
     * @throws CustomKeyStoreInvalidStateException
     * @throws KMSInternalException
     * @throws CloudHsmClusterNotActiveException
     * @throws CloudHsmClusterInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Key Management Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateCustomKeyStoreResult updateCustomKeyStore(
            UpdateCustomKeyStoreRequest updateCustomKeyStoreRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomKeyStoreRequest> request = null;
        Response<UpdateCustomKeyStoreResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomKeyStoreRequestMarshaller()
                        .marshall(updateCustomKeyStoreRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCustomKeyStoreResult, JsonUnmarshallerContext> unmarshaller = new UpdateCustomKeyStoreResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCustomKeyStoreResult> responseHandler = new JsonResponseHandler<UpdateCustomKeyStoreResult>(
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
     * Updates the description of a customer master key (CMK). To see the
     * description of a CMK, use <a>DescribeKey</a>.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * The result of this operation varies with the key state of the CMK. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a customer managed <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys"
     * >customer master key</a> (CMK) in your AWS account.
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (up to 4096 bytes)
     * directly. But CMKs are more commonly used to encrypt the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
     * >data keys</a> that are used to encrypt data.
     * </p>
     * <p>
     * To create a CMK for imported key material, use the <code>Origin</code>
     * parameter with a value of <code>EXTERNAL</code>.
     * </p>
     * <p>
     * To create a CMK in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, use the <code>CustomKeyStoreId</code> parameter to
     * specify the custom key store. You must also use the <code>Origin</code>
     * parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM
     * cluster that is associated with the custom key store must have at least
     * two active HSMs in different Availability Zones in the AWS Region.
     * </p>
     * <p>
     * You cannot use this operation to create a CMK in a different AWS account.
     * </p>
     * 
     * @return createKeyResult The response from the CreateKey service method,
     *         as returned by AWS Key Management Service.
     * @throws MalformedPolicyDocumentException
     * @throws DependencyTimeoutException
     * @throws InvalidArnException
     * @throws UnsupportedOperationException
     * @throws KMSInternalException
     * @throws LimitExceededException
     * @throws TagException
     * @throws CustomKeyStoreNotFoundException
     * @throws CustomKeyStoreInvalidStateException
     * @throws CloudHsmClusterInvalidConfigurationException
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
     * Gets a list of all customer master keys (CMKs) in the caller's AWS
     * account and region.
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
     * Gets a list of aliases in the caller's AWS account and region. You cannot
     * list aliases in other accounts. For more information about aliases, see
     * <a>CreateAlias</a>.
     * </p>
     * <p>
     * By default, the ListAliases command returns all aliases in the account
     * and region. To get only the aliases that point to a particular customer
     * master key (CMK), use the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * The <code>ListAliases</code> response can include aliases that you
     * created and associated with your customer managed CMKs, and aliases that
     * AWS created and associated with AWS managed CMKs in your account. You can
     * recognize AWS aliases because their names have the format
     * <code>aws/&lt;service-name&gt;</code>, such as <code>aws/dynamodb</code>.
     * </p>
     * <p>
     * The response might also include aliases that have no
     * <code>TargetKeyId</code> field. These are predefined aliases that AWS has
     * created but has not yet associated with a CMK. Aliases that AWS creates
     * in your account, including predefined aliases, do not count against your
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit"
     * >AWS KMS aliases limit</a>.
     * </p>
     * 
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws InvalidMarkerException
     * @throws KMSInternalException
     * @throws InvalidArnException
     * @throws NotFoundException
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
     * @throws InvalidArnException
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
     * Returns a random byte string that is cryptographically secure.
     * </p>
     * <p>
     * By default, the random byte string is generated in AWS KMS. To generate
     * the byte string in the AWS CloudHSM cluster that is associated with a <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, specify the custom key store ID.
     * </p>
     * <p>
     * For more information about entropy and random number generation, see the
     * <a href=
     * "https://d0.awsstatic.com/whitepapers/KMS-Cryptographic-Details.pdf">AWS
     * Key Management Service Cryptographic Details</a> whitepaper.
     * </p>
     * 
     * @return generateRandomResult The response from the GenerateRandom service
     *         method, as returned by AWS Key Management Service.
     * @throws DependencyTimeoutException
     * @throws KMSInternalException
     * @throws CustomKeyStoreNotFoundException
     * @throws CustomKeyStoreInvalidStateException
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
