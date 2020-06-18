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
 * StAX marshaller for POJO PendingMaintenanceAction
 */
class PendingMaintenanceActionStaxMarshaller {

    public void marshall(PendingMaintenanceAction _pendingMaintenanceAction, Request<?> request,
            String _prefix) {
        String prefix;
        if (_pendingMaintenanceAction.getAction() != null) {
            prefix = _prefix + "Action";
            String action = _pendingMaintenanceAction.getAction();
            request.addParameter(prefix, StringUtils.fromString(action));
        }
        if (_pendingMaintenanceAction.getAutoAppliedAfterDate() != null) {
            prefix = _prefix + "AutoAppliedAfterDate";
            java.util.Date autoAppliedAfterDate = _pendingMaintenanceAction
                    .getAutoAppliedAfterDate();
            request.addParameter(prefix, StringUtils.fromDate(autoAppliedAfterDate));
        }
        if (_pendingMaintenanceAction.getForcedApplyDate() != null) {
            prefix = _prefix + "ForcedApplyDate";
            java.util.Date forcedApplyDate = _pendingMaintenanceAction.getForcedApplyDate();
            request.addParameter(prefix, StringUtils.fromDate(forcedApplyDate));
        }
        if (_pendingMaintenanceAction.getOptInStatus() != null) {
            prefix = _prefix + "OptInStatus";
            String optInStatus = _pendingMaintenanceAction.getOptInStatus();
            request.addParameter(prefix, StringUtils.fromString(optInStatus));
        }
        if (_pendingMaintenanceAction.getCurrentApplyDate() != null) {
            prefix = _prefix + "CurrentApplyDate";
            java.util.Date currentApplyDate = _pendingMaintenanceAction.getCurrentApplyDate();
            request.addParameter(prefix, StringUtils.fromDate(currentApplyDate));
        }
        if (_pendingMaintenanceAction.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _pendingMaintenanceAction.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static PendingMaintenanceActionStaxMarshaller instance;

    public static PendingMaintenanceActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PendingMaintenanceActionStaxMarshaller();
        return instance;
    }
}
