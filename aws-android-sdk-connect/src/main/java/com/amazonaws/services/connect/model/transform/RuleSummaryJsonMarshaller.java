/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RuleSummary
 */
class RuleSummaryJsonMarshaller {

    public void marshall(RuleSummary ruleSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ruleSummary.getName() != null) {
            String name = ruleSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (ruleSummary.getRuleId() != null) {
            String ruleId = ruleSummary.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (ruleSummary.getRuleArn() != null) {
            String ruleArn = ruleSummary.getRuleArn();
            jsonWriter.name("RuleArn");
            jsonWriter.value(ruleArn);
        }
        if (ruleSummary.getEventSourceName() != null) {
            String eventSourceName = ruleSummary.getEventSourceName();
            jsonWriter.name("EventSourceName");
            jsonWriter.value(eventSourceName);
        }
        if (ruleSummary.getPublishStatus() != null) {
            String publishStatus = ruleSummary.getPublishStatus();
            jsonWriter.name("PublishStatus");
            jsonWriter.value(publishStatus);
        }
        if (ruleSummary.getActionSummaries() != null) {
            java.util.List<ActionSummary> actionSummaries = ruleSummary.getActionSummaries();
            jsonWriter.name("ActionSummaries");
            jsonWriter.beginArray();
            for (ActionSummary actionSummariesItem : actionSummaries) {
                if (actionSummariesItem != null) {
                    ActionSummaryJsonMarshaller.getInstance().marshall(actionSummariesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ruleSummary.getCreatedTime() != null) {
            java.util.Date createdTime = ruleSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (ruleSummary.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = ruleSummary.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static RuleSummaryJsonMarshaller instance;

    public static RuleSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleSummaryJsonMarshaller();
        return instance;
    }
}
