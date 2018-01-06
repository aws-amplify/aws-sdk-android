/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Bundle Task StAX Unmarshaller
 */
public class BundleTaskStaxUnmarshaller implements Unmarshaller<BundleTask, StaxUnmarshallerContext> {

    public BundleTask unmarshall(StaxUnmarshallerContext context) throws Exception {
        BundleTask bundleTask = new BundleTask();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return bundleTask;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("instanceId", targetDepth)) {
                    bundleTask.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("bundleId", targetDepth)) {
                    bundleTask.setBundleId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("state", targetDepth)) {
                    bundleTask.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("startTime", targetDepth)) {
                    bundleTask.setStartTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    bundleTask.setUpdateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("storage", targetDepth)) {
                    bundleTask.setStorage(StorageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("progress", targetDepth)) {
                    bundleTask.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("error", targetDepth)) {
                    bundleTask.setBundleTaskError(BundleTaskErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return bundleTask;
                }
            }
        }
    }

    private static BundleTaskStaxUnmarshaller instance;
    public static BundleTaskStaxUnmarshaller getInstance() {
        if (instance == null) instance = new BundleTaskStaxUnmarshaller();
        return instance;
    }
}
    