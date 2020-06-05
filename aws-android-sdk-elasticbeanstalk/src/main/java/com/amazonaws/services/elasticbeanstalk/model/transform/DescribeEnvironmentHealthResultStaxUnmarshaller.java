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
 * StAX unmarshaller for response DescribeEnvironmentHealthResult
 */
public class DescribeEnvironmentHealthResultStaxUnmarshaller implements
        Unmarshaller<DescribeEnvironmentHealthResult, StaxUnmarshallerContext> {

    public DescribeEnvironmentHealthResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        DescribeEnvironmentHealthResult describeEnvironmentHealthResult = new DescribeEnvironmentHealthResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("EnvironmentName", targetDepth)) {
                    describeEnvironmentHealthResult.setEnvironmentName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthStatus", targetDepth)) {
                    describeEnvironmentHealthResult.setHealthStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    describeEnvironmentHealthResult.setStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Color", targetDepth)) {
                    describeEnvironmentHealthResult.setColor(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Causes/member", targetDepth)) {
                    describeEnvironmentHealthResult.withCauses(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ApplicationMetrics", targetDepth)) {
                    describeEnvironmentHealthResult
                            .setApplicationMetrics(ApplicationMetricsStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstancesHealth", targetDepth)) {
                    describeEnvironmentHealthResult
                            .setInstancesHealth(InstanceHealthSummaryStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("RefreshedAt", targetDepth)) {
                    describeEnvironmentHealthResult.setRefreshedAt(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return describeEnvironmentHealthResult;
    }

    private static DescribeEnvironmentHealthResultStaxUnmarshaller instance;

    public static DescribeEnvironmentHealthResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEnvironmentHealthResultStaxUnmarshaller();
        return instance;
    }
}
