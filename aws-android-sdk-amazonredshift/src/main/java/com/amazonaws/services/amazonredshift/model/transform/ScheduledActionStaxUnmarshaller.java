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

package com.amazonaws.services.amazonredshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model ScheduledAction
 */
class ScheduledActionStaxUnmarshaller implements
        Unmarshaller<ScheduledAction, StaxUnmarshallerContext> {

    public ScheduledAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledAction scheduledAction = new ScheduledAction();

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
                    scheduledAction.setScheduledActionName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetAction", targetDepth)) {
                    scheduledAction.setTargetAction(ScheduledActionTypeStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    scheduledAction.setSchedule(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    scheduledAction.setIamRole(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ScheduledActionDescription", targetDepth)) {
                    scheduledAction.setScheduledActionDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("State", targetDepth)) {
                    scheduledAction.setState(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("NextInvocations", targetDepth)) {
                    scheduledAction.withNextInvocations(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    scheduledAction.setStartTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    scheduledAction.setEndTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return scheduledAction;
    }

    private static ScheduledActionStaxUnmarshaller instance;

    public static ScheduledActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledActionStaxUnmarshaller();
        return instance;
    }
}
