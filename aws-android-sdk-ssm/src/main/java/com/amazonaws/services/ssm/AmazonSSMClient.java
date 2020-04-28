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

package com.amazonaws.services.ssm;

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

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.services.ssm.model.transform.*;

/**
 * Client for accessing Amazon Simple Systems Manager (SSM). All service calls
 * made using this client are blocking, and will not return until the service
 * call completes.
 * <p>
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate
 * management tasks such as collecting system inventory, applying operating
 * system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems
 * Manager lets you remotely and securely manage the configuration of your
 * managed instances. A <i>managed instance</i> is any Amazon Elastic Compute
 * Cloud instance (EC2 instance), or any on-premises server or virtual machine
 * (VM) in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS
 * Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html"
 * >Setting up AWS Systems Manager</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on EC2 instances, see
 * the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon
 * EC2 API Reference</a>. For information about how to use a Query API, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html"
 * >Making API requests</a>.
 * </p>
 */
public class AmazonSSMClient extends AmazonWebServiceClient implements AmazonSSM {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Simple Systems Manager
     * (SSM) exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonSSM. A
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
    public AmazonSSMClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM. A
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
     *            how this client connects to AmazonSSM (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSSMClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *         AmazonSSMClient client = new AmazonSSMClient(AWSMobileClient.getInstance());
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
    public AmazonSSMClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *         AmazonSSMClient client = new AmazonSSMClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSSM (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSSMClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *         AmazonSSMClient client = new AmazonSSMClient(AWSMobileClient.getInstance());
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
    public AmazonSSMClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *         AmazonSSMClient client = new AmazonSSMClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSSM (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *            how this client connects to AmazonSSM (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonSSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSSM using the
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
     *         AmazonSSMClient client = new AmazonSSMClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSSM (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonSSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociatedInstancesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationExecutionDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationVersionLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AutomationDefinitionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AutomationDefinitionVersionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AutomationExecutionLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AutomationExecutionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AutomationStepNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ComplianceTypeCountLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CustomSchemaCountLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentPermissionLimitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentVersionLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateDocumentContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateDocumentVersionNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateInstanceIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FeatureNotAvailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HierarchyLevelLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HierarchyTypeMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncompatiblePolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidActivationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidActivationIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAggregatorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAllowedPatternExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAssociationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAssociationVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutomationExecutionParametersExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutomationSignalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutomationStatusUpdateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCommandIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeleteInventoryParametersExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeletionIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentSchemaVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilterKeyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilterOptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceIdExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidInstanceInformationFilterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInventoryGroupExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInventoryItemContextExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInventoryRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidItemContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidKeyIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNotificationConfigExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOutputFolderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOutputLocationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParametersExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPermissionTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPluginNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPolicyAttributeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPolicyTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResultAttributeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRoleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidScheduleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTypeNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidUpdateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvocationDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ItemContentMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ItemSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaxDocumentSizeExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OpsItemAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OpsItemInvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OpsItemLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OpsItemNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterMaxVersionLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterPatternMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterVersionLabelLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ParameterVersionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PoliciesLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDataSyncAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDataSyncConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDataSyncCountExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDataSyncInvalidConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDataSyncNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceSettingNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new StatusUnchangedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SubTypeCountLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TargetNotConnectedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyUpdatesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TotalSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedCalendarExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedFeatureRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedInventoryItemContextExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedInventorySchemaVersionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperatingSystemExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedParameterTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedPlatformTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ssm.us-east-1.amazonaws.com");
        this.endpointPrefix = "ssm";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/ssm/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/ssm/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are
     * metadata that you can assign to your documents, managed instances,
     * maintenance windows, Parameter Store parameters, and patch baselines.
     * Tags enable you to categorize your resources in different ways, for
     * example, by purpose, owner, or environment. Each tag consists of a key
     * and an optional value, both of which you define. For example, you could
     * define a set of tags for your account's managed instances that helps you
     * track each instance's owner and stack level. For example: Key=Owner and
     * Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for
     * each resource type. Using a consistent set of tag keys makes it easier
     * for you to manage your resources. You can search and filter the resources
     * based on the tags you add. Tags don't have any semantic meaning to and
     * are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging your Amazon EC2 resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyTagsErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller()
                        .marshall(addTagsToResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddTagsToResourceResult, JsonUnmarshallerContext> unmarshaller = new AddTagsToResourceResultJsonUnmarshaller();
            JsonResponseHandler<AddTagsToResourceResult> responseHandler = new JsonResponseHandler<AddTagsToResourceResult>(
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
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @return cancelCommandResult The response from the CancelCommand service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws DuplicateInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCommandRequest> request = null;
        Response<CancelCommandResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCommandRequestMarshaller().marshall(cancelCommandRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelCommandResult, JsonUnmarshallerContext> unmarshaller = new CancelCommandResultJsonUnmarshaller();
            JsonResponseHandler<CancelCommandResult> responseHandler = new JsonResponseHandler<CancelCommandResult>(
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
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return cancelMaintenanceWindowExecutionResult The response from the
     *         CancelMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CancelMaintenanceWindowExecutionResult cancelMaintenanceWindowExecution(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelMaintenanceWindowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMaintenanceWindowExecutionRequest> request = null;
        Response<CancelMaintenanceWindowExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMaintenanceWindowExecutionRequestMarshaller()
                        .marshall(cancelMaintenanceWindowExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelMaintenanceWindowExecutionResult, JsonUnmarshallerContext> unmarshaller = new CancelMaintenanceWindowExecutionResultJsonUnmarshaller();
            JsonResponseHandler<CancelMaintenanceWindowExecutionResult> responseHandler = new JsonResponseHandler<CancelMaintenanceWindowExecutionResult>(
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
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting up AWS Systems Manager for hybrid environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return createActivationResult The response from the CreateActivation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateActivationResult createActivation(CreateActivationRequest createActivationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createActivationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActivationRequest> request = null;
        Response<CreateActivationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActivationRequestMarshaller().marshall(createActivationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateActivationResult, JsonUnmarshallerContext> unmarshaller = new CreateActivationResultJsonUnmarshaller();
            JsonResponseHandler<CreateActivationResult> responseHandler = new JsonResponseHandler<CreateActivationResult>(
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
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return createAssociationResult The response from the CreateAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws AssociationAlreadyExistsException
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidParametersException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateAssociationResult createAssociation(
            CreateAssociationRequest createAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationRequest> request = null;
        Response<CreateAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationRequestMarshaller()
                        .marshall(createAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssociationResult, JsonUnmarshallerContext> unmarshaller = new CreateAssociationResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssociationResult> responseHandler = new JsonResponseHandler<CreateAssociationResult>(
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
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return createAssociationBatchResult The response from the
     *         CreateAssociationBatch service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws InvalidParametersException
     * @throws DuplicateInstanceIdException
     * @throws AssociationLimitExceededException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAssociationBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationBatchRequest> request = null;
        Response<CreateAssociationBatchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationBatchRequestMarshaller()
                        .marshall(createAssociationBatchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssociationBatchResult, JsonUnmarshallerContext> unmarshaller = new CreateAssociationBatchResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssociationBatchResult> responseHandler = new JsonResponseHandler<CreateAssociationBatchResult>(
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
     * Creates a Systems Manager (SSM) document. An SSM document defines the
     * actions that Systems Manager performs on your managed instances. For more
     * information about SSM documents, including information about supported
     * schemas, features, and syntax, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html"
     * >AWS Systems Manager Documents</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @return createDocumentResult The response from the CreateDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentRequest> request = null;
        Response<CreateDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentRequestMarshaller().marshall(createDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDocumentResult, JsonUnmarshallerContext> unmarshaller = new CreateDocumentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDocumentResult> responseHandler = new JsonResponseHandler<CreateDocumentResult>(
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
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return createMaintenanceWindowResult The response from the
     *         CreateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateMaintenanceWindowResult createMaintenanceWindow(
            CreateMaintenanceWindowRequest createMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMaintenanceWindowRequest> request = null;
        Response<CreateMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMaintenanceWindowRequestMarshaller()
                        .marshall(createMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new CreateMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<CreateMaintenanceWindowResult> responseHandler = new JsonResponseHandler<CreateMaintenanceWindowResult>(
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
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return createOpsItemResult The response from the CreateOpsItem service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateOpsItemResult createOpsItem(CreateOpsItemRequest createOpsItemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createOpsItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOpsItemRequest> request = null;
        Response<CreateOpsItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOpsItemRequestMarshaller().marshall(createOpsItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateOpsItemResult, JsonUnmarshallerContext> unmarshaller = new CreateOpsItemResultJsonUnmarshaller();
            JsonResponseHandler<CreateOpsItemResult> responseHandler = new JsonResponseHandler<CreateOpsItemResult>(
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
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return createPatchBaselineResult The response from the
     *         CreatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreatePatchBaselineResult createPatchBaseline(
            CreatePatchBaselineRequest createPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePatchBaselineRequest> request = null;
        Response<CreatePatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePatchBaselineRequestMarshaller()
                        .marshall(createPatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new CreatePatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<CreatePatchBaselineResult> responseHandler = new JsonResponseHandler<CreatePatchBaselineResult>(
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
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single S3 bucket. This type can synchronize OpsItems and OpsData from
     * multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting up Systems Manager Explorer to display data from multiple
     * accounts and Regions</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns
     * immediately. After a successful initial sync is completed, the system
     * continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend
     * that you enable encryption in Amazon S3 to ensure secure data storage. We
     * also recommend that you secure access to the Amazon S3 bucket by creating
     * a restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @return createResourceDataSyncResult The response from the
     *         CreateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncCountExceededException
     * @throws ResourceDataSyncAlreadyExistsException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateResourceDataSyncResult createResourceDataSync(
            CreateResourceDataSyncRequest createResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceDataSyncRequest> request = null;
        Response<CreateResourceDataSyncResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceDataSyncRequestMarshaller()
                        .marshall(createResourceDataSyncRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateResourceDataSyncResult, JsonUnmarshallerContext> unmarshaller = new CreateResourceDataSyncResultJsonUnmarshaller();
            JsonResponseHandler<CreateResourceDataSyncResult> responseHandler = new JsonResponseHandler<CreateResourceDataSyncResult>(
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
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return deleteActivationResult The response from the DeleteActivation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InvalidActivationIdException
     * @throws InvalidActivationException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteActivationResult deleteActivation(DeleteActivationRequest deleteActivationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteActivationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActivationRequest> request = null;
        Response<DeleteActivationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActivationRequestMarshaller().marshall(deleteActivationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteActivationResult, JsonUnmarshallerContext> unmarshaller = new DeleteActivationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteActivationResult> responseHandler = new JsonResponseHandler<DeleteActivationResult>(
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
     * Disassociates the specified Systems Manager document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the
     * configuration of the instance. To change the configuration state of an
     * instance after you disassociate a document, you must create a new
     * document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return deleteAssociationResult The response from the DeleteAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteAssociationResult deleteAssociation(
            DeleteAssociationRequest deleteAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssociationRequest> request = null;
        Response<DeleteAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssociationRequestMarshaller()
                        .marshall(deleteAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAssociationResult, JsonUnmarshallerContext> unmarshaller = new DeleteAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAssociationResult> responseHandler = new JsonResponseHandler<DeleteAssociationResult>(
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
     * Deletes the Systems Manager document and all instance associations to the
     * document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use
     * <a>DeleteAssociation</a> to disassociate all instances that are
     * associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return deleteDocumentResult The response from the DeleteDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AssociatedInstancesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestMarshaller().marshall(deleteDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDocumentResult, JsonUnmarshallerContext> unmarshaller = new DeleteDocumentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDocumentResult> responseHandler = new JsonResponseHandler<DeleteDocumentResult>(
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
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return deleteInventoryResult The response from the DeleteInventory
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidOptionException
     * @throws InvalidDeleteInventoryParametersException
     * @throws InvalidInventoryRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteInventoryResult deleteInventory(DeleteInventoryRequest deleteInventoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInventoryRequest> request = null;
        Response<DeleteInventoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInventoryRequestMarshaller().marshall(deleteInventoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInventoryResult, JsonUnmarshallerContext> unmarshaller = new DeleteInventoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInventoryResult> responseHandler = new JsonResponseHandler<DeleteInventoryResult>(
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
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return deleteMaintenanceWindowResult The response from the
     *         DeleteMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteMaintenanceWindowResult deleteMaintenanceWindow(
            DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMaintenanceWindowRequest> request = null;
        Response<DeleteMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMaintenanceWindowRequestMarshaller()
                        .marshall(deleteMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new DeleteMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMaintenanceWindowResult> responseHandler = new JsonResponseHandler<DeleteMaintenanceWindowResult>(
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
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return deleteParameterResult The response from the DeleteParameter
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteParameterResult deleteParameter(DeleteParameterRequest deleteParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteParameterRequest> request = null;
        Response<DeleteParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteParameterRequestMarshaller().marshall(deleteParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteParameterResult, JsonUnmarshallerContext> unmarshaller = new DeleteParameterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteParameterResult> responseHandler = new JsonResponseHandler<DeleteParameterResult>(
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
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return deleteParametersResult The response from the DeleteParameters
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteParametersResult deleteParameters(DeleteParametersRequest deleteParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteParametersRequest> request = null;
        Response<DeleteParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteParametersRequestMarshaller().marshall(deleteParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteParametersResult, JsonUnmarshallerContext> unmarshaller = new DeleteParametersResultJsonUnmarshaller();
            JsonResponseHandler<DeleteParametersResult> responseHandler = new JsonResponseHandler<DeleteParametersResult>(
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
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return deletePatchBaselineResult The response from the
     *         DeletePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeletePatchBaselineResult deletePatchBaseline(
            DeletePatchBaselineRequest deletePatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePatchBaselineRequest> request = null;
        Response<DeletePatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePatchBaselineRequestMarshaller()
                        .marshall(deletePatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new DeletePatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<DeletePatchBaselineResult> responseHandler = new JsonResponseHandler<DeletePatchBaselineResult>(
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
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return deleteResourceDataSyncResult The response from the
     *         DeleteResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteResourceDataSyncResult deleteResourceDataSync(
            DeleteResourceDataSyncRequest deleteResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceDataSyncRequest> request = null;
        Response<DeleteResourceDataSyncResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceDataSyncRequestMarshaller()
                        .marshall(deleteResourceDataSyncRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourceDataSyncResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourceDataSyncResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourceDataSyncResult> responseHandler = new JsonResponseHandler<DeleteResourceDataSyncResult>(
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
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return deregisterManagedInstanceResult The response from the
     *         DeregisterManagedInstance service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeregisterManagedInstanceResult deregisterManagedInstance(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterManagedInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterManagedInstanceRequest> request = null;
        Response<DeregisterManagedInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterManagedInstanceRequestMarshaller()
                        .marshall(deregisterManagedInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterManagedInstanceResult, JsonUnmarshallerContext> unmarshaller = new DeregisterManagedInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterManagedInstanceResult> responseHandler = new JsonResponseHandler<DeregisterManagedInstanceResult>(
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
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return deregisterPatchBaselineForPatchGroupResult The response from the
     *         DeregisterPatchBaselineForPatchGroup service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeregisterPatchBaselineForPatchGroupResult deregisterPatchBaselineForPatchGroup(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterPatchBaselineForPatchGroupRequest> request = null;
        Response<DeregisterPatchBaselineForPatchGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterPatchBaselineForPatchGroupRequestMarshaller()
                        .marshall(deregisterPatchBaselineForPatchGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterPatchBaselineForPatchGroupResult, JsonUnmarshallerContext> unmarshaller = new DeregisterPatchBaselineForPatchGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterPatchBaselineForPatchGroupResult> responseHandler = new JsonResponseHandler<DeregisterPatchBaselineForPatchGroupResult>(
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
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return deregisterTargetFromMaintenanceWindowResult The response from the
     *         DeregisterTargetFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws TargetInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeregisterTargetFromMaintenanceWindowResult deregisterTargetFromMaintenanceWindow(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterTargetFromMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTargetFromMaintenanceWindowRequest> request = null;
        Response<DeregisterTargetFromMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTargetFromMaintenanceWindowRequestMarshaller()
                        .marshall(deregisterTargetFromMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterTargetFromMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new DeregisterTargetFromMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterTargetFromMaintenanceWindowResult> responseHandler = new JsonResponseHandler<DeregisterTargetFromMaintenanceWindowResult>(
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
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return deregisterTaskFromMaintenanceWindowResult The response from the
     *         DeregisterTaskFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeregisterTaskFromMaintenanceWindowResult deregisterTaskFromMaintenanceWindow(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterTaskFromMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTaskFromMaintenanceWindowRequest> request = null;
        Response<DeregisterTaskFromMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTaskFromMaintenanceWindowRequestMarshaller()
                        .marshall(deregisterTaskFromMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterTaskFromMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new DeregisterTaskFromMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterTaskFromMaintenanceWindowResult> responseHandler = new JsonResponseHandler<DeregisterTaskFromMaintenanceWindowResult>(
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
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return describeActivationsResult The response from the
     *         DescribeActivations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeActivationsResult describeActivations(
            DescribeActivationsRequest describeActivationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeActivationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivationsRequest> request = null;
        Response<DescribeActivationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivationsRequestMarshaller()
                        .marshall(describeActivationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeActivationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeActivationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeActivationsResult> responseHandler = new JsonResponseHandler<DescribeActivationsResult>(
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
     * Describes the association for the specified target or instance. If you
     * created the association by using the <code>Targets</code> parameter, then
     * you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems
     * Manager document, then you retrieve the association by specifying the
     * document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return describeAssociationResult The response from the
     *         DescribeAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InvalidAssociationVersionException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationRequest> request = null;
        Response<DescribeAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationRequestMarshaller()
                        .marshall(describeAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssociationResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssociationResult> responseHandler = new JsonResponseHandler<DescribeAssociationResult>(
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
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return describeAssociationExecutionTargetsResult The response from the
     *         DescribeAssociationExecutionTargets service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AssociationExecutionDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAssociationExecutionTargetsResult describeAssociationExecutionTargets(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssociationExecutionTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationExecutionTargetsRequest> request = null;
        Response<DescribeAssociationExecutionTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationExecutionTargetsRequestMarshaller()
                        .marshall(describeAssociationExecutionTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssociationExecutionTargetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssociationExecutionTargetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssociationExecutionTargetsResult> responseHandler = new JsonResponseHandler<DescribeAssociationExecutionTargetsResult>(
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
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return describeAssociationExecutionsResult The response from the
     *         DescribeAssociationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAssociationExecutionsResult describeAssociationExecutions(
            DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssociationExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationExecutionsRequest> request = null;
        Response<DescribeAssociationExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationExecutionsRequestMarshaller()
                        .marshall(describeAssociationExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssociationExecutionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssociationExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssociationExecutionsResult> responseHandler = new JsonResponseHandler<DescribeAssociationExecutionsResult>(
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
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return describeAutomationExecutionsResult The response from the
     *         DescribeAutomationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAutomationExecutionsResult describeAutomationExecutions(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutomationExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutomationExecutionsRequest> request = null;
        Response<DescribeAutomationExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutomationExecutionsRequestMarshaller()
                        .marshall(describeAutomationExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAutomationExecutionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAutomationExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAutomationExecutionsResult> responseHandler = new JsonResponseHandler<DescribeAutomationExecutionsResult>(
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
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return describeAutomationStepExecutionsResult The response from the
     *         DescribeAutomationStepExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAutomationStepExecutionsResult describeAutomationStepExecutions(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutomationStepExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutomationStepExecutionsRequest> request = null;
        Response<DescribeAutomationStepExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutomationStepExecutionsRequestMarshaller()
                        .marshall(describeAutomationStepExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAutomationStepExecutionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAutomationStepExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAutomationStepExecutionsResult> responseHandler = new JsonResponseHandler<DescribeAutomationStepExecutionsResult>(
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
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return describeAvailablePatchesResult The response from the
     *         DescribeAvailablePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAvailablePatchesResult describeAvailablePatches(
            DescribeAvailablePatchesRequest describeAvailablePatchesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAvailablePatchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailablePatchesRequest> request = null;
        Response<DescribeAvailablePatchesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailablePatchesRequestMarshaller()
                        .marshall(describeAvailablePatchesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAvailablePatchesResult, JsonUnmarshallerContext> unmarshaller = new DescribeAvailablePatchesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAvailablePatchesResult> responseHandler = new JsonResponseHandler<DescribeAvailablePatchesResult>(
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
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return describeDocumentResult The response from the DescribeDocument
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentRequest> request = null;
        Response<DescribeDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentRequestMarshaller().marshall(describeDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDocumentResult, JsonUnmarshallerContext> unmarshaller = new DescribeDocumentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDocumentResult> responseHandler = new JsonResponseHandler<DescribeDocumentResult>(
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
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return describeDocumentPermissionResult The response from the
     *         DescribeDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDocumentPermissionResult describeDocumentPermission(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentPermissionRequest> request = null;
        Response<DescribeDocumentPermissionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentPermissionRequestMarshaller()
                        .marshall(describeDocumentPermissionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDocumentPermissionResult, JsonUnmarshallerContext> unmarshaller = new DescribeDocumentPermissionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDocumentPermissionResult> responseHandler = new JsonResponseHandler<DescribeDocumentPermissionResult>(
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
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return describeEffectiveInstanceAssociationsResult The response from the
     *         DescribeEffectiveInstanceAssociations service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEffectiveInstanceAssociationsResult describeEffectiveInstanceAssociations(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEffectiveInstanceAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectiveInstanceAssociationsRequest> request = null;
        Response<DescribeEffectiveInstanceAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectiveInstanceAssociationsRequestMarshaller()
                        .marshall(describeEffectiveInstanceAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEffectiveInstanceAssociationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEffectiveInstanceAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEffectiveInstanceAssociationsResult> responseHandler = new JsonResponseHandler<DescribeEffectiveInstanceAssociationsResult>(
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
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return describeEffectivePatchesForPatchBaselineResult The response from
     *         the DescribeEffectivePatchesForPatchBaseline service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws UnsupportedOperatingSystemException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEffectivePatchesForPatchBaselineResult describeEffectivePatchesForPatchBaseline(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEffectivePatchesForPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectivePatchesForPatchBaselineRequest> request = null;
        Response<DescribeEffectivePatchesForPatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectivePatchesForPatchBaselineRequestMarshaller()
                        .marshall(describeEffectivePatchesForPatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEffectivePatchesForPatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new DescribeEffectivePatchesForPatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEffectivePatchesForPatchBaselineResult> responseHandler = new JsonResponseHandler<DescribeEffectivePatchesForPatchBaselineResult>(
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
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return describeInstanceAssociationsStatusResult The response from the
     *         DescribeInstanceAssociationsStatus service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstanceAssociationsStatusResult describeInstanceAssociationsStatus(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstanceAssociationsStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceAssociationsStatusRequest> request = null;
        Response<DescribeInstanceAssociationsStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceAssociationsStatusRequestMarshaller()
                        .marshall(describeInstanceAssociationsStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstanceAssociationsStatusResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstanceAssociationsStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstanceAssociationsStatusResult> responseHandler = new JsonResponseHandler<DescribeInstanceAssociationsStatusResult>(
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
     * Describes one or more of your instances, including information about the
     * operating system platform, the version of SSM Agent installed on the
     * instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those
     * instances. If you do not specify instance IDs, it returns information for
     * all your instances. If you specify an instance ID that is not valid or an
     * instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return describeInstanceInformationResult The response from the
     *         DescribeInstanceInformation service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws InvalidInstanceInformationFilterValueException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstanceInformationResult describeInstanceInformation(
            DescribeInstanceInformationRequest describeInstanceInformationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstanceInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceInformationRequest> request = null;
        Response<DescribeInstanceInformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceInformationRequestMarshaller()
                        .marshall(describeInstanceInformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstanceInformationResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstanceInformationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstanceInformationResult> responseHandler = new JsonResponseHandler<DescribeInstanceInformationResult>(
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
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return describeInstancePatchStatesResult The response from the
     *         DescribeInstancePatchStates service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstancePatchStatesResult describeInstancePatchStates(
            DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstancePatchStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchStatesRequest> request = null;
        Response<DescribeInstancePatchStatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchStatesRequestMarshaller()
                        .marshall(describeInstancePatchStatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstancePatchStatesResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstancePatchStatesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstancePatchStatesResult> responseHandler = new JsonResponseHandler<DescribeInstancePatchStatesResult>(
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
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return describeInstancePatchStatesForPatchGroupResult The response from
     *         the DescribeInstancePatchStatesForPatchGroup service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstancePatchStatesForPatchGroupResult describeInstancePatchStatesForPatchGroup(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstancePatchStatesForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchStatesForPatchGroupRequest> request = null;
        Response<DescribeInstancePatchStatesForPatchGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchStatesForPatchGroupRequestMarshaller()
                        .marshall(describeInstancePatchStatesForPatchGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstancePatchStatesForPatchGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstancePatchStatesForPatchGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstancePatchStatesForPatchGroupResult> responseHandler = new JsonResponseHandler<DescribeInstancePatchStatesForPatchGroupResult>(
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
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return describeInstancePatchesResult The response from the
     *         DescribeInstancePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstancePatchesResult describeInstancePatches(
            DescribeInstancePatchesRequest describeInstancePatchesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstancePatchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchesRequest> request = null;
        Response<DescribeInstancePatchesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchesRequestMarshaller()
                        .marshall(describeInstancePatchesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstancePatchesResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstancePatchesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstancePatchesResult> responseHandler = new JsonResponseHandler<DescribeInstancePatchesResult>(
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
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return describeInventoryDeletionsResult The response from the
     *         DescribeInventoryDeletions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDeletionIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInventoryDeletionsResult describeInventoryDeletions(
            DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInventoryDeletionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInventoryDeletionsRequest> request = null;
        Response<DescribeInventoryDeletionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInventoryDeletionsRequestMarshaller()
                        .marshall(describeInventoryDeletionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInventoryDeletionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeInventoryDeletionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInventoryDeletionsResult> responseHandler = new JsonResponseHandler<DescribeInventoryDeletionsResult>(
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
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return describeMaintenanceWindowExecutionTaskInvocationsResult The
     *         response from the
     *         DescribeMaintenanceWindowExecutionTaskInvocations service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult describeMaintenanceWindowExecutionTaskInvocations(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionTaskInvocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionTaskInvocationsRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionTaskInvocationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionTaskInvocationsRequestMarshaller()
                        .marshall(describeMaintenanceWindowExecutionTaskInvocationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowExecutionTaskInvocationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowExecutionTaskInvocationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowExecutionTaskInvocationsResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowExecutionTaskInvocationsResult>(
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
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return describeMaintenanceWindowExecutionTasksResult The response from
     *         the DescribeMaintenanceWindowExecutionTasks service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowExecutionTasksResult describeMaintenanceWindowExecutionTasks(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionTasksRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionTasksRequestMarshaller()
                        .marshall(describeMaintenanceWindowExecutionTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowExecutionTasksResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowExecutionTasksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowExecutionTasksResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowExecutionTasksResult>(
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
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return describeMaintenanceWindowExecutionsResult The response from the
     *         DescribeMaintenanceWindowExecutions service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowExecutionsResult describeMaintenanceWindowExecutions(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionsRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionsRequestMarshaller()
                        .marshall(describeMaintenanceWindowExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowExecutionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowExecutionsResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowExecutionsResult>(
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
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return describeMaintenanceWindowScheduleResult The response from the
     *         DescribeMaintenanceWindowSchedule service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowScheduleResult describeMaintenanceWindowSchedule(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowScheduleRequest> request = null;
        Response<DescribeMaintenanceWindowScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowScheduleRequestMarshaller()
                        .marshall(describeMaintenanceWindowScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowScheduleResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowScheduleResult>(
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
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return describeMaintenanceWindowTargetsResult The response from the
     *         DescribeMaintenanceWindowTargets service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowTargetsResult describeMaintenanceWindowTargets(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowTargetsRequest> request = null;
        Response<DescribeMaintenanceWindowTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowTargetsRequestMarshaller()
                        .marshall(describeMaintenanceWindowTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowTargetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowTargetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowTargetsResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowTargetsResult>(
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
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return describeMaintenanceWindowTasksResult The response from the
     *         DescribeMaintenanceWindowTasks service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowTasksResult describeMaintenanceWindowTasks(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowTasksRequest> request = null;
        Response<DescribeMaintenanceWindowTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowTasksRequestMarshaller()
                        .marshall(describeMaintenanceWindowTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowTasksResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowTasksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowTasksResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowTasksResult>(
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
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return describeMaintenanceWindowsResult The response from the
     *         DescribeMaintenanceWindows service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowsResult describeMaintenanceWindows(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowsRequest> request = null;
        Response<DescribeMaintenanceWindowsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowsRequestMarshaller()
                        .marshall(describeMaintenanceWindowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowsResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowsResult>(
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
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return describeMaintenanceWindowsForTargetResult The response from the
     *         DescribeMaintenanceWindowsForTarget service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeMaintenanceWindowsForTargetResult describeMaintenanceWindowsForTarget(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowsForTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowsForTargetRequest> request = null;
        Response<DescribeMaintenanceWindowsForTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowsForTargetRequestMarshaller()
                        .marshall(describeMaintenanceWindowsForTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceWindowsForTargetResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceWindowsForTargetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceWindowsForTargetResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceWindowsForTargetResult>(
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
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return describeOpsItemsResult The response from the DescribeOpsItems
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeOpsItemsResult describeOpsItems(DescribeOpsItemsRequest describeOpsItemsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOpsItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOpsItemsRequest> request = null;
        Response<DescribeOpsItemsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOpsItemsRequestMarshaller().marshall(describeOpsItemsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOpsItemsResult, JsonUnmarshallerContext> unmarshaller = new DescribeOpsItemsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOpsItemsResult> responseHandler = new JsonResponseHandler<DescribeOpsItemsResult>(
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
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @return describeParametersResult The response from the DescribeParameters
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeParametersResult describeParameters(
            DescribeParametersRequest describeParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeParametersRequest> request = null;
        Response<DescribeParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeParametersRequestMarshaller()
                        .marshall(describeParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeParametersResult, JsonUnmarshallerContext> unmarshaller = new DescribeParametersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeParametersResult> responseHandler = new JsonResponseHandler<DescribeParametersResult>(
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
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return describePatchBaselinesResult The response from the
     *         DescribePatchBaselines service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePatchBaselinesResult describePatchBaselines(
            DescribePatchBaselinesRequest describePatchBaselinesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePatchBaselinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchBaselinesRequest> request = null;
        Response<DescribePatchBaselinesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchBaselinesRequestMarshaller()
                        .marshall(describePatchBaselinesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePatchBaselinesResult, JsonUnmarshallerContext> unmarshaller = new DescribePatchBaselinesResultJsonUnmarshaller();
            JsonResponseHandler<DescribePatchBaselinesResult> responseHandler = new JsonResponseHandler<DescribePatchBaselinesResult>(
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
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return describePatchGroupStateResult The response from the
     *         DescribePatchGroupState service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePatchGroupStateResult describePatchGroupState(
            DescribePatchGroupStateRequest describePatchGroupStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePatchGroupStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchGroupStateRequest> request = null;
        Response<DescribePatchGroupStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchGroupStateRequestMarshaller()
                        .marshall(describePatchGroupStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePatchGroupStateResult, JsonUnmarshallerContext> unmarshaller = new DescribePatchGroupStateResultJsonUnmarshaller();
            JsonResponseHandler<DescribePatchGroupStateResult> responseHandler = new JsonResponseHandler<DescribePatchGroupStateResult>(
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
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return describePatchGroupsResult The response from the
     *         DescribePatchGroups service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePatchGroupsResult describePatchGroups(
            DescribePatchGroupsRequest describePatchGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePatchGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchGroupsRequest> request = null;
        Response<DescribePatchGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchGroupsRequestMarshaller()
                        .marshall(describePatchGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePatchGroupsResult, JsonUnmarshallerContext> unmarshaller = new DescribePatchGroupsResultJsonUnmarshaller();
            JsonResponseHandler<DescribePatchGroupsResult> responseHandler = new JsonResponseHandler<DescribePatchGroupsResult>(
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
     * Lists the properties of available patches organized by product, product
     * family, classification, severity, and other properties of available
     * patches. You can use the reported properties in the filters you specify
     * in requests for actions such as <a>CreatePatchBaseline</a>,
     * <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters
     * for each major operating system type:
     * </p>
     * <dl>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return describePatchPropertiesResult The response from the
     *         DescribePatchProperties service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePatchPropertiesResult describePatchProperties(
            DescribePatchPropertiesRequest describePatchPropertiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePatchPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchPropertiesRequest> request = null;
        Response<DescribePatchPropertiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchPropertiesRequestMarshaller()
                        .marshall(describePatchPropertiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePatchPropertiesResult, JsonUnmarshallerContext> unmarshaller = new DescribePatchPropertiesResultJsonUnmarshaller();
            JsonResponseHandler<DescribePatchPropertiesResult> responseHandler = new JsonResponseHandler<DescribePatchPropertiesResult>(
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
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return describeSessionsResult The response from the DescribeSessions
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSessionsRequest> request = null;
        Response<DescribeSessionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSessionsRequestMarshaller().marshall(describeSessionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSessionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeSessionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSessionsResult> responseHandler = new JsonResponseHandler<DescribeSessionsResult>(
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
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return getAutomationExecutionResult The response from the
     *         GetAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetAutomationExecutionResult getAutomationExecution(
            GetAutomationExecutionRequest getAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutomationExecutionRequest> request = null;
        Response<GetAutomationExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutomationExecutionRequestMarshaller()
                        .marshall(getAutomationExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAutomationExecutionResult, JsonUnmarshallerContext> unmarshaller = new GetAutomationExecutionResultJsonUnmarshaller();
            JsonResponseHandler<GetAutomationExecutionResult> responseHandler = new JsonResponseHandler<GetAutomationExecutionResult>(
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
     * Gets the state of the AWS Systems Manager Change Calendar at an optional,
     * specified time. If you specify a time, <code>GetCalendarState</code>
     * returns the state of the calendar at a specific time, and returns the
     * next time that the Change Calendar state will transition. If you do not
     * specify a time, <code>GetCalendarState</code> assumes the current time.
     * Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>. For more information about Systems Manager Change
     * Calendar, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html"
     * >AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return getCalendarStateResult The response from the GetCalendarState
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentTypeException
     * @throws UnsupportedCalendarException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetCalendarStateResult getCalendarState(GetCalendarStateRequest getCalendarStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCalendarStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCalendarStateRequest> request = null;
        Response<GetCalendarStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCalendarStateRequestMarshaller().marshall(getCalendarStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCalendarStateResult, JsonUnmarshallerContext> unmarshaller = new GetCalendarStateResultJsonUnmarshaller();
            JsonResponseHandler<GetCalendarStateResult> responseHandler = new JsonResponseHandler<GetCalendarStateResult>(
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
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return getCommandInvocationResult The response from the
     *         GetCommandInvocation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidPluginNameException
     * @throws InvocationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetCommandInvocationResult getCommandInvocation(
            GetCommandInvocationRequest getCommandInvocationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCommandInvocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommandInvocationRequest> request = null;
        Response<GetCommandInvocationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommandInvocationRequestMarshaller()
                        .marshall(getCommandInvocationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCommandInvocationResult, JsonUnmarshallerContext> unmarshaller = new GetCommandInvocationResultJsonUnmarshaller();
            JsonResponseHandler<GetCommandInvocationResult> responseHandler = new JsonResponseHandler<GetCommandInvocationResult>(
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
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is running and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return getConnectionStatusResult The response from the
     *         GetConnectionStatus service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetConnectionStatusResult getConnectionStatus(
            GetConnectionStatusRequest getConnectionStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getConnectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionStatusRequest> request = null;
        Response<GetConnectionStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionStatusRequestMarshaller()
                        .marshall(getConnectionStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetConnectionStatusResult, JsonUnmarshallerContext> unmarshaller = new GetConnectionStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetConnectionStatusResult> responseHandler = new JsonResponseHandler<GetConnectionStatusResult>(
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
     * Retrieves the default patch baseline. Note that Systems Manager supports
     * creating multiple default patch baselines. For example, you can create a
     * default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch
     * baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return getDefaultPatchBaselineResult The response from the
     *         GetDefaultPatchBaseline service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetDefaultPatchBaselineResult getDefaultPatchBaseline(
            GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDefaultPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultPatchBaselineRequest> request = null;
        Response<GetDefaultPatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultPatchBaselineRequestMarshaller()
                        .marshall(getDefaultPatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDefaultPatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new GetDefaultPatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<GetDefaultPatchBaselineResult> responseHandler = new JsonResponseHandler<GetDefaultPatchBaselineResult>(
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
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return getDeployablePatchSnapshotForInstanceResult The response from the
     *         GetDeployablePatchSnapshotForInstance service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws UnsupportedOperatingSystemException
     * @throws UnsupportedFeatureRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeployablePatchSnapshotForInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeployablePatchSnapshotForInstanceRequest> request = null;
        Response<GetDeployablePatchSnapshotForInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeployablePatchSnapshotForInstanceRequestMarshaller()
                        .marshall(getDeployablePatchSnapshotForInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeployablePatchSnapshotForInstanceResult, JsonUnmarshallerContext> unmarshaller = new GetDeployablePatchSnapshotForInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetDeployablePatchSnapshotForInstanceResult> responseHandler = new JsonResponseHandler<GetDeployablePatchSnapshotForInstanceResult>(
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
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return getDocumentResult The response from the GetDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestMarshaller().marshall(getDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentResult, JsonUnmarshallerContext> unmarshaller = new GetDocumentResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentResult> responseHandler = new JsonResponseHandler<GetDocumentResult>(
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
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return getInventoryResult The response from the GetInventory service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidInventoryGroupException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws InvalidResultAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetInventoryResult getInventory(GetInventoryRequest getInventoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInventoryRequest> request = null;
        Response<GetInventoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInventoryRequestMarshaller().marshall(getInventoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInventoryResult, JsonUnmarshallerContext> unmarshaller = new GetInventoryResultJsonUnmarshaller();
            JsonResponseHandler<GetInventoryResult> responseHandler = new JsonResponseHandler<GetInventoryResult>(
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
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return getInventorySchemaResult The response from the GetInventorySchema
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetInventorySchemaResult getInventorySchema(
            GetInventorySchemaRequest getInventorySchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInventorySchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInventorySchemaRequest> request = null;
        Response<GetInventorySchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInventorySchemaRequestMarshaller()
                        .marshall(getInventorySchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInventorySchemaResult, JsonUnmarshallerContext> unmarshaller = new GetInventorySchemaResultJsonUnmarshaller();
            JsonResponseHandler<GetInventorySchemaResult> responseHandler = new JsonResponseHandler<GetInventorySchemaResult>(
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
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return getMaintenanceWindowResult The response from the
     *         GetMaintenanceWindow service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetMaintenanceWindowResult getMaintenanceWindow(
            GetMaintenanceWindowRequest getMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowRequest> request = null;
        Response<GetMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowRequestMarshaller()
                        .marshall(getMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new GetMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<GetMaintenanceWindowResult> responseHandler = new JsonResponseHandler<GetMaintenanceWindowResult>(
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
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return getMaintenanceWindowExecutionResult The response from the
     *         GetMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionRequest> request = null;
        Response<GetMaintenanceWindowExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionRequestMarshaller()
                        .marshall(getMaintenanceWindowExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMaintenanceWindowExecutionResult, JsonUnmarshallerContext> unmarshaller = new GetMaintenanceWindowExecutionResultJsonUnmarshaller();
            JsonResponseHandler<GetMaintenanceWindowExecutionResult> responseHandler = new JsonResponseHandler<GetMaintenanceWindowExecutionResult>(
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
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return getMaintenanceWindowExecutionTaskResult The response from the
     *         GetMaintenanceWindowExecutionTask service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionTaskRequest> request = null;
        Response<GetMaintenanceWindowExecutionTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionTaskRequestMarshaller()
                        .marshall(getMaintenanceWindowExecutionTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMaintenanceWindowExecutionTaskResult, JsonUnmarshallerContext> unmarshaller = new GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller();
            JsonResponseHandler<GetMaintenanceWindowExecutionTaskResult> responseHandler = new JsonResponseHandler<GetMaintenanceWindowExecutionTaskResult>(
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
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return getMaintenanceWindowExecutionTaskInvocationResult The response
     *         from the GetMaintenanceWindowExecutionTaskInvocation service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocation(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionTaskInvocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionTaskInvocationRequest> request = null;
        Response<GetMaintenanceWindowExecutionTaskInvocationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionTaskInvocationRequestMarshaller()
                        .marshall(getMaintenanceWindowExecutionTaskInvocationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMaintenanceWindowExecutionTaskInvocationResult, JsonUnmarshallerContext> unmarshaller = new GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller();
            JsonResponseHandler<GetMaintenanceWindowExecutionTaskInvocationResult> responseHandler = new JsonResponseHandler<GetMaintenanceWindowExecutionTaskInvocationResult>(
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
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return getMaintenanceWindowTaskResult The response from the
     *         GetMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetMaintenanceWindowTaskResult getMaintenanceWindowTask(
            GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowTaskRequest> request = null;
        Response<GetMaintenanceWindowTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowTaskRequestMarshaller()
                        .marshall(getMaintenanceWindowTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMaintenanceWindowTaskResult, JsonUnmarshallerContext> unmarshaller = new GetMaintenanceWindowTaskResultJsonUnmarshaller();
            JsonResponseHandler<GetMaintenanceWindowTaskResult> responseHandler = new JsonResponseHandler<GetMaintenanceWindowTaskResult>(
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
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return getOpsItemResult The response from the GetOpsItem service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetOpsItemResult getOpsItem(GetOpsItemRequest getOpsItemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOpsItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpsItemRequest> request = null;
        Response<GetOpsItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpsItemRequestMarshaller().marshall(getOpsItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOpsItemResult, JsonUnmarshallerContext> unmarshaller = new GetOpsItemResultJsonUnmarshaller();
            JsonResponseHandler<GetOpsItemResult> responseHandler = new JsonResponseHandler<GetOpsItemResult>(
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
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return getOpsSummaryResult The response from the GetOpsSummary service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetOpsSummaryResult getOpsSummary(GetOpsSummaryRequest getOpsSummaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOpsSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpsSummaryRequest> request = null;
        Response<GetOpsSummaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpsSummaryRequestMarshaller().marshall(getOpsSummaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOpsSummaryResult, JsonUnmarshallerContext> unmarshaller = new GetOpsSummaryResultJsonUnmarshaller();
            JsonResponseHandler<GetOpsSummaryResult> responseHandler = new JsonResponseHandler<GetOpsSummaryResult>(
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
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return getParameterResult The response from the GetParameter service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetParameterResult getParameter(GetParameterRequest getParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParameterRequest> request = null;
        Response<GetParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParameterRequestMarshaller().marshall(getParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetParameterResult, JsonUnmarshallerContext> unmarshaller = new GetParameterResultJsonUnmarshaller();
            JsonResponseHandler<GetParameterResult> responseHandler = new JsonResponseHandler<GetParameterResult>(
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
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return getParameterHistoryResult The response from the
     *         GetParameterHistory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidKeyIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetParameterHistoryResult getParameterHistory(
            GetParameterHistoryRequest getParameterHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getParameterHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParameterHistoryRequest> request = null;
        Response<GetParameterHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParameterHistoryRequestMarshaller()
                        .marshall(getParameterHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetParameterHistoryResult, JsonUnmarshallerContext> unmarshaller = new GetParameterHistoryResultJsonUnmarshaller();
            JsonResponseHandler<GetParameterHistoryResult> responseHandler = new JsonResponseHandler<GetParameterHistoryResult>(
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
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return getParametersResult The response from the GetParameters service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidKeyIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetParametersResult getParameters(GetParametersRequest getParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersRequest> request = null;
        Response<GetParametersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersRequestMarshaller().marshall(getParametersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetParametersResult, JsonUnmarshallerContext> unmarshaller = new GetParametersResultJsonUnmarshaller();
            JsonResponseHandler<GetParametersResult> responseHandler = new JsonResponseHandler<GetParametersResult>(
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
     * Retrieve information about one or more parameters in a specific
     * hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return getParametersByPathResult The response from the
     *         GetParametersByPath service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidKeyIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetParametersByPathResult getParametersByPath(
            GetParametersByPathRequest getParametersByPathRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getParametersByPathRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersByPathRequest> request = null;
        Response<GetParametersByPathResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersByPathRequestMarshaller()
                        .marshall(getParametersByPathRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetParametersByPathResult, JsonUnmarshallerContext> unmarshaller = new GetParametersByPathResultJsonUnmarshaller();
            JsonResponseHandler<GetParametersByPathResult> responseHandler = new JsonResponseHandler<GetParametersByPathResult>(
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
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return getPatchBaselineResult The response from the GetPatchBaseline
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetPatchBaselineResult getPatchBaseline(GetPatchBaselineRequest getPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPatchBaselineRequest> request = null;
        Response<GetPatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPatchBaselineRequestMarshaller().marshall(getPatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new GetPatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<GetPatchBaselineResult> responseHandler = new JsonResponseHandler<GetPatchBaselineResult>(
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
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return getPatchBaselineForPatchGroupResult The response from the
     *         GetPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetPatchBaselineForPatchGroupResult getPatchBaselineForPatchGroup(
            GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPatchBaselineForPatchGroupRequest> request = null;
        Response<GetPatchBaselineForPatchGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPatchBaselineForPatchGroupRequestMarshaller()
                        .marshall(getPatchBaselineForPatchGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPatchBaselineForPatchGroupResult, JsonUnmarshallerContext> unmarshaller = new GetPatchBaselineForPatchGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetPatchBaselineForPatchGroupResult> responseHandler = new JsonResponseHandler<GetPatchBaselineForPatchGroupResult>(
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
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>UpdateServiceSetting</a> API
     * action to change the default setting. Or use the
     * <a>ResetServiceSetting</a> to change the value back to the original value
     * defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest <p>
     *            The request body of the GetServiceSetting API action.
     *            </p>
     * @return getServiceSettingResult The response from the GetServiceSetting
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetServiceSettingResult getServiceSetting(
            GetServiceSettingRequest getServiceSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceSettingRequest> request = null;
        Response<GetServiceSettingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceSettingRequestMarshaller()
                        .marshall(getServiceSettingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetServiceSettingResult, JsonUnmarshallerContext> unmarshaller = new GetServiceSettingResultJsonUnmarshaller();
            JsonResponseHandler<GetServiceSettingResult> responseHandler = new JsonResponseHandler<GetServiceSettingResult>(
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
     * A parameter label is a user-defined alias to help you manage different
     * versions of a parameter. When you modify a parameter, Systems Manager
     * automatically saves a new version and increments the version number by
     * one. A label can help you remember the purpose of a parameter when there
     * are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same
     * parameter. For example, if version 1 has the label Production, then you
     * can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach
     * a label to a specific version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a
     * parameter label, then you must move it to a different version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.),
     * hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive).
     * If a label fails to meet these requirements, then the label is not
     * associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return labelParameterVersionResult The response from the
     *         LabelParameterVersion service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws ParameterVersionLabelLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public LabelParameterVersionResult labelParameterVersion(
            LabelParameterVersionRequest labelParameterVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(labelParameterVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LabelParameterVersionRequest> request = null;
        Response<LabelParameterVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LabelParameterVersionRequestMarshaller()
                        .marshall(labelParameterVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<LabelParameterVersionResult, JsonUnmarshallerContext> unmarshaller = new LabelParameterVersionResultJsonUnmarshaller();
            JsonResponseHandler<LabelParameterVersionResult> responseHandler = new JsonResponseHandler<LabelParameterVersionResult>(
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
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return listAssociationVersionsResult The response from the
     *         ListAssociationVersions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListAssociationVersionsResult listAssociationVersions(
            ListAssociationVersionsRequest listAssociationVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssociationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationVersionsRequest> request = null;
        Response<ListAssociationVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationVersionsRequestMarshaller()
                        .marshall(listAssociationVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssociationVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListAssociationVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssociationVersionsResult> responseHandler = new JsonResponseHandler<ListAssociationVersionsResult>(
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
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return listAssociationsResult The response from the ListAssociations
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsRequest> request = null;
        Response<ListAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsRequestMarshaller().marshall(listAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssociationsResult, JsonUnmarshallerContext> unmarshaller = new ListAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssociationsResult> responseHandler = new JsonResponseHandler<ListAssociationsResult>(
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
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user runs SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return listCommandInvocationsResult The response from the
     *         ListCommandInvocations service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListCommandInvocationsResult listCommandInvocations(
            ListCommandInvocationsRequest listCommandInvocationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCommandInvocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandInvocationsRequest> request = null;
        Response<ListCommandInvocationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandInvocationsRequestMarshaller()
                        .marshall(listCommandInvocationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCommandInvocationsResult, JsonUnmarshallerContext> unmarshaller = new ListCommandInvocationsResultJsonUnmarshaller();
            JsonResponseHandler<ListCommandInvocationsResult> responseHandler = new JsonResponseHandler<ListCommandInvocationsResult>(
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
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return listCommandsResult The response from the ListCommands service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListCommandsResult listCommands(ListCommandsRequest listCommandsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandsRequest> request = null;
        Response<ListCommandsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandsRequestMarshaller().marshall(listCommandsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCommandsResult, JsonUnmarshallerContext> unmarshaller = new ListCommandsResultJsonUnmarshaller();
            JsonResponseHandler<ListCommandsResult> responseHandler = new JsonResponseHandler<ListCommandsResult>(
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
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return listComplianceItemsResult The response from the
     *         ListComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListComplianceItemsResult listComplianceItems(
            ListComplianceItemsRequest listComplianceItemsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listComplianceItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComplianceItemsRequest> request = null;
        Response<ListComplianceItemsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComplianceItemsRequestMarshaller()
                        .marshall(listComplianceItemsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListComplianceItemsResult, JsonUnmarshallerContext> unmarshaller = new ListComplianceItemsResultJsonUnmarshaller();
            JsonResponseHandler<ListComplianceItemsResult> responseHandler = new JsonResponseHandler<ListComplianceItemsResult>(
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
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return listComplianceSummariesResult The response from the
     *         ListComplianceSummaries service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListComplianceSummariesResult listComplianceSummaries(
            ListComplianceSummariesRequest listComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listComplianceSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComplianceSummariesRequest> request = null;
        Response<ListComplianceSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComplianceSummariesRequestMarshaller()
                        .marshall(listComplianceSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListComplianceSummariesResult, JsonUnmarshallerContext> unmarshaller = new ListComplianceSummariesResultJsonUnmarshaller();
            JsonResponseHandler<ListComplianceSummariesResult> responseHandler = new JsonResponseHandler<ListComplianceSummariesResult>(
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
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return listDocumentVersionsResult The response from the
     *         ListDocumentVersions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListDocumentVersionsResult listDocumentVersions(
            ListDocumentVersionsRequest listDocumentVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDocumentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentVersionsRequest> request = null;
        Response<ListDocumentVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentVersionsRequestMarshaller()
                        .marshall(listDocumentVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListDocumentVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentVersionsResult> responseHandler = new JsonResponseHandler<ListDocumentVersionsResult>(
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
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return listDocumentsResult The response from the ListDocuments service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestMarshaller().marshall(listDocumentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentsResult, JsonUnmarshallerContext> unmarshaller = new ListDocumentsResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentsResult> responseHandler = new JsonResponseHandler<ListDocumentsResult>(
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
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return listInventoryEntriesResult The response from the
     *         ListInventoryEntries service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListInventoryEntriesResult listInventoryEntries(
            ListInventoryEntriesRequest listInventoryEntriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInventoryEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInventoryEntriesRequest> request = null;
        Response<ListInventoryEntriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInventoryEntriesRequestMarshaller()
                        .marshall(listInventoryEntriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInventoryEntriesResult, JsonUnmarshallerContext> unmarshaller = new ListInventoryEntriesResultJsonUnmarshaller();
            JsonResponseHandler<ListInventoryEntriesResult> responseHandler = new JsonResponseHandler<ListInventoryEntriesResult>(
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
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return listResourceComplianceSummariesResult The response from the
     *         ListResourceComplianceSummaries service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListResourceComplianceSummariesResult listResourceComplianceSummaries(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceComplianceSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceComplianceSummariesRequest> request = null;
        Response<ListResourceComplianceSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceComplianceSummariesRequestMarshaller()
                        .marshall(listResourceComplianceSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceComplianceSummariesResult, JsonUnmarshallerContext> unmarshaller = new ListResourceComplianceSummariesResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceComplianceSummariesResult> responseHandler = new JsonResponseHandler<ListResourceComplianceSummariesResult>(
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
     * Lists your resource data sync configurations. Includes information about
     * the last time a sync attempted to start, the last sync status, and the
     * last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a
     * single call to <code>ListResourceDataSync</code>. You can limit the
     * number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more
     * sync configurations to list, check the value of <code>NextToken</code> in
     * the output. If there are more sync configurations to list, you can
     * request them by specifying the <code>NextToken</code> returned in the
     * call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return listResourceDataSyncResult The response from the
     *         ListResourceDataSync service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListResourceDataSyncResult listResourceDataSync(
            ListResourceDataSyncRequest listResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceDataSyncRequest> request = null;
        Response<ListResourceDataSyncResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceDataSyncRequestMarshaller()
                        .marshall(listResourceDataSyncRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceDataSyncResult, JsonUnmarshallerContext> unmarshaller = new ListResourceDataSyncResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceDataSyncResult> responseHandler = new JsonResponseHandler<ListResourceDataSyncResult>(
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
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return modifyDocumentPermissionResult The response from the
     *         ModifyDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws DocumentPermissionLimitException
     * @throws DocumentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDocumentPermissionResult modifyDocumentPermission(
            ModifyDocumentPermissionRequest modifyDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDocumentPermissionRequest> request = null;
        Response<ModifyDocumentPermissionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDocumentPermissionRequestMarshaller()
                        .marshall(modifyDocumentPermissionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ModifyDocumentPermissionResult, JsonUnmarshallerContext> unmarshaller = new ModifyDocumentPermissionResultJsonUnmarshaller();
            JsonResponseHandler<ModifyDocumentPermissionResult> responseHandler = new JsonResponseHandler<ModifyDocumentPermissionResult>(
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
     * Registers a compliance type and other compliance details on a designated
     * resource. This action lets you register custom compliance details with a
     * resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time
     * that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom
     * compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item
     * was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example,
     * <code>approved</code> for patches, or <code>Failed</code> for
     * associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example,
     * <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example,
     * <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item
     * was applied to the resource. Specify the time by using the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return putComplianceItemsResult The response from the PutComplianceItems
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ComplianceTypeCountLimitExceededException
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PutComplianceItemsResult putComplianceItems(
            PutComplianceItemsRequest putComplianceItemsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putComplianceItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutComplianceItemsRequest> request = null;
        Response<PutComplianceItemsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutComplianceItemsRequestMarshaller()
                        .marshall(putComplianceItemsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutComplianceItemsResult, JsonUnmarshallerContext> unmarshaller = new PutComplianceItemsResultJsonUnmarshaller();
            JsonResponseHandler<PutComplianceItemsResult> responseHandler = new JsonResponseHandler<PutComplianceItemsResult>(
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
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return putInventoryResult The response from the PutInventory service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ItemContentMismatchException
     * @throws CustomSchemaCountLimitExceededException
     * @throws UnsupportedInventorySchemaVersionException
     * @throws UnsupportedInventoryItemContextException
     * @throws InvalidInventoryItemContextException
     * @throws SubTypeCountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PutInventoryResult putInventory(PutInventoryRequest putInventoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInventoryRequest> request = null;
        Response<PutInventoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInventoryRequestMarshaller().marshall(putInventoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutInventoryResult, JsonUnmarshallerContext> unmarshaller = new PutInventoryResultJsonUnmarshaller();
            JsonResponseHandler<PutInventoryResult> responseHandler = new JsonResponseHandler<PutInventoryResult>(
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
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return putParameterResult The response from the PutParameter service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterLimitExceededException
     * @throws TooManyUpdatesException
     * @throws ParameterAlreadyExistsException
     * @throws HierarchyLevelLimitExceededException
     * @throws HierarchyTypeMismatchException
     * @throws InvalidAllowedPatternException
     * @throws ParameterMaxVersionLimitExceededException
     * @throws ParameterPatternMismatchException
     * @throws UnsupportedParameterTypeException
     * @throws PoliciesLimitExceededException
     * @throws InvalidPolicyTypeException
     * @throws InvalidPolicyAttributeException
     * @throws IncompatiblePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PutParameterResult putParameter(PutParameterRequest putParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutParameterRequest> request = null;
        Response<PutParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutParameterRequestMarshaller().marshall(putParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutParameterResult, JsonUnmarshallerContext> unmarshaller = new PutParameterResultJsonUnmarshaller();
            JsonResponseHandler<PutParameterResult> responseHandler = new JsonResponseHandler<PutParameterResult>(
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
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the
     * full patch baseline ARN as the baseline ID value. For example, for
     * CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
     * instead of <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return registerDefaultPatchBaselineResult The response from the
     *         RegisterDefaultPatchBaseline service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RegisterDefaultPatchBaselineResult registerDefaultPatchBaseline(
            RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerDefaultPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDefaultPatchBaselineRequest> request = null;
        Response<RegisterDefaultPatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDefaultPatchBaselineRequestMarshaller()
                        .marshall(registerDefaultPatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterDefaultPatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new RegisterDefaultPatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<RegisterDefaultPatchBaselineResult> responseHandler = new JsonResponseHandler<RegisterDefaultPatchBaselineResult>(
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
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return registerPatchBaselineForPatchGroupResult The response from the
     *         RegisterPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AlreadyExistsException
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RegisterPatchBaselineForPatchGroupResult registerPatchBaselineForPatchGroup(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterPatchBaselineForPatchGroupRequest> request = null;
        Response<RegisterPatchBaselineForPatchGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterPatchBaselineForPatchGroupRequestMarshaller()
                        .marshall(registerPatchBaselineForPatchGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterPatchBaselineForPatchGroupResult, JsonUnmarshallerContext> unmarshaller = new RegisterPatchBaselineForPatchGroupResultJsonUnmarshaller();
            JsonResponseHandler<RegisterPatchBaselineForPatchGroupResult> responseHandler = new JsonResponseHandler<RegisterPatchBaselineForPatchGroupResult>(
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
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return registerTargetWithMaintenanceWindowResult The response from the
     *         RegisterTargetWithMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RegisterTargetWithMaintenanceWindowResult registerTargetWithMaintenanceWindow(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerTargetWithMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTargetWithMaintenanceWindowRequest> request = null;
        Response<RegisterTargetWithMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTargetWithMaintenanceWindowRequestMarshaller()
                        .marshall(registerTargetWithMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterTargetWithMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new RegisterTargetWithMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<RegisterTargetWithMaintenanceWindowResult> responseHandler = new JsonResponseHandler<RegisterTargetWithMaintenanceWindowResult>(
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
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return registerTaskWithMaintenanceWindowResult The response from the
     *         RegisterTaskWithMaintenanceWindow service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws FeatureNotAvailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RegisterTaskWithMaintenanceWindowResult registerTaskWithMaintenanceWindow(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerTaskWithMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTaskWithMaintenanceWindowRequest> request = null;
        Response<RegisterTaskWithMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTaskWithMaintenanceWindowRequestMarshaller()
                        .marshall(registerTaskWithMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterTaskWithMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new RegisterTaskWithMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<RegisterTaskWithMaintenanceWindowResult> responseHandler = new JsonResponseHandler<RegisterTaskWithMaintenanceWindowResult>(
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
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller()
                        .marshall(removeTagsFromResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveTagsFromResourceResult, JsonUnmarshallerContext> unmarshaller = new RemoveTagsFromResourceResultJsonUnmarshaller();
            JsonResponseHandler<RemoveTagsFromResourceResult> responseHandler = new JsonResponseHandler<RemoveTagsFromResourceResult>(
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
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Use the <a>UpdateServiceSetting</a> API action
     * to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as
     * provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest <p>
     *            The request body of the ResetServiceSetting API action.
     *            </p>
     * @return resetServiceSettingResult The response from the
     *         ResetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ResetServiceSettingResult resetServiceSetting(
            ResetServiceSettingRequest resetServiceSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetServiceSettingRequest> request = null;
        Response<ResetServiceSettingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetServiceSettingRequestMarshaller()
                        .marshall(resetServiceSettingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResetServiceSettingResult, JsonUnmarshallerContext> unmarshaller = new ResetServiceSettingResultJsonUnmarshaller();
            JsonResponseHandler<ResetServiceSettingResult> responseHandler = new JsonResponseHandler<ResetServiceSettingResult>(
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
     * Reconnects a session to an instance after it has been disconnected.
     * Connections can be resumed for disconnected sessions, but not terminated
     * sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically
     * reconnect during intermittent network issues. It is not intended for any
     * other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return resumeSessionResult The response from the ResumeSession service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ResumeSessionResult resumeSession(ResumeSessionRequest resumeSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resumeSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeSessionRequest> request = null;
        Response<ResumeSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeSessionRequestMarshaller().marshall(resumeSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResumeSessionResult, JsonUnmarshallerContext> unmarshaller = new ResumeSessionResultJsonUnmarshaller();
            JsonResponseHandler<ResumeSessionResult> responseHandler = new JsonResponseHandler<ResumeSessionResult>(
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
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return sendAutomationSignalResult The response from the
     *         SendAutomationSignal service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws AutomationStepNotFoundException
     * @throws InvalidAutomationSignalException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public SendAutomationSignalResult sendAutomationSignal(
            SendAutomationSignalRequest sendAutomationSignalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendAutomationSignalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendAutomationSignalRequest> request = null;
        Response<SendAutomationSignalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendAutomationSignalRequestMarshaller()
                        .marshall(sendAutomationSignalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendAutomationSignalResult, JsonUnmarshallerContext> unmarshaller = new SendAutomationSignalResultJsonUnmarshaller();
            JsonResponseHandler<SendAutomationSignalResult> responseHandler = new JsonResponseHandler<SendAutomationSignalResult>(
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
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return sendCommandResult The response from the SendCommand service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidOutputFolderException
     * @throws InvalidParametersException
     * @throws UnsupportedPlatformTypeException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidRoleException
     * @throws InvalidNotificationConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public SendCommandResult sendCommand(SendCommandRequest sendCommandRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCommandRequest> request = null;
        Response<SendCommandResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCommandRequestMarshaller().marshall(sendCommandRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendCommandResult, JsonUnmarshallerContext> unmarshaller = new SendCommandResultJsonUnmarshaller();
            JsonResponseHandler<SendCommandResult> responseHandler = new JsonResponseHandler<SendCommandResult>(
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
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return startAssociationsOnceResult The response from the
     *         StartAssociationsOnce service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidAssociationException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartAssociationsOnceResult startAssociationsOnce(
            StartAssociationsOnceRequest startAssociationsOnceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startAssociationsOnceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssociationsOnceRequest> request = null;
        Response<StartAssociationsOnceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssociationsOnceRequestMarshaller()
                        .marshall(startAssociationsOnceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartAssociationsOnceResult, JsonUnmarshallerContext> unmarshaller = new StartAssociationsOnceResultJsonUnmarshaller();
            JsonResponseHandler<StartAssociationsOnceResult> responseHandler = new JsonResponseHandler<StartAssociationsOnceResult>(
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
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return startAutomationExecutionResult The response from the
     *         StartAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationDefinitionNotFoundException
     * @throws InvalidAutomationExecutionParametersException
     * @throws AutomationExecutionLimitExceededException
     * @throws AutomationDefinitionVersionNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidTargetException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartAutomationExecutionResult startAutomationExecution(
            StartAutomationExecutionRequest startAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAutomationExecutionRequest> request = null;
        Response<StartAutomationExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAutomationExecutionRequestMarshaller()
                        .marshall(startAutomationExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartAutomationExecutionResult, JsonUnmarshallerContext> unmarshaller = new StartAutomationExecutionResultJsonUnmarshaller();
            JsonResponseHandler<StartAutomationExecutionResult> responseHandler = new JsonResponseHandler<StartAutomationExecutionResult>(
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
     * Initiates a connection to a target (for example, an instance) for a
     * Session Manager session. Returns a URL and token that can be used to open
     * a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that
     * requires the Session Manager plugin to be installed on the client machine
     * making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return startSessionResult The response from the StartSession service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidDocumentException
     * @throws TargetNotConnectedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartSessionResult startSession(StartSessionRequest startSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSessionRequest> request = null;
        Response<StartSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSessionRequestMarshaller().marshall(startSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartSessionResult, JsonUnmarshallerContext> unmarshaller = new StartSessionResultJsonUnmarshaller();
            JsonResponseHandler<StartSessionResult> responseHandler = new JsonResponseHandler<StartSessionResult>(
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
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return stopAutomationExecutionResult The response from the
     *         StopAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidAutomationStatusUpdateException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StopAutomationExecutionResult stopAutomationExecution(
            StopAutomationExecutionRequest stopAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAutomationExecutionRequest> request = null;
        Response<StopAutomationExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAutomationExecutionRequestMarshaller()
                        .marshall(stopAutomationExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopAutomationExecutionResult, JsonUnmarshallerContext> unmarshaller = new StopAutomationExecutionResultJsonUnmarshaller();
            JsonResponseHandler<StopAutomationExecutionResult> responseHandler = new JsonResponseHandler<StopAutomationExecutionResult>(
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
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return terminateSessionResult The response from the TerminateSession
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public TerminateSessionResult terminateSession(TerminateSessionRequest terminateSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(terminateSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateSessionRequest> request = null;
        Response<TerminateSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateSessionRequestMarshaller().marshall(terminateSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TerminateSessionResult, JsonUnmarshallerContext> unmarshaller = new TerminateSessionResultJsonUnmarshaller();
            JsonResponseHandler<TerminateSessionResult> responseHandler = new JsonResponseHandler<TerminateSessionResult>(
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
     * Updates an association. You can update the association name and version,
     * the document version, schedule, parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role
     * must be configured with permission to call the <a>DescribeAssociation</a>
     * API action. If you don't have permission to call DescribeAssociation,
     * then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against
     * the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return updateAssociationResult The response from the UpdateAssociation
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidScheduleException
     * @throws InvalidParametersException
     * @throws InvalidOutputLocationException
     * @throws InvalidDocumentVersionException
     * @throws AssociationDoesNotExistException
     * @throws InvalidUpdateException
     * @throws TooManyUpdatesException
     * @throws InvalidDocumentException
     * @throws InvalidTargetException
     * @throws InvalidAssociationVersionException
     * @throws AssociationVersionLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateAssociationResult updateAssociation(
            UpdateAssociationRequest updateAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationRequest> request = null;
        Response<UpdateAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationRequestMarshaller()
                        .marshall(updateAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssociationResult, JsonUnmarshallerContext> unmarshaller = new UpdateAssociationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssociationResult> responseHandler = new JsonResponseHandler<UpdateAssociationResult>(
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
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return updateAssociationStatusResult The response from the
     *         UpdateAssociationStatus service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationStatusRequest> request = null;
        Response<UpdateAssociationStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationStatusRequestMarshaller()
                        .marshall(updateAssociationStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssociationStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdateAssociationStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssociationStatusResult> responseHandler = new JsonResponseHandler<UpdateAssociationStatusResult>(
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
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return updateDocumentResult The response from the UpdateDocument service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws MaxDocumentSizeExceededException
     * @throws DocumentVersionLimitExceededException
     * @throws InternalServerErrorException
     * @throws DuplicateDocumentContentException
     * @throws DuplicateDocumentVersionNameException
     * @throws InvalidDocumentContentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateDocumentResult updateDocument(UpdateDocumentRequest updateDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentRequest> request = null;
        Response<UpdateDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentRequestMarshaller().marshall(updateDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDocumentResult, JsonUnmarshallerContext> unmarshaller = new UpdateDocumentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDocumentResult> responseHandler = new JsonResponseHandler<UpdateDocumentResult>(
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
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return updateDocumentDefaultVersionResult The response from the
     *         UpdateDocumentDefaultVersion service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateDocumentDefaultVersionResult updateDocumentDefaultVersion(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDocumentDefaultVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentDefaultVersionRequest> request = null;
        Response<UpdateDocumentDefaultVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentDefaultVersionRequestMarshaller()
                        .marshall(updateDocumentDefaultVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDocumentDefaultVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateDocumentDefaultVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDocumentDefaultVersionResult> responseHandler = new JsonResponseHandler<UpdateDocumentDefaultVersionResult>(
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
     * Updates an existing maintenance window. Only specified parameters are
     * modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return updateMaintenanceWindowResult The response from the
     *         UpdateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateMaintenanceWindowResult updateMaintenanceWindow(
            UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowRequest> request = null;
        Response<UpdateMaintenanceWindowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowRequestMarshaller()
                        .marshall(updateMaintenanceWindowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMaintenanceWindowResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceWindowResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMaintenanceWindowResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceWindowResult>(
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
     * Modifies the target of an existing maintenance window. You can change the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are
     * ID target, Tag target, and resource group. For more information, see
     * <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return updateMaintenanceWindowTargetResult The response from the
     *         UpdateMaintenanceWindowTarget service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateMaintenanceWindowTargetResult updateMaintenanceWindowTarget(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowTargetRequest> request = null;
        Response<UpdateMaintenanceWindowTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowTargetRequestMarshaller()
                        .marshall(updateMaintenanceWindowTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMaintenanceWindowTargetResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceWindowTargetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMaintenanceWindowTargetResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceWindowTargetResult>(
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
     * Modifies a task assigned to a maintenance window. You can't change the
     * task type, but you can change the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from
     * AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * Also, if you set Replace to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
     * request. Optional fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return updateMaintenanceWindowTaskResult The response from the
     *         UpdateMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTask(
            UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowTaskRequest> request = null;
        Response<UpdateMaintenanceWindowTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowTaskRequestMarshaller()
                        .marshall(updateMaintenanceWindowTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMaintenanceWindowTaskResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceWindowTaskResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMaintenanceWindowTaskResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceWindowTaskResult>(
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
     * Changes the Amazon Identity and Access Management (IAM) role that is
     * assigned to the on-premises instance or virtual machines (VM). IAM roles
     * are first assigned to these hybrid instances during the activation
     * process. For more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return updateManagedInstanceRoleResult The response from the
     *         UpdateManagedInstanceRole service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateManagedInstanceRoleResult updateManagedInstanceRole(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateManagedInstanceRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateManagedInstanceRoleRequest> request = null;
        Response<UpdateManagedInstanceRoleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateManagedInstanceRoleRequestMarshaller()
                        .marshall(updateManagedInstanceRoleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateManagedInstanceRoleResult, JsonUnmarshallerContext> unmarshaller = new UpdateManagedInstanceRoleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateManagedInstanceRoleResult> responseHandler = new JsonResponseHandler<UpdateManagedInstanceRoleResult>(
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
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return updateOpsItemResult The response from the UpdateOpsItem service
     *         method, as returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateOpsItemResult updateOpsItem(UpdateOpsItemRequest updateOpsItemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateOpsItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOpsItemRequest> request = null;
        Response<UpdateOpsItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOpsItemRequestMarshaller().marshall(updateOpsItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateOpsItemResult, JsonUnmarshallerContext> unmarshaller = new UpdateOpsItemResultJsonUnmarshaller();
            JsonResponseHandler<UpdateOpsItemResult> responseHandler = new JsonResponseHandler<UpdateOpsItemResult>(
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
     * Modifies an existing patch baseline. Fields not specified in the request
     * are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return updatePatchBaselineResult The response from the
     *         UpdatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdatePatchBaselineResult updatePatchBaseline(
            UpdatePatchBaselineRequest updatePatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePatchBaselineRequest> request = null;
        Response<UpdatePatchBaselineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePatchBaselineRequestMarshaller()
                        .marshall(updatePatchBaselineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePatchBaselineResult, JsonUnmarshallerContext> unmarshaller = new UpdatePatchBaselineResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePatchBaselineResult> responseHandler = new JsonResponseHandler<UpdatePatchBaselineResult>(
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
     * Update a resource data sync. After you create a resource data sync for a
     * Region, you can't change the account options for that sync. For example,
     * if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later
     * and choose the Include all accounts from my AWS Organizations
     * configuration option. Instead, you must delete the first resource data
     * sync, and create a new one.
     * </p>
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with
     * a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return updateResourceDataSyncResult The response from the
     *         UpdateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws ResourceDataSyncConflictException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateResourceDataSyncResult updateResourceDataSync(
            UpdateResourceDataSyncRequest updateResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceDataSyncRequest> request = null;
        Response<UpdateResourceDataSyncResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceDataSyncRequestMarshaller()
                        .marshall(updateResourceDataSyncRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateResourceDataSyncResult, JsonUnmarshallerContext> unmarshaller = new UpdateResourceDataSyncResultJsonUnmarshaller();
            JsonResponseHandler<UpdateResourceDataSyncResult> responseHandler = new JsonResponseHandler<UpdateResourceDataSyncResult>(
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
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service
     * team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest <p>
     *            The request body of the UpdateServiceSetting API action.
     *            </p>
     * @return updateServiceSettingResult The response from the
     *         UpdateServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateServiceSettingResult updateServiceSetting(
            UpdateServiceSettingRequest updateServiceSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceSettingRequest> request = null;
        Response<UpdateServiceSettingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceSettingRequestMarshaller()
                        .marshall(updateServiceSettingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateServiceSettingResult, JsonUnmarshallerContext> unmarshaller = new UpdateServiceSettingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateServiceSettingResult> responseHandler = new JsonResponseHandler<UpdateServiceSettingResult>(
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
