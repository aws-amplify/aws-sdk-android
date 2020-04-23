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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CreateRecommenderConfiguration
 */
class CreateRecommenderConfigurationJsonUnmarshaller implements
        Unmarshaller<CreateRecommenderConfiguration, JsonUnmarshallerContext> {

    public CreateRecommenderConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateRecommenderConfiguration createRecommenderConfiguration = new CreateRecommenderConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attributes")) {
                createRecommenderConfiguration.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                createRecommenderConfiguration.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createRecommenderConfiguration.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommendationProviderIdType")) {
                createRecommenderConfiguration
                        .setRecommendationProviderIdType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationProviderRoleArn")) {
                createRecommenderConfiguration
                        .setRecommendationProviderRoleArn(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationProviderUri")) {
                createRecommenderConfiguration.setRecommendationProviderUri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommendationTransformerUri")) {
                createRecommenderConfiguration
                        .setRecommendationTransformerUri(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationsDisplayName")) {
                createRecommenderConfiguration.setRecommendationsDisplayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommendationsPerMessage")) {
                createRecommenderConfiguration.setRecommendationsPerMessage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createRecommenderConfiguration;
    }

    private static CreateRecommenderConfigurationJsonUnmarshaller instance;

    public static CreateRecommenderConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRecommenderConfigurationJsonUnmarshaller();
        return instance;
    }
}
