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
 * JSON marshaller for POJO Crawl
 */
class CrawlJsonMarshaller {

    public void marshall(Crawl crawl, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (crawl.getState() != null) {
            String state = crawl.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (crawl.getStartedOn() != null) {
            java.util.Date startedOn = crawl.getStartedOn();
            jsonWriter.name("StartedOn");
            jsonWriter.value(startedOn);
        }
        if (crawl.getCompletedOn() != null) {
            java.util.Date completedOn = crawl.getCompletedOn();
            jsonWriter.name("CompletedOn");
            jsonWriter.value(completedOn);
        }
        if (crawl.getErrorMessage() != null) {
            String errorMessage = crawl.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        if (crawl.getLogGroup() != null) {
            String logGroup = crawl.getLogGroup();
            jsonWriter.name("LogGroup");
            jsonWriter.value(logGroup);
        }
        if (crawl.getLogStream() != null) {
            String logStream = crawl.getLogStream();
            jsonWriter.name("LogStream");
            jsonWriter.value(logStream);
        }
        jsonWriter.endObject();
    }

    private static CrawlJsonMarshaller instance;

    public static CrawlJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrawlJsonMarshaller();
        return instance;
    }
}
