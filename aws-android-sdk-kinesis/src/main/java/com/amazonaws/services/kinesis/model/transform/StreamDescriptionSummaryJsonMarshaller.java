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
 * JSON marshaller for POJO StreamDescriptionSummary
 */
class StreamDescriptionSummaryJsonMarshaller {

    public void marshall(StreamDescriptionSummary streamDescriptionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamDescriptionSummary.getStreamName() != null) {
            String streamName = streamDescriptionSummary.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        if (streamDescriptionSummary.getStreamARN() != null) {
            String streamARN = streamDescriptionSummary.getStreamARN();
            jsonWriter.name("StreamARN");
            jsonWriter.value(streamARN);
        }
        if (streamDescriptionSummary.getStreamStatus() != null) {
            String streamStatus = streamDescriptionSummary.getStreamStatus();
            jsonWriter.name("StreamStatus");
            jsonWriter.value(streamStatus);
        }
        if (streamDescriptionSummary.getRetentionPeriodHours() != null) {
            Integer retentionPeriodHours = streamDescriptionSummary.getRetentionPeriodHours();
            jsonWriter.name("RetentionPeriodHours");
            jsonWriter.value(retentionPeriodHours);
        }
        if (streamDescriptionSummary.getStreamCreationTimestamp() != null) {
            java.util.Date streamCreationTimestamp = streamDescriptionSummary
                    .getStreamCreationTimestamp();
            jsonWriter.name("StreamCreationTimestamp");
            jsonWriter.value(streamCreationTimestamp);
        }
        if (streamDescriptionSummary.getEnhancedMonitoring() != null) {
            java.util.List<EnhancedMetrics> enhancedMonitoring = streamDescriptionSummary
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
        if (streamDescriptionSummary.getEncryptionType() != null) {
            String encryptionType = streamDescriptionSummary.getEncryptionType();
            jsonWriter.name("EncryptionType");
            jsonWriter.value(encryptionType);
        }
        if (streamDescriptionSummary.getKeyId() != null) {
            String keyId = streamDescriptionSummary.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (streamDescriptionSummary.getOpenShardCount() != null) {
            Integer openShardCount = streamDescriptionSummary.getOpenShardCount();
            jsonWriter.name("OpenShardCount");
            jsonWriter.value(openShardCount);
        }
        jsonWriter.endObject();
    }

    private static StreamDescriptionSummaryJsonMarshaller instance;

    public static StreamDescriptionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionSummaryJsonMarshaller();
        return instance;
    }
}
