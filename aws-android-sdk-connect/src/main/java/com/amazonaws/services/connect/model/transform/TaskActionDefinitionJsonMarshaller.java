/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskActionDefinition
 */
class TaskActionDefinitionJsonMarshaller {

    public void marshall(TaskActionDefinition taskActionDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskActionDefinition.getName() != null) {
            String name = taskActionDefinition.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (taskActionDefinition.getDescription() != null) {
            String description = taskActionDefinition.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (taskActionDefinition.getContactFlowId() != null) {
            String contactFlowId = taskActionDefinition.getContactFlowId();
            jsonWriter.name("ContactFlowId");
            jsonWriter.value(contactFlowId);
        }
        if (taskActionDefinition.getReferences() != null) {
            java.util.Map<String, Reference> references = taskActionDefinition.getReferences();
            jsonWriter.name("References");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Reference> referencesEntry : references.entrySet()) {
                Reference referencesValue = referencesEntry.getValue();
                if (referencesValue != null) {
                    jsonWriter.name(referencesEntry.getKey());
                    ReferenceJsonMarshaller.getInstance().marshall(referencesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static TaskActionDefinitionJsonMarshaller instance;

    public static TaskActionDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskActionDefinitionJsonMarshaller();
        return instance;
    }
}
