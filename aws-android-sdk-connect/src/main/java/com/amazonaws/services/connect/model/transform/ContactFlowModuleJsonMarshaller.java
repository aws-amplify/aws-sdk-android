/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ContactFlowModule
 */
class ContactFlowModuleJsonMarshaller {

    public void marshall(ContactFlowModule contactFlowModule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (contactFlowModule.getArn() != null) {
            String arn = contactFlowModule.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contactFlowModule.getId() != null) {
            String id = contactFlowModule.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contactFlowModule.getName() != null) {
            String name = contactFlowModule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (contactFlowModule.getContent() != null) {
            String content = contactFlowModule.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (contactFlowModule.getDescription() != null) {
            String description = contactFlowModule.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (contactFlowModule.getState() != null) {
            String state = contactFlowModule.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (contactFlowModule.getStatus() != null) {
            String status = contactFlowModule.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (contactFlowModule.getTags() != null) {
            java.util.Map<String, String> tags = contactFlowModule.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ContactFlowModuleJsonMarshaller instance;

    public static ContactFlowModuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactFlowModuleJsonMarshaller();
        return instance;
    }
}
