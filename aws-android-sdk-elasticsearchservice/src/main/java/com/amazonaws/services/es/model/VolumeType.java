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

package com.amazonaws.services.es.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The type of EBS volume, standard, gp2, or io1. See <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
 * target="_blank">Configuring EBS-based Storage</a>for more information.
 * </p>
 */
public enum VolumeType {

    Standard("standard"),
    Gp2("gp2"),
    Io1("io1");

    private String value;

    private VolumeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VolumeType> enumMap;
    static {
        enumMap = new HashMap<String, VolumeType>();
        enumMap.put("standard", Standard);
        enumMap.put("gp2", Gp2);
        enumMap.put("io1", Io1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VolumeType corresponding to the value
     */
    public static VolumeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
