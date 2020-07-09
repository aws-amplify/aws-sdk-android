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
package com.amazonaws.services.aws-android-sdk-secretsmanager;

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

import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform.*;

/**
 * Client for accessing AWS Secrets Manager.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Secrets Manager API Reference</fullname> <p>AWS Secrets Manager provides a service to enable you to store, manage, and retrieve, secrets.</p> <p>This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">AWS Secrets Manager User Guide</a>.</p> <p> <b>API Version</b> </p> <p>This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.</p> <note> <p>As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various programming languages and platforms such as Java, Ruby, .NET, iOS, and Android. The SDKs provide a convenient way to create programmatic access to AWS Secrets Manager. For example, the SDKs provide cryptographically signing requests, managing errors, and retrying requests automatically. For more information about the AWS SDKs, including downloading and installing them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.</p> </note> <p>We recommend you use the AWS SDKs to make programmatic API calls to Secrets Manager. However, you also can use the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn more about the Secrets Manager HTTP Query API, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/query-requests.html">Making Query Requests</a> in the <i>AWS Secrets Manager User Guide</i>. </p> <p>Secrets Manager API supports GET and POST requests for all actions, and doesn't require you to use GET for some actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for operations that require larger sizes, use a POST request.</p> <p> <b>Support and Feedback for AWS Secrets Manager</b> </p> <p>We welcome your feedback. Send your comments to <a href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">AWS Secrets Manager Discussion Forum</a>. For more information about the AWS Discussion Forums, see <a href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.</p> <p> <b>How examples are presented</b> </p> <p>The JSON that AWS Secrets Manager expects as your request parameters and the service returns as a response to HTTP query requests contain single, long strings without line breaks or white space formatting. The JSON shown in the examples displays the code formatted with both line breaks and white space to improve readability. When example input parameters can also cause long strings extending beyond the screen, you can insert line breaks to enhance readability. You should always submit the input as a single JSON text string.</p> <p> <b>Logging API Requests</b> </p> <p>AWS Secrets Manager supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log files to an Amazon S3 bucket. By using information that's collected by AWS CloudTrail, you can determine the requests successfully made to Secrets Manager, who made the request, when it was made, and so on. For more about AWS Secrets Manager and support for AWS CloudTrail, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging AWS Secrets Manager Events with AWS CloudTrail</a> in the <i>AWS Secrets Manager User Guide</i>. To learn more about CloudTrail, including enabling it and find your log files, see the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail User Guide</a>.</p>
 */
