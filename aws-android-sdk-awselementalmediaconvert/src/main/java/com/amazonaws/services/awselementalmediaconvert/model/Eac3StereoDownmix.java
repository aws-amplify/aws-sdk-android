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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Choose how the service does stereo downmixing. This setting only applies if
 * you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
 * setting Coding mode (Eac3CodingMode). If you choose a different value for
 * Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
 */
public enum Eac3StereoDownmix {

    NOT_INDICATED("NOT_INDICATED"),
    LO_RO("LO_RO"),
    LT_RT("LT_RT"),
    DPL2("DPL2");

    private String value;

    private Eac3StereoDownmix(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3StereoDownmix> enumMap;
    static {
        enumMap = new HashMap<String, Eac3StereoDownmix>();
        enumMap.put("NOT_INDICATED", NOT_INDICATED);
        enumMap.put("LO_RO", LO_RO);
        enumMap.put("LT_RT", LT_RT);
        enumMap.put("DPL2", DPL2);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3StereoDownmix corresponding to the value
     */
    public static Eac3StereoDownmix fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
