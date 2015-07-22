/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class S3ClientWeakReference {

    private static Map<String, WeakReference<AmazonS3>> map = new HashMap<String, WeakReference<AmazonS3>>();

    public static void put(String key, AmazonS3 s3) {
        WeakReference<AmazonS3> s3WeakReference = new WeakReference<AmazonS3>(s3);
        map.put(key, s3WeakReference);
    }

    public static AmazonS3 get(String key) {
        WeakReference<AmazonS3> s3WeakReference = map.get(key);
        if (s3WeakReference == null) {
            return null;
        } else {
            return s3WeakReference.get();
        }
    }
}
