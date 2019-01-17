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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LogGroup
 */
class LogGroupJsonMarshaller {

    public void marshall(LogGroup logGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logGroup.getLogGroupName() != null) {
            String logGroupName = logGroup.getLogGroupName();
            jsonWriter.name("logGroupName");
            jsonWriter.value(logGroupName);
        }
        if (logGroup.getCreationTime() != null) {
            Long creationTime = logGroup.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (logGroup.getRetentionInDays() != null) {
            Integer retentionInDays = logGroup.getRetentionInDays();
            jsonWriter.name("retentionInDays");
            jsonWriter.value(retentionInDays);
        }
        if (logGroup.getMetricFilterCount() != null) {
            Integer metricFilterCount = logGroup.getMetricFilterCount();
            jsonWriter.name("metricFilterCount");
            jsonWriter.value(metricFilterCount);
        }
        if (logGroup.getArn() != null) {
            String arn = logGroup.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (logGroup.getStoredBytes() != null) {
            Long storedBytes = logGroup.getStoredBytes();
            jsonWriter.name("storedBytes");
            jsonWriter.value(storedBytes);
        }
        if (logGroup.getKmsKeyId() != null) {
            String kmsKeyId = logGroup.getKmsKeyId();
            jsonWriter.name("kmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static LogGroupJsonMarshaller instance;

    public static LogGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogGroupJsonMarshaller();
        return instance;
    }
}
