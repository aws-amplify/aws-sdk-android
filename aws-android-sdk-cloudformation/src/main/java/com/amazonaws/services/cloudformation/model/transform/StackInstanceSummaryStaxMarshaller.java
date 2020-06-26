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
 * StAX marshaller for POJO StackInstanceSummary
 */
class StackInstanceSummaryStaxMarshaller {

    public void marshall(StackInstanceSummary _stackInstanceSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_stackInstanceSummary.getStackSetId() != null) {
            prefix = _prefix + "StackSetId";
            String stackSetId = _stackInstanceSummary.getStackSetId();
            request.addParameter(prefix, StringUtils.fromString(stackSetId));
        }
        if (_stackInstanceSummary.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _stackInstanceSummary.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_stackInstanceSummary.getAccount() != null) {
            prefix = _prefix + "Account";
            String account = _stackInstanceSummary.getAccount();
            request.addParameter(prefix, StringUtils.fromString(account));
        }
        if (_stackInstanceSummary.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackInstanceSummary.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackInstanceSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackInstanceSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackInstanceSummary.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _stackInstanceSummary.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
        if (_stackInstanceSummary.getStackInstanceStatus() != null) {
            prefix = _prefix + "StackInstanceStatus";
            StackInstanceComprehensiveStatus stackInstanceStatus = _stackInstanceSummary
                    .getStackInstanceStatus();
            StackInstanceComprehensiveStatusStaxMarshaller.getInstance().marshall(
                    stackInstanceStatus, request, prefix + ".");
        }
        if (_stackInstanceSummary.getOrganizationalUnitId() != null) {
            prefix = _prefix + "OrganizationalUnitId";
            String organizationalUnitId = _stackInstanceSummary.getOrganizationalUnitId();
            request.addParameter(prefix, StringUtils.fromString(organizationalUnitId));
        }
        if (_stackInstanceSummary.getDriftStatus() != null) {
            prefix = _prefix + "DriftStatus";
            String driftStatus = _stackInstanceSummary.getDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(driftStatus));
        }
        if (_stackInstanceSummary.getLastDriftCheckTimestamp() != null) {
            prefix = _prefix + "LastDriftCheckTimestamp";
            java.util.Date lastDriftCheckTimestamp = _stackInstanceSummary
                    .getLastDriftCheckTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastDriftCheckTimestamp));
        }
    }

    private static StackInstanceSummaryStaxMarshaller instance;

    public static StackInstanceSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackInstanceSummaryStaxMarshaller();
        return instance;
    }
}
