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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Condition
 */
class ConditionJsonMarshaller {

    public void marshall(Condition condition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (condition.getLogicalOperator() != null) {
            String logicalOperator = condition.getLogicalOperator();
            jsonWriter.name("LogicalOperator");
            jsonWriter.value(logicalOperator);
        }
        if (condition.getJobName() != null) {
            String jobName = condition.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (condition.getState() != null) {
            String state = condition.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (condition.getCrawlerName() != null) {
            String crawlerName = condition.getCrawlerName();
            jsonWriter.name("CrawlerName");
            jsonWriter.value(crawlerName);
        }
        if (condition.getCrawlState() != null) {
            String crawlState = condition.getCrawlState();
            jsonWriter.name("CrawlState");
            jsonWriter.value(crawlState);
        }
        jsonWriter.endObject();
    }

    private static ConditionJsonMarshaller instance;

    public static ConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionJsonMarshaller();
        return instance;
    }
}
