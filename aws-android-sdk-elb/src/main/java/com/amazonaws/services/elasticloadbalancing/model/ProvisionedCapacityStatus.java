/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Provisioned Capacity Status
 */
public enum ProvisionedCapacityStatus {
    
    Disabled("disabled"),
    Pending("pending"),
    Provisioned("provisioned"),
    PreWarmed("pre-warmed");

    private String value;

    private ProvisionedCapacityStatus(String value) {
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
     * @return ProvisionedCapacityStatus corresponding to the value
     */
    public static ProvisionedCapacityStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("disabled".equals(value)) {
            return ProvisionedCapacityStatus.Disabled;
        } else if ("pending".equals(value)) {
            return ProvisionedCapacityStatus.Pending;
        } else if ("provisioned".equals(value)) {
            return ProvisionedCapacityStatus.Provisioned;
        } else if ("pre-warmed".equals(value)) {
            return ProvisionedCapacityStatus.PreWarmed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    