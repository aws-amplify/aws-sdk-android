/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Display Language Code
 */
public enum DisplayLanguageCode {

    De("de"),
    En("en"),
    Es("es"),
    Fr("fr"),
    It("it"),
    Ja("ja"),
    Ko("ko"),
    Pt("pt"),
    Zh("zh"),
    ZhTW("zh-TW");

    private String value;

    private DisplayLanguageCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DisplayLanguageCode> enumMap;
    static {
        enumMap = new HashMap<String, DisplayLanguageCode>();
        enumMap.put("de", De);
        enumMap.put("en", En);
        enumMap.put("es", Es);
        enumMap.put("fr", Fr);
        enumMap.put("it", It);
        enumMap.put("ja", Ja);
        enumMap.put("ko", Ko);
        enumMap.put("pt", Pt);
        enumMap.put("zh", Zh);
        enumMap.put("zh-TW", ZhTW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DisplayLanguageCode corresponding to the value
     */
    public static DisplayLanguageCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
