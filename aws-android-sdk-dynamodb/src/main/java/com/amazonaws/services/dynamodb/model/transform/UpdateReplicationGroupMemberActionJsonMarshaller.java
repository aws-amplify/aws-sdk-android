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
 * JSON marshaller for POJO UpdateReplicationGroupMemberAction
 */
class UpdateReplicationGroupMemberActionJsonMarshaller {

    public void marshall(UpdateReplicationGroupMemberAction updateReplicationGroupMemberAction,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateReplicationGroupMemberAction.getRegionName() != null) {
            String regionName = updateReplicationGroupMemberAction.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (updateReplicationGroupMemberAction.getKMSMasterKeyId() != null) {
            String kMSMasterKeyId = updateReplicationGroupMemberAction.getKMSMasterKeyId();
            jsonWriter.name("KMSMasterKeyId");
            jsonWriter.value(kMSMasterKeyId);
        }
        if (updateReplicationGroupMemberAction.getProvisionedThroughputOverride() != null) {
            ProvisionedThroughputOverride provisionedThroughputOverride = updateReplicationGroupMemberAction
                    .getProvisionedThroughputOverride();
            jsonWriter.name("ProvisionedThroughputOverride");
            ProvisionedThroughputOverrideJsonMarshaller.getInstance().marshall(
                    provisionedThroughputOverride, jsonWriter);
        }
        if (updateReplicationGroupMemberAction.getGlobalSecondaryIndexes() != null) {
            java.util.List<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes = updateReplicationGroupMemberAction
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndex globalSecondaryIndexesItem : globalSecondaryIndexes) {
                if (globalSecondaryIndexesItem != null) {
                    ReplicaGlobalSecondaryIndexJsonMarshaller.getInstance().marshall(
                            globalSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UpdateReplicationGroupMemberActionJsonMarshaller instance;

    public static UpdateReplicationGroupMemberActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateReplicationGroupMemberActionJsonMarshaller();
        return instance;
    }
}
