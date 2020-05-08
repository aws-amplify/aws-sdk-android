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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeNotebookInstanceLifecycleConfigResult
 */
public class DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller implements
        Unmarshaller<DescribeNotebookInstanceLifecycleConfigResult, JsonUnmarshallerContext> {

    public DescribeNotebookInstanceLifecycleConfigResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfigResult = new DescribeNotebookInstanceLifecycleConfigResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NotebookInstanceLifecycleConfigArn")) {
                describeNotebookInstanceLifecycleConfigResult
                        .setNotebookInstanceLifecycleConfigArn(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("NotebookInstanceLifecycleConfigName")) {
                describeNotebookInstanceLifecycleConfigResult
                        .setNotebookInstanceLifecycleConfigName(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("OnCreate")) {
                describeNotebookInstanceLifecycleConfigResult
                        .setOnCreate(new ListUnmarshaller<NotebookInstanceLifecycleHook>(
                                NotebookInstanceLifecycleHookJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OnStart")) {
                describeNotebookInstanceLifecycleConfigResult
                        .setOnStart(new ListUnmarshaller<NotebookInstanceLifecycleHook>(
                                NotebookInstanceLifecycleHookJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeNotebookInstanceLifecycleConfigResult
                        .setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeNotebookInstanceLifecycleConfigResult.setCreationTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeNotebookInstanceLifecycleConfigResult;
    }

    private static DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller instance;

    public static DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller();
        return instance;
    }
}
