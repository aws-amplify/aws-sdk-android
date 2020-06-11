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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AmiDistributionConfiguration
 */
class AmiDistributionConfigurationJsonMarshaller {

    public void marshall(AmiDistributionConfiguration amiDistributionConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (amiDistributionConfiguration.getName() != null) {
            String name = amiDistributionConfiguration.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (amiDistributionConfiguration.getDescription() != null) {
            String description = amiDistributionConfiguration.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (amiDistributionConfiguration.getAmiTags() != null) {
            java.util.Map<String, String> amiTags = amiDistributionConfiguration.getAmiTags();
            jsonWriter.name("amiTags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> amiTagsEntry : amiTags.entrySet()) {
                String amiTagsValue = amiTagsEntry.getValue();
                if (amiTagsValue != null) {
                    jsonWriter.name(amiTagsEntry.getKey());
                    jsonWriter.value(amiTagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (amiDistributionConfiguration.getLaunchPermission() != null) {
            LaunchPermissionConfiguration launchPermission = amiDistributionConfiguration
                    .getLaunchPermission();
            jsonWriter.name("launchPermission");
            LaunchPermissionConfigurationJsonMarshaller.getInstance().marshall(launchPermission,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AmiDistributionConfigurationJsonMarshaller instance;

    public static AmiDistributionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AmiDistributionConfigurationJsonMarshaller();
        return instance;
    }
}
