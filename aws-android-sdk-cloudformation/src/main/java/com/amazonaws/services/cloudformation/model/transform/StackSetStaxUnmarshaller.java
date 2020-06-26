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
 * StAX unmarshaller for model StackSet
 */
class StackSetStaxUnmarshaller implements Unmarshaller<StackSet, StaxUnmarshallerContext> {

    public StackSet unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackSet stackSet = new StackSet();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("StackSetName", targetDepth)) {
                    stackSet.setStackSetName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("StackSetId", targetDepth)) {
                    stackSet.setStackSetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    stackSet.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    stackSet.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateBody", targetDepth)) {
                    stackSet.setTemplateBody(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Parameters/member", targetDepth)) {
                    stackSet.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Capabilities/member", targetDepth)) {
                    stackSet.withCapabilities(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Tags/member", targetDepth)) {
                    stackSet.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackSetARN", targetDepth)) {
                    stackSet.setStackSetARN(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AdministrationRoleARN", targetDepth)) {
                    stackSet.setAdministrationRoleARN(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExecutionRoleName", targetDepth)) {
                    stackSet.setExecutionRoleName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("StackSetDriftDetectionDetails", targetDepth)) {
                    stackSet.setStackSetDriftDetectionDetails(StackSetDriftDetectionDetailsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AutoDeployment", targetDepth)) {
                    stackSet.setAutoDeployment(AutoDeploymentStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PermissionModel", targetDepth)) {
                    stackSet.setPermissionModel(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("OrganizationalUnitIds/member", targetDepth)) {
                    stackSet.withOrganizationalUnitIds(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return stackSet;
    }

    private static StackSetStaxUnmarshaller instance;

    public static StackSetStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackSetStaxUnmarshaller();
        return instance;
    }
}
