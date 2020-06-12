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
 * StAX marshaller for POJO StackSet
 */
class StackSetStaxMarshaller {

    public void marshall(StackSet _stackSet, Request<?> request, String _prefix) {
        String prefix;
        if (_stackSet.getStackSetName() != null) {
            prefix = _prefix + "StackSetName";
            String stackSetName = _stackSet.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (_stackSet.getStackSetId() != null) {
            prefix = _prefix + "StackSetId";
            String stackSetId = _stackSet.getStackSetId();
            request.addParameter(prefix, StringUtils.fromString(stackSetId));
        }
        if (_stackSet.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _stackSet.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_stackSet.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackSet.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackSet.getTemplateBody() != null) {
            prefix = _prefix + "TemplateBody";
            String templateBody = _stackSet.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (_stackSet.getParameters() != null) {
            prefix = _prefix + "Parameters";
            java.util.List<Parameter> parameters = _stackSet.getParameters();
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
        if (_stackSet.getCapabilities() != null) {
            prefix = _prefix + "Capabilities";
            java.util.List<String> capabilities = _stackSet.getCapabilities();
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
        if (_stackSet.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _stackSet.getTags();
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
        if (_stackSet.getStackSetARN() != null) {
            prefix = _prefix + "StackSetARN";
            String stackSetARN = _stackSet.getStackSetARN();
            request.addParameter(prefix, StringUtils.fromString(stackSetARN));
        }
        if (_stackSet.getAdministrationRoleARN() != null) {
            prefix = _prefix + "AdministrationRoleARN";
            String administrationRoleARN = _stackSet.getAdministrationRoleARN();
            request.addParameter(prefix, StringUtils.fromString(administrationRoleARN));
        }
        if (_stackSet.getExecutionRoleName() != null) {
            prefix = _prefix + "ExecutionRoleName";
            String executionRoleName = _stackSet.getExecutionRoleName();
            request.addParameter(prefix, StringUtils.fromString(executionRoleName));
        }
        if (_stackSet.getStackSetDriftDetectionDetails() != null) {
            prefix = _prefix + "StackSetDriftDetectionDetails";
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails = _stackSet
                    .getStackSetDriftDetectionDetails();
            StackSetDriftDetectionDetailsStaxMarshaller.getInstance().marshall(
                    stackSetDriftDetectionDetails, request, prefix + ".");
        }
        if (_stackSet.getAutoDeployment() != null) {
            prefix = _prefix + "AutoDeployment";
            AutoDeployment autoDeployment = _stackSet.getAutoDeployment();
            AutoDeploymentStaxMarshaller.getInstance().marshall(autoDeployment, request,
                    prefix + ".");
        }
        if (_stackSet.getPermissionModel() != null) {
            prefix = _prefix + "PermissionModel";
            String permissionModel = _stackSet.getPermissionModel();
            request.addParameter(prefix, StringUtils.fromString(permissionModel));
        }
        if (_stackSet.getOrganizationalUnitIds() != null) {
            prefix = _prefix + "OrganizationalUnitIds";
            java.util.List<String> organizationalUnitIds = _stackSet.getOrganizationalUnitIds();
            int organizationalUnitIdsIndex = 1;
            String organizationalUnitIdsPrefix = prefix;
            for (String organizationalUnitIdsItem : organizationalUnitIds) {
                prefix = organizationalUnitIdsPrefix + ".member." + organizationalUnitIdsIndex;
                if (organizationalUnitIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(organizationalUnitIdsItem));
                }
                organizationalUnitIdsIndex++;
            }
            prefix = organizationalUnitIdsPrefix;
        }
    }

    private static StackSetStaxMarshaller instance;

    public static StackSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetStaxMarshaller();
        return instance;
    }
}
