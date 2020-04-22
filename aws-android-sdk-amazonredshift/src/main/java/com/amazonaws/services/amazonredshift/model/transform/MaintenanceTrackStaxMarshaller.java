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
 * StAX marshaller for POJO MaintenanceTrack
 */
class MaintenanceTrackStaxMarshaller {

    public void marshall(MaintenanceTrack _maintenanceTrack, Request<?> request, String _prefix) {
        String prefix;
        if (_maintenanceTrack.getMaintenanceTrackName() != null) {
            prefix = _prefix + "MaintenanceTrackName";
            String maintenanceTrackName = _maintenanceTrack.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (_maintenanceTrack.getDatabaseVersion() != null) {
            prefix = _prefix + "DatabaseVersion";
            String databaseVersion = _maintenanceTrack.getDatabaseVersion();
            request.addParameter(prefix, StringUtils.fromString(databaseVersion));
        }
        if (_maintenanceTrack.getUpdateTargets() != null) {
            prefix = _prefix + "UpdateTargets";
            java.util.List<UpdateTarget> updateTargets = _maintenanceTrack.getUpdateTargets();
            int updateTargetsIndex = 1;
            String updateTargetsPrefix = prefix;
            for (UpdateTarget updateTargetsItem : updateTargets) {
                prefix = updateTargetsPrefix + "." + updateTargetsIndex;
                if (updateTargetsItem != null) {
                    UpdateTargetStaxMarshaller.getInstance().marshall(updateTargetsItem, request,
                            prefix + ".");
                }
                updateTargetsIndex++;
            }
            prefix = updateTargetsPrefix;
        }
    }

    private static MaintenanceTrackStaxMarshaller instance;

    public static MaintenanceTrackStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceTrackStaxMarshaller();
        return instance;
    }
}
