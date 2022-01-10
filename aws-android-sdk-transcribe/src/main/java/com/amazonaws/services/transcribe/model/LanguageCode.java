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

package com.amazonaws.services.transcribe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Language Code
 */
public enum LanguageCode {

    AfZA("af-ZA"),
    ArAE("ar-AE"),
    ArSA("ar-SA"),
    CyGB("cy-GB"),
    DaDK("da-DK"),
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
    FaIR("fa-IR"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    GaIE("ga-IE"),
    GdGB("gd-GB"),
    HeIL("he-IL"),
    HiIN("hi-IN"),
    IdID("id-ID"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    KoKR("ko-KR"),
    MsMY("ms-MY"),
    NlNL("nl-NL"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    RuRU("ru-RU"),
    TaIN("ta-IN"),
    TeIN("te-IN"),
    TrTR("tr-TR"),
    ZhCN("zh-CN"),
    ZhTW("zh-TW"),
    ThTH("th-TH"),
    EnZA("en-ZA"),
    EnNZ("en-NZ");

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
        enumMap.put("af-ZA", AfZA);
        enumMap.put("ar-AE", ArAE);
        enumMap.put("ar-SA", ArSA);
        enumMap.put("cy-GB", CyGB);
        enumMap.put("da-DK", DaDK);
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
        enumMap.put("fa-IR", FaIR);
        enumMap.put("fr-CA", FrCA);
        enumMap.put("fr-FR", FrFR);
        enumMap.put("ga-IE", GaIE);
        enumMap.put("gd-GB", GdGB);
        enumMap.put("he-IL", HeIL);
        enumMap.put("hi-IN", HiIN);
        enumMap.put("id-ID", IdID);
        enumMap.put("it-IT", ItIT);
        enumMap.put("ja-JP", JaJP);
        enumMap.put("ko-KR", KoKR);
        enumMap.put("ms-MY", MsMY);
        enumMap.put("nl-NL", NlNL);
        enumMap.put("pt-BR", PtBR);
        enumMap.put("pt-PT", PtPT);
        enumMap.put("ru-RU", RuRU);
        enumMap.put("ta-IN", TaIN);
        enumMap.put("te-IN", TeIN);
        enumMap.put("tr-TR", TrTR);
        enumMap.put("zh-CN", ZhCN);
        enumMap.put("zh-TW", ZhTW);
        enumMap.put("th-TH", ThTH);
        enumMap.put("en-ZA", EnZA);
        enumMap.put("en-NZ", EnNZ);
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
