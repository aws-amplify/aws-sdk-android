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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SkewedInfo
 */
class SkewedInfoJsonMarshaller {

    public void marshall(SkewedInfo skewedInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (skewedInfo.getSkewedColumnNames() != null) {
            java.util.List<String> skewedColumnNames = skewedInfo.getSkewedColumnNames();
            jsonWriter.name("SkewedColumnNames");
            jsonWriter.beginArray();
            for (String skewedColumnNamesItem : skewedColumnNames) {
                if (skewedColumnNamesItem != null) {
                    jsonWriter.value(skewedColumnNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skewedInfo.getSkewedColumnValues() != null) {
            java.util.List<String> skewedColumnValues = skewedInfo.getSkewedColumnValues();
            jsonWriter.name("SkewedColumnValues");
            jsonWriter.beginArray();
            for (String skewedColumnValuesItem : skewedColumnValues) {
                if (skewedColumnValuesItem != null) {
                    jsonWriter.value(skewedColumnValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skewedInfo.getSkewedColumnValueLocationMaps() != null) {
            java.util.Map<String, String> skewedColumnValueLocationMaps = skewedInfo
                    .getSkewedColumnValueLocationMaps();
            jsonWriter.name("SkewedColumnValueLocationMaps");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> skewedColumnValueLocationMapsEntry : skewedColumnValueLocationMaps
                    .entrySet()) {
                String skewedColumnValueLocationMapsValue = skewedColumnValueLocationMapsEntry
                        .getValue();
                if (skewedColumnValueLocationMapsValue != null) {
                    jsonWriter.name(skewedColumnValueLocationMapsEntry.getKey());
                    jsonWriter.value(skewedColumnValueLocationMapsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static SkewedInfoJsonMarshaller instance;

    public static SkewedInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkewedInfoJsonMarshaller();
        return instance;
    }
}
