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

package com.amazonaws.services.a4b.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Conference Provider Type
 */
public enum ConferenceProviderType {

    CHIME("CHIME"),
    BLUEJEANS("BLUEJEANS"),
    FUZE("FUZE"),
    GOOGLE_HANGOUTS("GOOGLE_HANGOUTS"),
    POLYCOM("POLYCOM"),
    RINGCENTRAL("RINGCENTRAL"),
    SKYPE_FOR_BUSINESS("SKYPE_FOR_BUSINESS"),
    WEBEX("WEBEX"),
    ZOOM("ZOOM"),
    CUSTOM("CUSTOM");

    private String value;

    private ConferenceProviderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ConferenceProviderType> enumMap;
    static {
        enumMap = new HashMap<String, ConferenceProviderType>();
        enumMap.put("CHIME", CHIME);
        enumMap.put("BLUEJEANS", BLUEJEANS);
        enumMap.put("FUZE", FUZE);
        enumMap.put("GOOGLE_HANGOUTS", GOOGLE_HANGOUTS);
        enumMap.put("POLYCOM", POLYCOM);
        enumMap.put("RINGCENTRAL", RINGCENTRAL);
        enumMap.put("SKYPE_FOR_BUSINESS", SKYPE_FOR_BUSINESS);
        enumMap.put("WEBEX", WEBEX);
        enumMap.put("ZOOM", ZOOM);
        enumMap.put("CUSTOM", CUSTOM);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ConferenceProviderType corresponding to the value
     */
    public static ConferenceProviderType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
