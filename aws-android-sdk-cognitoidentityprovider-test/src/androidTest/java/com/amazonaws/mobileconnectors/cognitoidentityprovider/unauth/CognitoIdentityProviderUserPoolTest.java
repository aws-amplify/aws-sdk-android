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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoPinpointSharedContext;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.utils.*;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderUserPoolTest extends CognitoIdentityProviderUnitTestBase {
	// Constants
	private CognitoUserAttributes          	TEST_IN_USER_ATTRIBUTES_LIST;
    private Map<String, String>            	TEST_IN_VALIDATION_DATA;
    private SignUpResult			   	   	TEST_REGISTER_USER_RESPONSE;
    private CognitoUserPool				   	testPool;

    // Variables to check results
    private boolean expected_result_boolean;
	
	@Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;

	private boolean firstTime = true;

	private AWSKeyValueStore awsKeyValueStorageUtility;

	@Before
	public void init() {
		if (firstTime){
			// Initialization
			MockitoAnnotations.initMocks(this);		
			testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET);
			awsKeyValueStorageUtility = getAWSKeyValueStorageUtility(testPool);

			// Data for tests
			TEST_IN_USER_ATTRIBUTES_LIST = new CognitoUserAttributes();
			TEST_IN_USER_ATTRIBUTES_LIST.addAttribute("email", TEST_USER_EMAIL);
			TEST_IN_USER_ATTRIBUTES_LIST.addAttribute("phone_number", TEST_USER_PHONE);

			TEST_IN_VALIDATION_DATA = new HashMap<String, String>();
			TEST_IN_VALIDATION_DATA.put("DummyAttribute_1", "Value4DummyAttribute_1");
			TEST_IN_VALIDATION_DATA.put("DummyAttribute_2", "Value4DummyAttribute_2");
			TEST_IN_VALIDATION_DATA.put("DummyAttribute_3", "Value4DummyAttribute_3");
			
			TEST_REGISTER_USER_RESPONSE = new SignUpResult();
			TEST_REGISTER_USER_RESPONSE.setUserConfirmed(true);
			TEST_REGISTER_USER_RESPONSE.setCodeDeliveryDetails(TEST_CODE_DELIVERY_DETAIL);

			firstTime = false;
		}
	}

	@Test
	public void getUserPool() throws Exception {
		assertEquals(TEST_USER_POOL, testPool.getUserPoolId());
	}
	
	@Test
	public void getClientId() throws Exception {
		assertEquals(TEST_CLIENT_ID, testPool.getClientId());
	}
	
	@Test
	public void getUser() throws Exception {
		CognitoUser user = testPool.getUser(TEST_USER_NAME);
		assertNotNull(user);
		
		String username = user.getUserId();
		assertNotNull(username);
		assertEquals(TEST_USER_NAME, username);
	}
	
	@Test
	public void getUserNull() throws Exception {
		CognitoUser user = testPool.getUser(null);
		assertNotNull(user);
		assertNull(user.getUserId());
	}
	
	@Test
	public void getEmptyUser() throws Exception {
		CognitoUser user = testPool.getUser("");
		assertNotNull(user);
		assertNull(user.getUserId());
	}
	
	@Test
	public void newUserPool(){
		// Check user pool constructors
		CognitoUserPool pool = new CognitoUserPool(appContext, 
			TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, new ClientConfiguration());

		assertNotNull(pool);
		assertNotNull(pool.getUserPoolId());
		assertEquals(TEST_USER_POOL, pool.getUserPoolId());
		assertNotNull(pool.getClientId());
		assertEquals(TEST_CLIENT_ID, pool.getClientId());

		CognitoUserPool pool2 = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET);
		assertNotNull(pool2);
		assertNotNull(pool2.getUserPoolId());
		assertEquals(TEST_USER_POOL, pool2.getUserPoolId());
		assertNotNull(pool2.getClientId());
		assertEquals(TEST_CLIENT_ID, pool2.getClientId());
	}
	
	@Test
	public void newUserPoolWithPinpointWithoutCachedApp() {
		// Test new user pool creation with PP app id.
		CognitoUserPool pool = new CognitoUserPool(appContext, 
				TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, new ClientConfiguration(), TEST_AWS_REGION_1, TEST_PP_APP_ID_1);
			assertNotNull(pool);
			assertNotNull(pool.getUserPoolId());
			assertEquals(TEST_USER_POOL, pool.getUserPoolId());
			assertNotNull(pool.getClientId());
			assertEquals(TEST_CLIENT_ID, pool.getClientId());
	}
	
	@Test
	public void newUserPoolWithPinpointWithCachedApp() {
		// Test new user pool creation with PP app id.
		
		// Test shared Pinpoint context
		awsKeyValueStorageUtility = new AWSKeyValueStore(
				InstrumentationRegistry.getTargetContext(),
				TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX,
				true);
		awsKeyValueStorageUtility.put("UNIQUE_ID_KEY", TEST_PP_ENDPOINT_1);
		
		CognitoUserPool pool = new CognitoUserPool(appContext, 
				TEST_USER_POOL,
				TEST_CLIENT_ID,
				TEST_CLIENT_SECRET,
				new ClientConfiguration(),
				TEST_AWS_REGION_1,
				TEST_PP_APP_ID_1);
			assertNotNull(pool);
			assertNotNull(pool.getUserPoolId());
			assertEquals(TEST_USER_POOL, pool.getUserPoolId());
			assertNotNull(pool.getClientId());
			assertEquals(TEST_CLIENT_ID, pool.getClientId());
	}
	
	@Test
	public void cachedUser() {
		// Test with a user cached in shared preferences
		awsKeyValueStorageUtility.put("CognitoIdentityProvider." + TEST_CLIENT_ID + ".LastAuthUser",
				TEST_USER_NAME);
		
		CognitoUser user = testPool.getCurrentUser();
		
		assertNotNull(user);
		String username = user.getUserId();
		assertEquals(TEST_USER_NAME, username);
	}
	
	@Test
	public void signUpUserInCurrentThread() throws Exception {
		testPool =  new CognitoUserPool(appContext,
				TEST_USER_POOL,
				TEST_CLIENT_ID,
				TEST_CLIENT_SECRET,
				mockCSIClient);
				
		doReturn(TEST_REGISTER_USER_RESPONSE).when(mockCSIClient).signUp(any(SignUpRequest.class));
		
		expected_result_boolean = true;
		testPool.signUp(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_USER_ATTRIBUTES_LIST, null, new SignUpHandler(){

			@Override
			public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
				
				// Verify the arguments
				ArgumentCaptor<SignUpRequest> argumentCaptor = ArgumentCaptor.forClass(SignUpRequest.class);
		        verify(mockCSIClient).signUp(argumentCaptor.capture());

		        SignUpRequest requestSent = argumentCaptor.getValue();
		        assertNotNull(requestSent);
		        assertEquals(TEST_USER_NAME, requestSent.getUsername());
		        assertEquals(TEST_USER_PASSWORD, requestSent.getPassword());
		        assertNotNull(requestSent.getUserAttributes());
		        assertEquals(2, requestSent.getUserAttributes().size());
		        assertNull(requestSent.getValidationData());
		        
		        // Verify results
				assertNotNull(user);
				assertNotNull(signUpState);
				assertNotNull(var3);
				assertEquals(TEST_USER_NAME, user.getUserId());
				assertEquals(signUpState, expected_result_boolean);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNull(exception);
			}
		});
	}

	@Test
    public void signUpUserWithPPInCurrentThread() throws Exception {
	    // Test shared Pinpoint context
		InstrumentationRegistry.getTargetContext()
				.getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE)
				.edit()
				.putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_1)
				.apply();
        
	    // Test new user pool creation with PP app id.
        CognitoUserPool testPool = 
                new CognitoUserPool(appContext,
						TEST_USER_POOL,
						TEST_CLIENT_ID,
						TEST_CLIENT_SECRET,
						mockCSIClient,
						TEST_PP_APP_ID_1);
                
        doReturn(TEST_REGISTER_USER_RESPONSE).when(mockCSIClient).signUp(any(SignUpRequest.class));
        
        expected_result_boolean = true;
        testPool.signUp(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_USER_ATTRIBUTES_LIST, null, new SignUpHandler(){

            @Override
            public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
                
                // Verify the arguments
                ArgumentCaptor<SignUpRequest> argumentCaptor = ArgumentCaptor.forClass(SignUpRequest.class);
                verify(mockCSIClient).signUp(argumentCaptor.capture());

                SignUpRequest requestSent = argumentCaptor.getValue();
                assertNotNull(requestSent);
                assertEquals(TEST_USER_NAME, requestSent.getUsername());
                assertEquals(TEST_USER_PASSWORD, requestSent.getPassword());
                assertNotNull(requestSent.getUserAttributes());
                assertEquals(2, requestSent.getUserAttributes().size());
                assertNull(requestSent.getValidationData());
                assertNotNull(requestSent.getAnalyticsMetadata());
                assertEquals(TEST_PP_ENDPOINT_1, requestSent.getAnalyticsMetadata().getAnalyticsEndpointId());
                
                // Verify results
                assertNotNull(user);
                assertNotNull(signUpState);
                assertNotNull(var3);
                assertEquals(TEST_USER_NAME, user.getUserId());
                assertEquals(signUpState, expected_result_boolean);
            }

            @Override
            public void onFailure(Exception exception) {
                assertNull(exception);
            }
        });
    }
	
	@Test
    public void signUpUserWithoutPPInCurrentThread() throws Exception {
        // Test shared Pinpoint context
        awsKeyValueStorageUtility.put(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_1);
        
        // Test new user pool creation with PP app id.
        CognitoUserPool testPool = 
                new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
                
        doReturn(TEST_REGISTER_USER_RESPONSE).when(mockCSIClient).signUp(any(SignUpRequest.class));
        
        expected_result_boolean = true;
        testPool.signUp(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_USER_ATTRIBUTES_LIST, null, new SignUpHandler(){

            @Override
            public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
                
                // Verify the arguments
                ArgumentCaptor<SignUpRequest> argumentCaptor = ArgumentCaptor.forClass(SignUpRequest.class);
                verify(mockCSIClient).signUp(argumentCaptor.capture());

                SignUpRequest requestSent = argumentCaptor.getValue();
                assertNotNull(requestSent);
                assertEquals(TEST_USER_NAME, requestSent.getUsername());
                assertEquals(TEST_USER_PASSWORD, requestSent.getPassword());
                assertNotNull(requestSent.getUserAttributes());
                assertEquals(2, requestSent.getUserAttributes().size());
                assertNull(requestSent.getValidationData());
                assertNull(requestSent.getAnalyticsMetadata());
                
                // Verify results
                assertNotNull(user);
                assertNotNull(signUpState);
                assertNotNull(var3);
                assertEquals(TEST_USER_NAME, user.getUserId());
                assertEquals(signUpState, expected_result_boolean);
            }

            @Override
            public void onFailure(Exception exception) {
                assertNull(exception);
            }
        });
    }
	
	@Test
	public void signUpUserInBackgroundThread() throws Exception {
		testPool =  new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
				
		doReturn(TEST_REGISTER_USER_RESPONSE).when(mockCSIClient).signUp(any(SignUpRequest.class));
		
		expected_result_boolean = true;
		testPool.signUpInBackground(TEST_USER_NAME, TEST_USER_PASSWORD, TEST_IN_USER_ATTRIBUTES_LIST, TEST_IN_VALIDATION_DATA, new SignUpHandler(){

			@Override
			public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
				
				// Verify the arguments
				ArgumentCaptor<SignUpRequest> argumentCaptor = ArgumentCaptor.forClass(SignUpRequest.class);
		        verify(mockCSIClient).signUp(argumentCaptor.capture());

		        SignUpRequest requestSent = argumentCaptor.getValue();
		        assertNotNull(requestSent);
		        assertEquals(TEST_USER_NAME, requestSent.getUsername());
		        assertEquals(TEST_USER_PASSWORD, requestSent.getPassword());
		        assertNotNull(requestSent.getUserAttributes());
		        assertEquals(2, requestSent.getUserAttributes().size());
		        assertNotNull(requestSent.getValidationData());
		        assertEquals(3, requestSent.getValidationData().size());
		        
				assertNotNull(user);
				assertNotNull(signUpState);
				assertNotNull(var3);
				assertEquals(TEST_USER_NAME, user.getUserId());
				assertEquals(signUpState, expected_result_boolean);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNull(exception);
			}
		});
	}
	
	// Register with invalid password
	@Test
	public void signUpPasswordException() throws Exception {
		testPool =  new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		
		InvalidParameterException exception = new InvalidParameterException("registration failed");
		doThrow(exception).when(mockCSIClient).signUp(any(SignUpRequest.class));
		
		testPool.signUp(TEST_USER_NAME, "null"
				, TEST_IN_USER_ATTRIBUTES_LIST, TEST_IN_VALIDATION_DATA, new SignUpHandler(){

			@Override
			public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
				assertNotNull(user);
				assertNotNull(signUpState);
				assertEquals(TEST_USER_NAME, user.getUserId());
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof InvalidParameterException);
			}
		});
	}
	
	// Register with invalid clientId
	@Test
	public void signUpResourceNotFoundException() throws Exception {
		testPool =  new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		ResourceNotFoundException exception = new ResourceNotFoundException("registration failed");
		doThrow(exception).when(mockCSIClient).signUp(any(SignUpRequest.class));
		
		testPool.signUp(TEST_USER_NAME, "null"
				, TEST_IN_USER_ATTRIBUTES_LIST, TEST_IN_VALIDATION_DATA, new SignUpHandler(){

			@Override
			public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
				assertNotNull(user);
				assertEquals(TEST_USER_NAME, user.getUserId());
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof ResourceNotFoundException);
			}
		});
	}
	
	// Sign-up failure
	@Test
	public void signUpInBackgroundUnexpectedLambdaException() throws Exception {
		testPool =  new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		UnexpectedLambdaException exception = new UnexpectedLambdaException("registration failed");
		doThrow(exception).when(mockCSIClient).signUp(any(SignUpRequest.class));
		
		testPool.signUpInBackground(TEST_USER_NAME, "null"
				, TEST_IN_USER_ATTRIBUTES_LIST, TEST_IN_VALIDATION_DATA, new SignUpHandler(){

			@Override
			public void onSuccess(CognitoUser user, boolean signUpState, CognitoUserCodeDeliveryDetails var3) {
				assertNotNull(user);
				assertEquals(TEST_USER_NAME, user.getUserId());
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof UnexpectedLambdaException);
			}
		});
	}
}