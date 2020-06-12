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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackSetSummary
 */
class StackSetSummaryStaxMarshaller {

    public void marshall(StackSetSummary _stackSetSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_stackSetSummary.getStackSetName() != null) {
            prefix = _prefix + "StackSetName";
            String stackSetName = _stackSetSummary.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (_stackSetSummary.getStackSetId() != null) {
            prefix = _prefix + "StackSetId";
            String stackSetId = _stackSetSummary.getStackSetId();
            request.addParameter(prefix, StringUtils.fromString(stackSetId));
        }
        if (_stackSetSummary.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _stackSetSummary.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_stackSetSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackSetSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackSetSummary.getAutoDeployment() != null) {
            prefix = _prefix + "AutoDeployment";
            AutoDeployment autoDeployment = _stackSetSummary.getAutoDeployment();
            AutoDeploymentStaxMarshaller.getInstance().marshall(autoDeployment, request,
                    prefix + ".");
        }
        if (_stackSetSummary.getPermissionModel() != null) {
            prefix = _prefix + "PermissionModel";
            String permissionModel = _stackSetSummary.getPermissionModel();
            request.addParameter(prefix, StringUtils.fromString(permissionModel));
        }
        if (_stackSetSummary.getDriftStatus() != null) {
            prefix = _prefix + "DriftStatus";
            String driftStatus = _stackSetSummary.getDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(driftStatus));
        }
        if (_stackSetSummary.getLastDriftCheckTimestamp() != null) {
            prefix = _prefix + "LastDriftCheckTimestamp";
            java.util.Date lastDriftCheckTimestamp = _stackSetSummary.getLastDriftCheckTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastDriftCheckTimestamp));
        }
    }

    private static StackSetSummaryStaxMarshaller instance;

    public static StackSetSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetSummaryStaxMarshaller();
        return instance;
    }
}
