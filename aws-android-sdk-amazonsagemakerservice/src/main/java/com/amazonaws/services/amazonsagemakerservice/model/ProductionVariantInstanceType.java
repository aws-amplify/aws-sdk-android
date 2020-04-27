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
 * Production Variant Instance Type
 */
public enum ProductionVariantInstanceType {

    MlT2Medium("ml.t2.medium"),
    MlT2Large("ml.t2.large"),
    MlT2Xlarge("ml.t2.xlarge"),
    MlT22xlarge("ml.t2.2xlarge"),
    MlM4Xlarge("ml.m4.xlarge"),
    MlM42xlarge("ml.m4.2xlarge"),
    MlM44xlarge("ml.m4.4xlarge"),
    MlM410xlarge("ml.m4.10xlarge"),
    MlM416xlarge("ml.m4.16xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlM5dLarge("ml.m5d.large"),
    MlM5dXlarge("ml.m5d.xlarge"),
    MlM5d2xlarge("ml.m5d.2xlarge"),
    MlM5d4xlarge("ml.m5d.4xlarge"),
    MlM5d12xlarge("ml.m5d.12xlarge"),
    MlM5d24xlarge("ml.m5d.24xlarge"),
    MlC4Large("ml.c4.large"),
    MlC4Xlarge("ml.c4.xlarge"),
    MlC42xlarge("ml.c4.2xlarge"),
    MlC44xlarge("ml.c4.4xlarge"),
    MlC48xlarge("ml.c4.8xlarge"),
    MlP2Xlarge("ml.p2.xlarge"),
    MlP28xlarge("ml.p2.8xlarge"),
    MlP216xlarge("ml.p2.16xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlP38xlarge("ml.p3.8xlarge"),
    MlP316xlarge("ml.p3.16xlarge"),
    MlC5Large("ml.c5.large"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC5dLarge("ml.c5d.large"),
    MlC5dXlarge("ml.c5d.xlarge"),
    MlC5d2xlarge("ml.c5d.2xlarge"),
    MlC5d4xlarge("ml.c5d.4xlarge"),
    MlC5d9xlarge("ml.c5d.9xlarge"),
    MlC5d18xlarge("ml.c5d.18xlarge"),
    MlG4dnXlarge("ml.g4dn.xlarge"),
    MlG4dn2xlarge("ml.g4dn.2xlarge"),
    MlG4dn4xlarge("ml.g4dn.4xlarge"),
    MlG4dn8xlarge("ml.g4dn.8xlarge"),
    MlG4dn12xlarge("ml.g4dn.12xlarge"),
    MlG4dn16xlarge("ml.g4dn.16xlarge"),
    MlR5Large("ml.r5.large"),
    MlR5Xlarge("ml.r5.xlarge"),
    MlR52xlarge("ml.r5.2xlarge"),
    MlR54xlarge("ml.r5.4xlarge"),
    MlR512xlarge("ml.r5.12xlarge"),
    MlR524xlarge("ml.r5.24xlarge"),
    MlR5dLarge("ml.r5d.large"),
    MlR5dXlarge("ml.r5d.xlarge"),
    MlR5d2xlarge("ml.r5d.2xlarge"),
    MlR5d4xlarge("ml.r5d.4xlarge"),
    MlR5d12xlarge("ml.r5d.12xlarge"),
    MlR5d24xlarge("ml.r5d.24xlarge"),
    MlInf1Xlarge("ml.inf1.xlarge"),
    MlInf12xlarge("ml.inf1.2xlarge"),
    MlInf16xlarge("ml.inf1.6xlarge"),
    MlInf124xlarge("ml.inf1.24xlarge");

    private String value;

    private ProductionVariantInstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProductionVariantInstanceType> enumMap;
    static {
        enumMap = new HashMap<String, ProductionVariantInstanceType>();
        enumMap.put("ml.t2.medium", MlT2Medium);
        enumMap.put("ml.t2.large", MlT2Large);
        enumMap.put("ml.t2.xlarge", MlT2Xlarge);
        enumMap.put("ml.t2.2xlarge", MlT22xlarge);
        enumMap.put("ml.m4.xlarge", MlM4Xlarge);
        enumMap.put("ml.m4.2xlarge", MlM42xlarge);
        enumMap.put("ml.m4.4xlarge", MlM44xlarge);
        enumMap.put("ml.m4.10xlarge", MlM410xlarge);
        enumMap.put("ml.m4.16xlarge", MlM416xlarge);
        enumMap.put("ml.m5.large", MlM5Large);
        enumMap.put("ml.m5.xlarge", MlM5Xlarge);
        enumMap.put("ml.m5.2xlarge", MlM52xlarge);
        enumMap.put("ml.m5.4xlarge", MlM54xlarge);
        enumMap.put("ml.m5.12xlarge", MlM512xlarge);
        enumMap.put("ml.m5.24xlarge", MlM524xlarge);
        enumMap.put("ml.m5d.large", MlM5dLarge);
        enumMap.put("ml.m5d.xlarge", MlM5dXlarge);
        enumMap.put("ml.m5d.2xlarge", MlM5d2xlarge);
        enumMap.put("ml.m5d.4xlarge", MlM5d4xlarge);
        enumMap.put("ml.m5d.12xlarge", MlM5d12xlarge);
        enumMap.put("ml.m5d.24xlarge", MlM5d24xlarge);
        enumMap.put("ml.c4.large", MlC4Large);
        enumMap.put("ml.c4.xlarge", MlC4Xlarge);
        enumMap.put("ml.c4.2xlarge", MlC42xlarge);
        enumMap.put("ml.c4.4xlarge", MlC44xlarge);
        enumMap.put("ml.c4.8xlarge", MlC48xlarge);
        enumMap.put("ml.p2.xlarge", MlP2Xlarge);
        enumMap.put("ml.p2.8xlarge", MlP28xlarge);
        enumMap.put("ml.p2.16xlarge", MlP216xlarge);
        enumMap.put("ml.p3.2xlarge", MlP32xlarge);
        enumMap.put("ml.p3.8xlarge", MlP38xlarge);
        enumMap.put("ml.p3.16xlarge", MlP316xlarge);
        enumMap.put("ml.c5.large", MlC5Large);
        enumMap.put("ml.c5.xlarge", MlC5Xlarge);
        enumMap.put("ml.c5.2xlarge", MlC52xlarge);
        enumMap.put("ml.c5.4xlarge", MlC54xlarge);
        enumMap.put("ml.c5.9xlarge", MlC59xlarge);
        enumMap.put("ml.c5.18xlarge", MlC518xlarge);
        enumMap.put("ml.c5d.large", MlC5dLarge);
        enumMap.put("ml.c5d.xlarge", MlC5dXlarge);
        enumMap.put("ml.c5d.2xlarge", MlC5d2xlarge);
        enumMap.put("ml.c5d.4xlarge", MlC5d4xlarge);
        enumMap.put("ml.c5d.9xlarge", MlC5d9xlarge);
        enumMap.put("ml.c5d.18xlarge", MlC5d18xlarge);
        enumMap.put("ml.g4dn.xlarge", MlG4dnXlarge);
        enumMap.put("ml.g4dn.2xlarge", MlG4dn2xlarge);
        enumMap.put("ml.g4dn.4xlarge", MlG4dn4xlarge);
        enumMap.put("ml.g4dn.8xlarge", MlG4dn8xlarge);
        enumMap.put("ml.g4dn.12xlarge", MlG4dn12xlarge);
        enumMap.put("ml.g4dn.16xlarge", MlG4dn16xlarge);
        enumMap.put("ml.r5.large", MlR5Large);
        enumMap.put("ml.r5.xlarge", MlR5Xlarge);
        enumMap.put("ml.r5.2xlarge", MlR52xlarge);
        enumMap.put("ml.r5.4xlarge", MlR54xlarge);
        enumMap.put("ml.r5.12xlarge", MlR512xlarge);
        enumMap.put("ml.r5.24xlarge", MlR524xlarge);
        enumMap.put("ml.r5d.large", MlR5dLarge);
        enumMap.put("ml.r5d.xlarge", MlR5dXlarge);
        enumMap.put("ml.r5d.2xlarge", MlR5d2xlarge);
        enumMap.put("ml.r5d.4xlarge", MlR5d4xlarge);
        enumMap.put("ml.r5d.12xlarge", MlR5d12xlarge);
        enumMap.put("ml.r5d.24xlarge", MlR5d24xlarge);
        enumMap.put("ml.inf1.xlarge", MlInf1Xlarge);
        enumMap.put("ml.inf1.2xlarge", MlInf12xlarge);
        enumMap.put("ml.inf1.6xlarge", MlInf16xlarge);
        enumMap.put("ml.inf1.24xlarge", MlInf124xlarge);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProductionVariantInstanceType corresponding to the value
     */
    public static ProductionVariantInstanceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
