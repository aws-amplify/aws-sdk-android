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

package com.amazonaws.services.awstransferfamily.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Returns information related to the type of user authentication that is in use
 * for a file transfer protocol-enabled server's users. For
 * <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public
 * keys are stored with a user on the server instance. For
 * <code>API_GATEWAY</code> authentication, your custom authentication method is
 * implemented by using an API call. The server can have only one method of
 * authentication.
 * </p>
 */
public enum IdentityProviderType {

    SERVICE_MANAGED("SERVICE_MANAGED"),
    API_GATEWAY("API_GATEWAY");

    private String value;

    private IdentityProviderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, IdentityProviderType> enumMap;
    static {
        enumMap = new HashMap<String, IdentityProviderType>();
        enumMap.put("SERVICE_MANAGED", SERVICE_MANAGED);
        enumMap.put("API_GATEWAY", API_GATEWAY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return IdentityProviderType corresponding to the value
     */
    public static IdentityProviderType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
