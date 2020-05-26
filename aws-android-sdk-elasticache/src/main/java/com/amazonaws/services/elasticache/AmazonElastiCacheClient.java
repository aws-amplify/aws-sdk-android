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

package com.amazonaws.services.elasticache;

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

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.model.transform.*;

/**
 * Client for accessing Amazon ElastiCache. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate,
 * and scale a distributed cache in the cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance,
 * in-memory cache with less of the administrative burden involved in launching
 * and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache
 * deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get
 * enhanced visibility into the key performance statistics associated with their
 * cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
public class AmazonElastiCacheClient extends AmazonWebServiceClient implements AmazonElastiCache {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon ElastiCache exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache. A
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
    public AmazonElastiCacheClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache. A
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
     *            how this client connects to AmazonElastiCache (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElastiCacheClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *         AmazonElastiCacheClient client = new AmazonElastiCacheClient(AWSMobileClient.getInstance());
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
    public AmazonElastiCacheClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *         AmazonElastiCacheClient client = new AmazonElastiCacheClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElastiCache (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *         AmazonElastiCacheClient client = new AmazonElastiCacheClient(AWSMobileClient.getInstance());
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
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *         AmazonElastiCacheClient client = new AmazonElastiCacheClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElastiCache (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *            how this client connects to AmazonElastiCache (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonElastiCache
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
     *         AmazonElastiCacheClient client = new AmazonElastiCacheClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElastiCache (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new APICallRateForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCacheClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidARNExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGlobalReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidKMSKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NodeGroupsPerReplicationGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForClusterExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new ReplicationGroupAlreadyUnderMigrationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotUnderMigrationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceLinkedRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceUpdateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotFeatureNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagQuotaPerResourceExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TestFailoverNotAvailableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticache.us-east-1.amazonaws.com");
        this.endpointPrefix = "elasticache";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticache/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticache/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds up to 50 cost allocation tags to the named resource. A cost
     * allocation tag is a key-value pair where the key and value are
     * case-sensitive. You can use cost allocation tags to categorize and track
     * your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost
     * allocation report as a comma-separated value (CSV) file with your usage
     * and costs aggregated by your tags. You can apply tags that represent
     * business categories (such as cost centers, application names, or owners)
     * to organize your costs across multiple services. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html"
     * >Using Cost Allocation Tags in Amazon ElastiCache</a> in the
     * <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            Represents the input of an AddTagsToResource operation.
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidARNException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
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
            request = new AddTagsToResourceRequestMarshaller().marshall(addTagsToResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AddTagsToResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using
     * ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups
     * are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one
     * region to an ElastiCache cluster in another region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest <p>
     *            Represents the input of an AuthorizeCacheSecurityGroupIngress
     *            operation.
     *            </p>
     * @return authorizeCacheSecurityGroupIngressResult The response from the
     *         AuthorizeCacheSecurityGroupIngress service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AuthorizeCacheSecurityGroupIngressResult authorizeCacheSecurityGroupIngress(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(authorizeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeCacheSecurityGroupIngressRequest> request = null;
        Response<AuthorizeCacheSecurityGroupIngressResult> response = null;
        try {
            request = new AuthorizeCacheSecurityGroupIngressRequestMarshaller()
                    .marshall(authorizeCacheSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new AuthorizeCacheSecurityGroupIngressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Apply the service update. For more information on service updates and
     * applying them, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/applying-updates.html"
     * >Applying Service Updates</a>.
     * </p>
     * 
     * @param batchApplyUpdateActionRequest
     * @return batchApplyUpdateActionResult The response from the
     *         BatchApplyUpdateAction service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchApplyUpdateActionResult batchApplyUpdateAction(
            BatchApplyUpdateActionRequest batchApplyUpdateActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchApplyUpdateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchApplyUpdateActionRequest> request = null;
        Response<BatchApplyUpdateActionResult> response = null;
        try {
            request = new BatchApplyUpdateActionRequestMarshaller()
                    .marshall(batchApplyUpdateActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BatchApplyUpdateActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop the service update. For more information on service updates and
     * stopping them, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/stopping-self-service-updates.html"
     * >Stopping Service Updates</a>.
     * </p>
     * 
     * @param batchStopUpdateActionRequest
     * @return batchStopUpdateActionResult The response from the
     *         BatchStopUpdateAction service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchStopUpdateActionResult batchStopUpdateAction(
            BatchStopUpdateActionRequest batchStopUpdateActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchStopUpdateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStopUpdateActionRequest> request = null;
        Response<BatchStopUpdateActionResult> response = null;
        try {
            request = new BatchStopUpdateActionRequestMarshaller()
                    .marshall(batchStopUpdateActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BatchStopUpdateActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Complete the migration of data.
     * </p>
     * 
     * @param completeMigrationRequest
     * @return completeMigrationResult The response from the CompleteMigration
     *         service method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws ReplicationGroupNotUnderMigrationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CompleteMigrationResult completeMigration(
            CompleteMigrationRequest completeMigrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(completeMigrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteMigrationRequest> request = null;
        Response<CompleteMigrationResult> response = null;
        try {
            request = new CompleteMigrationRequestMarshaller().marshall(completeMigrationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CompleteMigrationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the
     * <code>CopySnapshot</code> operation can create their own Amazon S3
     * buckets and copy snapshots to it. To control access to your snapshots,
     * use an IAM policy to control who has the ability to use the
     * <code>CopySnapshot</code> operation. For more information about using IAM
     * to control the use of ElastiCache operations, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html"
     * >Exporting Snapshots</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html"
     * >Authentication &amp; Access Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated
     * user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
     * snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient
     * permissions to perform the desired activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with
     * key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and
     * unique value. If exporting a snapshot, you could alternatively create a
     * new Amazon S3 bucket and use this same value for
     * <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions
     * %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions
     * %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP
     * permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest <p>
     *            Represents the input of a <code>CopySnapshotMessage</code>
     *            operation.
     *            </p>
     * @return copySnapshotResult The response from the CopySnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<CopySnapshotResult> response = null;
        try {
            request = new CopySnapshotRequestMarshaller().marshall(copySnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopySnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same
     * protocol-compliant cache engine software, either Memcached or Redis.
     * </p>
     * <p>
     * This operation is not supported for Redis (cluster mode enabled)
     * clusters.
     * </p>
     * 
     * @param createCacheClusterRequest <p>
     *            Represents the input of a CreateCacheCluster operation.
     *            </p>
     * @return createCacheClusterResult The response from the CreateCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws CacheClusterAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheSubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCacheClusterResult createCacheCluster(
            CreateCacheClusterRequest createCacheClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheClusterRequest> request = null;
        Response<CreateCacheClusterResult> response = null;
        try {
            request = new CreateCacheClusterRequestMarshaller().marshall(createCacheClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCacheClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache
     * cache parameter group is a collection of parameters and their values that
     * are applied to all of the nodes in any cluster or replication group using
     * the CacheParameterGroup.
     * </p>
     * <p>
     * A newly created CacheParameterGroup is an exact duplicate of the default
     * parameter group for the CacheParameterGroupFamily. To customize the newly
     * created CacheParameterGroup you can change the values of specific
     * parameters. For more information, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html"
     * >ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html"
     * >Parameters and Parameter Groups</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>CreateCacheParameterGroup</code> operation.
     *            </p>
     * @return createCacheParameterGroupResult The response from the
     *         CreateCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupQuotaExceededException
     * @throws CacheParameterGroupAlreadyExistsException
     * @throws InvalidCacheParameterGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCacheParameterGroupResult createCacheParameterGroup(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheParameterGroupRequest> request = null;
        Response<CreateCacheParameterGroupResult> response = null;
        try {
            request = new CreateCacheParameterGroupRequestMarshaller()
                    .marshall(createCacheParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCacheParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control
     * access to one or more clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cluster
     * outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are
     * creating a cluster inside of a VPC, use a cache subnet group instead. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest <p>
     *            Represents the input of a
     *            <code>CreateCacheSecurityGroup</code> operation.
     *            </p>
     * @return createCacheSecurityGroupResult The response from the
     *         CreateCacheSecurityGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSecurityGroupAlreadyExistsException
     * @throws CacheSecurityGroupQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCacheSecurityGroupResult createCacheSecurityGroup(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSecurityGroupRequest> request = null;
        Response<CreateCacheSecurityGroupResult> response = null;
        try {
            request = new CreateCacheSecurityGroupRequestMarshaller()
                    .marshall(createCacheSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCacheSecurityGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon
     * Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>CreateCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @return createCacheSubnetGroupResult The response from the
     *         CreateCacheSubnetGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupAlreadyExistsException
     * @throws CacheSubnetGroupQuotaExceededException
     * @throws CacheSubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCacheSubnetGroupResult createCacheSubnetGroup(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSubnetGroupRequest> request = null;
        Response<CreateCacheSubnetGroupResult> response = null;
        try {
            request = new CreateCacheSubnetGroupRequestMarshaller()
                    .marshall(createCacheSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCacheSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Global Datastore for Redis offers fully managed, fast, reliable and
     * secure cross-region replication. Using Global Datastore for Redis, you
     * can create cross-region read replica clusters for ElastiCache for Redis
     * to enable low-latency reads and disaster recovery across regions. For
     * more information, see <a
     * href="/AmazonElastiCache/latest/red-ug/Redis-Global-Clusters.html"
     * >Replication Across Regions Using Global Datastore</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> is the name of the Global
     * Datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <b>PrimaryReplicationGroupId</b> represents the name of the primary
     * cluster that accepts writes and will replicate updates to the secondary
     * cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGlobalReplicationGroupRequest
     * @return createGlobalReplicationGroupResult The response from the
     *         CreateGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws GlobalReplicationGroupAlreadyExistsException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGlobalReplicationGroupResult createGlobalReplicationGroup(
            CreateGlobalReplicationGroupRequest createGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalReplicationGroupRequest> request = null;
        Response<CreateGlobalReplicationGroupResult> response = null;
        try {
            request = new CreateGlobalReplicationGroupRequestMarshaller()
                    .marshall(createGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled)
     * replication group.
     * </p>
     * <p>
     * This API can be used to create a standalone regional replication group or
     * a secondary replication group associated with a Global Datastore.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of
     * clusters, where one of the clusters is a read/write primary and the
     * others are read-only replicas. Writes to the primary are asynchronously
     * propagated to the replicas.
     * </p>
     * <p>
     * A Redis (cluster mode enabled) replication group is a collection of 1 to
     * 90 node groups (shards). Each node group (shard) has one read/write
     * primary node and up to 5 read-only replica nodes. Writes to the primary
     * are asynchronously propagated to the replicas. Redis (cluster mode
     * enabled) replication groups partition the data across node groups
     * (shards).
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been
     * successfully created, you can add one or more read replicas to it, up to
     * a total of 5 read replicas. You cannot alter a Redis (cluster mode
     * enabled) replication group after it has been created. However, if you
     * need to increase or decrease the number of node groups (console: shards),
     * you can avail yourself of ElastiCache for Redis' enhanced backup and
     * restore. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-restoring.html"
     * >Restoring From a Backup with Cluster Resizing</a> in the <i>ElastiCache
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest <p>
     *            Represents the input of a <code>CreateReplicationGroup</code>
     *            operation.
     *            </p>
     * @return createReplicationGroupResult The response from the
     *         CreateReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws ReplicationGroupAlreadyExistsException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheSubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws TagQuotaPerResourceExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateReplicationGroupResult createReplicationGroup(
            CreateReplicationGroupRequest createReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationGroupRequest> request = null;
        Response<CreateReplicationGroupResult> response = null;
        try {
            request = new CreateReplicationGroupRequestMarshaller()
                    .marshall(createReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a copy of an entire cluster or replication group at a specific
     * moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest <p>
     *            Represents the input of a <code>CreateSnapshot</code>
     *            operation.
     *            </p>
     * @return createSnapshotResult The response from the CreateSnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotAlreadyExistsException
     * @throws CacheClusterNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidReplicationGroupStateException
     * @throws SnapshotQuotaExceededException
     * @throws SnapshotFeatureNotSupportedException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;
        try {
            request = new CreateSnapshotRequestMarshaller().marshall(createSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateSnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Decreases the number of node groups in a Global Datastore
     * </p>
     * 
     * @param decreaseNodeGroupsInGlobalReplicationGroupRequest
     * @return decreaseNodeGroupsInGlobalReplicationGroupResult The response
     *         from the DecreaseNodeGroupsInGlobalReplicationGroup service
     *         method, as returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DecreaseNodeGroupsInGlobalReplicationGroupResult decreaseNodeGroupsInGlobalReplicationGroup(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(decreaseNodeGroupsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> request = null;
        Response<DecreaseNodeGroupsInGlobalReplicationGroupResult> response = null;
        try {
            request = new DecreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller()
                    .marshall(decreaseNodeGroupsInGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DecreaseNodeGroupsInGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dynamically decreases the number of replicas in a Redis (cluster mode
     * disabled) replication group or the number of replica nodes in one or more
     * node groups (shards) of a Redis (cluster mode enabled) replication group.
     * This operation is performed with no cluster down time.
     * </p>
     * 
     * @param decreaseReplicaCountRequest
     * @return decreaseReplicaCountResult The response from the
     *         DecreaseReplicaCount service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws NoOperationException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DecreaseReplicaCountResult decreaseReplicaCount(
            DecreaseReplicaCountRequest decreaseReplicaCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(decreaseReplicaCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseReplicaCountRequest> request = null;
        Response<DecreaseReplicaCountResult> response = null;
        try {
            request = new DecreaseReplicaCountRequestMarshaller()
                    .marshall(decreaseReplicaCountRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DecreaseReplicaCountResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned cluster. <code>DeleteCacheCluster</code>
     * deletes all associated cache nodes, node endpoints and the cluster
     * itself. When you receive a successful response from this operation,
     * Amazon ElastiCache immediately begins deleting the cluster; you cannot
     * cancel or revert this operation.
     * </p>
     * <p>
     * This operation is not valid for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode enabled) clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is the last read replica of a replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A node group (shard) that has Multi-AZ mode enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster from a Redis (cluster mode enabled) replication group
     * </p>
     * </li>
     * <li>
     * <p>
     * A cluster that is not in the <code>available</code> state
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteCacheClusterRequest <p>
     *            Represents the input of a <code>DeleteCacheCluster</code>
     *            operation.
     *            </p>
     * @return deleteCacheClusterResult The response from the DeleteCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidCacheClusterStateException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotFeatureNotSupportedException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCacheClusterResult deleteCacheCluster(
            DeleteCacheClusterRequest deleteCacheClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheClusterRequest> request = null;
        Response<DeleteCacheClusterResult> response = null;
        try {
            request = new DeleteCacheClusterRequestMarshaller().marshall(deleteCacheClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteCacheClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache
     * parameter group if it is associated with any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>DeleteCacheParameterGroup</code> operation.
     *            </p>
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteCacheParameterGroup(
            DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheParameterGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteCacheParameterGroupRequestMarshaller()
                    .marshall(deleteCacheParameterGroupRequest);
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
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest <p>
     *            Represents the input of a
     *            <code>DeleteCacheSecurityGroup</code> operation.
     *            </p>
     * @throws InvalidCacheSecurityGroupStateException
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteCacheSecurityGroup(
            DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSecurityGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteCacheSecurityGroupRequestMarshaller()
                    .marshall(deleteCacheSecurityGroupRequest);
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
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any
     * clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>DeleteCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @throws CacheSubnetGroupInUseException
     * @throws CacheSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSubnetGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteCacheSubnetGroupRequestMarshaller()
                    .marshall(deleteCacheSubnetGroupRequest);
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
     * Deleting a Global Datastore is a two-step process:
     * </p>
     * <ul>
     * <li>
     * <p>
     * First, you must <a>DisassociateGlobalReplicationGroup</a> to remove the
     * secondary clusters in the Global Datastore.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the Global Datastore contains only the primary cluster, you can use
     * DeleteGlobalReplicationGroup API to delete the Global Datastore while
     * retainining the primary cluster using Retain…= true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Since the Global Datastore has only a primary cluster, you can delete the
     * Global Datastore while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteGlobalReplicationGroupRequest
     * @return deleteGlobalReplicationGroupResult The response from the
     *         DeleteGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGlobalReplicationGroupResult deleteGlobalReplicationGroup(
            DeleteGlobalReplicationGroupRequest deleteGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalReplicationGroupRequest> request = null;
        Response<DeleteGlobalReplicationGroupResult> response = null;
        try {
            request = new DeleteGlobalReplicationGroupRequestMarshaller()
                    .marshall(deleteGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes
     * the entire replication group, including the primary/primaries and all of
     * the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by
     * setting <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon
     * ElastiCache immediately begins deleting the selected resources; you
     * cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest <p>
     *            Represents the input of a <code>DeleteReplicationGroup</code>
     *            operation.
     *            </p>
     * @return deleteReplicationGroupResult The response from the
     *         DeleteReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotFeatureNotSupportedException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteReplicationGroupResult deleteReplicationGroup(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationGroupRequest> request = null;
        Response<DeleteReplicationGroupResult> response = null;
        try {
            request = new DeleteReplicationGroupRequestMarshaller()
                    .marshall(deleteReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from
     * this operation, ElastiCache immediately begins deleting the snapshot; you
     * cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest <p>
     *            Represents the input of a <code>DeleteSnapshot</code>
     *            operation.
     *            </p>
     * @return deleteSnapshotResult The response from the DeleteSnapshot service
     *         method, as returned by Amazon ElastiCache.
     * @throws SnapshotNotFoundException
     * @throws InvalidSnapshotStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;
        try {
            request = new DeleteSnapshotRequestMarshaller().marshall(deleteSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteSnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster
     * identifier is specified, or about a specific cache cluster if a cluster
     * identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the clusters is returned. You
     * can use the optional <i>ShowCacheNodeInfo</i> flag to retrieve detailed
     * information about the cache nodes associated with the clusters. These
     * details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the <i>creating</i> state, only cluster-level
     * information is displayed until all of the nodes are successfully
     * provisioned.
     * </p>
     * <p>
     * If the cluster is in the <i>deleting</i> state, only cluster-level
     * information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cluster, node endpoint
     * information and creation time for the additional nodes are not displayed
     * until they are completely provisioned. When the cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cluster, no endpoint
     * information for the removed nodes is displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest <p>
     *            Represents the input of a <code>DescribeCacheClusters</code>
     *            operation.
     *            </p>
     * @return describeCacheClustersResult The response from the
     *         DescribeCacheClusters service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheClustersResult describeCacheClusters(
            DescribeCacheClustersRequest describeCacheClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheClustersRequest> request = null;
        Response<DescribeCacheClustersResult> response = null;
        try {
            request = new DescribeCacheClustersRequestMarshaller()
                    .marshall(describeCacheClustersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheClustersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheEngineVersions</code> operation.
     *            </p>
     * @return describeCacheEngineVersionsResult The response from the
     *         DescribeCacheEngineVersions service method, as returned by Amazon
     *         ElastiCache.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheEngineVersionsRequest> request = null;
        Response<DescribeCacheEngineVersionsResult> response = null;
        try {
            request = new DescribeCacheEngineVersionsRequestMarshaller()
                    .marshall(describeCacheEngineVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheEngineVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache
     * parameter group name is specified, the list contains only the
     * descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheParameterGroups</code> operation.
     *            </p>
     * @return describeCacheParameterGroupsResult The response from the
     *         DescribeCacheParameterGroups service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(
            DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParameterGroupsRequest> request = null;
        Response<DescribeCacheParameterGroupsResult> response = null;
        try {
            request = new DescribeCacheParameterGroupsRequestMarshaller()
                    .marshall(describeCacheParameterGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheParameterGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter
     * group.
     * </p>
     * 
     * @param describeCacheParametersRequest <p>
     *            Represents the input of a <code>DescribeCacheParameters</code>
     *            operation.
     *            </p>
     * @return describeCacheParametersResult The response from the
     *         DescribeCacheParameters service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheParametersResult describeCacheParameters(
            DescribeCacheParametersRequest describeCacheParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParametersRequest> request = null;
        Response<DescribeCacheParametersResult> response = null;
        try {
            request = new DescribeCacheParametersRequestMarshaller()
                    .marshall(describeCacheParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security
     * group name is specified, the list contains only the description of that
     * group. This applicable only when you have ElastiCache in Classic setup
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheSecurityGroups</code> operation.
     *            </p>
     * @return describeCacheSecurityGroupsResult The response from the
     *         DescribeCacheSecurityGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(
            DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSecurityGroupsRequest> request = null;
        Response<DescribeCacheSecurityGroupsResult> response = null;
        try {
            request = new DescribeCacheSecurityGroupsRequestMarshaller()
                    .marshall(describeCacheSecurityGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheSecurityGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name
     * is specified, the list contains only the description of that group. This
     * is applicable only when you have ElastiCache in VPC setup. All
     * ElastiCache clusters now launch in VPC by default.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeCacheSubnetGroups</code> operation.
     *            </p>
     * @return describeCacheSubnetGroupsResult The response from the
     *         DescribeCacheSubnetGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSubnetGroupsRequest> request = null;
        Response<DescribeCacheSubnetGroupsResult> response = null;
        try {
            request = new DescribeCacheSubnetGroupsRequestMarshaller()
                    .marshall(describeCacheSubnetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCacheSubnetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest <p>
     *            Represents the input of a
     *            <code>DescribeEngineDefaultParameters</code> operation.
     *            </p>
     * @return describeEngineDefaultParametersResult The response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         Amazon ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEngineDefaultParametersResult describeEngineDefaultParameters(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<DescribeEngineDefaultParametersResult> response = null;
        try {
            request = new DescribeEngineDefaultParametersRequestMarshaller()
                    .marshall(describeEngineDefaultParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEngineDefaultParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to clusters, cache security groups, and cache
     * parameter groups. You can obtain events specific to a particular cluster,
     * cache security group, or cache parameter group by providing the name as a
     * parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned;
     * however, you can retrieve up to 14 days' worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest <p>
     *            Represents the input of a <code>DescribeEvents</code>
     *            operation.
     *            </p>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by Amazon ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Returns information about a particular global replication group. If no
     * identifier is specified, returns information about all Global Datastores.
     * </p>
     * 
     * @param describeGlobalReplicationGroupsRequest
     * @return describeGlobalReplicationGroupsResult The response from the
     *         DescribeGlobalReplicationGroups service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeGlobalReplicationGroupsResult describeGlobalReplicationGroups(
            DescribeGlobalReplicationGroupsRequest describeGlobalReplicationGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGlobalReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalReplicationGroupsRequest> request = null;
        Response<DescribeGlobalReplicationGroupsResult> response = null;
        try {
            request = new DescribeGlobalReplicationGroupsRequestMarshaller()
                    .marshall(describeGlobalReplicationGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeGlobalReplicationGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a particular replication group. If no
     * identifier is specified, <code>DescribeReplicationGroups</code> returns
     * information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest <p>
     *            Represents the input of a
     *            <code>DescribeReplicationGroups</code> operation.
     *            </p>
     * @return describeReplicationGroupsResult The response from the
     *         DescribeReplicationGroups service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeReplicationGroupsResult describeReplicationGroups(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationGroupsRequest> request = null;
        Response<DescribeReplicationGroupsResult> response = null;
        try {
            request = new DescribeReplicationGroupsRequestMarshaller()
                    .marshall(describeReplicationGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeReplicationGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about
     * a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest <p>
     *            Represents the input of a
     *            <code>DescribeReservedCacheNodes</code> operation.
     *            </p>
     * @return describeReservedCacheNodesResult The response from the
     *         DescribeReservedCacheNodes service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReservedCacheNodeNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesRequest> request = null;
        Response<DescribeReservedCacheNodesResult> response = null;
        try {
            request = new DescribeReservedCacheNodesRequestMarshaller()
                    .marshall(describeReservedCacheNodesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeReservedCacheNodesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest <p>
     *            Represents the input of a
     *            <code>DescribeReservedCacheNodesOfferings</code> operation.
     *            </p>
     * @return describeReservedCacheNodesOfferingsResult The response from the
     *         DescribeReservedCacheNodesOfferings service method, as returned
     *         by Amazon ElastiCache.
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesOfferingsRequest> request = null;
        Response<DescribeReservedCacheNodesOfferingsResult> response = null;
        try {
            request = new DescribeReservedCacheNodesOfferingsRequestMarshaller()
                    .marshall(describeReservedCacheNodesOfferingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeReservedCacheNodesOfferingsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return describeServiceUpdatesResult The response from the
     *         DescribeServiceUpdates service method, as returned by Amazon
     *         ElastiCache.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeServiceUpdatesResult describeServiceUpdates(
            DescribeServiceUpdatesRequest describeServiceUpdatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeServiceUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceUpdatesRequest> request = null;
        Response<DescribeServiceUpdatesResult> response = null;
        try {
            request = new DescribeServiceUpdatesRequestMarshaller()
                    .marshall(describeServiceUpdatesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeServiceUpdatesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about cluster or replication group snapshots. By
     * default, <code>DescribeSnapshots</code> lists all of your snapshots; it
     * can optionally describe a single snapshot, or just the snapshots
     * associated with a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest <p>
     *            Represents the input of a
     *            <code>DescribeSnapshotsMessage</code> operation.
     *            </p>
     * @return describeSnapshotsResult The response from the DescribeSnapshots
     *         service method, as returned by Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots(
            DescribeSnapshotsRequest describeSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;
        try {
            request = new DescribeSnapshotsRequestMarshaller().marshall(describeSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details of the update actions
     * </p>
     * 
     * @param describeUpdateActionsRequest
     * @return describeUpdateActionsResult The response from the
     *         DescribeUpdateActions service method, as returned by Amazon
     *         ElastiCache.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUpdateActionsResult describeUpdateActions(
            DescribeUpdateActionsRequest describeUpdateActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUpdateActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUpdateActionsRequest> request = null;
        Response<DescribeUpdateActionsResult> response = null;
        try {
            request = new DescribeUpdateActionsRequestMarshaller()
                    .marshall(describeUpdateActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeUpdateActionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a secondary cluster from the Global Datastore using the Global
     * Datastore name. The secondary cluster will no longer receive updates from
     * the primary cluster, but will remain as a standalone cluster in that AWS
     * region.
     * </p>
     * 
     * @param disassociateGlobalReplicationGroupRequest
     * @return disassociateGlobalReplicationGroupResult The response from the
     *         DisassociateGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateGlobalReplicationGroupResult disassociateGlobalReplicationGroup(
            DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateGlobalReplicationGroupRequest> request = null;
        Response<DisassociateGlobalReplicationGroupResult> response = null;
        try {
            request = new DisassociateGlobalReplicationGroupRequestMarshaller()
                    .marshall(disassociateGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DisassociateGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to failover the primary region to a selected secondary region. The
     * selected secondary region will be come primary, and all other clusters
     * will become secondary.
     * </p>
     * 
     * @param failoverGlobalReplicationGroupRequest
     * @return failoverGlobalReplicationGroupResult The response from the
     *         FailoverGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public FailoverGlobalReplicationGroupResult failoverGlobalReplicationGroup(
            FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(failoverGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FailoverGlobalReplicationGroupRequest> request = null;
        Response<FailoverGlobalReplicationGroupResult> response = null;
        try {
            request = new FailoverGlobalReplicationGroupRequestMarshaller()
                    .marshall(failoverGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new FailoverGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Increase the number of node groups in the Global Datastore
     * </p>
     * 
     * @param increaseNodeGroupsInGlobalReplicationGroupRequest
     * @return increaseNodeGroupsInGlobalReplicationGroupResult The response
     *         from the IncreaseNodeGroupsInGlobalReplicationGroup service
     *         method, as returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupResult increaseNodeGroupsInGlobalReplicationGroup(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(increaseNodeGroupsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> request = null;
        Response<IncreaseNodeGroupsInGlobalReplicationGroupResult> response = null;
        try {
            request = new IncreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller()
                    .marshall(increaseNodeGroupsInGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new IncreaseNodeGroupsInGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dynamically increases the number of replics in a Redis (cluster mode
     * disabled) replication group or the number of replica nodes in one or more
     * node groups (shards) of a Redis (cluster mode enabled) replication group.
     * This operation is performed with no cluster down time.
     * </p>
     * 
     * @param increaseReplicaCountRequest
     * @return increaseReplicaCountResult The response from the
     *         IncreaseReplicaCount service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws NoOperationException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public IncreaseReplicaCountResult increaseReplicaCount(
            IncreaseReplicaCountRequest increaseReplicaCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(increaseReplicaCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseReplicaCountRequest> request = null;
        Response<IncreaseReplicaCountResult> response = null;
        try {
            request = new IncreaseReplicaCountRequestMarshaller()
                    .marshall(increaseReplicaCountRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new IncreaseReplicaCountResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or
     * replication group's current node type.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or
     * <code>ModifyReplicationGroup</code> operations to scale your cluster or
     * replication group, the value of the <code>CacheNodeType</code> parameter
     * must be one of the node types returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest <p>
     *            The input parameters for the
     *            <code>ListAllowedNodeTypeModifications</code> operation.
     *            </p>
     * @return listAllowedNodeTypeModificationsResult The response from the
     *         ListAllowedNodeTypeModifications service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAllowedNodeTypeModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAllowedNodeTypeModificationsRequest> request = null;
        Response<ListAllowedNodeTypeModificationsResult> response = null;
        try {
            request = new ListAllowedNodeTypeModificationsRequestMarshaller()
                    .marshall(listAllowedNodeTypeModificationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListAllowedNodeTypeModificationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all cost allocation tags currently on the named resource. A
     * <code>cost allocation tag</code> is a key-value pair where the key is
     * case-sensitive and the value is optional. You can use cost allocation
     * tags to categorize and track your AWS costs.
     * </p>
     * <p>
     * If the cluster is not in the <i>available</i> state,
     * <code>ListTagsForResource</code> returns an error.
     * </p>
     * <p>
     * You can have a maximum of 50 cost allocation tags on an ElastiCache
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html"
     * >Monitoring Costs with Tags</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            The input parameters for the <code>ListTagsForResource</code>
     *            operation.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Modifies the settings for a cluster. You can use this operation to change
     * one or more cluster configuration parameters by specifying the parameters
     * and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest <p>
     *            Represents the input of a <code>ModifyCacheCluster</code>
     *            operation.
     *            </p>
     * @return modifyCacheClusterResult The response from the ModifyCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws InvalidCacheClusterStateException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheClusterNotFoundException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyCacheClusterResult modifyCacheCluster(
            ModifyCacheClusterRequest modifyCacheClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheClusterRequest> request = null;
        Response<ModifyCacheClusterResult> response = null;
        try {
            request = new ModifyCacheClusterRequestMarshaller().marshall(modifyCacheClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyCacheClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to
     * 20 parameters in a single request by submitting a list parameter name and
     * value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>ModifyCacheParameterGroup</code> operation.
     *            </p>
     * @return modifyCacheParameterGroupResult The response from the
     *         ModifyCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidCacheParameterGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheParameterGroupRequest> request = null;
        Response<ModifyCacheParameterGroupResult> response = null;
        try {
            request = new ModifyCacheParameterGroupRequestMarshaller()
                    .marshall(modifyCacheParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyCacheParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest <p>
     *            Represents the input of a <code>ModifyCacheSubnetGroup</code>
     *            operation.
     *            </p>
     * @return modifyCacheSubnetGroupResult The response from the
     *         ModifyCacheSubnetGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheSubnetGroupNotFoundException
     * @throws CacheSubnetQuotaExceededException
     * @throws SubnetInUseException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheSubnetGroupRequest> request = null;
        Response<ModifyCacheSubnetGroupResult> response = null;
        try {
            request = new ModifyCacheSubnetGroupRequestMarshaller()
                    .marshall(modifyCacheSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyCacheSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a Global Datastore.
     * </p>
     * 
     * @param modifyGlobalReplicationGroupRequest
     * @return modifyGlobalReplicationGroupResult The response from the
     *         ModifyGlobalReplicationGroup service method, as returned by
     *         Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyGlobalReplicationGroupResult modifyGlobalReplicationGroup(
            ModifyGlobalReplicationGroupRequest modifyGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyGlobalReplicationGroupRequest> request = null;
        Response<ModifyGlobalReplicationGroupResult> response = null;
        try {
            request = new ModifyGlobalReplicationGroupRequestMarshaller()
                    .marshall(modifyGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html"
     * >Scaling for Amazon ElastiCache for Redis (cluster mode enabled)</a> in
     * the ElastiCache User Guide
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroupShardConfiguration.html"
     * >ModifyReplicationGroupShardConfiguration</a> in the ElastiCache API
     * Reference
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest <p>
     *            Represents the input of a <code>ModifyReplicationGroups</code>
     *            operation.
     *            </p>
     * @return modifyReplicationGroupResult The response from the
     *         ModifyReplicationGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws CacheClusterNotFoundException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws CacheSecurityGroupNotFoundException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyReplicationGroupResult modifyReplicationGroup(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupRequest> request = null;
        Response<ModifyReplicationGroupResult> response = null;
        try {
            request = new ModifyReplicationGroupRequestMarshaller()
                    .marshall(modifyReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a replication group's shards (node groups) by allowing you to
     * add shards, remove shards, or rebalance the keyspaces among exisiting
     * shards.
     * </p>
     * 
     * @param modifyReplicationGroupShardConfigurationRequest <p>
     *            Represents the input for a
     *            <code>ModifyReplicationGroupShardConfiguration</code>
     *            operation.
     *            </p>
     * @return modifyReplicationGroupShardConfigurationResult The response from
     *         the ModifyReplicationGroupShardConfiguration service method, as
     *         returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidVPCNetworkStateException
     * @throws InsufficientCacheClusterCapacityException
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyReplicationGroupShardConfigurationResult modifyReplicationGroupShardConfiguration(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupShardConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupShardConfigurationRequest> request = null;
        Response<ModifyReplicationGroupShardConfigurationResult> response = null;
        try {
            request = new ModifyReplicationGroupShardConfigurationRequestMarshaller()
                    .marshall(modifyReplicationGroupShardConfigurationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ModifyReplicationGroupShardConfigurationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest <p>
     *            Represents the input of a
     *            <code>PurchaseReservedCacheNodesOffering</code> operation.
     *            </p>
     * @return purchaseReservedCacheNodesOfferingResult The response from the
     *         PurchaseReservedCacheNodesOffering service method, as returned by
     *         Amazon ElastiCache.
     * @throws ReservedCacheNodesOfferingNotFoundException
     * @throws ReservedCacheNodeAlreadyExistsException
     * @throws ReservedCacheNodeQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PurchaseReservedCacheNodesOfferingResult purchaseReservedCacheNodesOffering(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedCacheNodesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedCacheNodesOfferingRequest> request = null;
        Response<PurchaseReservedCacheNodesOfferingResult> response = null;
        try {
            request = new PurchaseReservedCacheNodesOfferingRequestMarshaller()
                    .marshall(purchaseReservedCacheNodesOfferingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new PurchaseReservedCacheNodesOfferingResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Redistribute slots to ensure uniform distribution across existing shards
     * in the cluster.
     * </p>
     * 
     * @param rebalanceSlotsInGlobalReplicationGroupRequest
     * @return rebalanceSlotsInGlobalReplicationGroupResult The response from
     *         the RebalanceSlotsInGlobalReplicationGroup service method, as
     *         returned by Amazon ElastiCache.
     * @throws GlobalReplicationGroupNotFoundException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RebalanceSlotsInGlobalReplicationGroupResult rebalanceSlotsInGlobalReplicationGroup(
            RebalanceSlotsInGlobalReplicationGroupRequest rebalanceSlotsInGlobalReplicationGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebalanceSlotsInGlobalReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebalanceSlotsInGlobalReplicationGroupRequest> request = null;
        Response<RebalanceSlotsInGlobalReplicationGroupResult> response = null;
        try {
            request = new RebalanceSlotsInGlobalReplicationGroupRequestMarshaller()
                    .marshall(rebalanceSlotsInGlobalReplicationGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new RebalanceSlotsInGlobalReplicationGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cluster.
     * This operation applies any modified cache parameter groups to the
     * cluster. The reboot operation takes place as soon as possible, and
     * results in a momentary outage to the cluster. During the reboot, the
     * cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being
     * rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cluster event is created.
     * </p>
     * <p>
     * Rebooting a cluster is currently supported on Memcached and Redis
     * (cluster mode disabled) clusters. Rebooting is not supported on Redis
     * (cluster mode enabled) clusters.
     * </p>
     * <p>
     * If you make changes to parameters that require a Redis (cluster mode
     * enabled) cluster reboot for the changes to be applied, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Rebooting.html"
     * >Rebooting a Cluster</a> for an alternate process.
     * </p>
     * 
     * @param rebootCacheClusterRequest <p>
     *            Represents the input of a <code>RebootCacheCluster</code>
     *            operation.
     *            </p>
     * @return rebootCacheClusterResult The response from the RebootCacheCluster
     *         service method, as returned by Amazon ElastiCache.
     * @throws InvalidCacheClusterStateException
     * @throws CacheClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RebootCacheClusterResult rebootCacheCluster(
            RebootCacheClusterRequest rebootCacheClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootCacheClusterRequest> request = null;
        Response<RebootCacheClusterResult> response = null;
        try {
            request = new RebootCacheClusterRequestMarshaller().marshall(rebootCacheClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RebootCacheClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the
     * named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            Represents the input of a <code>RemoveTagsFromResource</code>
     *            operation.
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         ElastiCache.
     * @throws CacheClusterNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws TagNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
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
            request = new RemoveTagsFromResourceRequestMarshaller()
                    .marshall(removeTagsFromResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RemoveTagsFromResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or
     * system default value. You can reset specific parameters by submitting a
     * list of parameter names. To reset the entire cache parameter group,
     * specify the <code>ResetAllParameters</code> and
     * <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest <p>
     *            Represents the input of a
     *            <code>ResetCacheParameterGroup</code> operation.
     *            </p>
     * @return resetCacheParameterGroupResult The response from the
     *         ResetCacheParameterGroup service method, as returned by Amazon
     *         ElastiCache.
     * @throws InvalidCacheParameterGroupStateException
     * @throws CacheParameterGroupNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidGlobalReplicationGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResetCacheParameterGroupResult resetCacheParameterGroup(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheParameterGroupRequest> request = null;
        Response<ResetCacheParameterGroupResult> response = null;
        try {
            request = new ResetCacheParameterGroupRequestMarshaller()
                    .marshall(resetCacheParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResetCacheParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to
     * disallow access from an Amazon EC2 security group that had been
     * previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest <p>
     *            Represents the input of a
     *            <code>RevokeCacheSecurityGroupIngress</code> operation.
     *            </p>
     * @return revokeCacheSecurityGroupIngressResult The response from the
     *         RevokeCacheSecurityGroupIngress service method, as returned by
     *         Amazon ElastiCache.
     * @throws CacheSecurityGroupNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws InvalidCacheSecurityGroupStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RevokeCacheSecurityGroupIngressResult revokeCacheSecurityGroupIngress(
            RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeCacheSecurityGroupIngressRequest> request = null;
        Response<RevokeCacheSecurityGroupIngressResult> response = null;
        try {
            request = new RevokeCacheSecurityGroupIngressRequestMarshaller()
                    .marshall(revokeCacheSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RevokeCacheSecurityGroupIngressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start the migration of data.
     * </p>
     * 
     * @param startMigrationRequest
     * @return startMigrationResult The response from the StartMigration service
     *         method, as returned by Amazon ElastiCache.
     * @throws ReplicationGroupNotFoundException
     * @throws InvalidReplicationGroupStateException
     * @throws ReplicationGroupAlreadyUnderMigrationException
     * @throws InvalidParameterValueException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartMigrationResult startMigration(StartMigrationRequest startMigrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMigrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMigrationRequest> request = null;
        Response<StartMigrationResult> response = null;
        try {
            request = new StartMigrationRequestMarshaller().marshall(startMigrationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StartMigrationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the input of a <code>TestFailover</code> operation which test
     * automatic failover on a specified node group (called shard in the
     * console) in a replication group (called cluster in the console).
     * </p>
     * <p class="title">
     * <b>Note the following</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A customer can use this operation to test automatic failover on up to 5
     * shards (called node groups in the ElastiCache API and AWS CLI) in any
     * rolling 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * If calling this operation on shards in different clusters (called
     * replication groups in the API and CLI), the calls can be made
     * concurrently.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * If calling this operation multiple times on different shards in the same
     * Redis (cluster mode enabled) replication group, the first node
     * replacement must complete before a subsequent call can be made.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether the node replacement is complete you can check
     * Events using the Amazon ElastiCache console, the AWS CLI, or the
     * ElastiCache API. Look for the following automatic failover related
     * events, listed here in order of occurrance:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Replication group message:
     * <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replication group message:
     * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Recovering cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache cluster message:
     * <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html"
     * >Viewing ElastiCache Events</a> in the <i>ElastiCache User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html"
     * >DescribeEvents</a> in the ElastiCache API Reference
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Also see, <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test"
     * >Testing Multi-AZ with Automatic Failover</a> in the <i>ElastiCache User
     * Guide</i>.
     * </p>
     * 
     * @param testFailoverRequest
     * @return testFailoverResult The response from the TestFailover service
     *         method, as returned by Amazon ElastiCache.
     * @throws APICallRateForCustomerExceededException
     * @throws InvalidCacheClusterStateException
     * @throws InvalidReplicationGroupStateException
     * @throws NodeGroupNotFoundException
     * @throws ReplicationGroupNotFoundException
     * @throws TestFailoverNotAvailableException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ElastiCache indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestFailoverResult testFailover(TestFailoverRequest testFailoverRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testFailoverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestFailoverRequest> request = null;
        Response<TestFailoverResult> response = null;
        try {
            request = new TestFailoverRequestMarshaller().marshall(testFailoverRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new TestFailoverResultStaxUnmarshaller(), executionContext);
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
