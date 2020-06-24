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

package com.amazonaws.services.honeycode.model.transform;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataItem
 */
class DataItemJsonMarshaller {

    public void marshall(DataItem dataItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataItem.getOverrideFormat() != null) {
            String overrideFormat = dataItem.getOverrideFormat();
            jsonWriter.name("overrideFormat");
            jsonWriter.value(overrideFormat);
        }
        if (dataItem.getRawValue() != null) {
            String rawValue = dataItem.getRawValue();
            jsonWriter.name("rawValue");
            jsonWriter.value(rawValue);
        }
        if (dataItem.getFormattedValue() != null) {
            String formattedValue = dataItem.getFormattedValue();
            jsonWriter.name("formattedValue");
            jsonWriter.value(formattedValue);
        }
        jsonWriter.endObject();
    }

    private static DataItemJsonMarshaller instance;

    public static DataItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataItemJsonMarshaller();
        return instance;
    }
}
