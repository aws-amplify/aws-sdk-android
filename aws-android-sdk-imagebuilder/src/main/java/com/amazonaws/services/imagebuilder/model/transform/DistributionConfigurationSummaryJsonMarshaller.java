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
 * JSON marshaller for POJO DistributionConfigurationSummary
 */
class DistributionConfigurationSummaryJsonMarshaller {

    public void marshall(DistributionConfigurationSummary distributionConfigurationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (distributionConfigurationSummary.getArn() != null) {
            String arn = distributionConfigurationSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (distributionConfigurationSummary.getName() != null) {
            String name = distributionConfigurationSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (distributionConfigurationSummary.getDescription() != null) {
            String description = distributionConfigurationSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (distributionConfigurationSummary.getDateCreated() != null) {
            String dateCreated = distributionConfigurationSummary.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (distributionConfigurationSummary.getDateUpdated() != null) {
            String dateUpdated = distributionConfigurationSummary.getDateUpdated();
            jsonWriter.name("dateUpdated");
            jsonWriter.value(dateUpdated);
        }
        if (distributionConfigurationSummary.getTags() != null) {
            java.util.Map<String, String> tags = distributionConfigurationSummary.getTags();
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

    private static DistributionConfigurationSummaryJsonMarshaller instance;

    public static DistributionConfigurationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionConfigurationSummaryJsonMarshaller();
        return instance;
    }
}
