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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricResultV2
 */
class MetricResultV2JsonMarshaller {

    public void marshall(MetricResultV2 metricResultV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricResultV2.getDimensions() != null) {
            java.util.Map<String, String> dimensions = metricResultV2.getDimensions();
            jsonWriter.name("Dimensions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> dimensionsEntry : dimensions.entrySet()) {
                String dimensionsValue = dimensionsEntry.getValue();
                if (dimensionsValue != null) {
                    jsonWriter.name(dimensionsEntry.getKey());
                    jsonWriter.value(dimensionsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (metricResultV2.getCollections() != null) {
            java.util.List<MetricDataV2> collections = metricResultV2.getCollections();
            jsonWriter.name("Collections");
            jsonWriter.beginArray();
            for (MetricDataV2 collectionsItem : collections) {
                if (collectionsItem != null) {
                    MetricDataV2JsonMarshaller.getInstance().marshall(collectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MetricResultV2JsonMarshaller instance;

    public static MetricResultV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricResultV2JsonMarshaller();
        return instance;
    }
}
