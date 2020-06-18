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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourcePendingMaintenanceActions
 */
class ResourcePendingMaintenanceActionsStaxMarshaller {

    public void marshall(ResourcePendingMaintenanceActions _resourcePendingMaintenanceActions,
            Request<?> request, String _prefix) {
        String prefix;
        if (_resourcePendingMaintenanceActions.getResourceIdentifier() != null) {
            prefix = _prefix + "ResourceIdentifier";
            String resourceIdentifier = _resourcePendingMaintenanceActions.getResourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(resourceIdentifier));
        }
        if (_resourcePendingMaintenanceActions.getPendingMaintenanceActionDetails() != null) {
            prefix = _prefix + "PendingMaintenanceActionDetails";
            java.util.List<PendingMaintenanceAction> pendingMaintenanceActionDetails = _resourcePendingMaintenanceActions
                    .getPendingMaintenanceActionDetails();
            int pendingMaintenanceActionDetailsIndex = 1;
            String pendingMaintenanceActionDetailsPrefix = prefix;
            for (PendingMaintenanceAction pendingMaintenanceActionDetailsItem : pendingMaintenanceActionDetails) {
                prefix = pendingMaintenanceActionDetailsPrefix + "."
                        + pendingMaintenanceActionDetailsIndex;
                if (pendingMaintenanceActionDetailsItem != null) {
                    PendingMaintenanceActionStaxMarshaller.getInstance().marshall(
                            pendingMaintenanceActionDetailsItem, request, prefix + ".");
                }
                pendingMaintenanceActionDetailsIndex++;
            }
            prefix = pendingMaintenanceActionDetailsPrefix;
        }
    }

    private static ResourcePendingMaintenanceActionsStaxMarshaller instance;

    public static ResourcePendingMaintenanceActionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourcePendingMaintenanceActionsStaxMarshaller();
        return instance;
    }
}
