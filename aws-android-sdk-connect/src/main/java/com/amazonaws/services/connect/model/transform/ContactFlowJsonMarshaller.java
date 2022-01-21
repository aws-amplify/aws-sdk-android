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
 * JSON marshaller for POJO ContactFlow
 */
class ContactFlowJsonMarshaller {

    public void marshall(ContactFlow contactFlow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactFlow.getArn() != null) {
            String arn = contactFlow.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contactFlow.getId() != null) {
            String id = contactFlow.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contactFlow.getName() != null) {
            String name = contactFlow.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (contactFlow.getType() != null) {
            String type = contactFlow.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (contactFlow.getState() != null) {
            String state = contactFlow.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (contactFlow.getDescription() != null) {
            String description = contactFlow.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (contactFlow.getContent() != null) {
            String content = contactFlow.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (contactFlow.getTags() != null) {
            java.util.Map<String, String> tags = contactFlow.getTags();
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

    private static ContactFlowJsonMarshaller instance;

    public static ContactFlowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactFlowJsonMarshaller();
        return instance;
    }
}
