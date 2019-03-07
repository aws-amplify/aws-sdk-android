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

@RunWith(AndroidJUnit4.class)
public class AWSKeyStoreIntegrationTest extends CoreIntegrationTestBase {

    private static AWSKeyValueStore keyStore;

    private static final String DEFAULT_SHARED_PREFERENCES_NAME = "com.amazonaws.android.auth";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        keyStore = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
    }

    @After
    public void tearDown() {
        keyStore.clear();
    }

    @Test
    public void testGetSet() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));
    }

    @Test
    public void testGetSetUpdate() {
        final String key = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(keyStore.get(key));
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));

        accessKey = "b-dummy-access-key";
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));
    }

    @Test
    public void testGetSetUpdates() {
        final String key = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(keyStore.get(key));
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));

        accessKey = "b-dummy-access-key";
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));

        keyStore.put(key, null);
        assertEquals(null, keyStore.get(key));
        assertNull(keyStore.get(key));

        accessKey = "c-dummy-access-key";
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));

        accessKey = "d-dummy-access-key";
        keyStore.put(key, accessKey);
        assertEquals(accessKey, keyStore.get(key));
    }

    @Test
    public void testGetSetRemoveGetSet() {
        final String keyForAccessKey = "access-key";
        String accessKey = "a-dummy-access-key";
        assertNull(keyStore.get(keyForAccessKey));
        keyStore.put(keyForAccessKey, accessKey);
        assertEquals(accessKey, keyStore.get(keyForAccessKey));

        final String keyForSecretAccessKey = "secret-access-key";
        String secretAccessKey = "a-dummy-secret-access-key";
        assertNull(keyStore.get(keyForSecretAccessKey));
        keyStore.put(keyForSecretAccessKey, secretAccessKey);
        assertEquals(secretAccessKey, keyStore.get(keyForSecretAccessKey));

        keyStore.remove(keyForAccessKey);
        assertNull(keyStore.get(keyForAccessKey));
        assertNotNull(keyStore.get(keyForSecretAccessKey));
        assertEquals(secretAccessKey, keyStore.get(keyForSecretAccessKey));

        keyStore.clear();
        assertNull(keyStore.get(keyForAccessKey));
        assertNull(keyStore.get(keyForSecretAccessKey));
    }

    @Test
    public void testGetSetNull() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore.get(key));

        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.put(key, null);
        assertNull(keyStore.get(key));

        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));
    }

    @Test
    public void testGetSetPersistence() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(value, keyStore2.get(key));
    }

    @Test
    public void testGetSetPersistenceWithClear() {
        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.clear();
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(value, keyStore2.get(key));
    }

    @Test
    public void testGetSetPersistenceMigration() {
        final String sharedPreferencesName = "my.shared.preferences";
        final String key = "access-key";
        final String value = "a-dummy-access-key";

        SharedPreferences sharedPreferences = InstrumentationRegistry
                .getTargetContext()
                .getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE);
        sharedPreferences.edit()
                .putString(key, value)
                .apply();
        assertEquals(value, sharedPreferences.getString(key, null));

        AWSKeyValueStore keyStore = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                sharedPreferencesName,
                true);

        assertNull(sharedPreferences.getString(key, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + AWSKeyValueStore.SHARED_PREFERENCES_IV_SUFFIX, null));
        assertNotNull(sharedPreferences.getString(
                key + AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX + AWSKeyValueStore.SHARED_PREFERENCES_STORE_VERSION_SUFFIX, null));

        assertNotNull(keyStore.get(key));
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        keyStore.clear();
        keyStore.put(key, value);
        assertEquals(value, keyStore.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                sharedPreferencesName,
                true);
        assertEquals(value, keyStore2.get(key));
    }

    @Test
    public void testGetSetTwoStores() {
        AWSKeyValueStore keyStore1 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);

        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore1.get(key));
        keyStore1.put(key, value);
        assertEquals(value, keyStore1.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        assertEquals(keyStore1.get(key), keyStore2.get(key));
    }

    @Test
    public void testGetSetTwoStoresNoPersistence() {
        AWSKeyValueStore keyStore1 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        keyStore1.setPersistenceEnabled(false);

        final String key = "access-key";
        final String value = "a-dummy-access-key";
        assertNull(keyStore1.get(key));
        keyStore1.put(key, value);
        assertEquals(value, keyStore1.get(key));

        AWSKeyValueStore keyStore2 = new AWSKeyValueStore(InstrumentationRegistry.getTargetContext(),
                DEFAULT_SHARED_PREFERENCES_NAME,
                true);
        keyStore2.setPersistenceEnabled(false);
        assertEquals(keyStore1.get(key), keyStore2.get(key));
    }
}
