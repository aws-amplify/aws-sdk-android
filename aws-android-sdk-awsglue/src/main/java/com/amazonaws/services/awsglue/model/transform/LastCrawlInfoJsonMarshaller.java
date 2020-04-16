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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LastCrawlInfo
 */
class LastCrawlInfoJsonMarshaller {

    public void marshall(LastCrawlInfo lastCrawlInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lastCrawlInfo.getStatus() != null) {
            String status = lastCrawlInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (lastCrawlInfo.getErrorMessage() != null) {
            String errorMessage = lastCrawlInfo.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (lastCrawlInfo.getLogGroup() != null) {
            String logGroup = lastCrawlInfo.getLogGroup();
            jsonWriter.name("LogGroup");
            jsonWriter.value(logGroup);
        }
        if (lastCrawlInfo.getLogStream() != null) {
            String logStream = lastCrawlInfo.getLogStream();
            jsonWriter.name("LogStream");
            jsonWriter.value(logStream);
        }
        if (lastCrawlInfo.getMessagePrefix() != null) {
            String messagePrefix = lastCrawlInfo.getMessagePrefix();
            jsonWriter.name("MessagePrefix");
            jsonWriter.value(messagePrefix);
        }
        if (lastCrawlInfo.getStartTime() != null) {
            java.util.Date startTime = lastCrawlInfo.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static LastCrawlInfoJsonMarshaller instance;

    public static LastCrawlInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LastCrawlInfoJsonMarshaller();
        return instance;
    }
}
