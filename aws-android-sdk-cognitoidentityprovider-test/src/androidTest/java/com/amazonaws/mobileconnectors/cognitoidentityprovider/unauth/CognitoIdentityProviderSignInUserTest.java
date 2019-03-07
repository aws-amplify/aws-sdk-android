/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.cognitoidentityprovider.unauth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.NewPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.UpdateAttributesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.utils.FlowTracker;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordResult;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmSignUpResult;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserAttributesResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserResult;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthResult;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.InternalErrorException;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidPasswordException;
import com.amazonaws.services.cognitoidentityprovider.model.NewDeviceMetadataType;
import com.amazonaws.services.cognitoidentityprovider.model.ResourceNotFoundException;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesResult;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderSignInUserTest extends CognitoIdentityProviderUnitTestBase {
    private CognitoUserPool                       testPool;
    private CognitoUser                           testUser;
   
    // Responses from service calls
    private InitiateAuthResult             TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE = null;
    private InitiateAuthResult             TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE = null;
    private RespondToAuthChallengeResult   TEST_VALID_MFA_CHALLENGE_RESPONSE = null;
    private RespondToAuthChallengeResult   TEST_VALID_SUCCESSFUL_AUTH_RESPONSE = null;
    private RespondToAuthChallengeResult   TEST_VALID_SUCCESSFUL_AUTH_WITH_NEW_DEVICE_RESPONSE = null;
    private RespondToAuthChallengeResult   TEST_VALID_DEVICE_AUTH_RESPONSE = null;
    private RespondToAuthChallengeResult   TEST_VALID_DEVICE_SRP_RESPONSE = null;
    
    // Cognito Auth types
    private final String                   TEST_USER_PASSWORD_AUTH_TYPE = "USER_PASSWORD";

    @Mock
    private AmazonCognitoIdentityProviderClient mockCSIClient;

    private AWSKeyValueStore awsKeyValueStorageUtility;
    
    @Before
    public void init() throws Exception {
        // Initialization function
        MockitoAnnotations.initMocks(this);
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
        testUser = testPool.getUser(TEST_USER_NAME);
        String challengeNameNull = null;
        
        // Set challenge (response from service) for user SRP auth
        Map<String, String> initUserSRPAuthchallengeParameters = new HashMap<String, String>();
        initUserSRPAuthchallengeParameters.put("SRP_B", BigInteger.valueOf(3).toString(16));
        initUserSRPAuthchallengeParameters.put("SALT", BigInteger.valueOf(3).toString(16));
        initUserSRPAuthchallengeParameters.put("SECRET_BLOCK", "TEST_SECRET_BLOCK");
        initUserSRPAuthchallengeParameters.put("USER_ID_FOR_SRP", TEST_USER_NAME);
        initUserSRPAuthchallengeParameters.put("USERNAME", TEST_USER_NAME);
        TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE = new InitiateAuthResult();
        TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE.setChallengeName("PASSWORD_VERIFIER");
        TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE.setSession("DummySession");
        TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE.setChallengeParameters(initUserSRPAuthchallengeParameters);
        TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE.setAuthenticationResult(null);
        
        // Set challenge (response from service) for user MFA challenge
        Map<String, String> mfaChallengeParameters = new HashMap<String, String>();
        mfaChallengeParameters.put("username", TEST_USER_NAME);
        mfaChallengeParameters.put("CODE_DELIVERY_DESTINATION", TEST_CODE_DESTINA);
        mfaChallengeParameters.put("CODE_DELIVERY_DELIVERY_MEDIUM", TEST_CODE_DEL_MED);
        TEST_VALID_MFA_CHALLENGE_RESPONSE = new RespondToAuthChallengeResult();
        TEST_VALID_MFA_CHALLENGE_RESPONSE.setChallengeName("SMS_MFA");
        TEST_VALID_MFA_CHALLENGE_RESPONSE.setSession("DummyMFASession");
        TEST_VALID_MFA_CHALLENGE_RESPONSE.setChallengeParameters(mfaChallengeParameters);
        TEST_VALID_MFA_CHALLENGE_RESPONSE.setAuthenticationResult(null);
        
        // Set challenge (response from service) for device authentication
        Map<String, String> deviceAuthChallengeParameters = new HashMap<String, String>();
        deviceAuthChallengeParameters.put("username", TEST_USER_NAME);
        TEST_VALID_DEVICE_AUTH_RESPONSE = new RespondToAuthChallengeResult();
        TEST_VALID_DEVICE_AUTH_RESPONSE.setChallengeName("DEVICE_SRP_AUTH");
        TEST_VALID_DEVICE_AUTH_RESPONSE.setChallengeParameters(deviceAuthChallengeParameters);
        TEST_VALID_DEVICE_AUTH_RESPONSE.setAuthenticationResult(null);
        
        // Set challenge (response from service) for device SRP verification
        Map<String, String> deviceSRPChallengeParameters = new HashMap<String, String>();
        deviceSRPChallengeParameters.put("SRP_B", BigInteger.valueOf(3).toString(16));
        deviceSRPChallengeParameters.put("SALT", BigInteger.valueOf(3).toString(16));
        deviceSRPChallengeParameters.put("SECRET_BLOCK", "TEST_SECRET_BLOCK");
        deviceSRPChallengeParameters.put("USERNAME", TEST_USER_NAME);
        TEST_VALID_DEVICE_SRP_RESPONSE = new RespondToAuthChallengeResult();
        TEST_VALID_DEVICE_SRP_RESPONSE.setChallengeName("DEVICE_SRP_AUTH");
        TEST_VALID_DEVICE_SRP_RESPONSE.setChallengeParameters(deviceSRPChallengeParameters);
        TEST_VALID_DEVICE_SRP_RESPONSE.setAuthenticationResult(null);
        
        // Set challenge (response from service) with tokens and no device - for when authentication is successful
        AuthenticationResultType tokensWithoutDevice = new AuthenticationResultType();
        tokensWithoutDevice.setAccessToken(getValidJWT(3600L));
        tokensWithoutDevice.setIdToken(getValidJWT(3600L));
        tokensWithoutDevice.setRefreshToken(TEST_NEW_RTOKEN);
        tokensWithoutDevice.setTokenType("DUMMY");
        tokensWithoutDevice.setExpiresIn(10);
        tokensWithoutDevice.setNewDeviceMetadata(null);
        TEST_VALID_SUCCESSFUL_AUTH_RESPONSE = new RespondToAuthChallengeResult();
        TEST_VALID_SUCCESSFUL_AUTH_RESPONSE.setChallengeName(challengeNameNull);
        TEST_VALID_SUCCESSFUL_AUTH_RESPONSE.setChallengeParameters(null);
        TEST_VALID_SUCCESSFUL_AUTH_RESPONSE.setAuthenticationResult(tokensWithoutDevice);
        
        // Set challenge (response from service) with tokens and new device - for when authentication is successful
        NewDeviceMetadataType newUserDevice = new NewDeviceMetadataType();
        newUserDevice.setDeviceKey(TEST_DEVICE_KEY);
        newUserDevice.setDeviceGroupKey(TEST_DEV_GRP_KEY);
        AuthenticationResultType tokensWithNewDevice = new AuthenticationResultType();
        tokensWithNewDevice.setAccessToken(getValidJWT(3600L));
        tokensWithNewDevice.setIdToken(getValidJWT(3600L));
        tokensWithNewDevice.setRefreshToken(TEST_NEW_RTOKEN);
        tokensWithNewDevice.setTokenType("DUMMY");
        tokensWithNewDevice.setExpiresIn(10);
        tokensWithNewDevice.setNewDeviceMetadata(newUserDevice);
        TEST_VALID_SUCCESSFUL_AUTH_WITH_NEW_DEVICE_RESPONSE = new RespondToAuthChallengeResult();
        TEST_VALID_SUCCESSFUL_AUTH_WITH_NEW_DEVICE_RESPONSE.setChallengeName(challengeNameNull);
        TEST_VALID_SUCCESSFUL_AUTH_WITH_NEW_DEVICE_RESPONSE.setChallengeParameters(null);
        TEST_VALID_SUCCESSFUL_AUTH_WITH_NEW_DEVICE_RESPONSE.setAuthenticationResult(tokensWithNewDevice);
        
        // Set challenge (response from service) for user SRP auth
        Map<String, String> initUserPasswordAuthchallengeParameters = new HashMap<String, String>();
        initUserSRPAuthchallengeParameters.put("USER_ID_FOR_SRP", TEST_USER_NAME);
        initUserSRPAuthchallengeParameters.put("USERNAME", TEST_USER_NAME);
        TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE = new InitiateAuthResult();
        TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE.setChallengeName("PASSWORD_VERIFIER");
        TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE.setSession("DummySession");
        TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE.setChallengeParameters(initUserPasswordAuthchallengeParameters);
        TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE.setAuthenticationResult(tokensWithoutDevice);

        awsKeyValueStorageUtility = getAWSKeyValueStorageUtility(testPool);
    }

    @Test
    public void tearDown() {
        awsKeyValueStorageUtility.clear();
    }
    
    // Authenticate user with user password verifier in current thread
    @Ignore
    @Test
    public void getSessionInCurrentThreadNoCachedTokensNoMFA() throws Exception {
        assertNotNull(testUser.getUserId());
        
        // Test with a user cached in shared preferences, with no cached tokens
        awsKeyValueStorageUtility.put("CognitoIdentityProvider." + TEST_CLIENT_ID + ".LastAuthUser",
                TEST_USER_NAME);

        // Set mock returns for Authentication API Calls
        // API call to start forgot-password flow
        doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE)
                .when(mockCSIClient)
                .initiateAuth(any(InitiateAuthRequest.class));
        
        // Tracker to validate the callback sequence -> callback.getAuthenticationDetails() -> onSuccess()
        final FlowTracker tracker = new FlowTracker("getAuthenticationDetails");
        System.out.println("Get session");
        testUser.getSession(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession session, CognitoDevice device){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onSuccess"));
                
                // Extract the arguments passed to the initiateAuth API call
                ArgumentCaptor<InitiateAuthRequest> argumentCaptor = ArgumentCaptor.forClass(InitiateAuthRequest.class);
                verify(mockCSIClient).initiateAuth(argumentCaptor.capture());
                InitiateAuthRequest requestSent = argumentCaptor.getValue();
                
                // Verify the arguments passed in the API call
                assertNotNull(requestSent);
                assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
                assertEquals("USER_SRP_AUTH", requestSent.getAuthFlow());
                
                // Check authentication parameters
                assertNotNull(requestSent.getAuthParameters());
                assertNotNull(requestSent.getAuthParameters().get("SRP_A"));
                assertNotNull(requestSent.getAuthParameters().get("SECRET_HASH"));
                assertNotNull(requestSent.getAuthParameters().get("USERNAME"));
                assertNotNull(requestSent.getAuthParameters().get("SRP_A"));
                
                // Check Validation parameters, input to Lambda Triggers
                assertNotNull(requestSent.getClientMetadata());
                assertEquals(2, requestSent.getClientMetadata().size());
                
                // Extract the arguments passed to the RespondToAuthChallenge API call
                ArgumentCaptor<RespondToAuthChallengeRequest> argumentCaptorA = ArgumentCaptor.forClass(RespondToAuthChallengeRequest.class);
                verify(mockCSIClient).respondToAuthChallenge(argumentCaptorA.capture());
                RespondToAuthChallengeRequest requestSentA = argumentCaptorA.getValue();
                
                // Verify the arguments passed in the API call
                assertNotNull(requestSentA);
                assertEquals(TEST_CLIENT_ID, requestSentA.getClientId());
                assertEquals("PASSWORD_VERIFIER", requestSentA.getChallengeName());
                assertNotNull(requestSentA.getSession());
                assertNotNull(requestSentA.getChallengeResponses());
                
                // Verify if we have a valid session
                assertNotNull(session);
                assertTrue(session.isValid());
                
                // Verify that the device is null
                assertNull(device);
                
                tracker.setNext("end");
            }
            
            @Override
            public void getAuthenticationDetails(AuthenticationContinuation continuation, String username){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getAuthenticationDetails"));
                
                // Check parameters
                assertNotNull(continuation);
                assertNotNull(continuation.getParameters());
                
                // Continue with authentication details
                Map<String, String> TEST_IN_VALIDATION_DATA = new HashMap<String, String>();
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_1", "Value4DummyAttribute_1");
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_2", "Value4DummyAttribute_2");
                
                AuthenticationDetails authDetails = new AuthenticationDetails(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_VALIDATION_DATA );
                tracker.setNext("onSuccess");
                continuation.setAuthenticationDetails(authDetails);

                // Set challenge response for valid 
                doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));
                doReturn(TEST_VALID_SUCCESSFUL_AUTH_RESPONSE).when(mockCSIClient).respondToAuthChallenge(any(RespondToAuthChallengeRequest.class));
                
                continuation.continueTask();
            }
            
            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getMFACode"));
            }
            
            @Override
            public void onFailure(Exception exception){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onFailure"));
            }

            @Override
            public void authenticationChallenge(
                    ChallengeContinuation continuation) {
                // Check if this method was called out of sequence
                assertTrue(tracker.check("authenticationChallenge"));

            }
        });
    }
    
    // Authenticate user with user password verifier in background thread
    // Failing due to Mockito error
    @Ignore
    @Test
    public void getSessionInBackgroundThreadNoCachedTokensNoMFA() throws Exception {
       assertNotNull(testUser.getUserId());
        
        // Test with a user cached in shared preferences, with no cached tokens
        awsKeyValueStorageUtility.put("CognitoIdentityProvider." + TEST_CLIENT_ID + ".LastAuthUser",
                TEST_USER_NAME);
        
        // Set mock returns for Authentication API Calls
        // API call to start forgot-password flow
        doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));
        
        // Tracker to validate the callback sequence -> callback.getAuthenticationDetails() -> onSuccess()
        final FlowTracker tracker = new FlowTracker("getAuthenticationDetails");
        System.out.println("Get session");
        testUser.getSessionInBackground(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession session, CognitoDevice device){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onSuccess"));
                
                // Extract the arguments passed to the initiateAuth API call
                ArgumentCaptor<InitiateAuthRequest> argumentCaptor = ArgumentCaptor.forClass(InitiateAuthRequest.class);
                verify(mockCSIClient).initiateAuth(argumentCaptor.capture());
                InitiateAuthRequest requestSent = argumentCaptor.getValue();
                
                // Verify the arguments passed in the API call
                assertNotNull(requestSent);
                assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
                assertEquals("USER_SRP_AUTH", requestSent.getAuthFlow());
                
                // Check authentication parameters
                assertNotNull(requestSent.getAuthParameters());
                assertNotNull(requestSent.getAuthParameters().get("SRP_A"));
                assertNotNull(requestSent.getAuthParameters().get("SECRET_HASH"));
                assertNotNull(requestSent.getAuthParameters().get("USERNAME"));
                assertNotNull(requestSent.getAuthParameters().get("SRP_A"));
                
                // Check Validation parameters, input to Lambda Triggers
                assertNotNull(requestSent.getClientMetadata());
                assertEquals(2, requestSent.getClientMetadata().size());
                
                // Extract the arguments passed to the RespondToAuthChallenge API call
                ArgumentCaptor<RespondToAuthChallengeRequest> argumentCaptorA = ArgumentCaptor.forClass(RespondToAuthChallengeRequest.class);
                verify(mockCSIClient).respondToAuthChallenge(argumentCaptorA.capture());
                RespondToAuthChallengeRequest requestSentA = argumentCaptorA.getValue();
                
                // Verify the arguments passed in the API call
                assertNotNull(requestSentA);
                assertEquals(TEST_CLIENT_ID, requestSentA.getClientId());
                assertEquals("PASSWORD_VERIFIER", requestSentA.getChallengeName());
                assertNotNull(requestSentA.getSession());
                assertNotNull(requestSentA.getChallengeResponses());
                
                // Verify if we have a valid session
                assertNotNull(session);
                assertTrue(session.isValid());
                
                // Verify that the device is null
                assertNull(device);
                
                tracker.setNext("end");
            }
            
            @Override
            public void getAuthenticationDetails(AuthenticationContinuation continuation, String username){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getAuthenticationDetails"));
                
                // Check parameters
                assertNotNull(continuation);
                assertNotNull(continuation.getParameters());
                
                // Continue with authentication details
                Map<String, String> TEST_IN_VALIDATION_DATA = new HashMap<String, String>();
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_1", "Value4DummyAttribute_1");
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_2", "Value4DummyAttribute_2");
                
                AuthenticationDetails authDetails = new AuthenticationDetails(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_VALIDATION_DATA );
                tracker.setNext("onSuccess");
                continuation.setAuthenticationDetails(authDetails);

                // Set challenge response for valid 
                doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));
                doReturn(TEST_VALID_SUCCESSFUL_AUTH_RESPONSE).when(mockCSIClient).respondToAuthChallenge(any(RespondToAuthChallengeRequest.class));
                
                continuation.continueTask();
            }
            
            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getMFACode"));
            }
            
            @Override
            public void onFailure(Exception exception){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onFailure"));
            }

            @Override
            public void authenticationChallenge(
                    ChallengeContinuation continuation) {
                // Check if this method was called out of sequence
                assertTrue(tracker.check("authenticationChallenge"));
                
            }
        });
    }
    
    // Clear cached tokens, when cached tokens are available
    @Test
    public void clearTokensCachedTokensAvailable() throws Exception {
        // Store tokens in shared preferences
        awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
        awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L));
        awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

        testUser.signOut();

        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken"));
        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken"));
        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken"));
    }
    
    // Clear cached tokens when no cached tokens are available
    @Test
    public void clearTokensWhenNoCachedTokens() throws Exception {
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
        testUser = testPool.getUser(TEST_USER_NAME);
        
        testUser.signOut();

        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken"));
        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken"));
        assertNull(awsKeyValueStorageUtility.get("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken"));
    }
    
    // Get user, with no cached users
    @Test
    public void getUserWithNoCachedUser() throws Exception {
        testUser = testPool.getCurrentUser();
        assertNotNull(testUser);
    }
    
    // Authenticate user with user password auth in current thread
    // Failing due to Mockito error
    @Ignore
    @Test
    public void getSessionWithUserPasswordInCurrentThreadNoCachedTokensNoMFA() throws Exception {
        testUser = testPool.getUser(TEST_USER_NAME);

        assertNotNull(testUser.getUserId());

        // Test with a user cached in shared preferences, with no cached tokens
        awsKeyValueStorageUtility.put("CognitoIdentityProvider." + TEST_CLIENT_ID + ".LastAuthUser",
                TEST_USER_NAME);

        // Set mock returns for Authentication API Calls
        // API call to start forgot-password flow
        doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));

        // Tracker to validate the callback sequence -> callback.getAuthenticationDetails() -> onSuccess()
        final FlowTracker tracker = new FlowTracker("getAuthenticationDetails");
        System.out.println("Get session");
        testUser.getSession(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession session, CognitoDevice device){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onSuccess"));

                // Extract the arguments passed to the initiateAuth API call
                ArgumentCaptor<InitiateAuthRequest> argumentCaptor = ArgumentCaptor.forClass(InitiateAuthRequest.class);
                verify(mockCSIClient).initiateAuth(argumentCaptor.capture());
                InitiateAuthRequest requestSent = argumentCaptor.getValue();

                // Verify the arguments passed in the API call
                assertNotNull(requestSent);
                assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
                assertEquals("USER_PASSWORD_AUTH", requestSent.getAuthFlow());

                // Check authentication parameters - username and password.
                assertNotNull(requestSent.getAuthParameters().get("USERNAME"));
                assertNotNull(requestSent.getAuthParameters().get("PASSWORD"));

                // Verify if we have a valid session
                assertNotNull(session);
                assertTrue(session.isValid());

                // Verify that the device is null
                assertNull(device);

                tracker.setNext("end");
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation continuation, String username){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getAuthenticationDetails"));
 
                // Check parameters
                assertNotNull(continuation);
                assertNotNull(continuation.getParameters());

                // Continue with authentication details
                Map<String, String> TEST_IN_VALIDATION_DATA = new HashMap<String, String>();
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_1", "Value4DummyAttribute_1");
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_2", "Value4DummyAttribute_2");

                AuthenticationDetails authDetails = new AuthenticationDetails(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_VALIDATION_DATA );
                authDetails.setAuthenticationType(TEST_USER_PASSWORD_AUTH_TYPE);
                tracker.setNext("onSuccess");
                continuation.setAuthenticationDetails(authDetails);

                // Set challenge response for valid 
                doReturn(TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));
                doReturn(TEST_VALID_SUCCESSFUL_AUTH_RESPONSE).when(mockCSIClient).respondToAuthChallenge(any(RespondToAuthChallengeRequest.class));

                continuation.continueTask();
            }

            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getMFACode"));
            }

            @Override
            public void onFailure(Exception exception){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onFailure"));
            }

            @Override
            public void authenticationChallenge(
                    ChallengeContinuation continuation) {
                // Check if this method was called out of sequence
                assertTrue(tracker.check("authenticationChallenge"));
            }
        });
    }

    // Authenticate user with user password auth in current thread
    // Failing due to Mockito error
    @Ignore
    @Test
    public void getSessionWithUserPasswordInBackgroundThreadNoCachedTokensNoMFA() throws Exception {
        testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
        testUser = testPool.getUser(TEST_USER_NAME);

        assertNotNull(testUser.getUserId());

        // Test with a user cached in shared preferences, with no cached tokens
        awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+".LastAuthUser", TEST_USER_NAME);

        // Set mock returns for Authentication API Calls
        // API call to start forgot-password flow
        doReturn(TEST_VALID_INITIATE_USER_SRP_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));

        // Tracker to validate the callback sequence -> callback.getAuthenticationDetails() -> onSuccess()
        final FlowTracker tracker = new FlowTracker("getAuthenticationDetails");
        System.out.println("Get session");
        testUser.getSessionInBackground(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession session, CognitoDevice device){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onSuccess"));

                // Extract the arguments passed to the initiateAuth API call
                ArgumentCaptor<InitiateAuthRequest> argumentCaptor = ArgumentCaptor.forClass(InitiateAuthRequest.class);
                verify(mockCSIClient).initiateAuth(argumentCaptor.capture());
                InitiateAuthRequest requestSent = argumentCaptor.getValue();

                // Verify the arguments passed in the API call
                assertNotNull(requestSent);
                assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
                assertEquals("USER_PASSWORD_AUTH", requestSent.getAuthFlow());

                // Check authentication parameters - username and password.
                assertNotNull(requestSent.getAuthParameters().get("USERNAME"));
                assertNotNull(requestSent.getAuthParameters().get("PASSWORD"));

                // Verify if we have a valid session
                assertNotNull(session);
                assertTrue(session.isValid());

                // Verify that the device is null
                assertNull(device);

                tracker.setNext("end");
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation continuation, String username){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getAuthenticationDetails"));

                // Check parameters
                assertNotNull(continuation);
                assertNotNull(continuation.getParameters());

                // Continue with authentication details
                Map<String, String> TEST_IN_VALIDATION_DATA = new HashMap<String, String>();
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_1", "Value4DummyAttribute_1");
                TEST_IN_VALIDATION_DATA.put("DummyAttribute_2", "Value4DummyAttribute_2");
                
                AuthenticationDetails authDetails = new AuthenticationDetails(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_VALIDATION_DATA );
                authDetails.setAuthenticationType(TEST_USER_PASSWORD_AUTH_TYPE);
                tracker.setNext("onSuccess");
                continuation.setAuthenticationDetails(authDetails);

                // Set challenge response for valid 
                doReturn(TEST_VALID_INITIATE_USER_PASSWORD_AUTH_RESPONSE).when(mockCSIClient).initiateAuth(any(InitiateAuthRequest.class));
                doReturn(TEST_VALID_SUCCESSFUL_AUTH_RESPONSE).when(mockCSIClient).respondToAuthChallenge(any(RespondToAuthChallengeRequest.class));

                continuation.continueTask();
            }

            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("getMFACode"));
            }

            @Override
            public void onFailure(Exception exception){
                // Check if this method was called out of sequence
                assertTrue(tracker.check("onFailure"));
            }

            @Override
            public void authenticationChallenge(
                    ChallengeContinuation continuation) {
                // Check if this method was called out of sequence
                assertTrue(tracker.check("authenticationChallenge"));
            }
        });
    }

    // Create valid access tokens
    public String getValidJWT(long expiryInSecs){
        long epoch = System.currentTimeMillis()/1000L + expiryInSecs;
        String accessToken_p1_Base64 = "eyJ0eXAiOiAiSldUIiwgImFsZyI6IlJTMjU2In0=";
        String accessToken_p3_Base64 = "e0VuY3J5cHRlZF9LZXl9";
        String accessToken_p2_Str = "{\"iss\": \"userPoolId\",\"sub\": \"my@email.com\",\"aud\": \"https:aws.cognito.something.something.com\",\"exp\": \"" + String.valueOf(epoch).toString() + "\"}"; 
        byte[] accessToken_p2_UTF8 = accessToken_p2_Str.getBytes(StringUtils.UTF8);
        String accessToken_p2_Base64 = Base64.encodeToString(accessToken_p2_UTF8, Base64.DEFAULT);
        String validAccessToken = accessToken_p1_Base64+"."+accessToken_p2_Base64+"."+accessToken_p3_Base64;
        return validAccessToken;
    }
}
