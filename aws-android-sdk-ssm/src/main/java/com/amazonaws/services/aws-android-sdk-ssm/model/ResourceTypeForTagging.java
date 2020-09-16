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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Resource Type For Tagging
 */
public enum ResourceTypeForTagging {

    Document("Document"),
    ManagedInstance("ManagedInstance"),
    MaintenanceWindow("MaintenanceWindow"),
    Parameter("Parameter"),
    PatchBaseline("PatchBaseline"),
    OpsItem("OpsItem");

    private String value;

    private ResourceTypeForTagging(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceTypeForTagging> enumMap;
    static {
        enumMap = new HashMap<String, ResourceTypeForTagging>();
        enumMap.put("Document", Document);
        enumMap.put("ManagedInstance", ManagedInstance);
        enumMap.put("MaintenanceWindow", MaintenanceWindow);
        enumMap.put("Parameter", Parameter);
        enumMap.put("PatchBaseline", PatchBaseline);
        enumMap.put("OpsItem", OpsItem);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ResourceTypeForTagging corresponding to the value
     */
    public static ResourceTypeForTagging fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
