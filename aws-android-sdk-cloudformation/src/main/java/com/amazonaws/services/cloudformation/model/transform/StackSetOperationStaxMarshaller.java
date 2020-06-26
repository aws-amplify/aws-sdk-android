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
 * StAX marshaller for POJO StackSetOperation
 */
class StackSetOperationStaxMarshaller {

    public void marshall(StackSetOperation _stackSetOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_stackSetOperation.getOperationId() != null) {
            prefix = _prefix + "OperationId";
            String operationId = _stackSetOperation.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }
        if (_stackSetOperation.getStackSetId() != null) {
            prefix = _prefix + "StackSetId";
            String stackSetId = _stackSetOperation.getStackSetId();
            request.addParameter(prefix, StringUtils.fromString(stackSetId));
        }
        if (_stackSetOperation.getAction() != null) {
            prefix = _prefix + "Action";
            String action = _stackSetOperation.getAction();
            request.addParameter(prefix, StringUtils.fromString(action));
        }
        if (_stackSetOperation.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackSetOperation.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackSetOperation.getOperationPreferences() != null) {
            prefix = _prefix + "OperationPreferences";
            StackSetOperationPreferences operationPreferences = _stackSetOperation
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (_stackSetOperation.getRetainStacks() != null) {
            prefix = _prefix + "RetainStacks";
            Boolean retainStacks = _stackSetOperation.getRetainStacks();
            request.addParameter(prefix, StringUtils.fromBoolean(retainStacks));
        }
        if (_stackSetOperation.getAdministrationRoleARN() != null) {
            prefix = _prefix + "AdministrationRoleARN";
            String administrationRoleARN = _stackSetOperation.getAdministrationRoleARN();
            request.addParameter(prefix, StringUtils.fromString(administrationRoleARN));
        }
        if (_stackSetOperation.getExecutionRoleName() != null) {
            prefix = _prefix + "ExecutionRoleName";
            String executionRoleName = _stackSetOperation.getExecutionRoleName();
            request.addParameter(prefix, StringUtils.fromString(executionRoleName));
        }
        if (_stackSetOperation.getCreationTimestamp() != null) {
            prefix = _prefix + "CreationTimestamp";
            java.util.Date creationTimestamp = _stackSetOperation.getCreationTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(creationTimestamp));
        }
        if (_stackSetOperation.getEndTimestamp() != null) {
            prefix = _prefix + "EndTimestamp";
            java.util.Date endTimestamp = _stackSetOperation.getEndTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(endTimestamp));
        }
        if (_stackSetOperation.getDeploymentTargets() != null) {
            prefix = _prefix + "DeploymentTargets";
            DeploymentTargets deploymentTargets = _stackSetOperation.getDeploymentTargets();
            DeploymentTargetsStaxMarshaller.getInstance().marshall(deploymentTargets, request,
                    prefix + ".");
        }
        if (_stackSetOperation.getStackSetDriftDetectionDetails() != null) {
            prefix = _prefix + "StackSetDriftDetectionDetails";
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails = _stackSetOperation
                    .getStackSetDriftDetectionDetails();
            StackSetDriftDetectionDetailsStaxMarshaller.getInstance().marshall(
                    stackSetDriftDetectionDetails, request, prefix + ".");
        }
    }

    private static StackSetOperationStaxMarshaller instance;

    public static StackSetOperationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationStaxMarshaller();
        return instance;
    }
}
