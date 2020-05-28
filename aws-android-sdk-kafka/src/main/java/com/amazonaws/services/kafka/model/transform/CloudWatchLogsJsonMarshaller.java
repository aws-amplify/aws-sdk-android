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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudWatchLogs
 */
class CloudWatchLogsJsonMarshaller {

    public void marshall(CloudWatchLogs cloudWatchLogs, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cloudWatchLogs.getEnabled() != null) {
            Boolean enabled = cloudWatchLogs.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (cloudWatchLogs.getLogGroup() != null) {
            String logGroup = cloudWatchLogs.getLogGroup();
            jsonWriter.name("LogGroup");
            jsonWriter.value(logGroup);
        }
        jsonWriter.endObject();
    }

    private static CloudWatchLogsJsonMarshaller instance;

    public static CloudWatchLogsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchLogsJsonMarshaller();
        return instance;
    }
}
