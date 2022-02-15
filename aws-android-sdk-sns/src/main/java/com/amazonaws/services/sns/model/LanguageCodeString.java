/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Supported language code for sending OTP message
 */
public enum LanguageCodeString {

    EnUS("en-US"),
    EnGB("en-GB"),
    Es419("es-419"),
    EsES("es-ES"),
    DeDE("de-DE"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    PtBR("pt-BR"),
    KrKR("kr-KR"),
    ZhCN("zh-CN"),
    ZhTW("zh-TW");

    private String value;

    private LanguageCodeString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LanguageCodeString> enumMap;
    static {
        enumMap = new HashMap<String, LanguageCodeString>();
        enumMap.put("en-US", EnUS);
        enumMap.put("en-GB", EnGB);
        enumMap.put("es-419", Es419);
        enumMap.put("es-ES", EsES);
        enumMap.put("de-DE", DeDE);
        enumMap.put("fr-CA", FrCA);
        enumMap.put("fr-FR", FrFR);
        enumMap.put("it-IT", ItIT);
        enumMap.put("ja-JP", JaJP);
        enumMap.put("pt-BR", PtBR);
        enumMap.put("kr-KR", KrKR);
        enumMap.put("zh-CN", ZhCN);
        enumMap.put("zh-TW", ZhTW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LanguageCodeString corresponding to the value
     */
    public static LanguageCodeString fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
