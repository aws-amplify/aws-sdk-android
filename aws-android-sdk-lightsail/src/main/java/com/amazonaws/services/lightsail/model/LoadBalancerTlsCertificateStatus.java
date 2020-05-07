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

package com.amazonaws.services.lightsail.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Load Balancer Tls Certificate Status
 */
public enum LoadBalancerTlsCertificateStatus {

    PENDING_VALIDATION("PENDING_VALIDATION"),
    ISSUED("ISSUED"),
    INACTIVE("INACTIVE"),
    EXPIRED("EXPIRED"),
    VALIDATION_TIMED_OUT("VALIDATION_TIMED_OUT"),
    REVOKED("REVOKED"),
    FAILED("FAILED");

    private String value;

    private LoadBalancerTlsCertificateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LoadBalancerTlsCertificateStatus> enumMap;
    static {
        enumMap = new HashMap<String, LoadBalancerTlsCertificateStatus>();
        enumMap.put("PENDING_VALIDATION", PENDING_VALIDATION);
        enumMap.put("ISSUED", ISSUED);
        enumMap.put("INACTIVE", INACTIVE);
        enumMap.put("EXPIRED", EXPIRED);
        enumMap.put("VALIDATION_TIMED_OUT", VALIDATION_TIMED_OUT);
        enumMap.put("REVOKED", REVOKED);
        enumMap.put("FAILED", FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LoadBalancerTlsCertificateStatus corresponding to the value
     */
    public static LoadBalancerTlsCertificateStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
