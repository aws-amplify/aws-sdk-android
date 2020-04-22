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

package com.amazonaws.services.firewallmanagementservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Violation Reason
 */
public enum ViolationReason {

    WEB_ACL_MISSING_RULE_GROUP("WEB_ACL_MISSING_RULE_GROUP"),
    RESOURCE_MISSING_WEB_ACL("RESOURCE_MISSING_WEB_ACL"),
    RESOURCE_INCORRECT_WEB_ACL("RESOURCE_INCORRECT_WEB_ACL"),
    RESOURCE_MISSING_SHIELD_PROTECTION("RESOURCE_MISSING_SHIELD_PROTECTION"),
    RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION("RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION"),
    RESOURCE_MISSING_SECURITY_GROUP("RESOURCE_MISSING_SECURITY_GROUP"),
    RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP("RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP"),
    SECURITY_GROUP_UNUSED("SECURITY_GROUP_UNUSED"),
    SECURITY_GROUP_REDUNDANT("SECURITY_GROUP_REDUNDANT");

    private String value;

    private ViolationReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ViolationReason> enumMap;
    static {
        enumMap = new HashMap<String, ViolationReason>();
        enumMap.put("WEB_ACL_MISSING_RULE_GROUP", WEB_ACL_MISSING_RULE_GROUP);
        enumMap.put("RESOURCE_MISSING_WEB_ACL", RESOURCE_MISSING_WEB_ACL);
        enumMap.put("RESOURCE_INCORRECT_WEB_ACL", RESOURCE_INCORRECT_WEB_ACL);
        enumMap.put("RESOURCE_MISSING_SHIELD_PROTECTION", RESOURCE_MISSING_SHIELD_PROTECTION);
        enumMap.put("RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION",
                RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION);
        enumMap.put("RESOURCE_MISSING_SECURITY_GROUP", RESOURCE_MISSING_SECURITY_GROUP);
        enumMap.put("RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP",
                RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP);
        enumMap.put("SECURITY_GROUP_UNUSED", SECURITY_GROUP_UNUSED);
        enumMap.put("SECURITY_GROUP_REDUNDANT", SECURITY_GROUP_REDUNDANT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ViolationReason corresponding to the value
     */
    public static ViolationReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
