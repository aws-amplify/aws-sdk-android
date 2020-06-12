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
 * JSON unmarshaller for POJO ContainerInstance
 */
class ContainerInstanceJsonUnmarshaller implements
        Unmarshaller<ContainerInstance, JsonUnmarshallerContext> {

    public ContainerInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerInstance containerInstance = new ContainerInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("containerInstanceArn")) {
                containerInstance.setContainerInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ec2InstanceId")) {
                containerInstance.setEc2InstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("capacityProviderName")) {
                containerInstance.setCapacityProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                containerInstance.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionInfo")) {
                containerInstance.setVersionInfo(VersionInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("remainingResources")) {
                containerInstance.setRemainingResources(new ListUnmarshaller<Resource>(
                        ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("registeredResources")) {
                containerInstance.setRegisteredResources(new ListUnmarshaller<Resource>(
                        ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                containerInstance.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusReason")) {
                containerInstance.setStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("agentConnected")) {
                containerInstance.setAgentConnected(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runningTasksCount")) {
                containerInstance.setRunningTasksCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingTasksCount")) {
                containerInstance.setPendingTasksCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("agentUpdateStatus")) {
                containerInstance.setAgentUpdateStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attributes")) {
                containerInstance.setAttributes(new ListUnmarshaller<Attribute>(
                        AttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("registeredAt")) {
                containerInstance.setRegisteredAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attachments")) {
                containerInstance.setAttachments(new ListUnmarshaller<Attachment>(
                        AttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                containerInstance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerInstance;
    }

    private static ContainerInstanceJsonUnmarshaller instance;

    public static ContainerInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerInstanceJsonUnmarshaller();
        return instance;
    }
}
