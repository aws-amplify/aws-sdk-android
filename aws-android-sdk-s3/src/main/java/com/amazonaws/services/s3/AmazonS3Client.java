/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

import static com.amazonaws.util.LengthCheckInputStream.EXCLUDE_SKIPPED_BYTES;
import static com.amazonaws.util.LengthCheckInputStream.INCLUDE_SKIPPED_BYTES;
import static com.amazonaws.util.ValidationUtils.assertNotNull;
import static com.amazonaws.util.ValidationUtils.assertParameterNotNull;
import static com.amazonaws.util.ValidationUtils.assertStringNotEmpty;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Presigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.DeleteObjectTaggingHeaderHandler;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.DigestValidationInputStream;
import com.amazonaws.services.s3.internal.GetObjectTaggingResponseHeaderHandler;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.MD5DigestCalculatingInputStream;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3QueryStringSigner;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3StringResponseHandler;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.SetObjectTaggingResponseHeaderHandler;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.transform.AclXmlFactory;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.BucketNotificationConfigurationStaxUnmarshaller;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.MultiObjectDeleteXmlFactory;
import com.amazonaws.services.s3.model.transform.ObjectTaggingXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.Unmarshallers;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CompleteMultipartUploadHandler;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CopyObjectResultHandler;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;

/**
 * <p>
 * Provides the client for accessing the Amazon S3 web service.
 * </p>
 * <p>
 * Amazon S3 provides storage for the Internet, and is designed to make
 * web-scale computing easier for developers.
 * </p>
 * <p>
 * The Amazon S3 Android Client provides a simple interface that can be used to
 * store and retrieve any amount of data, at any time, from anywhere on the web.
 * It gives any developer access to the same highly scalable, reliable, secure,
 * fast, inexpensive infrastructure that Amazon uses to run its own global
 * network of web sites. The service aims to maximize benefits of scale and to
 * pass those benefits on to developers.
 * </p>
 * <p>
 * For more information about Amazon S3, please see <a
 * href="http://aws.amazon.com/s3"> http://aws.amazon.com/s3</a>
 * </p>
 */
