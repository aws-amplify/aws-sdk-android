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
 * JSON marshaller for POJO CurrentMetricResult
 */
class CurrentMetricResultJsonMarshaller {

    public void marshall(CurrentMetricResult currentMetricResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (currentMetricResult.getDimensions() != null) {
            Dimensions dimensions = currentMetricResult.getDimensions();
            jsonWriter.name("Dimensions");
            DimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (currentMetricResult.getCollections() != null) {
            java.util.List<CurrentMetricData> collections = currentMetricResult.getCollections();
            jsonWriter.name("Collections");
            jsonWriter.beginArray();
            for (CurrentMetricData collectionsItem : collections) {
                if (collectionsItem != null) {
                    CurrentMetricDataJsonMarshaller.getInstance().marshall(collectionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CurrentMetricResultJsonMarshaller instance;

    public static CurrentMetricResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CurrentMetricResultJsonMarshaller();
        return instance;
    }
}
