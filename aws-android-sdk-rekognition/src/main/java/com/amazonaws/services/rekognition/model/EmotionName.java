/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Emotion Name
 */
public enum EmotionName {

    HAPPY("HAPPY"),
    SAD("SAD"),
    ANGRY("ANGRY"),
    CONFUSED("CONFUSED"),
    DISGUSTED("DISGUSTED"),
    SURPRISED("SURPRISED"),
    CALM("CALM");

    private String value;

    private EmotionName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EmotionName> enumMap;
    static {
        enumMap = new HashMap<String, EmotionName>();
        enumMap.put("HAPPY", HAPPY);
        enumMap.put("SAD", SAD);
        enumMap.put("ANGRY", ANGRY);
        enumMap.put("CONFUSED", CONFUSED);
        enumMap.put("DISGUSTED", DISGUSTED);
        enumMap.put("SURPRISED", SURPRISED);
        enumMap.put("CALM", CALM);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EmotionName corresponding to the value
     */
    public static EmotionName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
