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

package com.amazonaws.services.codecommit.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Pull Request Event Type
 */
public enum PullRequestEventType {

    PULL_REQUEST_CREATED("PULL_REQUEST_CREATED"),
    PULL_REQUEST_STATUS_CHANGED("PULL_REQUEST_STATUS_CHANGED"),
    PULL_REQUEST_SOURCE_REFERENCE_UPDATED("PULL_REQUEST_SOURCE_REFERENCE_UPDATED"),
    PULL_REQUEST_MERGE_STATE_CHANGED("PULL_REQUEST_MERGE_STATE_CHANGED"),
    PULL_REQUEST_APPROVAL_RULE_CREATED("PULL_REQUEST_APPROVAL_RULE_CREATED"),
    PULL_REQUEST_APPROVAL_RULE_UPDATED("PULL_REQUEST_APPROVAL_RULE_UPDATED"),
    PULL_REQUEST_APPROVAL_RULE_DELETED("PULL_REQUEST_APPROVAL_RULE_DELETED"),
    PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN("PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN"),
    PULL_REQUEST_APPROVAL_STATE_CHANGED("PULL_REQUEST_APPROVAL_STATE_CHANGED");

    private String value;

    private PullRequestEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PullRequestEventType> enumMap;
    static {
        enumMap = new HashMap<String, PullRequestEventType>();
        enumMap.put("PULL_REQUEST_CREATED", PULL_REQUEST_CREATED);
        enumMap.put("PULL_REQUEST_STATUS_CHANGED", PULL_REQUEST_STATUS_CHANGED);
        enumMap.put("PULL_REQUEST_SOURCE_REFERENCE_UPDATED", PULL_REQUEST_SOURCE_REFERENCE_UPDATED);
        enumMap.put("PULL_REQUEST_MERGE_STATE_CHANGED", PULL_REQUEST_MERGE_STATE_CHANGED);
        enumMap.put("PULL_REQUEST_APPROVAL_RULE_CREATED", PULL_REQUEST_APPROVAL_RULE_CREATED);
        enumMap.put("PULL_REQUEST_APPROVAL_RULE_UPDATED", PULL_REQUEST_APPROVAL_RULE_UPDATED);
        enumMap.put("PULL_REQUEST_APPROVAL_RULE_DELETED", PULL_REQUEST_APPROVAL_RULE_DELETED);
        enumMap.put("PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN", PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN);
        enumMap.put("PULL_REQUEST_APPROVAL_STATE_CHANGED", PULL_REQUEST_APPROVAL_STATE_CHANGED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PullRequestEventType corresponding to the value
     */
    public static PullRequestEventType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
