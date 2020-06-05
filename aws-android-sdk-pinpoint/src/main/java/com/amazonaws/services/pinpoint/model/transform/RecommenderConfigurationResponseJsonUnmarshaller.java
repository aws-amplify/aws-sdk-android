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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RecommenderConfigurationResponse
 */
class RecommenderConfigurationResponseJsonUnmarshaller implements
        Unmarshaller<RecommenderConfigurationResponse, JsonUnmarshallerContext> {

    public RecommenderConfigurationResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecommenderConfigurationResponse recommenderConfigurationResponse = new RecommenderConfigurationResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attributes")) {
                recommenderConfigurationResponse.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                recommenderConfigurationResponse.setCreationDate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                recommenderConfigurationResponse.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                recommenderConfigurationResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                recommenderConfigurationResponse.setLastModifiedDate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                recommenderConfigurationResponse.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommendationProviderIdType")) {
                recommenderConfigurationResponse
                        .setRecommendationProviderIdType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationProviderRoleArn")) {
                recommenderConfigurationResponse
                        .setRecommendationProviderRoleArn(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationProviderUri")) {
                recommenderConfigurationResponse
                        .setRecommendationProviderUri(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationTransformerUri")) {
                recommenderConfigurationResponse
                        .setRecommendationTransformerUri(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationsDisplayName")) {
                recommenderConfigurationResponse
                        .setRecommendationsDisplayName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationsPerMessage")) {
                recommenderConfigurationResponse
                        .setRecommendationsPerMessage(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recommenderConfigurationResponse;
    }

    private static RecommenderConfigurationResponseJsonUnmarshaller instance;

    public static RecommenderConfigurationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommenderConfigurationResponseJsonUnmarshaller();
        return instance;
    }
}
