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
 * StAX request marshaller for UpdateStackRequest
 */
public class UpdateStackRequestMarshaller implements
        Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    public Request<UpdateStackRequest> marshall(UpdateStackRequest updateStackRequest) {
        if (updateStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateStackRequest)");
        }

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(
                updateStackRequest, "AWSCloudFormation");
        request.addParameter("Action", "UpdateStack");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (updateStackRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = updateStackRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (updateStackRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = updateStackRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (updateStackRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = updateStackRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (updateStackRequest.getUsePreviousTemplate() != null) {
            prefix = "UsePreviousTemplate";
            Boolean usePreviousTemplate = updateStackRequest.getUsePreviousTemplate();
            request.addParameter(prefix, StringUtils.fromBoolean(usePreviousTemplate));
        }
        if (updateStackRequest.getStackPolicyDuringUpdateBody() != null) {
            prefix = "StackPolicyDuringUpdateBody";
            String stackPolicyDuringUpdateBody = updateStackRequest
                    .getStackPolicyDuringUpdateBody();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyDuringUpdateBody));
        }
        if (updateStackRequest.getStackPolicyDuringUpdateURL() != null) {
            prefix = "StackPolicyDuringUpdateURL";
            String stackPolicyDuringUpdateURL = updateStackRequest.getStackPolicyDuringUpdateURL();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyDuringUpdateURL));
        }
        if (updateStackRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = updateStackRequest.getParameters();
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
        if (updateStackRequest.getCapabilities() != null) {
            prefix = "Capabilities";
            java.util.List<String> capabilities = updateStackRequest.getCapabilities();
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
        if (updateStackRequest.getResourceTypes() != null) {
            prefix = "ResourceTypes";
            java.util.List<String> resourceTypes = updateStackRequest.getResourceTypes();
            int resourceTypesIndex = 1;
            String resourceTypesPrefix = prefix;
            for (String resourceTypesItem : resourceTypes) {
                prefix = resourceTypesPrefix + ".member." + resourceTypesIndex;
                if (resourceTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourceTypesItem));
                }
                resourceTypesIndex++;
            }
            prefix = resourceTypesPrefix;
        }
        if (updateStackRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = updateStackRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (updateStackRequest.getRollbackConfiguration() != null) {
            prefix = "RollbackConfiguration";
            RollbackConfiguration rollbackConfiguration = updateStackRequest
                    .getRollbackConfiguration();
            RollbackConfigurationStaxMarshaller.getInstance().marshall(rollbackConfiguration,
                    request, prefix + ".");
        }
        if (updateStackRequest.getStackPolicyBody() != null) {
            prefix = "StackPolicyBody";
            String stackPolicyBody = updateStackRequest.getStackPolicyBody();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyBody));
        }
        if (updateStackRequest.getStackPolicyURL() != null) {
            prefix = "StackPolicyURL";
            String stackPolicyURL = updateStackRequest.getStackPolicyURL();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyURL));
        }
        if (updateStackRequest.getNotificationARNs() != null) {
            prefix = "NotificationARNs";
            java.util.List<String> notificationARNs = updateStackRequest.getNotificationARNs();
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
        if (updateStackRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = updateStackRequest.getTags();
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
        if (updateStackRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = updateStackRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
