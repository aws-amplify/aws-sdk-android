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
 * JSON marshaller for POJO LogsConfig
 */
class LogsConfigJsonMarshaller {

    public void marshall(LogsConfig logsConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logsConfig.getCloudWatchLogs() != null) {
            CloudWatchLogsConfig cloudWatchLogs = logsConfig.getCloudWatchLogs();
            jsonWriter.name("cloudWatchLogs");
            CloudWatchLogsConfigJsonMarshaller.getInstance().marshall(cloudWatchLogs, jsonWriter);
        }
        if (logsConfig.getS3Logs() != null) {
            S3LogsConfig s3Logs = logsConfig.getS3Logs();
            jsonWriter.name("s3Logs");
            S3LogsConfigJsonMarshaller.getInstance().marshall(s3Logs, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LogsConfigJsonMarshaller instance;

    public static LogsConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogsConfigJsonMarshaller();
        return instance;
    }
}
