/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Certificate Status
 */
public enum CertificateStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    REVOKED("REVOKED"),
    PENDING_TRANSFER("PENDING_TRANSFER"),
    REGISTER_INACTIVE("REGISTER_INACTIVE"),
    PENDING_ACTIVATION("PENDING_ACTIVATION");

    private String value;

    private CertificateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CertificateStatus> enumMap;
    static {
        enumMap = new HashMap<String, CertificateStatus>();
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("INACTIVE", INACTIVE);
        enumMap.put("REVOKED", REVOKED);
        enumMap.put("PENDING_TRANSFER", PENDING_TRANSFER);
        enumMap.put("REGISTER_INACTIVE", REGISTER_INACTIVE);
        enumMap.put("PENDING_ACTIVATION", PENDING_ACTIVATION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CertificateStatus corresponding to the value
     */
    public static CertificateStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
