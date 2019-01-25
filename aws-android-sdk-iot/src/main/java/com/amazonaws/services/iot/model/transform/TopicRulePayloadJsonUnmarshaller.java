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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TopicRulePayload
 */
class TopicRulePayloadJsonUnmarshaller implements
        Unmarshaller<TopicRulePayload, JsonUnmarshallerContext> {

    public TopicRulePayload unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicRulePayload topicRulePayload = new TopicRulePayload();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("sql")) {
                topicRulePayload.setSql(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                topicRulePayload.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("actions")) {
                topicRulePayload.setActions(new ListUnmarshaller<Action>(ActionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ruleDisabled")) {
                topicRulePayload.setRuleDisabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsIotSqlVersion")) {
                topicRulePayload.setAwsIotSqlVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorAction")) {
                topicRulePayload.setErrorAction(ActionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicRulePayload;
    }

    private static TopicRulePayloadJsonUnmarshaller instance;

    public static TopicRulePayloadJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicRulePayloadJsonUnmarshaller();
        return instance;
    }
}
