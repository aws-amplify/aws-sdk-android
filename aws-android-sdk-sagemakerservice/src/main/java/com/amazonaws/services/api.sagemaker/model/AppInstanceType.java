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

package com.amazonaws.services.api.sagemaker.model;

import java.util.HashMap;
import java.util.Map;

/**
 * App Instance Type
 */
public enum AppInstanceType {

    System("system"),
    MlT3Micro("ml.t3.micro"),
    MlT3Small("ml.t3.small"),
    MlT3Medium("ml.t3.medium"),
    MlT3Large("ml.t3.large"),
    MlT3Xlarge("ml.t3.xlarge"),
    MlT32xlarge("ml.t3.2xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM58xlarge("ml.m5.8xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM516xlarge("ml.m5.16xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlC5Large("ml.c5.large"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC512xlarge("ml.c5.12xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC524xlarge("ml.c5.24xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlP38xlarge("ml.p3.8xlarge"),
    MlP316xlarge("ml.p3.16xlarge"),
    MlG4dnXlarge("ml.g4dn.xlarge"),
    MlG4dn2xlarge("ml.g4dn.2xlarge"),
    MlG4dn4xlarge("ml.g4dn.4xlarge"),
    MlG4dn8xlarge("ml.g4dn.8xlarge"),
    MlG4dn12xlarge("ml.g4dn.12xlarge"),
    MlG4dn16xlarge("ml.g4dn.16xlarge");

    private String value;

    private AppInstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AppInstanceType> enumMap;
    static {
        enumMap = new HashMap<String, AppInstanceType>();
        enumMap.put("system", System);
        enumMap.put("ml.t3.micro", MlT3Micro);
        enumMap.put("ml.t3.small", MlT3Small);
        enumMap.put("ml.t3.medium", MlT3Medium);
        enumMap.put("ml.t3.large", MlT3Large);
        enumMap.put("ml.t3.xlarge", MlT3Xlarge);
        enumMap.put("ml.t3.2xlarge", MlT32xlarge);
        enumMap.put("ml.m5.large", MlM5Large);
        enumMap.put("ml.m5.xlarge", MlM5Xlarge);
        enumMap.put("ml.m5.2xlarge", MlM52xlarge);
        enumMap.put("ml.m5.4xlarge", MlM54xlarge);
        enumMap.put("ml.m5.8xlarge", MlM58xlarge);
        enumMap.put("ml.m5.12xlarge", MlM512xlarge);
        enumMap.put("ml.m5.16xlarge", MlM516xlarge);
        enumMap.put("ml.m5.24xlarge", MlM524xlarge);
        enumMap.put("ml.c5.large", MlC5Large);
        enumMap.put("ml.c5.xlarge", MlC5Xlarge);
        enumMap.put("ml.c5.2xlarge", MlC52xlarge);
        enumMap.put("ml.c5.4xlarge", MlC54xlarge);
        enumMap.put("ml.c5.9xlarge", MlC59xlarge);
        enumMap.put("ml.c5.12xlarge", MlC512xlarge);
        enumMap.put("ml.c5.18xlarge", MlC518xlarge);
        enumMap.put("ml.c5.24xlarge", MlC524xlarge);
        enumMap.put("ml.p3.2xlarge", MlP32xlarge);
        enumMap.put("ml.p3.8xlarge", MlP38xlarge);
        enumMap.put("ml.p3.16xlarge", MlP316xlarge);
        enumMap.put("ml.g4dn.xlarge", MlG4dnXlarge);
        enumMap.put("ml.g4dn.2xlarge", MlG4dn2xlarge);
        enumMap.put("ml.g4dn.4xlarge", MlG4dn4xlarge);
        enumMap.put("ml.g4dn.8xlarge", MlG4dn8xlarge);
        enumMap.put("ml.g4dn.12xlarge", MlG4dn12xlarge);
        enumMap.put("ml.g4dn.16xlarge", MlG4dn16xlarge);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AppInstanceType corresponding to the value
     */
    public static AppInstanceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
