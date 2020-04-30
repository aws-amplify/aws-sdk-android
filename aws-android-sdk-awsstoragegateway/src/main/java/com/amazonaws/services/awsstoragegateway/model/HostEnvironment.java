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

package com.amazonaws.services.awsstoragegateway.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Host Environment
 */
public enum HostEnvironment {

    VMWARE("VMWARE"),
    HYPERV("HYPER-V"),
    EC2("EC2"),
    KVM("KVM"),
    OTHER("OTHER");

    private String value;

    private HostEnvironment(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HostEnvironment> enumMap;
    static {
        enumMap = new HashMap<String, HostEnvironment>();
        enumMap.put("VMWARE", VMWARE);
        enumMap.put("HYPER-V", HYPERV);
        enumMap.put("EC2", EC2);
        enumMap.put("KVM", KVM);
        enumMap.put("OTHER", OTHER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HostEnvironment corresponding to the value
     */
    public static HostEnvironment fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
