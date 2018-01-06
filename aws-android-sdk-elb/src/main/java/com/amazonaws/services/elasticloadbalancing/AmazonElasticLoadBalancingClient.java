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

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.services.elasticloadbalancing.model.transform.*;

/**
 * Client for accessing Amazon Elastic Load Balancing. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
 */
public class AmazonElasticLoadBalancingClient extends AmazonWebServiceClient implements
        AmazonElasticLoadBalancing {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Elastic Load Balancing
     * exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing. A credentials provider chain will be used
     * that searches for credentials in this order:
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
    public AmazonElasticLoadBalancingClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *            how this client connects to AmazonElasticLoadBalancing (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials.
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
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * and client configuration options.
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
     *            how this client connects to AmazonElasticLoadBalancing (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * provider.
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
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * provider and client configuration options.
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
     *            how this client connects to AmazonElasticLoadBalancing (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticLoadBalancing (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticLoadBalancing (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateListenerExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateLoadBalancerNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicatePolicyNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateTagKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidConfigurationRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInstanceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSchemeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ListenerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerAttributeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyTypeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLoadBalancersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticloadbalancing.amazonaws.com");
        this.endpointPrefix = "elasticloadbalancing";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticloadbalancing/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticloadbalancing/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
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
     * @return addTagsResult The response from the AddTags service method, as
     *         returned by Amazon Elastic Load Balancing.
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
    public AddTagsResult addTags(AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;
        try {
            request = new AddTagsRequestMarshaller().marshall(addTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AddTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return applySecurityGroupsToLoadBalancerResult The response from the
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
    public ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(applySecurityGroupsToLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplySecurityGroupsToLoadBalancerRequest> request = null;
        Response<ApplySecurityGroupsToLoadBalancerResult> response = null;
        try {
            request = new ApplySecurityGroupsToLoadBalancerRequestMarshaller()
                    .marshall(applySecurityGroupsToLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ApplySecurityGroupsToLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return attachLoadBalancerToSubnetsResult The response from the
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
    public AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(
            AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerToSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerToSubnetsRequest> request = null;
        Response<AttachLoadBalancerToSubnetsResult> response = null;
        try {
            request = new AttachLoadBalancerToSubnetsRequestMarshaller()
                    .marshall(attachLoadBalancerToSubnetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AttachLoadBalancerToSubnetsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return configureHealthCheckResult The response from the
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
    public ConfigureHealthCheckResult configureHealthCheck(
            ConfigureHealthCheckRequest configureHealthCheckRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(configureHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfigureHealthCheckRequest> request = null;
        Response<ConfigureHealthCheckResult> response = null;
        try {
            request = new ConfigureHealthCheckRequestMarshaller()
                    .marshall(configureHealthCheckRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ConfigureHealthCheckResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return createAppCookieStickinessPolicyResult The response from the
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
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppCookieStickinessPolicyRequest> request = null;
        Response<CreateAppCookieStickinessPolicyResult> response = null;
        try {
            request = new CreateAppCookieStickinessPolicyRequestMarshaller()
                    .marshall(createAppCookieStickinessPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateAppCookieStickinessPolicyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return createLBCookieStickinessPolicyResult The response from the
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
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLBCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLBCookieStickinessPolicyRequest> request = null;
        Response<CreateLBCookieStickinessPolicyResult> response = null;
        try {
            request = new CreateLBCookieStickinessPolicyRequestMarshaller()
                    .marshall(createLBCookieStickinessPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLBCookieStickinessPolicyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return createLoadBalancerResult The response from the CreateLoadBalancer
     *         service method, as returned by Amazon Elastic Load Balancing.
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
    public CreateLoadBalancerResult createLoadBalancer(
            CreateLoadBalancerRequest createLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerRequest> request = null;
        Response<CreateLoadBalancerResult> response = null;
        try {
            request = new CreateLoadBalancerRequestMarshaller().marshall(createLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLoadBalancerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return createLoadBalancerListenersResult The response from the
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
    public CreateLoadBalancerListenersResult createLoadBalancerListeners(
            CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerListenersRequest> request = null;
        Response<CreateLoadBalancerListenersResult> response = null;
        try {
            request = new CreateLoadBalancerListenersRequestMarshaller()
                    .marshall(createLoadBalancerListenersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLoadBalancerListenersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return createLoadBalancerPolicyResult The response from the
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
    public CreateLoadBalancerPolicyResult createLoadBalancerPolicy(
            CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerPolicyRequest> request = null;
        Response<CreateLoadBalancerPolicyResult> response = null;
        try {
            request = new CreateLoadBalancerPolicyRequestMarshaller()
                    .marshall(createLoadBalancerPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLoadBalancerPolicyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return deleteLoadBalancerResult The response from the DeleteLoadBalancer
     *         service method, as returned by Amazon Elastic Load Balancing.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Load Balancing indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteLoadBalancerResult deleteLoadBalancer(
            DeleteLoadBalancerRequest deleteLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerRequest> request = null;
        Response<DeleteLoadBalancerResult> response = null;
        try {
            request = new DeleteLoadBalancerRequestMarshaller().marshall(deleteLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteLoadBalancerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     * @return deleteLoadBalancerListenersResult The response from the
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
    public DeleteLoadBalancerListenersResult deleteLoadBalancerListeners(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerListenersRequest> request = null;
        Response<DeleteLoadBalancerListenersResult> response = null;
        try {
            request = new DeleteLoadBalancerListenersRequestMarshaller()
                    .marshall(deleteLoadBalancerListenersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteLoadBalancerListenersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest =
     * @return deleteLoadBalancerPolicyResult The response from the
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
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(
            DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerPolicyRequest> request = null;
        Response<DeleteLoadBalancerPolicyResult> response = null;
        try {
            request = new DeleteLoadBalancerPolicyRequestMarshaller()
                    .marshall(deleteLoadBalancerPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteLoadBalancerPolicyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return deregisterInstancesFromLoadBalancerResult The response from the
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
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterInstancesFromLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstancesFromLoadBalancerRequest> request = null;
        Response<DeregisterInstancesFromLoadBalancerResult> response = null;
        try {
            request = new DeregisterInstancesFromLoadBalancerRequestMarshaller()
                    .marshall(deregisterInstancesFromLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DeregisterInstancesFromLoadBalancerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return describeInstanceHealthResult The response from the
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
    public DescribeInstanceHealthResult describeInstanceHealth(
            DescribeInstanceHealthRequest describeInstanceHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstanceHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceHealthRequest> request = null;
        Response<DescribeInstanceHealthResult> response = null;
        try {
            request = new DescribeInstanceHealthRequestMarshaller()
                    .marshall(describeInstanceHealthRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeInstanceHealthResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @return describeLoadBalancerAttributesResult The response from the
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
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerAttributesRequest> request = null;
        Response<DescribeLoadBalancerAttributesResult> response = null;
        try {
            request = new DescribeLoadBalancerAttributesRequestMarshaller()
                    .marshall(describeLoadBalancerAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return describeLoadBalancerPoliciesResult The response from the
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
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerPoliciesRequest> request = null;
        Response<DescribeLoadBalancerPoliciesResult> response = null;
        try {
            request = new DescribeLoadBalancerPoliciesRequestMarshaller()
                    .marshall(describeLoadBalancerPoliciesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerPoliciesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return describeLoadBalancerPolicyTypesResult The response from the
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
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPolicyTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerPolicyTypesRequest> request = null;
        Response<DescribeLoadBalancerPolicyTypesResult> response = null;
        try {
            request = new DescribeLoadBalancerPolicyTypesRequestMarshaller()
                    .marshall(describeLoadBalancerPolicyTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerPolicyTypesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return describeLoadBalancersResult The response from the
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
    public DescribeLoadBalancersResult describeLoadBalancers(
            DescribeLoadBalancersRequest describeLoadBalancersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancersRequest> request = null;
        Response<DescribeLoadBalancersResult> response = null;
        try {
            request = new DescribeLoadBalancersRequestMarshaller()
                    .marshall(describeLoadBalancersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Elastic Load Balancing.
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
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        try {
            request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return detachLoadBalancerFromSubnetsResult The response from the
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
    public DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachLoadBalancerFromSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancerFromSubnetsRequest> request = null;
        Response<DetachLoadBalancerFromSubnetsResult> response = null;
        try {
            request = new DetachLoadBalancerFromSubnetsRequestMarshaller()
                    .marshall(detachLoadBalancerFromSubnetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetachLoadBalancerFromSubnetsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return disableAvailabilityZonesForLoadBalancerResult The response from
     *         the DisableAvailabilityZonesForLoadBalancer service method, as
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
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<DisableAvailabilityZonesForLoadBalancerResult> response = null;
        try {
            request = new DisableAvailabilityZonesForLoadBalancerRequestMarshaller()
                    .marshall(disableAvailabilityZonesForLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DisableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return enableAvailabilityZonesForLoadBalancerResult The response from
     *         the EnableAvailabilityZonesForLoadBalancer service method, as
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
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<EnableAvailabilityZonesForLoadBalancerResult> response = null;
        try {
            request = new EnableAvailabilityZonesForLoadBalancerRequestMarshaller()
                    .marshall(enableAvailabilityZonesForLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new EnableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return modifyLoadBalancerAttributesResult The response from the
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
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyLoadBalancerAttributesRequest> request = null;
        Response<ModifyLoadBalancerAttributesResult> response = null;
        try {
            request = new ModifyLoadBalancerAttributesRequestMarshaller()
                    .marshall(modifyLoadBalancerAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyLoadBalancerAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return registerInstancesWithLoadBalancerResult The response from the
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
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerInstancesWithLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstancesWithLoadBalancerRequest> request = null;
        Response<RegisterInstancesWithLoadBalancerResult> response = null;
        try {
            request = new RegisterInstancesWithLoadBalancerRequestMarshaller()
                    .marshall(registerInstancesWithLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new RegisterInstancesWithLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     * @return removeTagsResult The response from the RemoveTags service method,
     *         as returned by Amazon Elastic Load Balancing.
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
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;
        try {
            request = new RemoveTagsRequestMarshaller().marshall(removeTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RemoveTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return setLoadBalancerListenerSSLCertificateResult The response from the
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
    public SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerListenerSSLCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerListenerSSLCertificateRequest> request = null;
        Response<SetLoadBalancerListenerSSLCertificateResult> response = null;
        try {
            request = new SetLoadBalancerListenerSSLCertificateRequestMarshaller()
                    .marshall(setLoadBalancerListenerSSLCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new SetLoadBalancerListenerSSLCertificateResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return setLoadBalancerPoliciesForBackendServerResult The response from
     *         the SetLoadBalancerPoliciesForBackendServer service method, as
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
    public SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesForBackendServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerPoliciesForBackendServerRequest> request = null;
        Response<SetLoadBalancerPoliciesForBackendServerResult> response = null;
        try {
            request = new SetLoadBalancerPoliciesForBackendServerRequestMarshaller()
                    .marshall(setLoadBalancerPoliciesForBackendServerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new SetLoadBalancerPoliciesForBackendServerResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest
     * @return setLoadBalancerPoliciesOfListenerResult The response from the
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
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesOfListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerPoliciesOfListenerRequest> request = null;
        Response<SetLoadBalancerPoliciesOfListenerResult> response = null;
        try {
            request = new SetLoadBalancerPoliciesOfListenerRequestMarshaller()
                    .marshall(setLoadBalancerPoliciesOfListenerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new SetLoadBalancerPoliciesOfListenerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @return describeLoadBalancerPolicyTypesResult The response from the
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
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes()
            throws AmazonServiceException, AmazonClientException {
        DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest = new DescribeLoadBalancerPolicyTypesRequest();
        return describeLoadBalancerPolicyTypes(describeLoadBalancerPolicyTypesRequest);
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
     * @return describeLoadBalancerPoliciesResult The response from the
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
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies()
            throws AmazonServiceException, AmazonClientException {
        DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest = new DescribeLoadBalancerPoliciesRequest();
        return describeLoadBalancerPolicies(describeLoadBalancerPoliciesRequest);
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     * 
     * @return describeLoadBalancersResult The response from the
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
    public DescribeLoadBalancersResult describeLoadBalancers()
            throws AmazonServiceException, AmazonClientException {
        DescribeLoadBalancersRequest describeLoadBalancersRequest = new DescribeLoadBalancersRequest();
        return describeLoadBalancers(describeLoadBalancersRequest);
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
