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

package com.amazonaws.services.organizations;

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

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.services.organizations.model.transform.*;

/**
 * Client for accessing AWS Organizations. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Organizations</fullname>
 */
public class AWSOrganizationsClient extends AmazonWebServiceClient implements AWSOrganizations {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Organizations exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations. A
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
    public AWSOrganizationsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations. A
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
     *            how this client connects to AWSOrganizations (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSOrganizationsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *         AWSOrganizationsClient client = new AWSOrganizationsClient(AWSMobileClient.getInstance());
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
    public AWSOrganizationsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *         AWSOrganizationsClient client = new AWSOrganizationsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSOrganizations (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSOrganizationsClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *         AWSOrganizationsClient client = new AWSOrganizationsClient(AWSMobileClient.getInstance());
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
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *         AWSOrganizationsClient client = new AWSOrganizationsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSOrganizations (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *            how this client connects to AWSOrganizations (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSOrganizations
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
     *         AWSOrganizationsClient client = new AWSOrganizationsClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSOrganizations (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AWSOrganizationsNotInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccessDeniedForDependencyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccountAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccountNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccountNotRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccountOwnerNotVerifiedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AlreadyInOrganizationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ChildNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConstraintViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CreateAccountStatusNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DestinationParentNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateAccountExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateHandshakeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateOrganizationalUnitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicatePolicyAttachmentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicatePolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EffectivePolicyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FinalizingOrganizationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HandshakeAlreadyInStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HandshakeConstraintViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HandshakeNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidHandshakeTransitionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MasterCannotLeaveOrganizationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OrganizationNotEmptyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OrganizationalUnitNotEmptyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OrganizationalUnitNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParentNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyChangesInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyNotAttachedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyTypeAlreadyEnabledExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new PolicyTypeNotAvailableForOrganizationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyTypeNotEnabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RootNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SourceParentNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedAPIEndpointExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("organizations.us-east-1.amazonaws.com");
        this.endpointPrefix = "organizations";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/organizations/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/organizations/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Sends a response to the originator of a handshake agreeing to the action
     * proposed by the handshake request.
     * </p>
     * <p>
     * This operation can be called only by the following principals when they
     * also have the relevant IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Invitation to join</b> or <b>Approve all features request</b>
     * handshakes: only a principal from the member account.
     * </p>
     * <p>
     * The user who calls the API for an invitation to join must have the
     * <code>organizations:AcceptHandshake</code> permission. If you enabled all
     * features in the organization, the user must also have the
     * <code>iam:CreateServiceLinkedRole</code> permission so that AWS
     * Organizations can create the required service-linked role named
     * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Enable all features final confirmation</b> handshake: only a principal
     * from the master account.
     * </p>
     * <p>
     * For more information about invitations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html"
     * >Inviting an AWS Account to Join Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i> For more information about requests to
     * enable all features in the organization, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you accept a handshake, it continues to appear in the results of
     * relevant APIs for only 30 days. After that, it's deleted.
     * </p>
     * 
     * @param acceptHandshakeRequest
     * @return acceptHandshakeResult The response from the AcceptHandshake
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws HandshakeConstraintViolationException
     * @throws HandshakeNotFoundException
     * @throws InvalidHandshakeTransitionException
     * @throws HandshakeAlreadyInStateException
     * @throws InvalidInputException
     * @throws ConcurrentModificationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AccessDeniedForDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AcceptHandshakeResult acceptHandshake(AcceptHandshakeRequest acceptHandshakeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptHandshakeRequest> request = null;
        Response<AcceptHandshakeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptHandshakeRequestMarshaller().marshall(acceptHandshakeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptHandshakeResult, JsonUnmarshallerContext> unmarshaller = new AcceptHandshakeResultJsonUnmarshaller();
            JsonResponseHandler<AcceptHandshakeResult> responseHandler = new JsonResponseHandler<AcceptHandshakeResult>(
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
     * Attaches a policy to a root, an organizational unit (OU), or an
     * individual account. How the policy affects accounts depends on the type
     * of policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Service control policy (SCP)</b> - An SCP specifies what permissions
     * can be delegated to users in affected member accounts. The scope of
     * influence for a policy depends on what you attach the policy to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you attach an SCP to a root, it affects all accounts in the
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach an SCP to an OU, it affects all accounts in that OU and in
     * any child OUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach the policy directly to an account, it affects only that
     * account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SCPs are JSON policies that specify the maximum permissions for an
     * organization or organizational unit (OU). You can attach one SCP to a
     * higher level root or OU, and a different SCP to a child OU or to an
     * account. The child policy can further restrict only the permissions that
     * pass through the parent filter and are available to the child. An SCP
     * that is attached to a child can't grant a permission that the parent
     * hasn't already granted. For example, imagine that the parent SCP allows
     * permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G.
     * The result is that the accounts affected by the child SCP are allowed to
     * use only C, D, and E. They can't use A or B because the child OU filtered
     * them out. They also can't use F and G because the parent OU filtered them
     * out. They can't be granted back by the child SCP; child SCPs can only
     * filter the permissions they receive from the parent SCP.
     * </p>
     * <p>
     * AWS Organizations attaches a default SCP named
     * <code>"FullAWSAccess</code> to every root, OU, and account. This default
     * SCP allows all services and actions, enabling any new child OU or account
     * to inherit the permissions of the parent root or OU. If you detach the
     * default policy, you must replace it with a policy that specifies the
     * permissions that you want to allow in that OU or account.
     * </p>
     * <p>
     * For more information about how AWS Organizations policies permissions
     * work, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >Using Service Control Policies</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param attachPolicyRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws DuplicatePolicyAttachmentException
     * @throws InvalidInputException
     * @throws PolicyNotFoundException
     * @throws PolicyTypeNotEnabledException
     * @throws ServiceException
     * @throws TargetNotFoundException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws PolicyChangesInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void attachPolicy(AttachPolicyRequest attachPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPolicyRequestMarshaller().marshall(attachPolicyRequest);
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
     * Cancels a handshake. Canceling a handshake sets the handshake state to
     * <code>CANCELED</code>.
     * </p>
     * <p>
     * This operation can be called only from the account that originated the
     * handshake. The recipient of the handshake can't cancel it, but can use
     * <a>DeclineHandshake</a> instead. After a handshake is canceled, the
     * recipient can no longer respond to that handshake.
     * </p>
     * <p>
     * After you cancel a handshake, it continues to appear in the results of
     * relevant APIs for only 30 days. After that, it's deleted.
     * </p>
     * 
     * @param cancelHandshakeRequest
     * @return cancelHandshakeResult The response from the CancelHandshake
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws HandshakeNotFoundException
     * @throws InvalidHandshakeTransitionException
     * @throws HandshakeAlreadyInStateException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CancelHandshakeResult cancelHandshake(CancelHandshakeRequest cancelHandshakeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelHandshakeRequest> request = null;
        Response<CancelHandshakeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelHandshakeRequestMarshaller().marshall(cancelHandshakeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelHandshakeResult, JsonUnmarshallerContext> unmarshaller = new CancelHandshakeResultJsonUnmarshaller();
            JsonResponseHandler<CancelHandshakeResult> responseHandler = new JsonResponseHandler<CancelHandshakeResult>(
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
     * Creates an AWS account that is automatically a member of the organization
     * whose credentials made the request. This is an asynchronous request that
     * AWS performs in the background. Because <code>CreateAccount</code>
     * operates asynchronously, it can return a successful completion message
     * even though account initialization might still be in progress. You might
     * need to wait a few minutes before you can successfully access the
     * account. To check the status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to
     * provide as a parameter to the <a>DescribeCreateAccountStatus</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code>
     * event. For information on using AWS CloudTrail with AWS Organizations,
     * see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * The user who calls the API to create an account must have the
     * <code>organizations:CreateAccount</code> permission. If you enabled all
     * features in the organization, AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants users
     * in the master account administrator permissions in the new member
     * account. Principals in the master account can assume the role. AWS
     * Organizations clones the company name and address information for the new
     * account from the organization's master account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html"
     * >Creating an AWS Account in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required for the account
     * to operate as a standalone account, such as a payment method and signing
     * the end user license agreement (EULA) is <i>not</i> automatically
     * collected. If you must remove an account from your organization later,
     * you can do so only after you provide the missing information. Follow the
     * steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account
     * limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because
     * your organization is still initializing, wait one hour and then try
     * again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateAccount</code> to create multiple temporary accounts
     * isn't recommended. You can only close an account from the Billing and
     * Cost Management Console, and you must be signed in as the root user. For
     * information on the requirements and process for closing an account, see
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html"
     * >Closing an AWS Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose
     * whether to create the account with the <b>IAM User and Role Access to
     * Billing Information</b> switch enabled. If you enable it, IAM users and
     * roles that have appropriate permissions can view billing information for
     * the account. If you disable it, only the account root user can access
     * billing information. For information about how to disable this switch for
     * an account, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html"
     * >Granting Access to Your Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createAccountRequest
     * @return createAccountResult The response from the CreateAccount service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws FinalizingOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateAccountResult createAccount(CreateAccountRequest createAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountRequest> request = null;
        Response<CreateAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountRequestMarshaller().marshall(createAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAccountResult, JsonUnmarshallerContext> unmarshaller = new CreateAccountResultJsonUnmarshaller();
            JsonResponseHandler<CreateAccountResult> responseHandler = new JsonResponseHandler<CreateAccountResult>(
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
     * This action is available if all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're authorized to create accounts in the AWS GovCloud (US) Region. For
     * more information on the AWS GovCloud (US) Region, see the <a href=
     * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html">
     * <i>AWS GovCloud User Guide</i>.</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * You already have an account in the AWS GovCloud (US) Region that is
     * associated with your master account in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call this action from the master account of your organization in the
     * commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You have the <code>organizations:CreateGovCloudAccount</code> permission.
     * AWS Organizations creates the required service-linked role named
     * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts,
     * but you should also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that AWS CloudTrail is enabled to store logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an S3 bucket for AWS CloudTrail log storage.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html"
     * >Verifying AWS CloudTrail Is Enabled</a> in the <i>AWS GovCloud User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You call this action from the master account of your organization in the
     * commercial Region to create a standalone AWS account in the AWS GovCloud
     * (US) Region. After the account is created, the master account of an
     * organization in the AWS GovCloud (US) Region can invite it to that
     * organization. For more information on inviting standalone accounts in the
     * AWS GovCloud (US) to join an organization, see <a href=
     * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html"
     * >AWS Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * Calling <code>CreateGovCloudAccount</code> is an asynchronous request
     * that AWS performs in the background. Because
     * <code>CreateGovCloudAccount</code> operates asynchronously, it can return
     * a successful completion message even though account initialization might
     * still be in progress. You might need to wait a few minutes before you can
     * successfully access the account. To check the status of the request, do
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to
     * provide as a parameter to the <a>DescribeCreateAccountStatus</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code>
     * event. For information on using AWS CloudTrail with Organizations, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * When you call the <code>CreateGovCloudAccount</code> action, you create
     * two accounts: a standalone account in the AWS GovCloud (US) Region and an
     * associated account in the commercial Region for billing and support
     * purposes. The account in the commercial Region is automatically a member
     * of the organization whose credentials made the request. Both accounts are
     * associated with the same email address.
     * </p>
     * <p>
     * A role is created in the new account in the commercial Region that allows
     * the master account in the organization in the commercial Region to assume
     * it. An AWS GovCloud (US) account is then created and associated with the
     * commercial account that you just created. A role is created in the new
     * AWS GovCloud (US) account that can be assumed by the AWS GovCloud (US)
     * account that is associated with the master account of the commercial
     * organization. For more information and to view a diagram that explains
     * how account access works, see <a href=
     * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html"
     * >AWS Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * For more information about creating accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html"
     * >Creating an AWS Account in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required for the account
     * to operate as a standalone account, such as a payment method and signing
     * the end user license agreement (EULA) is <i>not</i> automatically
     * collected. If you must remove an account from your organization later,
     * you can do so only after you provide the missing information. Follow the
     * steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account
     * limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because
     * your organization is still initializing, wait one hour and then try
     * again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateGovCloudAccount</code> to create multiple temporary
     * accounts isn't recommended. You can only close an account from the AWS
     * Billing and Cost Management console, and you must be signed in as the
     * root user. For information on the requirements and process for closing an
     * account, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html"
     * >Closing an AWS Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose
     * whether to create the account with the <b>IAM User and Role Access to
     * Billing Information</b> switch enabled. If you enable it, IAM users and
     * roles that have appropriate permissions can view billing information for
     * the account. If you disable it, only the account root user can access
     * billing information. For information about how to disable this switch for
     * an account, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html"
     * >Granting Access to Your Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createGovCloudAccountRequest
     * @return createGovCloudAccountResult The response from the
     *         CreateGovCloudAccount service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws FinalizingOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateGovCloudAccountResult createGovCloudAccount(
            CreateGovCloudAccountRequest createGovCloudAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGovCloudAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGovCloudAccountRequest> request = null;
        Response<CreateGovCloudAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGovCloudAccountRequestMarshaller()
                        .marshall(createGovCloudAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGovCloudAccountResult, JsonUnmarshallerContext> unmarshaller = new CreateGovCloudAccountResultJsonUnmarshaller();
            JsonResponseHandler<CreateGovCloudAccountResult> responseHandler = new JsonResponseHandler<CreateGovCloudAccountResult>(
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
     * Creates an AWS organization. The account whose user is calling the
     * <code>CreateOrganization</code> operation automatically becomes the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/orgs_getting-started_concepts.html#account"
     * >master account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is
     * to become the new organization's master account. The principal must also
     * have the relevant IAM permissions.
     * </p>
     * <p>
     * By default (or if you set the <code>FeatureSet</code> parameter to
     * <code>ALL</code>), the new organization is created with all features
     * enabled and service control policies automatically enabled in the root.
     * If you instead choose to create the organization supporting only the
     * consolidated billing features by setting the <code>FeatureSet</code>
     * parameter to <code>CONSOLIDATED_BILLING"</code>, no policy types are
     * enabled by default, and you can't use organization policies
     * </p>
     * 
     * @param createOrganizationRequest
     * @return createOrganizationResult The response from the CreateOrganization
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AlreadyInOrganizationException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AccessDeniedForDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateOrganizationResult createOrganization(
            CreateOrganizationRequest createOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrganizationRequest> request = null;
        Response<CreateOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrganizationRequestMarshaller()
                        .marshall(createOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateOrganizationResult, JsonUnmarshallerContext> unmarshaller = new CreateOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<CreateOrganizationResult> responseHandler = new JsonResponseHandler<CreateOrganizationResult>(
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
     * Creates an organizational unit (OU) within a root or parent OU. An OU is
     * a container for accounts that enables you to organize your accounts to
     * apply policies according to your business requirements. The number of
     * levels deep that you can nest OUs is dependent upon the policy types
     * enabled for that root. For service control policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html"
     * >Managing Organizational Units</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createOrganizationalUnitRequest
     * @return createOrganizationalUnitResult The response from the
     *         CreateOrganizationalUnit service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws DuplicateOrganizationalUnitException
     * @throws InvalidInputException
     * @throws ParentNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateOrganizationalUnitResult createOrganizationalUnit(
            CreateOrganizationalUnitRequest createOrganizationalUnitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrganizationalUnitRequest> request = null;
        Response<CreateOrganizationalUnitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrganizationalUnitRequestMarshaller()
                        .marshall(createOrganizationalUnitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateOrganizationalUnitResult, JsonUnmarshallerContext> unmarshaller = new CreateOrganizationalUnitResultJsonUnmarshaller();
            JsonResponseHandler<CreateOrganizationalUnitResult> responseHandler = new JsonResponseHandler<CreateOrganizationalUnitResult>(
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
     * Creates a policy of a specified type that you can attach to a root, an
     * organizational unit (OU), or an individual AWS account.
     * </p>
     * <p>
     * For more information about policies and their use, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html"
     * >Managing Organization Policies</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createPolicyRequest
     * @return createPolicyResult The response from the CreatePolicy service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws DuplicatePolicyException
     * @throws InvalidInputException
     * @throws MalformedPolicyDocumentException
     * @throws PolicyTypeNotAvailableForOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Declines a handshake request. This sets the handshake state to
     * <code>DECLINED</code> and effectively deactivates the request.
     * </p>
     * <p>
     * This operation can be called only from the account that received the
     * handshake. The originator of the handshake can use <a>CancelHandshake</a>
     * instead. The originator can't reactivate a declined request, but can
     * reinitiate the process with a new handshake request.
     * </p>
     * <p>
     * After you decline a handshake, it continues to appear in the results of
     * relevant APIs for only 30 days. After that, it's deleted.
     * </p>
     * 
     * @param declineHandshakeRequest
     * @return declineHandshakeResult The response from the DeclineHandshake
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws HandshakeNotFoundException
     * @throws InvalidHandshakeTransitionException
     * @throws HandshakeAlreadyInStateException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeclineHandshakeResult declineHandshake(DeclineHandshakeRequest declineHandshakeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(declineHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineHandshakeRequest> request = null;
        Response<DeclineHandshakeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineHandshakeRequestMarshaller().marshall(declineHandshakeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeclineHandshakeResult, JsonUnmarshallerContext> unmarshaller = new DeclineHandshakeResultJsonUnmarshaller();
            JsonResponseHandler<DeclineHandshakeResult> responseHandler = new JsonResponseHandler<DeclineHandshakeResult>(
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
     * Deletes the organization. You can delete an organization only by using
     * credentials from the master account. The organization must be empty of
     * member accounts.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidInputException
     * @throws OrganizationNotEmptyException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteOrganization(DeleteOrganizationRequest deleteOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationRequestMarshaller()
                        .marshall(deleteOrganizationRequest);
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
     * Deletes an organizational unit (OU) from a root or another OU. You must
     * first remove all accounts and child OUs from the OU that you want to
     * delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deleteOrganizationalUnitRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidInputException
     * @throws OrganizationalUnitNotEmptyException
     * @throws OrganizationalUnitNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteOrganizationalUnit(
            DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationalUnitRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationalUnitRequestMarshaller()
                        .marshall(deleteOrganizationalUnitRequest);
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
     * Deletes the specified policy from your organization. Before you perform
     * this operation, you must first detach the policy from all organizational
     * units (OUs), roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deletePolicyRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidInputException
     * @throws PolicyInUseException
     * @throws PolicyNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the specified member AWS account as a delegated administrator for
     * the specified AWS service.
     * </p>
     * <p>
     * You can run this action only for AWS services that support this feature.
     * For a current list of services that support it, see the column
     * <i>Supports Delegated Administrator</i> in the table at <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrated-services-list.html"
     * >AWS Services that you can use with AWS Organizations</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deregisterDelegatedAdministratorRequest
     * @throws AccessDeniedException
     * @throws AccountNotFoundException
     * @throws AccountNotRegisteredException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws TooManyRequestsException
     * @throws ServiceException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deregisterDelegatedAdministrator(
            DeregisterDelegatedAdministratorRequest deregisterDelegatedAdministratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterDelegatedAdministratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterDelegatedAdministratorRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterDelegatedAdministratorRequestMarshaller()
                        .marshall(deregisterDelegatedAdministratorRequest);
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
     * Retrieves AWS Organizations-related information about the specified
     * account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param describeAccountRequest
     * @return describeAccountResult The response from the DescribeAccount
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AccountNotFoundException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeAccountResult describeAccount(DescribeAccountRequest describeAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountRequest> request = null;
        Response<DescribeAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountRequestMarshaller().marshall(describeAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAccountResult, JsonUnmarshallerContext> unmarshaller = new DescribeAccountResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAccountResult> responseHandler = new JsonResponseHandler<DescribeAccountResult>(
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
     * Retrieves the current status of an asynchronous request to create an
     * account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param describeCreateAccountStatusRequest
     * @return describeCreateAccountStatusResult The response from the
     *         DescribeCreateAccountStatus service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws CreateAccountStatusNotFoundException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeCreateAccountStatusResult describeCreateAccountStatus(
            DescribeCreateAccountStatusRequest describeCreateAccountStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCreateAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCreateAccountStatusRequest> request = null;
        Response<DescribeCreateAccountStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCreateAccountStatusRequestMarshaller()
                        .marshall(describeCreateAccountStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCreateAccountStatusResult, JsonUnmarshallerContext> unmarshaller = new DescribeCreateAccountStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCreateAccountStatusResult> responseHandler = new JsonResponseHandler<DescribeCreateAccountStatusResult>(
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
     * Returns the contents of the effective tag policy for the account. The
     * effective tag policy is the aggregation of any tag policies the account
     * inherits, plus any policy directly that is attached to the account.
     * </p>
     * <p>
     * This action returns information on tag policies only.
     * </p>
     * <p>
     * For more information on policy inheritance, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html"
     * >How Policy Inheritance Works</a> in the <i>AWS Organizations User
     * Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param describeEffectivePolicyRequest
     * @return describeEffectivePolicyResult The response from the
     *         DescribeEffectivePolicy service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConstraintViolationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws TargetNotFoundException
     * @throws EffectivePolicyNotFoundException
     * @throws InvalidInputException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeEffectivePolicyResult describeEffectivePolicy(
            DescribeEffectivePolicyRequest describeEffectivePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEffectivePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectivePolicyRequest> request = null;
        Response<DescribeEffectivePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectivePolicyRequestMarshaller()
                        .marshall(describeEffectivePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEffectivePolicyResult, JsonUnmarshallerContext> unmarshaller = new DescribeEffectivePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEffectivePolicyResult> responseHandler = new JsonResponseHandler<DescribeEffectivePolicyResult>(
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
     * Retrieves information about a previously requested handshake. The
     * handshake ID comes from the response to the original
     * <a>InviteAccountToOrganization</a> operation that generated the
     * handshake.
     * </p>
     * <p>
     * You can access handshakes that are <code>ACCEPTED</code>,
     * <code>DECLINED</code>, or <code>CANCELED</code> for only 30 days after
     * they change to that state. They're then deleted and no longer accessible.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeHandshakeRequest
     * @return describeHandshakeResult The response from the DescribeHandshake
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws HandshakeNotFoundException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeHandshakeResult describeHandshake(
            DescribeHandshakeRequest describeHandshakeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHandshakeRequest> request = null;
        Response<DescribeHandshakeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHandshakeRequestMarshaller()
                        .marshall(describeHandshakeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHandshakeResult, JsonUnmarshallerContext> unmarshaller = new DescribeHandshakeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHandshakeResult> responseHandler = new JsonResponseHandler<DescribeHandshakeResult>(
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
     * Retrieves information about the organization that the user's account
     * belongs to.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * disable it separately at the root level with <a>DisablePolicyType</a>.
     * Use <a>ListRoots</a> to see the status of policy types for a specified
     * root.
     * </p>
     * </note>
     * 
     * @param describeOrganizationRequest
     * @return describeOrganizationResult The response from the
     *         DescribeOrganization service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeOrganizationResult describeOrganization(
            DescribeOrganizationRequest describeOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationRequest> request = null;
        Response<DescribeOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationRequestMarshaller()
                        .marshall(describeOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOrganizationResult> responseHandler = new JsonResponseHandler<DescribeOrganizationResult>(
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
     * Retrieves information about an organizational unit (OU).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param describeOrganizationalUnitRequest
     * @return describeOrganizationalUnitResult The response from the
     *         DescribeOrganizationalUnit service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws OrganizationalUnitNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeOrganizationalUnitResult describeOrganizationalUnit(
            DescribeOrganizationalUnitRequest describeOrganizationalUnitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationalUnitRequest> request = null;
        Response<DescribeOrganizationalUnitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationalUnitRequestMarshaller()
                        .marshall(describeOrganizationalUnitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOrganizationalUnitResult, JsonUnmarshallerContext> unmarshaller = new DescribeOrganizationalUnitResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOrganizationalUnitResult> responseHandler = new JsonResponseHandler<DescribeOrganizationalUnitResult>(
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
     * Retrieves information about a policy.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param describePolicyRequest
     * @return describePolicyResult The response from the DescribePolicy service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws PolicyNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribePolicyResult describePolicy(DescribePolicyRequest describePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePolicyRequest> request = null;
        Response<DescribePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePolicyRequestMarshaller().marshall(describePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePolicyResult, JsonUnmarshallerContext> unmarshaller = new DescribePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DescribePolicyResult> responseHandler = new JsonResponseHandler<DescribePolicyResult>(
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
     * Detaches a policy from a target root, organizational unit (OU), or
     * account. If the policy being detached is a service control policy (SCP),
     * the changes to permissions for IAM users and roles in affected accounts
     * are immediate.
     * </p>
     * <p>
     * <b>Note:</b> Every root, OU, and account must have at least one SCP
     * attached. If you want to replace the default <code>FullAWSAccess</code>
     * policy with one that limits the permissions that can be delegated, you
     * must attach the replacement policy before you can remove the default one.
     * This is the authorization strategy of an
     * "<a href="https://docs.aws.amazon
     * .com/organizations/latest/userguide/orgs_manage_policies_about
     * -scps.html#orgs_policies_whitelist">allow list</a>". If you instead
     * attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to
     * override the <code>"Effect": "Allow"</code> in the
     * <code>FullAWSAccess</code> policy (or any other attached SCP), you're
     * using the authorization strategy of a
     * "<a href="https://docs.aws.amazon.com
     * /organizations/latest/userguide/orgs_manage_policies_about
     * -scps.html#orgs_policies_blacklist">deny list</a>".
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param detachPolicyRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws PolicyNotAttachedException
     * @throws PolicyNotFoundException
     * @throws ServiceException
     * @throws TargetNotFoundException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws PolicyChangesInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void detachPolicy(DetachPolicyRequest detachPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPolicyRequestMarshaller().marshall(detachPolicyRequest);
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
     * Disables the integration of an AWS service (the service that is specified
     * by <code>ServicePrincipal</code>) with AWS Organizations. When you
     * disable integration, the specified service no longer can create a <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html"
     * >service-linked role</a> in <i>new</i> accounts in your organization.
     * This means the service can't perform operations on your behalf on any new
     * accounts in your organization. The service can still perform operations
     * in older accounts until the service completes its clean-up from AWS
     * Organizations.
     * </p>
     * <p/>
     * <important>
     * <p>
     * We recommend that you disable integration between AWS Organizations and
     * the specified AWS service by using the console or commands that are
     * provided by the specified service. Doing so ensures that the other
     * service is aware that it can clean up any resources that are required
     * only for the integration. How the service cleans up its resources in the
     * organization's accounts depends on that service. For more information,
     * see the documentation for the other AWS service.
     * </p>
     * </important>
     * <p>
     * After you perform the <code>DisableAWSServiceAccess</code> operation, the
     * specified service can no longer perform operations in your organization's
     * accounts unless the operations are explicitly permitted by the IAM
     * policies that are attached to your roles.
     * </p>
     * <p>
     * For more information about integrating other services with AWS
     * Organizations, including the list of services that work with
     * Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html"
     * >Integrating AWS Organizations with Other AWS Services</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param disableAWSServiceAccessRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void disableAWSServiceAccess(
            DisableAWSServiceAccessRequest disableAWSServiceAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableAWSServiceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAWSServiceAccessRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAWSServiceAccessRequestMarshaller()
                        .marshall(disableAWSServiceAccessRequest);
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
     * Disables an organizational control policy type in a root. A policy of a
     * certain type can be attached to entities in a root only if that type is
     * enabled in the root. After you perform this operation, you no longer can
     * attach policies of the specified type to that root or to any
     * organizational unit (OU) or account in that root. You can undo this by
     * using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. If
     * you disable a policy for a root, it still appears enabled for the
     * organization if <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >all features</a> are enabled for the organization. AWS recommends that
     * you first use <a>ListRoots</a> to see the status of policy types for a
     * specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * To view the status of available policy types in the organization, use
     * <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param disablePolicyTypeRequest
     * @return disablePolicyTypeResult The response from the DisablePolicyType
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws PolicyTypeNotEnabledException
     * @throws RootNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws PolicyChangesInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisablePolicyTypeResult disablePolicyType(
            DisablePolicyTypeRequest disablePolicyTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disablePolicyTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisablePolicyTypeRequest> request = null;
        Response<DisablePolicyTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisablePolicyTypeRequestMarshaller()
                        .marshall(disablePolicyTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisablePolicyTypeResult, JsonUnmarshallerContext> unmarshaller = new DisablePolicyTypeResultJsonUnmarshaller();
            JsonResponseHandler<DisablePolicyTypeResult> responseHandler = new JsonResponseHandler<DisablePolicyTypeResult>(
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
     * Enables the integration of an AWS service (the service that is specified
     * by <code>ServicePrincipal</code>) with AWS Organizations. When you enable
     * integration, you allow the specified service to create a <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html"
     * >service-linked role</a> in all the accounts in your organization. This
     * allows the service to perform operations on your behalf in your
     * organization and its accounts.
     * </p>
     * <important>
     * <p>
     * We recommend that you enable integration between AWS Organizations and
     * the specified AWS service by using the console or commands that are
     * provided by the specified service. Doing so ensures that the service is
     * aware that it can create the resources that are required for the
     * integration. How the service creates those resources in the
     * organization's accounts depends on that service. For more information,
     * see the documentation for the other AWS service.
     * </p>
     * </important>
     * <p>
     * For more information about enabling services to integrate with AWS
     * Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html"
     * >Integrating AWS Organizations with Other AWS Services</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * and only if the organization has <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >enabled all features</a>.
     * </p>
     * 
     * @param enableAWSServiceAccessRequest
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void enableAWSServiceAccess(EnableAWSServiceAccessRequest enableAWSServiceAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAWSServiceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAWSServiceAccessRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAWSServiceAccessRequestMarshaller()
                        .marshall(enableAWSServiceAccessRequest);
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
     * Enables all features in an organization. This enables the use of
     * organization policies that can restrict the services and actions that can
     * be called in each account. Until you enable all features, you have access
     * only to consolidated billing, and you can't use any of the advanced
     * account administration features that AWS Organizations supports. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created
     * explicitly with only the consolidated billing features enabled. Calling
     * this operation sends a handshake to every invited account in the
     * organization. The feature set change can be finalized and the additional
     * features enabled only after all administrators in the invited accounts
     * approve the change by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After you enable all features, you can separately enable or disable
     * individual policy types in a root using <a>EnablePolicyType</a> and
     * <a>DisablePolicyType</a>. To see the status of policy types in a root,
     * use <a>ListRoots</a>.
     * </p>
     * <p>
     * After all invited member accounts accept the handshake, you finalize the
     * feature set change by accepting the handshake that contains
     * <code>"Action": "ENABLE_ALL_FEATURES"</code>. This completes the change.
     * </p>
     * <p>
     * After you enable all features in your organization, the master account in
     * the organization can apply policies on all member accounts. These
     * policies can restrict what users and even administrators in those
     * accounts can do. The master account can apply policies that prevent
     * accounts from leaving the organization. Ensure that your account
     * administrators are aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enableAllFeaturesRequest
     * @return enableAllFeaturesResult The response from the EnableAllFeatures
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws HandshakeConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnableAllFeaturesResult enableAllFeatures(
            EnableAllFeaturesRequest enableAllFeaturesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAllFeaturesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAllFeaturesRequest> request = null;
        Response<EnableAllFeaturesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAllFeaturesRequestMarshaller()
                        .marshall(enableAllFeaturesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableAllFeaturesResult, JsonUnmarshallerContext> unmarshaller = new EnableAllFeaturesResultJsonUnmarshaller();
            JsonResponseHandler<EnableAllFeaturesResult> responseHandler = new JsonResponseHandler<EnableAllFeaturesResult>(
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
     * Enables a policy type in a root. After you enable a policy type in a
     * root, you can attach policies of that type to the root, any
     * organizational unit (OU), or account in that root. You can undo this by
     * using the <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. AWS
     * recommends that you first use <a>ListRoots</a> to see the status of
     * policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * You can enable a policy type in a root only if that policy type is
     * available in the organization. To view the status of available policy
     * types in the organization, use <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param enablePolicyTypeRequest
     * @return enablePolicyTypeResult The response from the EnablePolicyType
     *         service method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws PolicyTypeAlreadyEnabledException
     * @throws RootNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws PolicyTypeNotAvailableForOrganizationException
     * @throws UnsupportedAPIEndpointException
     * @throws PolicyChangesInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnablePolicyTypeResult enablePolicyType(EnablePolicyTypeRequest enablePolicyTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enablePolicyTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnablePolicyTypeRequest> request = null;
        Response<EnablePolicyTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnablePolicyTypeRequestMarshaller().marshall(enablePolicyTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnablePolicyTypeResult, JsonUnmarshallerContext> unmarshaller = new EnablePolicyTypeResultJsonUnmarshaller();
            JsonResponseHandler<EnablePolicyTypeResult> responseHandler = new JsonResponseHandler<EnablePolicyTypeResult>(
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
     * Sends an invitation to another account to join your organization as a
     * member account. AWS Organizations sends email on your behalf to the email
     * address that is associated with the other account's owner. The invitation
     * is implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can invite AWS accounts only from the same seller as the master
     * account. For example, if your organization's master account was created
     * by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, you
     * can invite only other AISPL accounts to your organization. You can't
     * combine accounts from AISPL and AWS or from any other AWS seller. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
     * >Consolidated Billing in India</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you receive an exception that indicates that you exceeded your account
     * limits for the organization or that the operation failed because your
     * organization is still initializing, wait one hour and then try again. If
     * the error persists after an hour, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param inviteAccountToOrganizationRequest
     * @return inviteAccountToOrganizationResult The response from the
     *         InviteAccountToOrganization service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws AccountOwnerNotVerifiedException
     * @throws ConcurrentModificationException
     * @throws HandshakeConstraintViolationException
     * @throws DuplicateHandshakeException
     * @throws InvalidInputException
     * @throws FinalizingOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public InviteAccountToOrganizationResult inviteAccountToOrganization(
            InviteAccountToOrganizationRequest inviteAccountToOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(inviteAccountToOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteAccountToOrganizationRequest> request = null;
        Response<InviteAccountToOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteAccountToOrganizationRequestMarshaller()
                        .marshall(inviteAccountToOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InviteAccountToOrganizationResult, JsonUnmarshallerContext> unmarshaller = new InviteAccountToOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<InviteAccountToOrganizationResult> responseHandler = new JsonResponseHandler<InviteAccountToOrganizationResult>(
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
     * Removes a member account from its parent organization. This version of
     * the operation is performed by the account that wants to leave. To remove
     * a member account as a user in the master account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the
     * organization.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * The master account in an organization with all features enabled can set
     * service control policies (SCPs) that can restrict what administrators of
     * member accounts can do. This includes preventing them from successfully
     * calling <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization as a member account only if the account is
     * configured with the information required to operate as a standalone
     * account. When you create an account in an organization using the AWS
     * Organizations console, API, or CLI commands, the information required of
     * standalone accounts is <i>not</i> automatically collected. For each
     * account that you want to make standalone, you must do the following
     * steps:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Accept the end user license agreement (EULA)
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose a support plan
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide and verify the required contact information
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide a current payment method
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS uses the payment method to charge for any billable (not free tier)
     * AWS activity that occurs while the account isn't attached to an
     * organization. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not
     * yet been provided</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization only after you enable IAM user access to
     * billing in your account. For more information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param leaveOrganizationRequest
     * @throws AccessDeniedException
     * @throws AccountNotFoundException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws MasterCannotLeaveOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void leaveOrganization(LeaveOrganizationRequest leaveOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(leaveOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LeaveOrganizationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LeaveOrganizationRequestMarshaller()
                        .marshall(leaveOrganizationRequest);
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
     * Returns a list of the AWS services that you enabled to integrate with
     * your organization. After a service on this list creates the resources
     * that it requires for the integration, it can perform operations on your
     * organization and its accounts.
     * </p>
     * <p>
     * For more information about integrating other services with AWS
     * Organizations, including the list of services that currently work with
     * Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html"
     * >Integrating AWS Organizations with Other AWS Services</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listAWSServiceAccessForOrganizationRequest
     * @return listAWSServiceAccessForOrganizationResult The response from the
     *         ListAWSServiceAccessForOrganization service method, as returned
     *         by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListAWSServiceAccessForOrganizationResult listAWSServiceAccessForOrganization(
            ListAWSServiceAccessForOrganizationRequest listAWSServiceAccessForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAWSServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAWSServiceAccessForOrganizationRequest> request = null;
        Response<ListAWSServiceAccessForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAWSServiceAccessForOrganizationRequestMarshaller()
                        .marshall(listAWSServiceAccessForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAWSServiceAccessForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new ListAWSServiceAccessForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<ListAWSServiceAccessForOrganizationResult> responseHandler = new JsonResponseHandler<ListAWSServiceAccessForOrganizationResult>(
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
     * Lists all the accounts in the organization. To request only the accounts
     * in a specified root or organizational unit (OU), use the
     * <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listAccountsRequest
     * @return listAccountsResult The response from the ListAccounts service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsRequest> request = null;
        Response<ListAccountsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsRequestMarshaller().marshall(listAccountsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccountsResult, JsonUnmarshallerContext> unmarshaller = new ListAccountsResultJsonUnmarshaller();
            JsonResponseHandler<ListAccountsResult> responseHandler = new JsonResponseHandler<ListAccountsResult>(
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
     * Lists the accounts in an organization that are contained by the specified
     * target root or organizational unit (OU). If you specify the root, you get
     * a list of all the accounts that aren't in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU and not in any child
     * OUs. To get a list of all accounts in the organization, use the
     * <a>ListAccounts</a> operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listAccountsForParentRequest
     * @return listAccountsForParentResult The response from the
     *         ListAccountsForParent service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ParentNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListAccountsForParentResult listAccountsForParent(
            ListAccountsForParentRequest listAccountsForParentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccountsForParentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsForParentRequest> request = null;
        Response<ListAccountsForParentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsForParentRequestMarshaller()
                        .marshall(listAccountsForParentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccountsForParentResult, JsonUnmarshallerContext> unmarshaller = new ListAccountsForParentResultJsonUnmarshaller();
            JsonResponseHandler<ListAccountsForParentResult> responseHandler = new JsonResponseHandler<ListAccountsForParentResult>(
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
     * Lists all of the organizational units (OUs) or accounts that are
     * contained in the specified parent OU or root. This operation, along with
     * <a>ListParents</a> enables you to traverse the tree structure that makes
     * up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listChildrenRequest
     * @return listChildrenResult The response from the ListChildren service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ParentNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListChildrenResult listChildren(ListChildrenRequest listChildrenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChildrenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChildrenRequest> request = null;
        Response<ListChildrenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChildrenRequestMarshaller().marshall(listChildrenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChildrenResult, JsonUnmarshallerContext> unmarshaller = new ListChildrenResultJsonUnmarshaller();
            JsonResponseHandler<ListChildrenResult> responseHandler = new JsonResponseHandler<ListChildrenResult>(
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
     * Lists the account creation requests that match the specified status that
     * is currently being tracked for the organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listCreateAccountStatusRequest
     * @return listCreateAccountStatusResult The response from the
     *         ListCreateAccountStatus service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListCreateAccountStatusResult listCreateAccountStatus(
            ListCreateAccountStatusRequest listCreateAccountStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCreateAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCreateAccountStatusRequest> request = null;
        Response<ListCreateAccountStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCreateAccountStatusRequestMarshaller()
                        .marshall(listCreateAccountStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCreateAccountStatusResult, JsonUnmarshallerContext> unmarshaller = new ListCreateAccountStatusResultJsonUnmarshaller();
            JsonResponseHandler<ListCreateAccountStatusResult> responseHandler = new JsonResponseHandler<ListCreateAccountStatusResult>(
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
     * Lists the AWS accounts that are designated as delegated administrators in
     * this organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listDelegatedAdministratorsRequest
     * @return listDelegatedAdministratorsResult The response from the
     *         ListDelegatedAdministrators service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws TooManyRequestsException
     * @throws ServiceException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDelegatedAdministratorsResult listDelegatedAdministrators(
            ListDelegatedAdministratorsRequest listDelegatedAdministratorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDelegatedAdministratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDelegatedAdministratorsRequest> request = null;
        Response<ListDelegatedAdministratorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDelegatedAdministratorsRequestMarshaller()
                        .marshall(listDelegatedAdministratorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDelegatedAdministratorsResult, JsonUnmarshallerContext> unmarshaller = new ListDelegatedAdministratorsResultJsonUnmarshaller();
            JsonResponseHandler<ListDelegatedAdministratorsResult> responseHandler = new JsonResponseHandler<ListDelegatedAdministratorsResult>(
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
     * List the AWS services for which the specified account is a delegated
     * administrator.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listDelegatedServicesForAccountRequest
     * @return listDelegatedServicesForAccountResult The response from the
     *         ListDelegatedServicesForAccount service method, as returned by
     *         AWS Organizations.
     * @throws AccessDeniedException
     * @throws AccountNotFoundException
     * @throws AccountNotRegisteredException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws TooManyRequestsException
     * @throws ServiceException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDelegatedServicesForAccountResult listDelegatedServicesForAccount(
            ListDelegatedServicesForAccountRequest listDelegatedServicesForAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDelegatedServicesForAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDelegatedServicesForAccountRequest> request = null;
        Response<ListDelegatedServicesForAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDelegatedServicesForAccountRequestMarshaller()
                        .marshall(listDelegatedServicesForAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDelegatedServicesForAccountResult, JsonUnmarshallerContext> unmarshaller = new ListDelegatedServicesForAccountResultJsonUnmarshaller();
            JsonResponseHandler<ListDelegatedServicesForAccountResult> responseHandler = new JsonResponseHandler<ListDelegatedServicesForAccountResult>(
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
     * Lists the current handshakes that are associated with the account of the
     * requesting user.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or
     * <code>CANCELED</code> appear in the results of this API for only 30 days
     * after changing to that state. After that, they're deleted and no longer
     * accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listHandshakesForAccountRequest
     * @return listHandshakesForAccountResult The response from the
     *         ListHandshakesForAccount service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListHandshakesForAccountResult listHandshakesForAccount(
            ListHandshakesForAccountRequest listHandshakesForAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listHandshakesForAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHandshakesForAccountRequest> request = null;
        Response<ListHandshakesForAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHandshakesForAccountRequestMarshaller()
                        .marshall(listHandshakesForAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListHandshakesForAccountResult, JsonUnmarshallerContext> unmarshaller = new ListHandshakesForAccountResultJsonUnmarshaller();
            JsonResponseHandler<ListHandshakesForAccountResult> responseHandler = new JsonResponseHandler<ListHandshakesForAccountResult>(
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
     * Lists the handshakes that are associated with the organization that the
     * requesting user is part of. The
     * <code>ListHandshakesForOrganization</code> operation returns a list of
     * handshake structures. Each structure contains details and status about a
     * handshake.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or
     * <code>CANCELED</code> appear in the results of this API for only 30 days
     * after changing to that state. After that, they're deleted and no longer
     * accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listHandshakesForOrganizationRequest
     * @return listHandshakesForOrganizationResult The response from the
     *         ListHandshakesForOrganization service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListHandshakesForOrganizationResult listHandshakesForOrganization(
            ListHandshakesForOrganizationRequest listHandshakesForOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listHandshakesForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHandshakesForOrganizationRequest> request = null;
        Response<ListHandshakesForOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHandshakesForOrganizationRequestMarshaller()
                        .marshall(listHandshakesForOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListHandshakesForOrganizationResult, JsonUnmarshallerContext> unmarshaller = new ListHandshakesForOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<ListHandshakesForOrganizationResult> responseHandler = new JsonResponseHandler<ListHandshakesForOrganizationResult>(
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
     * Lists the organizational units (OUs) in a parent organizational unit or
     * root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listOrganizationalUnitsForParentRequest
     * @return listOrganizationalUnitsForParentResult The response from the
     *         ListOrganizationalUnitsForParent service method, as returned by
     *         AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ParentNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListOrganizationalUnitsForParentResult listOrganizationalUnitsForParent(
            ListOrganizationalUnitsForParentRequest listOrganizationalUnitsForParentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOrganizationalUnitsForParentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationalUnitsForParentRequest> request = null;
        Response<ListOrganizationalUnitsForParentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationalUnitsForParentRequestMarshaller()
                        .marshall(listOrganizationalUnitsForParentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOrganizationalUnitsForParentResult, JsonUnmarshallerContext> unmarshaller = new ListOrganizationalUnitsForParentResultJsonUnmarshaller();
            JsonResponseHandler<ListOrganizationalUnitsForParentResult> responseHandler = new JsonResponseHandler<ListOrganizationalUnitsForParentResult>(
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
     * Lists the root or organizational units (OUs) that serve as the immediate
     * parent of the specified child OU or account. This operation, along with
     * <a>ListChildren</a> enables you to traverse the tree structure that makes
     * up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * <note>
     * <p>
     * In the current release, a child can have only a single parent.
     * </p>
     * </note>
     * 
     * @param listParentsRequest
     * @return listParentsResult The response from the ListParents service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ChildNotFoundException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListParentsResult listParents(ListParentsRequest listParentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listParentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListParentsRequest> request = null;
        Response<ListParentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListParentsRequestMarshaller().marshall(listParentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListParentsResult, JsonUnmarshallerContext> unmarshaller = new ListParentsResultJsonUnmarshaller();
            JsonResponseHandler<ListParentsResult> responseHandler = new JsonResponseHandler<ListParentsResult>(
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
     * Retrieves the list of all policies in an organization of a specified
     * type.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return listPoliciesResult The response from the ListPolicies service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the policies that are directly attached to the specified target
     * root, organizational unit (OU), or account. You must specify the policy
     * type that you want included in the returned list.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listPoliciesForTargetRequest
     * @return listPoliciesForTargetResult The response from the
     *         ListPoliciesForTarget service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TargetNotFoundException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPoliciesForTargetResult listPoliciesForTarget(
            ListPoliciesForTargetRequest listPoliciesForTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPoliciesForTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesForTargetRequest> request = null;
        Response<ListPoliciesForTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesForTargetRequestMarshaller()
                        .marshall(listPoliciesForTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPoliciesForTargetResult, JsonUnmarshallerContext> unmarshaller = new ListPoliciesForTargetResultJsonUnmarshaller();
            JsonResponseHandler<ListPoliciesForTargetResult> responseHandler = new JsonResponseHandler<ListPoliciesForTargetResult>(
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
     * Lists the roots that are defined in the current organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * <note>
     * <p>
     * Policy types can be enabled and disabled in roots. This is distinct from
     * whether they're available in the organization. When you enable all
     * features, you make policy types available for use in that organization.
     * Individual policy types can then be enabled and disabled in a root. To
     * see the availability of a policy type in an organization, use
     * <a>DescribeOrganization</a>.
     * </p>
     * </note>
     * 
     * @param listRootsRequest
     * @return listRootsResult The response from the ListRoots service method,
     *         as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListRootsResult listRoots(ListRootsRequest listRootsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRootsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRootsRequest> request = null;
        Response<ListRootsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRootsRequestMarshaller().marshall(listRootsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRootsResult, JsonUnmarshallerContext> unmarshaller = new ListRootsResultJsonUnmarshaller();
            JsonResponseHandler<ListRootsResult> responseHandler = new JsonResponseHandler<ListRootsResult>(
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
     * Lists tags for the specified resource.
     * </p>
     * <p>
     * Currently, you can list tags on an account in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws TargetNotFoundException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Lists all the roots, organizational units (OUs), and accounts that the
     * specified policy is attached to.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a
     * <code>null</code> value when calling a <code>List*</code> operation.
     * These operations can occasionally return an empty set of results even
     * when there are more results available. The <code>NextToken</code>
     * response parameter value is <code>null</code> <i>only</i> when there are
     * no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account
     * or by a member account that is a delegated administrator for an AWS
     * service.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return listTargetsForPolicyResult The response from the
     *         ListTargetsForPolicy service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws InvalidInputException
     * @throws PolicyNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTargetsForPolicyResult listTargetsForPolicy(
            ListTargetsForPolicyRequest listTargetsForPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTargetsForPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsForPolicyRequest> request = null;
        Response<ListTargetsForPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsForPolicyRequestMarshaller()
                        .marshall(listTargetsForPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTargetsForPolicyResult, JsonUnmarshallerContext> unmarshaller = new ListTargetsForPolicyResultJsonUnmarshaller();
            JsonResponseHandler<ListTargetsForPolicyResult> responseHandler = new JsonResponseHandler<ListTargetsForPolicyResult>(
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
     * Moves an account from its current source parent root or organizational
     * unit (OU) to the specified destination parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param moveAccountRequest
     * @throws AccessDeniedException
     * @throws InvalidInputException
     * @throws SourceParentNotFoundException
     * @throws DestinationParentNotFoundException
     * @throws DuplicateAccountException
     * @throws AccountNotFoundException
     * @throws TooManyRequestsException
     * @throws ConcurrentModificationException
     * @throws AWSOrganizationsNotInUseException
     * @throws ServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void moveAccount(MoveAccountRequest moveAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(moveAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MoveAccountRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MoveAccountRequestMarshaller().marshall(moveAccountRequest);
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
     * Enables the specified member account to administer the Organizations
     * features of the specified AWS service. It grants read-only access to AWS
     * Organizations service data. The account still requires IAM permissions to
     * access and administer the AWS service.
     * </p>
     * <p>
     * You can run this action only for AWS services that support this feature.
     * For a current list of services that support it, see the column
     * <i>Supports Delegated Administrator</i> in the table at <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrated-services-list.html"
     * >AWS Services that you can use with AWS Organizations</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param registerDelegatedAdministratorRequest
     * @throws AccessDeniedException
     * @throws AccountAlreadyRegisteredException
     * @throws AccountNotFoundException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws TooManyRequestsException
     * @throws ServiceException
     * @throws UnsupportedAPIEndpointException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void registerDelegatedAdministrator(
            RegisterDelegatedAdministratorRequest registerDelegatedAdministratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerDelegatedAdministratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDelegatedAdministratorRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDelegatedAdministratorRequestMarshaller()
                        .marshall(registerDelegatedAdministratorRequest);
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
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a standalone account that isn't a member of
     * any organization. It's no longer subject to any policies and is
     * responsible for its own bill payments. The organization's master account
     * is no longer charged for any expenses accrued by the member account after
     * it's removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * Member accounts can remove themselves with <a>LeaveOrganization</a>
     * instead.
     * </p>
     * <important>
     * <p>
     * You can remove an account from your organization only if the account is
     * configured with the information required to operate as a standalone
     * account. When you create an account in an organization using the AWS
     * Organizations console, API, or CLI commands, the information required of
     * standalone accounts is <i>not</i> automatically collected. For an account
     * that you want to make standalone, you must accept the end user license
     * agreement (EULA), choose a support plan, provide and verify the required
     * contact information, and provide a current payment method. AWS uses the
     * payment method to charge for any billable (not free tier) AWS activity
     * that occurs while the account isn't attached to an organization. To
     * remove an account that doesn't yet have this information, you must sign
     * in as the member account and follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not
     * yet been provided</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </important>
     * 
     * @param removeAccountFromOrganizationRequest
     * @throws AccessDeniedException
     * @throws AccountNotFoundException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws MasterCannotLeaveOrganizationException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void removeAccountFromOrganization(
            RemoveAccountFromOrganizationRequest removeAccountFromOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeAccountFromOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAccountFromOrganizationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAccountFromOrganizationRequestMarshaller()
                        .marshall(removeAccountFromOrganizationRequest);
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
     * Adds one or more tags to the specified resource.
     * </p>
     * <p>
     * Currently, you can tag and untag accounts in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws AWSOrganizationsNotInUseException
     * @throws TargetNotFoundException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Removes a tag from the specified resource.
     * </p>
     * <p>
     * Currently, you can tag and untag accounts in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws AccessDeniedException
     * @throws ConcurrentModificationException
     * @throws AWSOrganizationsNotInUseException
     * @throws TargetNotFoundException
     * @throws ConstraintViolationException
     * @throws InvalidInputException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Renames the specified organizational unit (OU). The ID and ARN don't
     * change. The child OUs and accounts remain in place, and any attached
     * policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updateOrganizationalUnitRequest
     * @return updateOrganizationalUnitResult The response from the
     *         UpdateOrganizationalUnit service method, as returned by AWS
     *         Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws DuplicateOrganizationalUnitException
     * @throws InvalidInputException
     * @throws OrganizationalUnitNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateOrganizationalUnitResult updateOrganizationalUnit(
            UpdateOrganizationalUnitRequest updateOrganizationalUnitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationalUnitRequest> request = null;
        Response<UpdateOrganizationalUnitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationalUnitRequestMarshaller()
                        .marshall(updateOrganizationalUnitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateOrganizationalUnitResult, JsonUnmarshallerContext> unmarshaller = new UpdateOrganizationalUnitResultJsonUnmarshaller();
            JsonResponseHandler<UpdateOrganizationalUnitResult> responseHandler = new JsonResponseHandler<UpdateOrganizationalUnitResult>(
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
     * Updates an existing policy with a new name, description, or content. If
     * you don't supply any parameter, that value remains unchanged. You can't
     * change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updatePolicyRequest
     * @return updatePolicyResult The response from the UpdatePolicy service
     *         method, as returned by AWS Organizations.
     * @throws AccessDeniedException
     * @throws AWSOrganizationsNotInUseException
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws DuplicatePolicyException
     * @throws InvalidInputException
     * @throws MalformedPolicyDocumentException
     * @throws PolicyNotFoundException
     * @throws ServiceException
     * @throws TooManyRequestsException
     * @throws UnsupportedAPIEndpointException
     * @throws PolicyChangesInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Organizations indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdatePolicyResult updatePolicy(UpdatePolicyRequest updatePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePolicyRequest> request = null;
        Response<UpdatePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePolicyRequestMarshaller().marshall(updatePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePolicyResult, JsonUnmarshallerContext> unmarshaller = new UpdatePolicyResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePolicyResult> responseHandler = new JsonResponseHandler<UpdatePolicyResult>(
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
