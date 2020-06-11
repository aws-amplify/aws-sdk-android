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
 * JSON unmarshaller for POJO ContainerStateChange
 */
class ContainerStateChangeJsonUnmarshaller implements
        Unmarshaller<ContainerStateChange, JsonUnmarshallerContext> {

    public ContainerStateChange unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerStateChange containerStateChange = new ContainerStateChange();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("containerName")) {
                containerStateChange.setContainerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageDigest")) {
                containerStateChange.setImageDigest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runtimeId")) {
                containerStateChange.setRuntimeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exitCode")) {
                containerStateChange.setExitCode(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkBindings")) {
                containerStateChange.setNetworkBindings(new ListUnmarshaller<NetworkBinding>(
                        NetworkBindingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("reason")) {
                containerStateChange.setReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                containerStateChange.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerStateChange;
    }

    private static ContainerStateChangeJsonUnmarshaller instance;

    public static ContainerStateChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerStateChangeJsonUnmarshaller();
        return instance;
    }
}
