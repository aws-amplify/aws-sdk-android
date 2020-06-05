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
 * StAX unmarshaller for response UpdateEnvironmentResult
 */
public class UpdateEnvironmentResultStaxUnmarshaller implements
        Unmarshaller<UpdateEnvironmentResult, StaxUnmarshallerContext> {

    public UpdateEnvironmentResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpdateEnvironmentResult updateEnvironmentResult = new UpdateEnvironmentResult();

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
                    updateEnvironmentResult.setEnvironmentName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    updateEnvironmentResult.setEnvironmentId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ApplicationName", targetDepth)) {
                    updateEnvironmentResult.setApplicationName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VersionLabel", targetDepth)) {
                    updateEnvironmentResult.setVersionLabel(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SolutionStackName", targetDepth)) {
                    updateEnvironmentResult.setSolutionStackName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    updateEnvironmentResult.setPlatformArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    updateEnvironmentResult.setTemplateName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    updateEnvironmentResult.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EndpointURL", targetDepth)) {
                    updateEnvironmentResult.setEndpointURL(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CNAME", targetDepth)) {
                    updateEnvironmentResult.setCNAME(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    updateEnvironmentResult.setDateCreated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    updateEnvironmentResult.setDateUpdated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    updateEnvironmentResult.setStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AbortableOperationInProgress", targetDepth)) {
                    updateEnvironmentResult.setAbortableOperationInProgress(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Health", targetDepth)) {
                    updateEnvironmentResult.setHealth(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthStatus", targetDepth)) {
                    updateEnvironmentResult.setHealthStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Resources", targetDepth)) {
                    updateEnvironmentResult
                            .setResources(EnvironmentResourcesDescriptionStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Tier", targetDepth)) {
                    updateEnvironmentResult.setTier(EnvironmentTierStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentLinks/member", targetDepth)) {
                    updateEnvironmentResult.withEnvironmentLinks(EnvironmentLinkStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentArn", targetDepth)) {
                    updateEnvironmentResult.setEnvironmentArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("OperationsRole", targetDepth)) {
                    updateEnvironmentResult.setOperationsRole(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return updateEnvironmentResult;
    }

    private static UpdateEnvironmentResultStaxUnmarshaller instance;

    public static UpdateEnvironmentResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateEnvironmentResultStaxUnmarshaller();
        return instance;
    }
}
