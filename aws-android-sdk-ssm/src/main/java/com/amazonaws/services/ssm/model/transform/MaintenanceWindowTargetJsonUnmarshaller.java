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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MaintenanceWindowTarget
 */
class MaintenanceWindowTargetJsonUnmarshaller implements
        Unmarshaller<MaintenanceWindowTarget, JsonUnmarshallerContext> {

    public MaintenanceWindowTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowTarget maintenanceWindowTarget = new MaintenanceWindowTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowId")) {
                maintenanceWindowTarget.setWindowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WindowTargetId")) {
                maintenanceWindowTarget.setWindowTargetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                maintenanceWindowTarget.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                maintenanceWindowTarget.setTargets(new ListUnmarshaller<Target>(
                        TargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OwnerInformation")) {
                maintenanceWindowTarget.setOwnerInformation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                maintenanceWindowTarget.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                maintenanceWindowTarget.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowTarget;
    }

    private static MaintenanceWindowTargetJsonUnmarshaller instance;

    public static MaintenanceWindowTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowTargetJsonUnmarshaller();
        return instance;
    }
}
