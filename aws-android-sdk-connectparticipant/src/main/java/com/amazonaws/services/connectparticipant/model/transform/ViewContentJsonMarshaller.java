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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ViewContent
 */
class ViewContentJsonMarshaller {

    public void marshall(ViewContent viewContent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (viewContent.getInputSchema() != null) {
            String inputSchema = viewContent.getInputSchema();
            jsonWriter.name("InputSchema");
            jsonWriter.value(inputSchema);
        }
        if (viewContent.getTemplate() != null) {
            String template = viewContent.getTemplate();
            jsonWriter.name("Template");
            jsonWriter.value(template);
        }
        if (viewContent.getActions() != null) {
            java.util.List<String> actions = viewContent.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (String actionsItem : actions) {
                if (actionsItem != null) {
                    jsonWriter.value(actionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ViewContentJsonMarshaller instance;

    public static ViewContentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViewContentJsonMarshaller();
        return instance;
    }
}
