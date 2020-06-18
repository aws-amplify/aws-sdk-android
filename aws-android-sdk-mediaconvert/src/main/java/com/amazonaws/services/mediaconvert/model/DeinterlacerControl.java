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
 * - When set to NORMAL (default), the deinterlacer does not convert frames that
 * are tagged in metadata as progressive. It will only convert those that are
 * tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer
 * converts every frame to progressive - even those that are already tagged as
 * progressive. Turn Force mode on only if there is a good chance that the
 * metadata has tagged frames as progressive when they are not progressive. Do
 * not turn on otherwise; processing frames that are already progressive into
 * progressive will probably result in lower quality video.
 */
public enum DeinterlacerControl {

    FORCE_ALL_FRAMES("FORCE_ALL_FRAMES"),
    NORMAL("NORMAL");

    private String value;

    private DeinterlacerControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeinterlacerControl> enumMap;
    static {
        enumMap = new HashMap<String, DeinterlacerControl>();
        enumMap.put("FORCE_ALL_FRAMES", FORCE_ALL_FRAMES);
        enumMap.put("NORMAL", NORMAL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeinterlacerControl corresponding to the value
     */
    public static DeinterlacerControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
