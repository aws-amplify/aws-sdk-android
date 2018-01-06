/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Batch State
 */
public enum BatchState {
    
    Submitted("submitted"),
    Active("active"),
    Cancelled("cancelled"),
    Failed("failed"),
    Cancelled_running("cancelled_running"),
    Cancelled_terminating("cancelled_terminating"),
    Modifying("modifying");

    private String value;

    private BatchState(String value) {
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
     * @return BatchState corresponding to the value
     */
    public static BatchState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("submitted".equals(value)) {
            return BatchState.Submitted;
        } else if ("active".equals(value)) {
            return BatchState.Active;
        } else if ("cancelled".equals(value)) {
            return BatchState.Cancelled;
        } else if ("failed".equals(value)) {
            return BatchState.Failed;
        } else if ("cancelled_running".equals(value)) {
            return BatchState.Cancelled_running;
        } else if ("cancelled_terminating".equals(value)) {
            return BatchState.Cancelled_terminating;
        } else if ("modifying".equals(value)) {
            return BatchState.Modifying;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    