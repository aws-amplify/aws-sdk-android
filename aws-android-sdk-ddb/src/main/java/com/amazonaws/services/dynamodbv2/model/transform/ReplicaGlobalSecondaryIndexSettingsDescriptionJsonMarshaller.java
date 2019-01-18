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
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndexSettingsDescription
 */
class ReplicaGlobalSecondaryIndexSettingsDescriptionJsonMarshaller {

    public void marshall(
            ReplicaGlobalSecondaryIndexSettingsDescription replicaGlobalSecondaryIndexSettingsDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndexSettingsDescription.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndexSettingsDescription.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getIndexStatus() != null) {
            String indexStatus = replicaGlobalSecondaryIndexSettingsDescription.getIndexStatus();
            jsonWriter.name("IndexStatus");
            jsonWriter.value(indexStatus);
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityUnits() != null) {
            Long provisionedReadCapacityUnits = replicaGlobalSecondaryIndexSettingsDescription
                    .getProvisionedReadCapacityUnits();
            jsonWriter.name("ProvisionedReadCapacityUnits");
            jsonWriter.value(provisionedReadCapacityUnits);
        }
        if (replicaGlobalSecondaryIndexSettingsDescription
                .getProvisionedReadCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings = replicaGlobalSecondaryIndexSettingsDescription
                    .getProvisionedReadCapacityAutoScalingSettings();
            jsonWriter.name("ProvisionedReadCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedReadCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityUnits() != null) {
            Long provisionedWriteCapacityUnits = replicaGlobalSecondaryIndexSettingsDescription
                    .getProvisionedWriteCapacityUnits();
            jsonWriter.name("ProvisionedWriteCapacityUnits");
            jsonWriter.value(provisionedWriteCapacityUnits);
        }
        if (replicaGlobalSecondaryIndexSettingsDescription
                .getProvisionedWriteCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings = replicaGlobalSecondaryIndexSettingsDescription
                    .getProvisionedWriteCapacityAutoScalingSettings();
            jsonWriter.name("ProvisionedWriteCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedWriteCapacityAutoScalingSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexSettingsDescriptionJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexSettingsDescriptionJsonMarshaller();
        return instance;
    }
}
