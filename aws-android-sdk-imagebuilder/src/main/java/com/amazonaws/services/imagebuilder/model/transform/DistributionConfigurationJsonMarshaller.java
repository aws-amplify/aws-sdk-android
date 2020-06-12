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
 * JSON marshaller for POJO DistributionConfiguration
 */
class DistributionConfigurationJsonMarshaller {

    public void marshall(DistributionConfiguration distributionConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (distributionConfiguration.getArn() != null) {
            String arn = distributionConfiguration.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (distributionConfiguration.getName() != null) {
            String name = distributionConfiguration.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (distributionConfiguration.getDescription() != null) {
            String description = distributionConfiguration.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (distributionConfiguration.getDistributions() != null) {
            java.util.List<Distribution> distributions = distributionConfiguration
                    .getDistributions();
            jsonWriter.name("distributions");
            jsonWriter.beginArray();
            for (Distribution distributionsItem : distributions) {
                if (distributionsItem != null) {
                    DistributionJsonMarshaller.getInstance()
                            .marshall(distributionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (distributionConfiguration.getTimeoutMinutes() != null) {
            Integer timeoutMinutes = distributionConfiguration.getTimeoutMinutes();
            jsonWriter.name("timeoutMinutes");
            jsonWriter.value(timeoutMinutes);
        }
        if (distributionConfiguration.getDateCreated() != null) {
            String dateCreated = distributionConfiguration.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (distributionConfiguration.getDateUpdated() != null) {
            String dateUpdated = distributionConfiguration.getDateUpdated();
            jsonWriter.name("dateUpdated");
            jsonWriter.value(dateUpdated);
        }
        if (distributionConfiguration.getTags() != null) {
            java.util.Map<String, String> tags = distributionConfiguration.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DistributionConfigurationJsonMarshaller instance;

    public static DistributionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionConfigurationJsonMarshaller();
        return instance;
    }
}
