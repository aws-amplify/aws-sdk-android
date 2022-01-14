/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Project Version Status
 */
public enum ProjectVersionStatus {

    TRAINING_IN_PROGRESS("TRAINING_IN_PROGRESS"),
    TRAINING_COMPLETED("TRAINING_COMPLETED"),
    TRAINING_FAILED("TRAINING_FAILED"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    FAILED("FAILED"),
    STOPPING("STOPPING"),
    STOPPED("STOPPED"),
    DELETING("DELETING");

    private String value;

    private ProjectVersionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProjectVersionStatus> enumMap;
    static {
        enumMap = new HashMap<String, ProjectVersionStatus>();
        enumMap.put("TRAINING_IN_PROGRESS", TRAINING_IN_PROGRESS);
        enumMap.put("TRAINING_COMPLETED", TRAINING_COMPLETED);
        enumMap.put("TRAINING_FAILED", TRAINING_FAILED);
        enumMap.put("STARTING", STARTING);
        enumMap.put("RUNNING", RUNNING);
        enumMap.put("FAILED", FAILED);
        enumMap.put("STOPPING", STOPPING);
        enumMap.put("STOPPED", STOPPED);
        enumMap.put("DELETING", DELETING);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProjectVersionStatus corresponding to the value
     */
    public static ProjectVersionStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
