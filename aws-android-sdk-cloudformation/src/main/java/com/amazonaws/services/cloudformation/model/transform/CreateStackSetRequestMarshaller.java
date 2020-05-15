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
 * StAX request marshaller for CreateStackSetRequest
 */
public class CreateStackSetRequestMarshaller implements
        Marshaller<Request<CreateStackSetRequest>, CreateStackSetRequest> {

    public Request<CreateStackSetRequest> marshall(CreateStackSetRequest createStackSetRequest) {
        if (createStackSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateStackSetRequest)");
        }

        Request<CreateStackSetRequest> request = new DefaultRequest<CreateStackSetRequest>(
                createStackSetRequest, "AWSCloudFormation");
        request.addParameter("Action", "CreateStackSet");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (createStackSetRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = createStackSetRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (createStackSetRequest.getDescription() != null) {
            prefix = "Description";
            String description = createStackSetRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createStackSetRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = createStackSetRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (createStackSetRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = createStackSetRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (createStackSetRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = createStackSetRequest.getParameters();
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
        if (createStackSetRequest.getCapabilities() != null) {
            prefix = "Capabilities";
            java.util.List<String> capabilities = createStackSetRequest.getCapabilities();
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
        if (createStackSetRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createStackSetRequest.getTags();
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
        if (createStackSetRequest.getAdministrationRoleARN() != null) {
            prefix = "AdministrationRoleARN";
            String administrationRoleARN = createStackSetRequest.getAdministrationRoleARN();
            request.addParameter(prefix, StringUtils.fromString(administrationRoleARN));
        }
        if (createStackSetRequest.getExecutionRoleName() != null) {
            prefix = "ExecutionRoleName";
            String executionRoleName = createStackSetRequest.getExecutionRoleName();
            request.addParameter(prefix, StringUtils.fromString(executionRoleName));
        }
        if (createStackSetRequest.getPermissionModel() != null) {
            prefix = "PermissionModel";
            String permissionModel = createStackSetRequest.getPermissionModel();
            request.addParameter(prefix, StringUtils.fromString(permissionModel));
        }
        if (createStackSetRequest.getAutoDeployment() != null) {
            prefix = "AutoDeployment";
            AutoDeployment autoDeployment = createStackSetRequest.getAutoDeployment();
            AutoDeploymentStaxMarshaller.getInstance().marshall(autoDeployment, request,
                    prefix + ".");
        }
        if (createStackSetRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = createStackSetRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
