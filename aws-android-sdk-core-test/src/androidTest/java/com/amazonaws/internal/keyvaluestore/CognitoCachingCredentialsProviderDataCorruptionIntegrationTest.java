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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX;
import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;


public class CognitoCachingCredentialsProviderDataCorruptionIntegrationTest extends CoreIntegrationTestBase {

    private static String TAG = CognitoCachingCredentialsProviderDataCorruptionIntegrationTest.class.getSimpleName();

    private CognitoCachingCredentialsProvider credentialsProvider;
    private static SharedPreferences sharedPreferencesForAuth;
    private static SharedPreferences sharedPreferencesForEncryptionMaterials;

    private static final String SHARED_PREFERENCES_NAME = "com.amazonaws.android.auth";

    @BeforeClass
    public static void setupBeforeClass() {
        sharedPreferencesForAuth = ApplicationProvider.getApplicationContext()
                .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        sharedPreferencesForEncryptionMaterials = ApplicationProvider.getApplicationContext()
                .getSharedPreferences(SHARED_PREFERENCES_NAME + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX, Context.MODE_PRIVATE);
    }

    @Before
    public void setUp() throws Exception {
        credentialsProvider = new CognitoCachingCredentialsProvider(
                ApplicationProvider.getApplicationContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
    }

    @After
    public void tearDown() {
        clearAll();
        verifyCredentialsProviderClear();
        deleteAllEncryptionKeys();
    }

    @Test
    public void testCachedAWSCredentialsWithCorruptedAccessKey() throws Exception {
        verifyGetCredentialsAndIdentityId();
        verifySharedPreferencesContents();
        final AWSSessionCredentials currentCredentials = credentialsProvider.getCredentials();

        // make the access key null
        sharedPreferencesForAuth
                .edit()
                .putString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted", null)
                .commit();
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
                ApplicationProvider.getApplicationContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);

        final AWSSessionCredentials newCredentials = credentialsProvider1.getCredentials();
        assertNotNull("getCredentials() with corrupted key should fetch new credentials",
                newCredentials);
        assertNotEquals(currentCredentials.getAWSAccessKeyId(), newCredentials.getAWSAccessKeyId());
        assertNotEquals(currentCredentials.getAWSSecretKey(), newCredentials.getAWSSecretKey());
        assertNotEquals(currentCredentials.getSessionToken(), newCredentials.getSessionToken());
    }

    @Test
    public void testCachedAWSCredentialsWithCredentialsExpired() throws Exception {
        verifyGetCredentialsAndIdentityId();
        verifySharedPreferencesContents();

        final AWSSessionCredentials currentCredentials = credentialsProvider.getCredentials();

        // modify the expiration date of credentials
        sharedPreferencesForAuth
                .edit()
                .putString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted", "-00000011111")
                .commit();

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
                ApplicationProvider.getApplicationContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);

        final AWSSessionCredentials newCredentials = credentialsProvider1.getCredentials();
        assertNotNull("getCredentials() with corrupted key should fetch new credentials",
                newCredentials);
        assertNotEquals(currentCredentials.getAWSAccessKeyId(), newCredentials.getAWSAccessKeyId());
        assertNotEquals(currentCredentials.getAWSSecretKey(), newCredentials.getAWSSecretKey());
        assertNotEquals(currentCredentials.getSessionToken(), newCredentials.getSessionToken());
    }

    // getCredentials() will store the encrypted credentials in SharedPreferences.
    // Now delete the key held in Android KeyStore
    // getCredentials() now cannot read the content, so it will delete the encrypted
    // credentials and go to clean state and fetch credentials from AWS.
    @Test
    public void testCachedAWSCredentialsWithKeyNotRetrieved() throws Exception {
        verifyGetCredentialsAndIdentityId();
        verifySharedPreferencesContents();

        final String cachedIdentityId = credentialsProvider.getCachedIdentityId();

        deleteAllEncryptionKeys();

        CognitoCachingCredentialsProvider credentialsProviderAfterKeyDeleted = new CognitoCachingCredentialsProvider(
                ApplicationProvider.getApplicationContext(),
                getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
        assertNull(credentialsProviderAfterKeyDeleted.getCachedIdentityId());
        assertNotNull(credentialsProviderAfterKeyDeleted.getCredentials());
        assertNotNull(credentialsProviderAfterKeyDeleted.getIdentityId());
        final String cachedIdentityIdAfterKeyDeleted = credentialsProviderAfterKeyDeleted.getCachedIdentityId();
        assertNotEquals(cachedIdentityId, cachedIdentityIdAfterKeyDeleted);
    }

    private void clearAll() {
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();
        sharedPreferencesForAuth.edit().clear().commit();
        sharedPreferencesForEncryptionMaterials.edit().clear().commit();
    }

    private void verifyGetCredentialsAndIdentityId() {
        assertNotNull(credentialsProvider.getCredentials());
        final String identityId = credentialsProvider.getIdentityId();
        assertNotNull(identityId);
        final String cachedIdentityId = credentialsProvider.getCachedIdentityId();
        assertNotNull(credentialsProvider.getCachedIdentityId());
        assertEquals(identityId, cachedIdentityId);
    }

    private void verifySharedPreferencesContents() {
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted" , null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".secretKey.encrypted", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".sessionToken.encrypted", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".identityId.encrypted", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted", null));

        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted.iv" , null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".secretKey.encrypted.iv", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".sessionToken.encrypted.iv", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".identityId.encrypted.iv", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted.iv", null));

        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".accessKey.encrypted.keyvaluestoreversion" , null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".secretKey.encrypted.keyvaluestoreversion", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".sessionToken.encrypted.keyvaluestoreversion", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".identityId.encrypted.keyvaluestoreversion", null));
        assertNotNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".expirationDate.encrypted.keyvaluestoreversion", null));

        assertNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".accessKey", null));
        assertNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".secretKey", null));
        assertNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".sessionToken", null));
        assertNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".identityId", null));
        assertNull(sharedPreferencesForAuth.getString(credentialsProvider.getIdentityPoolId() + ".expirationDate", null));
    }

    private void verifyCredentialsProviderClear() {
        credentialsProvider.clearCredentials();
        credentialsProvider.clear();

        assertNull(credentialsProvider.getCachedIdentityId());
        assertNotNull(credentialsProvider.getIdentityId());
        assertNotNull(credentialsProvider.getCachedIdentityId());
    }
}
