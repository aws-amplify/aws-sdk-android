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
 * JSON marshaller for POJO ReplicaSettingsUpdate
 */
class ReplicaSettingsUpdateJsonMarshaller {

    public void marshall(ReplicaSettingsUpdate replicaSettingsUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicaSettingsUpdate.getRegionName() != null) {
            String regionName = replicaSettingsUpdate.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits() != null) {
            Long replicaProvisionedReadCapacityUnits = replicaSettingsUpdate
                    .getReplicaProvisionedReadCapacityUnits();
            jsonWriter.name("ReplicaProvisionedReadCapacityUnits");
            jsonWriter.value(replicaProvisionedReadCapacityUnits);
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null) {
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaSettingsUpdate
                    .getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate();
            jsonWriter.name("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    replicaProvisionedReadCapacityAutoScalingSettingsUpdate, jsonWriter);
        }
        if (replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate() != null) {
            java.util.List<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate = replicaSettingsUpdate
                    .getReplicaGlobalSecondaryIndexSettingsUpdate();
            jsonWriter.name("ReplicaGlobalSecondaryIndexSettingsUpdate");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexSettingsUpdate replicaGlobalSecondaryIndexSettingsUpdateItem : replicaGlobalSecondaryIndexSettingsUpdate) {
                if (replicaGlobalSecondaryIndexSettingsUpdateItem != null) {
                    ReplicaGlobalSecondaryIndexSettingsUpdateJsonMarshaller.getInstance().marshall(
                            replicaGlobalSecondaryIndexSettingsUpdateItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReplicaSettingsUpdateJsonMarshaller instance;

    public static ReplicaSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaSettingsUpdateJsonMarshaller();
        return instance;
    }
}
