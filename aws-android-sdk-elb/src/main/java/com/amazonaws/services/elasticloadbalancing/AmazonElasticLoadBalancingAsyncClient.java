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

package com.amazonaws.services.elasticloadbalancing;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing Amazon Elastic Load Balancing asynchronously.
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * Elastic Load Balancing distributes incoming traffic across your EC2
 * instances.
 * </p>
 * <p>
 * For information about the features of Elastic Load Balancing, see <a href=
 * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elastic-load-balancing.html"
 * >What Is Elastic Load Balancing?</a> in the <i>Elastic Load Balancing
 * Developer Guide</i>.
 * </p>
 * <p>
 * For information about the AWS regions supported by Elastic Load Balancing,
 * see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"
 * >Regions and Endpoints - Elastic Load Balancing</a> in the <i>Amazon Web
 * Services General Reference</i>.
 * </p>
 * <p>
 * All Elastic Load Balancing operations are <i>idempotent</i>, which means that
 * they complete at most one time. If you repeat an operation, it succeeds with
 * a 200 OK response code.
 * </p>
 **/
public class AmazonElasticLoadBalancingAsyncClient extends AmazonElasticLoadBalancingClient
        implements AmazonElasticLoadBalancingAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing. A credentials provider chain will be used that
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
    public AmazonElasticLoadBalancingAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing. A credentials provider chain will be used that
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
     *            how this client connects to Amazon Elastic Load Balancing (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will
     * be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials and
     * executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials,
     * executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials
     * provider. Default client settings will be used, and a fixed size thread
     * pool will be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Elastic Load Balancing using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same
     * key is already associated with the load balancer, <code>AddTags</code>
     * updates its value.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/add-remove-tags.html"
     * >Tag Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param addTagsRequest
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws TooManyTagsException <p>
     *             The quota for the number of tags that can be assigned to a
     *             load balancer has been reached.
     *             </p>
     * @throws DuplicateTagKeysException <p>
     *             A tag key was specified more than once.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(final AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
                return addTags(addTagsRequest);
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same
     * key is already associated with the load balancer, <code>AddTags</code>
     * updates its value.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/add-remove-tags.html"
     * >Tag Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param addTagsRequest
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws TooManyTagsException <p>
     *             The quota for the number of tags that can be assigned to a
     *             load balancer has been reached.
     *             </p>
     * @throws DuplicateTagKeysException <p>
     *             A tag key was specified more than once.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(final AddTagsRequest addTagsRequest,
            final AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsResult>() {
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;
                try {
                    result = addTags(addTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(addTagsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override the
     * previously associated security groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-groups.html#elb-vpc-security-groups"
     * >Security Groups for Load Balancers in a VPC</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param applySecurityGroupsToLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws InvalidSecurityGroupException <p>
     *             One or more of the specified security groups do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            final ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ApplySecurityGroupsToLoadBalancerResult>() {
            public ApplySecurityGroupsToLoadBalancerResult call() throws Exception {
                return applySecurityGroupsToLoadBalancer(applySecurityGroupsToLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override the
     * previously associated security groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-groups.html#elb-vpc-security-groups"
     * >Security Groups for Load Balancers in a VPC</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param applySecurityGroupsToLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws InvalidSecurityGroupException <p>
     *             One or more of the specified security groups do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            final ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest,
            final AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ApplySecurityGroupsToLoadBalancerResult>() {
            public ApplySecurityGroupsToLoadBalancerResult call() throws Exception {
                ApplySecurityGroupsToLoadBalancerResult result = null;
                try {
                    result = applySecurityGroupsToLoadBalancer(applySecurityGroupsToLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(applySecurityGroupsToLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-manage-subnets.html"
     * >Add or Remove Subnets for Your Load Balancer in a VPC</a> in the
     * <i>Elastic Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerToSubnetsRequest
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws SubnetNotFoundException <p>
     *             One or more of the specified subnets do not exist.
     *             </p>
     * @throws InvalidSubnetException <p>
     *             The specified VPC has no associated Internet gateway.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            final AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerToSubnetsResult>() {
            public AttachLoadBalancerToSubnetsResult call() throws Exception {
                return attachLoadBalancerToSubnets(attachLoadBalancerToSubnetsRequest);
            }
        });
    }

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-manage-subnets.html"
     * >Add or Remove Subnets for Your Load Balancer in a VPC</a> in the
     * <i>Elastic Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerToSubnetsRequest
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws SubnetNotFoundException <p>
     *             One or more of the specified subnets do not exist.
     *             </p>
     * @throws InvalidSubnetException <p>
     *             The specified VPC has no associated Internet gateway.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            final AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest,
            final AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AttachLoadBalancerToSubnetsResult>() {
            public AttachLoadBalancerToSubnetsResult call() throws Exception {
                AttachLoadBalancerToSubnetsResult result = null;
                try {
                    result = attachLoadBalancerToSubnets(attachLoadBalancerToSubnetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(attachLoadBalancerToSubnetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-healthchecks.html"
     * >Configure Health Checks</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param configureHealthCheckRequest
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(
            final ConfigureHealthCheckRequest configureHealthCheckRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfigureHealthCheckResult>() {
            public ConfigureHealthCheckResult call() throws Exception {
                return configureHealthCheck(configureHealthCheckRequest);
            }
        });
    }

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-healthchecks.html"
     * >Configure Health Checks</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param configureHealthCheckRequest
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(
            final ConfigureHealthCheckRequest configureHealthCheckRequest,
            final AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfigureHealthCheckResult>() {
            public ConfigureHealthCheckResult call() throws Exception {
                ConfigureHealthCheckResult result = null;
                try {
                    result = configureHealthCheck(configureHealthCheckRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(configureHealthCheckRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that follow
     * that of an application-generated cookie. This policy can be associated
     * only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the
     * lifetime of the application-generated cookie specified in the policy
     * configuration. The load balancer only inserts a new stickiness cookie
     * when the application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the session
     * stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param createAppCookieStickinessPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            final CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppCookieStickinessPolicyResult>() {
            public CreateAppCookieStickinessPolicyResult call() throws Exception {
                return createAppCookieStickinessPolicy(createAppCookieStickinessPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that follow
     * that of an application-generated cookie. This policy can be associated
     * only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the
     * lifetime of the application-generated cookie specified in the policy
     * configuration. The load balancer only inserts a new stickiness cookie
     * when the application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the session
     * stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param createAppCookieStickinessPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            final CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest,
            final AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAppCookieStickinessPolicyResult>() {
            public CreateAppCookieStickinessPolicyResult call() throws Exception {
                CreateAppCookieStickinessPolicyResult result = null;
                try {
                    result = createAppCookieStickinessPolicy(createAppCookieStickinessPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createAppCookieStickinessPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes controlled by
     * the lifetime of the browser (user-agent) or a specified expiration
     * period. This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if this
     * cookie is present in the request. If so, the load balancer sends the
     * request to the application server specified in the cookie. If not, the
     * load balancer sends the request to a server that is chosen based on the
     * existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent requests
     * from the same user to that server. The validity of the cookie is based on
     * the cookie expiration time, which is specified in the policy
     * configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * 
     * @param createLBCookieStickinessPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            final CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLBCookieStickinessPolicyResult>() {
            public CreateLBCookieStickinessPolicyResult call() throws Exception {
                return createLBCookieStickinessPolicy(createLBCookieStickinessPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes controlled by
     * the lifetime of the browser (user-agent) or a specified expiration
     * period. This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if this
     * cookie is present in the request. If so, the load balancer sends the
     * request to the application server specified in the cookie. If not, the
     * load balancer sends the request to a server that is chosen based on the
     * existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent requests
     * from the same user to that server. The validity of the cookie is based on
     * the cookie expiration time, which is specified in the policy
     * configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * 
     * @param createLBCookieStickinessPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            final CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest,
            final AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLBCookieStickinessPolicyResult>() {
            public CreateLBCookieStickinessPolicyResult call() throws Exception {
                CreateLBCookieStickinessPolicyResult result = null;
                try {
                    result = createLBCookieStickinessPolicy(createLBCookieStickinessPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLBCookieStickinessPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created with a
     * unique Domain Name Service (DNS) name. The load balancer receives
     * incoming traffic and routes it to the registered instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/how-elb-works.html"
     * >How Elastic Load Balancing Works</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can
     * request an increase for the number of load balancers for your account.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"
     * >Elastic Load Balancing Limits</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws DuplicateLoadBalancerNameException <p>
     *             The specified load balancer name already exists for this
     *             account.
     *             </p>
     * @throws TooManyLoadBalancersException <p>
     *             The quota for the number of load balancers has been reached.
     *             </p>
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws SubnetNotFoundException <p>
     *             One or more of the specified subnets do not exist.
     *             </p>
     * @throws InvalidSubnetException <p>
     *             The specified VPC has no associated Internet gateway.
     *             </p>
     * @throws InvalidSecurityGroupException <p>
     *             One or more of the specified security groups do not exist.
     *             </p>
     * @throws InvalidSchemeException <p>
     *             The specified value for the schema is not valid. You can only
     *             specify a scheme for load balancers in a VPC.
     *             </p>
     * @throws TooManyTagsException <p>
     *             The quota for the number of tags that can be assigned to a
     *             load balancer has been reached.
     *             </p>
     * @throws DuplicateTagKeysException <p>
     *             A tag key was specified more than once.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(
            final CreateLoadBalancerRequest createLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerResult>() {
            public CreateLoadBalancerResult call() throws Exception {
                return createLoadBalancer(createLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created with a
     * unique Domain Name Service (DNS) name. The load balancer receives
     * incoming traffic and routes it to the registered instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/how-elb-works.html"
     * >How Elastic Load Balancing Works</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can
     * request an increase for the number of load balancers for your account.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"
     * >Elastic Load Balancing Limits</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws DuplicateLoadBalancerNameException <p>
     *             The specified load balancer name already exists for this
     *             account.
     *             </p>
     * @throws TooManyLoadBalancersException <p>
     *             The quota for the number of load balancers has been reached.
     *             </p>
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws SubnetNotFoundException <p>
     *             One or more of the specified subnets do not exist.
     *             </p>
     * @throws InvalidSubnetException <p>
     *             The specified VPC has no associated Internet gateway.
     *             </p>
     * @throws InvalidSecurityGroupException <p>
     *             One or more of the specified security groups do not exist.
     *             </p>
     * @throws InvalidSchemeException <p>
     *             The specified value for the schema is not valid. You can only
     *             specify a scheme for load balancers in a VPC.
     *             </p>
     * @throws TooManyTagsException <p>
     *             The quota for the number of tags that can be assigned to a
     *             load balancer has been reached.
     *             </p>
     * @throws DuplicateTagKeysException <p>
     *             A tag key was specified more than once.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(
            final CreateLoadBalancerRequest createLoadBalancerRequest,
            final AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerResult>() {
            public CreateLoadBalancerResult call() throws Exception {
                CreateLoadBalancerResult result = null;
                try {
                    result = createLoadBalancer(createLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is created;
     * otherwise, the properties of the new listener must match the properties
     * of the existing listener.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"
     * >Add a Listener to Your Load Balancer</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerListenersRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicateListenerException <p>
     *             A listener already exists for the specified
     *             <code>LoadBalancerName</code> and
     *             <code>LoadBalancerPort</code>, but with a different
     *             <code>InstancePort</code>, <code>Protocol</code>, or
     *             <code>SSLCertificateId</code>.
     *             </p>
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            final CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerListenersResult>() {
            public CreateLoadBalancerListenersResult call() throws Exception {
                return createLoadBalancerListeners(createLoadBalancerListenersRequest);
            }
        });
    }

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is created;
     * otherwise, the properties of the new listener must match the properties
     * of the existing listener.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"
     * >Add a Listener to Your Load Balancer</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerListenersRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws DuplicateListenerException <p>
     *             A listener already exists for the specified
     *             <code>LoadBalancerName</code> and
     *             <code>LoadBalancerPort</code>, but with a different
     *             <code>InstancePort</code>, <code>Protocol</code>, or
     *             <code>SSLCertificateId</code>.
     *             </p>
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            final CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest,
            final AsyncHandler<CreateLoadBalancerListenersRequest, CreateLoadBalancerListenersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerListenersResult>() {
            public CreateLoadBalancerListenersResult call() throws Exception {
                CreateLoadBalancerListenersResult result = null;
                try {
                    result = createLoadBalancerListeners(createLoadBalancerListenersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLoadBalancerListenersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that can
     * be applied to the front-end listener or the back-end application server,
     * depending on the policy type.
     * </p>
     * 
     * @param createLoadBalancerPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyTypeNotFoundException <p>
     *             One or more of the specified policy types do not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(
            final CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerPolicyResult>() {
            public CreateLoadBalancerPolicyResult call() throws Exception {
                return createLoadBalancerPolicy(createLoadBalancerPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that can
     * be applied to the front-end listener or the back-end application server,
     * depending on the policy type.
     * </p>
     * 
     * @param createLoadBalancerPolicyRequest
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyTypeNotFoundException <p>
     *             One or more of the specified policy types do not exist.
     *             </p>
     * @throws DuplicatePolicyNameException <p>
     *             A policy with the specified name already exists for this load
     *             balancer.
     *             </p>
     * @throws TooManyPoliciesException <p>
     *             The quota for the number of policies for this load balancer
     *             has been reached.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(
            final CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest,
            final AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLoadBalancerPolicyResult>() {
            public CreateLoadBalancerPolicyResult call() throws Exception {
                CreateLoadBalancerPolicyResult result = null;
                try {
                    result = createLoadBalancerPolicy(createLoadBalancerPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLoadBalancerPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must reconfigure
     * all settings. The DNS name associated with a deleted load balancer are no
     * longer usable. The name and associated DNS record of the deleted load
     * balancer no longer exist and traffic sent to any of its IP addresses is
     * no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the call
     * to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(
            final DeleteLoadBalancerRequest deleteLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerResult>() {
            public DeleteLoadBalancerResult call() throws Exception {
                return deleteLoadBalancer(deleteLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must reconfigure
     * all settings. The DNS name associated with a deleted load balancer are no
     * longer usable. The name and associated DNS record of the deleted load
     * balancer no longer exist and traffic sent to any of its IP addresses is
     * no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the call
     * to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by Amazon Elastic
     *         Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(
            final DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            final AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerResult>() {
            public DeleteLoadBalancerResult call() throws Exception {
                DeleteLoadBalancerResult result = null;
                try {
                    result = deleteLoadBalancer(deleteLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            final DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerListenersResult>() {
            public DeleteLoadBalancerListenersResult call() throws Exception {
                return deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            final DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest,
            final AsyncHandler<DeleteLoadBalancerListenersRequest, DeleteLoadBalancerListenersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerListenersResult>() {
            public DeleteLoadBalancerListenersResult call() throws Exception {
                DeleteLoadBalancerListenersResult result = null;
                try {
                    result = deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLoadBalancerListenersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest =
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(
            final DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerPolicyResult>() {
            public DeleteLoadBalancerPolicyResult call() throws Exception {
                return deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest =
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(
            final DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest,
            final AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLoadBalancerPolicyResult>() {
            public DeleteLoadBalancerPolicyResult call() throws Exception {
                DeleteLoadBalancerPolicyResult result = null;
                try {
                    result = deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLoadBalancerPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"
     * >Deregister and Register Amazon EC2 Instances</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param deregisterInstancesFromLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            final DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterInstancesFromLoadBalancerResult>() {
            public DeregisterInstancesFromLoadBalancerResult call() throws Exception {
                return deregisterInstancesFromLoadBalancer(deregisterInstancesFromLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"
     * >Deregister and Register Amazon EC2 Instances</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param deregisterInstancesFromLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            final DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest,
            final AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterInstancesFromLoadBalancerResult>() {
            public DeregisterInstancesFromLoadBalancerResult call() throws Exception {
                DeregisterInstancesFromLoadBalancerResult result = null;
                try {
                    result = deregisterInstancesFromLoadBalancer(deregisterInstancesFromLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deregisterInstancesFromLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered with
     * the load balancer. If instances are specified, their state is returned
     * even if they are no longer registered with the load balancer. The state
     * of terminated instances is not returned.
     * </p>
     * 
     * @param describeInstanceHealthRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(
            final DescribeInstanceHealthRequest describeInstanceHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceHealthResult>() {
            public DescribeInstanceHealthResult call() throws Exception {
                return describeInstanceHealth(describeInstanceHealthRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered with
     * the load balancer. If instances are specified, their state is returned
     * even if they are no longer registered with the load balancer. The state
     * of terminated instances is not returned.
     * </p>
     * 
     * @param describeInstanceHealthRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(
            final DescribeInstanceHealthRequest describeInstanceHealthRequest,
            final AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceHealthResult>() {
            public DescribeInstanceHealthResult call() throws Exception {
                DescribeInstanceHealthResult result = null;
                try {
                    result = describeInstanceHealth(describeInstanceHealthRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceHealthRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws LoadBalancerAttributeNotFoundException <p>
     *             The specified load balancer attribute does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            final DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerAttributesResult>() {
            public DescribeLoadBalancerAttributesResult call() throws Exception {
                return describeLoadBalancerAttributes(describeLoadBalancerAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws LoadBalancerAttributeNotFoundException <p>
     *             The specified load balancer attribute does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            final DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            final AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerAttributesResult>() {
            public DescribeLoadBalancerAttributesResult call() throws Exception {
                DescribeLoadBalancerAttributesResult result = null;
                try {
                    result = describeLoadBalancerAttributes(describeLoadBalancerAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancerAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the descriptions
     * of all policies created for the load balancer. If you specify a policy
     * name associated with your load balancer, the action returns the
     * description of that policy. If you don't specify a load balancer name,
     * the action returns descriptions of the specified sample policies, or
     * descriptions of all sample policies. The names of the sample policies
     * have the <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @param describeLoadBalancerPoliciesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            final DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPoliciesResult>() {
            public DescribeLoadBalancerPoliciesResult call() throws Exception {
                return describeLoadBalancerPolicies(describeLoadBalancerPoliciesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the descriptions
     * of all policies created for the load balancer. If you specify a policy
     * name associated with your load balancer, the action returns the
     * description of that policy. If you don't specify a load balancer name,
     * the action returns descriptions of the specified sample policies, or
     * descriptions of all sample policies. The names of the sample policies
     * have the <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @param describeLoadBalancerPoliciesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            final DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest,
            final AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPoliciesResult>() {
            public DescribeLoadBalancerPoliciesResult call() throws Exception {
                DescribeLoadBalancerPoliciesResult result = null;
                try {
                    result = describeLoadBalancerPolicies(describeLoadBalancerPoliciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancerPoliciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with <a>CreateLoadBalancerPolicy</a> to
     * create policy configurations for a load balancer.
     * </p>
     * 
     * @param describeLoadBalancerPolicyTypesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws PolicyTypeNotFoundException <p>
     *             One or more of the specified policy types do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            final DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPolicyTypesResult>() {
            public DescribeLoadBalancerPolicyTypesResult call() throws Exception {
                return describeLoadBalancerPolicyTypes(describeLoadBalancerPolicyTypesRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with <a>CreateLoadBalancerPolicy</a> to
     * create policy configurations for a load balancer.
     * </p>
     * 
     * @param describeLoadBalancerPolicyTypesRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws PolicyTypeNotFoundException <p>
     *             One or more of the specified policy types do not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            final DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest,
            final AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancerPolicyTypesResult>() {
            public DescribeLoadBalancerPolicyTypesResult call() throws Exception {
                DescribeLoadBalancerPolicyTypesResult result = null;
                try {
                    result = describeLoadBalancerPolicyTypes(describeLoadBalancerPolicyTypesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancerPolicyTypesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
                return describeLoadBalancers(describeLoadBalancersRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by Amazon
     *         Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest describeLoadBalancersRequest,
            final AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLoadBalancersResult>() {
            public DescribeLoadBalancersResult call() throws Exception {
                DescribeLoadBalancersResult result = null;
                try {
                    result = describeLoadBalancers(describeLoadBalancersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLoadBalancersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Elastic Load
     *         Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                return describeTags(describeTagsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by Amazon Elastic Load
     *         Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest,
            final AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;
                try {
                    result = describeTags(describeTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeTagsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for the
     * load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the remaining
     * routable subnets.
     * </p>
     * 
     * @param detachLoadBalancerFromSubnetsRequest
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            final DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerFromSubnetsResult>() {
            public DetachLoadBalancerFromSubnetsResult call() throws Exception {
                return detachLoadBalancerFromSubnets(detachLoadBalancerFromSubnetsRequest);
            }
        });
    }

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for the
     * load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the remaining
     * routable subnets.
     * </p>
     * 
     * @param detachLoadBalancerFromSubnetsRequest
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            final DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest,
            final AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetachLoadBalancerFromSubnetsResult>() {
            public DetachLoadBalancerFromSubnetsResult call() throws Exception {
                DetachLoadBalancerFromSubnetsResult result = null;
                try {
                    result = detachLoadBalancerFromSubnets(detachLoadBalancerFromSubnetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detachLoadBalancerFromSubnetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then, the
     * load balancer attempts to equally balance the traffic among its remaining
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"
     * >Disable an Availability Zone from a Load-Balanced Application</a> in the
     * <i>Elastic Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param disableAvailabilityZonesForLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            final DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DisableAvailabilityZonesForLoadBalancerResult>() {
                    public DisableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                        return disableAvailabilityZonesForLoadBalancer(disableAvailabilityZonesForLoadBalancerRequest);
                    }
                });
    }

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then, the
     * load balancer attempts to equally balance the traffic among its remaining
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"
     * >Disable an Availability Zone from a Load-Balanced Application</a> in the
     * <i>Elastic Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param disableAvailabilityZonesForLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            final DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest,
            final AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DisableAvailabilityZonesForLoadBalancerResult>() {
                    public DisableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                        DisableAvailabilityZonesForLoadBalancerResult result = null;
                        try {
                            result = disableAvailabilityZonesForLoadBalancer(disableAvailabilityZonesForLoadBalancerRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(disableAvailabilityZonesForLoadBalancerRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability Zones
     * for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its registered
     * Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"
     * >Add Availability Zone</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param enableAvailabilityZonesForLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            final EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableAvailabilityZonesForLoadBalancerResult>() {
            public EnableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                return enableAvailabilityZonesForLoadBalancer(enableAvailabilityZonesForLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability Zones
     * for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its registered
     * Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"
     * >Add Availability Zone</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * </p>
     * 
     * @param enableAvailabilityZonesForLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            final EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest,
            final AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableAvailabilityZonesForLoadBalancerResult>() {
            public EnableAvailabilityZonesForLoadBalancerResult call() throws Exception {
                EnableAvailabilityZonesForLoadBalancerResult result = null;
                try {
                    result = enableAvailabilityZonesForLoadBalancer(enableAvailabilityZonesForLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(enableAvailabilityZonesForLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code>, <code>ConnectionDraining</code>, and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling them.
     * Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection timeout
     * value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load Balancing
     * Developer Guide</i>:
     * </p>
     * <ul>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"
     * >Cross-Zone Load Balancing</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"
     * >Access Logs</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"
     * >Idle Connection Timeout</a></li>
     * </ul>
     * 
     * @param modifyLoadBalancerAttributesRequest
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws LoadBalancerAttributeNotFoundException <p>
     *             The specified load balancer attribute does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            final ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLoadBalancerAttributesResult>() {
            public ModifyLoadBalancerAttributesResult call() throws Exception {
                return modifyLoadBalancerAttributes(modifyLoadBalancerAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code>, <code>ConnectionDraining</code>, and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling them.
     * Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection timeout
     * value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load Balancing
     * Developer Guide</i>:
     * </p>
     * <ul>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"
     * >Cross-Zone Load Balancing</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"
     * >Access Logs</a></li>
     * <li><a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"
     * >Idle Connection Timeout</a></li>
     * </ul>
     * 
     * @param modifyLoadBalancerAttributesRequest
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws LoadBalancerAttributeNotFoundException <p>
     *             The specified load balancer attribute does not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            final ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            final AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLoadBalancerAttributesResult>() {
            public ModifyLoadBalancerAttributesResult call() throws Exception {
                ModifyLoadBalancerAttributesResult result = null;
                try {
                    result = modifyLoadBalancerAttributes(modifyLoadBalancerAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(modifyLoadBalancerAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the load
     * balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances
     * and a load balancer in a VPC with ClassicLink enabled, you can link the
     * EC2-Classic instances to that VPC and then register the linked
     * EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when
     * the request has been registered. Instance registration takes a little
     * time to complete. To check the state of the registered instances, use
     * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of the
     * Availability Zones registered for the load balancer is moved to the
     * <code>OutOfService</code> state. If an Availability Zone is added to the
     * load balancer later, any instances registered with the load balancer move
     * to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then start
     * it, the IP addresses associated with the instance changes. Elastic Load
     * Balancing cannot recognize the new IP address, which prevents it from
     * routing traffic to the instances. We recommend that you use the following
     * sequence: stop the instance, deregister the instance, start the instance,
     * and then register the instance. To deregister instances from a load
     * balancer, use <a>DeregisterInstancesFromLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"
     * >Deregister and Register EC2 Instances</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param registerInstancesWithLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            final RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstancesWithLoadBalancerResult>() {
            public RegisterInstancesWithLoadBalancerResult call() throws Exception {
                return registerInstancesWithLoadBalancer(registerInstancesWithLoadBalancerRequest);
            }
        });
    }

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the load
     * balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances
     * and a load balancer in a VPC with ClassicLink enabled, you can link the
     * EC2-Classic instances to that VPC and then register the linked
     * EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when
     * the request has been registered. Instance registration takes a little
     * time to complete. To check the state of the registered instances, use
     * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of the
     * Availability Zones registered for the load balancer is moved to the
     * <code>OutOfService</code> state. If an Availability Zone is added to the
     * load balancer later, any instances registered with the load balancer move
     * to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then start
     * it, the IP addresses associated with the instance changes. Elastic Load
     * Balancing cannot recognize the new IP address, which prevents it from
     * routing traffic to the instances. We recommend that you use the following
     * sequence: stop the instance, deregister the instance, start the instance,
     * and then register the instance. To deregister instances from a load
     * balancer, use <a>DeregisterInstancesFromLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"
     * >Deregister and Register EC2 Instances</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * </p>
     * 
     * @param registerInstancesWithLoadBalancerRequest
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws InvalidInstanceException <p>
     *             The specified endpoint is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            final RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest,
            final AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterInstancesWithLoadBalancerResult>() {
            public RegisterInstancesWithLoadBalancerResult call() throws Exception {
                RegisterInstancesWithLoadBalancerResult result = null;
                try {
                    result = registerInstancesWithLoadBalancer(registerInstancesWithLoadBalancerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(registerInstancesWithLoadBalancerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     * @return A Java Future object containing the response from the RemoveTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest removeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
                return removeTags(removeTagsRequest);
            }
        });
    }

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     * @return A Java Future object containing the response from the RemoveTags
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest removeTagsRequest,
            final AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsResult>() {
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;
                try {
                    result = removeTags(removeTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(removeTagsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"
     * >Updating an SSL Certificate for a Load Balancer</a> in the <i>Elastic
     * Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerListenerSSLCertificateRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws ListenerNotFoundException <p>
     *             The load balancer does not have a listener configured at the
     *             specified port.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            final SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerListenerSSLCertificateResult>() {
            public SetLoadBalancerListenerSSLCertificateResult call() throws Exception {
                return setLoadBalancerListenerSSLCertificate(setLoadBalancerListenerSSLCertificateRequest);
            }
        });
    }

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"
     * >Updating an SSL Certificate for a Load Balancer</a> in the <i>Elastic
     * Load Balancing Developer Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerListenerSSLCertificateRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned
     *         by Amazon Elastic Load Balancing.
     * @throws CertificateNotFoundException <p>
     *             The specified SSL ID does not refer to a valid SSL
     *             certificate in AWS Identity and Access Management (IAM).
     *             </p>
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws ListenerNotFoundException <p>
     *             The load balancer does not have a listener configured at the
     *             specified port.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            final SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest,
            final AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, SetLoadBalancerListenerSSLCertificateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerListenerSSLCertificateResult>() {
            public SetLoadBalancerListenerSSLCertificateResult call() throws Exception {
                SetLoadBalancerListenerSSLCertificateResult result = null;
                try {
                    result = setLoadBalancerListenerSSLCertificate(setLoadBalancerListenerSSLCertificateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setLoadBalancerListenerSSLCertificateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on which
     * the back-end server is listening with a new set of policies. At this
     * time, only the back-end server authentication policy type can be applied
     * to the back-end ports; this policy type is composed of multiple public
     * key policies.
     * </p>
     * <p>
     * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to
     * enable the policies, use the <code>PolicyNames</code> parameter to list
     * the policies that you want to enable.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> or
     * <a>DescribeLoadBalancerPolicies</a> to verify that the policy is
     * associated with the back-end server.
     * </p>
     * 
     * @param setLoadBalancerPoliciesForBackendServerRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            final SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<SetLoadBalancerPoliciesForBackendServerResult>() {
                    public SetLoadBalancerPoliciesForBackendServerResult call() throws Exception {
                        return setLoadBalancerPoliciesForBackendServer(setLoadBalancerPoliciesForBackendServerRequest);
                    }
                });
    }

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on which
     * the back-end server is listening with a new set of policies. At this
     * time, only the back-end server authentication policy type can be applied
     * to the back-end ports; this policy type is composed of multiple public
     * key policies.
     * </p>
     * <p>
     * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to
     * enable the policies, use the <code>PolicyNames</code> parameter to list
     * the policies that you want to enable.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> or
     * <a>DescribeLoadBalancerPolicies</a> to verify that the policy is
     * associated with the back-end server.
     * </p>
     * 
     * @param setLoadBalancerPoliciesForBackendServerRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as
     *         returned by Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            final SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest,
            final AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<SetLoadBalancerPoliciesForBackendServerResult>() {
                    public SetLoadBalancerPoliciesForBackendServerResult call() throws Exception {
                        SetLoadBalancerPoliciesForBackendServerResult result = null;
                        try {
                            result = setLoadBalancerPoliciesForBackendServer(setLoadBalancerPoliciesForBackendServerRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(setLoadBalancerPoliciesForBackendServerRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws ListenerNotFoundException <p>
     *             The load balancer does not have a listener configured at the
     *             specified port.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            final SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesOfListenerResult>() {
            public SetLoadBalancerPoliciesOfListenerResult call() throws Exception {
                return setLoadBalancerPoliciesOfListener(setLoadBalancerPoliciesOfListenerRequest);
            }
        });
    }

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         Amazon Elastic Load Balancing.
     * @throws LoadBalancerNotFoundException <p>
     *             The specified load balancer does not exist.
     *             </p>
     * @throws PolicyNotFoundException <p>
     *             One or more of the specified policies do not exist.
     *             </p>
     * @throws ListenerNotFoundException <p>
     *             The load balancer does not have a listener configured at the
     *             specified port.
     *             </p>
     * @throws InvalidConfigurationRequestException <p>
     *             The requested configuration change is not valid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            final SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest,
            final AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetLoadBalancerPoliciesOfListenerResult>() {
            public SetLoadBalancerPoliciesOfListenerResult call() throws Exception {
                SetLoadBalancerPoliciesOfListenerResult result = null;
                try {
                    result = setLoadBalancerPoliciesOfListener(setLoadBalancerPoliciesOfListenerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setLoadBalancerPoliciesOfListenerRequest, result);
                return result;
            }
        });
    }

}
