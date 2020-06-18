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
 * Use this setting only when you specify SCTE-35 markers from ESAM. Choose
 * INSERT to put SCTE-35 markers in this output at the insertion points that you
 * specify in an ESAM XML document. Provide the document in the setting SCC XML
 * (sccXml).
 */
public enum CmfcScte35Esam {

    INSERT("INSERT"),
    NONE("NONE");

    private String value;

    private CmfcScte35Esam(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CmfcScte35Esam> enumMap;
    static {
        enumMap = new HashMap<String, CmfcScte35Esam>();
        enumMap.put("INSERT", INSERT);
        enumMap.put("NONE", NONE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CmfcScte35Esam corresponding to the value
     */
    public static CmfcScte35Esam fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
