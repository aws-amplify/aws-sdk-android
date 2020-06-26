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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateStackSetRequest
 */
public class UpdateStackSetRequestMarshaller implements
        Marshaller<Request<UpdateStackSetRequest>, UpdateStackSetRequest> {

    public Request<UpdateStackSetRequest> marshall(UpdateStackSetRequest updateStackSetRequest) {
        if (updateStackSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateStackSetRequest)");
        }

        Request<UpdateStackSetRequest> request = new DefaultRequest<UpdateStackSetRequest>(
                updateStackSetRequest, "AWSCloudFormation");
        request.addParameter("Action", "UpdateStackSet");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (updateStackSetRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = updateStackSetRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (updateStackSetRequest.getDescription() != null) {
            prefix = "Description";
            String description = updateStackSetRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (updateStackSetRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = updateStackSetRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (updateStackSetRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = updateStackSetRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (updateStackSetRequest.getUsePreviousTemplate() != null) {
            prefix = "UsePreviousTemplate";
            Boolean usePreviousTemplate = updateStackSetRequest.getUsePreviousTemplate();
            request.addParameter(prefix, StringUtils.fromBoolean(usePreviousTemplate));
        }
        if (updateStackSetRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = updateStackSetRequest.getParameters();
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
        if (updateStackSetRequest.getCapabilities() != null) {
            prefix = "Capabilities";
            java.util.List<String> capabilities = updateStackSetRequest.getCapabilities();
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
        if (updateStackSetRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = updateStackSetRequest.getTags();
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
        if (updateStackSetRequest.getOperationPreferences() != null) {
            prefix = "OperationPreferences";
            StackSetOperationPreferences operationPreferences = updateStackSetRequest
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (updateStackSetRequest.getAdministrationRoleARN() != null) {
            prefix = "AdministrationRoleARN";
            String administrationRoleARN = updateStackSetRequest.getAdministrationRoleARN();
            request.addParameter(prefix, StringUtils.fromString(administrationRoleARN));
        }
        if (updateStackSetRequest.getExecutionRoleName() != null) {
            prefix = "ExecutionRoleName";
            String executionRoleName = updateStackSetRequest.getExecutionRoleName();
            request.addParameter(prefix, StringUtils.fromString(executionRoleName));
        }
        if (updateStackSetRequest.getDeploymentTargets() != null) {
            prefix = "DeploymentTargets";
            DeploymentTargets deploymentTargets = updateStackSetRequest.getDeploymentTargets();
            DeploymentTargetsStaxMarshaller.getInstance().marshall(deploymentTargets, request,
                    prefix + ".");
        }
        if (updateStackSetRequest.getPermissionModel() != null) {
            prefix = "PermissionModel";
            String permissionModel = updateStackSetRequest.getPermissionModel();
            request.addParameter(prefix, StringUtils.fromString(permissionModel));
        }
        if (updateStackSetRequest.getAutoDeployment() != null) {
            prefix = "AutoDeployment";
            AutoDeployment autoDeployment = updateStackSetRequest.getAutoDeployment();
            AutoDeploymentStaxMarshaller.getInstance().marshall(autoDeployment, request,
                    prefix + ".");
        }
        if (updateStackSetRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = updateStackSetRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }
        if (updateStackSetRequest.getAccounts() != null) {
            prefix = "Accounts";
            java.util.List<String> accounts = updateStackSetRequest.getAccounts();
            int accountsIndex = 1;
            String accountsPrefix = prefix;
            for (String accountsItem : accounts) {
                prefix = accountsPrefix + ".member." + accountsIndex;
                if (accountsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(accountsItem));
                }
                accountsIndex++;
            }
            prefix = accountsPrefix;
        }
        if (updateStackSetRequest.getRegions() != null) {
            prefix = "Regions";
            java.util.List<String> regions = updateStackSetRequest.getRegions();
            int regionsIndex = 1;
            String regionsPrefix = prefix;
            for (String regionsItem : regions) {
                prefix = regionsPrefix + ".member." + regionsIndex;
                if (regionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(regionsItem));
                }
                regionsIndex++;
            }
            prefix = regionsPrefix;
        }

        return request;
    }
}
