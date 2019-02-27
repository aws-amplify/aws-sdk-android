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

package com.amazonaws.mobileconnectors.cognitoauth;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class LocalDataManagerIntegrationTest extends CognitoAuthIntegrationTestBase {
    private static String TAG = LocalDataManagerIntegrationTest.class.getSimpleName();

    private static SharedPreferences sharedPreferencesForAuth;

    private static SharedPreferences sharedPreferencesForAuthEncryptionMaterials;

    private static String cachedIdTokenKey;
    private static String cachedAccessTokenKey;
    private static String cachedRefreshTokenKey;
    private static String cachedTokenTypeKey;
    private static String cachedTokenScopes;
    private static String lastAuthUserKey;
    private static String clientId;
    private static String username;

    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        sharedPreferencesForAuth = InstrumentationRegistry.getTargetContext()
                .getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, Context.MODE_PRIVATE);

        sharedPreferencesForAuthEncryptionMaterials = InstrumentationRegistry.getTargetContext()
                .getSharedPreferences(ClientConstants.APP_LOCAL_CACHE + ".encryptionkey", Context.MODE_PRIVATE);

        clientId = getPackageConfigure().getString("AppClientId");
        username = getPackageConfigure().getString("Username");

        cachedIdTokenKey = String.format(Locale.US, "%s.%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ID, "encrypted");
        cachedAccessTokenKey = String.format(Locale.US, "%s.%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_ACCESS, "encrypted");
        cachedRefreshTokenKey = String.format(Locale.US, "%s.%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_TYPE_REFRESH, "encrypted");
        cachedTokenTypeKey = String.format(Locale.US, "%s.%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_TYPE, "encrypted");
        cachedTokenScopes = String.format(Locale.US, "%s.%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, username, ClientConstants.TOKEN_KEY_SCOPES, "encrypted");
        lastAuthUserKey = String.format(Locale.US, "%s.%s.%s.%s",
                ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, clientId, ClientConstants.APP_LAST_AUTH_USER, "encrypted");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();

        sharedPreferencesForAuthEncryptionMaterials
                .edit()
                .clear()
                .commit();
    }

    @Before
    public void setUp() {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();
    }

    @After
    public void tearDown() {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();
    }

    @Test
    public void testCognitoAuthCachedSession() {
        printSharedPreferencesKeys();

        try {
            Auth.Builder builder = new Auth.Builder();
            Auth auth = builder.setAppClientId(getPackageConfigure().getString("AppClientId"))
                    .setAppCognitoWebDomain(getPackageConfigure().getString("WebDomain"))
                    .setSignInRedirect(getPackageConfigure().getString("SignInRedirectURI"))
                    .setSignOutRedirect(getPackageConfigure().getString("SignOutRedirectURI"))
                    .setApplicationContext(InstrumentationRegistry.getTargetContext())
                    .setAdvancedSecurityDataCollection(true)
                    .setScopes(setFromString("email,profile,openid"))
                    .setAuthHandler(new AuthHandler() {
                        @Override
                        public void onSuccess(AuthUserSession session) {

                        }

                        @Override
                        public void onSignout() {

                        }

                        @Override
                        public void onFailure(Exception e) {

                        }
                    })
                    .build();
            assertNotNull(auth);

            AuthUserSession authUserSession = new AuthUserSession(
                    new IdToken("idToken"),
                    new AccessToken("accessToken"),
                    new RefreshToken("refreshToken"));
            LocalDataManager.cacheSession(auth.awsKeyValueStore, InstrumentationRegistry.getTargetContext(),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("Username"),
                    authUserSession,
                    setFromString("email,profile,openid"));

            AuthUserSession cachedSession = LocalDataManager.getCachedSession(auth.awsKeyValueStore, InstrumentationRegistry.getTargetContext(),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("Username"),
                    setFromString("email,profile,openid"));

            assertEquals(authUserSession.getIdToken().getJWTToken(), cachedSession.getIdToken().getJWTToken());
            assertEquals(authUserSession.getAccessToken().getJWTToken(), cachedSession.getAccessToken().getJWTToken());
            assertEquals(authUserSession.getRefreshToken().getToken(), cachedSession.getRefreshToken().getToken());

            printSharedPreferencesKeys();

            verifySharedPreferencesForCachedSession();
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue("Error occurred" + ex, false);
        }
    }

    @Test
    public void testCognitoAuthCachedStateForScopes() {
        printSharedPreferencesKeys();

        try {
            Auth.Builder builder = new Auth.Builder();
            Auth auth = builder.setAppClientId(getPackageConfigure().getString("AppClientId"))
                    .setAppCognitoWebDomain(getPackageConfigure().getString("WebDomain"))
                    .setSignInRedirect(getPackageConfigure().getString("SignInRedirectURI"))
                    .setSignOutRedirect(getPackageConfigure().getString("SignOutRedirectURI"))
                    .setApplicationContext(InstrumentationRegistry.getTargetContext())
                    .setAdvancedSecurityDataCollection(true)
                    .setScopes(setFromString("email,profile,openid"))
                    .setAuthHandler(new AuthHandler() {
                        @Override
                        public void onSuccess(AuthUserSession session) {

                        }

                        @Override
                        public void onSignout() {

                        }

                        @Override
                        public void onFailure(Exception e) {

                        }
                    })
                    .build();
            assertNotNull(auth);

            LocalDataManager.cacheState(auth.awsKeyValueStore, InstrumentationRegistry.getTargetContext(),
                    "key",
                    "proofKey",
                    setFromString("email,profile,openid"));

            printSharedPreferencesKeys();
            verifySharedPreferencesForCachedState(auth.awsKeyValueStore);
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue("Error occurred" + ex, false);
        }
    }

    @Test
    public void testCognitoAuthCachedSessionNoCachingEnabled() {
        printSharedPreferencesKeys();

        try {
            Auth.Builder builder = new Auth.Builder();
            Auth auth = builder.setAppClientId(getPackageConfigure().getString("AppClientId"))
                    .setAppCognitoWebDomain(getPackageConfigure().getString("WebDomain"))
                    .setSignInRedirect(getPackageConfigure().getString("SignInRedirectURI"))
                    .setSignOutRedirect(getPackageConfigure().getString("SignOutRedirectURI"))
                    .setApplicationContext(InstrumentationRegistry.getTargetContext())
                    .setAdvancedSecurityDataCollection(true)
                    .setScopes(setFromString("email,profile,openid"))
                    .setPersistenceEnabled(false)
                    .setAuthHandler(new AuthHandler() {
                        @Override
                        public void onSuccess(AuthUserSession session) {

                        }

                        @Override
                        public void onSignout() {

                        }

                        @Override
                        public void onFailure(Exception e) {

                        }
                    })
                    .build();
            assertNotNull(auth);

            AuthUserSession authUserSession = new AuthUserSession(
                    new IdToken("idToken"),
                    new AccessToken("accessToken"),
                    new RefreshToken("refreshToken"));
            LocalDataManager.cacheSession(auth.awsKeyValueStore, 
                    InstrumentationRegistry.getTargetContext(),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("Username"),
                    authUserSession,
                    setFromString("email,profile,openid"));

            AuthUserSession cachedSession = LocalDataManager.getCachedSession(auth.awsKeyValueStore,
                    InstrumentationRegistry.getTargetContext(),
                    getPackageConfigure().getString("AppClientId"),
                    getPackageConfigure().getString("Username"),
                    setFromString("email,profile,openid"));

            assertEquals(authUserSession.getIdToken().getJWTToken(), cachedSession.getIdToken().getJWTToken());
            assertEquals(authUserSession.getAccessToken().getJWTToken(), cachedSession.getAccessToken().getJWTToken());
            assertEquals(authUserSession.getRefreshToken().getToken(), cachedSession.getRefreshToken().getToken());

            printSharedPreferencesKeys();

            assert sharedPreferencesForAuth.getAll().keySet().size() == 0;
            assert sharedPreferencesForAuthEncryptionMaterials.getAll().keySet().size() == 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue("Error occurred" + ex, false);
        }
    }

    @Test
    public void testCognitoAuthCachedStateForScopesNoCachingEnabled() {
        printSharedPreferencesKeys();

        try {
            Auth.Builder builder = new Auth.Builder();
            Auth auth = builder.setAppClientId(getPackageConfigure().getString("AppClientId"))
                    .setAppCognitoWebDomain(getPackageConfigure().getString("WebDomain"))
                    .setSignInRedirect(getPackageConfigure().getString("SignInRedirectURI"))
                    .setSignOutRedirect(getPackageConfigure().getString("SignOutRedirectURI"))
                    .setApplicationContext(InstrumentationRegistry.getTargetContext())
                    .setAdvancedSecurityDataCollection(true)
                    .setScopes(setFromString("email,profile,openid"))
                    .setPersistenceEnabled(false)
                    .setAuthHandler(new AuthHandler() {
                        @Override
                        public void onSuccess(AuthUserSession session) {

                        }

                        @Override
                        public void onSignout() {

                        }

                        @Override
                        public void onFailure(Exception e) {

                        }
                    })
                    .build();
            assertNotNull(auth);

            LocalDataManager.cacheState(auth.awsKeyValueStore,
                    InstrumentationRegistry.getTargetContext(),
                    "key",
                    "proofKey",
                    setFromString("email,profile,openid"));

            printSharedPreferencesKeys();

            assert sharedPreferencesForAuth.getAll().keySet().size() == 0;
            assert sharedPreferencesForAuthEncryptionMaterials.getAll().keySet().size() == 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue("Error occurred" + ex, false);
        }
    }

    private void printSharedPreferencesKeys() {
        Log.d(TAG, "SharedPreferences keys for " + ClientConstants.APP_LOCAL_CACHE +
                sharedPreferencesForAuth
                        .getAll()
                        .toString());

        Log.d(TAG, "SharedPreferences keys for com.amazonaws.android.auth.encryptionmaterials => " +
                sharedPreferencesForAuthEncryptionMaterials
                        .getAll()
                        .toString());
    }

    private void verifySharedPreferencesForCachedSession() {
        assert sharedPreferencesForAuth.getAll().keySet().size() > 0;
        assert sharedPreferencesForAuthEncryptionMaterials.getAll().keySet().size() > 0;

        assertNotNull(sharedPreferencesForAuth.getString(cachedIdTokenKey, null));
        assertNotNull(sharedPreferencesForAuth.getString(cachedAccessTokenKey, null));
        assertNotNull(sharedPreferencesForAuth.getString(cachedRefreshTokenKey, null));
        assertNotNull(sharedPreferencesForAuth.getString(cachedTokenTypeKey, null));
        assertNotNull(sharedPreferencesForAuth.getString(cachedTokenScopes, null));
        assertNotNull(sharedPreferencesForAuth.getString(lastAuthUserKey, null));
    }

    private void verifySharedPreferencesForCachedState(AWSKeyValueStore awsKeyValueStore) {
        assert sharedPreferencesForAuth.getAll().keySet().size() > 0;
        assert sharedPreferencesForAuthEncryptionMaterials.getAll().keySet().size() > 0;

        assertEquals("proofKey",
                LocalDataManager.getCachedProofKey(awsKeyValueStore, InstrumentationRegistry.getTargetContext(), "key"));
        assertEquals(setFromString("email,profile,openid"),
                LocalDataManager.getCachedScopes(awsKeyValueStore, InstrumentationRegistry.getTargetContext(), "key"));
    }

    static String setToString(Set<String> stringSet) {
        StringBuilder strBuilder = new StringBuilder();
        int index = 0;
        for (String str: stringSet) {
            strBuilder.append(str);
            if (index++ < stringSet.size() - 1) {
                strBuilder.append(",");
            }
        }
        return strBuilder.toString();
    }

    static Set<String> setFromString(String str) {
        String[] stringArray = str.split(",");
        return new HashSet<String>(Arrays.asList(stringArray));
    }
}
