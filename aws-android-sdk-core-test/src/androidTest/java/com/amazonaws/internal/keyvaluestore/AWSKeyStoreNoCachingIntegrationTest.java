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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

import java.util.ArrayList;
import java.util.List;

public class AWSKeyStoreNoCachingIntegrationTest  extends CoreIntegrationTestBase {

    private static String TAG = AWSKeyStoreNoCachingIntegrationTest.class.getSimpleName();

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
        credentialsProvider.setPersistenceEnabled(false);
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
    public void testCachedAWSCredentialsWithNoEncryption() {
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

        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
    }

    @Test
    public void testCachedAWSCredentialsWithRefreshNoEncryption() {
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

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
    }

    private void verifySharedPreferencesContents() {
        assert sharedPreferencesForAuth.getAll().keySet().size() == 0;
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
