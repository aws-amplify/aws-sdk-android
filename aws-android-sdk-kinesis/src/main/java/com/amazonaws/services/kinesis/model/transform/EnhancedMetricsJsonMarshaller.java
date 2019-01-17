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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EnhancedMetrics
 */
class EnhancedMetricsJsonMarshaller {

    public void marshall(EnhancedMetrics enhancedMetrics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (enhancedMetrics.getShardLevelMetrics() != null) {
            java.util.List<String> shardLevelMetrics = enhancedMetrics.getShardLevelMetrics();
            jsonWriter.name("ShardLevelMetrics");
            jsonWriter.beginArray();
            for (String shardLevelMetricsItem : shardLevelMetrics) {
                if (shardLevelMetricsItem != null) {
                    jsonWriter.value(shardLevelMetricsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EnhancedMetricsJsonMarshaller instance;

    public static EnhancedMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnhancedMetricsJsonMarshaller();
        return instance;
    }
}
