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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowIdentityForTarget
 */
class MaintenanceWindowIdentityForTargetJsonMarshaller {

    public void marshall(MaintenanceWindowIdentityForTarget maintenanceWindowIdentityForTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowIdentityForTarget.getWindowId() != null) {
            String windowId = maintenanceWindowIdentityForTarget.getWindowId();
            jsonWriter.name("WindowId");
            jsonWriter.value(windowId);
        }
        if (maintenanceWindowIdentityForTarget.getName() != null) {
            String name = maintenanceWindowIdentityForTarget.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowIdentityForTargetJsonMarshaller instance;
    public static MaintenanceWindowIdentityForTargetJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowIdentityForTargetJsonMarshaller();
        return instance;
    }
}
