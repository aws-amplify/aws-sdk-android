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
 * JSON marshaller for POJO GlobalTableGlobalSecondaryIndexSettingsUpdate
 */
class GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller {

    public void marshall(
            GlobalTableGlobalSecondaryIndexSettingsUpdate globalTableGlobalSecondaryIndexSettingsUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName() != null) {
            String indexName = globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits() != null) {
            Long provisionedWriteCapacityUnits = globalTableGlobalSecondaryIndexSettingsUpdate
                    .getProvisionedWriteCapacityUnits();
            jsonWriter.name("ProvisionedWriteCapacityUnits");
            jsonWriter.value(provisionedWriteCapacityUnits);
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate
                .getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null) {
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate = globalTableGlobalSecondaryIndexSettingsUpdate
                    .getProvisionedWriteCapacityAutoScalingSettingsUpdate();
            jsonWriter.name("ProvisionedWriteCapacityAutoScalingSettingsUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    provisionedWriteCapacityAutoScalingSettingsUpdate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller instance;

    public static GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalTableGlobalSecondaryIndexSettingsUpdateJsonMarshaller();
        return instance;
    }
}
