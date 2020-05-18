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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CapacityProviderStrategyItem
 */
class CapacityProviderStrategyItemJsonMarshaller {

    public void marshall(CapacityProviderStrategyItem capacityProviderStrategyItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (capacityProviderStrategyItem.getCapacityProvider() != null) {
            String capacityProvider = capacityProviderStrategyItem.getCapacityProvider();
            jsonWriter.name("capacityProvider");
            jsonWriter.value(capacityProvider);
        }
        if (capacityProviderStrategyItem.getWeight() != null) {
            Integer weight = capacityProviderStrategyItem.getWeight();
            jsonWriter.name("weight");
            jsonWriter.value(weight);
        }
        if (capacityProviderStrategyItem.getBase() != null) {
            Integer base = capacityProviderStrategyItem.getBase();
            jsonWriter.name("base");
            jsonWriter.value(base);
        }
        jsonWriter.endObject();
    }

    private static CapacityProviderStrategyItemJsonMarshaller instance;

    public static CapacityProviderStrategyItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CapacityProviderStrategyItemJsonMarshaller();
        return instance;
    }
}
