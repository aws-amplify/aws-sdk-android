/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Canned Access Control List
 */
public enum CannedAccessControlList {

    Private("private"),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    AwsExecRead("aws-exec-read"),
    AuthenticatedRead("authenticated-read"),
    BucketOwnerRead("bucket-owner-read"),
    BucketOwnerFullControl("bucket-owner-full-control"),
    LogDeliveryWrite("log-delivery-write");

    private String value;

    private CannedAccessControlList(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CannedAccessControlList> enumMap;
    static {
        enumMap = new HashMap<String, CannedAccessControlList>();
        enumMap.put("private", Private);
        enumMap.put("public-read", PublicRead);
        enumMap.put("public-read-write", PublicReadWrite);
        enumMap.put("aws-exec-read", AwsExecRead);
        enumMap.put("authenticated-read", AuthenticatedRead);
        enumMap.put("bucket-owner-read", BucketOwnerRead);
        enumMap.put("bucket-owner-full-control", BucketOwnerFullControl);
        enumMap.put("log-delivery-write", LogDeliveryWrite);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CannedAccessControlList corresponding to the value
     */
    public static CannedAccessControlList fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
