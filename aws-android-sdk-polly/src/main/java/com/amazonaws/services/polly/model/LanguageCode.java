/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Language Code
 */
public enum LanguageCode {

    CmnCN("cmn-CN"),
    CyGB("cy-GB"),
    DaDK("da-DK"),
    DeDE("de-DE"),
    EnAU("en-AU"),
    EnGB("en-GB"),
    EnGBWLS("en-GB-WLS"),
    EnIN("en-IN"),
    EnUS("en-US"),
    EsES("es-ES"),
    EsMX("es-MX"),
    EsUS("es-US"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    IsIS("is-IS"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    HiIN("hi-IN"),
    KoKR("ko-KR"),
    NbNO("nb-NO"),
    NlNL("nl-NL"),
    PlPL("pl-PL"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    RoRO("ro-RO"),
    RuRU("ru-RU"),
    SvSE("sv-SE"),
    TrTR("tr-TR");

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
        enumMap.put("cmn-CN", CmnCN);
        enumMap.put("cy-GB", CyGB);
        enumMap.put("da-DK", DaDK);
        enumMap.put("de-DE", DeDE);
        enumMap.put("en-AU", EnAU);
        enumMap.put("en-GB", EnGB);
        enumMap.put("en-GB-WLS", EnGBWLS);
        enumMap.put("en-IN", EnIN);
        enumMap.put("en-US", EnUS);
        enumMap.put("es-ES", EsES);
        enumMap.put("es-MX", EsMX);
        enumMap.put("es-US", EsUS);
        enumMap.put("fr-CA", FrCA);
        enumMap.put("fr-FR", FrFR);
        enumMap.put("is-IS", IsIS);
        enumMap.put("it-IT", ItIT);
        enumMap.put("ja-JP", JaJP);
        enumMap.put("hi-IN", HiIN);
        enumMap.put("ko-KR", KoKR);
        enumMap.put("nb-NO", NbNO);
        enumMap.put("nl-NL", NlNL);
        enumMap.put("pl-PL", PlPL);
        enumMap.put("pt-BR", PtBR);
        enumMap.put("pt-PT", PtPT);
        enumMap.put("ro-RO", RoRO);
        enumMap.put("ru-RU", RuRU);
        enumMap.put("sv-SE", SvSE);
        enumMap.put("tr-TR", TrTR);
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
