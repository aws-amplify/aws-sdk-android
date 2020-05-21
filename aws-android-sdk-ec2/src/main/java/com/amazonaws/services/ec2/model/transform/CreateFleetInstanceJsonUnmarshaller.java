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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CreateFleetInstance
 */
class CreateFleetInstanceJsonUnmarshaller implements
        Unmarshaller<CreateFleetInstance, JsonUnmarshallerContext> {

    public CreateFleetInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateFleetInstance createFleetInstance = new CreateFleetInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LaunchTemplateAndOverrides")) {
                createFleetInstance
                        .setLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponseJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                createFleetInstance.setLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceIds")) {
                createFleetInstance.setInstanceIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                createFleetInstance.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                createFleetInstance.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createFleetInstance;
    }

    private static CreateFleetInstanceJsonUnmarshaller instance;

    public static CreateFleetInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFleetInstanceJsonUnmarshaller();
        return instance;
    }
}
