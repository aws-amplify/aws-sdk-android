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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specify how the service handles outputs that have a different aspect ratio
 * from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to
 * have the service stretch your video image to fit. Keep the setting Default
 * (DEFAULT) to have the service letterbox your video instead. This setting
 * overrides any value that you specify for the setting Selection placement
 * (position) in this output.
 */
public enum ScalingBehavior {

    DEFAULT("DEFAULT"),
    STRETCH_TO_OUTPUT("STRETCH_TO_OUTPUT");

    private String value;

    private ScalingBehavior(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ScalingBehavior> enumMap;
    static {
        enumMap = new HashMap<String, ScalingBehavior>();
        enumMap.put("DEFAULT", DEFAULT);
        enumMap.put("STRETCH_TO_OUTPUT", STRETCH_TO_OUTPUT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ScalingBehavior corresponding to the value
     */
    public static ScalingBehavior fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
