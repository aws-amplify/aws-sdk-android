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
 * JSON marshaller for POJO CreateReplicationGroupMemberAction
 */
class CreateReplicationGroupMemberActionJsonMarshaller {

    public void marshall(CreateReplicationGroupMemberAction createReplicationGroupMemberAction,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createReplicationGroupMemberAction.getRegionName() != null) {
            String regionName = createReplicationGroupMemberAction.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (createReplicationGroupMemberAction.getKMSMasterKeyId() != null) {
            String kMSMasterKeyId = createReplicationGroupMemberAction.getKMSMasterKeyId();
            jsonWriter.name("KMSMasterKeyId");
            jsonWriter.value(kMSMasterKeyId);
        }
        if (createReplicationGroupMemberAction.getProvisionedThroughputOverride() != null) {
            ProvisionedThroughputOverride provisionedThroughputOverride = createReplicationGroupMemberAction
                    .getProvisionedThroughputOverride();
            jsonWriter.name("ProvisionedThroughputOverride");
            ProvisionedThroughputOverrideJsonMarshaller.getInstance().marshall(
                    provisionedThroughputOverride, jsonWriter);
        }
        if (createReplicationGroupMemberAction.getGlobalSecondaryIndexes() != null) {
            java.util.List<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes = createReplicationGroupMemberAction
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

    private static CreateReplicationGroupMemberActionJsonMarshaller instance;

    public static CreateReplicationGroupMemberActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateReplicationGroupMemberActionJsonMarshaller();
        return instance;
    }
}
