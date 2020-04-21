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

package com.amazonaws.services.amazonroute53domains.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Operation Type
 */
public enum OperationType {

    REGISTER_DOMAIN("REGISTER_DOMAIN"),
    DELETE_DOMAIN("DELETE_DOMAIN"),
    TRANSFER_IN_DOMAIN("TRANSFER_IN_DOMAIN"),
    UPDATE_DOMAIN_CONTACT("UPDATE_DOMAIN_CONTACT"),
    UPDATE_NAMESERVER("UPDATE_NAMESERVER"),
    CHANGE_PRIVACY_PROTECTION("CHANGE_PRIVACY_PROTECTION"),
    DOMAIN_LOCK("DOMAIN_LOCK"),
    ENABLE_AUTORENEW("ENABLE_AUTORENEW"),
    DISABLE_AUTORENEW("DISABLE_AUTORENEW"),
    ADD_DNSSEC("ADD_DNSSEC"),
    REMOVE_DNSSEC("REMOVE_DNSSEC"),
    EXPIRE_DOMAIN("EXPIRE_DOMAIN"),
    TRANSFER_OUT_DOMAIN("TRANSFER_OUT_DOMAIN"),
    CHANGE_DOMAIN_OWNER("CHANGE_DOMAIN_OWNER"),
    RENEW_DOMAIN("RENEW_DOMAIN"),
    PUSH_DOMAIN("PUSH_DOMAIN"),
    INTERNAL_TRANSFER_OUT_DOMAIN("INTERNAL_TRANSFER_OUT_DOMAIN"),
    INTERNAL_TRANSFER_IN_DOMAIN("INTERNAL_TRANSFER_IN_DOMAIN");

    private String value;

    private OperationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OperationType> enumMap;
    static {
        enumMap = new HashMap<String, OperationType>();
        enumMap.put("REGISTER_DOMAIN", REGISTER_DOMAIN);
        enumMap.put("DELETE_DOMAIN", DELETE_DOMAIN);
        enumMap.put("TRANSFER_IN_DOMAIN", TRANSFER_IN_DOMAIN);
        enumMap.put("UPDATE_DOMAIN_CONTACT", UPDATE_DOMAIN_CONTACT);
        enumMap.put("UPDATE_NAMESERVER", UPDATE_NAMESERVER);
        enumMap.put("CHANGE_PRIVACY_PROTECTION", CHANGE_PRIVACY_PROTECTION);
        enumMap.put("DOMAIN_LOCK", DOMAIN_LOCK);
        enumMap.put("ENABLE_AUTORENEW", ENABLE_AUTORENEW);
        enumMap.put("DISABLE_AUTORENEW", DISABLE_AUTORENEW);
        enumMap.put("ADD_DNSSEC", ADD_DNSSEC);
        enumMap.put("REMOVE_DNSSEC", REMOVE_DNSSEC);
        enumMap.put("EXPIRE_DOMAIN", EXPIRE_DOMAIN);
        enumMap.put("TRANSFER_OUT_DOMAIN", TRANSFER_OUT_DOMAIN);
        enumMap.put("CHANGE_DOMAIN_OWNER", CHANGE_DOMAIN_OWNER);
        enumMap.put("RENEW_DOMAIN", RENEW_DOMAIN);
        enumMap.put("PUSH_DOMAIN", PUSH_DOMAIN);
        enumMap.put("INTERNAL_TRANSFER_OUT_DOMAIN", INTERNAL_TRANSFER_OUT_DOMAIN);
        enumMap.put("INTERNAL_TRANSFER_IN_DOMAIN", INTERNAL_TRANSFER_IN_DOMAIN);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return OperationType corresponding to the value
     */
    public static OperationType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
