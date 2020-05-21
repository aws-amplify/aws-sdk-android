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

package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Requests Amazon S3 to encode the object keys in the response and specifies
 * the encoding method to use. An object key may contain any Unicode character;
 * however, XML 1.0 parser cannot parse some characters, such as characters with
 * an ASCII value from 0 to 10. For characters that are not supported in XML
 * 1.0, you can add this parameter to request that Amazon S3 encode the keys in
 * the response.
 * </p>
 */
public enum EncodingType {

    Url("url");

    private String value;

    private EncodingType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EncodingType> enumMap;
    static {
        enumMap = new HashMap<String, EncodingType>();
        enumMap.put("url", Url);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EncodingType corresponding to the value
     */
    public static EncodingType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
