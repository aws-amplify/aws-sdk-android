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

package com.amazonaws.services.amazonfrauddetector.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Model Version Status
 */
public enum ModelVersionStatus {

    TRAINING_IN_PROGRESS("TRAINING_IN_PROGRESS"),
    TRAINING_COMPLETE("TRAINING_COMPLETE"),
    ACTIVATE_REQUESTED("ACTIVATE_REQUESTED"),
    ACTIVATE_IN_PROGRESS("ACTIVATE_IN_PROGRESS"),
    ACTIVE("ACTIVE"),
    INACTIVATE_IN_PROGRESS("INACTIVATE_IN_PROGRESS"),
    INACTIVE("INACTIVE"),
    ERROR("ERROR");

    private String value;

    private ModelVersionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ModelVersionStatus> enumMap;
    static {
        enumMap = new HashMap<String, ModelVersionStatus>();
        enumMap.put("TRAINING_IN_PROGRESS", TRAINING_IN_PROGRESS);
        enumMap.put("TRAINING_COMPLETE", TRAINING_COMPLETE);
        enumMap.put("ACTIVATE_REQUESTED", ACTIVATE_REQUESTED);
        enumMap.put("ACTIVATE_IN_PROGRESS", ACTIVATE_IN_PROGRESS);
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("INACTIVATE_IN_PROGRESS", INACTIVATE_IN_PROGRESS);
        enumMap.put("INACTIVE", INACTIVE);
        enumMap.put("ERROR", ERROR);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ModelVersionStatus corresponding to the value
     */
    public static ModelVersionStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
