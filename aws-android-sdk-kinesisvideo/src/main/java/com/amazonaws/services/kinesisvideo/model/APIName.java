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

package com.amazonaws.services.kinesisvideo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * APIName
 */
public enum APIName {

    PUT_MEDIA("PUT_MEDIA"),
    GET_MEDIA("GET_MEDIA"),
    LIST_FRAGMENTS("LIST_FRAGMENTS"),
    GET_MEDIA_FOR_FRAGMENT_LIST("GET_MEDIA_FOR_FRAGMENT_LIST"),
    GET_HLS_STREAMING_SESSION_URL("GET_HLS_STREAMING_SESSION_URL");

    private String value;

    private APIName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, APIName> enumMap;
    static {
        enumMap = new HashMap<String, APIName>();
        enumMap.put("PUT_MEDIA", PUT_MEDIA);
        enumMap.put("GET_MEDIA", GET_MEDIA);
        enumMap.put("LIST_FRAGMENTS", LIST_FRAGMENTS);
        enumMap.put("GET_MEDIA_FOR_FRAGMENT_LIST", GET_MEDIA_FOR_FRAGMENT_LIST);
        enumMap.put("GET_HLS_STREAMING_SESSION_URL", GET_HLS_STREAMING_SESSION_URL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return APIName corresponding to the value
     */
    public static APIName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
