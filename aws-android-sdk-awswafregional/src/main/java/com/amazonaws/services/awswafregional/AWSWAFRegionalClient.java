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

package com.amazonaws.services.awswafregional;

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

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.services.awswafregional.model.transform.*;

/**
 * Client for accessing AWS WAF Regional. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <note>
 * <p>
 * This is <b>AWS WAF Classic Regional</b> documentation. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * This is the <i>AWS WAF Regional Classic API Reference</i> for using AWS WAF
 * Classic with the AWS resources, Elastic Load Balancing (ELB) Application Load
 * Balancers and API Gateway APIs. The AWS WAF Classic actions and data types
 * listed in the reference are available for protecting Elastic Load Balancing
 * (ELB) Application Load Balancers and API Gateway APIs. You can use these
 * actions and data types by means of the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region"
 * >AWS Regions and Endpoints</a>. This guide is for developers who need
 * detailed information about the AWS WAF Classic API actions, data types, and
 * errors. For detailed information about AWS WAF Classic features and an
 * overview of how to use the AWS WAF Classic API, see the <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 */
public class AWSWAFRegionalClient extends AmazonWebServiceClient implements AWSWAFRegional {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS WAF Regional exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional. A
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
    public AWSWAFRegionalClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional. A
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
     *            how this client connects to AWSWAFRegional (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSWAFRegionalClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials.
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
     *         AWSWAFRegionalClient client = new AWSWAFRegionalClient(AWSMobileClient.getInstance());
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
    public AWSWAFRegionalClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials and client configuration options.
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
     *         AWSWAFRegionalClient client = new AWSWAFRegionalClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSWAFRegional (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSWAFRegionalClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials provider.
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
     *         AWSWAFRegionalClient client = new AWSWAFRegionalClient(AWSMobileClient.getInstance());
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
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials provider and client configuration
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
     *         AWSWAFRegionalClient client = new AWSWAFRegionalClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSWAFRegional (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSWAFRegional (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSWAFRegional using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AWSWAFRegionalClient client = new AWSWAFRegionalClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSWAFRegional (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new WAFBadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFDisallowedNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFEntityMigrationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInvalidAccountExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInvalidOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInvalidPermissionPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFInvalidRegexPatternExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFLimitsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFNonEmptyEntityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFNonexistentContainerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFNonexistentItemExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFReferencedItemExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFServiceLinkedRoleErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFStaleDataExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFSubscriptionNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFTagOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFTagOperationInternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new WAFUnavailableEntityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("waf-regional.us-east-1.amazonaws.com");
        this.endpointPrefix = "waf-regional";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awswafregional/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awswafregional/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a web ACL with a resource, either an application load balancer
     * or Amazon API Gateway stage.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return associateWebACLResult The response from the AssociateWebACL
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws WAFUnavailableEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateWebACLResult associateWebACL(AssociateWebACLRequest associateWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebACLRequest> request = null;
        Response<AssociateWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebACLRequestMarshaller().marshall(associateWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateWebACLResult, JsonUnmarshallerContext> unmarshaller = new AssociateWebACLResultJsonUnmarshaller();
            JsonResponseHandler<AssociateWebACLResult> responseHandler = new JsonResponseHandler<AssociateWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use
     * <a>UpdateByteMatchSet</a> to identify the part of a web request that you
     * want AWS WAF to inspect, such as the values of the
     * <code>User-Agent</code> header or the query string. For example, you can
     * create a <code>ByteMatchSet</code> that matches any requests with
     * <code>User-Agent</code> headers that contain the string
     * <code>BadBot</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the
     * request that you want AWS WAF to inspect (for example, the header or the
     * URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @return createByteMatchSetResult The response from the CreateByteMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateByteMatchSetResult createByteMatchSet(
            CreateByteMatchSetRequest createByteMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateByteMatchSetRequest> request = null;
        Response<CreateByteMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateByteMatchSetRequestMarshaller()
                        .marshall(createByteMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateByteMatchSetResult, JsonUnmarshallerContext> unmarshaller = new CreateByteMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateByteMatchSetResult> responseHandler = new JsonResponseHandler<CreateByteMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>GeoMatchSet</a>, which you use to specify which web
     * requests you want to allow or block based on the country that the
     * requests originate from. For example, if you're receiving a lot of
     * requests from one or more countries and you want to block the requests,
     * you can create an <code>GeoMatchSet</code> that contains those countries
     * and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>GeoMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateGeoMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateGeoMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSetSet</code> request to specify the
     * countries that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createGeoMatchSetRequest
     * @return createGeoMatchSetResult The response from the CreateGeoMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGeoMatchSetResult createGeoMatchSet(
            CreateGeoMatchSetRequest createGeoMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGeoMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGeoMatchSetRequest> request = null;
        Response<CreateGeoMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGeoMatchSetRequestMarshaller()
                        .marshall(createGeoMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGeoMatchSetResult, JsonUnmarshallerContext> unmarshaller = new CreateGeoMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateGeoMatchSetResult> responseHandler = new JsonResponseHandler<CreateGeoMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests that
     * you want to allow or block based on the IP addresses that the requests
     * originate from. For example, if you're receiving a lot of requests from
     * one or more individual IP addresses or one or more ranges of IP addresses
     * and you want to block the requests, you can create an <code>IPSet</code>
     * that contains those IP addresses and then configure AWS WAF to block the
     * requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @return createIPSetResult The response from the CreateIPSet service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIPSetRequest> request = null;
        Response<CreateIPSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIPSetRequestMarshaller().marshall(createIPSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIPSetResult, JsonUnmarshallerContext> unmarshaller = new CreateIPSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateIPSetResult> responseHandler = new JsonResponseHandler<CreateIPSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a
     * <code>RateLimit</code>, which specifies the maximum number of requests
     * that AWS WAF allows from a specified IP address in a five-minute period.
     * The <code>RateBasedRule</code> also contains the <code>IPSet</code>
     * objects, <code>ByteMatchSet</code> objects, and other predicates that
     * identify the requests that you want to count or block if these requests
     * exceed the <code>RateLimit</code>.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a
     * request not only must exceed the <code>RateLimit</code>, but it also must
     * match all the conditions to be counted or blocked. For example, suppose
     * you add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and
     * specify that you want to block requests that meet the conditions in the
     * rule. For a request to be blocked, it must come from the IP address
     * 192.0.2.44 <i>and</i> the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code>. Further, requests that match
     * these two conditions must be received at a rate of more than 1,000
     * requests every five minutes. If both conditions are met and the rate is
     * exceeded, AWS WAF blocks the requests. If the rate drops below 1,000 for
     * a five-minute period, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular
     * page on your site. To do this, you could add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of
     * <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you
     * could limit requests to your login page without affecting the rest of
     * your site.
     * </p>
     * <p>
     * To create and configure a <code>RateBasedRule</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the rule.
     * For more information, see <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>,
     * and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRateBasedRule</code> request to specify the
     * predicates that you want to include in the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>RateBasedRule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRateBasedRuleRequest
     * @return createRateBasedRuleResult The response from the
     *         CreateRateBasedRule service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRateBasedRuleResult createRateBasedRule(
            CreateRateBasedRuleRequest createRateBasedRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRateBasedRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRateBasedRuleRequest> request = null;
        Response<CreateRateBasedRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRateBasedRuleRequestMarshaller()
                        .marshall(createRateBasedRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRateBasedRuleResult, JsonUnmarshallerContext> unmarshaller = new CreateRateBasedRuleResultJsonUnmarshaller();
            JsonResponseHandler<CreateRateBasedRuleResult> responseHandler = new JsonResponseHandler<CreateRateBasedRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexMatchSet</a>. You then use <a>UpdateRegexMatchSet</a>
     * to identify the part of a web request that you want AWS WAF to inspect,
     * such as the values of the <code>User-Agent</code> header or the query
     * string. For example, you can create a <code>RegexMatchSet</code> that
     * contains a <code>RegexMatchTuple</code> that looks for any requests with
     * <code>User-Agent</code> headers that match a <code>RegexPatternSet</code>
     * with pattern <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to
     * reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexMatchSet</a> request to specify the part of the
     * request that you want AWS WAF to inspect (for example, the header or the
     * URI) and the value, using a <code>RegexPatternSet</code>, that you want
     * AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRegexMatchSetRequest
     * @return createRegexMatchSetResult The response from the
     *         CreateRegexMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRegexMatchSetResult createRegexMatchSet(
            CreateRegexMatchSetRequest createRegexMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRegexMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRegexMatchSetRequest> request = null;
        Response<CreateRegexMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRegexMatchSetRequestMarshaller()
                        .marshall(createRegexMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRegexMatchSetResult, JsonUnmarshallerContext> unmarshaller = new CreateRegexMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateRegexMatchSetResult> responseHandler = new JsonResponseHandler<CreateRegexMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RegexPatternSet</code>. You then use
     * <a>UpdateRegexPatternSet</a> to specify the regular expression (regex)
     * pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexPatternSet</a> request to specify the string that
     * you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return createRegexPatternSetResult The response from the
     *         CreateRegexPatternSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRegexPatternSetResult createRegexPatternSet(
            CreateRegexPatternSetRequest createRegexPatternSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRegexPatternSetRequest> request = null;
        Response<CreateRegexPatternSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRegexPatternSetRequestMarshaller()
                        .marshall(createRegexPatternSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRegexPatternSetResult, JsonUnmarshallerContext> unmarshaller = new CreateRegexPatternSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateRegexPatternSetResult> responseHandler = new JsonResponseHandler<CreateRegexPatternSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code>
     * objects, <code>ByteMatchSet</code> objects, and other predicates that
     * identify the requests that you want to block. If you add more than one
     * predicate to a <code>Rule</code>, a request must match all of the
     * specifications to be allowed or blocked. For example, suppose that you
     * add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify
     * that you want to blocks requests that satisfy the <code>Rule</code>. For
     * a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain
     * the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the
     * <code>Rule</code>. For more information, see <a>CreateByteMatchSet</a>,
     * <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that
     * you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>Rule</code>. For more information, see <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return createRuleResult The response from the CreateRule service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRuleResult createRule(CreateRuleRequest createRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestMarshaller().marshall(createRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRuleResult, JsonUnmarshallerContext> unmarshaller = new CreateRuleResultJsonUnmarshaller();
            JsonResponseHandler<CreateRuleResult> responseHandler = new JsonResponseHandler<CreateRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>RuleGroup</code>. A rule group is a collection of
     * predefined rules that you add to a web ACL. You use
     * <a>UpdateRuleGroup</a> to add rules to the rule group.
     * </p>
     * <p>
     * Rule groups are subject to the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Three rule groups per account. You can request an increase to this limit
     * by contacting customer support.
     * </p>
     * </li>
     * <li>
     * <p>
     * One rule group per web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ten rules per rule group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return createRuleGroupResult The response from the CreateRuleGroup
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest createRuleGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleGroupRequest> request = null;
        Response<CreateRuleGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleGroupRequestMarshaller().marshall(createRuleGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRuleGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateRuleGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateRuleGroupResult> responseHandler = new JsonResponseHandler<CreateRuleGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use
     * <a>UpdateSizeConstraintSet</a> to identify the part of a web request that
     * you want AWS WAF to check for length, such as the length of the
     * <code>User-Agent</code> header or the length of the query string. For
     * example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can
     * then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @return createSizeConstraintSetResult The response from the
     *         CreateSizeConstraintSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSizeConstraintSetResult createSizeConstraintSet(
            CreateSizeConstraintSetRequest createSizeConstraintSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSizeConstraintSetRequest> request = null;
        Response<CreateSizeConstraintSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSizeConstraintSetRequestMarshaller()
                        .marshall(createSizeConstraintSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSizeConstraintSetResult, JsonUnmarshallerContext> unmarshaller = new CreateSizeConstraintSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateSizeConstraintSetResult> responseHandler = new JsonResponseHandler<CreateSizeConstraintSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or
     * count requests that contain snippets of SQL code in a specified part of
     * web requests. AWS WAF searches for character sequences that are likely to
     * be malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an
     * <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts
     * of web requests in which you want to allow, block, or count malicious SQL
     * code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest <p>
     *            A request to create a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return createSqlInjectionMatchSetResult The response from the
     *         CreateSqlInjectionMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSqlInjectionMatchSetResult createSqlInjectionMatchSet(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSqlInjectionMatchSetRequest> request = null;
        Response<CreateSqlInjectionMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSqlInjectionMatchSetRequestMarshaller()
                        .marshall(createSqlInjectionMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSqlInjectionMatchSetResult, JsonUnmarshallerContext> unmarshaller = new CreateSqlInjectionMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateSqlInjectionMatchSetResult> responseHandler = new JsonResponseHandler<CreateSqlInjectionMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that
     * identify the CloudFront web requests that you want to allow, block, or
     * count. AWS WAF evaluates <code>Rules</code> in order based on the value
     * of <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or
     * <code>BLOCK</code>. If a web request doesn't match any of the
     * <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the
     * request with the default action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other
     * predicates that you want to include in <code>Rules</code>. For more
     * information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>. For more information, see <a>CreateRule</a> and
     * <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateWebACL</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateWebACL</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code>
     * that you want to include in the <code>WebACL</code>, to specify the
     * default action, and to associate the <code>WebACL</code> with a
     * CloudFront distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @return createWebACLResult The response from the CreateWebACL service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFDisallowedNameException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws WAFBadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWebACLResult createWebACL(CreateWebACLRequest createWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebACLRequest> request = null;
        Response<CreateWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebACLRequestMarshaller().marshall(createWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWebACLResult, JsonUnmarshallerContext> unmarshaller = new CreateWebACLResultJsonUnmarshaller();
            JsonResponseHandler<CreateWebACLResult> responseHandler = new JsonResponseHandler<CreateWebACLResult>(
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
     * Creates an AWS CloudFormation WAFV2 template for the specified web ACL in
     * the specified Amazon S3 bucket. Then, in CloudFormation, you create a
     * stack from the template, to create the web ACL and its resources in AWS
     * WAFV2. Use this to migrate your AWS WAF Classic web ACL to the latest
     * version of AWS WAF.
     * </p>
     * <p>
     * This is part of a larger migration procedure for web ACLs from AWS WAF
     * Classic to the latest version of AWS WAF. For the full procedure,
     * including caveats and manual steps to complete the migration and switch
     * over to the new web ACL, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-migrating-from-classic.html"
     * >Migrating your AWS WAF Classic resources to AWS WAF</a> in the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLMigrationStackRequest
     * @return createWebACLMigrationStackResult The response from the
     *         CreateWebACLMigrationStack service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFInvalidOperationException
     * @throws WAFNonexistentItemException
     * @throws WAFEntityMigrationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWebACLMigrationStackResult createWebACLMigrationStack(
            CreateWebACLMigrationStackRequest createWebACLMigrationStackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWebACLMigrationStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebACLMigrationStackRequest> request = null;
        Response<CreateWebACLMigrationStackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebACLMigrationStackRequestMarshaller()
                        .marshall(createWebACLMigrationStackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWebACLMigrationStackResult, JsonUnmarshallerContext> unmarshaller = new CreateWebACLMigrationStackResultJsonUnmarshaller();
            JsonResponseHandler<CreateWebACLMigrationStackResult> responseHandler = new JsonResponseHandler<CreateWebACLMigrationStackResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count
     * requests that contain cross-site scripting attacks in the specified part
     * of web requests. AWS WAF searches for character sequences that are likely
     * to be malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>CreateXssMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateXssMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web
     * requests in which you want to allow, block, or count cross-site scripting
     * attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest <p>
     *            A request to create an <a>XssMatchSet</a>.
     *            </p>
     * @return createXssMatchSetResult The response from the CreateXssMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFDisallowedNameException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateXssMatchSetResult createXssMatchSet(
            CreateXssMatchSetRequest createXssMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateXssMatchSetRequest> request = null;
        Response<CreateXssMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateXssMatchSetRequestMarshaller()
                        .marshall(createXssMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateXssMatchSetResult, JsonUnmarshallerContext> unmarshaller = new CreateXssMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateXssMatchSetResult> responseHandler = new JsonResponseHandler<CreateXssMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a
     * <code>ByteMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @return deleteByteMatchSetResult The response from the DeleteByteMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteByteMatchSetResult deleteByteMatchSet(
            DeleteByteMatchSetRequest deleteByteMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteByteMatchSetRequest> request = null;
        Response<DeleteByteMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteByteMatchSetRequestMarshaller()
                        .marshall(deleteByteMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteByteMatchSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteByteMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteByteMatchSetResult> responseHandler = new JsonResponseHandler<DeleteByteMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>GeoMatchSet</a>. You can't delete a
     * <code>GeoMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still includes any countries.
     * </p>
     * <p>
     * If you just want to remove a <code>GeoMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>GeoMatchSet</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>GeoMatchSet</code> to remove any countries. For more
     * information, see <a>UpdateGeoMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteGeoMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteGeoMatchSetRequest
     * @return deleteGeoMatchSetResult The response from the DeleteGeoMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGeoMatchSetResult deleteGeoMatchSet(
            DeleteGeoMatchSetRequest deleteGeoMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGeoMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGeoMatchSetRequest> request = null;
        Response<DeleteGeoMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGeoMatchSetRequestMarshaller()
                        .marshall(deleteGeoMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGeoMatchSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteGeoMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGeoMatchSetResult> responseHandler = new JsonResponseHandler<DeleteGeoMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an
     * <code>IPSet</code> if it's still used in any <code>Rules</code> or if it
     * still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>
     * , use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For
     * more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @return deleteIPSetResult The response from the DeleteIPSet service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIPSetRequest> request = null;
        Response<DeleteIPSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIPSetRequestMarshaller().marshall(deleteIPSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteIPSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteIPSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteIPSetResult> responseHandler = new JsonResponseHandler<DeleteIPSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified
     * web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return deleteLoggingConfigurationResult The response from the
     *         DeleteLoggingConfiguration service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteLoggingConfigurationResult deleteLoggingConfiguration(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoggingConfigurationRequest> request = null;
        Response<DeleteLoggingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoggingConfigurationRequestMarshaller()
                        .marshall(deleteLoggingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLoggingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DeleteLoggingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLoggingConfigurationResult> responseHandler = new JsonResponseHandler<DeleteLoggingConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return deletePermissionPolicyResult The response from the
     *         DeletePermissionPolicy service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFStaleDataException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeletePermissionPolicyResult deletePermissionPolicy(
            DeletePermissionPolicyRequest deletePermissionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionPolicyRequest> request = null;
        Response<DeletePermissionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionPolicyRequestMarshaller()
                        .marshall(deletePermissionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePermissionPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeletePermissionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeletePermissionPolicyResult> responseHandler = new JsonResponseHandler<DeletePermissionPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RateBasedRule</a>. You can't delete a rule if
     * it's still used in any <code>WebACL</code> objects or if it still
     * includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a rule from a <code>WebACL</code>, use
     * <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RateBasedRule</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RateBasedRule</code> to remove predicates, if any. For
     * more information, see <a>UpdateRateBasedRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRateBasedRule</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRateBasedRuleRequest
     * @return deleteRateBasedRuleResult The response from the
     *         DeleteRateBasedRule service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRateBasedRuleResult deleteRateBasedRule(
            DeleteRateBasedRuleRequest deleteRateBasedRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRateBasedRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRateBasedRuleRequest> request = null;
        Response<DeleteRateBasedRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRateBasedRuleRequestMarshaller()
                        .marshall(deleteRateBasedRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRateBasedRuleResult, JsonUnmarshallerContext> unmarshaller = new DeleteRateBasedRuleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRateBasedRuleResult> responseHandler = new JsonResponseHandler<DeleteRateBasedRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexMatchSet</a>. You can't delete a
     * <code>RegexMatchSet</code> if it's still used in any <code>Rules</code>
     * or if it still includes any <code>RegexMatchTuples</code> objects (any
     * filters).
     * </p>
     * <p>
     * If you just want to remove a <code>RegexMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RegexMatchSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RegexMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRegexMatchSetRequest
     * @return deleteRegexMatchSetResult The response from the
     *         DeleteRegexMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRegexMatchSetResult deleteRegexMatchSet(
            DeleteRegexMatchSetRequest deleteRegexMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRegexMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegexMatchSetRequest> request = null;
        Response<DeleteRegexMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegexMatchSetRequestMarshaller()
                        .marshall(deleteRegexMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRegexMatchSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteRegexMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRegexMatchSetResult> responseHandler = new JsonResponseHandler<DeleteRegexMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a
     * <code>RegexPatternSet</code> if it's still used in any
     * <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not
     * empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return deleteRegexPatternSetResult The response from the
     *         DeleteRegexPatternSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRegexPatternSetResult deleteRegexPatternSet(
            DeleteRegexPatternSetRequest deleteRegexPatternSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegexPatternSetRequest> request = null;
        Response<DeleteRegexPatternSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegexPatternSetRequestMarshaller()
                        .marshall(deleteRegexPatternSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRegexPatternSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteRegexPatternSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRegexPatternSetResult> responseHandler = new JsonResponseHandler<DeleteRegexPatternSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code>
     * if it's still used in any <code>WebACL</code> objects or if it still
     * includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>
     * , use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more
     * information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @return deleteRuleResult The response from the DeleteRule service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestMarshaller().marshall(deleteRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRuleResult, JsonUnmarshallerContext> unmarshaller = new DeleteRuleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRuleResult> responseHandler = new JsonResponseHandler<DeleteRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>RuleGroup</a>. You can't delete a
     * <code>RuleGroup</code> if it's still used in any <code>WebACL</code>
     * objects or if it still includes any rules.
     * </p>
     * <p>
     * If you just want to remove a <code>RuleGroup</code> from a
     * <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RuleGroup</code> from AWS WAF, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RuleGroup</code> to remove rules, if any. For more
     * information, see <a>UpdateRuleGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteRuleGroup</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleGroupRequest
     * @return deleteRuleGroupResult The response from the DeleteRuleGroup
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFInvalidOperationException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleGroupRequest> request = null;
        Response<DeleteRuleGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleGroupRequestMarshaller().marshall(deleteRuleGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRuleGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteRuleGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRuleGroupResult> responseHandler = new JsonResponseHandler<DeleteRuleGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a
     * <code>SizeConstraintSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>SizeConstraint</a>
     * objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For
     * more information, see <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @return deleteSizeConstraintSetResult The response from the
     *         DeleteSizeConstraintSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSizeConstraintSetResult deleteSizeConstraintSet(
            DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSizeConstraintSetRequest> request = null;
        Response<DeleteSizeConstraintSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSizeConstraintSetRequestMarshaller()
                        .marshall(deleteSizeConstraintSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSizeConstraintSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteSizeConstraintSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSizeConstraintSetResult> responseHandler = new JsonResponseHandler<DeleteSizeConstraintSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a
     * <code>SqlInjectionMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any
     * <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF,
     * perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any.
     * For more information, see <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest <p>
     *            A request to delete a <a>SqlInjectionMatchSet</a> from AWS
     *            WAF.
     *            </p>
     * @return deleteSqlInjectionMatchSetResult The response from the
     *         DeleteSqlInjectionMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSqlInjectionMatchSetResult deleteSqlInjectionMatchSet(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSqlInjectionMatchSetRequest> request = null;
        Response<DeleteSqlInjectionMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSqlInjectionMatchSetRequestMarshaller()
                        .marshall(deleteSqlInjectionMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSqlInjectionMatchSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteSqlInjectionMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSqlInjectionMatchSetResult> responseHandler = new JsonResponseHandler<DeleteSqlInjectionMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a
     * <code>WebACL</code> if it still contains any <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For
     * more information, see <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteWebACL</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @return deleteWebACLResult The response from the DeleteWebACL service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFNonEmptyEntityException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteWebACLResult deleteWebACL(DeleteWebACLRequest deleteWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebACLRequest> request = null;
        Response<DeleteWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebACLRequestMarshaller().marshall(deleteWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWebACLResult, JsonUnmarshallerContext> unmarshaller = new DeleteWebACLResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWebACLResult> responseHandler = new JsonResponseHandler<DeleteWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an
     * <code>XssMatchSet</code> if it's still used in any <code>Rules</code> or
     * if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a
     * <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more
     * information, see <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of a <code>DeleteXssMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest <p>
     *            A request to delete an <a>XssMatchSet</a> from AWS WAF.
     *            </p>
     * @return deleteXssMatchSetResult The response from the DeleteXssMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFStaleDataException
     * @throws WAFNonEmptyEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteXssMatchSetResult deleteXssMatchSet(
            DeleteXssMatchSetRequest deleteXssMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteXssMatchSetRequest> request = null;
        Response<DeleteXssMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteXssMatchSetRequestMarshaller()
                        .marshall(deleteXssMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteXssMatchSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteXssMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteXssMatchSetResult> responseHandler = new JsonResponseHandler<DeleteXssMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Removes a web ACL from the specified resource, either an application load
     * balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return disassociateWebACLResult The response from the DisassociateWebACL
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateWebACLResult disassociateWebACL(
            DisassociateWebACLRequest disassociateWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebACLRequest> request = null;
        Response<DisassociateWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebACLRequestMarshaller()
                        .marshall(disassociateWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateWebACLResult, JsonUnmarshallerContext> unmarshaller = new DisassociateWebACLResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateWebACLResult> responseHandler = new JsonResponseHandler<DisassociateWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return getByteMatchSetResult The response from the GetByteMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetByteMatchSetResult getByteMatchSet(GetByteMatchSetRequest getByteMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetByteMatchSetRequest> request = null;
        Response<GetByteMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetByteMatchSetRequestMarshaller().marshall(getByteMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetByteMatchSetResult, JsonUnmarshallerContext> unmarshaller = new GetByteMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<GetByteMatchSetResult> responseHandler = new JsonResponseHandler<GetByteMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change
     * token and include the change token in the create, update, or delete
     * request. Change tokens ensure that your application doesn't submit
     * conflicting requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If
     * your application submits a <code>GetChangeToken</code> request and then
     * submits a second <code>GetChangeToken</code> request before submitting a
     * create, update, or delete request, the second <code>GetChangeToken</code>
     * request returns the same value as the first <code>GetChangeToken</code>
     * request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the
     * status of the change token changes to <code>PENDING</code>, which
     * indicates that AWS WAF is propagating the change to all AWS WAF servers.
     * Use <code>GetChangeTokenStatus</code> to determine the status of your
     * change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @return getChangeTokenResult The response from the GetChangeToken service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetChangeTokenResult getChangeToken(GetChangeTokenRequest getChangeTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getChangeTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeTokenRequest> request = null;
        Response<GetChangeTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeTokenRequestMarshaller().marshall(getChangeTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetChangeTokenResult, JsonUnmarshallerContext> unmarshaller = new GetChangeTokenResultJsonUnmarshaller();
            JsonResponseHandler<GetChangeTokenResult> responseHandler = new JsonResponseHandler<GetChangeTokenResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling
     * <a>GetChangeToken</a>. <code>ChangeTokenStatus</code> is one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling
     * <code>GetChangeToken</code>, but you haven't used it yet in a call to
     * create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or
     * delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @return getChangeTokenStatusResult The response from the
     *         GetChangeTokenStatus service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetChangeTokenStatusResult getChangeTokenStatus(
            GetChangeTokenStatusRequest getChangeTokenStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getChangeTokenStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeTokenStatusRequest> request = null;
        Response<GetChangeTokenStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeTokenStatusRequestMarshaller()
                        .marshall(getChangeTokenStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetChangeTokenStatusResult, JsonUnmarshallerContext> unmarshaller = new GetChangeTokenStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetChangeTokenStatusResult> responseHandler = new JsonResponseHandler<GetChangeTokenStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by
     * <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @return getGeoMatchSetResult The response from the GetGeoMatchSet service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGeoMatchSetResult getGeoMatchSet(GetGeoMatchSetRequest getGeoMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGeoMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGeoMatchSetRequest> request = null;
        Response<GetGeoMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGeoMatchSetRequestMarshaller().marshall(getGeoMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGeoMatchSetResult, JsonUnmarshallerContext> unmarshaller = new GetGeoMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<GetGeoMatchSetResult> responseHandler = new JsonResponseHandler<GetGeoMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return getIPSetResult The response from the GetIPSet service method, as
     *         returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIPSetRequest> request = null;
        Response<GetIPSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIPSetRequestMarshaller().marshall(getIPSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIPSetResult, JsonUnmarshallerContext> unmarshaller = new GetIPSetResultJsonUnmarshaller();
            JsonResponseHandler<GetIPSetResult> responseHandler = new JsonResponseHandler<GetIPSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return getLoggingConfigurationResult The response from the
     *         GetLoggingConfiguration service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLoggingConfigurationResult getLoggingConfiguration(
            GetLoggingConfigurationRequest getLoggingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingConfigurationRequest> request = null;
        Response<GetLoggingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingConfigurationRequestMarshaller()
                        .marshall(getLoggingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoggingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetLoggingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetLoggingConfigurationResult> responseHandler = new JsonResponseHandler<GetLoggingConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return getPermissionPolicyResult The response from the
     *         GetPermissionPolicy service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPermissionPolicyResult getPermissionPolicy(
            GetPermissionPolicyRequest getPermissionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionPolicyRequest> request = null;
        Response<GetPermissionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionPolicyRequestMarshaller()
                        .marshall(getPermissionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPermissionPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetPermissionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetPermissionPolicyResult> responseHandler = new JsonResponseHandler<GetPermissionPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @return getRateBasedRuleResult The response from the GetRateBasedRule
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRateBasedRuleResult getRateBasedRule(GetRateBasedRuleRequest getRateBasedRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRateBasedRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRateBasedRuleRequest> request = null;
        Response<GetRateBasedRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRateBasedRuleRequestMarshaller().marshall(getRateBasedRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRateBasedRuleResult, JsonUnmarshallerContext> unmarshaller = new GetRateBasedRuleResultJsonUnmarshaller();
            JsonResponseHandler<GetRateBasedRuleResult> responseHandler = new JsonResponseHandler<GetRateBasedRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of IP addresses currently being blocked by the
     * <a>RateBasedRule</a> that is specified by the <code>RuleId</code>. The
     * maximum number of managed keys that will be blocked is 10,000. If more
     * than 10,000 addresses exceed the rate limit, the 10,000 addresses with
     * the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @return getRateBasedRuleManagedKeysResult The response from the
     *         GetRateBasedRuleManagedKeys service method, as returned by AWS
     *         WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRateBasedRuleManagedKeysResult getRateBasedRuleManagedKeys(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRateBasedRuleManagedKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRateBasedRuleManagedKeysRequest> request = null;
        Response<GetRateBasedRuleManagedKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRateBasedRuleManagedKeysRequestMarshaller()
                        .marshall(getRateBasedRuleManagedKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRateBasedRuleManagedKeysResult, JsonUnmarshallerContext> unmarshaller = new GetRateBasedRuleManagedKeysResultJsonUnmarshaller();
            JsonResponseHandler<GetRateBasedRuleManagedKeysResult> responseHandler = new JsonResponseHandler<GetRateBasedRuleManagedKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by
     * <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @return getRegexMatchSetResult The response from the GetRegexMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRegexMatchSetResult getRegexMatchSet(GetRegexMatchSetRequest getRegexMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRegexMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegexMatchSetRequest> request = null;
        Response<GetRegexMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegexMatchSetRequestMarshaller().marshall(getRegexMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRegexMatchSetResult, JsonUnmarshallerContext> unmarshaller = new GetRegexMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<GetRegexMatchSetResult> responseHandler = new JsonResponseHandler<GetRegexMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by
     * <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return getRegexPatternSetResult The response from the GetRegexPatternSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRegexPatternSetResult getRegexPatternSet(
            GetRegexPatternSetRequest getRegexPatternSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegexPatternSetRequest> request = null;
        Response<GetRegexPatternSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegexPatternSetRequestMarshaller()
                        .marshall(getRegexPatternSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRegexPatternSetResult, JsonUnmarshallerContext> unmarshaller = new GetRegexPatternSetResultJsonUnmarshaller();
            JsonResponseHandler<GetRegexPatternSetResult> responseHandler = new JsonResponseHandler<GetRegexPatternSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that
     * you included in the <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return getRuleResult The response from the GetRule service method, as
     *         returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRuleResult getRule(GetRuleRequest getRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleRequest> request = null;
        Response<GetRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleRequestMarshaller().marshall(getRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRuleResult, JsonUnmarshallerContext> unmarshaller = new GetRuleResultJsonUnmarshaller();
            JsonResponseHandler<GetRuleResult> responseHandler = new JsonResponseHandler<GetRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>RuleGroup</a> that is specified by the
     * <code>RuleGroupId</code> that you included in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * To view the rules in a rule group, use
     * <a>ListActivatedRulesInRuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return getRuleGroupResult The response from the GetRuleGroup service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRuleGroupResult getRuleGroup(GetRuleGroupRequest getRuleGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleGroupRequest> request = null;
        Response<GetRuleGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleGroupRequestMarshaller().marshall(getRuleGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRuleGroupResult, JsonUnmarshallerContext> unmarshaller = new GetRuleGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetRuleGroupResult> responseHandler = new JsonResponseHandler<GetRuleGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a
     * sample--that AWS WAF randomly selects from among the first 5,000 requests
     * that your AWS resource received during a time range that you choose. You
     * can specify a sample size of up to 500 requests, and you can specify any
     * time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually
     * the time range that you specified. However, if your resource (such as a
     * CloudFront distribution) received 5,000 requests before the specified
     * time range elapsed, <code>GetSampledRequests</code> returns an updated
     * time range. This new time range indicates the actual period during which
     * AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return getSampledRequestsResult The response from the GetSampledRequests
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSampledRequestsResult getSampledRequests(
            GetSampledRequestsRequest getSampledRequestsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSampledRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSampledRequestsRequest> request = null;
        Response<GetSampledRequestsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSampledRequestsRequestMarshaller()
                        .marshall(getSampledRequestsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSampledRequestsResult, JsonUnmarshallerContext> unmarshaller = new GetSampledRequestsResultJsonUnmarshaller();
            JsonResponseHandler<GetSampledRequestsResult> responseHandler = new JsonResponseHandler<GetSampledRequestsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by
     * <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return getSizeConstraintSetResult The response from the
     *         GetSizeConstraintSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSizeConstraintSetResult getSizeConstraintSet(
            GetSizeConstraintSetRequest getSizeConstraintSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSizeConstraintSetRequest> request = null;
        Response<GetSizeConstraintSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSizeConstraintSetRequestMarshaller()
                        .marshall(getSizeConstraintSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSizeConstraintSetResult, JsonUnmarshallerContext> unmarshaller = new GetSizeConstraintSetResultJsonUnmarshaller();
            JsonResponseHandler<GetSizeConstraintSetResult> responseHandler = new JsonResponseHandler<GetSizeConstraintSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by
     * <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest <p>
     *            A request to get a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return getSqlInjectionMatchSetResult The response from the
     *         GetSqlInjectionMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSqlInjectionMatchSetResult getSqlInjectionMatchSet(
            GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSqlInjectionMatchSetRequest> request = null;
        Response<GetSqlInjectionMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSqlInjectionMatchSetRequestMarshaller()
                        .marshall(getSqlInjectionMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSqlInjectionMatchSetResult, JsonUnmarshallerContext> unmarshaller = new GetSqlInjectionMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<GetSqlInjectionMatchSetResult> responseHandler = new JsonResponseHandler<GetSqlInjectionMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return getWebACLResult The response from the GetWebACL service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWebACLResult getWebACL(GetWebACLRequest getWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLRequest> request = null;
        Response<GetWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLRequestMarshaller().marshall(getWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWebACLResult, JsonUnmarshallerContext> unmarshaller = new GetWebACLResultJsonUnmarshaller();
            JsonResponseHandler<GetWebACLResult> responseHandler = new JsonResponseHandler<GetWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the web ACL for the specified resource, either an application
     * load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return getWebACLForResourceResult The response from the
     *         GetWebACLForResource service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws WAFUnavailableEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWebACLForResourceResult getWebACLForResource(
            GetWebACLForResourceRequest getWebACLForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWebACLForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLForResourceRequest> request = null;
        Response<GetWebACLForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLForResourceRequestMarshaller()
                        .marshall(getWebACLForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWebACLForResourceResult, JsonUnmarshallerContext> unmarshaller = new GetWebACLForResourceResultJsonUnmarshaller();
            JsonResponseHandler<GetWebACLForResourceResult> responseHandler = new JsonResponseHandler<GetWebACLForResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by
     * <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest <p>
     *            A request to get an <a>XssMatchSet</a>.
     *            </p>
     * @return getXssMatchSetResult The response from the GetXssMatchSet service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetXssMatchSetResult getXssMatchSet(GetXssMatchSetRequest getXssMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetXssMatchSetRequest> request = null;
        Response<GetXssMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetXssMatchSetRequestMarshaller().marshall(getXssMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetXssMatchSetResult, JsonUnmarshallerContext> unmarshaller = new GetXssMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<GetXssMatchSetResult> responseHandler = new JsonResponseHandler<GetXssMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @return listActivatedRulesInRuleGroupResult The response from the
     *         ListActivatedRulesInRuleGroup service method, as returned by AWS
     *         WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListActivatedRulesInRuleGroupResult listActivatedRulesInRuleGroup(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listActivatedRulesInRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActivatedRulesInRuleGroupRequest> request = null;
        Response<ListActivatedRulesInRuleGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActivatedRulesInRuleGroupRequestMarshaller()
                        .marshall(listActivatedRulesInRuleGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListActivatedRulesInRuleGroupResult, JsonUnmarshallerContext> unmarshaller = new ListActivatedRulesInRuleGroupResultJsonUnmarshaller();
            JsonResponseHandler<ListActivatedRulesInRuleGroupResult> responseHandler = new JsonResponseHandler<ListActivatedRulesInRuleGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return listByteMatchSetsResult The response from the ListByteMatchSets
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListByteMatchSetsResult listByteMatchSets(
            ListByteMatchSetsRequest listByteMatchSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listByteMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListByteMatchSetsRequest> request = null;
        Response<ListByteMatchSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListByteMatchSetsRequestMarshaller()
                        .marshall(listByteMatchSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListByteMatchSetsResult, JsonUnmarshallerContext> unmarshaller = new ListByteMatchSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListByteMatchSetsResult> responseHandler = new JsonResponseHandler<ListByteMatchSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @return listGeoMatchSetsResult The response from the ListGeoMatchSets
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGeoMatchSetsResult listGeoMatchSets(ListGeoMatchSetsRequest listGeoMatchSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGeoMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeoMatchSetsRequest> request = null;
        Response<ListGeoMatchSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeoMatchSetsRequestMarshaller().marshall(listGeoMatchSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGeoMatchSetsResult, JsonUnmarshallerContext> unmarshaller = new ListGeoMatchSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListGeoMatchSetsResult> responseHandler = new JsonResponseHandler<ListGeoMatchSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return listIPSetsResult The response from the ListIPSets service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIPSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIPSetsRequest> request = null;
        Response<ListIPSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIPSetsRequestMarshaller().marshall(listIPSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIPSetsResult, JsonUnmarshallerContext> unmarshaller = new ListIPSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListIPSetsResult> responseHandler = new JsonResponseHandler<ListIPSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return listLoggingConfigurationsResult The response from the
     *         ListLoggingConfigurations service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListLoggingConfigurationsResult listLoggingConfigurations(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLoggingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLoggingConfigurationsRequest> request = null;
        Response<ListLoggingConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLoggingConfigurationsRequestMarshaller()
                        .marshall(listLoggingConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLoggingConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new ListLoggingConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<ListLoggingConfigurationsResult> responseHandler = new JsonResponseHandler<ListLoggingConfigurationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @return listRateBasedRulesResult The response from the ListRateBasedRules
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRateBasedRulesResult listRateBasedRules(
            ListRateBasedRulesRequest listRateBasedRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRateBasedRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRateBasedRulesRequest> request = null;
        Response<ListRateBasedRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRateBasedRulesRequestMarshaller()
                        .marshall(listRateBasedRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRateBasedRulesResult, JsonUnmarshallerContext> unmarshaller = new ListRateBasedRulesResultJsonUnmarshaller();
            JsonResponseHandler<ListRateBasedRulesResult> responseHandler = new JsonResponseHandler<ListRateBasedRulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @return listRegexMatchSetsResult The response from the ListRegexMatchSets
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRegexMatchSetsResult listRegexMatchSets(
            ListRegexMatchSetsRequest listRegexMatchSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRegexMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegexMatchSetsRequest> request = null;
        Response<ListRegexMatchSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegexMatchSetsRequestMarshaller()
                        .marshall(listRegexMatchSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRegexMatchSetsResult, JsonUnmarshallerContext> unmarshaller = new ListRegexMatchSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListRegexMatchSetsResult> responseHandler = new JsonResponseHandler<ListRegexMatchSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return listRegexPatternSetsResult The response from the
     *         ListRegexPatternSets service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRegexPatternSetsResult listRegexPatternSets(
            ListRegexPatternSetsRequest listRegexPatternSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRegexPatternSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegexPatternSetsRequest> request = null;
        Response<ListRegexPatternSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegexPatternSetsRequestMarshaller()
                        .marshall(listRegexPatternSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRegexPatternSetsResult, JsonUnmarshallerContext> unmarshaller = new ListRegexPatternSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListRegexPatternSetsResult> responseHandler = new JsonResponseHandler<ListRegexPatternSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic Regional</b> documentation. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of resources associated with the specified web ACL.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return listResourcesForWebACLResult The response from the
     *         ListResourcesForWebACL service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListResourcesForWebACLResult listResourcesForWebACL(
            ListResourcesForWebACLRequest listResourcesForWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourcesForWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesForWebACLRequest> request = null;
        Response<ListResourcesForWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesForWebACLRequestMarshaller()
                        .marshall(listResourcesForWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourcesForWebACLResult, JsonUnmarshallerContext> unmarshaller = new ListResourcesForWebACLResultJsonUnmarshaller();
            JsonResponseHandler<ListResourcesForWebACLResult> responseHandler = new JsonResponseHandler<ListResourcesForWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return listRuleGroupsResult The response from the ListRuleGroups service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleGroupsRequest> request = null;
        Response<ListRuleGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleGroupsRequestMarshaller().marshall(listRuleGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRuleGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListRuleGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListRuleGroupsResult> responseHandler = new JsonResponseHandler<ListRuleGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return listRulesResult The response from the ListRules service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRulesResult listRules(ListRulesRequest listRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestMarshaller().marshall(listRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRulesResult, JsonUnmarshallerContext> unmarshaller = new ListRulesResultJsonUnmarshaller();
            JsonResponseHandler<ListRulesResult> responseHandler = new JsonResponseHandler<ListRulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return listSizeConstraintSetsResult The response from the
     *         ListSizeConstraintSets service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSizeConstraintSetsResult listSizeConstraintSets(
            ListSizeConstraintSetsRequest listSizeConstraintSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSizeConstraintSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSizeConstraintSetsRequest> request = null;
        Response<ListSizeConstraintSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSizeConstraintSetsRequestMarshaller()
                        .marshall(listSizeConstraintSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSizeConstraintSetsResult, JsonUnmarshallerContext> unmarshaller = new ListSizeConstraintSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListSizeConstraintSetsResult> responseHandler = new JsonResponseHandler<ListSizeConstraintSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest <p>
     *            A request to list the <a>SqlInjectionMatchSet</a> objects
     *            created by the current AWS account.
     *            </p>
     * @return listSqlInjectionMatchSetsResult The response from the
     *         ListSqlInjectionMatchSets service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSqlInjectionMatchSetsResult listSqlInjectionMatchSets(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSqlInjectionMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSqlInjectionMatchSetsRequest> request = null;
        Response<ListSqlInjectionMatchSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSqlInjectionMatchSetsRequestMarshaller()
                        .marshall(listSqlInjectionMatchSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSqlInjectionMatchSetsResult, JsonUnmarshallerContext> unmarshaller = new ListSqlInjectionMatchSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListSqlInjectionMatchSetsResult> responseHandler = new JsonResponseHandler<ListSqlInjectionMatchSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @return listSubscribedRuleGroupsResult The response from the
     *         ListSubscribedRuleGroups service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFNonexistentItemException
     * @throws WAFInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSubscribedRuleGroupsResult listSubscribedRuleGroups(
            ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSubscribedRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscribedRuleGroupsRequest> request = null;
        Response<ListSubscribedRuleGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscribedRuleGroupsRequestMarshaller()
                        .marshall(listSubscribedRuleGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSubscribedRuleGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListSubscribedRuleGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListSubscribedRuleGroupsResult> responseHandler = new JsonResponseHandler<ListSubscribedRuleGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Retrieves the tags associated with the specified AWS resource. Tags are
     * key:value pairs that you can use to categorize and manage your resources,
     * for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one
     * or more tags to add to each AWS resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't
     * manage or view tags through the AWS WAF Classic console. You can tag the
     * AWS resources that you manage through AWS WAF Classic: web ACLs, rule
     * groups, and rules.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
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
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return listWebACLsResult The response from the ListWebACLs service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWebACLsResult listWebACLs(ListWebACLsRequest listWebACLsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWebACLsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebACLsRequest> request = null;
        Response<ListWebACLsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebACLsRequestMarshaller().marshall(listWebACLsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWebACLsResult, JsonUnmarshallerContext> unmarshaller = new ListWebACLsResultJsonUnmarshaller();
            JsonResponseHandler<ListWebACLsResult> responseHandler = new JsonResponseHandler<ListWebACLsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest <p>
     *            A request to list the <a>XssMatchSet</a> objects created by
     *            the current AWS account.
     *            </p>
     * @return listXssMatchSetsResult The response from the ListXssMatchSets
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListXssMatchSetsResult listXssMatchSets(ListXssMatchSetsRequest listXssMatchSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listXssMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListXssMatchSetsRequest> request = null;
        Response<ListXssMatchSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListXssMatchSetsRequestMarshaller().marshall(listXssMatchSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListXssMatchSetsResult, JsonUnmarshallerContext> unmarshaller = new ListXssMatchSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListXssMatchSetsResult> responseHandler = new JsonResponseHandler<ListXssMatchSetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using
     * the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are
     * operating. However, if you are capturing logs for Amazon CloudFront,
     * always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as
     * your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a
     * <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a
     * <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the
     * Amazon Kinesis Data Firehose. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a> in the <i>AWS WAF Developer
     * Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return putLoggingConfigurationResult The response from the
     *         PutLoggingConfiguration service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFServiceLinkedRoleErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutLoggingConfigurationResult putLoggingConfiguration(
            PutLoggingConfigurationRequest putLoggingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingConfigurationRequest> request = null;
        Response<PutLoggingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingConfigurationRequestMarshaller()
                        .marshall(putLoggingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLoggingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutLoggingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutLoggingConfigurationResult> responseHandler = new JsonResponseHandler<PutLoggingConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Attaches an IAM policy to the specified resource. The only supported use
     * for this action is to share a RuleGroup across accounts.
     * </p>
     * <p>
     * The <code>PutPermissionPolicy</code> is subject to the following
     * restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy must include an <code>Effect</code>, <code>Action</code> and
     * <code>Principal</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Effect</code> must specify <code>Allow</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Action</code> in the policy must be
     * <code>waf:UpdateWebACL</code>, <code>waf-regional:UpdateWebACL</code>,
     * <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code>
     * . Any extra or wildcard actions in the policy will be rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy cannot include a <code>Resource</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF RuleGroup ARN and the
     * RuleGroup must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your policy must be composed using IAM Policy version 2012-10-17.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html"
     * >IAM Policies</a>.
     * </p>
     * <p>
     * An example of a valid policy parameter is shown in the Examples section
     * below.
     * </p>
     * 
     * @param putPermissionPolicyRequest
     * @return putPermissionPolicyResult The response from the
     *         PutPermissionPolicy service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFStaleDataException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidPermissionPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutPermissionPolicyResult putPermissionPolicy(
            PutPermissionPolicyRequest putPermissionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putPermissionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPermissionPolicyRequest> request = null;
        Response<PutPermissionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPermissionPolicyRequestMarshaller()
                        .marshall(putPermissionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutPermissionPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutPermissionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutPermissionPolicyResult> responseHandler = new JsonResponseHandler<PutPermissionPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs
     * that you can use to categorize and manage your resources, for purposes
     * like billing. For example, you might set the tag key to "customer" and
     * the value to the customer name or ID. You can specify one or more tags to
     * add to each AWS resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * Tagging is only available through the API, SDKs, and CLI. You can't
     * manage or view tags through the AWS WAF Classic console. You can use this
     * action to tag the AWS resources that you manage through AWS WAF Classic:
     * web ACLs, rule groups, and rules.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p/>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentItemException
     * @throws WAFBadRequestException
     * @throws WAFTagOperationException
     * @throws WAFTagOperationInternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a
     * <a>ByteMatchSet</a>. For each <code>ByteMatchTuple</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>ByteMatchSetUpdate</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a
     * query string or the value of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters)
     * that you want AWS WAF to look for. For more information, including how
     * you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it
     * to lowercase, before inspecting it for the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that
     * matches web requests in which <code>User-Agent</code> headers contain the
     * string <code>BadBot</code>. You can then configure AWS WAF to block those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see
     * <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <code>UpdateByteMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @return updateByteMatchSetResult The response from the UpdateByteMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateByteMatchSetResult updateByteMatchSet(
            UpdateByteMatchSetRequest updateByteMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateByteMatchSetRequest> request = null;
        Response<UpdateByteMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateByteMatchSetRequestMarshaller()
                        .marshall(updateByteMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateByteMatchSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateByteMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateByteMatchSetResult> responseHandler = new JsonResponseHandler<UpdateByteMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>GeoMatchConstraint</a> objects in an
     * <code>GeoMatchSet</code>. For each <code>GeoMatchConstraint</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change an <code>GeoMatchConstraint</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Type</code>. The only valid value for <code>Type</code> is
     * <code>Country</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Value</code>, which is a two character code for the country to
     * add to the <code>GeoMatchConstraint</code> object. Valid codes are listed
     * in <a>GeoMatchConstraint$Value</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure an <code>GeoMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateGeoMatchSet</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSet</code> request to specify the country
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>GeoMatchSet</code>, you specify the country that
     * you want to add and/or the country that you want to delete. If you want
     * to change a country, you delete the existing country and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateGeoMatchSetRequest
     * @return updateGeoMatchSetResult The response from the UpdateGeoMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGeoMatchSetResult updateGeoMatchSet(
            UpdateGeoMatchSetRequest updateGeoMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGeoMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGeoMatchSetRequest> request = null;
        Response<UpdateGeoMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGeoMatchSetRequestMarshaller()
                        .marshall(updateGeoMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGeoMatchSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateGeoMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGeoMatchSetResult> responseHandler = new JsonResponseHandler<UpdateGeoMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an
     * <code>IPSet</code>. For each <code>IPSetDescriptor</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change an <code>IPSetDescriptor</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code>
     * (for the range of IP addresses from <code>192.0.2.0</code> to
     * <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the
     * individual IP address <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports IPv4 address ranges: /8 and any range between /16
     * through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56,
     * /64, and /128. For more information about CIDR notation, see the
     * Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to
     * allow or block based on the IP addresses that the requests originated
     * from. For example, if you're receiving a lot of requests from one or a
     * small number of IP addresses and you want to block the requests, you can
     * create an <code>IPSet</code> that specifies those IP addresses, and then
     * configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses
     * that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that
     * you want to add and/or the IP addresses that you want to delete. If you
     * want to change an IP address, you delete the existing IP address and add
     * the new one.
     * </p>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return updateIPSetResult The response from the UpdateIPSet service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIPSetRequest> request = null;
        Response<UpdateIPSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIPSetRequestMarshaller().marshall(updateIPSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIPSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateIPSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIPSetResult> responseHandler = new JsonResponseHandler<UpdateIPSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a rule and updates the
     * <code>RateLimit</code> in the rule.
     * </p>
     * <p>
     * Each <code>Predicate</code> object identifies a predicate, such as a
     * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests
     * that you want to block or count. The <code>RateLimit</code> specifies the
     * number of requests every five minutes that triggers the rule.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a
     * request must match all the predicates and exceed the
     * <code>RateLimit</code> to be counted or blocked. For example, suppose you
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address
     * <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
     * <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and
     * specify that you want to block requests that satisfy the rule. For a
     * request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain
     * the value <code>BadBot</code>. Further, requests that match these two
     * conditions much be received at a rate of more than 1,000 every five
     * minutes. If the rate drops below this limit, AWS WAF no longer blocks the
     * requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular
     * page on your site. To do this, you could add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of
     * <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 1,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you
     * could limit requests to your login page without affecting the rest of
     * your site.
     * </p>
     * 
     * @param updateRateBasedRuleRequest
     * @return updateRateBasedRuleResult The response from the
     *         UpdateRateBasedRule service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRateBasedRuleResult updateRateBasedRule(
            UpdateRateBasedRuleRequest updateRateBasedRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRateBasedRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRateBasedRuleRequest> request = null;
        Response<UpdateRateBasedRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRateBasedRuleRequestMarshaller()
                        .marshall(updateRateBasedRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRateBasedRuleResult, JsonUnmarshallerContext> unmarshaller = new UpdateRateBasedRuleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRateBasedRuleResult> responseHandler = new JsonResponseHandler<UpdateRateBasedRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a
     * <a>RegexMatchSet</a>. For each <code>RegexMatchSetUpdate</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>RegexMatchSetUpdate</code> object, you delete the existing
     * object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspectupdate, such as
     * a query string or the value of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS
     * WAF to look for. For more information, see <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it
     * to lowercase, before inspecting it for the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternSet</code> that matches
     * any requests with <code>User-Agent</code> headers that contain the string
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexMatchSet.</code> For more information, see
     * <a>CreateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <code>UpdateRegexMatchSet</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of
     * the request that you want AWS WAF to inspect (for example, the header or
     * the URI) and the identifier of the <code>RegexPatternSet</code> that
     * contain the regular expression patters you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexMatchSetRequest
     * @return updateRegexMatchSetResult The response from the
     *         UpdateRegexMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFDisallowedNameException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFNonexistentContainerException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidAccountException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRegexMatchSetResult updateRegexMatchSet(
            UpdateRegexMatchSetRequest updateRegexMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRegexMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegexMatchSetRequest> request = null;
        Response<UpdateRegexMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegexMatchSetRequestMarshaller()
                        .marshall(updateRegexMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRegexMatchSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateRegexMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRegexMatchSetResult> responseHandler = new JsonResponseHandler<UpdateRegexMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <code>RegexPatternString</code> objects in a
     * <a>RegexPatternSet</a>. For each <code>RegexPatternString</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the <code>RegexPatternString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The regular expression pattern that you want to insert or delete. For
     * more information, see <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternString</code> such as
     * <code>B[a@]dB[o0]t</code>. AWS WAF will match this
     * <code>RegexPatternString</code> to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BadBot
     * </p>
     * </li>
     * <li>
     * <p>
     * BadB0t
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dBot
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dB0t
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexPatternSet.</code> For more information, see
     * <a>CreateRegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an
     * <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexPatternSet</code> request to specify the
     * regular expression pattern that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return updateRegexPatternSetResult The response from the
     *         UpdateRegexPatternSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFLimitsExceededException
     * @throws WAFNonexistentItemException
     * @throws WAFNonexistentContainerException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidRegexPatternException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRegexPatternSetResult updateRegexPatternSet(
            UpdateRegexPatternSetRequest updateRegexPatternSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRegexPatternSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegexPatternSetRequest> request = null;
        Response<UpdateRegexPatternSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegexPatternSetRequestMarshaller()
                        .marshall(updateRegexPatternSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRegexPatternSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateRegexPatternSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRegexPatternSetResult> responseHandler = new JsonResponseHandler<UpdateRegexPatternSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each
     * <code>Predicate</code> object identifies a predicate, such as a
     * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests
     * that you want to allow, block, or count. If you add more than one
     * predicate to a <code>Rule</code>, a request must match all of the
     * specifications to be allowed, blocked, or counted. For example, suppose
     * that you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in
     * the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify
     * that you want to block requests that satisfy the <code>Rule</code>. For a
     * request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must
     * originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRule</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or
     * <code>IPSet</code> with another, you delete the existing one and add the
     * new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return updateRuleResult The response from the UpdateRule service method,
     *         as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleRequest> request = null;
        Response<UpdateRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleRequestMarshaller().marshall(updateRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRuleResult, JsonUnmarshallerContext> unmarshaller = new UpdateRuleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRuleResult> responseHandler = new JsonResponseHandler<UpdateRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a
     * <code>RuleGroup</code>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * You can have a maximum of ten rules per rule group.
     * </p>
     * <p>
     * To create and configure a <code>RuleGroup</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>RuleGroup</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateRuleGroup</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code>
     * to the <code>RuleGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the
     * <code>RuleGroup</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>Rule</code> with another, you delete the
     * existing one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return updateRuleGroupResult The response from the UpdateRuleGroup
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFInvalidOperationException
     * @throws WAFLimitsExceededException
     * @throws WAFInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleGroupRequest> request = null;
        Response<UpdateRuleGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleGroupRequestMarshaller().marshall(updateRuleGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRuleGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateRuleGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRuleGroupResult> responseHandler = new JsonResponseHandler<UpdateRuleGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a
     * <a>SizeConstraintSet</a>. For each <code>SizeConstraint</code> object,
     * you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to
     * change a <code>SizeConstraintSetUpdate</code> object, you delete the
     * existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the
     * length of a query string or the length of the <code>User-Agent</code>
     * header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting
     * it to lowercase, before checking its length. Note that transformations of
     * the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part
     * of the request against the specified <code>Size</code>, such as equals,
     * greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part
     * of the request. The length is computed after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object
     * that matches web requests in which the length of the
     * <code>User-Agent</code> header is greater than 100 bytes. You can then
     * configure AWS WAF to block those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see
     * <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an
     * <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the
     * part of the request that you want AWS WAF to inspect (for example, the
     * header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @return updateSizeConstraintSetResult The response from the
     *         UpdateSizeConstraintSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateSizeConstraintSetResult updateSizeConstraintSet(
            UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSizeConstraintSetRequest> request = null;
        Response<UpdateSizeConstraintSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSizeConstraintSetRequestMarshaller()
                        .marshall(updateSizeConstraintSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSizeConstraintSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateSizeConstraintSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSizeConstraintSetResult> responseHandler = new JsonResponseHandler<UpdateSizeConstraintSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a
     * <a>SqlInjectionMatchSet</a>. For each <code>SqlInjectionMatchTuple</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the
     * object from the array. To change a <code>SqlInjectionMatchTuple</code>,
     * you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF
     * to inspect and, if you want AWS WAF to inspect a header or custom query
     * parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to
     * perform on the web request before inspecting the request for snippets of
     * malicious SQL code.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which
     * CloudFront requests that you want to allow, block, or count. For example,
     * if you're receiving requests that contain snippets of SQL code in the
     * query string and you want to block the requests, you can create a
     * <code>SqlInjectionMatchSet</code> with the applicable settings, and then
     * configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the
     * parts of web requests that you want AWS WAF to inspect for snippets of
     * SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest <p>
     *            A request to update a <a>SqlInjectionMatchSet</a>.
     *            </p>
     * @return updateSqlInjectionMatchSetResult The response from the
     *         UpdateSqlInjectionMatchSet service method, as returned by AWS WAF
     *         Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateSqlInjectionMatchSetResult updateSqlInjectionMatchSet(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSqlInjectionMatchSetRequest> request = null;
        Response<UpdateSqlInjectionMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSqlInjectionMatchSetRequestMarshaller()
                        .marshall(updateSqlInjectionMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSqlInjectionMatchSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateSqlInjectionMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSqlInjectionMatchSetResult> responseHandler = new JsonResponseHandler<UpdateSqlInjectionMatchSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>.
     * Each <code>Rule</code> identifies web requests that you want to allow,
     * block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code>
     * or <code>BLOCK</code>. AWS WAF performs the default action if a request
     * doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add or delete. If you want to
     * replace one <code>Rule</code> with another, you delete the existing
     * <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests,
     * block requests, or count requests that match the conditions in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in
     * a <code>WebACL</code>. If you add more than one <code>Rule</code> to a
     * <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>.
     * (The <code>Rule</code> that has the lowest value for
     * <code>Priority</code> is evaluated first.) When a web request matches all
     * the predicates (such as <code>ByteMatchSets</code> and
     * <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes
     * the corresponding action, allow or block, and doesn't evaluate the
     * request against the remaining <code>Rules</code> in the
     * <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following
     * steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>,
     * <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>. For more information, see <a>CreateRule</a> and
     * <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide
     * in the <code>ChangeToken</code> parameter of an <a>UpdateWebACL</a>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the
     * <code>Rules</code> that you want to include in the <code>WebACL</code>,
     * to specify the default action, and to associate the <code>WebACL</code>
     * with a CloudFront distribution.
     * </p>
     * <p>
     * The <code>ActivatedRule</code> can be a rule group. If you specify a rule
     * group as your <code>ActivatedRule</code> , you can exclude specific rules
     * from that rule group.
     * </p>
     * <p>
     * If you already have a rule group associated with a web ACL and want to
     * submit an <code>UpdateWebACL</code> request to exclude certain rules from
     * that rule group, you must first remove the rule group from the web ACL,
     * the re-insert it again, specifying the excluded rules. For details, see
     * <a>ActivatedRule$ExcludedRules</a> .
     * </p>
     * </li>
     * </ol>
     * <p>
     * Be aware that if you try to add a RATE_BASED rule to a web ACL without
     * setting the rule type when first creating the rule, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule (the default rule type) with the specified ID, which does
     * not exist.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return updateWebACLResult The response from the UpdateWebACL service
     *         method, as returned by AWS WAF Regional.
     * @throws WAFStaleDataException
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFReferencedItemException
     * @throws WAFLimitsExceededException
     * @throws WAFSubscriptionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateWebACLResult updateWebACL(UpdateWebACLRequest updateWebACLRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebACLRequest> request = null;
        Response<UpdateWebACLResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebACLRequestMarshaller().marshall(updateWebACLRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWebACLResult, JsonUnmarshallerContext> unmarshaller = new UpdateWebACLResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWebACLResult> responseHandler = new JsonResponseHandler<UpdateWebACLResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This is <b>AWS WAF Classic</b> documentation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
     * >AWS WAF Classic</a> in the developer guide.
     * </p>
     * <p>
     * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see
     * the <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html"
     * >AWS WAF Developer Guide</a>. With the latest version, AWS WAF has a
     * single set of endpoints for regional and global use.
     * </p>
     * </note>
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an
     * <a>XssMatchSet</a>. For each <code>XssMatchTuple</code> object, you
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the
     * object from the array. To change an <code>XssMatchTuple</code>, you
     * delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF
     * to inspect and, if you want AWS WAF to inspect a header or custom query
     * parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to
     * perform on the web request before inspecting the request for cross-site
     * scripting attacks.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront
     * requests that you want to allow, block, or count. For example, if you're
     * receiving requests that contain cross-site scripting attacks in the
     * request body and you want to block the requests, you can create an
     * <code>XssMatchSet</code> with the applicable settings, and then configure
     * AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the
     * following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the
     * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of
     * web requests that you want AWS WAF to inspect for cross-site scripting
     * attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block
     * HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest <p>
     *            A request to update an <a>XssMatchSet</a>.
     *            </p>
     * @return updateXssMatchSetResult The response from the UpdateXssMatchSet
     *         service method, as returned by AWS WAF Regional.
     * @throws WAFInternalErrorException
     * @throws WAFInvalidAccountException
     * @throws WAFInvalidOperationException
     * @throws WAFInvalidParameterException
     * @throws WAFNonexistentContainerException
     * @throws WAFNonexistentItemException
     * @throws WAFStaleDataException
     * @throws WAFLimitsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             WAF Regional indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateXssMatchSetResult updateXssMatchSet(
            UpdateXssMatchSetRequest updateXssMatchSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateXssMatchSetRequest> request = null;
        Response<UpdateXssMatchSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateXssMatchSetRequestMarshaller()
                        .marshall(updateXssMatchSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateXssMatchSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateXssMatchSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateXssMatchSetResult> responseHandler = new JsonResponseHandler<UpdateXssMatchSetResult>(
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
