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
 * Image State
 */
public enum ImageState {
    
    Pending("pending"),
    Available("available"),
    Invalid("invalid"),
    Deregistered("deregistered"),
    Transient("transient"),
    Failed("failed"),
    Error("error");

    private String value;

    private ImageState(String value) {
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
     * @return ImageState corresponding to the value
     */
    public static ImageState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("pending".equals(value)) {
            return ImageState.Pending;
        } else if ("available".equals(value)) {
            return ImageState.Available;
        } else if ("invalid".equals(value)) {
            return ImageState.Invalid;
        } else if ("deregistered".equals(value)) {
            return ImageState.Deregistered;
        } else if ("transient".equals(value)) {
            return ImageState.Transient;
        } else if ("failed".equals(value)) {
            return ImageState.Failed;
        } else if ("error".equals(value)) {
            return ImageState.Error;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    