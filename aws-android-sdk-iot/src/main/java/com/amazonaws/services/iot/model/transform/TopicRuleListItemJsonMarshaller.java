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
 * JSON marshaller for POJO TopicRuleListItem
 */
class TopicRuleListItemJsonMarshaller {

    public void marshall(TopicRuleListItem topicRuleListItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (topicRuleListItem.getRuleArn() != null) {
            String ruleArn = topicRuleListItem.getRuleArn();
            jsonWriter.name("ruleArn");
            jsonWriter.value(ruleArn);
        }
        if (topicRuleListItem.getRuleName() != null) {
            String ruleName = topicRuleListItem.getRuleName();
            jsonWriter.name("ruleName");
            jsonWriter.value(ruleName);
        }
        if (topicRuleListItem.getTopicPattern() != null) {
            String topicPattern = topicRuleListItem.getTopicPattern();
            jsonWriter.name("topicPattern");
            jsonWriter.value(topicPattern);
        }
        if (topicRuleListItem.getCreatedAt() != null) {
            java.util.Date createdAt = topicRuleListItem.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (topicRuleListItem.getRuleDisabled() != null) {
            Boolean ruleDisabled = topicRuleListItem.getRuleDisabled();
            jsonWriter.name("ruleDisabled");
            jsonWriter.value(ruleDisabled);
        }
        jsonWriter.endObject();
    }

    private static TopicRuleListItemJsonMarshaller instance;

    public static TopicRuleListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleListItemJsonMarshaller();
        return instance;
    }
}
