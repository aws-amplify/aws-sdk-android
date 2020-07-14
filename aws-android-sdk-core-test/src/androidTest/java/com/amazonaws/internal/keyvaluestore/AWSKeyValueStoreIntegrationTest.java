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
import org.junit.Test;

import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_IV_SUFFIX;
import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_STORE_VERSION_SUFFIX;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.test.core.app.ApplicationProvider;
import android.util.Log;

import java.security.Key;
import java.security.KeyStore;
import java.util.Map;

public class AWSKeyValueStoreIntegrationTest extends CoreIntegrationTestBase {

    private static AWSKeyValueStore awsKeyValueStore;

    private static final String DEFAULT_SHARED_PREFERENCES_NAME = "com.amazonaws.android.auth";

    @Before
    public void setUp() {
        awsKeyValueStore = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
    }

    @After
    public void tearDown() {
        awsKeyValueStore.clear();
        deleteAllEncryptionKeys();
    }

    @Test
    public void testEncryptionKeyGeneration() {
        final String dataKey = "my-data-key";
        final Key encryptionKey = awsKeyValueStore.generateEncryptionKey(dataKey);
        assertNotNull(encryptionKey);
    }

    @Test
    public void testGetSet() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));
    }

    @Test
    public void testGetSetUpdate() {
        final String key = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));

        accessKey = "b-dummy-access-key";
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));
    }

    @Test
    public void testGetSetUpdates() {
        final String key = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));

        accessKey = "b-dummy-access-key";
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));

        awsKeyValueStore.put(key, null);
        assertEquals(null, awsKeyValueStore.get(key));
        assertNull(awsKeyValueStore.get(key));

        accessKey = "c-dummy-access-key";
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));

        accessKey = "d-dummy-access-key";
        awsKeyValueStore.put(key, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(key));
    }

    @Test
    public void testGetSetRemoveGetSet() {
        final String keyForAccessKey = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(keyForAccessKey));
        awsKeyValueStore.put(keyForAccessKey, accessKey);
        assertEquals(accessKey, awsKeyValueStore.get(keyForAccessKey));

        final String keyForSecretAccessKey = "secret-access-key";
        String secretAccessKey = "a-dummy-secret-access-key";
        assertNull(awsKeyValueStore.get(keyForSecretAccessKey));
        awsKeyValueStore.put(keyForSecretAccessKey, secretAccessKey);
        assertEquals(secretAccessKey, awsKeyValueStore.get(keyForSecretAccessKey));

        awsKeyValueStore.remove(keyForAccessKey);
        assertNull(awsKeyValueStore.get(keyForAccessKey));
        assertNotNull(awsKeyValueStore.get(keyForSecretAccessKey));
        assertEquals(secretAccessKey, awsKeyValueStore.get(keyForSecretAccessKey));

        awsKeyValueStore.clear();
        assertNull(awsKeyValueStore.get(keyForAccessKey));
        assertNull(awsKeyValueStore.get(keyForSecretAccessKey));
    }

    @Test
    public void testGetSetNull() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));

        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));

        awsKeyValueStore.put(key, null);
        assertNull(awsKeyValueStore.get(key));

        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));
    }

    @Test
    public void testGetSetPersistence() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));

        AWSKeyValueStore keyValueStore2 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(value, keyValueStore2.get(key));
    }

    @Test
    public void testGetSetPersistenceWithClear() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));

        awsKeyValueStore.clear();
        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(value, keyStore2.get(key));
    }

    @Test
    public void testGetSetPersistenceMigration() {
        final String sharedPreferencesName = "my.shared.preferences";
        final String key = "access-key";
        final String value = "a-dummy-access-key";

        SharedPreferences sharedPreferences = ApplicationProvider.getApplicationContext()
                .getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE);
        sharedPreferences.edit()
                .putString(key, value)
                .apply();
        assertEquals(value, sharedPreferences.getString(key, null));

        Map<String, ?> map = sharedPreferences.getAll();
        for (String spKey : map.keySet()) {
            Log.d(TAG, "spKey = " + spKey + "; value = " + map.get(spKey));
        }

        AWSKeyValueStore keyStore = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                sharedPreferencesName,
                true);

        Log.d(TAG, "sharedPreferencesForData = " + sharedPreferences.getAll().toString());

        assertNull(sharedPreferences.getString(key, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_IV_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));

        assertNotNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.clear();
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                sharedPreferencesName,
                true);

        Log.d(TAG, "sharedPreferencesForData = " + sharedPreferences.getAll().toString());
        assertEquals(value, keyStore2.get(key));
    }

    @Test
    public void testGetSetTwoStores() {
        AWSKeyValueStore keyStore1 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);

        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore1.get(key));
        keyStore1.put(key, value);
        assertEquals(value, keyStore1.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(keyStore1.get(key), keyStore2.get(key));
    }

    @Test
    public void testGetSetTwoStoresNoPersistence() {
        AWSKeyValueStore keyStore1 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        keyStore1.setPersistenceEnabled(false);

        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore1.get(key));
        keyStore1.put(key, value);
        assertEquals(value, keyStore1.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        keyStore2.setPersistenceEnabled(false);
        assertEquals(keyStore1.get(key), keyStore2.get(key));
    }

    @Test
    public void testGetSetPersistenceSwitchTrueToFalse() {
        // Have existing state
        final String sharedPreferencesName = "my.shared.preferences";
        final String key = "access-key";
        final String value = "a-dummy-access-key";

        SharedPreferences sharedPreferences = ApplicationProvider.getApplicationContext()
                .getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        sharedPreferences.edit()
                .putString(key, value)
                .apply();
        assertEquals(value, sharedPreferences.getString(key, null));

        Map<String, ?> map = sharedPreferences.getAll();
        for (String spKey : map.keySet()) {
            Log.d(TAG, "spKey = " + spKey + "; value = " + map.get(spKey));
        }

        // Migrate from SharedPreferences to AWSKeyValueStore
        AWSKeyValueStore keyStore = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                sharedPreferencesName,
                true);

        Log.d(TAG, "sharedPreferencesForData = " + sharedPreferences.getAll().toString());

        assertNull(sharedPreferences.getString(key, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_IV_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));

        assertNotNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.clear();
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        // Toggle the switch from true to false
        keyStore.setPersistenceEnabled(false);
        assertEquals(0, sharedPreferences.getAll().size());
        assertNotNull(keyStore.get(key));
    }

    @Test
    public void testGetSetPersistenceSwitchFalseToTrue() {
        final String sharedPreferencesName = "my.shared.preferences";
        final String key = "access-key";
        final String value = "a-dummy-access-key";

        SharedPreferences sharedPreferences = ApplicationProvider.getApplicationContext()
                .getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        // Migrate from SharedPreferences to AWSKeyValueStore
        AWSKeyValueStore keyStore = new AWSKeyValueStore(ApplicationProvider.getApplicationContext(),
                sharedPreferencesName,
                false);

        assertNull(sharedPreferences.getString(key, null));
        assertNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX, null));
        assertNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_IV_SUFFIX, null));
        assertNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));

        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.clear();
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        // Toggle the switch from false to true
        keyStore.setPersistenceEnabled(true);
        keyStore.put(key, value);
        assertNotNull(keyStore.get(key));

        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_IV_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));
    }

    @Test
    public void testCRUDLifeCycle1() {
        // Get (Read), Put (Create), Put (Update),
        // Remove (Delete), Put (Create), Clear
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, value);
        assertEquals(value, awsKeyValueStore.get(key));

        final String newValue = "b-dummy-access-key";
        awsKeyValueStore.put(key, newValue);
        assertEquals(newValue, awsKeyValueStore.get(key));

        awsKeyValueStore.remove(key);
        assertNull(awsKeyValueStore.get(key));
        awsKeyValueStore.put(key, newValue);
        assertEquals(newValue, awsKeyValueStore.get(key));

        awsKeyValueStore.clear();
        assertNull(awsKeyValueStore.get(key));
    }

    @Test
    public void testCRUDLifeCycle2() {
        // loop { Get (Read), Put (Create), Get (Read) }
        // Remove one item, Get for remaining will return correct data
        // loop { Put (Update/Create), Get (Read)
        for (int iterator = 1; iterator <= 10; iterator++) {
            final String key = "access-key-" + iterator;
            final String value = "a-dummy-access-key-" + iterator;
            assertNull(awsKeyValueStore.get(key));
            awsKeyValueStore.put(key, value);
            assertEquals(value, awsKeyValueStore.get(key));
        }

        awsKeyValueStore.remove("access-key-" + 10);
        for (int iterator = 1; iterator <= 9; iterator++) {
            assertEquals("a-dummy-access-key-" + iterator,
                    awsKeyValueStore.get("access-key-" + iterator));
        }

        assertNull(awsKeyValueStore.get("access-key-" + 10));
        awsKeyValueStore.put("access-key-" + 10,
                "a-dummy-access-key-" + 10);

        for (int iterator = 1; iterator <= 10; iterator++) {
            assertEquals("a-dummy-access-key-" + iterator,
                    awsKeyValueStore.get("access-key-" + iterator));
        }

        awsKeyValueStore.clear();
        for (int iterator = 1; iterator <= 10; iterator++) {
            assertNull(awsKeyValueStore.get("access-key-" + iterator));
        }
    }

    @Test
    public void benchmarkKeyStoreOperations() {
        long begin = System.nanoTime();

        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);

            KeyProvider23 keyProvider23 = new KeyProvider23();
            keyProvider23.generateKey("a");
        } catch (Exception ex) {
            fail(Log.getStackTraceString(ex));
        }

        long end = System.nanoTime();

        Log.d(TAG, "KeyStore load time: " + String.valueOf(end - begin) + " ns.");
    }
}
