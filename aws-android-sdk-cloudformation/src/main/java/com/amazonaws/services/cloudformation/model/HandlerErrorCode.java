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

package com.amazonaws.services.cloudformation.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler Error Code
 */
public enum HandlerErrorCode {

    NotUpdatable("NotUpdatable"),
    InvalidRequest("InvalidRequest"),
    AccessDenied("AccessDenied"),
    InvalidCredentials("InvalidCredentials"),
    AlreadyExists("AlreadyExists"),
    NotFound("NotFound"),
    ResourceConflict("ResourceConflict"),
    Throttling("Throttling"),
    ServiceLimitExceeded("ServiceLimitExceeded"),
    NotStabilized("NotStabilized"),
    GeneralServiceException("GeneralServiceException"),
    ServiceInternalError("ServiceInternalError"),
    NetworkFailure("NetworkFailure"),
    InternalFailure("InternalFailure");

    private String value;

    private HandlerErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HandlerErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, HandlerErrorCode>();
        enumMap.put("NotUpdatable", NotUpdatable);
        enumMap.put("InvalidRequest", InvalidRequest);
        enumMap.put("AccessDenied", AccessDenied);
        enumMap.put("InvalidCredentials", InvalidCredentials);
        enumMap.put("AlreadyExists", AlreadyExists);
        enumMap.put("NotFound", NotFound);
        enumMap.put("ResourceConflict", ResourceConflict);
        enumMap.put("Throttling", Throttling);
        enumMap.put("ServiceLimitExceeded", ServiceLimitExceeded);
        enumMap.put("NotStabilized", NotStabilized);
        enumMap.put("GeneralServiceException", GeneralServiceException);
        enumMap.put("ServiceInternalError", ServiceInternalError);
        enumMap.put("NetworkFailure", NetworkFailure);
        enumMap.put("InternalFailure", InternalFailure);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HandlerErrorCode corresponding to the value
     */
    public static HandlerErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
