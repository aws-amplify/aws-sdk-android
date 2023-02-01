/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LocationTimestamp
 */
class LocationTimestampJsonMarshaller {

    public void marshall(LocationTimestamp locationTimestamp, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (locationTimestamp.getValue() != null) {
            String value = locationTimestamp.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (locationTimestamp.getUnit() != null) {
            String unit = locationTimestamp.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static LocationTimestampJsonMarshaller instance;

    public static LocationTimestampJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocationTimestampJsonMarshaller();
        return instance;
    }
}
