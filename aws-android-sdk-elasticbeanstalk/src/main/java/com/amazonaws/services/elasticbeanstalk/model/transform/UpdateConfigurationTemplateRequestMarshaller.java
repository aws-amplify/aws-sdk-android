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
 * StAX request marshaller for UpdateConfigurationTemplateRequest
 */
public class UpdateConfigurationTemplateRequestMarshaller implements
        Marshaller<Request<UpdateConfigurationTemplateRequest>, UpdateConfigurationTemplateRequest> {

    public Request<UpdateConfigurationTemplateRequest> marshall(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) {
        if (updateConfigurationTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateConfigurationTemplateRequest)");
        }

        Request<UpdateConfigurationTemplateRequest> request = new DefaultRequest<UpdateConfigurationTemplateRequest>(
                updateConfigurationTemplateRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateConfigurationTemplate");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (updateConfigurationTemplateRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = updateConfigurationTemplateRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (updateConfigurationTemplateRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = updateConfigurationTemplateRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (updateConfigurationTemplateRequest.getDescription() != null) {
            prefix = "Description";
            String description = updateConfigurationTemplateRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (updateConfigurationTemplateRequest.getOptionSettings() != null) {
            prefix = "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = updateConfigurationTemplateRequest
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
        if (updateConfigurationTemplateRequest.getOptionsToRemove() != null) {
            prefix = "OptionsToRemove";
            java.util.List<OptionSpecification> optionsToRemove = updateConfigurationTemplateRequest
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
