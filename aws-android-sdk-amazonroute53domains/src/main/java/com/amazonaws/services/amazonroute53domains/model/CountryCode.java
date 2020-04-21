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

package com.amazonaws.services.amazonroute53domains.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Country Code
 */
public enum CountryCode {

    AD("AD"),
    AE("AE"),
    AF("AF"),
    AG("AG"),
    AI("AI"),
    AL("AL"),
    AM("AM"),
    AN("AN"),
    AO("AO"),
    AQ("AQ"),
    AR("AR"),
    AS("AS"),
    AT("AT"),
    AU("AU"),
    AW("AW"),
    AZ("AZ"),
    BA("BA"),
    BB("BB"),
    BD("BD"),
    BE("BE"),
    BF("BF"),
    BG("BG"),
    BH("BH"),
    BI("BI"),
    BJ("BJ"),
    BL("BL"),
    BM("BM"),
    BN("BN"),
    BO("BO"),
    BR("BR"),
    BS("BS"),
    BT("BT"),
    BW("BW"),
    BY("BY"),
    BZ("BZ"),
    CA("CA"),
    CC("CC"),
    CD("CD"),
    CF("CF"),
    CG("CG"),
    CH("CH"),
    CI("CI"),
    CK("CK"),
    CL("CL"),
    CM("CM"),
    CN("CN"),
    CO("CO"),
    CR("CR"),
    CU("CU"),
    CV("CV"),
    CX("CX"),
    CY("CY"),
    CZ("CZ"),
    DE("DE"),
    DJ("DJ"),
    DK("DK"),
    DM("DM"),
    DO("DO"),
    DZ("DZ"),
    EC("EC"),
    EE("EE"),
    EG("EG"),
    ER("ER"),
    ES("ES"),
    ET("ET"),
    FI("FI"),
    FJ("FJ"),
    FK("FK"),
    FM("FM"),
    FO("FO"),
    FR("FR"),
    GA("GA"),
    GB("GB"),
    GD("GD"),
    GE("GE"),
    GH("GH"),
    GI("GI"),
    GL("GL"),
    GM("GM"),
    GN("GN"),
    GQ("GQ"),
    GR("GR"),
    GT("GT"),
    GU("GU"),
    GW("GW"),
    GY("GY"),
    HK("HK"),
    HN("HN"),
    HR("HR"),
    HT("HT"),
    HU("HU"),
    ID("ID"),
    IE("IE"),
    IL("IL"),
    IM("IM"),
    IN("IN"),
    IQ("IQ"),
    IR("IR"),
    IS("IS"),
    IT("IT"),
    JM("JM"),
    JO("JO"),
    JP("JP"),
    KE("KE"),
    KG("KG"),
    KH("KH"),
    KI("KI"),
    KM("KM"),
    KN("KN"),
    KP("KP"),
    KR("KR"),
    KW("KW"),
    KY("KY"),
    KZ("KZ"),
    LA("LA"),
    LB("LB"),
    LC("LC"),
    LI("LI"),
    LK("LK"),
    LR("LR"),
    LS("LS"),
    LT("LT"),
    LU("LU"),
    LV("LV"),
    LY("LY"),
    MA("MA"),
    MC("MC"),
    MD("MD"),
    ME("ME"),
    MF("MF"),
    MG("MG"),
    MH("MH"),
    MK("MK"),
    ML("ML"),
    MM("MM"),
    MN("MN"),
    MO("MO"),
    MP("MP"),
    MR("MR"),
    MS("MS"),
    MT("MT"),
    MU("MU"),
    MV("MV"),
    MW("MW"),
    MX("MX"),
    MY("MY"),
    MZ("MZ"),
    NA("NA"),
    NC("NC"),
    NE("NE"),
    NG("NG"),
    NI("NI"),
    NL("NL"),
    NO("NO"),
    NP("NP"),
    NR("NR"),
    NU("NU"),
    NZ("NZ"),
    OM("OM"),
    PA("PA"),
    PE("PE"),
    PF("PF"),
    PG("PG"),
    PH("PH"),
    PK("PK"),
    PL("PL"),
    PM("PM"),
    PN("PN"),
    PR("PR"),
    PT("PT"),
    PW("PW"),
    PY("PY"),
    QA("QA"),
    RO("RO"),
    RS("RS"),
    RU("RU"),
    RW("RW"),
    SA("SA"),
    SB("SB"),
    SC("SC"),
    SD("SD"),
    SE("SE"),
    SG("SG"),
    SH("SH"),
    SI("SI"),
    SK("SK"),
    SL("SL"),
    SM("SM"),
    SN("SN"),
    SO("SO"),
    SR("SR"),
    ST("ST"),
    SV("SV"),
    SY("SY"),
    SZ("SZ"),
    TC("TC"),
    TD("TD"),
    TG("TG"),
    TH("TH"),
    TJ("TJ"),
    TK("TK"),
    TL("TL"),
    TM("TM"),
    TN("TN"),
    TO("TO"),
    TR("TR"),
    TT("TT"),
    TV("TV"),
    TW("TW"),
    TZ("TZ"),
    UA("UA"),
    UG("UG"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VA("VA"),
    VC("VC"),
    VE("VE"),
    VG("VG"),
    VI("VI"),
    VN("VN"),
    VU("VU"),
    WF("WF"),
    WS("WS"),
    YE("YE"),
    YT("YT"),
    ZA("ZA"),
    ZM("ZM"),
    ZW("ZW");

    private String value;

    private CountryCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CountryCode> enumMap;
    static {
        enumMap = new HashMap<String, CountryCode>();
        enumMap.put("AD", AD);
        enumMap.put("AE", AE);
        enumMap.put("AF", AF);
        enumMap.put("AG", AG);
        enumMap.put("AI", AI);
        enumMap.put("AL", AL);
        enumMap.put("AM", AM);
        enumMap.put("AN", AN);
        enumMap.put("AO", AO);
        enumMap.put("AQ", AQ);
        enumMap.put("AR", AR);
        enumMap.put("AS", AS);
        enumMap.put("AT", AT);
        enumMap.put("AU", AU);
        enumMap.put("AW", AW);
        enumMap.put("AZ", AZ);
        enumMap.put("BA", BA);
        enumMap.put("BB", BB);
        enumMap.put("BD", BD);
        enumMap.put("BE", BE);
        enumMap.put("BF", BF);
        enumMap.put("BG", BG);
        enumMap.put("BH", BH);
        enumMap.put("BI", BI);
        enumMap.put("BJ", BJ);
        enumMap.put("BL", BL);
        enumMap.put("BM", BM);
        enumMap.put("BN", BN);
        enumMap.put("BO", BO);
        enumMap.put("BR", BR);
        enumMap.put("BS", BS);
        enumMap.put("BT", BT);
        enumMap.put("BW", BW);
        enumMap.put("BY", BY);
        enumMap.put("BZ", BZ);
        enumMap.put("CA", CA);
        enumMap.put("CC", CC);
        enumMap.put("CD", CD);
        enumMap.put("CF", CF);
        enumMap.put("CG", CG);
        enumMap.put("CH", CH);
        enumMap.put("CI", CI);
        enumMap.put("CK", CK);
        enumMap.put("CL", CL);
        enumMap.put("CM", CM);
        enumMap.put("CN", CN);
        enumMap.put("CO", CO);
        enumMap.put("CR", CR);
        enumMap.put("CU", CU);
        enumMap.put("CV", CV);
        enumMap.put("CX", CX);
        enumMap.put("CY", CY);
        enumMap.put("CZ", CZ);
        enumMap.put("DE", DE);
        enumMap.put("DJ", DJ);
        enumMap.put("DK", DK);
        enumMap.put("DM", DM);
        enumMap.put("DO", DO);
        enumMap.put("DZ", DZ);
        enumMap.put("EC", EC);
        enumMap.put("EE", EE);
        enumMap.put("EG", EG);
        enumMap.put("ER", ER);
        enumMap.put("ES", ES);
        enumMap.put("ET", ET);
        enumMap.put("FI", FI);
        enumMap.put("FJ", FJ);
        enumMap.put("FK", FK);
        enumMap.put("FM", FM);
        enumMap.put("FO", FO);
        enumMap.put("FR", FR);
        enumMap.put("GA", GA);
        enumMap.put("GB", GB);
        enumMap.put("GD", GD);
        enumMap.put("GE", GE);
        enumMap.put("GH", GH);
        enumMap.put("GI", GI);
        enumMap.put("GL", GL);
        enumMap.put("GM", GM);
        enumMap.put("GN", GN);
        enumMap.put("GQ", GQ);
        enumMap.put("GR", GR);
        enumMap.put("GT", GT);
        enumMap.put("GU", GU);
        enumMap.put("GW", GW);
        enumMap.put("GY", GY);
        enumMap.put("HK", HK);
        enumMap.put("HN", HN);
        enumMap.put("HR", HR);
        enumMap.put("HT", HT);
        enumMap.put("HU", HU);
        enumMap.put("ID", ID);
        enumMap.put("IE", IE);
        enumMap.put("IL", IL);
        enumMap.put("IM", IM);
        enumMap.put("IN", IN);
        enumMap.put("IQ", IQ);
        enumMap.put("IR", IR);
        enumMap.put("IS", IS);
        enumMap.put("IT", IT);
        enumMap.put("JM", JM);
        enumMap.put("JO", JO);
        enumMap.put("JP", JP);
        enumMap.put("KE", KE);
        enumMap.put("KG", KG);
        enumMap.put("KH", KH);
        enumMap.put("KI", KI);
        enumMap.put("KM", KM);
        enumMap.put("KN", KN);
        enumMap.put("KP", KP);
        enumMap.put("KR", KR);
        enumMap.put("KW", KW);
        enumMap.put("KY", KY);
        enumMap.put("KZ", KZ);
        enumMap.put("LA", LA);
        enumMap.put("LB", LB);
        enumMap.put("LC", LC);
        enumMap.put("LI", LI);
        enumMap.put("LK", LK);
        enumMap.put("LR", LR);
        enumMap.put("LS", LS);
        enumMap.put("LT", LT);
        enumMap.put("LU", LU);
        enumMap.put("LV", LV);
        enumMap.put("LY", LY);
        enumMap.put("MA", MA);
        enumMap.put("MC", MC);
        enumMap.put("MD", MD);
        enumMap.put("ME", ME);
        enumMap.put("MF", MF);
        enumMap.put("MG", MG);
        enumMap.put("MH", MH);
        enumMap.put("MK", MK);
        enumMap.put("ML", ML);
        enumMap.put("MM", MM);
        enumMap.put("MN", MN);
        enumMap.put("MO", MO);
        enumMap.put("MP", MP);
        enumMap.put("MR", MR);
        enumMap.put("MS", MS);
        enumMap.put("MT", MT);
        enumMap.put("MU", MU);
        enumMap.put("MV", MV);
        enumMap.put("MW", MW);
        enumMap.put("MX", MX);
        enumMap.put("MY", MY);
        enumMap.put("MZ", MZ);
        enumMap.put("NA", NA);
        enumMap.put("NC", NC);
        enumMap.put("NE", NE);
        enumMap.put("NG", NG);
        enumMap.put("NI", NI);
        enumMap.put("NL", NL);
        enumMap.put("NO", NO);
        enumMap.put("NP", NP);
        enumMap.put("NR", NR);
        enumMap.put("NU", NU);
        enumMap.put("NZ", NZ);
        enumMap.put("OM", OM);
        enumMap.put("PA", PA);
        enumMap.put("PE", PE);
        enumMap.put("PF", PF);
        enumMap.put("PG", PG);
        enumMap.put("PH", PH);
        enumMap.put("PK", PK);
        enumMap.put("PL", PL);
        enumMap.put("PM", PM);
        enumMap.put("PN", PN);
        enumMap.put("PR", PR);
        enumMap.put("PT", PT);
        enumMap.put("PW", PW);
        enumMap.put("PY", PY);
        enumMap.put("QA", QA);
        enumMap.put("RO", RO);
        enumMap.put("RS", RS);
        enumMap.put("RU", RU);
        enumMap.put("RW", RW);
        enumMap.put("SA", SA);
        enumMap.put("SB", SB);
        enumMap.put("SC", SC);
        enumMap.put("SD", SD);
        enumMap.put("SE", SE);
        enumMap.put("SG", SG);
        enumMap.put("SH", SH);
        enumMap.put("SI", SI);
        enumMap.put("SK", SK);
        enumMap.put("SL", SL);
        enumMap.put("SM", SM);
        enumMap.put("SN", SN);
        enumMap.put("SO", SO);
        enumMap.put("SR", SR);
        enumMap.put("ST", ST);
        enumMap.put("SV", SV);
        enumMap.put("SY", SY);
        enumMap.put("SZ", SZ);
        enumMap.put("TC", TC);
        enumMap.put("TD", TD);
        enumMap.put("TG", TG);
        enumMap.put("TH", TH);
        enumMap.put("TJ", TJ);
        enumMap.put("TK", TK);
        enumMap.put("TL", TL);
        enumMap.put("TM", TM);
        enumMap.put("TN", TN);
        enumMap.put("TO", TO);
        enumMap.put("TR", TR);
        enumMap.put("TT", TT);
        enumMap.put("TV", TV);
        enumMap.put("TW", TW);
        enumMap.put("TZ", TZ);
        enumMap.put("UA", UA);
        enumMap.put("UG", UG);
        enumMap.put("US", US);
        enumMap.put("UY", UY);
        enumMap.put("UZ", UZ);
        enumMap.put("VA", VA);
        enumMap.put("VC", VC);
        enumMap.put("VE", VE);
        enumMap.put("VG", VG);
        enumMap.put("VI", VI);
        enumMap.put("VN", VN);
        enumMap.put("VU", VU);
        enumMap.put("WF", WF);
        enumMap.put("WS", WS);
        enumMap.put("YE", YE);
        enumMap.put("YT", YT);
        enumMap.put("ZA", ZA);
        enumMap.put("ZM", ZM);
        enumMap.put("ZW", ZW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CountryCode corresponding to the value
     */
    public static CountryCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
