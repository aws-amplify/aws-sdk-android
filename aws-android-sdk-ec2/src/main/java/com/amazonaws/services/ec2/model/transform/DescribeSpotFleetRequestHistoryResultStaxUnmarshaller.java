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
 * Describe Spot Fleet Request History Result StAX Unmarshaller
 */
public class DescribeSpotFleetRequestHistoryResultStaxUnmarshaller implements Unmarshaller<DescribeSpotFleetRequestHistoryResult, StaxUnmarshallerContext> {

    public DescribeSpotFleetRequestHistoryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistoryResult = new DescribeSpotFleetRequestHistoryResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return describeSpotFleetRequestHistoryResult;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("spotFleetRequestId", targetDepth)) {
                    describeSpotFleetRequestHistoryResult.setSpotFleetRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("startTime", targetDepth)) {
                    describeSpotFleetRequestHistoryResult.setStartTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("lastEvaluatedTime", targetDepth)) {
                    describeSpotFleetRequestHistoryResult.setLastEvaluatedTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("historyRecordSet/item", targetDepth)) {
                    describeSpotFleetRequestHistoryResult.getHistoryRecords().add(HistoryRecordStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    describeSpotFleetRequestHistoryResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeSpotFleetRequestHistoryResult;
                }
            }
        }
    }

    private static DescribeSpotFleetRequestHistoryResultStaxUnmarshaller instance;
    public static DescribeSpotFleetRequestHistoryResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeSpotFleetRequestHistoryResultStaxUnmarshaller();
        return instance;
    }
}
    