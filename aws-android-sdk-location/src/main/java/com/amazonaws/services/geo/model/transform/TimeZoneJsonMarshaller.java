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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimeZone
 */
class TimeZoneJsonMarshaller {

    public void marshall(TimeZone timeZone, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timeZone.getName() != null) {
            String name = timeZone.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (timeZone.getOffset() != null) {
            Integer offset = timeZone.getOffset();
            jsonWriter.name("Offset");
            jsonWriter.value(offset);
        }
        jsonWriter.endObject();
    }

    private static TimeZoneJsonMarshaller instance;

    public static TimeZoneJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimeZoneJsonMarshaller();
        return instance;
    }
}
