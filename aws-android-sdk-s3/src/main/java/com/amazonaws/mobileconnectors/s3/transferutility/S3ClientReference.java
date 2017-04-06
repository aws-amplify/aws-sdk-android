/**
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.AmazonS3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A holder of S3 clients for {@link TransferUtility} to pass a reference of
 * AmazonS3 to {@link TransferService}. Usually objects are passed to a service
 * via intent in a parcelable form. A S3 client has too many elements to
 * capture. Instead, this serves as an alternative approach, not ideal though.
 */
class S3ClientReference {

    private static Map<String, AmazonS3> map = new ConcurrentHashMap<String, AmazonS3>();

    public static void put(String key, AmazonS3 s3) {
        map.put(key, s3);
    }

    /**
     * Retrieves the AmazonS3 client on the given key.
     *
     * @param key key of the client
     * @return an AmazonS3 instance, or null if the key doesn't exist
     */
    public static AmazonS3 get(String key) {
        return map.remove(key);
    }

    /**
     * Clears all references.
     */
    public static void clear() {
        map.clear();
    }
}
