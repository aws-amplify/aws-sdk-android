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
 * Security Service Type
 */
public enum SecurityServiceType {

    WAF("WAF"),
    WAFV2("WAFV2"),
    SHIELD_ADVANCED("SHIELD_ADVANCED"),
    SECURITY_GROUPS_COMMON("SECURITY_GROUPS_COMMON"),
    SECURITY_GROUPS_CONTENT_AUDIT("SECURITY_GROUPS_CONTENT_AUDIT"),
    SECURITY_GROUPS_USAGE_AUDIT("SECURITY_GROUPS_USAGE_AUDIT");

    private String value;

    private SecurityServiceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SecurityServiceType> enumMap;
    static {
        enumMap = new HashMap<String, SecurityServiceType>();
        enumMap.put("WAF", WAF);
        enumMap.put("WAFV2", WAFV2);
        enumMap.put("SHIELD_ADVANCED", SHIELD_ADVANCED);
        enumMap.put("SECURITY_GROUPS_COMMON", SECURITY_GROUPS_COMMON);
        enumMap.put("SECURITY_GROUPS_CONTENT_AUDIT", SECURITY_GROUPS_CONTENT_AUDIT);
        enumMap.put("SECURITY_GROUPS_USAGE_AUDIT", SECURITY_GROUPS_USAGE_AUDIT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SecurityServiceType corresponding to the value
     */
    public static SecurityServiceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
