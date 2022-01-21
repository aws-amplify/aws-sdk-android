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
 * Phone Number Country Code
 */
public enum PhoneNumberCountryCode {

    AF("AF"),
    AL("AL"),
    DZ("DZ"),
    AS("AS"),
    AD("AD"),
    AO("AO"),
    AI("AI"),
    AQ("AQ"),
    AG("AG"),
    AR("AR"),
    AM("AM"),
    AW("AW"),
    AU("AU"),
    AT("AT"),
    AZ("AZ"),
    BS("BS"),
    BH("BH"),
    BD("BD"),
    BB("BB"),
    BY("BY"),
    BE("BE"),
    BZ("BZ"),
    BJ("BJ"),
    BM("BM"),
    BT("BT"),
    BO("BO"),
    BA("BA"),
    BW("BW"),
    BR("BR"),
    IO("IO"),
    VG("VG"),
    BN("BN"),
    BG("BG"),
    BF("BF"),
    BI("BI"),
    KH("KH"),
    CM("CM"),
    CA("CA"),
    CV("CV"),
    KY("KY"),
    CF("CF"),
    TD("TD"),
    CL("CL"),
    CN("CN"),
    CX("CX"),
    CC("CC"),
    CO("CO"),
    KM("KM"),
    CK("CK"),
    CR("CR"),
    HR("HR"),
    CU("CU"),
    CW("CW"),
    CY("CY"),
    CZ("CZ"),
    CD("CD"),
    DK("DK"),
    DJ("DJ"),
    DM("DM"),
    DO("DO"),
    TL("TL"),
    EC("EC"),
    EG("EG"),
    SV("SV"),
    GQ("GQ"),
    ER("ER"),
    EE("EE"),
    ET("ET"),
    FK("FK"),
    FO("FO"),
    FJ("FJ"),
    FI("FI"),
    FR("FR"),
    PF("PF"),
    GA("GA"),
    GM("GM"),
    GE("GE"),
    DE("DE"),
    GH("GH"),
    GI("GI"),
    GR("GR"),
    GL("GL"),
    GD("GD"),
    GU("GU"),
    GT("GT"),
    GG("GG"),
    GN("GN"),
    GW("GW"),
    GY("GY"),
    HT("HT"),
    HN("HN"),
    HK("HK"),
    HU("HU"),
    IS("IS"),
    IN("IN"),
    ID("ID"),
    IR("IR"),
    IQ("IQ"),
    IE("IE"),
    IM("IM"),
    IL("IL"),
    IT("IT"),
    CI("CI"),
    JM("JM"),
    JP("JP"),
    JE("JE"),
    JO("JO"),
    KZ("KZ"),
    KE("KE"),
    KI("KI"),
    KW("KW"),
    KG("KG"),
    LA("LA"),
    LV("LV"),
    LB("LB"),
    LS("LS"),
    LR("LR"),
    LY("LY"),
    LI("LI"),
    LT("LT"),
    LU("LU"),
    MO("MO"),
    MK("MK"),
    MG("MG"),
    MW("MW"),
    MY("MY"),
    MV("MV"),
    ML("ML"),
    MT("MT"),
    MH("MH"),
    MR("MR"),
    MU("MU"),
    YT("YT"),
    MX("MX"),
    FM("FM"),
    MD("MD"),
    MC("MC"),
    MN("MN"),
    ME("ME"),
    MS("MS"),
    MA("MA"),
    MZ("MZ"),
    MM("MM"),
    NA("NA"),
    NR("NR"),
    NP("NP"),
    NL("NL"),
    AN("AN"),
    NC("NC"),
    NZ("NZ"),
    NI("NI"),
    NE("NE"),
    NG("NG"),
    NU("NU"),
    KP("KP"),
    MP("MP"),
    NO("NO"),
    OM("OM"),
    PK("PK"),
    PW("PW"),
    PA("PA"),
    PG("PG"),
    PY("PY"),
    PE("PE"),
    PH("PH"),
    PN("PN"),
    PL("PL"),
    PT("PT"),
    PR("PR"),
    QA("QA"),
    CG("CG"),
    RE("RE"),
    RO("RO"),
    RU("RU"),
    RW("RW"),
    BL("BL"),
    SH("SH"),
    KN("KN"),
    LC("LC"),
    MF("MF"),
    PM("PM"),
    VC("VC"),
    WS("WS"),
    SM("SM"),
    ST("ST"),
    SA("SA"),
    SN("SN"),
    RS("RS"),
    SC("SC"),
    SL("SL"),
    SG("SG"),
    SX("SX"),
    SK("SK"),
    SI("SI"),
    SB("SB"),
    SO("SO"),
    ZA("ZA"),
    KR("KR"),
    ES("ES"),
    LK("LK"),
    SD("SD"),
    SR("SR"),
    SJ("SJ"),
    SZ("SZ"),
    SE("SE"),
    CH("CH"),
    SY("SY"),
    TW("TW"),
    TJ("TJ"),
    TZ("TZ"),
    TH("TH"),
    TG("TG"),
    TK("TK"),
    TO("TO"),
    TT("TT"),
    TN("TN"),
    TR("TR"),
    TM("TM"),
    TC("TC"),
    TV("TV"),
    VI("VI"),
    UG("UG"),
    UA("UA"),
    AE("AE"),
    GB("GB"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VU("VU"),
    VA("VA"),
    VE("VE"),
    VN("VN"),
    WF("WF"),
    EH("EH"),
    YE("YE"),
    ZM("ZM"),
    ZW("ZW");

    private String value;

    private PhoneNumberCountryCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PhoneNumberCountryCode> enumMap;
    static {
        enumMap = new HashMap<String, PhoneNumberCountryCode>();
        enumMap.put("AF", AF);
        enumMap.put("AL", AL);
        enumMap.put("DZ", DZ);
        enumMap.put("AS", AS);
        enumMap.put("AD", AD);
        enumMap.put("AO", AO);
        enumMap.put("AI", AI);
        enumMap.put("AQ", AQ);
        enumMap.put("AG", AG);
        enumMap.put("AR", AR);
        enumMap.put("AM", AM);
        enumMap.put("AW", AW);
        enumMap.put("AU", AU);
        enumMap.put("AT", AT);
        enumMap.put("AZ", AZ);
        enumMap.put("BS", BS);
        enumMap.put("BH", BH);
        enumMap.put("BD", BD);
        enumMap.put("BB", BB);
        enumMap.put("BY", BY);
        enumMap.put("BE", BE);
        enumMap.put("BZ", BZ);
        enumMap.put("BJ", BJ);
        enumMap.put("BM", BM);
        enumMap.put("BT", BT);
        enumMap.put("BO", BO);
        enumMap.put("BA", BA);
        enumMap.put("BW", BW);
        enumMap.put("BR", BR);
        enumMap.put("IO", IO);
        enumMap.put("VG", VG);
        enumMap.put("BN", BN);
        enumMap.put("BG", BG);
        enumMap.put("BF", BF);
        enumMap.put("BI", BI);
        enumMap.put("KH", KH);
        enumMap.put("CM", CM);
        enumMap.put("CA", CA);
        enumMap.put("CV", CV);
        enumMap.put("KY", KY);
        enumMap.put("CF", CF);
        enumMap.put("TD", TD);
        enumMap.put("CL", CL);
        enumMap.put("CN", CN);
        enumMap.put("CX", CX);
        enumMap.put("CC", CC);
        enumMap.put("CO", CO);
        enumMap.put("KM", KM);
        enumMap.put("CK", CK);
        enumMap.put("CR", CR);
        enumMap.put("HR", HR);
        enumMap.put("CU", CU);
        enumMap.put("CW", CW);
        enumMap.put("CY", CY);
        enumMap.put("CZ", CZ);
        enumMap.put("CD", CD);
        enumMap.put("DK", DK);
        enumMap.put("DJ", DJ);
        enumMap.put("DM", DM);
        enumMap.put("DO", DO);
        enumMap.put("TL", TL);
        enumMap.put("EC", EC);
        enumMap.put("EG", EG);
        enumMap.put("SV", SV);
        enumMap.put("GQ", GQ);
        enumMap.put("ER", ER);
        enumMap.put("EE", EE);
        enumMap.put("ET", ET);
        enumMap.put("FK", FK);
        enumMap.put("FO", FO);
        enumMap.put("FJ", FJ);
        enumMap.put("FI", FI);
        enumMap.put("FR", FR);
        enumMap.put("PF", PF);
        enumMap.put("GA", GA);
        enumMap.put("GM", GM);
        enumMap.put("GE", GE);
        enumMap.put("DE", DE);
        enumMap.put("GH", GH);
        enumMap.put("GI", GI);
        enumMap.put("GR", GR);
        enumMap.put("GL", GL);
        enumMap.put("GD", GD);
        enumMap.put("GU", GU);
        enumMap.put("GT", GT);
        enumMap.put("GG", GG);
        enumMap.put("GN", GN);
        enumMap.put("GW", GW);
        enumMap.put("GY", GY);
        enumMap.put("HT", HT);
        enumMap.put("HN", HN);
        enumMap.put("HK", HK);
        enumMap.put("HU", HU);
        enumMap.put("IS", IS);
        enumMap.put("IN", IN);
        enumMap.put("ID", ID);
        enumMap.put("IR", IR);
        enumMap.put("IQ", IQ);
        enumMap.put("IE", IE);
        enumMap.put("IM", IM);
        enumMap.put("IL", IL);
        enumMap.put("IT", IT);
        enumMap.put("CI", CI);
        enumMap.put("JM", JM);
        enumMap.put("JP", JP);
        enumMap.put("JE", JE);
        enumMap.put("JO", JO);
        enumMap.put("KZ", KZ);
        enumMap.put("KE", KE);
        enumMap.put("KI", KI);
        enumMap.put("KW", KW);
        enumMap.put("KG", KG);
        enumMap.put("LA", LA);
        enumMap.put("LV", LV);
        enumMap.put("LB", LB);
        enumMap.put("LS", LS);
        enumMap.put("LR", LR);
        enumMap.put("LY", LY);
        enumMap.put("LI", LI);
        enumMap.put("LT", LT);
        enumMap.put("LU", LU);
        enumMap.put("MO", MO);
        enumMap.put("MK", MK);
        enumMap.put("MG", MG);
        enumMap.put("MW", MW);
        enumMap.put("MY", MY);
        enumMap.put("MV", MV);
        enumMap.put("ML", ML);
        enumMap.put("MT", MT);
        enumMap.put("MH", MH);
        enumMap.put("MR", MR);
        enumMap.put("MU", MU);
        enumMap.put("YT", YT);
        enumMap.put("MX", MX);
        enumMap.put("FM", FM);
        enumMap.put("MD", MD);
        enumMap.put("MC", MC);
        enumMap.put("MN", MN);
        enumMap.put("ME", ME);
        enumMap.put("MS", MS);
        enumMap.put("MA", MA);
        enumMap.put("MZ", MZ);
        enumMap.put("MM", MM);
        enumMap.put("NA", NA);
        enumMap.put("NR", NR);
        enumMap.put("NP", NP);
        enumMap.put("NL", NL);
        enumMap.put("AN", AN);
        enumMap.put("NC", NC);
        enumMap.put("NZ", NZ);
        enumMap.put("NI", NI);
        enumMap.put("NE", NE);
        enumMap.put("NG", NG);
        enumMap.put("NU", NU);
        enumMap.put("KP", KP);
        enumMap.put("MP", MP);
        enumMap.put("NO", NO);
        enumMap.put("OM", OM);
        enumMap.put("PK", PK);
        enumMap.put("PW", PW);
        enumMap.put("PA", PA);
        enumMap.put("PG", PG);
        enumMap.put("PY", PY);
        enumMap.put("PE", PE);
        enumMap.put("PH", PH);
        enumMap.put("PN", PN);
        enumMap.put("PL", PL);
        enumMap.put("PT", PT);
        enumMap.put("PR", PR);
        enumMap.put("QA", QA);
        enumMap.put("CG", CG);
        enumMap.put("RE", RE);
        enumMap.put("RO", RO);
        enumMap.put("RU", RU);
        enumMap.put("RW", RW);
        enumMap.put("BL", BL);
        enumMap.put("SH", SH);
        enumMap.put("KN", KN);
        enumMap.put("LC", LC);
        enumMap.put("MF", MF);
        enumMap.put("PM", PM);
        enumMap.put("VC", VC);
        enumMap.put("WS", WS);
        enumMap.put("SM", SM);
        enumMap.put("ST", ST);
        enumMap.put("SA", SA);
        enumMap.put("SN", SN);
        enumMap.put("RS", RS);
        enumMap.put("SC", SC);
        enumMap.put("SL", SL);
        enumMap.put("SG", SG);
        enumMap.put("SX", SX);
        enumMap.put("SK", SK);
        enumMap.put("SI", SI);
        enumMap.put("SB", SB);
        enumMap.put("SO", SO);
        enumMap.put("ZA", ZA);
        enumMap.put("KR", KR);
        enumMap.put("ES", ES);
        enumMap.put("LK", LK);
        enumMap.put("SD", SD);
        enumMap.put("SR", SR);
        enumMap.put("SJ", SJ);
        enumMap.put("SZ", SZ);
        enumMap.put("SE", SE);
        enumMap.put("CH", CH);
        enumMap.put("SY", SY);
        enumMap.put("TW", TW);
        enumMap.put("TJ", TJ);
        enumMap.put("TZ", TZ);
        enumMap.put("TH", TH);
        enumMap.put("TG", TG);
        enumMap.put("TK", TK);
        enumMap.put("TO", TO);
        enumMap.put("TT", TT);
        enumMap.put("TN", TN);
        enumMap.put("TR", TR);
        enumMap.put("TM", TM);
        enumMap.put("TC", TC);
        enumMap.put("TV", TV);
        enumMap.put("VI", VI);
        enumMap.put("UG", UG);
        enumMap.put("UA", UA);
        enumMap.put("AE", AE);
        enumMap.put("GB", GB);
        enumMap.put("US", US);
        enumMap.put("UY", UY);
        enumMap.put("UZ", UZ);
        enumMap.put("VU", VU);
        enumMap.put("VA", VA);
        enumMap.put("VE", VE);
        enumMap.put("VN", VN);
        enumMap.put("WF", WF);
        enumMap.put("EH", EH);
        enumMap.put("YE", YE);
        enumMap.put("ZM", ZM);
        enumMap.put("ZW", ZW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PhoneNumberCountryCode corresponding to the value
     */
    public static PhoneNumberCountryCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
