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
 * Provide the font script, using an ISO 15924 script code, if the LanguageCode
 * is not sufficient for determining the script type. Where LanguageCode or
 * CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
 */
public enum FontScript {

    AUTOMATIC("AUTOMATIC"),
    HANS("HANS"),
    HANT("HANT");

    private String value;

    private FontScript(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, FontScript> enumMap;
    static {
        enumMap = new HashMap<String, FontScript>();
        enumMap.put("AUTOMATIC", AUTOMATIC);
        enumMap.put("HANS", HANS);
        enumMap.put("HANT", HANT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return FontScript corresponding to the value
     */
    public static FontScript fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
