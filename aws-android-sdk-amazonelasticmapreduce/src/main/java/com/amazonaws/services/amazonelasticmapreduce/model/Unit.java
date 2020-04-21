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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit
 */
public enum Unit {

    NONE("NONE"),
    SECONDS("SECONDS"),
    MICRO_SECONDS("MICRO_SECONDS"),
    MILLI_SECONDS("MILLI_SECONDS"),
    BYTES("BYTES"),
    KILO_BYTES("KILO_BYTES"),
    MEGA_BYTES("MEGA_BYTES"),
    GIGA_BYTES("GIGA_BYTES"),
    TERA_BYTES("TERA_BYTES"),
    BITS("BITS"),
    KILO_BITS("KILO_BITS"),
    MEGA_BITS("MEGA_BITS"),
    GIGA_BITS("GIGA_BITS"),
    TERA_BITS("TERA_BITS"),
    PERCENT("PERCENT"),
    COUNT("COUNT"),
    BYTES_PER_SECOND("BYTES_PER_SECOND"),
    KILO_BYTES_PER_SECOND("KILO_BYTES_PER_SECOND"),
    MEGA_BYTES_PER_SECOND("MEGA_BYTES_PER_SECOND"),
    GIGA_BYTES_PER_SECOND("GIGA_BYTES_PER_SECOND"),
    TERA_BYTES_PER_SECOND("TERA_BYTES_PER_SECOND"),
    BITS_PER_SECOND("BITS_PER_SECOND"),
    KILO_BITS_PER_SECOND("KILO_BITS_PER_SECOND"),
    MEGA_BITS_PER_SECOND("MEGA_BITS_PER_SECOND"),
    GIGA_BITS_PER_SECOND("GIGA_BITS_PER_SECOND"),
    TERA_BITS_PER_SECOND("TERA_BITS_PER_SECOND"),
    COUNT_PER_SECOND("COUNT_PER_SECOND");

    private String value;

    private Unit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Unit> enumMap;
    static {
        enumMap = new HashMap<String, Unit>();
        enumMap.put("NONE", NONE);
        enumMap.put("SECONDS", SECONDS);
        enumMap.put("MICRO_SECONDS", MICRO_SECONDS);
        enumMap.put("MILLI_SECONDS", MILLI_SECONDS);
        enumMap.put("BYTES", BYTES);
        enumMap.put("KILO_BYTES", KILO_BYTES);
        enumMap.put("MEGA_BYTES", MEGA_BYTES);
        enumMap.put("GIGA_BYTES", GIGA_BYTES);
        enumMap.put("TERA_BYTES", TERA_BYTES);
        enumMap.put("BITS", BITS);
        enumMap.put("KILO_BITS", KILO_BITS);
        enumMap.put("MEGA_BITS", MEGA_BITS);
        enumMap.put("GIGA_BITS", GIGA_BITS);
        enumMap.put("TERA_BITS", TERA_BITS);
        enumMap.put("PERCENT", PERCENT);
        enumMap.put("COUNT", COUNT);
        enumMap.put("BYTES_PER_SECOND", BYTES_PER_SECOND);
        enumMap.put("KILO_BYTES_PER_SECOND", KILO_BYTES_PER_SECOND);
        enumMap.put("MEGA_BYTES_PER_SECOND", MEGA_BYTES_PER_SECOND);
        enumMap.put("GIGA_BYTES_PER_SECOND", GIGA_BYTES_PER_SECOND);
        enumMap.put("TERA_BYTES_PER_SECOND", TERA_BYTES_PER_SECOND);
        enumMap.put("BITS_PER_SECOND", BITS_PER_SECOND);
        enumMap.put("KILO_BITS_PER_SECOND", KILO_BITS_PER_SECOND);
        enumMap.put("MEGA_BITS_PER_SECOND", MEGA_BITS_PER_SECOND);
        enumMap.put("GIGA_BITS_PER_SECOND", GIGA_BITS_PER_SECOND);
        enumMap.put("TERA_BITS_PER_SECOND", TERA_BITS_PER_SECOND);
        enumMap.put("COUNT_PER_SECOND", COUNT_PER_SECOND);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Unit corresponding to the value
     */
    public static Unit fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