@SuppressWarnings("deprecation")
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    public static final String S3_SERVICE_NAME = "s3";

    private static final String S3_SIGNER = "S3SignerType";
    private static final String S3_V4_SIGNER = "AWSS3V4SignerType";

    /** Shared logger for client events */
    private static Log log = LogFactory.getLog(AmazonS3Client.class);

    static {
        // Enable S3 specific predefined request metrics.
        AwsSdkMetrics.addAll(Arrays.asList(S3ServiceMetric.values()));

        // Register S3-specific signers.
        SignerFactory.registerSigner(S3_SIGNER, S3Signer.class);
        SignerFactory.registerSigner(S3_V4_SIGNER, AWSS3V4Signer.class);
    }

    /** Responsible for handling error responses from all S3 service calls. */
    private final S3ErrorResponseHandler errorResponseHandler = new S3ErrorResponseHandler();

    /** Shared response handler for operations with no response. */
    private final S3XmlResponseHandler<Void> voidResponseHandler = new S3XmlResponseHandler<Void>(
            null);

    /** Shared factory for converting configuration objects to XML */
    private static final BucketConfigurationXmlFactory bucketConfigurationXmlFactory = new BucketConfigurationXmlFactory();

    /**
     * Shared factory for converting request payment configuration objects to
     * XML
     */
    private static final RequestPaymentConfigurationXmlFactory requestPaymentConfigurationXmlFactory = new RequestPaymentConfigurationXmlFactory();

    /** S3 specific client configuration options */
    private S3ClientOptions clientOptions = new S3ClientOptions();

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    /**
     * The S3 client region that is set by either (a) calling
     * setRegion/configureRegion OR (b) calling setEndpoint with a
     * region-specific S3 endpoint. This region string will be used for signing
     * requests sent by this client.
     */
    volatile String clientRegion;

    /**
     * Number of Kbytes that needs to be written before status updates are called.
     */
    private int notificationThreshold = 1024;

    private static final int BUCKET_REGION_CACHE_SIZE = 300;

    private static final Map<String, String> bucketRegionCache = Collections.synchronizedMap(
            new LinkedHashMap<String, String>(BUCKET_REGION_CACHE_SIZE, 1.1f, true) {
                private static final long serialVersionUID = 23453L;

                @Override
                protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                    return size() > BUCKET_REGION_CACHE_SIZE;
                }
            });

    static Map<String, String> getBucketRegionCache() {
        return bucketRegionCache;
    }

    private final CompleteMultipartUploadRetryCondition completeMultipartUploadRetryCondition = new CompleteMultipartUploadRetryCondition();

    /**
     * Constructs a new client to invoke service methods on Amazon S3. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance Profile Credentials - delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * If no credentials are found in the chain, this client will attempt to
     * work in an anonymous mode where requests aren't signed. Only a subset of
     * the Amazon S3 API will work with anonymous <i>(i.e. unsigned)</i>
     * requests, but this can prove useful in some situations. For example:
     * <ul>
     * <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can call
     * {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     * <li>If an object has {@link Permission#Read} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can call
     * {@link #getObject(String, String)} and
     * {@link #getObjectMetadata(String, String)} to pull object content and
     * metadata.</li>
     * <li>If a bucket has {@link Permission#Write} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     * to the bucket.</li>
     * </ul>
     * </p>
     * <p>
     * You can force the client to operate in an anonymous mode, and skip the
     * credentials provider chain, by passing in <code>null</code> for the
     * credentials.
     * </p>
     *
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials)
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials, ClientConfiguration)
     */
    @Deprecated
    public AmazonS3Client() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials to
     * access Amazon S3.
     *
     * @param awsCredentials The AWS credentials to use when making requests to
     *            Amazon S3 with this client.
     * @see AmazonS3Client#AmazonS3Client()
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials, ClientConfiguration)
     */
    public AmazonS3Client(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials and
     * client configuration to access Amazon S3.
     *
     * @param awsCredentials The AWS credentials to use when making requests to
     *            Amazon S3 with this client.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon S3 (e.g. proxy settings,
     *            retry counts, etc).
     * @see AmazonS3Client#AmazonS3Client()
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials)
     */
    public AmazonS3Client(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials
     * provider to access Amazon S3.
     *
     * @param credentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider) {
        this(credentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials and
     * client configuration to access Amazon S3.
     *
     * @param credentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon S3 (e.g. proxy settings,
     *            retry counts, etc).
     */
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider,
                          ClientConfiguration clientConfiguration) {
        this(credentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials,
     * client configuration and request metric collector to access Amazon S3.
     *
     * @param credentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon S3 (e.g. proxy settings,
     *            retry counts, etc).
     * @param requestMetricCollector request metric collector
     */
    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider,
                          ClientConfiguration clientConfiguration,
                          RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, new UrlHttpClient(clientConfiguration),
                requestMetricCollector);
        this.awsCredentialsProvider = credentialsProvider;
        init();
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials,
     * client configuration and request metric collector to access Amazon S3.
     *
     * @param credentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param httpClient
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon S3 (e.g. proxy settings,
     *            retry counts, etc).
     * @param requestMetricCollector request metric collector
     */
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider,
                          ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        this.awsCredentialsProvider = credentialsProvider;
        init();
    }

    /**
     * Constructs a new client using the specified client configuration to
     * access Amazon S3. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance Profile Credentials - delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * If no credentials are found in the chain, this client will attempt to
     * work in an anonymous mode where requests aren't signed. Only a subset of
     * the Amazon S3 API will work with anonymous <i>(i.e. unsigned)</i>
     * requests, but this can prove useful in some situations. For example:
     * <ul>
     * <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can call
     * {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     * <li>If an object has {@link Permission#Read} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can call
     * {@link #getObject(String, String)} and
     * {@link #getObjectMetadata(String, String)} to pull object content and
     * metadata.</li>
     * <li>If a bucket has {@link Permission#Write} permission for the
     * {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     * to the bucket.</li>
     * </ul>
     * </p>
     * <p>
     * You can force the client to operate in an anonymous mode, and skip the
     * credentials provider chain, by passing in <code>null</code> for the
     * credentials.
     * </p>
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon S3 (e.g. proxy settings,
     *            retry counts, etc).
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials)
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials, ClientConfiguration)
     */
    public AmazonS3Client(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    private void init() {
        // calling this.setEndpoint(...) will also modify the signer accordingly
        setEndpoint(Constants.S3_HOSTNAME);
        this.endpointPrefix = "s3";

        final HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/s3/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/s3/request.handler2s"));
    }


    /**
     * Sets the number of Kbytes that need to be written before updates to the
     * listener occur.
     *
     * @param threshold Number of Kbytes that needs to be written before
     *            write update notification occurs.
     */
    public void setNotificationThreshold(final int threshold) {
        this.notificationThreshold = threshold;
    }



    @Override
    public void setEndpoint(String endpoint) {
        if (endpoint.endsWith(Constants.S3_ACCELERATE_HOSTNAME)) {
            throw new IllegalStateException(
                    "To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.setEndpoint(endpoint);
        /*
         * Extract the region string from the endpoint if it's not known to be a
         * global S3 endpoint.
         */
        if (!endpoint.endsWith(Constants.S3_HOSTNAME)) {
            clientRegion = AwsHostNameUtils.parseRegionName(this.endpoint.getHost(),
                    S3_SERVICE_NAME);
        }
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        super.setRegion(region);
        /*
         * We need to preserve the user provided region. This is because the
         * region might be mapped to a global s3 endpoint (e.g. when the client
         * is in accelerate mode), in which case we won't be able to extract the
         * region back from the endpoint during request signing phase.
         */
        clientRegion = region.getName();
    }

    /**
     * <p>
     * Override the default S3 client options for this client. Also set the
     * endpoint to s3-accelerate if such is specified in the S3 client options.
     * </p>
     *
     * @param clientOptions The S3 client options to use.
     */
    @Override
    public void setS3ClientOptions(S3ClientOptions clientOptions) {
        this.clientOptions = new S3ClientOptions(clientOptions);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listNextBatchOfVersions(com.amazonaws
     * .services.s3.model.S3VersionListing)
     */
    @Override
    public VersionListing listNextBatchOfVersions(VersionListing previousVersionListing)
            throws AmazonClientException, AmazonServiceException {
        return listNextBatchOfVersions(new ListNextBatchOfVersionsRequest(previousVersionListing));
    }

    @Override
    public VersionListing listNextBatchOfVersions(
            ListNextBatchOfVersionsRequest listNextBatchOfVersionsRequest)
            throws AmazonClientException, AmazonServiceException {

        assertParameterNotNull(
                listNextBatchOfVersionsRequest,
                "The request object parameter must be specified when listing the next batch of versions in a bucket");

        final VersionListing previousVersionListing = listNextBatchOfVersionsRequest
                .getPreviousVersionListing();

        if (!previousVersionListing.isTruncated()) {
            final VersionListing emptyListing = new VersionListing();
            emptyListing.setBucketName(previousVersionListing.getBucketName());
            emptyListing.setDelimiter(previousVersionListing.getDelimiter());
            emptyListing.setKeyMarker(previousVersionListing.getNextKeyMarker());
            emptyListing.setVersionIdMarker(previousVersionListing.getNextVersionIdMarker());
            emptyListing.setMaxKeys(previousVersionListing.getMaxKeys());
            emptyListing.setPrefix(previousVersionListing.getPrefix());
            emptyListing.setEncodingType(previousVersionListing.getEncodingType());
            emptyListing.setTruncated(false);

            return emptyListing;
        }

        return listVersions(listNextBatchOfVersionsRequest.toListVersionsRequest());
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listVersions(java.lang.String,
     * java.lang.String)
     */
    @Override
    public VersionListing listVersions(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        return listVersions(new ListVersionsRequest(bucketName, prefix, null, null, null, null));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listVersions(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
     * java.lang.Integer)
     */
    @Override
    public VersionListing listVersions(String bucketName, String prefix, String keyMarker,
                                       String versionIdMarker, String delimiter, Integer maxKeys)
            throws AmazonClientException, AmazonServiceException {

        final ListVersionsRequest request = new ListVersionsRequest()
                .withBucketName(bucketName)
                .withPrefix(prefix)
                .withDelimiter(delimiter)
                .withKeyMarker(keyMarker)
                .withVersionIdMarker(versionIdMarker)
                .withMaxResults(maxKeys);
        return listVersions(request);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listVersions(com.amazonaws.services
     * .s3.model.ListVersionsRequest)
     */
    @Override
    public VersionListing listVersions(ListVersionsRequest listVersionsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listVersionsRequest.getBucketName(),
                "The bucket name parameter must be specified when listing versions in a bucket");

        /**
         * This flag shows whether we need to url decode S3 key names. This flag
         * is enabled only when the customers call
         * {@link listVersionsRequest#setEncodingType(url)}.
         */
        final boolean shouldSDKDecodeResponse = Constants.URL_ENCODING
                .equals(listVersionsRequest.getEncodingType());

        final Request<ListVersionsRequest> request = createRequest(
                listVersionsRequest.getBucketName(), null, listVersionsRequest, HttpMethodName.GET);
        request.addParameter("versions", null);

        addParameterIfNotNull(request, "prefix", listVersionsRequest.getPrefix());
        addParameterIfNotNull(request, "delimiter", listVersionsRequest.getDelimiter());
        addParameterIfNotNull(request, "key-marker", listVersionsRequest.getKeyMarker());
        addParameterIfNotNull(request, "version-id-marker",
                listVersionsRequest.getVersionIdMarker());
        addParameterIfNotNull(request, "encoding-type",
                listVersionsRequest.getEncodingType());

        if (listVersionsRequest.getMaxResults() != null
                && listVersionsRequest.getMaxResults().intValue() >= 0) {
            request.addParameter("max-keys", listVersionsRequest.getMaxResults().toString());
        }

        return invoke(request, new Unmarshallers.VersionListUnmarshaller(shouldSDKDecodeResponse),
                listVersionsRequest.getBucketName(), null);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listObjects(java.lang.String)
     */
    @Override
    public ObjectListing listObjects(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return listObjects(new ListObjectsRequest(bucketName, null, null, null, null));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listObjects(java.lang.String,
     * java.lang.String)
     */
    @Override
    public ObjectListing listObjects(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        return listObjects(new ListObjectsRequest(bucketName, prefix, null, null, null));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listObjects(com.amazonaws.services
     * .s3.model.ListObjectsRequest)
     */
    @Override
    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listObjectsRequest.getBucketName(),
                "The bucket name parameter must be specified when listing objects in a bucket");

        /**
         * This flag shows whether we need to url decode S3 key names. This flag
         * is enabled only when the customers don't explicitly call
         * {@link ListObjectsRequest#setEncodingType(String)}, otherwise, it
         * will be disabled for maintaining backwards compatibility.
         */
        final boolean shouldSDKDecodeResponse = Constants.URL_ENCODING
                .equals(listObjectsRequest.getEncodingType());

        // if the url is encoded, the prefix also has to be encoded.
        final Request<ListObjectsRequest> request = createRequest(
                listObjectsRequest.getBucketName(), null, listObjectsRequest, HttpMethodName.GET);

        addParameterIfNotNull(request, "prefix", listObjectsRequest.getPrefix());
        addParameterIfNotNull(request, "delimiter", listObjectsRequest.getDelimiter());
        addParameterIfNotNull(request, "marker", listObjectsRequest.getMarker());
        addParameterIfNotNull(request, "encoding-type", listObjectsRequest.getEncodingType());

        populateRequesterPaysHeader(request, listObjectsRequest.isRequesterPays());

        if (listObjectsRequest.getMaxKeys() != null &&
                listObjectsRequest.getMaxKeys().intValue() >= 0) {
            request.addParameter("max-keys", listObjectsRequest.getMaxKeys().toString());
        }
        return invoke(request, new Unmarshallers.ListObjectsUnmarshaller(shouldSDKDecodeResponse),
                listObjectsRequest.getBucketName(), null);
    }

    @Override
    public ListObjectsV2Result listObjectsV2(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return listObjectsV2(new ListObjectsV2Request().withBucketName(bucketName));
    }

    @Override
    public ListObjectsV2Result listObjectsV2(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        return listObjectsV2(
                new ListObjectsV2Request().withBucketName(bucketName).withPrefix(prefix));
    }

    @Override
    public ListObjectsV2Result listObjectsV2(ListObjectsV2Request listObjectsV2Request)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listObjectsV2Request.getBucketName(),
                "The bucket name parameter must be specified when listing objects in a bucket");
        final Request<ListObjectsV2Request> request = createRequest(
                listObjectsV2Request.getBucketName(), null, listObjectsV2Request,
                HttpMethodName.GET);
        /**
         * List type '2' is required to opt-in to listObjectsV2.
         */
        request.addParameter("list-type", "2");

        addParameterIfNotNull(request, "start-after", listObjectsV2Request.getStartAfter());
        addParameterIfNotNull(request, "continuation-token",
                listObjectsV2Request.getContinuationToken());
        addParameterIfNotNull(request, "delimiter", listObjectsV2Request.getDelimiter());
        addParameterIfNotNull(request, "max-keys", listObjectsV2Request.getMaxKeys());
        addParameterIfNotNull(request, "prefix", listObjectsV2Request.getPrefix());
        addParameterIfNotNull(request, "encoding-type", listObjectsV2Request.getEncodingType());
        request.addParameter("fetch-owner", Boolean.toString(listObjectsV2Request.isFetchOwner()));

        populateRequesterPaysHeader(request, listObjectsV2Request.isRequesterPays());

        /**
         * If URL encoding has been requested from S3 we'll automatically decode
         * the response.
         */
        final boolean shouldSDKDecodeResponse = Constants.URL_ENCODING.equals(listObjectsV2Request.getEncodingType());

        return invoke(request, new Unmarshallers.ListObjectsV2Unmarshaller(shouldSDKDecodeResponse),
                listObjectsV2Request.getBucketName(), null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listNextBatchOfObjects(com.amazonaws
     * .services.s3.model.S3ObjectListing)
     */
    @Override
    public ObjectListing listNextBatchOfObjects(ObjectListing previousObjectListing)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(
                previousObjectListing,
                "The previous object listing parameter must be specified when listing the next batch of objects in a bucket");

        return listNextBatchOfObjects(new ListNextBatchOfObjectsRequest(previousObjectListing));

    }


    @Override
    public ObjectListing listNextBatchOfObjects(
            ListNextBatchOfObjectsRequest listNextBatchOfObjectsRequest)
            throws AmazonClientException, AmazonServiceException {

        final ObjectListing previousObjectListing = listNextBatchOfObjectsRequest.getPreviousObjectListing();

        if (!previousObjectListing.isTruncated()) {
            final ObjectListing emptyListing = new ObjectListing();
            emptyListing.setBucketName(previousObjectListing.getBucketName());
            emptyListing.setDelimiter(previousObjectListing.getDelimiter());
            emptyListing.setMarker(previousObjectListing.getNextMarker());
            emptyListing.setMaxKeys(previousObjectListing.getMaxKeys());
            emptyListing.setPrefix(previousObjectListing.getPrefix());
            emptyListing.setEncodingType(previousObjectListing.getEncodingType());
            emptyListing.setTruncated(false);

            return emptyListing;
        }
        return listObjects(listNextBatchOfObjectsRequest.toListObjectsRequest());
    }


    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getS3AccountOwner()
     */
    @Override
    public Owner getS3AccountOwner()
            throws AmazonClientException, AmazonServiceException {

        return getS3AccountOwner(new GetS3AccountOwnerRequest());

    }


    @Override
    public Owner getS3AccountOwner(GetS3AccountOwnerRequest getS3AccountOwnerRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getS3AccountOwnerRequest,
                "The request object parameter getS3AccountOwnerRequest must be specified.");
        final Request<ListBucketsRequest> request = createRequest(null, null,
                new ListBucketsRequest(),
                HttpMethodName.GET);
        return invoke(request, new Unmarshallers.ListBucketsOwnerUnmarshaller(), null, null);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listBuckets()
     */
    @Override
    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest)
            throws AmazonClientException, AmazonServiceException {
        final Request<ListBucketsRequest> request = createRequest(null, null, listBucketsRequest,
                HttpMethodName.GET);
        return invoke(request, new Unmarshallers.ListBucketsUnmarshaller(), null, null);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listBuckets()
     */
    @Override
    public List<Bucket> listBuckets()
            throws AmazonClientException, AmazonServiceException {
        return listBuckets(new ListBucketsRequest());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketLocation(com.amazonaws.services
     * .s3.AmazonS3Client.GetBucketLocationRequest)
     */
    @Override
    public String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getBucketLocationRequest,
                "The request parameter must be specified when requesting a bucket's location");
        final String bucketName = getBucketLocationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's location");

        final Request<GetBucketLocationRequest> request = createRequest(bucketName, null,
                getBucketLocationRequest, HttpMethodName.GET);
        request.addParameter("location", null);

        return invoke(request, new Unmarshallers.BucketLocationUnmarshaller(), bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketLocation(java.lang.String)
     */
    @Override
    public String getBucketLocation(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return getBucketLocation(new GetBucketLocationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucketjava.lang.String)
     */
    @Override
    public Bucket createBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(java.lang.String,
     * com.amazonaws.services.s3.model.Region)
     */
    @Override
    public Bucket createBucket(String bucketName, Region region)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName, region));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(java.lang.String,
     * java.lang.String)
     */
    @Override
    public Bucket createBucket(String bucketName, String region)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName, region));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#createBucket(com.amazonaws.services
     * .s3.model.CreateBucketRequest)
     */
    @Override
    public Bucket createBucket(CreateBucketRequest createBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(createBucketRequest,
                "The CreateBucketRequest parameter must be specified when creating a bucket");

        String bucketName = createBucketRequest.getBucketName();
        String region = createBucketRequest.getRegion();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when creating a bucket");

        if (bucketName != null) {
            bucketName = bucketName.trim();
        }
        BucketNameUtils.validateBucketName(bucketName);

        final Request<CreateBucketRequest> request = createRequest(bucketName, null, createBucketRequest,
                HttpMethodName.PUT);

        if (createBucketRequest.getAccessControlList() != null) {
            addAclHeaders(request, createBucketRequest.getAccessControlList());
        } else if (createBucketRequest.getCannedAcl() != null) {
            request.addHeader(Headers.S3_CANNED_ACL, createBucketRequest.getCannedAcl().toString());
        }

        /*
         * If we're talking to a region-specific endpoint other than the US, we
         * *must* specify a location constraint. Try to derive the region from
         * the endpoint.
         */
        if (!(this.endpoint.getHost().equals(Constants.S3_HOSTNAME))
                && (region == null || region.isEmpty())) {

            try {
                region = RegionUtils
                        .getRegionByEndpoint(this.endpoint.getHost())
                        .getName();
            } catch (final IllegalArgumentException exception) {
                // Endpoint does not correspond to a known region; send the
                // request with no location constraint and hope for the best.
            }

        }

        /*
         * We can only send the CreateBucketConfiguration if we're *not*
         * creating a bucket in the US region.
         */
        if (region != null && !StringUtils.upperCase(region).equals(Region.US_Standard.toString())) {
            final XmlWriter xml = new XmlWriter();
            xml.start("CreateBucketConfiguration", "xmlns", Constants.XML_NAMESPACE);
            xml.start("LocationConstraint").value(region).end();
            xml.end();

            final byte[] bytes = xml.getBytes();
            request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
            request.setContent(new ByteArrayInputStream(bytes));
        }

        invoke(request, voidResponseHandler, bucketName, null);

        return new Bucket(bucketName);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectAcl(java.lang.String,
     * java.lang.String)
     */
    @Override
    public AccessControlList getObjectAcl(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObjectAcl(new GetObjectAclRequest(bucketName, key));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectAcl(java.lang.String,
     * java.lang.String, java.lang.String)
     */
    @Override
    public AccessControlList getObjectAcl(String bucketName, String key, String versionId)
            throws AmazonClientException, AmazonServiceException {
        return getObjectAcl(new GetObjectAclRequest(bucketName, key, versionId));
    }

    @Override
    public AccessControlList getObjectAcl(GetObjectAclRequest getObjectAclRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getObjectAclRequest,
                "The request parameter must be specified when requesting an object's ACL");
        assertParameterNotNull(getObjectAclRequest.getBucketName(),
                "The bucket name parameter must be specified when requesting an object's ACL");
        assertParameterNotNull(getObjectAclRequest.getKey(),
                "The key parameter must be specified when requesting an object's ACL");

        return getAcl(getObjectAclRequest.getBucketName(), getObjectAclRequest.getKey(),
                getObjectAclRequest.getVersionId(), getObjectAclRequest.isRequesterPays(),
                getObjectAclRequest);
    }

    @Override
    public void setObjectAcl(String bucketName, String key, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(bucketName, key, null, acl);
    }

    @Override
    public void setObjectAcl(String bucketName, String key, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(bucketName, key, null, acl);
    }

    @Override
    public void setObjectAcl(String bucketName, String key, String versionId, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(new SetObjectAclRequest(bucketName, key, versionId, acl));
    }

    /**
     * Same as {@link #setObjectAcl(String, String, String, AccessControlList)}
     * but allows specifying a request metric collector.
     */
    public void setObjectAcl(String bucketName, String key, String versionId,
                             AccessControlList acl, RequestMetricCollector requestMetricCollector)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(new SetObjectAclRequest(bucketName, key, versionId, acl)
                .<SetObjectAclRequest> withRequestMetricCollector(requestMetricCollector));
    }

    @Override
    public void setObjectAcl(String bucketName, String key, String versionId,
                             CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(new SetObjectAclRequest(bucketName, key, versionId, acl));
    }

    /**
     * Same as
     * {@link #setObjectAcl(String, String, String, CannedAccessControlList)}
     * but allows specifying a request metric collector.
     */
    public void setObjectAcl(String bucketName, String key, String versionId,
                             CannedAccessControlList acl,
                             RequestMetricCollector requestMetricCollector) {
        setObjectAcl(new SetObjectAclRequest(bucketName, key, versionId, acl)
                .<SetObjectAclRequest> withRequestMetricCollector(requestMetricCollector));
    }

    @Override
    public void setObjectAcl(SetObjectAclRequest setObjectAclRequest)
            throws AmazonClientException, AmazonServiceException {

        assertParameterNotNull(setObjectAclRequest,
                "The request must not be null.");
        assertParameterNotNull(setObjectAclRequest.getBucketName(),
                "The bucket name parameter must be specified when setting an object's ACL");
        assertParameterNotNull(setObjectAclRequest.getKey(),
                "The key parameter must be specified when setting an object's ACL");

        if (setObjectAclRequest.getAcl() != null && setObjectAclRequest.getCannedAcl() != null) {
            throw new IllegalArgumentException(
                    "Only one of the ACL and CannedACL parameters can be specified, not both.");
        }

        if (setObjectAclRequest.getAcl() != null) {
            setAcl(setObjectAclRequest.getBucketName(),
                    setObjectAclRequest.getKey(),
                    setObjectAclRequest.getVersionId(),
                    setObjectAclRequest.getAcl(),
                    setObjectAclRequest.isRequesterPays(),
                    setObjectAclRequest);

        } else if (setObjectAclRequest.getCannedAcl() != null) {
            setAcl(setObjectAclRequest.getBucketName(),
                    setObjectAclRequest.getKey(),
                    setObjectAclRequest.getVersionId(),
                    setObjectAclRequest.getCannedAcl(),
                    setObjectAclRequest.isRequesterPays(),
                    setObjectAclRequest);

        } else {
            throw new IllegalArgumentException(
                    "At least one of the ACL and CannedACL parameters should be specified");
        }
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketAcl(java.lang.String)
     */
    @Override
    public AccessControlList getBucketAcl(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's ACL");

        return getAcl(bucketName, null, null, false, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketAcl(com.amazonaws.services
     * .s3.GetBucketAclRequest)
     */
    @Override
    public AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest)
            throws AmazonClientException, AmazonServiceException {
        final String bucketName = getBucketAclRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's ACL");

        return getAcl(bucketName, null, null, false, getBucketAclRequest);
    }

    @Override
    public void setBucketAcl(String bucketName, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setBucketAcl0(bucketName, acl, null);
    }

    /**
     * Same as {@link #setBucketAcl(String, AccessControlList)} but allows
     * specifying a request metric collector.
     */
    public void setBucketAcl(String bucketName, AccessControlList acl,
                             RequestMetricCollector requestMetricCollector) {
        setBucketAcl0(bucketName, acl, requestMetricCollector);
    }

    private void setBucketAcl0(String bucketName, AccessControlList acl,
                               RequestMetricCollector requestMetricCollector) {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting a bucket's ACL");
        assertParameterNotNull(acl,
                "The ACL parameter must be specified when setting a bucket's ACL");

        setAcl(bucketName, null, null, acl, false,
                new GenericBucketRequest(bucketName)
                        .withRequestMetricCollector(requestMetricCollector));
    }

    @Override
    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest)
            throws AmazonClientException, AmazonServiceException {
        final String bucketName = setBucketAclRequest.getBucketName();
        final AccessControlList acl = setBucketAclRequest.getAcl();
        final CannedAccessControlList cannedAcl = setBucketAclRequest.getCannedAcl();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting a bucket's ACL");

        if (acl != null) {
            setAcl(bucketName, null, null, acl, false, setBucketAclRequest);
        } else if (cannedAcl != null) {
            setAcl(bucketName, null, null, cannedAcl, false, setBucketAclRequest);
        } else {
            assertParameterNotNull(null,
                    "The ACL parameter must be specified when setting a bucket's ACL");
        }
    }

    @Override
    public void setBucketAcl(String bucketName, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setBucketAcl0(bucketName, acl, null);
    }

    /**
     * Same as {@link #setBucketAcl(String, CannedAccessControlList)} but allows
     * specifying a request metric collector.
     */
    public void setBucketAcl(String bucketName, CannedAccessControlList acl,
                             RequestMetricCollector requestMetricCollector) throws AmazonClientException,
            AmazonServiceException {
        setBucketAcl0(bucketName, acl, requestMetricCollector);
    }

    private void setBucketAcl0(String bucketName, CannedAccessControlList acl,
                               RequestMetricCollector col) throws AmazonClientException,
            AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting a bucket's ACL");
        assertParameterNotNull(acl,
                "The ACL parameter must be specified when setting a bucket's ACL");

        setAcl(bucketName, null, null, acl, false,
                new GenericBucketRequest(bucketName)
                        .withRequestMetricCollector(col));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getObjectMetadata(java.lang.String,
     * java.lang.String)
     */
    @Override
    public ObjectMetadata getObjectMetadata(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObjectMetadata(new GetObjectMetadataRequest(bucketName, key));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getObjectMetadata(com.amazonaws.services
     * .s3.model.GetObjectMetadataRequest)
     */
    @Override
    public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getObjectMetadataRequest,
                "The GetObjectMetadataRequest parameter must be specified when requesting an object's metadata");

        final String bucketName = getObjectMetadataRequest.getBucketName();
        final String key = getObjectMetadataRequest.getKey();
        final String versionId = getObjectMetadataRequest.getVersionId();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting an object's metadata");
        assertParameterNotNull(key,
                "The key parameter must be specified when requesting an object's metadata");

        final Request<GetObjectMetadataRequest> request = createRequest(bucketName, key,
                getObjectMetadataRequest, HttpMethodName.HEAD);
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }

        populateRequesterPaysHeader(request, getObjectMetadataRequest.isRequesterPays());
        addPartNumberIfNotNull(request, getObjectMetadataRequest.getPartNumber());

        populateSSE_C(request, getObjectMetadataRequest.getSSECustomerKey());

        return invoke(request, new S3MetadataResponseHandler(), bucketName, key);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(java.lang.String,
     * java.lang.String)
     */
    @Override
    public S3Object getObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObject(new GetObjectRequest(bucketName, key));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#doesBucketExist(java.lang.String)
     */
    @Override
    public boolean doesBucketExist(String bucketName)
            throws AmazonClientException, AmazonServiceException {

        try {
            headBucket(new HeadBucketRequest(bucketName));
            return true;
        } catch (final AmazonServiceException ase) {
            // A redirect error or a forbidden error means the bucket exists. So
            // returning true.
            if ((ase.getStatusCode() == Constants.BUCKET_REDIRECT_STATUS_CODE)
                    || (ase.getStatusCode() == Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE)) {
                return true;
            }
            if (ase.getStatusCode() == Constants.NO_SUCH_BUCKET_STATUS_CODE) {
                return false;
            }
            throw ase;

        }
    }

    @Override
    public boolean doesObjectExist(String bucketName, String objectName)
            throws AmazonServiceException, AmazonClientException {
        try {
            getObjectMetadata(bucketName, objectName);
            return true;
        } catch (final AmazonS3Exception e) {
            if (e.getStatusCode() == 404) {
                return false;
            }
            throw e;
        }
    }

    @Override
    public HeadBucketResult headBucket(HeadBucketRequest headBucketRequest)
            throws AmazonClientException, AmazonServiceException {

        final String bucketName = headBucketRequest.getBucketName();

        assertParameterNotNull(bucketName,
                "The bucketName parameter must be specified.");

        final Request<HeadBucketRequest> request = createRequest(bucketName, null,
                headBucketRequest, HttpMethodName.HEAD);
        return invoke(request, new HeadBucketResultHandler(), bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#changeStorageClass(java.lang.String,
     * java.lang.String, java.lang.String)
     */
    @Override
    public void changeObjectStorageClass(String bucketName, String key, StorageClass newStorageClass)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucketName parameter must be specified when changing an object's storage class");
        assertParameterNotNull(key,
                "The key parameter must be specified when changing an object's storage class");
        assertParameterNotNull(newStorageClass,
                "The newStorageClass parameter must be specified when changing an object's storage class");

        copyObject(new CopyObjectRequest(bucketName, key, bucketName, key)
                .withStorageClass(newStorageClass.toString()));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setObjectRedirectLocation(java.lang
     * .String, java.lang.String, java.lang.String)
     */
    @Override
    public void setObjectRedirectLocation(String bucketName, String key, String newRedirectLocation)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucketName parameter must be specified when changing an object's storage class");
        assertParameterNotNull(key,
                "The key parameter must be specified when changing an object's storage class");
        assertParameterNotNull(newRedirectLocation,
                "The newStorageClass parameter must be specified when changing an object's storage class");

        copyObject(new CopyObjectRequest(bucketName, key, bucketName, key)
                .withRedirectLocation(newRedirectLocation));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3
     * .model.GetObjectRequest)
     */
    @Override
    public S3Object getObject(GetObjectRequest getObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getObjectRequest,
                "The GetObjectRequest parameter must be specified when requesting an object");
        assertParameterNotNull(getObjectRequest.getBucketName(),
                "The bucket name parameter must be specified when requesting an object");
        assertParameterNotNull(getObjectRequest.getKey(),
                "The key parameter must be specified when requesting an object");

        final Request<GetObjectRequest> request = createRequest(getObjectRequest.getBucketName(),
                getObjectRequest.getKey(), getObjectRequest, HttpMethodName.GET);

        if (getObjectRequest.getVersionId() != null) {
            request.addParameter("versionId", getObjectRequest.getVersionId());
        }

        // Range
        final long[] range = getObjectRequest.getRange();
        if (range != null) {
            String rangeHeader = "bytes=" + Long.toString(range[0]) + "-";
            if (range[1] >= 0) {
                /*
                 * Negative value is invalid per S3 range get and will result in
                 * downloading the entire object. Leaving last byte empty so as
                 * to resume download from range[0].
                 */
                rangeHeader += Long.toString(range[1]);
            }
            request.addHeader(Headers.RANGE, rangeHeader);
        }

        populateRequesterPaysHeader(request, getObjectRequest.isRequesterPays());

        addResponseHeaderParameters(request, getObjectRequest.getResponseHeaders());

        addDateHeader(request, Headers.GET_OBJECT_IF_MODIFIED_SINCE,
                getObjectRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.GET_OBJECT_IF_UNMODIFIED_SINCE,
                getObjectRequest.getUnmodifiedSinceConstraint());
        addStringListHeader(request, Headers.GET_OBJECT_IF_MATCH,
                getObjectRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.GET_OBJECT_IF_NONE_MATCH,
                getObjectRequest.getNonmatchingETagConstraints());

        // Populate the SSE-CPK parameters to the request header
        populateSSE_C(request, getObjectRequest.getSSECustomerKey());

        /*
         * This is compatible with progress listener set by either the legacy
         * method GetObjectRequest#setProgressListener or the new method
         * GetObjectRequest#setGeneralProgressListener.
         */
        final ProgressListener progressListener = getObjectRequest.getGeneralProgressListener();
        final ProgressListenerCallbackExecutor progressListenerCallbackExecutor = ProgressListenerCallbackExecutor
                .wrapListener(progressListener);

        try {
            final S3Object s3Object = invoke(request, new S3ObjectResponseHandler(),
                    getObjectRequest.getBucketName(), getObjectRequest.getKey());

            /*
             * TODO: For now, it's easiest to set there here in the client, but
             * we could push this back into the response handler with a little
             * more work.
             */
            s3Object.setBucketName(getObjectRequest.getBucketName());
            s3Object.setKey(getObjectRequest.getKey());

            InputStream input = s3Object.getObjectContent();

            // Hold a reference to this client while the InputStream is still
            // around - otherwise a finalizer in the HttpClient may reset the
            // underlying TCP connection out from under us.
            input = new ServiceClientHolderInputStream(input, this);

            // If someone is interested in progress updates, wrap the input
            // stream in a filter that will trigger progress reports.
            if (progressListenerCallbackExecutor != null) {
                @SuppressWarnings("resource")
                final
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(
                        input, progressListenerCallbackExecutor);
                progressReportingInputStream.setFireCompletedEvent(true);
                progressReportingInputStream.setNotificationThreshold(this.notificationThreshold);
                input = progressReportingInputStream;
                fireProgressEvent(progressListenerCallbackExecutor,
                        ProgressEvent.STARTED_EVENT_CODE);
            }

            // The Etag header contains a server-side MD5 of the object. If
            // we're downloading the whole object, by default we wrap the
            // stream in a validator that calculates an MD5 of the downloaded
            // bytes and complains if what we received doesn't match the Etag.
            if (!ServiceUtils.skipMd5CheckPerRequest(getObjectRequest)
                    && !ServiceUtils.skipMd5CheckPerResponse(s3Object.getObjectMetadata())) {
                byte[] serverSideHash = null;
                final String etag = s3Object.getObjectMetadata().getETag();
                if (etag != null && ServiceUtils.isMultipartUploadETag(etag) == false) {
                    serverSideHash = BinaryUtils.fromHex(s3Object.getObjectMetadata().getETag());
                    try {
                        // No content length check is performed when the
                        // MD5 check is enabled, since a correct MD5 check would
                        // imply a correct content length.
                        final MessageDigest digest = MessageDigest.getInstance("MD5");
                        input = new DigestValidationInputStream(input, digest, serverSideHash);
                    } catch (final NoSuchAlgorithmException e) {
                        log.warn("No MD5 digest algorithm available. Unable to calculate "
                                + "checksum and verify data integrity.", e);
                    }
                }
            } else {
                // Ensures the data received from S3 has the same length as the
                // expected content-length
                input = new LengthCheckInputStream(input,
                        s3Object.getObjectMetadata().getContentLength(), // expected
                        // length
                        INCLUDE_SKIPPED_BYTES); // bytes received from S3 are
                // all included even if skipped
            }

            // Re-wrap within an S3ObjectInputStream. Explicitly do not collect
            // metrics here because we know we're ultimately wrapping another
            // S3ObjectInputStream which will take care of that.
            s3Object.setObjectContent(new S3ObjectInputStream(input));

            return s3Object;
        } catch (final AmazonS3Exception ase) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if (ase.getStatusCode() == 412 || ase.getStatusCode() == 304) {
                fireProgressEvent(progressListenerCallbackExecutor,
                        ProgressEvent.CANCELED_EVENT_CODE);
                return null;
            }

            fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.FAILED_EVENT_CODE);

            throw ase;
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3
     * .model.GetObjectRequest, java.io.File)
     */
    @Override
    public ObjectMetadata getObject(final GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(destinationFile,
                "The destination file parameter must be specified when downloading an object directly to a file");
        boolean mode = ServiceUtils.OVERWRITE_MODE;
        if (getObjectRequest.getRange() != null && getObjectRequest.getRange()[0] > 0) {
            mode = ServiceUtils.APPEND_MODE;
        }
        final S3Object s3Object = ServiceUtils.retryableDownloadS3ObjectToFile(destinationFile,
                new ServiceUtils.RetryableS3DownloadTask() {

                    @Override
                    public S3Object getS3ObjectStream() {
                        return getObject(getObjectRequest);
                    }

                    @Override
                    public boolean needIntegrityCheck() {
                        return !ServiceUtils.skipMd5CheckPerRequest(getObjectRequest);
                    }

                }, mode);
        // getObject can return null if constraints were specified but not met
        if (s3Object == null) {
            return null;
        }

        return s3Object.getObjectMetadata();
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucket(java.lang.String)
     */
    @Override
    public void deleteBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        deleteBucket(new DeleteBucketRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucket(com.amazonaws.services
     * .s3.model.DeleteBucketRequest)
     */
    @Override
    public void deleteBucket(DeleteBucketRequest deleteBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteBucketRequest,
                "The DeleteBucketRequest parameter must be specified when deleting a bucket");

        final String bucketName = deleteBucketRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting a bucket");

        final Request<DeleteBucketRequest> request = createRequest(bucketName, null, deleteBucketRequest,
                HttpMethodName.DELETE);
        invoke(request, voidResponseHandler, bucketName, null);
        bucketRegionCache.remove(bucketName);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(java.lang.String,
     * java.lang.String, java.io.File)
     */
    @Override
    public PutObjectResult putObject(String bucketName, String key, File file)
            throws AmazonClientException, AmazonServiceException {
        return putObject(new PutObjectRequest(bucketName, key, file)
                .withMetadata(new ObjectMetadata()));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(java.lang.String,
     * java.lang.String, java.io.InputStream,
     * com.amazonaws.services.s3.model.S3ObjectMetadata)
     */
    @Override
    public PutObjectResult putObject(String bucketName, String key, InputStream input,
                                     ObjectMetadata metadata)
            throws AmazonClientException, AmazonServiceException {
        return putObject(new PutObjectRequest(bucketName, key, input, metadata));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#putObject(com.amazonaws.services.s3
     * .model.PutObjectRequest)
     */
    @Override
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(putObjectRequest,
                "The PutObjectRequest parameter must be specified when uploading an object");

        final String bucketName = putObjectRequest.getBucketName();
        final String key = putObjectRequest.getKey();
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        InputStream input = putObjectRequest.getInputStream();

        /*
         * This is compatible with progress listener set by either the legacy
         * method PutObjectRequest#setProgressListener or the new method
         * PutObjectRequest#setGeneralProgressListener.
         */
        final ProgressListener progressListener = putObjectRequest.getGeneralProgressListener();
        final ProgressListenerCallbackExecutor progressListenerCallbackExecutor = ProgressListenerCallbackExecutor
                .wrapListener(progressListener);

        if (metadata == null) {
            metadata = new ObjectMetadata();
        }

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when uploading an object");
        assertParameterNotNull(key, "The key parameter must be specified when uploading an object");

        final boolean skipContentMd5Check = ServiceUtils
                .skipMd5CheckPerRequest(putObjectRequest);

        // If a file is specified for upload, we need to pull some additional
        // information from it to auto-configure a few options
        if (putObjectRequest.getFile() != null) {
            final File file = putObjectRequest.getFile();
            // Always set the content length, even if it's already set
            metadata.setContentLength(file.length());

            final boolean calculateMD5 = metadata.getContentMD5() == null;

            // Only set the content type if it hasn't already been set
            if (metadata.getContentType() == null) {
                metadata.setContentType(Mimetypes.getInstance().getMimetype(file));
            }

            if (calculateMD5 && !skipContentMd5Check) {
                try {
                    final String contentMd5_b64 = Md5Utils.md5AsBase64(file);
                    metadata.setContentMD5(contentMd5_b64);
                } catch (final Exception e) {
                    throw new AmazonClientException(
                            "Unable to calculate MD5 hash: " + e.getMessage(), e);
                }
            }

            try {
                input = new RepeatableFileInputStream(file);
            } catch (final FileNotFoundException fnfe) {
                throw new AmazonClientException("Unable to find file to upload", fnfe);
            }
        }

        final Request<PutObjectRequest> request = createRequest(bucketName, key, putObjectRequest,
                HttpMethodName.PUT);

        if (putObjectRequest.getAccessControlList() != null) {
            addAclHeaders(request, putObjectRequest.getAccessControlList());
        } else if (putObjectRequest.getCannedAcl() != null) {
            request.addHeader(Headers.S3_CANNED_ACL, putObjectRequest.getCannedAcl().toString());
        }

        if (putObjectRequest.getStorageClass() != null) {
            request.addHeader(Headers.STORAGE_CLASS, putObjectRequest.getStorageClass());
        }

        if (putObjectRequest.getRedirectLocation() != null) {
            request.addHeader(Headers.REDIRECT_LOCATION, putObjectRequest.getRedirectLocation());
            if (input == null) {
                setZeroContentLength(request);
                input = new ByteArrayInputStream(new byte[0]);
            }
        }

        addHeaderIfNotNull(request, Headers.S3_TAGGING, urlEncodeTags(putObjectRequest.getTagging()));

        populateRequesterPaysHeader(request, putObjectRequest.isRequesterPays());

        // Populate the SSE-CPK parameters to the request header
        populateSSE_C(request, putObjectRequest.getSSECustomerKey());

        // Use internal interface to differentiate 0 from unset.
        final Long contentLength = (Long) metadata.getRawMetadataValue(Headers.CONTENT_LENGTH);
        if (contentLength == null) {
            /*
             * There's nothing we can do except for let the HTTP client buffer
             * the input stream contents if the caller doesn't tell us how much
             * data to expect in a stream since we have to explicitly tell
             * Amazon S3 how much we're sending before we start sending any of
             * it.
             */
            if (!input.markSupported()) {
                log.warn("No content length specified for stream data.  " +
                        "Stream contents will be buffered in memory and could result in " +
                        "out of memory errors.");
                final ByteArrayInputStream bais = toByteArray(input);
                request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bais.available()));
                request.setStreaming(true);
                input = bais;
            } else {
                final long len = calculateContentLength(input);
                request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(len));
            }
        } else {
            final long expectedLength = contentLength.longValue();
            if (expectedLength >= 0) {
                // Performs length check on the underlying data stream.
                // For S3 encryption client, the underlying data stream here
                // refers to the cipher-text data stream (ie not the underlying
                // plain-text data stream which in turn may have been wrapped
                // with it's own length check input stream.)
                @SuppressWarnings("resource")
                final
                LengthCheckInputStream lcis = new LengthCheckInputStream(
                        input,
                        expectedLength, // expected data length to be uploaded
                        EXCLUDE_SKIPPED_BYTES);
                input = lcis;
                request.addHeader(Headers.CONTENT_LENGTH, contentLength.toString());
            }
        }

        if (progressListenerCallbackExecutor != null) {
            input = new ProgressReportingInputStream(input, progressListenerCallbackExecutor);
            ((ProgressReportingInputStream)input).setNotificationThreshold(this.notificationThreshold);
            fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.STARTED_EVENT_CODE);
        }

        MD5DigestCalculatingInputStream md5DigestStream = null;
        if (metadata.getContentMD5() == null
                && !skipContentMd5Check) {
            /*
             * If the user hasn't set the content MD5, then we don't want to
             * buffer the whole stream in memory just to calculate it. Instead,
             * we can calculate it on the fly and validate it with the returned
             * ETag from the object upload.
             */
            input = md5DigestStream = new MD5DigestCalculatingInputStream(input);
        }

        if (metadata.getContentType() == null) {
            /*
             * Default to the "application/octet-stream" if the user hasn't
             * specified a content type.
             */
            metadata.setContentType(Mimetypes.MIMETYPE_OCTET_STREAM);
        }

        populateRequestMetadata(request, metadata);
        populateSSE_KMS(request, putObjectRequest.getSSEAwsKeyManagementParams());

        request.setContent(input);
        /*
         * Enable 100-continue support for PUT operations, since this is where
         * we're potentially uploading large amounts of data and want to find
         * out as early as possible if an operation will fail. We don't want to
         * do this for all operations since it will cause extra latency in the
         * network interaction.
         */
        /*
         * HttpUrlConnection seems to be buggy in terms of implementation of
         * expect continue.
         */
        // request.addHeader("Expect", "100-continue");
        ObjectMetadata returnedMetadata = null;
        try {
            returnedMetadata = invoke(request, new S3MetadataResponseHandler(), bucketName, key);
        } catch (final AmazonClientException ace) {
            fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.FAILED_EVENT_CODE);
            throw ace;
        } finally {
            try {
                input.close();
            } catch (final AbortedException ignore) {
            } catch (final Exception e) {
                log.debug("Unable to cleanly close input stream: " + e.getMessage(), e);
            }
        }

        String contentMd5 = metadata.getContentMD5();
        if (md5DigestStream != null) {
            contentMd5 = BinaryUtils.toBase64(md5DigestStream.getMd5Digest());
        }

        if (returnedMetadata != null && contentMd5 != null && !skipContentMd5Check) {
            final byte[] clientSideHash = BinaryUtils.fromBase64(contentMd5);
            final byte[] serverSideHash = BinaryUtils.fromHex(returnedMetadata.getETag());

            if (!Arrays.equals(clientSideHash, serverSideHash)) {
                fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.FAILED_EVENT_CODE);

                throw new AmazonClientException(
                        "Unable to verify integrity of data upload.  "
                                +
                                "Client calculated content hash didn't match hash calculated by Amazon S3.  "
                                +
                                "You may need to delete the data stored in Amazon S3.");
            }
        }

        fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.COMPLETED_EVENT_CODE);

        final PutObjectResult result = new PutObjectResult();
        result.setVersionId(returnedMetadata.getVersionId());
        result.setSSEAlgorithm(returnedMetadata.getSSEAlgorithm());
        result.setSSECustomerAlgorithm(returnedMetadata.getSSECustomerAlgorithm());
        result.setSSECustomerKeyMd5(returnedMetadata.getSSECustomerKeyMd5());
        result.setExpirationTime(returnedMetadata.getExpirationTime());
        result.setExpirationTimeRuleId(returnedMetadata.getExpirationTimeRuleId());
        result.setETag(returnedMetadata.getETag());
        result.setMetadata(returnedMetadata);
        result.setRequesterCharged(returnedMetadata.isRequesterCharged());

        return result;
    }

    /**
     * Calculate the content length of a mark supported input stream.
     *
     * @param is input stream
     * @return length of the input stream
     */
    private long calculateContentLength(InputStream is) {
        long len = 0;
        final byte[] buf = new byte[8 * 1024];
        int read;
        is.mark(-1);
        try {
            while ((read = is.read(buf)) != -1) {
                len += read;
            }
            is.reset();
        } catch (final IOException ioe) {
            throw new AmazonClientException("Could not calculate content length.", ioe);
        }
        return len;
    }

    /**
     * Sets the acccess control headers for the request given.
     */
    private static void addAclHeaders(Request<? extends AmazonWebServiceRequest> request,
                                      AccessControlList acl) {
        final Set<Grant> grants = acl.getGrants();
        final Map<Permission, Collection<Grantee>> grantsByPermission = new HashMap<Permission, Collection<Grantee>>();
        for (final Grant grant : grants) {
            if (!grantsByPermission.containsKey(grant.getPermission())) {
                grantsByPermission.put(grant.getPermission(), new LinkedList<Grantee>());
            }
            grantsByPermission.get(grant.getPermission()).add(grant.getGrantee());
        }
        for (final Permission permission : Permission.values()) {
            if (grantsByPermission.containsKey(permission)) {
                final Collection<Grantee> grantees = grantsByPermission.get(permission);
                boolean seenOne = false;
                final StringBuilder granteeString = new StringBuilder();
                for (final Grantee grantee : grantees) {
                    if (!seenOne) {
                        seenOne = true;
                    } else {
                        granteeString.append(", ");
                    }
                    granteeString.append(grantee.getTypeIdentifier()).append("=").append("\"")
                            .append(grantee.getIdentifier()).append("\"");
                }
                request.addHeader(permission.getHeaderName(), granteeString.toString());
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#copyObject(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public CopyObjectResult copyObject(String sourceBucketName, String sourceKey,
                                       String destinationBucketName, String destinationKey)
            throws AmazonClientException, AmazonServiceException {
        return copyObject(new CopyObjectRequest(sourceBucketName, sourceKey,
                destinationBucketName, destinationKey));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#copyObject(com.amazonaws.services.
     * s3.model.CopyObjectRequest)
     */
    @Override
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(copyObjectRequest.getSourceBucketName(),
                "The source bucket name must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getSourceKey(),
                "The source object key must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getDestinationBucketName(),
                "The destination bucket name must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getDestinationKey(),
                "The destination object key must be specified when copying an object");

        final String destinationKey = copyObjectRequest.getDestinationKey();
        final String destinationBucketName = copyObjectRequest.getDestinationBucketName();

        final Request<CopyObjectRequest> request = createRequest(destinationBucketName, destinationKey,
                copyObjectRequest, HttpMethodName.PUT);

        populateRequestWithCopyObjectParameters(request, copyObjectRequest);

        // Populate the SSE AWS KMS parameters to the request header
        populateSSE_KMS(request,
                copyObjectRequest.getSSEAwsKeyManagementParams());
        /*
         * We can't send a non-zero length Content-Length header if the user
         * specified it, otherwise it messes up the HTTP connection when the
         * remote server thinks there's more data to pull.
         */
        setZeroContentLength(request);
        CopyObjectResultHandler copyObjectResultHandler = null;
        try {
            @SuppressWarnings("unchecked")
            final
            ResponseHeaderHandlerChain<CopyObjectResultHandler> handler = new ResponseHeaderHandlerChain<CopyObjectResultHandler>(
                    // xml payload unmarshaller
                    new Unmarshallers.CopyObjectUnmarshaller(),
                    // header handlers
                    new ServerSideEncryptionHeaderHandler<CopyObjectResultHandler>(),
                    new S3VersionHeaderHandler<CopyObjectResultHandler>(),
                    new ObjectExpirationHeaderHandler<CopyObjectResultHandler>(),
                    new S3RequesterChargedHeaderHandler<CopyObjectResultHandler>());
            copyObjectResultHandler = invoke(request, handler, destinationBucketName, destinationKey);
        } catch (final AmazonS3Exception ase) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if (ase.getStatusCode() == Constants.FAILED_PRECONDITION_STATUS_CODE) {
                return null;
            }

            throw ase;
        }

        /*
         * CopyObject has two failure modes: 1 - An HTTP error code is returned
         * and the error is processed like any other error response. 2 - An HTTP
         * 200 OK code is returned, but the response content contains an XML
         * error response. This makes it very difficult for the client runtime
         * to cleanly detect this case and handle it like any other error
         * response. We could extend the runtime to have a more
         * flexible/customizable definition of success/error (per request), but
         * it's probably overkill for this one special case.
         */
        if (copyObjectResultHandler.getErrorCode() != null) {
            final String errorCode = copyObjectResultHandler.getErrorCode();
            final String errorMessage = copyObjectResultHandler.getErrorMessage();
            final String requestId = copyObjectResultHandler.getErrorRequestId();
            final String hostId = copyObjectResultHandler.getErrorHostId();

            final AmazonS3Exception ase = new AmazonS3Exception(errorMessage);
            ase.setErrorCode(errorCode);
            ase.setErrorType(ErrorType.Service);
            ase.setRequestId(requestId);
            ase.setExtendedRequestId(hostId);
            ase.setServiceName(request.getServiceName());
            ase.setStatusCode(200);

            throw ase;
        }

        // TODO: Might be nice to create this in our custom
        // S3VersionHeaderHandler
        final CopyObjectResult copyObjectResult = new CopyObjectResult();
        copyObjectResult.setETag(copyObjectResultHandler.getETag());
        copyObjectResult.setLastModifiedDate(copyObjectResultHandler.getLastModified());
        copyObjectResult.setVersionId(copyObjectResultHandler.getVersionId());
        copyObjectResult.setSSEAlgorithm(copyObjectResultHandler.getSSEAlgorithm());
        copyObjectResult.setSSECustomerAlgorithm(copyObjectResultHandler.getSSECustomerAlgorithm());
        copyObjectResult.setSSECustomerKeyMd5(copyObjectResultHandler.getSSECustomerKeyMd5());
        copyObjectResult.setExpirationTime(copyObjectResultHandler.getExpirationTime());
        copyObjectResult.setExpirationTimeRuleId(copyObjectResultHandler.getExpirationTimeRuleId());
        copyObjectResult.setRequesterCharged(copyObjectResultHandler.isRequesterCharged());

        return copyObjectResult;
    }

    /**
     * Copies a source object to a part of a multipart upload. To copy an
     * object, the caller's account must have read access to the source object
     * and write access to the destination bucket. </p>
     * <p>
     * If constraints are specified in the <code>CopyPartRequest</code> (e.g.
     * {@link CopyPartRequest#setMatchingETagConstraints(List)}) and are not
     * satisfied when Amazon S3 receives the request, this method returns
     * <code>null</code>. This method returns a non-null result under all other
     * circumstances.
     * </p>
     *
     * @param copyPartRequest The request object containing all the options for
     *            copying an Amazon S3 object.
     * @return A {@link CopyPartResult} object containing the information
     *         returned by Amazon S3 about the newly created object, or
     *         <code>null</code> if constraints were specified that weren't met
     *         when Amazon S3 attempted to copy the object.
     * @throws AmazonClientException If any errors are encountered in the client
     *             while making the request or handling the response.
     * @throws AmazonServiceException If any errors occurred in Amazon S3 while
     *             processing the request.
     * @see AmazonS3#copyObject(CopyObjectRequest)
     * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
     */
    @Override
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) {
        assertParameterNotNull(copyPartRequest.getSourceBucketName(),
                "The source bucket name must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getSourceKey(),
                "The source object key must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getDestinationBucketName(),
                "The destination bucket name must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getUploadId(),
                "The upload id must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getDestinationKey(),
                "The destination object key must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getPartNumber(),
                "The part number must be specified when copying a part");

        final String destinationKey = copyPartRequest.getDestinationKey();
        final String destinationBucketName = copyPartRequest.getDestinationBucketName();

        final Request<CopyPartRequest> request = createRequest(destinationBucketName, destinationKey,
                copyPartRequest,
                HttpMethodName.PUT);

        populateRequestWithCopyPartParameters(request, copyPartRequest);

        request.addParameter("uploadId", copyPartRequest.getUploadId());
        request.addParameter("partNumber", Integer.toString(copyPartRequest.getPartNumber()));

        /*
         * We can't send a non-zero length Content-Length header if the user
         * specified it, otherwise it messes up the HTTP connection when the
         * remote server thinks there's more data to pull.
         */
        setZeroContentLength(request);
        CopyObjectResultHandler copyObjectResultHandler = null;
        try {
            @SuppressWarnings("unchecked")
            final
            ResponseHeaderHandlerChain<CopyObjectResultHandler> handler = new ResponseHeaderHandlerChain<CopyObjectResultHandler>(
                    // xml payload unmarshaller
                    new Unmarshallers.CopyObjectUnmarshaller(),
                    // header handlers
                    new ServerSideEncryptionHeaderHandler<CopyObjectResultHandler>(),
                    new S3VersionHeaderHandler<CopyObjectResultHandler>());
            copyObjectResultHandler = invoke(request, handler, destinationBucketName,
                    destinationKey);
        } catch (final AmazonS3Exception ase) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if (ase.getStatusCode() == Constants.FAILED_PRECONDITION_STATUS_CODE) {
                return null;
            }

            throw ase;
        }

        /*
         * CopyPart has two failure modes: 1 - An HTTP error code is returned
         * and the error is processed like any other error response. 2 - An HTTP
         * 200 OK code is returned, but the response content contains an XML
         * error response. This makes it very difficult for the client runtime
         * to cleanly detect this case and handle it like any other error
         * response. We could extend the runtime to have a more
         * flexible/customizable definition of success/error (per request), but
         * it's probably overkill for this one special case.
         */
        if (copyObjectResultHandler.getErrorCode() != null) {
            final String errorCode = copyObjectResultHandler.getErrorCode();
            final String errorMessage = copyObjectResultHandler.getErrorMessage();
            final String requestId = copyObjectResultHandler.getErrorRequestId();
            final String hostId = copyObjectResultHandler.getErrorHostId();

            final AmazonS3Exception ase = new AmazonS3Exception(errorMessage);
            ase.setErrorCode(errorCode);
            ase.setErrorType(ErrorType.Service);
            ase.setRequestId(requestId);
            ase.setExtendedRequestId(hostId);
            ase.setServiceName(request.getServiceName());
            ase.setStatusCode(200);

            throw ase;
        }

        final CopyPartResult copyPartResult = new CopyPartResult();
        copyPartResult.setETag(copyObjectResultHandler.getETag());
        copyPartResult.setPartNumber(copyPartRequest.getPartNumber());
        copyPartResult.setLastModifiedDate(copyObjectResultHandler.getLastModified());
        copyPartResult.setVersionId(copyObjectResultHandler.getVersionId());
        copyPartResult.setSSEAlgorithm(copyObjectResultHandler.getSSEAlgorithm());
        copyPartResult.setSSECustomerAlgorithm(copyObjectResultHandler.getSSECustomerAlgorithm());
        copyPartResult.setSSECustomerKeyMd5(copyObjectResultHandler.getSSECustomerKeyMd5());

        return copyPartResult;
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteObject(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void deleteObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        deleteObject(new DeleteObjectRequest(bucketName, key));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteObject(com.amazonaws.services
     * .s3.DeleteObjectRequest)
     */
    @Override
    public void deleteObject(DeleteObjectRequest deleteObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteObjectRequest,
                "The delete object request must be specified when deleting an object");

        assertParameterNotNull(deleteObjectRequest.getBucketName(),
                "The bucket name must be specified when deleting an object");
        assertParameterNotNull(deleteObjectRequest.getKey(),
                "The key must be specified when deleting an object");

        final Request<DeleteObjectRequest> request = createRequest(deleteObjectRequest.getBucketName(),
                deleteObjectRequest.getKey(), deleteObjectRequest, HttpMethodName.DELETE);
        invoke(request, voidResponseHandler, deleteObjectRequest.getBucketName(),
                deleteObjectRequest.getKey());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteObjects(com.amazonaws.services
     * .s3.model.DeleteObjectsRequest)
     */
    @Override
    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest) {
        final Request<DeleteObjectsRequest> request = createRequest(deleteObjectsRequest.getBucketName(),
                null, deleteObjectsRequest, HttpMethodName.POST);
        request.addParameter("delete", null);

        if (deleteObjectsRequest.getMfa() != null) {
            populateRequestWithMfaDetails(request, deleteObjectsRequest.getMfa());
        }

        populateRequesterPaysHeader(request, deleteObjectsRequest.isRequesterPays());

        final byte[] content = new MultiObjectDeleteXmlFactory()
                .convertToXmlByteArray(deleteObjectsRequest);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            final byte[] md5 = Md5Utils.computeMD5Hash(content);
            final String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch (final Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        @SuppressWarnings("unchecked")
        final
        ResponseHeaderHandlerChain<DeleteObjectsResponse> responseHandler = new ResponseHeaderHandlerChain<DeleteObjectsResponse>(
                new Unmarshallers.DeleteObjectsResultUnmarshaller(),
                new S3RequesterChargedHeaderHandler<DeleteObjectsResponse>());

        final DeleteObjectsResponse response = invoke(request, responseHandler, deleteObjectsRequest.getBucketName(), null);

        /*
         * If the result was only partially successful, throw an exception
         */
        if ( !response.getErrors().isEmpty() ) {
            final Map<String, String> headers = responseHandler.getResponseHeaders();

            final MultiObjectDeleteException ex = new MultiObjectDeleteException(
                    response.getErrors(),
                    response.getDeletedObjects());

            ex.setStatusCode(200);
            ex.setRequestId(headers.get(Headers.REQUEST_ID));
            ex.setExtendedRequestId(headers.get(Headers.EXTENDED_REQUEST_ID));
            ex.setCloudFrontId(headers.get(Headers.CLOUD_FRONT_ID));

            throw ex;
        }
        final DeleteObjectsResult result = new DeleteObjectsResult(response.getDeletedObjects(), response.isRequesterCharged());

        return result;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteObjectVersion(java.lang.String,
     * java.lang.String, java.lang.String)
     */
    @Override
    public void deleteVersion(String bucketName, String key, String versionId)
            throws AmazonClientException, AmazonServiceException {
        deleteVersion(new DeleteVersionRequest(bucketName, key, versionId));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteVersion(com.amazonaws.services
     * .s3.model.DeleteVersionRequest)
     */
    @Override
    public void deleteVersion(DeleteVersionRequest deleteVersionRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteVersionRequest,
                "The delete version request object must be specified when deleting a version");

        final String bucketName = deleteVersionRequest.getBucketName();
        final String key = deleteVersionRequest.getKey();
        final String versionId = deleteVersionRequest.getVersionId();

        assertParameterNotNull(bucketName,
                "The bucket name must be specified when deleting a version");
        assertParameterNotNull(key, "The key must be specified when deleting a version");
        assertParameterNotNull(versionId,
                "The version ID must be specified when deleting a version");

        final Request<DeleteVersionRequest> request = createRequest(bucketName, key,
                deleteVersionRequest, HttpMethodName.DELETE);
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }

        if (deleteVersionRequest.getMfa() != null) {
            populateRequestWithMfaDetails(request, deleteVersionRequest.getMfa());
        }

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketVersioningConfiguration(com
     * .amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest)
     */
    @Override
    public void setBucketVersioningConfiguration(
            SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(
                setBucketVersioningConfigurationRequest,
                "The SetBucketVersioningConfigurationRequest object must be specified when setting versioning configuration");

        final String bucketName = setBucketVersioningConfigurationRequest.getBucketName();
        final BucketVersioningConfiguration versioningConfiguration = setBucketVersioningConfigurationRequest
                .getVersioningConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting versioning configuration");
        assertParameterNotNull(versioningConfiguration,
                "The bucket versioning parameter must be specified when setting versioning configuration");
        if (versioningConfiguration.isMfaDeleteEnabled() != null) {
            assertParameterNotNull(
                    setBucketVersioningConfigurationRequest.getMfa(),
                    "The MFA parameter must be specified when changing MFA Delete status in the versioning configuration");
        }

        final Request<SetBucketVersioningConfigurationRequest> request = createRequest(bucketName, null,
                setBucketVersioningConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("versioning", null);

        if (versioningConfiguration.isMfaDeleteEnabled() != null) {
            if (setBucketVersioningConfigurationRequest.getMfa() != null) {
                populateRequestWithMfaDetails(request,
                        setBucketVersioningConfigurationRequest.getMfa());
            }
        }

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(versioningConfiguration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketVersioningConfiguration(java
     * .lang.String)
     */
    @Override
    public BucketVersioningConfiguration getBucketVersioningConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return getBucketVersioningConfiguration(
                new GetBucketVersioningConfigurationRequest(bucketName));
    }

    @Override
    public BucketVersioningConfiguration getBucketVersioningConfiguration(
            GetBucketVersioningConfigurationRequest getBucketVersioningConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getBucketVersioningConfigurationRequest,
                "The request object parameter getBucketVersioningConfigurationRequest must be specified.");
        final String bucketName = getBucketVersioningConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when querying versioning configuration");

        final Request<GetBucketVersioningConfigurationRequest> request = createRequest(bucketName,
                null, getBucketVersioningConfigurationRequest, HttpMethodName.GET);
        request.addParameter("versioning", null);

        return invoke(request, new Unmarshallers.BucketVersioningConfigurationUnmarshaller(),
                bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketWebsiteConfiguration(java
     * .lang.String)
     */
    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return getBucketWebsiteConfiguration(new GetBucketWebsiteConfigurationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketWebsiteConfiguration(com.
     * amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest)
     */
    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(
            GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        final String bucketName = getBucketWebsiteConfigurationRequest.getBucketName();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's website configuration");

        final Request<GetBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null,
                getBucketWebsiteConfigurationRequest, HttpMethodName.GET);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        try {
            return invoke(request, new Unmarshallers.BucketWebsiteConfigurationUnmarshaller(),
                    bucketName, null);
        } catch (final AmazonServiceException ase) {
            if (ase.getStatusCode() == 404) {
                return null;
            }
            throw ase;
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketLifecycleConfiguration(java
     * .lang.String)
     */
    @Override
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(String bucketName) {
        return getBucketLifecycleConfiguration(
                new GetBucketLifecycleConfigurationRequest(bucketName));
    }

    @Override
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) {
        assertParameterNotNull(getBucketLifecycleConfigurationRequest,
                "The request object pamameter getBucketLifecycleConfigurationRequest must be specified.");
        final String bucketName = getBucketLifecycleConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name must be specifed when retrieving the bucket lifecycle configuration.");

        final Request<GetBucketLifecycleConfigurationRequest> request = createRequest(bucketName,
                null, getBucketLifecycleConfigurationRequest, HttpMethodName.GET);
        request.addParameter("lifecycle", null);

        try {
            return invoke(request, new Unmarshallers.BucketLifecycleConfigurationUnmarshaller(),
                    bucketName, null);
        } catch (final AmazonServiceException ase) {
            switch (ase.getStatusCode()) {
                case 404:
                    return null;
                default:
                    throw ase;
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketLifecycleConfiguration(java
     * .lang.String,
     * com.amazonaws.services.s3.model.BucketLifecycleConfiguration)
     */
    @Override
    public void setBucketLifecycleConfiguration(String bucketName,
                                                BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        setBucketLifecycleConfiguration(new SetBucketLifecycleConfigurationRequest(bucketName,
                bucketLifecycleConfiguration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketLifecycleConfiguration(com
     * .amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest)
     */
    @Override
    public void setBucketLifecycleConfiguration(
            SetBucketLifecycleConfigurationRequest setBucketLifecycleConfigurationRequest) {
        assertParameterNotNull(setBucketLifecycleConfigurationRequest,
                "The set bucket lifecycle configuration request object must be specified.");

        final String bucketName = setBucketLifecycleConfigurationRequest.getBucketName();
        final BucketLifecycleConfiguration bucketLifecycleConfiguration = setBucketLifecycleConfigurationRequest
                .getLifecycleConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting bucket lifecycle configuration.");
        assertParameterNotNull(
                bucketLifecycleConfiguration,
                "The lifecycle configuration parameter must be specified when setting bucket lifecycle configuration.");

        final Request<SetBucketLifecycleConfigurationRequest> request = createRequest(bucketName, null,
                setBucketLifecycleConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("lifecycle", null);

        final byte[] content = new BucketConfigurationXmlFactory()
                .convertToXmlByteArray(bucketLifecycleConfiguration);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            final byte[] md5 = Md5Utils.computeMD5Hash(content);
            final String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch (final Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketLifecycleConfiguration
     * (java.lang.String)
     */
    @Override
    public void deleteBucketLifecycleConfiguration(String bucketName) {
        deleteBucketLifecycleConfiguration(new DeleteBucketLifecycleConfigurationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketLifecycleConfiguration
     * (com.
     * amazonaws.services.s3.model.DeleteBucketLifecycleConfigurationRequest)
     */
    @Override
    public void deleteBucketLifecycleConfiguration(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {
        assertParameterNotNull(deleteBucketLifecycleConfigurationRequest,
                "The delete bucket lifecycle configuration request object must be specified.");

        final String bucketName = deleteBucketLifecycleConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting bucket lifecycle configuration.");

        final Request<DeleteBucketLifecycleConfigurationRequest> request = createRequest(bucketName,
                null, deleteBucketLifecycleConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("lifecycle", null);

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketCrossOriginConfiguration(
     * java.lang.String)
     */
    @Override
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(String bucketName) {
        return getBucketCrossOriginConfiguration(
                new GetBucketCrossOriginConfigurationRequest(bucketName));
    }

    @Override
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(
            GetBucketCrossOriginConfigurationRequest getBucketCrossOriginConfigurationRequest) {
        assertParameterNotNull(getBucketCrossOriginConfigurationRequest,
                "The request object parameter getBucketCrossOriginConfigurationRequest must be specified.");
        final String bucketName = getBucketCrossOriginConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name must be specified when retrieving the bucket cross origin configuration.");

        final Request<GetBucketCrossOriginConfigurationRequest> request = createRequest(bucketName,
                null, getBucketCrossOriginConfigurationRequest, HttpMethodName.GET);
        request.addParameter("cors", null);

        try {
            return invoke(request, new Unmarshallers.BucketCrossOriginConfigurationUnmarshaller(),
                    bucketName, null);
        } catch (final AmazonServiceException ase) {
            switch (ase.getStatusCode()) {
                case 404:
                    return null;
                default:
                    throw ase;
            }
        }
    }


    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketCrossOriginConfiguration(
     * java.lang.String,
     * com.amazonaws.services.s3.model.BucketCrossOriginConfiguration)
     */
    @Override
    public void setBucketCrossOriginConfiguration(String bucketName,
                                                  BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        setBucketCrossOriginConfiguration(new SetBucketCrossOriginConfigurationRequest(bucketName,
                bucketCrossOriginConfiguration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketCrossOriginConfiguration(
     * com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest)
     */
    @Override
    public void setBucketCrossOriginConfiguration(
            SetBucketCrossOriginConfigurationRequest setBucketCrossOriginConfigurationRequest) {
        assertParameterNotNull(setBucketCrossOriginConfigurationRequest,
                "The set bucket cross origin configuration request object must be specified.");

        final String bucketName = setBucketCrossOriginConfigurationRequest.getBucketName();
        final BucketCrossOriginConfiguration bucketCrossOriginConfiguration = setBucketCrossOriginConfigurationRequest
                .getCrossOriginConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting bucket cross origin configuration.");
        assertParameterNotNull(
                bucketCrossOriginConfiguration,
                "The cross origin configuration parameter must be specified when setting bucket cross origin configuration.");

        final Request<SetBucketCrossOriginConfigurationRequest> request = createRequest(bucketName, null,
                setBucketCrossOriginConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("cors", null);

        final byte[] content = new BucketConfigurationXmlFactory()
                .convertToXmlByteArray(bucketCrossOriginConfiguration);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            final byte[] md5 = Md5Utils.computeMD5Hash(content);
            final String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch (final Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketCrossOriginConfiguration
     * (java.lang.String)
     */
    @Override
    public void deleteBucketCrossOriginConfiguration(String bucketName) {
        deleteBucketCrossOriginConfiguration(new DeleteBucketCrossOriginConfigurationRequest(
                bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketCrossOriginConfiguration
     * (com
     * .amazonaws.services.s3.model.DeleteBucketCrossOriginConfigurationRequest)
     */
    @Override
    public void deleteBucketCrossOriginConfiguration(
            DeleteBucketCrossOriginConfigurationRequest deleteBucketCrossOriginConfigurationRequest) {
        assertParameterNotNull(deleteBucketCrossOriginConfigurationRequest,
                "The delete bucket cross origin configuration request object must be specified.");

        final String bucketName = deleteBucketCrossOriginConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting bucket cross origin configuration.");

        final Request<DeleteBucketCrossOriginConfigurationRequest> request = createRequest(bucketName,
                null, deleteBucketCrossOriginConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("cors", null);
        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketTaggingConfiguration(java
     * .lang.String)
     */
    @Override
    public BucketTaggingConfiguration getBucketTaggingConfiguration(String bucketName) {
        return getBucketTaggingConfiguration(new GetBucketTaggingConfigurationRequest(bucketName));
    }

    @Override
    public BucketTaggingConfiguration getBucketTaggingConfiguration(
            GetBucketTaggingConfigurationRequest getBucketTaggingConfigurationRequest) {
        assertParameterNotNull(getBucketTaggingConfigurationRequest,
                "The request object parameter getBucketTaggingConfigurationRequest must be specifed.");
        final String bucketName = getBucketTaggingConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name must be specified when retrieving the bucket tagging configuration.");

        final Request<GetBucketTaggingConfigurationRequest> request = createRequest(bucketName,
                null, getBucketTaggingConfigurationRequest, HttpMethodName.GET);
        request.addParameter("tagging", null);

        try {
            return invoke(request, new Unmarshallers.BucketTaggingConfigurationUnmarshaller(),
                    bucketName, null);
        } catch (final AmazonServiceException ase) {
            switch (ase.getStatusCode()) {
                case 404:
                    return null;
                default:
                    throw ase;
            }
        }
    }


    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketTaggingConfiguration(java
     * .lang.String,
     * com.amazonaws.services.s3.model.BucketLifecycleConfiguration)
     */
    @Override
    public void setBucketTaggingConfiguration(String bucketName,
                                              BucketTaggingConfiguration bucketTaggingConfiguration) {
        setBucketTaggingConfiguration(new SetBucketTaggingConfigurationRequest(bucketName,
                bucketTaggingConfiguration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketTaggingConfiguration(com.
     * amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest)
     */
    @Override
    public void setBucketTaggingConfiguration(
            SetBucketTaggingConfigurationRequest setBucketTaggingConfigurationRequest) {
        assertParameterNotNull(setBucketTaggingConfigurationRequest,
                "The set bucket tagging configuration request object must be specified.");

        final String bucketName = setBucketTaggingConfigurationRequest.getBucketName();
        final BucketTaggingConfiguration bucketTaggingConfiguration = setBucketTaggingConfigurationRequest
                .getTaggingConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting bucket tagging configuration.");
        assertParameterNotNull(bucketTaggingConfiguration,
                "The tagging configuration parameter must be specified when setting bucket tagging configuration.");

        final Request<SetBucketTaggingConfigurationRequest> request = createRequest(bucketName, null,
                setBucketTaggingConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("tagging", null);

        final byte[] content = new BucketConfigurationXmlFactory()
                .convertToXmlByteArray(bucketTaggingConfiguration);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            final byte[] md5 = Md5Utils.computeMD5Hash(content);
            final String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch (final Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketTaggingConfiguration(java
     * .lang.String)
     */
    @Override
    public void deleteBucketTaggingConfiguration(String bucketName) {
        deleteBucketTaggingConfiguration(new DeleteBucketTaggingConfigurationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketTaggingConfiguration(com
     * .amazonaws.services.s3.model.DeleteBucketTaggingConfigurationRequest)
     */
    @Override
    public void deleteBucketTaggingConfiguration(
            DeleteBucketTaggingConfigurationRequest deleteBucketTaggingConfigurationRequest) {
        assertParameterNotNull(deleteBucketTaggingConfigurationRequest,
                "The delete bucket tagging configuration request object must be specified.");

        final String bucketName = deleteBucketTaggingConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting bucket tagging configuration.");

        final Request<DeleteBucketTaggingConfigurationRequest> request = createRequest(bucketName, null,
                deleteBucketTaggingConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("tagging", null);

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketWebsiteConfiguration(java
     * .lang.String, com.amazonaws.services.s3.model.BucketWebsiteConfiguration)
     */
    @Override
    public void setBucketWebsiteConfiguration(String bucketName,
                                              BucketWebsiteConfiguration configuration)
            throws AmazonClientException, AmazonServiceException {
        setBucketWebsiteConfiguration(new SetBucketWebsiteConfigurationRequest(bucketName,
                configuration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketWebsiteConfiguration(com.
     * amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest)
     */
    @Override
    public void setBucketWebsiteConfiguration(
            SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        final String bucketName = setBucketWebsiteConfigurationRequest.getBucketName();
        final BucketWebsiteConfiguration configuration = setBucketWebsiteConfigurationRequest
                .getConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting a bucket's website configuration");
        assertParameterNotNull(
                configuration,
                "The bucket website configuration parameter must be specified when setting a bucket's website configuration");
        if (configuration.getRedirectAllRequestsTo() == null) {
            assertParameterNotNull(
                    configuration.getIndexDocumentSuffix(),
                    "The bucket website configuration parameter must specify the index document suffix when setting a bucket's website configuration");
        }

        final Request<SetBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null,
                setBucketWebsiteConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(configuration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketWebsiteConfiguration(java
     * .lang.String)
     */
    @Override
    public void deleteBucketWebsiteConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        deleteBucketWebsiteConfiguration(new DeleteBucketWebsiteConfigurationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketWebsiteConfiguration(com
     * .amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest)
     */
    @Override
    public void deleteBucketWebsiteConfiguration(
            DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        final String bucketName = deleteBucketWebsiteConfigurationRequest.getBucketName();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting a bucket's website configuration");

        final Request<DeleteBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null,
                deleteBucketWebsiteConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketNotificationConfiguration
     * (java
     * .lang.String,com.amazonaws.services.s3.model.BucketNotificationConfiguration
     * )
     */
    @Override
    public void setBucketNotificationConfiguration(String bucketName,
                                                   BucketNotificationConfiguration bucketNotificationConfiguration)
            throws AmazonClientException, AmazonServiceException {
        setBucketNotificationConfiguration(new SetBucketNotificationConfigurationRequest(
                bucketName, bucketNotificationConfiguration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketNotificationConfiguration
     * (com.
     * amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest)
     */
    @Override
    public void setBucketNotificationConfiguration(
            SetBucketNotificationConfigurationRequest setBucketNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(setBucketNotificationConfigurationRequest,
                "The set bucket notification configuration request object must be specified.");

        final String bucketName = setBucketNotificationConfigurationRequest.getBucketName();
        final BucketNotificationConfiguration bucketNotificationConfiguration = setBucketNotificationConfigurationRequest
                .getNotificationConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting bucket notification configuration.");
        assertParameterNotNull(
                bucketNotificationConfiguration,
                "The notification configuration parameter must be specified when setting bucket notification configuration.");

        final Request<SetBucketNotificationConfigurationRequest> request = createRequest(bucketName,
                null, setBucketNotificationConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("notification", null);

        final byte[] bytes = bucketConfigurationXmlFactory
                .convertToXmlByteArray(bucketNotificationConfiguration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when querying notification configuration");
        return getBucketNotificationConfiguration(
                new GetBucketNotificationConfigurationRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketNotificationConfiguration
     * (java.lang.String)
     */
    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(
            GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {

        final String bucketName = getBucketNotificationConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket request must specify a bucket name when querying notification configuration");

        final Request<GetBucketNotificationConfigurationRequest> request = createRequest(bucketName,
                null, getBucketNotificationConfigurationRequest, HttpMethodName.GET);
        request.addParameter("notification", null);

        return invoke(request, BucketNotificationConfigurationStaxUnmarshaller.getInstance(),
                bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketLoggingConfiguration(java
     * .lang.String)
     */
    @Override
    public BucketLoggingConfiguration getBucketLoggingConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's logging status");

        return getBucketLoggingConfiguration(new GetBucketLoggingConfigurationRequest(bucketName));
    }

    @Override
    public BucketLoggingConfiguration getBucketLoggingConfiguration(
            GetBucketLoggingConfigurationRequest getBucketLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getBucketLoggingConfigurationRequest,
                "The bucket logging configuration");
        final String bucketName = getBucketLoggingConfigurationRequest.getBucketName();
        final Request<GetBucketLoggingConfigurationRequest> request = createRequest(bucketName,
                null, getBucketLoggingConfigurationRequest, HttpMethodName.GET);
        request.addParameter("logging", null);
        return invoke(request,
                new Unmarshallers.BucketLoggingConfigurationnmarshaller(),
                getBucketLoggingConfigurationRequest.getBucketName(), null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketLoggingConfiguration(com.
     * amazonaws.services.s3.SetBucketLoggingConfigurationRequest)
     */
    @Override
    public void setBucketLoggingConfiguration(
            SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(
                setBucketLoggingConfigurationRequest,
                "The set bucket logging configuration request object must be specified when enabling server access logging");

        final String bucketName = setBucketLoggingConfigurationRequest.getBucketName();
        final BucketLoggingConfiguration loggingConfiguration = setBucketLoggingConfigurationRequest
                .getLoggingConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when enabling server access logging");
        assertParameterNotNull(loggingConfiguration,
                "The logging configuration parameter must be specified when enabling server access logging");

        final Request<SetBucketLoggingConfigurationRequest> request = createRequest(bucketName, null,
                setBucketLoggingConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("logging", null);

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(loggingConfiguration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    @Override
    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(
            String bucketName) throws AmazonServiceException,
            AmazonClientException {
        return getBucketAccelerateConfiguration(new GetBucketAccelerateConfigurationRequest(
                bucketName));
    }

    @Override
    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(
            GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(getBucketAccelerateConfigurationRequest,
                "getBucketAccelerateConfigurationRequest must be specified.");
        final String bucketName = getBucketAccelerateConfigurationRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when querying accelerate configuration");

        final Request<GetBucketAccelerateConfigurationRequest> request = createRequest(bucketName, null,
                getBucketAccelerateConfigurationRequest, HttpMethodName.GET);
        request.addParameter("accelerate", null);

        return invoke(request, new Unmarshallers.BucketAccelerateConfigurationUnmarshaller(),
                bucketName, null);
    }

    @Override
    public void setBucketAccelerateConfiguration(String bucketName,
                                                 BucketAccelerateConfiguration accelerateConfiguration)
            throws AmazonServiceException, AmazonClientException {
        setBucketAccelerateConfiguration(new SetBucketAccelerateConfigurationRequest(
                bucketName, accelerateConfiguration));
    }

    @Override
    public void setBucketAccelerateConfiguration(
            SetBucketAccelerateConfigurationRequest setBucketAccelerateConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(setBucketAccelerateConfigurationRequest,
                "setBucketAccelerateConfigurationRequest must be specified");

        final String bucketName = setBucketAccelerateConfigurationRequest.getBucketName();
        final BucketAccelerateConfiguration accelerateConfiguration = setBucketAccelerateConfigurationRequest
                .getAccelerateConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when setting accelerate configuration.");
        assertParameterNotNull(accelerateConfiguration,
                "The bucket accelerate configuration parameter must be specified.");
        assertParameterNotNull(accelerateConfiguration.getStatus(),
                "The status parameter must be specified when updating bucket accelerate configuration.");

        final Request<SetBucketAccelerateConfigurationRequest> request = createRequest(
                bucketName, null, setBucketAccelerateConfigurationRequest,
                HttpMethodName.PUT);
        request.addParameter("accelerate", null);

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(accelerateConfiguration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketPolicy(java.lang.String)
     */
    @Override
    public BucketPolicy getBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return getBucketPolicy(new GetBucketPolicyRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketPolicy(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void setBucketPolicy(String bucketName, String policyText)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name must be specified when setting a bucket policy");
        assertParameterNotNull(policyText,
                "The policy text must be specified when setting a bucket policy");

        final Request<GenericBucketRequest> request = createRequest(bucketName, null,
                new GenericBucketRequest(bucketName), HttpMethodName.PUT);
        request.addParameter("policy", null);
        final byte[] bytes = ServiceUtils.toByteArray(policyText);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketPolicy(java.lang.String)
     */
    @Override
    public void deleteBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        deleteBucketPolicy(new DeleteBucketPolicyRequest(bucketName));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getBucketPolicy(com.amazonaws.services
     * .s3.model.GetBucketPolicyRequest)
     */
    @Override
    public BucketPolicy getBucketPolicy(
            GetBucketPolicyRequest getBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getBucketPolicyRequest,
                "The request object must be specified when getting a bucket policy");

        final String bucketName = getBucketPolicyRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name must be specified when getting a bucket policy");

        final Request<GetBucketPolicyRequest> request = createRequest(bucketName, null,
                getBucketPolicyRequest, HttpMethodName.GET);
        request.addParameter("policy", null);

        final BucketPolicy result = new BucketPolicy();
        try {
            final String policyText = invoke(request, new S3StringResponseHandler(), bucketName, null);
            result.setPolicyText(policyText);
            return result;
        } catch (final AmazonServiceException ase) {
            /*
             * If we receive an error response telling us that no policy has
             * been set for this bucket, then instead of forcing the user to
             * deal with the exception, we'll just return an empty result. Any
             * other exceptions will be rethrown for the user to handle.
             */
            if (ase.getErrorCode().equals("NoSuchBucketPolicy")) {
                return result;
            }
            throw ase;
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#setBucketPolicy(com.amazonaws.services
     * .s3.model.SetBucketPolicyRequest)
     */
    @Override
    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(setBucketPolicyRequest,
                "The request object must be specified when setting a bucket policy");

        final String bucketName = setBucketPolicyRequest.getBucketName();
        final String policyText = setBucketPolicyRequest.getPolicyText();

        assertParameterNotNull(bucketName,
                "The bucket name must be specified when setting a bucket policy");
        assertParameterNotNull(policyText,
                "The policy text must be specified when setting a bucket policy");

        final Request<SetBucketPolicyRequest> request = createRequest(bucketName, null,
                setBucketPolicyRequest, HttpMethodName.PUT);
        request.addParameter("policy", null);
        final byte[] bytes = ServiceUtils.toByteArray(policyText);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#deleteBucketPolicy(com.amazonaws.services
     * .s3.model.DeleteBucketPolicyRequest)
     */
    @Override
    public void deleteBucketPolicy(
            DeleteBucketPolicyRequest deleteBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteBucketPolicyRequest,
                "The request object must be specified when deleting a bucket policy");

        final String bucketName = deleteBucketPolicyRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name must be specified when deleting a bucket policy");

        final Request<DeleteBucketPolicyRequest> request = createRequest(bucketName, null,
                deleteBucketPolicyRequest, HttpMethodName.DELETE);
        request.addParameter("policy", null);

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(java.lang.String,
     * java.lang.String, java.util.Date)
     */
    @Override
    public URL generatePresignedUrl(String bucketName, String key, Date expiration)
            throws AmazonClientException {
        return generatePresignedUrl(bucketName, key, expiration, HttpMethod.GET);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(java.lang.String,
     * java.lang.String, java.util.Date, com.amazonaws.HttpMethod)
     */
    @Override
    public URL generatePresignedUrl(String bucketName, String key, Date expiration,
                                    HttpMethod method)
            throws AmazonClientException {
        final GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                method);
        request.setExpiration(expiration);

        return generatePresignedUrl(request);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(com.amazonaws
     * .services.s3.model.GeneratePresignedUrlRequest)
     */
    @Override
    public URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest)
            throws AmazonClientException {
        assertParameterNotNull(generatePresignedUrlRequest,
                "The request parameter must be specified when generating a pre-signed URL");

        final String bucketName = generatePresignedUrlRequest.getBucketName();
        final String key = generatePresignedUrlRequest.getKey();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when generating a pre-signed URL");
        assertParameterNotNull(generatePresignedUrlRequest.getMethod(),
                "The HTTP method request parameter must be specified when generating a pre-signed URL");

        if (generatePresignedUrlRequest.getExpiration() == null) {
            generatePresignedUrlRequest.setExpiration(
                    new Date(System.currentTimeMillis() + 1000 * 60 * 15));
        }

        final HttpMethodName httpMethod = HttpMethodName.valueOf(generatePresignedUrlRequest.getMethod()
                .toString());

        // If the key starts with a slash character itself, the following method
        // will actually add another slash before the resource path to prevent
        // the HttpClient mistakenly treating the slash as a path delimiter.
        // For presigned request, we need to remember to remove this extra slash
        // before generating the URL.
        final Request<GeneratePresignedUrlRequest> request = createRequest(bucketName, key,
                generatePresignedUrlRequest, httpMethod);

        addParameterIfNotNull(request, "versionId", generatePresignedUrlRequest.getVersionId());

        if (generatePresignedUrlRequest.isZeroByteContent()) {
            request.setContent(new ByteArrayInputStream(new byte[0]));
        }

        for (final Entry<String, String> entry : generatePresignedUrlRequest.getRequestParameters()
                .entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        if (generatePresignedUrlRequest.getContentType() != null) {
            request.addHeader(Headers.CONTENT_TYPE, generatePresignedUrlRequest.getContentType());
        }

        if (generatePresignedUrlRequest.getContentMd5() != null) {
            request.addHeader(Headers.CONTENT_MD5, generatePresignedUrlRequest.getContentMd5());
        }

        // SSE-C
        populateSSE_C(request, generatePresignedUrlRequest.getSSECustomerKey());
        // SSE
        addHeaderIfNotNull(request, Headers.SERVER_SIDE_ENCRYPTION,
                generatePresignedUrlRequest.getSSEAlgorithm());
        // SSE-KMS
        addHeaderIfNotNull(request,
                Headers.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID,
                generatePresignedUrlRequest.getKmsCmkId());

        // Add custom query parameters
        final Map<String, String> customQueryParameters = generatePresignedUrlRequest.getCustomQueryParameters();
        if (customQueryParameters != null) {
            for (Map.Entry<String, String> e: customQueryParameters.entrySet()) {
                request.addParameter(e.getKey(), e.getValue());
            }
        }

        addResponseHeaderParameters(request, generatePresignedUrlRequest.getResponseHeaders());

        final Signer signer = createSigner(request, bucketName, key);

        if (signer instanceof Presigner) {
            // If we have a signer which knows how to presign requests,
            // delegate directly to it.
            ((Presigner) signer).presignRequest(
                    request,
                    awsCredentialsProvider.getCredentials(),
                    generatePresignedUrlRequest.getExpiration()
            );
        } else {
            // Otherwise use the default presigning method, which is hardcoded
            // to use QueryStringSigner.
            presignRequest(
                    request,
                    generatePresignedUrlRequest.getMethod(),
                    bucketName,
                    key,
                    generatePresignedUrlRequest.getExpiration(),
                    null);
        }

        // Remove the leading slash (if any) in the resource-path
        return ServiceUtils.convertRequestToUrl(request, true);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#abortMultipartUpload(com.amazonaws
     * .services.s3.model.AbortMultipartUploadRequest)
     */
    @Override
    public void abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(abortMultipartUploadRequest,
                "The request parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getBucketName(),
                "The bucket name parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getKey(),
                "The key parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getUploadId(),
                "The upload ID parameter must be specified when aborting a multipart upload");

        final String bucketName = abortMultipartUploadRequest.getBucketName();
        final String key = abortMultipartUploadRequest.getKey();

        final Request<AbortMultipartUploadRequest> request = createRequest(bucketName, key,
                abortMultipartUploadRequest, HttpMethodName.DELETE);
        request.addParameter("uploadId", abortMultipartUploadRequest.getUploadId());
        populateRequesterPaysHeader(request, abortMultipartUploadRequest.isRequesterPays());

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#completeMultipartUpload(com.amazonaws
     * .services.s3.model.CompleteMultipartUploadRequest)
     */
    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest completeMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(completeMultipartUploadRequest,
                "The request parameter must be specified when completing a multipart upload");

        final String bucketName = completeMultipartUploadRequest.getBucketName();
        final String key = completeMultipartUploadRequest.getKey();
        final String uploadId = completeMultipartUploadRequest.getUploadId();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when completing a multipart upload");
        assertParameterNotNull(key,
                "The key parameter must be specified when completing a multipart upload");
        assertParameterNotNull(uploadId,
                "The upload ID parameter must be specified when completing a multipart upload");
        assertParameterNotNull(completeMultipartUploadRequest.getPartETags(),
                "The part ETags parameter must be specified when completing a multipart upload");

        int retries = 0;
        CompleteMultipartUploadHandler handler;
        do {
            final Request<CompleteMultipartUploadRequest> request = createRequest(bucketName, key, completeMultipartUploadRequest, HttpMethodName.POST);
            request.addParameter("uploadId", uploadId);

            populateRequesterPaysHeader(request, completeMultipartUploadRequest.isRequesterPays());

            final byte[] xml = RequestXmlFactory.convertToXmlByteArray(completeMultipartUploadRequest.getPartETags());
            request.addHeader("Content-Type", "application/xml");
            request.addHeader("Content-Length", String.valueOf(xml.length));

            request.setContent(new ByteArrayInputStream(xml));

            @SuppressWarnings("unchecked")
            final
            ResponseHeaderHandlerChain<CompleteMultipartUploadHandler> responseHandler = new ResponseHeaderHandlerChain<CompleteMultipartUploadHandler>(
                    // xml payload unmarshaller
                    new Unmarshallers.CompleteMultipartUploadResultUnmarshaller(),
                    // header handlers
                    new ServerSideEncryptionHeaderHandler<CompleteMultipartUploadHandler>(),
                    new ObjectExpirationHeaderHandler<CompleteMultipartUploadHandler>(),
                    new S3VersionHeaderHandler<CompleteMultipartUploadHandler>(),
                    new S3RequesterChargedHeaderHandler<CompleteMultipartUploadHandler>());
            handler = invoke(request, responseHandler, bucketName, key);
            if (handler.getCompleteMultipartUploadResult() != null) {
                return handler.getCompleteMultipartUploadResult();
            }
        } while (shouldRetryCompleteMultipartUpload(completeMultipartUploadRequest,
                handler.getAmazonS3Exception(), retries++));

        throw handler.getAmazonS3Exception();
    }

    private boolean shouldRetryCompleteMultipartUpload(AmazonWebServiceRequest originalRequest,
                                                       AmazonS3Exception exception,
                                                       int retriesAttempted) {

        final RetryPolicy retryPolicy = clientConfiguration.getRetryPolicy();

        if (retryPolicy == null || retryPolicy.getRetryCondition() == null) {
            return false;
        }

        if (retryPolicy == PredefinedRetryPolicies.NO_RETRY_POLICY) {
            return false;
        }

        return completeMultipartUploadRetryCondition.shouldRetry
                (originalRequest, exception, retriesAttempted);
    }
    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#initiateMultipartUpload(com.amazonaws
     * .services.s3.model.InitiateMultipartUploadRequest)
     */
    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest initiateMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(initiateMultipartUploadRequest,
                "The request parameter must be specified when initiating a multipart upload");

        assertParameterNotNull(initiateMultipartUploadRequest.getBucketName(),
                "The bucket name parameter must be specified when initiating a multipart upload");
        assertParameterNotNull(initiateMultipartUploadRequest.getKey(),
                "The key parameter must be specified when initiating a multipart upload");

        final Request<InitiateMultipartUploadRequest> request = createRequest(
                initiateMultipartUploadRequest.getBucketName(),
                initiateMultipartUploadRequest.getKey(), initiateMultipartUploadRequest,
                HttpMethodName.POST);
        request.addParameter("uploads", null);

        if (initiateMultipartUploadRequest.getStorageClass() != null) {
            request.addHeader(Headers.STORAGE_CLASS, initiateMultipartUploadRequest
                    .getStorageClass().toString());
        }

        if (initiateMultipartUploadRequest.getRedirectLocation() != null) {
            request.addHeader(Headers.REDIRECT_LOCATION,
                    initiateMultipartUploadRequest.getRedirectLocation());
        }

        if (initiateMultipartUploadRequest.getAccessControlList() != null) {
            addAclHeaders(request, initiateMultipartUploadRequest.getAccessControlList());
        } else if (initiateMultipartUploadRequest.getCannedACL() != null) {
            request.addHeader(Headers.S3_CANNED_ACL, initiateMultipartUploadRequest.getCannedACL()
                    .toString());
        }

        if (initiateMultipartUploadRequest.objectMetadata != null) {
            populateRequestMetadata(request, initiateMultipartUploadRequest.objectMetadata);
        }

        populateRequesterPaysHeader(request, initiateMultipartUploadRequest.isRequesterPays());

        // Populate the SSE-C parameters to the request header
        populateSSE_C(request, initiateMultipartUploadRequest.getSSECustomerKey());

        // Populate the SSE AWS KMS parameters to the request header
        populateSSE_KMS(request,
                initiateMultipartUploadRequest.getSSEAwsKeyManagementParams());

        // Be careful that we don't send the object's total size as the content
        // length for the InitiateMultipartUpload request.
        setZeroContentLength(request);
        // Set the request content to be empty (but not null) to force the
        // runtime to pass
        // any query params in the query string and not the request body, to
        // keep S3 happy.
        request.setContent(new ByteArrayInputStream(new byte[0]));

        @SuppressWarnings("unchecked")
        final
        ResponseHeaderHandlerChain<InitiateMultipartUploadResult> responseHandler = new ResponseHeaderHandlerChain<InitiateMultipartUploadResult>(
                // xml payload unmarshaller
                new Unmarshallers.InitiateMultipartUploadResultUnmarshaller(),
                // header handlers
                new ServerSideEncryptionHeaderHandler<InitiateMultipartUploadResult>());
        return invoke(request, responseHandler,
                initiateMultipartUploadRequest.getBucketName(),
                initiateMultipartUploadRequest.getKey());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listMultipartUploads(com.amazonaws
     * .services.s3.model.ListMultipartUploadsRequest)
     */
    @Override
    public MultipartUploadListing listMultipartUploads(
            ListMultipartUploadsRequest listMultipartUploadsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listMultipartUploadsRequest,
                "The request parameter must be specified when listing multipart uploads");

        assertParameterNotNull(listMultipartUploadsRequest.getBucketName(),
                "The bucket name parameter must be specified when listing multipart uploads");

        final Request<ListMultipartUploadsRequest> request = createRequest(
                listMultipartUploadsRequest.getBucketName(), null, listMultipartUploadsRequest,
                HttpMethodName.GET);
        request.addParameter("uploads", null);

        if (listMultipartUploadsRequest.getKeyMarker() != null) {
            request.addParameter("key-marker", listMultipartUploadsRequest.getKeyMarker());
        }
        if (listMultipartUploadsRequest.getMaxUploads() != null) {
            request.addParameter("max-uploads", listMultipartUploadsRequest.getMaxUploads()
                    .toString());
        }
        if (listMultipartUploadsRequest.getUploadIdMarker() != null) {
            request.addParameter("upload-id-marker",
                    listMultipartUploadsRequest.getUploadIdMarker());
        }
        if (listMultipartUploadsRequest.getDelimiter() != null) {
            request.addParameter("delimiter", listMultipartUploadsRequest.getDelimiter());
        }
        if (listMultipartUploadsRequest.getPrefix() != null) {
            request.addParameter("prefix", listMultipartUploadsRequest.getPrefix());
        }
        if (listMultipartUploadsRequest.getEncodingType() != null) {
            request.addParameter("encoding-type", listMultipartUploadsRequest.getEncodingType());
        }

        return invoke(request, new Unmarshallers.ListMultipartUploadsResultUnmarshaller(),
                listMultipartUploadsRequest.getBucketName(), null);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#listParts(com.amazonaws.services.s3
     * .model.ListPartsRequest)
     */
    @Override
    public PartListing listParts(ListPartsRequest listPartsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listPartsRequest,
                "The request parameter must be specified when listing parts");

        assertParameterNotNull(listPartsRequest.getBucketName(),
                "The bucket name parameter must be specified when listing parts");
        assertParameterNotNull(listPartsRequest.getKey(),
                "The key parameter must be specified when listing parts");
        assertParameterNotNull(listPartsRequest.getUploadId(),
                "The upload ID parameter must be specified when listing parts");

        final Request<ListPartsRequest> request = createRequest(listPartsRequest.getBucketName(),
                listPartsRequest.getKey(), listPartsRequest, HttpMethodName.GET);
        request.addParameter("uploadId", listPartsRequest.getUploadId());

        if (listPartsRequest.getMaxParts() != null) {
            request.addParameter("max-parts", listPartsRequest.getMaxParts().toString());
        }
        if (listPartsRequest.getPartNumberMarker() != null) {
            request.addParameter("part-number-marker", listPartsRequest.getPartNumberMarker()
                    .toString());
        }
        if (listPartsRequest.getEncodingType() != null) {
            request.addParameter("encoding-type", listPartsRequest.getEncodingType());
        }


        populateRequesterPaysHeader(request, listPartsRequest.isRequesterPays());
        return invoke(request, new Unmarshallers.ListPartsResultUnmarshaller(),
                listPartsRequest.getBucketName(), listPartsRequest.getKey());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#uploadPart(com.amazonaws.services.
     * s3.model.UploadPartRequest)
     */
    @Override
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(uploadPartRequest,
                "The request parameter must be specified when uploading a part");

        final String bucketName = uploadPartRequest.getBucketName();
        final String key = uploadPartRequest.getKey();
        final String uploadId = uploadPartRequest.getUploadId();
        final int partNumber = uploadPartRequest.getPartNumber();
        final long partSize = uploadPartRequest.getPartSize();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when uploading a part");
        assertParameterNotNull(key,
                "The key parameter must be specified when uploading a part");
        assertParameterNotNull(uploadId,
                "The upload ID parameter must be specified when uploading a part");
        assertParameterNotNull(partNumber,
                "The part number parameter must be specified when uploading a part");
        assertParameterNotNull(partSize,
                "The part size parameter must be specified when uploading a part");

        final Request<UploadPartRequest> request = createRequest(bucketName, key, uploadPartRequest,
                HttpMethodName.PUT);
        request.addParameter("uploadId", uploadId);
        request.addParameter("partNumber", Integer.toString(partNumber));

        final ObjectMetadata objectMetadata = uploadPartRequest.getObjectMetadata();
        if (objectMetadata != null) {
            populateRequestMetadata(request, objectMetadata);
        }

        addHeaderIfNotNull(request, Headers.CONTENT_MD5, uploadPartRequest.getMd5Digest());
        request.addHeader(Headers.CONTENT_LENGTH, Long.toString(partSize));
        /*
         * HttpUrlConnection seems to be buggy in terms of implementation of
         * expect continue.
         */
        // request.addHeader("Expect", "100-continue");
        populateRequesterPaysHeader(request, uploadPartRequest.isRequesterPays());
        // Populate the SSE-CPK parameters to the request header
        populateSSE_C(request, uploadPartRequest.getSSECustomerKey());

        InputStream inputStream = null;
        if (uploadPartRequest.getInputStream() != null) {
            inputStream = uploadPartRequest.getInputStream();
        } else if (uploadPartRequest.getFile() != null) {
            try {
                inputStream = new InputSubstream(new RepeatableFileInputStream(
                        uploadPartRequest.getFile()),
                        uploadPartRequest.getFileOffset(), partSize, true);
            } catch (final FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        } else {
            throw new IllegalArgumentException(
                    "A File or InputStream must be specified when uploading part");
        }

        MD5DigestCalculatingInputStream md5DigestStream = null;
        if (uploadPartRequest.getMd5Digest() == null
                && !ServiceUtils.skipMd5CheckPerRequest(uploadPartRequest)) {
            /*
             * If the user hasn't set the content MD5, then we don't want to
             * buffer the whole stream in memory just to calculate it. Instead,
             * we can calculate it on the fly and validate it with the returned
             * ETag from the object upload.
             */
            inputStream = md5DigestStream = new MD5DigestCalculatingInputStream(inputStream);
        }

        /*
         * This is compatible with progress listener set by either the legacy
         * method UploadPartRequest#setProgressListener or the new method
         * UploadPartRequest#setGeneralProgressListener.
         */
        final ProgressListener progressListener = uploadPartRequest.getGeneralProgressListener();
        final ProgressListenerCallbackExecutor progressListenerCallbackExecutor = ProgressListenerCallbackExecutor
                .wrapListener(progressListener);

        if (progressListenerCallbackExecutor != null) {
            inputStream = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutor);
            ((ProgressReportingInputStream)inputStream).setNotificationThreshold(this.notificationThreshold);
            fireProgressEvent(progressListenerCallbackExecutor, ProgressEvent.PART_STARTED_EVENT_CODE);
        }

        try {
            request.setContent(inputStream);
            final ObjectMetadata metadata = invoke(request, new S3MetadataResponseHandler(), bucketName,
                    key);

            if (metadata != null && md5DigestStream != null
                    && !ServiceUtils.skipMd5CheckPerResponse(metadata)) {
                final byte[] clientSideHash = md5DigestStream.getMd5Digest();
                final byte[] serverSideHash = BinaryUtils.fromHex(metadata.getETag());

                if (!Arrays.equals(clientSideHash, serverSideHash)) {
                    throw new AmazonClientException(
                            "Unable to verify integrity of data upload.  "
                                    +
                                    "Client calculated content hash didn't match hash calculated by Amazon S3.  "
                                    +
                                    "You may need to delete the data stored in Amazon S3.");
                }
            }

            fireProgressEvent(progressListenerCallbackExecutor,
                    ProgressEvent.PART_COMPLETED_EVENT_CODE);

            final UploadPartResult result = new UploadPartResult();
            result.setETag(metadata.getETag());
            result.setPartNumber(partNumber);
            result.setSSEAlgorithm(metadata.getSSEAlgorithm());
            result.setSSECustomerAlgorithm(metadata.getSSECustomerAlgorithm());
            result.setSSECustomerKeyMd5(metadata.getSSECustomerKeyMd5());
            result.setRequesterCharged(metadata.isRequesterCharged());
            return result;
        } catch (final AmazonClientException ace) {
            fireProgressEvent(progressListenerCallbackExecutor,
                    ProgressEvent.PART_FAILED_EVENT_CODE);

            // Leaving this here in case anyone is depending on it, but it's
            // inconsistent with other methods which only generate one of
            // COMPLETED_EVENT_CODE or FAILED_EVENT_CODE.
            // fireProgressEvent(progressListenerCallbackExecutor,
            // ProgressEvent.PART_COMPLETED_EVENT_CODE);

            throw ace;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (final Exception e) {
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#getResponseMetadataForRequest(com.
     * amazonaws.AmazonWebServiceRequest)
     */
    @Override
    public S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return (S3ResponseMetadata) client.getResponseMetadataForRequest(request);
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#restoreObject(com.amazonaws.services
     * .s3.model.RestoreObjectRequest)
     */
    @Override
    public void restoreObject(RestoreObjectRequest restoreObjectRequest)
            throws AmazonServiceException {
        final String bucketName = restoreObjectRequest.getBucketName();
        final String key = restoreObjectRequest.getKey();
        final String versionId = restoreObjectRequest.getVersionId();
        final int expirationIndays = restoreObjectRequest.getExpirationInDays();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when copying a glacier object");
        assertParameterNotNull(key,
                "The key parameter must be specified when copying a glacier object");
        if (expirationIndays == -1) {
            throw new IllegalArgumentException(
                    "The expiration in days parameter must be specified when copying a glacier object");
        }

        final Request<RestoreObjectRequest> request = createRequest(bucketName, key,
                restoreObjectRequest, HttpMethodName.POST);
        request.addParameter("restore", null);
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }

        populateRequesterPaysHeader(request, restoreObjectRequest.isRequesterPays());

        final byte[] content = RequestXmlFactory.convertToXmlByteArray(restoreObjectRequest);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            final byte[] md5 = Md5Utils.computeMD5Hash(content);
            final String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch (final Exception e) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /**
     * (non-Javadoc)
     *
     * @see
     *      com.amazonaws.services.s3.AmazonS3#copyGlacierObject((java.lang.String
     *      , java.lang.String, int)
     */
    @Override
    public void restoreObject(String bucketName, String key, int expirationInDays)
            throws AmazonServiceException {
        restoreObject(new RestoreObjectRequest(bucketName, key, expirationInDays));
    }

    /*
     * Private Interface
     */

    /**
     * Fires a progress event with the specified event type to the specified
     * listener.
     *
     * @param progressListenerCallbackExecutor The listener callback executor.
     * @param eventType The type of event to fire.
     */
    private void fireProgressEvent(
            final ProgressListenerCallbackExecutor progressListenerCallbackExecutor,
            final int eventType) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        final ProgressEvent event = new ProgressEvent(0);
        event.setEventCode(eventType);
        progressListenerCallbackExecutor.progressChanged(event);
    }

    /**
     * <p>
     * Gets the Amazon S3 {@link AccessControlList} (ACL) for the specified
     * resource. (bucket if only the bucketName parameter is specified,
     * otherwise the object with the specified key in the bucket).
     * </p>
     *
     * @param bucketName The name of the bucket whose ACL should be returned if
     *            the key parameter is not specified, otherwise the bucket
     *            containing the specified key.
     * @param key The object key whose ACL should be retrieve. If not specified,
     *            the bucket's ACL is returned.
     * @param versionId The version ID of the object version whose ACL is being
     *            retrieved.
     * @param originalRequest The original, user facing request object.
     * @return The S3 ACL for the specified resource.
     */
    private AccessControlList getAcl(String bucketName, String key, String versionId,
                                     boolean isRequesterPays, AmazonWebServiceRequest originalRequest) {
        if (originalRequest == null) {
            originalRequest = new GenericBucketRequest(bucketName);
        }

        final Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest,
                HttpMethodName.GET);
        request.addParameter("acl", null);
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }
        populateRequesterPaysHeader(request, isRequesterPays);

        return invoke(request, new Unmarshallers.AccessControlListUnmarshaller(), bucketName, key);
    }

    /**
     * Sets the Canned ACL for the specified resource in S3. If only bucketName
     * is specified, the canned ACL will be applied to the bucket, otherwise if
     * bucketName and key are specified, the canned ACL will be applied to the
     * object.
     *
     * @param bucketName The name of the bucket containing the specified key, or
     *            if no key is listed, the bucket whose ACL will be set.
     * @param key The optional object key within the specified bucket whose ACL
     *            will be set. If not specified, the bucket ACL will be set.
     * @param versionId The version ID of the object version whose ACL is being
     *            set.
     * @param cannedAcl The canned ACL to apply to the resource.
     * @param originalRequest The original, user facing request object.
     */
    private void setAcl(String bucketName, String key, String versionId,
                        CannedAccessControlList cannedAcl, boolean isRequesterPays,
                        AmazonWebServiceRequest originalRequest) {
        if (originalRequest == null) {
            originalRequest = new GenericBucketRequest(bucketName);
        }

        final Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest,
                HttpMethodName.PUT);
        request.addParameter("acl", null);
        request.addHeader(Headers.S3_CANNED_ACL, cannedAcl.toString());
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }
        populateRequesterPaysHeader(request, isRequesterPays);

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /**
     * Sets the ACL for the specified resource in S3. If only bucketName is
     * specified, the ACL will be applied to the bucket, otherwise if bucketName
     * and key are specified, the ACL will be applied to the object.
     *
     * @param bucketName
     *            The name of the bucket containing the specified key, or if no
     *            key is listed, the bucket whose ACL will be set.
     * @param key
     *            The optional object key within the specified bucket whose ACL
     *            will be set. If not specified, the bucket ACL will be set.
     * @param versionId
     *            The version ID of the object version whose ACL is being set.
     * @param acl
     *            The ACL to apply to the resource.
     * @param originalRequest
     *            The original, user facing request object.
     */
    private void setAcl(String bucketName, String key, String versionId, AccessControlList acl,
                        boolean isRequesterPays,
                        AmazonWebServiceRequest originalRequest) {
        if (originalRequest == null) {
            originalRequest = new GenericBucketRequest(bucketName);
        }

        final Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest,
                HttpMethodName.PUT);
        request.addParameter("acl", null);
        if (versionId != null) {
            request.addParameter("versionId", versionId);
        }
        populateRequesterPaysHeader(request, isRequesterPays);

        final byte[] aclAsXml = new AclXmlFactory().convertToXmlByteArray(acl);
        request.addHeader("Content-Type", "application/xml");
        request.addHeader("Content-Length", String.valueOf(aclAsXml.length));
        request.setContent(new ByteArrayInputStream(aclAsXml));

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /**
     * Returns a "complete" S3 specific signer, taking into the S3 bucket, key,
     * and the current S3 client configuration into account.
     */
    protected Signer createSigner(final Request<?> request,
                                  final String bucketName,
                                  final String key) {
        // Instead of using request.getEndpoint() for this parameter, we use
        // endpoint which is because
        // in accelerate mode, the endpoint in request is regionless. We need
        // the client-wide endpoint
        // to fetch the region information and pick the correct signer.
        final URI uri = clientOptions.isAccelerateModeEnabled() ? endpoint : request.getEndpoint();
        final Signer signer = getSignerByURI(uri);

        if (!isSignerOverridden()) {
            if ((signer instanceof AWSS3V4Signer) && noExplicitRegionProvided(request)) {

                final String region = clientRegion == null ? bucketRegionCache.get(bucketName)
                        : clientRegion;
                if (region != null) {
                    // If cache contains the region for the bucket, create an endpoint for the region and
                    // update the request with that endpoint.
                    resolveRequestEndpoint(request, bucketName, key, RuntimeHttpUtils.toUri(
                            RegionUtils.getRegion(region).getServiceEndpoint(S3_SERVICE_NAME),
                            clientConfiguration));

                    final AWSS3V4Signer v4Signer = (AWSS3V4Signer) signer;
                    v4Signer.setServiceName(getServiceNameIntern());
                    v4Signer.setRegionName(region);
                    return v4Signer;
                } else if (request.getOriginalRequest() instanceof GeneratePresignedUrlRequest) {
                    return createSigV2Signer(request, bucketName, key);
                }
            }
            // use the signer override if provided, else see if you can get the
            // signer from bucketreqion cache.
            final String regionOverride = getSignerRegionOverride() == null
                    ? (clientRegion == null ? bucketRegionCache.get(bucketName) : clientRegion)
                    : getSignerRegionOverride();
            if (regionOverride != null) {
                final AWSS3V4Signer v4Signer = new AWSS3V4Signer();
                v4Signer.setServiceName(getServiceNameIntern());
                v4Signer.setRegionName(regionOverride);
                return v4Signer;
            }
        }

        if (signer instanceof S3Signer) {
            // The old S3Signer needs a method and path passed to its
            // constructor; if that's what we should use, getSigner()
            // will return a dummy instance and we need to create a
            // new one with the appropriate values for this request.
            return createSigV2Signer(request, bucketName, key);
        }

        return signer;
    }

    /**
     * Has signer been explicitly overriden in the configuration?
     */
    private boolean isSignerOverridden() {
        return clientConfiguration != null
                && clientConfiguration.getSignerOverride() != null;
    }

    /**
     * <p>
     * Returns true if the region required for signing could not be computed
     * from the client or the request.
     * </p>
     * <p>
     * This is the case when the standard endpoint is in use and neither an
     * explicit region nor a signer override have been provided by the user.
     * </p>
     */
    private boolean noExplicitRegionProvided(final Request<?> request) {
        return isStandardEndpoint(request.getEndpoint()) &&
                getSignerRegion() == null;
    }

    /**
     * Return the region string that should be used for signing requests sent by
     * this client. This method can only return null if both of the following
     * are true:
     * (a) the user has never specified a region via setRegion/configureRegion/setSignerRegionOverride
     * (b) the user has specified a client endpoint that is known to be a global S3 endpoint
     */
    private String getSignerRegion() {
        String region = getSignerRegionOverride();
        if (region == null) {
            region = clientRegion;
        }
        return region;
    }

    private boolean isStandardEndpoint(URI endpoint) {
        return endpoint.getHost().endsWith(Constants.S3_HOSTNAME);
    }

    private S3Signer createSigV2Signer(final Request<?> request,
                                       final String bucketName,
                                       final String key) {
        final String resourcePath = "/" +
                ((bucketName != null) ? bucketName + "/" : "") +
                ((key != null) ? key : "");
        return new S3Signer(request.getHttpMethod().toString(), resourcePath);
    }

    /**
     * Pre-signs the specified request, using a signature query-string
     * parameter.
     *
     * @param request The request to sign.
     * @param methodName The HTTP method (GET, PUT, DELETE, HEAD) for the
     *            specified request.
     * @param bucketName The name of the bucket involved in the request. If the
     *            request is not an operation on a bucket this parameter should
     *            be null.
     * @param key The object key involved in the request. If the request is not
     *            an operation on an object, this parameter should be null.
     * @param expiration The time at which the signed request is no longer
     *            valid, and will stop working.
     * @param subResource The optional sub-resource being requested as part of
     *            the request (e.g. "location", "acl", "logging", or "torrent").
     */
    protected <T> void presignRequest(Request<T> request, HttpMethod methodName,
                                      String bucketName, String key, Date expiration, String subResource) {
        // Run any additional request handlers if present
        beforeRequest(request);

        String resourcePath = "/" +
                ((bucketName != null) ? bucketName + "/" : "") +
                ((key != null) ? key : "") +
                ((subResource != null) ? "?" + subResource : "");

        // Make sure the resource-path for signing does not contain
        // any consecutive "/"s.
        // Note that we should also follow the same rule to escape
        // consecutive "/"s when generating the presigned URL.
        // See ServiceUtils#convertRequestToUrl(...)
        resourcePath = resourcePath.replaceAll("(?<=/)/", "%2F");

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        final AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        new S3QueryStringSigner(methodName.toString(), resourcePath, expiration).sign(request,
                credentials);

        // The Amazon S3 DevPay token header is a special exception and can be
        // safely moved
        // from the request's headers into the query string to ensure that it
        // travels along
        // with the pre-signed URL when it's sent back to Amazon S3.
        if (request.getHeaders().containsKey(Headers.SECURITY_TOKEN)) {
            final String value = request.getHeaders().get(Headers.SECURITY_TOKEN);
            request.addParameter(Headers.SECURITY_TOKEN, value);
            request.getHeaders().remove(Headers.SECURITY_TOKEN);
        }
    }

    private <T> void beforeRequest(Request<T> request) {
        if (requestHandler2s != null) {
            for (final RequestHandler2 requestHandler2 : requestHandler2s) {
                requestHandler2.beforeRequest(request);
            }
        }
    }

    /**
     * Converts the current endpoint set for this client into virtual addressing
     * style, by placing the name of the specified bucket before the S3 service
     * endpoint.
     *
     * @param bucketName The name of the bucket to use in the virtual addressing
     *            style of the returned URI.
     * @return A new URI, creating from the current service endpoint URI and the
     *         specified bucket.
     */
    private URI convertToVirtualHostEndpoint(URI endpoint, String bucketName) {
        try {
            return new URI(endpoint.getScheme() + "://" + bucketName + "."
                    + endpoint.getAuthority());
        } catch (final URISyntaxException e) {
            throw new IllegalArgumentException("Invalid bucket name: " + bucketName, e);
        }
    }

    /**
     * <p>
     * Populates the specified request object with the appropriate headers from
     * the {@link ObjectMetadata} object.
     * </p>
     *
     * @param request The request to populate with headers.
     * @param metadata The metadata containing the header information to include
     *            in the request.
     */
    protected static void populateRequestMetadata(Request<?> request, ObjectMetadata metadata) {
        final Map<String, Object> rawMetadata = metadata.getRawMetadata();

        if (rawMetadata.get(Headers.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID) != null
                && !ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION.equals(rawMetadata
                .get(Headers.SERVER_SIDE_ENCRYPTION))) {
            throw new IllegalArgumentException(
                    "If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }

        if (rawMetadata != null) {
            for (final Entry<String, Object> entry : rawMetadata.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue().toString());
            }
        }

        final Date httpExpiresDate = metadata.getHttpExpiresDate();
        if (httpExpiresDate != null) {
            request.addHeader(Headers.EXPIRES, DateUtils.formatRFC822Date(httpExpiresDate));
        }

        final Map<String, String> userMetadata = metadata.getUserMetadata();
        if (userMetadata != null) {
            for (final Entry<String, String> entry : userMetadata.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    key = key.trim();
                }
                if (value != null) {
                    value = value.trim();
                }
                request.addHeader(Headers.S3_USER_METADATA_PREFIX + key, value);
            }
        }
    }

    /**
     * <p>
     * Populates the specified request with the specified Multi-Factor
     * Authentication (MFA) details. This includes the MFA header with device
     * serial number and generated token. Since all requests which include the
     * MFA header must be sent over HTTPS, this operation also configures the
     * request object to use HTTPS instead of HTTP.
     * </p>
     *
     * @param request The request to populate.
     * @param mfa The Multi-Factor Authentication information.
     */
    private void populateRequestWithMfaDetails(Request<?> request, MultiFactorAuthentication mfa) {
        if (mfa == null) {
            return;
        }

        final String endpoint = request.getEndpoint().toString();
        if (endpoint.startsWith("http://")) {
            final String httpsEndpoint = endpoint.replace("http://", "https://");
            request.setEndpoint(URI.create(httpsEndpoint));
            log.info("Overriding current endpoint to use HTTPS " +
                    "as required by S3 for requests containing an MFA header");
        }

        request.addHeader(Headers.S3_MFA,
                mfa.getDeviceSerialNumber() + " " + mfa.getToken());
    }

    /**
     * <p>
     * Populates the specified request with the numerous options available in
     * <code>CopyObjectRequest</code>.
     * </p>
     *
     * @param request The request to populate with headers to represent all the
     *            options expressed in the <code>CopyObjectRequest</code>
     *            object.
     * @param copyObjectRequest The object containing all the options for
     *            copying an object in Amazon S3.
     */
    private void populateRequestWithCopyObjectParameters(
            Request<? extends AmazonWebServiceRequest> request, CopyObjectRequest copyObjectRequest) {
        String copySourceHeader = "/" + copyObjectRequest.getSourceBucketName()
                    + "/" + copyObjectRequest.getSourceKey();

        if (copyObjectRequest.getSourceVersionId() != null) {
            copySourceHeader += "?versionId=" + copyObjectRequest.getSourceVersionId();
        }
        request.addHeader("x-amz-copy-source", copySourceHeader);

        addDateHeader(request, Headers.COPY_SOURCE_IF_MODIFIED_SINCE,
                copyObjectRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.COPY_SOURCE_IF_UNMODIFIED_SINCE,
                copyObjectRequest.getUnmodifiedSinceConstraint());

        addStringListHeader(request, Headers.COPY_SOURCE_IF_MATCH,
                copyObjectRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.COPY_SOURCE_IF_NO_MATCH,
                copyObjectRequest.getNonmatchingETagConstraints());

        if (copyObjectRequest.getAccessControlList() != null) {
            addAclHeaders(request, copyObjectRequest.getAccessControlList());
        } else if (copyObjectRequest.getCannedAccessControlList() != null) {
            request.addHeader(Headers.S3_CANNED_ACL,
                    copyObjectRequest.getCannedAccessControlList().toString());
        }

        if (copyObjectRequest.getStorageClass() != null) {
            request.addHeader(Headers.STORAGE_CLASS, copyObjectRequest.getStorageClass());
        }

        if (copyObjectRequest.getRedirectLocation() != null) {
            request.addHeader(Headers.REDIRECT_LOCATION, copyObjectRequest.getRedirectLocation());
        }

        populateRequesterPaysHeader(request, copyObjectRequest.isRequesterPays());

        final ObjectMetadata newObjectMetadata = copyObjectRequest.getNewObjectMetadata();
        if (newObjectMetadata != null) {
            request.addHeader(Headers.METADATA_DIRECTIVE, "REPLACE");
            populateRequestMetadata(request, newObjectMetadata);
        }

        // Populate the SSE-C parameters for the destination object
        populateSourceSSE_C(request, copyObjectRequest.getSourceSSECustomerKey());
        populateSSE_C(request, copyObjectRequest.getDestinationSSECustomerKey());
    }

    /**
     * <p>
     * Populates the specified request with the numerous options available in
     * <code>CopyObjectRequest</code>.
     * </p>
     *
     * @param request The request to populate with headers to represent all the
     *            options expressed in the <code>CopyPartRequest</code> object.
     * @param copyPartRequest The object containing all the options for copying
     *            an object in Amazon S3.
     */
    private void populateRequestWithCopyPartParameters(Request<?> request,
                                                       CopyPartRequest copyPartRequest) {
        String copySourceHeader = "/" + copyPartRequest.getSourceBucketName()
                    + "/" + copyPartRequest.getSourceKey();

        if (copyPartRequest.getSourceVersionId() != null) {
            copySourceHeader += "?versionId=" + copyPartRequest.getSourceVersionId();
        }
        request.addHeader("x-amz-copy-source", copySourceHeader);

        addDateHeader(request, Headers.COPY_SOURCE_IF_MODIFIED_SINCE,
                copyPartRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.COPY_SOURCE_IF_UNMODIFIED_SINCE,
                copyPartRequest.getUnmodifiedSinceConstraint());

        addStringListHeader(request, Headers.COPY_SOURCE_IF_MATCH,
                copyPartRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.COPY_SOURCE_IF_NO_MATCH,
                copyPartRequest.getNonmatchingETagConstraints());

        if (copyPartRequest.getFirstByte() != null && copyPartRequest.getLastByte() != null) {
            final String range = "bytes=" + copyPartRequest.getFirstByte() + "-"
                    + copyPartRequest.getLastByte();
            request.addHeader(Headers.COPY_PART_RANGE, range);
        }

        // Populate the SSE-C parameters for the destination object
        populateSourceSSE_C(request, copyPartRequest.getSourceSSECustomerKey());
        populateSSE_C(request, copyPartRequest.getDestinationSSECustomerKey());
    }

    /**
     * <p>
     * Populates the specified request with the numerous attributes available in
     * <code>SSEWithCustomerKeyRequest</code>.
     * </p>
     *
     * @param request The request to populate with headers to represent all the
     *            options expressed in the
     *            <code>ServerSideEncryptionWithCustomerKeyRequest</code>
     *            object.
     * @param sseCpkRequest The request object for an S3 operation that allows
     *            server-side encryption using customer-provided keys.
     */
    private static void populateSSE_C(Request<?> request, SSECustomerKey sseKey) {
        if (sseKey == null) {
            return;
        }

        addHeaderIfNotNull(request, Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM,
                sseKey.getAlgorithm());
        addHeaderIfNotNull(request, Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY,
                sseKey.getKey());
        addHeaderIfNotNull(request, Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5,
                sseKey.getMd5());
        // Calculate the MD5 hash of the encryption key and fill it in the
        // header, if the user didn't specify it in the metadata
        if (sseKey.getKey() != null
                && sseKey.getMd5() == null) {
            final String encryptionKey_b64 = sseKey.getKey();
            final byte[] encryptionKey = Base64.decode(encryptionKey_b64);
            request.addHeader(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5,
                    Md5Utils.md5AsBase64(encryptionKey));
        }
    }

    private static void populateSourceSSE_C(Request<?> request, SSECustomerKey sseKey) {
        if (sseKey == null) {
            return;
        }

        // Populate the SSE-CPK parameters for the source object
        addHeaderIfNotNull(request, Headers.COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM,
                sseKey.getAlgorithm());
        addHeaderIfNotNull(request, Headers.COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY,
                sseKey.getKey());
        addHeaderIfNotNull(request, Headers.COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5,
                sseKey.getMd5());
        // Calculate the MD5 hash of the encryption key and fill it in the
        // header, if the user didn't specify it in the metadata
        if (sseKey.getKey() != null
                && sseKey.getMd5() == null) {
            final String encryptionKey_b64 = sseKey.getKey();
            final byte[] encryptionKey = Base64.decode(encryptionKey_b64);
            request.addHeader(Headers.COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5,
                    Md5Utils.md5AsBase64(encryptionKey));
        }
    }

    private static void populateSSE_KMS(Request<?> request,
                                        SSEAwsKeyManagementParams sseParams) {

        if (sseParams != null) {
            addHeaderIfNotNull(request, Headers.SERVER_SIDE_ENCRYPTION,
                    sseParams.getEncryption());
            addHeaderIfNotNull(request,
                    Headers.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID,
                    sseParams.getAwsKmsKeyId());
        }
    }

    /**
     * Adds the part number to the specified request, if partNumber is not null.
     *
     * @param request
     *            The request to add the partNumber to.
     * @param partNumber
     *               The part number to be added.
     */
    private void addPartNumberIfNotNull(Request<?> request, Integer partNumber) {
        if (partNumber != null) {
            request.addParameter("partNumber", partNumber.toString());
        }
    }

    /**
     * Adds the specified header to the specified request, if the header value
     * is not null.
     *
     * @param request
     *            The request to add the header to.
     * @param header
     *            The header name.
     * @param value
     *            The header value.
     */
    private static void addHeaderIfNotNull(Request<?> request, String header, String value) {
        if (value != null) {
            request.addHeader(header, value);
        }
    }

    /**
     * Adds the specified parameter to the specified request, if the parameter
     * value is not null.
     *
     * @param request
     *            The request to add the parameter to.
     * @param paramName
     *            The parameter name.
     * @param paramValue
     *            The parameter value.
     */
    private static void addParameterIfNotNull(Request<?> request, String paramName,
                                              Integer paramValue) {
        if (paramValue != null) {
            addParameterIfNotNull(request, paramName, paramValue.toString());
        }
    }

    /**
     * Adds the specified parameter to the specified request, if the parameter
     * value is not null.
     *
     * @param request
     *            The request to add the parameter to.
     * @param paramName
     *            The parameter name.
     * @param paramValue
     *            The parameter value.
     */
    private static void addParameterIfNotNull(Request<?> request, String paramName,
                                              String paramValue) {
        if (paramValue != null) {
            request.addParameter(paramName, paramValue);
        }
    }

    /**
     * <p>
     * Adds the specified date header in RFC 822 date format to the specified
     * request. This method will not add a date header if the specified date
     * value is <code>null</code>.
     * </p>
     *
     * @param request The request to add the header to.
     * @param header The header name.
     * @param value The header value.
     */
    private static void addDateHeader(Request<?> request, String header, Date value) {
        if (value != null) {
            request.addHeader(header, ServiceUtils.formatRfc822Date(value));
        }
    }

    /**
     * <p>
     * Adds the specified string list header, joined together separated with
     * commas, to the specified request. This method will not add a string list
     * header if the specified values are <code>null</code> or empty.
     * </p>
     *
     * @param request The request to add the header to.
     * @param header The header name.
     * @param values The list of strings to join together for the header value.
     */
    private static void addStringListHeader(Request<?> request, String header, List<String> values) {
        if (values != null && !values.isEmpty()) {
            request.addHeader(header, ServiceUtils.join(values));
        }
    }

    /**
     * <p>
     * Adds response headers parameters to the request given, if non-null.
     * </p>
     *
     * @param request The request to add the response header parameters to.
     * @param responseHeaders The full set of response headers to add, or null
     *            for none.
     */
    private static void addResponseHeaderParameters(Request<?> request,
                                                    ResponseHeaderOverrides responseHeaders) {
        if (responseHeaders != null) {
            if (responseHeaders.getCacheControl() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CACHE_CONTROL,
                        responseHeaders.getCacheControl());
            }
            if (responseHeaders.getContentDisposition() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION,
                        responseHeaders.getContentDisposition());
            }
            if (responseHeaders.getContentEncoding() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_ENCODING,
                        responseHeaders.getContentEncoding());
            }
            if (responseHeaders.getContentLanguage() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_LANGUAGE,
                        responseHeaders.getContentLanguage());
            }
            if (responseHeaders.getContentType() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE,
                        responseHeaders.getContentType());
            }
            if (responseHeaders.getExpires() != null) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_EXPIRES,
                        responseHeaders.getExpires());
            }
        }
    }

    /**
     * Returns the URL to the key in the bucket given, using the client's scheme
     * and endpoint. Returns null if the given bucket and key cannot be
     * converted to a URL.
     */
    public String getResourceUrl(String bucketName, String key) {
        try {
            return getUrl(bucketName, key).toString();
        } catch (final Exception e) {
            return null;
        }
    }

    /**
     * Returns an URL for the object stored in the specified bucket and key.
     * <p>
     * If the object identified by the given bucket and key has public read
     * permissions (ex: {@link CannedAccessControlList#PublicRead}), then this
     * URL can be directly accessed to retrieve the object's data.
     *
     * @param bucketName The name of the bucket containing the object whose URL
     *            is being requested.
     * @param key The key under which the object whose URL is being requested is
     *            stored.
     * @return A unique URL for the object stored in the specified bucket and
     *         key.
     */
    @Override
    public URL getUrl(String bucketName, String key) {
        final Request<?> request = new DefaultRequest<Object>(Constants.S3_SERVICE_DISPLAY_NAME);
        resolveRequestEndpoint(request, bucketName, key);
        return ServiceUtils.convertRequestToUrl(request);
    }

    @Override
    public Region getRegion() {
        final String authority = super.endpoint.getAuthority();
        if (Constants.S3_HOSTNAME.equals(authority)) {
            return Region.US_Standard;
        }
        final Matcher m = Region.S3_REGIONAL_ENDPOINT_PATTERN.matcher(authority);
        if (m.matches()) {
            return Region.fromValue(m.group(1));
        } else {
            throw new IllegalStateException("S3 client with invalid S3 endpoint configured");
        }
    }

    /**
     * Creates and initializes a new request object for the specified S3
     * resource. This method is responsible for determining the right way to
     * address resources. For example, bucket names that are not DNS addressable
     * cannot be addressed in V2, virtual host, style, and instead must use V1,
     * path style. The returned request object has the service name, endpoint
     * and resource path correctly populated. Callers can take the request, add
     * any additional headers or parameters, then sign and execute the request.
     *
     * @param bucketName An optional parameter indicating the name of the bucket
     *            containing the resource involved in the request.
     * @param key An optional parameter indicating the key under which the
     *            desired resource is stored in the specified bucket.
     * @param originalRequest The original request, as created by the user.
     * @param httpMethod The HTTP method to use when sending the request.
     * @return A new request object, populated with endpoint, resource path, and
     *         service name, ready for callers to populate any additional
     *         headers or parameters, and execute.
     */
    protected <X extends AmazonWebServiceRequest> Request<X> createRequest(String bucketName,
                                                                           String key, X originalRequest, HttpMethodName httpMethod) {
        return createRequest(bucketName, key, originalRequest, httpMethod, null);
    }

    protected <X extends AmazonWebServiceRequest> Request<X> createRequest(String bucketName,
                                                                           String key, X originalRequest, HttpMethodName httpMethod, URI endpoint) {
        final Request<X> request = new DefaultRequest<X>(originalRequest,
                Constants.S3_SERVICE_DISPLAY_NAME);
        // If the underlying AmazonS3Client has enabled accelerate mode and the
        // original request operation is accelerate mode supported, then the request
        // will use the s3-accelerate endpoint to performs the operations.
        if (clientOptions.isAccelerateModeEnabled()
                && !(request.getOriginalRequest() instanceof S3AccelerateUnsupported)) {
            if (clientOptions.isDualstackEnabled()) {
                endpoint = RuntimeHttpUtils.toUri(Constants.S3_ACCELERATE_DUALSTACK_HOSTNAME,
                        clientConfiguration);
            } else {
                endpoint = RuntimeHttpUtils.toUri(Constants.S3_ACCELERATE_HOSTNAME,
                        clientConfiguration);
            }
        }

        request.setHttpMethod(httpMethod);
        resolveRequestEndpoint(request, bucketName, key, endpoint);
        return request;
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                            Unmarshaller<X, InputStream> unmarshaller,
                                                            String bucketName,
                                                            String key) {
        return invoke(request, new S3XmlResponseHandler<X>(unmarshaller), bucketName, key);
    }

    @Override
    protected final ExecutionContext createExecutionContext(AmazonWebServiceRequest req) {
        final boolean isMetricsEnabled = isRequestMetricsEnabled(req) || isProfilingEnabled();
        return new S3ExecutionContext(requestHandler2s, isMetricsEnabled, this);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                            String bucket, String key) {
        final AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        final ExecutionContext executionContext = createExecutionContext(originalRequest);
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        // Binds the request metrics to the current request.
        request.setAWSRequestMetrics(awsRequestMetrics);
        // Having the ClientExecuteTime defined here is not ideal (for the
        // timing measurement should start as close to the top of the call
        // stack of the service client method as possible)
        // but definitely a safe compromise for S3 at least for now.
        // We can incrementally make it more elaborate should the need arise
        // for individual method.
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Response<X> response = null;
        try {
            request.setTimeOffset(timeOffset);
            /*
             * The string we sign needs to include the exact headers that we
             * send with the request, but the client runtime layer adds the
             * Content-Type header before the request is sent if one isn't set,
             * so we have to set something here otherwise the request will fail.
             */
            if (!request.getHeaders().containsKey(Headers.CONTENT_TYPE)) {
                request.addHeader(Headers.CONTENT_TYPE,
                        "application/octet-stream");
            }

            // Update the bucketRegionCache if we can't find region for the
            // request
            if (bucket != null
                    && !(request.getOriginalRequest() instanceof CreateBucketRequest)
                    && noExplicitRegionProvided(request)) {
                fetchRegionFromCache(bucket);
            }

            AWSCredentials credentials = awsCredentialsProvider.getCredentials();
            if (originalRequest.getRequestCredentials() != null) {
                credentials = originalRequest.getRequestCredentials();
            }
            executionContext.setSigner(createSigner(request, bucket, key));
            executionContext.setCredentials(credentials);
            response = client.execute(request, responseHandler,
                    errorResponseHandler, executionContext);
            return response.getAwsResponse();
        }catch(final AmazonS3Exception ase){
            /**
             * This is to handle the edge case: when the bucket is deleted and recreated in a different region,
             * the cache still has the old region info.
             * If region is not specified, the first request to this newly created bucket will fail because it used
             * the outdated region present in cache. Here we update the cache with correct region. The subsequent
             * requests will succeed.
             * The recommended practice for any request is to provide region info always.
             */
            if (ase.getStatusCode() == 301) {
                if (ase.getAdditionalDetails() != null) {
                    final String region = ase.getAdditionalDetails().get(Headers.S3_BUCKET_REGION);
                    bucketRegionCache.put(bucket, region);
                    ase.setErrorMessage("The bucket is in this region: " + region +
                            ". Please use this region to retry the request");
                }
            }
            throw ase;
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#enableRequesterPays(java.lang.String)
     */
    @Override
    public void enableRequesterPays(String bucketName) {
        final RequestPaymentConfiguration configuration = new RequestPaymentConfiguration(
                Payer.Requester);

        setBucketRequestPayment(new SetRequestPaymentConfigurationRequest(
                bucketName, configuration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#disableRequesterPays(java.lang.String)
     */
    @Override
    public void disableRequesterPays(String bucketName) {
        final RequestPaymentConfiguration configuration = new RequestPaymentConfiguration(
                Payer.BucketOwner);

        setBucketRequestPayment(new SetRequestPaymentConfigurationRequest(
                bucketName, configuration));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.AmazonS3#isRequesterPaysEnabled(java.lang.String
     * )
     */
    @Override
    public boolean isRequesterPaysEnabled(String bucketName) {
        final RequestPaymentConfiguration configuration = getBucketRequestPayment(new GetRequestPaymentConfigurationRequest(
                bucketName));
        return (configuration.getPayer() == Payer.Requester);
    }

    /**
     * Sets the request payment configuration for a given Amazon S3 bucket. This
     * operation can be done only by the owner of the Amazon S3 bucket.
     * <p>
     * When the request payment configuration for a Amazon S3 bucket is set to
     * <code>Requester</code>, the requester instead of the bucket owner pays
     * the cost of the request and the data download from the bucket. The bucket
     * owner always pays the cost of storing data.
     */
    private void setBucketRequestPayment(
            SetRequestPaymentConfigurationRequest setRequestPaymentConfigurationRequest) {

        final String bucketName = setRequestPaymentConfigurationRequest
                .getBucketName();
        final RequestPaymentConfiguration configuration = setRequestPaymentConfigurationRequest
                .getConfiguration();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified while setting the Requester Pays.");

        assertParameterNotNull(
                configuration,
                "The request payment configuration parameter must be specified when setting the Requester Pays.");

        final Request<SetRequestPaymentConfigurationRequest> request = createRequest(
                bucketName, null, setRequestPaymentConfigurationRequest,
                HttpMethodName.PUT);
        request.addParameter("requestPayment", null);
        request.addHeader("Content-Type", "application/xml");

        final byte[] bytes = requestPaymentConfigurationXmlFactory
                .convertToXmlByteArray(configuration);
        request.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bytes.length));
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /**
     * Retrieves the request payment configuration for a given Amazon S3 bucket.
     * <p>
     * When the request payment configuration for a Amazon S3 bucket is
     * <code>Requester</code>, the requester instead of the bucket owner pays
     * the cost of the request and the data download from the bucket. The bucket
     * owner always pays the cost of storing data.
     */
    private RequestPaymentConfiguration getBucketRequestPayment(
            GetRequestPaymentConfigurationRequest getRequestPaymentConfigurationRequest) {

        final String bucketName = getRequestPaymentConfigurationRequest
                .getBucketName();

        assertParameterNotNull(
                bucketName,
                "The bucket name parameter must be specified while getting the Request Payment Configuration.");

        final Request<GetRequestPaymentConfigurationRequest> request = createRequest(
                bucketName, null, getRequestPaymentConfigurationRequest,
                HttpMethodName.GET);
        request.addParameter("requestPayment", null);
        request.addHeader("Content-Type", "application/xml");

        return invoke(request,
                new Unmarshallers.RequestPaymentConfigurationUnmarshaller(),
                bucketName, null);

    }

    private void setZeroContentLength(Request<?> req) {
        // https://github.com/aws/aws-sdk-java/pull/215
        // http://aws.amazon.com/articles/1109#14
        req.addHeader(Headers.CONTENT_LENGTH, String.valueOf(0));
    }

    /**
     * The input stream doesn't support mark, and the content length is unknown.
     * So we buffer the content of the input stream up to 256k. If it exceeds
     * the buffer size, an AmazonClientException will be thrown.
     *
     * @param is input stream
     * @return a byte array input stream
     */
    private ByteArrayInputStream toByteArray(InputStream is) {
        // 256k buffer
        final int size = 1024 * 256;
        final byte[] buf = new byte[size];
        int len = 0;
        try {
            int available = size;
            int read;
            while (available > 0 && (read = is.read(buf, len, available)) != -1) {
                len += read;
                available -= read;
            }
            if (is.read() != -1) {
                throw new AmazonClientException("Input stream exceeds 256k buffer.");
            }
            is.close();
        } catch (final IOException ioe) {
            throw new AmazonClientException("Failed to read from inputstream", ioe);
        }
        return new ByteArrayInputStream(buf, 0, len);
    }

    @Override
    public void setBucketReplicationConfiguration(String bucketName,
                                                  BucketReplicationConfiguration configuration)
            throws AmazonServiceException, AmazonClientException {
        setBucketReplicationConfiguration(new SetBucketReplicationConfigurationRequest(
                bucketName, configuration));
    }

    @Override
    public void setBucketReplicationConfiguration(
            SetBucketReplicationConfigurationRequest setBucketReplicationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(setBucketReplicationConfigurationRequest,
                "The set bucket replication configuration request object must be specified.");

        final String bucketName = setBucketReplicationConfigurationRequest
                .getBucketName();

        final BucketReplicationConfiguration bucketReplicationConfiguration = setBucketReplicationConfigurationRequest
                .getReplicationConfiguration();

        assertParameterNotNull(
                bucketName,
                "The bucket name parameter must be specified when setting replication configuration.");
        assertParameterNotNull(
                bucketReplicationConfiguration,
                "The replication configuration parameter must be specified when setting replication configuration.");

        final Request<SetBucketReplicationConfigurationRequest> request = createRequest(
                bucketName, null, setBucketReplicationConfigurationRequest,
                HttpMethodName.PUT);
        request.addParameter("replication", null);

        final byte[] bytes = bucketConfigurationXmlFactory
                .convertToXmlByteArray(bucketReplicationConfiguration);

        request.addHeader("Content-Length", String.valueOf(bytes.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(bytes));

        try {
            request.addHeader("Content-MD5",
                    BinaryUtils.toBase64(Md5Utils.computeMD5Hash(bytes)));
        } catch (final Exception e) {
            throw new AmazonClientException(
                    "Not able to compute MD5 of the replication rule configuration. Exception Message : "
                            + e.getMessage(),
                    e);
        }
        invoke(request, voidResponseHandler, bucketName, null);
    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(
            String bucketName) throws AmazonServiceException,
            AmazonClientException {
        return getBucketReplicationConfiguration(
                new GetBucketReplicationConfigurationRequest(bucketName));
    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(
            GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest)
            throws AmazonServiceException,
            AmazonClientException {
        assertParameterNotNull(
                getBucketReplicationConfigurationRequest,
                "The bucket request parameter must be specified when retrieving replication configuration");
        final String bucketName = getBucketReplicationConfigurationRequest.getBucketName();
        assertParameterNotNull(
                bucketName,
                "The bucket request must specify a bucket name when retrieving replication configuration");

        final Request<GetBucketReplicationConfigurationRequest> request = createRequest(bucketName, null,
                getBucketReplicationConfigurationRequest, HttpMethodName.GET);
        request.addParameter("replication", null);

        return invoke(request,
                new Unmarshallers.BucketReplicationConfigurationUnmarshaller(),
                bucketName, null);
    }

    @Override
    public void deleteBucketReplicationConfiguration(String bucketName)
            throws AmazonServiceException, AmazonClientException {
        deleteBucketReplicationConfiguration(
                new DeleteBucketReplicationConfigurationRequest(bucketName));
    }

    @Override
    public void deleteBucketReplicationConfiguration(
            DeleteBucketReplicationConfigurationRequest deleteBucketReplicationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        final String bucketName = deleteBucketReplicationConfigurationRequest.getBucketName();
        assertParameterNotNull(
                bucketName,
                "The bucket name parameter must be specified when deleting replication configuration");

        final Request<DeleteBucketReplicationConfigurationRequest> request = createRequest(bucketName,
                null,
                deleteBucketReplicationConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("replication", null);

        invoke(request, voidResponseHandler, bucketName, null);
    }

    @Override
    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return deleteBucketMetricsConfiguration(new DeleteBucketMetricsConfigurationRequest(bucketName, id));
    }

    @Override
    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(
            DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(deleteBucketMetricsConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(deleteBucketMetricsConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(deleteBucketMetricsConfigurationRequest.getId(), "Metrics Id");

        final Request<DeleteBucketMetricsConfigurationRequest> request =
                createRequest(bucketName, null, deleteBucketMetricsConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("metrics", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.DeleteBucketMetricsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return getBucketMetricsConfiguration(new GetBucketMetricsConfigurationRequest(bucketName, id));
    }

    @Override
    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(
            GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(getBucketMetricsConfigurationRequest, "The request cannot be null");
        final String bucketName = assertStringNotEmpty(getBucketMetricsConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(getBucketMetricsConfigurationRequest.getId(), "Metrics Id");

        final Request<GetBucketMetricsConfigurationRequest> request =
                createRequest(bucketName, null, getBucketMetricsConfigurationRequest, HttpMethodName.GET);
        request.addParameter("metrics", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.GetBucketMetricsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(
            String bucketName, MetricsConfiguration metricsConfiguration)
            throws AmazonServiceException, AmazonClientException {
        return setBucketMetricsConfiguration(new SetBucketMetricsConfigurationRequest(bucketName, metricsConfiguration));
    }

    @Override
    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(
            SetBucketMetricsConfigurationRequest setBucketMetricsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        new SetBucketMetricsConfigurationRequest();
        assertParameterNotNull(setBucketMetricsConfigurationRequest, "The request cannot be null");
        final String bucketName = assertStringNotEmpty(setBucketMetricsConfigurationRequest.getBucketName(), "BucketName");
        final MetricsConfiguration metricsConfiguration = assertNotNull(
                setBucketMetricsConfigurationRequest.getMetricsConfiguration(), "Metrics Configuration");
        final String id = assertNotNull(metricsConfiguration.getId(), "Metrics Id");

        final Request<SetBucketMetricsConfigurationRequest> request =
                createRequest(bucketName, null, setBucketMetricsConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("metrics", null);
        request.addParameter("id", id);

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(metricsConfiguration);
        request.addHeader("Content-Length", String.valueOf(bytes.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(bytes));

        return invoke(request, new Unmarshallers.SetBucketMetricsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public ListBucketMetricsConfigurationsResult listBucketMetricsConfigurations(
            ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(listBucketMetricsConfigurationsRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(listBucketMetricsConfigurationsRequest.getBucketName(), "BucketName");

        final Request<ListBucketMetricsConfigurationsRequest> request =
                createRequest(bucketName, null, listBucketMetricsConfigurationsRequest, HttpMethodName.GET);
        request.addParameter("metrics", null);
        addParameterIfNotNull(request, "continuation-token", listBucketMetricsConfigurationsRequest.getContinuationToken());

        return invoke(request, new Unmarshallers.ListBucketMetricsConfigurationsUnmarshaller(), bucketName, null);
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return deleteBucketAnalyticsConfiguration(new DeleteBucketAnalyticsConfigurationRequest(bucketName, id));
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(
            DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(deleteBucketAnalyticsConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(
                deleteBucketAnalyticsConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(
                deleteBucketAnalyticsConfigurationRequest.getId(), "Analytics Id");

        final Request<DeleteBucketAnalyticsConfigurationRequest> request =
                createRequest(bucketName, null, deleteBucketAnalyticsConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("analytics", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.DeleteBucketAnalyticsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return getBucketAnalyticsConfiguration(new GetBucketAnalyticsConfigurationRequest(bucketName, id));
    }

    @Override
    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(
            GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(getBucketAnalyticsConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(
                getBucketAnalyticsConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(
                getBucketAnalyticsConfigurationRequest.getId(), "Analytics Id");

        final Request<GetBucketAnalyticsConfigurationRequest> request =
                createRequest(bucketName, null, getBucketAnalyticsConfigurationRequest, HttpMethodName.GET);
        request.addParameter("analytics", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.GetBucketAnalyticsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(
            String bucketName, AnalyticsConfiguration analyticsConfiguration)
            throws AmazonServiceException, AmazonClientException {
        return setBucketAnalyticsConfiguration(
                new SetBucketAnalyticsConfigurationRequest(bucketName, analyticsConfiguration));
    }

    @Override
    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(
            SetBucketAnalyticsConfigurationRequest setBucketAnalyticsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(setBucketAnalyticsConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(
                setBucketAnalyticsConfigurationRequest.getBucketName(), "BucketName");
        final AnalyticsConfiguration analyticsConfiguration = assertNotNull(
                setBucketAnalyticsConfigurationRequest.getAnalyticsConfiguration(), "Analytics Configuration");
        final String id = assertNotNull(analyticsConfiguration.getId(), "Analytics Id");

        final Request<SetBucketAnalyticsConfigurationRequest> request =
                createRequest(bucketName, null, setBucketAnalyticsConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("analytics", null);
        request.addParameter("id", id);

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(analyticsConfiguration);
        request.addHeader("Content-Length", String.valueOf(bytes.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(bytes));

        return invoke(request, new Unmarshallers.SetBucketAnalyticsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurations(
            ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {

        assertParameterNotNull(listBucketAnalyticsConfigurationsRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(
                listBucketAnalyticsConfigurationsRequest.getBucketName(), "BucketName");

        final Request<ListBucketAnalyticsConfigurationsRequest> request =
                createRequest(bucketName, null, listBucketAnalyticsConfigurationsRequest, HttpMethodName.GET);
        request.addParameter("analytics", null);
        addParameterIfNotNull(request, "continuation-token", listBucketAnalyticsConfigurationsRequest.getContinuationToken());

        return invoke(request, new Unmarshallers.ListBucketAnalyticsConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return deleteBucketInventoryConfiguration(
                new DeleteBucketInventoryConfigurationRequest(bucketName, id));
    }

    @Override
    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(
            DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(deleteBucketInventoryConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(deleteBucketInventoryConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(deleteBucketInventoryConfigurationRequest.getId(), "Inventory id");

        final Request<DeleteBucketInventoryConfigurationRequest> request = createRequest(bucketName, null, deleteBucketInventoryConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("inventory", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.DeleteBucketInventoryConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(
            String bucketName, String id) throws AmazonServiceException, AmazonClientException {
        return getBucketInventoryConfiguration(
                new GetBucketInventoryConfigurationRequest(bucketName, id));
    }

    @Override
    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(
            GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(getBucketInventoryConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(getBucketInventoryConfigurationRequest.getBucketName(), "BucketName");
        final String id = assertStringNotEmpty(getBucketInventoryConfigurationRequest.getId(), "Inventory id");

        final Request<GetBucketInventoryConfigurationRequest> request = createRequest(bucketName, null, getBucketInventoryConfigurationRequest, HttpMethodName.GET);
        request.addParameter("inventory", null);
        request.addParameter("id", id);

        return invoke(request, new Unmarshallers.GetBucketInventoryConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(
            String bucketName, InventoryConfiguration inventoryConfiguration)
            throws AmazonServiceException, AmazonClientException {
        return setBucketInventoryConfiguration(
                new SetBucketInventoryConfigurationRequest(bucketName, inventoryConfiguration));
    }

    @Override
    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(
            SetBucketInventoryConfigurationRequest setBucketInventoryConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(setBucketInventoryConfigurationRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(setBucketInventoryConfigurationRequest.getBucketName(), "BucketName");
        final InventoryConfiguration inventoryConfiguration = assertNotNull(setBucketInventoryConfigurationRequest.getInventoryConfiguration(),
                "InventoryConfiguration");
        final String id = assertNotNull(inventoryConfiguration.getId(), "Inventory id");

        final Request<SetBucketInventoryConfigurationRequest> request = createRequest(bucketName, null, setBucketInventoryConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("inventory", null);
        request.addParameter("id", id);

        final byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(inventoryConfiguration);
        request.addHeader("Content-Length", String.valueOf(bytes.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(bytes));

        return invoke(request, new Unmarshallers.SetBucketInventoryConfigurationUnmarshaller(), bucketName, null);
    }

    @Override
    public ListBucketInventoryConfigurationsResult listBucketInventoryConfigurations(ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(listBucketInventoryConfigurationsRequest,
                "The request cannot be null");
        final String bucketName = assertStringNotEmpty(listBucketInventoryConfigurationsRequest.getBucketName(), "BucketName");

        final Request<ListBucketInventoryConfigurationsRequest> request = createRequest(bucketName, null, listBucketInventoryConfigurationsRequest, HttpMethodName.GET);
        request.addParameter("inventory", null);
        addParameterIfNotNull(request, "continuation-token", listBucketInventoryConfigurationsRequest.getContinuationToken());

        return invoke(request, new Unmarshallers.ListBucketInventoryConfigurationsUnmarshaller(), bucketName, null);
    }

    private String urlEncodeTags(ObjectTagging tagging) {
        if (tagging == null || tagging.getTagSet() == null)
            return null;

        StringBuilder sb = new StringBuilder();

        Iterator<Tag> tagIter = tagging.getTagSet().iterator();
        while (tagIter.hasNext()) {
            Tag tag = tagIter.next();
            sb.append(S3HttpUtils.urlEncode(tag.getKey(), false)).append('=')
                    .append(S3HttpUtils.urlEncode(tag.getValue(), false));
            if (tagIter.hasNext()) {
                sb.append("&");
            }
        }

        return sb.toString();
    }

    private void setContent(Request<?> request, byte[] content, String contentType, boolean setMd5) {
        request.setContent(new ByteArrayInputStream(content));
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.addHeader("Content-Type", contentType);
        if (setMd5) {
            try {
                final byte[] md5 = Md5Utils.computeMD5Hash(content);
                final String md5Base64 = BinaryUtils.toBase64(md5);
                request.addHeader("Content-MD5", md5Base64);
            } catch ( final Exception e ) {
                throw new AmazonClientException("Couldn't compute md5 sum", e);
            }
        }
    }


    /**
     * <p>
     * Populate the specified request with {@link Constants#REQUESTER_PAYS} to
     * header {@link Headers#REQUESTER_PAYS_HEADER}, if isRequesterPays is true.
     * </p>
     *
     * @param request The specified request to populate.
     * @param isRequesterPays The flag whether to populate the header or not.
     */
    protected static void populateRequesterPaysHeader(Request<?> request, boolean isRequesterPays) {
        if (isRequesterPays) {
            request.addHeader(Headers.REQUESTER_PAYS_HEADER, Constants.REQUESTER_PAYS);
        }
    }

    @Override
    public String getObjectAsString(String bucketName, String key)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(bucketName, "Bucket name must be provided");
        assertParameterNotNull(key, "Object key must be provided");

        final S3Object object = getObject(bucketName, key);
        try {
            return IOUtils.toString(object.getObjectContent());
        } catch (final IOException e) {
            throw new AmazonClientException("Error streaming content from S3 during download");
        }
    }

    @Override
    public GetObjectTaggingResult getObjectTagging(
            GetObjectTaggingRequest getObjectTaggingRequest) {
        assertParameterNotNull(getObjectTaggingRequest,
                "The request parameter must be specified when getting the object tags");
        final String bucketName = assertStringNotEmpty(getObjectTaggingRequest.getBucketName(),
                "BucketName");
        final String key = assertNotNull(getObjectTaggingRequest.getKey(), "Key");

        final Request<GetObjectTaggingRequest> request = createRequest(bucketName, key,
                getObjectTaggingRequest, HttpMethodName.GET);
        request.addParameter("tagging", null);
        addParameterIfNotNull(request, "versionId", getObjectTaggingRequest.getVersionId());

        final ResponseHeaderHandlerChain<GetObjectTaggingResult> handlerChain = new ResponseHeaderHandlerChain<GetObjectTaggingResult>(
                new Unmarshallers.GetObjectTaggingResponseUnmarshaller(),
                new GetObjectTaggingResponseHeaderHandler());

        return invoke(request, handlerChain, bucketName, key);
    }

    @Override
    public SetObjectTaggingResult setObjectTagging(
            SetObjectTaggingRequest setObjectTaggingRequest) {
        assertParameterNotNull(setObjectTaggingRequest,
                "The request parameter must be specified setting the object tags");
        final String bucketName = assertStringNotEmpty(setObjectTaggingRequest.getBucketName(),
                "BucketName");
        final String key = assertNotNull(setObjectTaggingRequest.getKey(), "Key");
        final ObjectTagging tagging = assertNotNull(setObjectTaggingRequest.getTagging(),
                "ObjectTagging");

        final Request<SetObjectTaggingRequest> request = createRequest(bucketName, key,
                setObjectTaggingRequest, HttpMethodName.PUT);
        request.addParameter("tagging", null);
        addParameterIfNotNull(request, "versionId", setObjectTaggingRequest.getVersionId());
        final byte[] content = new ObjectTaggingXmlFactory().convertToXmlByteArray(tagging);
        setContent(request, content, "application/xml", true);

        final ResponseHeaderHandlerChain<SetObjectTaggingResult> handlerChain = new ResponseHeaderHandlerChain<SetObjectTaggingResult>(
                new Unmarshallers.SetObjectTaggingResponseUnmarshaller(),
                new SetObjectTaggingResponseHeaderHandler());

        return invoke(request, handlerChain, bucketName, key);
    }

    @Override
    public DeleteObjectTaggingResult deleteObjectTagging(
            DeleteObjectTaggingRequest deleteObjectTaggingRequest) {
        assertParameterNotNull(deleteObjectTaggingRequest,
                "The request parameter must be specified when delete the object tags");
        final String bucketName = assertStringNotEmpty(deleteObjectTaggingRequest.getBucketName(),
                "BucketName");
        final String key = assertStringNotEmpty(deleteObjectTaggingRequest.getKey(), "Key");

        final Request<DeleteObjectTaggingRequest> request = createRequest(bucketName, key,
                deleteObjectTaggingRequest, HttpMethodName.DELETE);
        request.addParameter("tagging", null);
        addParameterIfNotNull(request, "versionId", deleteObjectTaggingRequest.getVersionId());

        final ResponseHeaderHandlerChain<DeleteObjectTaggingResult> handlerChain = new ResponseHeaderHandlerChain<DeleteObjectTaggingResult>(
                new Unmarshallers.DeleteObjectTaggingResponseUnmarshaller(),
                new DeleteObjectTaggingHeaderHandler());

        return invoke(request, handlerChain, bucketName, key);
    }

    @Override
    public PutObjectResult putObject(String bucketName, String key, String content)
            throws AmazonServiceException, AmazonClientException {
        assertParameterNotNull(bucketName, "Bucket name must be provided");
        assertParameterNotNull(key, "Object key must be provided");
        assertParameterNotNull(content, "String content must be provided");

        final byte[] contentBytes = content.getBytes(StringUtils.UTF8);

        final InputStream is = new ByteArrayInputStream(contentBytes);
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType("text/plain");
        metadata.setContentLength(contentBytes.length);

        return putObject(new PutObjectRequest(bucketName, key, is, metadata));
    }

    @Override
    public String getRegionName() {
        final String authority = super.endpoint.getAuthority();
        if(Constants.S3_HOSTNAME.equals(authority)) {
            return "us-east-1";
        }
        final Matcher m = Region.S3_REGIONAL_ENDPOINT_PATTERN.matcher(authority);
        try {
            m.matches();
            return RegionUtils.getRegion(m.group(1)).getName();
        } catch (final Exception e) {
            throw new IllegalStateException("No valid region has been specified. Unable to return region name", e);
        }
    }

    /**
     * Fetches the region of the bucket from the cache maintained. If the cache
     * doesn't have an entry, fetches the region from Amazon S3 and updates the
     * cache.
     */
    private String fetchRegionFromCache(String bucketName) {
        String bucketRegion = bucketRegionCache.get(bucketName);
        if (bucketRegion == null) {
            if (log.isDebugEnabled()) {
                log.debug("Bucket region cache doesn't have an entry for " + bucketName
                        + ". Trying to get bucket region from Amazon S3.");
            }
            bucketRegion = getBucketRegionViaHeadRequest(bucketName);
            if (bucketRegion != null) {
                bucketRegionCache.put(bucketName, bucketRegion);
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("Region for " + bucketName + " is " + bucketRegion);
        }
        return bucketRegion;
    }

    /**
     * Retrieves the region of the bucket by making a HeadBucket request to
     * us-west-1 region. Currently S3 doesn't return region in a HEAD Bucket
     * request if the bucket owner has enabled bucket to accept only SigV4
     * requests via bucket policies.
     */
    private String getBucketRegionViaHeadRequest(String bucketName) {
        String bucketRegion = null;

        try {
            final String endpoint = "https://s3-us-west-1.amazonaws.com";
            final Request<HeadBucketRequest> request = createRequest(bucketName, null,
                    new HeadBucketRequest(bucketName), HttpMethodName.HEAD, new URI(endpoint));

            final HeadBucketResult result = invoke(request, new HeadBucketResultHandler(),
                    bucketName, null);
            bucketRegion = result.getBucketRegion();
        } catch (final AmazonS3Exception exception) {
            if (exception.getAdditionalDetails() != null) {
                bucketRegion = exception.getAdditionalDetails().get(
                        Headers.S3_BUCKET_REGION);
            }
        } catch (final URISyntaxException e) {
            log.warn("Error while creating URI");
        }

        if (bucketRegion == null && log.isDebugEnabled()) {
            log.debug("Not able to derive region of the " + bucketName
                    + " from the HEAD Bucket requests.");
        }

        return bucketRegion;
    }

    /**
     * Set the request's endpoint and resource path with the new region provided
     *
     * From versions 2.4.+ until 2.10.+, AmazonS3Client adds an additional layer of URL Encoding for
     * the key names. This resulted in the key name being double encoded because the Core Runtime
     * (UrlHttpClient) encodes the Http Url which contains the key name. Starting 2.11.0, AmazonS3Client
     * does not do the extra encoding for the key name and just uses te key name that is passed in.
     *
     * @param request Request to set endpoint for
     * @param bucketName the name of the bucket
     * @param key key that identifies the object
     */
    public void resolveRequestEndpoint(Request<?> request,
                                       String bucketName,
                                       String key) {
        resolveRequestEndpoint(request, bucketName, key, null);
    }

    /**
     * Set the request's endpoint and resource path with the new region provided.
     *
     * From versions 2.4.+ until 2.10.+, AmazonS3Client adds an additional layer of URL Encoding for
     * the key names. This resulted in the key name being double encoded because the Core Runtime
     * (UrlHttpClient) encodes the Http Url which contains the key name. Starting 2.11.0, AmazonS3Client
     * does not do the extra encoding for the key name and just uses te key name that is passed in.
     *
     * @param request Request to set endpoint for
     * @param bucketName the name of the bucket
     * @param key key that identifies the object
     * @param endpoint the endpoint URI
     */
    public void resolveRequestEndpoint(Request<?> request,
                                       String bucketName,
                                       String key,
                                       URI endpoint) {
        final URI ep = endpoint == null ? this.endpoint : endpoint;
        if (shouldUseVirtualAddressing(ep, bucketName)) {
            request.setEndpoint(convertToVirtualHostEndpoint(ep, bucketName));
            request.setResourcePath(getHostStyleResourcePath(key));
        } else {
            request.setEndpoint(ep);
            if (bucketName != null) {
                request.setResourcePath(getPathStyleResourcePath(bucketName, key));
            }
        }
        log.info("Key: " + key + "; Request: " + request);
    }

    private boolean shouldUseVirtualAddressing(final URI endpoint, final String bucketName) {
        return !clientOptions.isPathStyleAccess() && BucketNameUtils.isDNSBucketName(bucketName)
                && !isValidIpV4Address(endpoint.getHost());
    }

    private String getHostStyleResourcePath(String key) {
        String resourcePath = key;
        /*
         * If the key name starts with a slash character, in order to prevent it
         * being treated as a path delimiter, we need to add another slash
         * before the key name. {@see
         * com.amazonaws.http.HttpRequestFactory#createHttpRequest}
         */
        if (key != null && key.startsWith("/")) {
            resourcePath = "/" + key;
        }
        return resourcePath;
    }

    private String getPathStyleResourcePath(String bucketName, String key) {
        return bucketName + "/" + (key != null ? key : "");
    }

    static boolean isValidIpV4Address(String ipAddr) {
        if (ipAddr == null) {
            return false;
        }
        final String[] tokens = ipAddr.split("\\.");
        if (tokens.length != 4) {
            return false;
        }
        for (final String token : tokens) {
            try {
                final int tokenInt = Integer.parseInt(token);
                if (tokenInt < 0 || tokenInt > 255) {
                    return false;
                }
            } catch (final NumberFormatException ase) {
                return false;
            }
        }
        return true;
    }

}

