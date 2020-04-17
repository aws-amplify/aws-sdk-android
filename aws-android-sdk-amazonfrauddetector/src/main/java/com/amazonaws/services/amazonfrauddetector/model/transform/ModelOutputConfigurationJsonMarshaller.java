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
 * JSON marshaller for POJO ModelOutputConfiguration
 */
class ModelOutputConfigurationJsonMarshaller {

    public void marshall(ModelOutputConfiguration modelOutputConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelOutputConfiguration.getFormat() != null) {
            String format = modelOutputConfiguration.getFormat();
            jsonWriter.name("format");
            jsonWriter.value(format);
        }
        if (modelOutputConfiguration.getJsonKeyToVariableMap() != null) {
            java.util.Map<String, String> jsonKeyToVariableMap = modelOutputConfiguration
                    .getJsonKeyToVariableMap();
            jsonWriter.name("jsonKeyToVariableMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> jsonKeyToVariableMapEntry : jsonKeyToVariableMap
                    .entrySet()) {
                String jsonKeyToVariableMapValue = jsonKeyToVariableMapEntry.getValue();
                if (jsonKeyToVariableMapValue != null) {
                    jsonWriter.name(jsonKeyToVariableMapEntry.getKey());
                    jsonWriter.value(jsonKeyToVariableMapValue);
                }
            }
            jsonWriter.endObject();
        }
        if (modelOutputConfiguration.getCsvIndexToVariableMap() != null) {
            java.util.Map<String, String> csvIndexToVariableMap = modelOutputConfiguration
                    .getCsvIndexToVariableMap();
            jsonWriter.name("csvIndexToVariableMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> csvIndexToVariableMapEntry : csvIndexToVariableMap
                    .entrySet()) {
                String csvIndexToVariableMapValue = csvIndexToVariableMapEntry.getValue();
                if (csvIndexToVariableMapValue != null) {
                    jsonWriter.name(csvIndexToVariableMapEntry.getKey());
                    jsonWriter.value(csvIndexToVariableMapValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ModelOutputConfigurationJsonMarshaller instance;

    public static ModelOutputConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelOutputConfigurationJsonMarshaller();
        return instance;
    }
}
