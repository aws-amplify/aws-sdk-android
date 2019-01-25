/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model LifecycleHookSpecification
 */
class LifecycleHookSpecificationStaxUnmarshaller implements
        Unmarshaller<LifecycleHookSpecification, StaxUnmarshallerContext> {

    public LifecycleHookSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LifecycleHookSpecification lifecycleHookSpecification = new LifecycleHookSpecification();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("LifecycleHookName", targetDepth)) {
                    lifecycleHookSpecification.setLifecycleHookName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LifecycleTransition", targetDepth)) {
                    lifecycleHookSpecification.setLifecycleTransition(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NotificationMetadata", targetDepth)) {
                    lifecycleHookSpecification.setNotificationMetadata(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HeartbeatTimeout", targetDepth)) {
                    lifecycleHookSpecification.setHeartbeatTimeout(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultResult", targetDepth)) {
                    lifecycleHookSpecification.setDefaultResult(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NotificationTargetARN", targetDepth)) {
                    lifecycleHookSpecification.setNotificationTargetARN(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    lifecycleHookSpecification.setRoleARN(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return lifecycleHookSpecification;
    }

    private static LifecycleHookSpecificationStaxUnmarshaller instance;

    public static LifecycleHookSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleHookSpecificationStaxUnmarshaller();
        return instance;
    }
}
