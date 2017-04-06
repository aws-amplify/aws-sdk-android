/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Nat Gateway State
 */
public enum NatGatewayState {
    
    Pending("pending"),
    Failed("failed"),
    Available("available"),
    Deleting("deleting"),
    Deleted("deleted");

    private String value;

    private NatGatewayState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return NatGatewayState corresponding to the value
     */
    public static NatGatewayState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("pending".equals(value)) {
            return NatGatewayState.Pending;
        } else if ("failed".equals(value)) {
            return NatGatewayState.Failed;
        } else if ("available".equals(value)) {
            return NatGatewayState.Available;
        } else if ("deleting".equals(value)) {
            return NatGatewayState.Deleting;
        } else if ("deleted".equals(value)) {
            return NatGatewayState.Deleted;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    