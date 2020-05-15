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
 * StAX marshaller for POJO ChangeSetSummary
 */
class ChangeSetSummaryStaxMarshaller {

    public void marshall(ChangeSetSummary _changeSetSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_changeSetSummary.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _changeSetSummary.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_changeSetSummary.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _changeSetSummary.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_changeSetSummary.getChangeSetId() != null) {
            prefix = _prefix + "ChangeSetId";
            String changeSetId = _changeSetSummary.getChangeSetId();
            request.addParameter(prefix, StringUtils.fromString(changeSetId));
        }
        if (_changeSetSummary.getChangeSetName() != null) {
            prefix = _prefix + "ChangeSetName";
            String changeSetName = _changeSetSummary.getChangeSetName();
            request.addParameter(prefix, StringUtils.fromString(changeSetName));
        }
        if (_changeSetSummary.getExecutionStatus() != null) {
            prefix = _prefix + "ExecutionStatus";
            String executionStatus = _changeSetSummary.getExecutionStatus();
            request.addParameter(prefix, StringUtils.fromString(executionStatus));
        }
        if (_changeSetSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _changeSetSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_changeSetSummary.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _changeSetSummary.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
        if (_changeSetSummary.getCreationTime() != null) {
            prefix = _prefix + "CreationTime";
            java.util.Date creationTime = _changeSetSummary.getCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(creationTime));
        }
        if (_changeSetSummary.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _changeSetSummary.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static ChangeSetSummaryStaxMarshaller instance;

    public static ChangeSetSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeSetSummaryStaxMarshaller();
        return instance;
    }
}
