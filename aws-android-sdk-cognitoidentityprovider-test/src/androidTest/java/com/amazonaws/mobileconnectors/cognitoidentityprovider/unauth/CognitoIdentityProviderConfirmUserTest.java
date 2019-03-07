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
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.*;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.utils.*;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import android.support.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderConfirmUserTest extends CognitoIdentityProviderUnitTestBase {
	private ConfirmSignUpResult	   			TEST_CONFIRM_USER_RESPONSE = null;
	private ResendConfirmationCodeResult    TEST_RESEND_CONFIRM_CODE_RESPONSE = null;
	private CognitoUserPool				   	testPool;
    private CognitoUser					   	testUser;

	@Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;
	
	@Before
	public void init() throws Exception {
		// Initialization functions
		MockitoAnnotations.initMocks(this);
			
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		TEST_RESEND_CONFIRM_CODE_RESPONSE = new ResendConfirmationCodeResult();
		TEST_RESEND_CONFIRM_CODE_RESPONSE.setCodeDeliveryDetails(new CodeDeliveryDetailsType().withDestination("TestDestination").withDeliveryMedium("TestMedium").withAttributeName("TestAttribute"));
	}
	
	@Test
	public void confirmUserInBackground() throws Exception {
		doReturn(TEST_CONFIRM_USER_RESPONSE).when(mockCSIClient).confirmSignUp(any(ConfirmSignUpRequest.class));
		
		testUser.confirmSignUpInBackground(TEST_CODE, true, new GenericHandler(){
			@Override
			public void onSuccess() {
				ArgumentCaptor<ConfirmSignUpRequest> argumentCaptor = ArgumentCaptor.forClass(ConfirmSignUpRequest.class);
        		verify(mockCSIClient).confirmSignUp(argumentCaptor.capture());
        		ConfirmSignUpRequest requestSent = argumentCaptor.getValue();
        		
        		assertNotNull(requestSent);
        		assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
        		assertEquals(TEST_USER_NAME, requestSent.getUsername());
        		assertNotNull(requestSent.getSecretHash());
        		assertEquals(TEST_CODE, requestSent.getConfirmationCode());
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});	
	}
	
	// Confirm user SignUp, runs test in current thread
	@Test
	public void confirmUserInCurrentThread() throws Exception {
		doReturn(TEST_CONFIRM_USER_RESPONSE).when(mockCSIClient).confirmSignUp(any(ConfirmSignUpRequest.class));
		
		testUser.confirmSignUp(TEST_CODE, true, new GenericHandler(){
			@Override
			public void onSuccess() {
				ArgumentCaptor<ConfirmSignUpRequest> argumentCaptor = ArgumentCaptor.forClass(ConfirmSignUpRequest.class);
		        verify(mockCSIClient).confirmSignUp(argumentCaptor.capture());
		        ConfirmSignUpRequest requestSent = argumentCaptor.getValue();
		        
		        assertNotNull(requestSent);
		        assertEquals(TEST_CLIENT_ID, requestSent.getClientId());
		        assertEquals(TEST_USER_NAME, requestSent.getUsername());
		        assertNotNull(requestSent.getSecretHash());
		        assertEquals(TEST_CODE, requestSent.getConfirmationCode());
			}

			@Override
			public void onFailure(Exception exception) {
				System.out.println("#### UserPoolTest User confirmation failure: "+exception.toString());
				assertNotNull(exception);
			}
		});
	}
	
	// Resend confirmation code test
	@Test
	public void resendConfirmationInBackground() throws Exception {
		doReturn(TEST_RESEND_CONFIRM_CODE_RESPONSE).when(mockCSIClient).resendConfirmationCode(any(ResendConfirmationCodeRequest.class));
		
		testUser.resendConfirmationCodeInBackground(new VerificationHandler() {
			@Override
			 public void onSuccess(CognitoUserCodeDeliveryDetails var1) {
				assertNotNull(var1);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNull(exception);
			}
		});
	}
	
	// Resend confirmation code test, runs test in current thread
	@Test
	public void resendConfirmationInCurrentThread() throws Exception {
		doReturn(TEST_RESEND_CONFIRM_CODE_RESPONSE).when(mockCSIClient).resendConfirmationCode(any(ResendConfirmationCodeRequest.class));
		
		testUser.resendConfirmationCode(new VerificationHandler(){
			@Override
			public void onSuccess(CognitoUserCodeDeliveryDetails var1) {
				assertNotNull(var1);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNull(exception);
			}
		});
	}
	
	// Confirm user SignUp, runs test in current thread
	@Test
	public void confirmUserInCurrentThreadException() throws Exception {
		InvalidParameterException exception = new InvalidParameterException("confirm failed");
		doThrow(exception).when(mockCSIClient).confirmSignUp(any(ConfirmSignUpRequest.class));
		
		testUser.confirmSignUp(TEST_CODE, true, new GenericHandler(){
			@Override
			public void onSuccess() {
				assertTrue(false);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof InvalidParameterException);
			}
		});
	}
	
	// Confirm user SignUp, runs test in current thread
	@Test
	public void confirmUserInBackgroundThreadException() throws Exception {
		InvalidParameterException exception = new InvalidParameterException("confirm failed");
		doThrow(exception).when(mockCSIClient).confirmSignUp(any(ConfirmSignUpRequest.class));
		
		testUser.confirmSignUpInBackground(TEST_CODE, true, new GenericHandler(){
			@Override
			public void onSuccess() {
				assertTrue(false);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof InvalidParameterException);
			}
		});
	}
	
	// Resend confirmation code test, runs test in current thread
	@Test
	public void resendConfirmationInCurrentThreadException() throws Exception {
		InvalidParameterException exception = new InvalidParameterException("code request failed");
		doThrow(exception).when(mockCSIClient).resendConfirmationCode(any(ResendConfirmationCodeRequest.class));
		
		testUser.resendConfirmationCode(new VerificationHandler(){
			@Override
			public void onSuccess(CognitoUserCodeDeliveryDetails var1) {
				assertNotNull(var1);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof InvalidParameterException);
			}
		});
	}
	
	// Resend confirmation code test, runs test in current thread
	@Test
	public void resendConfirmationInBackgroundThreadException() throws Exception {
		InvalidParameterException exception = new InvalidParameterException("code request failed");
		doThrow(exception).when(mockCSIClient).resendConfirmationCode(any(ResendConfirmationCodeRequest.class));
		
		testUser.resendConfirmationCodeInBackground(new VerificationHandler(){
			@Override
			public void onSuccess(CognitoUserCodeDeliveryDetails var1) {
				assertNotNull(var1);
			}

			@Override
			public void onFailure(Exception exception) {
				assertNotNull(exception);
				assertTrue(exception instanceof InvalidParameterException);
			}
		});
	}
}