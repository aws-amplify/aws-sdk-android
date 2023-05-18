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
 * JSON marshaller for POJO Prompt
 */
class PromptJsonMarshaller {

    public void marshall(Prompt prompt, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (prompt.getPromptARN() != null) {
            String promptARN = prompt.getPromptARN();
            jsonWriter.name("PromptARN");
            jsonWriter.value(promptARN);
        }
        if (prompt.getPromptId() != null) {
            String promptId = prompt.getPromptId();
            jsonWriter.name("PromptId");
            jsonWriter.value(promptId);
        }
        if (prompt.getName() != null) {
            String name = prompt.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (prompt.getDescription() != null) {
            String description = prompt.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (prompt.getTags() != null) {
            java.util.Map<String, String> tags = prompt.getTags();
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

    private static PromptJsonMarshaller instance;

    public static PromptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PromptJsonMarshaller();
        return instance;
    }
}
