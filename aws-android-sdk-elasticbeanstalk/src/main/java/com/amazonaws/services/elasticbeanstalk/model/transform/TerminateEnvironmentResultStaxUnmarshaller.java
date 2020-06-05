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
 * StAX unmarshaller for response TerminateEnvironmentResult
 */
public class TerminateEnvironmentResultStaxUnmarshaller implements
        Unmarshaller<TerminateEnvironmentResult, StaxUnmarshallerContext> {

    public TerminateEnvironmentResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        TerminateEnvironmentResult terminateEnvironmentResult = new TerminateEnvironmentResult();

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
                    terminateEnvironmentResult.setEnvironmentName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    terminateEnvironmentResult.setEnvironmentId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ApplicationName", targetDepth)) {
                    terminateEnvironmentResult.setApplicationName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VersionLabel", targetDepth)) {
                    terminateEnvironmentResult.setVersionLabel(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SolutionStackName", targetDepth)) {
                    terminateEnvironmentResult.setSolutionStackName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    terminateEnvironmentResult.setPlatformArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    terminateEnvironmentResult.setTemplateName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    terminateEnvironmentResult.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EndpointURL", targetDepth)) {
                    terminateEnvironmentResult.setEndpointURL(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CNAME", targetDepth)) {
                    terminateEnvironmentResult.setCNAME(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    terminateEnvironmentResult.setDateCreated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    terminateEnvironmentResult.setDateUpdated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    terminateEnvironmentResult.setStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AbortableOperationInProgress", targetDepth)) {
                    terminateEnvironmentResult
                            .setAbortableOperationInProgress(BooleanStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Health", targetDepth)) {
                    terminateEnvironmentResult.setHealth(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthStatus", targetDepth)) {
                    terminateEnvironmentResult.setHealthStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Resources", targetDepth)) {
                    terminateEnvironmentResult
                            .setResources(EnvironmentResourcesDescriptionStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Tier", targetDepth)) {
                    terminateEnvironmentResult.setTier(EnvironmentTierStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentLinks/member", targetDepth)) {
                    terminateEnvironmentResult.withEnvironmentLinks(EnvironmentLinkStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentArn", targetDepth)) {
                    terminateEnvironmentResult.setEnvironmentArn(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OperationsRole", targetDepth)) {
                    terminateEnvironmentResult.setOperationsRole(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return terminateEnvironmentResult;
    }

    private static TerminateEnvironmentResultStaxUnmarshaller instance;

    public static TerminateEnvironmentResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TerminateEnvironmentResultStaxUnmarshaller();
        return instance;
    }
}
