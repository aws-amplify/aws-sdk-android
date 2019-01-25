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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TopicRule
 */
class TopicRuleJsonMarshaller {

    public void marshall(TopicRule topicRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (topicRule.getRuleName() != null) {
            String ruleName = topicRule.getRuleName();
            jsonWriter.name("ruleName");
            jsonWriter.value(ruleName);
        }
        if (topicRule.getSql() != null) {
            String sql = topicRule.getSql();
            jsonWriter.name("sql");
            jsonWriter.value(sql);
        }
        if (topicRule.getDescription() != null) {
            String description = topicRule.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (topicRule.getCreatedAt() != null) {
            java.util.Date createdAt = topicRule.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (topicRule.getActions() != null) {
            java.util.List<Action> actions = topicRule.getActions();
            jsonWriter.name("actions");
            jsonWriter.beginArray();
            for (Action actionsItem : actions) {
                if (actionsItem != null) {
                    ActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (topicRule.getRuleDisabled() != null) {
            Boolean ruleDisabled = topicRule.getRuleDisabled();
            jsonWriter.name("ruleDisabled");
            jsonWriter.value(ruleDisabled);
        }
        if (topicRule.getAwsIotSqlVersion() != null) {
            String awsIotSqlVersion = topicRule.getAwsIotSqlVersion();
            jsonWriter.name("awsIotSqlVersion");
            jsonWriter.value(awsIotSqlVersion);
        }
        if (topicRule.getErrorAction() != null) {
            Action errorAction = topicRule.getErrorAction();
            jsonWriter.name("errorAction");
            ActionJsonMarshaller.getInstance().marshall(errorAction, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TopicRuleJsonMarshaller instance;

    public static TopicRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleJsonMarshaller();
        return instance;
    }
}
