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

package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model EventDestination
 */
class EventDestinationStaxUnmarshaller implements
        Unmarshaller<EventDestination, StaxUnmarshallerContext> {

    public EventDestination unmarshall(StaxUnmarshallerContext context) throws Exception {
        EventDestination eventDestination = new EventDestination();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Name", targetDepth)) {
                    eventDestination.setName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    eventDestination.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("MatchingEventTypes/member", targetDepth)) {
                    eventDestination.withMatchingEventTypes(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("KinesisFirehoseDestination", targetDepth)) {
                    eventDestination
                            .setKinesisFirehoseDestination(KinesisFirehoseDestinationStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CloudWatchDestination", targetDepth)) {
                    eventDestination.setCloudWatchDestination(CloudWatchDestinationStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SNSDestination", targetDepth)) {
                    eventDestination.setSNSDestination(SNSDestinationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return eventDestination;
    }

    private static EventDestinationStaxUnmarshaller instance;

    public static EventDestinationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventDestinationStaxUnmarshaller();
        return instance;
    }
}
