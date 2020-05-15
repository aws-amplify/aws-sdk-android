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
 * StAX unmarshaller for model StackSetOperation
 */
class StackSetOperationStaxUnmarshaller implements
        Unmarshaller<StackSetOperation, StaxUnmarshallerContext> {

    public StackSetOperation unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackSetOperation stackSetOperation = new StackSetOperation();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("OperationId", targetDepth)) {
                    stackSetOperation.setOperationId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackSetId", targetDepth)) {
                    stackSetOperation.setStackSetId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Action", targetDepth)) {
                    stackSetOperation.setAction(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    stackSetOperation.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("OperationPreferences", targetDepth)) {
                    stackSetOperation
                            .setOperationPreferences(StackSetOperationPreferencesStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RetainStacks", targetDepth)) {
                    stackSetOperation.setRetainStacks(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AdministrationRoleARN", targetDepth)) {
                    stackSetOperation.setAdministrationRoleARN(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExecutionRoleName", targetDepth)) {
                    stackSetOperation.setExecutionRoleName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    stackSetOperation.setCreationTimestamp(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EndTimestamp", targetDepth)) {
                    stackSetOperation.setEndTimestamp(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeploymentTargets", targetDepth)) {
                    stackSetOperation.setDeploymentTargets(DeploymentTargetsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackSetDriftDetectionDetails", targetDepth)) {
                    stackSetOperation
                            .setStackSetDriftDetectionDetails(StackSetDriftDetectionDetailsStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return stackSetOperation;
    }

    private static StackSetOperationStaxUnmarshaller instance;

    public static StackSetOperationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationStaxUnmarshaller();
        return instance;
    }
}
