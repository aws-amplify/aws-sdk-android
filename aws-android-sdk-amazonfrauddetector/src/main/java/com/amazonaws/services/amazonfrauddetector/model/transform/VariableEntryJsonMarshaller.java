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
 * JSON marshaller for POJO VariableEntry
 */
class VariableEntryJsonMarshaller {

    public void marshall(VariableEntry variableEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (variableEntry.getName() != null) {
            String name = variableEntry.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (variableEntry.getDataType() != null) {
            String dataType = variableEntry.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (variableEntry.getDataSource() != null) {
            String dataSource = variableEntry.getDataSource();
            jsonWriter.name("dataSource");
            jsonWriter.value(dataSource);
        }
        if (variableEntry.getDefaultValue() != null) {
            String defaultValue = variableEntry.getDefaultValue();
            jsonWriter.name("defaultValue");
            jsonWriter.value(defaultValue);
        }
        if (variableEntry.getDescription() != null) {
            String description = variableEntry.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (variableEntry.getVariableType() != null) {
            String variableType = variableEntry.getVariableType();
            jsonWriter.name("variableType");
            jsonWriter.value(variableType);
        }
        jsonWriter.endObject();
    }

    private static VariableEntryJsonMarshaller instance;

    public static VariableEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VariableEntryJsonMarshaller();
        return instance;
    }
}
