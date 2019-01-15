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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model ScheduledUpdateGroupActionRequest
 */
class ScheduledUpdateGroupActionRequestStaxUnmarshaller implements
        Unmarshaller<ScheduledUpdateGroupActionRequest, StaxUnmarshallerContext> {

    public ScheduledUpdateGroupActionRequest unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        ScheduledUpdateGroupActionRequest scheduledUpdateGroupActionRequest = new ScheduledUpdateGroupActionRequest();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ScheduledActionName", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setScheduledActionName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setStartTime(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setEndTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Recurrence", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setRecurrence(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinSize", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setMinSize(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxSize", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setMaxSize(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DesiredCapacity", targetDepth)) {
                    scheduledUpdateGroupActionRequest.setDesiredCapacity(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return scheduledUpdateGroupActionRequest;
    }

    private static ScheduledUpdateGroupActionRequestStaxUnmarshaller instance;

    public static ScheduledUpdateGroupActionRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledUpdateGroupActionRequestStaxUnmarshaller();
        return instance;
    }
}
