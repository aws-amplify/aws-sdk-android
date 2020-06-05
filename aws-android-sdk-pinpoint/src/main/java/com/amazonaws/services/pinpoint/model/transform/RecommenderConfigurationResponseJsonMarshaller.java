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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecommenderConfigurationResponse
 */
class RecommenderConfigurationResponseJsonMarshaller {

    public void marshall(RecommenderConfigurationResponse recommenderConfigurationResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommenderConfigurationResponse.getAttributes() != null) {
            java.util.Map<String, String> attributes = recommenderConfigurationResponse
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
        if (recommenderConfigurationResponse.getCreationDate() != null) {
            String creationDate = recommenderConfigurationResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (recommenderConfigurationResponse.getDescription() != null) {
            String description = recommenderConfigurationResponse.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (recommenderConfigurationResponse.getId() != null) {
            String id = recommenderConfigurationResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (recommenderConfigurationResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = recommenderConfigurationResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (recommenderConfigurationResponse.getName() != null) {
            String name = recommenderConfigurationResponse.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (recommenderConfigurationResponse.getRecommendationProviderIdType() != null) {
            String recommendationProviderIdType = recommenderConfigurationResponse
                    .getRecommendationProviderIdType();
            jsonWriter.name("RecommendationProviderIdType");
            jsonWriter.value(recommendationProviderIdType);
        }
        if (recommenderConfigurationResponse.getRecommendationProviderRoleArn() != null) {
            String recommendationProviderRoleArn = recommenderConfigurationResponse
                    .getRecommendationProviderRoleArn();
            jsonWriter.name("RecommendationProviderRoleArn");
            jsonWriter.value(recommendationProviderRoleArn);
        }
        if (recommenderConfigurationResponse.getRecommendationProviderUri() != null) {
            String recommendationProviderUri = recommenderConfigurationResponse
                    .getRecommendationProviderUri();
            jsonWriter.name("RecommendationProviderUri");
            jsonWriter.value(recommendationProviderUri);
        }
        if (recommenderConfigurationResponse.getRecommendationTransformerUri() != null) {
            String recommendationTransformerUri = recommenderConfigurationResponse
                    .getRecommendationTransformerUri();
            jsonWriter.name("RecommendationTransformerUri");
            jsonWriter.value(recommendationTransformerUri);
        }
        if (recommenderConfigurationResponse.getRecommendationsDisplayName() != null) {
            String recommendationsDisplayName = recommenderConfigurationResponse
                    .getRecommendationsDisplayName();
            jsonWriter.name("RecommendationsDisplayName");
            jsonWriter.value(recommendationsDisplayName);
        }
        if (recommenderConfigurationResponse.getRecommendationsPerMessage() != null) {
            Integer recommendationsPerMessage = recommenderConfigurationResponse
                    .getRecommendationsPerMessage();
            jsonWriter.name("RecommendationsPerMessage");
            jsonWriter.value(recommendationsPerMessage);
        }
        jsonWriter.endObject();
    }

    private static RecommenderConfigurationResponseJsonMarshaller instance;

    public static RecommenderConfigurationResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecommenderConfigurationResponseJsonMarshaller();
        return instance;
    }
}
