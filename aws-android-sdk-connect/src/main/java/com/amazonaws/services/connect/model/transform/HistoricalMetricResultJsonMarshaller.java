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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HistoricalMetricResult
 */
class HistoricalMetricResultJsonMarshaller {

    public void marshall(HistoricalMetricResult historicalMetricResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (historicalMetricResult.getDimensions() != null) {
            Dimensions dimensions = historicalMetricResult.getDimensions();
            jsonWriter.name("Dimensions");
            DimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (historicalMetricResult.getCollections() != null) {
            java.util.List<HistoricalMetricData> collections = historicalMetricResult
                    .getCollections();
            jsonWriter.name("Collections");
            jsonWriter.beginArray();
            for (HistoricalMetricData collectionsItem : collections) {
                if (collectionsItem != null) {
                    HistoricalMetricDataJsonMarshaller.getInstance().marshall(collectionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HistoricalMetricResultJsonMarshaller instance;

    public static HistoricalMetricResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HistoricalMetricResultJsonMarshaller();
        return instance;
    }
}
