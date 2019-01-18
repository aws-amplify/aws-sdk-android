/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LocalSecondaryIndexDescription
 */
class LocalSecondaryIndexDescriptionJsonUnmarshaller implements
        Unmarshaller<LocalSecondaryIndexDescription, JsonUnmarshallerContext> {

    public LocalSecondaryIndexDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LocalSecondaryIndexDescription localSecondaryIndexDescription = new LocalSecondaryIndexDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IndexName")) {
                localSecondaryIndexDescription.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeySchema")) {
                localSecondaryIndexDescription.setKeySchema(new ListUnmarshaller<KeySchemaElement>(
                        KeySchemaElementJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Projection")) {
                localSecondaryIndexDescription.setProjection(ProjectionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexSizeBytes")) {
                localSecondaryIndexDescription.setIndexSizeBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ItemCount")) {
                localSecondaryIndexDescription.setItemCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexArn")) {
                localSecondaryIndexDescription.setIndexArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return localSecondaryIndexDescription;
    }

    private static LocalSecondaryIndexDescriptionJsonUnmarshaller instance;

    public static LocalSecondaryIndexDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalSecondaryIndexDescriptionJsonUnmarshaller();
        return instance;
    }
}
