/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Flow Log StAX Unmarshaller
 */
public class FlowLogStaxUnmarshaller implements Unmarshaller<FlowLog, StaxUnmarshallerContext> {

    public FlowLog unmarshall(StaxUnmarshallerContext context) throws Exception {
        FlowLog flowLog = new FlowLog();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return flowLog;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("creationTime", targetDepth)) {
                    flowLog.setCreationTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("flowLogId", targetDepth)) {
                    flowLog.setFlowLogId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("flowLogStatus", targetDepth)) {
                    flowLog.setFlowLogStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    flowLog.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("trafficType", targetDepth)) {
                    flowLog.setTrafficType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("logGroupName", targetDepth)) {
                    flowLog.setLogGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("deliverLogsStatus", targetDepth)) {
                    flowLog.setDeliverLogsStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("deliverLogsErrorMessage", targetDepth)) {
                    flowLog.setDeliverLogsErrorMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("deliverLogsPermissionArn", targetDepth)) {
                    flowLog.setDeliverLogsPermissionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return flowLog;
                }
            }
        }
    }

    private static FlowLogStaxUnmarshaller instance;
    public static FlowLogStaxUnmarshaller getInstance() {
        if (instance == null) instance = new FlowLogStaxUnmarshaller();
        return instance;
    }
}
    