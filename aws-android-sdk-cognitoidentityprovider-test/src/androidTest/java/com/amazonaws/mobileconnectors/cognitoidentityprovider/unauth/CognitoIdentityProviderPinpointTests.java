package com.amazonaws.mobileconnectors.cognitoidentityprovider.unauth;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoIdentityProviderUnitTestBase;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoPinpointSharedContext;

import org.junit.Test;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class CognitoIdentityProviderPinpointTests extends CognitoIdentityProviderUnitTestBase {

    @Test
    public void getPinpointEndpointIdTestWithPPSharedContext () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_1).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(InstrumentationRegistry.getTargetContext(), TEST_PP_APP_ID_1);
        assertEquals(TEST_PP_ENDPOINT_1, pp_endpoint);
    }

    @Test
    public void getPinpointEndpointIdTestWithPPSharedContextWithEndpointIdentifier () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_2).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(InstrumentationRegistry.getTargetContext(), TEST_PP_APP_ID_1, PP_UNIQUE_ID_KEY);
        assertEquals(TEST_PP_ENDPOINT_2, pp_endpoint);
    }

    @Test
    public void getPinpointEndpointIdTestWithNoPPSharedContext () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().remove(PP_UNIQUE_ID_KEY).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(InstrumentationRegistry.getTargetContext(), TEST_PP_APP_ID_1);
        assertNotNull(pp_endpoint);
    }

    @Test
    public void getPinpointEndpointIdTestNullContext () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_2).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(null, TEST_PP_APP_ID_1);
        assertNull(pp_endpoint);
    }

    @Test
    public void getPinpointEndpointIdTestNullAppId () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_2).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(InstrumentationRegistry.getTargetContext(), null);
        assertNull(pp_endpoint);
    }

    @Test
    public void getPinpointEndpointIdTestNullEndpointIdentifier () {
        // Test shared Pinpoint context
        SharedPreferences sharedPreferences =
                InstrumentationRegistry.getTargetContext().getSharedPreferences(TEST_PP_APP_ID_1 + PP_PREFERENCES_AND_FILE_MANAGER_SUFFIX, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(PP_UNIQUE_ID_KEY, TEST_PP_ENDPOINT_2).commit();

        String pp_endpoint = CognitoPinpointSharedContext.getPinpointEndpoint(InstrumentationRegistry.getTargetContext(), TEST_PP_APP_ID_1, null);
        assertNull(pp_endpoint);
    }

}