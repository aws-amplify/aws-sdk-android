/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Storage Type
 */
public enum StorageType {

    S3("S3"),
    KINESIS_VIDEO_STREAM("KINESIS_VIDEO_STREAM"),
    KINESIS_STREAM("KINESIS_STREAM"),
    KINESIS_FIREHOSE("KINESIS_FIREHOSE");

    private String value;

    private StorageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StorageType> enumMap;
    static {
        enumMap = new HashMap<String, StorageType>();
        enumMap.put("S3", S3);
        enumMap.put("KINESIS_VIDEO_STREAM", KINESIS_VIDEO_STREAM);
        enumMap.put("KINESIS_STREAM", KINESIS_STREAM);
        enumMap.put("KINESIS_FIREHOSE", KINESIS_FIREHOSE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StorageType corresponding to the value
     */
    public static StorageType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
