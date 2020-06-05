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

package com.amazonaws.services.servicecatalog.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Provisioned Product Plan Status
 */
public enum ProvisionedProductPlanStatus {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_SUCCESS("CREATE_SUCCESS"),
    CREATE_FAILED("CREATE_FAILED"),
    EXECUTE_IN_PROGRESS("EXECUTE_IN_PROGRESS"),
    EXECUTE_SUCCESS("EXECUTE_SUCCESS"),
    EXECUTE_FAILED("EXECUTE_FAILED");

    private String value;

    private ProvisionedProductPlanStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProvisionedProductPlanStatus> enumMap;
    static {
        enumMap = new HashMap<String, ProvisionedProductPlanStatus>();
        enumMap.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
        enumMap.put("CREATE_SUCCESS", CREATE_SUCCESS);
        enumMap.put("CREATE_FAILED", CREATE_FAILED);
        enumMap.put("EXECUTE_IN_PROGRESS", EXECUTE_IN_PROGRESS);
        enumMap.put("EXECUTE_SUCCESS", EXECUTE_SUCCESS);
        enumMap.put("EXECUTE_FAILED", EXECUTE_FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProvisionedProductPlanStatus corresponding to the value
     */
    public static ProvisionedProductPlanStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
