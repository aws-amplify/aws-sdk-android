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
 * Entity Type
 */
public enum EntityType {

    PERSON("PERSON"),
    LOCATION("LOCATION"),
    ORGANIZATION("ORGANIZATION"),
    COMMERCIAL_ITEM("COMMERCIAL_ITEM"),
    EVENT("EVENT"),
    DATE("DATE"),
    QUANTITY("QUANTITY"),
    TITLE("TITLE"),
    OTHER("OTHER");

    private String value;

    private EntityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EntityType> enumMap;
    static {
        enumMap = new HashMap<String, EntityType>();
        enumMap.put("PERSON", PERSON);
        enumMap.put("LOCATION", LOCATION);
        enumMap.put("ORGANIZATION", ORGANIZATION);
        enumMap.put("COMMERCIAL_ITEM", COMMERCIAL_ITEM);
        enumMap.put("EVENT", EVENT);
        enumMap.put("DATE", DATE);
        enumMap.put("QUANTITY", QUANTITY);
        enumMap.put("TITLE", TITLE);
        enumMap.put("OTHER", OTHER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EntityType corresponding to the value
     */
    public static EntityType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
