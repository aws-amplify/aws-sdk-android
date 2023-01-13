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
 * JSON marshaller for POJO Rule
 */
class RuleJsonMarshaller {

    public void marshall(Rule rule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rule.getName() != null) {
            String name = rule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (rule.getRuleId() != null) {
            String ruleId = rule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (rule.getRuleArn() != null) {
            String ruleArn = rule.getRuleArn();
            jsonWriter.name("RuleArn");
            jsonWriter.value(ruleArn);
        }
        if (rule.getTriggerEventSource() != null) {
            RuleTriggerEventSource triggerEventSource = rule.getTriggerEventSource();
            jsonWriter.name("TriggerEventSource");
            RuleTriggerEventSourceJsonMarshaller.getInstance().marshall(triggerEventSource,
                    jsonWriter);
        }
        if (rule.getFunction() != null) {
            String function = rule.getFunction();
            jsonWriter.name("Function");
            jsonWriter.value(function);
        }
        if (rule.getActions() != null) {
            java.util.List<RuleAction> actions = rule.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (RuleAction actionsItem : actions) {
                if (actionsItem != null) {
                    RuleActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (rule.getPublishStatus() != null) {
            String publishStatus = rule.getPublishStatus();
            jsonWriter.name("PublishStatus");
            jsonWriter.value(publishStatus);
        }
        if (rule.getCreatedTime() != null) {
            java.util.Date createdTime = rule.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (rule.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = rule.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (rule.getLastUpdatedBy() != null) {
            String lastUpdatedBy = rule.getLastUpdatedBy();
            jsonWriter.name("LastUpdatedBy");
            jsonWriter.value(lastUpdatedBy);
        }
        if (rule.getTags() != null) {
            java.util.Map<String, String> tags = rule.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }
}
