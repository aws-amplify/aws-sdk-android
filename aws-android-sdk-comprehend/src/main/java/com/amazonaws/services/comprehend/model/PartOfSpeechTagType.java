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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Part Of Speech Tag Type
 */
public enum PartOfSpeechTagType {

    ADJ("ADJ"),
    ADP("ADP"),
    ADV("ADV"),
    AUX("AUX"),
    CONJ("CONJ"),
    CCONJ("CCONJ"),
    DET("DET"),
    INTJ("INTJ"),
    NOUN("NOUN"),
    NUM("NUM"),
    O("O"),
    PART("PART"),
    PRON("PRON"),
    PROPN("PROPN"),
    PUNCT("PUNCT"),
    SCONJ("SCONJ"),
    SYM("SYM"),
    VERB("VERB");

    private String value;

    private PartOfSpeechTagType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PartOfSpeechTagType> enumMap;
    static {
        enumMap = new HashMap<String, PartOfSpeechTagType>();
        enumMap.put("ADJ", ADJ);
        enumMap.put("ADP", ADP);
        enumMap.put("ADV", ADV);
        enumMap.put("AUX", AUX);
        enumMap.put("CONJ", CONJ);
        enumMap.put("CCONJ", CCONJ);
        enumMap.put("DET", DET);
        enumMap.put("INTJ", INTJ);
        enumMap.put("NOUN", NOUN);
        enumMap.put("NUM", NUM);
        enumMap.put("O", O);
        enumMap.put("PART", PART);
        enumMap.put("PRON", PRON);
        enumMap.put("PROPN", PROPN);
        enumMap.put("PUNCT", PUNCT);
        enumMap.put("SCONJ", SCONJ);
        enumMap.put("SYM", SYM);
        enumMap.put("VERB", VERB);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PartOfSpeechTagType corresponding to the value
     */
    public static PartOfSpeechTagType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
