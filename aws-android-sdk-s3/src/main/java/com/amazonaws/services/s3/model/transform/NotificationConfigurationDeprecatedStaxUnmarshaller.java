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

package com.amazonaws.services.s3.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model NotificationConfigurationDeprecated
 */
class NotificationConfigurationDeprecatedStaxUnmarshaller implements
        Unmarshaller<NotificationConfigurationDeprecated, StaxUnmarshallerContext> {

    public NotificationConfigurationDeprecated unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        NotificationConfigurationDeprecated notificationConfigurationDeprecated = new NotificationConfigurationDeprecated();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("TopicConfiguration", targetDepth)) {
                    notificationConfigurationDeprecated
                            .setTopicConfiguration(TopicConfigurationDeprecatedStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("QueueConfiguration", targetDepth)) {
                    notificationConfigurationDeprecated
                            .setQueueConfiguration(QueueConfigurationDeprecatedStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CloudFunctionConfiguration", targetDepth)) {
                    notificationConfigurationDeprecated
                            .setCloudFunctionConfiguration(CloudFunctionConfigurationStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return notificationConfigurationDeprecated;
    }

    private static NotificationConfigurationDeprecatedStaxUnmarshaller instance;

    public static NotificationConfigurationDeprecatedStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigurationDeprecatedStaxUnmarshaller();
        return instance;
    }
}
