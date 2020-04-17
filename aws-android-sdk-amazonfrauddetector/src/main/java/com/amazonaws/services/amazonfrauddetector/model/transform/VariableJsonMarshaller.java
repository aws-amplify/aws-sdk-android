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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Variable
 */
class VariableJsonMarshaller {

    public void marshall(Variable variable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (variable.getName() != null) {
            String name = variable.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (variable.getDataType() != null) {
            String dataType = variable.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (variable.getDataSource() != null) {
            String dataSource = variable.getDataSource();
            jsonWriter.name("dataSource");
            jsonWriter.value(dataSource);
        }
        if (variable.getDefaultValue() != null) {
            String defaultValue = variable.getDefaultValue();
            jsonWriter.name("defaultValue");
            jsonWriter.value(defaultValue);
        }
        if (variable.getDescription() != null) {
            String description = variable.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (variable.getVariableType() != null) {
            String variableType = variable.getVariableType();
            jsonWriter.name("variableType");
            jsonWriter.value(variableType);
        }
        if (variable.getLastUpdatedTime() != null) {
            String lastUpdatedTime = variable.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (variable.getCreatedTime() != null) {
            String createdTime = variable.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static VariableJsonMarshaller instance;

    public static VariableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VariableJsonMarshaller();
        return instance;
    }
}
