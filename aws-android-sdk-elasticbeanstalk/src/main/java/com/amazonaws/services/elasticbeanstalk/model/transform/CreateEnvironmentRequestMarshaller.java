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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateEnvironmentRequest
 */
public class CreateEnvironmentRequestMarshaller implements
        Marshaller<Request<CreateEnvironmentRequest>, CreateEnvironmentRequest> {

    public Request<CreateEnvironmentRequest> marshall(
            CreateEnvironmentRequest createEnvironmentRequest) {
        if (createEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEnvironmentRequest)");
        }

        Request<CreateEnvironmentRequest> request = new DefaultRequest<CreateEnvironmentRequest>(
                createEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateEnvironment");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createEnvironmentRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = createEnvironmentRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (createEnvironmentRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = createEnvironmentRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (createEnvironmentRequest.getGroupName() != null) {
            prefix = "GroupName";
            String groupName = createEnvironmentRequest.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (createEnvironmentRequest.getDescription() != null) {
            prefix = "Description";
            String description = createEnvironmentRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createEnvironmentRequest.getCNAMEPrefix() != null) {
            prefix = "CNAMEPrefix";
            String cNAMEPrefix = createEnvironmentRequest.getCNAMEPrefix();
            request.addParameter(prefix, StringUtils.fromString(cNAMEPrefix));
        }
        if (createEnvironmentRequest.getTier() != null) {
            prefix = "Tier";
            EnvironmentTier tier = createEnvironmentRequest.getTier();
            EnvironmentTierStaxMarshaller.getInstance().marshall(tier, request, prefix + ".");
        }
        if (createEnvironmentRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createEnvironmentRequest.getTags();
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
        if (createEnvironmentRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = createEnvironmentRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (createEnvironmentRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = createEnvironmentRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (createEnvironmentRequest.getSolutionStackName() != null) {
            prefix = "SolutionStackName";
            String solutionStackName = createEnvironmentRequest.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (createEnvironmentRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = createEnvironmentRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (createEnvironmentRequest.getOptionSettings() != null) {
            prefix = "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = createEnvironmentRequest
                    .getOptionSettings();
            int optionSettingsIndex = 1;
            String optionSettingsPrefix = prefix;
            for (ConfigurationOptionSetting optionSettingsItem : optionSettings) {
                prefix = optionSettingsPrefix + ".member." + optionSettingsIndex;
                if (optionSettingsItem != null) {
                    ConfigurationOptionSettingStaxMarshaller.getInstance().marshall(
                            optionSettingsItem, request, prefix + ".");
                }
                optionSettingsIndex++;
            }
            prefix = optionSettingsPrefix;
        }
        if (createEnvironmentRequest.getOptionsToRemove() != null) {
            prefix = "OptionsToRemove";
            java.util.List<OptionSpecification> optionsToRemove = createEnvironmentRequest
                    .getOptionsToRemove();
            int optionsToRemoveIndex = 1;
            String optionsToRemovePrefix = prefix;
            for (OptionSpecification optionsToRemoveItem : optionsToRemove) {
                prefix = optionsToRemovePrefix + ".member." + optionsToRemoveIndex;
                if (optionsToRemoveItem != null) {
                    OptionSpecificationStaxMarshaller.getInstance().marshall(optionsToRemoveItem,
                            request, prefix + ".");
                }
                optionsToRemoveIndex++;
            }
            prefix = optionsToRemovePrefix;
        }
        if (createEnvironmentRequest.getOperationsRole() != null) {
            prefix = "OperationsRole";
            String operationsRole = createEnvironmentRequest.getOperationsRole();
            request.addParameter(prefix, StringUtils.fromString(operationsRole));
        }

        return request;
    }
}
