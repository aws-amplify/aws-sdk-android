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
 * JSON marshaller for POJO TopicRulePayload
 */
class TopicRulePayloadJsonMarshaller {

    public void marshall(TopicRulePayload topicRulePayload, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (topicRulePayload.getSql() != null) {
            String sql = topicRulePayload.getSql();
            jsonWriter.name("sql");
            jsonWriter.value(sql);
        }
        if (topicRulePayload.getDescription() != null) {
            String description = topicRulePayload.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (topicRulePayload.getActions() != null) {
            java.util.List<Action> actions = topicRulePayload.getActions();
            jsonWriter.name("actions");
            jsonWriter.beginArray();
            for (Action actionsItem : actions) {
                if (actionsItem != null) {
                    ActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (topicRulePayload.getRuleDisabled() != null) {
            Boolean ruleDisabled = topicRulePayload.getRuleDisabled();
            jsonWriter.name("ruleDisabled");
            jsonWriter.value(ruleDisabled);
        }
        if (topicRulePayload.getAwsIotSqlVersion() != null) {
            String awsIotSqlVersion = topicRulePayload.getAwsIotSqlVersion();
            jsonWriter.name("awsIotSqlVersion");
            jsonWriter.value(awsIotSqlVersion);
        }
        if (topicRulePayload.getErrorAction() != null) {
            Action errorAction = topicRulePayload.getErrorAction();
            jsonWriter.name("errorAction");
            ActionJsonMarshaller.getInstance().marshall(errorAction, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TopicRulePayloadJsonMarshaller instance;

    public static TopicRulePayloadJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRulePayloadJsonMarshaller();
        return instance;
    }
}
