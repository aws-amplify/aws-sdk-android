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
 * JSON marshaller for POJO GlobalSecondaryIndexAutoScalingUpdate
 */
class GlobalSecondaryIndexAutoScalingUpdateJsonMarshaller {

    public void marshall(
            GlobalSecondaryIndexAutoScalingUpdate globalSecondaryIndexAutoScalingUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (globalSecondaryIndexAutoScalingUpdate.getIndexName() != null) {
            String indexName = globalSecondaryIndexAutoScalingUpdate.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (globalSecondaryIndexAutoScalingUpdate.getProvisionedWriteCapacityAutoScalingUpdate() != null) {
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate = globalSecondaryIndexAutoScalingUpdate
                    .getProvisionedWriteCapacityAutoScalingUpdate();
            jsonWriter.name("ProvisionedWriteCapacityAutoScalingUpdate");
            AutoScalingSettingsUpdateJsonMarshaller.getInstance().marshall(
                    provisionedWriteCapacityAutoScalingUpdate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static GlobalSecondaryIndexAutoScalingUpdateJsonMarshaller instance;

    public static GlobalSecondaryIndexAutoScalingUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalSecondaryIndexAutoScalingUpdateJsonMarshaller();
        return instance;
    }
}
