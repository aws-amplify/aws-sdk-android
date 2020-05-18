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
 * JSON marshaller for POJO ReplicaGlobalSecondaryIndexDescription
 */
class ReplicaGlobalSecondaryIndexDescriptionJsonMarshaller {

    public void marshall(
            ReplicaGlobalSecondaryIndexDescription replicaGlobalSecondaryIndexDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicaGlobalSecondaryIndexDescription.getIndexName() != null) {
            String indexName = replicaGlobalSecondaryIndexDescription.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (replicaGlobalSecondaryIndexDescription.getProvisionedThroughputOverride() != null) {
            ProvisionedThroughputOverride provisionedThroughputOverride = replicaGlobalSecondaryIndexDescription
                    .getProvisionedThroughputOverride();
            jsonWriter.name("ProvisionedThroughputOverride");
            ProvisionedThroughputOverrideJsonMarshaller.getInstance().marshall(
                    provisionedThroughputOverride, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicaGlobalSecondaryIndexDescriptionJsonMarshaller instance;

    public static ReplicaGlobalSecondaryIndexDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaGlobalSecondaryIndexDescriptionJsonMarshaller();
        return instance;
    }
}
