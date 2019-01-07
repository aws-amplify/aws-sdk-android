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

package com.amazonaws.services.cognitoidentityprovider;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cognitoidentityprovider.model.*;

/**
 * Interface for accessing Amazon Cognito Your User Pool
 * <p>
 * Using the Amazon Cognito User Pools API, you can create a user pool to manage
 * directories and users. You can authenticate a user to obtain tokens related
 * to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito
 * User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminConfirmSignUpRequest <p>
     *            Represents the request to confirm user registration.
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
     * If <code>MessageAction</code> is not set, the default is to send a
     * welcome message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This message is based on a template that you configured in your call to
     * or . This template includes your custom sign-up instructions and
     * placeholders for user name and temporary password.
     * </p>
     * </note>
     * <p>
     * Alternatively, you can call AdminCreateUser with “SUPPRESS” for the
     * <code>MessageAction</code> parameter, and Amazon Cognito will not send
     * any email.
     * </p>
     * <p>
     * In either case, the user will be in the
     * <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <p>
     * AdminCreateUser requires developer credentials.
     * </p>
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
     * Disables the user from signing in with the specified external (SAML or
     * social) identity provider. If the user to disable is a Cognito User Pools
     * native username + password user, they are not permitted to use their
     * password to sign-in. If the user to disable is a linked external IdP
     * user, any link between that user and an existing user is removed. The
     * next time the external user (no longer attached to the previously linked
     * <code>DestinationUser</code>) signs in, they must create a new user
     * account. See .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer
     * credentials.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when
     * creating an IdP for the pool.
     * </p>
     * <p>
     * To disable a native username + password user, the
     * <code>ProviderName</code> value must be <code>Cognito</code> and the
     * <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>,
     * with the <code>ProviderAttributeValue</code> being the name that is used
     * in the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be
     * <code>Cognito_Subject</code> for social identity providers. The
     * <code>ProviderAttributeValue</code> must always be the exact subject that
     * was used when the user was originally linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked
     * identity has not yet been used to sign-in, the
     * <code>ProviderAttributeName</code> and
     * <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally
     * linked in the call. (If the linking was done with
     * <code>ProviderAttributeName</code> set to <code>Cognito_Subject</code>,
     * the same applies here). However, if the user has already signed in, the
     * <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>
     * and <code>ProviderAttributeValue</code> must be the subject of the SAML
     * assertion.
     * </p>
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
     * Forgets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
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
     * <code>DestinationUser</code>) to an identity from an external identity
     * provider (<code>SourceUser</code>) based on a specified attribute name
     * and value from the external identity provider. This allows you to create
     * a link from the existing user account to an external federated user
     * identity that has not yet been used to sign in, so that the federated
     * user identity can be used to sign in as the existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password,
     * this API links that user to a federated user identity, so that when the
     * federated user identity is used, the user signs in as the existing user
     * account.
     * </p>
     * <important>
     * <p>
     * Because this API allows a user with an external federated identity to
     * sign in as an existing user in the user pool, it is critical that it only
     * be used with external identity providers and provider attributes that
     * have been trusted by the application owner.
     * </p>
     * </important>
     * <p>
     * See also .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer
     * credentials.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Lists a history of user activity and any risks detected as part of Amazon
     * Cognito advanced security.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Sets the user's multi-factor authentication (MFA) preference.
     * </p>
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
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminSetUserSettingsRequest <p>
     *            Represents the request to set user settings as an
     *            administrator.
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
     * Provides feedback for an authentication event as to whether it was from a
     * valid user. This feedback is used for improving the risk evaluation
     * decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Returns a unique generated shared secret key code for the user account.
     * The request takes an access token or a session string, but not both.
     * </p>
     * 
     * @param associateSoftwareTokenRequest
     * @return associateSoftwareTokenResult The response from the
     *         AssociateSoftwareToken service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws SoftwareTokenMFANotFoundException
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
     * Confirms registration of a user and handles the existing alias from a
     * previous user.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Creates an identity provider for a user pool.
     * </p>
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
     * Creates a new OAuth2.0 resource server and defines custom scopes in it.
     * </p>
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
     * Creates the user import job.
     * </p>
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
     * <p>
     * Creates the user pool client.
     * </p>
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
     * Deletes a group. Currently only groups with no members can be deleted.
     * </p>
     * <p>
     * Requires developer credentials.
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
     * Deletes an identity provider for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @throws InvalidParameterException
     * @throws UnsupportedIdentityProviderException
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
     * Allows a user to delete himself or herself.
     * </p>
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
     * Gets information about a specific identity provider.
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
     * Client method for returning the configuration information and metadata of
     * the specified user pool app client.
     * </p>
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
     * If a verified phone number exists for the user, the confirmation code is
     * sent to the phone number. Otherwise, if a verified email exists, the
     * confirmation code is sent to the email. If neither a verified phone
     * number nor a verified email exists,
     * <code>InvalidParameterException</code> is thrown. To use the confirmation
     * code for resetting the password, call .
     * </p>
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
    ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the header information for the .csv file to be used as input for the
     * user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest <p>
     *            Represents the request to get the header information for the
     *            .csv file for the user import job.
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
     * Requires developer credentials.
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
     * Gets the specified identity provider.
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
     * This method takes a user pool ID, and returns the signing certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest <p>
     *            Request to get a signing certificate from Cognito.
     *            </p>
     * @return getSigningCertificateResult The response from the
     *         GetSigningCertificate service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InternalErrorException
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
     * Gets the UI Customization information for a particular app client's app
     * UI, if there is something set. If nothing is set for the particular
     * client, but there is an existing pool level customization (app
     * <code>clientId</code> will be <code>ALL</code>), then that is returned.
     * If nothing is present, then an empty shape is returned.
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
     * Gets the user attribute verification code for the specified attribute
     * name.
     * </p>
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
     * Signs out users from all devices.
     * </p>
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
     * Initiates the authentication flow.
     * </p>
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
     * Lists the devices.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Lists information about all identity providers for a user pool.
     * </p>
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
     * Lists the user import jobs.
     * </p>
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
     * Lists the users in the Amazon Cognito user pool.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Configures actions on detected risks. To delete the risk configuration
     * for <code>UserPoolId</code> or <code>ClientId</code>, pass null values
     * for all four configuration types.
     * </p>
     * <p>
     * To enable Amazon Cognito advanced security features, update the user pool
     * to include the <code>UserPoolAddOns</code> key
     * <code>AdvancedSecurityMode</code>.
     * </p>
     * <p>
     * See .
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
     * Sets the UI customization information for a user pool's built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a
     * specific <code>clientId</code>) or for all clients (by setting the
     * <code>clientId</code> to <code>ALL</code>). If you specify
     * <code>ALL</code>, the default configuration will be used for every client
     * that has no UI customization set previously. If you specify UI
     * customization settings for a particular client, it will no longer fall
     * back to the <code>ALL</code> configuration.
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
     * Set the user's multi-factor authentication (MFA) method preference.
     * </p>
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
     * Set the user pool MFA configuration.
     * </p>
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
     * Sets the user settings like multi-factor authentication (MFA). If MFA is
     * to be removed for a particular attribute pass the attribute with code
     * delivery as null. If null list is passed, all MFA options are removed.
     * </p>
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
     * Provides the feedback for an authentication event whether it was from a
     * valid user or not. This feedback is used for improving the risk
     * evaluation decision for the user pool as part of Amazon Cognito advanced
     * security.
     * </p>
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
     * <p>
     * Requires developer credentials.
     * </p>
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
     * Updates identity provider information for a user pool.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return updateIdentityProviderResult The response from the
     *         UpdateIdentityProvider service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws UnsupportedIdentityProviderException
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
    UpdateIdentityProviderResult updateIdentityProvider(
            UpdateIdentityProviderRequest updateIdentityProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are
     * read-only.
     * </p>
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
     * <p>
     * Updates the specified user pool app client with the specified attributes.
     * If you don't provide a value for an attribute, it will be set to the
     * default value. You can get a list of the current user pool app client
     * settings with .
     * </p>
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
     * Use this API to register a user's entered TOTP code and mark the user's
     * software token MFA status as "verified" if successful. The request takes
     * an access token or a session string, but not both.
     * </p>
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
