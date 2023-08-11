/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cognitoidentityprovider.model.*;

/**
 * Interface for accessing Amazon Cognito Your User Pool
 * <p>
 * With the Amazon Cognito user pools API, you can set up user pools and app
 * clients, and authenticate users. To authenticate users from third-party
 * identity providers (IdPs) in this API, you can <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html"
 * >link IdP users to native user profiles</a>. Learn more about the
 * authentication and authorization of federated users in the <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-userpools-server-contract-reference.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>.
 * </p>
 * <p>
 * This API reference provides detailed information about API operations and
 * object types in Amazon Cognito. At the bottom of the page for each API
 * operation and object, under <i>See Also</i>, you can learn how to use it in
 * an Amazon Web Services SDK in the language of your choice.
 * </p>
 * <p>
 * Along with resource management operations, the Amazon Cognito user pools API
 * includes classes of operations and authorization models for client-side and
 * server-side user operations. For more information, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito native and OIDC APIs</a> in the <i>Amazon Cognito
 * Developer Guide</i>.
 * </p>
 * <p>
 * You can also start reading about the <code>CognitoIdentityProvider</code>
 * client in the following SDK guides.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cli/latest/reference/cognito-idp/index.html#cli-aws-cognito-idp"
 * >Amazon Web Services Command Line Interface</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sdkfornet/v3/apidocs/items/CognitoIdentityProvider/TCognitoIdentityProviderClient.html"
 * >Amazon Web Services SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://sdk.amazonaws.com/cpp/api/LATEST/aws-cpp-sdk-cognito-idp/html/class_aws_1_1_cognito_identity_provider_1_1_cognito_identity_provider_client.html"
 * >Amazon Web Services SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sdk-for-go/api/service/cognitoidentityprovider/#CognitoIdentityProvider"
 * >Amazon Web Services SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cognitoidentityprovider/CognitoIdentityProviderClient.html"
 * >Amazon Web Services SDK for Java V2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/CognitoIdentityServiceProvider.html"
 * >Amazon Web Services SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/aws-sdk-php/v3/api/api-cognito-idp-2016-04-18.html"
 * >Amazon Web Services SDK for PHP V3</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/cognito-idp.html"
 * >Amazon Web Services SDK for Python</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sdk-for-ruby/v3/api/Aws/CognitoIdentityProvider/Client.html"
 * >Amazon Web Services SDK for Ruby V3</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get started with an Amazon Web Services SDK, see <a
 * href="http://aws.amazon.com/developer/tools/">Tools to Build on Amazon Web
 * Services</a>. For example actions and scenarios, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/service_code_examples_cognito-identity-provider.html"
 * >Code examples for Amazon Cognito Identity Provider using Amazon Web Services
 * SDKs</a>.
 * </p>
 **/
public interface AmazonCognitoIdentityProvider {

