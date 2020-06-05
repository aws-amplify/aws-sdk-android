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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudfront.model.*;

/**
 * Interface for accessing Amazon CloudFront <fullname>Amazon
 * CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for
 * developers who need detailed information about CloudFront API actions, data
 * types, and errors. For detailed information about CloudFront features, see
 * the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 **/
public interface AmazonCloudFront {

    /**
     * Overrides the default endpoint for this client
     * ("https://cloudfront.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cloudfront.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cloudfront.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "cloudfront.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://cloudfront.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCloudFront#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

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
    CreateCloudFrontOriginAccessIdentity2019_03_26Result createCloudFrontOriginAccessIdentity2019_03_26(
            CreateCloudFrontOriginAccessIdentity2019_03_26Request createCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateDistribution2019_03_26Result createDistribution2019_03_26(
            CreateDistribution2019_03_26Request createDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateDistributionWithTags2019_03_26Result createDistributionWithTags2019_03_26(
            CreateDistributionWithTags2019_03_26Request createDistributionWithTags2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateFieldLevelEncryptionConfig2019_03_26Result createFieldLevelEncryptionConfig2019_03_26(
            CreateFieldLevelEncryptionConfig2019_03_26Request createFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateFieldLevelEncryptionProfile2019_03_26Result createFieldLevelEncryptionProfile2019_03_26(
            CreateFieldLevelEncryptionProfile2019_03_26Request createFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateInvalidation2019_03_26Result createInvalidation2019_03_26(
            CreateInvalidation2019_03_26Request createInvalidation2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreatePublicKey2019_03_26Result createPublicKey2019_03_26(
            CreatePublicKey2019_03_26Request createPublicKey2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateStreamingDistribution2019_03_26Result createStreamingDistribution2019_03_26(
            CreateStreamingDistribution2019_03_26Request createStreamingDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    CreateStreamingDistributionWithTags2019_03_26Result createStreamingDistributionWithTags2019_03_26(
            CreateStreamingDistributionWithTags2019_03_26Request createStreamingDistributionWithTags2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteCloudFrontOriginAccessIdentity2019_03_26(
            DeleteCloudFrontOriginAccessIdentity2019_03_26Request deleteCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteDistribution2019_03_26(
            DeleteDistribution2019_03_26Request deleteDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteFieldLevelEncryptionConfig2019_03_26(
            DeleteFieldLevelEncryptionConfig2019_03_26Request deleteFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteFieldLevelEncryptionProfile2019_03_26(
            DeleteFieldLevelEncryptionProfile2019_03_26Request deleteFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deletePublicKey2019_03_26(DeletePublicKey2019_03_26Request deletePublicKey2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void deleteStreamingDistribution2019_03_26(
            DeleteStreamingDistribution2019_03_26Request deleteStreamingDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetCloudFrontOriginAccessIdentity2019_03_26Result getCloudFrontOriginAccessIdentity2019_03_26(
            GetCloudFrontOriginAccessIdentity2019_03_26Request getCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetCloudFrontOriginAccessIdentityConfig2019_03_26Result getCloudFrontOriginAccessIdentityConfig2019_03_26(
            GetCloudFrontOriginAccessIdentityConfig2019_03_26Request getCloudFrontOriginAccessIdentityConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetDistribution2019_03_26Result getDistribution2019_03_26(
            GetDistribution2019_03_26Request getDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetDistributionConfig2019_03_26Result getDistributionConfig2019_03_26(
            GetDistributionConfig2019_03_26Request getDistributionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetFieldLevelEncryption2019_03_26Result getFieldLevelEncryption2019_03_26(
            GetFieldLevelEncryption2019_03_26Request getFieldLevelEncryption2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetFieldLevelEncryptionConfig2019_03_26Result getFieldLevelEncryptionConfig2019_03_26(
            GetFieldLevelEncryptionConfig2019_03_26Request getFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetFieldLevelEncryptionProfile2019_03_26Result getFieldLevelEncryptionProfile2019_03_26(
            GetFieldLevelEncryptionProfile2019_03_26Request getFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetFieldLevelEncryptionProfileConfig2019_03_26Result getFieldLevelEncryptionProfileConfig2019_03_26(
            GetFieldLevelEncryptionProfileConfig2019_03_26Request getFieldLevelEncryptionProfileConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetInvalidation2019_03_26Result getInvalidation2019_03_26(
            GetInvalidation2019_03_26Request getInvalidation2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetPublicKey2019_03_26Result getPublicKey2019_03_26(
            GetPublicKey2019_03_26Request getPublicKey2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetPublicKeyConfig2019_03_26Result getPublicKeyConfig2019_03_26(
            GetPublicKeyConfig2019_03_26Request getPublicKeyConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetStreamingDistribution2019_03_26Result getStreamingDistribution2019_03_26(
            GetStreamingDistribution2019_03_26Request getStreamingDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    GetStreamingDistributionConfig2019_03_26Result getStreamingDistributionConfig2019_03_26(
            GetStreamingDistributionConfig2019_03_26Request getStreamingDistributionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListCloudFrontOriginAccessIdentities2019_03_26Result listCloudFrontOriginAccessIdentities2019_03_26(
            ListCloudFrontOriginAccessIdentities2019_03_26Request listCloudFrontOriginAccessIdentities2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListDistributions2019_03_26Result listDistributions2019_03_26(
            ListDistributions2019_03_26Request listDistributions2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListDistributionsByWebACLId2019_03_26Result listDistributionsByWebACLId2019_03_26(
            ListDistributionsByWebACLId2019_03_26Request listDistributionsByWebACLId2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListFieldLevelEncryptionConfigs2019_03_26Result listFieldLevelEncryptionConfigs2019_03_26(
            ListFieldLevelEncryptionConfigs2019_03_26Request listFieldLevelEncryptionConfigs2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListFieldLevelEncryptionProfiles2019_03_26Result listFieldLevelEncryptionProfiles2019_03_26(
            ListFieldLevelEncryptionProfiles2019_03_26Request listFieldLevelEncryptionProfiles2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListInvalidations2019_03_26Result listInvalidations2019_03_26(
            ListInvalidations2019_03_26Request listInvalidations2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListPublicKeys2019_03_26Result listPublicKeys2019_03_26(
            ListPublicKeys2019_03_26Request listPublicKeys2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListStreamingDistributions2019_03_26Result listStreamingDistributions2019_03_26(
            ListStreamingDistributions2019_03_26Request listStreamingDistributions2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    ListTagsForResource2019_03_26Result listTagsForResource2019_03_26(
            ListTagsForResource2019_03_26Request listTagsForResource2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void tagResource2019_03_26(TagResource2019_03_26Request tagResource2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    void untagResource2019_03_26(UntagResource2019_03_26Request untagResource2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateCloudFrontOriginAccessIdentity2019_03_26Result updateCloudFrontOriginAccessIdentity2019_03_26(
            UpdateCloudFrontOriginAccessIdentity2019_03_26Request updateCloudFrontOriginAccessIdentity2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateDistribution2019_03_26Result updateDistribution2019_03_26(
            UpdateDistribution2019_03_26Request updateDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateFieldLevelEncryptionConfig2019_03_26Result updateFieldLevelEncryptionConfig2019_03_26(
            UpdateFieldLevelEncryptionConfig2019_03_26Request updateFieldLevelEncryptionConfig2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateFieldLevelEncryptionProfile2019_03_26Result updateFieldLevelEncryptionProfile2019_03_26(
            UpdateFieldLevelEncryptionProfile2019_03_26Request updateFieldLevelEncryptionProfile2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdatePublicKey2019_03_26Result updatePublicKey2019_03_26(
            UpdatePublicKey2019_03_26Request updatePublicKey2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

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
    UpdateStreamingDistribution2019_03_26Result updateStreamingDistribution2019_03_26(
            UpdateStreamingDistribution2019_03_26Request updateStreamingDistribution2019_03_26Request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
