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
 * JSON unmarshaller for POJO TableDescription
 */
class TableDescriptionJsonUnmarshaller implements
        Unmarshaller<TableDescription, JsonUnmarshallerContext> {

    public TableDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TableDescription tableDescription = new TableDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttributeDefinitions")) {
                tableDescription.setAttributeDefinitions(new ListUnmarshaller<AttributeDefinition>(
                        AttributeDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TableName")) {
                tableDescription.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeySchema")) {
                tableDescription.setKeySchema(new ListUnmarshaller<KeySchemaElement>(
                        KeySchemaElementJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TableStatus")) {
                tableDescription.setTableStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDateTime")) {
                tableDescription.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedThroughput")) {
                tableDescription
                        .setProvisionedThroughput(ProvisionedThroughputDescriptionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TableSizeBytes")) {
                tableDescription.setTableSizeBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ItemCount")) {
                tableDescription.setItemCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableArn")) {
                tableDescription.setTableArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableId")) {
                tableDescription.setTableId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalSecondaryIndexes")) {
                tableDescription
                        .setLocalSecondaryIndexes(new ListUnmarshaller<LocalSecondaryIndexDescription>(
                                LocalSecondaryIndexDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("GlobalSecondaryIndexes")) {
                tableDescription
                        .setGlobalSecondaryIndexes(new ListUnmarshaller<GlobalSecondaryIndexDescription>(
                                GlobalSecondaryIndexDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StreamSpecification")) {
                tableDescription.setStreamSpecification(StreamSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestStreamLabel")) {
                tableDescription.setLatestStreamLabel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestStreamArn")) {
                tableDescription.setLatestStreamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RestoreSummary")) {
                tableDescription.setRestoreSummary(RestoreSummaryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SSEDescription")) {
                tableDescription.setSSEDescription(SSEDescriptionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tableDescription;
    }

    private static TableDescriptionJsonUnmarshaller instance;

    public static TableDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableDescriptionJsonUnmarshaller();
        return instance;
    }
}
