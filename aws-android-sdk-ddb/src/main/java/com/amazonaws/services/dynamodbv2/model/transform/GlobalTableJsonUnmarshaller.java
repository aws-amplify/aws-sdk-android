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
 * JSON unmarshaller for POJO GlobalTable
 */
class GlobalTableJsonUnmarshaller implements Unmarshaller<GlobalTable, JsonUnmarshallerContext> {

    public GlobalTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GlobalTable globalTable = new GlobalTable();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GlobalTableName")) {
                globalTable.setGlobalTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationGroup")) {
                globalTable.setReplicationGroup(new ListUnmarshaller<Replica>(
                        ReplicaJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return globalTable;
    }

    private static GlobalTableJsonUnmarshaller instance;

    public static GlobalTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalTableJsonUnmarshaller();
        return instance;
    }
}
