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

package com.amazonaws.services.chime.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Voice Connector Aws Region
 */
public enum VoiceConnectorAwsRegion {

    UsEast1("us-east-1"),
    UsWest2("us-west-2");

    private String value;

    private VoiceConnectorAwsRegion(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VoiceConnectorAwsRegion> enumMap;
    static {
        enumMap = new HashMap<String, VoiceConnectorAwsRegion>();
        enumMap.put("us-east-1", UsEast1);
        enumMap.put("us-west-2", UsWest2);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VoiceConnectorAwsRegion corresponding to the value
     */
    public static VoiceConnectorAwsRegion fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
