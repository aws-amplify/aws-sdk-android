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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Targeted Sentiment Entity Type
 */
public enum TargetedSentimentEntityType {

    PERSON("PERSON"),
    LOCATION("LOCATION"),
    ORGANIZATION("ORGANIZATION"),
    FACILITY("FACILITY"),
    BRAND("BRAND"),
    COMMERCIAL_ITEM("COMMERCIAL_ITEM"),
    MOVIE("MOVIE"),
    MUSIC("MUSIC"),
    BOOK("BOOK"),
    SOFTWARE("SOFTWARE"),
    GAME("GAME"),
    PERSONAL_TITLE("PERSONAL_TITLE"),
    EVENT("EVENT"),
    DATE("DATE"),
    QUANTITY("QUANTITY"),
    ATTRIBUTE("ATTRIBUTE"),
    OTHER("OTHER");

    private String value;

    private TargetedSentimentEntityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TargetedSentimentEntityType> enumMap;
    static {
        enumMap = new HashMap<String, TargetedSentimentEntityType>();
        enumMap.put("PERSON", PERSON);
        enumMap.put("LOCATION", LOCATION);
        enumMap.put("ORGANIZATION", ORGANIZATION);
        enumMap.put("FACILITY", FACILITY);
        enumMap.put("BRAND", BRAND);
        enumMap.put("COMMERCIAL_ITEM", COMMERCIAL_ITEM);
        enumMap.put("MOVIE", MOVIE);
        enumMap.put("MUSIC", MUSIC);
        enumMap.put("BOOK", BOOK);
        enumMap.put("SOFTWARE", SOFTWARE);
        enumMap.put("GAME", GAME);
        enumMap.put("PERSONAL_TITLE", PERSONAL_TITLE);
        enumMap.put("EVENT", EVENT);
        enumMap.put("DATE", DATE);
        enumMap.put("QUANTITY", QUANTITY);
        enumMap.put("ATTRIBUTE", ATTRIBUTE);
        enumMap.put("OTHER", OTHER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TargetedSentimentEntityType corresponding to the value
     */
    public static TargetedSentimentEntityType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
