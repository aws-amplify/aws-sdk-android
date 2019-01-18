/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ItemCollectionMetrics
 */
class ItemCollectionMetricsJsonMarshaller {

    public void marshall(ItemCollectionMetrics itemCollectionMetrics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (itemCollectionMetrics.getItemCollectionKey() != null) {
            java.util.Map<String, AttributeValue> itemCollectionKey = itemCollectionMetrics
                    .getItemCollectionKey();
            jsonWriter.name("ItemCollectionKey");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> itemCollectionKeyEntry : itemCollectionKey
                    .entrySet()) {
                AttributeValue itemCollectionKeyValue = itemCollectionKeyEntry.getValue();
                if (itemCollectionKeyValue != null) {
                    jsonWriter.name(itemCollectionKeyEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(itemCollectionKeyValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (itemCollectionMetrics.getSizeEstimateRangeGB() != null) {
            java.util.List<Double> sizeEstimateRangeGB = itemCollectionMetrics
                    .getSizeEstimateRangeGB();
            jsonWriter.name("SizeEstimateRangeGB");
            jsonWriter.beginArray();
            for (Double sizeEstimateRangeGBItem : sizeEstimateRangeGB) {
                if (sizeEstimateRangeGBItem != null) {
                    jsonWriter.value(sizeEstimateRangeGBItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ItemCollectionMetricsJsonMarshaller instance;

    public static ItemCollectionMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ItemCollectionMetricsJsonMarshaller();
        return instance;
    }
}
