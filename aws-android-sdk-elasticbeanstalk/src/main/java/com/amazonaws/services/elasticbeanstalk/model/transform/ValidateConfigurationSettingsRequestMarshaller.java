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
 * StAX request marshaller for ValidateConfigurationSettingsRequest
 */
public class ValidateConfigurationSettingsRequestMarshaller
        implements
        Marshaller<Request<ValidateConfigurationSettingsRequest>, ValidateConfigurationSettingsRequest> {

    public Request<ValidateConfigurationSettingsRequest> marshall(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {
        if (validateConfigurationSettingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ValidateConfigurationSettingsRequest)");
        }

        Request<ValidateConfigurationSettingsRequest> request = new DefaultRequest<ValidateConfigurationSettingsRequest>(
                validateConfigurationSettingsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "ValidateConfigurationSettings");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (validateConfigurationSettingsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = validateConfigurationSettingsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (validateConfigurationSettingsRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = validateConfigurationSettingsRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (validateConfigurationSettingsRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = validateConfigurationSettingsRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (validateConfigurationSettingsRequest.getOptionSettings() != null) {
            prefix = "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = validateConfigurationSettingsRequest
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

        return request;
    }
}
