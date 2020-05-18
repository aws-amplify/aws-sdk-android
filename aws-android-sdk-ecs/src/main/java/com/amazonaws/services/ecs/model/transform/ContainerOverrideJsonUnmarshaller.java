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
 * JSON unmarshaller for POJO ContainerOverride
 */
class ContainerOverrideJsonUnmarshaller implements
        Unmarshaller<ContainerOverride, JsonUnmarshallerContext> {

    public ContainerOverride unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerOverride containerOverride = new ContainerOverride();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                containerOverride.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("command")) {
                containerOverride.setCommand(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("environment")) {
                containerOverride.setEnvironment(new ListUnmarshaller<KeyValuePair>(
                        KeyValuePairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("environmentFiles")) {
                containerOverride.setEnvironmentFiles(new ListUnmarshaller<EnvironmentFile>(
                        EnvironmentFileJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cpu")) {
                containerOverride.setCpu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                containerOverride.setMemory(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memoryReservation")) {
                containerOverride.setMemoryReservation(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceRequirements")) {
                containerOverride
                        .setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(
                                ResourceRequirementJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerOverride;
    }

    private static ContainerOverrideJsonUnmarshaller instance;

    public static ContainerOverrideJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverrideJsonUnmarshaller();
        return instance;
    }
}
