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
    FrFR("fr-FR"),
    ItIT("it-IT"),
    KoKR("ko-KR"),
    EsES("es-ES"),
    EnIN("en-IN"),
    HiIN("hi-IN"),
    ArSA("ar-SA"),
    RuRU("ru-RU"),
    ZhCN("zh-CN"),
    NlNL("nl-NL"),
    IdID("id-ID"),
    TaIN("ta-IN"),
    FaIR("fa-IR"),
    EnIE("en-IE"),
    EnAB("en-AB"),
    EnWL("en-WL"),
    PtPT("pt-PT"),
    TeIN("te-IN"),
    TrTR("tr-TR"),
    DeCH("de-CH"),
    HeIL("he-IL"),
    MsMY("ms-MY"),
    JaJP("ja-JP"),
    ArAE("ar-AE");

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
        enumMap.put("it-IT", ItIT);
        enumMap.put("ko-KR", KoKR);
        enumMap.put("es-ES", EsES);
        enumMap.put("en-IN", EnIN);
        enumMap.put("hi-IN", HiIN);
        enumMap.put("ar-SA", ArSA);
        enumMap.put("ru-RU", RuRU);
        enumMap.put("zh-CN", ZhCN);
        enumMap.put("nl-NL", NlNL);
        enumMap.put("id-ID", IdID);
        enumMap.put("ta-IN", TaIN);
        enumMap.put("fa-IR", FaIR);
        enumMap.put("en-IE", EnIE);
        enumMap.put("en-AB", EnAB);
        enumMap.put("en-WL", EnWL);
        enumMap.put("pt-PT", PtPT);
        enumMap.put("te-IN", TeIN);
        enumMap.put("tr-TR", TrTR);
        enumMap.put("de-CH", DeCH);
        enumMap.put("he-IL", HeIL);
        enumMap.put("ms-MY", MsMY);
        enumMap.put("ja-JP", JaJP);
        enumMap.put("ar-AE", ArAE);
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
