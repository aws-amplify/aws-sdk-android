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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventAggregate
 */
class EventAggregateJsonMarshaller {

    public void marshall(EventAggregate eventAggregate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventAggregate.getAggregateValue() != null) {
            String aggregateValue = eventAggregate.getAggregateValue();
            jsonWriter.name("aggregateValue");
            jsonWriter.value(aggregateValue);
        }
        if (eventAggregate.getCount() != null) {
            Integer count = eventAggregate.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        jsonWriter.endObject();
    }

    private static EventAggregateJsonMarshaller instance;

    public static EventAggregateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventAggregateJsonMarshaller();
        return instance;
    }
}
