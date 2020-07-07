package com.amazonaws.internal.keyvaluestore;

import android.content.SharedPreferences;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class KeyProviderIntegrationTest extends CoreIntegrationTestBase {

    private KeyProvider keyProvider;
    private SharedPreferences sharedPreferencesForData;
    private SharedPreferences sharedPreferencesForEnryptionMaterials;
    private static final String SHARED_PREFERENCES_NAME = "keyProviderTest";
    private static final String ENCRYPTION_KEY_ALIAS = "keyProviderTest";

    @Before
    public void setUp() {
        AWSKeyValueStore awsKeyValueStore = new AWSKeyValueStore(
                ApplicationProvider.getApplicationContext(),
                SHARED_PREFERENCES_NAME,
                true);
        keyProvider = awsKeyValueStore.keyProvider;
        sharedPreferencesForData = awsKeyValueStore.sharedPreferencesForData;
        sharedPreferencesForEnryptionMaterials = awsKeyValueStore.sharedPreferencesForEncryptionMaterials;
    }

    @After
    public void tearDown() {
        sharedPreferencesForData.edit().clear().commit();
        sharedPreferencesForEnryptionMaterials.edit().clear().commit();
        keyProvider.deleteKey(ENCRYPTION_KEY_ALIAS);
        deleteAllEncryptionKeys();
    }

    @Test
    public void testKeyGenerationAndRetrieval() throws Exception {
        verifyRetrieveKeyThrowsExceptionWhenNoKeyIsPresent();

        keyProvider.generateKey(ENCRYPTION_KEY_ALIAS);
        Key key = keyProvider.retrieveKey(ENCRYPTION_KEY_ALIAS);
        assertNotNull(key);
    }

    @Test
    public void testKeyDeletion() throws Exception {
        keyProvider.generateKey(ENCRYPTION_KEY_ALIAS);
        assertNotNull(keyProvider.retrieveKey(ENCRYPTION_KEY_ALIAS));
        keyProvider.deleteKey(ENCRYPTION_KEY_ALIAS);

        verifyRetrieveKeyThrowsExceptionWhenNoKeyIsPresent();
    }

    private void verifyRetrieveKeyThrowsExceptionWhenNoKeyIsPresent() {
        boolean assertKeyNotFoundExceptionThrown = false;

        try {
            keyProvider.retrieveKey(ENCRYPTION_KEY_ALIAS);
        } catch (KeyNotFoundException exception) {
            assertKeyNotFoundExceptionThrown = true;
        }

        assertTrue("Expected KeyNotFoundException to be thrown", assertKeyNotFoundExceptionThrown);
    }
}
