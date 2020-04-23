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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateRecommenderConfiguration
 */
class UpdateRecommenderConfigurationJsonMarshaller {

    public void marshall(UpdateRecommenderConfiguration updateRecommenderConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateRecommenderConfiguration.getAttributes() != null) {
            java.util.Map<String, String> attributes = updateRecommenderConfiguration
                    .getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (updateRecommenderConfiguration.getDescription() != null) {
            String description = updateRecommenderConfiguration.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (updateRecommenderConfiguration.getName() != null) {
            String name = updateRecommenderConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (updateRecommenderConfiguration.getRecommendationProviderIdType() != null) {
            String recommendationProviderIdType = updateRecommenderConfiguration
                    .getRecommendationProviderIdType();
            jsonWriter.name("RecommendationProviderIdType");
            jsonWriter.value(recommendationProviderIdType);
        }
        if (updateRecommenderConfiguration.getRecommendationProviderRoleArn() != null) {
            String recommendationProviderRoleArn = updateRecommenderConfiguration
                    .getRecommendationProviderRoleArn();
            jsonWriter.name("RecommendationProviderRoleArn");
            jsonWriter.value(recommendationProviderRoleArn);
        }
        if (updateRecommenderConfiguration.getRecommendationProviderUri() != null) {
            String recommendationProviderUri = updateRecommenderConfiguration
                    .getRecommendationProviderUri();
            jsonWriter.name("RecommendationProviderUri");
            jsonWriter.value(recommendationProviderUri);
        }
        if (updateRecommenderConfiguration.getRecommendationTransformerUri() != null) {
            String recommendationTransformerUri = updateRecommenderConfiguration
                    .getRecommendationTransformerUri();
            jsonWriter.name("RecommendationTransformerUri");
            jsonWriter.value(recommendationTransformerUri);
        }
        if (updateRecommenderConfiguration.getRecommendationsDisplayName() != null) {
            String recommendationsDisplayName = updateRecommenderConfiguration
                    .getRecommendationsDisplayName();
            jsonWriter.name("RecommendationsDisplayName");
            jsonWriter.value(recommendationsDisplayName);
        }
        if (updateRecommenderConfiguration.getRecommendationsPerMessage() != null) {
            Integer recommendationsPerMessage = updateRecommenderConfiguration
                    .getRecommendationsPerMessage();
            jsonWriter.name("RecommendationsPerMessage");
            jsonWriter.value(recommendationsPerMessage);
        }
        jsonWriter.endObject();
    }

    private static UpdateRecommenderConfigurationJsonMarshaller instance;

    public static UpdateRecommenderConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRecommenderConfigurationJsonMarshaller();
        return instance;
    }
}
