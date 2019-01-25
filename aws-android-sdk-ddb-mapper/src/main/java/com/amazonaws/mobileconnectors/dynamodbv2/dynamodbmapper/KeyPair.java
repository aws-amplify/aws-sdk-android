/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

/**
 * A KeyPair of hash and range key.
 */
public class KeyPair {
    private Object hashKey;
    private Object rangeKey;

    /**
     * sets the hash key
     *
     * @param hashkey the hash key
     * @return update {@link KeyPair}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public KeyPair withHashKey(Object hashkey) {
        this.hashKey = hashkey;
        return this;
    }

    /**
     * sets the range key
     *
     * @param rangeKey the range key
     * @return updated {@link KeyPair}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public KeyPair withRangeKey(Object rangeKey) {
        this.rangeKey = rangeKey;
        return this;
    }

    /**
     * set the hash key.
     *
     * @param hashKey the hash key.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setHashKey(Object hashKey) {
        this.hashKey = hashKey;
    }

    /**
     * sets the range key.
     *
     * @param rangeKey the range key
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setRangeKey(Object rangeKey) {
        this.rangeKey = rangeKey;
    }

    public Object getHashKey() {
        return this.hashKey;
    }

    public Object getRangeKey() {
        return this.rangeKey;
    }
}
