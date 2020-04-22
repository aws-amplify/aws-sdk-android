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
 * StAX unmarshaller for model ReservedNode
 */
class ReservedNodeStaxUnmarshaller implements Unmarshaller<ReservedNode, StaxUnmarshallerContext> {

    public ReservedNode unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedNode reservedNode = new ReservedNode();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ReservedNodeId", targetDepth)) {
                    reservedNode.setReservedNodeId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ReservedNodeOfferingId", targetDepth)) {
                    reservedNode.setReservedNodeOfferingId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    reservedNode.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    reservedNode.setStartTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Duration", targetDepth)) {
                    reservedNode.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedNode.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedNode.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    reservedNode.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("NodeCount", targetDepth)) {
                    reservedNode.setNodeCount(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("State", targetDepth)) {
                    reservedNode.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedNode.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("RecurringCharges", targetDepth)) {
                    reservedNode.withRecurringCharges(RecurringChargeStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReservedNodeOfferingType", targetDepth)) {
                    reservedNode.setReservedNodeOfferingType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return reservedNode;
    }

    private static ReservedNodeStaxUnmarshaller instance;

    public static ReservedNodeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeStaxUnmarshaller();
        return instance;
    }
}
