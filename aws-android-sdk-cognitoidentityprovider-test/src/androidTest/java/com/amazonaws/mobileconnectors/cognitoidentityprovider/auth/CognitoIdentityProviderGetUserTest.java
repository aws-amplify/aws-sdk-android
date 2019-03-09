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

package com.amazonaws.mobileconnectors.cognitoidentityprovider.auth;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmSignUpResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserResult;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderGetUserTest extends CognitoIdentityProviderUnitTestBase {
	private CognitoUserPool	testPool;
    private CognitoUser testUser;
    private GetUserResult TEST_VALID_GET_USER_RESULT = null;

    @Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;


    @Before
	public void init() throws Exception {
		// Initialization functions
		MockitoAnnotations.initMocks(this);
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
	}

	@Test
	public void getUserPoolId() {
		assertNotNull(testUser.getUserPoolId());
	}

    // Get user attributes - in background
 	@Test
 	public void getUserAttributeInBackgroundWithCachedTokens(){
 		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
 		testUser = testPool.getUser(TEST_USER_NAME);

 		// Set mock result for the change password request API call
 		doReturn(TEST_VALID_GET_USER_RESULT).when(mockCSIClient).getUser(any(GetUserRequest.class));

 		// Store tokens in shared preferences
 		SharedPreferences sharedPreferences =
 				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L)).commit();
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L)).commit();
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN).commit();

 		testUser.getDetailsInBackground(new GetDetailsHandler(){
 			@Override
 			public void onSuccess(CognitoUserDetails details) {
 				// Extract the arguments passed to get user API call
 				ArgumentCaptor<GetUserRequest> argumentCaptor = ArgumentCaptor.forClass(GetUserRequest.class);
 		        verify(mockCSIClient).getUser(argumentCaptor.capture());
 		        GetUserRequest requestSent = argumentCaptor.getValue();

 		        // Verify the arguments passed to the API call
 		        assertNotNull(requestSent);
 		        assertNotNull(requestSent.getAccessToken());

 		        // Verify result
 		        assertNotNull(details);
 			}

 			@Override
 			public void onFailure(Exception exception) {
 				assertNotNull(exception);
 			}
 		});
 	}

 	 // Get user attributes -
 	@Test
 	public void getUserAttributeInCurrentThreadWithCachedTokens(){
 		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
 		testUser = testPool.getUser(TEST_USER_NAME);

 		// Set mock result for the change password request API call
 		doReturn(TEST_VALID_GET_USER_RESULT).when(mockCSIClient).getUser(any(GetUserRequest.class));

 		// Store tokens in shared preferences
 		SharedPreferences sharedPreferences =
 				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L)).commit();
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L)).commit();
 		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN).commit();

 		testUser.getDetails(new GetDetailsHandler(){
 			@Override
 			public void onSuccess(CognitoUserDetails details) {
 				// Extract the arguments passed to get user API call
 				ArgumentCaptor<GetUserRequest> argumentCaptor = ArgumentCaptor.forClass(GetUserRequest.class);
 		        verify(mockCSIClient).getUser(argumentCaptor.capture());
 		        GetUserRequest requestSent = argumentCaptor.getValue();

 		        // Verify the arguments passed to the API call
 		        assertNotNull(requestSent);
 		        assertNotNull(requestSent.getAccessToken());

 		        // Verify result
 		        assertNotNull(details);
 			}

 			@Override
 			public void onFailure(Exception exception) {
 				assertNotNull(exception);
 			}
 		});
 	}

 	@Test
 	public void getUserAttributeInBackgroundWithNoCachedTokens(){
 		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
 		testUser = testPool.getUser(TEST_USER_NAME);

 		// Set mock result for the change password request API call
 		doReturn(TEST_VALID_GET_USER_RESULT).when(mockCSIClient).getUser(any(GetUserRequest.class));

 		testUser.getDetailsInBackground(new GetDetailsHandler(){
 			@Override
 			public void onSuccess(CognitoUserDetails details) {
 				// Extract the arguments passed to get user API call
 		        assertTrue(false);
 			}

 			@Override
 			public void onFailure(Exception exception) {
 				assertNotNull(exception);
 			}
 		});
 	}

 	@Test
 	public void getUserAttributeInCurrentThreadWithNoCachedTokens(){
 		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
 		testUser = testPool.getUser(TEST_USER_NAME);

 		// Set mock result for the change password request API call
 		doReturn(TEST_VALID_GET_USER_RESULT).when(mockCSIClient).getUser(any(GetUserRequest.class));

 		testUser.getDetails(new GetDetailsHandler(){
 			@Override
 			public void onSuccess(CognitoUserDetails details) {
 				// Extract the arguments passed to get user API call
 		        assertTrue(false);
 			}

 			@Override
 			public void onFailure(Exception exception) {
 				assertNotNull(exception);
 			}
 		});
 	}

 	// Get user attributes - in background
  	@Test
  	public void getUserAttributeInBackgroundWithCachedTokensServiceException(){
  		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
  		testUser = testPool.getUser(TEST_USER_NAME);

  		// Set mock result for the change password request API call
  		InvalidParameterException exception = new InvalidParameterException("registration failed");
		doThrow(exception).when(mockCSIClient).getUser(any(GetUserRequest.class));

  		// Store tokens in shared preferences
  		SharedPreferences sharedPreferences =
  				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L)).commit();
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L)).commit();
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN).commit();

  		testUser.getDetailsInBackground(new GetDetailsHandler(){
  			@Override
  			public void onSuccess(CognitoUserDetails details) {
  				// Extract the arguments passed to get user API call
  				ArgumentCaptor<GetUserRequest> argumentCaptor = ArgumentCaptor.forClass(GetUserRequest.class);
  		        verify(mockCSIClient).getUser(argumentCaptor.capture());
  		        GetUserRequest requestSent = argumentCaptor.getValue();

  		        // Verify the arguments passed to the API call
  		        assertNotNull(requestSent);
  		        assertNotNull(requestSent.getAccessToken());

  		        // Verify result
  		        assertNotNull(details);
  			}

  			@Override
  			public void onFailure(Exception exception) {
  				assertNotNull(exception);
  			}
  		});
  	}

  	 // Get user attributes -
  	@Test
  	public void getUserAttributeInCurrentThreadWithCachedTokensServiceException(){
  		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
  		testUser = testPool.getUser(TEST_USER_NAME);

  		// Set mock result for the change password request API call
  		InvalidParameterException exception = new InvalidParameterException("registration failed");
		doThrow(exception).when(mockCSIClient).getUser(any(GetUserRequest.class));

  		// Store tokens in shared preferences
  		SharedPreferences sharedPreferences =
  				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L)).commit();
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L)).commit();
  		sharedPreferences.edit().putString("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN).commit();

  		testUser.getDetails(new GetDetailsHandler(){
  			@Override
  			public void onSuccess(CognitoUserDetails details) {
  				// Extract the arguments passed to get user API call
  				ArgumentCaptor<GetUserRequest> argumentCaptor = ArgumentCaptor.forClass(GetUserRequest.class);
  		        verify(mockCSIClient).getUser(argumentCaptor.capture());
  		        GetUserRequest requestSent = argumentCaptor.getValue();

  		        // Verify the arguments passed to the API call
  		        assertNotNull(requestSent);
  		        assertNotNull(requestSent.getAccessToken());

  		        // Verify result
  		        assertNotNull(details);
  			}

  			@Override
  			public void onFailure(Exception exception) {
  				assertNotNull(exception);
  			}
  		});
  	}

 // Create valid access tokens
 	public String getValidJWT(long expiryInSecs){
 		long epoch = System.currentTimeMillis()/1000L;
 		epoch = epoch + expiryInSecs;
 		String accessToken_p1_Base64 = "eyJ0eXAiOiAiSldUIiwgImFsZyI6IlJTMjU2In0=";
 		String accessToken_p3_Base64 = "e0VuY3J5cHRlZF9LZXl9";
 		String accessToken_p2_Str = "{\"iss\": \"userPoolId\",\"sub\": \"my@email.com\",\"aud\": \"https:aws.cognito.com\",\"exp\": \"" + String.valueOf(epoch).toString() + "\"}";
        byte[] accessToken_p2_UTF8 = accessToken_p2_Str.getBytes(StringUtils.UTF8);
 		//String accessToken_p2_Base64 = Base64.encodeToString(accessToken_p2_UTF8, Base64.DEFAULT);
 		String accessToken_p2_Base64 = new String(Base64.encode(accessToken_p2_UTF8, Base64.DEFAULT));
 		String validAccessToken = accessToken_p1_Base64+"."+accessToken_p2_Base64+"."+accessToken_p3_Base64;
 		return validAccessToken;
 	}
}
