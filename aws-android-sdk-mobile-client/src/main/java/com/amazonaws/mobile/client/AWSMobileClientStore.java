/*
 * Copyright 2017-2021 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Uses {@link AWSKeyValueStore} to persistently store values for mobile client.
 */
final class AWSMobileClientStore implements KeyValueStore {
    private final AWSKeyValueStore mAWSKeyValueStore;
    private final ReadWriteLock mReadWriteLock;

    AWSMobileClientStore(AWSMobileClient client) {
        mAWSKeyValueStore = new AWSKeyValueStore(client.mContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                client.mIsPersistenceEnabled);
        mReadWriteLock = new ReentrantReadWriteLock();
    }

    @Override
    public Map<String, String> get(final String... keys) {
        try {
            mReadWriteLock.readLock().lock();
            HashMap<String, String> attributes = new HashMap<String, String>();
            for (String key : keys) {
                attributes.put(key, mAWSKeyValueStore.get(key));
            }
            return attributes;
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    @Override
    public String get(final String key) {
        try {
            mReadWriteLock.readLock().lock();
            return mAWSKeyValueStore.get(key);
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    @Override
    public void set(final Map<String, String> attributes) {
        try {
            mReadWriteLock.writeLock().lock();
            for (String key : attributes.keySet()) {
                mAWSKeyValueStore.put(key, attributes.get(key));
            }
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    @Override
    public void set(final String key, final String value) {
        try {
            mReadWriteLock.writeLock().lock();
            mAWSKeyValueStore.put(key, value);
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    @Override
    public void clear() {
        mAWSKeyValueStore.clear();
    }
}
