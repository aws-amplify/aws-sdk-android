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
 * StAX request marshaller for UpdateEnvironmentRequest
 */
public class UpdateEnvironmentRequestMarshaller implements
        Marshaller<Request<UpdateEnvironmentRequest>, UpdateEnvironmentRequest> {

    public Request<UpdateEnvironmentRequest> marshall(
            UpdateEnvironmentRequest updateEnvironmentRequest) {
        if (updateEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateEnvironmentRequest)");
        }

        Request<UpdateEnvironmentRequest> request = new DefaultRequest<UpdateEnvironmentRequest>(
                updateEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateEnvironment");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (updateEnvironmentRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = updateEnvironmentRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (updateEnvironmentRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = updateEnvironmentRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (updateEnvironmentRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = updateEnvironmentRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (updateEnvironmentRequest.getGroupName() != null) {
            prefix = "GroupName";
            String groupName = updateEnvironmentRequest.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (updateEnvironmentRequest.getDescription() != null) {
            prefix = "Description";
            String description = updateEnvironmentRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (updateEnvironmentRequest.getTier() != null) {
            prefix = "Tier";
            EnvironmentTier tier = updateEnvironmentRequest.getTier();
            EnvironmentTierStaxMarshaller.getInstance().marshall(tier, request, prefix + ".");
        }
        if (updateEnvironmentRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = updateEnvironmentRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (updateEnvironmentRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = updateEnvironmentRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (updateEnvironmentRequest.getSolutionStackName() != null) {
            prefix = "SolutionStackName";
            String solutionStackName = updateEnvironmentRequest.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (updateEnvironmentRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = updateEnvironmentRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (updateEnvironmentRequest.getOptionSettings() != null) {
            prefix = "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = updateEnvironmentRequest
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
        if (updateEnvironmentRequest.getOptionsToRemove() != null) {
            prefix = "OptionsToRemove";
            java.util.List<OptionSpecification> optionsToRemove = updateEnvironmentRequest
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

        return request;
    }
}
