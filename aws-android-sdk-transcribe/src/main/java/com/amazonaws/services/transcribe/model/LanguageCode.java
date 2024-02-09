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
    EnNZ("en-NZ"),
    ViVN("vi-VN"),
    SvSE("sv-SE"),
    AbGE("ab-GE"),
    AstES("ast-ES"),
    AzAZ("az-AZ"),
    BaRU("ba-RU"),
    BeBY("be-BY"),
    BgBG("bg-BG"),
    BnIN("bn-IN"),
    BsBA("bs-BA"),
    CaES("ca-ES"),
    CkbIQ("ckb-IQ"),
    CkbIR("ckb-IR"),
    CsCZ("cs-CZ"),
    CyWL("cy-WL"),
    ElGR("el-GR"),
    EtET("et-ET"),
    EuES("eu-ES"),
    FiFI("fi-FI"),
    GlES("gl-ES"),
    GuIN("gu-IN"),
    HaNG("ha-NG"),
    HrHR("hr-HR"),
    HuHU("hu-HU"),
    HyAM("hy-AM"),
    IsIS("is-IS"),
    KaGE("ka-GE"),
    KabDZ("kab-DZ"),
    KkKZ("kk-KZ"),
    KnIN("kn-IN"),
    KyKG("ky-KG"),
    LgIN("lg-IN"),
    LtLT("lt-LT"),
    LvLV("lv-LV"),
    MhrRU("mhr-RU"),
    MiNZ("mi-NZ"),
    MkMK("mk-MK"),
    MlIN("ml-IN"),
    MnMN("mn-MN"),
    MrIN("mr-IN"),
    MtMT("mt-MT"),
    NoNO("no-NO"),
    OrIN("or-IN"),
    PaIN("pa-IN"),
    PlPL("pl-PL"),
    PsAF("ps-AF"),
    RoRO("ro-RO"),
    RwRW("rw-RW"),
    SiLK("si-LK"),
    SkSK("sk-SK"),
    SlSI("sl-SI"),
    SoSO("so-SO"),
    SrRS("sr-RS"),
    SuID("su-ID"),
    SwBI("sw-BI"),
    SwKE("sw-KE"),
    SwRW("sw-RW"),
    SwTZ("sw-TZ"),
    SwUG("sw-UG"),
    TlPH("tl-PH"),
    TtRU("tt-RU"),
    UgCN("ug-CN"),
    UkUA("uk-UA"),
    UzUZ("uz-UZ"),
    WoSN("wo-SN"),
    ZuZA("zu-ZA");

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
        enumMap.put("vi-VN", ViVN);
        enumMap.put("sv-SE", SvSE);
        enumMap.put("ab-GE", AbGE);
        enumMap.put("ast-ES", AstES);
        enumMap.put("az-AZ", AzAZ);
        enumMap.put("ba-RU", BaRU);
        enumMap.put("be-BY", BeBY);
        enumMap.put("bg-BG", BgBG);
        enumMap.put("bn-IN", BnIN);
        enumMap.put("bs-BA", BsBA);
        enumMap.put("ca-ES", CaES);
        enumMap.put("ckb-IQ", CkbIQ);
        enumMap.put("ckb-IR", CkbIR);
        enumMap.put("cs-CZ", CsCZ);
        enumMap.put("cy-WL", CyWL);
        enumMap.put("el-GR", ElGR);
        enumMap.put("et-ET", EtET);
        enumMap.put("eu-ES", EuES);
        enumMap.put("fi-FI", FiFI);
        enumMap.put("gl-ES", GlES);
        enumMap.put("gu-IN", GuIN);
        enumMap.put("ha-NG", HaNG);
        enumMap.put("hr-HR", HrHR);
        enumMap.put("hu-HU", HuHU);
        enumMap.put("hy-AM", HyAM);
        enumMap.put("is-IS", IsIS);
        enumMap.put("ka-GE", KaGE);
        enumMap.put("kab-DZ", KabDZ);
        enumMap.put("kk-KZ", KkKZ);
        enumMap.put("kn-IN", KnIN);
        enumMap.put("ky-KG", KyKG);
        enumMap.put("lg-IN", LgIN);
        enumMap.put("lt-LT", LtLT);
        enumMap.put("lv-LV", LvLV);
        enumMap.put("mhr-RU", MhrRU);
        enumMap.put("mi-NZ", MiNZ);
        enumMap.put("mk-MK", MkMK);
        enumMap.put("ml-IN", MlIN);
        enumMap.put("mn-MN", MnMN);
        enumMap.put("mr-IN", MrIN);
        enumMap.put("mt-MT", MtMT);
        enumMap.put("no-NO", NoNO);
        enumMap.put("or-IN", OrIN);
        enumMap.put("pa-IN", PaIN);
        enumMap.put("pl-PL", PlPL);
        enumMap.put("ps-AF", PsAF);
        enumMap.put("ro-RO", RoRO);
        enumMap.put("rw-RW", RwRW);
        enumMap.put("si-LK", SiLK);
        enumMap.put("sk-SK", SkSK);
        enumMap.put("sl-SI", SlSI);
        enumMap.put("so-SO", SoSO);
        enumMap.put("sr-RS", SrRS);
        enumMap.put("su-ID", SuID);
        enumMap.put("sw-BI", SwBI);
        enumMap.put("sw-KE", SwKE);
        enumMap.put("sw-RW", SwRW);
        enumMap.put("sw-TZ", SwTZ);
        enumMap.put("sw-UG", SwUG);
        enumMap.put("tl-PH", TlPH);
        enumMap.put("tt-RU", TtRU);
        enumMap.put("ug-CN", UgCN);
        enumMap.put("uk-UA", UkUA);
        enumMap.put("uz-UZ", UzUZ);
        enumMap.put("wo-SN", WoSN);
        enumMap.put("zu-ZA", ZuZA);
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
