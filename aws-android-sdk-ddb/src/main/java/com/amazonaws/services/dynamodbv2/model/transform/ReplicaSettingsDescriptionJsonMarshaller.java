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
 * JSON marshaller for POJO ReplicaSettingsDescription
 */
class ReplicaSettingsDescriptionJsonMarshaller {

    public void marshall(ReplicaSettingsDescription replicaSettingsDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaSettingsDescription.getRegionName() != null) {
            String regionName = replicaSettingsDescription.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (replicaSettingsDescription.getReplicaStatus() != null) {
            String replicaStatus = replicaSettingsDescription.getReplicaStatus();
            jsonWriter.name("ReplicaStatus");
            jsonWriter.value(replicaStatus);
        }
        if (replicaSettingsDescription.getReplicaProvisionedReadCapacityUnits() != null) {
            Long replicaProvisionedReadCapacityUnits = replicaSettingsDescription
                    .getReplicaProvisionedReadCapacityUnits();
            jsonWriter.name("ReplicaProvisionedReadCapacityUnits");
            jsonWriter.value(replicaProvisionedReadCapacityUnits);
        }
        if (replicaSettingsDescription.getReplicaProvisionedReadCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings = replicaSettingsDescription
                    .getReplicaProvisionedReadCapacityAutoScalingSettings();
            jsonWriter.name("ReplicaProvisionedReadCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    replicaProvisionedReadCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaSettingsDescription.getReplicaProvisionedWriteCapacityUnits() != null) {
            Long replicaProvisionedWriteCapacityUnits = replicaSettingsDescription
                    .getReplicaProvisionedWriteCapacityUnits();
            jsonWriter.name("ReplicaProvisionedWriteCapacityUnits");
            jsonWriter.value(replicaProvisionedWriteCapacityUnits);
        }
        if (replicaSettingsDescription.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings = replicaSettingsDescription
                    .getReplicaProvisionedWriteCapacityAutoScalingSettings();
            jsonWriter.name("ReplicaProvisionedWriteCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    replicaProvisionedWriteCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaSettingsDescription.getReplicaGlobalSecondaryIndexSettings() != null) {
            java.util.List<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings = replicaSettingsDescription
                    .getReplicaGlobalSecondaryIndexSettings();
            jsonWriter.name("ReplicaGlobalSecondaryIndexSettings");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexSettingsDescription replicaGlobalSecondaryIndexSettingsItem : replicaGlobalSecondaryIndexSettings) {
                if (replicaGlobalSecondaryIndexSettingsItem != null) {
                    ReplicaGlobalSecondaryIndexSettingsDescriptionJsonMarshaller.getInstance()
                            .marshall(replicaGlobalSecondaryIndexSettingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReplicaSettingsDescriptionJsonMarshaller instance;

    public static ReplicaSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaSettingsDescriptionJsonMarshaller();
        return instance;
    }
}
