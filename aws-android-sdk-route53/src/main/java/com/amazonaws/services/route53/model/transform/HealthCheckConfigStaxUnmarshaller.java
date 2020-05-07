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

package com.amazonaws.services.route53.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model HealthCheckConfig
 */
class HealthCheckConfigStaxUnmarshaller implements
        Unmarshaller<HealthCheckConfig, StaxUnmarshallerContext> {

    public HealthCheckConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        HealthCheckConfig healthCheckConfig = new HealthCheckConfig();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("IPAddress", targetDepth)) {
                    healthCheckConfig.setIPAddress(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    healthCheckConfig.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Type", targetDepth)) {
                    healthCheckConfig.setType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ResourcePath", targetDepth)) {
                    healthCheckConfig.setResourcePath(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("FullyQualifiedDomainName", targetDepth)) {
                    healthCheckConfig.setFullyQualifiedDomainName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SearchString", targetDepth)) {
                    healthCheckConfig.setSearchString(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequestInterval", targetDepth)) {
                    healthCheckConfig.setRequestInterval(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("FailureThreshold", targetDepth)) {
                    healthCheckConfig.setFailureThreshold(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MeasureLatency", targetDepth)) {
                    healthCheckConfig.setMeasureLatency(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Inverted", targetDepth)) {
                    healthCheckConfig.setInverted(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Disabled", targetDepth)) {
                    healthCheckConfig.setDisabled(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("HealthThreshold", targetDepth)) {
                    healthCheckConfig.setHealthThreshold(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ChildHealthChecks", targetDepth)) {
                    healthCheckConfig.withChildHealthChecks(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnableSNI", targetDepth)) {
                    healthCheckConfig.setEnableSNI(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Regions", targetDepth)) {
                    healthCheckConfig.withRegions(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AlarmIdentifier", targetDepth)) {
                    healthCheckConfig.setAlarmIdentifier(AlarmIdentifierStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InsufficientDataHealthStatus", targetDepth)) {
                    healthCheckConfig.setInsufficientDataHealthStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return healthCheckConfig;
    }

    private static HealthCheckConfigStaxUnmarshaller instance;

    public static HealthCheckConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckConfigStaxUnmarshaller();
        return instance;
    }
}
