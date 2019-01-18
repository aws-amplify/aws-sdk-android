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

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * OTAUpdate Status
 */
public enum OTAUpdateStatus {

    CREATE_PENDING("CREATE_PENDING"),
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    CREATE_FAILED("CREATE_FAILED");

    private String value;

    private OTAUpdateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OTAUpdateStatus> enumMap;
    static {
        enumMap = new HashMap<String, OTAUpdateStatus>();
        enumMap.put("CREATE_PENDING", CREATE_PENDING);
        enumMap.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
        enumMap.put("CREATE_COMPLETE", CREATE_COMPLETE);
        enumMap.put("CREATE_FAILED", CREATE_FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return OTAUpdateStatus corresponding to the value
     */
    public static OTAUpdateStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
