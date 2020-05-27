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

package com.amazonaws.services.guardduty.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Threat Intel Set Format
 */
public enum ThreatIntelSetFormat {

    TXT("TXT"),
    STIX("STIX"),
    OTX_CSV("OTX_CSV"),
    ALIEN_VAULT("ALIEN_VAULT"),
    PROOF_POINT("PROOF_POINT"),
    FIRE_EYE("FIRE_EYE");

    private String value;

    private ThreatIntelSetFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ThreatIntelSetFormat> enumMap;
    static {
        enumMap = new HashMap<String, ThreatIntelSetFormat>();
        enumMap.put("TXT", TXT);
        enumMap.put("STIX", STIX);
        enumMap.put("OTX_CSV", OTX_CSV);
        enumMap.put("ALIEN_VAULT", ALIEN_VAULT);
        enumMap.put("PROOF_POINT", PROOF_POINT);
        enumMap.put("FIRE_EYE", FIRE_EYE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ThreatIntelSetFormat corresponding to the value
     */
    public static ThreatIntelSetFormat fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
