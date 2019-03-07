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

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.regions.Regions;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.StringUtils;

import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.Calendar;
import java.util.Date;

@RunWith(AndroidJUnit4.class)
public abstract class CognitoIdentityProviderUnitTestBase extends AWSTestBase {
	// Test values
	public static final String TEST_USER_POOL      = "alpha_DummyID";
    public static final String TEST_CLIENT_ID      = "DummyClientId";
    public static final String TEST_CLIENT_SECRET  = "DummyClientSecret";
    public static final String TEST_USER_NAME      = "DummyUserName";
    public static final String TEST_USER_NAME_2    = "DummyUserName_2";
    public static final String TEST_USER_PASSWORD  = "DummyTestPAssword";
    public static final String TEST_USER_NEW_PASS  = "DummyNewTestPassword";
    public static final String TEST_USER_GN        = "DummyUserGivenName";
    public static final String TEST_USER_FN        = "DummyUserFamilyName";
    public static final String TEST_USER_PHONE     = "1234567890";
    public static final String TEST_USER_EMAIL     = "DummyEmail@exmaple.com";
    public static final String TEST_CACHED_ATOKEN  = "DummyCachedAccessToken";
    public static final String TEST_CACHED_ITOKEN  = "DummyCachedIdToken";
    public static final String TEST_CACHED_RTOKEN  = "DummyCachedRefToken";
    public static final String TEST_NEW_ATOKEN     = "DummyNewAccessToken";
    public static final String TEST_NEW_ITOKEN     = "DummyNewIdToken";
    public static final String TEST_NEW_RTOKEN     = "DummyNewRefToken";
    public static final String TEST_CODE	       = "123456";
    public static final String TEST_ENHANCED_SEC   = "VeryEnhancedSecret!";
    public static final String TEST_CODE_DESTINA   = "DummyCodeDeliveryDestination";
    public static final String TEST_CODE_DEL_MED   = "DummyCodeDeliveryMEDIUM";
    public static final String TEST_CODE_ATTRIBU   = "DummyCodeDeliveryAttribute";
    public static final String TEST_DEVICE_KEY     = "DummyDeviceKey";
    public static final String TEST_DEV_GRP_KEY    = "DummyDeviceGroupKey";
    public static final String TEST_DEV_VERIFIR    = "DummyDeviceVerifier";
    public static final String TEST_PP_APP_ID_1    = "this_is_a_random_pp_app_Id";
    public static final String TEST_PP_APP_ID_2    = "this_is_another_random_pp_app_Id";
    public static final String TEST_PP_ENDPOINT_1  = "a_random_pp_endpoint";
    public static final String TEST_PP_ENDPOINT_2  = "another_random_pp_endpoint";
    public static final Regions TEST_AWS_REGION_1   = Regions.US_EAST_1;
    public static final Regions TEST_AWS_REGION_2   = Regions.US_EAST_2;
    
    // SDK constants for PP integration
    public static final String PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX = 
    		"515d6767-01b7-49e5-8273-c8d11b0f331d";
    public static final String PP_UNIQUE_ID_KEY = "UniqueId";
    
    // High level constructs
    public static final CodeDeliveryDetailsType TEST_CODE_DELIVERY_DETAIL;

    // App Context
    protected Context appContext;
    
    static {
        // Code delivery details
        TEST_CODE_DELIVERY_DETAIL = new CodeDeliveryDetailsType();
    	TEST_CODE_DELIVERY_DETAIL.setDestination(TEST_CODE_DESTINA);
    	TEST_CODE_DELIVERY_DETAIL.setDeliveryMedium(TEST_CODE_DEL_MED);
    	TEST_CODE_DELIVERY_DETAIL.setAttributeName(TEST_CODE_ATTRIBU);
    }
    
    public CognitoIdentityProviderUnitTestBase() {
        appContext = InstrumentationRegistry.getTargetContext();
    }

    public AWSKeyValueStore getAWSKeyValueStorageUtility(final CognitoUserPool cognitoUserPool) {
        return cognitoUserPool.awsKeyValueStore;
    }
    
    // Set current time-date
    public void setTestDateTime() {
    	Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.DATE, 19);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 48);
        cal.set(Calendar.SECOND, 3);
    }
    
    // Create valid access token, the expiry date is set to current-time + expiryInSecs
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