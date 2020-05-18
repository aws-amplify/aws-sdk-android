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
 * JSON marshaller for POJO ReplicaDescription
 */
class ReplicaDescriptionJsonMarshaller {

    public void marshall(ReplicaDescription replicaDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicaDescription.getRegionName() != null) {
            String regionName = replicaDescription.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (replicaDescription.getReplicaStatus() != null) {
            String replicaStatus = replicaDescription.getReplicaStatus();
            jsonWriter.name("ReplicaStatus");
            jsonWriter.value(replicaStatus);
        }
        if (replicaDescription.getReplicaStatusDescription() != null) {
            String replicaStatusDescription = replicaDescription.getReplicaStatusDescription();
            jsonWriter.name("ReplicaStatusDescription");
            jsonWriter.value(replicaStatusDescription);
        }
        if (replicaDescription.getReplicaStatusPercentProgress() != null) {
            String replicaStatusPercentProgress = replicaDescription
                    .getReplicaStatusPercentProgress();
            jsonWriter.name("ReplicaStatusPercentProgress");
            jsonWriter.value(replicaStatusPercentProgress);
        }
        if (replicaDescription.getKMSMasterKeyId() != null) {
            String kMSMasterKeyId = replicaDescription.getKMSMasterKeyId();
            jsonWriter.name("KMSMasterKeyId");
            jsonWriter.value(kMSMasterKeyId);
        }
        if (replicaDescription.getProvisionedThroughputOverride() != null) {
            ProvisionedThroughputOverride provisionedThroughputOverride = replicaDescription
                    .getProvisionedThroughputOverride();
            jsonWriter.name("ProvisionedThroughputOverride");
            ProvisionedThroughputOverrideJsonMarshaller.getInstance().marshall(
                    provisionedThroughputOverride, jsonWriter);
        }
        if (replicaDescription.getGlobalSecondaryIndexes() != null) {
            java.util.List<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes = replicaDescription
                    .getGlobalSecondaryIndexes();
            jsonWriter.name("GlobalSecondaryIndexes");
            jsonWriter.beginArray();
            for (ReplicaGlobalSecondaryIndexDescription globalSecondaryIndexesItem : globalSecondaryIndexes) {
                if (globalSecondaryIndexesItem != null) {
                    ReplicaGlobalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(
                            globalSecondaryIndexesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReplicaDescriptionJsonMarshaller instance;

    public static ReplicaDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaDescriptionJsonMarshaller();
        return instance;
    }
}
