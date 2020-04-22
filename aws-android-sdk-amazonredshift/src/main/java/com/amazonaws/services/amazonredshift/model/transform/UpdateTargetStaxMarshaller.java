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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO UpdateTarget
 */
class UpdateTargetStaxMarshaller {

    public void marshall(UpdateTarget _updateTarget, Request<?> request, String _prefix) {
        String prefix;
        if (_updateTarget.getMaintenanceTrackName() != null) {
            prefix = _prefix + "MaintenanceTrackName";
            String maintenanceTrackName = _updateTarget.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (_updateTarget.getDatabaseVersion() != null) {
            prefix = _prefix + "DatabaseVersion";
            String databaseVersion = _updateTarget.getDatabaseVersion();
            request.addParameter(prefix, StringUtils.fromString(databaseVersion));
        }
        if (_updateTarget.getSupportedOperations() != null) {
            prefix = _prefix + "SupportedOperations";
            java.util.List<SupportedOperation> supportedOperations = _updateTarget
                    .getSupportedOperations();
            int supportedOperationsIndex = 1;
            String supportedOperationsPrefix = prefix;
            for (SupportedOperation supportedOperationsItem : supportedOperations) {
                prefix = supportedOperationsPrefix + "." + supportedOperationsIndex;
                if (supportedOperationsItem != null) {
                    SupportedOperationStaxMarshaller.getInstance().marshall(
                            supportedOperationsItem, request, prefix + ".");
                }
                supportedOperationsIndex++;
            }
            prefix = supportedOperationsPrefix;
        }
    }

    private static UpdateTargetStaxMarshaller instance;

    public static UpdateTargetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateTargetStaxMarshaller();
        return instance;
    }
}
