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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

import java.util.ArrayList;


@RunWith(AndroidJUnit4.class)
public class AWSKeyValueStoreMigrationIntegrationTest extends CoreIntegrationTestBase {

    private static String TAG = CognitoCachingCredentialsProviderIntegrationTest.class.getSimpleName();

    private ArrayList<CognitoCachingCredentialsProvider> credentialsProviders =new ArrayList<CognitoCachingCredentialsProvider>();
    private CognitoCachingCredentialsProvider credentialsProvider;

    private static SharedPreferences sharedPreferencesForAuth;
    private String identityPoolId;
    private long time;

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
        time = System.currentTimeMillis();
        identityPoolId = getPackageConfigure().getString("identity_pool_id");
        sharedPreferencesForAuth.edit()
                .putString(identityPoolId + ".accessKey" , "accessKey")
                .putString(identityPoolId + ".secretKey" , "secretKey")
                .putString(identityPoolId + ".sessionToken" , "sessionToken")
                .putString(identityPoolId + ".identityId" , "identityId")
                .putLong(identityPoolId + ".expirationDate" , time)
                .commit();
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
    public void testCachedAWSCredentialsMigration() throws Exception {
        Log.d(TAG, "SharedPreferences contents before migration for com.amazonaws.android.auth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertEquals("accessKey", sharedPreferencesForAuth.getString(identityPoolId + ".accessKey", null));
        assertEquals("secretKey", sharedPreferencesForAuth.getString(identityPoolId + ".secretKey", null));
        assertEquals("sessionToken", sharedPreferencesForAuth.getString(identityPoolId + ".sessionToken", null));
        assertEquals("identityId", sharedPreferencesForAuth.getString(identityPoolId + ".identityId", null));
        assertEquals(time, sharedPreferencesForAuth.getLong(identityPoolId + ".expirationDate", 0));

        credentialsProvider = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
        credentialsProviders.add(credentialsProvider);

        AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                "com.amazonaws.android.auth",
                true);

        Log.d(TAG, "SharedPreferences contents after migration for com.amazonaws.android.auth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertEquals("accessKey", awsKeyValueStore.get(identityPoolId + ".accessKey"));
        assertEquals("secretKey", awsKeyValueStore.get(identityPoolId + ".secretKey"));
        assertEquals("sessionToken", awsKeyValueStore.get(identityPoolId + ".sessionToken"));
        assertEquals("identityId", awsKeyValueStore.get(identityPoolId + ".identityId"));
        assertEquals(String.valueOf(time), awsKeyValueStore.get(identityPoolId + ".expirationDate"));

        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        assertNotNull(credentialsProvider.getCredentials());
        assertNotNull(credentialsProvider.getIdentityId());
        assertNotNull(credentialsProvider.getCachedIdentityId());

        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();
        verifyCredentialsProviderClear();
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
