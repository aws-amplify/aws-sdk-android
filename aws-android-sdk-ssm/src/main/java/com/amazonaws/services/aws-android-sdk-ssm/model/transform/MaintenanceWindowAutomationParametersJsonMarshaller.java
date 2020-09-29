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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowAutomationParameters
 */
class MaintenanceWindowAutomationParametersJsonMarshaller {

    public void marshall(MaintenanceWindowAutomationParameters maintenanceWindowAutomationParameters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowAutomationParameters.getDocumentVersion() != null) {
            String documentVersion = maintenanceWindowAutomationParameters.getDocumentVersion();
            jsonWriter.name("DocumentVersion");
            jsonWriter.value(documentVersion);
        }
        if (maintenanceWindowAutomationParameters.getParameters() != null) {
            java.util.Map<String, java.util.List<String>> parameters = maintenanceWindowAutomationParameters.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters.entrySet()) {
                java.util.List<String> parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
            jsonWriter.beginArray();
            for (String parametersValueItem : parametersValue) {
                if (parametersValueItem != null) {
            jsonWriter.value(parametersValueItem);
                    }
            }
            jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowAutomationParametersJsonMarshaller instance;
    public static MaintenanceWindowAutomationParametersJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowAutomationParametersJsonMarshaller();
        return instance;
    }
}
