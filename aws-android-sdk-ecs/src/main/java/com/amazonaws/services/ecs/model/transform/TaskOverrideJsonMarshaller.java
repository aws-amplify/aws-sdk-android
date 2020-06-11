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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskOverride
 */
class TaskOverrideJsonMarshaller {

    public void marshall(TaskOverride taskOverride, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskOverride.getContainerOverrides() != null) {
            java.util.List<ContainerOverride> containerOverrides = taskOverride
                    .getContainerOverrides();
            jsonWriter.name("containerOverrides");
            jsonWriter.beginArray();
            for (ContainerOverride containerOverridesItem : containerOverrides) {
                if (containerOverridesItem != null) {
                    ContainerOverrideJsonMarshaller.getInstance().marshall(containerOverridesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskOverride.getCpu() != null) {
            String cpu = taskOverride.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (taskOverride.getInferenceAcceleratorOverrides() != null) {
            java.util.List<InferenceAcceleratorOverride> inferenceAcceleratorOverrides = taskOverride
                    .getInferenceAcceleratorOverrides();
            jsonWriter.name("inferenceAcceleratorOverrides");
            jsonWriter.beginArray();
            for (InferenceAcceleratorOverride inferenceAcceleratorOverridesItem : inferenceAcceleratorOverrides) {
                if (inferenceAcceleratorOverridesItem != null) {
                    InferenceAcceleratorOverrideJsonMarshaller.getInstance().marshall(
                            inferenceAcceleratorOverridesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskOverride.getExecutionRoleArn() != null) {
            String executionRoleArn = taskOverride.getExecutionRoleArn();
            jsonWriter.name("executionRoleArn");
            jsonWriter.value(executionRoleArn);
        }
        if (taskOverride.getMemory() != null) {
            String memory = taskOverride.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (taskOverride.getTaskRoleArn() != null) {
            String taskRoleArn = taskOverride.getTaskRoleArn();
            jsonWriter.name("taskRoleArn");
            jsonWriter.value(taskRoleArn);
        }
        jsonWriter.endObject();
    }

    private static TaskOverrideJsonMarshaller instance;

    public static TaskOverrideJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskOverrideJsonMarshaller();
        return instance;
    }
}
