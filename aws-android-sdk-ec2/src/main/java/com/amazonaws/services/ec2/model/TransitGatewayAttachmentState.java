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

package com.amazonaws.services.ec2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Transit Gateway Attachment State
 */
public enum TransitGatewayAttachmentState {

    Initiating("initiating"),
    PendingAcceptance("pendingAcceptance"),
    RollingBack("rollingBack"),
    Pending("pending"),
    Available("available"),
    Modifying("modifying"),
    Deleting("deleting"),
    Deleted("deleted"),
    Failed("failed"),
    Rejected("rejected"),
    Rejecting("rejecting"),
    Failing("failing");

    private String value;

    private TransitGatewayAttachmentState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TransitGatewayAttachmentState> enumMap;
    static {
        enumMap = new HashMap<String, TransitGatewayAttachmentState>();
        enumMap.put("initiating", Initiating);
        enumMap.put("pendingAcceptance", PendingAcceptance);
        enumMap.put("rollingBack", RollingBack);
        enumMap.put("pending", Pending);
        enumMap.put("available", Available);
        enumMap.put("modifying", Modifying);
        enumMap.put("deleting", Deleting);
        enumMap.put("deleted", Deleted);
        enumMap.put("failed", Failed);
        enumMap.put("rejected", Rejected);
        enumMap.put("rejecting", Rejecting);
        enumMap.put("failing", Failing);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TransitGatewayAttachmentState corresponding to the value
     */
    public static TransitGatewayAttachmentState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
