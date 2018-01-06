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
 * Network Interface Attribute
 */
public enum NetworkInterfaceAttribute {
    
    Description("description"),
    GroupSet("groupSet"),
    SourceDestCheck("sourceDestCheck"),
    Attachment("attachment");

    private String value;

    private NetworkInterfaceAttribute(String value) {
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
     * @return NetworkInterfaceAttribute corresponding to the value
     */
    public static NetworkInterfaceAttribute fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("description".equals(value)) {
            return NetworkInterfaceAttribute.Description;
        } else if ("groupSet".equals(value)) {
            return NetworkInterfaceAttribute.GroupSet;
        } else if ("sourceDestCheck".equals(value)) {
            return NetworkInterfaceAttribute.SourceDestCheck;
        } else if ("attachment".equals(value)) {
            return NetworkInterfaceAttribute.Attachment;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    