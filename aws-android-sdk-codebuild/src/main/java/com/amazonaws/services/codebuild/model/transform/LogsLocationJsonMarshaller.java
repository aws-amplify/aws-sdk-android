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
 * JSON marshaller for POJO LogsLocation
 */
class LogsLocationJsonMarshaller {

    public void marshall(LogsLocation logsLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logsLocation.getGroupName() != null) {
            String groupName = logsLocation.getGroupName();
            jsonWriter.name("groupName");
            jsonWriter.value(groupName);
        }
        if (logsLocation.getStreamName() != null) {
            String streamName = logsLocation.getStreamName();
            jsonWriter.name("streamName");
            jsonWriter.value(streamName);
        }
        if (logsLocation.getDeepLink() != null) {
            String deepLink = logsLocation.getDeepLink();
            jsonWriter.name("deepLink");
            jsonWriter.value(deepLink);
        }
        if (logsLocation.getS3DeepLink() != null) {
            String s3DeepLink = logsLocation.getS3DeepLink();
            jsonWriter.name("s3DeepLink");
            jsonWriter.value(s3DeepLink);
        }
        if (logsLocation.getCloudWatchLogsArn() != null) {
            String cloudWatchLogsArn = logsLocation.getCloudWatchLogsArn();
            jsonWriter.name("cloudWatchLogsArn");
            jsonWriter.value(cloudWatchLogsArn);
        }
        if (logsLocation.getS3LogsArn() != null) {
            String s3LogsArn = logsLocation.getS3LogsArn();
            jsonWriter.name("s3LogsArn");
            jsonWriter.value(s3LogsArn);
        }
        if (logsLocation.getCloudWatchLogs() != null) {
            CloudWatchLogsConfig cloudWatchLogs = logsLocation.getCloudWatchLogs();
            jsonWriter.name("cloudWatchLogs");
            CloudWatchLogsConfigJsonMarshaller.getInstance().marshall(cloudWatchLogs, jsonWriter);
        }
        if (logsLocation.getS3Logs() != null) {
            S3LogsConfig s3Logs = logsLocation.getS3Logs();
            jsonWriter.name("s3Logs");
            S3LogsConfigJsonMarshaller.getInstance().marshall(s3Logs, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LogsLocationJsonMarshaller instance;

    public static LogsLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogsLocationJsonMarshaller();
        return instance;
    }
}
