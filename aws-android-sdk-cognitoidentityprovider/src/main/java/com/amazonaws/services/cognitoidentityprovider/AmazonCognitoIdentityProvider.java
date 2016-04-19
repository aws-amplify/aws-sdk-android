/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AmazonCognitoIdentityProvider.
 * <p>
 * You can create a user pool in Amazon Cognito Identity to manage
 * directories and users. You can authenticate a user to obtain tokens
 * related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon
 * Cognito Identity, which is a new capability that is available as a
 * beta.
 * </p>
 */
public interface AmazonCognitoIdentityProvider {

    /**
     * Overrides the default endpoint for this client ("https://cognito-idp.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cognito-idp.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://cognito-idp.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "cognito-idp.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://cognito-idp.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCognitoIdentityProvider#setEndpoint(String)}, sets the
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
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Gets the JSON Web keys for the specified user pool.
     * </p>
     *
     * @param getJWKSRequest Container for the necessary parameters to
     *           execute the GetJWKS service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetJWKS service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetJWKSResult getJWKS(GetJWKSRequest getJWKSRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Client method for returning the configuration information and
     * metadata of the specified user pool client.
     * </p>
     *
     * @param describeUserPoolClientRequest Container for the necessary
     *           parameters to execute the DescribeUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DescribeUserPoolClient service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     *
     * @param changePasswordRequest Container for the necessary parameters to
     *           execute the ChangePassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ChangePassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidPasswordException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     *
     * @param deleteUserPoolRequest Container for the necessary parameters to
     *           execute the DeleteUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works
     * on any user.
     * </p>
     *
     * @param adminDeleteUserAttributesRequest Container for the necessary
     *           parameters to execute the AdminDeleteUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminDeleteUserAttributes service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a user to delete one's self.
     * </p>
     *
     * @param deleteUserRequest Container for the necessary parameters to
     *           execute the DeleteUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Grants the ability to supply a multi-factor authentication (MFA)
     * token for an MFA-enabled user to get the ID, access, and refresh
     * tokens.
     * </p>
     *
     * @param enhanceAuthRequest Container for the necessary parameters to
     *           execute the EnhanceAuth service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the EnhanceAuth service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws CodeMismatchException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws ExpiredCodeException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws UserLambdaValidationException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnhanceAuthResult enhanceAuth(EnhanceAuthRequest enhanceAuthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets the specified user's password in a user pool as an
     * administrator. Works on any user.
     * </p>
     *
     * @param adminResetUserPasswordRequest Container for the necessary
     *           parameters to execute the AdminResetUserPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminResetUserPassword service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the user pools associated with an AWS account.
     * </p>
     *
     * @param listUserPoolsRequest Container for the necessary parameters to
     *           execute the ListUserPools service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUserPools service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Refreshes the tokens for the specified client ID.
     * </p>
     *
     * @param refreshTokensRequest Container for the necessary parameters to
     *           execute the RefreshTokens service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the RefreshTokens service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RefreshTokensResult refreshTokens(RefreshTokensRequest refreshTokensRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the OpenId configuration information for the specified user
     * pool.
     * </p>
     *
     * @param getOpenIdConfigurationRequest Container for the necessary
     *           parameters to execute the GetOpenIdConfiguration service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetOpenIdConfiguration service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetOpenIdConfigurationResult getOpenIdConfiguration(GetOpenIdConfigurationRequest getOpenIdConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     *
     * @param listUsersRequest Container for the necessary parameters to
     *           execute the ListUsers service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     *
     * @param adminDisableUserRequest Container for the necessary parameters
     *           to execute the AdminDisableUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminDisableUser service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     *
     * @param listUserPoolClientsRequest Container for the necessary
     *           parameters to execute the ListUserPoolClients service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUserPoolClients service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     *
     * @param deleteUserPoolClientRequest Container for the necessary
     *           parameters to execute the DeleteUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a user to enter a code provided when they reset their password
     * to update their password.
     * </p>
     *
     * @param confirmForgotPasswordRequest Container for the necessary
     *           parameters to execute the ConfirmForgotPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ConfirmForgotPassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws CodeMismatchException
     * @throws InvalidLambdaResponseException
     * @throws TooManyFailedAttemptsException
     * @throws ExpiredCodeException
     * @throws InvalidPasswordException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     *
     * @param deleteUserAttributesRequest Container for the necessary
     *           parameters to execute the DeleteUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DeleteUserAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the password for the specified client ID or username.
     * </p>
     *
     * @param forgotPasswordRequest Container for the necessary parameters to
     *           execute the ForgotPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ForgotPassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * First step of the Secure Remote Password protocol (SRP) auth flow to
     * authenticate a user. To learn about the second step, see Authenticate.
     * </p>
     *
     * @param getAuthenticationDetailsRequest Container for the necessary
     *           parameters to execute the GetAuthenticationDetails service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetAuthenticationDetails service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAuthenticationDetailsResult getAuthenticationDetails(GetAuthenticationDetailsRequest getAuthenticationDetailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified user pool with the specified attributes.
     * </p>
     *
     * @param updateUserPoolRequest Container for the necessary parameters to
     *           execute the UpdateUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws ConcurrentModificationException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user
     * name, password, and user attributes.
     * </p>
     *
     * @param signUpRequest Container for the necessary parameters to execute
     *           the SignUp service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the SignUp service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws UsernameExistsException
     * @throws InvalidLambdaResponseException
     * @throws InvalidPasswordException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SignUpResult signUp(SignUpRequest signUpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA
     * is to be removed for a particular attribute pass the attribute with
     * code delivery as null. If null list is passed, all MFA options are
     * removed.
     * </p>
     *
     * @param setUserSettingsRequest Container for the necessary parameters
     *           to execute the SetUserSettings service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the SetUserSettings service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information and metadata of the specified
     * user pool.
     * </p>
     *
     * @param describeUserPoolRequest Container for the necessary parameters
     *           to execute the DescribeUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DescribeUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     *
     * @param createUserPoolClientRequest Container for the necessary
     *           parameters to execute the CreateUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the CreateUserPoolClient service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an
     * administrator. Works on any user.
     * </p>
     *
     * @param adminGetUserRequest Container for the necessary parameters to
     *           execute the AdminGetUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminGetUser service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     *
     * @param adminEnableUserRequest Container for the necessary parameters
     *           to execute the AdminEnableUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminEnableUser service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     *
     * @param getUserRequest Container for the necessary parameters to
     *           execute the GetUser service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy
     * for the pool.
     * </p>
     *
     * @param createUserPoolRequest Container for the necessary parameters to
     *           execute the CreateUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the CreateUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any
     * user.
     * </p>
     *
     * @param adminSetUserSettingsRequest Container for the necessary
     *           parameters to execute the AdminSetUserSettings service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminSetUserSettings service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified user's attributes, including developer
     * attributes, as an administrator. Works on any user.
     * </p>
     *
     * @param adminUpdateUserAttributesRequest Container for the necessary
     *           parameters to execute the AdminUpdateUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminUpdateUserAttributes service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws AliasExistsException
     * @throws UserLambdaValidationException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     *
     * @param adminDeleteUserRequest Container for the necessary parameters
     *           to execute the AdminDeleteUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a
     * previous user.
     * </p>
     *
     * @param confirmSignUpRequest Container for the necessary parameters to
     *           execute the ConfirmSignUp service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ConfirmSignUp service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws CodeMismatchException
     * @throws InvalidLambdaResponseException
     * @throws TooManyFailedAttemptsException
     * @throws ExpiredCodeException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws AliasExistsException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute
     * name.
     * </p>
     *
     * @param getUserAttributeVerificationCodeRequest Container for the
     *           necessary parameters to execute the GetUserAttributeVerificationCode
     *           service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetUserAttributeVerificationCode service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws UserLambdaValidationException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     *
     * @param verifyUserAttributeRequest Container for the necessary
     *           parameters to execute the VerifyUserAttribute service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the VerifyUserAttribute service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The second step in the authentication flow of Secure Remote Password
     * protocol (SRP) for authenticating a user to get ID, access and refresh
     * tokens. To learn more about the first step, see
     * GetAuthenticationDetails.
     * </p>
     *
     * @param authenticateRequest Container for the necessary parameters to
     *           execute the Authenticate service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the Authenticate service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws MFAMethodNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws UserLambdaValidationException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AuthenticateResult authenticate(AuthenticateRequest authenticateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     *
     * @param updateUserAttributesRequest Container for the necessary
     *           parameters to execute the UpdateUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws CodeMismatchException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws ExpiredCodeException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws AliasExistsException
     * @throws NotAuthorizedException
     * @throws UserLambdaValidationException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a
     * specific user in the user pool.
     * </p>
     *
     * @param resendConfirmationCodeRequest Container for the necessary
     *           parameters to execute the ResendConfirmationCode service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ResendConfirmationCode service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows the developer to update the specified user pool client and
     * password policy.
     * </p>
     *
     * @param updateUserPoolClientRequest Container for the necessary
     *           parameters to execute the UpdateUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserPoolClient service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     *
     * @param addCustomAttributesRequest Container for the necessary
     *           parameters to execute the AddCustomAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AddCustomAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation
     * code. Works on any user.
     * </p>
     *
     * @param adminConfirmSignUpRequest Container for the necessary
     *           parameters to execute the AdminConfirmSignUp service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminConfirmSignUp service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidLambdaResponseException
     * @throws TooManyFailedAttemptsException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows a user to delete one's self.
     * </p>
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        