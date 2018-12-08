/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Language Code
 */
public enum LanguageCode {

    EnUS("en-US"),
    EsUS("es-US"),
    EnAU("en-AU"),
    FrCA("fr-CA"),
    EnGB("en-GB"),
    DeDE("de-DE"),
    PtBR("pt-BR"),
    FrFR("fr-FR");

    private String value;

    private LanguageCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LanguageCode> enumMap;
    static {
        enumMap = new HashMap<String, LanguageCode>();
        enumMap.put("en-US", EnUS);
        enumMap.put("es-US", EsUS);
        enumMap.put("en-AU", EnAU);
        enumMap.put("fr-CA", FrCA);
        enumMap.put("en-GB", EnGB);
        enumMap.put("de-DE", DeDE);
        enumMap.put("pt-BR", PtBR);
        enumMap.put("fr-FR", FrFR);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LanguageCode corresponding to the value
     */
    public static LanguageCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
