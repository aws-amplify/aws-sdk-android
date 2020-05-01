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

package com.amazonaws.services.amazonelasticfilesystem;

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

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.services.amazonelasticfilesystem.model.transform.*;

/**
 * Client for accessing Amazon Elastic File System. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 * <p>
 * Amazon Elastic File System (Amazon EFS) provides simple, scalable file
 * storage for use with Amazon EC2 instances in the AWS Cloud. With Amazon EFS,
 * storage capacity is elastic, growing and shrinking automatically as you add
 * and remove files, so your applications have the storage they need, when they
 * need it. For more information, see the <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/api-reference.html">User
 * Guide</a>.
 * </p>
 */
public class AmazonElasticFileSystemClient extends AmazonWebServiceClient implements
        AmazonElasticFileSystem {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Elastic File System
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AmazonElasticFileSystemClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to AmazonElasticFileSystem (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElasticFileSystemClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials.
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
     *         AmazonElasticFileSystemClient client = new AmazonElasticFileSystemClient(AWSMobileClient
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
    public AmazonElasticFileSystemClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials and
     * client configuration options.
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
     *         AmazonElasticFileSystemClient client = new AmazonElasticFileSystemClient(AWSMobileClient
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
     *            how this client connects to AmazonElasticFileSystem (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElasticFileSystemClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials
     * provider.
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
     *         AmazonElasticFileSystemClient client = new AmazonElasticFileSystemClient(AWSMobileClient
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
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials
     * provider and client configuration options.
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
     *         AmazonElasticFileSystemClient client = new AmazonElasticFileSystemClient(AWSMobileClient
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
     *            how this client connects to AmazonElasticFileSystem (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticFileSystem (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticFileSystem using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
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
     *         AmazonElasticFileSystemClient client = new AmazonElasticFileSystemClient(AWSMobileClient
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
     *            how this client connects to AmazonElasticFileSystem (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessPointAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccessPointLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccessPointNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileSystemAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileSystemInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileSystemLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FileSystemNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncorrectFileSystemLifeCycleStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IncorrectMountTargetStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InsufficientThroughputCapacityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IpAddressInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MountTargetConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MountTargetNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NetworkInterfaceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoFreeAddressesInSubnetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SecurityGroupLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SecurityGroupNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SubnetNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThroughputLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedAvailabilityZoneExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticfilesystem.us-east-1.amazonaws.com");
        this.endpointPrefix = "elasticfilesystem";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonelasticfilesystem/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonelasticfilesystem/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates an EFS access point. An access point is an application-specific
     * view into an EFS file system that applies an operating system user and
     * group, and a file system path, to any file system request made through
     * the access point. The operating system user and group override any
     * identity information provided by the NFS client. The file system path is
     * exposed as the access point's root directory. Applications using the
     * access point can only access data in its own directory and below. To
     * learn more, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html"
     * >Mounting a File System Using EFS Access Points</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:CreateAccessPoint</code> action.
     * </p>
     * 
     * @param createAccessPointRequest
     * @return createAccessPointResult The response from the CreateAccessPoint
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws AccessPointAlreadyExistsException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAccessPointResult createAccessPoint(
            CreateAccessPointRequest createAccessPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPointRequest> request = null;
        Response<CreateAccessPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPointRequestMarshaller()
                        .marshall(createAccessPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAccessPointResult, JsonUnmarshallerContext> unmarshaller = new CreateAccessPointResultJsonUnmarshaller();
            JsonResponseHandler<CreateAccessPointResult> responseHandler = new JsonResponseHandler<CreateAccessPointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token
     * in the request that Amazon EFS uses to ensure idempotent creation
     * (calling the operation with same creation token has no effect). If a file
     * system does not currently exist that is owned by the caller's AWS account
     * with the specified creation token, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty file system. The file system will have an Amazon EFS
     * assigned ID, and an initial lifecycle state <code>creating</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns with the description of the created file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code>
     * error with the ID of the existing file system.
     * </p>
     * <note>
     * <p>
     * For basic use cases, you can use a randomly generated UUID for the
     * creation token.
     * </p>
     * </note>
     * <p>
     * The idempotent operation allows you to retry a
     * <code>CreateFileSystem</code> call without risk of creating an extra file
     * system. This can happen when an initial call fails in a way that leaves
     * it uncertain whether or not a file system was actually created. An
     * example might be that a transport level timeout occurred or your
     * connection was reset. As long as you use the same creation token, if the
     * initial call had succeeded in creating a file system, the client can
     * learn of its existence from the <code>FileSystemAlreadyExists</code>
     * error.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's
     * lifecycle state is still <code>creating</code>. You can check the file
     * system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which among other things returns the file system state.
     * </p>
     * </note>
     * <p>
     * This operation also takes an optional <code>PerformanceMode</code>
     * parameter that you choose for your file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html"
     * >Amazon EFS: Performance Modes</a>.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle
     * state to <code>available</code>, at which point you can create one or
     * more mount targets for the file system in your VPC. For more information,
     * see <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an
     * EC2 instances in your VPC by using the mount target. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * 
     * @param createFileSystemRequest
     * @return createFileSystemResult The response from the CreateFileSystem
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemAlreadyExistsException
     * @throws FileSystemLimitExceededException
     * @throws InsufficientThroughputCapacityException
     * @throws ThroughputLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates a mount target for a file system. You can then mount the file
     * system on EC2 instances by using the mount target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC.
     * All EC2 instances in a VPC within a given Availability Zone share a
     * single mount target for a given file system. If you have multiple subnets
     * in an Availability Zone, you create a mount target in one of the subnets.
     * EC2 instances do not need to be in the same subnet as the mount target in
     * order to access their file system. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are
     * creating the mount target and the file system's lifecycle state must be
     * <code>available</code>. For more information, see
     * <a>DescribeFileSystems</a>.
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which determines the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VPC in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * Availability Zone in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address range from which Amazon EFS selects the IP address of the
     * mount target (if you don't specify an IP address in the request)
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that
     * includes, a <code>MountTargetId</code> and an <code>IpAddress</code>. You
     * use this IP address when mounting the file system in an EC2 instance. You
     * can also use the mount target's DNS name when mounting the file system.
     * The EC2 instance on which you mount the file system by using the mount
     * target can resolve the mount target's DNS name to its IP address. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"
     * >How it Works: Implementation Overview</a>.
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC,
     * and there can be only one mount target per Availability Zone. That is, if
     * the file system already has one or more mount targets created for it, the
     * subnet specified in the request to add another mount target must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must belong to the same VPC as the subnets of the existing mount targets
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be in the same Availability Zone as any of the subnets of the
     * existing mount targets
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new mount target in the specified subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Also creates a new network interface in the subnet as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request provides an <code>IpAddress</code>, Amazon EFS assigns
     * that IP address to the network interface. Otherwise, Amazon EFS assigns a
     * free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not
     * specify a primary private IP address).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request provides <code>SecurityGroups</code>, this network
     * interface is associated with those security groups. Otherwise, it belongs
     * to the default security group for the subnet's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Assigns the description
     * <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code>
     * where <code> <i>fsmt-id</i> </code> is the mount target ID, and
     * <code> <i>fs-id</i> </code> is the <code>FileSystemId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the <code>requesterManaged</code> property of the network interface
     * to <code>true</code>, and the <code>requesterId</code> value to
     * <code>EFS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requester-managed EC2
     * network interface. After the network interface is created, Amazon EFS
     * sets the <code>NetworkInterfaceId</code> field in the mount target's
     * description to the network interface ID, and the <code>IpAddress</code>
     * field to its address. If network interface creation fails, the entire
     * <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateMountTarget</code> call returns only after creating the
     * network interface, but while the mount target state is still
     * <code>creating</code>, you can check the mount target creation status by
     * calling the <a>DescribeMountTargets</a> operation, which among other
     * things returns the mount target state.
     * </p>
     * </note>
     * <p>
     * We recommend that you create a mount target in each of the Availability
     * Zones. There are cost considerations for using a file system in an
     * Availability Zone through a mount target created in another Availability
     * Zone. For more information, see <a
     * href="http://aws.amazon.com/efs/">Amazon EFS</a>. In addition, by always
     * using a mount target local to the instance's Availability Zone, you
     * eliminate a partial failure scenario. If the Availability Zone in which
     * your mount target is created goes down, then you can't access your file
     * system through that mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:CreateMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation also requires permissions for the following Amazon EC2
     * actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMountTargetRequest <p/>
     * @return createMountTargetResult The response from the CreateMountTarget
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws MountTargetConflictException
     * @throws SubnetNotFoundException
     * @throws NoFreeAddressesInSubnetException
     * @throws IpAddressInUseException
     * @throws NetworkInterfaceLimitExceededException
     * @throws SecurityGroupLimitExceededException
     * @throws SecurityGroupNotFoundException
     * @throws UnsupportedAvailabilityZoneException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateMountTargetResult createMountTarget(
            CreateMountTargetRequest createMountTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMountTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMountTargetRequest> request = null;
        Response<CreateMountTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMountTargetRequestMarshaller()
                        .marshall(createMountTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMountTargetResult, JsonUnmarshallerContext> unmarshaller = new CreateMountTargetResultJsonUnmarshaller();
            JsonResponseHandler<CreateMountTargetResult> responseHandler = new JsonResponseHandler<CreateMountTargetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a
     * key-value pair. If a tag key specified in the request already exists on
     * the file system, this operation overwrites its value with the value
     * provided in the request. If you add the <code>Name</code> tag to your
     * file system, Amazon EFS returns it in the response to the
     * <a>DescribeFileSystems</a> operation.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    public void createTags(CreateTagsRequest createTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestMarshaller().marshall(createTagsRequest);
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
     * Deletes the specified access point. After deletion is complete, new
     * clients can no longer connect to the access points. Clients connected to
     * the access point at the time of deletion will continue to function until
     * they terminate their connection.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteAccessPoint</code> action.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPointRequestMarshaller()
                        .marshall(deleteAccessPointRequest);
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
     * Deletes a file system, permanently severing access to its contents. Upon
     * return, the file system no longer exists and you can't access any
     * contents of the deleted file system.
     * </p>
     * <p>
     * You can't delete a file system that is in use. That is, if the file
     * system has any mount targets, you must first delete them. For more
     * information, see <a>DescribeMountTargets</a> and
     * <a>DeleteMountTarget</a>.
     * </p>
     * <note>
     * <p>
     * The <code>DeleteFileSystem</code> call returns while the file system
     * state is still <code>deleting</code>. You can check the file system
     * deletion status by calling the <a>DescribeFileSystems</a> operation,
     * which returns a list of file systems in your account. If you pass file
     * system ID or creation token for the deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>404 FileSystemNotFound</code>
     * error.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws FileSystemInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemRequestMarshaller().marshall(deleteFileSystemRequest);
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
     * Deletes the <code>FileSystemPolicy</code> for the specified file system.
     * The default <code>FileSystemPolicy</code> goes into effect once the
     * existing policy is deleted. For more information about the default file
     * system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/res-based-policies-efs.html"
     * >Using Resource-based Policies with EFS</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteFileSystemPolicy</code> action.
     * </p>
     * 
     * @param deleteFileSystemPolicyRequest
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteFileSystemPolicy(DeleteFileSystemPolicyRequest deleteFileSystemPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFileSystemPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemPolicyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemPolicyRequestMarshaller()
                        .marshall(deleteFileSystemPolicyRequest);
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
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system by using the
     * mount target that is being deleted, which might disrupt instances or
     * applications using those mounts. To avoid applications getting cut off
     * abruptly, you might consider unmounting any mounts of the mount target,
     * if feasible. The operation also deletes the associated network interface.
     * Uncommitted writes might be lost, but breaking a mount target using this
     * operation does not corrupt the file system itself. The file system you
     * created remains. You can mount an EC2 instance in your VPC by using
     * another mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DeleteMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DeleteMountTarget</code> call returns while the mount target
     * state is still <code>deleting</code>. You can check the mount target
     * deletion by calling the <a>DescribeMountTargets</a> operation, which
     * returns a list of mount target descriptions for the given file system.
     * </p>
     * </note>
     * <p>
     * The operation also requires permissions for the following Amazon EC2
     * action on the mount target's network interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMountTargetRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws DependencyTimeoutException
     * @throws MountTargetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteMountTarget(DeleteMountTargetRequest deleteMountTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMountTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMountTargetRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMountTargetRequestMarshaller()
                        .marshall(deleteMountTargetRequest);
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
     * Deletes the specified tags from a file system. If the
     * <code>DeleteTags</code> request includes a tag key that doesn't exist,
     * Amazon EFS ignores it and doesn't cause an error. For more information
     * about tags and related restrictions, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Tag Restrictions</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    public void deleteTags(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
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
     * Returns the description of a specific Amazon EFS access point if the
     * <code>AccessPointId</code> is provided. If you provide an EFS
     * <code>FileSystemId</code>, it returns descriptions of all access points
     * for that file system. You can provide either an
     * <code>AccessPointId</code> or a <code>FileSystemId</code> in the request,
     * but not both.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param describeAccessPointsRequest
     * @return describeAccessPointsResult The response from the
     *         DescribeAccessPoints service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAccessPointsResult describeAccessPoints(
            DescribeAccessPointsRequest describeAccessPointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccessPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccessPointsRequest> request = null;
        Response<DescribeAccessPointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccessPointsRequestMarshaller()
                        .marshall(describeAccessPointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAccessPointsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAccessPointsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAccessPointsResult> responseHandler = new JsonResponseHandler<DescribeAccessPointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the <code>FileSystemPolicy</code> for the specified EFS file
     * system.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeFileSystemPolicy</code> action.
     * </p>
     * 
     * @param describeFileSystemPolicyRequest
     * @return describeFileSystemPolicyResult The response from the
     *         DescribeFileSystemPolicy service method, as returned by Amazon
     *         Elastic File System.
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws PolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeFileSystemPolicyResult describeFileSystemPolicy(
            DescribeFileSystemPolicyRequest describeFileSystemPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFileSystemPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemPolicyRequest> request = null;
        Response<DescribeFileSystemPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemPolicyRequestMarshaller()
                        .marshall(describeFileSystemPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFileSystemPolicyResult, JsonUnmarshallerContext> unmarshaller = new DescribeFileSystemPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFileSystemPolicyResult> responseHandler = new JsonResponseHandler<DescribeFileSystemPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either
     * the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided. Otherwise, it returns descriptions
     * of all file systems owned by the caller's AWS account in the AWS Region
     * of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxItems</code> parameter to limit the number of descriptions
     * in a response. Currently, this number is automatically set to 10. If more
     * file system descriptions remain, Amazon EFS returns a
     * <code>NextMarker</code>, an opaque token, in the response. In this case,
     * you should send a subsequent request with the <code>Marker</code> request
     * parameter set to the value of <code>NextMarker</code>.
     * </p>
     * <p>
     * To retrieve a list of your file system descriptions, this operation is
     * used in an iterative process, where <code>DescribeFileSystems</code> is
     * called first without the <code>Marker</code> and then the operation
     * continues to call it with the <code>Marker</code> parameter set to the
     * value of the <code>NextMarker</code> from the previous response until the
     * response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call and the order of file systems
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest <p/>
     * @return describeFileSystemsResult The response from the
     *         DescribeFileSystems service method, as returned by Amazon Elastic
     *         File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Returns the current <code>LifecycleConfiguration</code> object for the
     * specified Amazon EFS file system. EFS lifecycle management uses the
     * <code>LifecycleConfiguration</code> object to identify which files to
     * move to the EFS Infrequent Access (IA) storage class. For a file system
     * without a <code>LifecycleConfiguration</code> object, the call returns an
     * empty array in the response.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeLifecycleConfiguration</code> operation.
     * </p>
     * 
     * @param describeLifecycleConfigurationRequest
     * @return describeLifecycleConfigurationResult The response from the
     *         DescribeLifecycleConfiguration service method, as returned by
     *         Amazon Elastic File System.
     * @throws InternalServerErrorException
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeLifecycleConfigurationResult describeLifecycleConfiguration(
            DescribeLifecycleConfigurationRequest describeLifecycleConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleConfigurationRequest> request = null;
        Response<DescribeLifecycleConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLifecycleConfigurationRequestMarshaller()
                        .marshall(describeLifecycleConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLifecycleConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeLifecycleConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLifecycleConfigurationResult> responseHandler = new JsonResponseHandler<DescribeLifecycleConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This
     * operation requires that the network interface of the mount target has
     * been created and the lifecycle state of the mount target is not
     * <code>deleted</code>.
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code> action
     * on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest <p/>
     * @return describeMountTargetSecurityGroupsResult The response from the
     *         DescribeMountTargetSecurityGroups service method, as returned by
     *         Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws MountTargetNotFoundException
     * @throws IncorrectMountTargetStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMountTargetSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMountTargetSecurityGroupsRequest> request = null;
        Response<DescribeMountTargetSecurityGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMountTargetSecurityGroupsRequestMarshaller()
                        .marshall(describeMountTargetSecurityGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMountTargetSecurityGroupsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMountTargetSecurityGroupsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMountTargetSecurityGroupsResult> responseHandler = new JsonResponseHandler<DescribeMountTargetSecurityGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the descriptions of all the current mount targets, or a specific
     * mount target, for a file system. When requesting all of the current mount
     * targets, the order of mount targets returned in the response is
     * unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeMountTargets</code> action, on either the
     * file system ID that you specify in <code>FileSystemId</code>, or on the
     * file system of the mount target that you specify in
     * <code>MountTargetId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest <p/>
     * @return describeMountTargetsResult The response from the
     *         DescribeMountTargets service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws MountTargetNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeMountTargetsResult describeMountTargets(
            DescribeMountTargetsRequest describeMountTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMountTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMountTargetsRequest> request = null;
        Response<DescribeMountTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMountTargetsRequestMarshaller()
                        .marshall(describeMountTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMountTargetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeMountTargetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMountTargetsResult> responseHandler = new JsonResponseHandler<DescribeMountTargetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags
     * returned in the response of one <code>DescribeTags</code> call and the
     * order of tags returned across the responses of a multiple-call iteration
     * (when using pagination) is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest <p/>
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTagsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTagsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTagsResult> responseHandler = new JsonResponseHandler<DescribeTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all tags for a top-level EFS resource. You must provide the ID of
     * the resource that you want to retrieve the tags for.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Elastic
     *         File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
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
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network
     * interface. For more information, see <a>CreateMountTarget</a>. This
     * operation replaces the security groups in effect for the network
     * interface associated with a mount target, with the
     * <code>SecurityGroups</code> provided in the request. This operation
     * requires that the network interface of the mount target has been created
     * and the lifecycle state of the mount target is not <code>deleted</code>.
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on
     * the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest <p/>
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws MountTargetNotFoundException
     * @throws IncorrectMountTargetStateException
     * @throws SecurityGroupLimitExceededException
     * @throws SecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void modifyMountTargetSecurityGroups(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyMountTargetSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyMountTargetSecurityGroupsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyMountTargetSecurityGroupsRequestMarshaller()
                        .marshall(modifyMountTargetSecurityGroupsRequest);
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
     * Applies an Amazon EFS <code>FileSystemPolicy</code> to an Amazon EFS file
     * system. A file system policy is an IAM resource-based policy and can
     * contain multiple policy statements. A file system always has exactly one
     * file system policy, which can be the default policy or an explicit policy
     * set or updated using this API operation. When an explicit policy is set,
     * it overrides the default policy. For more information about the default
     * file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html#default-filesystempolicy"
     * >Default EFS File System Policy</a>.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:PutFileSystemPolicy</code> action.
     * </p>
     * 
     * @param putFileSystemPolicyRequest
     * @return putFileSystemPolicyResult The response from the
     *         PutFileSystemPolicy service method, as returned by Amazon Elastic
     *         File System.
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws InvalidPolicyException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutFileSystemPolicyResult putFileSystemPolicy(
            PutFileSystemPolicyRequest putFileSystemPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putFileSystemPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFileSystemPolicyRequest> request = null;
        Response<PutFileSystemPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFileSystemPolicyRequestMarshaller()
                        .marshall(putFileSystemPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutFileSystemPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutFileSystemPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutFileSystemPolicyResult> responseHandler = new JsonResponseHandler<PutFileSystemPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables lifecycle management by creating a new
     * <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object defines when files in an
     * Amazon EFS file system are automatically transitioned to the lower-cost
     * EFS Infrequent Access (IA) storage class. A
     * <code>LifecycleConfiguration</code> applies to all files in a file
     * system.
     * </p>
     * <p>
     * Each Amazon EFS file system supports one lifecycle configuration, which
     * applies to all files in the file system. If a
     * <code>LifecycleConfiguration</code> object already exists for the
     * specified file system, a <code>PutLifecycleConfiguration</code> call
     * modifies the existing configuration. A
     * <code>PutLifecycleConfiguration</code> call with an empty
     * <code>LifecyclePolicies</code> array in the request body deletes any
     * existing <code>LifecycleConfiguration</code> and disables lifecycle
     * management.
     * </p>
     * <p>
     * In the request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID for the file system for which you are enabling, disabling, or
     * modifying lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code>
     * objects that define when files are moved to the IA storage class. The
     * array can contain only one <code>LifecyclePolicy</code> item.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
     * </p>
     * <p>
     * To apply a <code>LifecycleConfiguration</code> object to an encrypted
     * file system, you need the same AWS Key Management Service (AWS KMS)
     * permissions as when you created the encrypted file system.
     * </p>
     * 
     * @param putLifecycleConfigurationRequest
     * @return putLifecycleConfigurationResult The response from the
     *         PutLifecycleConfiguration service method, as returned by Amazon
     *         Elastic File System.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutLifecycleConfigurationResult putLifecycleConfiguration(
            PutLifecycleConfigurationRequest putLifecycleConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleConfigurationRequest> request = null;
        Response<PutLifecycleConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecycleConfigurationRequestMarshaller()
                        .marshall(putLifecycleConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLifecycleConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutLifecycleConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutLifecycleConfigurationResult> responseHandler = new JsonResponseHandler<PutLifecycleConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a tag for an EFS resource. You can create tags for EFS file
     * systems and access points using this API operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Removes tags from an EFS resource. You can remove tags from EFS file
     * systems and access points using this API operation.
     * </p>
     * <p>
     * This operation requires permissions for the
     * <code>elasticfilesystem:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws FileSystemNotFoundException
     * @throws AccessPointNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates the throughput mode or the amount of provisioned throughput of an
     * existing file system.
     * </p>
     * 
     * @param updateFileSystemRequest
     * @return updateFileSystemResult The response from the UpdateFileSystem
     *         service method, as returned by Amazon Elastic File System.
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws InsufficientThroughputCapacityException
     * @throws InternalServerErrorException
     * @throws ThroughputLimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic File System indicating either a problem with the data
     *             in the request, or a server side issue.
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
