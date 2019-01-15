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
 * JSON marshaller for POJO StreamDescription
 */
class StreamDescriptionJsonMarshaller {

    public void marshall(StreamDescription streamDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamDescription.getStreamName() != null) {
            String streamName = streamDescription.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        if (streamDescription.getStreamARN() != null) {
            String streamARN = streamDescription.getStreamARN();
            jsonWriter.name("StreamARN");
            jsonWriter.value(streamARN);
        }
        if (streamDescription.getStreamStatus() != null) {
            String streamStatus = streamDescription.getStreamStatus();
            jsonWriter.name("StreamStatus");
            jsonWriter.value(streamStatus);
        }
        if (streamDescription.getShards() != null) {
            java.util.List<Shard> shards = streamDescription.getShards();
            jsonWriter.name("Shards");
            jsonWriter.beginArray();
            for (Shard shardsItem : shards) {
                if (shardsItem != null) {
                    ShardJsonMarshaller.getInstance().marshall(shardsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (streamDescription.getHasMoreShards() != null) {
            Boolean hasMoreShards = streamDescription.getHasMoreShards();
            jsonWriter.name("HasMoreShards");
            jsonWriter.value(hasMoreShards);
        }
        if (streamDescription.getRetentionPeriodHours() != null) {
            Integer retentionPeriodHours = streamDescription.getRetentionPeriodHours();
            jsonWriter.name("RetentionPeriodHours");
            jsonWriter.value(retentionPeriodHours);
        }
        if (streamDescription.getStreamCreationTimestamp() != null) {
            java.util.Date streamCreationTimestamp = streamDescription.getStreamCreationTimestamp();
            jsonWriter.name("StreamCreationTimestamp");
            jsonWriter.value(streamCreationTimestamp);
        }
        if (streamDescription.getEnhancedMonitoring() != null) {
            java.util.List<EnhancedMetrics> enhancedMonitoring = streamDescription
                    .getEnhancedMonitoring();
            jsonWriter.name("EnhancedMonitoring");
            jsonWriter.beginArray();
            for (EnhancedMetrics enhancedMonitoringItem : enhancedMonitoring) {
                if (enhancedMonitoringItem != null) {
                    EnhancedMetricsJsonMarshaller.getInstance().marshall(enhancedMonitoringItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (streamDescription.getEncryptionType() != null) {
            String encryptionType = streamDescription.getEncryptionType();
            jsonWriter.name("EncryptionType");
            jsonWriter.value(encryptionType);
        }
        if (streamDescription.getKeyId() != null) {
            String keyId = streamDescription.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        jsonWriter.endObject();
    }

    private static StreamDescriptionJsonMarshaller instance;

    public static StreamDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionJsonMarshaller();
        return instance;
    }
}
