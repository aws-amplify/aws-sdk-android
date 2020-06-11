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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TaskOverride
 */
class TaskOverrideJsonUnmarshaller implements Unmarshaller<TaskOverride, JsonUnmarshallerContext> {

    public TaskOverride unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskOverride taskOverride = new TaskOverride();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("containerOverrides")) {
                taskOverride.setContainerOverrides(new ListUnmarshaller<ContainerOverride>(
                        ContainerOverrideJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cpu")) {
                taskOverride.setCpu(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inferenceAcceleratorOverrides")) {
                taskOverride
                        .setInferenceAcceleratorOverrides(new ListUnmarshaller<InferenceAcceleratorOverride>(
                                InferenceAcceleratorOverrideJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("executionRoleArn")) {
                taskOverride.setExecutionRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                taskOverride.setMemory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskRoleArn")) {
                taskOverride.setTaskRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskOverride;
    }

    private static TaskOverrideJsonUnmarshaller instance;

    public static TaskOverrideJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskOverrideJsonUnmarshaller();
        return instance;
    }
}
