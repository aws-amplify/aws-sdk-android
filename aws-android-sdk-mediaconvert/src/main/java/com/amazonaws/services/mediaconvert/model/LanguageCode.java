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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specify the language, using the ISO 639-2 three-letter code listed at
 * https://www.loc.gov/standards/iso639-2/php/code_list.php.
 */
public enum LanguageCode {

    ENG("ENG"),
    SPA("SPA"),
    FRA("FRA"),
    DEU("DEU"),
    GER("GER"),
    ZHO("ZHO"),
    ARA("ARA"),
    HIN("HIN"),
    JPN("JPN"),
    RUS("RUS"),
    POR("POR"),
    ITA("ITA"),
    URD("URD"),
    VIE("VIE"),
    KOR("KOR"),
    PAN("PAN"),
    ABK("ABK"),
    AAR("AAR"),
    AFR("AFR"),
    AKA("AKA"),
    SQI("SQI"),
    AMH("AMH"),
    ARG("ARG"),
    HYE("HYE"),
    ASM("ASM"),
    AVA("AVA"),
    AVE("AVE"),
    AYM("AYM"),
    AZE("AZE"),
    BAM("BAM"),
    BAK("BAK"),
    EUS("EUS"),
    BEL("BEL"),
    BEN("BEN"),
    BIH("BIH"),
    BIS("BIS"),
    BOS("BOS"),
    BRE("BRE"),
    BUL("BUL"),
    MYA("MYA"),
    CAT("CAT"),
    KHM("KHM"),
    CHA("CHA"),
    CHE("CHE"),
    NYA("NYA"),
    CHU("CHU"),
    CHV("CHV"),
    COR("COR"),
    COS("COS"),
    CRE("CRE"),
    HRV("HRV"),
    CES("CES"),
    DAN("DAN"),
    DIV("DIV"),
    NLD("NLD"),
    DZO("DZO"),
    ENM("ENM"),
    EPO("EPO"),
    EST("EST"),
    EWE("EWE"),
    FAO("FAO"),
    FIJ("FIJ"),
    FIN("FIN"),
    FRM("FRM"),
    FUL("FUL"),
    GLA("GLA"),
    GLG("GLG"),
    LUG("LUG"),
    KAT("KAT"),
    ELL("ELL"),
    GRN("GRN"),
    GUJ("GUJ"),
    HAT("HAT"),
    HAU("HAU"),
    HEB("HEB"),
    HER("HER"),
    HMO("HMO"),
    HUN("HUN"),
    ISL("ISL"),
    IDO("IDO"),
    IBO("IBO"),
    IND("IND"),
    INA("INA"),
    ILE("ILE"),
    IKU("IKU"),
    IPK("IPK"),
    GLE("GLE"),
    JAV("JAV"),
    KAL("KAL"),
    KAN("KAN"),
    KAU("KAU"),
    KAS("KAS"),
    KAZ("KAZ"),
    KIK("KIK"),
    KIN("KIN"),
    KIR("KIR"),
    KOM("KOM"),
    KON("KON"),
    KUA("KUA"),
    KUR("KUR"),
    LAO("LAO"),
    LAT("LAT"),
    LAV("LAV"),
    LIM("LIM"),
    LIN("LIN"),
    LIT("LIT"),
    LUB("LUB"),
    LTZ("LTZ"),
    MKD("MKD"),
    MLG("MLG"),
    MSA("MSA"),
    MAL("MAL"),
    MLT("MLT"),
    GLV("GLV"),
    MRI("MRI"),
    MAR("MAR"),
    MAH("MAH"),
    MON("MON"),
    NAU("NAU"),
    NAV("NAV"),
    NDE("NDE"),
    NBL("NBL"),
    NDO("NDO"),
    NEP("NEP"),
    SME("SME"),
    NOR("NOR"),
    NOB("NOB"),
    NNO("NNO"),
    OCI("OCI"),
    OJI("OJI"),
    ORI("ORI"),
    ORM("ORM"),
    OSS("OSS"),
    PLI("PLI"),
    FAS("FAS"),
    POL("POL"),
    PUS("PUS"),
    QUE("QUE"),
    QAA("QAA"),
    RON("RON"),
    ROH("ROH"),
    RUN("RUN"),
    SMO("SMO"),
    SAG("SAG"),
    SAN("SAN"),
    SRD("SRD"),
    SRB("SRB"),
    SNA("SNA"),
    III("III"),
    SND("SND"),
    SIN("SIN"),
    SLK("SLK"),
    SLV("SLV"),
    SOM("SOM"),
    SOT("SOT"),
    SUN("SUN"),
    SWA("SWA"),
    SSW("SSW"),
    SWE("SWE"),
    TGL("TGL"),
    TAH("TAH"),
    TGK("TGK"),
    TAM("TAM"),
    TAT("TAT"),
    TEL("TEL"),
    THA("THA"),
    BOD("BOD"),
    TIR("TIR"),
    TON("TON"),
    TSO("TSO"),
    TSN("TSN"),
    TUR("TUR"),
    TUK("TUK"),
    TWI("TWI"),
    UIG("UIG"),
    UKR("UKR"),
    UZB("UZB"),
    VEN("VEN"),
    VOL("VOL"),
    WLN("WLN"),
    CYM("CYM"),
    FRY("FRY"),
    WOL("WOL"),
    XHO("XHO"),
    YID("YID"),
    YOR("YOR"),
    ZHA("ZHA"),
    ZUL("ZUL"),
    ORJ("ORJ"),
    QPC("QPC"),
    TNG("TNG");

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
        enumMap.put("ENG", ENG);
        enumMap.put("SPA", SPA);
        enumMap.put("FRA", FRA);
        enumMap.put("DEU", DEU);
        enumMap.put("GER", GER);
        enumMap.put("ZHO", ZHO);
        enumMap.put("ARA", ARA);
        enumMap.put("HIN", HIN);
        enumMap.put("JPN", JPN);
        enumMap.put("RUS", RUS);
        enumMap.put("POR", POR);
        enumMap.put("ITA", ITA);
        enumMap.put("URD", URD);
        enumMap.put("VIE", VIE);
        enumMap.put("KOR", KOR);
        enumMap.put("PAN", PAN);
        enumMap.put("ABK", ABK);
        enumMap.put("AAR", AAR);
        enumMap.put("AFR", AFR);
        enumMap.put("AKA", AKA);
        enumMap.put("SQI", SQI);
        enumMap.put("AMH", AMH);
        enumMap.put("ARG", ARG);
        enumMap.put("HYE", HYE);
        enumMap.put("ASM", ASM);
        enumMap.put("AVA", AVA);
        enumMap.put("AVE", AVE);
        enumMap.put("AYM", AYM);
        enumMap.put("AZE", AZE);
        enumMap.put("BAM", BAM);
        enumMap.put("BAK", BAK);
        enumMap.put("EUS", EUS);
        enumMap.put("BEL", BEL);
        enumMap.put("BEN", BEN);
        enumMap.put("BIH", BIH);
        enumMap.put("BIS", BIS);
        enumMap.put("BOS", BOS);
        enumMap.put("BRE", BRE);
        enumMap.put("BUL", BUL);
        enumMap.put("MYA", MYA);
        enumMap.put("CAT", CAT);
        enumMap.put("KHM", KHM);
        enumMap.put("CHA", CHA);
        enumMap.put("CHE", CHE);
        enumMap.put("NYA", NYA);
        enumMap.put("CHU", CHU);
        enumMap.put("CHV", CHV);
        enumMap.put("COR", COR);
        enumMap.put("COS", COS);
        enumMap.put("CRE", CRE);
        enumMap.put("HRV", HRV);
        enumMap.put("CES", CES);
        enumMap.put("DAN", DAN);
        enumMap.put("DIV", DIV);
        enumMap.put("NLD", NLD);
        enumMap.put("DZO", DZO);
        enumMap.put("ENM", ENM);
        enumMap.put("EPO", EPO);
        enumMap.put("EST", EST);
        enumMap.put("EWE", EWE);
        enumMap.put("FAO", FAO);
        enumMap.put("FIJ", FIJ);
        enumMap.put("FIN", FIN);
        enumMap.put("FRM", FRM);
        enumMap.put("FUL", FUL);
        enumMap.put("GLA", GLA);
        enumMap.put("GLG", GLG);
        enumMap.put("LUG", LUG);
        enumMap.put("KAT", KAT);
        enumMap.put("ELL", ELL);
        enumMap.put("GRN", GRN);
        enumMap.put("GUJ", GUJ);
        enumMap.put("HAT", HAT);
        enumMap.put("HAU", HAU);
        enumMap.put("HEB", HEB);
        enumMap.put("HER", HER);
        enumMap.put("HMO", HMO);
        enumMap.put("HUN", HUN);
        enumMap.put("ISL", ISL);
        enumMap.put("IDO", IDO);
        enumMap.put("IBO", IBO);
        enumMap.put("IND", IND);
        enumMap.put("INA", INA);
        enumMap.put("ILE", ILE);
        enumMap.put("IKU", IKU);
        enumMap.put("IPK", IPK);
        enumMap.put("GLE", GLE);
        enumMap.put("JAV", JAV);
        enumMap.put("KAL", KAL);
        enumMap.put("KAN", KAN);
        enumMap.put("KAU", KAU);
        enumMap.put("KAS", KAS);
        enumMap.put("KAZ", KAZ);
        enumMap.put("KIK", KIK);
        enumMap.put("KIN", KIN);
        enumMap.put("KIR", KIR);
        enumMap.put("KOM", KOM);
        enumMap.put("KON", KON);
        enumMap.put("KUA", KUA);
        enumMap.put("KUR", KUR);
        enumMap.put("LAO", LAO);
        enumMap.put("LAT", LAT);
        enumMap.put("LAV", LAV);
        enumMap.put("LIM", LIM);
        enumMap.put("LIN", LIN);
        enumMap.put("LIT", LIT);
        enumMap.put("LUB", LUB);
        enumMap.put("LTZ", LTZ);
        enumMap.put("MKD", MKD);
        enumMap.put("MLG", MLG);
        enumMap.put("MSA", MSA);
        enumMap.put("MAL", MAL);
        enumMap.put("MLT", MLT);
        enumMap.put("GLV", GLV);
        enumMap.put("MRI", MRI);
        enumMap.put("MAR", MAR);
        enumMap.put("MAH", MAH);
        enumMap.put("MON", MON);
        enumMap.put("NAU", NAU);
        enumMap.put("NAV", NAV);
        enumMap.put("NDE", NDE);
        enumMap.put("NBL", NBL);
        enumMap.put("NDO", NDO);
        enumMap.put("NEP", NEP);
        enumMap.put("SME", SME);
        enumMap.put("NOR", NOR);
        enumMap.put("NOB", NOB);
        enumMap.put("NNO", NNO);
        enumMap.put("OCI", OCI);
        enumMap.put("OJI", OJI);
        enumMap.put("ORI", ORI);
        enumMap.put("ORM", ORM);
        enumMap.put("OSS", OSS);
        enumMap.put("PLI", PLI);
        enumMap.put("FAS", FAS);
        enumMap.put("POL", POL);
        enumMap.put("PUS", PUS);
        enumMap.put("QUE", QUE);
        enumMap.put("QAA", QAA);
        enumMap.put("RON", RON);
        enumMap.put("ROH", ROH);
        enumMap.put("RUN", RUN);
        enumMap.put("SMO", SMO);
        enumMap.put("SAG", SAG);
        enumMap.put("SAN", SAN);
        enumMap.put("SRD", SRD);
        enumMap.put("SRB", SRB);
        enumMap.put("SNA", SNA);
        enumMap.put("III", III);
        enumMap.put("SND", SND);
        enumMap.put("SIN", SIN);
        enumMap.put("SLK", SLK);
        enumMap.put("SLV", SLV);
        enumMap.put("SOM", SOM);
        enumMap.put("SOT", SOT);
        enumMap.put("SUN", SUN);
        enumMap.put("SWA", SWA);
        enumMap.put("SSW", SSW);
        enumMap.put("SWE", SWE);
        enumMap.put("TGL", TGL);
        enumMap.put("TAH", TAH);
        enumMap.put("TGK", TGK);
        enumMap.put("TAM", TAM);
        enumMap.put("TAT", TAT);
        enumMap.put("TEL", TEL);
        enumMap.put("THA", THA);
        enumMap.put("BOD", BOD);
        enumMap.put("TIR", TIR);
        enumMap.put("TON", TON);
        enumMap.put("TSO", TSO);
        enumMap.put("TSN", TSN);
        enumMap.put("TUR", TUR);
        enumMap.put("TUK", TUK);
        enumMap.put("TWI", TWI);
        enumMap.put("UIG", UIG);
        enumMap.put("UKR", UKR);
        enumMap.put("UZB", UZB);
        enumMap.put("VEN", VEN);
        enumMap.put("VOL", VOL);
        enumMap.put("WLN", WLN);
        enumMap.put("CYM", CYM);
        enumMap.put("FRY", FRY);
        enumMap.put("WOL", WOL);
        enumMap.put("XHO", XHO);
        enumMap.put("YID", YID);
        enumMap.put("YOR", YOR);
        enumMap.put("ZHA", ZHA);
        enumMap.put("ZUL", ZUL);
        enumMap.put("ORJ", ORJ);
        enumMap.put("QPC", QPC);
        enumMap.put("TNG", TNG);
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
