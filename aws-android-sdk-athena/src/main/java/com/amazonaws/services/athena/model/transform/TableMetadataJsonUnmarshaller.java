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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TableMetadata
 */
class TableMetadataJsonUnmarshaller implements Unmarshaller<TableMetadata, JsonUnmarshallerContext> {

    public TableMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TableMetadata tableMetadata = new TableMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                tableMetadata.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                tableMetadata.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAccessTime")) {
                tableMetadata.setLastAccessTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableType")) {
                tableMetadata.setTableType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Columns")) {
                tableMetadata.setColumns(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PartitionKeys")) {
                tableMetadata.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Parameters")) {
                tableMetadata.setParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tableMetadata;
    }

    private static TableMetadataJsonUnmarshaller instance;

    public static TableMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableMetadataJsonUnmarshaller();
        return instance;
    }
}
