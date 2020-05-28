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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EntitySummary
 */
class EntitySummaryJsonUnmarshaller implements Unmarshaller<EntitySummary, JsonUnmarshallerContext> {

    public EntitySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntitySummary entitySummary = new EntitySummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                entitySummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntityType")) {
                entitySummary.setEntityType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntityId")) {
                entitySummary.setEntityId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntityArn")) {
                entitySummary.setEntityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                entitySummary.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Visibility")) {
                entitySummary.setVisibility(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entitySummary;
    }

    private static EntitySummaryJsonUnmarshaller instance;

    public static EntitySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntitySummaryJsonUnmarshaller();
        return instance;
    }
}
