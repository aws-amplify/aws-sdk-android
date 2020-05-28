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
 * JSON marshaller for POJO BrokerLogs
 */
class BrokerLogsJsonMarshaller {

    public void marshall(BrokerLogs brokerLogs, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (brokerLogs.getCloudWatchLogs() != null) {
            CloudWatchLogs cloudWatchLogs = brokerLogs.getCloudWatchLogs();
            jsonWriter.name("CloudWatchLogs");
            CloudWatchLogsJsonMarshaller.getInstance().marshall(cloudWatchLogs, jsonWriter);
        }
        if (brokerLogs.getFirehose() != null) {
            Firehose firehose = brokerLogs.getFirehose();
            jsonWriter.name("Firehose");
            FirehoseJsonMarshaller.getInstance().marshall(firehose, jsonWriter);
        }
        if (brokerLogs.getS3() != null) {
            S3 s3 = brokerLogs.getS3();
            jsonWriter.name("S3");
            S3JsonMarshaller.getInstance().marshall(s3, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BrokerLogsJsonMarshaller instance;

    public static BrokerLogsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BrokerLogsJsonMarshaller();
        return instance;
    }
}
