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

package com.amazonaws.services.cloudfront;

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

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.services.cloudfront.model.transform.*;

/**
 * Client for accessing Amazon CloudFront. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for
 * developers who need detailed information about CloudFront API actions, data
 * types, and errors. For detailed information about CloudFront features, see
 * the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 */
public class AmazonCloudFrontClient extends AmazonWebServiceClient implements AmazonCloudFront {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon CloudFront exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront. A
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
    public AmazonCloudFrontClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront. A
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
     *            how this client connects to AmazonCloudFront (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCloudFrontClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *         AmazonCloudFrontClient client = new AmazonCloudFrontClient(AWSMobileClient.getInstance());
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
    public AmazonCloudFrontClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *         AmazonCloudFrontClient client = new AmazonCloudFrontClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonCloudFront (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCloudFrontClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *         AmazonCloudFrontClient client = new AmazonCloudFrontClient(AWSMobileClient.getInstance());
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
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *         AmazonCloudFrontClient client = new AmazonCloudFrontClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonCloudFront (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *            how this client connects to AmazonCloudFront (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonCloudFront
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
     *         AmazonCloudFrontClient client = new AmazonCloudFrontClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonCloudFront (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CNAMEAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotChangeImmutablePublicKeyFieldsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new FieldLevelEncryptionConfigAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionConfigInUseExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new FieldLevelEncryptionProfileAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileInUseExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new FieldLevelEncryptionProfileSizeExceededExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalUpdateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InconsistentQuantitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDefaultRootObjectExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidErrorCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidForwardCookiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGeoRestrictionParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHeadersForS3OriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIfMatchVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLambdaFunctionAssociationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLocationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMinimumProtocolVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginKeepaliveTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginReadTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidProtocolSettingsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRelativePathExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequiredProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidResponseCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTTLOrderExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTaggingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidViewerCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidWebACLIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingBodyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionProfileExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchInvalidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchResourceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchStreamingDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueryArgProfileEmptyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCacheBehaviorsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCertificatesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCookieNamesInWhiteListExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyDistributionsAssociatedToFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyDistributionsWithLambdaAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionConfigsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyFieldLevelEncryptionContentTypeProfilesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyFieldLevelEncryptionEncryptionEntitiesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyFieldLevelEncryptionFieldPatternsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionProfilesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyFieldLevelEncryptionQueryArgProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyHeadersInForwardedValuesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyInvalidationsInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLambdaFunctionAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginCustomHeadersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginGroupsPerDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPublicKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTrustedSignersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrustedSignerDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudfront.us-east-1.amazonaws.com");
        this.endpointPrefix = "cloudfront";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudfront/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudfront/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your
     * origin, you can use an origin access identity to require users to access
     * your content using a CloudFront URL instead of the Amazon S3 URL. For
     * more information about how to use origin access identities, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
     * >Serving Private Content through CloudFront</a> in the <i>Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentity2019_03_26Request <p>
     *            The request to create a new origin access identity (OAI). An
     *            origin access identity is a special CloudFront user that you
     *            can associate with Amazon S3 origins, so that you can secure
     *            all or just some of your Amazon S3 content. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *            > Restricting Access to Amazon S3 Content by Using an Origin
     *            Access Identity</a> in the <i>Amazon CloudFront Developer
     *            Guide</i>.
     *            </p>
     * @return createCloudFrontOriginAccessIdentity2019_03_26Result The response
     *         from the CreateCloudFrontOriginAccessIdentity2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     * @throws MissingBodyException
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCloudFrontOriginAccessIdentity2019_03_26Result createCloudFrontOriginAccessIdentity2019_03_26(
            CreateCloudFrontOriginAccessIdentity2019_03_26Request createCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCloudFrontOriginAccessIdentity2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFrontOriginAccessIdentity2019_03_26Request> request = null;
        Response<CreateCloudFrontOriginAccessIdentity2019_03_26Result> response = null;
        try {
            request = new CreateCloudFrontOriginAccessIdentity2019_03_26RequestMarshaller()
                    .marshall(createCloudFrontOriginAccessIdentity2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateCloudFrontOriginAccessIdentity2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new web distribution. You create a CloudFront distribution to
     * tell CloudFront where you want content to be delivered from, and the
     * details about how to track and manage content delivery. Send a
     * <code>POST</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution</code>/
     * <code>distribution ID</code> resource.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when
     * you create a distribution. When you update your distribution by using <a
     * href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>, follow the steps included in the documentation
     * to get the current configuration and then make your updates. This helps
     * to make sure that you include all of the required fields. To view a
     * summary, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param createDistribution2019_03_26Request <p>
     *            The request to create a new distribution.
     *            </p>
     * @return createDistribution2019_03_26Result The response from the
     *         CreateDistribution2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws CNAMEAlreadyExistsException
     * @throws DistributionAlreadyExistsException
     * @throws InvalidOriginException
     * @throws InvalidOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws TooManyDistributionsException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidRelativePathException
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     * @throws InvalidRequiredProtocolException
     * @throws NoSuchOriginException
     * @throws TooManyOriginsException
     * @throws TooManyOriginGroupsPerDistributionException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidForwardCookiesException
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     * @throws TooManyCertificatesException
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     * @throws TooManyLambdaFunctionAssociationsException
     * @throws InvalidLambdaFunctionAssociationException
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDistribution2019_03_26Result createDistribution2019_03_26(
            CreateDistribution2019_03_26Request createDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistribution2019_03_26Request> request = null;
        Response<CreateDistribution2019_03_26Result> response = null;
        try {
            request = new CreateDistribution2019_03_26RequestMarshaller()
                    .marshall(createDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDistribution2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTags2019_03_26Request <p>
     *            The request to create a new distribution with tags.
     *            </p>
     * @return createDistributionWithTags2019_03_26Result The response from the
     *         CreateDistributionWithTags2019_03_26 service method, as returned
     *         by Amazon CloudFront.
     * @throws CNAMEAlreadyExistsException
     * @throws DistributionAlreadyExistsException
     * @throws InvalidOriginException
     * @throws InvalidOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws TooManyDistributionsException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidRelativePathException
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     * @throws InvalidRequiredProtocolException
     * @throws NoSuchOriginException
     * @throws TooManyOriginsException
     * @throws TooManyOriginGroupsPerDistributionException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidForwardCookiesException
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     * @throws TooManyCertificatesException
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws InvalidTaggingException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     * @throws TooManyLambdaFunctionAssociationsException
     * @throws InvalidLambdaFunctionAssociationException
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDistributionWithTags2019_03_26Result createDistributionWithTags2019_03_26(
            CreateDistributionWithTags2019_03_26Request createDistributionWithTags2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDistributionWithTags2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionWithTags2019_03_26Request> request = null;
        Response<CreateDistributionWithTags2019_03_26Result> response = null;
        try {
            request = new CreateDistributionWithTags2019_03_26RequestMarshaller()
                    .marshall(createDistributionWithTags2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateDistributionWithTags2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new field-level encryption configuration.
     * </p>
     * 
     * @param createFieldLevelEncryptionConfig2019_03_26Request
     * @return createFieldLevelEncryptionConfig2019_03_26Result The response
     *         from the CreateFieldLevelEncryptionConfig2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws FieldLevelEncryptionConfigAlreadyExistsException
     * @throws TooManyFieldLevelEncryptionConfigsException
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     * @throws QueryArgProfileEmptyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFieldLevelEncryptionConfig2019_03_26Result createFieldLevelEncryptionConfig2019_03_26(
            CreateFieldLevelEncryptionConfig2019_03_26Request createFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFieldLevelEncryptionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFieldLevelEncryptionConfig2019_03_26Request> request = null;
        Response<CreateFieldLevelEncryptionConfig2019_03_26Result> response = null;
        try {
            request = new CreateFieldLevelEncryptionConfig2019_03_26RequestMarshaller()
                    .marshall(createFieldLevelEncryptionConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateFieldLevelEncryptionConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a field-level encryption profile.
     * </p>
     * 
     * @param createFieldLevelEncryptionProfile2019_03_26Request
     * @return createFieldLevelEncryptionProfile2019_03_26Result The response
     *         from the CreateFieldLevelEncryptionProfile2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws NoSuchPublicKeyException
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     * @throws FieldLevelEncryptionProfileSizeExceededException
     * @throws TooManyFieldLevelEncryptionProfilesException
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFieldLevelEncryptionProfile2019_03_26Result createFieldLevelEncryptionProfile2019_03_26(
            CreateFieldLevelEncryptionProfile2019_03_26Request createFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFieldLevelEncryptionProfile2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFieldLevelEncryptionProfile2019_03_26Request> request = null;
        Response<CreateFieldLevelEncryptionProfile2019_03_26Result> response = null;
        try {
            request = new CreateFieldLevelEncryptionProfile2019_03_26RequestMarshaller()
                    .marshall(createFieldLevelEncryptionProfile2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateFieldLevelEncryptionProfile2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidation2019_03_26Request <p>
     *            The request to create an invalidation.
     *            </p>
     * @return createInvalidation2019_03_26Result The response from the
     *         CreateInvalidation2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws MissingBodyException
     * @throws InvalidArgumentException
     * @throws NoSuchDistributionException
     * @throws BatchTooLargeException
     * @throws TooManyInvalidationsInProgressException
     * @throws InconsistentQuantitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInvalidation2019_03_26Result createInvalidation2019_03_26(
            CreateInvalidation2019_03_26Request createInvalidation2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInvalidation2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInvalidation2019_03_26Request> request = null;
        Response<CreateInvalidation2019_03_26Result> response = null;
        try {
            request = new CreateInvalidation2019_03_26RequestMarshaller()
                    .marshall(createInvalidation2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateInvalidation2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add a new public key to CloudFront to use, for example, for field-level
     * encryption. You can add a maximum of 10 public keys with one AWS account.
     * </p>
     * 
     * @param createPublicKey2019_03_26Request
     * @return createPublicKey2019_03_26Result The response from the
     *         CreatePublicKey2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws PublicKeyAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws TooManyPublicKeysException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePublicKey2019_03_26Result createPublicKey2019_03_26(
            CreatePublicKey2019_03_26Request createPublicKey2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPublicKey2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicKey2019_03_26Request> request = null;
        Response<CreatePublicKey2019_03_26Result> response = null;
        try {
            request = new CreatePublicKey2019_03_26RequestMarshaller()
                    .marshall(createPublicKey2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreatePublicKey2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new RTMP distribution. An RTMP distribution is similar to a web
     * distribution, but an RTMP distribution streams media files using the
     * Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using
     * HTTP.
     * </p>
     * <p>
     * To create a new distribution, submit a <code>POST</code> request to the
     * <i>CloudFront API version</i>/distribution resource. The request body
     * must include a document with a <i>StreamingDistributionConfig</i>
     * element. The response echoes the <code>StreamingDistributionConfig</code>
     * element and returns other information about the RTMP distribution.
     * </p>
     * <p>
     * To get the status of your request, use the <i>GET
     * StreamingDistribution</i> API action. When the value of
     * <code>Enabled</code> is <code>true</code> and the value of
     * <code>Status</code> is <code>Deployed</code>, your distribution is ready.
     * A distribution usually deploys in less than 15 minutes.
     * </p>
     * <p>
     * For more information about web distributions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html"
     * >Working with RTMP Distributions</a> in the <i>Amazon CloudFront
     * Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Beginning with the 2012-05-05 version of the CloudFront API, we made
     * substantial changes to the format of the XML document that you include in
     * the request body when you create or update a web distribution or an RTMP
     * distribution, and when you invalidate objects. With previous versions of
     * the API, we discovered that it was too easy to accidentally delete one or
     * more values for an element that accepts multiple values, for example,
     * CNAMEs and trusted signers. Our changes for the 2012-05-05 release are
     * intended to prevent these accidental deletions and to notify you when
     * there's a mismatch between the number of values you say you're specifying
     * in the <code>Quantity</code> element and the number of values specified.
     * </p>
     * </important>
     * 
     * @param createStreamingDistribution2019_03_26Request <p>
     *            The request to create a new streaming distribution.
     *            </p>
     * @return createStreamingDistribution2019_03_26Result The response from the
     *         CreateStreamingDistribution2019_03_26 service method, as returned
     *         by Amazon CloudFront.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws InvalidOriginException
     * @throws InvalidOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws MissingBodyException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws TooManyStreamingDistributionsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateStreamingDistribution2019_03_26Result createStreamingDistribution2019_03_26(
            CreateStreamingDistribution2019_03_26Request createStreamingDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamingDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingDistribution2019_03_26Request> request = null;
        Response<CreateStreamingDistribution2019_03_26Result> response = null;
        try {
            request = new CreateStreamingDistribution2019_03_26RequestMarshaller()
                    .marshall(createStreamingDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateStreamingDistribution2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new streaming distribution with tags.
     * </p>
     * 
     * @param createStreamingDistributionWithTags2019_03_26Request <p>
     *            The request to create a new streaming distribution with tags.
     *            </p>
     * @return createStreamingDistributionWithTags2019_03_26Result The response
     *         from the CreateStreamingDistributionWithTags2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws InvalidOriginException
     * @throws InvalidOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws MissingBodyException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws TooManyStreamingDistributionsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws InvalidTaggingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateStreamingDistributionWithTags2019_03_26Result createStreamingDistributionWithTags2019_03_26(
            CreateStreamingDistributionWithTags2019_03_26Request createStreamingDistributionWithTags2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamingDistributionWithTags2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingDistributionWithTags2019_03_26Request> request = null;
        Response<CreateStreamingDistributionWithTags2019_03_26Result> response = null;
        try {
            request = new CreateStreamingDistributionWithTags2019_03_26RequestMarshaller()
                    .marshall(createStreamingDistributionWithTags2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new CreateStreamingDistributionWithTags2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentity2019_03_26Request <p>
     *            Deletes a origin access identity.
     *            </p>
     * @throws AccessDeniedException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteCloudFrontOriginAccessIdentity2019_03_26(
            DeleteCloudFrontOriginAccessIdentity2019_03_26Request deleteCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCloudFrontOriginAccessIdentity2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCloudFrontOriginAccessIdentity2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteCloudFrontOriginAccessIdentity2019_03_26RequestMarshaller()
                    .marshall(deleteCloudFrontOriginAccessIdentity2019_03_26Request);
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
     * Delete a distribution.
     * </p>
     * 
     * @param deleteDistribution2019_03_26Request <p>
     *            This action deletes a web distribution. To delete a web
     *            distribution using the CloudFront API, perform the following
     *            steps.
     *            </p>
     *            <p>
     *            <b>To delete a web distribution using the CloudFront API:</b>
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Disable the web distribution
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit a <code>GET Distribution Config</code> request to get
     *            the current configuration and the <code>Etag</code> header for
     *            the distribution.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Update the XML document that was returned in the response to
     *            your <code>GET Distribution Config</code> request to change
     *            the value of <code>Enabled</code> to <code>false</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit a <code>PUT Distribution Config</code> request to
     *            update the configuration for your distribution. In the request
     *            body, include the XML document that you updated in Step 3. Set
     *            the value of the HTTP <code>If-Match</code> header to the
     *            value of the <code>ETag</code> header that CloudFront returned
     *            when you submitted the <code>GET Distribution Config</code>
     *            request in Step 2.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Review the response to the
     *            <code>PUT Distribution Config</code> request to confirm that
     *            the distribution was successfully disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit a <code>GET Distribution</code> request to confirm that
     *            your changes have propagated. When propagation is complete,
     *            the value of <code>Status</code> is <code>Deployed</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit a <code>DELETE Distribution</code> request. Set the
     *            value of the HTTP <code>If-Match</code> header to the value of
     *            the <code>ETag</code> header that CloudFront returned when you
     *            submitted the <code>GET Distribution Config</code> request in
     *            Step 6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Review the response to your <code>DELETE Distribution</code>
     *            request to confirm that the distribution was successfully
     *            deleted.
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            For information about deleting a distribution using the
     *            CloudFront console, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *            >Deleting a Distribution</a> in the <i>Amazon CloudFront
     *            Developer Guide</i>.
     *            </p>
     * @throws AccessDeniedException
     * @throws DistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchDistributionException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDistribution2019_03_26(
            DeleteDistribution2019_03_26Request deleteDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDistribution2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteDistribution2019_03_26RequestMarshaller()
                    .marshall(deleteDistribution2019_03_26Request);
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
     * Remove a field-level encryption configuration.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionConfig2019_03_26Request
     * @throws AccessDeniedException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws PreconditionFailedException
     * @throws FieldLevelEncryptionConfigInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteFieldLevelEncryptionConfig2019_03_26(
            DeleteFieldLevelEncryptionConfig2019_03_26Request deleteFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFieldLevelEncryptionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFieldLevelEncryptionConfig2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteFieldLevelEncryptionConfig2019_03_26RequestMarshaller()
                    .marshall(deleteFieldLevelEncryptionConfig2019_03_26Request);
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
     * Remove a field-level encryption profile.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionProfile2019_03_26Request
     * @throws AccessDeniedException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws PreconditionFailedException
     * @throws FieldLevelEncryptionProfileInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteFieldLevelEncryptionProfile2019_03_26(
            DeleteFieldLevelEncryptionProfile2019_03_26Request deleteFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFieldLevelEncryptionProfile2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFieldLevelEncryptionProfile2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteFieldLevelEncryptionProfile2019_03_26RequestMarshaller()
                    .marshall(deleteFieldLevelEncryptionProfile2019_03_26Request);
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
     * Remove a public key you previously added to CloudFront.
     * </p>
     * 
     * @param deletePublicKey2019_03_26Request
     * @throws AccessDeniedException
     * @throws PublicKeyInUseException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchPublicKeyException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deletePublicKey2019_03_26(
            DeletePublicKey2019_03_26Request deletePublicKey2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePublicKey2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePublicKey2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeletePublicKey2019_03_26RequestMarshaller()
                    .marshall(deletePublicKey2019_03_26Request);
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
     * Delete a streaming distribution. To delete an RTMP distribution using the
     * CloudFront API, perform the following steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get
     * the current configuration and the <code>Etag</code> header for the
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your
     * <code>GET Streaming Distribution Config</code> request to change the
     * value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update
     * the configuration for your distribution. In the request body, include the
     * XML document that you updated in Step 3. Then set the value of the HTTP
     * <code>If-Match</code> header to the value of the <code>ETag</code> header
     * that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code>
     * request to confirm that the distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to
     * confirm that your changes have propagated. When propagation is complete,
     * the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the
     * value of the HTTP <code>If-Match</code> header to the value of the
     * <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code>
     * request to confirm that the distribution was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront
     * console, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     * >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistribution2019_03_26Request <p>
     *            The request to delete a streaming distribution.
     *            </p>
     * @throws AccessDeniedException
     * @throws StreamingDistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchStreamingDistributionException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteStreamingDistribution2019_03_26(
            DeleteStreamingDistribution2019_03_26Request deleteStreamingDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStreamingDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamingDistribution2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteStreamingDistribution2019_03_26RequestMarshaller()
                    .marshall(deleteStreamingDistribution2019_03_26Request);
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
     * Get the information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentity2019_03_26Request <p>
     *            The request to get an origin access identity's information.
     *            </p>
     * @return getCloudFrontOriginAccessIdentity2019_03_26Result The response
     *         from the GetCloudFrontOriginAccessIdentity2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentity2019_03_26Result getCloudFrontOriginAccessIdentity2019_03_26(
            GetCloudFrontOriginAccessIdentity2019_03_26Request getCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentity2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFrontOriginAccessIdentity2019_03_26Request> request = null;
        Response<GetCloudFrontOriginAccessIdentity2019_03_26Result> response = null;
        try {
            request = new GetCloudFrontOriginAccessIdentity2019_03_26RequestMarshaller()
                    .marshall(getCloudFrontOriginAccessIdentity2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetCloudFrontOriginAccessIdentity2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfig2019_03_26Request <p>
     *            The origin access identity's configuration information. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html"
     *            >CloudFrontOriginAccessIdentityConfig</a>.
     *            </p>
     * @return getCloudFrontOriginAccessIdentityConfig2019_03_26Result The
     *         response from the
     *         GetCloudFrontOriginAccessIdentityConfig2019_03_26 service method,
     *         as returned by Amazon CloudFront.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentityConfig2019_03_26Result getCloudFrontOriginAccessIdentityConfig2019_03_26(
            GetCloudFrontOriginAccessIdentityConfig2019_03_26Request getCloudFrontOriginAccessIdentityConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentityConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFrontOriginAccessIdentityConfig2019_03_26Request> request = null;
        Response<GetCloudFrontOriginAccessIdentityConfig2019_03_26Result> response = null;
        try {
            request = new GetCloudFrontOriginAccessIdentityConfig2019_03_26RequestMarshaller()
                    .marshall(getCloudFrontOriginAccessIdentityConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetCloudFrontOriginAccessIdentityConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistribution2019_03_26Request <p>
     *            The request to get a distribution's information.
     *            </p>
     * @return getDistribution2019_03_26Result The response from the
     *         GetDistribution2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDistribution2019_03_26Result getDistribution2019_03_26(
            GetDistribution2019_03_26Request getDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistribution2019_03_26Request> request = null;
        Response<GetDistribution2019_03_26Result> response = null;
        try {
            request = new GetDistribution2019_03_26RequestMarshaller()
                    .marshall(getDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetDistribution2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfig2019_03_26Request <p>
     *            The request to get a distribution configuration.
     *            </p>
     * @return getDistributionConfig2019_03_26Result The response from the
     *         GetDistributionConfig2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDistributionConfig2019_03_26Result getDistributionConfig2019_03_26(
            GetDistributionConfig2019_03_26Request getDistributionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDistributionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionConfig2019_03_26Request> request = null;
        Response<GetDistributionConfig2019_03_26Result> response = null;
        try {
            request = new GetDistributionConfig2019_03_26RequestMarshaller()
                    .marshall(getDistributionConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetDistributionConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryption2019_03_26Request
     * @return getFieldLevelEncryption2019_03_26Result The response from the
     *         GetFieldLevelEncryption2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFieldLevelEncryption2019_03_26Result getFieldLevelEncryption2019_03_26(
            GetFieldLevelEncryption2019_03_26Request getFieldLevelEncryption2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryption2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryption2019_03_26Request> request = null;
        Response<GetFieldLevelEncryption2019_03_26Result> response = null;
        try {
            request = new GetFieldLevelEncryption2019_03_26RequestMarshaller()
                    .marshall(getFieldLevelEncryption2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetFieldLevelEncryption2019_03_26ResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionConfig2019_03_26Request
     * @return getFieldLevelEncryptionConfig2019_03_26Result The response from
     *         the GetFieldLevelEncryptionConfig2019_03_26 service method, as
     *         returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFieldLevelEncryptionConfig2019_03_26Result getFieldLevelEncryptionConfig2019_03_26(
            GetFieldLevelEncryptionConfig2019_03_26Request getFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionConfig2019_03_26Request> request = null;
        Response<GetFieldLevelEncryptionConfig2019_03_26Result> response = null;
        try {
            request = new GetFieldLevelEncryptionConfig2019_03_26RequestMarshaller()
                    .marshall(getFieldLevelEncryptionConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetFieldLevelEncryptionConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption profile information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfile2019_03_26Request
     * @return getFieldLevelEncryptionProfile2019_03_26Result The response from
     *         the GetFieldLevelEncryptionProfile2019_03_26 service method, as
     *         returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFieldLevelEncryptionProfile2019_03_26Result getFieldLevelEncryptionProfile2019_03_26(
            GetFieldLevelEncryptionProfile2019_03_26Request getFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionProfile2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionProfile2019_03_26Request> request = null;
        Response<GetFieldLevelEncryptionProfile2019_03_26Result> response = null;
        try {
            request = new GetFieldLevelEncryptionProfile2019_03_26RequestMarshaller()
                    .marshall(getFieldLevelEncryptionProfile2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetFieldLevelEncryptionProfile2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption profile configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileConfig2019_03_26Request
     * @return getFieldLevelEncryptionProfileConfig2019_03_26Result The response
     *         from the GetFieldLevelEncryptionProfileConfig2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFieldLevelEncryptionProfileConfig2019_03_26Result getFieldLevelEncryptionProfileConfig2019_03_26(
            GetFieldLevelEncryptionProfileConfig2019_03_26Request getFieldLevelEncryptionProfileConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionProfileConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionProfileConfig2019_03_26Request> request = null;
        Response<GetFieldLevelEncryptionProfileConfig2019_03_26Result> response = null;
        try {
            request = new GetFieldLevelEncryptionProfileConfig2019_03_26RequestMarshaller()
                    .marshall(getFieldLevelEncryptionProfileConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetFieldLevelEncryptionProfileConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidation2019_03_26Request <p>
     *            The request to get an invalidation's information.
     *            </p>
     * @return getInvalidation2019_03_26Result The response from the
     *         GetInvalidation2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws NoSuchInvalidationException
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInvalidation2019_03_26Result getInvalidation2019_03_26(
            GetInvalidation2019_03_26Request getInvalidation2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInvalidation2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvalidation2019_03_26Request> request = null;
        Response<GetInvalidation2019_03_26Result> response = null;
        try {
            request = new GetInvalidation2019_03_26RequestMarshaller()
                    .marshall(getInvalidation2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetInvalidation2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the public key information.
     * </p>
     * 
     * @param getPublicKey2019_03_26Request
     * @return getPublicKey2019_03_26Result The response from the
     *         GetPublicKey2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchPublicKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPublicKey2019_03_26Result getPublicKey2019_03_26(
            GetPublicKey2019_03_26Request getPublicKey2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPublicKey2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicKey2019_03_26Request> request = null;
        Response<GetPublicKey2019_03_26Result> response = null;
        try {
            request = new GetPublicKey2019_03_26RequestMarshaller()
                    .marshall(getPublicKey2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetPublicKey2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return public key configuration informaation
     * </p>
     * 
     * @param getPublicKeyConfig2019_03_26Request
     * @return getPublicKeyConfig2019_03_26Result The response from the
     *         GetPublicKeyConfig2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws NoSuchPublicKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPublicKeyConfig2019_03_26Result getPublicKeyConfig2019_03_26(
            GetPublicKeyConfig2019_03_26Request getPublicKeyConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPublicKeyConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicKeyConfig2019_03_26Request> request = null;
        Response<GetPublicKeyConfig2019_03_26Result> response = null;
        try {
            request = new GetPublicKeyConfig2019_03_26RequestMarshaller()
                    .marshall(getPublicKeyConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetPublicKeyConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the
     * distribution configuration.
     * </p>
     * 
     * @param getStreamingDistribution2019_03_26Request <p>
     *            The request to get a streaming distribution's information.
     *            </p>
     * @return getStreamingDistribution2019_03_26Result The response from the
     *         GetStreamingDistribution2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStreamingDistribution2019_03_26Result getStreamingDistribution2019_03_26(
            GetStreamingDistribution2019_03_26Request getStreamingDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStreamingDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingDistribution2019_03_26Request> request = null;
        Response<GetStreamingDistribution2019_03_26Result> response = null;
        try {
            request = new GetStreamingDistribution2019_03_26RequestMarshaller()
                    .marshall(getStreamingDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetStreamingDistribution2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     * 
     * @param getStreamingDistributionConfig2019_03_26Request <p>
     *            To request to get a streaming distribution configuration.
     *            </p>
     * @return getStreamingDistributionConfig2019_03_26Result The response from
     *         the GetStreamingDistributionConfig2019_03_26 service method, as
     *         returned by Amazon CloudFront.
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStreamingDistributionConfig2019_03_26Result getStreamingDistributionConfig2019_03_26(
            GetStreamingDistributionConfig2019_03_26Request getStreamingDistributionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStreamingDistributionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingDistributionConfig2019_03_26Request> request = null;
        Response<GetStreamingDistributionConfig2019_03_26Result> response = null;
        try {
            request = new GetStreamingDistributionConfig2019_03_26RequestMarshaller()
                    .marshall(getStreamingDistributionConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetStreamingDistributionConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentities2019_03_26Request <p>
     *            The request to list origin access identities.
     *            </p>
     * @return listCloudFrontOriginAccessIdentities2019_03_26Result The response
     *         from the ListCloudFrontOriginAccessIdentities2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCloudFrontOriginAccessIdentities2019_03_26Result listCloudFrontOriginAccessIdentities2019_03_26(
            ListCloudFrontOriginAccessIdentities2019_03_26Request listCloudFrontOriginAccessIdentities2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCloudFrontOriginAccessIdentities2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCloudFrontOriginAccessIdentities2019_03_26Request> request = null;
        Response<ListCloudFrontOriginAccessIdentities2019_03_26Result> response = null;
        try {
            request = new ListCloudFrontOriginAccessIdentities2019_03_26RequestMarshaller()
                    .marshall(listCloudFrontOriginAccessIdentities2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListCloudFrontOriginAccessIdentities2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List CloudFront distributions.
     * </p>
     * 
     * @param listDistributions2019_03_26Request <p>
     *            The request to list your distributions.
     *            </p>
     * @return listDistributions2019_03_26Result The response from the
     *         ListDistributions2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDistributions2019_03_26Result listDistributions2019_03_26(
            ListDistributions2019_03_26Request listDistributions2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDistributions2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributions2019_03_26Request> request = null;
        Response<ListDistributions2019_03_26Result> response = null;
        try {
            request = new ListDistributions2019_03_26RequestMarshaller()
                    .marshall(listDistributions2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListDistributions2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web
     * ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLId2019_03_26Request <p>
     *            The request to list distributions that are associated with a
     *            specified AWS WAF web ACL.
     *            </p>
     * @return listDistributionsByWebACLId2019_03_26Result The response from the
     *         ListDistributionsByWebACLId2019_03_26 service method, as returned
     *         by Amazon CloudFront.
     * @throws InvalidArgumentException
     * @throws InvalidWebACLIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDistributionsByWebACLId2019_03_26Result listDistributionsByWebACLId2019_03_26(
            ListDistributionsByWebACLId2019_03_26Request listDistributionsByWebACLId2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDistributionsByWebACLId2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByWebACLId2019_03_26Request> request = null;
        Response<ListDistributionsByWebACLId2019_03_26Result> response = null;
        try {
            request = new ListDistributionsByWebACLId2019_03_26RequestMarshaller()
                    .marshall(listDistributionsByWebACLId2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListDistributionsByWebACLId2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all field-level encryption configurations that have been created in
     * CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionConfigs2019_03_26Request
     * @return listFieldLevelEncryptionConfigs2019_03_26Result The response from
     *         the ListFieldLevelEncryptionConfigs2019_03_26 service method, as
     *         returned by Amazon CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFieldLevelEncryptionConfigs2019_03_26Result listFieldLevelEncryptionConfigs2019_03_26(
            ListFieldLevelEncryptionConfigs2019_03_26Request listFieldLevelEncryptionConfigs2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFieldLevelEncryptionConfigs2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldLevelEncryptionConfigs2019_03_26Request> request = null;
        Response<ListFieldLevelEncryptionConfigs2019_03_26Result> response = null;
        try {
            request = new ListFieldLevelEncryptionConfigs2019_03_26RequestMarshaller()
                    .marshall(listFieldLevelEncryptionConfigs2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListFieldLevelEncryptionConfigs2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request a list of field-level encryption profiles that have been created
     * in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionProfiles2019_03_26Request
     * @return listFieldLevelEncryptionProfiles2019_03_26Result The response
     *         from the ListFieldLevelEncryptionProfiles2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFieldLevelEncryptionProfiles2019_03_26Result listFieldLevelEncryptionProfiles2019_03_26(
            ListFieldLevelEncryptionProfiles2019_03_26Request listFieldLevelEncryptionProfiles2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFieldLevelEncryptionProfiles2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldLevelEncryptionProfiles2019_03_26Request> request = null;
        Response<ListFieldLevelEncryptionProfiles2019_03_26Result> response = null;
        try {
            request = new ListFieldLevelEncryptionProfiles2019_03_26RequestMarshaller()
                    .marshall(listFieldLevelEncryptionProfiles2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListFieldLevelEncryptionProfiles2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidations2019_03_26Request <p>
     *            The request to list invalidations.
     *            </p>
     * @return listInvalidations2019_03_26Result The response from the
     *         ListInvalidations2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws InvalidArgumentException
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListInvalidations2019_03_26Result listInvalidations2019_03_26(
            ListInvalidations2019_03_26Request listInvalidations2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInvalidations2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvalidations2019_03_26Request> request = null;
        Response<ListInvalidations2019_03_26Result> response = null;
        try {
            request = new ListInvalidations2019_03_26RequestMarshaller()
                    .marshall(listInvalidations2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListInvalidations2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeys2019_03_26Request
     * @return listPublicKeys2019_03_26Result The response from the
     *         ListPublicKeys2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPublicKeys2019_03_26Result listPublicKeys2019_03_26(
            ListPublicKeys2019_03_26Request listPublicKeys2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPublicKeys2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPublicKeys2019_03_26Request> request = null;
        Response<ListPublicKeys2019_03_26Result> response = null;
        try {
            request = new ListPublicKeys2019_03_26RequestMarshaller()
                    .marshall(listPublicKeys2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListPublicKeys2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributions2019_03_26Request <p>
     *            The request to list your streaming distributions.
     *            </p>
     * @return listStreamingDistributions2019_03_26Result The response from the
     *         ListStreamingDistributions2019_03_26 service method, as returned
     *         by Amazon CloudFront.
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListStreamingDistributions2019_03_26Result listStreamingDistributions2019_03_26(
            ListStreamingDistributions2019_03_26Request listStreamingDistributions2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStreamingDistributions2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamingDistributions2019_03_26Request> request = null;
        Response<ListStreamingDistributions2019_03_26Result> response = null;
        try {
            request = new ListStreamingDistributions2019_03_26RequestMarshaller()
                    .marshall(listStreamingDistributions2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListStreamingDistributions2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResource2019_03_26Request <p>
     *            The request to list tags for a CloudFront resource.
     *            </p>
     * @return listTagsForResource2019_03_26Result The response from the
     *         ListTagsForResource2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResource2019_03_26Result listTagsForResource2019_03_26(
            ListTagsForResource2019_03_26Request listTagsForResource2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResource2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResource2019_03_26Request> request = null;
        Response<ListTagsForResource2019_03_26Result> response = null;
        try {
            request = new ListTagsForResource2019_03_26RequestMarshaller()
                    .marshall(listTagsForResource2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTagsForResource2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResource2019_03_26Request <p>
     *            The request to add tags to a CloudFront resource.
     *            </p>
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagResource2019_03_26(TagResource2019_03_26Request tagResource2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResource2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResource2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new TagResource2019_03_26RequestMarshaller()
                    .marshall(tagResource2019_03_26Request);
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
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResource2019_03_26Request <p>
     *            The request to remove tags from a CloudFront resource.
     *            </p>
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagResource2019_03_26(
            UntagResource2019_03_26Request untagResource2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResource2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResource2019_03_26Request> request = null;
        Response<Void> response = null;
        try {
            request = new UntagResource2019_03_26RequestMarshaller()
                    .marshall(untagResource2019_03_26Request);
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
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentity2019_03_26Request <p>
     *            The request to update an origin access identity.
     *            </p>
     * @return updateCloudFrontOriginAccessIdentity2019_03_26Result The response
     *         from the UpdateCloudFrontOriginAccessIdentity2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws IllegalUpdateException
     * @throws InvalidIfMatchVersionException
     * @throws MissingBodyException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCloudFrontOriginAccessIdentity2019_03_26Result updateCloudFrontOriginAccessIdentity2019_03_26(
            UpdateCloudFrontOriginAccessIdentity2019_03_26Request updateCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCloudFrontOriginAccessIdentity2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCloudFrontOriginAccessIdentity2019_03_26Request> request = null;
        Response<UpdateCloudFrontOriginAccessIdentity2019_03_26Result> response = null;
        try {
            request = new UpdateCloudFrontOriginAccessIdentity2019_03_26RequestMarshaller()
                    .marshall(updateCloudFrontOriginAccessIdentity2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new UpdateCloudFrontOriginAccessIdentity2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for a web distribution.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when
     * you create a distribution. When you update your distribution by using
     * this API action, follow the steps here to get the current configuration
     * and then make your updates, to make sure that you include all of the
     * required fields. To view a summary, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in
     * the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * The update process includes getting the current distribution
     * configuration, updating the XML document that is returned to make your
     * changes, and then submitting an <code>UpdateDistribution</code> request
     * to make the updates.
     * </p>
     * <p>
     * For information about updating a distribution using the CloudFront
     * console instead, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-creating-console.html"
     * >Creating a Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html"
     * >GetDistributionConfig</a> request to get the current configuration and
     * an <code>Etag</code> header for the distribution.
     * </p>
     * <note>
     * <p>
     * If you update the distribution again, you must get a new
     * <code>Etag</code> header.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your
     * <code>GetDistributionConfig</code> request to include your changes.
     * </p>
     * <important>
     * <p>
     * When you edit the XML file, be aware of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must strip out the ETag parameter that is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * Additional fields are required when you update a distribution. There may
     * be fields included in the XML file for features that you haven't
     * configured for your distribution. This is expected and required to
     * successfully update the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't change the value of <code>CallerReference</code>. If you try to
     * change this value, CloudFront returns an <code>IllegalUpdate</code>
     * error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The new configuration replaces the existing configuration; the values
     * that you specify in an <code>UpdateDistribution</code> request are not
     * merged into your existing configuration. When you add, delete, or replace
     * values in an element that allows multiple values (for example,
     * <code>CNAME</code>), you must specify all of the values that you want to
     * appear in the updated distribution. In addition, you must update the
     * corresponding <code>Quantity</code> element.
     * </p>
     * </li>
     * </ul>
     * </important></li>
     * <li>
     * <p>
     * Submit an <code>UpdateDistribution</code> request to update the
     * configuration for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the request body, include the XML document that you updated in Step 2.
     * The request body must include an XML document with a
     * <code>DistributionConfig</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set the value of the HTTP <code>If-Match</code> header to the value of
     * the <code>ETag</code> header that CloudFront returned when you submitted
     * the <code>GetDistributionConfig</code> request in Step 1.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>UpdateDistribution</code> request to
     * confirm that the configuration was successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: Submit a <a href=
     * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistribution.html"
     * >GetDistribution</a> request to confirm that your changes have
     * propagated. When propagation is complete, the value of
     * <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateDistribution2019_03_26Request <p>
     *            The request to update a distribution.
     *            </p>
     * @return updateDistribution2019_03_26Result The response from the
     *         UpdateDistribution2019_03_26 service method, as returned by
     *         Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     * @throws InvalidIfMatchVersionException
     * @throws MissingBodyException
     * @throws NoSuchDistributionException
     * @throws PreconditionFailedException
     * @throws TooManyDistributionCNAMEsException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidRelativePathException
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws InvalidRequiredProtocolException
     * @throws NoSuchOriginException
     * @throws TooManyOriginsException
     * @throws TooManyOriginGroupsPerDistributionException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidForwardCookiesException
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     * @throws TooManyCertificatesException
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     * @throws TooManyLambdaFunctionAssociationsException
     * @throws InvalidLambdaFunctionAssociationException
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDistribution2019_03_26Result updateDistribution2019_03_26(
            UpdateDistribution2019_03_26Request updateDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistribution2019_03_26Request> request = null;
        Response<UpdateDistribution2019_03_26Result> response = null;
        try {
            request = new UpdateDistribution2019_03_26RequestMarshaller()
                    .marshall(updateDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateDistribution2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a field-level encryption configuration.
     * </p>
     * 
     * @param updateFieldLevelEncryptionConfig2019_03_26Request
     * @return updateFieldLevelEncryptionConfig2019_03_26Result The response
     *         from the UpdateFieldLevelEncryptionConfig2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws IllegalUpdateException
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws NoSuchFieldLevelEncryptionConfigException
     * @throws PreconditionFailedException
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     * @throws QueryArgProfileEmptyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateFieldLevelEncryptionConfig2019_03_26Result updateFieldLevelEncryptionConfig2019_03_26(
            UpdateFieldLevelEncryptionConfig2019_03_26Request updateFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFieldLevelEncryptionConfig2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFieldLevelEncryptionConfig2019_03_26Request> request = null;
        Response<UpdateFieldLevelEncryptionConfig2019_03_26Result> response = null;
        try {
            request = new UpdateFieldLevelEncryptionConfig2019_03_26RequestMarshaller()
                    .marshall(updateFieldLevelEncryptionConfig2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new UpdateFieldLevelEncryptionConfig2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a field-level encryption profile.
     * </p>
     * 
     * @param updateFieldLevelEncryptionProfile2019_03_26Request
     * @return updateFieldLevelEncryptionProfile2019_03_26Result The response
     *         from the UpdateFieldLevelEncryptionProfile2019_03_26 service
     *         method, as returned by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     * @throws IllegalUpdateException
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchPublicKeyException
     * @throws NoSuchFieldLevelEncryptionProfileException
     * @throws PreconditionFailedException
     * @throws FieldLevelEncryptionProfileSizeExceededException
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateFieldLevelEncryptionProfile2019_03_26Result updateFieldLevelEncryptionProfile2019_03_26(
            UpdateFieldLevelEncryptionProfile2019_03_26Request updateFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFieldLevelEncryptionProfile2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFieldLevelEncryptionProfile2019_03_26Request> request = null;
        Response<UpdateFieldLevelEncryptionProfile2019_03_26Result> response = null;
        try {
            request = new UpdateFieldLevelEncryptionProfile2019_03_26RequestMarshaller()
                    .marshall(updateFieldLevelEncryptionProfile2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new UpdateFieldLevelEncryptionProfile2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update public key information. Note that the only value you can change is
     * the comment.
     * </p>
     * 
     * @param updatePublicKey2019_03_26Request
     * @return updatePublicKey2019_03_26Result The response from the
     *         UpdatePublicKey2019_03_26 service method, as returned by Amazon
     *         CloudFront.
     * @throws AccessDeniedException
     * @throws CannotChangeImmutablePublicKeyFieldsException
     * @throws InvalidArgumentException
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws NoSuchPublicKeyException
     * @throws PreconditionFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePublicKey2019_03_26Result updatePublicKey2019_03_26(
            UpdatePublicKey2019_03_26Request updatePublicKey2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePublicKey2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePublicKey2019_03_26Request> request = null;
        Response<UpdatePublicKey2019_03_26Result> response = null;
        try {
            request = new UpdatePublicKey2019_03_26RequestMarshaller()
                    .marshall(updatePublicKey2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdatePublicKey2019_03_26ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistribution2019_03_26Request <p>
     *            The request to update a streaming distribution.
     *            </p>
     * @return updateStreamingDistribution2019_03_26Result The response from the
     *         UpdateStreamingDistribution2019_03_26 service method, as returned
     *         by Amazon CloudFront.
     * @throws AccessDeniedException
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     * @throws InvalidIfMatchVersionException
     * @throws MissingBodyException
     * @throws NoSuchStreamingDistributionException
     * @throws PreconditionFailedException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TooManyTrustedSignersException
     * @throws TrustedSignerDoesNotExistException
     * @throws InconsistentQuantitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CloudFront indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateStreamingDistribution2019_03_26Result updateStreamingDistribution2019_03_26(
            UpdateStreamingDistribution2019_03_26Request updateStreamingDistribution2019_03_26Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStreamingDistribution2019_03_26Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamingDistribution2019_03_26Request> request = null;
        Response<UpdateStreamingDistribution2019_03_26Result> response = null;
        try {
            request = new UpdateStreamingDistribution2019_03_26RequestMarshaller()
                    .marshall(updateStreamingDistribution2019_03_26Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new UpdateStreamingDistribution2019_03_26ResultStaxUnmarshaller(),
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
