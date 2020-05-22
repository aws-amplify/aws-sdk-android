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

package com.amazonaws.services.iotsitewise.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Batch Put Asset Property Value Error Code
 */
public enum BatchPutAssetPropertyValueErrorCode {

    ResourceNotFoundException("ResourceNotFoundException"),
    InvalidRequestException("InvalidRequestException"),
    InternalFailureException("InternalFailureException"),
    ServiceUnavailableException("ServiceUnavailableException"),
    ThrottlingException("ThrottlingException"),
    LimitExceededException("LimitExceededException"),
    ConflictingOperationException("ConflictingOperationException"),
    TimestampOutOfRangeException("TimestampOutOfRangeException"),
    AccessDeniedException("AccessDeniedException");

    private String value;

    private BatchPutAssetPropertyValueErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BatchPutAssetPropertyValueErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, BatchPutAssetPropertyValueErrorCode>();
        enumMap.put("ResourceNotFoundException", ResourceNotFoundException);
        enumMap.put("InvalidRequestException", InvalidRequestException);
        enumMap.put("InternalFailureException", InternalFailureException);
        enumMap.put("ServiceUnavailableException", ServiceUnavailableException);
        enumMap.put("ThrottlingException", ThrottlingException);
        enumMap.put("LimitExceededException", LimitExceededException);
        enumMap.put("ConflictingOperationException", ConflictingOperationException);
        enumMap.put("TimestampOutOfRangeException", TimestampOutOfRangeException);
        enumMap.put("AccessDeniedException", AccessDeniedException);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BatchPutAssetPropertyValueErrorCode corresponding to the value
     */
    public static BatchPutAssetPropertyValueErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
