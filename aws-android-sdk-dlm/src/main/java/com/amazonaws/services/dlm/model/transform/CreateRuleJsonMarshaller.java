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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateRule
 */
class CreateRuleJsonMarshaller {

    public void marshall(CreateRule createRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createRule.getInterval() != null) {
            Integer interval = createRule.getInterval();
            jsonWriter.name("Interval");
            jsonWriter.value(interval);
        }
        if (createRule.getIntervalUnit() != null) {
            String intervalUnit = createRule.getIntervalUnit();
            jsonWriter.name("IntervalUnit");
            jsonWriter.value(intervalUnit);
        }
        if (createRule.getTimes() != null) {
            java.util.List<String> times = createRule.getTimes();
            jsonWriter.name("Times");
            jsonWriter.beginArray();
            for (String timesItem : times) {
                if (timesItem != null) {
                    jsonWriter.value(timesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (createRule.getCronExpression() != null) {
            String cronExpression = createRule.getCronExpression();
            jsonWriter.name("CronExpression");
            jsonWriter.value(cronExpression);
        }
        jsonWriter.endObject();
    }

    private static CreateRuleJsonMarshaller instance;

    public static CreateRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateRuleJsonMarshaller();
        return instance;
    }
}
