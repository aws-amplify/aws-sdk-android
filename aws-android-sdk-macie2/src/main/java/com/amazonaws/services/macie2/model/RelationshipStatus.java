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

package com.amazonaws.services.macie2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The current status of the relationship between an account and an associated
 * Amazon Macie master account (<i>inviter account</i>). Possible values are:
 * </p>
 */
public enum RelationshipStatus {

    Enabled("Enabled"),
    Paused("Paused"),
    Invited("Invited"),
    Created("Created"),
    Removed("Removed"),
    Resigned("Resigned"),
    EmailVerificationInProgress("EmailVerificationInProgress"),
    EmailVerificationFailed("EmailVerificationFailed");

    private String value;

    private RelationshipStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, RelationshipStatus> enumMap;
    static {
        enumMap = new HashMap<String, RelationshipStatus>();
        enumMap.put("Enabled", Enabled);
        enumMap.put("Paused", Paused);
        enumMap.put("Invited", Invited);
        enumMap.put("Created", Created);
        enumMap.put("Removed", Removed);
        enumMap.put("Resigned", Resigned);
        enumMap.put("EmailVerificationInProgress", EmailVerificationInProgress);
        enumMap.put("EmailVerificationFailed", EmailVerificationFailed);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return RelationshipStatus corresponding to the value
     */
    public static RelationshipStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
