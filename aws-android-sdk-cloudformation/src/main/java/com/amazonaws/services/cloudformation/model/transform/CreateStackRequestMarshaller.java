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
 * StAX request marshaller for CreateStackRequest
 */
public class CreateStackRequestMarshaller implements
        Marshaller<Request<CreateStackRequest>, CreateStackRequest> {

    public Request<CreateStackRequest> marshall(CreateStackRequest createStackRequest) {
        if (createStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateStackRequest)");
        }

        Request<CreateStackRequest> request = new DefaultRequest<CreateStackRequest>(
                createStackRequest, "AWSCloudFormation");
        request.addParameter("Action", "CreateStack");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (createStackRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = createStackRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (createStackRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = createStackRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (createStackRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = createStackRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (createStackRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = createStackRequest.getParameters();
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
        if (createStackRequest.getDisableRollback() != null) {
            prefix = "DisableRollback";
            Boolean disableRollback = createStackRequest.getDisableRollback();
            request.addParameter(prefix, StringUtils.fromBoolean(disableRollback));
        }
        if (createStackRequest.getRollbackConfiguration() != null) {
            prefix = "RollbackConfiguration";
            RollbackConfiguration rollbackConfiguration = createStackRequest
                    .getRollbackConfiguration();
            RollbackConfigurationStaxMarshaller.getInstance().marshall(rollbackConfiguration,
                    request, prefix + ".");
        }
        if (createStackRequest.getTimeoutInMinutes() != null) {
            prefix = "TimeoutInMinutes";
            Integer timeoutInMinutes = createStackRequest.getTimeoutInMinutes();
            request.addParameter(prefix, StringUtils.fromInteger(timeoutInMinutes));
        }
        if (createStackRequest.getNotificationARNs() != null) {
            prefix = "NotificationARNs";
            java.util.List<String> notificationARNs = createStackRequest.getNotificationARNs();
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
        if (createStackRequest.getCapabilities() != null) {
            prefix = "Capabilities";
            java.util.List<String> capabilities = createStackRequest.getCapabilities();
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
        if (createStackRequest.getResourceTypes() != null) {
            prefix = "ResourceTypes";
            java.util.List<String> resourceTypes = createStackRequest.getResourceTypes();
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
        if (createStackRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = createStackRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (createStackRequest.getOnFailure() != null) {
            prefix = "OnFailure";
            String onFailure = createStackRequest.getOnFailure();
            request.addParameter(prefix, StringUtils.fromString(onFailure));
        }
        if (createStackRequest.getStackPolicyBody() != null) {
            prefix = "StackPolicyBody";
            String stackPolicyBody = createStackRequest.getStackPolicyBody();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyBody));
        }
        if (createStackRequest.getStackPolicyURL() != null) {
            prefix = "StackPolicyURL";
            String stackPolicyURL = createStackRequest.getStackPolicyURL();
            request.addParameter(prefix, StringUtils.fromString(stackPolicyURL));
        }
        if (createStackRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createStackRequest.getTags();
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
        if (createStackRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = createStackRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }
        if (createStackRequest.getEnableTerminationProtection() != null) {
            prefix = "EnableTerminationProtection";
            Boolean enableTerminationProtection = createStackRequest
                    .getEnableTerminationProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(enableTerminationProtection));
        }

        return request;
    }
}
