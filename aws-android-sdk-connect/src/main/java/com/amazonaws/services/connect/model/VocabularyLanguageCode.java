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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Vocabulary Language Code
 */
public enum VocabularyLanguageCode {

    ArAE("ar-AE"),
    DeCH("de-CH"),
    DeDE("de-DE"),
    EnAB("en-AB"),
    EnAU("en-AU"),
    EnGB("en-GB"),
    EnIE("en-IE"),
    EnIN("en-IN"),
    EnUS("en-US"),
    EnWL("en-WL"),
    EsES("es-ES"),
    EsUS("es-US"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    HiIN("hi-IN"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    KoKR("ko-KR"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    ZhCN("zh-CN");

    private String value;

    private VocabularyLanguageCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VocabularyLanguageCode> enumMap;
    static {
        enumMap = new HashMap<String, VocabularyLanguageCode>();
        enumMap.put("ar-AE", ArAE);
        enumMap.put("de-CH", DeCH);
        enumMap.put("de-DE", DeDE);
        enumMap.put("en-AB", EnAB);
        enumMap.put("en-AU", EnAU);
        enumMap.put("en-GB", EnGB);
        enumMap.put("en-IE", EnIE);
        enumMap.put("en-IN", EnIN);
        enumMap.put("en-US", EnUS);
        enumMap.put("en-WL", EnWL);
        enumMap.put("es-ES", EsES);
        enumMap.put("es-US", EsUS);
        enumMap.put("fr-CA", FrCA);
        enumMap.put("fr-FR", FrFR);
        enumMap.put("hi-IN", HiIN);
        enumMap.put("it-IT", ItIT);
        enumMap.put("ja-JP", JaJP);
        enumMap.put("ko-KR", KoKR);
        enumMap.put("pt-BR", PtBR);
        enumMap.put("pt-PT", PtPT);
        enumMap.put("zh-CN", ZhCN);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VocabularyLanguageCode corresponding to the value
     */
    public static VocabularyLanguageCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
