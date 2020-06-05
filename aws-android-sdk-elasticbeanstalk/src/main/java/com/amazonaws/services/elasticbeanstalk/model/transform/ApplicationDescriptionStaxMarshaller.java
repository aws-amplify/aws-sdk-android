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
 * StAX marshaller for POJO ApplicationDescription
 */
class ApplicationDescriptionStaxMarshaller {

    public void marshall(ApplicationDescription _applicationDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_applicationDescription.getApplicationArn() != null) {
            prefix = _prefix + "ApplicationArn";
            String applicationArn = _applicationDescription.getApplicationArn();
            request.addParameter(prefix, StringUtils.fromString(applicationArn));
        }
        if (_applicationDescription.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _applicationDescription.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_applicationDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _applicationDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_applicationDescription.getDateCreated() != null) {
            prefix = _prefix + "DateCreated";
            java.util.Date dateCreated = _applicationDescription.getDateCreated();
            request.addParameter(prefix, StringUtils.fromDate(dateCreated));
        }
        if (_applicationDescription.getDateUpdated() != null) {
            prefix = _prefix + "DateUpdated";
            java.util.Date dateUpdated = _applicationDescription.getDateUpdated();
            request.addParameter(prefix, StringUtils.fromDate(dateUpdated));
        }
        if (_applicationDescription.getVersions() != null) {
            prefix = _prefix + "Versions";
            java.util.List<String> versions = _applicationDescription.getVersions();
            int versionsIndex = 1;
            String versionsPrefix = prefix;
            for (String versionsItem : versions) {
                prefix = versionsPrefix + ".member." + versionsIndex;
                if (versionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(versionsItem));
                }
                versionsIndex++;
            }
            prefix = versionsPrefix;
        }
        if (_applicationDescription.getConfigurationTemplates() != null) {
            prefix = _prefix + "ConfigurationTemplates";
            java.util.List<String> configurationTemplates = _applicationDescription
                    .getConfigurationTemplates();
            int configurationTemplatesIndex = 1;
            String configurationTemplatesPrefix = prefix;
            for (String configurationTemplatesItem : configurationTemplates) {
                prefix = configurationTemplatesPrefix + ".member." + configurationTemplatesIndex;
                if (configurationTemplatesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(configurationTemplatesItem));
                }
                configurationTemplatesIndex++;
            }
            prefix = configurationTemplatesPrefix;
        }
        if (_applicationDescription.getResourceLifecycleConfig() != null) {
            prefix = _prefix + "ResourceLifecycleConfig";
            ApplicationResourceLifecycleConfig resourceLifecycleConfig = _applicationDescription
                    .getResourceLifecycleConfig();
            ApplicationResourceLifecycleConfigStaxMarshaller.getInstance().marshall(
                    resourceLifecycleConfig, request, prefix + ".");
        }
    }

    private static ApplicationDescriptionStaxMarshaller instance;

    public static ApplicationDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDescriptionStaxMarshaller();
        return instance;
    }
}
