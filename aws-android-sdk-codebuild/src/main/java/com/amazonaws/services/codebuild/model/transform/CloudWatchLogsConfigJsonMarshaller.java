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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudWatchLogsConfig
 */
class CloudWatchLogsConfigJsonMarshaller {

    public void marshall(CloudWatchLogsConfig cloudWatchLogsConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cloudWatchLogsConfig.getStatus() != null) {
            String status = cloudWatchLogsConfig.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (cloudWatchLogsConfig.getGroupName() != null) {
            String groupName = cloudWatchLogsConfig.getGroupName();
            jsonWriter.name("groupName");
            jsonWriter.value(groupName);
        }
        if (cloudWatchLogsConfig.getStreamName() != null) {
            String streamName = cloudWatchLogsConfig.getStreamName();
            jsonWriter.name("streamName");
            jsonWriter.value(streamName);
        }
        jsonWriter.endObject();
    }

    private static CloudWatchLogsConfigJsonMarshaller instance;

    public static CloudWatchLogsConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchLogsConfigJsonMarshaller();
        return instance;
    }
}
