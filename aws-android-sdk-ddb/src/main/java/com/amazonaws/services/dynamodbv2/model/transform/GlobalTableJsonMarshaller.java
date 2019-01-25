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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GlobalTable
 */
class GlobalTableJsonMarshaller {

    public void marshall(GlobalTable globalTable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (globalTable.getGlobalTableName() != null) {
            String globalTableName = globalTable.getGlobalTableName();
            jsonWriter.name("GlobalTableName");
            jsonWriter.value(globalTableName);
        }
        if (globalTable.getReplicationGroup() != null) {
            java.util.List<Replica> replicationGroup = globalTable.getReplicationGroup();
            jsonWriter.name("ReplicationGroup");
            jsonWriter.beginArray();
            for (Replica replicationGroupItem : replicationGroup) {
                if (replicationGroupItem != null) {
                    ReplicaJsonMarshaller.getInstance().marshall(replicationGroupItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GlobalTableJsonMarshaller instance;

    public static GlobalTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalTableJsonMarshaller();
        return instance;
    }
}
