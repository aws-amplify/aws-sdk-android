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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateTaskTemplateResult
 */
public class UpdateTaskTemplateResultJsonUnmarshaller implements
        Unmarshaller<UpdateTaskTemplateResult, JsonUnmarshallerContext> {

    public UpdateTaskTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateTaskTemplateResult updateTaskTemplateResult = new UpdateTaskTemplateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                updateTaskTemplateResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                updateTaskTemplateResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                updateTaskTemplateResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateTaskTemplateResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateTaskTemplateResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContactFlowId")) {
                updateTaskTemplateResult.setContactFlowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Constraints")) {
                updateTaskTemplateResult.setConstraints(TaskTemplateConstraintsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Defaults")) {
                updateTaskTemplateResult.setDefaults(TaskTemplateDefaultsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Fields")) {
                updateTaskTemplateResult.setFields(new ListUnmarshaller<TaskTemplateField>(
                        TaskTemplateFieldJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                updateTaskTemplateResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                updateTaskTemplateResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                updateTaskTemplateResult.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateTaskTemplateResult;
    }

    private static UpdateTaskTemplateResultJsonUnmarshaller instance;

    public static UpdateTaskTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateTaskTemplateResultJsonUnmarshaller();
        return instance;
    }
}
