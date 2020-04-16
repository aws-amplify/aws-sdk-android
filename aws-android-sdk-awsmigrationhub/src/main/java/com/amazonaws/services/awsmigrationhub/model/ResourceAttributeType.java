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

package com.amazonaws.services.awsmigrationhub.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Resource Attribute Type
 */
public enum ResourceAttributeType {

    IPV4_ADDRESS("IPV4_ADDRESS"),
    IPV6_ADDRESS("IPV6_ADDRESS"),
    MAC_ADDRESS("MAC_ADDRESS"),
    FQDN("FQDN"),
    VM_MANAGER_ID("VM_MANAGER_ID"),
    VM_MANAGED_OBJECT_REFERENCE("VM_MANAGED_OBJECT_REFERENCE"),
    VM_NAME("VM_NAME"),
    VM_PATH("VM_PATH"),
    BIOS_ID("BIOS_ID"),
    MOTHERBOARD_SERIAL_NUMBER("MOTHERBOARD_SERIAL_NUMBER");

    private String value;

    private ResourceAttributeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceAttributeType> enumMap;
    static {
        enumMap = new HashMap<String, ResourceAttributeType>();
        enumMap.put("IPV4_ADDRESS", IPV4_ADDRESS);
        enumMap.put("IPV6_ADDRESS", IPV6_ADDRESS);
        enumMap.put("MAC_ADDRESS", MAC_ADDRESS);
        enumMap.put("FQDN", FQDN);
        enumMap.put("VM_MANAGER_ID", VM_MANAGER_ID);
        enumMap.put("VM_MANAGED_OBJECT_REFERENCE", VM_MANAGED_OBJECT_REFERENCE);
        enumMap.put("VM_NAME", VM_NAME);
        enumMap.put("VM_PATH", VM_PATH);
        enumMap.put("BIOS_ID", BIOS_ID);
        enumMap.put("MOTHERBOARD_SERIAL_NUMBER", MOTHERBOARD_SERIAL_NUMBER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceAttributeType corresponding to the value
     */
    public static ResourceAttributeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
