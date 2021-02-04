/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Mitigation Action Type
 */
public enum MitigationActionType {

    UPDATE_DEVICE_CERTIFICATE("UPDATE_DEVICE_CERTIFICATE"),
    UPDATE_CA_CERTIFICATE("UPDATE_CA_CERTIFICATE"),
    ADD_THINGS_TO_THING_GROUP("ADD_THINGS_TO_THING_GROUP"),
    REPLACE_DEFAULT_POLICY_VERSION("REPLACE_DEFAULT_POLICY_VERSION"),
    ENABLE_IOT_LOGGING("ENABLE_IOT_LOGGING"),
    PUBLISH_FINDING_TO_SNS("PUBLISH_FINDING_TO_SNS");

    private String value;

    private MitigationActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MitigationActionType> enumMap;
    static {
        enumMap = new HashMap<String, MitigationActionType>();
        enumMap.put("UPDATE_DEVICE_CERTIFICATE", UPDATE_DEVICE_CERTIFICATE);
        enumMap.put("UPDATE_CA_CERTIFICATE", UPDATE_CA_CERTIFICATE);
        enumMap.put("ADD_THINGS_TO_THING_GROUP", ADD_THINGS_TO_THING_GROUP);
        enumMap.put("REPLACE_DEFAULT_POLICY_VERSION", REPLACE_DEFAULT_POLICY_VERSION);
        enumMap.put("ENABLE_IOT_LOGGING", ENABLE_IOT_LOGGING);
        enumMap.put("PUBLISH_FINDING_TO_SNS", PUBLISH_FINDING_TO_SNS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MitigationActionType corresponding to the value
     */
    public static MitigationActionType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
