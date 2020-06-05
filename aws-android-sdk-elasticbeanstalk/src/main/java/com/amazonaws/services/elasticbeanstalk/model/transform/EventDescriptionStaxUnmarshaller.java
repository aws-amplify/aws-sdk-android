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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model EventDescription
 */
class EventDescriptionStaxUnmarshaller implements
        Unmarshaller<EventDescription, StaxUnmarshallerContext> {

    public EventDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        EventDescription eventDescription = new EventDescription();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("EventDate", targetDepth)) {
                    eventDescription.setEventDate(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Message", targetDepth)) {
                    eventDescription.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ApplicationName", targetDepth)) {
                    eventDescription.setApplicationName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VersionLabel", targetDepth)) {
                    eventDescription.setVersionLabel(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    eventDescription.setTemplateName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentName", targetDepth)) {
                    eventDescription.setEnvironmentName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    eventDescription.setPlatformArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    eventDescription.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Severity", targetDepth)) {
                    eventDescription.setSeverity(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return eventDescription;
    }

    private static EventDescriptionStaxUnmarshaller instance;

    public static EventDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventDescriptionStaxUnmarshaller();
        return instance;
    }
}
