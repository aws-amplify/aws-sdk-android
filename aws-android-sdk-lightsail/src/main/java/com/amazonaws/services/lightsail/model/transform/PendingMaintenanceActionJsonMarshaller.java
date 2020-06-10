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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
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
            jsonWriter.name("action");
            jsonWriter.value(action);
        }
        if (pendingMaintenanceAction.getDescription() != null) {
            String description = pendingMaintenanceAction.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (pendingMaintenanceAction.getCurrentApplyDate() != null) {
            java.util.Date currentApplyDate = pendingMaintenanceAction.getCurrentApplyDate();
            jsonWriter.name("currentApplyDate");
            jsonWriter.value(currentApplyDate);
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
