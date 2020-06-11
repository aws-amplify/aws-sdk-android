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
 * JSON marshaller for POJO SlotTypeMetadata
 */
class SlotTypeMetadataJsonMarshaller {

    public void marshall(SlotTypeMetadata slotTypeMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (slotTypeMetadata.getName() != null) {
            String name = slotTypeMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (slotTypeMetadata.getDescription() != null) {
            String description = slotTypeMetadata.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (slotTypeMetadata.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = slotTypeMetadata.getLastUpdatedDate();
            jsonWriter.name("lastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (slotTypeMetadata.getCreatedDate() != null) {
            java.util.Date createdDate = slotTypeMetadata.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (slotTypeMetadata.getVersion() != null) {
            String version = slotTypeMetadata.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static SlotTypeMetadataJsonMarshaller instance;

    public static SlotTypeMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SlotTypeMetadataJsonMarshaller();
        return instance;
    }
}
