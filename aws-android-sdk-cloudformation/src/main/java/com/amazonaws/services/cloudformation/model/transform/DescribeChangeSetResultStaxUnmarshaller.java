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
 * StAX unmarshaller for response DescribeChangeSetResult
 */
public class DescribeChangeSetResultStaxUnmarshaller implements
        Unmarshaller<DescribeChangeSetResult, StaxUnmarshallerContext> {

    public DescribeChangeSetResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeChangeSetResult describeChangeSetResult = new DescribeChangeSetResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ChangeSetName", targetDepth)) {
                    describeChangeSetResult.setChangeSetName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ChangeSetId", targetDepth)) {
                    describeChangeSetResult.setChangeSetId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackId", targetDepth)) {
                    describeChangeSetResult.setStackId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackName", targetDepth)) {
                    describeChangeSetResult.setStackName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    describeChangeSetResult.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Parameters/member", targetDepth)) {
                    describeChangeSetResult.withParameters(ParameterStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    describeChangeSetResult.setCreationTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExecutionStatus", targetDepth)) {
                    describeChangeSetResult.setExecutionStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    describeChangeSetResult.setStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    describeChangeSetResult.setStatusReason(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NotificationARNs/member", targetDepth)) {
                    describeChangeSetResult.withNotificationARNs(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RollbackConfiguration", targetDepth)) {
                    describeChangeSetResult
                            .setRollbackConfiguration(RollbackConfigurationStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Capabilities/member", targetDepth)) {
                    describeChangeSetResult.withCapabilities(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Tags/member", targetDepth)) {
                    describeChangeSetResult.withTags(TagStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Changes/member", targetDepth)) {
                    describeChangeSetResult.withChanges(ChangeStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeChangeSetResult.setNextToken(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return describeChangeSetResult;
    }

    private static DescribeChangeSetResultStaxUnmarshaller instance;

    public static DescribeChangeSetResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeChangeSetResultStaxUnmarshaller();
        return instance;
    }
}
