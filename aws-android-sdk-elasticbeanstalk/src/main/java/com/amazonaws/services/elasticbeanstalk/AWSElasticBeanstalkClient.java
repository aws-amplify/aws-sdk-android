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

package com.amazonaws.services.elasticbeanstalk;

import org.w3c.dom.*;

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

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.services.elasticbeanstalk.model.transform.*;

/**
 * Client for accessing AWS Elastic Beanstalk. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage
 * scalable, fault-tolerant applications running on the Amazon Web Services
 * cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic Beanstalk</a>
 * details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href=
 * "https://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >https://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk
 * .wsdl</a>. To install the Software Development Kits (SDKs), Integrated
 * Development Environment (IDE) Toolkits, and command line tools that enable
 * you to access the API, go to <a href="http://aws.amazon.com/tools/">Tools for
 * Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports,
 * go to <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region"
 * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
public class AWSElasticBeanstalkClient extends AmazonWebServiceClient implements
        AWSElasticBeanstalk {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Elastic Beanstalk exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
    public AWSElasticBeanstalkClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
     *            how this client connects to AWSElasticBeanstalk (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSElasticBeanstalkClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *         AWSElasticBeanstalkClient client = new AWSElasticBeanstalkClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *         AWSElasticBeanstalkClient client = new AWSElasticBeanstalkClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSElasticBeanstalk (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *         AWSElasticBeanstalkClient client = new AWSElasticBeanstalkClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *         AWSElasticBeanstalkClient client = new AWSElasticBeanstalkClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSElasticBeanstalk (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *            how this client connects to AWSElasticBeanstalk (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSElasticBeanstalk
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
     *         AWSElasticBeanstalkClient client = new AWSElasticBeanstalkClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSElasticBeanstalk (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new CodeBuildNotInServiceRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ElasticBeanstalkServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientPrivilegesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ManagedActionInvalidStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PlatformVersionStillReferencedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceTypeNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3LocationNotInServiceRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3SubscriptionRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceBundleDeletionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationVersionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyBucketsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyConfigurationTemplatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyEnvironmentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPlatformsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticbeanstalk.us-east-1.amazonaws.com");
        this.endpointPrefix = "elasticbeanstalk";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticbeanstalk/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticbeanstalk/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Cancels in-progress environment configuration update or application
     * version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest <p/>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void abortEnvironmentUpdate(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(abortEnvironmentUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortEnvironmentUpdateRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AbortEnvironmentUpdateRequestMarshaller()
                    .marshall(abortEnvironmentUpdateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be
     * applied only if its status is <code>Scheduled</code>. Get the status and
     * action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest <p>
     *            Request to execute a scheduled managed action immediately.
     *            </p>
     * @return applyEnvironmentManagedActionResult The response from the
     *         ApplyEnvironmentManagedAction service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws ManagedActionInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ApplyEnvironmentManagedActionResult applyEnvironmentManagedAction(
            ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(applyEnvironmentManagedActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyEnvironmentManagedActionRequest> request = null;
        Response<ApplyEnvironmentManagedActionResult> response = null;
        try {
            request = new ApplyEnvironmentManagedActionRequestMarshaller()
                    .marshall(applyEnvironmentManagedActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ApplyEnvironmentManagedActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add or change the operations role used by an environment. After this call
     * is made, Elastic Beanstalk uses the associated operations role for
     * permissions to downstream services during subsequent calls acting on this
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * 
     * @param associateEnvironmentOperationsRoleRequest <p>
     *            Request to add or change the operations role used by an
     *            environment.
     *            </p>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void associateEnvironmentOperationsRole(
            AssociateEnvironmentOperationsRoleRequest associateEnvironmentOperationsRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateEnvironmentOperationsRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateEnvironmentOperationsRoleRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AssociateEnvironmentOperationsRoleRequestMarshaller()
                    .marshall(associateEnvironmentOperationsRoleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest <p>
     *            Results message indicating whether a CNAME is available.
     *            </p>
     * @return checkDNSAvailabilityResult The response from the
     *         CheckDNSAvailability service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CheckDNSAvailabilityResult checkDNSAvailability(
            CheckDNSAvailabilityRequest checkDNSAvailabilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(checkDNSAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDNSAvailabilityRequest> request = null;
        Response<CheckDNSAvailabilityResult> response = null;
        try {
            request = new CheckDNSAvailabilityRequestMarshaller()
                    .marshall(checkDNSAvailabilityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CheckDNSAvailabilityResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create or update a group of environments that each run a separate
     * component of a single application. Takes a list of version labels that
     * specify application source bundles for each of the environments to create
     * or update. The name of each environment and other required information
     * must be included in the source bundles in an environment manifest named
     * <code>env.yaml</code>. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html"
     * >Compose Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest <p>
     *            Request to create or update a group of environments.
     *            </p>
     * @return composeEnvironmentsResult The response from the
     *         ComposeEnvironments service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws TooManyEnvironmentsException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ComposeEnvironmentsResult composeEnvironments(
            ComposeEnvironmentsRequest composeEnvironmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(composeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ComposeEnvironmentsRequest> request = null;
        Response<ComposeEnvironmentsResult> response = null;
        try {
            request = new ComposeEnvironmentsRequestMarshaller()
                    .marshall(composeEnvironmentsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ComposeEnvironmentsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * 
     * @param createApplicationRequest <p>
     *            Request to create an application.
     *            </p>
     * @return createApplicationResult The response from the CreateApplication
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws TooManyApplicationsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;
        try {
            request = new CreateApplicationRequestMarshaller().marshall(createApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateApplicationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application version for the specified application. You can
     * create an application version from a source bundle in Amazon S3, a commit
     * in AWS CodeCommit, or the output of an AWS CodeBuild build as follows:
     * </p>
     * <p>
     * Specify a commit in an AWS CodeCommit repository with
     * <code>SourceBuildInformation</code>.
     * </p>
     * <p>
     * Specify a build in an AWS CodeBuild with
     * <code>SourceBuildInformation</code> and <code>BuildConfiguration</code>.
     * </p>
     * <p>
     * Specify a source bundle in S3 with <code>SourceBundle</code>
     * </p>
     * <p>
     * Omit both <code>SourceBuildInformation</code> and
     * <code>SourceBundle</code> to use the default sample application.
     * </p>
     * <note>
     * <p>
     * After you create an application version with a specified Amazon S3 bucket
     * and key location, you can't change that Amazon S3 location. If you change
     * the Amazon S3 location, you receive an exception when you attempt to
     * launch an environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest <p/>
     * @return createApplicationVersionResult The response from the
     *         CreateApplicationVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyApplicationsException
     * @throws TooManyApplicationVersionsException
     * @throws InsufficientPrivilegesException
     * @throws S3LocationNotInServiceRegionException
     * @throws CodeBuildNotInServiceRegionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateApplicationVersionResult createApplicationVersion(
            CreateApplicationVersionRequest createApplicationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationVersionRequest> request = null;
        Response<CreateApplicationVersionResult> response = null;
        try {
            request = new CreateApplicationVersionRequestMarshaller()
                    .marshall(createApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateApplicationVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS Elastic Beanstalk configuration template, associated with
     * a specific Elastic Beanstalk application. You define application
     * configuration settings in a configuration template. You can then use the
     * configuration template to deploy different versions of the application
     * with the same configuration settings.
     * </p>
     * <p>
     * Templates aren't associated with any environment. The
     * <code>EnvironmentName</code> response element is always <code>null</code>
     * .
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest <p>
     *            Request to create a configuration template.
     *            </p>
     * @return createConfigurationTemplateResult The response from the
     *         CreateConfigurationTemplate service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws TooManyConfigurationTemplatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateConfigurationTemplateResult createConfigurationTemplate(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationTemplateRequest> request = null;
        Response<CreateConfigurationTemplateResult> response = null;
        try {
            request = new CreateConfigurationTemplateRequestMarshaller()
                    .marshall(createConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateConfigurationTemplateResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches an AWS Elastic Beanstalk environment for the specified
     * application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest <p/>
     * @return createEnvironmentResult The response from the CreateEnvironment
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws TooManyEnvironmentsException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateEnvironmentResult createEnvironment(
            CreateEnvironmentRequest createEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;
        try {
            request = new CreateEnvironmentRequestMarshaller().marshall(createEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateEnvironmentResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new version of your custom platform.
     * </p>
     * 
     * @param createPlatformVersionRequest <p>
     *            Request to create a new platform version.
     *            </p>
     * @return createPlatformVersionResult The response from the
     *         CreatePlatformVersion service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws TooManyPlatformsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreatePlatformVersionResult createPlatformVersion(
            CreatePlatformVersionRequest createPlatformVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformVersionRequest> request = null;
        Response<CreatePlatformVersionResult> response = null;
        try {
            request = new CreatePlatformVersionRequestMarshaller()
                    .marshall(createPlatformVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreatePlatformVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a bucket in Amazon S3 to store application versions, logs, and
     * other files used by Elastic Beanstalk environments. The Elastic Beanstalk
     * console and EB CLI call this API the first time you create an environment
     * in a region. If the storage location already exists,
     * <code>CreateStorageLocation</code> still returns the bucket name but does
     * not create a new bucket.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @return createStorageLocationResult The response from the
     *         CreateStorageLocation service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws TooManyBucketsException
     * @throws S3SubscriptionRequiredException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateStorageLocationResult createStorageLocation(
            CreateStorageLocationRequest createStorageLocationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStorageLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageLocationRequest> request = null;
        Response<CreateStorageLocationResult> response = null;
        try {
            request = new CreateStorageLocationRequestMarshaller()
                    .marshall(createStorageLocationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStorageLocationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified application along with all associated versions and
     * configurations. The application versions will not be deleted from your
     * Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest <p>
     *            Request to delete an application.
     *            </p>
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteApplicationRequestMarshaller().marshall(deleteApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a
     * running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest <p>
     *            Request to delete an application version.
     *            </p>
     * @throws SourceBundleDeletionException
     * @throws InsufficientPrivilegesException
     * @throws OperationInProgressException
     * @throws S3LocationNotInServiceRegionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteApplicationVersion(
            DeleteApplicationVersionRequest deleteApplicationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationVersionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteApplicationVersionRequestMarshaller()
                    .marshall(deleteApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the
     * environment gets a copy of the template. You can delete or modify the
     * environment's copy of the template without affecting the running
     * environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest <p>
     *            Request to delete a configuration template.
     *            </p>
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteConfigurationTemplate(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationTemplateRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteConfigurationTemplateRequestMarshaller()
                    .marshall(deleteConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a
     * draft configuration set. You can get the draft configuration using
     * <a>DescribeConfigurationSettings</a> while the update is in progress or
     * if the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is deleted
     * with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest <p>
     *            Request to delete a draft environment configuration.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteEnvironmentConfiguration(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteEnvironmentConfigurationRequestMarshaller()
                    .marshall(deleteEnvironmentConfigurationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version of a custom platform.
     * </p>
     * 
     * @param deletePlatformVersionRequest
     * @return deletePlatformVersionResult The response from the
     *         DeletePlatformVersion service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws OperationInProgressException
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws PlatformVersionStillReferencedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeletePlatformVersionResult deletePlatformVersion(
            DeletePlatformVersionRequest deletePlatformVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlatformVersionRequest> request = null;
        Response<DeletePlatformVersionResult> response = null;
        try {
            request = new DeletePlatformVersionRequestMarshaller()
                    .marshall(deletePlatformVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeletePlatformVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns attributes related to AWS Elastic Beanstalk that are associated
     * with the calling AWS account.
     * </p>
     * <p>
     * The result currently has one set of attributes—resource quotas.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;
        try {
            request = new DescribeAccountAttributesRequestMarshaller()
                    .marshall(describeAccountAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAccountAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest <p>
     *            Request to describe application versions.
     *            </p>
     * @return describeApplicationVersionsResult The response from the
     *         DescribeApplicationVersions service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeApplicationVersionsResult describeApplicationVersions(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationVersionsRequest> request = null;
        Response<DescribeApplicationVersionsResult> response = null;
        try {
            request = new DescribeApplicationVersionsRequestMarshaller()
                    .marshall(describeApplicationVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeApplicationVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest <p>
     *            Request to describe one or more applications.
     *            </p>
     * @return describeApplicationsResult The response from the
     *         DescribeApplications service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeApplicationsResult describeApplications(
            DescribeApplicationsRequest describeApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationsRequest> request = null;
        Response<DescribeApplicationsResult> response = null;
        try {
            request = new DescribeApplicationsRequestMarshaller()
                    .marshall(describeApplicationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeApplicationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution stack
     * defines. The description includes the values the options, their default
     * values, and an indication of the required action on a running environment
     * if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest <p>
     *            Result message containing a list of application version
     *            descriptions.
     *            </p>
     * @return describeConfigurationOptionsResult The response from the
     *         DescribeConfigurationOptions service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeConfigurationOptionsResult describeConfigurationOptions(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationOptionsRequest> request = null;
        Response<DescribeConfigurationOptionsResult> response = null;
        try {
            request = new DescribeConfigurationOptionsRequestMarshaller()
                    .marshall(describeConfigurationOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeConfigurationOptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a
     * running environment, it is possible to receive two sets of setting
     * descriptions. One is the deployed configuration set, and the other is a
     * draft configuration of an environment that is either in the process of
     * deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest <p>
     *            Result message containing all of the configuration settings
     *            for a specified solution stack or configuration template.
     *            </p>
     * @return describeConfigurationSettingsResult The response from the
     *         DescribeConfigurationSettings service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeConfigurationSettingsResult describeConfigurationSettings(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationSettingsRequest> request = null;
        Response<DescribeConfigurationSettingsResult> response = null;
        try {
            request = new DescribeConfigurationSettingsRequestMarshaller()
                    .marshall(describeConfigurationSettingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeConfigurationSettingsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the overall health of the specified
     * environment. The <b>DescribeEnvironmentHealth</b> operation is only
     * available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest <p>
     *            See the example below to learn how to create a request body.
     *            </p>
     * @return describeEnvironmentHealthResult The response from the
     *         DescribeEnvironmentHealth service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InvalidRequestException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEnvironmentHealthResult describeEnvironmentHealth(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentHealthRequest> request = null;
        Response<DescribeEnvironmentHealthResult> response = null;
        try {
            request = new DescribeEnvironmentHealthRequestMarshaller()
                    .marshall(describeEnvironmentHealthRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEnvironmentHealthResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest <p>
     *            Request to list completed and failed managed actions.
     *            </p>
     * @return describeEnvironmentManagedActionHistoryResult The response from
     *         the DescribeEnvironmentManagedActionHistory service method, as
     *         returned by AWS Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEnvironmentManagedActionHistoryResult describeEnvironmentManagedActionHistory(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentManagedActionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentManagedActionHistoryRequest> request = null;
        Response<DescribeEnvironmentManagedActionHistoryResult> response = null;
        try {
            request = new DescribeEnvironmentManagedActionHistoryRequestMarshaller()
                    .marshall(describeEnvironmentManagedActionHistoryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeEnvironmentManagedActionHistoryResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest <p>
     *            Request to list an environment's upcoming and in-progress
     *            managed actions.
     *            </p>
     * @return describeEnvironmentManagedActionsResult The response from the
     *         DescribeEnvironmentManagedActions service method, as returned by
     *         AWS Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEnvironmentManagedActionsResult describeEnvironmentManagedActions(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentManagedActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentManagedActionsRequest> request = null;
        Response<DescribeEnvironmentManagedActionsResult> response = null;
        try {
            request = new DescribeEnvironmentManagedActionsRequestMarshaller()
                    .marshall(describeEnvironmentManagedActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeEnvironmentManagedActionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest <p>
     *            Request to describe the resources in an environment.
     *            </p>
     * @return describeEnvironmentResourcesResult The response from the
     *         DescribeEnvironmentResources service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEnvironmentResourcesResult describeEnvironmentResources(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentResourcesRequest> request = null;
        Response<DescribeEnvironmentResourcesResult> response = null;
        try {
            request = new DescribeEnvironmentResourcesRequestMarshaller()
                    .marshall(describeEnvironmentResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEnvironmentResourcesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest <p>
     *            Request to describe one or more environments.
     *            </p>
     * @return describeEnvironmentsResult The response from the
     *         DescribeEnvironments service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEnvironmentsResult describeEnvironments(
            DescribeEnvironmentsRequest describeEnvironmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentsRequest> request = null;
        Response<DescribeEnvironmentsResult> response = null;
        try {
            request = new DescribeEnvironmentsRequestMarshaller()
                    .marshall(describeEnvironmentsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEnvironmentsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified
     * <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest <p>
     *            Request to retrieve a list of events for an environment.
     *            </p>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        try {
            request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves detailed information about the health of instances in your AWS
     * Elastic Beanstalk. This operation requires <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html"
     * >enhanced health reporting</a>.
     * </p>
     * 
     * @param describeInstancesHealthRequest <p>
     *            Parameters for a call to <code>DescribeInstancesHealth</code>.
     *            </p>
     * @return describeInstancesHealthResult The response from the
     *         DescribeInstancesHealth service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InvalidRequestException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeInstancesHealthResult describeInstancesHealth(
            DescribeInstancesHealthRequest describeInstancesHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstancesHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesHealthRequest> request = null;
        Response<DescribeInstancesHealthResult> response = null;
        try {
            request = new DescribeInstancesHealthRequestMarshaller()
                    .marshall(describeInstancesHealthRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeInstancesHealthResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a platform version. Provides full details. Compare to
     * <a>ListPlatformVersions</a>, which provides summary information about a
     * list of platform versions.
     * </p>
     * <p>
     * For definitions of platform version and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param describePlatformVersionRequest
     * @return describePlatformVersionResult The response from the
     *         DescribePlatformVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribePlatformVersionResult describePlatformVersion(
            DescribePlatformVersionRequest describePlatformVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlatformVersionRequest> request = null;
        Response<DescribePlatformVersionResult> response = null;
        try {
            request = new DescribePlatformVersionRequestMarshaller()
                    .marshall(describePlatformVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribePlatformVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate the operations role from an environment. After this call is
     * made, Elastic Beanstalk uses the caller's permissions for permissions to
     * downstream services during subsequent calls acting on this environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * 
     * @param disassociateEnvironmentOperationsRoleRequest <p>
     *            Request to disassociate the operations role from an
     *            environment.
     *            </p>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void disassociateEnvironmentOperationsRole(
            DisassociateEnvironmentOperationsRoleRequest disassociateEnvironmentOperationsRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateEnvironmentOperationsRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateEnvironmentOperationsRoleRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DisassociateEnvironmentOperationsRoleRequestMarshaller()
                    .marshall(disassociateEnvironmentOperationsRoleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available solution stack names, with the public
     * version first and then in reverse chronological order.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @return listAvailableSolutionStacksResult The response from the
     *         ListAvailableSolutionStacks service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAvailableSolutionStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableSolutionStacksRequest> request = null;
        Response<ListAvailableSolutionStacksResult> response = null;
        try {
            request = new ListAvailableSolutionStacksRequestMarshaller()
                    .marshall(listAvailableSolutionStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListAvailableSolutionStacksResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the platform branches available for your account in an AWS Region.
     * Provides summary information about each platform branch.
     * </p>
     * <p>
     * For definitions of platform branch and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param listPlatformBranchesRequest
     * @return listPlatformBranchesResult The response from the
     *         ListPlatformBranches service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListPlatformBranchesResult listPlatformBranches(
            ListPlatformBranchesRequest listPlatformBranchesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPlatformBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlatformBranchesRequest> request = null;
        Response<ListPlatformBranchesResult> response = null;
        try {
            request = new ListPlatformBranchesRequestMarshaller()
                    .marshall(listPlatformBranchesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListPlatformBranchesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the platform versions available for your account in an AWS Region.
     * Provides summary information about each platform version. Compare to
     * <a>DescribePlatformVersion</a>, which provides full details about a
     * single platform version.
     * </p>
     * <p>
     * For definitions of platform version and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param listPlatformVersionsRequest
     * @return listPlatformVersionsResult The response from the
     *         ListPlatformVersions service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListPlatformVersionsResult listPlatformVersions(
            ListPlatformVersionsRequest listPlatformVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPlatformVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlatformVersionsRequest> request = null;
        Response<ListPlatformVersionsResult> response = null;
        try {
            request = new ListPlatformVersionsRequestMarshaller()
                    .marshall(listPlatformVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListPlatformVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return the tags applied to an AWS Elastic Beanstalk resource. The
     * response contains a list of tag key-value pairs.
     * </p>
     * <p>
     * Elastic Beanstalk supports tagging of all of its resources. For details
     * about resource tagging, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/applications-tagging-resources.html"
     * >Tagging Application Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ResourceNotFoundException
     * @throws ResourceTypeNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
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
            request = new ListTagsForResourceRequestMarshaller()
                    .marshall(listTagsForResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTagsForResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest <p/>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebuildEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildEnvironmentRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RebuildEnvironmentRequestMarshaller().marshall(rebuildEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the
     * deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last
     * lines from the application server log files of every Amazon EC2 instance
     * in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the
     * application server log files for every Amazon EC2 instance into a
     * <code>.zip</code> file. Legacy and .NET containers do not support bundle
     * logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest <p>
     *            Request to retrieve logs from an environment and store them in
     *            your Elastic Beanstalk storage bucket.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(requestEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestEnvironmentInfoRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RequestEnvironmentInfoRequestMarshaller()
                    .marshall(requestEnvironmentInfoRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest <p/>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void restartAppServer(RestartAppServerRequest restartAppServerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restartAppServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestartAppServerRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RestartAppServerRequestMarshaller().marshall(restartAppServerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a>
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest <p>
     *            Request to download logs retrieved with
     *            <a>RequestEnvironmentInfo</a>.
     *            </p>
     * @return retrieveEnvironmentInfoResult The response from the
     *         RetrieveEnvironmentInfo service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(
            RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(retrieveEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveEnvironmentInfoRequest> request = null;
        Response<RetrieveEnvironmentInfoResult> response = null;
        try {
            request = new RetrieveEnvironmentInfoRequestMarshaller()
                    .marshall(retrieveEnvironmentInfoRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RetrieveEnvironmentInfoResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest <p>
     *            Swaps the CNAMEs of two environments.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(swapEnvironmentCNAMEsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SwapEnvironmentCNAMEsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SwapEnvironmentCNAMEsRequestMarshaller()
                    .marshall(swapEnvironmentCNAMEsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest <p>
     *            Request to terminate an environment.
     *            </p>
     * @return terminateEnvironmentResult The response from the
     *         TerminateEnvironment service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public TerminateEnvironmentResult terminateEnvironment(
            TerminateEnvironmentRequest terminateEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(terminateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateEnvironmentRequest> request = null;
        Response<TerminateEnvironmentResult> response = null;
        try {
            request = new TerminateEnvironmentRequestMarshaller()
                    .marshall(terminateEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new TerminateEnvironmentResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided,
     * the value remains unchanged. To clear these properties, specify an empty
     * string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest <p>
     *            Request to update an application.
     *            </p>
     * @return updateApplicationResult The response from the UpdateApplication
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateApplicationResult updateApplication(
            UpdateApplicationRequest updateApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;
        try {
            request = new UpdateApplicationRequestMarshaller().marshall(updateApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateApplicationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies lifecycle settings for an application.
     * </p>
     * 
     * @param updateApplicationResourceLifecycleRequest
     * @return updateApplicationResourceLifecycleResult The response from the
     *         UpdateApplicationResourceLifecycle service method, as returned by
     *         AWS Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateApplicationResourceLifecycleResult updateApplicationResourceLifecycle(
            UpdateApplicationResourceLifecycleRequest updateApplicationResourceLifecycleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApplicationResourceLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationResourceLifecycleRequest> request = null;
        Response<UpdateApplicationResourceLifecycleResult> response = null;
        try {
            request = new UpdateApplicationResourceLifecycleRequestMarshaller()
                    .marshall(updateApplicationResourceLifecycleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new UpdateApplicationResourceLifecycleResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided,
     * the value remains unchanged. To clear properties, specify an empty
     * string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest <p/>
     * @return updateApplicationVersionResult The response from the
     *         UpdateApplicationVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateApplicationVersionResult updateApplicationVersion(
            UpdateApplicationVersionRequest updateApplicationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationVersionRequest> request = null;
        Response<UpdateApplicationVersionResult> response = null;
        try {
            request = new UpdateApplicationVersionRequestMarshaller()
                    .marshall(updateApplicationVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateApplicationVersionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not
     * provided, its value remains unchanged. To clear such properties, specify
     * an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest <p>
     *            The result message containing the options for the specified
     *            solution stack.
     *            </p>
     * @return updateConfigurationTemplateResult The response from the
     *         UpdateConfigurationTemplate service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateConfigurationTemplateResult updateConfigurationTemplate(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationTemplateRequest> request = null;
        Response<UpdateConfigurationTemplateResult> response = null;
        try {
            request = new UpdateConfigurationTemplateRequestMarshaller()
                    .marshall(updateConfigurationTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateConfigurationTemplateResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the environment description, deploys a new application version,
     * updates the configuration settings to an entirely new configuration
     * template, or updates select configuration option values in the running
     * environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed
     * and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual
     * settings, a draft configuration is created and
     * <a>DescribeConfigurationSettings</a> for this environment returns two
     * setting descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest <p>
     *            Request to update an environment.
     *            </p>
     * @return updateEnvironmentResult The response from the UpdateEnvironment
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateEnvironmentResult updateEnvironment(
            UpdateEnvironmentRequest updateEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;
        try {
            request = new UpdateEnvironmentRequestMarshaller().marshall(updateEnvironmentRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateEnvironmentResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two
     * lists can be passed: <code>TagsToAdd</code> for tags to add or update,
     * and <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Elastic Beanstalk supports tagging of all of its resources. For details
     * about resource tagging, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/applications-tagging-resources.html"
     * >Tagging Application Resources</a>.
     * </p>
     * <p>
     * If you create a custom IAM user policy to control permission to this
     * operation, specify one of the following two virtual actions (or both)
     * instead of the API operation name:
     * </p>
     * <dl>
     * <dt>elasticbeanstalk:AddTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a
     * list of tags to add in the <code>TagsToAdd</code> parameter.
     * </p>
     * </dd>
     * <dt>elasticbeanstalk:RemoveTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a
     * list of tag keys to remove in the <code>TagsToRemove</code> parameter.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For details about creating a custom user policy, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies"
     * >Creating a Custom User Policy</a>.
     * </p>
     * 
     * @param updateTagsForResourceRequest
     * @throws InsufficientPrivilegesException
     * @throws OperationInProgressException
     * @throws TooManyTagsException
     * @throws ResourceNotFoundException
     * @throws ResourceTypeNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void updateTagsForResource(UpdateTagsForResourceRequest updateTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagsForResourceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new UpdateTagsForResourceRequestMarshaller()
                    .marshall(updateTagsForResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template
     * or environment, and determines whether those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings
     * associated with the selection of option values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest <p>
     *            A list of validation messages for a specified configuration
     *            template.
     *            </p>
     * @return validateConfigurationSettingsResult The response from the
     *         ValidateConfigurationSettings service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ValidateConfigurationSettingsResult validateConfigurationSettings(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(validateConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateConfigurationSettingsRequest> request = null;
        Response<ValidateConfigurationSettingsResult> response = null;
        try {
            request = new ValidateConfigurationSettingsRequestMarshaller()
                    .marshall(validateConfigurationSettingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ValidateConfigurationSettingsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
