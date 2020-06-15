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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HostedConfigurationVersionSummary
 */
class HostedConfigurationVersionSummaryJsonMarshaller {

    public void marshall(HostedConfigurationVersionSummary hostedConfigurationVersionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hostedConfigurationVersionSummary.getApplicationId() != null) {
            String applicationId = hostedConfigurationVersionSummary.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (hostedConfigurationVersionSummary.getConfigurationProfileId() != null) {
            String configurationProfileId = hostedConfigurationVersionSummary
                    .getConfigurationProfileId();
            jsonWriter.name("ConfigurationProfileId");
            jsonWriter.value(configurationProfileId);
        }
        if (hostedConfigurationVersionSummary.getVersionNumber() != null) {
            Integer versionNumber = hostedConfigurationVersionSummary.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (hostedConfigurationVersionSummary.getDescription() != null) {
            String description = hostedConfigurationVersionSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (hostedConfigurationVersionSummary.getContentType() != null) {
            String contentType = hostedConfigurationVersionSummary.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        jsonWriter.endObject();
    }

    private static HostedConfigurationVersionSummaryJsonMarshaller instance;

    public static HostedConfigurationVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostedConfigurationVersionSummaryJsonMarshaller();
        return instance;
    }
}
