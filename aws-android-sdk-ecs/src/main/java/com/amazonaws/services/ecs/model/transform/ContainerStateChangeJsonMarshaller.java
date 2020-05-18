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
 * JSON marshaller for POJO ContainerStateChange
 */
class ContainerStateChangeJsonMarshaller {

    public void marshall(ContainerStateChange containerStateChange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerStateChange.getContainerName() != null) {
            String containerName = containerStateChange.getContainerName();
            jsonWriter.name("containerName");
            jsonWriter.value(containerName);
        }
        if (containerStateChange.getImageDigest() != null) {
            String imageDigest = containerStateChange.getImageDigest();
            jsonWriter.name("imageDigest");
            jsonWriter.value(imageDigest);
        }
        if (containerStateChange.getRuntimeId() != null) {
            String runtimeId = containerStateChange.getRuntimeId();
            jsonWriter.name("runtimeId");
            jsonWriter.value(runtimeId);
        }
        if (containerStateChange.getExitCode() != null) {
            Integer exitCode = containerStateChange.getExitCode();
            jsonWriter.name("exitCode");
            jsonWriter.value(exitCode);
        }
        if (containerStateChange.getNetworkBindings() != null) {
            java.util.List<NetworkBinding> networkBindings = containerStateChange
                    .getNetworkBindings();
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
        if (containerStateChange.getReason() != null) {
            String reason = containerStateChange.getReason();
            jsonWriter.name("reason");
            jsonWriter.value(reason);
        }
        if (containerStateChange.getStatus() != null) {
            String status = containerStateChange.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static ContainerStateChangeJsonMarshaller instance;

    public static ContainerStateChangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerStateChangeJsonMarshaller();
        return instance;
    }
}
