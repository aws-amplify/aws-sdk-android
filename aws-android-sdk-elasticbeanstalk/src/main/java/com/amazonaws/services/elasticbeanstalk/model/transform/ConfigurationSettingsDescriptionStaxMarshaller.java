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

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ConfigurationSettingsDescription
 */
class ConfigurationSettingsDescriptionStaxMarshaller {

    public void marshall(ConfigurationSettingsDescription _configurationSettingsDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_configurationSettingsDescription.getSolutionStackName() != null) {
            prefix = _prefix + "SolutionStackName";
            String solutionStackName = _configurationSettingsDescription.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (_configurationSettingsDescription.getPlatformArn() != null) {
            prefix = _prefix + "PlatformArn";
            String platformArn = _configurationSettingsDescription.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (_configurationSettingsDescription.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _configurationSettingsDescription.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_configurationSettingsDescription.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _configurationSettingsDescription.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (_configurationSettingsDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _configurationSettingsDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_configurationSettingsDescription.getEnvironmentName() != null) {
            prefix = _prefix + "EnvironmentName";
            String environmentName = _configurationSettingsDescription.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (_configurationSettingsDescription.getDeploymentStatus() != null) {
            prefix = _prefix + "DeploymentStatus";
            String deploymentStatus = _configurationSettingsDescription.getDeploymentStatus();
            request.addParameter(prefix, StringUtils.fromString(deploymentStatus));
        }
        if (_configurationSettingsDescription.getDateCreated() != null) {
            prefix = _prefix + "DateCreated";
            java.util.Date dateCreated = _configurationSettingsDescription.getDateCreated();
            request.addParameter(prefix, StringUtils.fromDate(dateCreated));
        }
        if (_configurationSettingsDescription.getDateUpdated() != null) {
            prefix = _prefix + "DateUpdated";
            java.util.Date dateUpdated = _configurationSettingsDescription.getDateUpdated();
            request.addParameter(prefix, StringUtils.fromDate(dateUpdated));
        }
        if (_configurationSettingsDescription.getOptionSettings() != null) {
            prefix = _prefix + "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = _configurationSettingsDescription
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
    }

    private static ConfigurationSettingsDescriptionStaxMarshaller instance;

    public static ConfigurationSettingsDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationSettingsDescriptionStaxMarshaller();
        return instance;
    }
}
