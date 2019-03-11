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
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;
import android.util.Log;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.DevicesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoDeviceHelper;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.ForgetDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetDeviceResult;
import com.amazonaws.services.cognitoidentityprovider.model.ListDevicesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListDevicesResult;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateDeviceStatusRequest;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateDeviceStatusResult;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class CognitoIdentityProviderDevicesTest extends CognitoIdentityProviderUnitTestBase {
	private CognitoUserPool				   	testPool;
    private CognitoUser					   	testUser;
   
    private GetDeviceResult					TEST_VALID_GET_DEVICE_RESPONSE = null;
    private UpdateDeviceStatusResult		TEST_VALID_UPDATE_DEVICE_RESPONSE = null;
    private ListDevicesResult		 		TEST_VALID_LIST_DEVICES_RESPONSE = null;
	
	@Mock
	private AmazonCognitoIdentityProviderClient mockCSIClient;

	private AWSKeyValueStore awsKeyValueStorageUtility;

	private static final String TAG = CognitoIdentityProviderDevicesTest.class.getSimpleName();

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		testPool = new CognitoUserPool(appContext, TEST_USER_POOL, TEST_CLIENT_ID, TEST_CLIENT_SECRET, mockCSIClient);
		awsKeyValueStorageUtility = getAWSKeyValueStorageUtility(testPool);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		TEST_VALID_GET_DEVICE_RESPONSE = new GetDeviceResult();
		TEST_VALID_UPDATE_DEVICE_RESPONSE = new UpdateDeviceStatusResult();
		TEST_VALID_LIST_DEVICES_RESPONSE = new ListDevicesResult();
	}

	@After
    public void tearDown() {
	    awsKeyValueStorageUtility.clear();
        testPool = null;
    }

	@Test
	public void listDevicesInCurrentThread() {
		// Set mock result for the change password request API call
		doReturn(TEST_VALID_LIST_DEVICES_RESPONSE).when(mockCSIClient).listDevices(any(ListDevicesRequest.class));
		
		// Store tokens in shared preferences
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+".idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		testUser.listDevices(10, "ptoken", new DevicesHandler() {
			@Override
			public void onSuccess(List<CognitoDevice> devices) {
				assertNotNull(devices);
				ArgumentCaptor<ListDevicesRequest> argumentCaptor = ArgumentCaptor.forClass(ListDevicesRequest.class);
		        verify(mockCSIClient).listDevices(argumentCaptor.capture());
		        ListDevicesRequest requestSent = argumentCaptor.getValue();
		        assertEquals("ptoken", requestSent.getPaginationToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void listDevicesInBackgroundThread() {
	    // Set mock result for the change password request API call
		doReturn(TEST_VALID_LIST_DEVICES_RESPONSE).when(mockCSIClient).listDevices(any(ListDevicesRequest.class));
		
		// Store tokens in shared preferences
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", getValidJWT(3600L));
 		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		testUser.listDevicesInBackground(10, "ptoken", new DevicesHandler() {
			@Override
			public void onSuccess(List<CognitoDevice> devices) {
				assertNotNull(devices);
				ArgumentCaptor<ListDevicesRequest> argumentCaptor = ArgumentCaptor.forClass(ListDevicesRequest.class);
		        verify(mockCSIClient).listDevices(argumentCaptor.capture());
		        ListDevicesRequest requestSent = argumentCaptor.getValue();
		        assertEquals("ptoken", requestSent.getPaginationToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void getDeviceName() {
		String deviceName = CognitoDeviceHelper.getDeviceName();
		assertNotNull(deviceName);
	}
	
	// Cache and read device key and group keys
	@Test
	public void cacheADevice() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		CognitoDeviceHelper.cacheDeviceVerifier(TEST_USER_NAME, TEST_USER_POOL, TEST_DEV_VERIFIR, appContext);
		String cachedDeviceKey = CognitoDeviceHelper.getDeviceKey(TEST_USER_NAME, TEST_USER_POOL, appContext);
		String cachedDeviceverifier = CognitoDeviceHelper.getDeviceSecret(TEST_USER_NAME, TEST_USER_POOL, appContext);
		
		assertEquals(TEST_DEVICE_KEY, cachedDeviceKey);
		assertEquals(TEST_DEV_VERIFIR, cachedDeviceverifier);
	}
	
	// Clear a cached key
	@Test
	public void clearCachedDevice() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		String cachedDeviceKey = CognitoDeviceHelper.getDeviceKey(TEST_USER_NAME, TEST_USER_POOL, appContext);
		assertEquals(TEST_DEVICE_KEY, cachedDeviceKey);
	}
	
	// Test device verifier
	@Test
	public void testRandomStringGenerator() {
		String randomString1 = CognitoDeviceHelper.generateRandomString();
		assertNotNull(randomString1);
		
		String randomString2 = CognitoDeviceHelper.generateRandomString();
		assertNotNull(randomString2);
		
		assertNotEquals(randomString1, randomString2);
	}
	
	// Check the device verifier parameters
	@Test
	public void testDeviceVerificationParametersGenerator() {
		Map<String, String> deviceVerfParameters = CognitoDeviceHelper.generateVerificationParameters(TEST_DEVICE_KEY, TEST_DEV_GRP_KEY);
		assertNotNull(deviceVerfParameters);
		assertEquals(3, deviceVerfParameters.size());
		assertNotNull(deviceVerfParameters.get("salt"));
		assertNotNull(deviceVerfParameters.get("verifier"));
		assertNotNull(deviceVerfParameters.get("secret"));
	}
	
	@Test
	public void getDevice() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		CognitoDevice cachedDevice = testUser.thisDevice();
		assertNotNull(cachedDevice);
	}
	@Test
	public void getDeviceDetailsInCurrentThread() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+".idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doReturn(TEST_VALID_GET_DEVICE_RESPONSE).when(mockCSIClient).getDevice(any(GetDeviceRequest.class));
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.getDevice(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<GetDeviceRequest> argumentCaptor = ArgumentCaptor.forClass(GetDeviceRequest.class);
		        verify(mockCSIClient).getDevice(argumentCaptor.capture());
		        GetDeviceRequest requestSent = argumentCaptor.getValue();
		        assertEquals(testAccessToken, requestSent.getAccessToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void getDeviceDetailsInBackgroundThread() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+".idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doReturn(TEST_VALID_GET_DEVICE_RESPONSE).when(mockCSIClient).getDevice(any(GetDeviceRequest.class));
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.getDeviceInBackground(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<GetDeviceRequest> argumentCaptor = ArgumentCaptor.forClass(GetDeviceRequest.class);
		        verify(mockCSIClient).getDevice(argumentCaptor.capture());
		        GetDeviceRequest requestSent = argumentCaptor.getValue();
		        assertEquals(testAccessToken, requestSent.getAccessToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void forgetDeviceInCurrentThread() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doNothing().when(mockCSIClient).forgetDevice(any(ForgetDeviceRequest.class));

		final CountDownLatch countDownLatch = new CountDownLatch(1);
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.forgetDevice(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<ForgetDeviceRequest> argumentCaptor = ArgumentCaptor.forClass(ForgetDeviceRequest.class);
		        verify(mockCSIClient).forgetDevice(argumentCaptor.capture());
		        ForgetDeviceRequest requestSent = argumentCaptor.getValue();
		        Log.d(TAG, "testAccessToken = " + testAccessToken);
                Log.d(TAG, "requestSent.getAccessToken() = " + requestSent.getAccessToken());
		        assertEquals(testAccessToken, requestSent.getAccessToken());
                countDownLatch.countDown();
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
                countDownLatch.countDown();
			}
		});

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	@Test
	public void forgetDeviceInBackgroundThread() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doNothing().when(mockCSIClient).forgetDevice(any(ForgetDeviceRequest.class));
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.forgetDeviceInBackground(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<ForgetDeviceRequest> argumentCaptor = ArgumentCaptor.forClass(ForgetDeviceRequest.class);
		        verify(mockCSIClient).forgetDevice(argumentCaptor.capture());
		        ForgetDeviceRequest requestSent = argumentCaptor.getValue();
		        assertEquals(testAccessToken, requestSent.getAccessToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void trustDeviceInCurrentThread() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doReturn(TEST_VALID_UPDATE_DEVICE_RESPONSE).when(mockCSIClient).updateDeviceStatus(any(UpdateDeviceStatusRequest.class));
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.rememberThisDevice(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<UpdateDeviceStatusRequest> argumentCaptor = ArgumentCaptor.forClass(UpdateDeviceStatusRequest.class);
		        verify(mockCSIClient).updateDeviceStatus(argumentCaptor.capture());
		        UpdateDeviceStatusRequest requestSent = argumentCaptor.getValue();
		        assertEquals(testAccessToken, requestSent.getAccessToken());
			}

			@Override
		    public void onFailure(Exception exception) {
				assertNotNull(exception);
			}
		});
	}
	
	@Test
	public void trustDeviceInBackground() {
		CognitoDeviceHelper.cacheDeviceKey(TEST_USER_NAME, TEST_USER_POOL, TEST_DEVICE_KEY, appContext);
		testUser = testPool.getUser(TEST_USER_NAME);
		
		// Store tokens in shared preferences
		final String testAccessToken = getValidJWT(3600L);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"idToken", getValidJWT(3600L));
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"accessToken", testAccessToken);
		awsKeyValueStorageUtility.put("CognitoIdentityProvider."+TEST_CLIENT_ID+"."+TEST_USER_NAME+"."+"refreshToken", TEST_CACHED_RTOKEN);
		
		// Set mock result for the change password request API call
		doReturn(TEST_VALID_UPDATE_DEVICE_RESPONSE).when(mockCSIClient).updateDeviceStatus(any(UpdateDeviceStatusRequest.class));
		
		CognitoDevice cachedDevice = testUser.thisDevice();
		cachedDevice.rememberThisDeviceInBackground(new GenericHandler() {
			@Override
			public void onSuccess() {
				ArgumentCaptor<UpdateDeviceStatusRequest> argumentCaptor = ArgumentCaptor.forClass(UpdateDeviceStatusRequest.class);
		        verify(mockCSIClient).updateDeviceStatus(argumentCaptor.capture());
		        UpdateDeviceStatusRequest requestSent = argumentCaptor.getValue();
		        assertEquals(testAccessToken, requestSent.getAccessToken());
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
