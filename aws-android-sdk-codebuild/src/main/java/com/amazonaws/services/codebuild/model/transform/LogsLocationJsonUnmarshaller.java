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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LogsLocation
 */
class LogsLocationJsonUnmarshaller implements Unmarshaller<LogsLocation, JsonUnmarshallerContext> {

    public LogsLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LogsLocation logsLocation = new LogsLocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("groupName")) {
                logsLocation.setGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("streamName")) {
                logsLocation.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deepLink")) {
                logsLocation.setDeepLink(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3DeepLink")) {
                logsLocation.setS3DeepLink(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cloudWatchLogsArn")) {
                logsLocation.setCloudWatchLogsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3LogsArn")) {
                logsLocation.setS3LogsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cloudWatchLogs")) {
                logsLocation.setCloudWatchLogs(CloudWatchLogsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3Logs")) {
                logsLocation.setS3Logs(S3LogsConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return logsLocation;
    }

    private static LogsLocationJsonUnmarshaller instance;

    public static LogsLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogsLocationJsonUnmarshaller();
        return instance;
    }
}
