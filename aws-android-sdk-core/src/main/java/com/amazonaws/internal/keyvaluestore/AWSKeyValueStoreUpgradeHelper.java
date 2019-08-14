/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal.keyvaluestore;

import android.content.SharedPreferences;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_IV_SUFFIX;
import static com.amazonaws.internal.keyvaluestore.AWSKeyValueStore.SHARED_PREFERENCES_STORE_VERSION_SUFFIX;

public class AWSKeyValueStoreUpgradeHelper {

    // This represents the latest version of the awsKeyValueStore.
    // Update this when the AWSKeyValueStore is being upgraded.
    private static final int AWS_KEY_VALUE_STORE_LATEST_VERSION = 2;

    private static final String TAG = AWSKeyValueStoreUpgradeHelper.class.getSimpleName();

    private AWSKeyValueStore awsKeyValueStore;
    private int version;

    public AWSKeyValueStoreUpgradeHelper(AWSKeyValueStore awsKeyValueStore) {
        this(awsKeyValueStore, AWS_KEY_VALUE_STORE_LATEST_VERSION);
    }

    public AWSKeyValueStoreUpgradeHelper(AWSKeyValueStore awsKeyValueStore, int version) {
        this.awsKeyValueStore = awsKeyValueStore;
        this.version = version;
    }

    public void onUpgrade(AWSKeyValueStoreVersion oldVersion, AWSKeyValueStoreVersion newVersion) {
        if (AWSKeyValueStoreVersion.VERSION_0.equals(oldVersion) &&
            AWSKeyValueStoreVersion.VERSION_1.equals(newVersion)) {
            upgradeFromVersion0ToVersion1();
        }
    }

    /**
     * Migrate all the keys in the SharedPreferences namespace
     * except for the encryption metadata
     */
    private void upgradeFromVersion0ToVersion1() {
        SharedPreferences sharedPreferencesForData = awsKeyValueStore.sharedPreferencesForData;
        Map<String, ?> map = sharedPreferencesForData.getAll();
        for (String spKey : map.keySet()) {
            if (!spKey.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_IV_SUFFIX) &&
                !spKey.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {

                // Check if its an instance of the dataType.
                if (map.get(spKey) instanceof Long) {
                    Long longValue = sharedPreferencesForData.getLong(spKey, 0);
                    awsKeyValueStore.put(spKey, String.valueOf(longValue));
                } else if (map.get(spKey) instanceof String) {
                    awsKeyValueStore.put(spKey, sharedPreferencesForData.getString(spKey, null));
                } else if (map.get(spKey) instanceof Float) {
                    Float floatValue = sharedPreferencesForData.getFloat(spKey, 0);
                    awsKeyValueStore.put(spKey, String.valueOf(floatValue));
                } else if (map.get(spKey) instanceof Boolean) {
                    Boolean booleanValue = sharedPreferencesForData.getBoolean(spKey, false);
                    awsKeyValueStore.put(spKey, String.valueOf(booleanValue));
                } else if (map.get(spKey) instanceof Integer) {
                    Integer intValue = sharedPreferencesForData.getInt(spKey, 0);
                    awsKeyValueStore.put(spKey, String.valueOf(intValue));
                } else if (map.get(spKey) instanceof Set) {
                    Set<String> stringSet = (Set<String>) map.get(spKey);
                    StringBuilder stringBuilder = new StringBuilder();
                    Iterator<String> setIterator = stringSet.iterator();
                    while (setIterator.hasNext())  {
                        stringBuilder.append(setIterator.next());
                        if (setIterator.hasNext()) {
                            stringBuilder.append(",");
                        }
                    }
                    awsKeyValueStore.put(spKey, stringBuilder.toString());
                }

                // Remove the key since key.encrypted is written.
                sharedPreferencesForData.edit().remove(spKey).apply();
            }
        }
    }
}
