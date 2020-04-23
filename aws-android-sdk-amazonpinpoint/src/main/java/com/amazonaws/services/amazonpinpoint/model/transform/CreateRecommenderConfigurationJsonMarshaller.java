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
 * JSON marshaller for POJO CreateRecommenderConfiguration
 */
class CreateRecommenderConfigurationJsonMarshaller {

    public void marshall(CreateRecommenderConfiguration createRecommenderConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createRecommenderConfiguration.getAttributes() != null) {
            java.util.Map<String, String> attributes = createRecommenderConfiguration
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
        if (createRecommenderConfiguration.getDescription() != null) {
            String description = createRecommenderConfiguration.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (createRecommenderConfiguration.getName() != null) {
            String name = createRecommenderConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createRecommenderConfiguration.getRecommendationProviderIdType() != null) {
            String recommendationProviderIdType = createRecommenderConfiguration
                    .getRecommendationProviderIdType();
            jsonWriter.name("RecommendationProviderIdType");
            jsonWriter.value(recommendationProviderIdType);
        }
        if (createRecommenderConfiguration.getRecommendationProviderRoleArn() != null) {
            String recommendationProviderRoleArn = createRecommenderConfiguration
                    .getRecommendationProviderRoleArn();
            jsonWriter.name("RecommendationProviderRoleArn");
            jsonWriter.value(recommendationProviderRoleArn);
        }
        if (createRecommenderConfiguration.getRecommendationProviderUri() != null) {
            String recommendationProviderUri = createRecommenderConfiguration
                    .getRecommendationProviderUri();
            jsonWriter.name("RecommendationProviderUri");
            jsonWriter.value(recommendationProviderUri);
        }
        if (createRecommenderConfiguration.getRecommendationTransformerUri() != null) {
            String recommendationTransformerUri = createRecommenderConfiguration
                    .getRecommendationTransformerUri();
            jsonWriter.name("RecommendationTransformerUri");
            jsonWriter.value(recommendationTransformerUri);
        }
        if (createRecommenderConfiguration.getRecommendationsDisplayName() != null) {
            String recommendationsDisplayName = createRecommenderConfiguration
                    .getRecommendationsDisplayName();
            jsonWriter.name("RecommendationsDisplayName");
            jsonWriter.value(recommendationsDisplayName);
        }
        if (createRecommenderConfiguration.getRecommendationsPerMessage() != null) {
            Integer recommendationsPerMessage = createRecommenderConfiguration
                    .getRecommendationsPerMessage();
            jsonWriter.name("RecommendationsPerMessage");
            jsonWriter.value(recommendationsPerMessage);
        }
        jsonWriter.endObject();
    }

    private static CreateRecommenderConfigurationJsonMarshaller instance;

    public static CreateRecommenderConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateRecommenderConfigurationJsonMarshaller();
        return instance;
    }
}
