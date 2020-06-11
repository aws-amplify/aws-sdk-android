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
 * JSON unmarshaller for POJO LinuxParameters
 */
class LinuxParametersJsonUnmarshaller implements
        Unmarshaller<LinuxParameters, JsonUnmarshallerContext> {

    public LinuxParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LinuxParameters linuxParameters = new LinuxParameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("capabilities")) {
                linuxParameters.setCapabilities(KernelCapabilitiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("devices")) {
                linuxParameters.setDevices(new ListUnmarshaller<Device>(DeviceJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("initProcessEnabled")) {
                linuxParameters.setInitProcessEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sharedMemorySize")) {
                linuxParameters.setSharedMemorySize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tmpfs")) {
                linuxParameters.setTmpfs(new ListUnmarshaller<Tmpfs>(TmpfsJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("maxSwap")) {
                linuxParameters.setMaxSwap(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("swappiness")) {
                linuxParameters.setSwappiness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return linuxParameters;
    }

    private static LinuxParametersJsonUnmarshaller instance;

    public static LinuxParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LinuxParametersJsonUnmarshaller();
        return instance;
    }
}
