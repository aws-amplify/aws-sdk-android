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
 * JSON unmarshaller for POJO GlobalSecondaryIndexDescription
 */
class GlobalSecondaryIndexDescriptionJsonUnmarshaller implements
        Unmarshaller<GlobalSecondaryIndexDescription, JsonUnmarshallerContext> {

    public GlobalSecondaryIndexDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GlobalSecondaryIndexDescription globalSecondaryIndexDescription = new GlobalSecondaryIndexDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IndexName")) {
                globalSecondaryIndexDescription.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeySchema")) {
                globalSecondaryIndexDescription
                        .setKeySchema(new ListUnmarshaller<KeySchemaElement>(
                                KeySchemaElementJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Projection")) {
                globalSecondaryIndexDescription.setProjection(ProjectionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexStatus")) {
                globalSecondaryIndexDescription.setIndexStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Backfilling")) {
                globalSecondaryIndexDescription.setBackfilling(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedThroughput")) {
                globalSecondaryIndexDescription
                        .setProvisionedThroughput(ProvisionedThroughputDescriptionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("IndexSizeBytes")) {
                globalSecondaryIndexDescription.setIndexSizeBytes(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ItemCount")) {
                globalSecondaryIndexDescription.setItemCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexArn")) {
                globalSecondaryIndexDescription.setIndexArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return globalSecondaryIndexDescription;
    }

    private static GlobalSecondaryIndexDescriptionJsonUnmarshaller instance;

    public static GlobalSecondaryIndexDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalSecondaryIndexDescriptionJsonUnmarshaller();
        return instance;
    }
}
