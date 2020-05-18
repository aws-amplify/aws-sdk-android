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
 * JSON unmarshaller for POJO TaskDefinition
 */
class TaskDefinitionJsonUnmarshaller implements
        Unmarshaller<TaskDefinition, JsonUnmarshallerContext> {

    public TaskDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskDefinition taskDefinition = new TaskDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskDefinitionArn")) {
                taskDefinition.setTaskDefinitionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("containerDefinitions")) {
                taskDefinition.setContainerDefinitions(new ListUnmarshaller<ContainerDefinition>(
                        ContainerDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("family")) {
                taskDefinition.setFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskRoleArn")) {
                taskDefinition.setTaskRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionRoleArn")) {
                taskDefinition.setExecutionRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkMode")) {
                taskDefinition.setNetworkMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("revision")) {
                taskDefinition.setRevision(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("volumes")) {
                taskDefinition.setVolumes(new ListUnmarshaller<Volume>(VolumeJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                taskDefinition.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requiresAttributes")) {
                taskDefinition.setRequiresAttributes(new ListUnmarshaller<Attribute>(
                        AttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("placementConstraints")) {
                taskDefinition
                        .setPlacementConstraints(new ListUnmarshaller<TaskDefinitionPlacementConstraint>(
                                TaskDefinitionPlacementConstraintJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("compatibilities")) {
                taskDefinition.setCompatibilities(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requiresCompatibilities")) {
                taskDefinition.setRequiresCompatibilities(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cpu")) {
                taskDefinition.setCpu(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                taskDefinition.setMemory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inferenceAccelerators")) {
                taskDefinition.setInferenceAccelerators(new ListUnmarshaller<InferenceAccelerator>(
                        InferenceAcceleratorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("pidMode")) {
                taskDefinition.setPidMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ipcMode")) {
                taskDefinition.setIpcMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("proxyConfiguration")) {
                taskDefinition.setProxyConfiguration(ProxyConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskDefinition;
    }

    private static TaskDefinitionJsonUnmarshaller instance;

    public static TaskDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskDefinitionJsonUnmarshaller();
        return instance;
    }
}
