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
 * JSON marshaller for POJO PendingMaintenanceAction
 */
class PendingMaintenanceActionJsonMarshaller {

    public void marshall(PendingMaintenanceAction pendingMaintenanceAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (pendingMaintenanceAction.getAction() != null) {
            String action = pendingMaintenanceAction.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (pendingMaintenanceAction.getAutoAppliedAfterDate() != null) {
            java.util.Date autoAppliedAfterDate = pendingMaintenanceAction
                    .getAutoAppliedAfterDate();
            jsonWriter.name("AutoAppliedAfterDate");
            jsonWriter.value(autoAppliedAfterDate);
        }
        if (pendingMaintenanceAction.getForcedApplyDate() != null) {
            java.util.Date forcedApplyDate = pendingMaintenanceAction.getForcedApplyDate();
            jsonWriter.name("ForcedApplyDate");
            jsonWriter.value(forcedApplyDate);
        }
        if (pendingMaintenanceAction.getOptInStatus() != null) {
            String optInStatus = pendingMaintenanceAction.getOptInStatus();
            jsonWriter.name("OptInStatus");
            jsonWriter.value(optInStatus);
        }
        if (pendingMaintenanceAction.getCurrentApplyDate() != null) {
            java.util.Date currentApplyDate = pendingMaintenanceAction.getCurrentApplyDate();
            jsonWriter.name("CurrentApplyDate");
            jsonWriter.value(currentApplyDate);
        }
        if (pendingMaintenanceAction.getDescription() != null) {
            String description = pendingMaintenanceAction.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static PendingMaintenanceActionJsonMarshaller instance;

    public static PendingMaintenanceActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PendingMaintenanceActionJsonMarshaller();
        return instance;
    }
}
