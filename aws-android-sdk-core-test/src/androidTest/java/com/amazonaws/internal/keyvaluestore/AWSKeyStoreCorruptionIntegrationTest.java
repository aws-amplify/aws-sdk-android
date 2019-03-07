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
public class AWSKeyStoreCorruptionIntegrationTest extends CoreIntegrationTestBase {

    private static String TAG = AWSKeyStoreCorruptionIntegrationTest.class.getSimpleName();

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

        credentialsProviders= new ArrayList<CognitoCachingCredentialsProvider>();
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
    }

    @Test
    public void testCachedAWSCredentialsWithCorruptedAccessKey() throws Exception {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();

        assertNull(credentialsProvider.getCachedIdentityId());
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        final AWSSessionCredentials currentCredentials = credentialsProvider.getCredentials();
        assertNotNull(currentCredentials);
        Log.d(TAG, "Credentials = " + currentCredentials);

        assertNotNull(credentialsProvider.getIdentityId());
        Log.d(TAG, "Identity Id = " + credentialsProvider.getIdentityId());

        assertNotNull(credentialsProvider.getCachedIdentityId());
        Log.d(TAG, "Cached Identity Id = " + credentialsProvider.getCachedIdentityId());

        Log.d(TAG, "sharedPreferencesForAuth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();

        // make the access key null
        sharedPreferencesForAuth
                .edit()
                .putString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted", null)
                .commit();

        Log.d(TAG, "sharedPreferencesForAuth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertNull(sharedPreferencesForAuth
                        .getString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted",
                                null));

        // getCredentials() now will fetch the same credentials from AWS Cognito by making a network call
        final AWSSessionCredentials credentialsFromCredentialsProvider = credentialsProvider.getCredentials();
        assertNotNull("getCredentials() with corrupted data should fetch new credentials",
                credentialsFromCredentialsProvider);
        assertEquals(currentCredentials.getAWSAccessKeyId(),
                credentialsFromCredentialsProvider.getAWSAccessKeyId());
        assertEquals(currentCredentials.getAWSSecretKey(),
                credentialsFromCredentialsProvider.getAWSSecretKey());
        assertEquals(currentCredentials.getSessionToken(),
                credentialsFromCredentialsProvider.getSessionToken());

        // Repeat getCredentials() for an other credentials provider
        CognitoCachingCredentialsProvider credentialsProvider1 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);

        final AWSSessionCredentials newCredentials = credentialsProvider1.getCredentials();
        assertNotNull("getCredentials() with corrupted key should fetch new credentials",
                newCredentials);
        assertNotEquals(currentCredentials.getAWSAccessKeyId(), newCredentials.getAWSAccessKeyId());
        assertNotEquals(currentCredentials.getAWSSecretKey(), newCredentials.getAWSSecretKey());
        assertNotEquals(currentCredentials.getSessionToken(), newCredentials.getSessionToken());

        verifyCredentialsProviderClear();
    }

    @Test
    public void testCachedAWSCredentialsWithCredentialsExpired() throws Exception {
        sharedPreferencesForAuth
                .edit()
                .clear()
                .commit();

        assertNull(credentialsProvider.getCachedIdentityId());
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        assertNull(credentialsProvider.getCachedIdentityId());

        final AWSSessionCredentials currentCredentials = credentialsProvider.getCredentials();
        assertNotNull(currentCredentials);
        Log.d(TAG, "Credentials = " + currentCredentials);

        assertNotNull(credentialsProvider.getIdentityId());
        Log.d(TAG, "Identity Id = " + credentialsProvider.getIdentityId());

        assertNotNull(credentialsProvider.getCachedIdentityId());
        Log.d(TAG, "Cached Identity Id = " + credentialsProvider.getCachedIdentityId());

        Log.d(TAG, "sharedPreferencesForAuth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertEquals(credentialsProvider.getIdentityId(), credentialsProvider.getCachedIdentityId());

        verifySharedPreferencesContents();

        // make the access key null
        sharedPreferencesForAuth
                .edit()
                .putString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted", "-00000011111")
                .commit();

        Log.d(TAG, "sharedPreferencesForAuth => " +
                sharedPreferencesForAuth.getAll().toString());

        assertEquals("-00000011111", sharedPreferencesForAuth
                .getString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted",
                        null));

        // getCredentials() now will fetch the SAME credentials from Amazon Cognito by making a network call
        // as the credentials are only expired on client locally.
        AWSSessionCredentials credentialsFromCredentialsProvider = credentialsProvider.getCredentials();
        assertNotNull("getCredentials() with credentials expired locally should fetch new credentials",
                credentialsFromCredentialsProvider);
        assertEquals(currentCredentials.getAWSAccessKeyId(),
                credentialsFromCredentialsProvider.getAWSAccessKeyId());
        assertEquals(currentCredentials.getAWSSecretKey(),
                credentialsFromCredentialsProvider.getAWSSecretKey());
        assertEquals(currentCredentials.getSessionToken(),
                credentialsFromCredentialsProvider.getSessionToken());

        // refresh will get NEW credentials from Amazon Cognito by making a network call
        credentialsProvider.refresh();
        AWSSessionCredentials credentialsFromCredentialsProviderAfterRefresh = credentialsProvider.getCredentials();
        assertNotNull("getCredentials() after refresh should fetch new credentials",
                credentialsFromCredentialsProviderAfterRefresh);
        assertNotEquals(credentialsFromCredentialsProviderAfterRefresh.getAWSAccessKeyId(),
                credentialsFromCredentialsProvider.getAWSAccessKeyId());
        assertNotEquals(credentialsFromCredentialsProviderAfterRefresh.getAWSSecretKey(),
                credentialsFromCredentialsProvider.getAWSSecretKey());
        assertNotEquals(credentialsFromCredentialsProviderAfterRefresh.getSessionToken(),
                credentialsFromCredentialsProvider.getSessionToken());

        // Repeat getCredentials() for an other credentials provider
        CognitoCachingCredentialsProvider credentialsProvider1 = new CognitoCachingCredentialsProvider(
                InstrumentationRegistry.getTargetContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);

        final AWSSessionCredentials newCredentials = credentialsProvider1.getCredentials();
        assertNotNull("getCredentials() with corrupted key should fetch new credentials",
                newCredentials);
        assertNotEquals(currentCredentials.getAWSAccessKeyId(), newCredentials.getAWSAccessKeyId());
        assertNotEquals(currentCredentials.getAWSSecretKey(), newCredentials.getAWSSecretKey());
        assertNotEquals(currentCredentials.getSessionToken(), newCredentials.getSessionToken());

        verifyCredentialsProviderClear();
    }

    private void verifySharedPreferencesContents() {
        final SharedPreferences sharedPreferences = InstrumentationRegistry.getTargetContext()
                .getSharedPreferences("com.amazonaws.android.auth",
                        Context.MODE_PRIVATE);
        assert sharedPreferences.getAll().keySet().size() == credentialsProviders.size() * 5;
        Log.d(TAG, "SharedPreferences Keys = " +
                sharedPreferences.getAll().keySet().toString());

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
