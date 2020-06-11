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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IntentMetadata
 */
class IntentMetadataJsonMarshaller {

    public void marshall(IntentMetadata intentMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (intentMetadata.getName() != null) {
            String name = intentMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (intentMetadata.getDescription() != null) {
            String description = intentMetadata.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (intentMetadata.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = intentMetadata.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (intentMetadata.getCreatedDate() != null) {
            java.util.Date createdDate = intentMetadata.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (intentMetadata.getVersion() != null) {
            String version = intentMetadata.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static IntentMetadataJsonMarshaller instance;

    public static IntentMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntentMetadataJsonMarshaller();
        return instance;
    }
}
