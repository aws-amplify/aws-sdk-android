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
 * JSON unmarshaller for POJO TableInput
 */
class TableInputJsonUnmarshaller implements Unmarshaller<TableInput, JsonUnmarshallerContext> {

    public TableInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TableInput tableInput = new TableInput();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                tableInput.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                tableInput.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Owner")) {
                tableInput.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAccessTime")) {
                tableInput.setLastAccessTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAnalyzedTime")) {
                tableInput.setLastAnalyzedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Retention")) {
                tableInput.setRetention(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageDescriptor")) {
                tableInput.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartitionKeys")) {
                tableInput.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ViewOriginalText")) {
                tableInput.setViewOriginalText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ViewExpandedText")) {
                tableInput.setViewExpandedText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableType")) {
                tableInput.setTableType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                tableInput.setParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tableInput;
    }

    private static TableInputJsonUnmarshaller instance;

    public static TableInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableInputJsonUnmarshaller();
        return instance;
    }
}
