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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentMetadataConfiguration
 */
class DocumentMetadataConfigurationJsonMarshaller {

    public void marshall(DocumentMetadataConfiguration documentMetadataConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentMetadataConfiguration.getName() != null) {
            String name = documentMetadataConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentMetadataConfiguration.getType() != null) {
            String type = documentMetadataConfiguration.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (documentMetadataConfiguration.getRelevance() != null) {
            Relevance relevance = documentMetadataConfiguration.getRelevance();
            jsonWriter.name("Relevance");
            RelevanceJsonMarshaller.getInstance().marshall(relevance, jsonWriter);
        }
        if (documentMetadataConfiguration.getSearch() != null) {
            Search search = documentMetadataConfiguration.getSearch();
            jsonWriter.name("Search");
            SearchJsonMarshaller.getInstance().marshall(search, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DocumentMetadataConfigurationJsonMarshaller instance;

    public static DocumentMetadataConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentMetadataConfigurationJsonMarshaller();
        return instance;
    }
}
