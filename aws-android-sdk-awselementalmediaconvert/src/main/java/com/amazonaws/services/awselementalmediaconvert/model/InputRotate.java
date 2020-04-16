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
 * Use Rotate (InputRotate) to specify how the service rotates your video. You
 * can choose automatic rotation or specify a rotation. You can specify a
 * clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
 * container is .mov or .mp4 and your input has rotation metadata, you can
 * choose Automatic to have the service rotate your video according to the
 * rotation specified in the metadata. The rotation must be within one degree of
 * 90, 180, or 270 degrees. If the rotation metadata specifies any other
 * rotation, the service will default to no rotation. By default, the service
 * does no rotation, even if your input video has rotation metadata. The service
 * doesn't pass through rotation metadata.
 */
public enum InputRotate {

    DEGREE_0("DEGREE_0"),
    DEGREES_90("DEGREES_90"),
    DEGREES_180("DEGREES_180"),
    DEGREES_270("DEGREES_270"),
    AUTO("AUTO");

    private String value;

    private InputRotate(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InputRotate> enumMap;
    static {
        enumMap = new HashMap<String, InputRotate>();
        enumMap.put("DEGREE_0", DEGREE_0);
        enumMap.put("DEGREES_90", DEGREES_90);
        enumMap.put("DEGREES_180", DEGREES_180);
        enumMap.put("DEGREES_270", DEGREES_270);
        enumMap.put("AUTO", AUTO);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InputRotate corresponding to the value
     */
    public static InputRotate fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
