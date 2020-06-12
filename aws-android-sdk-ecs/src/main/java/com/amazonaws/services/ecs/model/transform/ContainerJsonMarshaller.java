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
 * JSON marshaller for POJO Container
 */
class ContainerJsonMarshaller {

    public void marshall(Container container, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (container.getContainerArn() != null) {
            String containerArn = container.getContainerArn();
            jsonWriter.name("containerArn");
            jsonWriter.value(containerArn);
        }
        if (container.getTaskArn() != null) {
            String taskArn = container.getTaskArn();
            jsonWriter.name("taskArn");
            jsonWriter.value(taskArn);
        }
        if (container.getName() != null) {
            String name = container.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (container.getImage() != null) {
            String image = container.getImage();
            jsonWriter.name("image");
            jsonWriter.value(image);
        }
        if (container.getImageDigest() != null) {
            String imageDigest = container.getImageDigest();
            jsonWriter.name("imageDigest");
            jsonWriter.value(imageDigest);
        }
        if (container.getRuntimeId() != null) {
            String runtimeId = container.getRuntimeId();
            jsonWriter.name("runtimeId");
            jsonWriter.value(runtimeId);
        }
        if (container.getLastStatus() != null) {
            String lastStatus = container.getLastStatus();
            jsonWriter.name("lastStatus");
            jsonWriter.value(lastStatus);
        }
        if (container.getExitCode() != null) {
            Integer exitCode = container.getExitCode();
            jsonWriter.name("exitCode");
            jsonWriter.value(exitCode);
        }
        if (container.getReason() != null) {
            String reason = container.getReason();
            jsonWriter.name("reason");
            jsonWriter.value(reason);
        }
        if (container.getNetworkBindings() != null) {
            java.util.List<NetworkBinding> networkBindings = container.getNetworkBindings();
            jsonWriter.name("networkBindings");
            jsonWriter.beginArray();
            for (NetworkBinding networkBindingsItem : networkBindings) {
                if (networkBindingsItem != null) {
                    NetworkBindingJsonMarshaller.getInstance().marshall(networkBindingsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (container.getNetworkInterfaces() != null) {
            java.util.List<NetworkInterface> networkInterfaces = container.getNetworkInterfaces();
            jsonWriter.name("networkInterfaces");
            jsonWriter.beginArray();
            for (NetworkInterface networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    NetworkInterfaceJsonMarshaller.getInstance().marshall(networkInterfacesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (container.getHealthStatus() != null) {
            String healthStatus = container.getHealthStatus();
            jsonWriter.name("healthStatus");
            jsonWriter.value(healthStatus);
        }
        if (container.getCpu() != null) {
            String cpu = container.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (container.getMemory() != null) {
            String memory = container.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (container.getMemoryReservation() != null) {
            String memoryReservation = container.getMemoryReservation();
            jsonWriter.name("memoryReservation");
            jsonWriter.value(memoryReservation);
        }
        if (container.getGpuIds() != null) {
            java.util.List<String> gpuIds = container.getGpuIds();
            jsonWriter.name("gpuIds");
            jsonWriter.beginArray();
            for (String gpuIdsItem : gpuIds) {
                if (gpuIdsItem != null) {
                    jsonWriter.value(gpuIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContainerJsonMarshaller instance;

    public static ContainerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerJsonMarshaller();
        return instance;
    }
}
