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
 * JSON marshaller for POJO GlobalTableDescription
 */
class GlobalTableDescriptionJsonMarshaller {

    public void marshall(GlobalTableDescription globalTableDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (globalTableDescription.getReplicationGroup() != null) {
            java.util.List<ReplicaDescription> replicationGroup = globalTableDescription
                    .getReplicationGroup();
            jsonWriter.name("ReplicationGroup");
            jsonWriter.beginArray();
            for (ReplicaDescription replicationGroupItem : replicationGroup) {
                if (replicationGroupItem != null) {
                    ReplicaDescriptionJsonMarshaller.getInstance().marshall(replicationGroupItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (globalTableDescription.getGlobalTableArn() != null) {
            String globalTableArn = globalTableDescription.getGlobalTableArn();
            jsonWriter.name("GlobalTableArn");
            jsonWriter.value(globalTableArn);
        }
        if (globalTableDescription.getCreationDateTime() != null) {
            java.util.Date creationDateTime = globalTableDescription.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (globalTableDescription.getGlobalTableStatus() != null) {
            String globalTableStatus = globalTableDescription.getGlobalTableStatus();
            jsonWriter.name("GlobalTableStatus");
            jsonWriter.value(globalTableStatus);
        }
        if (globalTableDescription.getGlobalTableName() != null) {
            String globalTableName = globalTableDescription.getGlobalTableName();
            jsonWriter.name("GlobalTableName");
            jsonWriter.value(globalTableName);
        }
        jsonWriter.endObject();
    }

    private static GlobalTableDescriptionJsonMarshaller instance;

    public static GlobalTableDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalTableDescriptionJsonMarshaller();
        return instance;
    }
}
