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

package com.amazonaws.services.catalog.marketplace.model.transform;

import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntitySummary
 */
class EntitySummaryJsonMarshaller {

    public void marshall(EntitySummary entitySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entitySummary.getName() != null) {
            String name = entitySummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (entitySummary.getEntityType() != null) {
            String entityType = entitySummary.getEntityType();
            jsonWriter.name("EntityType");
            jsonWriter.value(entityType);
        }
        if (entitySummary.getEntityId() != null) {
            String entityId = entitySummary.getEntityId();
            jsonWriter.name("EntityId");
            jsonWriter.value(entityId);
        }
        if (entitySummary.getEntityArn() != null) {
            String entityArn = entitySummary.getEntityArn();
            jsonWriter.name("EntityArn");
            jsonWriter.value(entityArn);
        }
        if (entitySummary.getLastModifiedDate() != null) {
            String lastModifiedDate = entitySummary.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (entitySummary.getVisibility() != null) {
            String visibility = entitySummary.getVisibility();
            jsonWriter.name("Visibility");
            jsonWriter.value(visibility);
        }
        jsonWriter.endObject();
    }

    private static EntitySummaryJsonMarshaller instance;

    public static EntitySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntitySummaryJsonMarshaller();
        return instance;
    }
}
