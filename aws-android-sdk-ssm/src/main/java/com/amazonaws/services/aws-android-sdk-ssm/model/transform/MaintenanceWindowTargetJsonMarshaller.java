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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowTarget
 */
class MaintenanceWindowTargetJsonMarshaller {

    public void marshall(MaintenanceWindowTarget maintenanceWindowTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowTarget.getWindowId() != null) {
            String windowId = maintenanceWindowTarget.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (maintenanceWindowTarget.getWindowTargetId() != null) {
            String windowTargetId = maintenanceWindowTarget.getWindowTargetId();
            jsonWriter.name("WindowTargetId");
            jsonWriter.value(windowTargetId);
        }
        if (maintenanceWindowTarget.getResourceType() != null) {
            String resourceType = maintenanceWindowTarget.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (maintenanceWindowTarget.getTargets() != null) {
            java.util.List<Target> targets = maintenanceWindowTarget.getTargets();
            jsonWriter.name("Targets");
            jsonWriter.beginArray();
            for (Target targetsItem : targets) {
                if (targetsItem != null) {
            TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (maintenanceWindowTarget.getOwnerInformation() != null) {
            String ownerInformation = maintenanceWindowTarget.getOwnerInformation();
            jsonWriter.name("OwnerInformation");
            jsonWriter.value(ownerInformation);
        }
        if (maintenanceWindowTarget.getName() != null) {
            String name = maintenanceWindowTarget.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (maintenanceWindowTarget.getDescription() != null) {
            String description = maintenanceWindowTarget.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowTargetJsonMarshaller instance;
    public static MaintenanceWindowTargetJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowTargetJsonMarshaller();
        return instance;
    }
}
