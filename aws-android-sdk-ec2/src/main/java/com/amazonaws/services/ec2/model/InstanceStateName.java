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
 * Instance State Name
 */
public enum InstanceStateName {
    
    Pending("pending"),
    Running("running"),
    ShuttingDown("shutting-down"),
    Terminated("terminated"),
    Stopping("stopping"),
    Stopped("stopped");

    private String value;

    private InstanceStateName(String value) {
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
     * @return InstanceStateName corresponding to the value
     */
    public static InstanceStateName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("pending".equals(value)) {
            return InstanceStateName.Pending;
        } else if ("running".equals(value)) {
            return InstanceStateName.Running;
        } else if ("shutting-down".equals(value)) {
            return InstanceStateName.ShuttingDown;
        } else if ("terminated".equals(value)) {
            return InstanceStateName.Terminated;
        } else if ("stopping".equals(value)) {
            return InstanceStateName.Stopping;
        } else if ("stopped".equals(value)) {
            return InstanceStateName.Stopped;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    