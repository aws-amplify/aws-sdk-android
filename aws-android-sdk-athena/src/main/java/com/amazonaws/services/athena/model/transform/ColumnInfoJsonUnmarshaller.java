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
 * JSON unmarshaller for POJO ColumnInfo
 */
class ColumnInfoJsonUnmarshaller implements Unmarshaller<ColumnInfo, JsonUnmarshallerContext> {

    public ColumnInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ColumnInfo columnInfo = new ColumnInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CatalogName")) {
                columnInfo.setCatalogName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaName")) {
                columnInfo.setSchemaName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableName")) {
                columnInfo.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                columnInfo.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Label")) {
                columnInfo.setLabel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                columnInfo.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Precision")) {
                columnInfo.setPrecision(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scale")) {
                columnInfo.setScale(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Nullable")) {
                columnInfo.setNullable(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaseSensitive")) {
                columnInfo.setCaseSensitive(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return columnInfo;
    }

    private static ColumnInfoJsonUnmarshaller instance;

    public static ColumnInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnInfoJsonUnmarshaller();
        return instance;
    }
}
