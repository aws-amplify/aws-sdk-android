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

package com.amazonaws.services.cognitoidentity;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing Amazon Cognito Identity <fullname>Amazon
 * Cognito</fullname>
 * <p>
 * Amazon Cognito is a web service that delivers scoped temporary credentials to
 * mobile devices and other untrusted environments. Amazon Cognito uniquely
 * identifies a device and supplies the user with a consistent identity over the
 * lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito, you can enable authentication with one or more
 * third-party identity providers (Facebook, Google, or Login with Amazon), and
 * you can also choose to support unauthenticated access from your app. Cognito
 * delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary,
 * limited-privilege AWS credentials.
 * </p>
 * <p>
 * To provide end-user credentials, first make an unsigned call to <a>GetId</a>.
 * If the end user is authenticated with one of the supported identity
 * providers, set the <code>Logins</code> map with the identity provider token.
 * <code>GetId</code> returns a unique identifier for the user.
 * </p>
 * <p>
 * Next, make an unsigned call to <a>GetCredentialsForIdentity</a>. This call
 * expects the same <code>Logins</code> map as the <code>GetId</code> call, as
 * well as the <code>IdentityID</code> originally returned by <code>GetId</code>
 * . Assuming your identity pool has been configured via the
 * <a>SetIdentityPoolRoles</a> operation, <code>GetCredentialsForIdentity</code>
 * will return AWS credentials for your use. If your pool has not been
 * configured with <code>SetIdentityPoolRoles</code>, or if you want to follow
 * legacy flow, make an unsigned call to <a>GetOpenIdToken</a>, which returns
 * the OpenID token necessary to call STS and retrieve AWS credentials. This
 * call expects the same <code>Logins</code> map as the <code>GetId</code> call,
 * as well as the <code>IdentityID</code> originally returned by
 * <code>GetId</code>. The token returned by <code>GetOpenIdToken</code> can be
 * passed to the STS operation <a href=
 * "http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithWebIdentity.html"
 * >AssumeRoleWithWebIdentity</a> to retrieve AWS credentials.
 * </p>
 * <p>
 * If you want to use Amazon Cognito in an Android, iOS, or Unity application,
 * you will probably want to make API calls via the AWS Mobile SDK. To learn
 * more, see the <a href="http://docs.aws.amazon.com/mobile/index.html">AWS
 * Mobile SDK Developer Guide</a>.
 * </p>
 **/
public interface AmazonCognitoIdentity {

    /**
     * Overrides the default endpoint for this client
     * ("https://cognito-identity.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cognito-identity.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cognito-identity.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "cognito-identity.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://cognito-identity.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCognitoIdentity#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Returns credentials for the provided identity ID. Any provided logins
     * will be validated against supported login providers. If the token is for
     * cognito-identity.amazonaws.com, it will be passed through to AWS Security
     * Token Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest <p>
     *            Input to the <code>GetCredentialsForIdentity</code> action.
     *            </p>
     * @return getCredentialsForIdentityResult The response from the
     *         GetCredentialsForIdentity service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InvalidIdentityPoolConfigurationException
     * @throws InternalErrorException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetCredentialsForIdentityResult getCredentialsForIdentity(
            GetCredentialsForIdentityRequest getCredentialsForIdentityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
     * create an implicit linked account.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getIdRequest <p>
     *            Input to the GetId action.
     *            </p>
     * @return getIdResult The response from the GetId service method, as
     *         returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws LimitExceededException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetIdResult getId(GetIdRequest getIdRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is
     * returned by <a>GetId</a>. You can optionally add additional logins for
     * the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenId token is valid for 15 minutes.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenRequest <p>
     *            Input to the GetOpenIdToken action.
     *            </p>
     * @return getOpenIdTokenResult The response from the GetOpenIdToken service
     *         method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetOpenIdTokenResult getOpenIdToken(GetOpenIdTokenRequest getOpenIdTokenRequest)
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
