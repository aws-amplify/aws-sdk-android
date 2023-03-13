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
 * JSON marshaller for POJO TaskTemplateField
 */
class TaskTemplateFieldJsonMarshaller {

    public void marshall(TaskTemplateField taskTemplateField, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskTemplateField.getId() != null) {
            TaskTemplateFieldIdentifier id = taskTemplateField.getId();
            jsonWriter.name("Id");
            TaskTemplateFieldIdentifierJsonMarshaller.getInstance().marshall(id, jsonWriter);
        }
        if (taskTemplateField.getDescription() != null) {
            String description = taskTemplateField.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (taskTemplateField.getType() != null) {
            String type = taskTemplateField.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (taskTemplateField.getSingleSelectOptions() != null) {
            java.util.List<String> singleSelectOptions = taskTemplateField.getSingleSelectOptions();
            jsonWriter.name("SingleSelectOptions");
            jsonWriter.beginArray();
            for (String singleSelectOptionsItem : singleSelectOptions) {
                if (singleSelectOptionsItem != null) {
                    jsonWriter.value(singleSelectOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TaskTemplateFieldJsonMarshaller instance;

    public static TaskTemplateFieldJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskTemplateFieldJsonMarshaller();
        return instance;
    }
}
