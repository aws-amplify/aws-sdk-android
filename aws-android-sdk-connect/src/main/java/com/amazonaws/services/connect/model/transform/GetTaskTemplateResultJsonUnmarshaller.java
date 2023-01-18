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
 * JSON unmarshaller for response GetTaskTemplateResult
 */
public class GetTaskTemplateResultJsonUnmarshaller implements
        Unmarshaller<GetTaskTemplateResult, JsonUnmarshallerContext> {

    public GetTaskTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTaskTemplateResult getTaskTemplateResult = new GetTaskTemplateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                getTaskTemplateResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                getTaskTemplateResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                getTaskTemplateResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getTaskTemplateResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getTaskTemplateResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContactFlowId")) {
                getTaskTemplateResult.setContactFlowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Constraints")) {
                getTaskTemplateResult.setConstraints(TaskTemplateConstraintsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Defaults")) {
                getTaskTemplateResult.setDefaults(TaskTemplateDefaultsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Fields")) {
                getTaskTemplateResult.setFields(new ListUnmarshaller<TaskTemplateField>(
                        TaskTemplateFieldJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                getTaskTemplateResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                getTaskTemplateResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                getTaskTemplateResult.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                getTaskTemplateResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getTaskTemplateResult;
    }

    private static GetTaskTemplateResultJsonUnmarshaller instance;

    public static GetTaskTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTaskTemplateResultJsonUnmarshaller();
        return instance;
    }
}
