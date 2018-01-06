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
 * Cancel Batch Error Code
 */
public enum CancelBatchErrorCode {
    
    FleetRequestIdDoesNotExist("fleetRequestIdDoesNotExist"),
    FleetRequestIdMalformed("fleetRequestIdMalformed"),
    FleetRequestNotInCancellableState("fleetRequestNotInCancellableState"),
    UnexpectedError("unexpectedError");

    private String value;

    private CancelBatchErrorCode(String value) {
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
     * @return CancelBatchErrorCode corresponding to the value
     */
    public static CancelBatchErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("fleetRequestIdDoesNotExist".equals(value)) {
            return CancelBatchErrorCode.FleetRequestIdDoesNotExist;
        } else if ("fleetRequestIdMalformed".equals(value)) {
            return CancelBatchErrorCode.FleetRequestIdMalformed;
        } else if ("fleetRequestNotInCancellableState".equals(value)) {
            return CancelBatchErrorCode.FleetRequestNotInCancellableState;
        } else if ("unexpectedError".equals(value)) {
            return CancelBatchErrorCode.UnexpectedError;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    