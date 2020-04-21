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
 * Extra Param Name
 */
public enum ExtraParamName {

    DUNS_NUMBER("DUNS_NUMBER"),
    BRAND_NUMBER("BRAND_NUMBER"),
    BIRTH_DEPARTMENT("BIRTH_DEPARTMENT"),
    BIRTH_DATE_IN_YYYY_MM_DD("BIRTH_DATE_IN_YYYY_MM_DD"),
    BIRTH_COUNTRY("BIRTH_COUNTRY"),
    BIRTH_CITY("BIRTH_CITY"),
    DOCUMENT_NUMBER("DOCUMENT_NUMBER"),
    AU_ID_NUMBER("AU_ID_NUMBER"),
    AU_ID_TYPE("AU_ID_TYPE"),
    CA_LEGAL_TYPE("CA_LEGAL_TYPE"),
    CA_BUSINESS_ENTITY_TYPE("CA_BUSINESS_ENTITY_TYPE"),
    CA_LEGAL_REPRESENTATIVE("CA_LEGAL_REPRESENTATIVE"),
    CA_LEGAL_REPRESENTATIVE_CAPACITY("CA_LEGAL_REPRESENTATIVE_CAPACITY"),
    ES_IDENTIFICATION("ES_IDENTIFICATION"),
    ES_IDENTIFICATION_TYPE("ES_IDENTIFICATION_TYPE"),
    ES_LEGAL_FORM("ES_LEGAL_FORM"),
    FI_BUSINESS_NUMBER("FI_BUSINESS_NUMBER"),
    FI_ID_NUMBER("FI_ID_NUMBER"),
    FI_NATIONALITY("FI_NATIONALITY"),
    FI_ORGANIZATION_TYPE("FI_ORGANIZATION_TYPE"),
    IT_NATIONALITY("IT_NATIONALITY"),
    IT_PIN("IT_PIN"),
    IT_REGISTRANT_ENTITY_TYPE("IT_REGISTRANT_ENTITY_TYPE"),
    RU_PASSPORT_DATA("RU_PASSPORT_DATA"),
    SE_ID_NUMBER("SE_ID_NUMBER"),
    SG_ID_NUMBER("SG_ID_NUMBER"),
    VAT_NUMBER("VAT_NUMBER"),
    UK_CONTACT_TYPE("UK_CONTACT_TYPE"),
    UK_COMPANY_NUMBER("UK_COMPANY_NUMBER");

    private String value;

    private ExtraParamName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ExtraParamName> enumMap;
    static {
        enumMap = new HashMap<String, ExtraParamName>();
        enumMap.put("DUNS_NUMBER", DUNS_NUMBER);
        enumMap.put("BRAND_NUMBER", BRAND_NUMBER);
        enumMap.put("BIRTH_DEPARTMENT", BIRTH_DEPARTMENT);
        enumMap.put("BIRTH_DATE_IN_YYYY_MM_DD", BIRTH_DATE_IN_YYYY_MM_DD);
        enumMap.put("BIRTH_COUNTRY", BIRTH_COUNTRY);
        enumMap.put("BIRTH_CITY", BIRTH_CITY);
        enumMap.put("DOCUMENT_NUMBER", DOCUMENT_NUMBER);
        enumMap.put("AU_ID_NUMBER", AU_ID_NUMBER);
        enumMap.put("AU_ID_TYPE", AU_ID_TYPE);
        enumMap.put("CA_LEGAL_TYPE", CA_LEGAL_TYPE);
        enumMap.put("CA_BUSINESS_ENTITY_TYPE", CA_BUSINESS_ENTITY_TYPE);
        enumMap.put("CA_LEGAL_REPRESENTATIVE", CA_LEGAL_REPRESENTATIVE);
        enumMap.put("CA_LEGAL_REPRESENTATIVE_CAPACITY", CA_LEGAL_REPRESENTATIVE_CAPACITY);
        enumMap.put("ES_IDENTIFICATION", ES_IDENTIFICATION);
        enumMap.put("ES_IDENTIFICATION_TYPE", ES_IDENTIFICATION_TYPE);
        enumMap.put("ES_LEGAL_FORM", ES_LEGAL_FORM);
        enumMap.put("FI_BUSINESS_NUMBER", FI_BUSINESS_NUMBER);
        enumMap.put("FI_ID_NUMBER", FI_ID_NUMBER);
        enumMap.put("FI_NATIONALITY", FI_NATIONALITY);
        enumMap.put("FI_ORGANIZATION_TYPE", FI_ORGANIZATION_TYPE);
        enumMap.put("IT_NATIONALITY", IT_NATIONALITY);
        enumMap.put("IT_PIN", IT_PIN);
        enumMap.put("IT_REGISTRANT_ENTITY_TYPE", IT_REGISTRANT_ENTITY_TYPE);
        enumMap.put("RU_PASSPORT_DATA", RU_PASSPORT_DATA);
        enumMap.put("SE_ID_NUMBER", SE_ID_NUMBER);
        enumMap.put("SG_ID_NUMBER", SG_ID_NUMBER);
        enumMap.put("VAT_NUMBER", VAT_NUMBER);
        enumMap.put("UK_CONTACT_TYPE", UK_CONTACT_TYPE);
        enumMap.put("UK_COMPANY_NUMBER", UK_COMPANY_NUMBER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ExtraParamName corresponding to the value
     */
    public static ExtraParamName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
