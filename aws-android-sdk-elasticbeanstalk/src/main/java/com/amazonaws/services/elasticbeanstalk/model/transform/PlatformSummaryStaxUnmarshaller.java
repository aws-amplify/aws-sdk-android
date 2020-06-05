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
 * StAX unmarshaller for model PlatformSummary
 */
class PlatformSummaryStaxUnmarshaller implements
        Unmarshaller<PlatformSummary, StaxUnmarshallerContext> {

    public PlatformSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        PlatformSummary platformSummary = new PlatformSummary();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("PlatformArn", targetDepth)) {
                    platformSummary.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PlatformOwner", targetDepth)) {
                    platformSummary.setPlatformOwner(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformStatus", targetDepth)) {
                    platformSummary.setPlatformStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformCategory", targetDepth)) {
                    platformSummary.setPlatformCategory(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("OperatingSystemName", targetDepth)) {
                    platformSummary.setOperatingSystemName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("OperatingSystemVersion", targetDepth)) {
                    platformSummary.setOperatingSystemVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedTierList/member", targetDepth)) {
                    platformSummary.withSupportedTierList(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedAddonList/member", targetDepth)) {
                    platformSummary.withSupportedAddonList(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformLifecycleState", targetDepth)) {
                    platformSummary.setPlatformLifecycleState(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    platformSummary.setPlatformVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformBranchName", targetDepth)) {
                    platformSummary.setPlatformBranchName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformBranchLifecycleState", targetDepth)) {
                    platformSummary.setPlatformBranchLifecycleState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return platformSummary;
    }

    private static PlatformSummaryStaxUnmarshaller instance;

    public static PlatformSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlatformSummaryStaxUnmarshaller();
        return instance;
    }
}
