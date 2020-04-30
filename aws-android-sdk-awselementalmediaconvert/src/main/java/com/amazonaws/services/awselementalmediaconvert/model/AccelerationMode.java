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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specify whether the service runs your job with accelerated transcoding.
 * Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if
 * you want your job to run with accelerated transcoding and to fail if your
 * input files or your job settings aren't compatible with accelerated
 * transcoding. Choose PREFERRED if you want your job to run with accelerated
 * transcoding if the job is compatible with the feature and to run at standard
 * speed if it's not.
 */
public enum AccelerationMode {

    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    PREFERRED("PREFERRED");

    private String value;

    private AccelerationMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AccelerationMode> enumMap;
    static {
        enumMap = new HashMap<String, AccelerationMode>();
        enumMap.put("DISABLED", DISABLED);
        enumMap.put("ENABLED", ENABLED);
        enumMap.put("PREFERRED", PREFERRED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AccelerationMode corresponding to the value
     */
    public static AccelerationMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
