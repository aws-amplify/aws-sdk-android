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
 * StAX request marshaller for CreateChangeSetRequest
 */
public class CreateChangeSetRequestMarshaller implements
        Marshaller<Request<CreateChangeSetRequest>, CreateChangeSetRequest> {

    public Request<CreateChangeSetRequest> marshall(CreateChangeSetRequest createChangeSetRequest) {
        if (createChangeSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateChangeSetRequest)");
        }

        Request<CreateChangeSetRequest> request = new DefaultRequest<CreateChangeSetRequest>(
                createChangeSetRequest, "AWSCloudFormation");
        request.addParameter("Action", "CreateChangeSet");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (createChangeSetRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = createChangeSetRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (createChangeSetRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = createChangeSetRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (createChangeSetRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = createChangeSetRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (createChangeSetRequest.getUsePreviousTemplate() != null) {
            prefix = "UsePreviousTemplate";
            Boolean usePreviousTemplate = createChangeSetRequest.getUsePreviousTemplate();
            request.addParameter(prefix, StringUtils.fromBoolean(usePreviousTemplate));
        }
        if (createChangeSetRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = createChangeSetRequest.getParameters();
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
        if (createChangeSetRequest.getCapabilities() != null) {
            prefix = "Capabilities";
            java.util.List<String> capabilities = createChangeSetRequest.getCapabilities();
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
        if (createChangeSetRequest.getResourceTypes() != null) {
            prefix = "ResourceTypes";
            java.util.List<String> resourceTypes = createChangeSetRequest.getResourceTypes();
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
        if (createChangeSetRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = createChangeSetRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (createChangeSetRequest.getRollbackConfiguration() != null) {
            prefix = "RollbackConfiguration";
            RollbackConfiguration rollbackConfiguration = createChangeSetRequest
                    .getRollbackConfiguration();
            RollbackConfigurationStaxMarshaller.getInstance().marshall(rollbackConfiguration,
                    request, prefix + ".");
        }
        if (createChangeSetRequest.getNotificationARNs() != null) {
            prefix = "NotificationARNs";
            java.util.List<String> notificationARNs = createChangeSetRequest.getNotificationARNs();
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
        if (createChangeSetRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createChangeSetRequest.getTags();
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
        if (createChangeSetRequest.getChangeSetName() != null) {
            prefix = "ChangeSetName";
            String changeSetName = createChangeSetRequest.getChangeSetName();
            request.addParameter(prefix, StringUtils.fromString(changeSetName));
        }
        if (createChangeSetRequest.getClientToken() != null) {
            prefix = "ClientToken";
            String clientToken = createChangeSetRequest.getClientToken();
            request.addParameter(prefix, StringUtils.fromString(clientToken));
        }
        if (createChangeSetRequest.getDescription() != null) {
            prefix = "Description";
            String description = createChangeSetRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createChangeSetRequest.getChangeSetType() != null) {
            prefix = "ChangeSetType";
            String changeSetType = createChangeSetRequest.getChangeSetType();
            request.addParameter(prefix, StringUtils.fromString(changeSetType));
        }
        if (createChangeSetRequest.getResourcesToImport() != null) {
            prefix = "ResourcesToImport";
            java.util.List<ResourceToImport> resourcesToImport = createChangeSetRequest
                    .getResourcesToImport();
            int resourcesToImportIndex = 1;
            String resourcesToImportPrefix = prefix;
            for (ResourceToImport resourcesToImportItem : resourcesToImport) {
                prefix = resourcesToImportPrefix + ".member." + resourcesToImportIndex;
                if (resourcesToImportItem != null) {
                    ResourceToImportStaxMarshaller.getInstance().marshall(resourcesToImportItem,
                            request, prefix + ".");
                }
                resourcesToImportIndex++;
            }
            prefix = resourcesToImportPrefix;
        }

        return request;
    }
}
