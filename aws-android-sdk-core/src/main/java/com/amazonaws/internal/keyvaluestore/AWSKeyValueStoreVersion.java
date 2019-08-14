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

/**
 * Enumerates the version of the AWSKeyValueStore.
 */
public enum AWSKeyValueStoreVersion {
    /**
     * This represents the state of the SDK where there was no
     * AWSKeyValueStore. All the data that is currently stored
     * and retrieved by the AWSKeyValueStore were directly stored
     * and retrieved through {@link android.content.SharedPreferences}.
     */
    VERSION_0(0),

    /**
     * The first version of AWSKeyValueStore. This uses one encryption key
     * to encrypt and decrypt all the data that is stored in one SharedPreferences
     * namespace (1:1 mapping between the encryption key and the SharedPreferences).
     */
    VERSION_1(1),
    ;

    private final int version;

    AWSKeyValueStoreVersion(int version) {
        this.version = version;
    }

    public int intValue() {
        return version;
    }

    public static AWSKeyValueStoreVersion fromInt(int intValue) {
        for (AWSKeyValueStoreVersion enumValue : values()) {
            if (enumValue.intValue() == intValue) {
                return enumValue;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + intValue + " value!");
    }
}
