/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Platform
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public enum Platform {

    APNS("APNS"),
    APNS_SANDBOX("APNS_SANDBOX"),
    GCM("GCM"),
    ADM("ADM");

    private String value;

    private Platform(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Platform> enumMap;
    static {
        enumMap = new HashMap<String, Platform>();
        enumMap.put("APNS", APNS);
        enumMap.put("APNS_SANDBOX", APNS_SANDBOX);
        enumMap.put("GCM", GCM);
        enumMap.put("ADM", ADM);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Platform corresponding to the value
     */
    public static Platform fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
