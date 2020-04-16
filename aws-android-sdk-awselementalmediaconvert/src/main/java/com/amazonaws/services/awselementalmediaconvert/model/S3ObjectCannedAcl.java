/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
 */
public enum S3ObjectCannedAcl {

    PUBLIC_READ("PUBLIC_READ"),
    AUTHENTICATED_READ("AUTHENTICATED_READ"),
    BUCKET_OWNER_READ("BUCKET_OWNER_READ"),
    BUCKET_OWNER_FULL_CONTROL("BUCKET_OWNER_FULL_CONTROL");

    private String value;

    private S3ObjectCannedAcl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, S3ObjectCannedAcl> enumMap;
    static {
        enumMap = new HashMap<String, S3ObjectCannedAcl>();
        enumMap.put("PUBLIC_READ", PUBLIC_READ);
        enumMap.put("AUTHENTICATED_READ", AUTHENTICATED_READ);
        enumMap.put("BUCKET_OWNER_READ", BUCKET_OWNER_READ);
        enumMap.put("BUCKET_OWNER_FULL_CONTROL", BUCKET_OWNER_FULL_CONTROL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return S3ObjectCannedAcl corresponding to the value
     */
    public static S3ObjectCannedAcl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
