/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Media Analysis Job Failure Code
 */
public enum MediaAnalysisJobFailureCode {

    INTERNAL_ERROR("INTERNAL_ERROR"),
    INVALID_S3_OBJECT("INVALID_S3_OBJECT"),
    INVALID_MANIFEST("INVALID_MANIFEST"),
    INVALID_OUTPUT_CONFIG("INVALID_OUTPUT_CONFIG"),
    INVALID_KMS_KEY("INVALID_KMS_KEY"),
    ACCESS_DENIED("ACCESS_DENIED"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    RESOURCE_NOT_READY("RESOURCE_NOT_READY"),
    THROTTLED("THROTTLED");

    private String value;

    private MediaAnalysisJobFailureCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MediaAnalysisJobFailureCode> enumMap;
    static {
        enumMap = new HashMap<String, MediaAnalysisJobFailureCode>();
        enumMap.put("INTERNAL_ERROR", INTERNAL_ERROR);
        enumMap.put("INVALID_S3_OBJECT", INVALID_S3_OBJECT);
        enumMap.put("INVALID_MANIFEST", INVALID_MANIFEST);
        enumMap.put("INVALID_OUTPUT_CONFIG", INVALID_OUTPUT_CONFIG);
        enumMap.put("INVALID_KMS_KEY", INVALID_KMS_KEY);
        enumMap.put("ACCESS_DENIED", ACCESS_DENIED);
        enumMap.put("RESOURCE_NOT_FOUND", RESOURCE_NOT_FOUND);
        enumMap.put("RESOURCE_NOT_READY", RESOURCE_NOT_READY);
        enumMap.put("THROTTLED", THROTTLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MediaAnalysisJobFailureCode corresponding to the value
     */
    public static MediaAnalysisJobFailureCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
