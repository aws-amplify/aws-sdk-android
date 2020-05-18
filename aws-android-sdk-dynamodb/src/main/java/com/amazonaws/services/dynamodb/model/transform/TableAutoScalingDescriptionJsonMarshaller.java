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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TableAutoScalingDescription
 */
class TableAutoScalingDescriptionJsonMarshaller {

    public void marshall(TableAutoScalingDescription tableAutoScalingDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tableAutoScalingDescription.getTableName() != null) {
            String tableName = tableAutoScalingDescription.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (tableAutoScalingDescription.getTableStatus() != null) {
            String tableStatus = tableAutoScalingDescription.getTableStatus();
            jsonWriter.name("TableStatus");
            jsonWriter.value(tableStatus);
        }
        if (tableAutoScalingDescription.getReplicas() != null) {
            java.util.List<ReplicaAutoScalingDescription> replicas = tableAutoScalingDescription
                    .getReplicas();
            jsonWriter.name("Replicas");
            jsonWriter.beginArray();
            for (ReplicaAutoScalingDescription replicasItem : replicas) {
                if (replicasItem != null) {
                    ReplicaAutoScalingDescriptionJsonMarshaller.getInstance().marshall(
                            replicasItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TableAutoScalingDescriptionJsonMarshaller instance;

    public static TableAutoScalingDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableAutoScalingDescriptionJsonMarshaller();
        return instance;
    }
}
