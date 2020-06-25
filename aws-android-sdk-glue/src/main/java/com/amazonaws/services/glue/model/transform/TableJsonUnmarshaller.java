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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Table
 */
class TableJsonUnmarshaller implements Unmarshaller<Table, JsonUnmarshallerContext> {

    public Table unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Table table = new Table();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                table.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                table.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                table.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Owner")) {
                table.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                table.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                table.setUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAccessTime")) {
                table.setLastAccessTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAnalyzedTime")) {
                table.setLastAnalyzedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Retention")) {
                table.setRetention(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageDescriptor")) {
                table.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartitionKeys")) {
                table.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ViewOriginalText")) {
                table.setViewOriginalText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ViewExpandedText")) {
                table.setViewExpandedText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableType")) {
                table.setTableType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                table.setParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                table.setCreatedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsRegisteredWithLakeFormation")) {
                table.setIsRegisteredWithLakeFormation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return table;
    }

    private static TableJsonUnmarshaller instance;

    public static TableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableJsonUnmarshaller();
        return instance;
    }
}
