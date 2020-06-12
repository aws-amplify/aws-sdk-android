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
 * JSON marshaller for POJO BotMetadata
 */
class BotMetadataJsonMarshaller {

    public void marshall(BotMetadata botMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (botMetadata.getName() != null) {
            String name = botMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (botMetadata.getDescription() != null) {
            String description = botMetadata.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (botMetadata.getStatus() != null) {
            String status = botMetadata.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (botMetadata.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = botMetadata.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (botMetadata.getCreatedDate() != null) {
            java.util.Date createdDate = botMetadata.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (botMetadata.getVersion() != null) {
            String version = botMetadata.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static BotMetadataJsonMarshaller instance;

    public static BotMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BotMetadataJsonMarshaller();
        return instance;
    }
}
