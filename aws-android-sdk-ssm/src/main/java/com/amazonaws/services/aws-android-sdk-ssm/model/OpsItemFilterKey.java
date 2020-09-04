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
 * Ops Item Filter Key
 */
public enum OpsItemFilterKey {

    Status("Status"),
    CreatedBy("CreatedBy"),
    Source("Source"),
    Priority("Priority"),
    Title("Title"),
    OpsItemId("OpsItemId"),
    CreatedTime("CreatedTime"),
    LastModifiedTime("LastModifiedTime"),
    OperationalData("OperationalData"),
    OperationalDataKey("OperationalDataKey"),
    OperationalDataValue("OperationalDataValue"),
    ResourceId("ResourceId"),
    AutomationId("AutomationId"),
    Category("Category"),
    Severity("Severity");

    private String value;

    private OpsItemFilterKey(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OpsItemFilterKey> enumMap;
    static {
        enumMap = new HashMap<String, OpsItemFilterKey>();
        enumMap.put("Status", Status);
        enumMap.put("CreatedBy", CreatedBy);
        enumMap.put("Source", Source);
        enumMap.put("Priority", Priority);
        enumMap.put("Title", Title);
        enumMap.put("OpsItemId", OpsItemId);
        enumMap.put("CreatedTime", CreatedTime);
        enumMap.put("LastModifiedTime", LastModifiedTime);
        enumMap.put("OperationalData", OperationalData);
        enumMap.put("OperationalDataKey", OperationalDataKey);
        enumMap.put("OperationalDataValue", OperationalDataValue);
        enumMap.put("ResourceId", ResourceId);
        enumMap.put("AutomationId", AutomationId);
        enumMap.put("Category", Category);
        enumMap.put("Severity", Severity);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return OpsItemFilterKey corresponding to the value
     */
    public static OpsItemFilterKey fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
