/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Toxic Content Type
 */
public enum ToxicContentType {

    GRAPHIC("GRAPHIC"),
    HARASSMENT_OR_ABUSE("HARASSMENT_OR_ABUSE"),
    HATE_SPEECH("HATE_SPEECH"),
    INSULT("INSULT"),
    PROFANITY("PROFANITY"),
    SEXUAL("SEXUAL"),
    VIOLENCE_OR_THREAT("VIOLENCE_OR_THREAT");

    private String value;

    private ToxicContentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ToxicContentType> enumMap;
    static {
        enumMap = new HashMap<String, ToxicContentType>();
        enumMap.put("GRAPHIC", GRAPHIC);
        enumMap.put("HARASSMENT_OR_ABUSE", HARASSMENT_OR_ABUSE);
        enumMap.put("HATE_SPEECH", HATE_SPEECH);
        enumMap.put("INSULT", INSULT);
        enumMap.put("PROFANITY", PROFANITY);
        enumMap.put("SEXUAL", SEXUAL);
        enumMap.put("VIOLENCE_OR_THREAT", VIOLENCE_OR_THREAT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ToxicContentType corresponding to the value
     */
    public static ToxicContentType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
