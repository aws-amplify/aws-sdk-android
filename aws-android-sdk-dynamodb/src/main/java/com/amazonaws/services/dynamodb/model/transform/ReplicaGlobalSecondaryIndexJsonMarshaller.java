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
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndex
 */
class ReplicaGlobalSecondaryIndexJsonMarshaller {

    public void marshall(ReplicaGlobalSecondaryIndex replicaGlobalSecondaryIndex,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndex.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndex.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndex.getProvisionedThroughputOverride() != null) {
            ProvisionedThroughputOverride provisionedThroughputOverride = replicaGlobalSecondaryIndex
                    .getProvisionedThroughputOverride();
            jsonWriter.name("ProvisionedThroughputOverride");
            ProvisionedThroughputOverrideJsonMarshaller.getInstance().marshall(
                    provisionedThroughputOverride, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexJsonMarshaller();
        return instance;
    }
}
