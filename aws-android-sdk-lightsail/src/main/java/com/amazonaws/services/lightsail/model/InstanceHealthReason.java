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
 * Instance Health Reason
 */
public enum InstanceHealthReason {

    LbRegistrationInProgress("Lb.RegistrationInProgress"),
    LbInitialHealthChecking("Lb.InitialHealthChecking"),
    LbInternalError("Lb.InternalError"),
    InstanceResponseCodeMismatch("Instance.ResponseCodeMismatch"),
    InstanceTimeout("Instance.Timeout"),
    InstanceFailedHealthChecks("Instance.FailedHealthChecks"),
    InstanceNotRegistered("Instance.NotRegistered"),
    InstanceNotInUse("Instance.NotInUse"),
    InstanceDeregistrationInProgress("Instance.DeregistrationInProgress"),
    InstanceInvalidState("Instance.InvalidState"),
    InstanceIpUnusable("Instance.IpUnusable");

    private String value;

    private InstanceHealthReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceHealthReason> enumMap;
    static {
        enumMap = new HashMap<String, InstanceHealthReason>();
        enumMap.put("Lb.RegistrationInProgress", LbRegistrationInProgress);
        enumMap.put("Lb.InitialHealthChecking", LbInitialHealthChecking);
        enumMap.put("Lb.InternalError", LbInternalError);
        enumMap.put("Instance.ResponseCodeMismatch", InstanceResponseCodeMismatch);
        enumMap.put("Instance.Timeout", InstanceTimeout);
        enumMap.put("Instance.FailedHealthChecks", InstanceFailedHealthChecks);
        enumMap.put("Instance.NotRegistered", InstanceNotRegistered);
        enumMap.put("Instance.NotInUse", InstanceNotInUse);
        enumMap.put("Instance.DeregistrationInProgress", InstanceDeregistrationInProgress);
        enumMap.put("Instance.InvalidState", InstanceInvalidState);
        enumMap.put("Instance.IpUnusable", InstanceIpUnusable);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceHealthReason corresponding to the value
     */
    public static InstanceHealthReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
