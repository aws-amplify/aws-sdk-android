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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryAggregator
 */
class InventoryAggregatorJsonMarshaller {

    public void marshall(InventoryAggregator inventoryAggregator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inventoryAggregator.getExpression() != null) {
            String expression = inventoryAggregator.getExpression();
            jsonWriter.name("Expression");
            jsonWriter.value(expression);
        }
        if (inventoryAggregator.getAggregators() != null) {
            java.util.List<InventoryAggregator> aggregators = inventoryAggregator.getAggregators();
            jsonWriter.name("Aggregators");
            jsonWriter.beginArray();
            for (InventoryAggregator aggregatorsItem : aggregators) {
                if (aggregatorsItem != null) {
                    InventoryAggregatorJsonMarshaller.getInstance().marshall(aggregatorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (inventoryAggregator.getGroups() != null) {
            java.util.List<InventoryGroup> groups = inventoryAggregator.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (InventoryGroup groupsItem : groups) {
                if (groupsItem != null) {
                    InventoryGroupJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InventoryAggregatorJsonMarshaller instance;

    public static InventoryAggregatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryAggregatorJsonMarshaller();
        return instance;
    }
}
