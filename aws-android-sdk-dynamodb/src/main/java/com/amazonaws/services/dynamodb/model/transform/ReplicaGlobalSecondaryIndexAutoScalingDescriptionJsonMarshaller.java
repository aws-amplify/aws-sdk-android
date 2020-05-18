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
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndexAutoScalingDescription
 */
class ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonMarshaller {

    public void marshall(
            ReplicaGlobalSecondaryIndexAutoScalingDescription replicaGlobalSecondaryIndexAutoScalingDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndexAutoScalingDescription.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndexAutoScalingDescription.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndexAutoScalingDescription.getIndexStatus() != null) {
            String indexStatus = replicaGlobalSecondaryIndexAutoScalingDescription.getIndexStatus();
            jsonWriter.name("IndexStatus");
            jsonWriter.value(indexStatus);
        }
        if (replicaGlobalSecondaryIndexAutoScalingDescription
                .getProvisionedReadCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings = replicaGlobalSecondaryIndexAutoScalingDescription
                    .getProvisionedReadCapacityAutoScalingSettings();
            jsonWriter.name("ProvisionedReadCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedReadCapacityAutoScalingSettings, jsonWriter);
        }
        if (replicaGlobalSecondaryIndexAutoScalingDescription
                .getProvisionedWriteCapacityAutoScalingSettings() != null) {
            AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings = replicaGlobalSecondaryIndexAutoScalingDescription
                    .getProvisionedWriteCapacityAutoScalingSettings();
            jsonWriter.name("ProvisionedWriteCapacityAutoScalingSettings");
            AutoScalingSettingsDescriptionJsonMarshaller.getInstance().marshall(
                    provisionedWriteCapacityAutoScalingSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonMarshaller();
        return instance;
    }
}
