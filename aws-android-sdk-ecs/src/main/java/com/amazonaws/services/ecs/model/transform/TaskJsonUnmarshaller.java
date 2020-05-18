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
 * JSON unmarshaller for POJO Task
 */
class TaskJsonUnmarshaller implements Unmarshaller<Task, JsonUnmarshallerContext> {

    public Task unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Task task = new Task();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("attachments")) {
                task.setAttachments(new ListUnmarshaller<Attachment>(AttachmentJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("attributes")) {
                task.setAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("availabilityZone")) {
                task.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("capacityProviderName")) {
                task.setCapacityProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clusterArn")) {
                task.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectivity")) {
                task.setConnectivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectivityAt")) {
                task.setConnectivityAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("containerInstanceArn")) {
                task.setContainerInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("containers")) {
                task.setContainers(new ListUnmarshaller<Container>(ContainerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cpu")) {
                task.setCpu(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                task.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("desiredStatus")) {
                task.setDesiredStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionStoppedAt")) {
                task.setExecutionStoppedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("group")) {
                task.setGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("healthStatus")) {
                task.setHealthStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inferenceAccelerators")) {
                task.setInferenceAccelerators(new ListUnmarshaller<InferenceAccelerator>(
                        InferenceAcceleratorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastStatus")) {
                task.setLastStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("launchType")) {
                task.setLaunchType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                task.setMemory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("overrides")) {
                task.setOverrides(TaskOverrideJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platformVersion")) {
                task.setPlatformVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullStartedAt")) {
                task.setPullStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullStoppedAt")) {
                task.setPullStoppedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startedAt")) {
                task.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startedBy")) {
                task.setStartedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stopCode")) {
                task.setStopCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stoppedAt")) {
                task.setStoppedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stoppedReason")) {
                task.setStoppedReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stoppingAt")) {
                task.setStoppingAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                task.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("taskArn")) {
                task.setTaskArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskDefinitionArn")) {
                task.setTaskDefinitionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                task.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return task;
    }

    private static TaskJsonUnmarshaller instance;

    public static TaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonUnmarshaller();
        return instance;
    }
}
