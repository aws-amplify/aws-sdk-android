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
 * Load Balancer Tls Certificate Revocation Reason
 */
public enum LoadBalancerTlsCertificateRevocationReason {

    UNSPECIFIED("UNSPECIFIED"),
    KEY_COMPROMISE("KEY_COMPROMISE"),
    CA_COMPROMISE("CA_COMPROMISE"),
    AFFILIATION_CHANGED("AFFILIATION_CHANGED"),
    SUPERCEDED("SUPERCEDED"),
    CESSATION_OF_OPERATION("CESSATION_OF_OPERATION"),
    CERTIFICATE_HOLD("CERTIFICATE_HOLD"),
    REMOVE_FROM_CRL("REMOVE_FROM_CRL"),
    PRIVILEGE_WITHDRAWN("PRIVILEGE_WITHDRAWN"),
    A_A_COMPROMISE("A_A_COMPROMISE");

    private String value;

    private LoadBalancerTlsCertificateRevocationReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LoadBalancerTlsCertificateRevocationReason> enumMap;
    static {
        enumMap = new HashMap<String, LoadBalancerTlsCertificateRevocationReason>();
        enumMap.put("UNSPECIFIED", UNSPECIFIED);
        enumMap.put("KEY_COMPROMISE", KEY_COMPROMISE);
        enumMap.put("CA_COMPROMISE", CA_COMPROMISE);
        enumMap.put("AFFILIATION_CHANGED", AFFILIATION_CHANGED);
        enumMap.put("SUPERCEDED", SUPERCEDED);
        enumMap.put("CESSATION_OF_OPERATION", CESSATION_OF_OPERATION);
        enumMap.put("CERTIFICATE_HOLD", CERTIFICATE_HOLD);
        enumMap.put("REMOVE_FROM_CRL", REMOVE_FROM_CRL);
        enumMap.put("PRIVILEGE_WITHDRAWN", PRIVILEGE_WITHDRAWN);
        enumMap.put("A_A_COMPROMISE", A_A_COMPROMISE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LoadBalancerTlsCertificateRevocationReason corresponding to the
     *         value
     */
    public static LoadBalancerTlsCertificateRevocationReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
