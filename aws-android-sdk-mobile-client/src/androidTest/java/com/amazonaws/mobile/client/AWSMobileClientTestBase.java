/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import android.util.Base64;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.StringUtils;

import org.json.JSONObject;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public abstract class AWSMobileClientTestBase extends AWSTestBase {

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = ApplicationProvider.getApplicationContext().
            getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    public static void setTokensDirectly(final Context appContext,
                                         final String providerKey,
                                         final String token,
                                         final String identityId) {
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                true);
        awsKeyValueStore.put(AWSMobileClient.PROVIDER_KEY, providerKey);
        awsKeyValueStore.put(AWSMobileClient.TOKEN_KEY, token);
        awsKeyValueStore.put(AWSMobileClient.IDENTITY_ID_KEY, identityId);
    }

    public static void writeUserPoolsTokens(final Context appContext, final String clientId, final String username, final long expiryFromNow) {
        // Store tokens in shared preferences
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                "CognitoIdentityProviderCache",
                true);
        String storeFieldPrefix = "CognitoIdentityProvider." + clientId + "." + username + ".";
        awsKeyValueStore.put("CognitoIdentityProvider." + clientId + ".LastAuthUser", username);
        awsKeyValueStore.put(storeFieldPrefix + "idToken", getValidJWT(expiryFromNow));
        awsKeyValueStore.put(storeFieldPrefix + "accessToken", getValidJWT(expiryFromNow));
        awsKeyValueStore.put(storeFieldPrefix + "refreshToken", "DummyRefresh");
    }

    public static void setAccessToken(final Context appContext, final String clientId, final String username, final String accessToken) {
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(appContext,
                "CognitoIdentityProviderCache",
                true);
        String storeFieldPrefix = "CognitoIdentityProvider." + clientId + "." + username + ".";
        awsKeyValueStore.put(storeFieldPrefix + "accessToken", accessToken);
    }

    public static void writeUserPoolsTokens(final Context appContext,
                                            final String clientId,
                                            final String userId,
                                            final String accessToken,
                                            final String idToken,
                                            final String refreshToken) {
        final AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(
                appContext,
                "CognitoIdentityProviderCache",
                true);

        // Create keys to look for cached tokens
        final String csiIdTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".idToken";
        final String csiAccessTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".accessToken";
        final String csiRefreshTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                + ".refreshToken";
        final String csiLastUserKey = "CognitoIdentityProvider." + clientId + ".LastAuthUser";

        // Store the data in Shared Preferences
        awsKeyValueStore.put(csiAccessTokenKey, accessToken);
        awsKeyValueStore.put(csiIdTokenKey, idToken);
        awsKeyValueStore.put(csiRefreshTokenKey, refreshToken);
        awsKeyValueStore.put(csiLastUserKey, userId);
    }

    // Create valid access tokens
    public static String getValidJWT(long expiryInSecs){
        long epoch = System.currentTimeMillis() / 1000L;
        epoch = epoch + expiryInSecs;
        String accessToken_p1_Base64 = "eyJ0eXAiOiAiSldUIiwgImFsZyI6IlJTMjU2In0=";
        String accessToken_p3_Base64 = "e0VuY3J5cHRlZF9LZXl9";
        String accessToken_p2_Str = "{\"iss\": \"userPoolId\",\"sub\": \"my@email.com\",\"aud\": \"https:aws.cognito.com\",\"exp\": \"" + epoch + "\"}";
        byte[] accessToken_p2_UTF8 = accessToken_p2_Str.getBytes(StringUtils.UTF8);
        String accessToken_p2_Base64 = new String(Base64.encode(accessToken_p2_UTF8, Base64.DEFAULT));
        return accessToken_p1_Base64 + "." + accessToken_p2_Base64 + "." + accessToken_p3_Base64;
    }

    void verifyTokens(Tokens tokens) {
        assertNotNull(tokens);
        Token accessToken = tokens.getAccessToken();
        assertNotNull(accessToken);
        assertTrue("Access token should not be expired", accessToken.getExpiration().after(new Date()));
        Token idToken = tokens.getIdToken();
        assertNotNull(idToken);
        assertTrue("Id token should not be expired", idToken.getExpiration().after(new Date()));
        Token refreshToken = tokens.getRefreshToken();
        assertNotNull(refreshToken);
    }

    AWSMobileClient initializeAWSMobileClient(final Context appContext,
                                             final UserState userState) {
        // Expect the UserState to be SIGNED_OUT
        final CountDownLatch waitForAWSMobileClientToBeInitialized = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                assertEquals(userState,
                        result.getUserState());
                waitForAWSMobileClientToBeInitialized.countDown();
            }

            @Override
            public void onError(Exception e) {
                fail(e.getMessage());
                waitForAWSMobileClientToBeInitialized.countDown();
            }
        });

        try {
            waitForAWSMobileClientToBeInitialized.await();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return AWSMobileClient.getInstance();
    }
}
