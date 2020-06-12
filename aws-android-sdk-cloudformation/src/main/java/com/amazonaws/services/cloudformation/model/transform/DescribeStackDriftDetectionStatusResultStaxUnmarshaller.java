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

package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response DescribeStackDriftDetectionStatusResult
 */
public class DescribeStackDriftDetectionStatusResultStaxUnmarshaller implements
        Unmarshaller<DescribeStackDriftDetectionStatusResult, StaxUnmarshallerContext> {

    public DescribeStackDriftDetectionStatusResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatusResult = new DescribeStackDriftDetectionStatusResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("StackId", targetDepth)) {
                    describeStackDriftDetectionStatusResult.setStackId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackDriftDetectionId", targetDepth)) {
                    describeStackDriftDetectionStatusResult
                            .setStackDriftDetectionId(StringStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackDriftStatus", targetDepth)) {
                    describeStackDriftDetectionStatusResult
                            .setStackDriftStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                                    context));
                    continue;
                }
                if (context.testExpression("DetectionStatus", targetDepth)) {
                    describeStackDriftDetectionStatusResult
                            .setDetectionStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                                    context));
                    continue;
                }
                if (context.testExpression("DetectionStatusReason", targetDepth)) {
                    describeStackDriftDetectionStatusResult
                            .setDetectionStatusReason(StringStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DriftedStackResourceCount", targetDepth)) {
                    describeStackDriftDetectionStatusResult
                            .setDriftedStackResourceCount(IntegerStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    describeStackDriftDetectionStatusResult.setTimestamp(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return describeStackDriftDetectionStatusResult;
    }

    private static DescribeStackDriftDetectionStatusResultStaxUnmarshaller instance;

    public static DescribeStackDriftDetectionStatusResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStackDriftDetectionStatusResultStaxUnmarshaller();
        return instance;
    }
}
