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
 * StAX marshaller for POJO Stack
 */
class StackStaxMarshaller {

    public void marshall(Stack _stack, Request<?> request, String _prefix) {
        String prefix;
        if (_stack.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stack.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stack.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _stack.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_stack.getChangeSetId() != null) {
            prefix = _prefix + "ChangeSetId";
            String changeSetId = _stack.getChangeSetId();
            request.addParameter(prefix, StringUtils.fromString(changeSetId));
        }
        if (_stack.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _stack.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_stack.getParameters() != null) {
            prefix = _prefix + "Parameters";
            java.util.List<Parameter> parameters = _stack.getParameters();
            int parametersIndex = 1;
            String parametersPrefix = prefix;
            for (Parameter parametersItem : parameters) {
                prefix = parametersPrefix + ".member." + parametersIndex;
                if (parametersItem != null) {
                    ParameterStaxMarshaller.getInstance().marshall(parametersItem, request,
                            prefix + ".");
                }
                parametersIndex++;
            }
            prefix = parametersPrefix;
        }
        if (_stack.getCreationTime() != null) {
            prefix = _prefix + "CreationTime";
            java.util.Date creationTime = _stack.getCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(creationTime));
        }
        if (_stack.getDeletionTime() != null) {
            prefix = _prefix + "DeletionTime";
            java.util.Date deletionTime = _stack.getDeletionTime();
            request.addParameter(prefix, StringUtils.fromDate(deletionTime));
        }
        if (_stack.getLastUpdatedTime() != null) {
            prefix = _prefix + "LastUpdatedTime";
            java.util.Date lastUpdatedTime = _stack.getLastUpdatedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastUpdatedTime));
        }
        if (_stack.getRollbackConfiguration() != null) {
            prefix = _prefix + "RollbackConfiguration";
            RollbackConfiguration rollbackConfiguration = _stack.getRollbackConfiguration();
            RollbackConfigurationStaxMarshaller.getInstance().marshall(rollbackConfiguration,
                    request, prefix + ".");
        }
        if (_stack.getStackStatus() != null) {
            prefix = _prefix + "StackStatus";
            String stackStatus = _stack.getStackStatus();
            request.addParameter(prefix, StringUtils.fromString(stackStatus));
        }
        if (_stack.getStackStatusReason() != null) {
            prefix = _prefix + "StackStatusReason";
            String stackStatusReason = _stack.getStackStatusReason();
            request.addParameter(prefix, StringUtils.fromString(stackStatusReason));
        }
        if (_stack.getDisableRollback() != null) {
            prefix = _prefix + "DisableRollback";
            Boolean disableRollback = _stack.getDisableRollback();
            request.addParameter(prefix, StringUtils.fromBoolean(disableRollback));
        }
        if (_stack.getNotificationARNs() != null) {
            prefix = _prefix + "NotificationARNs";
            java.util.List<String> notificationARNs = _stack.getNotificationARNs();
            int notificationARNsIndex = 1;
            String notificationARNsPrefix = prefix;
            for (String notificationARNsItem : notificationARNs) {
                prefix = notificationARNsPrefix + ".member." + notificationARNsIndex;
                if (notificationARNsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(notificationARNsItem));
                }
                notificationARNsIndex++;
            }
            prefix = notificationARNsPrefix;
        }
        if (_stack.getTimeoutInMinutes() != null) {
            prefix = _prefix + "TimeoutInMinutes";
            Integer timeoutInMinutes = _stack.getTimeoutInMinutes();
            request.addParameter(prefix, StringUtils.fromInteger(timeoutInMinutes));
        }
        if (_stack.getCapabilities() != null) {
            prefix = _prefix + "Capabilities";
            java.util.List<String> capabilities = _stack.getCapabilities();
            int capabilitiesIndex = 1;
            String capabilitiesPrefix = prefix;
            for (String capabilitiesItem : capabilities) {
                prefix = capabilitiesPrefix + ".member." + capabilitiesIndex;
                if (capabilitiesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(capabilitiesItem));
                }
                capabilitiesIndex++;
            }
            prefix = capabilitiesPrefix;
        }
        if (_stack.getOutputs() != null) {
            prefix = _prefix + "Outputs";
            java.util.List<Output> outputs = _stack.getOutputs();
            int outputsIndex = 1;
            String outputsPrefix = prefix;
            for (Output outputsItem : outputs) {
                prefix = outputsPrefix + ".member." + outputsIndex;
                if (outputsItem != null) {
                    OutputStaxMarshaller.getInstance().marshall(outputsItem, request, prefix + ".");
                }
                outputsIndex++;
            }
            prefix = outputsPrefix;
        }
        if (_stack.getRoleARN() != null) {
            prefix = _prefix + "RoleARN";
            String roleARN = _stack.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (_stack.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _stack.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (_stack.getEnableTerminationProtection() != null) {
            prefix = _prefix + "EnableTerminationProtection";
            Boolean enableTerminationProtection = _stack.getEnableTerminationProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(enableTerminationProtection));
        }
        if (_stack.getParentId() != null) {
            prefix = _prefix + "ParentId";
            String parentId = _stack.getParentId();
            request.addParameter(prefix, StringUtils.fromString(parentId));
        }
        if (_stack.getRootId() != null) {
            prefix = _prefix + "RootId";
            String rootId = _stack.getRootId();
            request.addParameter(prefix, StringUtils.fromString(rootId));
        }
        if (_stack.getDriftInformation() != null) {
            prefix = _prefix + "DriftInformation";
            StackDriftInformation driftInformation = _stack.getDriftInformation();
            StackDriftInformationStaxMarshaller.getInstance().marshall(driftInformation, request,
                    prefix + ".");
        }
    }

    private static StackStaxMarshaller instance;

    public static StackStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackStaxMarshaller();
        return instance;
    }
}
