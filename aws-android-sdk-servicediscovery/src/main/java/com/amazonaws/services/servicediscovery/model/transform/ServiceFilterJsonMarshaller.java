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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceFilter
 */
class ServiceFilterJsonMarshaller {

    public void marshall(ServiceFilter serviceFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceFilter.getName() != null) {
            String name = serviceFilter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (serviceFilter.getValues() != null) {
            java.util.List<String> values = serviceFilter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (serviceFilter.getCondition() != null) {
            String condition = serviceFilter.getCondition();
            jsonWriter.name("Condition");
            jsonWriter.value(condition);
        }
        jsonWriter.endObject();
    }

    private static ServiceFilterJsonMarshaller instance;

    public static ServiceFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceFilterJsonMarshaller();
        return instance;
    }
}
