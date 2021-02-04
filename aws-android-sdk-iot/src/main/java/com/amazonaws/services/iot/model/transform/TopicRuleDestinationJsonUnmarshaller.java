/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO TopicRuleDestination
 */
class TopicRuleDestinationJsonUnmarshaller implements
        Unmarshaller<TopicRuleDestination, JsonUnmarshallerContext> {

    public TopicRuleDestination unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicRuleDestination topicRuleDestination = new TopicRuleDestination();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                topicRuleDestination.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                topicRuleDestination.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                topicRuleDestination.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                topicRuleDestination.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusReason")) {
                topicRuleDestination.setStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpUrlProperties")) {
                topicRuleDestination
                        .setHttpUrlProperties(HttpUrlDestinationPropertiesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("vpcProperties")) {
                topicRuleDestination.setVpcProperties(VpcDestinationPropertiesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicRuleDestination;
    }

    private static TopicRuleDestinationJsonUnmarshaller instance;

    public static TopicRuleDestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleDestinationJsonUnmarshaller();
        return instance;
    }
}
