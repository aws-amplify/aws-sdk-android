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
 * JSON marshaller for POJO ReplicaAutoScalingDescription
 */
class ReplicaAutoScalingDescriptionJsonMarshaller {

    public void marshall(ReplicaAutoScalingDescription replicaAutoScalingDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaAutoScalingDescription.getRegionName() != null) {
            String regionName = replicaAutoScalingDescription.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (replicaAutoScalingDescription.getGlobalSecondaryIndexes() != null) {
            java.util.List<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes = replicaAutoScalingDescription
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexAutoScalingDescription globalSecondaryIndexesItem : globalSecondaryIndexes) {
                if (globalSecondaryIndexesItem != null) {
                    ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonMarshaller.getInstance()
                            .marshall(globalSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (replicaAutoScalingDescription.getReplicaProvisionedReadCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings = replicaAutoScalingDescription
                    .getReplicaProvisionedReadCapacityAutoScalingSettings();
            jsonWriter.name("ReplicaProvisionedReadCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    replicaProvisionedReadCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaAutoScalingDescription.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings = replicaAutoScalingDescription
                    .getReplicaProvisionedWriteCapacityAutoScalingSettings();
            jsonWriter.name("ReplicaProvisionedWriteCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    replicaProvisionedWriteCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaAutoScalingDescription.getReplicaStatus() != null) {
            String replicaStatus = replicaAutoScalingDescription.getReplicaStatus();
            jsonWriter.name("ReplicaStatus");
            jsonWriter.value(replicaStatus);
        }
        jsonWriter.endObject();
    }

    private static ReplicaAutoScalingDescriptionJsonMarshaller instance;

    public static ReplicaAutoScalingDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaAutoScalingDescriptionJsonMarshaller();
        return instance;
    }
}
