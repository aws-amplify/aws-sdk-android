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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NamespaceFilter
 */
class NamespaceFilterJsonMarshaller {

    public void marshall(NamespaceFilter namespaceFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (namespaceFilter.getName() != null) {
            String name = namespaceFilter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (namespaceFilter.getValues() != null) {
            java.util.List<String> values = namespaceFilter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (namespaceFilter.getCondition() != null) {
            String condition = namespaceFilter.getCondition();
            jsonWriter.name("Condition");
            jsonWriter.value(condition);
        }
        jsonWriter.endObject();
    }

    private static NamespaceFilterJsonMarshaller instance;

    public static NamespaceFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceFilterJsonMarshaller();
        return instance;
    }
}
