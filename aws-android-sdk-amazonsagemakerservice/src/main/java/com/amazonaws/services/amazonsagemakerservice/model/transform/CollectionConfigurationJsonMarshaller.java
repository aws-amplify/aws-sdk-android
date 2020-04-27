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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CollectionConfiguration
 */
class CollectionConfigurationJsonMarshaller {

    public void marshall(CollectionConfiguration collectionConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (collectionConfiguration.getCollectionName() != null) {
            String collectionName = collectionConfiguration.getCollectionName();
            jsonWriter.name("CollectionName");
            jsonWriter.value(collectionName);
        }
        if (collectionConfiguration.getCollectionParameters() != null) {
            java.util.Map<String, String> collectionParameters = collectionConfiguration
                    .getCollectionParameters();
            jsonWriter.name("CollectionParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> collectionParametersEntry : collectionParameters
                    .entrySet()) {
                String collectionParametersValue = collectionParametersEntry.getValue();
                if (collectionParametersValue != null) {
                    jsonWriter.name(collectionParametersEntry.getKey());
                    jsonWriter.value(collectionParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static CollectionConfigurationJsonMarshaller instance;

    public static CollectionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CollectionConfigurationJsonMarshaller();
        return instance;
    }
}
