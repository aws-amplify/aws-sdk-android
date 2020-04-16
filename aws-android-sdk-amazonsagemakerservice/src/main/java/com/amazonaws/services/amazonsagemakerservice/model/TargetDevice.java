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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Target Device
 */
public enum TargetDevice {

    Lambda("lambda"),
    Ml_m4("ml_m4"),
    Ml_m5("ml_m5"),
    Ml_c4("ml_c4"),
    Ml_c5("ml_c5"),
    Ml_p2("ml_p2"),
    Ml_p3("ml_p3"),
    Ml_inf1("ml_inf1"),
    Jetson_tx1("jetson_tx1"),
    Jetson_tx2("jetson_tx2"),
    Jetson_nano("jetson_nano"),
    Jetson_xavier("jetson_xavier"),
    Rasp3b("rasp3b"),
    Imx8qm("imx8qm"),
    Deeplens("deeplens"),
    Rk3399("rk3399"),
    Rk3288("rk3288"),
    Aisage("aisage"),
    Sbe_c("sbe_c"),
    Qcs605("qcs605"),
    Qcs603("qcs603"),
    Sitara_am57x("sitara_am57x"),
    Amba_cv22("amba_cv22");

    private String value;

    private TargetDevice(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TargetDevice> enumMap;
    static {
        enumMap = new HashMap<String, TargetDevice>();
        enumMap.put("lambda", Lambda);
        enumMap.put("ml_m4", Ml_m4);
        enumMap.put("ml_m5", Ml_m5);
        enumMap.put("ml_c4", Ml_c4);
        enumMap.put("ml_c5", Ml_c5);
        enumMap.put("ml_p2", Ml_p2);
        enumMap.put("ml_p3", Ml_p3);
        enumMap.put("ml_inf1", Ml_inf1);
        enumMap.put("jetson_tx1", Jetson_tx1);
        enumMap.put("jetson_tx2", Jetson_tx2);
        enumMap.put("jetson_nano", Jetson_nano);
        enumMap.put("jetson_xavier", Jetson_xavier);
        enumMap.put("rasp3b", Rasp3b);
        enumMap.put("imx8qm", Imx8qm);
        enumMap.put("deeplens", Deeplens);
        enumMap.put("rk3399", Rk3399);
        enumMap.put("rk3288", Rk3288);
        enumMap.put("aisage", Aisage);
        enumMap.put("sbe_c", Sbe_c);
        enumMap.put("qcs605", Qcs605);
        enumMap.put("qcs603", Qcs603);
        enumMap.put("sitara_am57x", Sitara_am57x);
        enumMap.put("amba_cv22", Amba_cv22);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TargetDevice corresponding to the value
     */
    public static TargetDevice fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
