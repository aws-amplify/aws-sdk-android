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
 * JSON unmarshaller for POJO Container
 */
class ContainerJsonUnmarshaller implements Unmarshaller<Container, JsonUnmarshallerContext> {

    public Container unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Container container = new Container();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("containerArn")) {
                container.setContainerArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskArn")) {
                container.setTaskArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                container.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("image")) {
                container.setImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageDigest")) {
                container.setImageDigest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runtimeId")) {
                container.setRuntimeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastStatus")) {
                container.setLastStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exitCode")) {
                container.setExitCode(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("reason")) {
                container.setReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkBindings")) {
                container.setNetworkBindings(new ListUnmarshaller<NetworkBinding>(
                        NetworkBindingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("networkInterfaces")) {
                container.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(
                        NetworkInterfaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("healthStatus")) {
                container.setHealthStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cpu")) {
                container.setCpu(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                container.setMemory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memoryReservation")) {
                container.setMemoryReservation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gpuIds")) {
                container.setGpuIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return container;
    }

    private static ContainerJsonUnmarshaller instance;

    public static ContainerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerJsonUnmarshaller();
        return instance;
    }
}