public class AWSSecretsManagerClient extends AmazonWebServiceClient implements AWSSecretsManager { 
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Secrets Manager exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSSecretsManagerClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecretsManager
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSSecretsManagerClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSSecretsManagerClient client = new AWSSecretsManagerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSecretsManagerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials
     * and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSSecretsManagerClient client = new AWSSecretsManagerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecretsManager
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSecretsManagerClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSSecretsManagerClient client = new AWSSecretsManagerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSecretsManagerClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSSecretsManagerClient client = new AWSSecretsManagerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecretsManager
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSecretsManagerClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecretsManager
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSSecretsManagerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecretsManager using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSSecretsManagerClient client = new AWSSecretsManagerClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecretsManager
     *                       (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSSecretsManagerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DecryptionFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EncryptionFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PreconditionNotMetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PublicPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("secretsmanager.us-east-1.amazonaws.com");
        this.endpointPrefix = "secretsmanager";
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/aws-android-sdk-secretsmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/aws-android-sdk-secretsmanager/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>Disables automatic scheduled rotation and cancels the rotation of a secret if currently in progress.</p> <p>To re-enable scheduled rotation, call <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. This immediately rotates your secret and then enables the automatic schedule.</p> <note> <p>If you cancel a rotation while in progress, it can leave the <code>VersionStage</code> labels in an unexpected state. Depending on the step of the rotation in progress, you might need to remove the staging label <code>AWSPENDING</code> from the partially created version, specified by the <code>VersionId</code> response value. You should also evaluate the partially rotated new version to see if it should be deleted, which you can do by removing all staging labels from the new version <code>VersionStage</code> field.</p> </note> <p>To successfully start a rotation, the staging label <code>AWSPENDING</code> must be in one of the following states:</p> <ul> <li> <p>Not attached to any version at all</p> </li> <li> <p>Attached to the same version as the staging label <code>AWSCURRENT</code> </p> </li> </ul> <p>If the staging label <code>AWSPENDING</code> attached to a different version than the version with <code>AWSCURRENT</code> then the attempt to rotate fails.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:CancelRotateSecret</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To configure rotation for a secret or to manually trigger a rotation, use <a>RotateSecret</a>.</p> </li> <li> <p>To get the rotation configuration details for a secret, use <a>DescribeSecret</a>.</p> </li> <li> <p>To list all of the currently available secrets, use <a>ListSecrets</a>.</p> </li> <li> <p>To list all of the versions currently associated with a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
     * @param cancelRotateSecretRequest 
     * @return cancelRotateSecretResult The response from the CancelRotateSecret service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelRotateSecretResult cancelRotateSecret(CancelRotateSecretRequest cancelRotateSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelRotateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRotateSecretRequest> request = null;
        Response<CancelRotateSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRotateSecretRequestMarshaller().marshall(cancelRotateSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelRotateSecretResult, JsonUnmarshallerContext> unmarshaller = new CancelRotateSecretResultJsonUnmarshaller();
            JsonResponseHandler<CancelRotateSecretResult> responseHandler = new JsonResponseHandler<CancelRotateSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates a new secret. A secret in Secrets Manager consists of both the protected secret data and the important information needed to manage the secret.</p> <p>Secrets Manager stores the encrypted secret data in one of a collection of "versions" associated with the secret. Each version contains a copy of the encrypted secret data. Each version is associated with one or more "staging labels" that identify where the version is in the rotation cycle. The <code>SecretVersionsToStages</code> field of the secret contains the mapping of staging labels to the active versions of the secret. Versions without a staging label are considered deprecated and not included in the list.</p> <p>You provide the secret data to be encrypted by putting text in either the <code>SecretString</code> parameter or binary data in the <code>SecretBinary</code> parameter, but not both. If you include <code>SecretString</code> or <code>SecretBinary</code> then Secrets Manager also creates an initial secret version and automatically attaches the staging label <code>AWSCURRENT</code> to the new version.</p> <note> <ul> <li> <p>If you call an operation to encrypt or decrypt the <code>SecretString</code> or <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager creates it for you automatically. All users and roles in the same AWS account automatically have access to use the default CMK. Note that if an Secrets Manager API call results in AWS creating the account's AWS-managed CMK, it can result in a one-time significant delay in returning the result.</p> </li> <li> <p>If the secret resides in a different AWS account from the credentials calling an API that requires encryption or decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from a different account then the AWS KMS key policy must grant cross-account access to that other account's user or role for both the kms:GenerateDataKey and kms:Decrypt operations.</p> </li> </ul> </note> <p> </p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:CreateSecret</p> </li> <li> <p>kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account default AWS managed CMK for Secrets Manager.</p> </li> <li> <p>kms:Decrypt - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account default AWS managed CMK for Secrets Manager.</p> </li> <li> <p>secretsmanager:TagResource - needed only if you include the <code>Tags</code> parameter. </p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To delete a secret, use <a>DeleteSecret</a>.</p> </li> <li> <p>To modify an existing secret, use <a>UpdateSecret</a>.</p> </li> <li> <p>To create a new version of a secret, use <a>PutSecretValue</a>.</p> </li> <li> <p>To retrieve the encrypted secure string and secure binary values, use <a>GetSecretValue</a>.</p> </li> <li> <p>To retrieve all other details for a secret, use <a>DescribeSecret</a>. This does not include the encrypted secure string and secure binary values.</p> </li> <li> <p>To retrieve the list of secret versions associated with the current secret, use <a>DescribeSecret</a> and examine the <code>SecretVersionsToStages</code> response value.</p> </li> </ul>
     * @param createSecretRequest 
     * @return createSecretResult The response from the CreateSecret service method, as returned by AWS Secrets Manager.
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws LimitExceededException 
     * @throws EncryptionFailureException 
     * @throws ResourceExistsException 
     * @throws ResourceNotFoundException 
     * @throws MalformedPolicyDocumentException 
     * @throws InternalServiceErrorException 
     * @throws PreconditionNotMetException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSecretResult createSecret(CreateSecretRequest createSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecretRequest> request = null;
        Response<CreateSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecretRequestMarshaller().marshall(createSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSecretResult, JsonUnmarshallerContext> unmarshaller = new CreateSecretResultJsonUnmarshaller();
            JsonResponseHandler<CreateSecretResult> responseHandler = new JsonResponseHandler<CreateSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Deletes the resource-based permission policy attached to the secret.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:DeleteResourcePolicy</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.</p> </li> <li> <p>To retrieve the current resource-based policy that's attached to a secret, use <a>GetResourcePolicy</a>.</p> </li> <li> <p>To list all of the currently available secrets, use <a>ListSecrets</a>.</p> </li> </ul>
     * @param deleteResourcePolicyRequest 
     * @return deleteResourcePolicyResult The response from the DeleteResourcePolicy service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestMarshaller().marshall(deleteResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourcePolicyResult> responseHandler = new JsonResponseHandler<DeleteResourcePolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Deletes an entire secret and all of its versions. You can optionally include a recovery window during which you can restore the secret. If you don't specify a recovery window value, the operation defaults to 30 days. Secrets Manager attaches a <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window. At the end of the recovery window, Secrets Manager deletes the secret permanently.</p> <p>At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code> and cancel the deletion of the secret.</p> <p>You cannot access the encrypted secret information in any secret that is scheduled for deletion. If you need to access that information, you must cancel the deletion with <a>RestoreSecret</a> and then retrieve the information.</p> <note> <ul> <li> <p>There is no explicit operation to delete a version of a secret. Instead, remove all staging labels from the <code>VersionStage</code> field of a version. That marks the version as deprecated and allows Secrets Manager to delete it as needed. Versions that do not have any staging labels do not show up in <a>ListSecretVersionIds</a> unless you specify <code>IncludeDeprecated</code>.</p> </li> <li> <p>The permanent secret deletion at the end of the waiting period is performed as a background task with low priority. There is no guarantee of a specific time after the recovery window for the actual delete operation to occur.</p> </li> </ul> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:DeleteSecret</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To cancel deletion of a version of a secret before the recovery window has expired, use <a>RestoreSecret</a>.</p> </li> </ul>
     * @param deleteSecretRequest 
     * @return deleteSecretResult The response from the DeleteSecret service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSecretResult deleteSecret(DeleteSecretRequest deleteSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecretRequest> request = null;
        Response<DeleteSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecretRequestMarshaller().marshall(deleteSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSecretResult, JsonUnmarshallerContext> unmarshaller = new DeleteSecretResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSecretResult> responseHandler = new JsonResponseHandler<DeleteSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Retrieves the details of a secret. It does not include the encrypted fields. Secrets Manager only returns fields populated with a value in the response. </p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:DescribeSecret</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To modify a secret, use <a>UpdateSecret</a>.</p> </li> <li> <p>To retrieve the encrypted secret information in a version of the secret, use <a>GetSecretValue</a>.</p> </li> <li> <p>To list all of the secrets in the AWS account, use <a>ListSecrets</a>.</p> </li> </ul>
     * @param describeSecretRequest 
     * @return describeSecretResult The response from the DescribeSecret service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSecretResult describeSecret(DescribeSecretRequest describeSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecretRequest> request = null;
        Response<DescribeSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecretRequestMarshaller().marshall(describeSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSecretResult, JsonUnmarshallerContext> unmarshaller = new DescribeSecretResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSecretResult> responseHandler = new JsonResponseHandler<DescribeSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Generates a random password of the specified complexity. This operation is intended for use in the Lambda rotation function. Per best practice, we recommend that you specify the maximum length and include every character type that the system you are generating a password for can support.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:GetRandomPassword</p> </li> </ul>
     * @param getRandomPasswordRequest 
     * @return getRandomPasswordResult The response from the GetRandomPassword service method, as returned by AWS Secrets Manager.
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetRandomPasswordResult getRandomPassword(GetRandomPasswordRequest getRandomPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRandomPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRandomPasswordRequest> request = null;
        Response<GetRandomPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRandomPasswordRequestMarshaller().marshall(getRandomPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRandomPasswordResult, JsonUnmarshallerContext> unmarshaller = new GetRandomPasswordResultJsonUnmarshaller();
            JsonResponseHandler<GetRandomPasswordResult> responseHandler = new JsonResponseHandler<GetRandomPasswordResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Retrieves the JSON text of the resource-based policy document attached to the specified secret. The JSON request string input and response output displays formatted code with white space and line breaks for better readability. Submit your input as a single line JSON string.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:GetResourcePolicy</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To attach a resource policy to a secret, use <a>PutResourcePolicy</a>.</p> </li> <li> <p>To delete the resource-based policy attached to a secret, use <a>DeleteResourcePolicy</a>.</p> </li> <li> <p>To list all of the currently available secrets, use <a>ListSecrets</a>.</p> </li> </ul>
     * @param getResourcePolicyRequest 
     * @return getResourcePolicyResult The response from the GetResourcePolicy service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestMarshaller().marshall(getResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcePolicyResult> responseHandler = new JsonResponseHandler<GetResourcePolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Retrieves the contents of the encrypted fields <code>SecretString</code> or <code>SecretBinary</code> from the specified version of a secret, whichever contains content.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:GetSecretValue</p> </li> <li> <p>kms:Decrypt - required only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account's default AWS managed CMK for Secrets Manager.</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a new version of the secret with different encrypted information, use <a>PutSecretValue</a>.</p> </li> <li> <p>To retrieve the non-encrypted details for the secret, use <a>DescribeSecret</a>.</p> </li> </ul>
     * @param getSecretValueRequest 
     * @return getSecretValueResult The response from the GetSecretValue service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws DecryptionFailureException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSecretValueResult getSecretValue(GetSecretValueRequest getSecretValueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSecretValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecretValueRequest> request = null;
        Response<GetSecretValueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecretValueRequestMarshaller().marshall(getSecretValueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSecretValueResult, JsonUnmarshallerContext> unmarshaller = new GetSecretValueResultJsonUnmarshaller();
            JsonResponseHandler<GetSecretValueResult> responseHandler = new JsonResponseHandler<GetSecretValueResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Lists all of the versions attached to the specified secret. The output does not include the <code>SecretString</code> or <code>SecretBinary</code> fields. By default, the list includes only versions that have at least one staging label in <code>VersionStage</code> attached.</p> <note> <p>Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations. These operations can occasionally return an empty or shorter than expected list of results even when there more results become available. When this happens, the <code>NextToken</code> response parameter contains a value to pass to the next call to the same API to request the next part of the list.</p> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:ListSecretVersionIds</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To list the secrets in an account, use <a>ListSecrets</a>.</p> </li> </ul>
     * @param listSecretVersionIdsRequest 
     * @return listSecretVersionIdsResult The response from the ListSecretVersionIds service method, as returned by AWS Secrets Manager.
     * @throws InvalidNextTokenException 
     * @throws ResourceNotFoundException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSecretVersionIdsResult listSecretVersionIds(ListSecretVersionIdsRequest listSecretVersionIdsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSecretVersionIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecretVersionIdsRequest> request = null;
        Response<ListSecretVersionIdsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecretVersionIdsRequestMarshaller().marshall(listSecretVersionIdsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSecretVersionIdsResult, JsonUnmarshallerContext> unmarshaller = new ListSecretVersionIdsResultJsonUnmarshaller();
            JsonResponseHandler<ListSecretVersionIdsResult> responseHandler = new JsonResponseHandler<ListSecretVersionIdsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Lists all of the secrets that are stored by Secrets Manager in the AWS account. To list the versions currently stored for a specific secret, use <a>ListSecretVersionIds</a>. The encrypted fields <code>SecretString</code> and <code>SecretBinary</code> are not included in the output. To get that information, call the <a>GetSecretValue</a> operation.</p> <note> <p>Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations. These operations can occasionally return an empty or shorter than expected list of results even when there more results become available. When this happens, the <code>NextToken</code> response parameter contains a value to pass to the next call to the same API to request the next part of the list.</p> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:ListSecrets</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
     * @param listSecretsRequest 
     * @return listSecretsResult The response from the ListSecrets service method, as returned by AWS Secrets Manager.
     * @throws InvalidParameterException 
     * @throws InvalidNextTokenException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSecretsResult listSecrets(ListSecretsRequest listSecretsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSecretsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecretsRequest> request = null;
        Response<ListSecretsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecretsRequestMarshaller().marshall(listSecretsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSecretsResult, JsonUnmarshallerContext> unmarshaller = new ListSecretsResultJsonUnmarshaller();
            JsonResponseHandler<ListSecretsResult> responseHandler = new JsonResponseHandler<ListSecretsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Attaches the contents of the specified resource-based permission policy to a secret. A resource-based policy is optional. Alternatively, you can use IAM identity-based policies that specify the secret's Amazon Resource Name (ARN) in the policy statement's <code>Resources</code> element. You can also use a combination of both identity-based and resource-based policies. The affected users and roles receive the permissions that are permitted by all of the relevant policies. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html">Using Resource-Based Policies for AWS Secrets Manager</a>. For the complete description of the AWS policy syntax and grammar, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in the <i>IAM User Guide</i>.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:PutResourcePolicy</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To retrieve the resource policy attached to a secret, use <a>GetResourcePolicy</a>.</p> </li> <li> <p>To delete the resource-based policy that's attached to a secret, use <a>DeleteResourcePolicy</a>.</p> </li> <li> <p>To list all of the currently available secrets, use <a>ListSecrets</a>.</p> </li> </ul>
     * @param putResourcePolicyRequest 
     * @return putResourcePolicyResult The response from the PutResourcePolicy service method, as returned by AWS Secrets Manager.
     * @throws MalformedPolicyDocumentException 
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws PublicPolicyException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestMarshaller().marshall(putResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutResourcePolicyResult> responseHandler = new JsonResponseHandler<PutResourcePolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Stores a new encrypted secret value in the specified secret. To do this, the operation creates a new version and attaches it to the secret. The version can contain a new <code>SecretString</code> value or a new <code>SecretBinary</code> value. You can also specify the staging labels that are initially attached to the new version.</p> <note> <p>The Secrets Manager console uses only the <code>SecretString</code> field. To add binary data to a secret with the <code>SecretBinary</code> field you must use the AWS CLI or one of the AWS SDKs.</p> </note> <ul> <li> <p>If this operation creates the first version for the secret then Secrets Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.</p> </li> <li> <p>If another version of this secret already exists, then this operation does not automatically move any staging labels other than those that you explicitly specify in the <code>VersionStages</code> parameter.</p> </li> <li> <p>If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version (because you included it in the <code>StagingLabels</code> parameter) then Secrets Manager also automatically moves the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.</p> </li> <li> <p>This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the <code>ClientRequestToken</code> parameter already exists and you specify the same secret data, the operation succeeds but does nothing. However, if the secret data is different, then the operation fails because you cannot modify an existing version; you can only create new ones.</p> </li> </ul> <note> <ul> <li> <p>If you call an operation to encrypt or decrypt the <code>SecretString</code> or <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager creates it for you automatically. All users and roles in the same AWS account automatically have access to use the default CMK. Note that if an Secrets Manager API call results in AWS creating the account's AWS-managed CMK, it can result in a one-time significant delay in returning the result.</p> </li> <li> <p>If the secret resides in a different AWS account from the credentials calling an API that requires encryption or decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from a different account then the AWS KMS key policy must grant cross-account access to that other account's user or role for both the kms:GenerateDataKey and kms:Decrypt operations.</p> </li> </ul> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:PutSecretValue</p> </li> <li> <p>kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account's default AWS managed CMK for Secrets Manager.</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To retrieve the encrypted value you store in the version of a secret, use <a>GetSecretValue</a>.</p> </li> <li> <p>To create a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To get the details for a secret, use <a>DescribeSecret</a>.</p> </li> <li> <p>To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
     * @param putSecretValueRequest 
     * @return putSecretValueResult The response from the PutSecretValue service method, as returned by AWS Secrets Manager.
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws LimitExceededException 
     * @throws EncryptionFailureException 
     * @throws ResourceExistsException 
     * @throws ResourceNotFoundException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutSecretValueResult putSecretValue(PutSecretValueRequest putSecretValueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putSecretValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSecretValueRequest> request = null;
        Response<PutSecretValueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSecretValueRequestMarshaller().marshall(putSecretValueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutSecretValueResult, JsonUnmarshallerContext> unmarshaller = new PutSecretValueResultJsonUnmarshaller();
            JsonResponseHandler<PutSecretValueResult> responseHandler = new JsonResponseHandler<PutSecretValueResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Cancels the scheduled deletion of a secret by removing the <code>DeletedDate</code> time stamp. This makes the secret accessible to query once again.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:RestoreSecret</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To delete a secret, use <a>DeleteSecret</a>.</p> </li> </ul>
     * @param restoreSecretRequest 
     * @return restoreSecretResult The response from the RestoreSecret service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RestoreSecretResult restoreSecret(RestoreSecretRequest restoreSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreSecretRequest> request = null;
        Response<RestoreSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreSecretRequestMarshaller().marshall(restoreSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RestoreSecretResult, JsonUnmarshallerContext> unmarshaller = new RestoreSecretResultJsonUnmarshaller();
            JsonResponseHandler<RestoreSecretResult> responseHandler = new JsonResponseHandler<RestoreSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Configures and starts the asynchronous process of rotating this secret. If you include the configuration parameters, the operation sets those values for the secret and then immediately starts a rotation. If you do not include the configuration parameters, the operation starts a rotation with the values already stored in the secret. After the rotation completes, the protected service and its clients all use the new version of the secret. </p> <p>This required configuration information includes the ARN of an AWS Lambda function and the time between scheduled rotations. The Lambda rotation function creates a new version of the secret and creates or updates the credentials on the protected service to match. After testing the new credentials, the function marks the new secret with the staging label <code>AWSCURRENT</code> so that your clients all immediately begin to use the new version. For more information about rotating secrets and how to configure a Lambda function to rotate the secrets for your protected service, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html">Rotating Secrets in AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p> <p>Secrets Manager schedules the next rotation when the previous one completes. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p> <p>The rotation function must end with the versions of the secret in one of two states:</p> <ul> <li> <p>The <code>AWSPENDING</code> and <code>AWSCURRENT</code> staging labels are attached to the same version of the secret, or</p> </li> <li> <p>The <code>AWSPENDING</code> staging label is not attached to any version of the secret.</p> </li> </ul> <p>If the <code>AWSPENDING</code> staging label is present but not attached to the same version as <code>AWSCURRENT</code> then any later invocation of <code>RotateSecret</code> assumes that a previous rotation request is still in progress and returns an error.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:RotateSecret</p> </li> <li> <p>lambda:InvokeFunction (on the function specified in the secret's metadata)</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To list the secrets in your account, use <a>ListSecrets</a>.</p> </li> <li> <p>To get the details for a version of a secret, use <a>DescribeSecret</a>.</p> </li> <li> <p>To create a new version of a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To attach staging labels to or remove staging labels from a version of a secret, use <a>UpdateSecretVersionStage</a>.</p> </li> </ul>
     * @param rotateSecretRequest 
     * @return rotateSecretResult The response from the RotateSecret service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RotateSecretResult rotateSecret(RotateSecretRequest rotateSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rotateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateSecretRequest> request = null;
        Response<RotateSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateSecretRequestMarshaller().marshall(rotateSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RotateSecretResult, JsonUnmarshallerContext> unmarshaller = new RotateSecretResultJsonUnmarshaller();
            JsonResponseHandler<RotateSecretResult> responseHandler = new JsonResponseHandler<RotateSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Attaches one or more tags, each consisting of a key name and a value, to the specified secret. Tags are part of the secret's overall metadata, and are not associated with any specific version of the secret. This operation only appends tags to the existing list of tags. To remove tags, you must use <a>UntagResource</a>.</p> <p>The following basic restrictions apply to tags:</p> <ul> <li> <p>Maximum number of tags per secret—50</p> </li> <li> <p>Maximum key length—127 Unicode characters in UTF-8</p> </li> <li> <p>Maximum value length—255 Unicode characters in UTF-8</p> </li> <li> <p>Tag keys and values are case sensitive.</p> </li> <li> <p>Do not use the <code>aws:</code> prefix in your tag names or values because AWS reserves it for AWS use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not count against your tags per secret limit.</p> </li> <li> <p>If you use your tagging schema across multiple services and resources, remember other services might have restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the following special characters: + - = . _ : / @.</p> </li> </ul> <important> <p>If you use tags as part of your security strategy, then adding or removing a tag can change permissions. If successfully completing this operation would result in you losing your permissions for this secret, then the operation is blocked and returns an Access Denied error.</p> </important> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:TagResource</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To remove one or more tags from the collection attached to a secret, use <a>UntagResource</a>.</p> </li> <li> <p>To view the list of tags attached to a secret, use <a>DescribeSecret</a>.</p> </li> </ul>
     * @param tagResourceRequest 
     * @throws ResourceNotFoundException 
     * @throws InvalidRequestException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
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
     * <p>Removes one or more tags from the specified secret.</p> <p>This operation is idempotent. If a requested tag is not attached to the secret, no error is returned and the secret metadata is unchanged.</p> <important> <p>If you use tags as part of your security strategy, then removing a tag can change permissions. If successfully completing this operation would result in you losing your permissions for this secret, then the operation is blocked and returns an Access Denied error.</p> </important> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:UntagResource</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To add one or more tags to the collection attached to a secret, use <a>TagResource</a>.</p> </li> <li> <p>To view the list of tags attached to a secret, use <a>DescribeSecret</a>.</p> </li> </ul>
     * @param untagResourceRequest 
     * @throws ResourceNotFoundException 
     * @throws InvalidRequestException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
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
     * <p>Modifies many of the details of the specified secret. If you include a <code>ClientRequestToken</code> and <i>either</i> <code>SecretString</code> or <code>SecretBinary</code> then it also creates a new version attached to the secret.</p> <p>To modify the rotation configuration of a secret, use <a>RotateSecret</a> instead.</p> <note> <p>The Secrets Manager console uses only the <code>SecretString</code> parameter and therefore limits you to encrypting and storing only a text string. To encrypt and store binary data as part of the version of a secret, you must use either the AWS CLI or one of the AWS SDKs.</p> </note> <ul> <li> <p>If a version with a <code>VersionId</code> with the same value as the <code>ClientRequestToken</code> parameter already exists, the operation results in an error. You cannot modify an existing version, you can only create a new version.</p> </li> <li> <p>If you include <code>SecretString</code> or <code>SecretBinary</code> to create a new secret version, Secrets Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version. </p> </li> </ul> <note> <ul> <li> <p>If you call an operation to encrypt or decrypt the <code>SecretString</code> or <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager creates it for you automatically. All users and roles in the same AWS account automatically have access to use the default CMK. Note that if an Secrets Manager API call results in AWS creating the account's AWS-managed CMK, it can result in a one-time significant delay in returning the result.</p> </li> <li> <p>If the secret resides in a different AWS account from the credentials calling an API that requires encryption or decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from a different account then the AWS KMS key policy must grant cross-account access to that other account's user or role for both the kms:GenerateDataKey and kms:Decrypt operations.</p> </li> </ul> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:UpdateSecret</p> </li> <li> <p>kms:GenerateDataKey - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this permission to use the account's AWS managed CMK for Secrets Manager.</p> </li> <li> <p>kms:Decrypt - needed only if you use a custom AWS KMS key to encrypt the secret. You do not need this permission to use the account's AWS managed CMK for Secrets Manager.</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a new secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To add only a new version to an existing secret, use <a>PutSecretValue</a>.</p> </li> <li> <p>To get the details for a secret, use <a>DescribeSecret</a>.</p> </li> <li> <p>To list the versions contained in a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
     * @param updateSecretRequest 
     * @return updateSecretResult The response from the UpdateSecret service method, as returned by AWS Secrets Manager.
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws LimitExceededException 
     * @throws EncryptionFailureException 
     * @throws ResourceExistsException 
     * @throws ResourceNotFoundException 
     * @throws MalformedPolicyDocumentException 
     * @throws InternalServiceErrorException 
     * @throws PreconditionNotMetException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSecretResult updateSecret(UpdateSecretRequest updateSecretRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSecretRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecretRequest> request = null;
        Response<UpdateSecretResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecretRequestMarshaller().marshall(updateSecretRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSecretResult, JsonUnmarshallerContext> unmarshaller = new UpdateSecretResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSecretResult> responseHandler = new JsonResponseHandler<UpdateSecretResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Modifies the staging labels attached to a version of a secret. Staging labels are used to track a version as it progresses through the secret rotation process. You can attach a staging label to only one version of a secret at a time. If a staging label to be added is already attached to another version, then it is moved--removed from the other version first and then attached to this one. For more information about staging labels, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/terms-concepts.html#term_staging-label">Staging Labels</a> in the <i>AWS Secrets Manager User Guide</i>. </p> <p>The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of staging labels--they don't replace it.</p> <p>You can move the <code>AWSCURRENT</code> staging label to this version by including it in this call.</p> <note> <p>Whenever you move <code>AWSCURRENT</code>, Secrets Manager automatically moves the label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.</p> </note> <p>If this action results in the last label being removed from a version, then the version is considered to be 'deprecated' and can be deleted by Secrets Manager.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:UpdateSecretVersionStage</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To get the list of staging labels that are currently associated with a version of a secret, use <code> <a>DescribeSecret</a> </code> and examine the <code>SecretVersionsToStages</code> response value. </p> </li> </ul>
     * @param updateSecretVersionStageRequest 
     * @return updateSecretVersionStageResult The response from the UpdateSecretVersionStage service method, as returned by AWS Secrets Manager.
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InvalidRequestException 
     * @throws LimitExceededException 
     * @throws InternalServiceErrorException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSecretVersionStageResult updateSecretVersionStage(UpdateSecretVersionStageRequest updateSecretVersionStageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSecretVersionStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecretVersionStageRequest> request = null;
        Response<UpdateSecretVersionStageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecretVersionStageRequestMarshaller().marshall(updateSecretVersionStageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSecretVersionStageResult, JsonUnmarshallerContext> unmarshaller = new UpdateSecretVersionStageResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSecretVersionStageResult> responseHandler = new JsonResponseHandler<UpdateSecretVersionStageResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Validates the JSON text of the resource-based policy document attached to the specified secret. The JSON request string input and response output displays formatted code with white space and line breaks for better readability. Submit your input as a single line JSON string. A resource-based policy is optional.</p>
     * @param validateResourcePolicyRequest 
     * @return validateResourcePolicyResult The response from the ValidateResourcePolicy service method, as returned by AWS Secrets Manager.
     * @throws MalformedPolicyDocumentException 
     * @throws ResourceNotFoundException 
     * @throws InvalidParameterException 
     * @throws InternalServiceErrorException 
     * @throws InvalidRequestException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS Secrets Manager indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateResourcePolicyResult validateResourcePolicy(ValidateResourcePolicyRequest validateResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(validateResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateResourcePolicyRequest> request = null;
        Response<ValidateResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateResourcePolicyRequestMarshaller().marshall(validateResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ValidateResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new ValidateResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<ValidateResourcePolicyResult> responseHandler = new JsonResponseHandler<ValidateResourcePolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     *
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
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
