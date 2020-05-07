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

package com.amazonaws.services.codebuild.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Build Phase Type
 */
public enum BuildPhaseType {

    SUBMITTED("SUBMITTED"),
    QUEUED("QUEUED"),
    PROVISIONING("PROVISIONING"),
    DOWNLOAD_SOURCE("DOWNLOAD_SOURCE"),
    INSTALL("INSTALL"),
    PRE_BUILD("PRE_BUILD"),
    BUILD("BUILD"),
    POST_BUILD("POST_BUILD"),
    UPLOAD_ARTIFACTS("UPLOAD_ARTIFACTS"),
    FINALIZING("FINALIZING"),
    COMPLETED("COMPLETED");

    private String value;

    private BuildPhaseType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BuildPhaseType> enumMap;
    static {
        enumMap = new HashMap<String, BuildPhaseType>();
        enumMap.put("SUBMITTED", SUBMITTED);
        enumMap.put("QUEUED", QUEUED);
        enumMap.put("PROVISIONING", PROVISIONING);
        enumMap.put("DOWNLOAD_SOURCE", DOWNLOAD_SOURCE);
        enumMap.put("INSTALL", INSTALL);
        enumMap.put("PRE_BUILD", PRE_BUILD);
        enumMap.put("BUILD", BUILD);
        enumMap.put("POST_BUILD", POST_BUILD);
        enumMap.put("UPLOAD_ARTIFACTS", UPLOAD_ARTIFACTS);
        enumMap.put("FINALIZING", FINALIZING);
        enumMap.put("COMPLETED", COMPLETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BuildPhaseType corresponding to the value
     */
    public static BuildPhaseType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
