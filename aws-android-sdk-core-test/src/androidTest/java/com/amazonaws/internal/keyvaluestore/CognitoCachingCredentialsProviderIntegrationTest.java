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

package com.amazonaws.internal.keyvaluestore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class CognitoCachingCredentialsProviderIntegrationTest extends CoreIntegrationTestBase {

    private static String TAG = CognitoCachingCredentialsProviderIntegrationTest.class.getSimpleName();

    private List<CognitoCachingCredentialsProvider> credentialsProviders;

    private CognitoCachingCredentialsProvider credentialsProvider;

    private static SharedPreferences sharedPreferencesForAuth;

    @BeforeClass
    public static void setupBeforeClass() {
        sharedPreferencesForAuth = InstrumentationRegistry.getTargetContext()
                .getSharedPreferences("com.amazonaws.android.auth", Context.MODE_PRIVATE);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();
    }

    @Before
    public void setUp() throws Exception {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();

        AWSKeyValueStore.cacheFactory.clear();

        credentialsProviders = new ArrayList<CognitoCachingCredentialsProvider>();
        credentialsProvider = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
        credentialsProviders.add(credentialsProvider);
    }

    @After
    public void tearDown() {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();

        AWSKeyValueStore.cacheFactory.clear();
    }

    @Test
    public void testCachedAWSCredentials() throws Exception {
        Log.d(TAG, "SharedPreferences keys for com.amazonaws.android.auth => " +
                InstrumentationRegistry.getTargetContext()
                        .getSharedPreferences("com.amazonaws.android.auth", Context.MODE_PRIVATE)
                        .getAll()
                        .toString());

        assertNull(credentialsProvider.getCachedIdentityId());
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        assertNotNull(credentialsProvider.getCredentials());
        Log.d(TAG, "Credentials = " + credentialsProvider.getCredentials());

        assertNotNull(credentialsProvider.getIdentityId());
        Log.d(TAG, "Identity Id = " + credentialsProvider.getIdentityId());

        assertNotNull(credentialsProvider.getCachedIdentityId());
        Log.d(TAG, "Cached Identity Id = " + credentialsProvider.getCachedIdentityId());

        Log.d(TAG, "SharedPreferences keys for com.amazonaws.android.auth => " +
                InstrumentationRegistry.getTargetContext()
                        .getSharedPreferences("com.amazonaws.android.auth", Context.MODE_PRIVATE)
                        .getAll()
                        .toString());

        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
    }

    @Test
    public void testCachedAWSCredentialsWithRefresh() {
        assertNull(credentialsProvider.getCachedIdentityId());
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        final AWSSessionCredentials credentialsBeforeRefresh = credentialsProvider.getCredentials();
        assertNotNull(credentialsBeforeRefresh);
        Log.d(TAG, "Before Refresh: Credentials = " + credentialsBeforeRefresh);


        final String identityIdBeforeRefresh = credentialsProvider.getIdentityId();
        assertNotNull(identityIdBeforeRefresh);
        Log.d(TAG, "Before Refresh: Identity Id = " + identityIdBeforeRefresh);

        final String cachedIdentityIdBeforeRefresh = credentialsProvider.getCachedIdentityId();
        assertNotNull(cachedIdentityIdBeforeRefresh);
        Log.d(TAG, "Before Refresh: Cached Identity Id = " + cachedIdentityIdBeforeRefresh);

        assertEquals(identityIdBeforeRefresh, cachedIdentityIdBeforeRefresh);

        // Refresh
        credentialsProvider.refresh();
        final AWSSessionCredentials credentialsAfterRefresh = credentialsProvider.getCredentials();
        assertNotNull(credentialsAfterRefresh);
        Log.d(TAG, "After Refresh: Credentials = " + credentialsAfterRefresh);
        assertNotEquals(credentialsAfterRefresh.getSessionToken(), credentialsBeforeRefresh.getSessionToken());
        assertNotEquals(credentialsAfterRefresh.getAWSSecretKey(), credentialsBeforeRefresh.getAWSSecretKey());
        assertNotEquals(credentialsAfterRefresh.getAWSAccessKeyId(), credentialsBeforeRefresh.getAWSAccessKeyId());


        final String identityIdAfterRefresh = credentialsProvider.getIdentityId();
        assertNotNull(identityIdAfterRefresh);
        Log.d(TAG, "After Refresh: Identity Id = " + identityIdAfterRefresh);
        assertEquals(identityIdAfterRefresh, identityIdBeforeRefresh);

        final String cachedIdentityIdAfterRefresh = credentialsProvider.getCachedIdentityId();
        assertNotNull(cachedIdentityIdAfterRefresh);
        Log.d(TAG, "After Refresh: Cached Identity Id = " + cachedIdentityIdAfterRefresh);
        assertEquals(cachedIdentityIdAfterRefresh, cachedIdentityIdBeforeRefresh);

        assertEquals(identityIdAfterRefresh, cachedIdentityIdAfterRefresh);

        credentialsProvider.clearCredentials();
        credentialsProvider.clear();

        assertNull(credentialsProvider.getCachedIdentityId());
        assertNotNull(credentialsProvider.getIdentityId());
        assertNotNull(credentialsProvider.getCachedIdentityId());
    }

    @Test
    public void testMultipleCognitoCachingCredentialsProviders() throws Exception {
        CognitoCachingCredentialsProvider credentialsProvider1 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure("kinesis").getString("identity_pool_id"),
                Regions.US_EAST_1);

        credentialsProviders.add(credentialsProvider1);

        for (CognitoCachingCredentialsProvider cccp: credentialsProviders) {
            assertNull(cccp.getCachedIdentityId());
            cccp.clearCredentials();
            cccp.clear();
            assertNull(cccp.getCachedIdentityId());
        }

        for (CognitoCachingCredentialsProvider cccp: credentialsProviders) {
            assertNotNull(cccp.getCredentials());
            Log.d(TAG, "Credentials = " + cccp.getCredentials());
        }

        for (CognitoCachingCredentialsProvider cccp: credentialsProviders) {
            assertNotNull(cccp.getIdentityId());
            Log.d(TAG, "Identity Id = " + cccp.getIdentityId());

            assertNotNull(cccp.getCachedIdentityId());
            Log.d(TAG, "Cached Identity Id = " + cccp.getCachedIdentityId());

            assertEquals(cccp.getIdentityId(), cccp.getCachedIdentityId());
        }

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
    }

    @Test
    public void testMultipleCognitoCachingCredentialsProvidersWithRefresh() throws Exception {
        CognitoCachingCredentialsProvider credentialsProvider1 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure("kinesis").getString("identity_pool_id"),
                Regions.US_EAST_1);
        credentialsProvider1.setPersistenceEnabled(false);

        credentialsProviders.add(credentialsProvider1);

        for (CognitoCachingCredentialsProvider cccp: credentialsProviders) {
            cccp.setPersistenceEnabled(false);
            assertNull(cccp.getCachedIdentityId());
            cccp.clearCredentials();
            cccp.clear();
            assertNull(cccp.getCachedIdentityId());

            final AWSSessionCredentials credentialsBeforeRefresh = cccp.getCredentials();
            assertNotNull(credentialsBeforeRefresh);
            Log.d(TAG, "Before Refresh: Credentials = " + credentialsBeforeRefresh);


            final String identityIdBeforeRefresh = cccp.getIdentityId();
            assertNotNull(identityIdBeforeRefresh);
            Log.d(TAG, "Before Refresh: Identity Id = " + identityIdBeforeRefresh);

            final String cachedIdentityIdBeforeRefresh = cccp.getCachedIdentityId();
            assertNotNull(cachedIdentityIdBeforeRefresh);
            Log.d(TAG, "Before Refresh: Cached Identity Id = " + cachedIdentityIdBeforeRefresh);

            assertEquals(identityIdBeforeRefresh, cachedIdentityIdBeforeRefresh);

            // Refresh
            cccp.refresh();

            final AWSSessionCredentials credentialsAfterRefresh = cccp.getCredentials();
            assertNotNull(credentialsAfterRefresh);
            Log.d(TAG, "After Refresh: Credentials = " + credentialsAfterRefresh);
            assertNotEquals(credentialsAfterRefresh.getSessionToken(), credentialsBeforeRefresh.getSessionToken());
            assertNotEquals(credentialsAfterRefresh.getAWSSecretKey(), credentialsBeforeRefresh.getAWSSecretKey());
            assertNotEquals(credentialsAfterRefresh.getAWSAccessKeyId(), credentialsBeforeRefresh.getAWSAccessKeyId());


            final String identityIdAfterRefresh = cccp.getIdentityId();
            assertNotNull(identityIdAfterRefresh);
            Log.d(TAG, "After Refresh: Identity Id = " + identityIdAfterRefresh);
            assertEquals(identityIdAfterRefresh, identityIdBeforeRefresh);

            final String cachedIdentityIdAfterRefresh = cccp.getCachedIdentityId();
            assertNotNull(cachedIdentityIdAfterRefresh);
            Log.d(TAG, "After Refresh: Cached Identity Id = " + cachedIdentityIdAfterRefresh);
            assertEquals(cachedIdentityIdAfterRefresh, cachedIdentityIdBeforeRefresh);

            assertEquals(identityIdAfterRefresh, cachedIdentityIdAfterRefresh);
        }
    }

    @Test
    public void testCachedAWSCredentialsPersistence() throws Exception {
        Log.d(TAG, "SharedPreferences keys for com.amazonaws.android.auth => " +
                sharedPreferencesForAuth
                        .getAll()
                        .toString());

        assertNull(credentialsProvider.getCachedIdentityId());
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        assertNotNull(credentialsProvider.getCredentials());
        assertNotNull(credentialsProvider.getIdentityId());
        assertNotNull(credentialsProvider.getCachedIdentityId());
        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();

        // Now create a new credentials provider with the same identity pool id
        CognitoCachingCredentialsProvider persistenceCredentialsProvider = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
        credentialsProviders.add(persistenceCredentialsProvider);

        Log.d(TAG, "Persistence check: SharedPreferences keys for com.amazonaws.android.auth => " +
                sharedPreferencesForAuth
                        .getAll()
                        .toString());

        assertNotNull(persistenceCredentialsProvider.getCachedIdentityId());
        persistenceCredentialsProvider.clearCredentials();
        persistenceCredentialsProvider.clear();
        assertNull(persistenceCredentialsProvider.getCachedIdentityId());

        assertNotNull(persistenceCredentialsProvider.getCredentials());
        Log.d(TAG, "Credentials = " + persistenceCredentialsProvider.getCredentials());

        assertNotNull(persistenceCredentialsProvider.getIdentityId());
        Log.d(TAG, "Identity Id = " + persistenceCredentialsProvider.getIdentityId());

        assertNotNull(persistenceCredentialsProvider.getCachedIdentityId());
        Log.d(TAG, "Cached Identity Id = " + persistenceCredentialsProvider.getCachedIdentityId());

        assertEquals(persistenceCredentialsProvider.getIdentityId(), persistenceCredentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
    }

    @Test
    public void testConstructMultipleCCCPs() throws Exception {
        CognitoCachingCredentialsProvider cccp1 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);

        String identityId = cccp1.getIdentityId();
        cccp1.getCredentials();

        cccp1.clearCredentials();
        cccp1.clear();
        identityId = cccp1.getIdentityId();
        cccp1.getCredentials();

        CognitoCachingCredentialsProvider cccp2 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
        assertNotNull(cccp2.getCachedIdentityId());
        assertEquals(identityId, cccp2.getCachedIdentityId());
    }

    private void verifySharedPreferencesContents() {
        assert sharedPreferencesForAuth.getAll().keySet().size() == credentialsProviders.size() * 5;

        Log.d(TAG, "SharedPreferences Keys = " +
                sharedPreferencesForAuth.getAll().keySet().toString());

        for (int iterator = 0; iterator < credentialsProviders.size(); iterator++) {
            final CognitoCachingCredentialsProvider cccp = credentialsProviders.get(iterator);
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".accessKey.encrypted" , null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".secretKey.encrypted", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".sessionToken.encrypted", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".identityId.encrypted", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".expirationDate.encrypted", null));

            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".accessKey.encrypted.iv" , null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".secretKey.encrypted.iv", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".sessionToken.encrypted.iv", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".identityId.encrypted.iv", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".expirationDate.encrypted.iv", null));

            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".accessKey.encrypted.keyvaluestoreversion" , null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".secretKey.encrypted.keyvaluestoreversion", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".sessionToken.encrypted.keyvaluestoreversion", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".identityId.encrypted.keyvaluestoreversion", null));
            assertNotNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".expirationDate.encrypted.keyvaluestoreversion", null));

            assertNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".accessKey", null));
            assertNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".secretKey", null));
            assertNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".sessionToken", null));
            assertNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".identityId", null));
            assertNull(sharedPreferencesForAuth.getString(cccp.getIdentityPoolId() + ".expirationDate", null));
        }
    }

    private void verifyCredentialsProviderClear() {
        for (int iterator = 0; iterator < credentialsProviders.size(); iterator++){
            final CognitoCachingCredentialsProvider cccp = credentialsProviders.get(iterator);

            cccp.clearCredentials();
            cccp.clear();

            assertNull(cccp.getCachedIdentityId());
            assertNotNull(cccp.getIdentityId());
            assertNotNull(cccp.getCachedIdentityId());
        }
    }
}
