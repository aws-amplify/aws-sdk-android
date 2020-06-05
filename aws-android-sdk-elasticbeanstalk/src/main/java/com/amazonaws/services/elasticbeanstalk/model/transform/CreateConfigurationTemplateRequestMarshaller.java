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
 * StAX request marshaller for CreateConfigurationTemplateRequest
 */
public class CreateConfigurationTemplateRequestMarshaller implements
        Marshaller<Request<CreateConfigurationTemplateRequest>, CreateConfigurationTemplateRequest> {

    public Request<CreateConfigurationTemplateRequest> marshall(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest) {
        if (createConfigurationTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateConfigurationTemplateRequest)");
        }

        Request<CreateConfigurationTemplateRequest> request = new DefaultRequest<CreateConfigurationTemplateRequest>(
                createConfigurationTemplateRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateConfigurationTemplate");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createConfigurationTemplateRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = createConfigurationTemplateRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (createConfigurationTemplateRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = createConfigurationTemplateRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (createConfigurationTemplateRequest.getSolutionStackName() != null) {
            prefix = "SolutionStackName";
            String solutionStackName = createConfigurationTemplateRequest.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (createConfigurationTemplateRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = createConfigurationTemplateRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (createConfigurationTemplateRequest.getSourceConfiguration() != null) {
            prefix = "SourceConfiguration";
            SourceConfiguration sourceConfiguration = createConfigurationTemplateRequest
                    .getSourceConfiguration();
            SourceConfigurationStaxMarshaller.getInstance().marshall(sourceConfiguration, request,
                    prefix + ".");
        }
        if (createConfigurationTemplateRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = createConfigurationTemplateRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (createConfigurationTemplateRequest.getDescription() != null) {
            prefix = "Description";
            String description = createConfigurationTemplateRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createConfigurationTemplateRequest.getOptionSettings() != null) {
            prefix = "OptionSettings";
            java.util.List<ConfigurationOptionSetting> optionSettings = createConfigurationTemplateRequest
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
        if (createConfigurationTemplateRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createConfigurationTemplateRequest.getTags();
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

        return request;
    }
}
