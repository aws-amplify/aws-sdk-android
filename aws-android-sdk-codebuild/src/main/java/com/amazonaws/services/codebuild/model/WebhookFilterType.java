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

package com.amazonaws.services.codebuild.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Webhook Filter Type
 */
public enum WebhookFilterType {

    EVENT("EVENT"),
    BASE_REF("BASE_REF"),
    HEAD_REF("HEAD_REF"),
    ACTOR_ACCOUNT_ID("ACTOR_ACCOUNT_ID"),
    FILE_PATH("FILE_PATH"),
    COMMIT_MESSAGE("COMMIT_MESSAGE");

    private String value;

    private WebhookFilterType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, WebhookFilterType> enumMap;
    static {
        enumMap = new HashMap<String, WebhookFilterType>();
        enumMap.put("EVENT", EVENT);
        enumMap.put("BASE_REF", BASE_REF);
        enumMap.put("HEAD_REF", HEAD_REF);
        enumMap.put("ACTOR_ACCOUNT_ID", ACTOR_ACCOUNT_ID);
        enumMap.put("FILE_PATH", FILE_PATH);
        enumMap.put("COMMIT_MESSAGE", COMMIT_MESSAGE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return WebhookFilterType corresponding to the value
     */
    public static WebhookFilterType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
