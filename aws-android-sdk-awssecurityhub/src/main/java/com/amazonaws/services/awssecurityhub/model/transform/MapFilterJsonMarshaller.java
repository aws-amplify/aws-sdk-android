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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MapFilter
 */
class MapFilterJsonMarshaller {

    public void marshall(MapFilter mapFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mapFilter.getKey() != null) {
            String key = mapFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (mapFilter.getValue() != null) {
            String value = mapFilter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (mapFilter.getComparison() != null) {
            String comparison = mapFilter.getComparison();
            jsonWriter.name("Comparison");
            jsonWriter.value(comparison);
        }
        jsonWriter.endObject();
    }

    private static MapFilterJsonMarshaller instance;

    public static MapFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MapFilterJsonMarshaller();
        return instance;
    }
}
