/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Scheduled Instance StAX Unmarshaller
 */
public class ScheduledInstanceStaxUnmarshaller implements Unmarshaller<ScheduledInstance, StaxUnmarshallerContext> {

    public ScheduledInstance unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledInstance scheduledInstance = new ScheduledInstance();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return scheduledInstance;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("scheduledInstanceId", targetDepth)) {
                    scheduledInstance.setScheduledInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    scheduledInstance.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("platform", targetDepth)) {
                    scheduledInstance.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("networkPlatform", targetDepth)) {
                    scheduledInstance.setNetworkPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    scheduledInstance.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("slotDurationInHours", targetDepth)) {
                    scheduledInstance.setSlotDurationInHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("recurrence", targetDepth)) {
                    scheduledInstance.setRecurrence(ScheduledInstanceRecurrenceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("previousSlotEndTime", targetDepth)) {
                    scheduledInstance.setPreviousSlotEndTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("nextSlotStartTime", targetDepth)) {
                    scheduledInstance.setNextSlotStartTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("hourlyPrice", targetDepth)) {
                    scheduledInstance.setHourlyPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("totalScheduledInstanceHours", targetDepth)) {
                    scheduledInstance.setTotalScheduledInstanceHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceCount", targetDepth)) {
                    scheduledInstance.setInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("termStartDate", targetDepth)) {
                    scheduledInstance.setTermStartDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("termEndDate", targetDepth)) {
                    scheduledInstance.setTermEndDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("createDate", targetDepth)) {
                    scheduledInstance.setCreateDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledInstance;
                }
            }
        }
    }

    private static ScheduledInstanceStaxUnmarshaller instance;
    public static ScheduledInstanceStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ScheduledInstanceStaxUnmarshaller();
        return instance;
    }
}
    