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
 * Export To S3 Task StAX Unmarshaller
 */
public class ExportToS3TaskStaxUnmarshaller implements Unmarshaller<ExportToS3Task, StaxUnmarshallerContext> {

    public ExportToS3Task unmarshall(StaxUnmarshallerContext context) throws Exception {
        ExportToS3Task exportToS3Task = new ExportToS3Task();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return exportToS3Task;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("diskImageFormat", targetDepth)) {
                    exportToS3Task.setDiskImageFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("containerFormat", targetDepth)) {
                    exportToS3Task.setContainerFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("s3Bucket", targetDepth)) {
                    exportToS3Task.setS3Bucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("s3Key", targetDepth)) {
                    exportToS3Task.setS3Key(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return exportToS3Task;
                }
            }
        }
    }

    private static ExportToS3TaskStaxUnmarshaller instance;
    public static ExportToS3TaskStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ExportToS3TaskStaxUnmarshaller();
        return instance;
    }
}
    