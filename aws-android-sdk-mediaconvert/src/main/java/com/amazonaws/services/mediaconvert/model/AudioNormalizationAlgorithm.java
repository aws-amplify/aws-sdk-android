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
 * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1:
 * Ungated loudness. A measurement of ungated average loudness for an entire
 * piece of content, suitable for measurement of short-form content under ATSC
 * recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2:
 * Gated loudness. A measurement of gated average loudness compliant with the
 * requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3:
 * Modified peak. The same loudness measurement algorithm as 1770-2, with an
 * updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows
 * for more audio channels than the other algorithms, including configurations
 * such as 7.1.
 */
public enum AudioNormalizationAlgorithm {

    ITU_BS_1770_1("ITU_BS_1770_1"),
    ITU_BS_1770_2("ITU_BS_1770_2"),
    ITU_BS_1770_3("ITU_BS_1770_3"),
    ITU_BS_1770_4("ITU_BS_1770_4");

    private String value;

    private AudioNormalizationAlgorithm(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AudioNormalizationAlgorithm> enumMap;
    static {
        enumMap = new HashMap<String, AudioNormalizationAlgorithm>();
        enumMap.put("ITU_BS_1770_1", ITU_BS_1770_1);
        enumMap.put("ITU_BS_1770_2", ITU_BS_1770_2);
        enumMap.put("ITU_BS_1770_3", ITU_BS_1770_3);
        enumMap.put("ITU_BS_1770_4", ITU_BS_1770_4);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AudioNormalizationAlgorithm corresponding to the value
     */
    public static AudioNormalizationAlgorithm fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
