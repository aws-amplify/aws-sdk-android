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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListInventoryEntriesResult
 */
public class ListInventoryEntriesResultJsonUnmarshaller implements
        Unmarshaller<ListInventoryEntriesResult, JsonUnmarshallerContext> {

    public ListInventoryEntriesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListInventoryEntriesResult listInventoryEntriesResult = new ListInventoryEntriesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TypeName")) {
                listInventoryEntriesResult.setTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                listInventoryEntriesResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                listInventoryEntriesResult.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptureTime")) {
                listInventoryEntriesResult.setCaptureTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Entries")) {
                listInventoryEntriesResult
                        .setEntries(new ListUnmarshaller<java.util.Map<String, String>>(
                                new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listInventoryEntriesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listInventoryEntriesResult;
    }

    private static ListInventoryEntriesResultJsonUnmarshaller instance;

    public static ListInventoryEntriesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListInventoryEntriesResultJsonUnmarshaller();
        return instance;
    }
}
