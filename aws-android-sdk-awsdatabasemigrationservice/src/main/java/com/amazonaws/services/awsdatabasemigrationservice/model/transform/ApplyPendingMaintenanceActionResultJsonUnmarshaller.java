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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ApplyPendingMaintenanceActionResult
 */
public class ApplyPendingMaintenanceActionResultJsonUnmarshaller implements
        Unmarshaller<ApplyPendingMaintenanceActionResult, JsonUnmarshallerContext> {

    public ApplyPendingMaintenanceActionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ApplyPendingMaintenanceActionResult applyPendingMaintenanceActionResult = new ApplyPendingMaintenanceActionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResourcePendingMaintenanceActions")) {
                applyPendingMaintenanceActionResult
                        .setResourcePendingMaintenanceActions(ResourcePendingMaintenanceActionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return applyPendingMaintenanceActionResult;
    }

    private static ApplyPendingMaintenanceActionResultJsonUnmarshaller instance;

    public static ApplyPendingMaintenanceActionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplyPendingMaintenanceActionResultJsonUnmarshaller();
        return instance;
    }
}
