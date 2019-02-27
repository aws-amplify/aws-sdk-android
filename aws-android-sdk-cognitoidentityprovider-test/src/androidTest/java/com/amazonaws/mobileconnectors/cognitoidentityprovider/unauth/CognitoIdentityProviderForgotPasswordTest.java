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

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.utils.*;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import android.support.test.runner.AndroidJUnit4;


import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderForgotPasswordTest extends CognitoIdentityProviderUnitTestBase {
	// Constants
	private ForgotPasswordResult   			TEST_FORGOT_PASSWORD_RESPONSE = null;
	private ForgotPasswordRequest  			TEST_FORGOT_PASSWORD_REQUEST = null;
	private ConfirmForgotPasswordResult     TEST_CONFIRM_PASSWORD_RESPONSE = null;
	private ConfirmForgotPasswordRequest    TEST_CONFIRM_PASSWORD_REQUEST = null;
	private CognitoUserPool				   	testPool;
    private CognitoUser					   	testUser;

    // Variables to check results
    private boolean expected_result_boolean;
	
	@Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;

	@Before
	public void init() {
		// Initialization functions
		MockitoAnnotations.initMocks(this);
		
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Set Forgot password result
		TEST_FORGOT_PASSWORD_RESPONSE = new ForgotPasswordResult();
		TEST_FORGOT_PASSWORD_RESPONSE.setCodeDeliveryDetails(new CodeDeliveryDetailsType().withDestination("TestDestination").withDeliveryMedium("TestMedium").withAttributeName("TestAttribute"));
	}

	@Test
	public void forgotPasswordInBackground() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		final FlowTracker tracker;
		tracker = new FlowTracker("getResetCode");
		tracker.activate();
		
		doReturn(TEST_FORGOT_PASSWORD_RESPONSE).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));
		
		testUser.forgotPasswordInBackground(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	tracker.setNext("onSuccess");
		    	doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}

	@Test
	public void forgotPasswordInCurrentThread() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);

		final FlowTracker tracker;
		tracker = new FlowTracker("getResetCode");
		tracker.activate();

		doReturn(TEST_FORGOT_PASSWORD_RESPONSE).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));

		testUser.forgotPassword(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	tracker.setNext("onSuccess");
		    	doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}
	
	@Test
	public void forgotPasswordInBackgroundThreadInvalidUser() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));
		
		// Except to fail
		final FlowTracker tracker;
		tracker = new FlowTracker("onFailure");
		tracker.activate();
		
		testUser.forgotPasswordInBackground(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	tracker.setNext("onSuccess");
		    	doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}
	
	@Test
	public void forgotPasswordInCurrentThreadInvalidUser() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Set mock result for the change password request API call
   		InvalidParameterException exception = new InvalidParameterException("password change request failed");
		doThrow(exception).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));
		
		// Except to fail
		final FlowTracker tracker;
		tracker = new FlowTracker("onFailure");
		tracker.activate();
		
		testUser.forgotPassword(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	tracker.setNext("onSuccess");
		    	doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}
	
	@Test
	public void forgotPasswordInBackgroundThreadWrongCode() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		final FlowTracker tracker;
		tracker = new FlowTracker("getResetCode");
		tracker.activate();
		
		doReturn(TEST_FORGOT_PASSWORD_RESPONSE).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));
		
		testUser.forgotPasswordInBackground(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	// Except to fail
		    	tracker.setNext("onFailure");
		    	InvalidParameterException exception = new InvalidParameterException("password change request failed");
				doThrow(exception).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}
	
	@Test
	public void forgotPasswordInCurrentThreadWrongCode() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		final FlowTracker tracker;
		tracker = new FlowTracker("getResetCode");
		tracker.activate();
		
		doReturn(TEST_FORGOT_PASSWORD_RESPONSE).when(mockCSIClient).forgotPassword(any(ForgotPasswordRequest.class));
		
		testUser.forgotPassword(new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
		    	assertTrue(tracker.check("getResetCode"));
		    	// Except to fail
		    	tracker.setNext("onFailure");
		    	InvalidParameterException exception = new InvalidParameterException("password change request failed");
				doThrow(exception).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));
		    	var1.setPassword(TEST_USER_PASSWORD);
		    	var1.setVerificationCode(TEST_CODE);
		    	var1.continueTask();
		    }

			public void onFailure(Exception var1) {
		    	assertTrue(tracker.check("onFailure"));
		    }
		});
	}

	@Test
	public void confirmPasswordInCurrentThread() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);

		final FlowTracker tracker;
		tracker = new FlowTracker("onSuccess");
		tracker.activate();

		doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));

		testUser.confirmPassword(TEST_CODE, TEST_USER_PASSWORD, new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
				assertTrue(tracker.check("getResetCode"));
				// Except to fail
				tracker.setNext("onFailure");
			}

			public void onFailure(Exception var1) {
				assertTrue(tracker.check("onFailure"));
			}
		});
	}

	@Test
	public void confirmPasswordInCurrentThreadNoCallback() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);

		doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));

		try {
			testUser.confirmPassword(TEST_CODE, TEST_USER_PASSWORD, null);
		} catch (final CognitoParameterInvalidException exception) {
			return;
		}

		assertTrue("CognitoParameterInvalidException is not thrown when the callback to confirmPassword in null.", true);
	}

	@Test
	public void confirmPasswordInBackground() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);

		final FlowTracker tracker;
		tracker = new FlowTracker("onSuccess");
		tracker.activate();

		doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));

		testUser.confirmPasswordInBackground(TEST_CODE, TEST_USER_PASSWORD, new ForgotPasswordHandler() {
			public void onSuccess() {
				// Check the flow
				assertTrue(tracker.check("onSuccess"));
			}

			public void getResetCode(ForgotPasswordContinuation var1) {
				assertTrue(tracker.check("getResetCode"));
				// Except to fail
				tracker.setNext("onFailure");
			}

			public void onFailure(Exception var1) {
				assertTrue(tracker.check("onFailure"));
			}
		});
	}

	@Test
	public void confirmPasswordInBackgroundNoCallback() throws Exception {
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);

		doReturn(TEST_CONFIRM_PASSWORD_RESPONSE).when(mockCSIClient).confirmForgotPassword(any(ConfirmForgotPasswordRequest.class));

		try {
			testUser.confirmPasswordInBackground(TEST_CODE, TEST_USER_PASSWORD, null);
		} catch (final CognitoParameterInvalidException exception) {
			return;
		}

		assertTrue("CognitoParameterInvalidException is not thrown when the callback to confirmPassword in null.", true);
	}
}
