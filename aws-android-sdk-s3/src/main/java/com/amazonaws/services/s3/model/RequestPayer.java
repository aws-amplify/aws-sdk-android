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
 * Confirms that the requester knows that they will be charged for the request.
 * Bucket owners need not specify this parameter in their requests. For
 * information about downloading objects from requester pays buckets, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
 * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
 * Developer Guide</i>.
 * </p>
 */
public enum RequestPayer {

    Requester("requester");

    private String value;

    private RequestPayer(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, RequestPayer> enumMap;
    static {
        enumMap = new HashMap<String, RequestPayer>();
        enumMap.put("requester", Requester);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return RequestPayer corresponding to the value
     */
    public static RequestPayer fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
