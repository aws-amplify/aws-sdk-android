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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourcePendingMaintenanceActions
 */
class ResourcePendingMaintenanceActionsJsonMarshaller {

    public void marshall(ResourcePendingMaintenanceActions resourcePendingMaintenanceActions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourcePendingMaintenanceActions.getResourceIdentifier() != null) {
            String resourceIdentifier = resourcePendingMaintenanceActions.getResourceIdentifier();
            jsonWriter.name("ResourceIdentifier");
            jsonWriter.value(resourceIdentifier);
        }
        if (resourcePendingMaintenanceActions.getPendingMaintenanceActionDetails() != null) {
            java.util.List<PendingMaintenanceAction> pendingMaintenanceActionDetails = resourcePendingMaintenanceActions
                    .getPendingMaintenanceActionDetails();
            jsonWriter.name("PendingMaintenanceActionDetails");
            jsonWriter.beginArray();
            for (PendingMaintenanceAction pendingMaintenanceActionDetailsItem : pendingMaintenanceActionDetails) {
                if (pendingMaintenanceActionDetailsItem != null) {
                    PendingMaintenanceActionJsonMarshaller.getInstance().marshall(
                            pendingMaintenanceActionDetailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResourcePendingMaintenanceActionsJsonMarshaller instance;

    public static ResourcePendingMaintenanceActionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourcePendingMaintenanceActionsJsonMarshaller();
        return instance;
    }
}
