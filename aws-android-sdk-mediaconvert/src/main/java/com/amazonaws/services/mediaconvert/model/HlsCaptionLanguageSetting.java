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
 * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS
 * lines in the manifest. Specify at least one language in the CC1 Language Code
 * field. One CLOSED-CAPTION line is added for each Language Code you specify.
 * Make sure to specify the languages in the order in which they appear in the
 * original source (if the source is embedded format) or the order of the
 * caption selectors (if the source is other than embedded). Otherwise,
 * languages in the manifest will not match up properly with the output
 * captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit
 * any CLOSED-CAPTIONS line from the manifest.
 */
public enum HlsCaptionLanguageSetting {

    INSERT("INSERT"),
    OMIT("OMIT"),
    NONE("NONE");

    private String value;

    private HlsCaptionLanguageSetting(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsCaptionLanguageSetting> enumMap;
    static {
        enumMap = new HashMap<String, HlsCaptionLanguageSetting>();
        enumMap.put("INSERT", INSERT);
        enumMap.put("OMIT", OMIT);
        enumMap.put("NONE", NONE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsCaptionLanguageSetting corresponding to the value
     */
    public static HlsCaptionLanguageSetting fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
