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
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndexAutoScalingUpdate
 */
class ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonMarshaller {

    public void marshall(
            ReplicaGlobalSecondaryIndexAutoScalingUpdate replicaGlobalSecondaryIndexAutoScalingUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndexAutoScalingUpdate.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndexAutoScalingUpdate.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndexAutoScalingUpdate
                .getProvisionedReadCapacityAutoScalingUpdate() != null) {
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate = replicaGlobalSecondaryIndexAutoScalingUpdate
                    .getProvisionedReadCapacityAutoScalingUpdate();
            jsonWriter.name("ProvisionedReadCapacityAutoScalingUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    provisionedReadCapacityAutoScalingUpdate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonMarshaller();
        return instance;
    }
}
