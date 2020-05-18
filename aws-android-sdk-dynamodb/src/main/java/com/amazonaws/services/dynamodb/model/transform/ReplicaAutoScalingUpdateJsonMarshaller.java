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
 * JSON marshaller for POJO ReplicaAutoScalingUpdate
 */
class ReplicaAutoScalingUpdateJsonMarshaller {

    public void marshall(ReplicaAutoScalingUpdate replicaAutoScalingUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicaAutoScalingUpdate.getRegionName() != null) {
            String regionName = replicaAutoScalingUpdate.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (replicaAutoScalingUpdate.getReplicaGlobalSecondaryIndexUpdates() != null) {
            java.util.List<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates = replicaAutoScalingUpdate
                    .getReplicaGlobalSecondaryIndexUpdates();
            jsonWriter.name("ReplicaGlobalSecondaryIndexUpdates");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexAutoScalingUpdate replicaGlobalSecondaryIndexUpdatesItem : replicaGlobalSecondaryIndexUpdates) {
                if (replicaGlobalSecondaryIndexUpdatesItem != null) {
                    ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonMarshaller.getInstance()
                            .marshall(replicaGlobalSecondaryIndexUpdatesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (replicaAutoScalingUpdate.getReplicaProvisionedReadCapacityAutoScalingUpdate() != null) {
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate = replicaAutoScalingUpdate
                    .getReplicaProvisionedReadCapacityAutoScalingUpdate();
            jsonWriter.name("ReplicaProvisionedReadCapacityAutoScalingUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    replicaProvisionedReadCapacityAutoScalingUpdate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaAutoScalingUpdateJsonMarshaller instance;

    public static ReplicaAutoScalingUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaAutoScalingUpdateJsonMarshaller();
        return instance;
    }
}
