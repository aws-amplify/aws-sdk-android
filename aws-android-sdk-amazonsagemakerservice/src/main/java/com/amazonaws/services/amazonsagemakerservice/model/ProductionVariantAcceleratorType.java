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
 * Production Variant Accelerator Type
 */
public enum ProductionVariantAcceleratorType {

    MlEia1Medium("ml.eia1.medium"),
    MlEia1Large("ml.eia1.large"),
    MlEia1Xlarge("ml.eia1.xlarge"),
    MlEia2Medium("ml.eia2.medium"),
    MlEia2Large("ml.eia2.large"),
    MlEia2Xlarge("ml.eia2.xlarge");

    private String value;

    private ProductionVariantAcceleratorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProductionVariantAcceleratorType> enumMap;
    static {
        enumMap = new HashMap<String, ProductionVariantAcceleratorType>();
        enumMap.put("ml.eia1.medium", MlEia1Medium);
        enumMap.put("ml.eia1.large", MlEia1Large);
        enumMap.put("ml.eia1.xlarge", MlEia1Xlarge);
        enumMap.put("ml.eia2.medium", MlEia2Medium);
        enumMap.put("ml.eia2.large", MlEia2Large);
        enumMap.put("ml.eia2.xlarge", MlEia2Xlarge);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProductionVariantAcceleratorType corresponding to the value
     */
    public static ProductionVariantAcceleratorType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
