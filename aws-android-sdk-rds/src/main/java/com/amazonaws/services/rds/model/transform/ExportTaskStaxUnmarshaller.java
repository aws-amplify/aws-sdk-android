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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model ExportTask
 */
class ExportTaskStaxUnmarshaller implements Unmarshaller<ExportTask, StaxUnmarshallerContext> {

    public ExportTask unmarshall(StaxUnmarshallerContext context) throws Exception {
        ExportTask exportTask = new ExportTask();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ExportTaskIdentifier", targetDepth)) {
                    exportTask.setExportTaskIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceArn", targetDepth)) {
                    exportTask.setSourceArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExportOnly/member", targetDepth)) {
                    exportTask.withExportOnly(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SnapshotTime", targetDepth)) {
                    exportTask.setSnapshotTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TaskStartTime", targetDepth)) {
                    exportTask.setTaskStartTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TaskEndTime", targetDepth)) {
                    exportTask.setTaskEndTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3Bucket", targetDepth)) {
                    exportTask
                            .setS3Bucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3Prefix", targetDepth)) {
                    exportTask
                            .setS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    exportTask.setIamRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    exportTask
                            .setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    exportTask.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    exportTask.setPercentProgress(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TotalExtractedDataInGB", targetDepth)) {
                    exportTask.setTotalExtractedDataInGB(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("FailureCause", targetDepth)) {
                    exportTask.setFailureCause(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("WarningMessage", targetDepth)) {
                    exportTask.setWarningMessage(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return exportTask;
    }

    private static ExportTaskStaxUnmarshaller instance;

    public static ExportTaskStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskStaxUnmarshaller();
        return instance;
    }
}