    /**
     * Overrides the default endpoint for this client
     * ("https://cognito-idp.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cognito-idp.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cognito-idp.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "cognito-idp.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://cognito-idp.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AmazonCognitoIdentityProvider#setEndpoint(String)}, sets the
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
     * Adds additional user attributes to the user pool schema.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addCustomAttributesRequest <p>
     *            Represents the request to add custom attributes.
     *            </p>
     * @return addCustomAttributesResult The response from the
     *         AddCustomAttributes service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserImportInProgressException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AddCustomAttributesResult addCustomAttributes(
            AddCustomAttributesRequest addCustomAttributesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminAddUserToGroupRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void adminAddUserToGroup(AdminAddUserToGroupRequest adminAddUserToGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code.
     * Works on any user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminConfirmSignUpRequest <p>
     *            Confirm a user's registration as a user pool administrator.
     *            </p>
     * @return adminConfirmSignUpResult The response from the AdminConfirmSignUp
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new user in the specified user pool.
     * </p>
     * <p>
     * If <code>MessageAction</code> isn't set, the default is to send a welcome
     * message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * This message is based on a template that you configured in your call to
     * create or update a user pool. This template includes your custom sign-up
     * instructions and placeholders for user name and temporary password.
     * </p>
     * <p>
     * Alternatively, you can call <code>AdminCreateUser</code> with
     * <code>SUPPRESS</code> for the <code>MessageAction</code> parameter, and
     * Amazon Cognito won't send any email.
     * </p>
     * <p>
     * In either case, the user will be in the
     * <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminCreateUserRequest <p>
     *            Represents the request to create a user in the specified user
     *            pool.
     *            </p>
     * @return adminCreateUserResult The response from the AdminCreateUser
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UserNotFoundException
     * @throws UsernameExistsException
     * @throws InvalidPasswordException
     * @throws CodeDeliveryFailureException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws PreconditionNotMetException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UnsupportedUserStateException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminCreateUserResult adminCreateUser(AdminCreateUserRequest adminCreateUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminDeleteUserRequest <p>
     *            Represents the request to delete a user as an administrator.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on
     * any user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminDeleteUserAttributesRequest <p>
     *            Represents the request to delete user attributes as an
     *            administrator.
     *            </p>
     * @return adminDeleteUserAttributesResult The response from the
     *         AdminDeleteUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminDeleteUserAttributesResult adminDeleteUserAttributes(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Prevents the user from signing in with the specified external (SAML or
     * social) identity provider (IdP). If the user that you want to deactivate
     * is a Amazon Cognito user pools native username + password user, they
     * can't use their password to sign in. If the user to deactivate is a
     * linked external IdP user, any link between that user and an existing user
     * is removed. When the external user signs in again, and the user is no
     * longer attached to the previously linked <code>DestinationUser</code>,
     * the user must create a new user account. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a>.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when
     * creating an IdP for the pool.
     * </p>
     * <p>
     * To deactivate a native username + password user, the
     * <code>ProviderName</code> value must be <code>Cognito</code> and the
     * <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>.
     * The <code>ProviderAttributeValue</code> must be the name that is used in
     * the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be
     * <code>Cognito_Subject</code> for social IdPs. The
     * <code>ProviderAttributeValue</code> must always be the exact subject that
     * was used when the user was originally linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked
     * identity has not yet been used to sign in, the
     * <code>ProviderAttributeName</code> and
     * <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally
     * linked using <code> AdminLinkProviderForUser</code> call. (If the linking
     * was done with <code>ProviderAttributeName</code> set to
     * <code>Cognito_Subject</code>, the same applies here). However, if the
     * user has already signed in, the <code>ProviderAttributeName</code> must
     * be <code>Cognito_Subject</code> and <code>ProviderAttributeValue</code>
     * must be the subject of the SAML assertion.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminDisableProviderForUserRequest
     * @return adminDisableProviderForUserResult The response from the
     *         AdminDisableProviderForUser service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws AliasExistsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminDisableProviderForUserResult adminDisableProviderForUser(
            AdminDisableProviderForUserRequest adminDisableProviderForUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deactivates a user and revokes all access tokens for the user. A
     * deactivated user can't sign in, but still appears in the responses to
     * <code>GetUser</code> and <code>ListUsers</code> API requests.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminDisableUserRequest <p>
     *            Represents the request to disable the user as an
     *            administrator.
     *            </p>
     * @return adminDisableUserResult The response from the AdminDisableUser
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminEnableUserRequest <p>
     *            Represents the request that enables the user as an
     *            administrator.
     *            </p>
     * @return adminEnableUserResult The response from the AdminEnableUser
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminForgetDeviceRequest <p>
     *            Sends the forgot device request, as an administrator.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void adminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminGetDeviceRequest <p>
     *            Represents the request to get the device, as an administrator.
     *            </p>
     * @return adminGetDeviceResult The response from the AdminGetDevice service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator.
     * Works on any user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminGetUserRequest <p>
     *            Represents the request to get the specified user as an
     *            administrator.
     *            </p>
     * @return adminGetUserResult The response from the AdminGetUser service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminInitiateAuthRequest <p>
     *            Initiates the authorization request, as an administrator.
     *            </p>
     * @return adminInitiateAuthResult The response from the AdminInitiateAuth
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws UnexpectedLambdaException
     * @throws InvalidUserPoolConfigurationException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws MFAMethodNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminInitiateAuthResult adminInitiateAuth(AdminInitiateAuthRequest adminInitiateAuthRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Links an existing user account in a user pool (
     * <code>DestinationUser</code>) to an identity from an external IdP (
     * <code>SourceUser</code>) based on a specified attribute name and value
     * from the external IdP. This allows you to create a link from the existing
     * user account to an external federated user identity that has not yet been
     * used to sign in. You can then use the federated user identity to sign in
     * as the existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password,
     * this API links that user to a federated user identity. When the user
     * signs in with a federated user identity, they sign in as the existing
     * user account.
     * </p>
     * <note>
     * <p>
     * The maximum number of federated identities linked to a user is five.
     * </p>
     * </note> <important>
     * <p>
     * Because this API allows a user with an external federated identity to
     * sign in as an existing user in the user pool, it is critical that it only
     * be used with external IdPs and provider attributes that have been trusted
     * by the application owner.
     * </p>
     * </important> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminLinkProviderForUserRequest
     * @return adminLinkProviderForUserResult The response from the
     *         AdminLinkProviderForUser service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws AliasExistsException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminLinkProviderForUserResult adminLinkProviderForUser(
            AdminLinkProviderForUserRequest adminLinkProviderForUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminListDevicesRequest <p>
     *            Represents the request to list devices, as an administrator.
     *            </p>
     * @return adminListDevicesResult The response from the AdminListDevices
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminListDevicesResult adminListDevices(AdminListDevicesRequest adminListDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the groups that the user belongs to.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminListGroupsForUserRequest
     * @return adminListGroupsForUserResult The response from the
     *         AdminListGroupsForUser service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminListGroupsForUserResult adminListGroupsForUser(
            AdminListGroupsForUserRequest adminListGroupsForUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A history of user activity and any risks detected as part of Amazon
     * Cognito advanced security.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminListUserAuthEventsRequest
     * @return adminListUserAuthEventsResult The response from the
     *         AdminListUserAuthEvents service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws UserPoolAddOnNotEnabledException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminListUserAuthEventsResult adminListUserAuthEvents(
            AdminListUserAuthEventsRequest adminListUserAuthEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminRemoveUserFromGroupRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void adminRemoveUserFromGroup(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator.
     * Works on any user.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Deactivates a user's password, requiring them to change it. If a user
     * tries to sign in after the API is called, Amazon Cognito responds with a
     * <code>PasswordResetRequiredException</code> error. Your app must then
     * perform the actions that reset your user's password: the forgot-password
     * flow. In addition, if the user pool has phone verification selected and a
     * verified phone number exists for the user, or if email verification is
     * selected and a verified email exists for the user, calling this API will
     * also result in sending a message to the end user with the code to change
     * their password.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminResetUserPasswordRequest <p>
     *            Represents the request to reset a user's password as an
     *            administrator.
     *            </p>
     * @return adminResetUserPasswordResult The response from the
     *         AdminResetUserPassword service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminResetUserPasswordResult adminResetUserPassword(
            AdminResetUserPasswordRequest adminResetUserPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminRespondToAuthChallengeRequest <p>
     *            The request to respond to the authentication challenge, as an
     *            administrator.
     *            </p>
     * @return adminRespondToAuthChallengeResult The response from the
     *         AdminRespondToAuthChallenge service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws UnexpectedLambdaException
     * @throws InvalidPasswordException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws InternalErrorException
     * @throws MFAMethodNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws AliasExistsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws SoftwareTokenMFANotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The user's multi-factor authentication (MFA) preference, including which
     * MFA options are activated, and if any are preferred. Only one factor can
     * be set as preferred. The preferred MFA factor will be used to
     * authenticate a user if multiple factors are activated. If multiple
     * options are activated and no preference is set, a challenge to choose an
     * MFA option will be returned during sign-in.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminSetUserMFAPreferenceRequest
     * @return adminSetUserMFAPreferenceResult The response from the
     *         AdminSetUserMFAPreference service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminSetUserMFAPreferenceResult adminSetUserMFAPreference(
            AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the specified user's password in a user pool as an administrator.
     * Works on any user.
     * </p>
     * <p>
     * The password can be temporary or permanent. If it is temporary, the user
     * status enters the <code>FORCE_CHANGE_PASSWORD</code> state. When the user
     * next tries to sign in, the InitiateAuth/AdminInitiateAuth response will
     * contain the <code>NEW_PASSWORD_REQUIRED</code> challenge. If the user
     * doesn't sign in before it expires, the user won't be able to sign in, and
     * an administrator must reset their password.
     * </p>
     * <p>
     * Once the user has set a new password, or the password is permanent, the
     * user status is set to <code>Confirmed</code>.
     * </p>
     * <p>
     * <code>AdminSetUserPassword</code> can set a password for the user profile
     * that Amazon Cognito creates for third-party federated users. When you set
     * a password, the federated user's status changes from
     * <code>EXTERNAL_PROVIDER</code> to <code>CONFIRMED</code>. A user in this
     * state can sign in as a federated user, and initiate authentication flows
     * in the API like a linked native user. They can also modify their password
     * and attributes in token-authenticated API requests like
     * <code>ChangePassword</code> and <code>UpdateUserAttributes</code>. As a
     * best security practice and to keep users in sync with your external IdP,
     * don't set passwords on federated user profiles. To set up a federated
     * user for native sign-in with a linked native user, refer to <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html"
     * >Linking federated users to an existing user profile</a>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminSetUserPasswordRequest
     * @return adminSetUserPasswordResult The response from the
     *         AdminSetUserPassword service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminSetUserPasswordResult adminSetUserPassword(
            AdminSetUserPasswordRequest adminSetUserPasswordRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * <i>This action is no longer supported.</i> You can use it to configure
     * only SMS MFA. You can't use it to configure time-based one-time password
     * (TOTP) software token MFA. To configure either type of MFA, use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminSetUserMFAPreference.html"
     * >AdminSetUserMFAPreference</a> instead.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminSetUserSettingsRequest <p>
     *            You can use this parameter to set an MFA configuration that
     *            uses the SMS delivery medium.
     *            </p>
     * @return adminSetUserSettingsResult The response from the
     *         AdminSetUserSettings service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminSetUserSettingsResult adminSetUserSettings(
            AdminSetUserSettingsRequest adminSetUserSettingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides feedback for an authentication event indicating if it was from a
     * valid user. This feedback is used for improving the risk evaluation
     * decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminUpdateAuthEventFeedbackRequest
     * @return adminUpdateAuthEventFeedbackResult The response from the
     *         AdminUpdateAuthEventFeedback service method, as returned by
     *         Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws UserPoolAddOnNotEnabledException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminUpdateAuthEventFeedbackResult adminUpdateAuthEventFeedback(
            AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminUpdateDeviceStatusRequest <p>
     *            The request to update the device status, as an administrator.
     *            </p>
     * @return adminUpdateDeviceStatusResult The response from the
     *         AdminUpdateDeviceStatus service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(
            AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Updates the specified user's attributes, including developer attributes,
     * as an administrator. Works on any user.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * In addition to updating user attributes, this API can also be used to
     * mark phone and email as verified.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminUpdateUserAttributesRequest <p>
     *            Represents the request to update the user's attributes as an
     *            administrator.
     *            </p>
     * @return adminUpdateUserAttributesResult The response from the
     *         AdminUpdateUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws AliasExistsException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminUpdateUserAttributesResult adminUpdateUserAttributes(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Signs out a user from all devices. <code>AdminUserGlobalSignOut</code>
     * invalidates all identity, access and refresh tokens that Amazon Cognito
     * has issued to a user. A user can still use a hosted UI cookie to retrieve
     * new tokens for the duration of the 1-hour cookie validity period.
     * </p>
     * <p>
     * Your app isn't aware that a user's access token is revoked unless it
     * attempts to authorize a user pools API request with an access token that
     * contains the scope <code>aws.cognito.signin.user.admin</code>. Your app
     * might otherwise accept access tokens until they expire.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param adminUserGlobalSignOutRequest <p>
     *            The request to sign out of all devices, as an administrator.
     *            </p>
     * @return adminUserGlobalSignOutResult The response from the
     *         AdminUserGlobalSignOut service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdminUserGlobalSignOutResult adminUserGlobalSignOut(
            AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Begins setup of time-based one-time password (TOTP) multi-factor
     * authentication (MFA) for a user, with a unique private key that Amazon
     * Cognito generates and returns in the API response. You can authorize an
     * <code>AssociateSoftwareToken</code> request with either the user's access
     * token, or a session string from a challenge response that you received
     * from Amazon Cognito.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito disassociates an existing software token when you verify
     * the new token in a <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifySoftwareToken.html"
     * > VerifySoftwareToken</a> API request. If you don't verify the software
     * token and your user pool doesn't require MFA, the user can then
     * authenticate with user name and password credentials alone. If your user
     * pool requires TOTP MFA, Amazon Cognito generates an
     * <code>MFA_SETUP</code> or <code>SOFTWARE_TOKEN_SETUP</code> challenge
     * each time your user signs. Complete setup with
     * <code>AssociateSoftwareToken</code> and <code>VerifySoftwareToken</code>.
     * </p>
     * <p>
     * After you set up software token MFA for your user, Amazon Cognito
     * generates a <code>SOFTWARE_TOKEN_MFA</code> challenge when they
     * authenticate. Respond to this challenge with your user's TOTP.
     * </p>
     * </note> <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param associateSoftwareTokenRequest
     * @return associateSoftwareTokenResult The response from the
     *         AssociateSoftwareToken service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ConcurrentModificationException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws SoftwareTokenMFANotFoundException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateSoftwareTokenResult associateSoftwareToken(
            AssociateSoftwareTokenRequest associateSoftwareTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param changePasswordRequest <p>
     *            Represents the request to change a user password.
     *            </p>
     * @return changePasswordResult The response from the ChangePassword service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that begins
     * device tracking.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param confirmDeviceRequest <p>
     *            Confirms the device request.
     *            </p>
     * @return confirmDeviceResult The response from the ConfirmDevice service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws UsernameExistsException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest confirmDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows a user to enter a confirmation code to reset a forgotten password.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param confirmForgotPasswordRequest <p>
     *            The request representing the confirmation for a password
     *            reset.
     *            </p>
     * @return confirmForgotPasswordResult The response from the
     *         ConfirmForgotPassword service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ConfirmForgotPasswordResult confirmForgotPassword(
            ConfirmForgotPasswordRequest confirmForgotPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Confirms registration of a new user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param confirmSignUpRequest <p>
     *            Represents the request to confirm registration of a user.
     *            </p>
     * @return confirmSignUpResult The response from the ConfirmSignUp service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws TooManyFailedAttemptsException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws InvalidLambdaResponseException
     * @throws AliasExistsException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new group in the specified user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createGroupRequest
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws GroupExistsException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IdP for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createIdentityProviderRequest
     * @return createIdentityProviderResult The response from the
     *         CreateIdentityProvider service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws DuplicateProviderException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateIdentityProviderResult createIdentityProvider(
            CreateIdentityProviderRequest createIdentityProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new OAuth2.0 resource server and defines custom scopes within
     * it.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createResourceServerRequest
     * @return createResourceServerResult The response from the
     *         CreateResourceServer service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateResourceServerResult createResourceServer(
            CreateResourceServerRequest createResourceServerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a user import job.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUserImportJobRequest <p>
     *            Represents the request to create the user import job.
     *            </p>
     * @return createUserImportJobResult The response from the
     *         CreateUserImportJob service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateUserImportJobResult createUserImportJob(
            CreateUserImportJobRequest createUserImportJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for
     * the pool.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, Amazon Cognito sets it to
     * its default value.
     * </p>
     * </important> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUserPoolRequest <p>
     *            Represents the request to create a user pool.
     *            </p>
     * @return createUserPoolResult The response from the CreateUserPool service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws NotAuthorizedException
     * @throws UserPoolTaggingException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * <p>
     * When you create a new user pool client, token revocation is automatically
     * activated. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, Amazon Cognito sets it to
     * its default value.
     * </p>
     * </important> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUserPoolClientRequest <p>
     *            Represents the request to create a user pool client.
     *            </p>
     * @return createUserPoolClientResult The response from the
     *         CreateUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws ScopeDoesNotExistException
     * @throws InvalidOAuthFlowException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateUserPoolClientResult createUserPoolClient(
            CreateUserPoolClientRequest createUserPoolClientRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new domain for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUserPoolDomainRequest
     * @return createUserPoolDomainResult The response from the
     *         CreateUserPoolDomain service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateUserPoolDomainResult createUserPoolDomain(
            CreateUserPoolDomainRequest createUserPoolDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param deleteGroupRequest
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteGroup(DeleteGroupRequest deleteGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an IdP for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @throws InvalidParameterException
     * @throws UnsupportedIdentityProviderException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a resource server.
     * </p>
     * 
     * @param deleteResourceServerRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteResourceServer(DeleteResourceServerRequest deleteResourceServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows a user to delete their own user profile.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest <p>
     *            Represents the request to delete a user.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param deleteUserAttributesRequest <p>
     *            Represents the request to delete user attributes.
     *            </p>
     * @return deleteUserAttributesResult The response from the
     *         DeleteUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteUserAttributesResult deleteUserAttributes(
            DeleteUserAttributesRequest deleteUserAttributesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest <p>
     *            Represents the request to delete a user pool.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserImportInProgressException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest <p>
     *            Represents the request to delete a user pool client.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws ConcurrentModificationException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a domain for a user pool.
     * </p>
     * 
     * @param deleteUserPoolDomainRequest
     * @return deleteUserPoolDomainResult The response from the
     *         DeleteUserPoolDomain service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws NotAuthorizedException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteUserPoolDomainResult deleteUserPoolDomain(
            DeleteUserPoolDomainRequest deleteUserPoolDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a specific IdP.
     * </p>
     * 
     * @param describeIdentityProviderRequest
     * @return describeIdentityProviderResult The response from the
     *         DescribeIdentityProvider service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIdentityProviderResult describeIdentityProvider(
            DescribeIdentityProviderRequest describeIdentityProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a resource server.
     * </p>
     * 
     * @param describeResourceServerRequest
     * @return describeResourceServerResult The response from the
     *         DescribeResourceServer service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeResourceServerResult describeResourceServer(
            DescribeResourceServerRequest describeResourceServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the risk configuration.
     * </p>
     * 
     * @param describeRiskConfigurationRequest
     * @return describeRiskConfigurationResult The response from the
     *         DescribeRiskConfiguration service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserPoolAddOnNotEnabledException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeRiskConfigurationResult describeRiskConfiguration(
            DescribeRiskConfigurationRequest describeRiskConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest <p>
     *            Represents the request to describe the user import job.
     *            </p>
     * @return describeUserImportJobResult The response from the
     *         DescribeUserImportJob service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeUserImportJobResult describeUserImportJob(
            DescribeUserImportJobRequest describeUserImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user
     * pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeUserPoolRequest <p>
     *            Represents the request to describe the user pool.
     *            </p>
     * @return describeUserPoolResult The response from the DescribeUserPool
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserPoolTaggingException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Client method for returning the configuration information and metadata of
     * the specified user pool app client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeUserPoolClientRequest <p>
     *            Represents the request to describe a user pool client.
     *            </p>
     * @return describeUserPoolClientResult The response from the
     *         DescribeUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeUserPoolClientResult describeUserPoolClient(
            DescribeUserPoolClientRequest describeUserPoolClientRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a domain.
     * </p>
     * 
     * @param describeUserPoolDomainRequest
     * @return describeUserPoolDomainResult The response from the
     *         DescribeUserPoolDomain service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws NotAuthorizedException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeUserPoolDomainResult describeUserPoolDomain(
            DescribeUserPoolDomainRequest describeUserPoolDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param forgetDeviceRequest <p>
     *            Represents the request to forget the device.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void forgetDevice(ForgetDeviceRequest forgetDeviceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Calling this API causes a message to be sent to the end user with a
     * confirmation code that is required to change the user's password. For the
     * <code>Username</code> parameter, you can use the username or user alias.
     * The method used to send the confirmation code is sent according to the
     * specified AccountRecoverySetting. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-recover-a-user-account.html"
     * >Recovering User Accounts</a> in the <i>Amazon Cognito Developer
     * Guide</i>. To use the confirmation code for resetting the password, call
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmForgotPassword.html"
     * >ConfirmForgotPassword</a>.
     * </p>
     * <p>
     * If neither a verified phone number nor a verified email exists, this API
     * returns <code>InvalidParameterException</code>. If your app client has a
     * client secret and you don't provide a <code>SECRET_HASH</code> parameter,
     * this API returns <code>NotAuthorizedException</code>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param forgotPasswordRequest <p>
     *            Represents the request to reset a user's password.
     *            </p>
     * @return forgotPasswordResult The response from the ForgotPassword service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the header information for the comma-separated value (CSV) file to
     * be used as input for the user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest <p>
     *            Represents the request to get the header information of the
     *            CSV file for the user import job.
     *            </p>
     * @return getCSVHeaderResult The response from the GetCSVHeader service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the device.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param getDeviceRequest <p>
     *            Represents the request to get the device.
     *            </p>
     * @return getDeviceResult The response from the GetDevice service method,
     *         as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a group.
     * </p>
     * <p>
     * Calling this action requires developer credentials.
     * </p>
     * 
     * @param getGroupRequest
     * @return getGroupResult The response from the GetGroup service method, as
     *         returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the specified IdP.
     * </p>
     * 
     * @param getIdentityProviderByIdentifierRequest
     * @return getIdentityProviderByIdentifierResult The response from the
     *         GetIdentityProviderByIdentifier service method, as returned by
     *         Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetIdentityProviderByIdentifierResult getIdentityProviderByIdentifier(
            GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the detailed activity logging configuration for a user pool.
     * </p>
     * 
     * @param getLogDeliveryConfigurationRequest
     * @return getLogDeliveryConfigurationResult The response from the
     *         GetLogDeliveryConfiguration service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetLogDeliveryConfigurationResult getLogDeliveryConfiguration(
            GetLogDeliveryConfigurationRequest getLogDeliveryConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This method takes a user pool ID, and returns the signing certificate.
     * The issued certificate is valid for 10 years from the date of issue.
     * </p>
     * <p>
     * Amazon Cognito issues and assigns a new signing certificate annually.
     * This process returns a new value in the response to
     * <code>GetSigningCertificate</code>, but doesn't invalidate the original
     * certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest <p>
     *            Request to get a signing certificate from Amazon Cognito.
     *            </p>
     * @return getSigningCertificateResult The response from the
     *         GetSigningCertificate service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSigningCertificateResult getSigningCertificate(
            GetSigningCertificateRequest getSigningCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the user interface (UI) Customization information for a particular
     * app client's app UI, if any such information exists for the client. If
     * nothing is set for the particular client, but there is an existing pool
     * level customization (the app <code>clientId</code> is <code>ALL</code>),
     * then that information is returned. If nothing is present, then an empty
     * shape is returned.
     * </p>
     * 
     * @param getUICustomizationRequest
     * @return getUICustomizationResult The response from the GetUICustomization
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUICustomizationResult getUICustomization(GetUICustomizationRequest getUICustomizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param getUserRequest <p>
     *            Represents the request to get information about the user.
     *            </p>
     * @return getUserResult The response from the GetUser service method, as
     *         returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUserResult getUser(GetUserRequest getUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Generates a user attribute verification code for the specified attribute
     * name. Sends a message to a user with a code that they must return in a
     * VerifyUserAttribute request.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param getUserAttributeVerificationCodeRequest <p>
     *            Represents the request to get user attribute verification.
     *            </p>
     * @return getUserAttributeVerificationCodeResult The response from the
     *         GetUserAttributeVerificationCode service method, as returned by
     *         Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * 
     * @param getUserPoolMfaConfigRequest
     * @return getUserPoolMfaConfigResult The response from the
     *         GetUserPoolMfaConfig service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUserPoolMfaConfigResult getUserPoolMfaConfig(
            GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Signs out a user from all devices. <code>GlobalSignOut</code> invalidates
     * all identity, access and refresh tokens that Amazon Cognito has issued to
     * a user. A user can still use a hosted UI cookie to retrieve new tokens
     * for the duration of the 1-hour cookie validity period.
     * </p>
     * <p>
     * Your app isn't aware that a user's access token is revoked unless it
     * attempts to authorize a user pools API request with an access token that
     * contains the scope <code>aws.cognito.signin.user.admin</code>. Your app
     * might otherwise accept access tokens until they expire.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param globalSignOutRequest <p>
     *            Represents the request to sign out all devices.
     *            </p>
     * @return globalSignOutResult The response from the GlobalSignOut service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GlobalSignOutResult globalSignOut(GlobalSignOutRequest globalSignOutRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates sign-in for a user in the Amazon Cognito user directory. You
     * can't sign in a user with a federated IdP with <code>InitiateAuth</code>.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation.html"
     * > Adding user pool sign-in through a third party</a>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param initiateAuthRequest <p>
     *            Initiates the authentication request.
     *            </p>
     * @return initiateAuthResult The response from the InitiateAuth service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws UnexpectedLambdaException
     * @throws InvalidUserPoolConfigurationException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the sign-in devices that Amazon Cognito has registered to the
     * current user.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param listDevicesRequest <p>
     *            Represents the request to list the devices.
     *            </p>
     * @return listDevicesResult The response from the ListDevices service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the groups associated with a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists information about all IdPs for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listIdentityProvidersRequest
     * @return listIdentityProvidersResult The response from the
     *         ListIdentityProviders service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListIdentityProvidersResult listIdentityProviders(
            ListIdentityProvidersRequest listIdentityProvidersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resource servers for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listResourceServersRequest
     * @return listResourceServersResult The response from the
     *         ListResourceServers service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListResourceServersResult listResourceServers(
            ListResourceServersRequest listResourceServersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito user pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to user pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or
     * other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists user import jobs for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listUserImportJobsRequest <p>
     *            Represents the request to list the user import jobs.
     *            </p>
     * @return listUserImportJobsResult The response from the ListUserImportJobs
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListUserImportJobsResult listUserImportJobs(ListUserImportJobsRequest listUserImportJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listUserPoolClientsRequest <p>
     *            Represents the request to list the user pool clients.
     *            </p>
     * @return listUserPoolClientsResult The response from the
     *         ListUserPoolClients service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListUserPoolClientsResult listUserPoolClients(
            ListUserPoolClientsRequest listUserPoolClientsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the user pools associated with an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listUserPoolsRequest <p>
     *            Represents the request to list user pools.
     *            </p>
     * @return listUserPoolsResult The response from the ListUserPools service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists users and their basic details in a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listUsersRequest <p>
     *            Represents the request to list users.
     *            </p>
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the users in the specified group.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listUsersInGroupRequest
     * @return listUsersInGroupResult The response from the ListUsersInGroup
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListUsersInGroupResult listUsersInGroup(ListUsersInGroupRequest listUsersInGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific
     * user in the user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param resendConfirmationCodeRequest <p>
     *            Represents the request to resend the confirmation code.
     *            </p>
     * @return resendConfirmationCodeResult The response from the
     *         ResendConfirmationCode service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ResendConfirmationCodeResult resendConfirmationCode(
            ResendConfirmationCodeRequest resendConfirmationCodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param respondToAuthChallengeRequest <p>
     *            The request to respond to an authentication challenge.
     *            </p>
     * @return respondToAuthChallengeResult The response from the
     *         RespondToAuthChallenge service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws MFAMethodNotFoundException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws AliasExistsException
     * @throws InternalErrorException
     * @throws SoftwareTokenMFANotFoundException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RespondToAuthChallengeResult respondToAuthChallenge(
            RespondToAuthChallengeRequest respondToAuthChallengeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Revokes all of the access tokens generated by, and at the same time as,
     * the specified refresh token. After a token is revoked, you can't use the
     * revoked token to access Amazon Cognito user APIs, or to authorize access
     * to your resource server.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param revokeTokenRequest
     * @return revokeTokenResult The response from the RevokeToken service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws UnauthorizedException
     * @throws InvalidParameterException
     * @throws UnsupportedOperationException
     * @throws UnsupportedTokenTypeException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RevokeTokenResult revokeToken(RevokeTokenRequest revokeTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets up or modifies the detailed activity logging configuration of a user
     * pool.
     * </p>
     * 
     * @param setLogDeliveryConfigurationRequest
     * @return setLogDeliveryConfigurationResult The response from the
     *         SetLogDeliveryConfiguration service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetLogDeliveryConfigurationResult setLogDeliveryConfiguration(
            SetLogDeliveryConfigurationRequest setLogDeliveryConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures actions on detected risks. To delete the risk configuration
     * for <code>UserPoolId</code> or <code>ClientId</code>, pass null values
     * for all four configuration types.
     * </p>
     * <p>
     * To activate Amazon Cognito advanced security features, update the user
     * pool to include the <code>UserPoolAddOns</code> key
     * <code>AdvancedSecurityMode</code>.
     * </p>
     * 
     * @param setRiskConfigurationRequest
     * @return setRiskConfigurationResult The response from the
     *         SetRiskConfiguration service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserPoolAddOnNotEnabledException
     * @throws CodeDeliveryFailureException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetRiskConfigurationResult setRiskConfiguration(
            SetRiskConfigurationRequest setRiskConfigurationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the user interface (UI) customization information for a user pool's
     * built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a
     * specific <code>clientId</code>) or for all clients (by setting the
     * <code>clientId</code> to <code>ALL</code>). If you specify
     * <code>ALL</code>, the default configuration is used for every client that
     * has no previously set UI customization. If you specify UI customization
     * settings for a particular client, it will no longer return to the
     * <code>ALL</code> configuration.
     * </p>
     * <note>
     * <p>
     * To use this API, your user pool must have a domain associated with it.
     * Otherwise, there is no place to host the app's pages, and the service
     * will throw an error.
     * </p>
     * </note>
     * 
     * @param setUICustomizationRequest
     * @return setUICustomizationResult The response from the SetUICustomization
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetUICustomizationResult setUICustomization(SetUICustomizationRequest setUICustomizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Set the user's multi-factor authentication (MFA) method preference,
     * including which MFA factors are activated and if any are preferred. Only
     * one factor can be set as preferred. The preferred MFA factor will be used
     * to authenticate a user if multiple factors are activated. If multiple
     * options are activated and no preference is set, a challenge to choose an
     * MFA option will be returned during sign-in. If an MFA type is activated
     * for a user, the user will be prompted for MFA during all sign-in attempts
     * unless device tracking is turned on and the device has been trusted. If
     * you want MFA to be applied selectively based on the assessed risk level
     * of sign-in attempts, deactivate MFA for users and turn on Adaptive
     * Authentication for the user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param setUserMFAPreferenceRequest
     * @return setUserMFAPreferenceResult The response from the
     *         SetUserMFAPreference service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetUserMFAPreferenceResult setUserMFAPreference(
            SetUserMFAPreferenceRequest setUserMFAPreferenceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param setUserPoolMfaConfigRequest
     * @return setUserPoolMfaConfigResult The response from the
     *         SetUserPoolMfaConfig service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetUserPoolMfaConfigResult setUserPoolMfaConfig(
            SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * <i>This action is no longer supported.</i> You can use it to configure
     * only SMS MFA. You can't use it to configure time-based one-time password
     * (TOTP) software token MFA. To configure either type of MFA, use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserMFAPreference.html"
     * >SetUserMFAPreference</a> instead.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param setUserSettingsRequest <p>
     *            Represents the request to set user settings.
     *            </p>
     * @return setUserSettingsResult The response from the SetUserSettings
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name,
     * password, and user attributes.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param signUpRequest <p>
     *            Represents the request to register a user.
     *            </p>
     * @return signUpResult The response from the SignUp service method, as
     *         returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws UsernameExistsException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SignUpResult signUp(SignUpRequest signUpRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest <p>
     *            Represents the request to start the user import job.
     *            </p>
     * @return startUserImportJobResult The response from the StartUserImportJob
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartUserImportJobResult startUserImportJob(StartUserImportJobRequest startUserImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest <p>
     *            Represents the request to stop the user import job.
     *            </p>
     * @return stopUserImportJobResult The response from the StopUserImportJob
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StopUserImportJobResult stopUserImportJob(StopUserImportJobRequest stopUserImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label
     * that you can use to categorize and manage user pools in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is
     * a general category for more specific values. For example, if you have two
     * versions of a user pool, one for testing and another for production, you
     * might assign an <code>Environment</code> tag key to both user pools. The
     * value of this key might be <code>Test</code> for one user pool, and
     * <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate
     * your tags so that they appear on the Billing and Cost Management console,
     * where you can track the costs associated with your user pools. In an
     * Identity and Access Management policy, you can constrain permissions for
     * user pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. A user
     * pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito user pool. You can use
     * this action up to 5 times per second, per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides the feedback for an authentication event, whether it was from a
     * valid user or not. This feedback is used for improving the risk
     * evaluation decision for the user pool as part of Amazon Cognito advanced
     * security.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param updateAuthEventFeedbackRequest
     * @return updateAuthEventFeedbackResult The response from the
     *         UpdateAuthEventFeedback service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws UserPoolAddOnNotEnabledException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateAuthEventFeedbackResult updateAuthEventFeedback(
            UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the device status.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param updateDeviceStatusRequest <p>
     *            Represents the request to update the device status.
     *            </p>
     * @return updateDeviceStatusResult The response from the UpdateDeviceStatus
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateDeviceStatusResult updateDeviceStatus(UpdateDeviceStatusRequest updateDeviceStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified group with the specified attributes.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateGroupRequest
     * @return updateGroupResult The response from the UpdateGroup service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates IdP information for a user pool.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateIdentityProviderRequest
     * @return updateIdentityProviderResult The response from the
     *         UpdateIdentityProvider service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws UnsupportedIdentityProviderException
     * @throws ResourceNotFoundException
     * @throws ConcurrentModificationException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateIdentityProviderResult updateIdentityProvider(
            UpdateIdentityProviderRequest updateIdentityProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are
     * read-only.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, it is set to the default
     * value.
     * </p>
     * </important> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateResourceServerRequest
     * @return updateResourceServerResult The response from the
     *         UpdateResourceServer service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateResourceServerResult updateResourceServer(
            UpdateResourceServerRequest updateResourceServerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note> <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateUserAttributesRequest <p>
     *            Represents the request to update user attributes.
     *            </p>
     * @return updateUserAttributesResult The response from the
     *         UpdateUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws NotAuthorizedException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws AliasExistsException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateUserAttributesResult updateUserAttributes(
            UpdateUserAttributesRequest updateUserAttributesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * This action might generate an SMS text message. Starting June 1, 2021, US
     * telecom carriers require you to register an origination phone number
     * before you can send SMS messages to US phone numbers. If you use SMS text
     * messages in Amazon Cognito, you must register a phone number with <a
     * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
     * Amazon Cognito uses the registered number automatically. Otherwise,
     * Amazon Cognito users who must receive SMS messages might not be able to
     * sign up, activate their accounts, or sign in.
     * </p>
     * <p>
     * If you have never used SMS text messages with Amazon Cognito or any other
     * Amazon Web Service, Amazon Simple Notification Service might place your
     * account in the SMS sandbox. In <i> <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html"
     * >sandbox mode</a> </i>, you can send messages only to verified phone
     * numbers. After you test your app while in the sandbox environment, you
     * can move out of the sandbox and into production. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
     * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Updates the specified user pool with the specified attributes. You can
     * get a list of the current user pool settings using <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html"
     * >DescribeUserPool</a>.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, Amazon Cognito sets it to
     * its default value.
     * </p>
     * </important> <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateUserPoolRequest <p>
     *            Represents the request to update the user pool.
     *            </p>
     * @return updateUserPoolResult The response from the UpdateUserPool service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws ConcurrentModificationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserImportInProgressException
     * @throws InternalErrorException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws UserPoolTaggingException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified user pool app client with the specified attributes.
     * You can get a list of the current user pool app client settings using <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPoolClient.html"
     * >DescribeUserPoolClient</a>.
     * </p>
     * <important>
     * <p>
     * If you don't provide a value for an attribute, Amazon Cognito sets it to
     * its default value.
     * </p>
     * </important>
     * <p>
     * You can also use this operation to enable token revocation for user pool
     * clients. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateUserPoolClientRequest <p>
     *            Represents the request to update the user pool client.
     *            </p>
     * @return updateUserPoolClientResult The response from the
     *         UpdateUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws ConcurrentModificationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws ScopeDoesNotExistException
     * @throws InvalidOAuthFlowException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateUserPoolClientResult updateUserPoolClient(
            UpdateUserPoolClientRequest updateUserPoolClientRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the Secure Sockets Layer (SSL) certificate for the custom domain
     * for your user pool.
     * </p>
     * <p>
     * You can use this operation to provide the Amazon Resource Name (ARN) of a
     * new certificate to Amazon Cognito. You can't use it to change the domain
     * for a user pool.
     * </p>
     * <p>
     * A custom domain is used to host the Amazon Cognito hosted UI, which
     * provides sign-up and sign-in pages for your application. When you set up
     * a custom domain, you provide a certificate that you manage with
     * Certificate Manager (ACM). When necessary, you can use this operation to
     * change the certificate that you applied to your custom domain.
     * </p>
     * <p>
     * Usually, this is unnecessary following routine certificate renewal with
     * ACM. When you renew your existing certificate in ACM, the ARN for your
     * certificate remains the same, and your custom domain uses the new
     * certificate automatically.
     * </p>
     * <p>
     * However, if you replace your existing certificate with a new one, ACM
     * gives the new certificate a new ARN. To apply the new certificate to your
     * custom domain, you must provide this ARN to Amazon Cognito.
     * </p>
     * <p>
     * When you add your new certificate in ACM, you must choose US East (N.
     * Virginia) as the Amazon Web Services Region.
     * </p>
     * <p>
     * After you submit your request, Amazon Cognito requires up to 1 hour to
     * distribute your new certificate to your custom domain.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     * >Using Your Own Domain for the Hosted UI</a>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
     * requests for this API operation. For this operation, you must use IAM
     * credentials to authorize requests, and you must grant yourself the
     * corresponding IAM permission in a policy.
     * </p>
     * <p class="title">
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
     * >Signing Amazon Web Services API Requests</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito user pools API and user pool endpoints</a>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateUserPoolDomainRequest <p>
     *            The UpdateUserPoolDomain request input.
     *            </p>
     * @return updateUserPoolDomainResult The response from the
     *         UpdateUserPoolDomain service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateUserPoolDomainResult updateUserPoolDomain(
            UpdateUserPoolDomainRequest updateUserPoolDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Use this API to register a user's entered time-based one-time password
     * (TOTP) code and mark the user's software token MFA status as "verified"
     * if successful. The request takes an access token or a session string, but
     * not both.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param verifySoftwareTokenRequest
     * @return verifySoftwareTokenResult The response from the
     *         VerifySoftwareToken service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidUserPoolConfigurationException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws EnableSoftwareTokenMFAException
     * @throws NotAuthorizedException
     * @throws SoftwareTokenMFANotFoundException
     * @throws CodeMismatchException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    VerifySoftwareTokenResult verifySoftwareToken(
            VerifySoftwareTokenRequest verifySoftwareTokenRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates the
     * attribute value, VerifyUserAttribute updates the affected attribute to
     * its pending value. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserAttributeUpdateSettingsType.html"
     * > UserAttributeUpdateSettingsType</a>.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito doesn't evaluate Identity and Access Management (IAM)
     * policies in requests for this API operation. For this operation, you
     * can't use IAM credentials to authorize requests, and you can't grant IAM
     * permissions in policies. For more information about authorization models
     * in Amazon Cognito, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
     * >Using the Amazon Cognito native and OIDC APIs</a>.
     * </p>
     * </note>
     * 
     * @param verifyUserAttributeRequest <p>
     *            Represents the request to verify user attributes.
     *            </p>
     * @return verifyUserAttributeResult The response from the
     *         VerifyUserAttribute service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AliasExistsException
     * @throws ForbiddenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    VerifyUserAttributeResult verifyUserAttribute(
            VerifyUserAttributeRequest verifyUserAttributeRequest) throws AmazonClientException,
            AmazonServiceException;

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
