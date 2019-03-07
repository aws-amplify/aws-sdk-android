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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.utils.FlowTracker;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordResult;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderChangePasswordInstrumentedTest extends CognitoIdentityProviderUnitTestBase {
	private CognitoUserPool				   	testPool;
    private CognitoUser					   	testUser;
    private ChangePasswordResult		   	TEST_CHANGE_PASSWORD_RESPONSE = null;
    
    @Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;

    private AWSKeyValueStore awsKeyValueStorageUtility;
    
    @Before
	public void init() {
		// Initialization functions
		MockitoAnnotations.initMocks(this);
        testPool = new CognitoUserPool(appContext,
                TEST_USER_POOL,
                TEST_CLIENT_ID,
                TEST_CLIENT_SECRET,
                mockCSIClient);
		awsKeyValueStorageUtility = getAWSKeyValueStorageUtility(testPool);
	}
    
    // Test change password, with valid tokens - in background
 	@Test
 	public void changePasswordInBackgroundWithCachedTokens() throws Exception {
 		testUser = testPool.getUser(TEST_USER_NAME);
 		
 		// Set mock result for the change password request API call
 		doReturn(TEST_CHANGE_PASSWORD_RESPONSE).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
 		
 		// Store tokens in shared preferences through AWSKeyStore
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L));
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

 		final FlowTracker tracker = new FlowTracker("onSuccess");
 		tracker.activate();
 		testUser.changePasswordInBackground(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
 			@Override
 			public void onSuccess() {
 				assertTrue(tracker.check("onSuccess"));
 				ArgumentCaptor<ChangePasswordRequest> argumentCaptor = ArgumentCaptor.forClass(ChangePasswordRequest.class);
 		        verify(mockCSIClient).changePassword(argumentCaptor.capture());
 		        ChangePasswordRequest requestSent = argumentCaptor.getValue();
 		        
 		        assertNotNull(requestSent);
 		        assertEquals(TEST_USER_PASSWORD, requestSent.getPreviousPassword());
 		        assertEquals(TEST_USER_NEW_PASS, requestSent.getProposedPassword());
 		        assertNotNull(requestSent.getAccessToken());
 			}

 			@Override
 			public void onFailure(Exception exception) {
 				assertTrue(tracker.check("onFailure"));
 				assertNull(exception);
 			}
 		});
 	}
 	
 	// Test change password, with valid tokens - in current thread
  	@Test
  	public void changePasswordInCurrentThreadWithCachedTokens() throws Exception {
  		testPool.setPersistenceEnabled(false);
  		testUser = testPool.getUser(TEST_USER_NAME);
  		
  		// Set mock result for the change password request API call
  		doReturn(TEST_CHANGE_PASSWORD_RESPONSE).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
  		
  		// Store tokens in shared preferences
  		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
  		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L));
  		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

  		final FlowTracker tracker = new FlowTracker("onSuccess");
  		tracker.activate();
  		testUser.changePassword(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
  			@Override
  			public void onSuccess() {
  				assertTrue(tracker.check("onSuccess"));
  				ArgumentCaptor<ChangePasswordRequest> argumentCaptor = ArgumentCaptor.forClass(ChangePasswordRequest.class);
  		        verify(mockCSIClient).changePassword(argumentCaptor.capture());
  		        ChangePasswordRequest requestSent = argumentCaptor.getValue();
  		        
  		        assertNotNull(requestSent);
  		        assertEquals(TEST_USER_PASSWORD, requestSent.getPreviousPassword());
  		        assertEquals(TEST_USER_NEW_PASS, requestSent.getProposedPassword());
  		        assertNotNull(requestSent.getAccessToken());
  			}

  			@Override
  			public void onFailure(Exception exception) {
  				assertTrue(tracker.check("onFailure"));
  				assertNull(exception);
  			}
  		});
  	}
  	
  	// Test change password, exception when run in current thread
   	@Test
   	public void changePasswordInCurrentThreadWithCachedTokensException() throws Exception {
   		testUser = testPool.getUser(TEST_USER_NAME);
   		
   		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
   		
   		// Store tokens in shared preferences
   		SharedPreferences sharedPreferences = 
   				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(360000L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(360000L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

   		final FlowTracker tracker = new FlowTracker("onFailure");
   		tracker.activate();
   		testUser.changePassword(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
   			@Override
   			public void onSuccess() {
   				assertTrue(tracker.check("onSuccess"));
   			}

   			@Override
   			public void onFailure(Exception exception) {
   				
   				assertTrue(tracker.check("onFailure"));
   				
   				ArgumentCaptor<ChangePasswordRequest> argumentCaptor = ArgumentCaptor.forClass(ChangePasswordRequest.class);
   		        verify(mockCSIClient).changePassword(argumentCaptor.capture());
   		        ChangePasswordRequest requestSent = argumentCaptor.getValue();
   		        
   		        assertNotNull(requestSent);
   		        assertEquals(TEST_USER_PASSWORD, requestSent.getPreviousPassword());
   		        assertEquals(TEST_USER_NEW_PASS, requestSent.getProposedPassword());
   		        assertNotNull(requestSent.getAccessToken());

   				assertNotNull(exception);
   			}
   		});
   	}
 	
   	@Test
   	public void changePasswordInBackgroundThreadWithNoCachedTokens() throws Exception {
   		testUser = testPool.getUser(TEST_USER_NAME);
   		
   		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
   		
   		final FlowTracker tracker = new FlowTracker("onFailure");
   		tracker.activate();
   		testUser.changePasswordInBackground(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
   			@Override
   			public void onSuccess() {
   				assertTrue(tracker.check("onSuccess"));
   			}

   			@Override
   			public void onFailure(Exception exception) {
   				
   				assertTrue(tracker.check("onFailure"));

   				assertNotNull(exception);
   			}
   		});
   	}
   	
   	@Test
   	public void changePasswordInBackgroundWithExpiredCachedTokensException() throws Exception {
   		testUser = testPool.getUser(TEST_USER_NAME);
   		
   		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
   		
   		// Store tokens in shared preferences
   		SharedPreferences sharedPreferences = 
   				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(-3600L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(-3600L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

   		final FlowTracker tracker = new FlowTracker("onFailure");
   		tracker.activate();
   		testUser.changePasswordInBackground(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
   			@Override
   			public void onSuccess() {
   				assertTrue(tracker.check("onSuccess"));
   			}

   			@Override
   			public void onFailure(Exception exception) {
   				
   				assertTrue(tracker.check("onFailure"));
   				assertNotNull(exception);
   			}
   		});
   	}
   	
   	@Test
   	public void changePasswordInCurrentWithNoCachedTokens() throws Exception {
   		testUser = testPool.getUser(TEST_USER_NAME);
   		
   		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
   		
   		final FlowTracker tracker = new FlowTracker("onFailure");
   		tracker.activate();
   		testUser.changePasswordInBackground(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
   			@Override
   			public void onSuccess() {
   				assertTrue(tracker.check("onSuccess"));
   			}

   			@Override
   			public void onFailure(Exception exception) {
   				
   				assertTrue(tracker.check("onFailure"));

   				assertNotNull(exception);
   			}
   		});
   	}
   	
   	@Test
   	public void changePasswordInCurrentWithExpiredCachedTokensException() throws Exception {
   		testUser = testPool.getUser(TEST_USER_NAME);
   		
   		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).changePassword(any(ChangePasswordRequest.class));
   		
   		// Store tokens in shared preferences
   		SharedPreferences sharedPreferences = 
   				appContext.getSharedPreferences("CognitoIdentityProviderCache", Context.MODE_PRIVATE);
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(-3600L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(-3600L));
   		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);

   		final FlowTracker tracker = new FlowTracker("onFailure");
   		tracker.activate();
   		testUser.changePasswordInBackground(TEST_USER_PASSWORD, TEST_USER_NEW_PASS, new GenericHandler() {
   			@Override
   			public void onSuccess() {
   				assertTrue(tracker.check("onSuccess"));
   			}

   			@Override
   			public void onFailure(Exception exception) {
   				 
   				assertTrue(tracker.check("onFailure"));
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