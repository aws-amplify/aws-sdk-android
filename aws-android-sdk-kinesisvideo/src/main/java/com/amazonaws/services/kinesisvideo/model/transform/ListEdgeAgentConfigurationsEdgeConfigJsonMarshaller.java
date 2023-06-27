/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListEdgeAgentConfigurationsEdgeConfig
 */
class ListEdgeAgentConfigurationsEdgeConfigJsonMarshaller {

    public void marshall(
            ListEdgeAgentConfigurationsEdgeConfig listEdgeAgentConfigurationsEdgeConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listEdgeAgentConfigurationsEdgeConfig.getStreamName() != null) {
            String streamName = listEdgeAgentConfigurationsEdgeConfig.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getStreamARN() != null) {
            String streamARN = listEdgeAgentConfigurationsEdgeConfig.getStreamARN();
            jsonWriter.name("StreamARN");
            jsonWriter.value(streamARN);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getCreationTime() != null) {
            java.util.Date creationTime = listEdgeAgentConfigurationsEdgeConfig.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = listEdgeAgentConfigurationsEdgeConfig
                    .getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getSyncStatus() != null) {
            String syncStatus = listEdgeAgentConfigurationsEdgeConfig.getSyncStatus();
            jsonWriter.name("SyncStatus");
            jsonWriter.value(syncStatus);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getFailedStatusDetails() != null) {
            String failedStatusDetails = listEdgeAgentConfigurationsEdgeConfig
                    .getFailedStatusDetails();
            jsonWriter.name("FailedStatusDetails");
            jsonWriter.value(failedStatusDetails);
        }
        if (listEdgeAgentConfigurationsEdgeConfig.getEdgeConfig() != null) {
            EdgeConfig edgeConfig = listEdgeAgentConfigurationsEdgeConfig.getEdgeConfig();
            jsonWriter.name("EdgeConfig");
            EdgeConfigJsonMarshaller.getInstance().marshall(edgeConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ListEdgeAgentConfigurationsEdgeConfigJsonMarshaller instance;

    public static ListEdgeAgentConfigurationsEdgeConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListEdgeAgentConfigurationsEdgeConfigJsonMarshaller();
        return instance;
    }
}
